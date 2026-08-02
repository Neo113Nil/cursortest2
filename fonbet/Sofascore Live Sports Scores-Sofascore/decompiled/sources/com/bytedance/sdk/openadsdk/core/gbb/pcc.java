package com.bytedance.sdk.openadsdk.core.gbb;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    gm gm;
    private double kj;
    private String oo;
    private int ork;
    private String qf;
    sf sf;
    private String tmg;
    private String vj;
    private int vy;
    private String wh;
    final com.bytedance.sdk.openadsdk.core.model.oo pcc = new com.bytedance.sdk.openadsdk.core.model.oo();
    private String vh = "VAST_ACTION_BUTTON";

    public static pcc pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        pcc pccVar = new pcc();
        oo pcc = pccVar.pcc.pcc();
        if (pcc == null) {
            pcc = new oo();
            pccVar.pcc.pcc(pcc);
        }
        pcc.pcc(jSONObject.optJSONObject("videoTrackers"));
        pccVar.sf = sf.pcc(jSONObject.optJSONObject("vastIcon"));
        pccVar.gm = gm.sf(jSONObject.optJSONObject("endCard"));
        pccVar.oo = jSONObject.optString("title");
        pccVar.vj = jSONObject.optString("description");
        pccVar.wh = jSONObject.optString("clickThroughUrl");
        pccVar.qf = jSONObject.optString("videoUrl");
        pccVar.kj = jSONObject.optDouble("videDuration");
        pccVar.vy = jSONObject.optInt("videoWidth");
        pccVar.vy = jSONObject.optInt("videoHeight");
        Set<ork> sf = pccVar.pcc.sf();
        if (sf == null) {
            sf = new HashSet<>();
            pccVar.pcc.pcc(sf);
        }
        sf.addAll(ork.pcc(jSONObject.optJSONArray("viewabilityVendor")));
        return pccVar;
    }

    public gm gm() {
        return this.gm;
    }

    public com.bytedance.sdk.openadsdk.core.model.oo hc() {
        return this.pcc;
    }

    public double kj() {
        return this.kj;
    }

    public String oo() {
        return this.oo;
    }

    public int ork() {
        return this.vy;
    }

    public String qf() {
        return this.qf;
    }

    public sf sf() {
        return this.sf;
    }

    public Set<ork> tmg() {
        return this.pcc.sf();
    }

    public int vh() {
        return this.ork;
    }

    public String vj() {
        return this.vj;
    }

    public String vy() {
        gm gmVar;
        String str = this.wh;
        if (!TextUtils.isEmpty(this.tmg)) {
            String str2 = this.tmg;
            this.tmg = null;
            return str2;
        }
        String str3 = this.vh;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            sf sfVar = this.sf;
            if (sfVar != null && !TextUtils.isEmpty(sfVar.kj)) {
                str = this.sf.kj;
            }
        } else if (str3.equals("VAST_END_CARD") && (gmVar = this.gm) != null && !TextUtils.isEmpty(gmVar.kj)) {
            str = this.gm.kj;
        }
        this.vh = "VAST_ACTION_BUTTON";
        return str;
    }

    public String wh() {
        return this.wh;
    }

    public void gm(String str) {
        this.wh = str;
    }

    public void oo(String str) {
        this.qf = str;
    }

    public void sf(String str) {
        this.vj = str;
    }

    public void vj(String str) {
        this.vh = str;
    }

    public void wh(String str) {
        this.tmg = str;
    }

    public void sf(int i) {
        this.ork = i;
    }

    public void pcc(sf sfVar) {
        if (sfVar != null) {
            sfVar.pcc(this.qf);
        }
        this.sf = sfVar;
    }

    public void pcc(gm gmVar) {
        if (gmVar != null) {
            gmVar.pcc(this.qf);
        }
        this.gm = gmVar;
    }

    public void pcc(String str) {
        this.oo = str;
    }

    public void pcc(double d) {
        this.kj = d;
    }

    public oo pcc() {
        return this.pcc.pcc();
    }

    public void pcc(of ofVar) {
        this.pcc.pcc(ofVar);
        sf sfVar = this.sf;
        if (sfVar != null) {
            sfVar.pcc(ofVar);
        }
        gm gmVar = this.gm;
        if (gmVar != null) {
            gmVar.pcc(ofVar);
        }
    }

    public void pcc(int i) {
        this.vy = i;
    }

    public void pcc(Set<ork> set) {
        this.pcc.sf(set);
    }
}
