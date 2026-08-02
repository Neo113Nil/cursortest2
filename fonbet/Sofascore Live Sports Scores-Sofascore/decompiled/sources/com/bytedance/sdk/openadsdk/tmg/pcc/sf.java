package com.bytedance.sdk.openadsdk.tmg.pcc;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.pcc.gm;
import com.bytedance.sdk.openadsdk.core.mu;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends com.bytedance.sdk.component.pcc.gm<JSONObject, JSONObject> {
    private final WeakReference<mu> pcc;

    public sf(mu muVar) {
        this.pcc = new WeakReference<>(muVar);
    }

    @Override // com.bytedance.sdk.component.pcc.gm
    public void pcc(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        com.bytedance.sdk.openadsdk.core.ork.sf().jr();
        mu muVar = this.pcc.get();
        if (muVar == null) {
            gm();
        } else {
            muVar.kj();
        }
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, final mu muVar) {
        jrVar.pcc("interstitial_webview_close", new gm.sf() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.sf.1
            @Override // com.bytedance.sdk.component.pcc.gm.sf
            public com.bytedance.sdk.component.pcc.gm pcc() {
                return new sf(mu.this);
            }
        });
    }
}
