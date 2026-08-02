package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class zti {
    private String gm;
    private String oo;
    private String pcc;
    private String sf;
    private JSONObject vj;
    private pcc wh;

    public static zti pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        zti ztiVar = new zti();
        ztiVar.pcc = jSONObject.optString("id");
        ztiVar.oo = jSONObject.optString("data");
        ztiVar.gm = jSONObject.optString("url");
        ztiVar.sf = jSONObject.optString("md5");
        ztiVar.vj = jSONObject.optJSONObject("custom_components");
        JSONObject optJSONObject = jSONObject.optJSONObject("preload");
        if (optJSONObject != null) {
            ztiVar.wh = pcc.pcc(optJSONObject);
        }
        return ztiVar;
    }

    public String gm() {
        return this.gm;
    }

    public String oo() {
        return this.oo;
    }

    public String sf() {
        return this.sf;
    }

    public JSONObject vj() {
        return this.vj;
    }

    public pcc wh() {
        return this.wh;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private JSONArray gm;
        private JSONArray pcc;
        private JSONArray sf;

        public static pcc pcc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("image");
            pcc pccVar = new pcc();
            pccVar.pcc(optJSONArray);
            pccVar.sf(jSONObject.optJSONArray("fetch"));
            pccVar.gm(jSONObject.optJSONArray("script"));
            return pccVar;
        }

        public JSONArray gm() {
            return this.gm;
        }

        public JSONArray sf() {
            return this.sf;
        }

        public void gm(JSONArray jSONArray) {
            this.gm = jSONArray;
        }

        public void sf(JSONArray jSONArray) {
            this.sf = jSONArray;
        }

        public void pcc(JSONArray jSONArray) {
            this.pcc = jSONArray;
        }

        public JSONArray pcc() {
            return this.pcc;
        }
    }

    public String pcc() {
        return this.pcc;
    }
}
