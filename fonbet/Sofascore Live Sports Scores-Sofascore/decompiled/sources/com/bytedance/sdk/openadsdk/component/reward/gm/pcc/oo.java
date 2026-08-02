package com.bytedance.sdk.openadsdk.component.reward.gm.pcc;

import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.utils.rj;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private String gm;
    private String kj;
    private float oo;
    private String ork;
    private int pcc;
    private float qf;
    private boolean sf = true;
    private float vj;
    private JSONObject vy;
    private float wh;

    public static oo sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        oo ooVar = new oo();
        ooVar.sf(jSONObject.optString("url"));
        ooVar.pcc(jSONObject.optInt("showType"));
        ooVar.pcc(jSONObject.optBoolean("lpClickable", true));
        float sf = rj.sf(lu.pcc(), (float) jSONObject.optDouble("x"));
        float sf2 = rj.sf(lu.pcc(), (float) jSONObject.optDouble("y"));
        float sf3 = rj.sf(lu.pcc(), (float) jSONObject.optDouble("width"));
        float sf4 = rj.sf(lu.pcc(), (float) jSONObject.optDouble("height"));
        ooVar.pcc(sf);
        ooVar.sf(sf2);
        ooVar.gm(sf3);
        ooVar.oo(sf4);
        ooVar.gm(jSONObject.optString("tag"));
        ooVar.pcc(jSONObject.optString("sessionID"));
        JSONObject optJSONObject = jSONObject.optJSONObject("materialDict");
        if (optJSONObject != null) {
            ooVar.pcc(optJSONObject);
        }
        return ooVar;
    }

    public boolean gm() {
        return this.sf;
    }

    public float kj() {
        return this.qf;
    }

    public String oo() {
        return this.gm;
    }

    public boolean pcc(float f, float f2) {
        if (f < vj()) {
            return false;
        }
        if (f > qf() + vj() || f2 < wh()) {
            return false;
        }
        return f2 <= kj() + wh();
    }

    public float qf() {
        return this.wh;
    }

    public float vj() {
        return this.oo;
    }

    public String vy() {
        return this.kj;
    }

    public float wh() {
        return this.vj;
    }

    public void gm(float f) {
        this.wh = f;
    }

    public void oo(float f) {
        this.qf = f;
    }

    public void gm(String str) {
        this.kj = str;
    }

    public void pcc(String str) {
        this.ork = str;
    }

    public void pcc(int i) {
        this.pcc = i;
    }

    public void pcc(boolean z) {
        this.sf = z;
    }

    public void pcc(float f) {
        this.oo = f;
    }

    public void pcc(JSONObject jSONObject) {
        this.vy = jSONObject;
    }

    public String pcc() {
        return this.ork;
    }

    public void sf(String str) {
        this.gm = str;
    }

    public void sf(float f) {
        this.vj = f;
    }

    public int sf() {
        return this.pcc;
    }
}
