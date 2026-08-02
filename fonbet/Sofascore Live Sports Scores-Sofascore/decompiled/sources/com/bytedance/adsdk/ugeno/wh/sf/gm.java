package com.bytedance.adsdk.ugeno.wh.sf;

import android.view.View;
import com.bytedance.adsdk.ugeno.kj.gm;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements gm.vj {
    final float pcc = 0.8f;
    final float sf = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.kj.gm.vj
    public void pcc(View view, float f) {
        float f2 = ((f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.19999999f : -0.19999999f) * f) + 1.0f;
        float f3 = (f * (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.5f : -0.5f)) + 1.0f;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setAlpha(Math.abs(f3));
    }
}
