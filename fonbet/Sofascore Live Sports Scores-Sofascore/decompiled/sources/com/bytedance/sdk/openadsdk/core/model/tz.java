package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tz {
    private String pcc = "horizontal";
    private int sf = 1;
    private int gm = 1;
    private int oo = 0;
    private int vj = 0;
    private int wh = 0;
    private int qf = 0;
    private int kj = 5000;
    private int vy = 500;
    private int ork = 0;

    public static tz pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new tz();
        }
        tz tzVar = new tz();
        tzVar.pcc = jSONObject.optString("direction", "horizontal");
        tzVar.sf = jSONObject.optInt("auto_loop", 1);
        tzVar.gm = jSONObject.optInt("allow_manual_loop", 1);
        tzVar.oo = jSONObject.optInt("unlimited_loop", 0);
        tzVar.vj = jSONObject.optInt("left_margin", 0);
        tzVar.wh = jSONObject.optInt("right_margin", 0);
        tzVar.qf = jSONObject.optInt("ad_margin", 0);
        tzVar.kj = jSONObject.optInt("loop_interval_time", 5000);
        tzVar.vy = jSONObject.optInt("flip_speed", 500);
        tzVar.ork = jSONObject.optInt("stop_auto_loop", 0);
        return tzVar;
    }

    public int gm() {
        return this.gm;
    }

    public int kj() {
        return this.kj;
    }

    public int oo() {
        return this.oo;
    }

    public int ork() {
        return this.ork;
    }

    public int qf() {
        return this.qf;
    }

    public int sf() {
        return this.sf;
    }

    public int vj() {
        return this.vj;
    }

    public int vy() {
        return this.vy;
    }

    public int wh() {
        return this.wh;
    }

    public String pcc() {
        return this.pcc;
    }
}
