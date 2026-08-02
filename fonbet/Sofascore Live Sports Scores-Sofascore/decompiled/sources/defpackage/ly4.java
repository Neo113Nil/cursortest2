package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ly4 extends c6o {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly4(int i) {
        super(26);
        this.r = i;
    }

    @Override // defpackage.c6o
    public final float M(Object obj) {
        float displayedWidthIncrease;
        switch (this.r) {
            case 0:
                return ((my4) obj).p.b * 10000.0f;
            default:
                displayedWidthIncrease = ((MaterialButton) obj).getDisplayedWidthIncrease();
                return displayedWidthIncrease;
        }
    }

    @Override // defpackage.c6o
    public final void e0(Object obj, float f) {
        switch (this.r) {
            case 0:
                my4 my4Var = (my4) obj;
                my4Var.p.b = f / 10000.0f;
                my4Var.invalidateSelf();
                int i = (int) f;
                l51 l51Var = my4Var.b;
                if (l51Var.b(true)) {
                    Context context = my4Var.a;
                    if (my4Var.t == null) {
                        LinearInterpolator linearInterpolator = e80.a;
                        my4Var.v = yfa.E(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        my4Var.w = yfa.E(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        my4Var.t = valueAnimator;
                        valueAnimator.setDuration(500L);
                        my4Var.t.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        my4Var.t.setInterpolator(null);
                        my4Var.t.addUpdateListener(new s2(my4Var, 8));
                    }
                    float f2 = i;
                    float f3 = (f2 < l51Var.o * 10000.0f || f2 > l51Var.p * 10000.0f) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
                    float f4 = my4Var.q;
                    ValueAnimator valueAnimator2 = my4Var.t;
                    if (f3 == f4) {
                        if (!valueAnimator2.isRunning()) {
                            my4Var.p.e = f3;
                            my4Var.invalidateSelf();
                            break;
                        }
                    } else {
                        if (valueAnimator2.isRunning()) {
                            my4Var.t.cancel();
                        }
                        my4Var.q = f3;
                        if (f3 != 1.0f) {
                            my4Var.u = my4Var.w;
                            my4Var.t.reverse();
                            break;
                        } else {
                            my4Var.u = my4Var.v;
                            my4Var.t.start();
                            break;
                        }
                    }
                }
                break;
            default:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f);
                break;
        }
    }
}
