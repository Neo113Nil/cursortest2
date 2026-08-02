package com.mbridge.msdk.mbnative.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.out.Campaign;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    public static void a(Context context, String str, String str2, boolean z, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(U3.i.W, "2000047");
                jSONObject.put("network_type", m0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                jSONObject.put("st", System.currentTimeMillis());
                if (campaignEx != null) {
                    jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                    jSONObject.put("adtp", campaignEx.getAdType());
                    jSONObject.put("rid", campaignEx.getRequestId());
                    jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                }
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = com.mbridge.msdk.foundation.controller.a.r.get(str2);
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("u_stid", str3);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                    jSONObject.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                    jSONObject.put(com.mbridge.msdk.foundation.controller.a.q, com.mbridge.msdk.foundation.same.a.g);
                }
                jSONObject.put(CampaignEx.JSON_KEY_HB, z ? 1 : 0);
                jSONObject.put("reason", str);
                d.b().a(jSONObject);
            } catch (Throwable th) {
                q0.b("NativeReport", th.getMessage());
            }
        }
    }

    public static void a(Context context, List<Campaign> list, String str) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.isEmpty() || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(U3.i.W, "2000048");
            jSONObject.put("st", System.currentTimeMillis());
            CampaignEx campaignEx = (CampaignEx) list.get(0);
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put("network_type", m0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(CampaignEx.JSON_KEY_HB, "1");
            if (v0.c(campaignEx)) {
                jSONObject.put(CampaignEx.JSON_KEY_RETARGET_TYPE, campaignEx.getRtinsType());
            }
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            d.b().a(jSONObject);
        } catch (Throwable th) {
            q0.b("NativeReport", th.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str) {
        Context context2;
        CampaignEx campaignEx2;
        String str2;
        if (campaignEx != null) {
            try {
                if (campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m() == null) {
                    return;
                }
                String[] m = campaignEx.getNativeVideoTracking().m();
                int length = m.length;
                int i = 0;
                while (i < length) {
                    String str3 = m[i];
                    if (TextUtils.isEmpty(str3)) {
                        context2 = context;
                        campaignEx2 = campaignEx;
                        str2 = str;
                    } else {
                        context2 = context;
                        campaignEx2 = campaignEx;
                        str2 = str;
                        com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, str3, false, true);
                    }
                    i++;
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Exception e) {
                q0.b("NativeReport", e.getMessage());
            }
        }
    }

    public static void a(String str, c cVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            d.b().a(str, cVar, campaignEx, context, aVar);
        } catch (Exception e) {
            q0.b("NativeReport", e.getMessage());
        }
    }
}
