package com.ironsource.adqualitysdk.sdk.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓼ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0710 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String[] f2412;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final SQLiteDatabase f2416;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f2415 = StringFog.decrypt("uxhyAu8s0aQ=\n", "0G4tcZtDo8E=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2414 = StringFog.decrypt("skYQ\n", "2SNpGmhtjHg=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2413 = StringFog.decrypt("7ebp\n", "m4eFSMnjY8E=\n");

    static {
        StringFog.decrypt("U8DnWOLh4Ixz598c+sfKhX/lx3jS4OCCe+DD\n", "GpOmPLOUgeA=\n");
        f2412 = new String[]{StringFog.decrypt("X6JI\n", "NMcxnByn9Dk=\n"), StringFog.decrypt("1WDU\n", "owG4I8ACXmc=\n")};
    }

    public C0710(Context context, String str) {
        this.f2416 = new C0711(context, str).getWritableDatabase();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized int m407(String str) {
        Cursor cursor = null;
        try {
            cursor = this.f2416.query(f2415, new String[]{StringFog.decrypt("SgoVMKty1lZlbA==\n", "CUVAfv9aoDc=\n")}, StringFog.decrypt("nvO3u3Vs2JbVqQ==\n", "9ZbOmzklk9M=\n"), new String[]{str.replace('*', '%')}, null, null, null);
            if (cursor == null || !cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return 0;
            }
            int i = cursor.getInt(0);
            cursor.close();
            return i;
        } finally {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized HashMap m409(String str, int i) {
        HashMap hashMap;
        Cursor cursor = null;
        try {
            cursor = this.f2416.query(f2415, f2412, StringFog.decrypt("jDC6VoGzMVPHag==\n", "51XDds36ehY=\n"), new String[]{str.replace('*', '%')}, null, null, null, i <= 0 ? null : Integer.toString(i));
            hashMap = new HashMap();
            while (cursor != null) {
                if (!cursor.moveToNext()) {
                    break;
                }
                try {
                    hashMap.put(cursor.getString(cursor.getColumnIndexOrThrow(f2414)), cursor.getString(cursor.getColumnIndexOrThrow(f2413)));
                } catch (IllegalArgumentException unused) {
                }
            }
            if (cursor != null) {
                cursor.close();
            }
        } finally {
        }
        return hashMap;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized String m408(String str) {
        Cursor cursor = null;
        try {
            Cursor query = this.f2416.query(f2415, f2412, StringFog.decrypt("Jrl1NC92Xg==\n", "TdwMFBJWYaE=\n"), new String[]{str}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToNext()) {
                        String string = query.getString(query.getColumnIndexOrThrow(f2413));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m410(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(f2413, str2);
        SQLiteDatabase sQLiteDatabase = this.f2416;
        String str3 = f2415;
        if (sQLiteDatabase.update(str3, contentValues, StringFog.decrypt("UK1urNeZBQ==\n", "O8gXjOq5OhU=\n"), new String[]{str}) == 0) {
            contentValues.put(f2414, str);
            this.f2416.replace(str3, null, contentValues);
        }
    }
}
