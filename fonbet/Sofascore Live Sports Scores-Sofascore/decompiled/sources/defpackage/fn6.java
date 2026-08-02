package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fn6 implements dwk {
    public float a;

    @Override // defpackage.dwk
    public final Animator a(View view) {
        float alpha = view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : view.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.addUpdateListener(new dn6(view, alpha, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        ofFloat.addListener(new en6(view, alpha));
        return ofFloat;
    }

    @Override // defpackage.dwk
    public final Animator b(View view) {
        float alpha = view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : view.getAlpha();
        float f = this.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.addUpdateListener(new dn6(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, alpha, f));
        ofFloat.addListener(new en6(view, alpha));
        return ofFloat;
    }
}
