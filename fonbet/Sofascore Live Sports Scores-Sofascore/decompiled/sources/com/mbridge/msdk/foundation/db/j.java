package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class j extends a<com.mbridge.msdk.foundation.entity.g> {
    private static j a;

    private j(f fVar) {
        super(fVar);
    }

    private synchronized long a(com.mbridge.msdk.foundation.entity.g gVar) {
        try {
            com.mbridge.msdk.foundation.db.middle.a.b().a(gVar);
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", gVar.a());
            contentValues.put("fc_a", Integer.valueOf(gVar.c()));
            contentValues.put("fc_b", Integer.valueOf(gVar.d()));
            contentValues.put("ts", Long.valueOf(gVar.f()));
            contentValues.put("impression_count", Integer.valueOf(gVar.e()));
            contentValues.put("click_count", Integer.valueOf(gVar.b()));
            contentValues.put("ts", Long.valueOf(gVar.f()));
            if (getWritableDatabase() == null) {
                return -1L;
            }
            return getWritableDatabase().insert("frequence", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public synchronized void b(String str) {
        com.mbridge.msdk.foundation.db.middle.a.b().a(str);
        if (a(str) && getReadableDatabase() != null) {
            getReadableDatabase().execSQL("UPDATE frequence Set impression_count=impression_count+1 WHERE id= ?", new Object[]{str});
        }
    }

    public synchronized void d() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - 86400000;
            com.mbridge.msdk.foundation.db.middle.a.b().a(currentTimeMillis);
            String[] strArr = {String.valueOf(currentTimeMillis)};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("frequence", "ts< ? ", strArr);
            }
        } catch (Exception unused) {
        }
    }

    public synchronized void b(com.mbridge.msdk.foundation.entity.g gVar) {
        if (!a(gVar.a())) {
            a(gVar);
        }
    }

    /* JADX WARN: Finally extract failed */
    public synchronized boolean a(String str) {
        Cursor cursor = null;
        try {
            try {
                synchronized (str) {
                    Cursor rawQuery = getReadableDatabase().rawQuery("SELECT id FROM frequence WHERE id= ?", new String[]{str});
                    if (rawQuery != null && rawQuery.getCount() > 0) {
                        rawQuery.close();
                        return true;
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return false;
                }
            } catch (Exception unused) {
                if (0 != 0) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public static j a(f fVar) {
        j jVar;
        j jVar2 = a;
        if (jVar2 != null) {
            return jVar2;
        }
        synchronized (j.class) {
            try {
                jVar = a;
                if (jVar == null) {
                    jVar = new j(fVar);
                    a = jVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }
}
