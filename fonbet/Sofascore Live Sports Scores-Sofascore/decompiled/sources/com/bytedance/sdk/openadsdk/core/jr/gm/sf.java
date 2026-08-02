package com.bytedance.sdk.openadsdk.core.jr.gm;

import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static void pcc(of ofVar, long j, long j2) {
        if (ofVar != null) {
            if (atb.gm(ofVar) || atb.sf(ofVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j);
                    jSONObject.put("unzip_success_time", j2);
                } catch (JSONException e) {
                    lo.pcc("PlayableEvent", "onSuccess json error", e);
                }
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void pcc(of ofVar) {
        if (atb.sf(ofVar)) {
            com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void pcc(of ofVar, int i, String str) {
        if (ofVar != null) {
            if (atb.gm(ofVar) || atb.sf(ofVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e) {
                    lo.pcc("PlayableEvent", "onFail json error", e);
                }
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
