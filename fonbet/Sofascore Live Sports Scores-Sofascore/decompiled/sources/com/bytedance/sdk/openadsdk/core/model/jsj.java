package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jsj {
    private int gm;
    private String oo = "Next Ad";
    private int pcc;
    private int sf;

    public static jsj pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        jsj jsjVar = new jsj();
        try {
            int max = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int optInt = jSONObject.optInt("is_allow_pause", 0);
            int optInt2 = jSONObject.optInt(CampaignEx.JSON_KEY_LANDING_TYPE, 0);
            String optString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            jsjVar.gm(max);
            jsjVar.sf(optInt);
            jsjVar.pcc(optString);
            jsjVar.pcc(optInt2);
        } catch (Throwable unused) {
        }
        return jsjVar;
    }

    public String gm() {
        return this.oo;
    }

    public int oo() {
        return this.pcc;
    }

    public int sf() {
        return this.sf;
    }

    public void gm(int i) {
        this.pcc = i;
    }

    public void sf(int i) {
        this.sf = i;
    }

    public void pcc(int i) {
        this.gm = i;
    }

    public void pcc(String str) {
        this.oo = str;
    }

    public int pcc() {
        return this.gm;
    }
}
