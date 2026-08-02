package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.AbstractC2082d0;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: q, reason: collision with root package name */
    public static final Interpolator f19361q = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f19362a;

    /* renamed from: b, reason: collision with root package name */
    public int f19363b;

    /* renamed from: d, reason: collision with root package name */
    public int f19365d;

    /* renamed from: e, reason: collision with root package name */
    public VelocityTracker f19366e;

    /* renamed from: f, reason: collision with root package name */
    public float f19367f;

    /* renamed from: g, reason: collision with root package name */
    public float f19368g;

    /* renamed from: h, reason: collision with root package name */
    public int f19369h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19370i;

    /* renamed from: j, reason: collision with root package name */
    public int f19371j;

    /* renamed from: k, reason: collision with root package name */
    public OverScroller f19372k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0369c f19373l;

    /* renamed from: m, reason: collision with root package name */
    public View f19374m;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19375n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewGroup f19376o;

    /* renamed from: c, reason: collision with root package name */
    public int f19364c = -1;

    /* renamed from: p, reason: collision with root package name */
    public final Runnable f19377p = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.K(0);
        }
    }

    /* renamed from: androidx.customview.widget.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0369c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0369c abstractC0369c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0369c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f19376o = viewGroup;
        this.f19373l = abstractC0369c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f19370i = i10;
        this.f19369h = i10;
        this.f19363b = viewConfiguration.getScaledTouchSlop();
        this.f19367f = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f19368g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f19372k = new OverScroller(context, f19361q);
    }

    public static c n(ViewGroup viewGroup, float f10, AbstractC0369c abstractC0369c) {
        c o10 = o(viewGroup, abstractC0369c);
        o10.f19363b = (int) (o10.f19363b * (1.0f / f10));
        return o10;
    }

    public static c o(ViewGroup viewGroup, AbstractC0369c abstractC0369c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0369c);
    }

    public int A() {
        return this.f19362a;
    }

    public boolean B(int i10, int i11) {
        return E(this.f19374m, i10, i11);
    }

    public boolean C(int i10) {
        return ((1 << i10) & this.f19365d) != 0;
    }

    public final boolean D(int i10) {
        if (C(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean E(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f19366e == null) {
            this.f19366e = VelocityTracker.obtain();
        }
        this.f19366e.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View t10 = t((int) x10, (int) y10);
            I(x10, y10, pointerId);
            R(t10, pointerId);
            int i12 = this.mInitialEdgesTouched[pointerId];
            int i13 = this.f19371j;
            if ((i12 & i13) != 0) {
                this.f19373l.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f19362a == 1) {
                G();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f19362a == 1) {
                if (D(this.f19364c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f19364c);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.mLastMotionX;
                    int i14 = this.f19364c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.mLastMotionY[i14]);
                    r(this.f19374m.getLeft() + i15, this.f19374m.getTop() + i16, i15, i16);
                    J(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (D(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.mInitialMotionX[pointerId2];
                    float f11 = y12 - this.mInitialMotionY[pointerId2];
                    H(f10, f11, pointerId2);
                    if (this.f19362a != 1) {
                        View t11 = t((int) x12, (int) y12);
                        if (f(t11, f10, f11) && R(t11, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            J(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f19362a == 1) {
                p(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            I(x13, y13, pointerId3);
            if (this.f19362a != 0) {
                if (B((int) x13, (int) y13)) {
                    R(this.f19374m, pointerId3);
                    return;
                }
                return;
            } else {
                R(t((int) x13, (int) y13), pointerId3);
                int i17 = this.mInitialEdgesTouched[pointerId3];
                int i18 = this.f19371j;
                if ((i17 & i18) != 0) {
                    this.f19373l.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f19362a == 1 && pointerId4 == this.f19364c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f19364c) {
                    View t12 = t((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f19374m;
                    if (t12 == view && R(view, pointerId5)) {
                        i10 = this.f19364c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                G();
            }
        }
        j(pointerId4);
    }

    public final void G() {
        this.f19366e.computeCurrentVelocity(1000, this.f19367f);
        p(g(this.f19366e.getXVelocity(this.f19364c), this.f19368g, this.f19367f), g(this.f19366e.getYVelocity(this.f19364c), this.f19368g, this.f19367f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.c$c] */
    public final void H(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        boolean z10 = c10;
        if (c(f11, f10, i10, 4)) {
            z10 = (c10 ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (c(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (c(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i10] = iArr[i10] | r02;
            this.f19373l.f(r02, i10);
        }
    }

    public final void I(float f10, float f11, int i10) {
        s(i10);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.mInitialMotionY;
        this.mLastMotionY[i10] = f11;
        fArr2[i10] = f11;
        this.mInitialEdgesTouched[i10] = y((int) f10, (int) f11);
        this.f19365d |= 1 << i10;
    }

    public final void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (D(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.mLastMotionX[pointerId] = x10;
                this.mLastMotionY[pointerId] = y10;
            }
        }
    }

    public void K(int i10) {
        this.f19376o.removeCallbacks(this.f19377p);
        if (this.f19362a != i10) {
            this.f19362a = i10;
            this.f19373l.j(i10);
            if (this.f19362a == 0) {
                this.f19374m = null;
            }
        }
    }

    public void L(int i10) {
        this.f19369h = i10;
    }

    public void M(int i10) {
        this.f19371j = i10;
    }

    public void N(float f10) {
        this.f19368g = f10;
    }

    public boolean O(int i10, int i11) {
        if (this.f19375n) {
            return u(i10, i11, (int) this.f19366e.getXVelocity(this.f19364c), (int) this.f19366e.getYVelocity(this.f19364c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean P(MotionEvent motionEvent) {
        View t10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f19366e == null) {
            this.f19366e = VelocityTracker.obtain();
        }
        this.f19366e.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x10 = motionEvent.getX(actionIndex);
                            float y10 = motionEvent.getY(actionIndex);
                            I(x10, y10, pointerId);
                            int i10 = this.f19362a;
                            if (i10 == 0) {
                                int i11 = this.mInitialEdgesTouched[pointerId];
                                int i12 = this.f19371j;
                                if ((i11 & i12) != 0) {
                                    this.f19373l.h(i11 & i12, pointerId);
                                }
                            } else if (i10 == 2 && (t10 = t((int) x10, (int) y10)) == this.f19374m) {
                                R(t10, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            j(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.mInitialMotionX != null && this.mInitialMotionY != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i13 = 0; i13 < pointerCount; i13++) {
                        int pointerId2 = motionEvent.getPointerId(i13);
                        if (D(pointerId2)) {
                            float x11 = motionEvent.getX(i13);
                            float y11 = motionEvent.getY(i13);
                            float f10 = x11 - this.mInitialMotionX[pointerId2];
                            float f11 = y11 - this.mInitialMotionY[pointerId2];
                            View t11 = t((int) x11, (int) y11);
                            boolean z10 = t11 != null && f(t11, f10, f11);
                            if (z10) {
                                int left = t11.getLeft();
                                int i14 = (int) f10;
                                int a10 = this.f19373l.a(t11, left + i14, i14);
                                int top = t11.getTop();
                                int i15 = (int) f11;
                                int b10 = this.f19373l.b(t11, top + i15, i15);
                                int d10 = this.f19373l.d(t11);
                                int e10 = this.f19373l.e(t11);
                                if (d10 != 0) {
                                    if (d10 > 0) {
                                    }
                                }
                                if (e10 == 0) {
                                    break;
                                }
                                if (e10 > 0 && b10 == top) {
                                    break;
                                }
                            }
                            H(f10, f11, pointerId2);
                            if (this.f19362a == 1) {
                                break;
                            }
                            if (z10 && R(t11, pointerId2)) {
                                break;
                            }
                        }
                    }
                    J(motionEvent);
                }
            }
            a();
        } else {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            I(x12, y12, pointerId3);
            View t12 = t((int) x12, (int) y12);
            if (t12 == this.f19374m && this.f19362a == 2) {
                R(t12, pointerId3);
            }
            int i16 = this.mInitialEdgesTouched[pointerId3];
            int i17 = this.f19371j;
            if ((i16 & i17) != 0) {
                this.f19373l.h(i16 & i17, pointerId3);
            }
        }
        return this.f19362a == 1;
    }

    public boolean Q(View view, int i10, int i11) {
        this.f19374m = view;
        this.f19364c = -1;
        boolean u10 = u(i10, i11, 0, 0);
        if (!u10 && this.f19362a == 0 && this.f19374m != null) {
            this.f19374m = null;
        }
        return u10;
    }

    public boolean R(View view, int i10) {
        if (view == this.f19374m && this.f19364c == i10) {
            return true;
        }
        if (view == null || !this.f19373l.m(view, i10)) {
            return false;
        }
        this.f19364c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f19364c = -1;
        i();
        VelocityTracker velocityTracker = this.f19366e;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f19366e = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f19376o) {
            this.f19374m = view;
            this.f19364c = i10;
            this.f19373l.i(view, i10);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f19376o + ")");
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.mInitialEdgesTouched[i10] & i11) == i11 && (this.f19371j & i11) != 0 && (this.mEdgeDragsLocked[i10] & i11) != i11 && (this.mEdgeDragsInProgress[i10] & i11) != i11) {
            int i12 = this.f19363b;
            if (abs > i12 || abs2 > i12) {
                if (abs < abs2 * 0.5f && this.f19373l.g(i11)) {
                    int[] iArr = this.mEdgeDragsLocked;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.mEdgeDragsInProgress[i10] & i11) == 0 && abs > this.f19363b) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int length = this.mInitialMotionX.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (e(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10, int i11) {
        if (!C(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f10 = this.mLastMotionX[i11] - this.mInitialMotionX[i11];
        float f11 = this.mLastMotionY[i11] - this.mInitialMotionY[i11];
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f19363b) : z11 && Math.abs(f11) > ((float) this.f19363b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i12 = this.f19363b;
        return f12 > ((float) (i12 * i12));
    }

    public final boolean f(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f19373l.d(view) > 0;
        boolean z11 = this.f19373l.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f19363b) : z11 && Math.abs(f11) > ((float) this.f19363b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i10 = this.f19363b;
        return f12 > ((float) (i10 * i10));
    }

    public final float g(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public final int h(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    public final void i() {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.mInitialMotionY, 0.0f);
        Arrays.fill(this.mLastMotionX, 0.0f);
        Arrays.fill(this.mLastMotionY, 0.0f);
        Arrays.fill(this.mInitialEdgesTouched, 0);
        Arrays.fill(this.mEdgeDragsInProgress, 0);
        Arrays.fill(this.mEdgeDragsLocked, 0);
        this.f19365d = 0;
    }

    public final void j(int i10) {
        if (this.mInitialMotionX == null || !C(i10)) {
            return;
        }
        this.mInitialMotionX[i10] = 0.0f;
        this.mInitialMotionY[i10] = 0.0f;
        this.mLastMotionX[i10] = 0.0f;
        this.mLastMotionY[i10] = 0.0f;
        this.mInitialEdgesTouched[i10] = 0;
        this.mEdgeDragsInProgress[i10] = 0;
        this.mEdgeDragsLocked[i10] = 0;
        this.f19365d = (~(1 << i10)) & this.f19365d;
    }

    public final int k(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f19376o.getWidth();
        float f10 = width / 2;
        float q10 = f10 + (q(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs(q10 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final int l(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int h10 = h(i12, (int) this.f19368g, (int) this.f19367f);
        int h11 = h(i13, (int) this.f19368g, (int) this.f19367f);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(h10);
        int abs4 = Math.abs(h11);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (h10 != 0) {
            f10 = abs3;
            f11 = i14;
        } else {
            f10 = abs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (h11 != 0) {
            f12 = abs4;
            f13 = i14;
        } else {
            f12 = abs2;
            f13 = i15;
        }
        return (int) ((k(i10, h10, this.f19373l.d(view)) * f14) + (k(i11, h11, this.f19373l.e(view)) * (f12 / f13)));
    }

    public boolean m(boolean z10) {
        if (this.f19362a == 2) {
            boolean computeScrollOffset = this.f19372k.computeScrollOffset();
            int currX = this.f19372k.getCurrX();
            int currY = this.f19372k.getCurrY();
            int left = currX - this.f19374m.getLeft();
            int top = currY - this.f19374m.getTop();
            if (left != 0) {
                AbstractC2082d0.V(this.f19374m, left);
            }
            if (top != 0) {
                AbstractC2082d0.W(this.f19374m, top);
            }
            if (left != 0 || top != 0) {
                this.f19373l.k(this.f19374m, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f19372k.getFinalX() && currY == this.f19372k.getFinalY()) {
                this.f19372k.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f19376o.post(this.f19377p);
                } else {
                    K(0);
                }
            }
        }
        return this.f19362a == 2;
    }

    public final void p(float f10, float f11) {
        this.f19375n = true;
        this.f19373l.l(this.f19374m, f10, f11);
        this.f19375n = false;
        if (this.f19362a == 1) {
            K(0);
        }
    }

    public final float q(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public final void r(int i10, int i11, int i12, int i13) {
        int left = this.f19374m.getLeft();
        int top = this.f19374m.getTop();
        if (i12 != 0) {
            i10 = this.f19373l.a(this.f19374m, i10, i12);
            AbstractC2082d0.V(this.f19374m, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f19373l.b(this.f19374m, i11, i13);
            AbstractC2082d0.W(this.f19374m, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f19373l.k(this.f19374m, i14, i15, i14 - left, i15 - top);
    }

    public final void s(int i10) {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.mInitialMotionY;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.mLastMotionX;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.mLastMotionY;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.mInitialEdgesTouched;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.mEdgeDragsInProgress;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.mEdgeDragsLocked;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.mInitialMotionX = fArr2;
            this.mInitialMotionY = fArr3;
            this.mLastMotionX = fArr4;
            this.mLastMotionY = fArr5;
            this.mInitialEdgesTouched = iArr;
            this.mEdgeDragsInProgress = iArr2;
            this.mEdgeDragsLocked = iArr3;
        }
    }

    public View t(int i10, int i11) {
        for (int childCount = this.f19376o.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f19376o.getChildAt(this.f19373l.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean u(int i10, int i11, int i12, int i13) {
        int left = this.f19374m.getLeft();
        int top = this.f19374m.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f19372k.abortAnimation();
            K(0);
            return false;
        }
        this.f19372k.startScroll(left, top, i14, i15, l(this.f19374m, i14, i15, i12, i13));
        K(2);
        return true;
    }

    public View v() {
        return this.f19374m;
    }

    public int w() {
        return this.f19370i;
    }

    public int x() {
        return this.f19369h;
    }

    public final int y(int i10, int i11) {
        int i12 = i10 < this.f19376o.getLeft() + this.f19369h ? 1 : 0;
        if (i11 < this.f19376o.getTop() + this.f19369h) {
            i12 |= 4;
        }
        if (i10 > this.f19376o.getRight() - this.f19369h) {
            i12 |= 2;
        }
        return i11 > this.f19376o.getBottom() - this.f19369h ? i12 | 8 : i12;
    }

    public int z() {
        return this.f19363b;
    }
}
