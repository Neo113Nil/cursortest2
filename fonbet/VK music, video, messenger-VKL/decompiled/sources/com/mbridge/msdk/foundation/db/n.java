package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VideoReportDataDao.java */
/* loaded from: classes13.dex */
public class n extends a<com.mbridge.msdk.foundation.entity.n> {
    private static final String a = "com.mbridge.msdk.foundation.db.n";
    private static n b;

    private n(f fVar) {
        super(fVar);
    }

    public static n a(f fVar) {
        if (b == null) {
            synchronized (n.class) {
                try {
                    if (b == null) {
                        b = new n(fVar);
                    }
                } finally {
                }
            }
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
    
        if (r1 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized int d() {
        int i;
        i = 0;
        Cursor cursor = null;
        try {
            try {
                cursor = getReadableDatabase().rawQuery("select count(*) from reward_report", null);
                if (cursor != null && cursor.moveToFirst()) {
                    i = cursor.getInt(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused) {
                }
            }
            throw th;
        }
        return i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x033a, code lost:
    
        if (r10 != null) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0342 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized List<com.mbridge.msdk.foundation.entity.n> a(String str) {
        Cursor cursor;
        List<com.mbridge.msdk.foundation.entity.n> list;
        Cursor cursor2;
        Cursor cursor3;
        com.mbridge.msdk.foundation.entity.n nVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursor4;
        com.mbridge.msdk.foundation.entity.n nVar2;
        if (TextUtils.isEmpty(str)) {
            list = null;
        } else {
            try {
                cursor2 = getReadableDatabase().query("reward_report", null, "key=?", new String[]{str}, null, null, null);
                if (cursor2 != null) {
                    try {
                        try {
                            if (cursor2.getCount() > 0) {
                                ArrayList arrayList3 = new ArrayList();
                                while (cursor2.moveToNext()) {
                                    String string = cursor2.getString(cursor2.getColumnIndex("key"));
                                    int i = cursor2.getInt(cursor2.getColumnIndex("networkType"));
                                    String string2 = cursor2.getString(cursor2.getColumnIndex("network_str"));
                                    cursor2.getInt(cursor2.getColumnIndex("isCompleteView"));
                                    cursor2.getInt(cursor2.getColumnIndex("watchedMillis"));
                                    int i2 = cursor2.getInt(cursor2.getColumnIndex(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH));
                                    String string3 = cursor2.getString(cursor2.getColumnIndex("offerUrl"));
                                    String string4 = cursor2.getString(cursor2.getColumnIndex("reason"));
                                    int i3 = cursor2.getInt(cursor2.getColumnIndex("result"));
                                    String string5 = cursor2.getString(cursor2.getColumnIndex("duration"));
                                    int i4 = cursor2.getInt(cursor2.getColumnIndex("videoSize"));
                                    String string6 = cursor2.getString(cursor2.getColumnIndex("campaignId"));
                                    String string7 = cursor2.getString(cursor2.getColumnIndex("video_url"));
                                    String string8 = cursor2.getString(cursor2.getColumnIndex("unitId"));
                                    String string9 = cursor2.getString(cursor2.getColumnIndex("rid"));
                                    String string10 = cursor2.getString(cursor2.getColumnIndex("rid_n"));
                                    String string11 = cursor2.getString(cursor2.getColumnIndex("ad_type"));
                                    String string12 = cursor2.getString(cursor2.getColumnIndex("resource_type"));
                                    String string13 = cursor2.getString(cursor2.getColumnIndex("device_id"));
                                    list = null;
                                    try {
                                        String string14 = cursor2.getString(cursor2.getColumnIndex("creative"));
                                        int i5 = cursor2.getInt(cursor2.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T));
                                        if (str.equals("2000021")) {
                                            try {
                                                try {
                                                    nVar = new com.mbridge.msdk.foundation.entity.n(string, i, string3, string4, string2);
                                                    nVar.b(string6);
                                                    nVar.v(string7);
                                                    nVar.n(string9);
                                                    nVar.o(string10);
                                                    nVar.u(string8);
                                                } catch (Exception e) {
                                                    e = e;
                                                    e.printStackTrace();
                                                    q0.b(a, e.getMessage());
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursor2;
                                                if (cursor != null) {
                                                    try {
                                                        cursor.close();
                                                    } catch (Exception unused) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        } else {
                                            if (str.equals("2000022")) {
                                                nVar2 = new com.mbridge.msdk.foundation.entity.n(string, i, i2, string3, i3, string5, i4, string2);
                                                nVar2.b(string6);
                                                nVar2.v(string7);
                                                nVar2.n(string9);
                                                nVar2.u(string8);
                                                nVar2.m(string4);
                                                nVar2.o(string10);
                                                nVar2.a(string11);
                                            } else if (str.equals("2000025")) {
                                                nVar2 = new com.mbridge.msdk.foundation.entity.n(string, i, i2, string3, i3, string5, i4, string2);
                                            } else if (str.equals("2000024")) {
                                                nVar = new com.mbridge.msdk.foundation.entity.n(string, i, string3, string4, string2);
                                            } else if ("2000039".equals(str)) {
                                                nVar = new com.mbridge.msdk.foundation.entity.n(cursor2.getString(cursor2.getColumnIndex("h5_click_data")));
                                            } else {
                                                if ("2000043".equals(str)) {
                                                    try {
                                                        arrayList = arrayList3;
                                                        cursor4 = cursor2;
                                                        try {
                                                            com.mbridge.msdk.foundation.entity.n nVar3 = new com.mbridge.msdk.foundation.entity.n(str, i3, string5, cursor2.getString(cursor2.getColumnIndex(CampaignEx.ENDCARD_URL)), string6, string8, string4, cursor2.getString(cursor2.getColumnIndex("type")));
                                                            nVar3.n(string9);
                                                            nVar3.o(string10);
                                                            if (!TextUtils.isEmpty(string6)) {
                                                                nVar3.b(string6);
                                                            }
                                                            nVar3.a(i5);
                                                            nVar3.a(string11);
                                                            nVar3.p(string12);
                                                            nVar3.d(string13);
                                                            nVar3.c(string14);
                                                            nVar = nVar3;
                                                            cursor3 = cursor4;
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            cursor2 = cursor4;
                                                            e.printStackTrace();
                                                            q0.b(a, e.getMessage());
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            cursor = cursor4;
                                                            if (cursor != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        cursor4 = cursor2;
                                                    }
                                                } else {
                                                    arrayList = arrayList3;
                                                    Cursor cursor5 = cursor2;
                                                    try {
                                                        if ("2000045".equals(str)) {
                                                            com.mbridge.msdk.foundation.entity.n nVar4 = new com.mbridge.msdk.foundation.entity.n();
                                                            nVar4.j(str);
                                                            nVar4.c(i);
                                                            nVar4.d(i3);
                                                            nVar4.b(string6);
                                                            cursor3 = cursor5;
                                                            nVar4.t(cursor3.getString(cursor3.getColumnIndex("template_url")));
                                                            nVar4.m(string4);
                                                            nVar4.n(string9);
                                                            nVar4.o(string10);
                                                            nVar4.u(string8);
                                                            nVar = nVar4;
                                                        } else {
                                                            cursor3 = cursor5;
                                                            if ("2000044".equals(str)) {
                                                                nVar = new com.mbridge.msdk.foundation.entity.n();
                                                                nVar.j(str);
                                                                nVar.c(i);
                                                                nVar.b(string6);
                                                                nVar.i(cursor3.getString(cursor3.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_URL)));
                                                                nVar.m(string4);
                                                                nVar.n(string9);
                                                                nVar.o(string10);
                                                                nVar.u(string8);
                                                            } else if ("2000054".equals(str)) {
                                                                com.mbridge.msdk.foundation.entity.n nVar5 = new com.mbridge.msdk.foundation.entity.n();
                                                                nVar5.j(str);
                                                                nVar5.p(string12);
                                                                nVar5.u(string8);
                                                                nVar5.d(string13);
                                                                nVar5.a(string11);
                                                                nVar5.b(string6);
                                                                nVar5.n(string9);
                                                                nVar5.o(string10);
                                                                nVar5.d(i3);
                                                                nVar5.m(string4);
                                                                nVar5.c(i);
                                                                nVar5.c(string14);
                                                                nVar5.a(i5);
                                                                nVar = nVar5;
                                                            } else {
                                                                nVar = null;
                                                            }
                                                        }
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        cursor3 = cursor5;
                                                        cursor2 = cursor3;
                                                        e.printStackTrace();
                                                        q0.b(a, e.getMessage());
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        cursor3 = cursor5;
                                                        cursor = cursor3;
                                                        if (cursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                if (nVar != null) {
                                                    try {
                                                        arrayList2 = arrayList;
                                                        arrayList2.add(nVar);
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        cursor2 = cursor3;
                                                        e.printStackTrace();
                                                        q0.b(a, e.getMessage());
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        cursor = cursor3;
                                                        if (cursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    arrayList2 = arrayList;
                                                }
                                                int i6 = cursor3.getInt(cursor3.getColumnIndex("id"));
                                                getWritableDatabase().delete("reward_report", "id = ?", new String[]{i6 + ""});
                                                arrayList3 = arrayList2;
                                                cursor2 = cursor3;
                                            }
                                            cursor3 = cursor2;
                                            arrayList = arrayList3;
                                            nVar = nVar2;
                                            if (nVar != null) {
                                            }
                                            int i62 = cursor3.getInt(cursor3.getColumnIndex("id"));
                                            getWritableDatabase().delete("reward_report", "id = ?", new String[]{i62 + ""});
                                            arrayList3 = arrayList2;
                                            cursor2 = cursor3;
                                        }
                                        cursor3 = cursor2;
                                        arrayList = arrayList3;
                                        if (nVar != null) {
                                        }
                                        int i622 = cursor3.getInt(cursor3.getColumnIndex("id"));
                                        getWritableDatabase().delete("reward_report", "id = ?", new String[]{i622 + ""});
                                        arrayList3 = arrayList2;
                                        cursor2 = cursor3;
                                    } catch (Exception e6) {
                                        e = e6;
                                    }
                                }
                                ArrayList arrayList4 = arrayList3;
                                try {
                                    cursor2.close();
                                } catch (Exception unused2) {
                                }
                                return arrayList4;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            list = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        cursor3 = cursor2;
                    }
                }
                list = null;
            } catch (Exception e8) {
                e = e8;
                list = null;
                cursor2 = null;
            } catch (Throwable th7) {
                th = th7;
                cursor = null;
            }
            if (cursor2 != null) {
                cursor2 = cursor2;
                try {
                    cursor2.close();
                } catch (Exception unused3) {
                }
            }
        }
        return list;
    }

    public synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        try {
            if (nVar != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("key", nVar.n());
                    contentValues.put("networkType", Integer.valueOf(nVar.q()));
                    contentValues.put("network_str", nVar.r());
                    contentValues.put("isCompleteView", Integer.valueOf(nVar.m()));
                    contentValues.put("watchedMillis", Integer.valueOf(nVar.F()));
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH, Integer.valueOf(nVar.C()));
                    if (!TextUtils.isEmpty(nVar.s())) {
                        contentValues.put("offerUrl", nVar.s());
                    }
                    if (!TextUtils.isEmpty(nVar.t())) {
                        contentValues.put("reason", URLEncoder.encode(nVar.t(), B5.O));
                    }
                    contentValues.put("result", Integer.valueOf(nVar.x()));
                    contentValues.put("duration", nVar.g());
                    contentValues.put("videoSize", Long.valueOf(nVar.D()));
                    contentValues.put("type", nVar.h());
                    String i = nVar.i();
                    if (!TextUtils.isEmpty(i)) {
                        contentValues.put(CampaignEx.ENDCARD_URL, i);
                    }
                    String E = nVar.E();
                    if (!TextUtils.isEmpty(E)) {
                        contentValues.put("video_url", E);
                    }
                    String u = nVar.u();
                    if (!TextUtils.isEmpty(u)) {
                        contentValues.put("rid", u);
                    }
                    String v = nVar.v();
                    if (!TextUtils.isEmpty(v)) {
                        contentValues.put("rid_n", v);
                    }
                    String z = nVar.z();
                    if (!TextUtils.isEmpty(z)) {
                        contentValues.put("template_url", z);
                    }
                    String l = nVar.l();
                    if (!TextUtils.isEmpty(l)) {
                        contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, l);
                    }
                    String a2 = nVar.a();
                    if (!TextUtils.isEmpty(a2)) {
                        contentValues.put("ad_type", URLEncoder.encode(a2, B5.O));
                    }
                    contentValues.put("unitId", nVar.B());
                    contentValues.put("campaignId", nVar.d());
                    if ("2000039".equals(nVar.n())) {
                        String b2 = o.b(nVar);
                        if (a1.b(b2)) {
                            contentValues.put("h5_click_data", b2);
                        }
                    }
                    String w = nVar.w();
                    if (!TextUtils.isEmpty(w)) {
                        contentValues.put("resource_type", URLEncoder.encode(w, B5.O));
                    }
                    String f = nVar.f();
                    if (!TextUtils.isEmpty(f)) {
                        contentValues.put("device_id", URLEncoder.encode(f, B5.O));
                    }
                    String e = nVar.e();
                    if (!TextUtils.isEmpty(e)) {
                        contentValues.put("creative", URLEncoder.encode(e, B5.O));
                    }
                    contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.b()));
                    return getWritableDatabase().insert("reward_report", null, contentValues);
                } catch (Exception e2) {
                    q0.b(a, e2.getMessage());
                }
            }
            return -1L;
        } catch (Throwable th) {
            throw th;
        }
    }
}
