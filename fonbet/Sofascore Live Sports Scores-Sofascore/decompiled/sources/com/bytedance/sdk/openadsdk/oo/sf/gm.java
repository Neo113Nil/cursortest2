package com.bytedance.sdk.openadsdk.oo.sf;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements sf {
    sf pcc;

    @Override // com.bytedance.sdk.openadsdk.oo.sf.sf
    public void pcc(JSONObject jSONObject, long j) throws JSONException {
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.pcc(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
