package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzca;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: com.google.android.gms.measurement.internal.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3365u {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[Catch: SQLiteException -> 0x00b9, TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:14:0x0046, B:17:0x0076, B:19:0x0084, B:21:0x008c, B:23:0x008f, B:24:0x00b8, B:28:0x00be, B:30:0x00c1, B:32:0x00c9, B:34:0x00d0, B:37:0x00d3, B:39:0x00d9, B:44:0x00ea, B:45:0x00ee, B:16:0x006f), top: B:13:0x0046, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be A[Catch: SQLiteException -> 0x00b9, LOOP:1: B:28:0x00be->B:34:0x00d0, LOOP_START, PHI: r1
      0x00be: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:27:0x00bc, B:34:0x00d0] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:14:0x0046, B:17:0x0076, B:19:0x0084, B:21:0x008c, B:23:0x008f, B:24:0x00b8, B:28:0x00be, B:30:0x00c1, B:32:0x00c9, B:34:0x00d0, B:37:0x00d3, B:39:0x00d9, B:44:0x00ea, B:45:0x00ee, B:16:0x006f), top: B:13:0x0046, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9 A[Catch: SQLiteException -> 0x00b9, TryCatch #1 {SQLiteException -> 0x00b9, blocks: (B:14:0x0046, B:17:0x0076, B:19:0x0084, B:21:0x008c, B:23:0x008f, B:24:0x00b8, B:28:0x00be, B:30:0x00c1, B:32:0x00c9, B:34:0x00d0, B:37:0x00d3, B:39:0x00d9, B:44:0x00ea, B:45:0x00ee, B:16:0x006f), top: B:13:0x0046, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C3392x2 c3392x2, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th2;
        Cursor cursor;
        HashSet hashSet;
        Cursor rawQuery;
        if (c3392x2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
            } catch (Throwable th3) {
                th2 = th3;
                if (cursor2 != null) {
                }
            }
        } catch (SQLiteException e10) {
            e = e10;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            cursor = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                } catch (SQLiteException e11) {
                    e = e11;
                    c3392x2.r().c("Error querying for table", str, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase2.execSQL(str2);
                    try {
                        hashSet = new HashSet();
                        StringBuilder sb2 = new StringBuilder(str.length() + 22);
                        sb2.append("SELECT * FROM ");
                        sb2.append(str);
                        sb2.append(" LIMIT 0");
                        rawQuery = sQLiteDatabase2.rawQuery(sb2.toString(), null);
                        try {
                            Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            for (String str4 : str3.split(",")) {
                                if (!hashSet.remove(str4)) {
                                    StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                    sb3.append("Table ");
                                    sb3.append(str);
                                    sb3.append(" is missing required column: ");
                                    sb3.append(str4);
                                    throw new SQLiteException(sb3.toString());
                                }
                            }
                            if (strArr != null) {
                                for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                                    if (!hashSet.remove(strArr[i10])) {
                                        sQLiteDatabase2.execSQL(strArr[i10 + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                c3392x2.r().c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                            }
                        } catch (Throwable th4) {
                            rawQuery.close();
                            throw th4;
                        }
                    } catch (SQLiteException e12) {
                        c3392x2.o().b("Failed to verify columns on table that was just created", str);
                        throw e12;
                    }
                }
            } catch (Throwable th5) {
                th2 = th5;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th2;
                }
                cursor2.close();
                throw th2;
            }
        } catch (SQLiteException e13) {
            e = e13;
            cursor = null;
            c3392x2.r().c("Error querying for table", str, e);
            if (cursor != null) {
            }
            sQLiteDatabase2.execSQL(str2);
            hashSet = new HashSet();
            StringBuilder sb22 = new StringBuilder(str.length() + 22);
            sb22.append("SELECT * FROM ");
            sb22.append(str);
            sb22.append(" LIMIT 0");
            rawQuery = sQLiteDatabase2.rawQuery(sb22.toString(), null);
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

    public static void b(C3392x2 c3392x2, SQLiteDatabase sQLiteDatabase) {
        if (c3392x2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        zzbv.zza();
        String path = sQLiteDatabase.getPath();
        int i10 = zzca.zzb;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            c3392x2.r().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c3392x2.r().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c3392x2.r().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c3392x2.r().a("Failed to turn on database write permission for owner");
    }
}
