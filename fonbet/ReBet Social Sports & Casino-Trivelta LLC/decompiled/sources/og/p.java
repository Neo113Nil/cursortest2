package og;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC5885k;
import od.AbstractC5886l;

/* loaded from: classes4.dex */
public abstract class p {
    public static final void A(View view, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i10, i11, i12, i13);
    }

    public static /* synthetic */ void B(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            i10 = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        }
        if ((i14 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i11 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        }
        if ((i14 & 4) != 0) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            i12 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0;
        }
        if ((i14 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            i13 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        }
        A(view, i10, i11, i12, i13);
    }

    public static final void b(View view, GradientDrawable.Orientation orientation, int... colors) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(colors, "colors");
        view.setBackground(new GradientDrawable(orientation, colors));
    }

    public static final void c(View view, int i10, Integer num, int i11, Integer num2, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(i10);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        gradientDrawable.setDither(true);
        gradientDrawable.setShape(0);
        if (num2 != null && i11 > 0) {
            gradientDrawable.setStroke(i11, num2.intValue());
        }
        view.setBackground(gradientDrawable);
        view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        view.setClipToOutline(z10);
    }

    public static /* synthetic */ void d(View view, int i10, Integer num, int i11, Integer num2, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            num = -16777216;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            num2 = -16777216;
        }
        if ((i12 & 16) != 0) {
            z10 = true;
        }
        c(view, i10, num, i11, num2, z10);
    }

    public static final void e(View view, float[] fArr) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        i(view, fArr, null, null, null, null, false, 62, null);
    }

    public static final void f(View view, float[] fArr, Integer num) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        i(view, fArr, num, null, null, null, false, 60, null);
    }

    public static final void g(View view, float[] fArr, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        i(view, fArr, num, num2, null, null, false, 56, null);
    }

    public static final void h(View view, float[] fArr, Integer num, Integer num2, int[] iArr, GradientDrawable.Orientation orientation, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setBackground(m(fArr, num, num2, null, null, orientation, iArr, 24, null));
        view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        view.setClipToOutline(z10);
    }

    public static /* synthetic */ void i(View view, float[] fArr, Integer num, Integer num2, int[] iArr, GradientDrawable.Orientation orientation, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fArr = null;
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            iArr = null;
        }
        if ((i10 & 16) != 0) {
            orientation = null;
        }
        if ((i10 & 32) != 0) {
            z10 = true;
        }
        h(view, fArr, num, num2, iArr, orientation, z10);
    }

    public static final void j(final View view, long j10, Function0 function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getParent() != null) {
            int measuredHeight = view.getMeasuredHeight();
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            view.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup) parent).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight2 = view.getMeasuredHeight();
            ViewParent parent2 = view.getParent();
            Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            view.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup) parent2).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("height", measuredHeight, measuredHeight2));
            ofPropertyValuesHolder.setDuration(j10);
            ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: og.o
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    p.k(view, valueAnimator);
                }
            });
            Intrinsics.checkNotNull(ofPropertyValuesHolder);
            ofPropertyValuesHolder.addListener(new a(view, function0));
            ofPropertyValuesHolder.start();
        }
    }

    public static final void k(View this_expand, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this_expand, "$this_expand");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = this_expand.getLayoutParams();
        layoutParams.height = intValue;
        this_expand.setLayoutParams(layoutParams);
    }

    public static final GradientDrawable l(float[] fArr, Integer num, Integer num2, Integer num3, Integer num4, GradientDrawable.Orientation orientation, int[] iArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (num2 != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(num2.intValue()));
        }
        if (iArr != null) {
            gradientDrawable.setColors(iArr);
            if (orientation == null) {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            }
            gradientDrawable.setOrientation(orientation);
        }
        gradientDrawable.setDither(true);
        if (fArr != null) {
            gradientDrawable.setCornerRadii(fArr);
        } else if (num != null) {
            gradientDrawable.setCornerRadius(num.intValue());
        }
        if (i.e(num3) && i.e(num4)) {
            gradientDrawable.setStroke(num3.intValue(), num4.intValue());
        }
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    public static /* synthetic */ GradientDrawable m(float[] fArr, Integer num, Integer num2, Integer num3, Integer num4, GradientDrawable.Orientation orientation, int[] iArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fArr = null;
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        if ((i10 & 8) != 0) {
            num3 = null;
        }
        if ((i10 & 16) != 0) {
            num4 = null;
        }
        if ((i10 & 32) != 0) {
            orientation = null;
        }
        if ((i10 & 64) != 0) {
            iArr = null;
        }
        return l(fArr, num, num2, num3, num4, orientation, iArr);
    }

    public static final void n(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public static final boolean o(View view) {
        return view != null && view.getVisibility() == 8;
    }

    public static final boolean p(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static final void q(View view, int i10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        v(view, i10, null, null, false, 0, 30, null);
    }

    public static final void r(View view, int i10, float[] fArr) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        v(view, i10, fArr, null, false, 0, 28, null);
    }

    public static final void s(View view, int i10, float[] fArr, Integer num) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        v(view, i10, fArr, num, false, 0, 24, null);
    }

    public static final void t(View view, int i10, float[] fArr, Integer num, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        v(view, i10, fArr, num, z10, 0, 16, null);
    }

    public static final void u(View view, int i10, float[] fArr, Integer num, boolean z10, int i11) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            view.setBackground(new RippleDrawable(ColorStateList.valueOf(i11), m(fArr, num, Integer.valueOf(i10), null, null, null, null, 120, null), null));
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            view.setClipToOutline(z10);
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
    }

    public static /* synthetic */ void v(View view, int i10, float[] fArr, Integer num, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            fArr = null;
        }
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        if ((i12 & 16) != 0) {
            i11 = P.e(view.getContext(), AbstractC5886l.f59772T2);
        }
        u(view, i10, fArr, num, z10, i11);
    }

    public static final void w(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public static final void x(View view, boolean z10, Long l10, boolean z11, Function0 function0) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), z10 ? AbstractC5885k.f59692b : AbstractC5885k.f59691a);
        if (z11) {
            if (p(view)) {
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            w(view);
        } else if (o(view)) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (l10 != null) {
            long longValue = l10.longValue();
            if (loadAnimation != null) {
                loadAnimation.setDuration(longValue);
            }
        }
        view.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new b(z11, view, function0));
    }

    public static final void y(View view, Long l10, boolean z10, Function0 function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        x(view, true, l10, z10, function0);
    }

    public static /* synthetic */ void z(View view, Long l10, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        y(view, l10, z10, function0);
    }

    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f61226a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f61227b;

        public a(View view, Function0 function0) {
            this.f61226a = view;
            this.f61227b = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f61226a.getLayoutParams().height = -2;
            this.f61226a.requestLayout();
            Function0 function0 = this.f61227b;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static final class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f61228a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f61229b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f61230c;

        public b(boolean z10, View view, Function0 function0) {
            this.f61228a = z10;
            this.f61229b = view;
            this.f61230c = function0;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (!this.f61228a) {
                p.n(this.f61229b);
            }
            Function0 function0 = this.f61230c;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
