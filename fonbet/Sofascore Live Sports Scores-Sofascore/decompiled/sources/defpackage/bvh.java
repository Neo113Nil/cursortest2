package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bvh implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Comparable e;

    public /* synthetic */ bvh(boolean z, Double d, boolean z2, boolean z3) {
        this.b = z;
        this.e = d;
        this.c = z2;
        this.d = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        Comparable comparable = this.e;
        boolean z3 = this.b;
        switch (i) {
            case 0:
                p75 p75Var = (p75) comparable;
                Context context = (Context) obj;
                context.getClass();
                FrameLayout frameLayout = new FrameLayout(context);
                SofascoreSmallRatingView sofascoreSmallRatingView = new SofascoreSmallRatingView(context, null, 6);
                sofascoreSmallRatingView.setAvgRating(z3);
                sofascoreSmallRatingView.setMinimumWidth(z3 ? ao2.s(32, context) : ao2.s(24, context));
                sofascoreSmallRatingView.setMinWidth(z3 ? ao2.s(32, context) : ao2.s(24, context));
                sofascoreSmallRatingView.setShouldAnimate(z2);
                if (!z) {
                    sofascoreSmallRatingView.setPaddingRelative(0, 0, 0, 0);
                }
                if (p75Var != null) {
                    sofascoreSmallRatingView.setTextSize(1, p75Var.a);
                }
                frameLayout.addView(sofascoreSmallRatingView);
                return frameLayout;
            default:
                Double d = (Double) comparable;
                FrameLayout frameLayout2 = (FrameLayout) obj;
                Double valueOf = Double.valueOf(0.0d);
                frameLayout2.getClass();
                View childAt = frameLayout2.getChildAt(0);
                SofascoreSmallRatingView sofascoreSmallRatingView2 = childAt instanceof SofascoreSmallRatingView ? (SofascoreSmallRatingView) childAt : null;
                if (sofascoreSmallRatingView2 != null) {
                    if (z3) {
                        SofascoreSmallRatingView.k(sofascoreSmallRatingView2, d, 2);
                    } else if (z2 && !z) {
                        sofascoreSmallRatingView2.setRatingWithoutAnimation(d);
                    } else if (z2 && ph0.a0(new Double[]{null, valueOf}).contains(d)) {
                        SofascoreSmallRatingView.k(sofascoreSmallRatingView2, valueOf, 6);
                    } else {
                        double d2 = sofascoreSmallRatingView2.h;
                        if (d == null || d2 != d.doubleValue()) {
                            if (d == null) {
                                sofascoreSmallRatingView2.j();
                            } else if (sofascoreSmallRatingView2.h == 0.0d && sofascoreSmallRatingView2.shouldAnimate) {
                                SofascoreSmallRatingView.k(sofascoreSmallRatingView2, d, 6);
                            } else {
                                if (!sofascoreSmallRatingView2.shouldAnimate) {
                                    sofascoreSmallRatingView2.i = 0L;
                                }
                                sofascoreSmallRatingView2.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                sofascoreSmallRatingView2.o = d.doubleValue() > sofascoreSmallRatingView2.h ? 1 : 2;
                                Context context2 = sofascoreSmallRatingView2.getContext();
                                context2.getClass();
                                int u = kpg.u(context2, d.doubleValue(), Integer.valueOf(sofascoreSmallRatingView2.isAvgRating ? 2 : 1));
                                sofascoreSmallRatingView2.q.setColor(u);
                                ArrayList arrayList = new ArrayList();
                                ValueAnimator h = sofascoreSmallRatingView2.h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, sofascoreSmallRatingView2.i, new lvh(sofascoreSmallRatingView2, 1));
                                h.addListener(new z54(sofascoreSmallRatingView2, u, 1));
                                arrayList.add(h);
                                arrayList.addAll(sofascoreSmallRatingView2.g(sofascoreSmallRatingView2.h, d.doubleValue()));
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(arrayList);
                                animatorSet.start();
                                AnimatorSet animatorSet2 = sofascoreSmallRatingView2.v;
                                if (animatorSet2 != null) {
                                    animatorSet2.cancel();
                                }
                                sofascoreSmallRatingView2.v = animatorSet;
                                sofascoreSmallRatingView2.h = d.doubleValue();
                            }
                        }
                    }
                }
                return Unit.a;
        }
    }

    public /* synthetic */ bvh(boolean z, boolean z2, boolean z3, p75 p75Var) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = p75Var;
    }
}
