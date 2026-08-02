package com.bytedance.adsdk.pcc;

import com.bytedance.adsdk.ugeno.gm.pcc;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements com.bytedance.adsdk.ugeno.gm.pcc {
    @Override // com.bytedance.adsdk.ugeno.gm.pcc
    public pcc.InterfaceC0029pcc pcc(String str) {
        return pcc.pcc(str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements pcc.InterfaceC0029pcc {
        private com.bytedance.adsdk.pcc.sf.pcc pcc;
        private String sf;

        private pcc(String str) {
            this.sf = str;
            this.pcc = com.bytedance.adsdk.pcc.sf.pcc.pcc(str);
        }

        @Override // com.bytedance.adsdk.ugeno.gm.pcc.InterfaceC0029pcc
        public Object pcc(JSONObject jSONObject) {
            com.bytedance.adsdk.pcc.sf.pcc pccVar = this.pcc;
            if (pccVar == null) {
                return this.sf;
            }
            Object pcc = pccVar.pcc(jSONObject);
            if (pcc instanceof String) {
                return pcc;
            }
            if (pcc instanceof com.bytedance.adsdk.pcc.sf.pcc.pcc) {
                return String.valueOf(nac.pcc((com.bytedance.adsdk.pcc.sf.pcc.pcc) pcc));
            }
            if (pcc == null || !pcc.getClass().isArray()) {
                return String.valueOf(pcc);
            }
            try {
                return new JSONArray(pcc).toString();
            } catch (JSONException unused) {
                return String.valueOf(pcc);
            }
        }

        public static pcc pcc(String str) {
            return new pcc(str);
        }
    }
}
