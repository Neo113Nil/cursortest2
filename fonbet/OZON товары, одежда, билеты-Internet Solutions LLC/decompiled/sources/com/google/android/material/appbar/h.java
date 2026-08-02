package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
abstract class h<V extends View> extends j<V> {

    /* renamed from: c, reason: collision with root package name */
    private Runnable f57969c;

    /* renamed from: d, reason: collision with root package name */
    OverScroller f57970d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f57971e;

    /* renamed from: f, reason: collision with root package name */
    private int f57972f;

    /* renamed from: g, reason: collision with root package name */
    private int f57973g;

    /* renamed from: h, reason: collision with root package name */
    private int f57974h;

    /* renamed from: i, reason: collision with root package name */
    private VelocityTracker f57975i;

    /* loaded from: classes9.dex */
    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f57976a;

        /* renamed from: b, reason: collision with root package name */
        private final V f57977b;

        a(CoordinatorLayout coordinatorLayout, V v11) {
            this.f57976a = coordinatorLayout;
            this.f57977b = v11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVar;
            OverScroller overScroller;
            V v11 = this.f57977b;
            if (v11 == null || (overScroller = (hVar = h.this).f57970d) == null) {
                return;
            }
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f57976a;
            if (!computeScrollOffset) {
                hVar.i(coordinatorLayout, v11);
                return;
            }
            hVar.k(coordinatorLayout, v11, hVar.f57970d.getCurrY());
            int i11 = Y.f42258g;
            v11.postOnAnimation(this);
        }
    }

    public h() {
        this.f57972f = -1;
        this.f57974h = -1;
    }

    boolean f(V v11) {
        return false;
    }

    int g(@NonNull V v11) {
        return -v11.getHeight();
    }

    int h(@NonNull V v11) {
        return v11.getHeight();
    }

    void i(CoordinatorLayout coordinatorLayout, V v11) {
    }

    int j(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, int i13) {
        int b11;
        int b12 = b();
        if (i12 == 0 || b12 < i12 || b12 > i13 || b12 == (b11 = com.google.common.primitives.e.b(i11, i12, i13))) {
            return 0;
        }
        e(b11);
        return b12 - b11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void k(CoordinatorLayout coordinatorLayout, View view, int i11) {
        j(coordinatorLayout, view, i11, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f57974h < 0) {
            this.f57974h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f57971e) {
            int i11 = this.f57972f;
            if (i11 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i11)) != -1) {
                int y11 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y11 - this.f57973g) > this.f57974h) {
                    this.f57973g = y11;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f57972f = -1;
            int x11 = (int) motionEvent.getX();
            int y12 = (int) motionEvent.getY();
            boolean z11 = f(v11) && coordinatorLayout.isPointInChildBounds(v11, x11, y12);
            this.f57971e = z11;
            if (z11) {
                this.f57973g = y12;
                this.f57972f = motionEvent.getPointerId(0);
                if (this.f57975i == null) {
                    this.f57975i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f57970d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f57970d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f57975i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        boolean z11;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f57972f);
                if (findPointerIndex != -1) {
                    int y11 = (int) motionEvent.getY(findPointerIndex);
                    int i11 = this.f57973g - y11;
                    this.f57973g = y11;
                    j(coordinatorLayout, v11, c() - i11, g(v11), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i12 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f57972f = motionEvent.getPointerId(i12);
                    this.f57973g = (int) (motionEvent.getY(i12) + 0.5f);
                }
            }
            z11 = false;
            velocityTracker2 = this.f57975i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f57971e || z11;
        }
        VelocityTracker velocityTracker3 = this.f57975i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f57975i.computeCurrentVelocity(1000);
            float yVelocity = this.f57975i.getYVelocity(this.f57972f);
            int i13 = -h(v11);
            Runnable runnable = this.f57969c;
            if (runnable != null) {
                v11.removeCallbacks(runnable);
                this.f57969c = null;
            }
            if (this.f57970d == null) {
                this.f57970d = new OverScroller(v11.getContext());
            }
            this.f57970d.fling(0, b(), 0, Math.round(yVelocity), 0, 0, i13, 0);
            if (this.f57970d.computeScrollOffset()) {
                a aVar = new a(coordinatorLayout, v11);
                this.f57969c = aVar;
                int i14 = Y.f42258g;
                v11.postOnAnimation(aVar);
            } else {
                i(coordinatorLayout, v11);
            }
            z11 = true;
            this.f57971e = false;
            this.f57972f = -1;
            velocityTracker = this.f57975i;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f57975i = null;
            }
            velocityTracker2 = this.f57975i;
            if (velocityTracker2 != null) {
            }
            if (this.f57971e) {
            }
        }
        z11 = false;
        this.f57971e = false;
        this.f57972f = -1;
        velocityTracker = this.f57975i;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f57975i;
        if (velocityTracker2 != null) {
        }
        if (this.f57971e) {
        }
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57972f = -1;
        this.f57974h = -1;
    }
}
