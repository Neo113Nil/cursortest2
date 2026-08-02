package com.bytedance.sdk.openadsdk.tmg.pcc;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc extends com.bytedance.sdk.component.pcc.oo<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.vy.qf> pcc;

    public hc(com.bytedance.sdk.component.vy.qf qfVar) {
        this.pcc = new WeakReference<>(qfVar);
    }

    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean optBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.vy.qf qfVar = this.pcc.get();
            if (qfVar == null) {
                jSONObject2.put("success", false);
                return jSONObject2;
            }
            qfVar.setIsPreventTouchEvent(optBoolean);
            jSONObject2.put("success", true);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, com.bytedance.sdk.component.vy.qf qfVar) {
        jrVar.pcc("preventTouchEvent", new hc(qfVar));
    }
}
