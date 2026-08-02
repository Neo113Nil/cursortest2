package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class h extends a<Campaign> {
    private static final String a = "com.mbridge.msdk.foundation.db.h";
    private static h b;

    private h(f fVar) {
        super(fVar);
    }

    private synchronized void c(String str) {
        try {
        } catch (Throwable unused) {
            q0.c(a, "resetTimeAndTimestamp error");
        }
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("first_insert_timestamp", (Integer) 0);
        contentValues.put("play_time", (Integer) 0);
        getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = ?", new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(String str, int i) {
        Cursor cursor = null;
        boolean z = false;
        try {
            cursor = getReadableDatabase().rawQuery("SELECT * FROM dailyplaycap where unit_id = ?", new String[]{str});
            if (cursor != null && cursor.getCount() > 0 && cursor.moveToFirst()) {
                long j = cursor.getLong(cursor.getColumnIndex("first_insert_timestamp"));
                long j2 = cursor.getInt(cursor.getColumnIndex("play_time"));
                if (j != 0) {
                    if (System.currentTimeMillis() - 86400000 > j) {
                        c(str);
                    } else if (i > 0 && j2 >= i) {
                        z = true;
                    }
                }
            }
            if (cursor == null) {
                return z;
            }
        } catch (Throwable th) {
            try {
                q0.c(a, "isOverCap is error" + th);
            } catch (Throwable th2) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
        try {
            cursor.close();
        } catch (Throwable unused2) {
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (r1 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (0 == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void b(String str) {
        long j;
        long j2;
        Cursor cursor = null;
        try {
            try {
                if (getWritableDatabase() == null) {
                    return;
                }
                ContentValues contentValues = new ContentValues();
                long currentTimeMillis = System.currentTimeMillis();
                if (a(str)) {
                    cursor = getReadableDatabase().rawQuery("SELECT * FROM dailyplaycap where unit_id = ?", new String[]{str});
                    if (cursor == null || cursor.getCount() <= 0) {
                        j = 0;
                        j2 = 0;
                    } else {
                        cursor.moveToFirst();
                        j = cursor.getLong(cursor.getColumnIndex("first_insert_timestamp"));
                        j2 = cursor.getInt(cursor.getColumnIndex("play_time"));
                        if (currentTimeMillis - 86400000 > j) {
                            c(str);
                            j2 = 0;
                        }
                    }
                    if (j == 0) {
                        contentValues.put("first_insert_timestamp", Long.valueOf(currentTimeMillis));
                    }
                    contentValues.put("play_time", Long.valueOf(j2 + 1));
                    getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = ?", new String[]{str});
                } else {
                    contentValues.put("first_insert_timestamp", Long.valueOf(currentTimeMillis));
                    contentValues.put("play_time", (Long) 1L);
                    contentValues.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                    getWritableDatabase().insert("dailyplaycap", null, contentValues);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public synchronized boolean a(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT play_time FROM dailyplaycap WHERE unit_id= ?", new String[]{str});
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static h a(f fVar) {
        h hVar;
        h hVar2 = b;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (h.class) {
            try {
                hVar = b;
                if (hVar == null) {
                    hVar = new h(fVar);
                    b = hVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
