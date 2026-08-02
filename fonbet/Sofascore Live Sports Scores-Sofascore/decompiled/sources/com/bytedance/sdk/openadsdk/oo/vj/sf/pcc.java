package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.openadsdk.core.model.of;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private JSONObject gm;
    private JSONObject oo;
    private of pcc;
    private String sf;
    private gm vj;
    private boolean wh = false;

    public pcc(of ofVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.pcc = ofVar;
        this.sf = str;
        this.gm = jSONObject;
        this.oo = jSONObject2;
    }

    public JSONObject gm() {
        JSONObject jSONObject = this.gm;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.gm = jSONObject2;
        return jSONObject2;
    }

    public JSONObject oo() {
        JSONObject jSONObject = this.oo;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.oo = jSONObject2;
        return jSONObject2;
    }

    public of pcc() {
        return this.pcc;
    }

    public void qf() {
        gm gmVar = this.vj;
        if (gmVar != null) {
            gmVar.pcc(this);
        }
    }

    public String sf() {
        return this.sf;
    }

    public gm vj() {
        return this.vj;
    }

    public boolean wh() {
        return this.wh;
    }

    public void pcc(gm gmVar) {
        this.vj = gmVar;
    }

    public void pcc(boolean z) {
        this.wh = z;
    }
}
