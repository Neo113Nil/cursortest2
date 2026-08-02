package androidx.customview.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.core.view.z0;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.android.core.w0;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: x, reason: collision with root package name */
    public static final g f1550x = new g(0);

    /* renamed from: a, reason: collision with root package name */
    public int f1551a;

    /* renamed from: b, reason: collision with root package name */
    public int f1552b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f1554d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1555e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1556f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f1557g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f1558h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f1559i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f1560k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1561l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1562m;

    /* renamed from: n, reason: collision with root package name */
    public float f1563n;

    /* renamed from: o, reason: collision with root package name */
    public int f1564o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1565p;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f1566r;

    /* renamed from: s, reason: collision with root package name */
    public final h f1567s;

    /* renamed from: t, reason: collision with root package name */
    public View f1568t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1569u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f1570v;

    /* renamed from: c, reason: collision with root package name */
    public int f1553c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.core.widget.b f1571w = new androidx.core.widget.b(1, this);

    public i(Context context, ViewGroup viewGroup, h hVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1570v = viewGroup;
        this.f1567s = hVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i5 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1565p = i5;
        this.f1564o = i5;
        this.f1552b = viewConfiguration.getScaledTouchSlop();
        this.f1562m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1563n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1566r = new OverScroller(context, f1550x);
    }

    public final void a() {
        this.f1553c = -1;
        float[] fArr = this.f1554d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1555e, 0.0f);
            Arrays.fill(this.f1556f, 0.0f);
            Arrays.fill(this.f1557g, 0.0f);
            Arrays.fill(this.f1558h, 0);
            Arrays.fill(this.f1559i, 0);
            Arrays.fill(this.j, 0);
            this.f1560k = 0;
        }
        VelocityTracker velocityTracker = this.f1561l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1561l = null;
        }
    }

    public final void b(int i5, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f1570v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f1568t = view;
        this.f1553c = i5;
        this.f1567s.onViewCaptured(view, i5);
        p(1);
    }

    public final boolean c(float f6, float f10, int i5, int i10) {
        float abs = Math.abs(f6);
        float abs2 = Math.abs(f10);
        if ((this.f1558h[i5] & i10) == i10 && (this.q & i10) != 0 && (this.j[i5] & i10) != i10 && (this.f1559i[i5] & i10) != i10) {
            float f11 = this.f1552b;
            if (abs > f11 || abs2 > f11) {
                if (abs < abs2 * 0.5f && this.f1567s.onEdgeLock(i10)) {
                    int[] iArr = this.j;
                    iArr[i5] = iArr[i5] | i10;
                    return false;
                }
                if ((this.f1559i[i5] & i10) == 0 && abs > this.f1552b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(float f6, float f10, View view) {
        if (view == null) {
            return false;
        }
        h hVar = this.f1567s;
        boolean z5 = hVar.getViewHorizontalDragRange(view) > 0;
        boolean z7 = hVar.getViewVerticalDragRange(view) > 0;
        if (!z5 || !z7) {
            return z5 ? Math.abs(f6) > ((float) this.f1552b) : z7 && Math.abs(f10) > ((float) this.f1552b);
        }
        float f11 = (f10 * f10) + (f6 * f6);
        int i5 = this.f1552b;
        return f11 > ((float) (i5 * i5));
    }

    public final void e(int i5) {
        float[] fArr = this.f1554d;
        if (fArr != null) {
            int i10 = this.f1560k;
            int i11 = 1 << i5;
            if ((i10 & i11) != 0) {
                fArr[i5] = 0.0f;
                this.f1555e[i5] = 0.0f;
                this.f1556f[i5] = 0.0f;
                this.f1557g[i5] = 0.0f;
                this.f1558h[i5] = 0;
                this.f1559i[i5] = 0;
                this.j[i5] = 0;
                this.f1560k = (~i11) & i10;
            }
        }
    }

    public final int f(int i5, int i10, int i11) {
        if (i5 == 0) {
            return 0;
        }
        float width = this.f1570v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i5) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i10);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / i11) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f1551a == 2) {
            OverScroller overScroller = this.f1566r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1568t.getLeft();
            int top = currY - this.f1568t.getTop();
            if (left != 0) {
                View view = this.f1568t;
                WeakHashMap weakHashMap = z0.f1413a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1568t;
                WeakHashMap weakHashMap2 = z0.f1413a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1567s.onViewPositionChanged(this.f1568t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f1570v.post(this.f1571w);
            }
        }
        return this.f1551a == 2;
    }

    public final View h(int i5, int i10) {
        ViewGroup viewGroup = this.f1570v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f1567s.getOrderedChildIndex(childCount));
            if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i5, int i10, int i11, int i12) {
        float f6;
        float f10;
        float f11;
        float f12;
        int left = this.f1568t.getLeft();
        int top = this.f1568t.getTop();
        int i13 = i5 - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f1566r;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f1568t;
        int i15 = (int) this.f1563n;
        int i16 = (int) this.f1562m;
        int abs = Math.abs(i11);
        if (abs < i15) {
            i11 = 0;
        } else if (abs > i16) {
            i11 = i11 > 0 ? i16 : -i16;
        }
        int i17 = (int) this.f1563n;
        int abs2 = Math.abs(i12);
        if (abs2 < i17) {
            i12 = 0;
        } else if (abs2 > i16) {
            i12 = i12 > 0 ? i16 : -i16;
        }
        int abs3 = Math.abs(i13);
        int abs4 = Math.abs(i14);
        int abs5 = Math.abs(i11);
        int abs6 = Math.abs(i12);
        int i18 = abs5 + abs6;
        int i19 = abs3 + abs4;
        if (i11 != 0) {
            f6 = abs5;
            f10 = i18;
        } else {
            f6 = abs3;
            f10 = i19;
        }
        float f13 = f6 / f10;
        if (i12 != 0) {
            f11 = abs6;
            f12 = i18;
        } else {
            f11 = abs4;
            f12 = i19;
        }
        float f14 = f11 / f12;
        h hVar = this.f1567s;
        overScroller.startScroll(left, top, i13, i14, (int) ((f(i14, i12, hVar.getViewVerticalDragRange(view)) * f14) + (f(i13, i11, hVar.getViewHorizontalDragRange(view)) * f13)));
        p(2);
        return true;
    }

    public final boolean j(int i5) {
        if ((this.f1560k & (1 << i5)) != 0) {
            return true;
        }
        w0.d("ViewDragHelper", "Ignoring pointerId=" + i5 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i5;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1561l == null) {
            this.f1561l = VelocityTracker.obtain();
        }
        this.f1561l.addMovement(motionEvent);
        h hVar = this.f1567s;
        int i10 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View h10 = h((int) x10, (int) y5);
            n(x10, y5, pointerId);
            t(pointerId, h10);
            int i11 = this.f1558h[pointerId] & this.q;
            if (i11 != 0) {
                hVar.onEdgeTouched(i11, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f1551a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f1551a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i10 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i10);
                    if (j(pointerId2)) {
                        float x11 = motionEvent.getX(i10);
                        float y10 = motionEvent.getY(i10);
                        float f6 = x11 - this.f1554d[pointerId2];
                        float f10 = y10 - this.f1555e[pointerId2];
                        m(f6, f10, pointerId2);
                        if (this.f1551a != 1) {
                            View h11 = h((int) x11, (int) y10);
                            if (d(f6, f10, h11) && t(pointerId2, h11)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i10++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.f1553c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1553c);
                float x12 = motionEvent.getX(findPointerIndex);
                float y11 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f1556f;
                int i12 = this.f1553c;
                int i13 = (int) (x12 - fArr[i12]);
                int i14 = (int) (y11 - this.f1557g[i12]);
                int left = this.f1568t.getLeft() + i13;
                int top = this.f1568t.getTop() + i14;
                int left2 = this.f1568t.getLeft();
                int top2 = this.f1568t.getTop();
                if (i13 != 0) {
                    left = hVar.clampViewPositionHorizontal(this.f1568t, left, i13);
                    WeakHashMap weakHashMap = z0.f1413a;
                    this.f1568t.offsetLeftAndRight(left - left2);
                }
                int i15 = left;
                if (i14 != 0) {
                    top = hVar.clampViewPositionVertical(this.f1568t, top, i14);
                    WeakHashMap weakHashMap2 = z0.f1413a;
                    this.f1568t.offsetTopAndBottom(top - top2);
                }
                int i16 = top;
                if (i13 != 0 || i14 != 0) {
                    this.f1567s.onViewPositionChanged(this.f1568t, i15, i16, i15 - left2, i16 - top2);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f1551a == 1) {
                this.f1569u = true;
                hVar.onViewReleased(this.f1568t, 0.0f, 0.0f);
                this.f1569u = false;
                if (this.f1551a == 1) {
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
            if (this.f1551a == 1 && pointerId3 == this.f1553c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i10 >= pointerCount2) {
                        i5 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (pointerId4 != this.f1553c) {
                        View h12 = h((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                        View view = this.f1568t;
                        if (h12 == view && t(pointerId4, view)) {
                            i5 = this.f1553c;
                            break;
                        }
                    }
                    i10++;
                }
                if (i5 == -1) {
                    l();
                }
            }
            e(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x13 = motionEvent.getX(actionIndex);
        float y12 = motionEvent.getY(actionIndex);
        n(x13, y12, pointerId5);
        if (this.f1551a == 0) {
            t(pointerId5, h((int) x13, (int) y12));
            int i17 = this.f1558h[pointerId5] & this.q;
            if (i17 != 0) {
                hVar.onEdgeTouched(i17, pointerId5);
                return;
            }
            return;
        }
        int i18 = (int) x13;
        int i19 = (int) y12;
        View view2 = this.f1568t;
        if (view2 != null && i18 >= view2.getLeft() && i18 < view2.getRight() && i19 >= view2.getTop() && i19 < view2.getBottom()) {
            i10 = 1;
        }
        if (i10 != 0) {
            t(pointerId5, this.f1568t);
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f1561l;
        float f6 = this.f1562m;
        velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, f6);
        float xVelocity = this.f1561l.getXVelocity(this.f1553c);
        float f10 = this.f1563n;
        float abs = Math.abs(xVelocity);
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f6) {
            xVelocity = xVelocity > 0.0f ? f6 : -f6;
        }
        float yVelocity = this.f1561l.getYVelocity(this.f1553c);
        float f11 = this.f1563n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f11) {
            f6 = 0.0f;
        } else if (abs2 <= f6) {
            f6 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f6 = -f6;
        }
        this.f1569u = true;
        this.f1567s.onViewReleased(this.f1568t, xVelocity, f6);
        this.f1569u = false;
        if (this.f1551a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.h] */
    public final void m(float f6, float f10, int i5) {
        boolean c2 = c(f6, f10, i5, 1);
        boolean z5 = c2;
        if (c(f10, f6, i5, 4)) {
            z5 = (c2 ? 1 : 0) | 4;
        }
        boolean z7 = z5;
        if (c(f6, f10, i5, 2)) {
            z7 = (z5 ? 1 : 0) | 2;
        }
        ?? r02 = z7;
        if (c(f10, f6, i5, 8)) {
            r02 = (z7 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f1559i;
            iArr[i5] = iArr[i5] | r02;
            this.f1567s.onEdgeDragStarted(r02, i5);
        }
    }

    public final void n(float f6, float f10, int i5) {
        float[] fArr = this.f1554d;
        if (fArr == null || fArr.length <= i5) {
            int i10 = i5 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1555e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1556f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1557g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1558h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1559i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1554d = fArr2;
            this.f1555e = fArr3;
            this.f1556f = fArr4;
            this.f1557g = fArr5;
            this.f1558h = iArr;
            this.f1559i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f1554d;
        this.f1556f[i5] = f6;
        fArr9[i5] = f6;
        float[] fArr10 = this.f1555e;
        this.f1557g[i5] = f10;
        fArr10[i5] = f10;
        int[] iArr7 = this.f1558h;
        int i11 = (int) f6;
        int i12 = (int) f10;
        ViewGroup viewGroup = this.f1570v;
        int i13 = i11 < viewGroup.getLeft() + this.f1564o ? 1 : 0;
        if (i12 < viewGroup.getTop() + this.f1564o) {
            i13 |= 4;
        }
        if (i11 > viewGroup.getRight() - this.f1564o) {
            i13 |= 2;
        }
        if (i12 > viewGroup.getBottom() - this.f1564o) {
            i13 |= 8;
        }
        iArr7[i5] = i13;
        this.f1560k |= 1 << i5;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i5 = 0; i5 < pointerCount; i5++) {
            int pointerId = motionEvent.getPointerId(i5);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i5);
                float y5 = motionEvent.getY(i5);
                this.f1556f[pointerId] = x10;
                this.f1557g[pointerId] = y5;
            }
        }
    }

    public final void p(int i5) {
        this.f1570v.removeCallbacks(this.f1571w);
        if (this.f1551a != i5) {
            this.f1551a = i5;
            this.f1567s.onViewDragStateChanged(i5);
            if (this.f1551a == 0) {
                this.f1568t = null;
            }
        }
    }

    public final boolean q(int i5, int i10) {
        if (this.f1569u) {
            return i(i5, i10, (int) this.f1561l.getXVelocity(this.f1553c), (int) this.f1561l.getYVelocity(this.f1553c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(MotionEvent motionEvent) {
        View h10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1561l == null) {
            this.f1561l = VelocityTracker.obtain();
        }
        this.f1561l.addMovement(motionEvent);
        h hVar = this.f1567s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x10 = motionEvent.getX(actionIndex);
                            float y5 = motionEvent.getY(actionIndex);
                            n(x10, y5, pointerId);
                            int i5 = this.f1551a;
                            if (i5 == 0) {
                                int i10 = this.f1558h[pointerId] & this.q;
                                if (i10 != 0) {
                                    hVar.onEdgeTouched(i10, pointerId);
                                }
                            } else if (i5 == 2 && (h10 = h((int) x10, (int) y5)) == this.f1568t) {
                                t(pointerId, h10);
                            }
                        } else if (actionMasked == 6) {
                            e(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f1554d != null && this.f1555e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i11 = 0; i11 < pointerCount; i11++) {
                        int pointerId2 = motionEvent.getPointerId(i11);
                        if (j(pointerId2)) {
                            float x11 = motionEvent.getX(i11);
                            float y10 = motionEvent.getY(i11);
                            float f6 = x11 - this.f1554d[pointerId2];
                            float f10 = y10 - this.f1555e[pointerId2];
                            View h11 = h((int) x11, (int) y10);
                            boolean z5 = h11 != null && d(f6, f10, h11);
                            if (z5) {
                                int left = h11.getLeft();
                                int i12 = (int) f6;
                                int clampViewPositionHorizontal = hVar.clampViewPositionHorizontal(h11, left + i12, i12);
                                int top = h11.getTop();
                                int i13 = (int) f10;
                                int clampViewPositionVertical = hVar.clampViewPositionVertical(h11, top + i13, i13);
                                int viewHorizontalDragRange = hVar.getViewHorizontalDragRange(h11);
                                int viewVerticalDragRange = hVar.getViewVerticalDragRange(h11);
                                if (viewHorizontalDragRange != 0) {
                                    if (viewHorizontalDragRange > 0) {
                                    }
                                }
                                if (viewVerticalDragRange == 0) {
                                    break;
                                }
                                if (viewVerticalDragRange > 0 && clampViewPositionVertical == top) {
                                    break;
                                }
                            }
                            m(f6, f10, pointerId2);
                            if (this.f1551a == 1) {
                                break;
                            }
                            if (z5 && t(pointerId2, h11)) {
                                break;
                            }
                        }
                    }
                    o(motionEvent);
                }
            }
            a();
        } else {
            float x12 = motionEvent.getX();
            float y11 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            n(x12, y11, pointerId3);
            View h12 = h((int) x12, (int) y11);
            if (h12 == this.f1568t && this.f1551a == 2) {
                t(pointerId3, h12);
            }
            int i14 = this.f1558h[pointerId3] & this.q;
            if (i14 != 0) {
                hVar.onEdgeTouched(i14, pointerId3);
            }
        }
        return this.f1551a == 1;
    }

    public final boolean s(View view, int i5, int i10) {
        this.f1568t = view;
        this.f1553c = -1;
        boolean i11 = i(i5, i10, 0, 0);
        if (!i11 && this.f1551a == 0 && this.f1568t != null) {
            this.f1568t = null;
        }
        return i11;
    }

    public final boolean t(int i5, View view) {
        if (view == this.f1568t && this.f1553c == i5) {
            return true;
        }
        if (view == null || !this.f1567s.tryCaptureView(view, i5)) {
            return false;
        }
        this.f1553c = i5;
        b(i5, view);
        return true;
    }
}
