package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class y79 extends xtk {
    public lv4 c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i) {
        z(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // defpackage.us3
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int findPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i = this.f;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y - this.g) > this.h) {
                    this.g = y;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).n;
            boolean z = (weakReference == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.n(view, x, y2);
            this.e = z;
            if (z) {
                this.g = y2;
                this.f = motionEvent.getPointerId(0);
                if (this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    @Override // defpackage.us3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i = this.g - y;
                    this.g = y;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    z(coordinatorLayout, view, y() - i, appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange()), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f = motionEvent.getPointerId(i2);
                    this.g = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.e || z;
        }
        VelocityTracker velocityTracker3 = this.i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.i.computeCurrentVelocity(1000);
            float yVelocity = this.i.getYVelocity(this.f);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i3 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = this.c;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.c = null;
            }
            OverScroller overScroller = this.d;
            if (overScroller == null) {
                overScroller = new OverScroller(view.getContext());
                this.d = overScroller;
            }
            overScroller.fling(0, w(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.d.computeScrollOffset()) {
                lv4 lv4Var = new lv4(4, this, coordinatorLayout, view);
                this.c = lv4Var;
                view.postOnAnimation(lv4Var);
            } else {
                ((AppBarLayout.BaseBehavior) this).F(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.l) {
                    appBarLayout2.h(appBarLayout2.i(AppBarLayout.BaseBehavior.C(coordinatorLayout)));
                }
            }
            z = true;
            this.e = false;
            this.f = -1;
            velocityTracker = this.i;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.i = null;
            }
            velocityTracker2 = this.i;
            if (velocityTracker2 != null) {
            }
            if (this.e) {
            }
        }
        z = false;
        this.e = false;
        this.f = -1;
        velocityTracker = this.i;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.i;
        if (velocityTracker2 != null) {
        }
        if (this.e) {
        }
    }

    public abstract int y();

    public abstract int z(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);
}
