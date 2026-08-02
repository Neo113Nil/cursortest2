package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.crowdsourcing.CrowdsourcingOnboardingModal;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelGraphView;
import com.sofascore.results.event.statistics.view.football.PESMFootballGoalmapView;
import com.sofascore.results.main.tutorial.CompetitionsIntroModal;
import com.sofascore.results.main.tutorial.PulsatingFrameLayout;
import com.sofascore.results.tutorial.wizard.TutorialWizardView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class p6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p6(Function1 function1, SofascoreSmallRatingView sofascoreSmallRatingView) {
        this.a = 8;
        this.c = function1;
        this.b = sofascoreSmallRatingView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) fn0.i(valueAnimator);
                ((q6) obj2).r = num.intValue();
                ((Function1) obj).invoke(num);
                return;
            case 1:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i2 = AppBarLayout.B;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((qzb) obj).s(floatValue);
                Drawable drawable = appBarLayout.x;
                if (drawable instanceof qzb) {
                    ((qzb) drawable).s(floatValue);
                }
                Iterator it = appBarLayout.r.iterator();
                if (it.hasNext()) {
                    throw lnb.i(it);
                }
                Iterator it2 = appBarLayout.s.iterator();
                if (it2.hasNext()) {
                    throw lnb.i(it2);
                }
                return;
            case 2:
                CompetitionsIntroModal competitionsIntroModal = (CompetitionsIntroModal) obj;
                valueAnimator.getClass();
                Object animatedValue = ((ValueAnimator) obj2).getAnimatedValue();
                Float f2 = animatedValue instanceof Float ? (Float) animatedValue : null;
                if (f2 != null) {
                    f = f2.floatValue();
                }
                ((Guideline) competitionsIntroModal.K().c).setGuidelinePercent(f);
                return;
            case 3:
                CricketWagonWheelGraphView cricketWagonWheelGraphView = (CricketWagonWheelGraphView) obj2;
                int i3 = CricketWagonWheelGraphView.B;
                valueAnimator.getClass();
                LinkedHashMap linkedHashMap = cricketWagonWheelGraphView.v;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                linkedHashMap.put((i14) obj, (Float) animatedValue2);
                cricketWagonWheelGraphView.invalidate();
                return;
            case 4:
                CrowdsourcingOnboardingModal crowdsourcingOnboardingModal = (CrowdsourcingOnboardingModal) obj;
                valueAnimator.getClass();
                Object animatedValue3 = ((ValueAnimator) obj2).getAnimatedValue();
                Float f3 = animatedValue3 instanceof Float ? (Float) animatedValue3 : null;
                if (f3 != null) {
                    f = f3.floatValue();
                }
                String.valueOf(f);
                ugj.a.getClass();
                z82 z82Var = crowdsourcingOnboardingModal.w;
                if (z82Var == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                MaterialButton materialButton = (MaterialButton) z82Var.c;
                ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    return;
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = f;
                materialButton.setLayoutParams(layoutParams2);
                return;
            case 5:
                my4 my4Var = (my4) obj2;
                l51 l51Var = (l51) obj;
                if (l51Var.b(true) && l51Var.m != 0 && my4Var.isVisible()) {
                    my4Var.invalidateSelf();
                    return;
                }
                return;
            case 6:
                PESMFootballGoalmapView pESMFootballGoalmapView = (PESMFootballGoalmapView) obj2;
                x6k x6kVar = (x6k) obj;
                float floatValue2 = ((Float) fn0.i(valueAnimator)).floatValue();
                Point2D point2D = pESMFootballGoalmapView.v;
                if (point2D != null) {
                    rz8.T(point2D, (Point2D) x6kVar.b, (Point2D) x6kVar.c, floatValue2);
                }
                pESMFootballGoalmapView.invalidate();
                return;
            case 7:
                PulsatingFrameLayout pulsatingFrameLayout = (PulsatingFrameLayout) obj2;
                ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                int i4 = PulsatingFrameLayout.f;
                valueAnimator.getClass();
                ma9 ma9Var = pulsatingFrameLayout.e;
                if (ma9Var != null) {
                    Object animatedValue4 = valueAnimator2.getAnimatedValue();
                    animatedValue4.getClass();
                    ma9Var.f = ((Float) animatedValue4).floatValue();
                }
                pulsatingFrameLayout.invalidate();
                return;
            case 8:
                int i5 = SofascoreSmallRatingView.w;
                ((Function1) obj).invoke((Float) fn0.i(valueAnimator));
                ((SofascoreSmallRatingView) obj2).invalidate();
                return;
            case 9:
                TutorialWizardView tutorialWizardView = (TutorialWizardView) obj2;
                ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                int i6 = TutorialWizardView.r;
                valueAnimator.getClass();
                a3k a3kVar = tutorialWizardView.highlightDrawData;
                if (a3kVar != null) {
                    ma9 ma9Var2 = a3kVar.a;
                    Object animatedValue5 = valueAnimator3.getAnimatedValue();
                    animatedValue5.getClass();
                    ma9Var2.f = ((Float) animatedValue5).floatValue();
                }
                tutorialWizardView.invalidate();
                return;
            default:
                ((View) ((r8l) ((d4a) obj2).b).q.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ p6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
