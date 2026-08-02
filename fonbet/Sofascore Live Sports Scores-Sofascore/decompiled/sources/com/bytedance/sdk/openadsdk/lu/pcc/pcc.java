package com.bytedance.sdk.openadsdk.lu.pcc;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.component.utils.lo;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends SQLiteOpenHelper {
    private static volatile pcc sf;
    final Context pcc;

    private pcc(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.pcc = context;
    }

    private static pcc gm() {
        if (sf == null) {
            synchronized (pcc.class) {
                try {
                    if (sf == null) {
                        if (fum.pcc(com.bytedance.sdk.openadsdk.lu.pcc.pcc())) {
                            sf = new pcc(com.bytedance.sdk.openadsdk.lu.pcc.pcc(), "pag_monitor.db");
                        } else {
                            sf = new pcc(com.bytedance.sdk.openadsdk.lu.pcc.pcc(), "pag_monitor_" + fum.gm(com.bytedance.sdk.openadsdk.lu.pcc.pcc()) + ".db");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sf;
    }

    private void pcc(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> sf2 = sf(sQLiteDatabase);
        if (sf2 == null || sf2.size() <= 0) {
            return;
        }
        Iterator<String> it = sf2.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
        }
    }

    private ArrayList<String> sf(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                rawQuery.close();
            }
            return arrayList;
        } catch (Exception e) {
            lo.gm("MonitorSQLiteOpenHelper", e.getMessage());
            return arrayList;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i <= i2) {
                onCreate(sQLiteDatabase);
            } else {
                pcc(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    public static SQLiteDatabase pcc() {
        try {
            pcc gm = gm();
            if (gm == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = gm.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static SQLiteDatabase sf() {
        try {
            pcc gm = gm();
            if (gm == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = gm.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
