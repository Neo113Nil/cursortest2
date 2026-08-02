package com.bytedance.sdk.openadsdk.qy.sf;

import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    public static void pcc(final of ofVar, final pcc pccVar, final vj.pcc pccVar2) {
        ofVar.gl();
        rnn.sf(new com.bytedance.sdk.component.kj.sf.gm("mrc_report") { // from class: com.bytedance.sdk.openadsdk.qy.sf.oo.1
            @Override // java.lang.Runnable
            public void run() {
                if (ofVar.iwd()) {
                    boolean nmd = ofVar.nmd();
                    of ofVar2 = ofVar;
                    if (nmd) {
                        com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(ofVar2.eko(), new gm.sf("show_urls", ofVar));
                    } else {
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar2);
                    }
                }
                String pcc = kun.pcc(ofVar);
                final JSONObject jSONObject = new JSONObject();
                pcc pccVar3 = pccVar;
                JSONObject jSONObject2 = null;
                if (pccVar3 != null) {
                    try {
                        jSONObject.put("root_view", pcc.pcc(pccVar3));
                        vj.pcc pccVar4 = pccVar2;
                        if (pccVar4 != null) {
                            int i = pccVar4.pcc;
                            if (i != -1) {
                                jSONObject.put("dynamic_show_type", i);
                            }
                            int i2 = pccVar2.sf;
                            if (i2 != -1) {
                                jSONObject2 = com.bytedance.sdk.openadsdk.oo.gm.pcc(i2 + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                final JSONObject jSONObject3 = jSONObject2;
                com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, pcc, "mrc_show", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.qy.sf.oo.1.1
                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject gm() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject pcc() {
                        return jSONObject3;
                    }
                });
            }
        });
    }
}
