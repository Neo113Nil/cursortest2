package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class D4 {
    public static final a a = new a(null);
    private static final Object b = new Object();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final SQLiteDatabase a(SQLiteOpenHelper sqliteOpenHelper) {
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sqliteOpenHelper, 1, null);
    }

    public static /* synthetic */ SQLiteDatabase a(D4 d4, boolean z, SQLiteOpenHelper sQLiteOpenHelper, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return d4.a(z, sQLiteOpenHelper);
    }

    public final SQLiteDatabase a(boolean z, SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase readableDatabase;
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (b) {
            if (z) {
                readableDatabase = sqliteOpenHelper.getWritableDatabase();
            } else {
                readableDatabase = sqliteOpenHelper.getReadableDatabase();
            }
        }
        return readableDatabase;
    }
}
