package com.bytedance.sdk.openadsdk.core.hc.sf;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends com.bytedance.adsdk.ugeno.vy.wh.sf {
    private String uae;
    private String xf;

    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.vy.wh.sf
    public void gbb(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
            str = "";
        }
        if (TextUtils.isEmpty(this.uae) || TextUtils.equals(this.uae, "null")) {
            this.uae = "";
        }
        if (TextUtils.isEmpty(this.xf) || TextUtils.equals(this.xf, "null")) {
            this.xf = "";
        }
        String str2 = this.xf + str + this.uae;
        ((com.bytedance.adsdk.ugeno.vy.wh.sf) this).pcc = str2;
        ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setText(str2);
        try {
            float f = this.zti ? this.tsz : this.jsj;
            float f2 = this.pq ? this.mk : this.jsj;
            float measureText = ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).getPaint().measureText(((com.bytedance.adsdk.ugeno.vy.wh.sf) this).pcc);
            if (measureText >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                vj((int) (f + measureText + f2));
            }
        } catch (Throwable unused) {
        }
    }

    public int oo() {
        return this.bg;
    }

    @Override // com.bytedance.adsdk.ugeno.vy.wh.sf, com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        str.getClass();
        if (str.equals("before")) {
            this.xf = str2;
        } else if (str.equals("after")) {
            this.uae = str2;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vy.wh.sf, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        if (TextUtils.isEmpty(this.uae) || TextUtils.equals(this.uae, "null")) {
            this.uae = "";
        }
        if (TextUtils.isEmpty(this.xf) || TextUtils.equals(this.xf, "null")) {
            this.xf = "";
        }
        String str = this.xf + this.uae;
        ((com.bytedance.adsdk.ugeno.vy.wh.sf) this).pcc = str;
        ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setText(str);
        ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setGravity(17);
    }
}
