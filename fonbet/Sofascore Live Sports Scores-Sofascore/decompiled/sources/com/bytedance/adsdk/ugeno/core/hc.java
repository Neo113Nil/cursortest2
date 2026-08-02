package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc {
    private JSONObject gm;
    private hc oo;
    private com.bytedance.adsdk.ugeno.sf.gm pcc;
    private int sf;
    private hc vj;

    public JSONObject gm() {
        return this.gm;
    }

    public hc oo() {
        return this.oo;
    }

    public com.bytedance.adsdk.ugeno.sf.gm pcc() {
        return this.pcc;
    }

    public int sf() {
        return this.sf;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.pcc + ", mEventType=" + this.sf + ", mEvent=" + this.gm + '}';
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        this.pcc = gmVar;
    }

    public void sf(hc hcVar) {
        this.vj = hcVar;
    }

    public void pcc(int i) {
        this.sf = i;
    }

    public void pcc(JSONObject jSONObject) {
        this.gm = jSONObject;
    }

    public void pcc(hc hcVar) {
        this.oo = hcVar;
    }
}
