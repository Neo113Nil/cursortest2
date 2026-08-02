package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view;

import Bi.a;
import FN.b;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3StickyContainerAnimator;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\u00020\u0005*\u00020\u000bH\u0002J\f\u0010\u000f\u001a\u00020\u0005*\u00020\u000bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerAnimator;", "", "<init>", "()V", "animator", "Landroid/animation/ValueAnimator;", "currentFraction", "", "toggleVisibility", "", "view", "Landroid/view/View;", "isVisible", "", "hide", "show", "Companion", "FractionInterpolator", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3StickyContainerAnimator {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private ValueAnimator animator;
    private float currentFraction = 1.0f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerAnimator$Companion;", "", "<init>", "()V", "ANIMATION_DURATION", "", "START_POSITION", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerAnimator$FractionInterpolator;", "Landroid/view/animation/LinearInterpolator;", "animatedFraction", "", "<init>", "(F)V", "getInterpolation", "input", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class FractionInterpolator extends LinearInterpolator {

        @NotNull
        private static final Companion Companion = new Companion(null);
        private final float animatedFraction;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerAnimator$FractionInterpolator$Companion;", "", "<init>", "()V", "MAX_INTERPOLATION", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public FractionInterpolator(float f7) {
            this.animatedFraction = f7;
        }

        @Override // android.view.animation.LinearInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float input) {
            float interpolation = (1.0f - this.animatedFraction) + super.getInterpolation(input);
            if (interpolation > 1.0f) {
                return 1.0f;
            }
            return interpolation;
        }
    }

    private final ValueAnimator hide(final View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, view.getHeight());
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new FractionInterpolator(this.currentFraction));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3StickyContainerAnimator$hide$lambda$3$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ViewExtKt.invisible(view);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: FN.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HotelsBookTotalV3StickyContainerAnimator.hide$lambda$3$lambda$2(HotelsBookTotalV3StickyContainerAnimator.this, view, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$3$lambda$2(HotelsBookTotalV3StickyContainerAnimator hotelsBookTotalV3StickyContainerAnimator, View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        hotelsBookTotalV3StickyContainerAnimator.currentFraction = valueAnimator.getAnimatedFraction();
        view.setTranslationY(floatValue);
    }

    private final ValueAnimator show(final View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getHeight(), 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new FractionInterpolator(this.currentFraction));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3StickyContainerAnimator$show$lambda$6$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                view.setVisibility(0);
            }
        });
        ofFloat.addUpdateListener(new b(0, this, view));
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$6$lambda$5(HotelsBookTotalV3StickyContainerAnimator hotelsBookTotalV3StickyContainerAnimator, View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        hotelsBookTotalV3StickyContainerAnimator.currentFraction = valueAnimator.getAnimatedFraction();
        view.setTranslationY(floatValue);
    }

    public final void toggleVisibility(@NotNull View view, boolean isVisible) {
        ValueAnimator valueAnimator;
        Intrinsics.checkNotNullParameter(view, "view");
        ValueAnimator valueAnimator2 = this.animator;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.animator) != null) {
            valueAnimator.cancel();
        }
        if (isVisible == (view.getVisibility() == 0)) {
            return;
        }
        ValueAnimator show = isVisible ? show(view) : hide(view);
        this.animator = show;
        if (show != null) {
            show.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3StickyContainerAnimator$toggleVisibility$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animator) {
                    HotelsBookTotalV3StickyContainerAnimator.this.animator = null;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@NotNull Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@NotNull Animator animator) {
                }
            });
        }
        ValueAnimator valueAnimator3 = this.animator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }
}
