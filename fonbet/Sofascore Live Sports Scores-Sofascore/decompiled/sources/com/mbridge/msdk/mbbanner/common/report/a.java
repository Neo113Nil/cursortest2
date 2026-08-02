package com.mbridge.msdk.mbbanner.common.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.metrics.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private static void a(c cVar, e eVar) {
        List<CampaignEx> o;
        try {
            String B = cVar.B();
            if (TextUtils.isEmpty(B) && (o = cVar.o()) != null && !o.isEmpty() && o.get(0) != null) {
                B = o.get(0).getCampaignUnitId();
                cVar.a(o.get(0).getAdType());
                cVar.n(B);
            }
            m d = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), B);
            if (d != null) {
                if (eVar == null) {
                    eVar = new e();
                }
                eVar.a("us_rid", d.I());
                HashMap<String, String> hashMap = com.mbridge.msdk.foundation.controller.a.r;
                if (hashMap == null) {
                    eVar.a("u_stid", d.a());
                    return;
                }
                String str = hashMap.get(B);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                eVar.a("u_stid", str);
            }
        } catch (Exception e) {
            q0.b("BannerReport", e.getMessage());
        }
    }

    public static String b(String str) {
        String md5 = SameMD5.getMD5(v0.d());
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("_");
                if (split.length < 3) {
                    return "";
                }
                String str2 = split[2];
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
            return md5;
        } catch (Exception e) {
            q0.b("BannerReport", e.getMessage());
            return "";
        }
    }

    public static void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                String b = com.mbridge.msdk.mbsignalcommon.mraid.c.b(campaignEx.getId());
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                new h(com.mbridge.msdk.foundation.controller.c.n().d()).b(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, b, campaignEx.isBidCampaign());
                com.mbridge.msdk.mbsignalcommon.mraid.c.a(campaignEx.getId());
            } catch (Throwable th) {
                q0.b("BannerReport", th.getMessage());
            }
        }
    }

    public static void a(String str, CampaignEx campaignEx, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put(U3.i.W, "2000070");
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, str2);
            jSONObject.put("network_type", String.valueOf(m0.s(com.mbridge.msdk.foundation.controller.c.n().d())));
            d.b().a(jSONObject);
        } catch (Exception e) {
            q0.b("BannerReport", e.getMessage());
        }
    }

    public static void a(String str, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(U3.i.W, "2000067");
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
                HashMap<String, String> hashMap = com.mbridge.msdk.foundation.controller.a.r;
                if (hashMap != null) {
                    String str2 = hashMap.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("u_stid", str2);
                    }
                }
                d.b().a(jSONObject);
            } catch (Throwable th) {
                q0.b("BannerReport", th.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().i() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().i(), false, false);
    }

    public static void a(String str, c cVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            d.b().a(str, cVar, campaignEx, context, aVar);
        } catch (Exception e) {
            q0.b("BannerReport", e.getMessage());
        }
    }

    public static c a(String str, String str2) {
        c cVar = new c();
        try {
            LinkedHashMap<String, c> c = d.b().c();
            if (c != null && !c.isEmpty()) {
                Iterator<Map.Entry<String, c>> it = c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, c> next = it.next();
                    if (next != null && next.getValue().E()) {
                        it.remove();
                    }
                }
            }
            cVar = d.b().b(str2);
            if (cVar == null) {
                c cVar2 = new c();
                try {
                    d.b().c().put(str2, cVar2);
                    cVar2.d(true);
                    cVar = cVar2;
                } catch (Exception e) {
                    e = e;
                    cVar = cVar2;
                    q0.b("BannerReport", e.getMessage());
                    return cVar;
                }
            }
            cVar.a(296);
            cVar.i(str2);
            cVar.n(str);
            return cVar;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static void a(String str, c cVar, e eVar) {
        try {
            a(cVar, eVar);
            if (eVar != null) {
                cVar.a(str, eVar);
            }
            d.b().b(str, cVar, null);
        } catch (Exception e) {
            q0.b("BannerReport", e.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx, String str, String str2) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                new h(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, str2, campaignEx.isBidCampaign());
            } catch (Exception e) {
                q0.b("BannerReport", e.getMessage());
            }
        }
    }

    public static void a(String str) {
        LinkedHashMap<String, c> c;
        try {
            if (TextUtils.isEmpty(str) || (c = d.b().c()) == null || c.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, c>> it = c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, c> next = it.next();
                if (next != null) {
                    c value = next.getValue();
                    if (value.E()) {
                        it.remove();
                    }
                    if (value.B().equals(str)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            q0.b("BannerReport", th.getMessage());
        }
    }
}
