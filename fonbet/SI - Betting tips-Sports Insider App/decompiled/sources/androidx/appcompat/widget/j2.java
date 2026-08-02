package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j2 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f794c;

    /* renamed from: d, reason: collision with root package name */
    public final View f795d;

    /* renamed from: e, reason: collision with root package name */
    public i2 f796e;

    /* renamed from: f, reason: collision with root package name */
    public i2 f797f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f798g;

    /* renamed from: h, reason: collision with root package name */
    public int f799h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f800i = new int[2];

    public j2(View view) {
        this.f795d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f792a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f793b = tapTimeout;
        this.f794c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        i2 i2Var = this.f797f;
        View view = this.f795d;
        if (i2Var != null) {
            view.removeCallbacks(i2Var);
        }
        i2 i2Var2 = this.f796e;
        if (i2Var2 != null) {
            view.removeCallbacks(i2Var2);
        }
    }

    public abstract androidx.appcompat.view.menu.d0 b();

    public abstract boolean c();

    public boolean d() {
        androidx.appcompat.view.menu.d0 b10 = b();
        if (b10 == null || !b10.a()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z5;
        g2 f6;
        boolean z7 = this.f798g;
        View view2 = this.f795d;
        if (z7) {
            androidx.appcompat.view.menu.d0 b10 = b();
            if (b10 != null && b10.a() && (f6 = b10.f()) != null && f6.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f800i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                f6.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b11 = f6.b(obtainNoHistory, this.f799h);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b11) {
                }
            }
            if (d()) {
                z5 = false;
            }
            z5 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f799h);
                            if (findPointerIndex >= 0) {
                                float x10 = motionEvent.getX(findPointerIndex);
                                float y5 = motionEvent.getY(findPointerIndex);
                                float f10 = this.f792a;
                                float f11 = -f10;
                                if (x10 < f11 || y5 < f11 || x10 >= (view2.getRight() - view2.getLeft()) + f10 || y5 >= (view2.getBottom() - view2.getTop()) + f10) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z5 = true;
                                        if (z5) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f799h = motionEvent.getPointerId(0);
                    if (this.f796e == null) {
                        this.f796e = new i2(this, 0);
                    }
                    view2.postDelayed(this.f796e, this.f793b);
                    if (this.f797f == null) {
                        this.f797f = new i2(this, 1);
                    }
                    view2.postDelayed(this.f797f, this.f794c);
                }
            }
            z5 = false;
            if (z5) {
            }
        }
        this.f798g = z5;
        return z5 || z7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f798g = false;
        this.f799h = -1;
        i2 i2Var = this.f796e;
        if (i2Var != null) {
            this.f795d.removeCallbacks(i2Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
