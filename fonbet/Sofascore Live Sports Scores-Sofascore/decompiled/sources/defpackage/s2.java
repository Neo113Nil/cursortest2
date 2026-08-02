package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blaze.blazesdk.custom_views.BlazeDefaultTimeBar;
import com.google.android.material.slider.b;
import com.sofascore.model.newNetwork.RunsPerOverGraphPoint;
import com.sofascore.results.event.details.view.cricket.runsperover.CricketRunsPerOverGraphView;
import com.sofascore.results.view.EventListScoreTextView;
import com.sofascore.results.view.SofascoreRatingView;
import com.sofascore.results.view.graph.AttributeOverviewGraph;
import com.sofascore.results.view.graph.networkanimation.PassingNetworkAnimationView;
import com.sofascore.results.view.header.widget.RollingTextView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LinkedHashMap linkedHashMap;
        char c;
        final LinkedHashMap linkedHashMap2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                valueAnimator.getClass();
                LinearLayout linearLayout = ((t2) obj).d.a;
                linearLayout.getClass();
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                }
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                layoutParams.height = ((Integer) animatedValue).intValue();
                linearLayout.setLayoutParams(layoutParams);
                return;
            case 1:
                AttributeOverviewGraph attributeOverviewGraph = (AttributeOverviewGraph) obj;
                int i2 = AttributeOverviewGraph.G;
                attributeOverviewGraph.E = ((Float) fn0.i(valueAnimator)).floatValue();
                attributeOverviewGraph.invalidate();
                return;
            case 2:
                valueAnimator.getClass();
                ViewGroup viewGroup = ((u11) obj).a;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                viewGroup.setMinimumHeight(((Integer) animatedValue2).intValue());
                return;
            case 3:
                b bVar = (b) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = bVar.l.iterator();
                while (it.hasNext()) {
                    skj skjVar = (skj) it.next();
                    skjVar.U = floatValue;
                    skjVar.V = floatValue;
                    skjVar.Y = e80.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.19f, 1.0f, floatValue);
                    skjVar.invalidateSelf();
                }
                bVar.postInvalidateOnAnimation();
                return;
            case 4:
                BlazeDefaultTimeBar blazeDefaultTimeBar = (BlazeDefaultTimeBar) obj;
                BlazeDefaultTimeBar.a aVar = BlazeDefaultTimeBar.e0;
                blazeDefaultTimeBar.Q = ((Float) fn0.i(valueAnimator)).floatValue();
                blazeDefaultTimeBar.invalidate();
                return;
            case 5:
                final CricketRunsPerOverGraphView cricketRunsPerOverGraphView = (CricketRunsPerOverGraphView) obj;
                int i3 = CricketRunsPerOverGraphView.J;
                cricketRunsPerOverGraphView.v = ((Float) fn0.i(valueAnimator)).floatValue();
                ArrayList arrayList = cricketRunsPerOverGraphView.H;
                LinkedHashMap linkedHashMap3 = cricketRunsPerOverGraphView.x;
                LinkedHashMap linkedHashMap4 = cricketRunsPerOverGraphView.y;
                Pair pair = cricketRunsPerOverGraphView.s;
                if (pair != null) {
                    Pair[] pairArr = {new Pair((List) pair.a, m4j.HOME), new Pair((List) pair.b, m4j.AWAY)};
                    for (int i4 = 0; i4 < 2; i4++) {
                        Pair pair2 = pairArr[i4];
                        List list = (List) pair2.a;
                        m4j m4jVar = (m4j) pair2.b;
                        if (list != null) {
                            final int i5 = 0;
                            for (Object obj2 : list) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    kotlin.collections.b.q();
                                    throw null;
                                }
                                RunsPerOverGraphPoint runsPerOverGraphPoint = (RunsPerOverGraphPoint) obj2;
                                int ordinal = m4jVar.ordinal();
                                if (ordinal == 0) {
                                    linkedHashMap = linkedHashMap3;
                                } else {
                                    if (ordinal != 1) {
                                        zzl.b();
                                        return;
                                    }
                                    linkedHashMap = linkedHashMap4;
                                }
                                boolean z = linkedHashMap.getOrDefault(Integer.valueOf(i5), null) == null;
                                boolean z2 = arrayList.isEmpty() && ((Number) linkedHashMap.getOrDefault(Integer.valueOf(i5), Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))).floatValue() < 0.99f;
                                if (runsPerOverGraphPoint.getOver() > cricketRunsPerOverGraphView.v || !(z || z2)) {
                                    c = 2;
                                } else {
                                    int ordinal2 = m4jVar.ordinal();
                                    if (ordinal2 == 0) {
                                        linkedHashMap2 = linkedHashMap3;
                                    } else {
                                        if (ordinal2 != 1) {
                                            zzl.b();
                                            return;
                                        }
                                        linkedHashMap2 = linkedHashMap4;
                                    }
                                    c = 2;
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                    ofFloat.setInterpolator(new LinearInterpolator());
                                    ofFloat.setDuration(200L);
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t04
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            int i7 = CricketRunsPerOverGraphView.J;
                                            valueAnimator2.getClass();
                                            Integer valueOf = Integer.valueOf(i5);
                                            Object animatedValue3 = valueAnimator2.getAnimatedValue();
                                            animatedValue3.getClass();
                                            linkedHashMap2.put(valueOf, (Float) animatedValue3);
                                            cricketRunsPerOverGraphView.invalidate();
                                        }
                                    });
                                    ofFloat.start();
                                    arrayList.add(ofFloat);
                                }
                                i5 = i6;
                            }
                        }
                    }
                }
                cricketRunsPerOverGraphView.invalidate();
                return;
            case 6:
                ht4 ht4Var = (ht4) obj;
                ht4Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ht4Var.invalidate(ht4Var.a);
                return;
            case 7:
                it4 it4Var = (it4) obj;
                it4Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                it4Var.invalidate(it4Var.a);
                return;
            case 8:
                my4 my4Var = (my4) obj;
                my4Var.p.e = my4Var.u.getInterpolation(my4Var.t.getAnimatedFraction());
                return;
            case 9:
                m41 m41Var = (m41) obj;
                m41Var.b = ((Float) fn0.i(valueAnimator)).floatValue();
                ((PassingNetworkAnimationView) m41Var.c).invalidate();
                return;
            case 10:
                ((ed5) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                EventListScoreTextView eventListScoreTextView = (EventListScoreTextView) obj;
                int i7 = EventListScoreTextView.i;
                eventListScoreTextView.h = ((Float) fn0.i(valueAnimator)).floatValue();
                eventListScoreTextView.requestLayout();
                eventListScoreTextView.invalidate();
                return;
            case 12:
                gmb gmbVar = (gmb) obj;
                bl0 bl0Var = gmbVar.L;
                if (bl0Var == null) {
                    bl0Var = bl0.a;
                }
                if (bl0Var == bl0.b) {
                    gmbVar.invalidateSelf();
                    return;
                }
                tg3 tg3Var = gmbVar.o;
                if (tg3Var != null) {
                    tg3Var.r(gmbVar.b.a());
                    return;
                }
                return;
            case 13:
                hzb hzbVar = (hzb) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hzbVar.k.setAlpha((int) (255.0f * floatValue2));
                hzbVar.y = floatValue2;
                return;
            case 14:
                hse.n((hse) obj, valueAnimator);
                return;
            case 15:
                RollingTextView rollingTextView = (RollingTextView) obj;
                int i8 = RollingTextView.k;
                rollingTextView.yAnimate = ((Float) fn0.i(valueAnimator)).floatValue();
                rollingTextView.requestLayout();
                rollingTextView.invalidate();
                return;
            case 16:
                htg htgVar = (htg) obj;
                htgVar.c = ((Float) fn0.i(valueAnimator)).floatValue();
                htgVar.invalidate();
                return;
            case 17:
                jtg jtgVar = (jtg) obj;
                float floatValue3 = ((Float) fn0.i(valueAnimator)).floatValue();
                if (jtgVar.f) {
                    jtgVar.d = 1.0f - floatValue3;
                } else {
                    jtgVar.e = floatValue3;
                }
                jtgVar.setAlpha((int) ((1.0f - ((float) Math.pow(1.0f - floatValue3, 2.0d))) * jtgVar.i));
                jtgVar.invalidateSelf();
                return;
            case 18:
                KProperty[] kPropertyArr = SofascoreRatingView.A;
                ((Function1) obj).invoke((Float) fn0.i(valueAnimator));
                return;
            case 19:
                KProperty[] kPropertyArr2 = SofascoreRatingView.A;
                ((hvh) obj).invoke((Double) fn0.i(valueAnimator));
                return;
            case 20:
                com.mbridge.msdk.config.component.animation.b.a((GradientDrawable) obj, valueAnimator);
                return;
            case 21:
                com.mbridge.msdk.config.component.animation.b.a((TextView) obj, valueAnimator);
                return;
            case 22:
                com.mbridge.msdk.config.component.animation.b.a((ImageView) obj, valueAnimator);
                return;
            default:
                int i9 = l5m.h;
                valueAnimator.getClass();
                ((l5m) obj).invalidateSelf();
                return;
        }
    }
}
