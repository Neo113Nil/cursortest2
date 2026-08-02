package com.bytedance.sdk.openadsdk.tmg.pcc;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.pcc.gm;
import com.bytedance.sdk.openadsdk.core.mu;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends com.bytedance.sdk.component.pcc.gm<JSONObject, JSONObject> {
    private final WeakReference<mu> pcc;

    public pcc(mu muVar) {
        this.pcc = new WeakReference<>(muVar);
    }

    @Override // com.bytedance.sdk.component.pcc.gm
    public void pcc(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        mu muVar = this.pcc.get();
        if (muVar == null) {
            gm();
        } else {
            muVar.pcc(jSONObject, new com.bytedance.sdk.openadsdk.hc.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.pcc.2
                @Override // com.bytedance.sdk.openadsdk.hc.oo
                public void pcc(boolean z, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z) {
                            pcc.this.pcc((pcc) jSONObject2);
                        } else {
                            jSONObject2.put("creatives", mu.pcc(pccVar));
                            pcc.this.pcc((pcc) jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, final mu muVar) {
        jrVar.pcc("getNetworkData", new gm.sf() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.pcc.1
            @Override // com.bytedance.sdk.component.pcc.gm.sf
            public com.bytedance.sdk.component.pcc.gm pcc() {
                return new pcc(mu.this);
            }
        });
    }
}
