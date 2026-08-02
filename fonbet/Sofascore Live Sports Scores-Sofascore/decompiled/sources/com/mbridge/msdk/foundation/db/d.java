package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.w0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class d extends a<JumpLoaderResult> {
    public static final String a = "d";
    private static d b;

    private d(f fVar) {
        super(fVar);
    }

    public synchronized long a(CampaignEx campaignEx, String str) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                String a2 = w0.a(campaignEx.getJumpResult());
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", campaignEx.getId());
                contentValues.put("unitid", str);
                contentValues.put("result", a2);
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval() * 1000));
                contentValues.put("package_name", campaignEx.getPackageName());
                com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                contentValues.put("ts", Long.valueOf(System.currentTimeMillis()));
                if (f != null && f.Z() > 0) {
                    contentValues.put("cpei", Integer.valueOf(f.Z() * 1000));
                }
                if (f != null && f.a0() > 0) {
                    contentValues.put("cpoci", Integer.valueOf(f.a0() * 1000));
                }
                if (!a(campaignEx.getId(), str)) {
                    return getWritableDatabase().insert("campaignclick", null, contentValues);
                }
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                return getWritableDatabase().update("campaignclick", contentValues, "id = ? AND unitid = ? ", new String[]{campaignEx.getId(), str});
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(a, e.getMessage());
                }
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r12 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        if (r12 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized JumpLoaderResult b(String str, String str2) {
        Throwable th;
        Exception exc;
        Cursor cursor;
        ?? r1 = 0;
        try {
        } catch (Throwable th2) {
            th = th2;
            r1 = str;
        }
        try {
            cursor = getReadableDatabase().query("campaignclick", null, "id=? AND unitid=?", new String[]{str, str2}, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("result"));
                        if (!TextUtils.isEmpty(string)) {
                            JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) w0.a(string);
                            cursor.close();
                            return jumpLoaderResult;
                        }
                    }
                } catch (Exception e) {
                    exc = e;
                    if (MBridgeConstans.DEBUG) {
                        q0.b(a, exc.getMessage());
                    }
                }
            }
        } catch (Exception e2) {
            exc = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (r1 == 0) {
                throw th;
            }
            r1.close();
            throw th;
        }
    }

    public synchronized boolean c(String str, String str2) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ? AND cti + ts > " + System.currentTimeMillis(), new String[]{str, str2});
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(a, e.getMessage());
            }
            return false;
        }
    }

    public synchronized void d() {
        try {
            getWritableDatabase().delete("campaignclick", " ( " + System.currentTimeMillis() + " - ts) > cti", null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(a, e.getMessage());
            }
        }
    }

    public static synchronized d a(f fVar) {
        d dVar;
        synchronized (d.class) {
            dVar = b;
            if (dVar == null) {
                dVar = new d(fVar);
                b = dVar;
            }
        }
        return dVar;
    }

    public synchronized boolean a(String str, String str2) {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ?", new String[]{str, str2});
        if (rawQuery != null && rawQuery.getCount() > 0) {
            rawQuery.close();
            return true;
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return false;
    }
}
