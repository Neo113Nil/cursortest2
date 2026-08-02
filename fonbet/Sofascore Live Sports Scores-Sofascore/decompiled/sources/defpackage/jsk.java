package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jsk {
    public static final aca w = new aca(3);
    public int a;
    public final int b;
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
    public final float n;
    public final int o;
    public final OverScroller p;
    public final wba q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public aca u;
    public int c = -1;
    public final kac v = new kac(this, 24);

    public jsk(Context context, ViewGroup viewGroup, wba wbaVar) {
        if (wbaVar == null) {
            yhk.s("Callback may not be null");
            throw null;
        }
        this.t = viewGroup;
        this.q = wbaVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.u = w;
        this.p = new OverScroller(context, new isk(this));
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

    public final void b(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.t;
        if (parent != viewGroup) {
            sw9.o(viewGroup, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            return;
        }
        this.r = view;
        this.c = i;
        this.q.D(i, view);
        m(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, float f, float f2) {
        if (view != null) {
            wba wbaVar = this.q;
            boolean z = wbaVar.y(view) > 0;
            boolean z2 = wbaVar.z() > 0;
            int i = this.b;
            if (z && z2) {
                if ((f2 * f2) + (f * f) > i * i) {
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= i) : Math.abs(f) > i) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i) {
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

    public final int e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.a == 2) {
            OverScroller overScroller = this.p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                View view = this.r;
                WeakHashMap weakHashMap = bsk.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.r;
                WeakHashMap weakHashMap2 = bsk.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.q.F(this.r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.t.post(this.v);
            }
        }
        return this.a == 2;
    }

    public final View g(int i, int i2) {
        ViewGroup viewGroup = this.t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m(0);
            return false;
        }
        View view = this.r;
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int abs2 = Math.abs(i4);
        if (abs2 < i7) {
            i4 = 0;
        } else if (abs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i9 = abs5 + abs6;
        int i10 = abs3 + abs4;
        if (i3 != 0) {
            f = abs5;
            f2 = i9;
        } else {
            f = abs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = abs6;
            f4 = i9;
        } else {
            f3 = abs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        wba wbaVar = this.q;
        this.u = w;
        overScroller.startScroll(left, top, i5, i6, (int) ((e(i6, i4, wbaVar.z()) * f6) + (e(i5, i3, wbaVar.y(view)) * f5)));
        m(2);
        return true;
    }

    public final void i(MotionEvent motionEvent) {
        int findPointerIndex;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.l = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g = g((int) x, (int) y);
            k(pointerId, x, y);
            p(pointerId, g);
            int i3 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                j();
            }
            a();
            return;
        }
        wba wbaVar = this.q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    this.s = true;
                    wbaVar.G(this.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.s = false;
                    if (this.a == 1) {
                        m(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                k(pointerId2, x2, y2);
                if (this.a == 0) {
                    p(pointerId2, g((int) x2, (int) y2));
                    int i4 = this.h[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.r;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    p(pointerId2, this.r);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.a == 1 && pointerId3 == this.c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.c) {
                        View g2 = g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.r;
                        if (g2 == view2 && p(pointerId4, view2)) {
                            i = this.c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    j();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.a == 1) {
            int i7 = this.c;
            if ((this.k & (1 << i7)) == 0 || (findPointerIndex = motionEvent.findPointerIndex(i7)) == -1) {
                return;
            }
            float x3 = motionEvent.getX(findPointerIndex);
            float y3 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f;
            int i8 = this.c;
            int i9 = (int) (x3 - fArr[i8]);
            int i10 = (int) (y3 - this.g[i8]);
            int left = this.r.getLeft() + i9;
            int top = this.r.getTop() + i10;
            int left2 = this.r.getLeft();
            int top2 = this.r.getTop();
            if (i9 != 0) {
                left = wbaVar.o(left, this.r);
                WeakHashMap weakHashMap = bsk.a;
                this.r.offsetLeftAndRight(left - left2);
            }
            if (i10 != 0) {
                top = wbaVar.p(top, this.r);
                WeakHashMap weakHashMap2 = bsk.a;
                this.r.offsetTopAndBottom(top - top2);
            }
            if (i9 != 0 || i10 != 0) {
                wbaVar.F(this.r, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if ((this.k & (1 << pointerId5)) != 0) {
                    float x4 = motionEvent.getX(i2);
                    float y4 = motionEvent.getY(i2);
                    float f = x4 - this.d[pointerId5];
                    float f2 = y4 - this.e[pointerId5];
                    Math.abs(f);
                    Math.abs(f2);
                    int i11 = this.h[pointerId5];
                    Math.abs(f2);
                    Math.abs(f);
                    int i12 = this.h[pointerId5];
                    Math.abs(f);
                    Math.abs(f2);
                    int i13 = this.h[pointerId5];
                    Math.abs(f2);
                    Math.abs(f);
                    int i14 = this.h[pointerId5];
                    if (this.a != 1) {
                        View g3 = g((int) x4, (int) y4);
                        if (c(g3, f, f2) && p(pointerId5, g3)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
        }
        l(motionEvent);
    }

    public final void j() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float abs = Math.abs(xVelocity);
        float f2 = this.n;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            xVelocity = xVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f : -f;
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f2) {
            f = 0.0f;
        } else if (abs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = -f;
        }
        this.s = true;
        this.q.G(this.r, xVelocity, f);
        this.s = false;
        if (this.a == 1) {
            m(0);
        }
    }

    public final void k(int i, float f, float f2) {
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
            fArr = fArr2;
        }
        this.f[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.e;
        this.g[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.t;
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
        this.k = (1 << i) | this.k;
    }

    public final void l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.k & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public final void m(int i) {
        this.t.removeCallbacks(this.v);
        if (this.a != i) {
            this.a = i;
            this.q.E(i);
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean n(int i, int i2) {
        if (this.s) {
            return h(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        a70.r("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (r12 != r11) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(MotionEvent motionEvent) {
        View g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.l = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            k(pointerId, x, y);
                            int i = this.a;
                            if (i == 0) {
                                int i2 = this.h[pointerId];
                            } else if (i == 2 && (g = g((int) x, (int) y)) == this.r) {
                                p(pointerId, g);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.d != null && this.e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if ((this.k & (1 << pointerId2)) != 0) {
                            float x2 = motionEvent.getX(i3);
                            float y2 = motionEvent.getY(i3);
                            float f = x2 - this.d[pointerId2];
                            float f2 = y2 - this.e[pointerId2];
                            View g2 = g((int) x2, (int) y2);
                            boolean c = c(g2, f, f2);
                            if (c) {
                                int left = g2.getLeft();
                                wba wbaVar = this.q;
                                int o = wbaVar.o(((int) f) + left, g2);
                                int top = g2.getTop();
                                int p = wbaVar.p(((int) f2) + top, g2);
                                int y3 = wbaVar.y(g2);
                                int z = wbaVar.z();
                                if (y3 != 0) {
                                    if (y3 > 0) {
                                    }
                                }
                                if (z == 0) {
                                    break;
                                }
                                if (z > 0 && p == top) {
                                    break;
                                }
                            }
                            Math.abs(f);
                            Math.abs(f2);
                            int i4 = this.h[pointerId2];
                            Math.abs(f2);
                            Math.abs(f);
                            int i5 = this.h[pointerId2];
                            Math.abs(f);
                            Math.abs(f2);
                            int i6 = this.h[pointerId2];
                            Math.abs(f2);
                            Math.abs(f);
                            int i7 = this.h[pointerId2];
                            if (this.a == 1) {
                                break;
                            }
                            if (c && p(pointerId2, g2)) {
                                break;
                            }
                        }
                    }
                    l(motionEvent);
                }
            }
            a();
        } else {
            float x3 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            k(pointerId3, x3, y4);
            View g3 = g((int) x3, (int) y4);
            if (g3 == this.r && this.a == 2) {
                p(pointerId3, g3);
            }
            int i8 = this.h[pointerId3];
        }
        return this.a == 1;
    }

    public final boolean p(int i, View view) {
        if (view == this.r && this.c == i) {
            return true;
        }
        if (view == null || !this.q.T(i, view)) {
            return false;
        }
        this.c = i;
        b(i, view);
        return true;
    }
}
