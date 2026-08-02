package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.util;

import Bi.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.util.CollapseAnimationHelper;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/util/CollapseAnimationHelper;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "resetInternal", "(Landroid/view/View;)V", "Lkotlin/Function0;", "onComplete", "collapse", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "", "duration", "", "fadeOut", "Landroid/view/animation/Interpolator;", "interpolator", "animateCollapse", "(Landroid/view/View;JZLandroid/view/animation/Interpolator;Lkotlin/jvm/functions/Function0;)V", "resetIfNotAnimating", "(Landroid/view/View;)Z", "animationDuration", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "Landroid/animation/ValueAnimator;", "activeAnimator", "Landroid/animation/ValueAnimator;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CollapseAnimationHelper {
    private ValueAnimator activeAnimator;
    private long animationDuration = 400;

    public static /* synthetic */ void animateCollapse$default(CollapseAnimationHelper collapseAnimationHelper, View view, long j11, boolean z11, Interpolator interpolator, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            interpolator = new AccelerateDecelerateInterpolator();
        }
        Interpolator interpolator2 = interpolator;
        if ((i11 & 16) != 0) {
            function0 = null;
        }
        collapseAnimationHelper.animateCollapse(view, j11, z12, interpolator2, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateCollapse$lambda$0(View view, boolean z11, int i11, ValueAnimator valueAnimator) {
        int intValue = ((Integer) a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = intValue;
        view.setLayoutParams(layoutParams);
        if (z11) {
            view.setAlpha(intValue / i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void collapse$default(CollapseAnimationHelper collapseAnimationHelper, View view, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        collapseAnimationHelper.collapse(view, function0);
    }

    private final void resetInternal(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != -2) {
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
        }
        if (view.getAlpha() != 1.0f) {
            view.setAlpha(1.0f);
        }
        if (view.getScaleX() != 1.0f) {
            view.setScaleX(1.0f);
        }
        if (view.getScaleY() != 1.0f) {
            view.setScaleY(1.0f);
        }
        if (view.getTranslationX() != 0.0f) {
            view.setTranslationX(0.0f);
        }
        if (view.getTranslationY() != 0.0f) {
            view.setTranslationY(0.0f);
        }
        if (view.getRotation() != 0.0f) {
            view.setRotation(0.0f);
        }
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public final void animateCollapse(@NotNull final View view, long duration, final boolean fadeOut, @NotNull Interpolator interpolator, final Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        ValueAnimator valueAnimator = this.activeAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        view.clearAnimation();
        view.animate().cancel();
        final int height = view.getHeight();
        if (height <= 0) {
            if (onComplete != null) {
                onComplete.invoke();
                return;
            }
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(height, 0);
        ofInt.setDuration(duration);
        ofInt.setInterpolator(interpolator);
        this.activeAnimator = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jn.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CollapseAnimationHelper.animateCollapse$lambda$0(view, fadeOut, height, valueAnimator2);
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.util.CollapseAnimationHelper$animateCollapse$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                ValueAnimator valueAnimator2;
                Intrinsics.checkNotNullParameter(animation, "animation");
                valueAnimator2 = CollapseAnimationHelper.this.activeAnimator;
                if (Intrinsics.d(valueAnimator2, animation)) {
                    CollapseAnimationHelper.this.activeAnimator = null;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                ValueAnimator valueAnimator2;
                Intrinsics.checkNotNullParameter(animation, "animation");
                valueAnimator2 = CollapseAnimationHelper.this.activeAnimator;
                if (Intrinsics.d(valueAnimator2, animation)) {
                    CollapseAnimationHelper.this.activeAnimator = null;
                }
                Function0<Unit> function0 = onComplete;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        ofInt.start();
    }

    public final void collapse(@NotNull View view, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(view, "view");
        animateCollapse$default(this, view, this.animationDuration, false, null, onComplete, 12, null);
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean resetIfNotAnimating(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ValueAnimator valueAnimator = this.activeAnimator;
        boolean z11 = valueAnimator != null && valueAnimator.isRunning();
        boolean z12 = view.getAnimation() != null;
        boolean hasTransientState = view.hasTransientState();
        if (z11 || z12 || hasTransientState) {
            return false;
        }
        resetInternal(view);
        return true;
    }
}
