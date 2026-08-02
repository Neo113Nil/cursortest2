package com.bytedance.sdk.openadsdk.core.ork;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.of;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tmg {
    public static void pcc(String str, int i, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.vy.pcc(i);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            of.pcc kx = ofVar.kx();
            if (kx != null) {
                jSONObject.put("tpl_id", kx.oo());
                if ("Web".equals(str)) {
                    if (kx.tmg()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (ofVar.uae() != null) {
                jSONObject.put("tpl_id", ofVar.uae().pcc());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.dax.oo.pcc().pcc(com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc(pcc(str3)).gm(str4).vj(ofVar != null ? ofVar.qxv() : "").sf(i).sf(jSONObject.toString()).wh(str2));
    }

    private static int pcc(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }
}
