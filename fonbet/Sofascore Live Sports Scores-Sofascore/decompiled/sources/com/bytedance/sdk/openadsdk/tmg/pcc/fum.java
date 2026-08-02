package com.bytedance.sdk.openadsdk.tmg.pcc;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.nn;
import com.bytedance.sdk.openadsdk.utils.rnn;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class fum extends com.bytedance.sdk.component.pcc.oo<JSONObject, JSONObject> {
    private of gm;
    private String oo;
    private com.bytedance.sdk.component.vy.qf pcc;
    private mu sf;

    public fum(com.bytedance.sdk.component.vy.qf qfVar, String str, mu muVar, of ofVar) {
        this.pcc = qfVar;
        this.oo = str;
        this.sf = muVar;
        this.gm = ofVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        String str2 = this.oo;
        str2.getClass();
        switch (str2) {
            case "getCurrentVisibleState":
                of ofVar = this.gm;
                if (ofVar != null) {
                    jSONObject2.put("visibleState", !nn.pcc(this.pcc, 20, ofVar.tqg(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.fum.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (fum.this.pcc != null) {
                            fum.this.pcc.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) fum.this.pcc.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(fum.this.pcc);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.pcc == null) {
                    jSONObject2.put("success", false);
                    return jSONObject2;
                }
                jSONObject2.put("success", true);
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.fum.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (fum.this.pcc != null) {
                            fum.this.pcc.setVisibility(0);
                        }
                    }
                });
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, com.bytedance.sdk.component.vy.qf qfVar, mu muVar, of ofVar) {
        jrVar.pcc("closeWebview", new fum(qfVar, "closeWebview", muVar, ofVar));
        jrVar.pcc("makeVisible", new fum(qfVar, "makeVisible", muVar, ofVar));
        jrVar.pcc("getCurrentVisibleState", new fum(qfVar, "getCurrentVisibleState", muVar, ofVar));
    }
}
