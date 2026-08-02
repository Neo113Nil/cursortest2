package com.bytedance.adsdk.ugeno.oo;

import defpackage.dmi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    private boolean gm = false;
    private int oo = 0;
    private pcc pcc;
    private List<pcc> sf;

    public static wh pcc(JSONObject jSONObject, JSONObject jSONObject2) {
        pcc pcc2;
        if (jSONObject == null) {
            return null;
        }
        wh whVar = new wh();
        Object opt = jSONObject.opt("on");
        JSONArray optJSONArray = jSONObject.optJSONArray("handlers");
        pcc pcc3 = opt instanceof String ? tmg.pcc((String) opt, jSONObject2) : opt instanceof JSONObject ? tmg.pcc((JSONObject) opt, jSONObject2) : null;
        if (pcc3 != null) {
            whVar.pcc = pcc3;
        }
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            Object opt2 = optJSONArray.opt(i);
            if (opt2 instanceof String) {
                pcc pcc4 = tmg.pcc((String) opt2, jSONObject2);
                if (pcc4 != null) {
                    arrayList.add(pcc4);
                }
            } else if ((opt2 instanceof JSONObject) && (pcc2 = tmg.pcc((JSONObject) opt2, jSONObject2)) != null) {
                arrayList.add(pcc2);
            }
        }
        whVar.sf = arrayList;
        if (jSONObject.has("delay")) {
            whVar.oo = com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("delay"), jSONObject2), 0);
        }
        if (jSONObject.has("disable")) {
            whVar.gm = com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("disable"), jSONObject2), false);
        }
        return whVar;
    }

    public boolean gm() {
        return this.gm;
    }

    public int oo() {
        return this.oo;
    }

    public List<pcc> sf() {
        return this.sf;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private String gm = "global";
        private String oo;
        private String pcc;
        private String sf;
        private Map<String, Object> vj;
        private Map<String, Object> wh;

        public Map<String, Object> gm() {
            return this.vj;
        }

        public String oo() {
            return this.pcc;
        }

        public String pcc() {
            return this.gm;
        }

        public String sf() {
            return this.oo;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Action{scheme='");
            sb.append(this.gm);
            sb.append("', name='");
            sb.append(this.oo);
            sb.append("', params=");
            sb.append(this.vj);
            sb.append(", host='");
            sb.append(this.sf);
            sb.append("', origin='");
            sb.append(this.pcc);
            sb.append("', extra=");
            return dmi.s(sb, this.wh, '}');
        }

        public String vj() {
            return this.sf;
        }

        public void gm(String str) {
            this.pcc = str;
        }

        public void oo(String str) {
            this.sf = str;
        }

        public void pcc(String str) {
            this.gm = str;
        }

        public void sf(String str) {
            this.oo = str;
        }

        public void pcc(Map<String, Object> map) {
            this.vj = map;
        }

        public void sf(Map<String, Object> map) {
            this.wh = map;
        }
    }

    public pcc pcc() {
        return this.pcc;
    }
}
