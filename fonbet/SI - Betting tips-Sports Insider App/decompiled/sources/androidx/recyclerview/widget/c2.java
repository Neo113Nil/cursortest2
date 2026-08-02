package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f2355a;

    /* renamed from: b, reason: collision with root package name */
    public int f2356b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f2357c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f2358d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2359e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2361g;

    public c2(RecyclerView recyclerView) {
        this.f2361g = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f2358d = interpolator;
        this.f2359e = false;
        this.f2360f = false;
        this.f2357c = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void a(int i5, int i10) {
        RecyclerView recyclerView = this.f2361g;
        recyclerView.setScrollState(2);
        this.f2356b = 0;
        this.f2355a = 0;
        Interpolator interpolator = this.f2358d;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f2358d = interpolator2;
            this.f2357c = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f2357c.fling(0, 0, i5, i10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f2359e) {
            this.f2360f = true;
            return;
        }
        RecyclerView recyclerView = this.f2361g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i5, int i10, Interpolator interpolator, int i11) {
        RecyclerView recyclerView = this.f2361g;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i5);
            int abs2 = Math.abs(i10);
            boolean z5 = abs > abs2;
            int width = z5 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z5) {
                abs = abs2;
            }
            i11 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i12 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f2358d != interpolator) {
            this.f2358d = interpolator;
            this.f2357c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2356b = 0;
        this.f2355a = 0;
        recyclerView.setScrollState(2);
        this.f2357c.startScroll(0, 0, i5, i10, i12);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f2361g;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f2357c.abortAnimation();
            return;
        }
        this.f2360f = false;
        this.f2359e = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f2357c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i13 = currX - this.f2355a;
            int i14 = currY - this.f2356b;
            this.f2355a = currX;
            this.f2356b = currY;
            int consumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i13);
            int consumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i14);
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                consumeFlingInHorizontalStretch -= iArr2[0];
                consumeFlingInVerticalStretch -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i15 = iArr4[0];
                int i16 = iArr4[1];
                int i17 = consumeFlingInHorizontalStretch - i15;
                int i18 = consumeFlingInVerticalStretch - i16;
                y1 y1Var = recyclerView.mLayout.mSmoothScroller;
                if (y1Var != null && !y1Var.isPendingInitialRun() && y1Var.isRunning()) {
                    int b10 = recyclerView.mState.b();
                    if (b10 == 0) {
                        y1Var.stop();
                    } else if (y1Var.getTargetPosition() >= b10) {
                        y1Var.setTargetPosition(b10 - 1);
                        y1Var.onAnimation(i15, i16);
                    } else {
                        y1Var.onAnimation(i15, i16);
                    }
                }
                i5 = i17;
                i11 = i15;
                i10 = i18;
                i12 = i16;
            } else {
                i5 = consumeFlingInHorizontalStretch;
                i10 = consumeFlingInVerticalStretch;
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i11, i12, i5, i10, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i19 = i5 - iArr6[0];
            int i20 = i10 - iArr6[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.dispatchOnScrolled(i11, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z5 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
            y1 y1Var2 = recyclerView.mLayout.mSmoothScroller;
            if ((y1Var2 == null || !y1Var2.isPendingInitialRun()) && z5) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i21 = i19 < 0 ? -currVelocity : i19 > 0 ? currVelocity : 0;
                    if (i20 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i20 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i21, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    d0 d0Var = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = d0Var.f2367c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    d0Var.f2368d = 0;
                }
            } else {
                b();
                f0 f0Var = recyclerView.mGapWorker;
                if (f0Var != null) {
                    f0Var.a(recyclerView, i11, i12);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                a1.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        y1 y1Var3 = recyclerView.mLayout.mSmoothScroller;
        if (y1Var3 != null && y1Var3.isPendingInitialRun()) {
            y1Var3.onAnimation(0, 0);
        }
        this.f2359e = false;
        if (!this.f2360f) {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
            recyclerView.postOnAnimation(this);
        }
    }
}
