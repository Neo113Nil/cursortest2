package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jr {
    private final int pcc;
    private final int sf;

    public jr(JSONObject jSONObject) {
        this.pcc = jSONObject.optInt("auto_click", 0);
        this.sf = jSONObject.optInt("hidden_bar", 0);
    }

    public static boolean pcc(of ofVar) {
        if (ofVar == null || !ofVar.on() || ofVar.mbt() == null) {
            return false;
        }
        return ofVar.mbt().sf();
    }

    public boolean sf() {
        return this.sf == 1;
    }

    public int pcc() {
        return this.pcc;
    }
}
