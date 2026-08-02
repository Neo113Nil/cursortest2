package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class y1 {
    private k1 mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final w1 mRecyclingAction;
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition = -1;
    private View mTargetView;

    public y1() {
        w1 w1Var = new w1();
        w1Var.f2582d = -1;
        w1Var.f2584f = false;
        w1Var.f2585g = 0;
        w1Var.f2579a = 0;
        w1Var.f2580b = 0;
        w1Var.f2581c = Integer.MIN_VALUE;
        w1Var.f2583e = null;
        this.mRecyclingAction = w1Var;
    }

    public PointF computeScrollVectorForPosition(int i5) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof x1) {
            return ((x1) layoutManager).computeScrollVectorForPosition(i5);
        }
        io.sentry.android.core.w0.m("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + x1.class.getCanonicalName());
        return null;
    }

    public View findViewByPosition(int i5) {
        return this.mRecyclerView.mLayout.findViewByPosition(i5);
    }

    public int getChildCount() {
        return this.mRecyclerView.mLayout.getChildCount();
    }

    public int getChildPosition(View view) {
        return this.mRecyclerView.getChildLayoutPosition(view);
    }

    public k1 getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    @Deprecated
    public void instantScrollToPosition(int i5) {
        this.mRecyclerView.scrollToPosition(i5);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(@NonNull PointF pointF) {
        float f6 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f6 * f6));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public void onAnimation(int i5, int i10) {
        PointF computeScrollVectorForPosition;
        RecyclerView recyclerView = this.mRecyclerView;
        if (this.mTargetPosition == -1 || recyclerView == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f6 = computeScrollVectorForPosition.x;
            if (f6 != 0.0f || computeScrollVectorForPosition.y != 0.0f) {
                recyclerView.scrollStep((int) Math.signum(f6), (int) Math.signum(computeScrollVectorForPosition.y), null);
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                this.mRecyclingAction.a(recyclerView);
                stop();
            } else {
                io.sentry.android.core.w0.d("RecyclerView", "Passed over target position while smooth scrolling.");
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i5, i10, recyclerView.mState, this.mRecyclingAction);
            w1 w1Var = this.mRecyclingAction;
            boolean z5 = w1Var.f2582d >= 0;
            w1Var.a(recyclerView);
            if (z5 && this.mRunning) {
                this.mPendingInitialRun = true;
                recyclerView.mViewFlinger.b();
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "smooth scroll target view has been attached");
            }
        }
    }

    public abstract void onSeekTargetStep(int i5, int i10, z1 z1Var, w1 w1Var);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, z1 z1Var, w1 w1Var);

    public void setTargetPosition(int i5) {
        this.mTargetPosition = i5;
    }

    public void start(RecyclerView recyclerView, k1 k1Var) {
        c2 c2Var = recyclerView.mViewFlinger;
        c2Var.f2361g.removeCallbacks(c2Var);
        c2Var.f2357c.abortAnimation();
        if (this.mStarted) {
            io.sentry.android.core.w0.m("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = k1Var;
        int i5 = this.mTargetPosition;
        if (i5 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.mState.f2595a = i5;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.mViewFlinger.b();
        this.mStarted = true;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.f2595a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }
}
