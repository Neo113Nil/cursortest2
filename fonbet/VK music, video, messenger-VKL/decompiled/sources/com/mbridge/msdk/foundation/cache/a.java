package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.vungle.ads.internal.task.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.i5s;

/* compiled from: BaseCandidateCache.java */
/* loaded from: classes13.dex */
public class a {
    private static String e = "BaseCandidateCache";
    public static int f = 4;
    protected com.mbridge.msdk.foundation.db.c a;
    private JSONArray b;
    private JSONObject c;
    private String d;

    /* compiled from: BaseCandidateCache.java */
    /* renamed from: com.mbridge.msdk.foundation.cache.a$a, reason: collision with other inner class name */
    public class C0263a implements Comparator<b> {
        public C0263a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return Double.compare(bVar.b, bVar2.b);
        }
    }

    /* compiled from: BaseCandidateCache.java */
    public static class b {
        private com.mbridge.msdk.foundation.cache.b a;
        private double b;

        public b(double d, com.mbridge.msdk.foundation.cache.b bVar) {
            this.b = d;
            this.a = bVar;
        }

        public com.mbridge.msdk.foundation.cache.b a() {
            return this.a;
        }
    }

    public void a(int i) {
        com.mbridge.msdk.foundation.db.c cVar = this.a;
        if (cVar != null) {
            cVar.a(this.d, i);
            a(f, 1, null, true, "", "", i, this.d);
        }
    }

    public double b(String str) {
        c a = a(str);
        if (a != null && a.g() != c.k && a.g() != c.i) {
            try {
                String[] split = k0.a(str.split(BundleUtil.UNDERLINE_TAG)[3]).split("\\|");
                if (split.length > 0) {
                    return Double.parseDouble(split[0]);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return -1.0d;
    }

    public JSONObject c(String str) {
        JSONArray jSONArray = this.b;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() <= 1) {
            return this.b.optJSONObject(0);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i = 0; i < this.b.length(); i++) {
            try {
                JSONObject optJSONObject = this.b.optJSONObject(i);
                if (optJSONObject != null && str.equals(optJSONObject.getString(g.e))) {
                    this.c = optJSONObject;
                    return optJSONObject;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public String d(String str) {
        c a = a(str);
        if (a != null && a.g() != c.k && a.g() != c.i) {
            String[] split = k0.a(str.split(BundleUtil.UNDERLINE_TAG)[3]).split("\\|");
            if (split.length > 1) {
                return split[1];
            }
        }
        return "";
    }

    public void e(String str) {
        this.d = str;
    }

    public c a(String str) {
        c cVar = new c();
        if (!TextUtils.isEmpty(str) && str.split(BundleUtil.UNDERLINE_TAG).length > 3 && !TextUtils.isEmpty(str.split(BundleUtil.UNDERLINE_TAG)[3])) {
            JSONArray jSONArray = this.b;
            if (jSONArray != null && jSONArray.length() != 0) {
                String a = k0.a(str.split(BundleUtil.UNDERLINE_TAG)[3]);
                if (TextUtils.isEmpty(a)) {
                    cVar.d("bid token exception:decode error");
                    cVar.a(c.i);
                    return cVar;
                }
                String[] split = a.split("\\|");
                if (split.length == 0) {
                    cVar.d("bid token can not get bid price");
                    cVar.a(c.i);
                    return cVar;
                }
                if (split.length > 0) {
                    try {
                        Double.parseDouble(split[0]);
                    } catch (Exception unused) {
                        cVar.d("bid token can not cast bid price");
                        cVar.a(c.i);
                        return cVar;
                    }
                }
                if (TextUtils.isEmpty(this.d)) {
                    cVar.d("unitId is empty");
                    cVar.a(c.k);
                }
                return cVar;
            }
            cVar.d("config is empty");
            cVar.a(c.i);
            return cVar;
        }
        cVar.d("bid token exception");
        cVar.a(c.i);
        return cVar;
    }

    private List<Map<Integer, String>> b(List<Map<Integer, String>> list, int i, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Map<Integer, String> map = list.get(i2);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue(), i, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public void a(JSONArray jSONArray) {
        this.b = jSONArray;
    }

    public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, int i, String str2, int i2, double d) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        CampaignEx campaignEx = list.get(i3);
                        campaignEx.setReadyState(0);
                        if (cVar != null) {
                            campaignEx.setNLRid(cVar.t());
                        }
                        campaignEx.setNRid(str);
                        campaignEx.setReasond(str2);
                        campaignEx.setTyped(i);
                        String b2 = k0.b(d + "");
                        campaignEx.setNoticeUrl(a(campaignEx.getNoticeUrl(), i2, str, b2));
                        campaignEx.setClickURL(a(campaignEx.getClickURL(), i2, str, b2));
                        campaignEx.setImpressionURL(a(campaignEx.getImpressionURL(), i2, str, b2));
                        campaignEx.setOnlyImpressionURL(a(campaignEx.getOnlyImpressionURL(), i2, str, b2));
                        campaignEx.setAdvImp(a(campaignEx.getAdvImpList(), i2, str, b2));
                        j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.d(a(nativeVideoTracking.i(), i2, str, b2));
                            nativeVideoTracking.c(a(nativeVideoTracking.h(), i2, str, b2));
                            nativeVideoTracking.k(a(nativeVideoTracking.p(), i2, str, b2));
                            nativeVideoTracking.s(a(nativeVideoTracking.y(), i2, str, b2));
                            nativeVideoTracking.a(a(nativeVideoTracking.d(), i2, str, b2));
                            nativeVideoTracking.b(a(nativeVideoTracking.g(), i2, str, b2));
                            nativeVideoTracking.e(a(nativeVideoTracking.j(), i2, str, b2));
                            nativeVideoTracking.t(a(nativeVideoTracking.z(), i2, str, b2));
                            nativeVideoTracking.u(a(nativeVideoTracking.z(), i2, str, b2));
                            nativeVideoTracking.v(a(nativeVideoTracking.B(), i2, str, b2));
                            nativeVideoTracking.f(a(nativeVideoTracking.k(), i2, str, b2));
                            nativeVideoTracking.g(a(nativeVideoTracking.l(), i2, str, b2));
                            nativeVideoTracking.h(a(nativeVideoTracking.m(), i2, str, b2));
                            nativeVideoTracking.i(a(nativeVideoTracking.n(), i2, str, b2));
                            nativeVideoTracking.j(a(nativeVideoTracking.o(), i2, str, b2));
                            nativeVideoTracking.l(a(nativeVideoTracking.q(), i2, str, b2));
                            nativeVideoTracking.q(a(nativeVideoTracking.w(), i2, str, b2));
                            nativeVideoTracking.m(a(nativeVideoTracking.r(), i2, str, b2));
                            nativeVideoTracking.r(a(nativeVideoTracking.x(), i2, str, b2));
                            nativeVideoTracking.n(a(nativeVideoTracking.s(), i2, str, b2));
                            nativeVideoTracking.a(b(nativeVideoTracking.t(), i2, str, b2));
                            nativeVideoTracking.p(a(nativeVideoTracking.v(), i2, str, b2));
                            nativeVideoTracking.o(a(nativeVideoTracking.u(), i2, str, b2));
                            campaignEx.setNativeVideoTracking(nativeVideoTracking);
                            campaignEx.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignEx.setPv_urls(a(campaignEx.getPv_urls(), i2, str, b2));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public c a() {
        c cVar = new c();
        try {
            JSONArray jSONArray = this.b;
            if (jSONArray != null && jSONArray.length() != 0) {
                if (this.a == null) {
                    cVar.d("db error");
                    cVar.a(c.k);
                }
                return cVar;
            }
            cVar.d("setting config is null");
            cVar.a(c.i);
            return cVar;
        } catch (Exception unused) {
            cVar.d("checkConfigAndDB exception");
            cVar.a(c.k);
            return cVar;
        }
    }

    public List<com.mbridge.msdk.foundation.cache.b> a(int i, long j) {
        if (i >= 0) {
            a(i);
        }
        com.mbridge.msdk.foundation.db.c cVar = this.a;
        if (cVar != null) {
            return cVar.a(this.d, j);
        }
        return null;
    }

    public void a(List<b> list, int i) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list, new C0263a());
                    int size = list.size() - i;
                    if (size > 0) {
                        List<b> subList = list.subList(0, size);
                        if (this.a == null || subList.size() <= 0) {
                            return;
                        }
                        for (int i2 = 0; i2 < subList.size(); i2++) {
                            com.mbridge.msdk.foundation.cache.b bVar = subList.get(i2).a;
                            this.a.a(this.d, bVar.e(), bVar.d());
                            a(f, 1, null, true, bVar.e(), bVar.d(), -1, this.d);
                        }
                    }
                }
            } catch (Exception e2) {
                q0.a(e, e2);
            }
        }
    }

    private String a(String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (c1.c(str) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&ca_sce=");
            sb.append(i);
            sb.append("&real_rid=");
            sb.append(str2);
            return i5s.a(sb, "&real_bp=", str3);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("?ca_sce=");
        sb2.append(i);
        sb2.append("&real_rid=");
        sb2.append(str2);
        return i5s.a(sb2, "&real_bp=", str3);
    }

    private String a(Map<Integer, String> map, int i, String str, String str2) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", a(value, i, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    private String[] a(String[] strArr, int i, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr2[i2] = a(strArr[i2], i, str, str2);
        }
        return strArr2;
    }

    private List<String> a(List<String> list, int i, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(a(list.get(i2), i, str, str2));
        }
        return arrayList;
    }

    public long a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return 0L;
        }
        String ecppv = list.get(0).getEcppv();
        if (TextUtils.isEmpty(ecppv)) {
            return 0L;
        }
        String a = k0.a(ecppv);
        if (TextUtils.isEmpty(a)) {
            return 0L;
        }
        try {
            if (Double.parseDouble(a) <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                return 0L;
            }
            JSONObject c = c(d(str));
            int optInt = c != null ? c.optInt("max_cache_num", 20) : 20;
            com.mbridge.msdk.foundation.db.c cVar = this.a;
            if (cVar == null || optInt <= 0) {
                return -1L;
            }
            return cVar.a(list, this.d);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1L;
        }
    }

    public void a(String str, String str2, int i, String str3) {
        try {
            if (this.a != null && !TextUtils.isEmpty(str3)) {
                if (i == 1) {
                    this.a.a(str2, str, this.d, i);
                    a(f, 3, null, true, str2, str, -1, this.d);
                } else if (i == 2) {
                    this.a.a(this.d, str2, str);
                    a(f, 1, null, true, str2, str, -1, this.d);
                } else {
                    if (i != 3) {
                        return;
                    }
                    this.a.b(str2, str, this.d);
                    a(f, 4, null, true, str2, str, -1, this.d);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0188 A[Catch: Exception -> 0x002c, TryCatch #1 {Exception -> 0x002c, blocks: (B:3:0x0011, B:6:0x0031, B:8:0x0069, B:11:0x0079, B:13:0x007f, B:17:0x0086, B:19:0x0091, B:22:0x0098, B:24:0x009e, B:26:0x00a6, B:28:0x0104, B:32:0x0108, B:36:0x0113, B:39:0x0119, B:42:0x011f, B:44:0x012d, B:46:0x0131, B:48:0x0140, B:50:0x0146, B:52:0x014e, B:54:0x0169, B:57:0x016c, B:59:0x0180, B:61:0x0188, B:62:0x018d, B:69:0x0178), top: B:2:0x0011, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i, int i2, List<CampaignEx> list, boolean z, String str, String str2, int i3, String str3) {
        String str4;
        String str5;
        com.mbridge.msdk.foundation.db.c cVar;
        JSONArray jSONArray;
        e eVar = new e();
        try {
            eVar.a("type", i2 + "");
            eVar.a("result", z ? "1" : "2");
            eVar.a("max_usage_limit", i3 + "");
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str3 + "");
            eVar.a("scene", "db");
            JSONObject jSONObject = this.c;
            if (jSONObject != null) {
                eVar.a("config", jSONObject.toString());
            }
            if (i2 == 1 && TextUtils.isEmpty(str2) && (cVar = this.a) != null) {
                try {
                    List<com.mbridge.msdk.foundation.cache.b> a = cVar.a(str3, -1, -1L);
                    JSONArray jSONArray2 = new JSONArray();
                    if (a != null && a.size() > 0) {
                        int i4 = 0;
                        while (i4 < a.size()) {
                            com.mbridge.msdk.foundation.cache.b bVar = a.get(i4);
                            if (bVar != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("rid", bVar.e());
                                jSONObject2.put("ts", bVar.h());
                                jSONObject2.put("lrid", bVar.d());
                                jSONObject2.put("ecppv", k0.b(bVar.b() + ""));
                                jSONObject2.put("state", bVar.g());
                                jSONObject2.put("showCount", bVar.f());
                                jSONObject2.put("interval_ts", bVar.c());
                                jSONArray = jSONArray2;
                                jSONArray.put(jSONObject2);
                            } else {
                                jSONArray = jSONArray2;
                            }
                            i4++;
                            jSONArray2 = jSONArray;
                        }
                    }
                    eVar.a("cache", jSONArray2.toString());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = null;
            if (list == null || list.size() <= 0) {
                str4 = str;
                str5 = str2;
            } else {
                try {
                    JSONArray jSONArray3 = new JSONArray();
                    CampaignEx campaignEx = list.get(0);
                    if (campaignEx != null) {
                        str5 = campaignEx.getCurrentLocalRid();
                        try {
                            cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(str5);
                        } catch (JSONException e3) {
                            e = e3;
                            e.printStackTrace();
                            str4 = str;
                            eVar.a("rid", str4);
                            eVar.a("lrid", str5);
                            if (cVar2 == null) {
                            }
                            cVar2.n(str3);
                            cVar2.a("m_candidate_db", eVar);
                            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_candidate_db", cVar2);
                        }
                    } else {
                        str5 = str2;
                    }
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        CampaignEx campaignEx2 = list.get(i5);
                        if (campaignEx2 != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("rid", campaignEx2.getRequestId());
                            jSONObject3.put("rid_n", campaignEx2.getRequestIdNotice());
                            jSONArray3.put(jSONObject3);
                        }
                    }
                    eVar.a("c_info", jSONArray3.toString());
                } catch (JSONException e4) {
                    e = e4;
                    str5 = str2;
                }
                str4 = str;
            }
            eVar.a("rid", str4);
            eVar.a("lrid", str5);
            if (cVar2 == null) {
                cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar2.n(str3);
            cVar2.a("m_candidate_db", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_candidate_db", cVar2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
