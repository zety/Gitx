package com.example.user.lab1inputoutput;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by USER on 10/26/2017.
 */

public class DataHelper extends SQLiteOpenHelper {

    //database name
    private static final String DATABASE_NAME = "personalbiodata.db";

    //database version
    private static final int DATABASE_VERSION = 1;

    //create constructor for data helper

    public DataHelper(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);


    }

    //create table
    public void onCreate(SQLiteDatabase db){
        String sql = "create table biodata(no integer primary key, name text null, dob text null, gender text null, address text null);";
        Log.d("Data","onCreate: "+sql);
        db.execSQL(sql);
    }

    //create method to upgrade database version if database exist
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}
