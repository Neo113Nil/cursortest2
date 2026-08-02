package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom;

import Bi.a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import fI.C6473a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011J%\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0017J%\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0017J\b\u0010\u001a\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingAnimator;", "", "onboardingView", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingView;", "leftTouchDot", "Landroid/view/View;", "rightTouchDot", "<init>", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingView;Landroid/view/View;Landroid/view/View;)V", "dotsTranslationLength", "", "mainAnimator", "Landroid/animation/Animator;", "cancelAnimation", "", "playAnimationWithEndAction", "animationEndAction", "Lkotlin/Function0;", "getDotsAlphaAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "from", "to", "(FF)Landroid/animation/ValueAnimator;", "getDotsScaleAnimator", "getDotsPinchingAnimator", "prepareViews", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PinchToZoomOnboardingAnimator {
    private final float dotsTranslationLength;

    @NotNull
    private final View leftTouchDot;
    private Animator mainAnimator;

    @NotNull
    private final PinchToZoomOnboardingView onboardingView;

    @NotNull
    private final View rightTouchDot;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/pinchtozoom/PinchToZoomOnboardingAnimator$Companion;", "", "<init>", "()V", "CANCEL_DURATION", "", "VIEW_APPEARING_DURATION", "RELEASED_DOTS_ALPHA", "", "DOTS_APPEARING_DURATION", "PRESSED_DOTS_ALPHA", "RELEASED_DOTS_SCALE", "PRESSED_DOTS_SCALE", "DOTS_PRESSING_START_DELAY", "DOTS_PRESSING_DURATION", "DOTS_PINCHING_START_DELAY", "DOTS_PINCHING_DURATION", "DOTS_RELEASING_START_DELAY", "DOTS_RELEASING_DURATION", "VIEW_DISAPPEARING_START_DELAY", "VIEW_DISAPPEARING_DURATION", "SECOND_DOTS_ANIMATION_START_DELAY", "ONBOARDING_ANIMATION_START_DELAY", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PinchToZoomOnboardingAnimator(@NotNull PinchToZoomOnboardingView onboardingView, @NotNull View leftTouchDot, @NotNull View rightTouchDot) {
        Intrinsics.checkNotNullParameter(onboardingView, "onboardingView");
        Intrinsics.checkNotNullParameter(leftTouchDot, "leftTouchDot");
        Intrinsics.checkNotNullParameter(rightTouchDot, "rightTouchDot");
        this.onboardingView = onboardingView;
        this.leftTouchDot = leftTouchDot;
        this.rightTouchDot = rightTouchDot;
        this.dotsTranslationLength = ResourceExtKt.toPxF(15);
    }

    private final ValueAnimator getDotsAlphaAnimator(float from, float to) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(from, to);
        ofFloat.addUpdateListener(new C6473a(this, 0));
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDotsAlphaAnimator$lambda$11$lambda$10(PinchToZoomOnboardingAnimator pinchToZoomOnboardingAnimator, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        pinchToZoomOnboardingAnimator.leftTouchDot.setAlpha(floatValue);
        pinchToZoomOnboardingAnimator.rightTouchDot.setAlpha(floatValue);
    }

    private final ValueAnimator getDotsPinchingAnimator(float from, float to) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(from, to);
        ofFloat.addUpdateListener(new Qx.a(this, 1));
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDotsPinchingAnimator$lambda$19$lambda$18(PinchToZoomOnboardingAnimator pinchToZoomOnboardingAnimator, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View view = pinchToZoomOnboardingAnimator.leftTouchDot;
        float f7 = -floatValue;
        view.setTranslationX(f7);
        view.setTranslationY(floatValue);
        View view2 = pinchToZoomOnboardingAnimator.rightTouchDot;
        view2.setTranslationX(floatValue);
        view2.setTranslationY(f7);
    }

    private final ValueAnimator getDotsScaleAnimator(float from, float to) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(from, to);
        ofFloat.addUpdateListener(new AX.a(this, 2));
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDotsScaleAnimator$lambda$15$lambda$14(PinchToZoomOnboardingAnimator pinchToZoomOnboardingAnimator, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View view = pinchToZoomOnboardingAnimator.leftTouchDot;
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
        View view2 = pinchToZoomOnboardingAnimator.rightTouchDot;
        view2.setScaleX(floatValue);
        view2.setScaleY(floatValue);
    }

    private final void prepareViews() {
        View view = this.leftTouchDot;
        view.setScaleX(0.8f);
        view.setScaleY(0.8f);
        View view2 = this.rightTouchDot;
        view2.setScaleX(0.8f);
        view2.setScaleY(0.8f);
    }

    public final void cancelAnimation() {
        Animator animator = this.mainAnimator;
        if (animator != null) {
            animator.pause();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.onboardingView, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(150L);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingAnimator$cancelAnimation$lambda$1$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator2) {
                Animator animator3;
                animator3 = PinchToZoomOnboardingAnimator.this.mainAnimator;
                if (animator3 != null) {
                    animator3.end();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator2) {
            }
        });
        ofFloat.start();
    }

    public final void playAnimationWithEndAction(@NotNull final Function0<Unit> animationEndAction) {
        Intrinsics.checkNotNullParameter(animationEndAction, "animationEndAction");
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.onboardingView, "alpha", 0.0f, 1.0f).setDuration(400L);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        ValueAnimator duration2 = getDotsAlphaAnimator(0.0f, 0.5f).setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator dotsAlphaAnimator = getDotsAlphaAnimator(0.5f, 1.0f);
        ValueAnimator dotsScaleAnimator = getDotsScaleAnimator(0.8f, 1.0f);
        animatorSet.setStartDelay(100L);
        animatorSet.setDuration(300L);
        animatorSet.play(dotsAlphaAnimator).with(dotsScaleAnimator);
        ValueAnimator dotsPinchingAnimator = getDotsPinchingAnimator(0.0f, this.dotsTranslationLength);
        dotsPinchingAnimator.setStartDelay(100L);
        dotsPinchingAnimator.setDuration(400L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ValueAnimator dotsAlphaAnimator2 = getDotsAlphaAnimator(1.0f, 0.0f);
        ValueAnimator dotsScaleAnimator2 = getDotsScaleAnimator(1.0f, 0.8f);
        ValueAnimator dotsPinchingAnimator2 = getDotsPinchingAnimator(this.dotsTranslationLength, 0.0f);
        animatorSet2.setStartDelay(400L);
        animatorSet2.setDuration(400L);
        animatorSet2.play(dotsPinchingAnimator2).with(dotsAlphaAnimator2).with(dotsScaleAnimator2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.onboardingView, "alpha", 1.0f, 0.0f);
        ofFloat.setStartDelay(500L);
        ofFloat.setDuration(500L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(duration2).before(animatorSet);
        animatorSet3.play(animatorSet).before(dotsPinchingAnimator);
        animatorSet3.play(dotsPinchingAnimator).before(animatorSet2);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setStartDelay(300L);
        animatorSet4.play(duration2).before(animatorSet);
        animatorSet4.play(animatorSet).before(dotsPinchingAnimator);
        animatorSet4.play(dotsPinchingAnimator).before(animatorSet2);
        prepareViews();
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setStartDelay(500L);
        animatorSet5.play(duration).with(animatorSet3);
        animatorSet5.play(animatorSet3).before(animatorSet4);
        animatorSet5.play(ofFloat).after(animatorSet4);
        animatorSet5.start();
        animatorSet5.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingAnimator$playAnimationWithEndAction$lambda$9$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                Function0.this.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        this.mainAnimator = animatorSet5;
    }
}
