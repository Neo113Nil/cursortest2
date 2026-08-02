package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class nac {
    private pcc pcc;
    private pcc sf;

    public nac(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("easy_playable");
        if (optJSONObject != null) {
            this.pcc = new pcc(optJSONObject.optJSONObject("components"));
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("popup");
        if (optJSONObject2 != null) {
            this.sf = new pcc(optJSONObject2.optJSONObject("components"));
        }
    }

    public static pcc gm(of ofVar) {
        nac fv;
        if (ofVar == null || (fv = ofVar.fv()) == null) {
            return null;
        }
        return fv.pcc;
    }

    public static boolean pcc(of ofVar, boolean z) {
        nac fv;
        if (ofVar == null || (fv = ofVar.fv()) == null) {
            return false;
        }
        if (z) {
            pcc pccVar = fv.sf;
            return pccVar != null && pccVar.pcc();
        }
        pcc pccVar2 = fv.pcc;
        return pccVar2 != null && pccVar2.pcc();
    }

    public static pcc sf(of ofVar) {
        nac fv;
        if (ofVar == null || (fv = ofVar.fv()) == null) {
            return null;
        }
        return fv.sf;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        C0090pcc pcc;
        C0090pcc sf;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.bytedance.sdk.openadsdk.core.model.nac$pcc$pcc, reason: collision with other inner class name */
        public static class C0090pcc {
            String pcc;

            public C0090pcc(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.pcc = jSONObject.optString("entry");
            }

            public boolean pcc() {
                return !TextUtils.isEmpty(this.pcc);
            }
        }

        public pcc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.pcc = new C0090pcc(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.sf = new C0090pcc(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean pcc() {
            C0090pcc c0090pcc = this.sf;
            if (c0090pcc != null && c0090pcc.pcc()) {
                return true;
            }
            C0090pcc c0090pcc2 = this.pcc;
            return c0090pcc2 != null && c0090pcc2.pcc();
        }

        public String pcc(boolean z) {
            if (z) {
                C0090pcc c0090pcc = this.pcc;
                if (c0090pcc != null) {
                    return c0090pcc.pcc;
                }
                return "";
            }
            C0090pcc c0090pcc2 = this.sf;
            if (c0090pcc2 != null) {
                return c0090pcc2.pcc;
            }
            return "";
        }
    }

    public static boolean pcc(of ofVar) {
        return pcc(ofVar, false);
    }
}
