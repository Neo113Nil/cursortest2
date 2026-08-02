package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lme extends r7 {
    public final Function2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lme(z82 z82Var, tug tugVar, eme emeVar) {
        super(z82Var, tugVar);
        tugVar.getClass();
        emeVar.getClass();
        this.f = emeVar;
    }

    @Override // defpackage.r7, defpackage.p8
    public final void b(int i, int i2, Object obj) {
        xle xleVar = (xle) obj;
        xleVar.getClass();
        o(xleVar, false);
    }

    @Override // defpackage.p8
    public final void c(int i, int i2, Object obj) {
        xle xleVar = (xle) obj;
        xleVar.getClass();
        o(xleVar, true);
    }

    public final void o(xle xleVar, boolean z) {
        ImageView p;
        FrameLayout e;
        ImageView p2;
        tug tugVar = (tug) this.e;
        z82 z82Var = (z82) this.d;
        LinearLayout linearLayout = (LinearLayout) z82Var.f;
        ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
        LinearLayout linearLayout2 = (LinearLayout) z82Var.g;
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) z82Var.e;
        tugVar.d(scrollInterceptorHorizontalScrollView);
        ok2 ok2Var = xleVar.a;
        List list = xleVar.c;
        AbstractPlayerSeasonStatistics.Companion companion = AbstractPlayerSeasonStatistics.INSTANCE;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlayerSeasonStatisticsInfo) it.next()).getStatistics());
        }
        AbstractPlayerSeasonStatistics aggregate = companion.aggregate(arrayList);
        if (aggregate != null) {
            Throwable th = null;
            tugVar.a(scrollInterceptorHorizontalScrollView, null);
            ((TextView) z82Var.d).setText(o3a.K(xleVar.b));
            List list2 = xleVar.d;
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    Throwable th2 = th;
                    b.q();
                    throw th2;
                }
                int intValue = ((Number) obj).intValue();
                if (i < linearLayout2.getChildCount()) {
                    View childAt = linearLayout2.getChildAt(i);
                    if (childAt == null) {
                        yhk.s("null cannot be cast to non-null type android.widget.ImageView");
                        return;
                    } else {
                        p2 = (ImageView) childAt;
                        p2.setVisibility(0);
                    }
                } else {
                    p2 = p();
                    linearLayout2.addView(p2);
                }
                p2.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                as9.o(p2, intValue);
                p2.setImageTintList(null);
                th = null;
                i = i2;
            }
            int size = list2.size();
            if (size < linearLayout2.getChildCount()) {
                View childAt2 = linearLayout2.getChildAt(size);
                if (childAt2 == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.ImageView");
                    return;
                } else {
                    p = (ImageView) childAt2;
                    p.setVisibility(0);
                }
            } else {
                p = p();
                linearLayout2.addView(p);
            }
            aik.Q(p).a();
            p.setImageResource(R.drawable.ic_chevron_down_large_16);
            p.setImageTintList(eq3.q(R.color.n_lv_1, p.getContext()));
            z8e.J(linearLayout2, list2.size());
            Iterator it2 = new tsk(linearLayout2).iterator();
            boolean z2 = false;
            Object obj2 = null;
            while (true) {
                usk uskVar = (usk) it2;
                if (!uskVar.hasNext()) {
                    break;
                }
                Object next = uskVar.next();
                if (((View) next).getVisibility() == 0) {
                    obj2 = next;
                    z2 = true;
                }
            }
            if (!z2) {
                ogj.m("Sequence contains no element matching the predicate.");
                return;
            }
            ImageView imageView = obj2 instanceof ImageView ? (ImageView) obj2 : null;
            if (imageView != null) {
                boolean z3 = xleVar.f;
                if (z) {
                    z8e.s(imageView, z3);
                } else if (z3) {
                    imageView.setRotation(-180.0f);
                } else {
                    imageView.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            Iterator it3 = ok2Var.b.iterator();
            int i3 = 0;
            while (it3.hasNext()) {
                Object next2 = it3.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    b.q();
                    throw null;
                }
                pk2 pk2Var = (pk2) next2;
                if (i3 < linearLayout.getChildCount()) {
                    View childAt3 = linearLayout.getChildAt(i3);
                    if (childAt3 == null) {
                        yhk.s("null cannot be cast to non-null type android.widget.FrameLayout");
                        return;
                    } else {
                        e = (FrameLayout) childAt3;
                        e.setVisibility(0);
                    }
                } else {
                    e = e();
                    linearLayout.addView(e);
                }
                r7.n(e, (String) pk2Var.c.invoke(aggregate), pk2Var.e, false);
                i3 = i4;
            }
            z8e.J(linearLayout, ok2Var.b.size() - 1);
            Context context = constraintLayout.getContext();
            constraintLayout.getClass();
            scrollInterceptorHorizontalScrollView.setOnTouchListener(new an1(new GestureDetector(context, new wsk(linearLayout, scrollInterceptorHorizontalScrollView, constraintLayout)), 1));
            constraintLayout.setOnClickListener(new eyd(4, this, xleVar));
            constraintLayout.post(new gjc(15, z82Var, this));
            ((MaterialDivider) z82Var.c).setVisibility(xleVar.e ? 0 : 8);
        }
    }

    public final ImageView p() {
        ImageView imageView = new ImageView(this.b);
        Context context = imageView.getContext();
        context.getClass();
        int s = ao2.s(16, context);
        Context context2 = imageView.getContext();
        context2.getClass();
        imageView.setLayoutParams(new LinearLayout.LayoutParams(s, ao2.s(16, context2)));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context3 = imageView.getContext();
        context3.getClass();
        marginLayoutParams.setMarginStart(ao2.s(4, context3));
        imageView.setLayoutParams(marginLayoutParams);
        return imageView;
    }
}
