package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dn6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public dn6(View view, float f, float f2, float f3) {
        this.a = view;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = mxj.a;
        float f = this.b;
        if (floatValue >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f2 = this.d;
            float f3 = this.c;
            f = floatValue > f2 ? f3 : me4.b(f3, f, (floatValue - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / (f2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), f);
        }
        this.a.setAlpha(f);
    }
}
