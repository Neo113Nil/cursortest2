package ru.ozon.uni.android.flashbar.view;

import Bi.a;
import Bk0.b;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.view.SwipeToDismissTouchListener;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u001cH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/android/flashbar/view/SwipeToDismissTouchListener;", "Landroid/view/View$OnTouchListener;", "view", "Landroid/view/View;", "callbacks", "Lru/ozon/uni/android/flashbar/view/SwipeToDismissTouchListener$DismissCallbacks;", "<init>", "(Landroid/view/View;Lru/ozon/uni/android/flashbar/view/SwipeToDismissTouchListener$DismissCallbacks;)V", "slop", "", "minFlingVelocity", "animationTime", "", "viewHeight", "downX", "", "downY", "swiping", "", "swipingSlop", "velocityTracker", "Landroid/view/VelocityTracker;", "translationX", "translationY", "onTouch", "motionEvent", "Landroid/view/MotionEvent;", "performDismiss", "", "DismissCallbacks", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SwipeToDismissTouchListener implements View.OnTouchListener {
    private final long animationTime;

    @NotNull
    private final DismissCallbacks callbacks;
    private float downX;
    private float downY;
    private final int minFlingVelocity;
    private final int slop;
    private boolean swiping;
    private int swipingSlop;
    private float translationX;
    private float translationY;
    private VelocityTracker velocityTracker;

    @NotNull
    private final View view;
    private int viewHeight;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/flashbar/view/SwipeToDismissTouchListener$DismissCallbacks;", "", "onSwipe", "", "isSwiping", "", "onDismiss", "view", "Landroid/view/View;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface DismissCallbacks {
        void onDismiss(@NotNull View view);

        void onSwipe(boolean isSwiping);
    }

    public SwipeToDismissTouchListener(@NotNull View view, @NotNull DismissCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.view = view;
        this.callbacks = callbacks;
        this.viewHeight = 1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.slop = viewConfiguration.getScaledTouchSlop();
        this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.animationTime = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performDismiss() {
        final ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        final int height = this.view.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.animationTime);
        duration.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.uni.android.flashbar.view.SwipeToDismissTouchListener$performDismiss$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                SwipeToDismissTouchListener.DismissCallbacks dismissCallbacks;
                View view;
                View view2;
                View view3;
                View view4;
                Intrinsics.checkNotNullParameter(animation, "animation");
                dismissCallbacks = SwipeToDismissTouchListener.this.callbacks;
                view = SwipeToDismissTouchListener.this.view;
                dismissCallbacks.onDismiss(view);
                view2 = SwipeToDismissTouchListener.this.view;
                view2.setAlpha(1.0f);
                view3 = SwipeToDismissTouchListener.this.view;
                view3.setTranslationX(0.0f);
                layoutParams.height = height;
                view4 = SwipeToDismissTouchListener.this.view;
                view4.setLayoutParams(layoutParams);
            }
        });
        duration.addUpdateListener(new b(0, layoutParams, this));
        duration.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performDismiss$lambda$0(ViewGroup.LayoutParams layoutParams, SwipeToDismissTouchListener swipeToDismissTouchListener, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) a.b(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Int")).intValue();
        swipeToDismissTouchListener.view.setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        boolean z11;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        motionEvent.offsetLocation(0.0f, this.translationY);
        if (this.viewHeight < 2) {
            this.viewHeight = this.view.getHeight();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.downX = motionEvent.getRawX();
            this.downY = motionEvent.getRawY();
            VelocityTracker obtain = VelocityTracker.obtain();
            this.velocityTracker = obtain;
            Intrinsics.f(obtain);
            obtain.addMovement(motionEvent);
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    Intrinsics.f(velocityTracker);
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.downX;
                    float rawY = motionEvent.getRawY() - this.downY;
                    if (Math.abs(rawY) > this.slop && Math.abs(rawX) < Math.abs(rawY) / 2) {
                        this.swiping = true;
                        this.callbacks.onSwipe(true);
                        this.swipingSlop = rawY > 0.0f ? this.slop : -this.slop;
                        this.view.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                        obtain2.setAction((motionEvent.getActionIndex() << 8) | 3);
                        this.view.onTouchEvent(obtain2);
                        obtain2.recycle();
                    }
                    if (this.swiping) {
                        this.translationY = rawY;
                        this.view.setTranslationY(rawY - this.swipingSlop);
                        this.view.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawY) * 2.0f) / this.viewHeight))));
                        return true;
                    }
                }
            } else {
                if (actionMasked != 3) {
                    view.performClick();
                    return false;
                }
                if (this.velocityTracker != null) {
                    this.view.animate().translationY(0.0f).alpha(1.0f).setDuration(this.animationTime).setListener(null);
                    VelocityTracker velocityTracker2 = this.velocityTracker;
                    Intrinsics.f(velocityTracker2);
                    velocityTracker2.recycle();
                    this.velocityTracker = null;
                    this.translationX = 0.0f;
                    this.downX = 0.0f;
                    this.downY = 0.0f;
                    this.swiping = false;
                    this.callbacks.onSwipe(false);
                }
            }
        } else if (this.velocityTracker != null) {
            float rawY2 = motionEvent.getRawY() - this.downY;
            VelocityTracker velocityTracker3 = this.velocityTracker;
            Intrinsics.f(velocityTracker3);
            velocityTracker3.addMovement(motionEvent);
            VelocityTracker velocityTracker4 = this.velocityTracker;
            Intrinsics.f(velocityTracker4);
            velocityTracker4.computeCurrentVelocity(1000);
            VelocityTracker velocityTracker5 = this.velocityTracker;
            Intrinsics.f(velocityTracker5);
            float yVelocity = velocityTracker5.getYVelocity();
            VelocityTracker velocityTracker6 = this.velocityTracker;
            Intrinsics.f(velocityTracker6);
            float abs = Math.abs(velocityTracker6.getXVelocity());
            float abs2 = Math.abs(yVelocity);
            if (Math.abs(rawY2) > this.viewHeight / 2 && this.swiping) {
                z11 = rawY2 > 0.0f;
            } else if (this.minFlingVelocity > abs || abs2 >= abs || !this.swiping) {
                z11 = false;
                r6 = false;
            } else {
                boolean z12 = ((yVelocity > 0.0f ? 1 : (yVelocity == 0.0f ? 0 : -1)) < 0) == ((rawY2 > 0.0f ? 1 : (rawY2 == 0.0f ? 0 : -1)) < 0);
                VelocityTracker velocityTracker7 = this.velocityTracker;
                Intrinsics.f(velocityTracker7);
                r6 = z12;
                z11 = velocityTracker7.getYVelocity() > 0.0f;
            }
            if (r6) {
                this.view.animate().translationY(z11 ? this.viewHeight : -this.viewHeight).alpha(0.0f).setDuration(this.animationTime).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.uni.android.flashbar.view.SwipeToDismissTouchListener$onTouch$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        SwipeToDismissTouchListener.this.performDismiss();
                    }
                });
            } else if (this.swiping) {
                this.view.animate().translationY(0.0f).alpha(1.0f).setDuration(this.animationTime).setListener(null);
            }
            VelocityTracker velocityTracker8 = this.velocityTracker;
            Intrinsics.f(velocityTracker8);
            velocityTracker8.recycle();
            this.velocityTracker = null;
            this.translationX = 0.0f;
            this.downX = 0.0f;
            this.downY = 0.0f;
            this.swiping = false;
            this.callbacks.onSwipe(false);
        }
        return false;
    }
}
