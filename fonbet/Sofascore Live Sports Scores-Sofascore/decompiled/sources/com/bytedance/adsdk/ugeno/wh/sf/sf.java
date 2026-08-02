package com.bytedance.adsdk.ugeno.wh.sf;

import android.view.View;
import com.bytedance.adsdk.ugeno.kj.gm;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf implements gm.vj {
    @Override // com.bytedance.adsdk.ugeno.kj.gm.vj
    public void pcc(View view, float f) {
        int width = view.getWidth();
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setTranslationX((-width) * f);
        } else {
            view.setTranslationX(width);
            view.setTranslationX((-width) * f);
        }
        view.setAlpha(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - Math.abs(f)));
    }
}
