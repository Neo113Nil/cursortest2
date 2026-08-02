package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {
    private static final Object gm = new Object();
    private gm pcc;
    private Context sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class sf extends AbstractCursor {
        private sf() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }
    }

    public qf(Context context) {
        try {
            this.sf = context == null ? lu.pcc() : context.getApplicationContext();
            if (this.pcc == null) {
                this.pcc = new gm();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context gm() {
        Context context = this.sf;
        return context == null ? lu.pcc() : context;
    }

    public gm pcc() {
        return this.pcc;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class gm {
        private SQLiteDatabase sf = null;

        public gm() {
        }

        private synchronized boolean gm() {
            SQLiteDatabase sQLiteDatabase = this.sf;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized void sf() {
            pcc pccVar;
            try {
                synchronized (qf.gm) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.sf;
                        if (sQLiteDatabase != null) {
                            if (!sQLiteDatabase.isOpen()) {
                            }
                        }
                        if (com.bytedance.sdk.component.utils.fum.pcc(qf.this.gm())) {
                            qf qfVar = qf.this;
                            pccVar = qfVar.new pcc(qfVar.gm(), "ttopensdk.db");
                        } else {
                            qf qfVar2 = qf.this;
                            pccVar = qfVar2.new pcc(qfVar2.gm(), "ttopensdk_" + com.bytedance.sdk.component.utils.fum.gm(qf.this.gm()) + ".db");
                        }
                        SQLiteDatabase writableDatabase = pccVar.getWritableDatabase();
                        this.sf = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", th.getMessage());
                if (gm()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor pcc(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                sf();
                cursor = this.sf.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", th.getMessage());
                sf sfVar = new sf();
                if (gm()) {
                    throw th;
                }
                cursor = sfVar;
            }
            return cursor;
        }

        public SQLiteDatabase pcc() {
            sf();
            return this.sf;
        }

        public synchronized int pcc(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            try {
                sf();
                i = this.sf.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", e.getMessage());
                if (gm()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        public synchronized long pcc(String str, String str2, ContentValues contentValues) {
            long j;
            try {
                sf();
                j = this.sf.replace(str, str2, contentValues);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", e.getMessage());
                if (gm()) {
                    throw e;
                }
                j = -1;
            }
            return j;
        }

        public synchronized int pcc(String str, String str2, String[] strArr) {
            int i;
            try {
                sf();
                i = this.sf.delete(str, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", e.getMessage());
                if (gm()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class pcc extends SQLiteOpenHelper {
        final Context pcc;

        public pcc(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 11);
            this.pcc = context;
        }

        private void gm(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> oo = oo(sQLiteDatabase);
            if (oo == null || oo.size() <= 0) {
                return;
            }
            Iterator<String> it = oo.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
            }
        }

        private ArrayList<String> oo(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursor != null) {
                    cursor.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            return arrayList;
        }

        private void pcc(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.oo.pcc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.vh.gm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.dax.pcc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.jr.pcc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.qy.sf.pcc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.lu.gm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.pcc.sf.sf.gm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.hc.pcc.gm.gm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.nac.pcc());
        }

        private void sf(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.hc.pcc.gm.oo());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                pcc(sQLiteDatabase, this.pcc);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    gm(sQLiteDatabase);
                    pcc(sQLiteDatabase, qf.this.sf);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.gm(th.getMessage(), new Object[0]);
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    gm(sQLiteDatabase);
                } catch (Throwable unused) {
                }
            }
            pcc(sQLiteDatabase, qf.this.sf);
            switch (i) {
                case 1:
                    pcc(sQLiteDatabase);
                    break;
                case 2:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                    pcc(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.dax.pcc());
                    pcc(sQLiteDatabase);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.pcc.sf.sf.gm());
                    pcc(sQLiteDatabase);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.jr.pcc());
                    pcc(sQLiteDatabase);
                    break;
                case 6:
                    pcc(sQLiteDatabase);
                    break;
            }
            if (i < 11) {
                try {
                    sf(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.qy.sf.pcc(sQLiteDatabase);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.gm("DBHelper", th.getMessage());
                }
            }
        }

        private void pcc(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.oo.sf());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.vh.oo());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.dax.sf());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.oo.jr.sf());
        }
    }
}
