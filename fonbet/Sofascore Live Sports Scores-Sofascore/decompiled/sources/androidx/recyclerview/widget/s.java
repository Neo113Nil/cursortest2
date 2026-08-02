package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.prf;
import defpackage.qrf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class s {
    private n mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final r mRecyclingAction;
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition = -1;
    private View mTargetView;

    public s() {
        r rVar = new r();
        rVar.d = -1;
        rVar.f = false;
        rVar.a = 0;
        rVar.b = 0;
        rVar.c = Integer.MIN_VALUE;
        rVar.e = null;
        this.mRecyclingAction = rVar;
    }

    @Nullable
    public PointF computeScrollVectorForPosition(int i) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof prf) {
            return ((prf) layoutManager).computeScrollVectorForPosition(i);
        }
        return null;
    }

    public View findViewByPosition(int i) {
        return this.mRecyclerView.mLayout.findViewByPosition(i);
    }

    public int getChildCount() {
        return this.mRecyclerView.mLayout.getChildCount();
    }

    public int getChildPosition(View view) {
        return this.mRecyclerView.getChildLayoutPosition(view);
    }

    @Nullable
    public n getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    @Deprecated
    public void instantScrollToPosition(int i) {
        this.mRecyclerView.scrollToPosition(i);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(@NonNull PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public void onAnimation(int i, int i2) {
        PointF computeScrollVectorForPosition;
        RecyclerView recyclerView = this.mRecyclerView;
        if (this.mTargetPosition == -1 || recyclerView == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f = computeScrollVectorForPosition.x;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || computeScrollVectorForPosition.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(computeScrollVectorForPosition.y), null);
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
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
            r rVar = this.mRecyclingAction;
            boolean z = rVar.d >= 0;
            rVar.a(recyclerView);
            if (z && this.mRunning) {
                this.mPendingInitialRun = true;
                recyclerView.mViewFlinger.b();
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
            int i = RecyclerView.HORIZONTAL;
        }
    }

    public abstract void onSeekTargetStep(int i, int i2, qrf qrfVar, r rVar);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, qrf qrfVar, r rVar);

    public void setTargetPosition(int i) {
        this.mTargetPosition = i;
    }

    public void start(RecyclerView recyclerView, n nVar) {
        t tVar = recyclerView.mViewFlinger;
        tVar.g.removeCallbacks(tVar);
        tVar.c.abortAnimation();
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = nVar;
        int i = this.mTargetPosition;
        if (i == -1) {
            a70.p("Invalid target position");
            return;
        }
        recyclerView.mState.a = i;
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
            this.mRecyclerView.mState.a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }
}
