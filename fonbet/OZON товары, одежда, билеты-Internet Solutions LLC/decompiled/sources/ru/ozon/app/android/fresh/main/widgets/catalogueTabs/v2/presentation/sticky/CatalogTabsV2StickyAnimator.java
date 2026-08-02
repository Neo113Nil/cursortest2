package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky;

import Bu.d;
import Bu.e;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.utils.FigmaInterpolator;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/sticky/CatalogTabsV2StickyAnimator;", "", "view", "Landroid/view/View;", "getTargetHeight", "Lkotlin/Function0;", "", "onPositionView", "", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "currentAnimator", "Landroid/animation/ValueAnimator;", "targetVisible", "", "setTargetVisibility", "visible", "animated", "cancel", "applyVisibilityImmediate", "isVisible", "isDisplayMatchingTarget", "animateAppearance", "animateDisappearance", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsV2StickyAnimator {
    private ValueAnimator currentAnimator;

    @NotNull
    private final Function0<Integer> getTargetHeight;

    @NotNull
    private final Function0<Unit> onPositionView;
    private boolean targetVisible;

    @NotNull
    private final View view;

    public CatalogTabsV2StickyAnimator(@NotNull View view, @NotNull Function0<Integer> getTargetHeight, @NotNull Function0<Unit> onPositionView) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(getTargetHeight, "getTargetHeight");
        Intrinsics.checkNotNullParameter(onPositionView, "onPositionView");
        this.view = view;
        this.getTargetHeight = getTargetHeight;
        this.onPositionView = onPositionView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateAppearance() {
        int intValue = this.getTargetHeight.invoke().intValue();
        if (intValue <= 0) {
            return;
        }
        this.onPositionView.invoke();
        View view = this.view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = 0;
        view.setLayoutParams(layoutParams);
        this.view.setVisibility(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, intValue);
        ofInt.setInterpolator(FigmaInterpolator.INSTANCE.getEaseOut());
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new e(this, 1));
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2StickyAnimator$animateAppearance$lambda$7$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                boolean z11;
                View view2;
                CatalogTabsV2StickyAnimator.this.currentAnimator = null;
                z11 = CatalogTabsV2StickyAnimator.this.targetVisible;
                if (!z11) {
                    CatalogTabsV2StickyAnimator.this.animateDisappearance();
                    return;
                }
                view2 = CatalogTabsV2StickyAnimator.this.view;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = -2;
                view2.setLayoutParams(layoutParams2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofInt.start();
        this.currentAnimator = ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateAppearance$lambda$7$lambda$4(CatalogTabsV2StickyAnimator catalogTabsV2StickyAnimator, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        View view = catalogTabsV2StickyAnimator.view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateDisappearance() {
        if (this.view.getVisibility() != 0) {
            this.view.setVisibility(4);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
            return;
        }
        int height = this.view.getHeight();
        if (height <= 0) {
            this.view.setVisibility(4);
            View view2 = this.view;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = -2;
            view2.setLayoutParams(layoutParams2);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(height, 0);
        ofInt.setInterpolator(FigmaInterpolator.INSTANCE.getEaseOut());
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new d(this, 1));
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2StickyAnimator$animateDisappearance$lambda$14$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                boolean z11;
                View view3;
                View view4;
                CatalogTabsV2StickyAnimator.this.currentAnimator = null;
                z11 = CatalogTabsV2StickyAnimator.this.targetVisible;
                if (z11) {
                    CatalogTabsV2StickyAnimator.this.animateAppearance();
                    return;
                }
                view3 = CatalogTabsV2StickyAnimator.this.view;
                view3.setVisibility(4);
                view4 = CatalogTabsV2StickyAnimator.this.view;
                ViewGroup.LayoutParams layoutParams3 = view4.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams3.height = -2;
                view4.setLayoutParams(layoutParams3);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofInt.start();
        this.currentAnimator = ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDisappearance$lambda$14$lambda$11(CatalogTabsV2StickyAnimator catalogTabsV2StickyAnimator, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        View view = catalogTabsV2StickyAnimator.view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
    }

    private final void applyVisibilityImmediate(boolean isVisible) {
        this.targetVisible = isVisible;
        cancel();
        if (!isVisible) {
            this.view.setVisibility(4);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
            return;
        }
        this.onPositionView.invoke();
        View view2 = this.view;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = -2;
        view2.setLayoutParams(layoutParams2);
        this.view.setVisibility(0);
    }

    private final boolean isDisplayMatchingTarget() {
        return this.targetVisible ? this.view.getVisibility() == 0 && this.view.getHeight() > 0 : this.view.getVisibility() != 0;
    }

    public final void cancel() {
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentAnimator = null;
    }

    public final void setTargetVisibility(boolean visible, boolean animated) {
        if (visible == this.targetVisible && isDisplayMatchingTarget() && this.currentAnimator == null) {
            return;
        }
        this.targetVisible = visible;
        cancel();
        if (!animated) {
            applyVisibilityImmediate(visible);
        } else if (visible) {
            animateAppearance();
        } else {
            animateDisappearance();
        }
    }
}
