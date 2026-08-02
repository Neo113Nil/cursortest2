package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import com.sofascore.results.player.statistics.regular.view.PlayerPenaltyShotView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class n6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n6(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) fn0.i(valueAnimator);
                ((o6) obj2).y.set(((crc) obj).ordinal(), num);
                ((Function1) obj3).invoke(num);
                break;
            case 1:
                int i2 = FootballShotmapView.O;
                valueAnimator.getClass();
                Object animatedValue = ((ValueAnimator) obj2).getAnimatedValue();
                animatedValue.getClass();
                ((Function1) obj3).invoke((Float) animatedValue);
                ((FootballShotmapView) obj).invalidate();
                break;
            case 2:
                p03 p03Var = (p03) obj2;
                rfe rfeVar = (rfe) obj;
                FrameLayout frameLayout = (FrameLayout) obj3;
                valueAnimator.getClass();
                if (valueAnimator.getAnimatedFraction() > 0.99d) {
                    p03Var.getClass();
                    ViewPropertyAnimator animate = ((TextView) rfeVar.e).animate();
                    animate.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    animate.setDuration(200L);
                    animate.setInterpolator(new AccelerateDecelerateInterpolator());
                    animate.withEndAction(new kdc(7, rfeVar, p03Var, frameLayout));
                    animate.start();
                    frameLayout.setOnTouchListener(new ab(6));
                    break;
                }
                break;
            default:
                int i3 = PlayerPenaltyShotView.J;
                valueAnimator.getClass();
                Object animatedValue2 = ((ValueAnimator) obj2).getAnimatedValue();
                animatedValue2.getClass();
                ((Function1) obj3).invoke((Float) animatedValue2);
                ((PlayerPenaltyShotView) obj).invalidate();
                break;
        }
    }

    public /* synthetic */ n6(Function1 function1, ValueAnimator valueAnimator, View view, int i) {
        this.a = i;
        this.b = function1;
        this.c = valueAnimator;
        this.d = view;
    }
}
