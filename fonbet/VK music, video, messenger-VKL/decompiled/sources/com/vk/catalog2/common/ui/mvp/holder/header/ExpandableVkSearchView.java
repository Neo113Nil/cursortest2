package com.vk.catalog2.common.ui.mvp.holder.header;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.header.ExpandableVkSearchView;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.HashSet;
import xsna.abg0;
import xsna.asp;
import xsna.dhr0;
import xsna.f4m;
import xsna.f9q;
import xsna.fnj;
import xsna.iah0;
import xsna.ou5;
import xsna.s3q0;
import xsna.swe0;
import xsna.too0;
import xsna.zrp;

/* compiled from: ExpandableVkSearchView.kt */
/* loaded from: classes16.dex */
public final class ExpandableVkSearchView extends VkSearchView implements too0 {
    public ExpandState T;
    public float U;
    public final float V;
    public float W;
    public final float a0;
    public final int b0;
    public final int c0;
    public final ArgbEvaluator d0;
    public final int e0;
    public int f0;
    public final int g0;
    public int h0;
    public final ImageView i0;
    public View j0;
    public ValueAnimator k0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExpandableVkSearchView.kt */
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

        /* JADX WARN: Multi-variable type inference failed */
        public final ExpandState h() {
            return (ExpandState) $ENTRIES.get(swe0.g(ordinal(), 1, 2));
        }
    }

    public ExpandableVkSearchView(Context context) {
        super(context, null, 0);
        this.T = ExpandState.COLLAPSED;
        this.V = iah0.b(36.0f);
        this.W = iah0.b(4.0f);
        this.a0 = iah0.b(22.0f);
        this.b0 = -iah0.a(1.5f);
        this.c0 = -iah0.a(12);
        this.d0 = new ArgbEvaluator();
        this.e0 = R.attr.toolbarIconsColor;
        abg0 abg0Var = dhr0.t;
        this.f0 = abg0Var.c(R.attr.toolbarIconsColor);
        this.g0 = R.attr.vk_ui_icon_medium;
        this.h0 = abg0Var.c(R.attr.vk_ui_icon_medium);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(abg0Var.a(R.drawable.vk_icon_search_outline_28));
        this.i0 = imageView;
        ViewGroup viewGroup = (ViewGroup) getLeftIconContainerView().getParent();
        float f = 28;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f));
        layoutParams.setMarginStart(iah0.a(6));
        layoutParams.gravity = 8388627;
        s3q0 s3q0Var = s3q0.a;
        viewGroup.addView(imageView, layoutParams);
        f4m.r(0, getBackgroundContainer());
        f4m.s(0, getBackgroundContainer());
        f4m.j(getBackButton());
        setVoiceInputEnabled(false);
        getSearchIconImageView().setBackground(null);
    }

    public static void l5(ValueAnimator valueAnimator, ExpandableVkSearchView expandableVkSearchView) {
        expandableVkSearchView.setExpandFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void m5(ExpandableVkSearchView expandableVkSearchView) {
        expandableVkSearchView.setExpandFraction(expandableVkSearchView.U);
    }

    private final void setExpandFraction(float f) {
        this.U = f;
        float f2 = 1 - f;
        float width = ((getLeftBackgroundContainer().getWidth() - this.V) * f2) - this.W;
        float f3 = 4;
        float a = (this.c0 * f2) - iah0.a(f3);
        getLeftBackgroundContainer().setTranslationX(width);
        getRightBackgroundContainer().setTranslationX(a);
        float f4 = swe0.f((f / 0.1f) - 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        getLeftBackgroundContainer().setAlpha(f4);
        getRightBackgroundContainer().setAlpha(f4);
        ColorStateList valueOf = ColorStateList.valueOf(((Integer) this.d0.evaluate(f, Integer.valueOf(this.f0), Integer.valueOf(this.h0))).intValue());
        getSearchIconImageView().setImageTintList(valueOf);
        ImageView imageView = this.i0;
        imageView.setImageTintList(valueOf);
        getLeftIconContainerView().setTranslationX(iah0.a(f3) + width);
        float f5 = this.b0 * f;
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
        getEditView().setAlpha(swe0.f((f - 0.6f) * 2.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        View view = this.j0;
        if (view != null) {
            view.setAlpha(swe0.f(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        }
        float f8 = f / 0.3f;
        getActionsContainer().setAlpha(f8 <= 1.0f ? f8 : 1.0f);
        getActionsContainer().setTranslationX(a);
        setTranslationX(this.a0 * f2);
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        this.h0 = abg0Var.c(this.g0);
        this.f0 = abg0Var.c(this.e0);
    }

    public final void n5(View.OnClickListener onClickListener, View view) {
        this.j0 = view;
        setOnActionSearchQueryClick(onClickListener);
        getEditView().setFocusable(0);
        getEditView().setLongClickable(false);
        Context context = view.getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            this.W = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f4m.s(getSelfMargin(), view);
        } else {
            this.W = getSelfMargin();
            f4m.s(0, view);
        }
        setExpanded(false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(new ou5(this, 4));
    }

    public final void setExpanded(boolean z) {
        ValueAnimator valueAnimator = this.k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.k0 = null;
        this.T = z ? ExpandState.EXPANDED : ExpandState.COLLAPSED;
        setExpandFraction(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void setExpandedWithAnimation(boolean z) {
        float[] fArr;
        ExpandState expandState = z ? ExpandState.EXPANDED : ExpandState.COLLAPSED;
        if (expandState == (this.T.ordinal() <= 1 ? ExpandState.COLLAPSED : ExpandState.EXPANDED)) {
            return;
        }
        this.T = expandState.h();
        ValueAnimator valueAnimator = this.k0;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        ValueAnimator valueAnimator2 = this.k0;
        Object animatedValue = valueAnimator2 != null ? valueAnimator2.getAnimatedValue() : null;
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
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(Arrays.copyOf(fArr, fArr.length));
        ofFloat.setDuration((long) (Math.abs(fArr[0] - fArr[1]) * 300));
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.e9q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                ExpandableVkSearchView.l5(ofFloat, this);
            }
        });
        ofFloat.addListener(new f9q(this, expandState));
        ofFloat.start();
        this.k0 = ofFloat;
    }
}
