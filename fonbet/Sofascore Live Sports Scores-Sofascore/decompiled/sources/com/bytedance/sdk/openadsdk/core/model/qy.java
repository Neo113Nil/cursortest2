package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qy {
    private int gbb;
    private int gm;
    private sf gpj;
    private int hc;
    private zti lu;
    private int oo;
    private int pcc;
    private JSONObject qf;
    private JSONObject tmg;
    private boolean vh;
    private int vj;
    private String vy;
    private int wh;
    private int sf = 10;
    private int kj = 1;
    private pcc ork = new pcc();
    private int jr = 1;
    private String dax = "Next Ad";
    private String nac = "Next ad in %1$ds";

    public static qy pcc(String str) {
        qy qyVar = new qy();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                qyVar.pcc = jSONObject.optInt("auto_switch");
                qyVar.sf = jSONObject.optInt("playable_preload_count");
                qyVar.gm = jSONObject.optInt("disable_on_interaction");
                qyVar.oo = jSONObject.optInt("ceiling_type");
                qyVar.vj = jSONObject.optInt("can_loop");
                qyVar.wh = jSONObject.optInt("multi_skip_time", -1);
                qyVar.kj = jSONObject.optInt("load_more_strategy");
                qyVar.jr = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject optJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                qyVar.qf = optJSONObject;
                if (optJSONObject != null) {
                    zti pcc2 = zti.pcc(optJSONObject);
                    qyVar.lu = pcc2;
                    if (pcc2 != null && !TextUtils.isEmpty(pcc2.gm())) {
                        com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc(new com.bytedance.sdk.openadsdk.core.hc.kj.pcc().pcc(qyVar.lu.pcc()).sf(qyVar.lu.sf()).gm(qyVar.lu.gm()).oo(qyVar.lu.oo()), "guide");
                    }
                    int optInt = qyVar.qf.optInt("delay_show_time", 5);
                    qyVar.hc = optInt;
                    if (optInt < 0) {
                        qyVar.hc = 5;
                    }
                    int optInt2 = qyVar.qf.optInt("dismiss_after_idle_time", 3);
                    qyVar.gbb = optInt2;
                    if (optInt2 <= 0) {
                        qyVar.gbb = 3;
                    }
                }
                qyVar.vy = jSONObject.optString("agg_endcard_url");
                qyVar.vh = jSONObject.optBoolean("has_more");
                qyVar.tmg = jSONObject.optJSONObject("session_params");
                qyVar.ork = pcc.pcc(jSONObject.optJSONObject("layout_config"));
                qyVar.gpj = sf.pcc(jSONObject.optJSONObject("progress_config"));
            } catch (JSONException unused) {
            }
        }
        return qyVar;
    }

    public int dax() {
        return this.sf;
    }

    public boolean gbb() {
        return this.gm == 1;
    }

    public JSONObject gm() {
        zti ztiVar = this.lu;
        if (ztiVar == null) {
            return null;
        }
        return ztiVar.vj();
    }

    public boolean hc() {
        return this.vh;
    }

    public boolean jr() {
        return this.pcc == 1;
    }

    public int kj() {
        return this.kj;
    }

    public sf nac() {
        return this.gpj;
    }

    public int oo() {
        return this.hc;
    }

    public boolean ork() {
        return this.vj == 1;
    }

    public String qf() {
        return this.vy;
    }

    public JSONObject sf() {
        zti ztiVar = this.lu;
        if (ztiVar == null) {
            return null;
        }
        try {
            String oo = ztiVar.oo();
            if (!TextUtils.isEmpty(oo)) {
                return new JSONObject(oo);
            }
            String pcc2 = com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc("guide", this.lu.pcc(), this.lu.sf());
            if (TextUtils.isEmpty(pcc2)) {
                return null;
            }
            return new JSONObject(pcc2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONObject tmg() {
        return this.tmg;
    }

    public boolean vh() {
        return this.oo == 1;
    }

    public int vj() {
        return this.gbb;
    }

    public int vy() {
        return this.wh;
    }

    public pcc wh() {
        return this.ork;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf {
        private String gm;
        private float oo;
        private int pcc;
        private String sf;
        private float vj;

        public static sf pcc(JSONObject jSONObject) {
            sf sfVar = new sf();
            if (jSONObject == null) {
                return sfVar;
            }
            sfVar.pcc = jSONObject.optInt("progress_type", 0);
            sfVar.sf = jSONObject.optString("progress_color");
            sfVar.gm = jSONObject.optString("progress_background_color");
            sfVar.oo = jSONObject.optInt("progress_size", 0);
            sfVar.vj = jSONObject.optInt("bar_radius", 0);
            return sfVar;
        }

        public String gm() {
            return this.gm;
        }

        public float oo() {
            return this.oo;
        }

        public String sf() {
            return this.sf;
        }

        public float vj() {
            return this.vj;
        }

        public int pcc() {
            return this.pcc;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private int gm;
        private int oo;
        private int pcc;
        private int sf;
        private int vj;

        public static pcc pcc(JSONObject jSONObject) {
            pcc pccVar = new pcc();
            if (jSONObject == null) {
                return pccVar;
            }
            pccVar.pcc = Math.max(0, jSONObject.optInt("padding_left", 0));
            pccVar.sf = Math.max(0, jSONObject.optInt("padding_right", 0));
            pccVar.gm = Math.max(0, jSONObject.optInt("padding_top", 0));
            pccVar.oo = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            pccVar.vj = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return pccVar;
        }

        public int gm() {
            return this.pcc;
        }

        public int oo() {
            return this.sf;
        }

        public int sf() {
            return this.gm;
        }

        public int vj() {
            return this.vj;
        }

        public int pcc() {
            return this.oo;
        }
    }

    public boolean pcc() {
        return this.jr == 1;
    }
}
