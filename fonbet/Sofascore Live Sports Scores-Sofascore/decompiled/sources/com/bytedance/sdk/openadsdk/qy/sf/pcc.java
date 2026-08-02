package com.bytedance.sdk.openadsdk.qy.sf;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private final float gm;
    private final int pcc;
    private final int sf;

    public pcc(int i, int i2, float f) {
        this.pcc = i;
        this.sf = i2;
        this.gm = f;
    }

    public static JSONObject pcc(pcc pccVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", pccVar.pcc);
        jSONObject.put("height", pccVar.sf);
        jSONObject.put("alpha", pccVar.gm);
        return jSONObject;
    }
}
