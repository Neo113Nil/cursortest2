package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter;

import B.f;
import Hm.a;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorView;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.MorkovskTabbarVO;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter.IndicatorAnimationController;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0003J\u0014\u0010\u0018\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0019\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\f\u0010\u001c\u001a\u00020\u0011*\u00020\u0003H\u0002J\f\u0010\u001d\u001a\u00020\u0011*\u00020\u0003H\u0002J\f\u0010\u001e\u001a\u00020\u0011*\u00020\u0003H\u0002J\u0014\u0010\u001f\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\f\u0010 \u001a\u00020\u0011*\u00020\u0003H\u0002J\f\u0010!\u001a\u00020\u0011*\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/IndicatorAnimationController;", "", "indicatorView", "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorView;", "<init>", "(Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorView;)V", "accelerateDecelerateInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "overshootInterpolator", "Landroid/view/animation/OvershootInterpolator;", "showingAnimator", "Landroid/view/ViewPropertyAnimator;", "triggerAnimator", "showAnimationHandler", "Landroid/os/Handler;", "triggerAnimationHandler", "bindAnimatedIndicator", "", "item", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO$MorkovskTabItemVO;", "startTriggerAnimation", "triggerDelayTime", "", "cancelAnimations", "animateShowing", "decreaseIndicatorBeforeShowing", "isSideBlock", "", "startShowingIndicatorAnimation", "startTriggerDecreaseIndicatorAnimation", "startTriggerIncreaseIndicatorAnimation", "triggerIndicator", "clearShowAnimation", "clearTriggerAnimation", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class IndicatorAnimationController {

    @NotNull
    private final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator;

    @NotNull
    private final IndicatorView indicatorView;

    @NotNull
    private final OvershootInterpolator overshootInterpolator;

    @NotNull
    private final Handler showAnimationHandler;
    private ViewPropertyAnimator showingAnimator;

    @NotNull
    private final Handler triggerAnimationHandler;
    private ViewPropertyAnimator triggerAnimator;
    public static final int $stable = 8;
    private static final float dp3 = UiExtKt.toPxF(3);
    private static final float dp14 = UiExtKt.toPxF(14);

    public IndicatorAnimationController(@NotNull IndicatorView indicatorView) {
        Intrinsics.checkNotNullParameter(indicatorView, "indicatorView");
        this.indicatorView = indicatorView;
        this.accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        this.overshootInterpolator = new OvershootInterpolator(2.0f);
        this.showAnimationHandler = new Handler(Looper.getMainLooper());
        this.triggerAnimationHandler = new Handler(Looper.getMainLooper());
    }

    private final void animateShowing(IndicatorView indicatorView, MorkovskTabbarVO.MorkovskTabItemVO morkovskTabItemVO) {
        decreaseIndicatorBeforeShowing(indicatorView, morkovskTabItemVO.getIsSideBlock());
        startShowingIndicatorAnimation(indicatorView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindAnimatedIndicator$lambda$1(MorkovskTabbarVO.MorkovskTabItemVO morkovskTabItemVO, IndicatorAnimationController indicatorAnimationController) {
        Long animationTime = morkovskTabItemVO.getAnimationTime();
        if (animationTime != null) {
            long longValue = animationTime.longValue();
            IndicatorView indicatorView = indicatorAnimationController.indicatorView;
            indicatorView.bindOrGone(morkovskTabItemVO.getIndicator());
            indicatorAnimationController.animateShowing(indicatorView, morkovskTabItemVO);
            indicatorAnimationController.startTriggerAnimation(longValue);
            indicatorAnimationController.showAnimationHandler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearShowAnimation(IndicatorView indicatorView) {
        ViewPropertyAnimator viewPropertyAnimator = this.showingAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        indicatorView.clearAnimation();
        this.showingAnimator = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearTriggerAnimation(IndicatorView indicatorView) {
        ViewPropertyAnimator viewPropertyAnimator = this.triggerAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        indicatorView.clearAnimation();
        this.triggerAnimator = null;
    }

    private final void decreaseIndicatorBeforeShowing(IndicatorView indicatorView, boolean z11) {
        indicatorView.setAlpha(0.0f);
        indicatorView.setTranslationY(indicatorView.getTranslationY() + (z11 ? dp3 : dp14));
        indicatorView.setScaleX(0.375f);
        indicatorView.setScaleY(0.375f);
    }

    private final void startShowingIndicatorAnimation(IndicatorView indicatorView) {
        ViewPropertyAnimator withEndAction = indicatorView.animate().setInterpolator(this.overshootInterpolator).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).withEndAction(new a(4, this, indicatorView));
        this.showingAnimator = withEndAction;
        if (withEndAction != null) {
            withEndAction.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTriggerAnimation$lambda$2(IndicatorAnimationController indicatorAnimationController, long j11) {
        indicatorAnimationController.triggerIndicator(indicatorAnimationController.indicatorView, j11);
    }

    private final void startTriggerDecreaseIndicatorAnimation(IndicatorView indicatorView) {
        ViewPropertyAnimator duration = indicatorView.animate().setInterpolator(this.accelerateDecelerateInterpolator).scaleX(0.9375f).scaleY(0.9375f).translationY(dp3).withEndAction(new f(2, this, indicatorView)).setDuration(150L);
        this.triggerAnimator = duration;
        if (duration != null) {
            duration.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTriggerIncreaseIndicatorAnimation(IndicatorView indicatorView) {
        ViewPropertyAnimator duration = indicatorView.animate().setInterpolator(this.accelerateDecelerateInterpolator).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).withEndAction(new JL.a(5, this, indicatorView)).setDuration(150L);
        this.triggerAnimator = duration;
        if (duration != null) {
            duration.start();
        }
    }

    private final void triggerIndicator(IndicatorView indicatorView, long j11) {
        startTriggerDecreaseIndicatorAnimation(indicatorView);
        startTriggerAnimation(j11);
    }

    public final void bindAnimatedIndicator(@NotNull MorkovskTabbarVO.MorkovskTabItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.showAnimationHandler.postDelayed(new com.yandex.mapkit.offline_cache.internal.a(1, item, this), 600L);
    }

    @NotNull
    public final IndicatorView cancelAnimations() {
        IndicatorView indicatorView = this.indicatorView;
        clearShowAnimation(indicatorView);
        clearTriggerAnimation(indicatorView);
        this.showAnimationHandler.removeCallbacksAndMessages(null);
        this.triggerAnimationHandler.removeCallbacksAndMessages(null);
        return indicatorView;
    }

    public final void startTriggerAnimation(final long triggerDelayTime) {
        this.triggerAnimationHandler.removeCallbacksAndMessages(null);
        this.triggerAnimationHandler.postDelayed(new Runnable() { // from class: nG.a
            @Override // java.lang.Runnable
            public final void run() {
                IndicatorAnimationController.startTriggerAnimation$lambda$2(IndicatorAnimationController.this, triggerDelayTime);
            }
        }, triggerDelayTime);
    }
}
