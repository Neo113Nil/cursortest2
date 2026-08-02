package com.bytedance.sdk.openadsdk.core.hc.wh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.hc;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.openadsdk.core.gpj;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private JSONArray dax;
    private boolean gbb;
    private com.bytedance.adsdk.ugeno.sf.gm gm;
    private boolean hc;
    private boolean jr;
    private final of kj;
    private com.bytedance.adsdk.ugeno.sf.gm oo;
    private com.bytedance.sdk.openadsdk.core.widget.vj ork;
    private final Context qf;
    private final JSONObject tmg;
    private JSONObject vh;
    private com.bytedance.adsdk.ugeno.sf.gm vj;
    private final String vy;
    private int pcc = -1;
    private int sf = -1;
    private final String wh = "UGenSwiperEvent";

    public vj(Context context, of ofVar, String str, JSONObject jSONObject) {
        this.qf = context;
        this.kj = ofVar;
        this.vy = str;
        this.tmg = jSONObject;
    }

    public void gm() {
        int i;
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.vj;
        if (!(gmVar instanceof com.bytedance.adsdk.ugeno.gm) || (i = this.pcc) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.gm) gmVar).pcc(i + 1);
    }

    public JSONObject oo() {
        return this.vh;
    }

    public boolean pcc(hc hcVar) {
        JSONObject optJSONObject;
        this.vh = null;
        int i = this.sf;
        if (i != -1 && i != 0) {
            try {
                JSONObject gm = hcVar.gm();
                if (gm != null && (optJSONObject = gm.optJSONObject("related_dpa_click")) != null) {
                    boolean optBoolean = optJSONObject.optBoolean("enableOpenExternalUrl");
                    int optInt = optJSONObject.optInt("landingStyle");
                    if (optBoolean && optInt != -1) {
                        if (this.dax != null) {
                            String pcc = com.bytedance.adsdk.ugeno.gm.sf.pcc(optJSONObject.optString("url"), this.dax.optJSONObject(this.sf));
                            String pcc2 = com.bytedance.adsdk.ugeno.gm.sf.pcc(optJSONObject.optString("fallback_url"), this.dax.optJSONObject(this.sf));
                            optJSONObject.put("url", pcc);
                            optJSONObject.put("fallback_url", pcc2);
                            pcc(optJSONObject, this.dax.optJSONObject(this.sf));
                        }
                        pcc(optJSONObject, hcVar.pcc().vh());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th) {
                lo.gm("UGenSwiperEvent", th.getMessage());
            }
        }
        return false;
    }

    public void sf() {
        int i;
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.vj;
        if (!(gmVar instanceof com.bytedance.adsdk.ugeno.gm) || (i = this.pcc) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.gm) gmVar).pcc(i - 1);
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm<View> gmVar) {
        com.bytedance.adsdk.ugeno.sf.gm<View> vj = gmVar.vj("swiperLayout");
        this.vj = vj;
        if (vj instanceof com.bytedance.adsdk.ugeno.gm) {
            this.dax = this.tmg.optJSONArray("dpa_data");
            this.gm = gmVar.vj("swiperLeftArrow");
            this.oo = gmVar.vj("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.gm) this.vj).pcc(new com.bytedance.adsdk.ugeno.wh.gm() { // from class: com.bytedance.sdk.openadsdk.core.hc.wh.vj.1
                @Override // com.bytedance.adsdk.ugeno.wh.gm
                public void pcc(boolean z, int i, int i2, boolean z2, boolean z3) {
                    vj.this.sf = i;
                    vj.this.pcc = i2;
                    vj.this.hc = z;
                    vj.this.gbb = z2;
                    vj.this.jr = z3;
                    vj.this.pcc(z, z2, z3);
                    vj.this.pcc(i);
                }

                @Override // com.bytedance.adsdk.ugeno.wh.gm
                public void pcc(boolean z, int i, float f, int i2) {
                }

                @Override // com.bytedance.adsdk.ugeno.wh.gm
                public void pcc(boolean z, int i) {
                }
            });
        }
    }

    public void pcc() {
        pcc(this.hc, this.gbb, this.jr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(boolean z, boolean z2, boolean z3) {
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.gm;
        if (gmVar == null || this.oo == null) {
            return;
        }
        View vh = gmVar.vh();
        View vh2 = this.oo.vh();
        JSONArray jSONArray = this.dax;
        if (jSONArray != null && jSONArray.length() == 1) {
            vh.setVisibility(8);
            vh2.setVisibility(8);
            return;
        }
        if (z) {
            return;
        }
        if (z2) {
            if (vh instanceof TextView) {
                pcc((TextView) vh, 90);
            }
            if (vh2 instanceof TextView) {
                pcc((TextView) vh2, 255);
                return;
            }
            return;
        }
        if (z3) {
            if (vh instanceof TextView) {
                pcc((TextView) vh, 255);
            }
            if (vh2 instanceof TextView) {
                pcc((TextView) vh2, 90);
                return;
            }
            return;
        }
        if (vh instanceof TextView) {
            pcc((TextView) vh, 255);
        }
        if (vh2 instanceof TextView) {
            pcc((TextView) vh2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.kj, this.vy, "carousel_show", jSONObject);
    }

    private void pcc(TextView textView, int i) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.widget.vj vjVar) {
        this.ork = vjVar;
    }

    private void pcc(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("clickInfo");
        this.vh = optJSONObject;
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    this.vh.putOpt(next, com.bytedance.adsdk.ugeno.gm.sf.pcc((String) this.vh.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.vh);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0008, code lost:
    
        if (r3 != 3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean pcc(int i, String str, String str2) {
        if (i != 1) {
            if (i == 2) {
                if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !lu.pcc(str2)) {
                    return false;
                }
            }
        }
        return lu.pcc(str);
    }

    private void pcc(JSONObject jSONObject, View view) {
        if (pcc(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString("fallback_url"))) {
            gpj.pcc(pcc(view), this.qf instanceof Activity, jSONObject, this.kj, this.vy, kun.pcc(this.vy), null, this.ork);
        }
    }

    private Context pcc(View view) {
        Activity pcc = view != null ? com.bytedance.sdk.component.utils.sf.pcc(view) : null;
        return pcc == null ? this.qf : pcc;
    }
}
