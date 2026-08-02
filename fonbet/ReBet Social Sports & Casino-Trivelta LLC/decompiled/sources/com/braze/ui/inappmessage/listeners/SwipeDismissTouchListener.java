package com.braze.ui.inappmessage.listeners;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;

/* loaded from: classes.dex */
public abstract class SwipeDismissTouchListener implements View.OnTouchListener {
    private final long mAnimationTime;
    private final DismissCallbacks mCallbacks;
    private float mDownX;
    private float mDownY;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    private int mSwipingVerticalSlop;
    private boolean mSwipingVertically;
    private final Object mToken;
    private float mTranslationX;
    private float mTranslationY;
    private VelocityTracker mVelocityTracker;
    private final VerticalDismissDirection mVerticalDismissDirection;
    private final View mView;
    private int mViewWidth = 1;
    private int mViewHeight = 1;

    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);
    }

    public enum VerticalDismissDirection {
        NONE,
        UP,
        DOWN
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks, VerticalDismissDirection verticalDismissDirection) {
        long j10;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.mSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        try {
            j10 = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        } catch (Resources.NotFoundException unused) {
            j10 = 200;
        }
        this.mAnimationTime = j10;
        this.mView = view;
        this.mToken = obj;
        this.mCallbacks = dismissCallbacks;
        this.mVerticalDismissDirection = verticalDismissDirection;
    }

    public static /* synthetic */ void a(SwipeDismissTouchListener swipeDismissTouchListener, ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        swipeDismissTouchListener.getClass();
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        swipeDismissTouchListener.mView.setLayoutParams(layoutParams);
    }

    private void handleHorizontalActionUp(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - this.mDownX;
        float xVelocity = this.mVelocityTracker.getXVelocity();
        float abs = Math.abs(xVelocity);
        float abs2 = Math.abs(this.mVelocityTracker.getYVelocity());
        boolean z10 = false;
        if (Math.abs(rawX) <= this.mViewWidth / 2 || !this.mSwiping) {
            if (this.mMinFlingVelocity > abs || abs > this.mMaxFlingVelocity || abs2 >= abs || !this.mSwiping) {
                r5 = false;
            } else {
                boolean z11 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX > 0.0f ? 1 : (rawX == 0.0f ? 0 : -1)) < 0);
                z10 = xVelocity > 0.0f;
                r5 = z11;
            }
        } else if (rawX > 0.0f) {
            z10 = true;
        }
        if (!r5) {
            if (this.mSwiping) {
                this.mView.animate().translationX(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
            }
        } else {
            ViewPropertyAnimator animate = this.mView.animate();
            int i10 = this.mViewWidth;
            if (!z10) {
                i10 = -i10;
            }
            animate.translationX(i10).alpha(0.0f).setDuration(this.mAnimationTime).setListener(new AnimatorListenerAdapter() { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SwipeDismissTouchListener.this.performDismiss();
                }
            });
        }
    }

    private void handleVerticalActionUp(MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY() - this.mDownY;
        float yVelocity = this.mVelocityTracker.getYVelocity();
        float abs = Math.abs(yVelocity);
        float abs2 = Math.abs(this.mVelocityTracker.getXVelocity());
        boolean z10 = false;
        if (Math.abs(rawY) > this.mViewHeight / 2) {
            if (rawY > 0.0f) {
                z10 = true;
            }
        } else if (this.mMinFlingVelocity > abs || abs > this.mMaxFlingVelocity || abs2 >= abs) {
            r5 = false;
        } else {
            boolean z11 = ((yVelocity > 0.0f ? 1 : (yVelocity == 0.0f ? 0 : -1)) < 0) == ((rawY > 0.0f ? 1 : (rawY == 0.0f ? 0 : -1)) < 0);
            z10 = yVelocity > 0.0f;
            r5 = z11;
        }
        if (r5) {
            if (isVerticalSwipeInAllowedDirection(z10 ? 1.0f : -1.0f)) {
                ViewPropertyAnimator animate = this.mView.animate();
                int i10 = this.mViewHeight;
                if (!z10) {
                    i10 = -i10;
                }
                animate.translationY(i10).alpha(0.0f).setDuration(this.mAnimationTime).setListener(new AnimatorListenerAdapter() { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        SwipeDismissTouchListener.this.performDismiss();
                    }
                });
                return;
            }
        }
        this.mView.animate().translationY(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
    }

    private boolean isVerticalSwipeInAllowedDirection(float f10) {
        VerticalDismissDirection verticalDismissDirection = this.mVerticalDismissDirection;
        return verticalDismissDirection == VerticalDismissDirection.DOWN ? f10 > 0.0f : verticalDismissDirection == VerticalDismissDirection.UP && f10 < 0.0f;
    }

    private void requestDisallowParentIntercept(MotionEvent motionEvent) {
        this.mView.getParent().requestDisallowInterceptTouchEvent(true);
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
        this.mView.onTouchEvent(obtain);
        obtain.recycle();
    }

    private void resetTransientState() {
        this.mTranslationX = 0.0f;
        this.mTranslationY = 0.0f;
        this.mDownX = 0.0f;
        this.mDownY = 0.0f;
        this.mSwiping = false;
        this.mSwipingVertically = false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        motionEvent.offsetLocation(this.mTranslationX, this.mTranslationY);
        if (this.mViewWidth < 2) {
            this.mViewWidth = this.mView.getWidth();
        }
        if (this.mViewHeight < 2) {
            this.mViewHeight = this.mView.getHeight();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mDownX = motionEvent.getRawX();
            this.mDownY = motionEvent.getRawY();
            if (this.mCallbacks.canDismiss(this.mToken)) {
                VelocityTracker obtain = VelocityTracker.obtain();
                this.mVelocityTracker = obtain;
                obtain.addMovement(motionEvent);
            }
            return false;
        }
        if (actionMasked == 1) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
                this.mVelocityTracker.computeCurrentVelocity(1000);
                if (this.mSwipingVertically) {
                    handleVerticalActionUp(motionEvent);
                } else {
                    handleHorizontalActionUp(motionEvent);
                }
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
                resetTransientState();
            }
        } else if (actionMasked == 2) {
            VelocityTracker velocityTracker2 = this.mVelocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                float rawX = motionEvent.getRawX() - this.mDownX;
                float rawY = motionEvent.getRawY() - this.mDownY;
                if (!this.mSwiping && !this.mSwipingVertically) {
                    if (Math.abs(rawX) > this.mSlop && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.mSwiping = true;
                        this.mSwipingSlop = rawX > 0.0f ? this.mSlop : -this.mSlop;
                        requestDisallowParentIntercept(motionEvent);
                    } else if (this.mVerticalDismissDirection != VerticalDismissDirection.NONE && Math.abs(rawY) > this.mSlop && Math.abs(rawX) < Math.abs(rawY) / 2.0f && isVerticalSwipeInAllowedDirection(rawY)) {
                        this.mSwipingVertically = true;
                        this.mSwipingVerticalSlop = rawY > 0.0f ? this.mSlop : -this.mSlop;
                        requestDisallowParentIntercept(motionEvent);
                    }
                }
                if (this.mSwiping) {
                    this.mTranslationX = rawX;
                    this.mView.setTranslationX(rawX - this.mSwipingSlop);
                    return true;
                }
                if (this.mSwipingVertically) {
                    this.mTranslationY = rawY;
                    this.mView.setTranslationY(rawY - this.mSwipingVerticalSlop);
                    return true;
                }
            }
        } else if (actionMasked == 3 && this.mVelocityTracker != null) {
            this.mView.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
            resetTransientState();
        }
        return false;
    }

    public void performDismiss() {
        final ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
        final int height = this.mView.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.mAnimationTime);
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SwipeDismissTouchListener.this.mCallbacks.onDismiss(SwipeDismissTouchListener.this.mView, SwipeDismissTouchListener.this.mToken);
                SwipeDismissTouchListener.this.mView.setAlpha(1.0f);
                SwipeDismissTouchListener.this.mView.setTranslationX(0.0f);
                SwipeDismissTouchListener.this.mView.setTranslationY(0.0f);
                layoutParams.height = height;
                SwipeDismissTouchListener.this.mView.setLayoutParams(layoutParams);
            }
        });
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m4.t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SwipeDismissTouchListener.a(SwipeDismissTouchListener.this, layoutParams, valueAnimator);
            }
        });
        duration.start();
    }
}
