package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class i {
    public static void a(Context context, int i, int i2, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(U3.i.W, "2000058");
            jSONObject.put("appid", com.mbridge.msdk.foundation.controller.c.n().b());
            jSONObject.put("dl_type", String.valueOf(i));
            jSONObject.put("dl_link_type", String.valueOf(i2));
            jSONObject.put("rid", str);
            jSONObject.put("rid_n", str2);
            jSONObject.put(BidResponsedEx.KEY_CID, str3);
            jSONObject.put("tgt_v", m0.x(context));
            jSONObject.put("app_v_n", m0.C(context));
            jSONObject.put("app_v_c", m0.B(context));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("ReportControllerDiff", e.getMessage());
            }
        }
    }
}
