package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.animation.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class rh6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ rh6(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                valueAnimator.getClass();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                layoutParams.height = ((Integer) animatedValue).intValue();
                view.requestLayout();
                break;
            case 1:
                valueAnimator.getClass();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                layoutParams2.height = ((Integer) animatedValue2).intValue();
                view.requestLayout();
                break;
            default:
                b.a(view, valueAnimator);
                break;
        }
    }
}
