package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class A4 {

    @NotNull
    public static final a a = new a(null);

    @NotNull
    private static final Object b = new Object();

    @Nullable
    public final SQLiteDatabase a(boolean z, @NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        SQLiteDatabase writableDatabase;
        sQLiteOpenHelper.getClass();
        synchronized (b) {
            try {
                writableDatabase = z ? sQLiteOpenHelper.getWritableDatabase() : sQLiteOpenHelper.getReadableDatabase();
            } catch (Throwable th) {
                throw th;
            }
        }
        return writableDatabase;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static /* synthetic */ SQLiteDatabase a(A4 a4, boolean z, SQLiteOpenHelper sQLiteOpenHelper, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a4.a(z, sQLiteOpenHelper);
    }

    @Nullable
    public final SQLiteDatabase a(@NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        sQLiteOpenHelper.getClass();
        return a(this, false, sQLiteOpenHelper, 1, null);
    }
}
