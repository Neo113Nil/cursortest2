package ka;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public abstract class d extends f {

    /* renamed from: d, reason: collision with root package name */
    public Runnable f54346d;

    /* renamed from: e, reason: collision with root package name */
    public OverScroller f54347e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f54348f;

    /* renamed from: g, reason: collision with root package name */
    public int f54349g;

    /* renamed from: h, reason: collision with root package name */
    public int f54350h;

    /* renamed from: i, reason: collision with root package name */
    public int f54351i;

    /* renamed from: j, reason: collision with root package name */
    public VelocityTracker f54352j;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final CoordinatorLayout f54353a;

        /* renamed from: b, reason: collision with root package name */
        public final View f54354b;

        public a(CoordinatorLayout coordinatorLayout, View view) {
            this.f54353a = coordinatorLayout;
            this.f54354b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f54354b == null || (overScroller = d.this.f54347e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                d.this.R(this.f54353a, this.f54354b);
                return;
            }
            d dVar = d.this;
            dVar.T(this.f54353a, this.f54354b, dVar.f54347e.getCurrY());
            this.f54354b.postOnAnimation(this);
        }
    }

    public d() {
        this.f54349g = -1;
        this.f54351i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f54349g);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y10 = (int) motionEvent.getY(findPointerIndex);
                int i10 = this.f54350h - y10;
                this.f54350h = y10;
                S(coordinatorLayout, view, i10, O(view), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f54349g = motionEvent.getPointerId(i11);
                    this.f54350h = (int) (motionEvent.getY(i11) + 0.5f);
                }
            }
            z10 = false;
            velocityTracker2 = this.f54352j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f54348f || z10;
        }
        VelocityTracker velocityTracker3 = this.f54352j;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f54352j.computeCurrentVelocity(1000);
            N(coordinatorLayout, view, -P(view), 0, this.f54352j.getYVelocity(this.f54349g));
            z10 = true;
            this.f54348f = false;
            this.f54349g = -1;
            velocityTracker = this.f54352j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f54352j = null;
            }
            velocityTracker2 = this.f54352j;
            if (velocityTracker2 != null) {
            }
            if (this.f54348f) {
            }
        }
        z10 = false;
        this.f54348f = false;
        this.f54349g = -1;
        velocityTracker = this.f54352j;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f54352j;
        if (velocityTracker2 != null) {
        }
        if (this.f54348f) {
        }
    }

    public abstract boolean L(View view);

    public final void M() {
        if (this.f54352j == null) {
            this.f54352j = VelocityTracker.obtain();
        }
    }

    public final boolean N(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f54346d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f54346d = null;
        }
        if (this.f54347e == null) {
            this.f54347e = new OverScroller(view.getContext());
        }
        this.f54347e.fling(0, I(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f54347e.computeScrollOffset()) {
            R(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f54346d = aVar;
        view.postOnAnimation(aVar);
        return true;
    }

    public abstract int O(View view);

    public abstract int P(View view);

    public abstract int Q();

    public abstract void R(CoordinatorLayout coordinatorLayout, View view);

    public final int S(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return U(coordinatorLayout, view, Q() - i10, i11, i12);
    }

    public int T(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return U(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public abstract int U(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f54351i < 0) {
            this.f54351i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f54348f) {
            int i10 = this.f54349g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f54350h) > this.f54351i) {
                this.f54350h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f54349g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = L(view) && coordinatorLayout.w(view, x10, y11);
            this.f54348f = z10;
            if (z10) {
                this.f54350h = y11;
                this.f54349g = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f54347e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f54347e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f54352j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54349g = -1;
        this.f54351i = -1;
    }
}
