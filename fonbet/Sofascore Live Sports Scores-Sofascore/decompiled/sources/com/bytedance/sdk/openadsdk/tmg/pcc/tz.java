package com.bytedance.sdk.openadsdk.tmg.pcc;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.nn;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tz extends com.bytedance.sdk.component.pcc.lu<JSONObject, JSONObject> {
    public static final HashSet<String> pcc = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));
    private mu gm;
    private of oo;
    private com.bytedance.sdk.component.vy.qf sf;

    public tz(com.bytedance.sdk.component.vy.qf qfVar, mu muVar, of ofVar) {
        this.sf = qfVar;
        this.gm = muVar;
        this.oo = ofVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        str.getClass();
        switch (str) {
            case "getCurrentVisibleState":
                of ofVar = this.oo;
                if (ofVar != null) {
                    jSONObject2.put("visibleState", !nn.pcc(this.sf, 20, ofVar.tqg(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.tz.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tz.this.sf != null) {
                            tz.this.sf.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) tz.this.sf.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(tz.this.sf);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.sf == null) {
                    jSONObject2.put("success", false);
                    return jSONObject2;
                }
                jSONObject2.put("success", true);
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.tz.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tz.this.sf != null) {
                            tz.this.sf.setVisibility(0);
                        }
                    }
                });
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, com.bytedance.sdk.component.vy.qf qfVar, mu muVar, of ofVar) {
        jrVar.pcc(pcc, new tz(qfVar, muVar, ofVar));
    }
}
