package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc {
    private int gm;
    private String pcc;
    private String sf;

    public int gm() {
        return this.gm;
    }

    @Nullable
    public JSONObject oo() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.pcc);
            jSONObject.put("ft", this.gm);
            jSONObject.put("fu", this.sf);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String pcc() {
        return this.pcc;
    }

    public String sf() {
        return this.sf;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public void sf(String str) {
        this.sf = str;
    }

    public void pcc(int i) {
        this.gm = i;
    }
}
