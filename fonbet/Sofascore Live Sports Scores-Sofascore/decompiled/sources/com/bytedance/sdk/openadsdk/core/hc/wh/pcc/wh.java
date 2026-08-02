package com.bytedance.sdk.openadsdk.core.hc.wh.pcc;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.hc.wh.pcc.sf;
import com.bytedance.sdk.openadsdk.core.hc.wh.qf;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.zti;
import com.bytedance.sdk.openadsdk.core.ork.tsz;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends qf {
    private static Boolean atb;
    private float jsj;
    private final sf mk;
    private float qy;
    private boolean tsz;

    public wh(Context context, of ofVar, boolean z, com.bytedance.sdk.openadsdk.core.hc.wh.pcc pccVar, ViewGroup viewGroup, float f, float f2, boolean z2, String str) {
        super(context, ofVar, z, pccVar, viewGroup);
        this.mk = sf.pcc.pcc(ofVar, pccVar);
        this.tz = str;
        this.qy = f;
        this.jsj = f2;
        this.tsz = z2;
    }

    private boolean gbb() {
        of ofVar = this.vj;
        if (ofVar == null) {
            return false;
        }
        int tqg = ofVar.tqg();
        boolean z = tqg == 7 || tqg == 8;
        int bg = this.vj.bg();
        return z && (bg == 43 || bg == 44);
    }

    private boolean hc() {
        return this.vj != null && gbb() && atb.gm(this.vj);
    }

    private JSONObject pcc(float f, float f2, boolean z, of ofVar, String str) {
        JSONObject pcc = com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(f, f2, z, ofVar, str);
        this.yt = pcc;
        if (pcc == null) {
            return null;
        }
        try {
            JSONObject optJSONObject = pcc.optJSONObject("xSize");
            if (optJSONObject != null) {
                optJSONObject.put("imageModeRatio", tmg());
            }
            JSONObject optJSONObject2 = this.yt.optJSONObject("xAdInfo");
            if (optJSONObject2 != null) {
                optJSONObject2.put("isVideoImageMode", of.vj(this.vj));
                optJSONObject2.put("feed_draw_purePlayable", hc());
                optJSONObject2.put("isFeedDraw", gbb());
            }
            sf sfVar = this.mk;
            if (sfVar != null) {
                sfVar.pcc(this.yt);
            }
        } catch (Exception unused) {
        }
        return this.yt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo, com.bytedance.sdk.component.adexpress.sf.oo
    public int gm() {
        return 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.qf, com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public com.bytedance.adsdk.ugeno.sf.gm kj() {
        com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = this.gm;
        if (gmVar == null) {
            return null;
        }
        return gmVar.qf("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.qf, com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public JSONObject sf() {
        return pcc(this.qy, this.jsj, this.tsz, this.vj, this.tz);
    }

    public float tmg() {
        of ofVar = this.vj;
        if (ofVar == null) {
            return 1.0f;
        }
        int ct = ofVar.ct();
        if (ct == 3) {
            return 1.91f;
        }
        if (ct == 5) {
            return 1.78f;
        }
        if (ct == 15 || ct == 173) {
            return 0.5625f;
        }
        if (ct != 33 && ct != 50) {
            if (ct == 1010) {
                return 1.2f;
            }
            if (ct == 1011) {
                return 6.4f;
            }
            if (ct == 1012) {
                return 3.2f;
            }
        }
        return 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.qf, com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public JSONObject pcc() {
        sf sfVar = this.mk;
        if (sfVar != null) {
            try {
                return new JSONObject(sfVar.pcc());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.qf
    public JSONObject pcc(zti ztiVar) {
        sf sfVar = this.mk;
        if (sfVar != null) {
            return sfVar.sf();
        }
        return null;
    }

    public static boolean pcc(String str) {
        if (atb == null) {
            atb = Boolean.valueOf(com.bytedance.sdk.openadsdk.yt.vj.pcc("express_backup_type", 0) == 1);
        }
        return atb.booleanValue() && (TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video") || tsz.sf(str) || (TextUtils.equals(str, "open_ad") && com.bytedance.sdk.openadsdk.component.qf.pcc.vh()));
    }
}
