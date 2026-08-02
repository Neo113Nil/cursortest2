package com.mbridge.msdk.click.utils;

import android.content.Context;
import android.webkit.URLUtil;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.io.File;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;
    public static int d = 1500;

    public static boolean a(CampaignEx campaignEx, String str, int i) {
        if (campaignEx != null && campaignEx.getTpOffer() == 1) {
            r0 = campaignEx.getFac() != 0;
            b(campaignEx, str, i);
        }
        return r0;
    }

    private static void b(CampaignEx campaignEx, String str, int i) {
        try {
            Context d2 = c.n().d();
            if (d2 == null || campaignEx == null) {
                return;
            }
            if (URLUtil.isFileUrl(str)) {
                File file = new File(str.replace("file:////", "").replace("file:///", "").replace("file://", ""));
                if (file.exists()) {
                    str = o0.e(file);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(U3.i.W, "2000109");
            jSONObject.put("type", i);
            jSONObject.put("html", str);
            jSONObject.put("network_type", m0.s(d2));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put("op", i == 3 ? 2 : 1);
            jSONObject.put(CampaignEx.JSON_KEY_FAC, campaignEx.getFac());
            d.b().a(jSONObject);
        } catch (Throwable th) {
            q0.b("DspFilterUtils", th.getMessage());
        }
    }
}
