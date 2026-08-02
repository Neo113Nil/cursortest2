package com.bytedance.sdk.component.wh.pcc.pcc.pcc;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.wh.pcc.qf;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class sf {
    private C0059sf pcc;
    private Context sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class pcc extends AbstractCursor {
        private pcc() {
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

    public sf(Context context) {
        try {
            this.sf = context.getApplicationContext();
            if (this.pcc == null) {
                this.pcc = new C0059sf();
            }
        } catch (Throwable unused) {
        }
    }

    public C0059sf pcc() {
        return this.pcc;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.wh.pcc.pcc.pcc.sf$sf, reason: collision with other inner class name */
    public class C0059sf {
        private volatile SQLiteDatabase sf = null;

        public C0059sf() {
        }

        private boolean sf() {
            SQLiteDatabase sQLiteDatabase = this.sf;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public synchronized void pcc(String str, String str2, List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
            JSONObject wh;
            try {
                try {
                    pcc();
                    this.sf.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i = 0; i < list.size(); i++) {
                        com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar = list.get(i);
                        if (pccVar != null && (wh = pccVar.wh()) != null) {
                            contentValues.put("id", pccVar.gm());
                            String sf = qf.wh().jr().sf(wh.toString());
                            if (!TextUtils.isEmpty(sf)) {
                                contentValues.put(U3.i.X, sf);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.wh.pcc.gm.pcc.oo()) {
                                    if (pccVar.vy() > 0) {
                                        if (pccVar.oo() != 0) {
                                            if (pccVar.oo() == 3) {
                                            }
                                        }
                                        contentValues.put("channel", Integer.valueOf(pccVar.vy()));
                                    }
                                }
                                this.sf.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.sf.setTransactionSuccessful();
                    list.size();
                    if (this.sf != null) {
                        this.sf.endTransaction();
                    }
                } catch (Exception e) {
                    list.size();
                    if (sf()) {
                        throw e;
                    }
                    if (this.sf != null) {
                        this.sf.endTransaction();
                    }
                }
            } catch (Throwable th) {
                if (this.sf != null) {
                    this.sf.endTransaction();
                }
                throw th;
            }
        }

        public void pcc(String str) throws SQLException {
            try {
                pcc();
                this.sf.execSQL(str);
            } catch (Throwable th) {
                if (sf()) {
                    throw th;
                }
            }
        }

        public Cursor pcc(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                pcc();
                return this.sf.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                pcc pccVar = new pcc();
                if (this.sf()) {
                    throw th;
                }
                return pccVar;
            }
        }

        public int pcc(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                pcc();
                return this.sf.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                if (this.sf()) {
                    throw e;
                }
                return 0;
            }
        }

        public long pcc(String str, String str2, ContentValues contentValues) {
            try {
                pcc();
                return this.sf.insert(str, str2, contentValues);
            } catch (Exception e) {
                if (this.sf()) {
                    throw e;
                }
                return -1L;
            }
        }

        private void pcc() {
            boolean sf;
            try {
                if (this.sf != null && this.sf.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.sf != null) {
                            if (!this.sf.isOpen()) {
                            }
                        }
                        this.sf = qf.wh().gm().pcc(qf.wh().vj());
                        this.sf.setLockingEnabled(false);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } finally {
                if (!sf) {
                }
            }
        }

        public int pcc(String str, String str2, String[] strArr) {
            try {
                pcc();
                return this.sf.delete(str, str2, strArr);
            } catch (Exception e) {
                if (this.sf()) {
                    throw e;
                }
                return 0;
            }
        }
    }
}
