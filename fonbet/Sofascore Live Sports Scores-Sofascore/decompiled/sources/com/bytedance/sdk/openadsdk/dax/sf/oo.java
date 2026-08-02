package com.bytedance.sdk.openadsdk.dax.sf;

import com.ironsource.L6;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public final String pcc;
        public final JSONObject sf;

        public pcc(String str, JSONObject jSONObject) {
            this.pcc = str;
            this.sf = jSONObject;
            JSONObject optJSONObject = jSONObject.optJSONObject("device_info");
            if (optJSONObject != null) {
                try {
                    optJSONObject.put(L6.X0, com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
                    jSONObject.put("device_info", optJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static gm pcc() {
        return vj.pcc();
    }
}
