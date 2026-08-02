package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class I9 extends SQLiteOpenHelper {
    public final C3746s5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I9(C3746s5 c3746s5) {
        super(c3746s5.a, "com.im_11.3.0.db", (SQLiteDatabase.CursorFactory) null, 1);
        c3746s5.getClass();
        this.a = c3746s5;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, C3606mk c3606mk) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + c3606mk.a + " " + c3606mk.b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final String getDatabaseName() {
        this.a.getClass();
        return "com.im_11.3.0.db";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (this.a.c != 2 || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                a(sQLiteDatabase, (C3606mk) it.next());
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
