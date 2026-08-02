package com.bytedance.sdk.openadsdk.core.vy;

import com.bytedance.sdk.component.qf.sf.oo;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.of;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    public static void pcc(String str, long j) {
        JSONObject sf = sf(str, j);
        oo sf2 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
        sf2.gm(kun.oo("/api/ad/union/sdk/stats/"));
        sf2.vj(sf.toString());
        sf2.pcc(6);
        sf2.sf("uploadFrequentEvent");
        sf2.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.vy.gm.1
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                iOException.getMessage();
                if (gmVar != null) {
                    of.pcc(gmVar.wh());
                }
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
            }
        });
    }

    private static JSONObject sf(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
