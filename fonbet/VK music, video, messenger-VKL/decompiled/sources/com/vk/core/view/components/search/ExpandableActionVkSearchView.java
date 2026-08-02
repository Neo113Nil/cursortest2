package com.vk.core.view.components.search;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.asp;
import xsna.gzs;
import xsna.hbh0;
import xsna.krv0;
import xsna.s3q0;
import xsna.swe0;
import xsna.too0;
import xsna.y7q;
import xsna.zrp;

/* compiled from: ExpandableActionVkSearchView.kt */
/* loaded from: classes17.dex */
public final class ExpandableActionVkSearchView extends VkSearchView implements too0 {
    public ExpandState T;
    public float U;
    public final float V;
    public final float W;
    public final float a0;
    public final int b0;
    public final ArgbEvaluator c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public final ImageView h0;
    public ValueAnimator i0;
    public a j0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExpandableActionVkSearchView.kt */
    public static final class ExpandState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ExpandState[] $VALUES;
        public static final ExpandState COLLAPSED;
        public static final ExpandState COLLAPSING;
        public static final ExpandState EXPANDED;
        public static final ExpandState EXPANDING;

        static {
            ExpandState expandState = new ExpandState("COLLAPSED", 0);
            COLLAPSED = expandState;
            ExpandState expandState2 = new ExpandState("COLLAPSING", 1);
            COLLAPSING = expandState2;
            ExpandState expandState3 = new ExpandState("EXPANDING", 2);
            EXPANDING = expandState3;
            ExpandState expandState4 = new ExpandState("EXPANDED", 3);
            EXPANDED = expandState4;
            ExpandState[] expandStateArr = {expandState, expandState2, expandState3, expandState4};
            $VALUES = expandStateArr;
            $ENTRIES = new asp(expandStateArr);
        }

        public ExpandState() {
            throw null;
        }

        public static ExpandState valueOf(String str) {
            return (ExpandState) Enum.valueOf(ExpandState.class, str);
        }

        public static ExpandState[] values() {
            return (ExpandState[]) $VALUES.clone();
        }
    }

    /* compiled from: ExpandableActionVkSearchView.kt */
    public interface a {
        void a(float f);
    }

    public ExpandableActionVkSearchView(Context context) {
        super(context, null, 6, 0);
        this.T = ExpandState.COLLAPSED;
        this.V = hbh0.a(context, 36.0f);
        this.W = hbh0.a(context, 23.0f);
        this.a0 = -hbh0.a(context, 1.5f);
        this.b0 = -hbh0.b(12, context);
        this.c0 = new ArgbEvaluator();
        this.d0 = R.attr.vk_ui_icon_accent_themed;
        this.e0 = krv0.l(R.attr.vk_ui_icon_accent_themed);
        this.f0 = R.attr.vk_ui_icon_medium;
        this.g0 = krv0.l(R.attr.vk_ui_icon_medium);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(krv0.e(R.drawable.vk_icon_search_outline_28, context));
        this.h0 = imageView;
        ViewGroup viewGroup = (ViewGroup) getLeftIconContainerView().getParent();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hbh0.b(28, context), hbh0.b(28, context));
        layoutParams.setMarginStart(hbh0.b(6, context));
        layoutParams.gravity = 8388627;
        s3q0 s3q0Var = s3q0.a;
        viewGroup.addView(imageView, layoutParams);
    }

    public static void l5(ValueAnimator valueAnimator, ExpandableActionVkSearchView expandableActionVkSearchView) {
        expandableActionVkSearchView.setExpandFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void setExpandFraction(float f) {
        this.U = f;
        a aVar = this.j0;
        if (aVar != null) {
            aVar.a(f);
        }
        float f2 = 1 - f;
        float width = (getLeftBackgroundContainer().getWidth() - this.V) * f2;
        float f3 = this.b0 * f2;
        getLeftBackgroundContainer().setTranslationX(width);
        getRightBackgroundContainer().setTranslationX(f3);
        float f4 = swe0.f((f / 0.1f) - 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        getLeftBackgroundContainer().setAlpha(f4);
        getRightBackgroundContainer().setAlpha(f4);
        ColorStateList valueOf = ColorStateList.valueOf(((Integer) this.c0.evaluate(f, Integer.valueOf(this.e0), Integer.valueOf(this.g0))).intValue());
        getSearchIconImageView().setImageTintList(valueOf);
        ImageView imageView = this.h0;
        imageView.setImageTintList(valueOf);
        getLeftIconContainerView().setTranslationX(width);
        float f5 = this.a0 * f;
        imageView.setTranslationX(width + f5);
        imageView.setTranslationY(f5);
        float f6 = 1.0f - (0.4f * f);
        float f7 = (f2 * 0.3f) + 1.0f;
        imageView.setScaleX(f6);
        imageView.setScaleY(f6);
        getSearchIconImageView().setScaleX(f7);
        getSearchIconImageView().setScaleY(f7);
        imageView.setAlpha(swe0.f(f2 - 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) / 0.1f);
        getSearchIconImageView().setAlpha(swe0.f(f - 0.7f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) / 0.1f);
        getEditView().setTranslationX(width);
        getEditView().setAlpha(swe0.f(f - 0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f) / 0.3f);
        float f8 = f / 0.3f;
        getActionsContainer().setAlpha(f8 <= 1.0f ? f8 : 1.0f);
        getActionsContainer().setTranslationX(f3);
        setTranslationX(this.W * f2);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.g0 = krv0.l(this.f0);
        this.e0 = krv0.l(this.d0);
    }

    public final ExpandState getExpandState() {
        return this.T;
    }

    public final void m5(boolean z, gzs<s3q0> gzsVar) {
        float[] fArr;
        ExpandState expandState = z ? ExpandState.EXPANDED : ExpandState.COLLAPSED;
        if (expandState == (this.T.ordinal() <= 1 ? ExpandState.COLLAPSED : ExpandState.EXPANDED)) {
            ValueAnimator valueAnimator = this.i0;
            if (valueAnimator != null) {
                valueAnimator.addListener(new b(gzsVar));
                return;
            } else {
                gzsVar.invoke();
                return;
            }
        }
        expandState.getClass();
        this.T = ExpandState.values()[swe0.g(expandState.ordinal(), 1, 2)];
        ValueAnimator valueAnimator2 = this.i0;
        if (valueAnimator2 != null) {
            valueAnimator2.pause();
        }
        ValueAnimator valueAnimator3 = this.i0;
        Object animatedValue = valueAnimator3 != null ? valueAnimator3.getAnimatedValue() : null;
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        int compareTo = expandState.compareTo(ExpandState.EXPANDING);
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (compareTo >= 0) {
            if (f != null) {
                f2 = f.floatValue();
            }
            fArr = new float[]{f2, 1.0f};
        } else {
            fArr = new float[]{f != null ? f.floatValue() : 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(Arrays.copyOf(fArr, fArr.length));
        ofFloat.setDuration((long) (Math.abs(fArr[0] - fArr[1]) * 300));
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new y7q(0, ofFloat, this));
        ofFloat.addListener(new c(expandState, gzsVar));
        ofFloat.start();
        this.i0 = ofFloat;
    }

    public final void setExpandFractionListener(a aVar) {
        this.j0 = aVar;
        if (aVar != null) {
            aVar.a(this.U);
        }
    }

    public final void setExpanded(boolean z) {
        ValueAnimator valueAnimator = this.i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.i0 = null;
        this.T = z ? ExpandState.EXPANDED : ExpandState.COLLAPSED;
        setExpandFraction(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* compiled from: Animator.kt */
    public static final class b implements Animator.AnimatorListener {
        public final /* synthetic */ gzs b;

        public b(gzs gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            gzs gzsVar = this.b;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Animator.kt */
    public static final class c implements Animator.AnimatorListener {
        public final /* synthetic */ ExpandState c;
        public final /* synthetic */ gzs d;

        public c(ExpandState expandState, gzs gzsVar) {
            this.c = expandState;
            this.d = gzsVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ExpandableActionVkSearchView expandableActionVkSearchView = ExpandableActionVkSearchView.this;
            expandableActionVkSearchView.i0 = null;
            expandableActionVkSearchView.T = this.c;
            gzs gzsVar = this.d;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
