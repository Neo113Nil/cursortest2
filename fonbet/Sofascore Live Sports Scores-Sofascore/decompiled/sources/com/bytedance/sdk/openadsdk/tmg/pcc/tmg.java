package com.bytedance.sdk.openadsdk.tmg.pcc;

import com.bytedance.sdk.openadsdk.core.mu;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tmg extends com.bytedance.sdk.component.pcc.lu<JSONObject, JSONObject> {
    private static final HashSet<String> pcc = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));
    private final mu sf;

    public tmg(mu muVar) {
        this.sf = muVar;
    }

    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        str.getClass();
        switch (str) {
            case "popupDismiss":
                this.sf.dax();
                break;
            case "popupShow":
                this.sf.jr();
                break;
            case "popupRenderDidFinish":
                this.sf.lu();
                break;
            case "changeCountdownStatus":
                this.sf.vh(jSONObject);
                break;
        }
        return null;
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, mu muVar) {
        jrVar.pcc(pcc, new tmg(muVar));
    }
}
