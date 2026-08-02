package com.mbridge.msdk.config.component.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class b extends SQLiteOpenHelper {
    public b(Context context) {
        super(context, "component_data.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> a = c.a("CREATE_");
        if (a == null || a.isEmpty()) {
            return;
        }
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(it.next());
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> a = c.a("DROP_");
        if (a == null || a.isEmpty()) {
            return;
        }
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(it.next());
        }
    }

    private boolean c(SQLiteDatabase sQLiteDatabase) {
        return (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly()) ? false : true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (c(sQLiteDatabase)) {
            a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        super.onDowngrade(sQLiteDatabase, i, i2);
        if (c(sQLiteDatabase)) {
            b(sQLiteDatabase);
            a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (c(sQLiteDatabase)) {
            b(sQLiteDatabase);
            a(sQLiteDatabase);
        }
    }
}
