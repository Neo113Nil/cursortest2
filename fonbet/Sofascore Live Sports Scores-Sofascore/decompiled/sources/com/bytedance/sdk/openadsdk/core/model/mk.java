package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class mk {
    private int gm;
    private int kj;
    private int oo;
    private String ork;
    private String pcc;
    private String qf;
    private String sf;
    private int vh;
    private String vj;
    private String vy;
    private String wh;

    public static mk pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        mk mkVar = new mk();
        try {
            mkVar.wh(jSONObject.optString("market_dpl", ""));
            mkVar.qf(jSONObject.optString("market_dpl_auto", ""));
            mkVar.gm(jSONObject.optInt("exec_type", 0));
            mkVar.oo(jSONObject.optInt("oem_vendor_type", 0));
            mkVar.oo(jSONObject.optString("market_pkg", ""));
            mkVar.vj(jSONObject.optString("regex", ""));
            mkVar.sf(jSONObject.optInt("overlay", 1));
            mkVar.sf(jSONObject.optString("caller_id", ""));
            mkVar.gm(jSONObject.optString("ext_map", null));
            mkVar.pcc(jSONObject.optInt("gp_card", 0));
            mkVar.pcc(jSONObject.optString("app_pkg", ""));
            return mkVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("OemModel", th.getMessage());
            return mkVar;
        }
    }

    public String gm() {
        return this.vy;
    }

    public boolean kj() {
        return this.oo == 2;
    }

    public String oo() {
        return this.vj;
    }

    public String ork() {
        return this.gm == 2 ? this.sf : this.pcc;
    }

    public boolean qf() {
        return this.oo == 1;
    }

    public int sf() {
        return this.kj;
    }

    public JSONObject vh() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.pcc)) {
                jSONObject.put("market_dpl", this.pcc);
            }
            if (!TextUtils.isEmpty(this.sf)) {
                jSONObject.put("market_dpl_auto", this.sf);
            }
            if (!TextUtils.isEmpty(this.vj)) {
                jSONObject.put("market_pkg", this.vj);
            }
            if (!TextUtils.isEmpty(this.qf)) {
                jSONObject.put("app_pkg", this.qf);
            }
            if (!TextUtils.isEmpty(this.wh)) {
                jSONObject.put("regex", this.wh);
            }
            jSONObject.put("exec_type", this.gm);
            jSONObject.put("oem_vendor_type", this.oo);
            jSONObject.put("overlay", this.kj);
            jSONObject.put("gp_card", this.vh);
            if (!TextUtils.isEmpty(this.vy)) {
                jSONObject.put("caller_id", this.vy);
            }
            if (!TextUtils.isEmpty(this.ork)) {
                jSONObject.put("ext_map", this.ork);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("OemModel", th.getMessage());
            return null;
        }
    }

    public String vj() {
        return this.wh;
    }

    public boolean vy() {
        return this.vh == 1;
    }

    public void wh(String str) {
        this.pcc = str;
    }

    public void gm(String str) {
        this.ork = str;
    }

    public void oo(String str) {
        this.vj = str;
    }

    public void sf(int i) {
        this.kj = i;
    }

    public void vj(String str) {
        this.wh = str;
    }

    public int wh() {
        return this.oo;
    }

    public void gm(int i) {
        this.gm = i;
    }

    public void oo(int i) {
        this.oo = i;
    }

    public void sf(String str) {
        this.vy = str;
    }

    public void qf(String str) {
        this.sf = str;
    }

    public void pcc(String str) {
        this.qf = str;
    }

    public void pcc(int i) {
        this.vh = i;
    }

    public String pcc() {
        return this.qf;
    }

    public void pcc(Intent intent) {
        if (TextUtils.isEmpty(this.ork)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.ork);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    intent.putExtra(next, (String) obj);
                } else if (obj instanceof Integer) {
                    intent.putExtra(next, (Integer) obj);
                } else if (obj instanceof Boolean) {
                    intent.putExtra(next, (Boolean) obj);
                } else if (obj instanceof Long) {
                    intent.putExtra(next, (Long) obj);
                } else if (obj instanceof Double) {
                    intent.putExtra(next, (Double) obj);
                } else if (obj instanceof Float) {
                    intent.putExtra(next, (Float) obj);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
