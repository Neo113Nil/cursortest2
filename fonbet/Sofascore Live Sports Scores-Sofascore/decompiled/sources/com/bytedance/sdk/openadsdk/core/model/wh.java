package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    private int qf;
    private String pcc = "";
    private String sf = "";
    private String gm = "";
    private String oo = "";
    private double vj = -1.0d;
    private int wh = -1;

    public String gm() {
        return this.gm;
    }

    public JSONObject kj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", sf());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, wh());
            jSONObject.put("comment_num", vj());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, pcc());
            jSONObject.put("package_name", gm());
            jSONObject.put("score", oo());
            jSONObject.put("app_category", qf());
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.gm(e.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public double oo() {
        return this.vj;
    }

    public void pcc(double d) {
        if (d < 1.0d || d > 5.0d) {
            this.vj = -1.0d;
        } else {
            this.vj = d;
        }
    }

    public String qf() {
        return this.oo;
    }

    public String sf() {
        return this.sf;
    }

    public int vj() {
        return this.wh;
    }

    public int wh() {
        return this.qf;
    }

    public void gm(String str) {
        this.gm = str;
    }

    public void oo(String str) {
        this.oo = str;
    }

    public void sf(String str) {
        this.sf = str;
    }

    public void sf(int i) {
        this.qf = i;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public String pcc() {
        return this.pcc;
    }

    public void pcc(int i) {
        if (i <= 0) {
            this.wh = -1;
        } else {
            this.wh = i;
        }
    }
}
