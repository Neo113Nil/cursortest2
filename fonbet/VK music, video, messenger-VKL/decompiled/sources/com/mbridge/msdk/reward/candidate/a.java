package com.mbridge.msdk.reward.candidate;

import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.foundation.cache.a;
import com.mbridge.msdk.foundation.cache.d;
import com.mbridge.msdk.foundation.controller.b;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: RewardCandidateController.java */
/* loaded from: classes14.dex */
public class a {
    private d a;

    public a(String str, boolean z) {
        try {
            this.a = b.a().b(str, com.mbridge.msdk.videocommon.setting.b.b().a(c.n().b(), str, z).B());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(List<CampaignEx> list, String str, com.mbridge.msdk.reward.adapter.c cVar, String str2) {
        try {
            if (this.a == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.a.a(com.mbridge.msdk.foundation.cache.a.f, 2, list, this.a.a(list, str) > 0, "", "", -1, str2);
            d dVar = this.a;
            JSONObject c = dVar.c(dVar.d(str));
            if (c == null || this.a.b(str) <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                return;
            }
            a(this.a.a(c.optInt("max_usage_limit", 10), 0L), c, c.optInt("max_cache_num", 20), -1.0d, cVar, new com.mbridge.msdk.foundation.same.report.metrics.c(), str, false, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public com.mbridge.msdk.foundation.cache.c a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, CampaignEx campaignEx, com.mbridge.msdk.foundation.error.b bVar, int i, com.mbridge.msdk.reward.adapter.c cVar2) {
        String requestId;
        com.mbridge.msdk.foundation.cache.c cVar3 = new com.mbridge.msdk.foundation.cache.c();
        if (campaignEx == null) {
            requestId = "";
        } else {
            try {
                try {
                    requestId = campaignEx.getRequestId();
                } catch (Exception unused) {
                    cVar3.d("getRewardCandidateCampaignList result exception");
                    cVar3.a(com.mbridge.msdk.foundation.cache.c.k);
                    return cVar3;
                }
            } catch (Exception unused2) {
                cVar3.d("getCandidateCampaignList result exception");
                cVar3.a(com.mbridge.msdk.foundation.cache.c.k);
                return cVar3;
            }
        }
        return a(str, cVar, requestId, bVar, i, cVar2);
    }

    private com.mbridge.msdk.foundation.cache.c a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str2, com.mbridge.msdk.foundation.error.b bVar, int i, com.mbridge.msdk.reward.adapter.c cVar2) {
        String str3;
        int i2;
        String str4;
        if (bVar != null) {
            int h = bVar.h();
            str3 = bVar.l();
            i2 = h;
        } else {
            str3 = null;
            i2 = 0;
        }
        String str5 = str3;
        d dVar = this.a;
        if (dVar == null) {
            com.mbridge.msdk.foundation.cache.c cVar3 = new com.mbridge.msdk.foundation.cache.c();
            cVar3.d("can not get manager");
            cVar3.a(com.mbridge.msdk.foundation.cache.c.k);
            return cVar3;
        }
        com.mbridge.msdk.foundation.cache.c a = dVar.a(str);
        if (a.g() > com.mbridge.msdk.foundation.cache.c.j) {
            return a;
        }
        String[] split = k0.a(str.split(BundleUtil.UNDERLINE_TAG)[3]).split("\\|");
        double parseDouble = Double.parseDouble(split[0]);
        if (split.length > 1) {
            str4 = split[1];
        } else {
            str4 = "";
        }
        com.mbridge.msdk.foundation.cache.c a2 = a(parseDouble, str4, cVar2, cVar, str, i);
        this.a.a(a2.c(), cVar, str2, i2, str5, i, parseDouble);
        return a2;
    }

    private com.mbridge.msdk.foundation.cache.c a(double d, String str, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar2, String str2, int i) {
        com.mbridge.msdk.foundation.cache.c a = this.a.a();
        try {
            if (a.g() > 0) {
                return a;
            }
            JSONObject c = this.a.c(str);
            try {
                if (c != null) {
                    int optInt = c.optInt("max_usage_limit", 10);
                    int optInt2 = c.optInt("max_cache_num", 20);
                    if (optInt2 > 0) {
                        long j = 8640000;
                        long optLong = c.optLong("show_interval_time", 8640000L);
                        if (optLong != 0) {
                            j = optLong;
                        }
                        List<com.mbridge.msdk.foundation.cache.b> a2 = this.a.a(optInt, System.currentTimeMillis() - (j * 1000));
                        if (a2 != null && a2.size() > 0) {
                            return a(a2, c, optInt2, d, cVar, cVar2, str2, true, i);
                        }
                        a.d("no cache");
                        a.a(com.mbridge.msdk.foundation.cache.c.k);
                        a(cVar2, str2, a, (List<a.b>) null, c, 2);
                        return a;
                    }
                    a.d("max cache num error");
                    a.a(com.mbridge.msdk.foundation.cache.c.k);
                    return a;
                }
                a.d("setting config not mapping");
                a.a(com.mbridge.msdk.foundation.cache.c.k);
                return a;
            } catch (Exception unused) {
                a.d("getHighestCampaigns exception");
                a.a(com.mbridge.msdk.foundation.cache.c.k);
                return a;
            }
        } catch (Exception unused2) {
        }
    }

    private com.mbridge.msdk.foundation.cache.c a(List<com.mbridge.msdk.foundation.cache.b> list, JSONObject jSONObject, int i, double d, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar2, String str, boolean z, int i2) {
        List<com.mbridge.msdk.foundation.cache.b> list2;
        int i3;
        int i4;
        List<com.mbridge.msdk.foundation.cache.b> list3 = list;
        com.mbridge.msdk.foundation.cache.c cVar3 = new com.mbridge.msdk.foundation.cache.c();
        if (jSONObject == null) {
            cVar3.d("config is null");
            cVar3.a(com.mbridge.msdk.foundation.cache.c.k);
            return cVar3;
        }
        if (list3 != null && list3.size() != 0) {
            for (int i5 = 0; i5 < list3.size(); i5++) {
                com.mbridge.msdk.foundation.cache.b bVar = list3.get(i5);
                if (bVar != null) {
                    cVar3.a(bVar.e());
                }
            }
            if (list3.size() > 0 && ((list3 = a(list3, cVar3)) == null || list3.size() == 0)) {
                cVar3.d("existed");
                cVar3.a(com.mbridge.msdk.foundation.cache.c.k);
            }
            if (list3.size() > 0 && ((list3 = a(list3, cVar, cVar3)) == null || list3.size() == 0)) {
                cVar3.d("not ready");
                cVar3.a(com.mbridge.msdk.foundation.cache.c.k);
            }
            ArrayList arrayList = null;
            if (list3 != null && list3.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                double optDouble = jSONObject.optDouble("t_disc", 0.8d);
                double optDouble2 = jSONObject.optDouble("u_disc", 0.95d);
                double optDouble3 = jSONObject.optDouble("max_ecppv_diff", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                int optInt = jSONObject.optInt("time_interval", 1800);
                int size = list3.size();
                double d2 = 0.0d;
                com.mbridge.msdk.foundation.cache.b bVar2 = null;
                int i6 = 0;
                while (i6 < size) {
                    com.mbridge.msdk.foundation.cache.b bVar3 = list3.get(i6);
                    if (bVar3 != null) {
                        i4 = i6;
                        list2 = list3;
                        i3 = optInt;
                        double pow = Math.pow(optDouble2, bVar3.f()) * Math.pow(optDouble, (System.currentTimeMillis() - bVar3.h()) / (optInt * 1000.0d)) * bVar3.b();
                        arrayList2.add(new a.b(pow, bVar3));
                        if (pow >= d - optDouble3 && pow > d2) {
                            d2 = pow;
                            bVar2 = bVar3;
                        }
                    } else {
                        list2 = list3;
                        i3 = optInt;
                        i4 = i6;
                    }
                    i6 = i4 + 1;
                    list3 = list2;
                    optInt = i3;
                }
                d dVar = this.a;
                if (dVar != null) {
                    dVar.a(arrayList2, i);
                }
                if (bVar2 != null) {
                    cVar3.a(bVar2.a());
                    cVar3.a(com.mbridge.msdk.foundation.cache.c.l);
                } else {
                    cVar3.d("no match campaign");
                    cVar3.a(com.mbridge.msdk.foundation.cache.c.k);
                }
                arrayList = arrayList2;
            }
            if (z) {
                a(cVar2, str, cVar3, arrayList, jSONObject, 2);
            }
            return cVar3;
        }
        cVar3.d("candidate is null");
        cVar3.a(com.mbridge.msdk.foundation.cache.c.k);
        return cVar3;
    }

    private List<com.mbridge.msdk.foundation.cache.b> a(List<com.mbridge.msdk.foundation.cache.b> list, com.mbridge.msdk.foundation.cache.c cVar) {
        CopyOnWriteArrayList<CampaignEx> a;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.foundation.cache.b bVar = list.get(i);
            if (bVar != null && (a = bVar.a()) != null && a.size() != 0) {
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 >= a.size()) {
                        break;
                    }
                    CampaignEx campaignEx = a.get(i2);
                    boolean c = v0.c(c.n().d(), campaignEx.getPackageName());
                    if (c) {
                        cVar.b(bVar.e());
                        d dVar = this.a;
                        if (dVar != null) {
                            dVar.a(bVar.d(), bVar.e(), 2, campaignEx.getEcppv());
                        }
                        z = c;
                    } else {
                        i2++;
                        z = c;
                    }
                }
                if (!z) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    private List<com.mbridge.msdk.foundation.cache.b> a(List<com.mbridge.msdk.foundation.cache.b> list, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.cache.c cVar2) {
        CopyOnWriteArrayList<CampaignEx> a;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.foundation.cache.b bVar = list.get(i);
            if (bVar != null && (a = bVar.a()) != null && a.size() != 0) {
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 >= a.size()) {
                        break;
                    }
                    CampaignEx campaignEx = a.get(i2);
                    if (cVar == null || (z = cVar.a(a, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())))) {
                        i2++;
                    } else {
                        cVar2.c(bVar.e());
                        d dVar = this.a;
                        if (dVar != null) {
                            dVar.a(bVar.d(), bVar.e(), 2, campaignEx.getEcppv());
                        }
                    }
                }
                if (z) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public boolean a(String str) {
        JSONObject c;
        try {
            d dVar = this.a;
            if (dVar != null && (c = dVar.c(dVar.d(str))) != null) {
                return c.optInt("c_cb", 0) == 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void a(String str, String str2, int i, String str3) {
        d dVar = this.a;
        if (dVar != null) {
            dVar.a(str, str2, i, str3);
        }
    }

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, com.mbridge.msdk.foundation.cache.c cVar2, List<a.b> list, JSONObject jSONObject, int i) {
        String str2;
        try {
            e eVar = new e();
            if (i == 1) {
                str2 = "cb";
            } else if (i == 2) {
                str2 = "candidate";
            } else if (i != 3) {
                str2 = "unknown";
            } else {
                str2 = "track";
            }
            eVar.a("scene", str2);
            d dVar = this.a;
            if (dVar != null) {
                double b = dVar.b(str);
                if (b >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    eVar.a("bp", k0.b(b + ""));
                }
                eVar.a("cb_state", a(str) ? "open" : CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                try {
                    d dVar2 = this.a;
                    JSONObject c = dVar2.c(dVar2.d(str));
                    if (c != null) {
                        eVar.a("config", c.toString());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (cVar2 != null) {
                if (cVar2.g() == com.mbridge.msdk.foundation.cache.c.l) {
                    eVar.a("result", 1);
                } else {
                    eVar.a("result", 2);
                    eVar.a("reason", cVar2.e());
                }
                eVar.a("acr", cVar2.a());
                eVar.a("her", cVar2.d());
                eVar.a("nrr", cVar2.f());
                eVar.a("cer", cVar2.b());
            } else {
                eVar.a("result", 2);
                eVar.a("reason", "candidate result is null");
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    com.mbridge.msdk.foundation.cache.b a = list.get(i2).a();
                    if (a != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ecppv", k0.b(a.b() + ""));
                        jSONObject2.put("showCount", a.f());
                        jSONObject2.put("intervalTime", System.currentTimeMillis() - a.h());
                        jSONArray.put(jSONObject2);
                    }
                }
                eVar.a("data", jSONArray.toString());
            }
            if (cVar != null) {
                cVar.j("m_candidate_data");
                cVar.e("m_candidate_data");
                cVar.a("m_candidate_data", eVar);
                if (cVar2 != null && cVar2.c() != null) {
                    cVar.b(cVar2.c());
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().b("m_candidate_data", cVar, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
