package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2088g0;
import androidx.core.view.C2075a;
import androidx.core.view.C2103o;
import androidx.core.view.InterfaceC2105p;
import androidx.core.view.ScrollingView;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.y;
import androidx.recyclerview.widget.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y0.AbstractC6839b;
import y0.z;
import y2.AbstractC6847a;
import y2.AbstractC6848b;
import y2.AbstractC6850d;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, androidx.core.view.E {
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;

    /* renamed from: j5, reason: collision with root package name */
    public static boolean f22731j5 = false;

    /* renamed from: k5, reason: collision with root package name */
    public static boolean f22732k5 = false;

    /* renamed from: p5, reason: collision with root package name */
    public static final Interpolator f22737p5;

    /* renamed from: q5, reason: collision with root package name */
    public static final C f22738q5;

    /* renamed from: A, reason: collision with root package name */
    public int f22739A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f22740B;

    /* renamed from: C, reason: collision with root package name */
    public final AccessibilityManager f22741C;

    /* renamed from: D, reason: collision with root package name */
    public List f22742D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f22743E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f22744F;

    /* renamed from: G, reason: collision with root package name */
    public int f22745G;

    /* renamed from: H, reason: collision with root package name */
    public int f22746H;

    /* renamed from: I, reason: collision with root package name */
    public m f22747I;

    /* renamed from: J, reason: collision with root package name */
    public EdgeEffect f22748J;

    /* renamed from: K, reason: collision with root package name */
    public EdgeEffect f22749K;

    /* renamed from: L, reason: collision with root package name */
    public EdgeEffect f22750L;

    /* renamed from: O, reason: collision with root package name */
    public EdgeEffect f22751O;

    /* renamed from: P, reason: collision with root package name */
    public n f22752P;

    /* renamed from: P4, reason: collision with root package name */
    public j.b f22753P4;

    /* renamed from: Q4, reason: collision with root package name */
    public final B f22754Q4;

    /* renamed from: R, reason: collision with root package name */
    public int f22755R;

    /* renamed from: R4, reason: collision with root package name */
    public v f22756R4;

    /* renamed from: S4, reason: collision with root package name */
    public List f22757S4;

    /* renamed from: T, reason: collision with root package name */
    public int f22758T;

    /* renamed from: T1, reason: collision with root package name */
    public final int f22759T1;

    /* renamed from: T4, reason: collision with root package name */
    public boolean f22760T4;

    /* renamed from: U4, reason: collision with root package name */
    public boolean f22761U4;

    /* renamed from: V, reason: collision with root package name */
    public VelocityTracker f22762V;

    /* renamed from: V1, reason: collision with root package name */
    public final int f22763V1;

    /* renamed from: V4, reason: collision with root package name */
    public n.b f22764V4;

    /* renamed from: W, reason: collision with root package name */
    public int f22765W;

    /* renamed from: W4, reason: collision with root package name */
    public boolean f22766W4;

    /* renamed from: X4, reason: collision with root package name */
    public androidx.recyclerview.widget.u f22767X4;

    /* renamed from: Y4, reason: collision with root package name */
    public l f22768Y4;

    /* renamed from: Z4, reason: collision with root package name */
    public androidx.core.view.F f22769Z4;

    /* renamed from: a, reason: collision with root package name */
    public final float f22770a;

    /* renamed from: a5, reason: collision with root package name */
    public final List f22771a5;

    /* renamed from: b, reason: collision with root package name */
    public final z f22772b;

    /* renamed from: b1, reason: collision with root package name */
    public int f22773b1;

    /* renamed from: b2, reason: collision with root package name */
    public float f22774b2;

    /* renamed from: b5, reason: collision with root package name */
    public Runnable f22775b5;

    /* renamed from: c, reason: collision with root package name */
    public final x f22776c;

    /* renamed from: c5, reason: collision with root package name */
    public boolean f22777c5;

    /* renamed from: d, reason: collision with root package name */
    public SavedState f22778d;

    /* renamed from: d5, reason: collision with root package name */
    public int f22779d5;

    /* renamed from: e, reason: collision with root package name */
    public a f22780e;

    /* renamed from: e5, reason: collision with root package name */
    public int f22781e5;

    /* renamed from: f, reason: collision with root package name */
    public f f22782f;

    /* renamed from: f5, reason: collision with root package name */
    public boolean f22783f5;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.z f22784g;

    /* renamed from: g1, reason: collision with root package name */
    public int f22785g1;

    /* renamed from: g2, reason: collision with root package name */
    public float f22786g2;

    /* renamed from: g5, reason: collision with root package name */
    public final z.b f22787g5;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22788h;

    /* renamed from: h5, reason: collision with root package name */
    public final InterfaceC2105p f22789h5;

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f22790i;

    /* renamed from: i5, reason: collision with root package name */
    public C2103o f22791i5;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f22792j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f22793k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f22794l;

    /* renamed from: m, reason: collision with root package name */
    public h f22795m;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    final int[] mReusableIntPair;
    private final int[] mScrollOffset;

    /* renamed from: n, reason: collision with root package name */
    public q f22796n;

    /* renamed from: o, reason: collision with root package name */
    public final List f22797o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f22798p;

    /* renamed from: p1, reason: collision with root package name */
    public int f22799p1;

    /* renamed from: p2, reason: collision with root package name */
    public boolean f22800p2;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f22801q;

    /* renamed from: r, reason: collision with root package name */
    public u f22802r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f22803s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f22804t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f22805u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f22806v;

    /* renamed from: w, reason: collision with root package name */
    public int f22807w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22808x;

    /* renamed from: x1, reason: collision with root package name */
    public int f22809x1;

    /* renamed from: x2, reason: collision with root package name */
    public final E f22810x2;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22811y;

    /* renamed from: y1, reason: collision with root package name */
    public t f22812y1;

    /* renamed from: y2, reason: collision with root package name */
    public androidx.recyclerview.widget.j f22813y2;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22814z;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};

    /* renamed from: l5, reason: collision with root package name */
    public static final float f22733l5 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: m5, reason: collision with root package name */
    public static final boolean f22734m5 = false;

    /* renamed from: n5, reason: collision with root package name */
    public static final boolean f22735n5 = true;

    /* renamed from: o5, reason: collision with root package name */
    public static final boolean f22736o5 = true;

    public static abstract class A {

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f22816b;

        /* renamed from: c, reason: collision with root package name */
        public q f22817c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22818d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22819e;

        /* renamed from: f, reason: collision with root package name */
        public View f22820f;

        /* renamed from: h, reason: collision with root package name */
        public boolean f22822h;

        /* renamed from: a, reason: collision with root package name */
        public int f22815a = -1;

        /* renamed from: g, reason: collision with root package name */
        public final a f22821g = new a(0, 0);

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f22823a;

            /* renamed from: b, reason: collision with root package name */
            public int f22824b;

            /* renamed from: c, reason: collision with root package name */
            public int f22825c;

            /* renamed from: d, reason: collision with root package name */
            public int f22826d;

            /* renamed from: e, reason: collision with root package name */
            public Interpolator f22827e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f22828f;

            /* renamed from: g, reason: collision with root package name */
            public int f22829g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public boolean a() {
                return this.f22826d >= 0;
            }

            public void b(int i10) {
                this.f22826d = i10;
            }

            public void c(RecyclerView recyclerView) {
                int i10 = this.f22826d;
                if (i10 >= 0) {
                    this.f22826d = -1;
                    recyclerView.H0(i10);
                    this.f22828f = false;
                } else {
                    if (!this.f22828f) {
                        this.f22829g = 0;
                        return;
                    }
                    e();
                    recyclerView.f22810x2.e(this.f22823a, this.f22824b, this.f22825c, this.f22827e);
                    int i11 = this.f22829g + 1;
                    this.f22829g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f22828f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f22823a = i10;
                this.f22824b = i11;
                this.f22825c = i12;
                this.f22827e = interpolator;
                this.f22828f = true;
            }

            public final void e() {
                if (this.f22827e != null && this.f22825c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f22825c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f22826d = -1;
                this.f22828f = false;
                this.f22829g = 0;
                this.f22823a = i10;
                this.f22824b = i11;
                this.f22825c = i12;
                this.f22827e = interpolator;
            }
        }

        public interface b {
            PointF c(int i10);
        }

        public PointF a(int i10) {
            Object e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).c(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f22816b.f22796n.S(i10);
        }

        public int c() {
            return this.f22816b.f22796n.Z();
        }

        public int d(View view) {
            return this.f22816b.n0(view);
        }

        public q e() {
            return this.f22817c;
        }

        public int f() {
            return this.f22815a;
        }

        public boolean g() {
            return this.f22818d;
        }

        public boolean h() {
            return this.f22819e;
        }

        public void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void j(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f22816b;
            if (this.f22815a == -1 || recyclerView == null) {
                r();
            }
            if (this.f22818d && this.f22820f == null && this.f22817c != null && (a10 = a(this.f22815a)) != null) {
                float f10 = a10.x;
                if (f10 != 0.0f || a10.y != 0.0f) {
                    recyclerView.w1((int) Math.signum(f10), (int) Math.signum(a10.y), null);
                }
            }
            this.f22818d = false;
            View view = this.f22820f;
            if (view != null) {
                if (d(view) == this.f22815a) {
                    o(this.f22820f, recyclerView.f22754Q4, this.f22821g);
                    this.f22821g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f22820f = null;
                }
            }
            if (this.f22819e) {
                l(i10, i11, recyclerView.f22754Q4, this.f22821g);
                boolean a11 = this.f22821g.a();
                this.f22821g.c(recyclerView);
                if (a11 && this.f22819e) {
                    this.f22818d = true;
                    recyclerView.f22810x2.d();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f22820f = view;
                boolean z10 = RecyclerView.f22731j5;
            }
        }

        public abstract void l(int i10, int i11, B b10, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, B b10, a aVar);

        public void p(int i10) {
            this.f22815a = i10;
        }

        public void q(RecyclerView recyclerView, q qVar) {
            recyclerView.f22810x2.f();
            if (this.f22822h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f22816b = recyclerView;
            this.f22817c = qVar;
            int i10 = this.f22815a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f22754Q4.f22830a = i10;
            this.f22819e = true;
            this.f22818d = true;
            this.f22820f = b(f());
            m();
            this.f22816b.f22810x2.d();
            this.f22822h = true;
        }

        public final void r() {
            if (this.f22819e) {
                this.f22819e = false;
                n();
                this.f22816b.f22754Q4.f22830a = -1;
                this.f22820f = null;
                this.f22815a = -1;
                this.f22818d = false;
                this.f22817c.s1(this);
                this.f22817c = null;
                this.f22816b = null;
            }
        }
    }

    public static class B {

        /* renamed from: b, reason: collision with root package name */
        public SparseArray f22831b;

        /* renamed from: m, reason: collision with root package name */
        public int f22842m;

        /* renamed from: n, reason: collision with root package name */
        public long f22843n;

        /* renamed from: o, reason: collision with root package name */
        public int f22844o;

        /* renamed from: p, reason: collision with root package name */
        public int f22845p;

        /* renamed from: q, reason: collision with root package name */
        public int f22846q;

        /* renamed from: a, reason: collision with root package name */
        public int f22830a = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f22832c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f22833d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f22834e = 1;

        /* renamed from: f, reason: collision with root package name */
        public int f22835f = 0;

        /* renamed from: g, reason: collision with root package name */
        public boolean f22836g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f22837h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f22838i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f22839j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f22840k = false;

        /* renamed from: l, reason: collision with root package name */
        public boolean f22841l = false;

        public void a(int i10) {
            if ((this.f22834e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f22834e));
        }

        public int b() {
            return this.f22837h ? this.f22832c - this.f22833d : this.f22835f;
        }

        public int c() {
            return this.f22830a;
        }

        public boolean d() {
            return this.f22830a != -1;
        }

        public boolean e() {
            return this.f22837h;
        }

        public void f(h hVar) {
            this.f22834e = 1;
            this.f22835f = hVar.getItemCount();
            this.f22837h = false;
            this.f22838i = false;
            this.f22839j = false;
        }

        public boolean g() {
            return this.f22841l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f22830a + ", mData=" + this.f22831b + ", mItemCount=" + this.f22835f + ", mIsMeasuring=" + this.f22839j + ", mPreviousLayoutItemCount=" + this.f22832c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f22833d + ", mStructureChanged=" + this.f22836g + ", mInPreLayout=" + this.f22837h + ", mRunSimpleAnimations=" + this.f22840k + ", mRunPredictiveAnimations=" + this.f22841l + '}';
        }
    }

    public static class C extends m {
        @Override // androidx.recyclerview.widget.RecyclerView.m
        public EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class D {
    }

    public class E implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public int f22847a;

        /* renamed from: b, reason: collision with root package name */
        public int f22848b;

        /* renamed from: c, reason: collision with root package name */
        public OverScroller f22849c;

        /* renamed from: d, reason: collision with root package name */
        public Interpolator f22850d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22851e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22852f;

        public E() {
            Interpolator interpolator = RecyclerView.f22737p5;
            this.f22850d = interpolator;
            this.f22851e = false;
            this.f22852f = false;
            this.f22849c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i10, int i11) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f22848b = 0;
            this.f22847a = 0;
            Interpolator interpolator = this.f22850d;
            Interpolator interpolator2 = RecyclerView.f22737p5;
            if (interpolator != interpolator2) {
                this.f22850d = interpolator2;
                this.f22849c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f22849c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC2082d0.d0(RecyclerView.this, this);
        }

        public void d() {
            if (this.f22851e) {
                this.f22852f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f22737p5;
            }
            if (this.f22850d != interpolator) {
                this.f22850d = interpolator;
                this.f22849c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f22848b = 0;
            this.f22847a = 0;
            RecyclerView.this.setScrollState(2);
            this.f22849c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f22849c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f22796n == null) {
                f();
                return;
            }
            this.f22852f = false;
            this.f22851e = true;
            recyclerView.A();
            OverScroller overScroller = this.f22849c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f22847a;
                int i13 = currY - this.f22848b;
                this.f22847a = currX;
                this.f22848b = currY;
                int x10 = RecyclerView.this.x(i12);
                int z10 = RecyclerView.this.z(i13);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(x10, z10, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    x10 -= iArr2[0];
                    z10 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(x10, z10);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f22795m != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.w1(x10, z10, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    int i14 = iArr4[0];
                    int i15 = iArr4[1];
                    x10 -= i14;
                    z10 -= i15;
                    A a10 = recyclerView4.f22796n.f22881g;
                    if (a10 != null && !a10.g() && a10.h()) {
                        int b10 = RecyclerView.this.f22754Q4.b();
                        if (b10 == 0) {
                            a10.r();
                        } else if (a10.f() >= b10) {
                            a10.p(b10 - 1);
                            a10.j(i14, i15);
                        } else {
                            a10.j(i14, i15);
                        }
                    }
                    i11 = i15;
                    i10 = i14;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i16 = x10;
                int i17 = z10;
                if (!RecyclerView.this.f22798p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i10, i11, i16, i17, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i18 = i16 - iArr6[0];
                int i19 = i17 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.O(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z11 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                A a11 = RecyclerView.this.f22796n.f22881g;
                if ((a11 == null || !a11.g()) && z11) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i20, currVelocity);
                    }
                    if (RecyclerView.f22736o5) {
                        RecyclerView.this.f22753P4.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.j jVar = recyclerView7.f22813y2;
                    if (jVar != null) {
                        jVar.f(recyclerView7, i10, i11);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    k.a(RecyclerView.this, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            A a12 = RecyclerView.this.f22796n.f22881g;
            if (a12 != null && a12.g()) {
                a12.j(0, 0);
            }
            this.f22851e = false;
            if (this.f22852f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.M1(1);
            }
        }
    }

    public static abstract class F {
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;

        @NonNull
        public final View itemView;
        h mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        F mShadowedHolder = null;
        F mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        x mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public F(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        public final void a() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                a();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && AbstractC2082d0.O(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.k0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int k02;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (k02 = this.mOwnerRecyclerView.k0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, k02);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !AbstractC2082d0.O(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((r) this.itemView.getLayoutParams()).f22901c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            recyclerView.z1(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.z1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.f22731j5 && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.u(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.f22731j5) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.f22732k5) {
                toString();
            }
        }

        public void setScrapContainer(x xVar, boolean z10) {
            this.mScrapContainer = xVar;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.O(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    public class RunnableC2257a implements Runnable {
        public RunnableC2257a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f22806v || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f22803s) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f22811y) {
                recyclerView2.f22808x = true;
            } else {
                recyclerView2.A();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    public class RunnableC2258b implements Runnable {
        public RunnableC2258b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = RecyclerView.this.f22752P;
            if (nVar != null) {
                nVar.v();
            }
            RecyclerView.this.f22766W4 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    public class InterpolatorC2259c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    public class C2260d implements z.b {
        public C2260d() {
        }

        @Override // androidx.recyclerview.widget.z.b
        public void a(F f10, n.c cVar, n.c cVar2) {
            RecyclerView.this.o(f10, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.z.b
        public void b(F f10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f22796n.A1(f10.itemView, recyclerView.f22776c);
        }

        @Override // androidx.recyclerview.widget.z.b
        public void c(F f10, n.c cVar, n.c cVar2) {
            RecyclerView.this.f22776c.O(f10);
            RecyclerView.this.q(f10, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.z.b
        public void d(F f10, n.c cVar, n.c cVar2) {
            f10.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f22743E) {
                if (recyclerView.f22752P.b(f10, f10, cVar, cVar2)) {
                    RecyclerView.this.Y0();
                }
            } else if (recyclerView.f22752P.d(f10, cVar, cVar2)) {
                RecyclerView.this.Y0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e, reason: case insensitive filesystem */
    public class C2261e implements InterfaceC2105p {
        public C2261e() {
        }

        @Override // androidx.core.view.InterfaceC2105p
        public boolean a(float f10) {
            int i10;
            int i11;
            if (RecyclerView.this.f22796n.B()) {
                i11 = (int) f10;
                i10 = 0;
            } else if (RecyclerView.this.f22796n.A()) {
                i10 = (int) f10;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            RecyclerView.this.N1();
            return RecyclerView.this.j0(i10, i11);
        }

        @Override // androidx.core.view.InterfaceC2105p
        public float b() {
            float f10;
            if (RecyclerView.this.f22796n.B()) {
                f10 = RecyclerView.this.f22786g2;
            } else {
                if (!RecyclerView.this.f22796n.A()) {
                    return 0.0f;
                }
                f10 = RecyclerView.this.f22774b2;
            }
            return -f10;
        }

        @Override // androidx.core.view.InterfaceC2105p
        public void c() {
            RecyclerView.this.N1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f, reason: case insensitive filesystem */
    public class C2262f implements f.b {
        public C2262f() {
        }

        @Override // androidx.recyclerview.widget.f.b
        public void a(View view) {
            F p02 = RecyclerView.p0(view);
            if (p02 != null) {
                p02.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public F b(View view) {
            return RecyclerView.p0(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void c(int i10) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                F p02 = RecyclerView.p0(childAt);
                if (p02 != null) {
                    if (p02.isTmpDetached() && !p02.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + p02 + RecyclerView.this.V());
                    }
                    if (RecyclerView.f22732k5) {
                        p02.toString();
                    }
                    p02.addFlags(256);
                }
            } else if (RecyclerView.f22731j5) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void d(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.E(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void e() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.f.b
        public int f(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void g(View view) {
            F p02 = RecyclerView.p0(view);
            if (p02 != null) {
                p02.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public View getChildAt(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public int getChildCount() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.f.b
        public void h(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void i(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            F p02 = RecyclerView.p0(view);
            if (p02 != null) {
                if (!p02.isTmpDetached() && !p02.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + p02 + RecyclerView.this.V());
                }
                if (RecyclerView.f22732k5) {
                    p02.toString();
                }
                p02.clearTmpDetachFlag();
            } else if (RecyclerView.f22731j5) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    public class g implements a.InterfaceC0396a {
        public g() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0396a
        public void a(int i10, int i11) {
            RecyclerView.this.O0(i10, i11);
            RecyclerView.this.f22760T4 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0396a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0396a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0396a
        public void d(int i10, int i11) {
            RecyclerView.this.P0(i10, i11, false);
            RecyclerView.this.f22760T4 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0396a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.P1(i10, i11, obj);
            RecyclerView.this.f22761U4 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0396a
        public F f(int i10) {
            F g02 = RecyclerView.this.g0(i10, true);
            if (g02 == null) {
                return null;
            }
            if (!RecyclerView.this.f22782f.n(g02.itemView)) {
                return g02;
            }
            boolean z10 = RecyclerView.f22731j5;
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0396a
        public void g(int i10, int i11) {
            RecyclerView.this.N0(i10, i11);
            RecyclerView.this.f22760T4 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0396a
        public void h(int i10, int i11) {
            RecyclerView.this.P0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f22760T4 = true;
            recyclerView.f22754Q4.f22833d += i11;
        }

        public void i(a.b bVar) {
            int i10 = bVar.f22976a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f22796n.e1(recyclerView, bVar.f22977b, bVar.f22979d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f22796n.h1(recyclerView2, bVar.f22977b, bVar.f22979d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f22796n.j1(recyclerView3, bVar.f22977b, bVar.f22979d, bVar.f22978c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f22796n.g1(recyclerView4, bVar.f22977b, bVar.f22979d, 1);
            }
        }
    }

    public static abstract class h {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(@NonNull F f10, int i10) {
            boolean z10 = f10.mBindingAdapter == null;
            if (z10) {
                f10.mPosition = i10;
                if (hasStableIds()) {
                    f10.mItemId = getItemId(i10);
                }
                f10.setFlags(1, 519);
                if (u0.o.c()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(f10.mItemViewType)));
                }
            }
            f10.mBindingAdapter = this;
            if (RecyclerView.f22731j5) {
                if (f10.itemView.getParent() == null && f10.itemView.isAttachedToWindow() != f10.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + f10.isTmpDetached() + ", attached to window: " + f10.itemView.isAttachedToWindow() + ", holder: " + f10);
                }
                if (f10.itemView.getParent() == null && f10.itemView.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + f10);
                }
            }
            onBindViewHolder(f10, i10, f10.getUnmodifiedPayloads());
            if (z10) {
                f10.clearPayload();
                ViewGroup.LayoutParams layoutParams = f10.itemView.getLayoutParams();
                if (layoutParams instanceof r) {
                    ((r) layoutParams).f22901c = true;
                }
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int ordinal = this.mStateRestorationPolicy.ordinal();
            return ordinal != 1 ? ordinal != 2 : getItemCount() > 0;
        }

        @NonNull
        public final F createViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            try {
                if (u0.o.c()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i10)));
                }
                F onCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (onCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.mItemViewType = i10;
                Trace.endSection();
                return onCreateViewHolder;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull h hVar, @NonNull F f10, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(F f10, int i10);

        public void onBindViewHolder(@NonNull F f10, int i10, @NonNull List<Object> list) {
            onBindViewHolder(f10, i10);
        }

        public abstract F onCreateViewHolder(ViewGroup viewGroup, int i10);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull F f10) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull F f10) {
        }

        public void onViewDetachedFromWindow(@NonNull F f10) {
        }

        public void onViewRecycled(@NonNull F f10) {
        }

        public void registerAdapterDataObserver(@NonNull j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void unregisterAdapterDataObserver(@NonNull j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.e(i10, i11, obj);
        }
    }

    public static class i extends Observable {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i10, int i11) {
        }

        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11, int i12) {
        }

        public void f(int i10, int i11) {
        }
    }

    public static final class k {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    public interface l {
        int a(int i10, int i11);
    }

    public static class m {
        public abstract EdgeEffect a(RecyclerView recyclerView, int i10);
    }

    public static abstract class n {

        /* renamed from: a, reason: collision with root package name */
        public b f22864a = null;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f22865b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public long f22866c = 120;

        /* renamed from: d, reason: collision with root package name */
        public long f22867d = 120;

        /* renamed from: e, reason: collision with root package name */
        public long f22868e = 250;

        /* renamed from: f, reason: collision with root package name */
        public long f22869f = 250;

        public interface a {
            void a();
        }

        public interface b {
            void a(F f10);
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f22870a;

            /* renamed from: b, reason: collision with root package name */
            public int f22871b;

            /* renamed from: c, reason: collision with root package name */
            public int f22872c;

            /* renamed from: d, reason: collision with root package name */
            public int f22873d;

            public c a(F f10) {
                return b(f10, 0);
            }

            public c b(F f10, int i10) {
                View view = f10.itemView;
                this.f22870a = view.getLeft();
                this.f22871b = view.getTop();
                this.f22872c = view.getRight();
                this.f22873d = view.getBottom();
                return this;
            }
        }

        public static int e(F f10) {
            int i10 = f10.mFlags;
            int i11 = i10 & 14;
            if (f10.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = f10.getOldPosition();
                int absoluteAdapterPosition = f10.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i11 | 2048;
                }
            }
            return i11;
        }

        public abstract boolean a(F f10, c cVar, c cVar2);

        public abstract boolean b(F f10, F f11, c cVar, c cVar2);

        public abstract boolean c(F f10, c cVar, c cVar2);

        public abstract boolean d(F f10, c cVar, c cVar2);

        public abstract boolean f(F f10);

        public boolean g(F f10, List list) {
            return f(f10);
        }

        public final void h(F f10) {
            s(f10);
            b bVar = this.f22864a;
            if (bVar != null) {
                bVar.a(f10);
            }
        }

        public final void i() {
            if (this.f22865b.size() <= 0) {
                this.f22865b.clear();
            } else {
                android.support.v4.media.session.b.a(this.f22865b.get(0));
                throw null;
            }
        }

        public abstract void j(F f10);

        public abstract void k();

        public long l() {
            return this.f22866c;
        }

        public long m() {
            return this.f22869f;
        }

        public long n() {
            return this.f22868e;
        }

        public long o() {
            return this.f22867d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            boolean p10 = p();
            if (aVar != null) {
                if (!p10) {
                    aVar.a();
                    return p10;
                }
                this.f22865b.add(aVar);
            }
            return p10;
        }

        public c r() {
            return new c();
        }

        public void s(F f10) {
        }

        public c t(B b10, F f10) {
            return r().a(f10);
        }

        public c u(B b10, F f10, int i10, List list) {
            return r().a(f10);
        }

        public abstract void v();

        public void w(b bVar) {
            this.f22864a = bVar;
        }
    }

    public class o implements n.b {
        public o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n.b
        public void a(F f10) {
            f10.setIsRecyclable(true);
            if (f10.mShadowedHolder != null && f10.mShadowingHolder == null) {
                f10.mShadowedHolder = null;
            }
            f10.mShadowingHolder = null;
            if (f10.shouldBeKeptAsChild() || RecyclerView.this.j1(f10.itemView) || !f10.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f10.itemView, false);
        }
    }

    public static abstract class p {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i10, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, B b10) {
            getItemOffsets(rect, ((r) view.getLayoutParams()).a(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull B b10) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull B b10) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class q {

        /* renamed from: a, reason: collision with root package name */
        public f f22875a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f22876b;

        /* renamed from: c, reason: collision with root package name */
        public final y.b f22877c;

        /* renamed from: d, reason: collision with root package name */
        public final y.b f22878d;

        /* renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.y f22879e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.recyclerview.widget.y f22880f;

        /* renamed from: g, reason: collision with root package name */
        public A f22881g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f22882h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f22883i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f22884j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f22885k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f22886l;

        /* renamed from: m, reason: collision with root package name */
        public int f22887m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f22888n;

        /* renamed from: o, reason: collision with root package name */
        public int f22889o;

        /* renamed from: p, reason: collision with root package name */
        public int f22890p;

        /* renamed from: q, reason: collision with root package name */
        public int f22891q;

        /* renamed from: r, reason: collision with root package name */
        public int f22892r;

        public class a implements y.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.y.b
            public int a(View view) {
                return q.this.g0(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.y.b
            public int b() {
                return q.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.y.b
            public int c() {
                return q.this.z0() - q.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.y.b
            public int d(View view) {
                return q.this.j0(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.y.b
            public View getChildAt(int i10) {
                return q.this.Y(i10);
            }
        }

        public class b implements y.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.y.b
            public int a(View view) {
                return q.this.k0(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.y.b
            public int b() {
                return q.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.y.b
            public int c() {
                return q.this.m0() - q.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.y.b
            public int d(View view) {
                return q.this.e0(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.y.b
            public View getChildAt(int i10) {
                return q.this.Y(i10);
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f22895a;

            /* renamed from: b, reason: collision with root package name */
            public int f22896b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f22897c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f22898d;
        }

        public q() {
            a aVar = new a();
            this.f22877c = aVar;
            b bVar = new b();
            this.f22878d = bVar;
            this.f22879e = new androidx.recyclerview.widget.y(aVar);
            this.f22880f = new androidx.recyclerview.widget.y(bVar);
            this.f22882h = false;
            this.f22883i = false;
            this.f22884j = false;
            this.f22885k = true;
            this.f22886l = true;
        }

        public static int D(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private static boolean J0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int a0(int i10, int i11, int i12, int i13, boolean z10) {
            int max = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 < 0) {
                    if (i13 == -1) {
                        if (i11 != Integer.MIN_VALUE) {
                            if (i11 != 0) {
                            }
                        }
                        i13 = max;
                    }
                    i11 = 0;
                    i13 = 0;
                }
                i11 = 1073741824;
            } else {
                if (i13 < 0) {
                    if (i13 != -1) {
                        if (i13 == -2) {
                            if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                                i13 = max;
                                i11 = Integer.MIN_VALUE;
                            } else {
                                i13 = max;
                                i11 = 0;
                            }
                        }
                        i11 = 0;
                        i13 = 0;
                    }
                    i13 = max;
                }
                i11 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        public static d t0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6850d.RecyclerView, i10, i11);
            dVar.f22895a = obtainStyledAttributes.getInt(AbstractC6850d.f68257a, 1);
            dVar.f22896b = obtainStyledAttributes.getInt(AbstractC6850d.f68267k, 1);
            dVar.f22897c = obtainStyledAttributes.getBoolean(AbstractC6850d.f68266j, false);
            dVar.f22898d = obtainStyledAttributes.getBoolean(AbstractC6850d.f68268l, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public abstract boolean A();

        public int A0() {
            return this.f22889o;
        }

        public void A1(View view, x xVar) {
            D1(view);
            xVar.G(view);
        }

        public abstract boolean B();

        public boolean B0() {
            int Z10 = Z();
            for (int i10 = 0; i10 < Z10; i10++) {
                ViewGroup.LayoutParams layoutParams = Y(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void B1(int i10, x xVar) {
            View Y10 = Y(i10);
            E1(i10);
            xVar.G(Y10);
        }

        public boolean C(r rVar) {
            return rVar != null;
        }

        public boolean C0() {
            return this.f22883i;
        }

        public boolean C1(Runnable runnable) {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public abstract boolean D0();

        public void D1(View view) {
            this.f22875a.p(view);
        }

        public void E(int i10, int i11, B b10, c cVar) {
        }

        public final boolean E0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int z02 = z0() - getPaddingRight();
            int m02 = m0() - getPaddingBottom();
            Rect rect = this.f22876b.f22792j;
            f0(focusedChild, rect);
            return rect.left - i10 < z02 && rect.right - i10 > paddingLeft && rect.top - i11 < m02 && rect.bottom - i11 > paddingTop;
        }

        public void E1(int i10) {
            if (Y(i10) != null) {
                this.f22875a.q(i10);
            }
        }

        public void F(int i10, c cVar) {
        }

        public final boolean F0() {
            return this.f22886l;
        }

        public boolean F1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return G1(recyclerView, view, rect, z10, false);
        }

        public abstract int G(B b10);

        public boolean G0(x xVar, B b10) {
            return false;
        }

        public boolean G1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] b02 = b0(view, rect);
            int i10 = b02[0];
            int i11 = b02[1];
            if ((z11 && !E0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.C1(i10, i11);
            }
            return true;
        }

        public abstract int H(B b10);

        public boolean H0() {
            return false;
        }

        public void H1() {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int I(B b10);

        public boolean I0() {
            return this.f22885k;
        }

        public void I1() {
            this.f22882h = true;
        }

        public abstract int J(B b10);

        public final void J1(x xVar, int i10, View view) {
            F p02 = RecyclerView.p0(view);
            if (p02.shouldIgnore()) {
                if (RecyclerView.f22732k5) {
                    p02.toString();
                }
            } else if (p02.isInvalid() && !p02.isRemoved() && !this.f22876b.f22795m.hasStableIds()) {
                E1(i10);
                xVar.H(p02);
            } else {
                N(i10);
                xVar.I(view);
                this.f22876b.f22784g.k(p02);
            }
        }

        public abstract int K(B b10);

        public boolean K0() {
            A a10 = this.f22881g;
            return a10 != null && a10.h();
        }

        public abstract int K1(int i10, x xVar, B b10);

        public abstract int L(B b10);

        public boolean L0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f22879e.b(view, 24579) && this.f22880f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public abstract void L1(int i10);

        public void M(x xVar) {
            for (int Z10 = Z() - 1; Z10 >= 0; Z10--) {
                J1(xVar, Z10, Y(Z10));
            }
        }

        public void M0(View view, int i10, int i11, int i12, int i13) {
            r rVar = (r) view.getLayoutParams();
            Rect rect = rVar.f22900b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) rVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) rVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) rVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
        }

        public abstract int M1(int i10, x xVar, B b10);

        public void N(int i10) {
            O(i10, Y(i10));
        }

        public void N0(View view, int i10, int i11) {
            r rVar = (r) view.getLayoutParams();
            Rect t02 = this.f22876b.t0(view);
            int i12 = i10 + t02.left + t02.right;
            int i13 = i11 + t02.top + t02.bottom;
            int a02 = a0(z0(), A0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) rVar).width, A());
            int a03 = a0(m0(), n0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) rVar).height, B());
            if (T1(view, a02, a03, rVar)) {
                view.measure(a02, a03);
            }
        }

        public void N1(RecyclerView recyclerView) {
            O1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void O(int i10, View view) {
            this.f22875a.d(i10);
        }

        public void O0(int i10, int i11) {
            View Y10 = Y(i10);
            if (Y10 != null) {
                N(i10);
                x(Y10, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f22876b.toString());
            }
        }

        public void O1(int i10, int i11) {
            this.f22891q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f22889o = mode;
            if (mode == 0 && !RecyclerView.f22735n5) {
                this.f22891q = 0;
            }
            this.f22892r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f22890p = mode2;
            if (mode2 != 0 || RecyclerView.f22735n5) {
                return;
            }
            this.f22892r = 0;
        }

        public void P(RecyclerView recyclerView) {
            this.f22883i = true;
            T0(recyclerView);
        }

        public void P0(int i10) {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView != null) {
                recyclerView.L0(i10);
            }
        }

        public void P1(int i10, int i11) {
            this.f22876b.setMeasuredDimension(i10, i11);
        }

        public void Q(RecyclerView recyclerView, x xVar) {
            this.f22883i = false;
            V0(recyclerView, xVar);
        }

        public void Q0(int i10) {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView != null) {
                recyclerView.M0(i10);
            }
        }

        public void Q1(Rect rect, int i10, int i11) {
            P1(D(i10, rect.width() + getPaddingLeft() + getPaddingRight(), r0()), D(i11, rect.height() + getPaddingTop() + getPaddingBottom(), q0()));
        }

        public View R(View view) {
            View Y10;
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView == null || (Y10 = recyclerView.Y(view)) == null || this.f22875a.n(Y10)) {
                return null;
            }
            return Y10;
        }

        public void R0(h hVar, h hVar2) {
        }

        public void R1(int i10, int i11) {
            int Z10 = Z();
            if (Z10 == 0) {
                this.f22876b.C(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < Z10; i16++) {
                View Y10 = Y(i16);
                Rect rect = this.f22876b.f22792j;
                f0(Y10, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f22876b.f22792j.set(i15, i13, i12, i14);
            Q1(this.f22876b.f22792j, i10, i11);
        }

        public View S(int i10) {
            int Z10 = Z();
            for (int i11 = 0; i11 < Z10; i11++) {
                View Y10 = Y(i11);
                F p02 = RecyclerView.p0(Y10);
                if (p02 != null && p02.getLayoutPosition() == i10 && !p02.shouldIgnore() && (this.f22876b.f22754Q4.e() || !p02.isRemoved())) {
                    return Y10;
                }
            }
            return null;
        }

        public boolean S0(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
            return false;
        }

        public void S1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f22876b = null;
                this.f22875a = null;
                this.f22891q = 0;
                this.f22892r = 0;
            } else {
                this.f22876b = recyclerView;
                this.f22875a = recyclerView.f22782f;
                this.f22891q = recyclerView.getWidth();
                this.f22892r = recyclerView.getHeight();
            }
            this.f22889o = 1073741824;
            this.f22890p = 1073741824;
        }

        public abstract r T();

        public void T0(RecyclerView recyclerView) {
        }

        public boolean T1(View view, int i10, int i11, r rVar) {
            return (!view.isLayoutRequested() && this.f22885k && J0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && J0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public r U(Context context, AttributeSet attributeSet) {
            return new r(context, attributeSet);
        }

        public void U0(RecyclerView recyclerView) {
        }

        public boolean U1() {
            return false;
        }

        public r V(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof r ? new r((r) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new r((ViewGroup.MarginLayoutParams) layoutParams) : new r(layoutParams);
        }

        public void V0(RecyclerView recyclerView, x xVar) {
            U0(recyclerView);
        }

        public boolean V1(View view, int i10, int i11, r rVar) {
            return (this.f22885k && J0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && J0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public int W() {
            return -1;
        }

        public View W0(View view, int i10, x xVar, B b10) {
            return null;
        }

        public abstract void W1(RecyclerView recyclerView, B b10, int i10);

        public int X(View view) {
            return ((r) view.getLayoutParams()).f22900b.bottom;
        }

        public void X0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f22876b;
            Y0(recyclerView.f22776c, recyclerView.f22754Q4, accessibilityEvent);
        }

        public void X1(A a10) {
            A a11 = this.f22881g;
            if (a11 != null && a10 != a11 && a11.h()) {
                this.f22881g.r();
            }
            this.f22881g = a10;
            a10.q(this.f22876b, this);
        }

        public View Y(int i10) {
            f fVar = this.f22875a;
            if (fVar != null) {
                return fVar.f(i10);
            }
            return null;
        }

        public void Y0(x xVar, B b10, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f22876b.canScrollVertically(-1) && !this.f22876b.canScrollHorizontally(-1) && !this.f22876b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f22876b.f22795m;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void Y1() {
            A a10 = this.f22881g;
            if (a10 != null) {
                a10.r();
            }
        }

        public int Z() {
            f fVar = this.f22875a;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        public void Z0(x xVar, B b10, y0.z zVar) {
            if (this.f22876b.canScrollVertically(-1) || this.f22876b.canScrollHorizontally(-1)) {
                zVar.a(8192);
                zVar.T0(true);
                zVar.G0(true);
            }
            if (this.f22876b.canScrollVertically(1) || this.f22876b.canScrollHorizontally(1)) {
                zVar.a(4096);
                zVar.T0(true);
                zVar.G0(true);
            }
            zVar.y0(z.f.b(v0(xVar, b10), d0(xVar, b10), G0(xVar, b10), w0(xVar, b10)));
        }

        public boolean Z1() {
            return false;
        }

        public void a1(y0.z zVar) {
            RecyclerView recyclerView = this.f22876b;
            Z0(recyclerView.f22776c, recyclerView.f22754Q4, zVar);
        }

        public final int[] b0(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int z02 = z0() - getPaddingRight();
            int m02 = m0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - paddingLeft;
            int min = Math.min(0, i10);
            int i11 = top - paddingTop;
            int min2 = Math.min(0, i11);
            int i12 = width - z02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - m02);
            if (o0() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            return new int[]{max, min2};
        }

        public void b1(View view, y0.z zVar) {
            F p02 = RecyclerView.p0(view);
            if (p02 == null || p02.isRemoved() || this.f22875a.n(p02.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f22876b;
            c1(recyclerView.f22776c, recyclerView.f22754Q4, view, zVar);
        }

        public boolean c0() {
            RecyclerView recyclerView = this.f22876b;
            return recyclerView != null && recyclerView.f22788h;
        }

        public void c1(x xVar, B b10, View view, y0.z zVar) {
            zVar.z0(z.g.b(B() ? s0(view) : 0, 1, A() ? s0(view) : 0, 1, false, false));
        }

        public int d0(x xVar, B b10) {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView == null || recyclerView.f22795m == null || !A()) {
                return 1;
            }
            return this.f22876b.f22795m.getItemCount();
        }

        public View d1(View view, int i10) {
            return null;
        }

        public int e0(View view) {
            return view.getBottom() + X(view);
        }

        public void e1(RecyclerView recyclerView, int i10, int i11) {
        }

        public void f0(View view, Rect rect) {
            RecyclerView.q0(view, rect);
        }

        public void f1(RecyclerView recyclerView) {
        }

        public int g0(View view) {
            return view.getLeft() - p0(view);
        }

        public void g1(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView != null) {
                return AbstractC2082d0.D(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView != null) {
                return AbstractC2082d0.E(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int h0(View view) {
            Rect rect = ((r) view.getLayoutParams()).f22900b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void h1(RecyclerView recyclerView, int i10, int i11) {
        }

        public int i0(View view) {
            Rect rect = ((r) view.getLayoutParams()).f22900b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void i1(RecyclerView recyclerView, int i10, int i11) {
        }

        public int j() {
            RecyclerView recyclerView = this.f22876b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int j0(View view) {
            return view.getRight() + u0(view);
        }

        public void j1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            i1(recyclerView, i10, i11);
        }

        public int k0(View view) {
            return view.getTop() - x0(view);
        }

        public abstract void k1(x xVar, B b10);

        public View l0() {
            View focusedChild;
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f22875a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void l1(B b10) {
        }

        public int m0() {
            return this.f22892r;
        }

        public void m1(x xVar, B b10, int i10, int i11) {
            this.f22876b.C(i10, i11);
        }

        public int n0() {
            return this.f22890p;
        }

        public boolean n1(RecyclerView recyclerView, View view, View view2) {
            return K0() || recyclerView.F0();
        }

        public int o0() {
            return this.f22876b.getLayoutDirection();
        }

        public boolean o1(RecyclerView recyclerView, B b10, View view, View view2) {
            return n1(recyclerView, view, view2);
        }

        public int p0(View view) {
            return ((r) view.getLayoutParams()).f22900b.left;
        }

        public void p1(Parcelable parcelable) {
        }

        public int q0() {
            return AbstractC2082d0.A(this.f22876b);
        }

        public Parcelable q1() {
            return null;
        }

        public void r(View view) {
            s(view, -1);
        }

        public int r0() {
            return AbstractC2082d0.B(this.f22876b);
        }

        public void r1(int i10) {
        }

        public void s(View view, int i10) {
            v(view, i10, true);
        }

        public int s0(View view) {
            return ((r) view.getLayoutParams()).a();
        }

        public void s1(A a10) {
            if (this.f22881g == a10) {
                this.f22881g = null;
            }
        }

        public void t(View view) {
            u(view, -1);
        }

        public boolean t1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f22876b;
            return u1(recyclerView.f22776c, recyclerView.f22754Q4, i10, bundle);
        }

        public void u(View view, int i10) {
            v(view, i10, false);
        }

        public int u0(View view) {
            return ((r) view.getLayoutParams()).f22900b.right;
        }

        public boolean u1(x xVar, B b10, int i10, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            float f10;
            if (this.f22876b == null) {
                return false;
            }
            int m02 = m0();
            int z02 = z0();
            Rect rect = new Rect();
            if (this.f22876b.getMatrix().isIdentity() && this.f22876b.getGlobalVisibleRect(rect)) {
                m02 = rect.height();
                z02 = rect.width();
            }
            if (i10 == 4096) {
                paddingTop = this.f22876b.canScrollVertically(1) ? (m02 - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f22876b.canScrollHorizontally(1)) {
                    paddingLeft = (z02 - getPaddingLeft()) - getPaddingRight();
                }
                paddingLeft = 0;
            } else if (i10 != 8192) {
                paddingTop = 0;
                paddingLeft = 0;
            } else {
                paddingTop = this.f22876b.canScrollVertically(-1) ? -((m02 - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f22876b.canScrollHorizontally(-1)) {
                    paddingLeft = -((z02 - getPaddingLeft()) - getPaddingRight());
                }
                paddingLeft = 0;
            }
            if (paddingTop == 0 && paddingLeft == 0) {
                return false;
            }
            if (bundle != null) {
                f10 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f10 < 0.0f) {
                    if (!RecyclerView.f22731j5) {
                        return false;
                    }
                    throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f10 + ")");
                }
            } else {
                f10 = 1.0f;
            }
            if (Float.compare(f10, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f10) != 0 && Float.compare(0.0f, f10) != 0) {
                    paddingLeft = (int) (paddingLeft * f10);
                    paddingTop = (int) (paddingTop * f10);
                }
                this.f22876b.F1(paddingLeft, paddingTop, null, Integer.MIN_VALUE, true);
                return true;
            }
            RecyclerView recyclerView = this.f22876b;
            h hVar = recyclerView.f22795m;
            if (hVar == null) {
                return false;
            }
            if (i10 == 4096) {
                recyclerView.G1(hVar.getItemCount() - 1);
            } else if (i10 == 8192) {
                recyclerView.G1(0);
            }
            return true;
        }

        public final void v(View view, int i10, boolean z10) {
            F p02 = RecyclerView.p0(view);
            if (z10 || p02.isRemoved()) {
                this.f22876b.f22784g.b(p02);
            } else {
                this.f22876b.f22784g.p(p02);
            }
            r rVar = (r) view.getLayoutParams();
            if (p02.wasReturnedFromScrap() || p02.isScrap()) {
                if (p02.isScrap()) {
                    p02.unScrap();
                } else {
                    p02.clearReturnedFromScrapFlag();
                }
                this.f22875a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f22876b) {
                int m10 = this.f22875a.m(view);
                if (i10 == -1) {
                    i10 = this.f22875a.g();
                }
                if (m10 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f22876b.indexOfChild(view) + this.f22876b.V());
                }
                if (m10 != i10) {
                    this.f22876b.f22796n.O0(m10, i10);
                }
            } else {
                this.f22875a.a(view, i10, false);
                rVar.f22901c = true;
                A a10 = this.f22881g;
                if (a10 != null && a10.h()) {
                    this.f22881g.k(view);
                }
            }
            if (rVar.f22902d) {
                if (RecyclerView.f22732k5) {
                    Objects.toString(rVar.f22899a);
                }
                p02.itemView.invalidate();
                rVar.f22902d = false;
            }
        }

        public int v0(x xVar, B b10) {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView == null || recyclerView.f22795m == null || !B()) {
                return 1;
            }
            return this.f22876b.f22795m.getItemCount();
        }

        public boolean v1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f22876b;
            return w1(recyclerView.f22776c, recyclerView.f22754Q4, view, i10, bundle);
        }

        public void w(String str) {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int w0(x xVar, B b10) {
            return 0;
        }

        public boolean w1(x xVar, B b10, View view, int i10, Bundle bundle) {
            return false;
        }

        public void x(View view, int i10) {
            y(view, i10, (r) view.getLayoutParams());
        }

        public int x0(View view) {
            return ((r) view.getLayoutParams()).f22900b.top;
        }

        public void x1() {
            for (int Z10 = Z() - 1; Z10 >= 0; Z10--) {
                this.f22875a.q(Z10);
            }
        }

        public void y(View view, int i10, r rVar) {
            F p02 = RecyclerView.p0(view);
            if (p02.isRemoved()) {
                this.f22876b.f22784g.b(p02);
            } else {
                this.f22876b.f22784g.p(p02);
            }
            this.f22875a.c(view, i10, rVar, p02.isRemoved());
        }

        public void y0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((r) view.getLayoutParams()).f22900b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f22876b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f22876b.f22794l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void y1(x xVar) {
            for (int Z10 = Z() - 1; Z10 >= 0; Z10--) {
                if (!RecyclerView.p0(Y(Z10)).shouldIgnore()) {
                    B1(Z10, xVar);
                }
            }
        }

        public void z(View view, Rect rect) {
            RecyclerView recyclerView = this.f22876b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.t0(view));
            }
        }

        public int z0() {
            return this.f22891q;
        }

        public void z1(x xVar) {
            int j10 = xVar.j();
            for (int i10 = j10 - 1; i10 >= 0; i10--) {
                View n10 = xVar.n(i10);
                F p02 = RecyclerView.p0(n10);
                if (!p02.shouldIgnore()) {
                    p02.setIsRecyclable(false);
                    if (p02.isTmpDetached()) {
                        this.f22876b.removeDetachedView(n10, false);
                    }
                    n nVar = this.f22876b.f22752P;
                    if (nVar != null) {
                        nVar.j(p02);
                    }
                    p02.setIsRecyclable(true);
                    xVar.D(n10);
                }
            }
            xVar.e();
            if (j10 > 0) {
                this.f22876b.invalidate();
            }
        }
    }

    public interface s {
        void b(View view);

        void d(View view);
    }

    public static abstract class t {
        public abstract boolean a(int i10, int i11);
    }

    public interface u {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z10);
    }

    public static abstract class v {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class w {

        /* renamed from: a, reason: collision with root package name */
        public SparseArray f22903a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        public int f22904b = 0;

        /* renamed from: c, reason: collision with root package name */
        public Set f22905c = Collections.newSetFromMap(new IdentityHashMap());

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList f22906a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            public int f22907b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f22908c = 0;

            /* renamed from: d, reason: collision with root package name */
            public long f22909d = 0;
        }

        public void a() {
            this.f22904b++;
        }

        public void b(h hVar) {
            this.f22905c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f22903a.size(); i10++) {
                a aVar = (a) this.f22903a.valueAt(i10);
                Iterator it = aVar.f22906a.iterator();
                while (it.hasNext()) {
                    G0.a.a(((F) it.next()).itemView);
                }
                aVar.f22906a.clear();
            }
        }

        public void d() {
            this.f22904b--;
        }

        public void e(h hVar, boolean z10) {
            this.f22905c.remove(hVar);
            if (this.f22905c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f22903a.size(); i10++) {
                SparseArray sparseArray = this.f22903a;
                ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i10))).f22906a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    G0.a.a(((F) arrayList.get(i11)).itemView);
                }
            }
        }

        public void f(int i10, long j10) {
            a i11 = i(i10);
            i11.f22909d = l(i11.f22909d, j10);
        }

        public void g(int i10, long j10) {
            a i11 = i(i10);
            i11.f22908c = l(i11.f22908c, j10);
        }

        public F h(int i10) {
            a aVar = (a) this.f22903a.get(i10);
            if (aVar == null || aVar.f22906a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f22906a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((F) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (F) arrayList.remove(size);
                }
            }
            return null;
        }

        public final a i(int i10) {
            a aVar = (a) this.f22903a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f22903a.put(i10, aVar2);
            return aVar2;
        }

        public void j(h hVar, h hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f22904b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(F f10) {
            int itemViewType = f10.getItemViewType();
            ArrayList arrayList = i(itemViewType).f22906a;
            if (((a) this.f22903a.get(itemViewType)).f22907b <= arrayList.size()) {
                G0.a.a(f10.itemView);
            } else {
                if (RecyclerView.f22731j5 && arrayList.contains(f10)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                f10.resetInternal();
                arrayList.add(f10);
            }
        }

        public long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        public boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f22909d;
            return j12 == 0 || j10 + j12 < j11;
        }

        public boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f22908c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class x {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22910a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f22911b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f22912c;

        /* renamed from: d, reason: collision with root package name */
        public final List f22913d;

        /* renamed from: e, reason: collision with root package name */
        public int f22914e;

        /* renamed from: f, reason: collision with root package name */
        public int f22915f;

        /* renamed from: g, reason: collision with root package name */
        public w f22916g;

        public x() {
            ArrayList arrayList = new ArrayList();
            this.f22910a = arrayList;
            this.f22911b = null;
            this.f22912c = new ArrayList();
            this.f22913d = Collections.unmodifiableList(arrayList);
            this.f22914e = 2;
            this.f22915f = 2;
        }

        public void A() {
            for (int i10 = 0; i10 < this.f22912c.size(); i10++) {
                G0.a.a(((F) this.f22912c.get(i10)).itemView);
            }
            B(RecyclerView.this.f22795m);
        }

        public final void B(h hVar) {
            C(hVar, false);
        }

        public final void C(h hVar, boolean z10) {
            w wVar = this.f22916g;
            if (wVar != null) {
                wVar.e(hVar, z10);
            }
        }

        public void D(View view) {
            F p02 = RecyclerView.p0(view);
            p02.mScrapContainer = null;
            p02.mInChangeScrap = false;
            p02.clearReturnedFromScrapFlag();
            H(p02);
        }

        public void E() {
            for (int size = this.f22912c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f22912c.clear();
            if (RecyclerView.f22736o5) {
                RecyclerView.this.f22753P4.b();
            }
        }

        public void F(int i10) {
            boolean z10 = RecyclerView.f22731j5;
            F f10 = (F) this.f22912c.get(i10);
            if (RecyclerView.f22732k5) {
                Objects.toString(f10);
            }
            a(f10, true);
            this.f22912c.remove(i10);
        }

        public void G(View view) {
            F p02 = RecyclerView.p0(view);
            if (p02.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (p02.isScrap()) {
                p02.unScrap();
            } else if (p02.wasReturnedFromScrap()) {
                p02.clearReturnedFromScrapFlag();
            }
            H(p02);
            if (RecyclerView.this.f22752P == null || p02.isRecyclable()) {
                return;
            }
            RecyclerView.this.f22752P.j(p02);
        }

        public void H(F f10) {
            boolean z10;
            boolean z11 = true;
            if (f10.isScrap() || f10.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(f10.isScrap());
                sb2.append(" isAttached:");
                sb2.append(f10.itemView.getParent() != null);
                sb2.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (f10.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f10 + RecyclerView.this.V());
            }
            if (f10.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
            boolean doesTransientStatePreventRecycling = f10.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.f22795m;
            boolean z12 = hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(f10);
            if (RecyclerView.f22731j5 && this.f22912c.contains(f10)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + f10 + RecyclerView.this.V());
            }
            if (z12 || f10.isRecyclable()) {
                if (this.f22915f <= 0 || f10.hasAnyOfTheFlags(526)) {
                    z10 = false;
                } else {
                    int size = this.f22912c.size();
                    if (size >= this.f22915f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.f22736o5 && size > 0 && !RecyclerView.this.f22753P4.d(f10.mPosition)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f22753P4.d(((F) this.f22912c.get(i10)).mPosition)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f22912c.add(size, f10);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(f10, true);
                }
                r1 = z10;
            } else {
                if (RecyclerView.f22732k5) {
                    RecyclerView.this.V();
                }
                z11 = false;
            }
            RecyclerView.this.f22784g.q(f10);
            if (r1 || z11 || !doesTransientStatePreventRecycling) {
                return;
            }
            G0.a.a(f10.itemView);
            f10.mBindingAdapter = null;
            f10.mOwnerRecyclerView = null;
        }

        public void I(View view) {
            F p02 = RecyclerView.p0(view);
            if (!p02.hasAnyOfTheFlags(12) && p02.isUpdated() && !RecyclerView.this.s(p02)) {
                if (this.f22911b == null) {
                    this.f22911b = new ArrayList();
                }
                p02.setScrapContainer(this, true);
                this.f22911b.add(p02);
                return;
            }
            if (!p02.isInvalid() || p02.isRemoved() || RecyclerView.this.f22795m.hasStableIds()) {
                p02.setScrapContainer(this, false);
                this.f22910a.add(p02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        public void J(w wVar) {
            B(RecyclerView.this.f22795m);
            w wVar2 = this.f22916g;
            if (wVar2 != null) {
                wVar2.d();
            }
            this.f22916g = wVar;
            if (wVar != null && RecyclerView.this.getAdapter() != null) {
                this.f22916g.a();
            }
            u();
        }

        public void K(D d10) {
        }

        public void L(int i10) {
            this.f22914e = i10;
            P();
        }

        public final boolean M(F f10, int i10, int i11, long j10) {
            f10.mBindingAdapter = null;
            f10.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = f10.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != LongCompanionObject.MAX_VALUE && !this.f22916g.m(itemViewType, nanoTime, j10)) {
                return false;
            }
            if (f10.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f10.itemView, recyclerView.getChildCount(), f10.itemView.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f22795m.bindViewHolder(f10, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(f10.itemView);
            }
            this.f22916g.f(f10.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f10);
            if (RecyclerView.this.f22754Q4.e()) {
                f10.mPreLayoutPosition = i11;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01fa A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01de  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public F N(int i10, boolean z10, long j10) {
            F f10;
            boolean z11;
            F f11;
            boolean z12;
            boolean M10;
            ViewGroup.LayoutParams layoutParams;
            r rVar;
            RecyclerView c02;
            if (i10 < 0 || i10 >= RecyclerView.this.f22754Q4.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + RecyclerView.this.f22754Q4.b() + RecyclerView.this.V());
            }
            if (RecyclerView.this.f22754Q4.e()) {
                f10 = h(i10);
                if (f10 != null) {
                    z11 = true;
                    if (f10 == null && (f10 = m(i10, z10)) != null) {
                        if (Q(f10)) {
                            if (!z10) {
                                f10.addFlags(4);
                                if (f10.isScrap()) {
                                    RecyclerView.this.removeDetachedView(f10.itemView, false);
                                    f10.unScrap();
                                } else if (f10.wasReturnedFromScrap()) {
                                    f10.clearReturnedFromScrapFlag();
                                }
                                H(f10);
                            }
                            f10 = null;
                        } else {
                            z11 = true;
                        }
                    }
                    if (f10 == null) {
                        int m10 = RecyclerView.this.f22780e.m(i10);
                        if (m10 < 0 || m10 >= RecyclerView.this.f22795m.getItemCount()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + m10 + ").state:" + RecyclerView.this.f22754Q4.b() + RecyclerView.this.V());
                        }
                        int itemViewType = RecyclerView.this.f22795m.getItemViewType(m10);
                        if (RecyclerView.this.f22795m.hasStableIds() && (f10 = l(RecyclerView.this.f22795m.getItemId(m10), itemViewType, z10)) != null) {
                            f10.mPosition = m10;
                            z11 = true;
                        }
                        if (f10 == null) {
                            boolean z13 = RecyclerView.f22731j5;
                            F h10 = i().h(itemViewType);
                            if (h10 != null) {
                                h10.resetInternal();
                                if (RecyclerView.f22734m5) {
                                    r(h10);
                                }
                            }
                            f10 = h10;
                        }
                        if (f10 == null) {
                            long nanoTime = RecyclerView.this.getNanoTime();
                            if (j10 != LongCompanionObject.MAX_VALUE && !this.f22916g.n(itemViewType, nanoTime, j10)) {
                                return null;
                            }
                            RecyclerView recyclerView = RecyclerView.this;
                            f10 = recyclerView.f22795m.createViewHolder(recyclerView, itemViewType);
                            if (RecyclerView.f22736o5 && (c02 = RecyclerView.c0(f10.itemView)) != null) {
                                f10.mNestedRecyclerView = new WeakReference<>(c02);
                            }
                            this.f22916g.g(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                            boolean z14 = RecyclerView.f22731j5;
                        }
                    }
                    f11 = f10;
                    z12 = z11;
                    if (z12 && !RecyclerView.this.f22754Q4.e() && f11.hasAnyOfTheFlags(8192)) {
                        f11.setFlags(0, 8192);
                        if (RecyclerView.this.f22754Q4.f22840k) {
                            int e10 = n.e(f11) | 4096;
                            RecyclerView recyclerView2 = RecyclerView.this;
                            RecyclerView.this.d1(f11, recyclerView2.f22752P.u(recyclerView2.f22754Q4, f11, e10, f11.getUnmodifiedPayloads()));
                        }
                    }
                    if (!RecyclerView.this.f22754Q4.e() && f11.isBound()) {
                        f11.mPreLayoutPosition = i10;
                    } else if (f11.isBound() || f11.needsUpdate() || f11.isInvalid()) {
                        if (!RecyclerView.f22731j5 && f11.isRemoved()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + f11 + RecyclerView.this.V());
                        }
                        M10 = M(f11, RecyclerView.this.f22780e.m(i10), i10, j10);
                        layoutParams = f11.itemView.getLayoutParams();
                        if (layoutParams == null) {
                            rVar = (r) RecyclerView.this.generateDefaultLayoutParams();
                            f11.itemView.setLayoutParams(rVar);
                        } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                            rVar = (r) layoutParams;
                        } else {
                            rVar = (r) RecyclerView.this.generateLayoutParams(layoutParams);
                            f11.itemView.setLayoutParams(rVar);
                        }
                        rVar.f22899a = f11;
                        rVar.f22902d = !z12 && M10;
                        return f11;
                    }
                    M10 = false;
                    layoutParams = f11.itemView.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    rVar.f22899a = f11;
                    rVar.f22902d = !z12 && M10;
                    return f11;
                }
            } else {
                f10 = null;
            }
            z11 = false;
            if (f10 == null) {
                if (Q(f10)) {
                }
            }
            if (f10 == null) {
            }
            f11 = f10;
            z12 = z11;
            if (z12) {
                f11.setFlags(0, 8192);
                if (RecyclerView.this.f22754Q4.f22840k) {
                }
            }
            if (!RecyclerView.this.f22754Q4.e()) {
            }
            if (f11.isBound()) {
            }
            if (!RecyclerView.f22731j5) {
            }
            M10 = M(f11, RecyclerView.this.f22780e.m(i10), i10, j10);
            layoutParams = f11.itemView.getLayoutParams();
            if (layoutParams == null) {
            }
            rVar.f22899a = f11;
            rVar.f22902d = !z12 && M10;
            return f11;
        }

        public void O(F f10) {
            if (f10.mInChangeScrap) {
                this.f22911b.remove(f10);
            } else {
                this.f22910a.remove(f10);
            }
            f10.mScrapContainer = null;
            f10.mInChangeScrap = false;
            f10.clearReturnedFromScrapFlag();
        }

        public void P() {
            q qVar = RecyclerView.this.f22796n;
            this.f22915f = this.f22914e + (qVar != null ? qVar.f22887m : 0);
            for (int size = this.f22912c.size() - 1; size >= 0 && this.f22912c.size() > this.f22915f; size--) {
                F(size);
            }
        }

        public boolean Q(F f10) {
            if (f10.isRemoved()) {
                if (!RecyclerView.f22731j5 || RecyclerView.this.f22754Q4.e()) {
                    return RecyclerView.this.f22754Q4.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
            int i10 = f10.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.f22795m.getItemCount()) {
                if (RecyclerView.this.f22754Q4.e() || RecyclerView.this.f22795m.getItemViewType(f10.mPosition) == f10.getItemViewType()) {
                    return !RecyclerView.this.f22795m.hasStableIds() || f10.getItemId() == RecyclerView.this.f22795m.getItemId(f10.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f10 + RecyclerView.this.V());
        }

        public void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f22912c.size() - 1; size >= 0; size--) {
                F f10 = (F) this.f22912c.get(size);
                if (f10 != null && (i12 = f10.mPosition) >= i10 && i12 < i13) {
                    f10.addFlags(2);
                    F(size);
                }
            }
        }

        public void a(F f10, boolean z10) {
            RecyclerView.u(f10);
            View view = f10.itemView;
            androidx.recyclerview.widget.u uVar = RecyclerView.this.f22767X4;
            if (uVar != null) {
                C2075a c10 = uVar.c();
                AbstractC2082d0.l0(view, c10 instanceof u.a ? ((u.a) c10).c(view) : null);
            }
            if (z10) {
                g(f10);
            }
            f10.mBindingAdapter = null;
            f10.mOwnerRecyclerView = null;
            i().k(f10);
        }

        public final void b(F f10) {
            if (RecyclerView.this.E0()) {
                View view = f10.itemView;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                androidx.recyclerview.widget.u uVar = RecyclerView.this.f22767X4;
                if (uVar == null) {
                    return;
                }
                C2075a c10 = uVar.c();
                if (c10 instanceof u.a) {
                    ((u.a) c10).d(view);
                }
                AbstractC2082d0.l0(view, c10);
            }
        }

        public void c() {
            this.f22910a.clear();
            E();
        }

        public void d() {
            int size = this.f22912c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((F) this.f22912c.get(i10)).clearOldPosition();
            }
            int size2 = this.f22910a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((F) this.f22910a.get(i11)).clearOldPosition();
            }
            ArrayList arrayList = this.f22911b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((F) this.f22911b.get(i12)).clearOldPosition();
                }
            }
        }

        public void e() {
            this.f22910a.clear();
            ArrayList arrayList = this.f22911b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f22754Q4.b()) {
                return !RecyclerView.this.f22754Q4.e() ? i10 : RecyclerView.this.f22780e.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f22754Q4.b() + RecyclerView.this.V());
        }

        public void g(F f10) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f22797o.size() > 0) {
                android.support.v4.media.session.b.a(RecyclerView.this.f22797o.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.f22795m;
            if (hVar != null) {
                hVar.onViewRecycled(f10);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f22754Q4 != null) {
                recyclerView.f22784g.q(f10);
            }
            if (RecyclerView.f22732k5) {
                Objects.toString(f10);
            }
        }

        public F h(int i10) {
            int size;
            int m10;
            ArrayList arrayList = this.f22911b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    F f10 = (F) this.f22911b.get(i11);
                    if (!f10.wasReturnedFromScrap() && f10.getLayoutPosition() == i10) {
                        f10.addFlags(32);
                        return f10;
                    }
                }
                if (RecyclerView.this.f22795m.hasStableIds() && (m10 = RecyclerView.this.f22780e.m(i10)) > 0 && m10 < RecyclerView.this.f22795m.getItemCount()) {
                    long itemId = RecyclerView.this.f22795m.getItemId(m10);
                    for (int i12 = 0; i12 < size; i12++) {
                        F f11 = (F) this.f22911b.get(i12);
                        if (!f11.wasReturnedFromScrap() && f11.getItemId() == itemId) {
                            f11.addFlags(32);
                            return f11;
                        }
                    }
                }
            }
            return null;
        }

        public w i() {
            if (this.f22916g == null) {
                this.f22916g = new w();
                u();
            }
            return this.f22916g;
        }

        public int j() {
            return this.f22910a.size();
        }

        public List k() {
            return this.f22913d;
        }

        public F l(long j10, int i10, boolean z10) {
            for (int size = this.f22910a.size() - 1; size >= 0; size--) {
                F f10 = (F) this.f22910a.get(size);
                if (f10.getItemId() == j10 && !f10.wasReturnedFromScrap()) {
                    if (i10 == f10.getItemViewType()) {
                        f10.addFlags(32);
                        if (f10.isRemoved() && !RecyclerView.this.f22754Q4.e()) {
                            f10.setFlags(2, 14);
                        }
                        return f10;
                    }
                    if (!z10) {
                        this.f22910a.remove(size);
                        RecyclerView.this.removeDetachedView(f10.itemView, false);
                        D(f10.itemView);
                    }
                }
            }
            int size2 = this.f22912c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                F f11 = (F) this.f22912c.get(size2);
                if (f11.getItemId() == j10 && !f11.isAttachedToTransitionOverlay()) {
                    if (i10 == f11.getItemViewType()) {
                        if (!z10) {
                            this.f22912c.remove(size2);
                        }
                        return f11;
                    }
                    if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        public F m(int i10, boolean z10) {
            View e10;
            int size = this.f22910a.size();
            for (int i11 = 0; i11 < size; i11++) {
                F f10 = (F) this.f22910a.get(i11);
                if (!f10.wasReturnedFromScrap() && f10.getLayoutPosition() == i10 && !f10.isInvalid() && (RecyclerView.this.f22754Q4.f22837h || !f10.isRemoved())) {
                    f10.addFlags(32);
                    return f10;
                }
            }
            if (z10 || (e10 = RecyclerView.this.f22782f.e(i10)) == null) {
                int size2 = this.f22912c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    F f11 = (F) this.f22912c.get(i12);
                    if (!f11.isInvalid() && f11.getLayoutPosition() == i10 && !f11.isAttachedToTransitionOverlay()) {
                        if (!z10) {
                            this.f22912c.remove(i12);
                        }
                        if (RecyclerView.f22732k5) {
                            f11.toString();
                        }
                        return f11;
                    }
                }
                return null;
            }
            F p02 = RecyclerView.p0(e10);
            RecyclerView.this.f22782f.s(e10);
            int m10 = RecyclerView.this.f22782f.m(e10);
            if (m10 != -1) {
                RecyclerView.this.f22782f.d(m10);
                I(e10);
                p02.addFlags(8224);
                return p02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + p02 + RecyclerView.this.V());
        }

        public View n(int i10) {
            return ((F) this.f22910a.get(i10)).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        public View p(int i10, boolean z10) {
            return N(i10, z10, LongCompanionObject.MAX_VALUE).itemView;
        }

        public final void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(F f10) {
            View view = f10.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.f22912c.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = (r) ((F) this.f22912c.get(i10)).itemView.getLayoutParams();
                if (rVar != null) {
                    rVar.f22901c = true;
                }
            }
        }

        public void t() {
            int size = this.f22912c.size();
            for (int i10 = 0; i10 < size; i10++) {
                F f10 = (F) this.f22912c.get(i10);
                if (f10 != null) {
                    f10.addFlags(6);
                    f10.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.f22795m;
            if (hVar == null || !hVar.hasStableIds()) {
                E();
            }
        }

        public final void u() {
            if (this.f22916g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f22795m == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f22916g.b(RecyclerView.this.f22795m);
            }
        }

        public void v(int i10, int i11) {
            int size = this.f22912c.size();
            for (int i12 = 0; i12 < size; i12++) {
                F f10 = (F) this.f22912c.get(i12);
                if (f10 != null && f10.mPosition >= i10) {
                    if (RecyclerView.f22732k5) {
                        f10.toString();
                    }
                    f10.offsetPosition(i11, false);
                }
            }
        }

        public void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f22912c.size();
            for (int i16 = 0; i16 < size; i16++) {
                F f10 = (F) this.f22912c.get(i16);
                if (f10 != null && (i15 = f10.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        f10.offsetPosition(i11 - i10, false);
                    } else {
                        f10.offsetPosition(i12, false);
                    }
                    if (RecyclerView.f22732k5) {
                        f10.toString();
                    }
                }
            }
        }

        public void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f22912c.size() - 1; size >= 0; size--) {
                F f10 = (F) this.f22912c.get(size);
                if (f10 != null) {
                    int i13 = f10.mPosition;
                    if (i13 >= i12) {
                        if (RecyclerView.f22732k5) {
                            f10.toString();
                        }
                        f10.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        f10.addFlags(8);
                        F(size);
                    }
                }
            }
        }

        public void y(h hVar, h hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        public void z() {
            u();
        }
    }

    public interface y {
    }

    public class z extends j {
        public z() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.r(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f22754Q4.f22836g = true;
            recyclerView.b1(true);
            if (RecyclerView.this.f22780e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f22780e.r(i10, i11, obj)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f22780e.s(i10, i11)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f22780e.t(i10, i11, i12)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f22780e.u(i10, i11)) {
                g();
            }
        }

        public void g() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f22804t && recyclerView.f22803s) {
                AbstractC2082d0.d0(recyclerView, recyclerView.f22790i);
            } else {
                recyclerView.f22740B = true;
                recyclerView.requestLayout();
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f22737p5 = new InterpolatorC2259c();
        f22738q5 = new C();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private boolean K1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f22748J;
        if (edgeEffect == null || C0.f.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            C0.f.d(this.f22748J, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.f22750L;
        if (edgeEffect2 != null && C0.f.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            C0.f.d(this.f22750L, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.f22749K;
        if (edgeEffect3 != null && C0.f.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            C0.f.d(this.f22749K, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.f22751O;
        if (edgeEffect4 == null || C0.f.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        C0.f.d(this.f22751O, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public static RecyclerView c0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView c02 = c0(viewGroup.getChildAt(i10));
            if (c02 != null) {
                return c02;
            }
        }
        return null;
    }

    private androidx.core.view.F getScrollingChildHelper() {
        if (this.f22769Z4 == null) {
            this.f22769Z4 = new androidx.core.view.F(this);
        }
        return this.f22769Z4;
    }

    private int h1(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f22749K;
        float f11 = 0.0f;
        if (edgeEffect == null || C0.f.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f22751O;
            if (edgeEffect2 != null && C0.f.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f22751O.onRelease();
                } else {
                    float d10 = C0.f.d(this.f22751O, height, 1.0f - width);
                    if (C0.f.b(this.f22751O) == 0.0f) {
                        this.f22751O.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f22749K.onRelease();
            } else {
                float f12 = -C0.f.d(this.f22749K, -height, width);
                if (C0.f.b(this.f22749K) == 0.0f) {
                    this.f22749K.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    public static F p0(View view) {
        if (view == null) {
            return null;
        }
        return ((r) view.getLayoutParams()).f22899a;
    }

    public static void q0(View view, Rect rect) {
        r rVar = (r) view.getLayoutParams();
        Rect rect2 = rVar.f22900b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        f22731j5 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        f22732k5 = z10;
    }

    public static void u(F f10) {
        WeakReference<RecyclerView> weakReference = f10.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f10.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f10.mNestedRecyclerView = null;
        }
    }

    private float v0(int i10) {
        double log = Math.log((Math.abs(i10) * 0.35f) / (this.f22770a * 0.015f));
        float f10 = f22733l5;
        return (float) (this.f22770a * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * log));
    }

    public void A() {
        if (!this.f22806v || this.f22743E) {
            Trace.beginSection("RV FullInvalidate");
            H();
            Trace.endSection();
            return;
        }
        if (this.f22780e.p()) {
            if (!this.f22780e.o(4) || this.f22780e.o(11)) {
                if (this.f22780e.p()) {
                    Trace.beginSection("RV FullInvalidate");
                    H();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            H1();
            S0();
            this.f22780e.w();
            if (!this.f22808x) {
                if (y0()) {
                    H();
                } else {
                    this.f22780e.i();
                }
            }
            L1(true);
            T0();
            Trace.endSection();
        }
    }

    public final void A0() {
        if (AbstractC2082d0.y(this) == 0) {
            AbstractC2082d0.v0(this, 8);
        }
    }

    public final boolean A1(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return v0(-i10) < C0.f.b(edgeEffect) * ((float) i11);
    }

    public final void B(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String s02 = s0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(s02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(q.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + s02, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((q) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + s02, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + s02, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + s02, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s02, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s02, e16);
            }
        }
    }

    public final void B0() {
        this.f22782f = new f(new C2262f());
    }

    public boolean B1(AccessibilityEvent accessibilityEvent) {
        if (!F0()) {
            return false;
        }
        int a10 = accessibilityEvent != null ? AbstractC6839b.a(accessibilityEvent) : 0;
        this.f22739A |= a10 != 0 ? a10 : 0;
        return true;
    }

    public void C(int i10, int i11) {
        setMeasuredDimension(q.D(i10, getPaddingLeft() + getPaddingRight(), AbstractC2082d0.B(this)), q.D(i11, getPaddingTop() + getPaddingBottom(), AbstractC2082d0.A(this)));
    }

    public void C0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC6848b.f68250a), resources.getDimensionPixelSize(AbstractC6848b.f68252c), resources.getDimensionPixelOffset(AbstractC6848b.f68251b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
    }

    public void C1(int i10, int i11) {
        D1(i10, i11, null);
    }

    public final boolean D(int i10, int i11) {
        b0(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    public void D0() {
        this.f22751O = null;
        this.f22749K = null;
        this.f22750L = null;
        this.f22748J = null;
    }

    public void D1(int i10, int i11, Interpolator interpolator) {
        E1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public void E(View view) {
        F p02 = p0(view);
        Q0(view);
        h hVar = this.f22795m;
        if (hVar != null && p02 != null) {
            hVar.onViewAttachedToWindow(p02);
        }
        List list = this.f22742D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f22742D.get(size)).d(view);
            }
        }
    }

    public boolean E0() {
        AccessibilityManager accessibilityManager = this.f22741C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void E1(int i10, int i11, Interpolator interpolator, int i12) {
        F1(i10, i11, interpolator, i12, false);
    }

    public void F(View view) {
        F p02 = p0(view);
        R0(view);
        h hVar = this.f22795m;
        if (hVar != null && p02 != null) {
            hVar.onViewDetachedFromWindow(p02);
        }
        List list = this.f22742D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f22742D.get(size)).b(view);
            }
        }
    }

    public boolean F0() {
        return this.f22745G > 0;
    }

    public void F1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        q qVar = this.f22796n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f22811y) {
            return;
        }
        if (!qVar.A()) {
            i10 = 0;
        }
        if (!this.f22796n.B()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            I1(i13, 1);
        }
        this.f22810x2.e(i10, i11, i12, interpolator);
    }

    public final void G() {
        int i10 = this.f22739A;
        this.f22739A = 0;
        if (i10 == 0 || !E0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        AbstractC6839b.b(obtain, i10);
        sendAccessibilityEventUnchecked(obtain);
    }

    public final boolean G0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || Y(view2) == null) {
            return false;
        }
        if (view == null || Y(view) == null) {
            return true;
        }
        this.f22792j.set(0, 0, view.getWidth(), view.getHeight());
        this.f22793k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f22792j);
        offsetDescendantRectToMyCoords(view2, this.f22793k);
        char c10 = 65535;
        int i12 = this.f22796n.o0() == 1 ? -1 : 1;
        Rect rect = this.f22792j;
        int i13 = rect.left;
        Rect rect2 = this.f22793k;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + V());
    }

    public void G1(int i10) {
        if (this.f22811y) {
            return;
        }
        q qVar = this.f22796n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.W1(this, this.f22754Q4, i10);
        }
    }

    public void H() {
        if (this.f22795m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f22796n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f22754Q4.f22839j = false;
        boolean z10 = this.f22777c5 && !(this.f22779d5 == getWidth() && this.f22781e5 == getHeight());
        this.f22779d5 = 0;
        this.f22781e5 = 0;
        this.f22777c5 = false;
        if (this.f22754Q4.f22834e == 1) {
            I();
            this.f22796n.N1(this);
            J();
        } else if (this.f22780e.q() || z10 || this.f22796n.z0() != getWidth() || this.f22796n.m0() != getHeight()) {
            this.f22796n.N1(this);
            J();
        } else {
            this.f22796n.N1(this);
        }
        K();
    }

    public void H0(int i10) {
        if (this.f22796n == null) {
            return;
        }
        setScrollState(2);
        this.f22796n.L1(i10);
        awakenScrollBars();
    }

    public void H1() {
        int i10 = this.f22807w + 1;
        this.f22807w = i10;
        if (i10 != 1 || this.f22811y) {
            return;
        }
        this.f22808x = false;
    }

    public final void I() {
        this.f22754Q4.a(1);
        W(this.f22754Q4);
        this.f22754Q4.f22839j = false;
        H1();
        this.f22784g.f();
        S0();
        a1();
        t1();
        B b10 = this.f22754Q4;
        b10.f22838i = b10.f22840k && this.f22761U4;
        this.f22761U4 = false;
        this.f22760T4 = false;
        b10.f22837h = b10.f22841l;
        b10.f22835f = this.f22795m.getItemCount();
        b0(this.mMinMaxLayoutPositions);
        if (this.f22754Q4.f22840k) {
            int g10 = this.f22782f.g();
            for (int i10 = 0; i10 < g10; i10++) {
                F p02 = p0(this.f22782f.f(i10));
                if (!p02.shouldIgnore() && (!p02.isInvalid() || this.f22795m.hasStableIds())) {
                    this.f22784g.e(p02, this.f22752P.u(this.f22754Q4, p02, n.e(p02), p02.getUnmodifiedPayloads()));
                    if (this.f22754Q4.f22838i && p02.isUpdated() && !p02.isRemoved() && !p02.shouldIgnore() && !p02.isInvalid()) {
                        this.f22784g.c(l0(p02), p02);
                    }
                }
            }
        }
        if (this.f22754Q4.f22841l) {
            u1();
            B b11 = this.f22754Q4;
            boolean z10 = b11.f22836g;
            b11.f22836g = false;
            this.f22796n.k1(this.f22776c, b11);
            this.f22754Q4.f22836g = z10;
            for (int i11 = 0; i11 < this.f22782f.g(); i11++) {
                F p03 = p0(this.f22782f.f(i11));
                if (!p03.shouldIgnore() && !this.f22784g.i(p03)) {
                    int e10 = n.e(p03);
                    boolean hasAnyOfTheFlags = p03.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e10 |= 4096;
                    }
                    n.c u10 = this.f22752P.u(this.f22754Q4, p03, e10, p03.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        d1(p03, u10);
                    } else {
                        this.f22784g.a(p03, u10);
                    }
                }
            }
            v();
        } else {
            v();
        }
        T0();
        L1(false);
        this.f22754Q4.f22834e = 2;
    }

    public void I0() {
        int j10 = this.f22782f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((r) this.f22782f.i(i10).getLayoutParams()).f22901c = true;
        }
        this.f22776c.s();
    }

    public boolean I1(int i10, int i11) {
        return getScrollingChildHelper().q(i10, i11);
    }

    public final void J() {
        H1();
        S0();
        this.f22754Q4.a(6);
        this.f22780e.j();
        this.f22754Q4.f22835f = this.f22795m.getItemCount();
        this.f22754Q4.f22833d = 0;
        if (this.f22778d != null && this.f22795m.canRestoreState()) {
            Parcelable parcelable = this.f22778d.f22854c;
            if (parcelable != null) {
                this.f22796n.p1(parcelable);
            }
            this.f22778d = null;
        }
        B b10 = this.f22754Q4;
        b10.f22837h = false;
        this.f22796n.k1(this.f22776c, b10);
        B b11 = this.f22754Q4;
        b11.f22836g = false;
        b11.f22840k = b11.f22840k && this.f22752P != null;
        b11.f22834e = 4;
        T0();
        L1(false);
    }

    public void J0() {
        int j10 = this.f22782f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            F p02 = p0(this.f22782f.i(i10));
            if (p02 != null && !p02.shouldIgnore()) {
                p02.addFlags(6);
            }
        }
        I0();
        this.f22776c.t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J1(int i10) {
        boolean A10 = this.f22796n.A();
        int i11 = A10;
        if (this.f22796n.B()) {
            i11 = (A10 ? 1 : 0) | 2;
        }
        I1(i11, i10);
    }

    public final void K() {
        RecyclerView recyclerView;
        this.f22754Q4.a(4);
        H1();
        S0();
        B b10 = this.f22754Q4;
        b10.f22834e = 1;
        if (b10.f22840k) {
            for (int g10 = this.f22782f.g() - 1; g10 >= 0; g10--) {
                F p02 = p0(this.f22782f.f(g10));
                if (!p02.shouldIgnore()) {
                    long l02 = l0(p02);
                    n.c t10 = this.f22752P.t(this.f22754Q4, p02);
                    F g11 = this.f22784g.g(l02);
                    if (g11 == null || g11.shouldIgnore()) {
                        this.f22784g.d(p02, t10);
                    } else {
                        boolean h10 = this.f22784g.h(g11);
                        boolean h11 = this.f22784g.h(p02);
                        if (h10 && g11 == p02) {
                            this.f22784g.d(p02, t10);
                        } else {
                            n.c n10 = this.f22784g.n(g11);
                            this.f22784g.d(p02, t10);
                            n.c m10 = this.f22784g.m(p02);
                            if (n10 == null) {
                                w0(l02, p02, g11);
                            } else {
                                p(g11, p02, n10, m10, h10, h11);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f22784g.o(recyclerView.f22787g5);
        } else {
            recyclerView = this;
        }
        recyclerView.f22796n.z1(recyclerView.f22776c);
        B b11 = recyclerView.f22754Q4;
        b11.f22832c = b11.f22835f;
        recyclerView.f22743E = false;
        recyclerView.f22744F = false;
        b11.f22840k = false;
        b11.f22841l = false;
        recyclerView.f22796n.f22882h = false;
        ArrayList arrayList = recyclerView.f22776c.f22911b;
        if (arrayList != null) {
            arrayList.clear();
        }
        q qVar = recyclerView.f22796n;
        if (qVar.f22888n) {
            qVar.f22887m = 0;
            qVar.f22888n = false;
            recyclerView.f22776c.P();
        }
        recyclerView.f22796n.l1(recyclerView.f22754Q4);
        T0();
        L1(false);
        recyclerView.f22784g.f();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        e1();
        r1();
    }

    public final void K0(int i10, int i11, MotionEvent motionEvent, int i12) {
        q qVar = this.f22796n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f22811y) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean A10 = qVar.A();
        boolean B10 = this.f22796n.B();
        int i13 = B10 ? (A10 ? 1 : 0) | 2 : A10 ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int g12 = i10 - g1(i10, height);
        int h12 = i11 - h1(i11, width);
        I1(i13, i12);
        if (L(A10 ? g12 : 0, B10 ? h12 : 0, this.mReusableIntPair, this.mScrollOffset, i12)) {
            int[] iArr2 = this.mReusableIntPair;
            g12 -= iArr2[0];
            h12 -= iArr2[1];
        }
        v1(A10 ? g12 : 0, B10 ? h12 : 0, motionEvent, i12);
        androidx.recyclerview.widget.j jVar = this.f22813y2;
        if (jVar != null && (g12 != 0 || h12 != 0)) {
            jVar.f(this, g12, h12);
        }
        M1(i12);
    }

    public boolean L(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void L0(int i10) {
        int g10 = this.f22782f.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f22782f.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void L1(boolean z10) {
        if (this.f22807w < 1) {
            if (f22731j5) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
            this.f22807w = 1;
        }
        if (!z10 && !this.f22811y) {
            this.f22808x = false;
        }
        if (this.f22807w == 1) {
            if (z10 && this.f22808x && !this.f22811y && this.f22796n != null && this.f22795m != null) {
                H();
            }
            if (!this.f22811y) {
                this.f22808x = false;
            }
        }
        this.f22807w--;
    }

    public final void M(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void M0(int i10) {
        int g10 = this.f22782f.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.f22782f.f(i11).offsetTopAndBottom(i10);
        }
    }

    public void M1(int i10) {
        getScrollingChildHelper().s(i10);
    }

    public void N(int i10) {
        q qVar = this.f22796n;
        if (qVar != null) {
            qVar.r1(i10);
        }
        W0(i10);
        v vVar = this.f22756R4;
        if (vVar != null) {
            vVar.a(this, i10);
        }
        List list = this.f22757S4;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((v) this.f22757S4.get(size)).a(this, i10);
            }
        }
    }

    public void N0(int i10, int i11) {
        int j10 = this.f22782f.j();
        for (int i12 = 0; i12 < j10; i12++) {
            F p02 = p0(this.f22782f.i(i12));
            if (p02 != null && !p02.shouldIgnore() && p02.mPosition >= i10) {
                if (f22732k5) {
                    p02.toString();
                }
                p02.offsetPosition(i11, false);
                this.f22754Q4.f22836g = true;
            }
        }
        this.f22776c.v(i10, i11);
        requestLayout();
    }

    public void N1() {
        setScrollState(0);
        O1();
    }

    public void O(int i10, int i11) {
        this.f22746H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        X0(i10, i11);
        v vVar = this.f22756R4;
        if (vVar != null) {
            vVar.b(this, i10, i11);
        }
        List list = this.f22757S4;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((v) this.f22757S4.get(size)).b(this, i10, i11);
            }
        }
        this.f22746H--;
    }

    public void O0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.f22782f.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            F p02 = p0(this.f22782f.i(i16));
            if (p02 != null && (i15 = p02.mPosition) >= i13 && i15 <= i12) {
                if (f22732k5) {
                    p02.toString();
                }
                if (p02.mPosition == i10) {
                    p02.offsetPosition(i11 - i10, false);
                } else {
                    p02.offsetPosition(i14, false);
                }
                this.f22754Q4.f22836g = true;
            }
        }
        this.f22776c.w(i10, i11);
        requestLayout();
    }

    public final void O1() {
        this.f22810x2.f();
        q qVar = this.f22796n;
        if (qVar != null) {
            qVar.Y1();
        }
    }

    public void P() {
        int i10;
        for (int size = this.f22771a5.size() - 1; size >= 0; size--) {
            F f10 = (F) this.f22771a5.get(size);
            if (f10.itemView.getParent() == this && !f10.shouldIgnore() && (i10 = f10.mPendingAccessibilityState) != -1) {
                f10.itemView.setImportantForAccessibility(i10);
                f10.mPendingAccessibilityState = -1;
            }
        }
        this.f22771a5.clear();
    }

    public void P0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.f22782f.j();
        for (int i13 = 0; i13 < j10; i13++) {
            F p02 = p0(this.f22782f.i(i13));
            if (p02 != null && !p02.shouldIgnore()) {
                int i14 = p02.mPosition;
                if (i14 >= i12) {
                    if (f22732k5) {
                        p02.toString();
                    }
                    p02.offsetPosition(-i11, z10);
                    this.f22754Q4.f22836g = true;
                } else if (i14 >= i10) {
                    if (f22732k5) {
                        p02.toString();
                    }
                    p02.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.f22754Q4.f22836g = true;
                }
            }
        }
        this.f22776c.x(i10, i11, z10);
        requestLayout();
    }

    public void P1(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.f22782f.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.f22782f.i(i14);
            F p02 = p0(i15);
            if (p02 != null && !p02.shouldIgnore() && (i12 = p02.mPosition) >= i10 && i12 < i13) {
                p02.addFlags(2);
                p02.addChangePayload(obj);
                ((r) i15.getLayoutParams()).f22901c = true;
            }
        }
        this.f22776c.R(i10, i11);
    }

    public final boolean Q(MotionEvent motionEvent) {
        u uVar = this.f22802r;
        if (uVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return a0(motionEvent);
        }
        uVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f22802r = null;
        }
        return true;
    }

    public void Q0(View view) {
    }

    public void R() {
        if (this.f22751O != null) {
            return;
        }
        EdgeEffect a10 = this.f22747I.a(this, 3);
        this.f22751O = a10;
        if (this.f22788h) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void R0(View view) {
    }

    public void S() {
        if (this.f22748J != null) {
            return;
        }
        EdgeEffect a10 = this.f22747I.a(this, 0);
        this.f22748J = a10;
        if (this.f22788h) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void S0() {
        this.f22745G++;
    }

    public void T() {
        if (this.f22750L != null) {
            return;
        }
        EdgeEffect a10 = this.f22747I.a(this, 2);
        this.f22750L = a10;
        if (this.f22788h) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void T0() {
        U0(true);
    }

    public void U() {
        if (this.f22749K != null) {
            return;
        }
        EdgeEffect a10 = this.f22747I.a(this, 1);
        this.f22749K = a10;
        if (this.f22788h) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void U0(boolean z10) {
        int i10 = this.f22745G - 1;
        this.f22745G = i10;
        if (i10 < 1) {
            if (f22731j5 && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
            }
            this.f22745G = 0;
            if (z10) {
                G();
                P();
            }
        }
    }

    public String V() {
        return " " + super.toString() + ", adapter:" + this.f22795m + ", layout:" + this.f22796n + ", context:" + getContext();
    }

    public final void V0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f22758T) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f22758T = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f22785g1 = x10;
            this.f22765W = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f22799p1 = y10;
            this.f22773b1 = y10;
        }
    }

    public final void W(B b10) {
        if (getScrollState() != 2) {
            b10.f22845p = 0;
            b10.f22846q = 0;
        } else {
            OverScroller overScroller = this.f22810x2.f22849c;
            b10.f22845p = overScroller.getFinalX() - overScroller.getCurrX();
            b10.f22846q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void W0(int i10) {
    }

    public View X(float f10, float f11) {
        for (int g10 = this.f22782f.g() - 1; g10 >= 0; g10--) {
            View f12 = this.f22782f.f(g10);
            float translationX = f12.getTranslationX();
            float translationY = f12.getTranslationY();
            if (f10 >= f12.getLeft() + translationX && f10 <= f12.getRight() + translationX && f11 >= f12.getTop() + translationY && f11 <= f12.getBottom() + translationY) {
                return f12;
            }
        }
        return null;
    }

    public void X0(int i10, int i11) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View Y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public void Y0() {
        if (this.f22766W4 || !this.f22803s) {
            return;
        }
        AbstractC2082d0.d0(this, this.f22775b5);
        this.f22766W4 = true;
    }

    public F Z(View view) {
        View Y10 = Y(view);
        if (Y10 == null) {
            return null;
        }
        return o0(Y10);
    }

    public final boolean Z0() {
        return this.f22752P != null && this.f22796n.Z1();
    }

    public final boolean a0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f22801q.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = (u) this.f22801q.get(i10);
            if (uVar.c(this, motionEvent) && action != 3) {
                this.f22802r = uVar;
                return true;
            }
        }
        return false;
    }

    public final void a1() {
        boolean z10;
        if (this.f22743E) {
            this.f22780e.y();
            if (this.f22744F) {
                this.f22796n.f1(this);
            }
        }
        if (Z0()) {
            this.f22780e.w();
        } else {
            this.f22780e.j();
        }
        boolean z11 = this.f22760T4 || this.f22761U4;
        this.f22754Q4.f22840k = this.f22806v && this.f22752P != null && ((z10 = this.f22743E) || z11 || this.f22796n.f22882h) && (!z10 || this.f22795m.hasStableIds());
        B b10 = this.f22754Q4;
        b10.f22841l = b10.f22840k && z11 && !this.f22743E && Z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        q qVar = this.f22796n;
        if (qVar == null || !qVar.S0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void b(int i10, int i11) {
        if (i10 < 0) {
            S();
            if (this.f22748J.isFinished()) {
                this.f22748J.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            T();
            if (this.f22750L.isFinished()) {
                this.f22750L.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            U();
            if (this.f22749K.isFinished()) {
                this.f22749K.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            R();
            if (this.f22751O.isFinished()) {
                this.f22751O.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public final void b0(int[] iArr) {
        int g10 = this.f22782f.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < g10; i12++) {
            F p02 = p0(this.f22782f.f(i12));
            if (!p02.shouldIgnore()) {
                int layoutPosition = p02.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public void b1(boolean z10) {
        this.f22744F = z10 | this.f22744F;
        this.f22743E = true;
        J0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(float f10, float f11, float f12, float f13) {
        boolean z10;
        boolean z11 = true;
        if (f11 < 0.0f) {
            S();
            C0.f.d(this.f22748J, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        } else {
            if (f11 <= 0.0f) {
                z10 = false;
                if (f13 >= 0.0f) {
                    U();
                    C0.f.d(this.f22749K, (-f13) / getHeight(), f10 / getWidth());
                } else if (f13 > 0.0f) {
                    R();
                    C0.f.d(this.f22751O, f13 / getHeight(), 1.0f - (f10 / getWidth()));
                } else {
                    z11 = z10;
                }
                if (z11 && f11 == 0.0f && f13 == 0.0f) {
                    return;
                }
                postInvalidateOnAnimation();
            }
            T();
            C0.f.d(this.f22750L, f11 / getWidth(), f12 / getHeight());
        }
        z10 = true;
        if (f13 >= 0.0f) {
        }
        if (z11) {
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof r) && this.f22796n.C((r) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        q qVar = this.f22796n;
        if (qVar != null && qVar.A()) {
            return this.f22796n.G(this.f22754Q4);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        q qVar = this.f22796n;
        if (qVar != null && qVar.A()) {
            return this.f22796n.H(this.f22754Q4);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        q qVar = this.f22796n;
        if (qVar != null && qVar.A()) {
            return this.f22796n.I(this.f22754Q4);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        q qVar = this.f22796n;
        if (qVar != null && qVar.B()) {
            return this.f22796n.J(this.f22754Q4);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        q qVar = this.f22796n;
        if (qVar != null && qVar.B()) {
            return this.f22796n.K(this.f22754Q4);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        q qVar = this.f22796n;
        if (qVar != null && qVar.B()) {
            return this.f22796n.L(this.f22754Q4);
        }
        return 0;
    }

    public final View d0() {
        F e02;
        B b10 = this.f22754Q4;
        int i10 = b10.f22842m;
        if (i10 == -1) {
            i10 = 0;
        }
        int b11 = b10.b();
        for (int i11 = i10; i11 < b11; i11++) {
            F e03 = e0(i11);
            if (e03 == null) {
                break;
            }
            if (e03.itemView.hasFocusable()) {
                return e03.itemView;
            }
        }
        int min = Math.min(b11, i10);
        do {
            min--;
            if (min < 0 || (e02 = e0(min)) == null) {
                return null;
            }
        } while (!e02.itemView.hasFocusable());
        return e02.itemView;
    }

    public void d1(F f10, n.c cVar) {
        f10.setFlags(0, 8192);
        if (this.f22754Q4.f22838i && f10.isUpdated() && !f10.isRemoved() && !f10.shouldIgnore()) {
            this.f22784g.c(l0(f10), f10);
        }
        this.f22784g.e(f10, cVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        q layoutManager = getLayoutManager();
        int i10 = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.B()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    E1(0, measuredHeight, null, Integer.MIN_VALUE);
                } else {
                    E1(0, -measuredHeight, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean H02 = layoutManager.H0();
                if (keyCode == 122) {
                    if (H02) {
                        i10 = getAdapter().getItemCount();
                    }
                } else if (!H02) {
                    i10 = getAdapter().getItemCount();
                }
                G1(i10);
                return true;
            }
        } else if (layoutManager.A()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    E1(measuredWidth, 0, null, Integer.MIN_VALUE);
                } else {
                    E1(-measuredWidth, 0, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean H03 = layoutManager.H0();
                if (keyCode2 == 122) {
                    if (H03) {
                        i10 = getAdapter().getItemCount();
                    }
                } else if (!H03) {
                    i10 = getAdapter().getItemCount();
                }
                G1(i10);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f22798p.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f22798p.get(i10)).onDrawOver(canvas, this, this.f22754Q4);
        }
        EdgeEffect edgeEffect = this.f22748J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f22788h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f22748J;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f22749K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f22788h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f22749K;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f22750L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f22788h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f22750L;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f22751O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f22788h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f22751O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if ((z10 || this.f22752P == null || this.f22798p.size() <= 0 || !this.f22752P.p()) ? z10 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public F e0(int i10) {
        F f10 = null;
        if (this.f22743E) {
            return null;
        }
        int j10 = this.f22782f.j();
        for (int i11 = 0; i11 < j10; i11++) {
            F p02 = p0(this.f22782f.i(i11));
            if (p02 != null && !p02.isRemoved() && k0(p02) == i10) {
                if (!this.f22782f.n(p02.itemView)) {
                    return p02;
                }
                f10 = p02;
            }
        }
        return f10;
    }

    public final void e1() {
        View findViewById;
        if (!this.f22800p2 || this.f22795m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.f22782f.n(getFocusedChild())) {
                return;
            }
        }
        View view = null;
        F f02 = (this.f22754Q4.f22843n == -1 || !this.f22795m.hasStableIds()) ? null : f0(this.f22754Q4.f22843n);
        if (f02 != null && !this.f22782f.n(f02.itemView) && f02.itemView.hasFocusable()) {
            view = f02.itemView;
        } else if (this.f22782f.g() > 0) {
            view = d0();
        }
        if (view != null) {
            int i10 = this.f22754Q4.f22844o;
            if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    public F f0(long j10) {
        h hVar = this.f22795m;
        F f10 = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j11 = this.f22782f.j();
            for (int i10 = 0; i10 < j11; i10++) {
                F p02 = p0(this.f22782f.i(i10));
                if (p02 != null && !p02.isRemoved() && p02.getItemId() == j10) {
                    if (!this.f22782f.n(p02.itemView)) {
                        return p02;
                    }
                    f10 = p02;
                }
            }
        }
        return f10;
    }

    public final void f1() {
        boolean z10;
        EdgeEffect edgeEffect = this.f22748J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f22748J.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f22749K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f22749K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f22750L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f22750L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f22751O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f22751O.isFinished();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View focusSearch(View view, int i10) {
        View view2;
        boolean z10;
        View d12 = this.f22796n.d1(view, i10);
        if (d12 != null) {
            return d12;
        }
        boolean z11 = (this.f22795m == null || this.f22796n == null || F0() || this.f22811y) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f22796n.B()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                    if (!z10 && this.f22796n.A()) {
                        z10 = focusFinder.findNextFocus(this, view, !((this.f22796n.o0() != 1) ^ (i10 != 2)) ? 66 : 17) == null;
                    }
                    if (z10) {
                        A();
                        if (Y(view) == null) {
                            return null;
                        }
                        H1();
                        this.f22796n.W0(view, i10, this.f22776c, this.f22754Q4);
                        L1(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i10);
                }
            }
            z10 = false;
            if (!z10) {
                z10 = focusFinder.findNextFocus(this, view, !((this.f22796n.o0() != 1) ^ (i10 != 2)) ? 66 : 17) == null;
            }
            if (z10) {
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z11) {
                A();
                if (Y(view) == null) {
                    return null;
                }
                H1();
                view2 = this.f22796n.W0(view, i10, this.f22776c, this.f22754Q4);
                L1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return G0(view, view2, i10) ? view2 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        q1(view2, null);
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F g0(int i10, boolean z10) {
        int j10 = this.f22782f.j();
        F f10 = null;
        for (int i11 = 0; i11 < j10; i11++) {
            F p02 = p0(this.f22782f.i(i11));
            if (p02 != null && !p02.isRemoved()) {
                if (z10) {
                    if (p02.mPosition != i10) {
                        continue;
                    }
                    if (this.f22782f.n(p02.itemView)) {
                        return p02;
                    }
                    f10 = p02;
                } else {
                    if (p02.getLayoutPosition() != i10) {
                        continue;
                    }
                    if (this.f22782f.n(p02.itemView)) {
                    }
                }
            }
        }
        return f10;
    }

    public final int g1(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f22748J;
        float f11 = 0.0f;
        if (edgeEffect == null || C0.f.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f22750L;
            if (edgeEffect2 != null && C0.f.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f22750L.onRelease();
                } else {
                    float d10 = C0.f.d(this.f22750L, width, height);
                    if (C0.f.b(this.f22750L) == 0.0f) {
                        this.f22750L.onRelease();
                    }
                    f11 = d10;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f22748J.onRelease();
            } else {
                float f12 = -C0.f.d(this.f22748J, -width, 1.0f - height);
                if (C0.f.b(this.f22748J) == 0.0f) {
                    this.f22748J.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        q qVar = this.f22796n;
        if (qVar != null) {
            return qVar.T();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        q qVar = this.f22796n;
        if (qVar != null) {
            return qVar.U(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f22795m;
    }

    @Override // android.view.View
    public int getBaseline() {
        q qVar = this.f22796n;
        return qVar != null ? qVar.W() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        l lVar = this.f22768Y4;
        return lVar == null ? super.getChildDrawingOrder(i10, i11) : lVar.a(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f22788h;
    }

    public androidx.recyclerview.widget.u getCompatAccessibilityDelegate() {
        return this.f22767X4;
    }

    @NonNull
    public m getEdgeEffectFactory() {
        return this.f22747I;
    }

    public n getItemAnimator() {
        return this.f22752P;
    }

    public int getItemDecorationCount() {
        return this.f22798p.size();
    }

    public q getLayoutManager() {
        return this.f22796n;
    }

    public int getMaxFlingVelocity() {
        return this.f22763V1;
    }

    public int getMinFlingVelocity() {
        return this.f22759T1;
    }

    public long getNanoTime() {
        if (f22736o5) {
            return System.nanoTime();
        }
        return 0L;
    }

    public t getOnFlingListener() {
        return this.f22812y1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f22800p2;
    }

    @NonNull
    public w getRecycledViewPool() {
        return this.f22776c.i();
    }

    public int getScrollState() {
        return this.f22755R;
    }

    public boolean h0(int i10, int i11) {
        return i0(i10, i11, this.f22759T1, this.f22763V1);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public final void i(F f10) {
        View view = f10.itemView;
        boolean z10 = view.getParent() == this;
        this.f22776c.O(o0(view));
        if (f10.isTmpDetached()) {
            this.f22782f.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f22782f.k(view);
        } else {
            this.f22782f.b(view, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        float f10;
        float f11;
        q qVar = this.f22796n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f22811y) {
            return false;
        }
        boolean A10 = qVar.A();
        boolean B10 = this.f22796n.B();
        if (!A10 || Math.abs(i10) < i12) {
            i10 = 0;
        }
        if (!B10 || Math.abs(i11) < i12) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 != 0) {
            EdgeEffect edgeEffect = this.f22748J;
            if (edgeEffect == null || C0.f.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f22750L;
                if (edgeEffect2 != null && C0.f.b(edgeEffect2) != 0.0f) {
                    if (A1(this.f22750L, i10, getWidth())) {
                        this.f22750L.onAbsorb(i10);
                        i10 = 0;
                    }
                    i14 = i10;
                    i10 = 0;
                }
            } else {
                int i16 = -i10;
                if (A1(this.f22748J, i16, getWidth())) {
                    this.f22748J.onAbsorb(i16);
                    i10 = 0;
                }
                i14 = i10;
                i10 = 0;
            }
            if (i11 != 0) {
                EdgeEffect edgeEffect3 = this.f22749K;
                if (edgeEffect3 == null || C0.f.b(edgeEffect3) == 0.0f) {
                    EdgeEffect edgeEffect4 = this.f22751O;
                    if (edgeEffect4 != null && C0.f.b(edgeEffect4) != 0.0f) {
                        if (A1(this.f22751O, i11, getHeight())) {
                            this.f22751O.onAbsorb(i11);
                            i11 = 0;
                        }
                        i15 = 0;
                    }
                } else {
                    int i17 = -i11;
                    if (A1(this.f22749K, i17, getHeight())) {
                        this.f22749K.onAbsorb(i17);
                        i11 = 0;
                    }
                    i15 = 0;
                }
                if (i14 == 0 || i11 != 0) {
                    int i18 = -i13;
                    i14 = Math.max(i18, Math.min(i14, i13));
                    i11 = Math.max(i18, Math.min(i11, i13));
                    J1(1);
                    this.f22810x2.b(i14, i11);
                }
                if (i10 != 0 && i15 == 0) {
                    return (i14 == 0 && i11 == 0) ? false : true;
                }
                f10 = i10;
                f11 = i15;
                if (!dispatchNestedPreFling(f10, f11)) {
                    boolean z10 = A10 || B10;
                    dispatchNestedFling(f10, f11, z10);
                    t tVar = this.f22812y1;
                    if (tVar != null && tVar.a(i10, i15)) {
                        return true;
                    }
                    if (z10) {
                        J1(1);
                        int i19 = -i13;
                        this.f22810x2.b(Math.max(i19, Math.min(i10, i13)), Math.max(i19, Math.min(i15, i13)));
                        return true;
                    }
                }
                return false;
            }
            i15 = i11;
            i11 = 0;
            if (i14 == 0) {
            }
            int i182 = -i13;
            i14 = Math.max(i182, Math.min(i14, i13));
            i11 = Math.max(i182, Math.min(i11, i13));
            J1(1);
            this.f22810x2.b(i14, i11);
            if (i10 != 0) {
            }
            f10 = i10;
            f11 = i15;
            if (!dispatchNestedPreFling(f10, f11)) {
            }
            return false;
        }
        i14 = 0;
        if (i11 != 0) {
        }
        i15 = i11;
        i11 = 0;
        if (i14 == 0) {
        }
        int i1822 = -i13;
        i14 = Math.max(i1822, Math.min(i14, i13));
        i11 = Math.max(i1822, Math.min(i11, i13));
        J1(1);
        this.f22810x2.b(i14, i11);
        if (i10 != 0) {
        }
        f10 = i10;
        f11 = i15;
        if (!dispatchNestedPreFling(f10, f11)) {
        }
        return false;
    }

    public void i1() {
        n nVar = this.f22752P;
        if (nVar != null) {
            nVar.k();
        }
        q qVar = this.f22796n;
        if (qVar != null) {
            qVar.y1(this.f22776c);
            this.f22796n.z1(this.f22776c);
        }
        this.f22776c.c();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f22803s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f22811y;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    public void j(p pVar) {
        k(pVar, -1);
    }

    public boolean j0(int i10, int i11) {
        return i0(i10, i11, 0, Integer.MAX_VALUE);
    }

    public boolean j1(View view) {
        H1();
        boolean r10 = this.f22782f.r(view);
        if (r10) {
            F p02 = p0(view);
            this.f22776c.O(p02);
            this.f22776c.H(p02);
            if (f22732k5) {
                Objects.toString(view);
                toString();
            }
        }
        L1(!r10);
        return r10;
    }

    public void k(p pVar, int i10) {
        q qVar = this.f22796n;
        if (qVar != null) {
            qVar.w("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f22798p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f22798p.add(pVar);
        } else {
            this.f22798p.add(i10, pVar);
        }
        I0();
        requestLayout();
    }

    public int k0(F f10) {
        if (f10.hasAnyOfTheFlags(524) || !f10.isBound()) {
            return -1;
        }
        return this.f22780e.e(f10.mPosition);
    }

    public void k1(p pVar) {
        q qVar = this.f22796n;
        if (qVar != null) {
            qVar.w("Cannot remove item decoration during a scroll  or layout");
        }
        this.f22798p.remove(pVar);
        if (this.f22798p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        I0();
        requestLayout();
    }

    public void l(s sVar) {
        if (this.f22742D == null) {
            this.f22742D = new ArrayList();
        }
        this.f22742D.add(sVar);
    }

    public long l0(F f10) {
        return this.f22795m.hasStableIds() ? f10.getItemId() : f10.mPosition;
    }

    public void l1(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            k1(u0(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void m(u uVar) {
        this.f22801q.add(uVar);
    }

    public int m0(View view) {
        F p02 = p0(view);
        if (p02 != null) {
            return p02.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public void m1(s sVar) {
        List list = this.f22742D;
        if (list == null) {
            return;
        }
        list.remove(sVar);
    }

    public void n(v vVar) {
        if (this.f22757S4 == null) {
            this.f22757S4 = new ArrayList();
        }
        this.f22757S4.add(vVar);
    }

    public int n0(View view) {
        F p02 = p0(view);
        if (p02 != null) {
            return p02.getLayoutPosition();
        }
        return -1;
    }

    public void n1(u uVar) {
        this.f22801q.remove(uVar);
        if (this.f22802r == uVar) {
            this.f22802r = null;
        }
    }

    public void o(F f10, n.c cVar, n.c cVar2) {
        f10.setIsRecyclable(false);
        if (this.f22752P.a(f10, cVar, cVar2)) {
            Y0();
        }
    }

    public F o0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return p0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void o1(v vVar) {
        List list = this.f22757S4;
        if (list != null) {
            list.remove(vVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float f10;
        super.onAttachedToWindow();
        this.f22745G = 0;
        this.f22803s = true;
        this.f22806v = this.f22806v && !isLayoutRequested();
        this.f22776c.z();
        q qVar = this.f22796n;
        if (qVar != null) {
            qVar.P(this);
        }
        this.f22766W4 = false;
        if (f22736o5) {
            ThreadLocal threadLocal = androidx.recyclerview.widget.j.f23123e;
            androidx.recyclerview.widget.j jVar = (androidx.recyclerview.widget.j) threadLocal.get();
            this.f22813y2 = jVar;
            if (jVar == null) {
                this.f22813y2 = new androidx.recyclerview.widget.j();
                Display t10 = AbstractC2082d0.t(this);
                if (!isInEditMode() && t10 != null) {
                    f10 = t10.getRefreshRate();
                }
                f10 = 60.0f;
                androidx.recyclerview.widget.j jVar2 = this.f22813y2;
                jVar2.f23127c = (long) (1.0E9f / f10);
                threadLocal.set(jVar2);
            }
            this.f22813y2.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.j jVar;
        super.onDetachedFromWindow();
        n nVar = this.f22752P;
        if (nVar != null) {
            nVar.k();
        }
        N1();
        this.f22803s = false;
        q qVar = this.f22796n;
        if (qVar != null) {
            qVar.Q(this, this.f22776c);
        }
        this.f22771a5.clear();
        removeCallbacks(this.f22775b5);
        this.f22784g.j();
        this.f22776c.A();
        G0.a.b(this);
        if (!f22736o5 || (jVar = this.f22813y2) == null) {
            return;
        }
        jVar.j(this);
        this.f22813y2 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f22798p.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f22798p.get(i10)).onDraw(canvas, this, this.f22754Q4);
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float f10;
        RecyclerView recyclerView;
        if (this.f22796n != null && !this.f22811y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f11 = this.f22796n.B() ? -motionEvent.getAxisValue(9) : 0.0f;
                z10 = false;
                f10 = this.f22796n.A() ? motionEvent.getAxisValue(10) : 0.0f;
                r2 = f11;
                i10 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i10 = 26;
                f10 = motionEvent.getAxisValue(26);
                if (this.f22796n.B()) {
                    float f12 = -f10;
                    f10 = 0.0f;
                    r2 = f12;
                } else if (!this.f22796n.A()) {
                    f10 = 0.0f;
                }
                z10 = this.f22783f5;
            } else {
                i10 = 0;
                z10 = false;
                f10 = 0.0f;
            }
            int i11 = (int) (r2 * this.f22786g2);
            int i12 = (int) (f10 * this.f22774b2);
            if (z10) {
                OverScroller overScroller = this.f22810x2.f22849c;
                recyclerView = this;
                recyclerView.F1(i12 + (overScroller.getFinalX() - overScroller.getCurrX()), i11 + (overScroller.getFinalY() - overScroller.getCurrY()), null, Integer.MIN_VALUE, true);
            } else {
                recyclerView = this;
                K0(i12, i11, motionEvent, 1);
            }
            if (i10 != 0 && !z10) {
                recyclerView.f22791i5.g(motionEvent, i10);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f22811y) {
            return false;
        }
        this.f22802r = null;
        if (a0(motionEvent)) {
            t();
            return true;
        }
        q qVar = this.f22796n;
        if (qVar == null) {
            return false;
        }
        boolean A10 = qVar.A();
        boolean B10 = this.f22796n.B();
        if (this.f22762V == null) {
            this.f22762V = VelocityTracker.obtain();
        }
        this.f22762V.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f22814z) {
                this.f22814z = false;
            }
            this.f22758T = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f22785g1 = x10;
            this.f22765W = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f22799p1 = y10;
            this.f22773b1 = y10;
            if (K1(motionEvent) || this.f22755R == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                M1(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            J1(0);
        } else if (actionMasked == 1) {
            this.f22762V.clear();
            M1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f22758T);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f22758T + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f22755R != 1) {
                int i10 = x11 - this.f22765W;
                int i11 = y11 - this.f22773b1;
                if (!A10 || Math.abs(i10) <= this.f22809x1) {
                    z10 = false;
                } else {
                    this.f22785g1 = x11;
                    z10 = true;
                }
                if (B10 && Math.abs(i11) > this.f22809x1) {
                    this.f22799p1 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.f22758T = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f22785g1 = x12;
            this.f22765W = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f22799p1 = y12;
            this.f22773b1 = y12;
        } else if (actionMasked == 6) {
            V0(motionEvent);
        }
        return this.f22755R == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("RV OnLayout");
        H();
        Trace.endSection();
        this.f22806v = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        q qVar = this.f22796n;
        if (qVar == null) {
            C(i10, i11);
            return;
        }
        boolean z10 = false;
        if (qVar.D0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f22796n.m1(this.f22776c, this.f22754Q4, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f22777c5 = z10;
            if (z10 || this.f22795m == null) {
                return;
            }
            if (this.f22754Q4.f22834e == 1) {
                I();
            }
            this.f22796n.O1(i10, i11);
            this.f22754Q4.f22839j = true;
            J();
            this.f22796n.R1(i10, i11);
            if (this.f22796n.U1()) {
                this.f22796n.O1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f22754Q4.f22839j = true;
                J();
                this.f22796n.R1(i10, i11);
            }
            this.f22779d5 = getMeasuredWidth();
            this.f22781e5 = getMeasuredHeight();
            return;
        }
        if (this.f22804t) {
            this.f22796n.m1(this.f22776c, this.f22754Q4, i10, i11);
            return;
        }
        if (this.f22740B) {
            H1();
            S0();
            a1();
            T0();
            B b10 = this.f22754Q4;
            if (b10.f22841l) {
                b10.f22837h = true;
            } else {
                this.f22780e.j();
                this.f22754Q4.f22837h = false;
            }
            this.f22740B = false;
            L1(false);
        } else if (this.f22754Q4.f22841l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f22795m;
        if (hVar != null) {
            this.f22754Q4.f22835f = hVar.getItemCount();
        } else {
            this.f22754Q4.f22835f = 0;
        }
        H1();
        this.f22796n.m1(this.f22776c, this.f22754Q4, i10, i11);
        L1(false);
        this.f22754Q4.f22837h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (F0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f22778d = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f22778d;
        if (savedState2 != null) {
            savedState.b(savedState2);
            return savedState;
        }
        q qVar = this.f22796n;
        if (qVar != null) {
            savedState.f22854c = qVar.q1();
            return savedState;
        }
        savedState.f22854c = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        D0();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f22811y || this.f22814z) {
            return false;
        }
        if (Q(motionEvent)) {
            t();
            return true;
        }
        q qVar = this.f22796n;
        if (qVar == null) {
            return false;
        }
        boolean A10 = qVar.A();
        boolean B10 = this.f22796n.B();
        if (this.f22762V == null) {
            this.f22762V = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.f22758T = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f22785g1 = x10;
            this.f22765W = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f22799p1 = y10;
            this.f22773b1 = y10;
            J1(0);
        } else {
            if (actionMasked == 1) {
                this.f22762V.addMovement(obtain);
                this.f22762V.computeCurrentVelocity(1000, this.f22763V1);
                float f10 = A10 ? -this.f22762V.getXVelocity(this.f22758T) : 0.0f;
                float f11 = B10 ? -this.f22762V.getYVelocity(this.f22758T) : 0.0f;
                if ((f10 == 0.0f && f11 == 0.0f) || !h0((int) f10, (int) f11)) {
                    setScrollState(0);
                }
                s1();
                obtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f22758T);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f22758T + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i10 = this.f22785g1 - x11;
                int i11 = this.f22799p1 - y11;
                if (this.f22755R != 1) {
                    if (A10) {
                        i10 = i10 > 0 ? Math.max(0, i10 - this.f22809x1) : Math.min(0, i10 + this.f22809x1);
                        if (i10 != 0) {
                            z10 = true;
                            if (B10) {
                                i11 = i11 > 0 ? Math.max(0, i11 - this.f22809x1) : Math.min(0, i11 + this.f22809x1);
                                if (i11 != 0) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                setScrollState(1);
                            }
                        }
                    }
                    z10 = false;
                    if (B10) {
                    }
                    if (z10) {
                    }
                }
                if (this.f22755R == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int g12 = i10 - g1(i10, motionEvent.getY());
                    int h12 = i11 - h1(i11, motionEvent.getX());
                    if (L(A10 ? g12 : 0, B10 ? h12 : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        g12 -= iArr4[0];
                        h12 -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i12 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i12 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.f22785g1 = x11 - iArr7[0];
                    this.f22799p1 = y11 - iArr7[1];
                    if (v1(A10 ? g12 : 0, B10 ? h12 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.j jVar = this.f22813y2;
                    if (jVar != null && (g12 != 0 || h12 != 0)) {
                        jVar.f(this, g12, h12);
                    }
                }
            } else if (actionMasked == 3) {
                t();
            } else if (actionMasked == 5) {
                this.f22758T = motionEvent.getPointerId(actionIndex);
                int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f22785g1 = x12;
                this.f22765W = x12;
                int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f22799p1 = y12;
                this.f22773b1 = y12;
            } else if (actionMasked == 6) {
                V0(motionEvent);
            }
        }
        this.f22762V.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public final void p(F f10, F f11, n.c cVar, n.c cVar2, boolean z10, boolean z11) {
        f10.setIsRecyclable(false);
        if (z10) {
            i(f10);
        }
        if (f10 != f11) {
            if (z11) {
                i(f11);
            }
            f10.mShadowedHolder = f11;
            i(f10);
            this.f22776c.O(f10);
            f11.setIsRecyclable(false);
            f11.mShadowingHolder = f10;
        }
        if (this.f22752P.b(f10, f11, cVar, cVar2)) {
            Y0();
        }
    }

    public void p1() {
        F f10;
        int g10 = this.f22782f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            View f11 = this.f22782f.f(i10);
            F o02 = o0(f11);
            if (o02 != null && (f10 = o02.mShadowingHolder) != null) {
                View view = f10.itemView;
                int left = f11.getLeft();
                int top = f11.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void q(F f10, n.c cVar, n.c cVar2) {
        i(f10);
        f10.setIsRecyclable(false);
        if (this.f22752P.c(f10, cVar, cVar2)) {
            Y0();
        }
    }

    public final void q1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f22792j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof r) {
            r rVar = (r) layoutParams;
            if (!rVar.f22901c) {
                Rect rect = rVar.f22900b;
                Rect rect2 = this.f22792j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f22792j);
            offsetRectIntoDescendantCoords(view, this.f22792j);
        }
        this.f22796n.G1(this, view, this.f22792j, !this.f22806v, view2 == null);
    }

    public void r(String str) {
        if (F0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
        }
        if (this.f22746H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + V()));
        }
    }

    public final int r0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    public final void r1() {
        B b10 = this.f22754Q4;
        b10.f22843n = -1L;
        b10.f22842m = -1;
        b10.f22844o = -1;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        F p02 = p0(view);
        if (p02 != null) {
            if (p02.isTmpDetached()) {
                p02.clearTmpDetachFlag();
            } else if (!p02.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + p02 + V());
            }
        } else if (f22731j5) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f22796n.o1(this, this.f22754Q4, view, view2) && view2 != null) {
            q1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f22796n.F1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f22801q.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((u) this.f22801q.get(i10)).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f22807w != 0 || this.f22811y) {
            this.f22808x = true;
        } else {
            super.requestLayout();
        }
    }

    public boolean s(F f10) {
        n nVar = this.f22752P;
        return nVar == null || nVar.g(f10, f10.getUnmodifiedPayloads());
    }

    public final String s0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public final void s1() {
        VelocityTracker velocityTracker = this.f22762V;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        M1(0);
        f1();
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        q qVar = this.f22796n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f22811y) {
            return;
        }
        boolean A10 = qVar.A();
        boolean B10 = this.f22796n.B();
        if (A10 || B10) {
            if (!A10) {
                i10 = 0;
            }
            if (!B10) {
                i11 = 0;
            }
            v1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (B1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.u uVar) {
        this.f22767X4 = uVar;
        AbstractC2082d0.l0(this, uVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        y1(hVar, false, true);
        b1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(l lVar) {
        if (lVar == this.f22768Y4) {
            return;
        }
        this.f22768Y4 = lVar;
        setChildrenDrawingOrderEnabled(lVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f22788h) {
            D0();
        }
        this.f22788h = z10;
        super.setClipToPadding(z10);
        if (this.f22806v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull m mVar) {
        x0.f.g(mVar);
        this.f22747I = mVar;
        D0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f22804t = z10;
    }

    public void setItemAnimator(n nVar) {
        n nVar2 = this.f22752P;
        if (nVar2 != null) {
            nVar2.k();
            this.f22752P.w(null);
        }
        this.f22752P = nVar;
        if (nVar != null) {
            nVar.w(this.f22764V4);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f22776c.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(q qVar) {
        if (qVar == this.f22796n) {
            return;
        }
        N1();
        if (this.f22796n != null) {
            n nVar = this.f22752P;
            if (nVar != null) {
                nVar.k();
            }
            this.f22796n.y1(this.f22776c);
            this.f22796n.z1(this.f22776c);
            this.f22776c.c();
            if (this.f22803s) {
                this.f22796n.Q(this, this.f22776c);
            }
            this.f22796n.S1(null);
            this.f22796n = null;
        } else {
            this.f22776c.c();
        }
        this.f22782f.o();
        this.f22796n = qVar;
        if (qVar != null) {
            if (qVar.f22876b != null) {
                throw new IllegalArgumentException("LayoutManager " + qVar + " is already attached to a RecyclerView:" + qVar.f22876b.V());
            }
            qVar.S1(this);
            if (this.f22803s) {
                this.f22796n.P(this);
            }
        }
        this.f22776c.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().n(z10);
    }

    public void setOnFlingListener(t tVar) {
        this.f22812y1 = tVar;
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
        this.f22756R4 = vVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f22800p2 = z10;
    }

    public void setRecycledViewPool(w wVar) {
        this.f22776c.J(wVar);
    }

    @Deprecated
    public void setRecyclerListener(y yVar) {
    }

    public void setScrollState(int i10) {
        if (i10 == this.f22755R) {
            return;
        }
        if (f22732k5) {
            new Exception();
        }
        this.f22755R = i10;
        if (i10 != 2) {
            O1();
        }
        N(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f22809x1 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f22809x1 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(D d10) {
        this.f22776c.K(d10);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().p(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f22811y) {
            r("Do not suppressLayout in layout or scroll");
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f22811y = true;
                this.f22814z = true;
                N1();
                return;
            }
            this.f22811y = false;
            if (this.f22808x && this.f22796n != null && this.f22795m != null) {
                requestLayout();
            }
            this.f22808x = false;
        }
    }

    public final void t() {
        s1();
        setScrollState(0);
    }

    public Rect t0(View view) {
        r rVar = (r) view.getLayoutParams();
        if (!rVar.f22901c) {
            return rVar.f22900b;
        }
        if (this.f22754Q4.e() && (rVar.b() || rVar.d())) {
            return rVar.f22900b;
        }
        Rect rect = rVar.f22900b;
        rect.set(0, 0, 0, 0);
        int size = this.f22798p.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f22792j.set(0, 0, 0, 0);
            ((p) this.f22798p.get(i10)).getItemOffsets(this.f22792j, view, this, this.f22754Q4);
            int i11 = rect.left;
            Rect rect2 = this.f22792j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        rVar.f22901c = false;
        return rect;
    }

    public final void t1() {
        View focusedChild = (this.f22800p2 && hasFocus() && this.f22795m != null) ? getFocusedChild() : null;
        F Z10 = focusedChild != null ? Z(focusedChild) : null;
        if (Z10 == null) {
            r1();
            return;
        }
        this.f22754Q4.f22843n = this.f22795m.hasStableIds() ? Z10.getItemId() : -1L;
        this.f22754Q4.f22842m = this.f22743E ? -1 : Z10.isRemoved() ? Z10.mOldPosition : Z10.getAbsoluteAdapterPosition();
        this.f22754Q4.f22844o = r0(Z10.itemView);
    }

    public p u0(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return (p) this.f22798p.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void u1() {
        int j10 = this.f22782f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            F p02 = p0(this.f22782f.i(i10));
            if (f22731j5 && p02.mPosition == -1 && !p02.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
            if (!p02.shouldIgnore()) {
                p02.saveOldPosition();
            }
        }
    }

    public void v() {
        int j10 = this.f22782f.j();
        for (int i10 = 0; i10 < j10; i10++) {
            F p02 = p0(this.f22782f.i(i10));
            if (!p02.shouldIgnore()) {
                p02.clearOldPosition();
            }
        }
        this.f22776c.d();
    }

    public boolean v1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        A();
        if (this.f22795m != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            w1(i10, i11, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f22798p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i13, i14, i15, i16, this.mScrollOffset, i12, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.f22785g1;
        int[] iArr5 = this.mScrollOffset;
        int i24 = iArr5[0];
        this.f22785g1 = i23 - i24;
        int i25 = this.f22799p1;
        int i26 = iArr5[1];
        this.f22799p1 = i25 - i26;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.D.a(motionEvent, 8194)) {
                c1(motionEvent.getX(), i20, motionEvent.getY(), i22);
                if (Build.VERSION.SDK_INT >= 31 && androidx.core.view.D.a(motionEvent, 4194304)) {
                    f1();
                }
            }
            w(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            O(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    public void w(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f22748J;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.f22748J.onRelease();
            z10 = this.f22748J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f22750L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f22750L.onRelease();
            z10 |= this.f22750L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f22749K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f22749K.onRelease();
            z10 |= this.f22749K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f22751O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f22751O.onRelease();
            z10 |= this.f22751O.isFinished();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    public final void w0(long j10, F f10, F f11) {
        int g10 = this.f22782f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            F p02 = p0(this.f22782f.f(i10));
            if (p02 != f10 && l0(p02) == j10) {
                h hVar = this.f22795m;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + p02 + " \n View Holder 2:" + f10 + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + p02 + " \n View Holder 2:" + f10 + V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f11 + " cannot be found but it is necessary for " + f10 + V());
    }

    public void w1(int i10, int i11, int[] iArr) {
        H1();
        S0();
        Trace.beginSection("RV Scroll");
        W(this.f22754Q4);
        int K12 = i10 != 0 ? this.f22796n.K1(i10, this.f22776c, this.f22754Q4) : 0;
        int M12 = i11 != 0 ? this.f22796n.M1(i11, this.f22776c, this.f22754Q4) : 0;
        Trace.endSection();
        p1();
        T0();
        L1(false);
        if (iArr != null) {
            iArr[0] = K12;
            iArr[1] = M12;
        }
    }

    public int x(int i10) {
        return y(i10, this.f22748J, this.f22750L, getWidth());
    }

    public boolean x0() {
        return !this.f22806v || this.f22743E || this.f22780e.p();
    }

    public void x1(int i10) {
        if (this.f22811y) {
            return;
        }
        N1();
        q qVar = this.f22796n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.L1(i10);
            awakenScrollBars();
        }
    }

    public final int y(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && C0.f.b(edgeEffect) != 0.0f) {
            int round = Math.round(((-i11) / 4.0f) * C0.f.d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        }
        if (i10 >= 0 || edgeEffect2 == null || C0.f.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int round2 = Math.round((f10 / 4.0f) * C0.f.d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (round2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - round2;
    }

    public final boolean y0() {
        int g10 = this.f22782f.g();
        for (int i10 = 0; i10 < g10; i10++) {
            F p02 = p0(this.f22782f.f(i10));
            if (p02 != null && !p02.shouldIgnore() && p02.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    public final void y1(h hVar, boolean z10, boolean z11) {
        h hVar2 = this.f22795m;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f22772b);
            this.f22795m.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            i1();
        }
        this.f22780e.y();
        h hVar3 = this.f22795m;
        this.f22795m = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f22772b);
            hVar.onAttachedToRecyclerView(this);
        }
        q qVar = this.f22796n;
        if (qVar != null) {
            qVar.R0(hVar3, this.f22795m);
        }
        this.f22776c.y(hVar3, this.f22795m, z10);
        this.f22754Q4.f22836g = true;
    }

    public int z(int i10) {
        return y(i10, this.f22749K, this.f22751O, getHeight());
    }

    public void z0() {
        this.f22780e = new a(new g());
    }

    public boolean z1(F f10, int i10) {
        if (!F0()) {
            f10.itemView.setImportantForAccessibility(i10);
            return true;
        }
        f10.mPendingAccessibilityState = i10;
        this.f22771a5.add(f10);
        return false;
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6847a.f68249a);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f22854c;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22854c = parcel.readParcelable(classLoader == null ? q.class.getClassLoader() : classLoader);
        }

        public void b(SavedState savedState) {
            this.f22854c = savedState.f22854c;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f22854c, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22772b = new z();
        this.f22776c = new x();
        this.f22784g = new androidx.recyclerview.widget.z();
        this.f22790i = new RunnableC2257a();
        this.f22792j = new Rect();
        this.f22793k = new Rect();
        this.f22794l = new RectF();
        this.f22797o = new ArrayList();
        this.f22798p = new ArrayList();
        this.f22801q = new ArrayList();
        this.f22807w = 0;
        this.f22743E = false;
        this.f22744F = false;
        this.f22745G = 0;
        this.f22746H = 0;
        this.f22747I = f22738q5;
        this.f22752P = new androidx.recyclerview.widget.g();
        this.f22755R = 0;
        this.f22758T = -1;
        this.f22774b2 = Float.MIN_VALUE;
        this.f22786g2 = Float.MIN_VALUE;
        this.f22800p2 = true;
        this.f22810x2 = new E();
        this.f22753P4 = f22736o5 ? new j.b() : null;
        this.f22754Q4 = new B();
        this.f22760T4 = false;
        this.f22761U4 = false;
        this.f22764V4 = new o();
        this.f22766W4 = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.f22771a5 = new ArrayList();
        this.f22775b5 = new RunnableC2258b();
        this.f22779d5 = 0;
        this.f22781e5 = 0;
        this.f22787g5 = new C2260d();
        C2261e c2261e = new C2261e();
        this.f22789h5 = c2261e;
        this.f22791i5 = new C2103o(getContext(), c2261e);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f22809x1 = viewConfiguration.getScaledTouchSlop();
        this.f22774b2 = AbstractC2088g0.f(viewConfiguration, context);
        this.f22786g2 = AbstractC2088g0.j(viewConfiguration, context);
        this.f22759T1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f22763V1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f22770a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f22752P.w(this.f22764V4);
        z0();
        B0();
        A0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f22741C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.u(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6850d.RecyclerView, i10, 0);
        AbstractC2082d0.j0(this, context, AbstractC6850d.RecyclerView, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(AbstractC6850d.f68265i);
        if (obtainStyledAttributes.getInt(AbstractC6850d.f68259c, -1) == -1) {
            setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        }
        this.f22788h = obtainStyledAttributes.getBoolean(AbstractC6850d.f68258b, true);
        boolean z10 = obtainStyledAttributes.getBoolean(AbstractC6850d.f68260d, false);
        this.f22805u = z10;
        if (z10) {
            C0((StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC6850d.f68263g), obtainStyledAttributes.getDrawable(AbstractC6850d.f68264h), (StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC6850d.f68261e), obtainStyledAttributes.getDrawable(AbstractC6850d.f68262f));
        }
        obtainStyledAttributes.recycle();
        this.f22783f5 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        B(context, string, attributeSet, i10, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        AbstractC2082d0.j0(this, context, iArr, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        G0.a.d(this, true);
    }

    public static class r extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public F f22899a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f22900b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22901c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22902d;

        public r(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22900b = new Rect();
            this.f22901c = true;
            this.f22902d = false;
        }

        public int a() {
            return this.f22899a.getLayoutPosition();
        }

        public boolean b() {
            return this.f22899a.isUpdated();
        }

        public boolean c() {
            return this.f22899a.isRemoved();
        }

        public boolean d() {
            return this.f22899a.isInvalid();
        }

        public r(int i10, int i11) {
            super(i10, i11);
            this.f22900b = new Rect();
            this.f22901c = true;
            this.f22902d = false;
        }

        public r(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f22900b = new Rect();
            this.f22901c = true;
            this.f22902d = false;
        }

        public r(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22900b = new Rect();
            this.f22901c = true;
            this.f22902d = false;
        }

        public r(r rVar) {
            super((ViewGroup.LayoutParams) rVar);
            this.f22900b = new Rect();
            this.f22901c = true;
            this.f22902d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        q qVar = this.f22796n;
        if (qVar != null) {
            return qVar.V(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }
}
