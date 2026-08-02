package com.bytedance.adsdk.ugeno.wh.sf;

import android.view.View;
import com.bytedance.adsdk.ugeno.kj.gm;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc implements gm.vj {
    @Override // com.bytedance.adsdk.ugeno.kj.gm.vj
    public void pcc(View view, float f) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = view.getWidth();
        }
        view.setPivotX(f2);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f * 90.0f);
    }
}
