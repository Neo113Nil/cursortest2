package ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation;

import Bu.f;
import Bu.g;
import Xc.a;
import Xc.b;
import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation.MarqueeViewAnimationHelper;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 62\u00020\u0001:\u000267B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001b\u0010\u0006J\r\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u0003¢\u0006\u0004\b \u0010\u001dR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b.\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\n¨\u00068"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/marqueeanimation/MarqueeViewAnimationHelper;", "", "Lkotlin/Function0;", "", "invalidateCallback", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "currentStartScrollingPosition", "setupAndStartFadeAnimation", "(F)V", "speed", "setAnimationPixelSpeed", "(Ljava/lang/Float;)V", "Lru/ozon/app/android/ordertracking/v4/presentation/util/marqueeanimation/MarqueeViewAnimationHelper$AnimationState;", "getCurrentState", "()Lru/ozon/app/android/ordertracking/v4/presentation/util/marqueeanimation/MarqueeViewAnimationHelper$AnimationState;", "getStartScrollingPosition", "()F", "getAlpha", "", "scrollingText", "Landroid/graphics/Paint;", "paint", "setupAnimator", "(Ljava/lang/String;Landroid/graphics/Paint;)V", "onComplete", "startAnimation", "resumeAnimation", "()V", "pauseAnimation", "stopAnimation", "stopAnimationWithFade", "Lkotlin/jvm/functions/Function0;", "Landroid/animation/ValueAnimator;", "marqueeAnimator", "Landroid/animation/ValueAnimator;", "fadeAnimator", "animationState", "Lru/ozon/app/android/ordertracking/v4/presentation/util/marqueeanimation/MarqueeViewAnimationHelper$AnimationState;", "startScrollingPosition", "F", "alpha", "onAnimationCompleteCallback", "pixelSpeed", "", "isAnimationNeeded", "Z", "()Z", "setAnimationNeeded", "(Z)V", "textWidth", "getTextWidth", "setTextWidth", "Companion", "AnimationState", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarqueeViewAnimationHelper {
    private float alpha;

    @NotNull
    private AnimationState animationState;
    private ValueAnimator fadeAnimator;

    @NotNull
    private final Function0<Unit> invalidateCallback;
    private boolean isAnimationNeeded;
    private ValueAnimator marqueeAnimator;
    private Function0<Unit> onAnimationCompleteCallback;
    private float pixelSpeed;
    private float startScrollingPosition;
    private float textWidth;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/marqueeanimation/MarqueeViewAnimationHelper$AnimationState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "RUNNING", "PAUSED", "COMPLETED", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnimationState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AnimationState[] $VALUES;
        public static final AnimationState IDLE = new AnimationState("IDLE", 0);
        public static final AnimationState RUNNING = new AnimationState("RUNNING", 1);
        public static final AnimationState PAUSED = new AnimationState("PAUSED", 2);
        public static final AnimationState COMPLETED = new AnimationState("COMPLETED", 3);

        private static final /* synthetic */ AnimationState[] $values() {
            return new AnimationState[]{IDLE, RUNNING, PAUSED, COMPLETED};
        }

        static {
            AnimationState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AnimationState(String str, int i11) {
        }

        public static AnimationState valueOf(String str) {
            return (AnimationState) Enum.valueOf(AnimationState.class, str);
        }

        public static AnimationState[] values() {
            return (AnimationState[]) $VALUES.clone();
        }
    }

    public MarqueeViewAnimationHelper(@NotNull Function0<Unit> invalidateCallback) {
        Intrinsics.checkNotNullParameter(invalidateCallback, "invalidateCallback");
        this.invalidateCallback = invalidateCallback;
        this.animationState = AnimationState.IDLE;
        this.alpha = 1.0f;
        this.pixelSpeed = 0.08695652f;
    }

    private final void setupAndStartFadeAnimation(float currentStartScrollingPosition) {
        ValueAnimator valueAnimator = this.fadeAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Keyframe[] keyframeArr = (Keyframe[]) C7714v.b0(Keyframe.ofFloat(0.0f, this.alpha), Keyframe.ofFloat(0.5f, 0.0f), Keyframe.ofFloat(1.0f, 1.0f)).toArray(new Keyframe[0]);
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("alpha", (Keyframe[]) Arrays.copyOf(keyframeArr, keyframeArr.length)));
        ofPropertyValuesHolder.setDuration(600L);
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ofPropertyValuesHolder.addUpdateListener(new g(this, 1));
        ofPropertyValuesHolder.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation.MarqueeViewAnimationHelper$setupAndStartFadeAnimation$1$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Function0 function0;
                Intrinsics.checkNotNullParameter(animation, "animation");
                MarqueeViewAnimationHelper.this.alpha = 1.0f;
                function0 = MarqueeViewAnimationHelper.this.invalidateCallback;
                function0.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                MarqueeViewAnimationHelper.this.animationState = MarqueeViewAnimationHelper.AnimationState.IDLE;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
        this.fadeAnimator = ofPropertyValuesHolder;
        ofPropertyValuesHolder.addUpdateListener(new NB.a(this, currentStartScrollingPosition));
        ValueAnimator valueAnimator2 = this.fadeAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAndStartFadeAnimation$lambda$5$lambda$4(MarqueeViewAnimationHelper marqueeViewAnimationHelper, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue("alpha");
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        marqueeViewAnimationHelper.alpha = ((Float) animatedValue).floatValue();
        marqueeViewAnimationHelper.invalidateCallback.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAndStartFadeAnimation$lambda$6(float f7, MarqueeViewAnimationHelper marqueeViewAnimationHelper, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        if (animator.getAnimatedFraction() < 0.5f || f7 == 0.0f) {
            return;
        }
        marqueeViewAnimationHelper.startScrollingPosition = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAnimator$lambda$3$lambda$2(MarqueeViewAnimationHelper marqueeViewAnimationHelper, ValueAnimator valueAnimator) {
        marqueeViewAnimationHelper.startScrollingPosition = -((Float) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        marqueeViewAnimationHelper.invalidateCallback.invoke();
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @NotNull
    /* renamed from: getCurrentState, reason: from getter */
    public final AnimationState getAnimationState() {
        return this.animationState;
    }

    public final float getStartScrollingPosition() {
        return this.startScrollingPosition;
    }

    public final float getTextWidth() {
        return this.textWidth;
    }

    /* renamed from: isAnimationNeeded, reason: from getter */
    public final boolean getIsAnimationNeeded() {
        return this.isAnimationNeeded;
    }

    public final void pauseAnimation() {
        if (this.animationState == AnimationState.RUNNING) {
            ValueAnimator valueAnimator = this.marqueeAnimator;
            if (valueAnimator != null) {
                valueAnimator.pause();
            }
            this.animationState = AnimationState.PAUSED;
        }
    }

    public final void resumeAnimation() {
        if (this.animationState == AnimationState.PAUSED) {
            ValueAnimator valueAnimator = this.marqueeAnimator;
            if (valueAnimator != null) {
                valueAnimator.resume();
            }
            this.animationState = AnimationState.RUNNING;
        }
    }

    public final void setAnimationNeeded(boolean z11) {
        this.isAnimationNeeded = z11;
    }

    public final void setAnimationPixelSpeed(Float speed) {
        if (speed != null) {
            this.pixelSpeed = 1.0f / speed.floatValue();
        }
    }

    public final void setupAnimator(@NotNull String scrollingText, @NotNull Paint paint) {
        int i11 = 2;
        Intrinsics.checkNotNullParameter(scrollingText, "scrollingText");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (this.isAnimationNeeded) {
            ValueAnimator valueAnimator = this.marqueeAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.marqueeAnimator;
                if (valueAnimator2 != null && !valueAnimator2.isRunning()) {
                    valueAnimator2.removeAllListeners();
                    valueAnimator2.removeAllUpdateListeners();
                    this.marqueeAnimator = null;
                }
                float measureText = paint.measureText(scrollingText);
                this.textWidth = measureText;
                long j11 = (long) (measureText / this.pixelSpeed);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measureText);
                ofFloat.setDuration(j11);
                ofFloat.setRepeatCount(0);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new f(this, i11));
                ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation.MarqueeViewAnimationHelper$setupAnimator$2$2
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        MarqueeViewAnimationHelper.this.animationState = MarqueeViewAnimationHelper.AnimationState.IDLE;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Function0 function0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        MarqueeViewAnimationHelper.this.animationState = MarqueeViewAnimationHelper.AnimationState.COMPLETED;
                        function0 = MarqueeViewAnimationHelper.this.onAnimationCompleteCallback;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        MarqueeViewAnimationHelper.this.animationState = MarqueeViewAnimationHelper.AnimationState.RUNNING;
                    }
                });
                this.marqueeAnimator = ofFloat;
            }
        }
    }

    public final void startAnimation(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.onAnimationCompleteCallback = onComplete;
        if (!this.isAnimationNeeded) {
            onComplete.invoke();
            return;
        }
        AnimationState animationState = this.animationState;
        AnimationState animationState2 = AnimationState.RUNNING;
        if (animationState == animationState2 || animationState == AnimationState.PAUSED) {
            return;
        }
        this.alpha = 1.0f;
        this.startScrollingPosition = 0.0f;
        ValueAnimator valueAnimator = this.marqueeAnimator;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        this.animationState = animationState2;
    }

    public final void stopAnimation() {
        ValueAnimator valueAnimator = this.fadeAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.marqueeAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.startScrollingPosition = 0.0f;
        this.alpha = 1.0f;
        this.animationState = AnimationState.IDLE;
        this.invalidateCallback.invoke();
    }

    public final void stopAnimationWithFade() {
        AnimationState animationState = this.animationState;
        if (animationState != AnimationState.RUNNING && animationState != AnimationState.PAUSED) {
            stopAnimation();
            return;
        }
        ValueAnimator valueAnimator = this.marqueeAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        setupAndStartFadeAnimation(this.startScrollingPosition);
    }
}
