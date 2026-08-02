package com.sleeperbot.modules;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

/* loaded from: classes8.dex */
public class SharedLoginProvider extends ContentProvider {
    public static final String AUTHORITY = "com.sleeperbot.sharedloginprovider";
    public static final Uri CONTENT_URI = Uri.parse("content://com.sleeperbot.sharedloginprovider/login");
    private static final String KEY_LOGIN_DATA = "login_data";
    private static final String PREFS_NAME = "login_data_prefs";

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{KEY_LOGIN_DATA});
        String string = getContext().getSharedPreferences(PREFS_NAME, 0).getString(KEY_LOGIN_DATA, null);
        if (string != null) {
            matrixCursor.addRow(new Object[]{string});
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        getContext().getSharedPreferences(PREFS_NAME, 0).edit().putString(KEY_LOGIN_DATA, contentValues.getAsString(KEY_LOGIN_DATA)).apply();
        return CONTENT_URI;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        getContext().getSharedPreferences(PREFS_NAME, 0).edit().putString(KEY_LOGIN_DATA, contentValues.getAsString(KEY_LOGIN_DATA)).apply();
        return 1;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        getContext().getSharedPreferences(PREFS_NAME, 0).edit().remove(KEY_LOGIN_DATA).apply();
        return 1;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd.com.sleeperbot.sharedloginprovider.login";
    }
}
