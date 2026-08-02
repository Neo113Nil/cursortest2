package com.bytedance.sdk.openadsdk.tmg.pcc;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj extends com.bytedance.sdk.component.pcc.oo<JSONObject, JSONObject> {
    private JSONObject pcc;

    public vj(JSONObject jSONObject) {
        this.pcc = jSONObject;
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, JSONObject jSONObject) {
        jrVar.pcc("getData", new vj(jSONObject));
    }

    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(this.pcc, jSONObject);
    }
}
