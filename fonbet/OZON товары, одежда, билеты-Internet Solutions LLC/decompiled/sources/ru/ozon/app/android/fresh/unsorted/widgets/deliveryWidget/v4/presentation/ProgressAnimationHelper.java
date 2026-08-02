package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lx.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.ProgressAnimationHelper;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ.\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014J\u001c\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014J$\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014J\u0014\u0010\u001a\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014J\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0012J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J\u001a\u0010 \u001a\u00020\n*\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/ProgressAnimationHelper;", "", "progressContainer", "Landroid/widget/FrameLayout;", "progressView", "Landroid/view/View;", "progressBackgroundView", "<init>", "(Landroid/widget/FrameLayout;Landroid/view/View;Landroid/view/View;)V", "animator", "Landroid/animation/Animator;", "cancel", "", "animateProgressContainerVisibility", "fromHeight", "", "toHeight", "showProgress", "", "onEnd", "Lkotlin/Function0;", "animateProgressAppear", "targetWidth", "animateProgressWidth", "fromWidth", "toWidth", "animateProgressToZero", "setBackgroundVisible", "visible", "setViewWidth", "view", "width", "onFinished", "block", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProgressAnimationHelper {
    private Animator animator;

    @NotNull
    private final View progressBackgroundView;

    @NotNull
    private final FrameLayout progressContainer;

    @NotNull
    private final View progressView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/ProgressAnimationHelper$Companion;", "", "<init>", "()V", "ANIMATION_DURATION", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ProgressAnimationHelper(@NotNull FrameLayout progressContainer, @NotNull View progressView, @NotNull View progressBackgroundView) {
        Intrinsics.checkNotNullParameter(progressContainer, "progressContainer");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(progressBackgroundView, "progressBackgroundView");
        this.progressContainer = progressContainer;
        this.progressView = progressView;
        this.progressBackgroundView = progressBackgroundView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void animateProgressContainerVisibility$default(ProgressAnimationHelper progressAnimationHelper, int i11, int i12, boolean z11, Function0 function0, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            function0 = ProgressAnimationHelper$animateProgressContainerVisibility$1.INSTANCE;
        }
        progressAnimationHelper.animateProgressContainerVisibility(i11, i12, z11, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateProgressContainerVisibility$lambda$2$lambda$1(ProgressAnimationHelper progressAnimationHelper, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        FrameLayout frameLayout = progressAnimationHelper.progressContainer;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ((ViewGroup.MarginLayoutParams) bVar).height = ((Integer) animatedValue).intValue();
        frameLayout.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateProgressWidth$lambda$6$lambda$5(ProgressAnimationHelper progressAnimationHelper, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        View view = progressAnimationHelper.progressView;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        progressAnimationHelper.setViewWidth(view, ((Integer) animatedValue).intValue());
    }

    private final Animator onFinished(Animator animator, final Function0<Unit> function0) {
        animator.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.ProgressAnimationHelper$onFinished$1$1
            private boolean handled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.handled) {
                    return;
                }
                this.handled = true;
                function0.invoke();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.handled) {
                    return;
                }
                this.handled = true;
                function0.invoke();
            }
        });
        return animator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewWidth(View view, int width) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = width;
        view.setLayoutParams(layoutParams2);
    }

    public final void animateProgressAppear(int targetWidth, @NotNull Function0<Unit> onEnd) {
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        cancel();
        this.progressView.setPivotX(0.0f);
        this.progressView.setScaleX(0.0f);
        this.progressView.setAlpha(1.0f);
        ViewExtKt.show(this.progressView);
        setViewWidth(this.progressView, targetWidth);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.progressView, (Property<View, Float>) View.SCALE_X, 0.0f, 1.0f);
        ofFloat.setDuration(200L);
        onFinished(ofFloat, new ProgressAnimationHelper$animateProgressAppear$1$1(this, onEnd));
        ofFloat.start();
        this.animator = ofFloat;
    }

    public final void animateProgressContainerVisibility(int fromHeight, int toHeight, boolean showProgress, @NotNull Function0<Unit> onEnd) {
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        cancel();
        this.progressBackgroundView.setAlpha(0.0f);
        this.progressView.setAlpha(0.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(fromHeight, toHeight);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lx.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProgressAnimationHelper.animateProgressContainerVisibility$lambda$2$lambda$1(ProgressAnimationHelper.this, valueAnimator);
            }
        });
        Unit unit = Unit.f71690a;
        View view = this.progressBackgroundView;
        Property property = View.ALPHA;
        ArrayList m02 = C7714v.m0(ofInt, ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, 1.0f));
        if (showProgress) {
            m02.add(ObjectAnimator.ofFloat(this.progressView, (Property<View, Float>) property, 0.0f, 1.0f));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(m02);
        onFinished(animatorSet, new ProgressAnimationHelper$animateProgressContainerVisibility$2$1(onEnd));
        animatorSet.start();
        this.animator = animatorSet;
    }

    public final void animateProgressToZero(@NotNull Function0<Unit> onEnd) {
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        cancel();
        this.progressView.setPivotX(0.0f);
        this.progressView.setScaleX(1.0f);
        this.progressView.setAlpha(1.0f);
        ViewExtKt.show(this.progressView);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.progressView, (Property<View, Float>) View.SCALE_X, 1.0f, 0.0f);
        ofFloat.setDuration(200L);
        onFinished(ofFloat, new ProgressAnimationHelper$animateProgressToZero$1$1(this, onEnd));
        ofFloat.start();
        this.animator = ofFloat;
    }

    public final void animateProgressWidth(int fromWidth, int toWidth, @NotNull Function0<Unit> onEnd) {
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        cancel();
        this.progressView.setVisibility(0);
        this.progressView.setAlpha(1.0f);
        this.progressView.setScaleX(1.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(fromWidth, toWidth);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new c(this, 0));
        onFinished(ofInt, new ProgressAnimationHelper$animateProgressWidth$1$2(this, toWidth, onEnd));
        ofInt.start();
        this.animator = ofInt;
    }

    public final void cancel() {
        Animator animator = this.animator;
        if (animator != null) {
            animator.cancel();
        }
        this.progressView.animate().cancel();
        this.progressBackgroundView.animate().cancel();
    }

    public final void setBackgroundVisible(boolean visible) {
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(this.progressBackgroundView, Boolean.valueOf(visible));
        this.progressBackgroundView.setAlpha(1.0f);
    }
}
