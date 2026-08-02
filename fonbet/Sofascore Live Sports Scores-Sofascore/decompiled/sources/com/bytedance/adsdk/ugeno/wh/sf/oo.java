package com.bytedance.adsdk.ugeno.wh.sf;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.kj.gm;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo implements gm.vj {
    private String pcc;

    @Override // com.bytedance.adsdk.ugeno.kj.gm.vj
    public void pcc(View view, float f) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f));
            view.setTranslationY(view.getHeight() * f);
        }
        if (TextUtils.equals(this.pcc, "cube")) {
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = view.getHeight();
            }
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(f2);
            view.setRotationX(f * (-90.0f));
        }
    }

    public void pcc(String str) {
        this.pcc = str;
    }
}
