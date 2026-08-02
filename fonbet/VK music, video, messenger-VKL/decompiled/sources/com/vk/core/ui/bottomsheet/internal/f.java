package com.vk.core.ui.bottomsheet.internal;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;
import xsna.qq2;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes17.dex */
public final class f {
    public static final a y = new a();
    public int a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public float n;
    public final int o;
    public int p;
    public final OverScroller q;
    public final c r;
    public View s;
    public boolean t;
    public final ViewGroup u;
    public final int v;
    public final int w;
    public int c = -1;
    public final b x = new b();

    /* compiled from: ViewDragHelper.java */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.this.p(0);
        }
    }

    public f(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull c cVar) {
        this.v = 256;
        this.w = 600;
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.u = viewGroup;
        this.r = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.q = new OverScroller(context, y);
        this.v = 256;
        this.w = 600;
        this.v = qq2.d(context) ? 1 : 256;
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(int i, @NonNull View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.u;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.s = view;
        this.c = i;
        this.r.f();
        p(1);
    }

    public final boolean c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (this.p & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        float f3 = this.b;
        if (abs <= f3 && abs2 <= f3) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.r.getClass();
        }
        return (this.i[i] & i2) == 0 && abs > ((float) this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, float f, float f2) {
        if (view != null) {
            c cVar = this.r;
            boolean z = cVar.c() > 0;
            boolean z2 = cVar.d() > 0;
            if (z && z2) {
                float f3 = (f2 * f2) + (f * f);
                int i = this.b;
                if (f3 > i * i) {
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= this.b) : Math.abs(f) > this.b) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int f(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.u.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * this.v), this.w);
    }

    public final boolean g() {
        if (this.a == 2) {
            OverScroller overScroller = this.q;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.s.getLeft();
            int top = currY - this.s.getTop();
            if (left != 0) {
                View view = this.s;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.s;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.r.h(this.s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.u.post(this.x);
            }
        }
        return this.a == 2;
    }

    @Nullable
    public final View h(int i, int i2) {
        ViewGroup viewGroup = this.u;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.r.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.q;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.n;
        int abs2 = Math.abs(i4);
        if (abs2 < i9) {
            i4 = 0;
        } else if (abs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i10 = abs5 + abs6;
        int i11 = abs3 + abs4;
        if (i3 != 0) {
            f = abs5;
            f2 = i10;
        } else {
            f = abs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = abs6;
            f4 = i10;
        } else {
            f3 = abs4;
            f4 = i11;
        }
        float f6 = f3 / f4;
        c cVar = this.r;
        overScroller.startScroll(left, top, i5, i6, (int) ((f(i6, i4, cVar.d()) * f6) + (f(i5, i3, cVar.c()) * f5)));
        p(2);
        return true;
    }

    public final boolean j(int i) {
        if ((this.k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        c cVar = this.r;
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View h = h((int) x, (int) y2);
            n(x, y2, pointerId);
            t(pointerId, h);
            if ((this.h[pointerId] & this.p) != 0) {
                cVar.getClass();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (j(pointerId2)) {
                        float x2 = motionEvent.getX(i2);
                        float y3 = motionEvent.getY(i2);
                        float f = x2 - this.d[pointerId2];
                        float f2 = y3 - this.e[pointerId2];
                        m(f, f2, pointerId2);
                        if (this.a != 1) {
                            View h2 = h((int) x2, (int) y3);
                            if (d(h2, f, f2) && t(pointerId2, h2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.c);
                float x3 = motionEvent.getX(findPointerIndex);
                float y4 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f;
                int i3 = this.c;
                int i4 = (int) (x3 - fArr[i3]);
                int i5 = (int) (y4 - this.g[i3]);
                int left = this.s.getLeft() + i4;
                int top = this.s.getTop() + i5;
                int left2 = this.s.getLeft();
                int top2 = this.s.getTop();
                if (i4 != 0) {
                    left = cVar.a(left, this.s);
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    this.s.offsetLeftAndRight(left - left2);
                }
                int i6 = left;
                if (i5 != 0) {
                    top = cVar.b(top, this.s);
                    WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                    this.s.offsetTopAndBottom(top - top2);
                }
                int i7 = top;
                if (i4 != 0 || i5 != 0) {
                    this.r.h(this.s, i6, i7, i6 - left2, i7 - top2);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.a == 1) {
                this.t = true;
                cVar.i(this.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.t = false;
                if (this.a == 1) {
                    p(0);
                }
            }
            a();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.a == 1 && pointerId3 == this.c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount2) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.c) {
                        View h3 = h((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view = this.s;
                        if (h3 == view && t(pointerId4, view)) {
                            i = this.c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    l();
                }
            }
            e(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x4 = motionEvent.getX(actionIndex);
        float y5 = motionEvent.getY(actionIndex);
        n(x4, y5, pointerId5);
        if (this.a == 0) {
            t(pointerId5, h((int) x4, (int) y5));
            if ((this.h[pointerId5] & this.p) != 0) {
                cVar.getClass();
                return;
            }
            return;
        }
        int i8 = (int) x4;
        int i9 = (int) y5;
        View view2 = this.s;
        if (view2 != null && i8 >= view2.getLeft() && i8 < view2.getRight() && i9 >= view2.getTop() && i9 < view2.getBottom()) {
            i2 = 1;
        }
        if (i2 != 0) {
            t(pointerId5, this.s);
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float f2 = this.n;
        float abs = Math.abs(xVelocity);
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            xVelocity = xVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f : -f;
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float f3 = this.n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f3) {
            f = 0.0f;
        } else if (abs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = -f;
        }
        this.t = true;
        this.r.i(this.s, xVelocity, f);
        this.t = false;
        if (this.a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void m(float f, float f2, int i) {
        boolean c2 = c(f, f2, i, 1);
        boolean z = c2;
        if (c(f2, f, i, 4)) {
            z = (c2 ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (c(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (c(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r0;
            this.r.e(i);
        }
    }

    public final void n(float f, float f2, int i) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.u;
        int left = viewGroup.getLeft();
        int i5 = this.o;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < viewGroup.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > viewGroup.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > viewGroup.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.k |= 1 << i;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (j(pointerId)) {
                float x = motionEvent.getX(i);
                float y2 = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y2;
            }
        }
    }

    public final void p(int i) {
        this.u.removeCallbacks(this.x);
        if (this.a != i) {
            this.a = i;
            this.r.g(i);
            if (this.a == 0) {
                this.s = null;
            }
        }
    }

    public final boolean q(int i, int i2) {
        if (this.t) {
            return i(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(@NonNull MotionEvent motionEvent) {
        View h;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        c cVar = this.r;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            n(x, y2, pointerId);
                            int i = this.a;
                            if (i == 0) {
                                if ((this.h[pointerId] & this.p) != 0) {
                                    cVar.getClass();
                                }
                            } else if (i == 2 && (h = h((int) x, (int) y2)) == this.s) {
                                t(pointerId, h);
                            }
                        } else if (actionMasked == 6) {
                            e(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.d != null && this.e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (j(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y3 = motionEvent.getY(i2);
                            float f = x2 - this.d[pointerId2];
                            float f2 = y3 - this.e[pointerId2];
                            View h2 = h((int) x2, (int) y3);
                            boolean z = h2 != null && d(h2, f, f2);
                            if (z) {
                                int left = h2.getLeft();
                                int a2 = cVar.a(((int) f) + left, h2);
                                int top = h2.getTop();
                                int b2 = cVar.b(((int) f2) + top, h2);
                                int c2 = cVar.c();
                                int d = cVar.d();
                                if (c2 != 0) {
                                    if (c2 > 0) {
                                    }
                                }
                                if (d == 0) {
                                    break;
                                }
                                if (d > 0 && b2 == top) {
                                    break;
                                }
                            }
                            m(f, f2, pointerId2);
                            if (this.a == 1) {
                                break;
                            }
                            if (z && t(pointerId2, h2)) {
                                break;
                            }
                        }
                    }
                    o(motionEvent);
                }
            }
            a();
        } else {
            float x3 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            n(x3, y4, pointerId3);
            View h3 = h((int) x3, (int) y4);
            if (h3 == this.s && this.a == 2) {
                t(pointerId3, h3);
            }
            if ((this.h[pointerId3] & this.p) != 0) {
                cVar.getClass();
            }
        }
        return this.a == 1;
    }

    public final boolean s(int i, int i2, @NonNull View view) {
        this.s = view;
        this.c = -1;
        boolean i3 = i(i, i2, 0, 0);
        if (!i3 && this.a == 0 && this.s != null) {
            this.s = null;
        }
        return i3;
    }

    public final boolean t(int i, View view) {
        if (view == this.s && this.c == i) {
            return true;
        }
        if (view == null || !this.r.j(view, i)) {
            return false;
        }
        this.c = i;
        b(i, view);
        return true;
    }

    /* compiled from: ViewDragHelper.java */
    public static abstract class c {
        public abstract int a(int i, @NonNull View view);

        public abstract int b(int i, @NonNull View view);

        public int c() {
            return 0;
        }

        public abstract int d();

        public abstract void h(@NonNull View view, int i, int i2, int i3, int i4);

        public abstract void i(@NonNull View view, float f, float f2);

        public abstract boolean j(@NonNull View view, int i);

        public void f() {
        }

        public void e(int i) {
        }

        public void g(int i) {
        }
    }
}
