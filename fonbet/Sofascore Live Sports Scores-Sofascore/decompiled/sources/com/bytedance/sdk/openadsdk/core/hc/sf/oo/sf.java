package com.bytedance.sdk.openadsdk.core.hc.sf.oo;

import android.content.Context;
import com.bytedance.adsdk.ugeno.oo.vh;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends com.bytedance.adsdk.ugeno.oo.oo.gm {
    private boolean tmg;
    private float vh;

    public sf(Context context) {
        super(context);
        this.vh = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(objArr[1]), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                vh vhVar = this.pcc;
                if (vhVar != null && !this.tmg) {
                    this.tmg = true;
                    vhVar.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                }
                return true;
            }
            if (this.vj.get("rate") != null) {
                this.vh = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(r2), 100);
            }
            if (com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(objArr[0]), 100.0f) >= this.vh) {
                vh vhVar2 = this.pcc;
                if (vhVar2 != null && !this.tmg) {
                    this.tmg = true;
                    vhVar2.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                }
                return true;
            }
        }
        return false;
    }
}
