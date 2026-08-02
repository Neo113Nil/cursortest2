package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2112t;
import androidx.core.view.F0;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.I;
import androidx.core.view.J;
import androidx.customview.view.AbsSavedState;
import j0.AbstractC5087a;
import j0.AbstractC5088b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l0.AbstractC5338c;
import n0.AbstractC5597a;
import x0.AbstractC6773b;
import x0.C6776e;
import x0.InterfaceC6775d;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements G, H {
    static final Class<?>[] CONSTRUCTOR_PARAMS;

    /* renamed from: q, reason: collision with root package name */
    public static final String f18757q;

    /* renamed from: r, reason: collision with root package name */
    public static final ThreadLocal f18758r;

    /* renamed from: s, reason: collision with root package name */
    public static final Comparator f18759s;

    /* renamed from: t, reason: collision with root package name */
    public static final InterfaceC6775d f18760t;

    /* renamed from: a, reason: collision with root package name */
    public final List f18761a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.coordinatorlayout.widget.a f18762b;

    /* renamed from: c, reason: collision with root package name */
    public final List f18763c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f18764d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18765e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18766f;

    /* renamed from: g, reason: collision with root package name */
    public View f18767g;

    /* renamed from: h, reason: collision with root package name */
    public View f18768h;

    /* renamed from: i, reason: collision with root package name */
    public g f18769i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18770j;

    /* renamed from: k, reason: collision with root package name */
    public F0 f18771k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18772l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f18773m;
    private final int[] mBehaviorConsumed;
    private int[] mKeylines;
    private final int[] mNestedScrollingV2ConsumedCompat;

    /* renamed from: n, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f18774n;

    /* renamed from: o, reason: collision with root package name */
    public J f18775o;

    /* renamed from: p, reason: collision with root package name */
    public final I f18776p;

    public class a implements J {
        public a() {
        }

        @Override // androidx.core.view.J
        public F0 f(View view, F0 f02) {
            return CoordinatorLayout.this.T(f02);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return D(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void F(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void G(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                F(coordinatorLayout, view, view2);
            }
        }

        public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view) {
            return h(coordinatorLayout, view) > 0.0f;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int g(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float h(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public F0 j(CoordinatorLayout coordinatorLayout, View view, F0 f02) {
            return f02;
        }

        public void k(f fVar) {
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void n() {
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                t(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        public void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                v(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            w(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                y(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f18774n;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.D(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f18774n;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.D(0);
            return true;
        }
    }

    public static class h implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float M10 = AbstractC2082d0.M(view);
            float M11 = AbstractC2082d0.M(view2);
            if (M10 > M11) {
                return -1;
            }
            return M10 < M11 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f18757q = r02 != null ? r02.getName() : null;
        f18759s = new h();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        f18758r = new ThreadLocal();
        f18760t = new C6776e(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public static c G(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f18757q;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f18758r;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    public static void L(Rect rect) {
        rect.setEmpty();
        f18760t.release(rect);
    }

    public static int O(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int P(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    public static int Q(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    public static Rect a() {
        Rect rect = (Rect) f18760t.acquire();
        return rect == null ? new Rect() : rect;
    }

    private static int d(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public final MotionEvent A(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    public final void B(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (AbstractC2082d0.R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            Rect a10 = a();
            Rect a11 = a();
            a11.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f10 == null || !f10.f(this, view, a10)) {
                a10.set(a11);
            } else if (!a11.contains(a10)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a10.toShortString() + " | Bounds:" + a11.toShortString());
            }
            L(a11);
            if (a10.isEmpty()) {
                L(a10);
                return;
            }
            int b10 = AbstractC2112t.b(fVar.f18787h, i10);
            boolean z12 = true;
            if ((b10 & 48) != 48 || (i15 = (a10.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f18789j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                S(view, i16 - i15);
                z10 = true;
            }
            if ((b10 & 80) == 80 && (height = ((getHeight() - a10.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f18789j) < (i14 = rect.bottom)) {
                S(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                S(view, 0);
            }
            if ((b10 & 3) != 3 || (i12 = (a10.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f18788i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                R(view, i13 - i12);
                z11 = true;
            }
            if ((b10 & 5) != 5 || (width = ((getWidth() - a10.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f18788i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                R(view, width - i11);
            }
            if (!z12) {
                R(view, 0);
            }
            L(a10);
        }
    }

    public void C(View view, int i10) {
        c f10;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f18790k != null) {
            Rect a10 = a();
            Rect a11 = a();
            Rect a12 = a();
            o(fVar.f18790k, a10);
            l(view, false, a11);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            q(i10, a10, a12, fVar, measuredWidth, measuredHeight);
            boolean z10 = (a12.left == a11.left && a12.top == a11.top) ? false : true;
            e(fVar, a12, measuredWidth, measuredHeight);
            int i11 = a12.left - a11.left;
            int i12 = a12.top - a11.top;
            if (i11 != 0) {
                AbstractC2082d0.V(view, i11);
            }
            if (i12 != 0) {
                AbstractC2082d0.W(view, i12);
            }
            if (z10 && (f10 = fVar.f()) != null) {
                f10.l(this, view, fVar.f18790k);
            }
            L(a10);
            L(a11);
            L(a12);
        }
    }

    public final void D(int i10) {
        boolean z10;
        int z11 = AbstractC2082d0.z(this);
        int size = this.f18761a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f18761a.get(i11);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (fVar.f18791l == ((View) this.f18761a.get(i12))) {
                        C(view, z11);
                    }
                }
                l(view, true, a11);
                if (fVar.f18786g != 0 && !a11.isEmpty()) {
                    int b10 = AbstractC2112t.b(fVar.f18786g, z11);
                    int i13 = b10 & 112;
                    if (i13 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i13 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i14 = b10 & 7;
                    if (i14 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i14 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar.f18787h != 0 && view.getVisibility() == 0) {
                    B(view, a10, z11);
                }
                if (i10 != 2) {
                    s(view, a12);
                    if (!a12.equals(a11)) {
                        K(view, a11);
                    }
                }
                for (int i15 = i11 + 1; i15 < size; i15++) {
                    View view2 = (View) this.f18761a.get(i15);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f10 = fVar2.f();
                    if (f10 != null && f10.i(this, view2, view)) {
                        if (i10 == 0 && fVar2.g()) {
                            fVar2.k();
                        } else {
                            if (i10 != 2) {
                                z10 = f10.l(this, view2, view);
                            } else {
                                f10.m(this, view2, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                fVar2.p(z10);
                            }
                        }
                    }
                }
            }
        }
        L(a10);
        L(a11);
        L(a12);
    }

    public void E(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f18790k;
        if (view2 != null) {
            y(view, view2, i10);
            return;
        }
        int i11 = fVar.f18784e;
        if (i11 >= 0) {
            z(view, i11, i10);
        } else {
            x(view, i10);
        }
    }

    public void F(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    public final boolean H(c cVar, View view, MotionEvent motionEvent, int i10) {
        if (i10 == 0) {
            return cVar.o(this, view, motionEvent);
        }
        if (i10 == 1) {
            return cVar.H(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    public final boolean I(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f18763c;
        u(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            if (!(z10 || z11) || actionMasked == 0) {
                if (!z11 && !z10 && f10 != null && (z10 = H(f10, view, motionEvent, i10))) {
                    this.f18767g = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i12 = 0; i12 < i11; i12++) {
                            View view2 = (View) list.get(i12);
                            c f11 = ((f) view2.getLayoutParams()).f();
                            if (f11 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = A(motionEvent);
                                }
                                H(f11, view2, motionEvent2, i10);
                            }
                        }
                    }
                }
                boolean c10 = fVar.c();
                boolean i13 = fVar.i(this, view);
                z11 = i13 && !c10;
                if (i13 && !z11) {
                    break;
                }
            } else if (f10 != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = A(motionEvent);
                }
                H(f10, view, motionEvent2, i10);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z10;
    }

    public final void J() {
        this.f18761a.clear();
        this.f18762b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f t10 = t(childAt);
            t10.d(this, childAt);
            this.f18762b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (t10.b(this, childAt, childAt2)) {
                        if (!this.f18762b.d(childAt2)) {
                            this.f18762b.b(childAt2);
                        }
                        this.f18762b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f18761a.addAll(this.f18762b.j());
        Collections.reverse(this.f18761a);
    }

    public void K(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    public void M() {
        if (this.f18766f && this.f18769i != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f18769i);
        }
        this.f18770j = false;
    }

    public final void N() {
        View view = this.f18767g;
        if (view != null) {
            c f10 = ((f) view.getLayoutParams()).f();
            if (f10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                f10.H(this, this.f18767g, obtain);
                obtain.recycle();
            }
            this.f18767g = null;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).m();
        }
        this.f18765e = false;
    }

    public final void R(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f18788i;
        if (i11 != i10) {
            AbstractC2082d0.V(view, i10 - i11);
            fVar.f18788i = i10;
        }
    }

    public final void S(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f18789j;
        if (i11 != i10) {
            AbstractC2082d0.W(view, i10 - i11);
            fVar.f18789j = i10;
        }
    }

    public final F0 T(F0 f02) {
        if (AbstractC6773b.a(this.f18771k, f02)) {
            return f02;
        }
        this.f18771k = f02;
        boolean z10 = false;
        boolean z11 = f02 != null && f02.m() > 0;
        this.f18772l = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        F0 f10 = f(f02);
        requestLayout();
        return f10;
    }

    public final void U() {
        if (!AbstractC2082d0.w(this)) {
            AbstractC2082d0.x0(this, null);
            return;
        }
        if (this.f18775o == null) {
            this.f18775o = new a();
        }
        AbstractC2082d0.x0(this, this.f18775o);
        setSystemUiVisibility(1280);
    }

    public void b() {
        if (this.f18766f) {
            if (this.f18769i == null) {
                this.f18769i = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f18769i);
        }
        this.f18770j = true;
    }

    public final void c() {
        int childCount = getChildCount();
        MotionEvent motionEvent = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (f10 != null) {
                if (motionEvent == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                f10.o(this, childAt, motionEvent);
            }
        }
        if (motionEvent != null) {
            motionEvent.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f18780a;
        if (cVar != null) {
            float h10 = cVar.h(this, view);
            if (h10 > 0.0f) {
                if (this.f18764d == null) {
                    this.f18764d = new Paint();
                }
                this.f18764d.setColor(fVar.f18780a.g(this, view));
                this.f18764d.setAlpha(d(Math.round(h10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f18764d);
                canvas.restoreToCount(save);
                return super.drawChild(canvas, view, j10);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f18773m;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final F0 f(F0 f02) {
        c f10;
        if (f02.p()) {
            return f02;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (AbstractC2082d0.w(childAt) && (f10 = ((f) childAt.getLayoutParams()).f()) != null) {
                f02 = f10.j(this, childAt, f02);
                if (f02.p()) {
                    return f02;
                }
            }
        }
        return f02;
    }

    public void g(View view) {
        ArrayList h10 = this.f18762b.h(view);
        if (h10 == null || h10.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < h10.size(); i10++) {
            View view2 = (View) h10.get(i10);
            c f10 = ((f) view2.getLayoutParams()).f();
            if (f10 != null) {
                f10.l(this, view2, view);
            }
        }
    }

    public final List<View> getDependencySortedChildren() {
        J();
        return Collections.unmodifiableList(this.f18761a);
    }

    public final F0 getLastWindowInsets() {
        return this.f18771k;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f18776p.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f18773m;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void h() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (v(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f18770j) {
            if (z10) {
                b();
            } else {
                M();
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public void l(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            o(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List m(View view) {
        List i10 = this.f18762b.i(view);
        return i10 == null ? Collections.EMPTY_LIST : i10;
    }

    public List n(View view) {
        List g10 = this.f18762b.g(view);
        return g10 == null ? Collections.EMPTY_LIST : g10;
    }

    public void o(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        N();
        if (this.f18770j) {
            if (this.f18769i == null) {
                this.f18769i = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f18769i);
        }
        if (this.f18771k == null && AbstractC2082d0.w(this)) {
            AbstractC2082d0.i0(this);
        }
        this.f18766f = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        N();
        if (this.f18770j && this.f18769i != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f18769i);
        }
        View view = this.f18768h;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f18766f = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f18772l || this.f18773m == null) {
            return;
        }
        F0 f02 = this.f18771k;
        int m10 = f02 != null ? f02.m() : 0;
        if (m10 > 0) {
            this.f18773m.setBounds(0, 0, getWidth(), m10);
            this.f18773m.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            N();
        }
        boolean I10 = I(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return I10;
        }
        this.f18767g = null;
        N();
        return I10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c f10;
        int z11 = AbstractC2082d0.z(this);
        int size = this.f18761a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f18761a.get(i14);
            if (view.getVisibility() != 8 && ((f10 = ((f) view.getLayoutParams()).f()) == null || !f10.p(this, view, z11))) {
                E(view, z11);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        c f10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        View view;
        int i26;
        int i27;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.J();
        coordinatorLayout.h();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int z10 = AbstractC2082d0.z(coordinatorLayout);
        boolean z11 = z10 == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i28 = paddingLeft + paddingRight;
        int i29 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z12 = coordinatorLayout.f18771k != null && AbstractC2082d0.w(coordinatorLayout);
        int size3 = coordinatorLayout.f18761a.size();
        int i30 = 0;
        int i31 = 0;
        while (i30 < size3) {
            View view2 = (View) coordinatorLayout.f18761a.get(i30);
            int i32 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i20 = size3;
                i15 = i30;
                i22 = paddingLeft;
                i18 = z10;
                suggestedMinimumWidth = i32;
                i26 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i33 = fVar.f18784e;
                if (i33 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int r10 = coordinatorLayout.r(i33);
                    int b10 = AbstractC2112t.b(Q(fVar.f18782c), z10) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((b10 == 3 && !z11) || (b10 == 5 && z11)) {
                        max = Math.max(0, (size - paddingRight) - r10);
                    } else if ((b10 == 5 && !z11) || (b10 == 3 && z11)) {
                        max = Math.max(0, r10 - paddingLeft);
                    }
                    int i34 = i30;
                    i14 = max;
                    i13 = i34;
                    if (z12 || AbstractC2082d0.w(view2)) {
                        i15 = i13;
                        i16 = i10;
                        i17 = i11;
                    } else {
                        i15 = i13;
                        int k10 = coordinatorLayout.f18771k.k() + coordinatorLayout.f18771k.l();
                        int m10 = coordinatorLayout.f18771k.m() + coordinatorLayout.f18771k.j();
                        i16 = View.MeasureSpec.makeMeasureSpec(size - k10, mode);
                        i17 = View.MeasureSpec.makeMeasureSpec(size2 - m10, mode2);
                    }
                    f10 = fVar.f();
                    if (f10 == null) {
                        i20 = size3;
                        int i35 = i16;
                        view = view2;
                        int i36 = i12;
                        i18 = z10;
                        i19 = i36;
                        i22 = paddingLeft;
                        i23 = i32;
                        i26 = paddingRight;
                        i27 = i31;
                        int i37 = i17;
                        boolean q10 = f10.q(this, view, i35, i14, i37, 0);
                        i25 = i35;
                        i21 = i14;
                        i24 = i37;
                        if (q10) {
                            coordinatorLayout = this;
                            suggestedMinimumWidth = Math.max(i23, i28 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int max2 = Math.max(i19, i29 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            i31 = View.combineMeasuredStates(i27, view.getMeasuredState());
                            suggestedMinimumHeight = max2;
                        }
                    } else {
                        int i38 = i12;
                        i18 = z10;
                        i19 = i38;
                        i20 = size3;
                        i21 = i14;
                        i22 = paddingLeft;
                        i23 = i32;
                        i24 = i17;
                        i25 = i16;
                        view = view2;
                        i26 = paddingRight;
                        i27 = i31;
                    }
                    View view3 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.F(view3, i25, i21, i24, 0);
                    view = view3;
                    suggestedMinimumWidth = Math.max(i23, i28 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int max22 = Math.max(i19, i29 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i31 = View.combineMeasuredStates(i27, view.getMeasuredState());
                    suggestedMinimumHeight = max22;
                }
                i13 = i30;
                i14 = 0;
                if (z12) {
                }
                i15 = i13;
                i16 = i10;
                i17 = i11;
                f10 = fVar.f();
                if (f10 == null) {
                }
                View view32 = view;
                coordinatorLayout = this;
                coordinatorLayout.F(view32, i25, i21, i24, 0);
                view = view32;
                suggestedMinimumWidth = Math.max(i23, i28 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max222 = Math.max(i19, i29 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i31 = View.combineMeasuredStates(i27, view.getMeasuredState());
                suggestedMinimumHeight = max222;
            }
            i30 = i15 + 1;
            paddingLeft = i22;
            paddingRight = i26;
            z10 = i18;
            size3 = i20;
        }
        int i39 = i31;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i39), View.resolveSizeAndState(suggestedMinimumHeight, i11, i39 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c f12;
        View view2;
        float f13;
        float f14;
        boolean z11;
        int childCount = getChildCount();
        int i10 = 0;
        boolean z12 = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    view2 = view;
                    f13 = f10;
                    f14 = f11;
                    z11 = z10;
                    z12 |= f12.r(this, childAt, view2, f13, f14, z11);
                    i10++;
                    view = view2;
                    f10 = f13;
                    f11 = f14;
                    z10 = z11;
                }
            }
            view2 = view;
            f13 = f10;
            f14 = f11;
            z11 = z10;
            i10++;
            view = view2;
            f10 = f13;
            f11 = f14;
            z10 = z11;
        }
        if (z12) {
            D(1);
        }
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c f12;
        View view2;
        float f13;
        float f14;
        int childCount = getChildCount();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    view2 = view;
                    f13 = f10;
                    f14 = f11;
                    z10 |= f12.s(this, childAt, view2, f13, f14);
                    i10++;
                    view = view2;
                    f10 = f13;
                    f11 = f14;
                }
            }
            view2 = view;
            f13 = f10;
            f14 = f11;
            i10++;
            view = view2;
            f10 = f13;
            f11 = f14;
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray sparseArray = savedState.f18777c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = t(childAt).f();
            if (id2 != -1 && f10 != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                f10.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable C10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && f10 != null && (C10 = f10.C(this, childAt)) != null) {
                sparseArray.append(id2, C10);
            }
        }
        savedState.f18777c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean I10;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f18767g;
        boolean z10 = false;
        if (view != null) {
            c f10 = ((f) view.getLayoutParams()).f();
            I10 = f10 != null ? f10.H(this, this.f18767g, motionEvent) : false;
        } else {
            I10 = I(motionEvent, 1);
            if (actionMasked != 0 && I10) {
                z10 = true;
            }
        }
        if (this.f18767g == null || actionMasked == 3) {
            I10 |= super.onTouchEvent(motionEvent);
        } else if (z10) {
            MotionEvent A10 = A(motionEvent);
            super.onTouchEvent(A10);
            A10.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return I10;
        }
        this.f18767g = null;
        N();
        return I10;
    }

    public void p(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        q(i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        e(fVar, rect2, measuredWidth, measuredHeight);
    }

    public final void q(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int b10 = AbstractC2112t.b(O(fVar.f18782c), i10);
        int b11 = AbstractC2112t.b(P(fVar.f18783d), i10);
        int i13 = b10 & 7;
        int i14 = b10 & 112;
        int i15 = b11 & 7;
        int i16 = b11 & 112;
        int width = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            width -= i11 / 2;
        } else if (i13 != 5) {
            width -= i11;
        }
        if (i14 == 16) {
            height -= i12 / 2;
        } else if (i14 != 80) {
            height -= i12;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    public final int r(int i10) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c f10 = ((f) view.getLayoutParams()).f();
        if (f10 == null || !f10.A(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f18765e) {
            return;
        }
        if (this.f18767g == null) {
            c();
        }
        N();
        this.f18765e = true;
    }

    public void s(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        U();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f18774n = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f18773m;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f18773m = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f18773m.setState(getDrawableState());
                }
                AbstractC5597a.m(this.f18773m, AbstractC2082d0.z(this));
                this.f18773m.setVisible(getVisibility() == 0, false);
                this.f18773m.setCallback(this);
            }
            AbstractC2082d0.c0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? AbstractC5338c.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f18773m;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f18773m.setVisible(z10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f t(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f18781b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f18781b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (d) cls.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.o((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            fVar.f18781b = true;
        }
        return fVar;
    }

    public final void u(List list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = f18759s;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean v(View view) {
        return this.f18762b.k(view);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f18773m;
    }

    public boolean w(View view, int i10, int i11) {
        Rect a10 = a();
        o(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            L(a10);
        }
    }

    public final void x(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect a10 = a();
        a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f18771k != null && AbstractC2082d0.w(this) && !AbstractC2082d0.w(view)) {
            a10.left += this.f18771k.k();
            a10.top += this.f18771k.m();
            a10.right -= this.f18771k.l();
            a10.bottom -= this.f18771k.j();
        }
        Rect a11 = a();
        AbstractC2112t.a(P(fVar.f18782c), view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
        L(a10);
        L(a11);
    }

    public final void y(View view, View view2, int i10) {
        Rect a10 = a();
        Rect a11 = a();
        try {
            o(view2, a10);
            p(view, i10, a10, a11);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
        } finally {
            L(a10);
            L(a11);
        }
    }

    public final void z(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int b10 = AbstractC2112t.b(Q(fVar.f18782c), i11);
        int i12 = b10 & 7;
        int i13 = b10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int r10 = r(i10) - measuredWidth;
        if (i12 == 1) {
            r10 += measuredWidth / 2;
        } else if (i12 == 5) {
            r10 += measuredWidth;
        }
        int i14 = i13 != 16 ? i13 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(r10, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5087a.f53624a);
    }

    @Override // androidx.core.view.G
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        c f10;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.u(this, childAt, view, i10, i11, iArr2, i12);
                    i13 = i10 > 0 ? Math.max(i13, this.mBehaviorConsumed[0]) : Math.min(i13, this.mBehaviorConsumed[0]);
                    i14 = i11 > 0 ? Math.max(i14, this.mBehaviorConsumed[1]) : Math.min(i14, this.mBehaviorConsumed[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            D(1);
        }
    }

    @Override // androidx.core.view.G
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i10, i11, i12, i13, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.G
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        c f10;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f18776p.c(view, view2, i10, i11);
        this.f18768h = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (f10 = fVar.f()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                f10.z(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // androidx.core.view.G
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f10 = fVar.f();
                if (f10 != null) {
                    boolean E10 = f10.E(this, childAt, view, view2, i10, i11);
                    z10 |= E10;
                    fVar.r(i11, E10);
                } else {
                    fVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // androidx.core.view.G
    public void onStopNestedScroll(View view, int i10) {
        this.f18776p.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c f10 = fVar.f();
                if (f10 != null) {
                    f10.G(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f18768h = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        this.f18761a = new ArrayList();
        this.f18762b = new androidx.coordinatorlayout.widget.a();
        this.f18763c = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.f18776p = new I(this);
        if (i10 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.c.CoordinatorLayout, 0, AbstractC5088b.f53625a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.c.CoordinatorLayout, i10, 0);
        }
        TypedArray typedArray = obtainStyledAttributes;
        if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            AbstractC2082d0.j0(coordinatorLayout, context2, j0.c.CoordinatorLayout, attributeSet, typedArray, 0, AbstractC5088b.f53625a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            AbstractC2082d0.j0(coordinatorLayout, context2, j0.c.CoordinatorLayout, attributeSet, typedArray, i10, 0);
        }
        int resourceId = typedArray.getResourceId(j0.c.f53626a, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.mKeylines.length;
            for (int i11 = 0; i11 < length; i11++) {
                coordinatorLayout.mKeylines[i11] = (int) (r12[i11] * f10);
            }
        }
        coordinatorLayout.f18773m = typedArray.getDrawable(j0.c.f53627b);
        typedArray.recycle();
        U();
        super.setOnHierarchyChangeListener(new e());
        if (AbstractC2082d0.x(this) == 0) {
            AbstractC2082d0.t0(this, 1);
        }
    }

    @Override // androidx.core.view.H
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c f10;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.x(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    if (i12 > 0) {
                        min = Math.max(i15, this.mBehaviorConsumed[0]);
                    } else {
                        min = Math.min(i15, this.mBehaviorConsumed[0]);
                    }
                    i15 = min;
                    if (i13 > 0) {
                        min2 = Math.max(i16, this.mBehaviorConsumed[1]);
                    } else {
                        min2 = Math.min(i16, this.mBehaviorConsumed[1]);
                    }
                    i16 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            D(1);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public SparseArray f18777c;

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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f18777c = new SparseArray(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f18777c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f18777c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f18777c.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f18777c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public c f18780a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f18781b;

        /* renamed from: c, reason: collision with root package name */
        public int f18782c;

        /* renamed from: d, reason: collision with root package name */
        public int f18783d;

        /* renamed from: e, reason: collision with root package name */
        public int f18784e;

        /* renamed from: f, reason: collision with root package name */
        public int f18785f;

        /* renamed from: g, reason: collision with root package name */
        public int f18786g;

        /* renamed from: h, reason: collision with root package name */
        public int f18787h;

        /* renamed from: i, reason: collision with root package name */
        public int f18788i;

        /* renamed from: j, reason: collision with root package name */
        public int f18789j;

        /* renamed from: k, reason: collision with root package name */
        public View f18790k;

        /* renamed from: l, reason: collision with root package name */
        public View f18791l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f18792m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f18793n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f18794o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f18795p;

        /* renamed from: q, reason: collision with root package name */
        public final Rect f18796q;

        /* renamed from: r, reason: collision with root package name */
        public Object f18797r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f18781b = false;
            this.f18782c = 0;
            this.f18783d = 0;
            this.f18784e = -1;
            this.f18785f = -1;
            this.f18786g = 0;
            this.f18787h = 0;
            this.f18796q = new Rect();
        }

        public boolean a() {
            return this.f18790k == null && this.f18785f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f18791l || s(view2, AbstractC2082d0.z(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f18780a;
            return cVar != null && cVar.i(coordinatorLayout, view, view2);
        }

        public boolean c() {
            if (this.f18780a == null) {
                this.f18792m = false;
            }
            return this.f18792m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f18785f == -1) {
                this.f18791l = null;
                this.f18790k = null;
                return null;
            }
            if (this.f18790k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f18790k;
        }

        public int e() {
            return this.f18785f;
        }

        public c f() {
            return this.f18780a;
        }

        public boolean g() {
            return this.f18795p;
        }

        public Rect h() {
            return this.f18796q;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f18792m;
            if (z10) {
                return true;
            }
            c cVar = this.f18780a;
            boolean e10 = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z10;
            this.f18792m = e10;
            return e10;
        }

        public boolean j(int i10) {
            if (i10 == 0) {
                return this.f18793n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f18794o;
        }

        public void k() {
            this.f18795p = false;
        }

        public void l(int i10) {
            r(i10, false);
        }

        public void m() {
            this.f18792m = false;
        }

        public final void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f18785f);
            this.f18790k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f18791l = null;
                    this.f18790k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f18785f) + " to anchor view " + view);
            }
            if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f18791l = null;
                this.f18790k = null;
                return;
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f18791l = null;
                    this.f18790k = null;
                    return;
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.f18791l = findViewById;
        }

        public void o(c cVar) {
            c cVar2 = this.f18780a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.f18780a = cVar;
                this.f18797r = null;
                this.f18781b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        public void p(boolean z10) {
            this.f18795p = z10;
        }

        public void q(Rect rect) {
            this.f18796q.set(rect);
        }

        public void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f18793n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f18794o = z10;
            }
        }

        public final boolean s(View view, int i10) {
            int b10 = AbstractC2112t.b(((f) view.getLayoutParams()).f18786g, i10);
            return b10 != 0 && (AbstractC2112t.b(this.f18787h, i10) & b10) == b10;
        }

        public final boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f18790k.getId() != this.f18785f) {
                return false;
            }
            View view2 = this.f18790k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f18791l = null;
                    this.f18790k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f18791l = view2;
            return true;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f18781b = false;
            this.f18782c = 0;
            this.f18783d = 0;
            this.f18784e = -1;
            this.f18785f = -1;
            this.f18786g = 0;
            this.f18787h = 0;
            this.f18796q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.c.CoordinatorLayout_Layout);
            this.f18782c = obtainStyledAttributes.getInteger(j0.c.f53628c, 0);
            this.f18785f = obtainStyledAttributes.getResourceId(j0.c.f53629d, -1);
            this.f18783d = obtainStyledAttributes.getInteger(j0.c.f53630e, 0);
            this.f18784e = obtainStyledAttributes.getInteger(j0.c.f53634i, -1);
            this.f18786g = obtainStyledAttributes.getInt(j0.c.f53633h, 0);
            this.f18787h = obtainStyledAttributes.getInt(j0.c.f53632g, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(j0.c.f53631f);
            this.f18781b = hasValue;
            if (hasValue) {
                this.f18780a = CoordinatorLayout.G(context, attributeSet, obtainStyledAttributes.getString(j0.c.f53631f));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f18780a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f18781b = false;
            this.f18782c = 0;
            this.f18783d = 0;
            this.f18784e = -1;
            this.f18785f = -1;
            this.f18786g = 0;
            this.f18787h = 0;
            this.f18796q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f18781b = false;
            this.f18782c = 0;
            this.f18783d = 0;
            this.f18784e = -1;
            this.f18785f = -1;
            this.f18786g = 0;
            this.f18787h = 0;
            this.f18796q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f18781b = false;
            this.f18782c = 0;
            this.f18783d = 0;
            this.f18784e = -1;
            this.f18785f = -1;
            this.f18786g = 0;
            this.f18787h = 0;
            this.f18796q = new Rect();
        }
    }
}
