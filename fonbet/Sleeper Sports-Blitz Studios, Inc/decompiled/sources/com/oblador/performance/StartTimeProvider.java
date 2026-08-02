package com.oblador.performance;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;

/* loaded from: classes8.dex */
public class StartTimeProvider extends ContentProvider {
    private static long endTime;
    private static long startTime;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public static long getStartTime() {
        return startTime;
    }

    public static long getEndTime() {
        return endTime;
    }

    private static void setStartTime() {
        if (startTime == 0) {
            startTime = endTime - Process.getElapsedCpuTime();
        }
    }

    private static void setEndTime() {
        if (endTime == 0) {
            endTime = SystemClock.uptimeMillis();
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        setEndTime();
        setStartTime();
        return false;
    }
}
