package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.internal.measurement.zzcd;
import defpackage.a70;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzax {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:28:0x00bc->B:34:0x00ce, LOOP_START, PHI: r1
      0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:27:0x00ba, B:34:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:14:0x0044, B:17:0x0074, B:19:0x0082, B:21:0x008a, B:23:0x008d, B:24:0x00b6, B:28:0x00bc, B:30:0x00bf, B:32:0x00c7, B:34:0x00ce, B:37:0x00d1, B:39:0x00d7, B:44:0x00e6, B:45:0x00ea, B:16:0x006d), top: B:13:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(zzgu zzguVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursor;
        HashSet hashSet;
        Cursor rawQuery;
        if (zzguVar == null) {
            a70.p("Monitor must not be null");
            return;
        }
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                }
            }
        } catch (SQLiteException e) {
            e = e;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            cursor = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                } catch (SQLiteException e2) {
                    e = e2;
                    zzguVar.j.c(str, e, "Error querying for table");
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase2.execSQL(str2);
                    try {
                        hashSet = new HashSet();
                        StringBuilder sb = new StringBuilder(str.length() + 22);
                        sb.append("SELECT * FROM ");
                        sb.append(str);
                        sb.append(" LIMIT 0");
                        rawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
                        try {
                            Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            for (String str4 : str3.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) {
                                if (!hashSet.remove(str4)) {
                                    StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                    sb2.append("Table ");
                                    sb2.append(str);
                                    sb2.append(" is missing required column: ");
                                    sb2.append(str4);
                                    throw new SQLiteException(sb2.toString());
                                }
                            }
                            if (strArr != null) {
                                for (int i = 0; i < strArr.length; i += 2) {
                                    if (!hashSet.remove(strArr[i])) {
                                        sQLiteDatabase2.execSQL(strArr[i + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                zzguVar.j.c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                            }
                        } catch (Throwable th3) {
                            rawQuery.close();
                            throw th3;
                        }
                    } catch (SQLiteException e3) {
                        zzguVar.g.b(str, "Failed to verify columns on table that was just created");
                        throw e3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
            zzguVar.j.c(str, e, "Error querying for table");
            if (cursor != null) {
            }
            sQLiteDatabase2.execSQL(str2);
            hashSet = new HashSet();
            StringBuilder sb3 = new StringBuilder(str.length() + 22);
            sb3.append("SELECT * FROM ");
            sb3.append(str);
            sb3.append(" LIMIT 0");
            rawQuery = sQLiteDatabase2.rawQuery(sb3.toString(), null);
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            rawQuery.close();
            while (r3 < r0) {
            }
            if (strArr != null) {
            }
            if (hashSet.isEmpty()) {
            }
        }
    }

    public static void b(zzgu zzguVar, SQLiteDatabase sQLiteDatabase) {
        if (zzguVar == null) {
            a70.p("Monitor must not be null");
            return;
        }
        zzgs zzgsVar = zzguVar.j;
        String path = sQLiteDatabase.getPath();
        int i = zzcd.a;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            zzgsVar.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzgsVar.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzgsVar.a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzgsVar.a("Failed to turn on database write permission for owner");
    }
}
