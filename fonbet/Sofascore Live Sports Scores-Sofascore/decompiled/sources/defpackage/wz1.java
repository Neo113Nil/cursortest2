package defpackage;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.d;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.sofascore.results.view.header.widget.TimerGoalAnimatedView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wz1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wz1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qzb qzbVar = ((BottomSheetBehavior) obj).j;
                if (qzbVar != null) {
                    qzbVar.u(floatValue);
                    break;
                }
                break;
            case 1:
                ((CollapsingToolbarLayout) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 2:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                d dVar = (d) obj;
                dVar.c.setAlpha(floatValue2);
                dVar.d.setAlpha(floatValue2);
                dVar.s.invalidate();
                break;
            case 3:
                ((zba) obj).m = valueAnimator.getAnimatedFraction();
                break;
            case 4:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 5:
                ((TextInputLayout) obj).w0.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                valueAnimator.getClass();
                TimerGoalAnimatedView timerGoalAnimatedView = (TimerGoalAnimatedView) obj;
                timerGoalAnimatedView.setTextNext(timerGoalAnimatedView.m);
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                timerGoalAnimatedView.setYAnimate(((Float) animatedValue).floatValue());
                timerGoalAnimatedView.requestLayout();
                timerGoalAnimatedView.invalidate();
                break;
        }
    }
}
