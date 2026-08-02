package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class D4 {
    public static final a a = new a(null);
    private static final Object b = new Object();

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    public final SQLiteDatabase a(SQLiteOpenHelper sQLiteOpenHelper) {
        return a(this, false, sQLiteOpenHelper, 1, null);
    }

    public static /* synthetic */ SQLiteDatabase a(D4 d4, boolean z, SQLiteOpenHelper sQLiteOpenHelper, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return d4.a(z, sQLiteOpenHelper);
    }

    public final SQLiteDatabase a(boolean z, SQLiteOpenHelper sQLiteOpenHelper) {
        SQLiteDatabase readableDatabase;
        synchronized (b) {
            try {
                if (z) {
                    readableDatabase = sQLiteOpenHelper.getWritableDatabase();
                } else {
                    readableDatabase = sQLiteOpenHelper.getReadableDatabase();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return readableDatabase;
    }
}
