package com.bytedance.sdk.openadsdk.core.hc.wh.pcc;

import com.bytedance.sdk.openadsdk.core.model.of;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class sf {
    protected of pcc;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public static sf pcc(of ofVar, com.bytedance.sdk.openadsdk.core.hc.wh.pcc pccVar) {
            if (ofVar == null) {
                return null;
            }
            int tqg = ofVar.tqg();
            if (tqg == 1) {
                return new com.bytedance.sdk.openadsdk.core.hc.wh.pcc.pcc(ofVar, pccVar);
            }
            if (tqg == 3) {
                return new oo(ofVar, pccVar);
            }
            if (tqg == 7 || tqg == 8) {
                return new vj(ofVar, pccVar);
            }
            return null;
        }
    }

    public sf(of ofVar) {
        this.pcc = ofVar;
    }

    public abstract String pcc();

    public abstract JSONObject sf();

    public void pcc(JSONObject jSONObject) {
    }
}
