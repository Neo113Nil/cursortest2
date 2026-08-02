package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class L implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f16992a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16993b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16994c;

    /* renamed from: d, reason: collision with root package name */
    public final View f16995d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f16996e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f16997f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16998g;

    /* renamed from: h, reason: collision with root package name */
    public int f16999h;
    private final int[] mTmpLocation = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = L.this.f16995d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            L.this.e();
        }
    }

    public L(View view) {
        this.f16995d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f16992a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f16993b = tapTimeout;
        this.f16994c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    public final void a() {
        Runnable runnable = this.f16997f;
        if (runnable != null) {
            this.f16995d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f16996e;
        if (runnable2 != null) {
            this.f16995d.removeCallbacks(runnable2);
        }
    }

    public abstract r.f b();

    public abstract boolean c();

    public boolean d() {
        r.f b10 = b();
        if (b10 == null || !b10.isShowing()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f16995d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f16998g = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        J j10;
        View view = this.f16995d;
        r.f b10 = b();
        if (b10 != null && b10.isShowing() && (j10 = (J) b10.n()) != null && j10.isShown()) {
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, obtainNoHistory);
            j(j10, obtainNoHistory);
            boolean e10 = j10.e(obtainNoHistory, this.f16999h);
            obtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (e10 && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(MotionEvent motionEvent) {
        View view = this.f16995d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f16999h);
                    if (findPointerIndex >= 0 && !h(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f16992a)) {
                        a();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            }
            a();
        } else {
            this.f16999h = motionEvent.getPointerId(0);
            if (this.f16996e == null) {
                this.f16996e = new a();
            }
            view.postDelayed(this.f16996e, this.f16993b);
            if (this.f16997f == null) {
                this.f16997f = new b();
            }
            view.postDelayed(this.f16997f, this.f16994c);
        }
        return false;
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.mTmpLocation);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.mTmpLocation);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f16998g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f16995d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f16998g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f16998g = false;
        this.f16999h = -1;
        Runnable runnable = this.f16996e;
        if (runnable != null) {
            this.f16995d.removeCallbacks(runnable);
        }
    }
}
