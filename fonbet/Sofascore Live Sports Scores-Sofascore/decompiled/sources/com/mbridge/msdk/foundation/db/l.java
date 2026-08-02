package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class l extends a<com.mbridge.msdk.foundation.entity.h> {
    private static l a;

    private l(f fVar) {
        super(fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
    
        if (r0 != null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized List<com.mbridge.msdk.foundation.entity.i> a(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursor = null;
        arrayList2 = null;
        arrayList2 = null;
        cursor = null;
        try {
            try {
                Cursor cursor2 = getReadableDatabase().rawQuery("select * from unit_id WHERE ad_type = ?", new String[]{String.valueOf(i)});
                if (cursor2 != null) {
                    try {
                        try {
                            if (cursor2.getCount() > 0) {
                                arrayList = new ArrayList(cursor2.getCount());
                                while (cursor2.moveToNext()) {
                                    try {
                                        arrayList.add(new com.mbridge.msdk.foundation.entity.i(cursor2.getString(cursor2.getColumnIndex(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER)), cursor2.getString(cursor2.getColumnIndex("unitId")), i));
                                    } catch (Exception e) {
                                        e = e;
                                        cursor = cursor2;
                                        e.printStackTrace();
                                        if (cursor == null) {
                                            arrayList2 = arrayList;
                                            return arrayList2;
                                        }
                                        cursor2 = cursor;
                                        arrayList2 = arrayList;
                                        try {
                                            cursor2.close();
                                        } catch (Exception unused) {
                                        }
                                        return arrayList2;
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        arrayList = null;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                arrayList = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return arrayList2;
    }

    public synchronized void a(String str) {
        if (getWritableDatabase() != null) {
            getWritableDatabase().delete(MBridgeConstans.PROPERTIES_UNIT_ID, "unitId = ?", new String[]{str + ""});
        }
    }

    public synchronized void a(String str, String str2, int i) {
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, str);
        contentValues.put("unitId", str2);
        contentValues.put("ad_type", Integer.valueOf(i));
        getWritableDatabase().insert(MBridgeConstans.PROPERTIES_UNIT_ID, null, contentValues);
    }

    public static l a(f fVar) {
        l lVar;
        l lVar2 = a;
        if (lVar2 != null) {
            return lVar2;
        }
        synchronized (l.class) {
            try {
                lVar = a;
                if (lVar == null) {
                    lVar = new l(fVar);
                    a = lVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }
}
