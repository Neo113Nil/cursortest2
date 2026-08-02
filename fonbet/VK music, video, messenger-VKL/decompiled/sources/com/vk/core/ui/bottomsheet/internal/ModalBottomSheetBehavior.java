package com.vk.core.ui.bottomsheet.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.a;
import com.vk.core.ui.bottomsheet.internal.b;
import com.vk.core.ui.bottomsheet.internal.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.WeakHashMap;
import ru.ok.android.utils.Logger;
import xsna.b0u0;
import xsna.bqx0;
import xsna.gq;
import xsna.iut0;
import xsna.lhg;
import xsna.u080;
import xsna.xwk;

/* loaded from: classes17.dex */
public class ModalBottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements a.InterfaceC0786a {
    public static Field L;
    public com.vk.core.ui.bottomsheet.internal.a C;
    public com.vk.core.ui.bottomsheet.internal.b H;
    public final b.a I;

    @Nullable
    public final u080 J;
    public final c K;
    public View b;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public com.vk.core.ui.bottomsheet.internal.f m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public WeakReference<V> s;
    public WeakReference<View> t;
    public d u;
    public VelocityTracker v;
    public int w;
    public int x;
    public boolean y;
    public HashMap z;
    public final boolean c = true;
    public int k = 4;
    public int l = 4;
    public int A = 0;
    public int B = 0;
    public boolean D = true;
    public boolean E = false;
    public boolean F = false;
    public e G = new a();

    public class a implements e {
        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.e
        public final boolean d(float f, int i) {
            return false;
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public b(View view, int i) {
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.b;
            ModalBottomSheetBehavior.this.R(this.c, view);
        }
    }

    public class c extends f.c {
        public c() {
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final int a(int i, @NonNull View view) {
            return view.getLeft();
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final int b(int i, @NonNull View view) {
            ModalBottomSheetBehavior modalBottomSheetBehavior = ModalBottomSheetBehavior.this;
            return xwk.b(i, modalBottomSheetBehavior.J(), modalBottomSheetBehavior.i ? modalBottomSheetBehavior.r : modalBottomSheetBehavior.h);
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final int d() {
            ModalBottomSheetBehavior modalBottomSheetBehavior = ModalBottomSheetBehavior.this;
            return modalBottomSheetBehavior.i ? modalBottomSheetBehavior.r : modalBottomSheetBehavior.h;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final void g(int i) {
            if (i == 1) {
                ModalBottomSheetBehavior modalBottomSheetBehavior = ModalBottomSheetBehavior.this;
                if (modalBottomSheetBehavior.D) {
                    modalBottomSheetBehavior.P(1);
                }
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final void h(@NonNull View view, int i, int i2, int i3, int i4) {
            ModalBottomSheetBehavior.this.F(i2);
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final void i(@NonNull View view, float f, float f2) {
            int i;
            int i2 = 0;
            int i3 = 6;
            int i4 = 3;
            ModalBottomSheetBehavior modalBottomSheetBehavior = ModalBottomSheetBehavior.this;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (modalBottomSheetBehavior.c) {
                    i = modalBottomSheetBehavior.f;
                } else {
                    int top = view.getTop();
                    int i5 = modalBottomSheetBehavior.g;
                    if (top > i5) {
                        i2 = i5;
                        i = i2;
                        i4 = i3;
                    }
                    i3 = 3;
                    i = i2;
                    i4 = i3;
                }
            } else if (modalBottomSheetBehavior.i && modalBottomSheetBehavior.Q(view, f2) && (view.getTop() > modalBottomSheetBehavior.h || Math.abs(f) < Math.abs(f2))) {
                i = modalBottomSheetBehavior.r;
                i4 = 5;
            } else if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f) > Math.abs(f2)) {
                int top2 = view.getTop();
                if (!modalBottomSheetBehavior.c) {
                    int i6 = modalBottomSheetBehavior.g;
                    if (top2 < i6) {
                        if (top2 >= Math.abs(top2 - modalBottomSheetBehavior.h)) {
                            i2 = modalBottomSheetBehavior.g;
                        }
                        i3 = 3;
                    } else if (Math.abs(top2 - i6) < Math.abs(top2 - modalBottomSheetBehavior.h)) {
                        i2 = modalBottomSheetBehavior.g;
                    } else {
                        i2 = modalBottomSheetBehavior.h;
                        i3 = 4;
                    }
                } else if (Math.abs(top2 - modalBottomSheetBehavior.f) < Math.abs(top2 - modalBottomSheetBehavior.h)) {
                    i2 = modalBottomSheetBehavior.f;
                    i3 = 3;
                } else {
                    i2 = modalBottomSheetBehavior.h;
                    i3 = 4;
                }
                i = i2;
                i4 = i3;
            } else {
                i = modalBottomSheetBehavior.h;
                i4 = 4;
            }
            if (!modalBottomSheetBehavior.m.q(view.getLeft(), i)) {
                modalBottomSheetBehavior.P(i4);
                return;
            }
            modalBottomSheetBehavior.P(2);
            f fVar = new f(view, i4);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.postOnAnimation(fVar);
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final boolean j(@NonNull View view, int i) {
            ModalBottomSheetBehavior modalBottomSheetBehavior = ModalBottomSheetBehavior.this;
            int i2 = modalBottomSheetBehavior.k;
            if (i2 == 1 || modalBottomSheetBehavior.y) {
                return false;
            }
            if (i2 == 3 && modalBottomSheetBehavior.w == i) {
                WeakReference<View> weakReference = modalBottomSheetBehavior.t;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = modalBottomSheetBehavior.s;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public interface e {
        boolean d(float f, int i);
    }

    public class f implements Runnable {
        public final View b;
        public final int c;

        public f(View view, int i) {
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ModalBottomSheetBehavior modalBottomSheetBehavior = ModalBottomSheetBehavior.this;
            com.vk.core.ui.bottomsheet.internal.f fVar = modalBottomSheetBehavior.m;
            if (fVar != null && fVar.g()) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                this.b.postOnAnimation(this);
            } else if (modalBottomSheetBehavior.k == 2) {
                modalBottomSheetBehavior.P(this.c);
            }
        }
    }

    public ModalBottomSheetBehavior(com.vk.core.ui.bottomsheet.internal.b bVar, u080 u080Var) {
        b.a aVar = new b.a();
        aVar.a = 0;
        aVar.b = 0;
        this.I = aVar;
        this.K = new c();
        this.H = bVar;
        this.J = u080Var;
    }

    public static <V extends View> ModalBottomSheetBehavior<V> H(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        if (cVar instanceof ModalBottomSheetBehavior) {
            return (ModalBottomSheetBehavior) cVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    @Nullable
    public static View K(ViewPager viewPager) {
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null || adapter.getCount() == 0 || viewPager.getChildCount() == 0) {
            return null;
        }
        if (L == null) {
            try {
                Field declaredField = ViewPager.g.class.getDeclaredField(Logger.METHOD_E);
                L = declaredField;
                declaredField.setAccessible(true);
            } catch (Exception unused) {
                throw new RuntimeException("position field not found");
            }
        }
        int currentItem = viewPager.getCurrentItem();
        for (int i = 0; i < viewPager.getChildCount(); i++) {
            View childAt = viewPager.getChildAt(i);
            ViewPager.g gVar = (ViewPager.g) childAt.getLayoutParams();
            if (!gVar.a) {
                try {
                    if (L.getInt(gVar) == currentItem) {
                        return childAt;
                    }
                } catch (Exception unused2) {
                    return null;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        int i2;
        int i3 = 3;
        if (v.getTop() == J()) {
            P(3);
            return;
        }
        WeakReference<View> weakReference = this.t;
        if (weakReference != null && view == weakReference.get() && this.p) {
            if (this.o > 0) {
                i2 = J();
            } else {
                if (this.i) {
                    VelocityTracker velocityTracker = this.v;
                    float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(1000, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        f2 = this.v.getYVelocity(this.w);
                    }
                    if (Q(v, f2)) {
                        i2 = this.r;
                        i3 = 5;
                    }
                }
                if (this.o == 0) {
                    int top = v.getTop();
                    if (!this.c) {
                        int i4 = this.g;
                        if (top < i4) {
                            if (top < Math.abs(top - this.h)) {
                                i2 = 0;
                            } else {
                                i2 = this.g;
                            }
                        } else if (Math.abs(top - i4) < Math.abs(top - this.h)) {
                            i2 = this.g;
                        } else {
                            i2 = this.h;
                        }
                        i3 = 6;
                    } else if (Math.abs(top - this.f) < Math.abs(top - this.h)) {
                        i2 = this.f;
                    } else {
                        i2 = this.h;
                    }
                } else {
                    i2 = this.h;
                }
                i3 = 4;
            }
            if (this.m.s(v.getLeft(), i2, v)) {
                P(2);
                f fVar = new f(v, i3);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                v.postOnAnimation(fVar);
            } else {
                P(i3);
            }
            this.p = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown() || !this.D) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.k == 1 && actionMasked == 0) {
            return true;
        }
        com.vk.core.ui.bottomsheet.internal.f fVar = this.m;
        if (fVar != null && this.D) {
            fVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.w = -1;
            VelocityTracker velocityTracker = this.v;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.v = null;
            }
        }
        if (this.v == null) {
            this.v = VelocityTracker.obtain();
        }
        this.v.addMovement(motionEvent);
        if (actionMasked == 2 && !this.n) {
            float a2 = gq.a(motionEvent, this.x);
            com.vk.core.ui.bottomsheet.internal.f fVar2 = this.m;
            if (a2 > fVar2.b) {
                fVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.n;
    }

    public final void D() {
        int max = this.e ? Math.max(0, this.r - ((this.q * 9) / 16)) : this.d;
        if (this.c) {
            this.h = Math.max(this.r - max, this.f);
        } else {
            this.h = this.r - max;
        }
    }

    public boolean E(@NonNull View view) {
        return view.canScrollVertically(-1);
    }

    public final void F(int i) {
        d dVar;
        V v = this.s.get();
        if (v == null || (dVar = this.u) == null) {
            return;
        }
        int i2 = this.h;
        int i3 = i2 - i;
        int J = i > i2 ? this.r - i2 : i2 - J();
        dVar.a(v, J == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : i3 / J);
    }

    public View G(View view) {
        if (view instanceof RecyclerView) {
            return view;
        }
        if (view instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) view;
            if (this.C == null) {
                this.C = new com.vk.core.ui.bottomsheet.internal.a(this);
            }
            com.vk.core.ui.bottomsheet.internal.a aVar = this.C;
            ViewPager viewPager2 = aVar.c;
            if (viewPager2 != null) {
                viewPager2.removeOnPageChangeListener(aVar);
            }
            aVar.c = viewPager;
            viewPager.addOnPageChangeListener(aVar);
            return G(K(viewPager));
        }
        View view2 = null;
        if (view instanceof ViewPager2) {
            ViewPager2 viewPager22 = (ViewPager2) view;
            if (viewPager22.getOrientation() == 0) {
                View childAt = viewPager22.getChildAt(0);
                if (childAt instanceof RecyclerView) {
                    RecyclerView.o layoutManager = ((RecyclerView) childAt).getLayoutManager();
                    int currentItem = viewPager22.getCurrentItem();
                    if (layoutManager != null) {
                        view2 = layoutManager.findViewByPosition(currentItem);
                    }
                }
                return G(view2);
            }
        }
        if (view instanceof NestedScrollView) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View G = G(viewGroup.getChildAt(i));
                if (G != null) {
                    return G;
                }
            }
        }
        return null;
    }

    public final int I() {
        return (this.b.getMeasuredHeight() - this.b.getPaddingBottom()) - this.b.getPaddingTop();
    }

    public final int J() {
        if (this.c) {
            return this.f;
        }
        return 0;
    }

    public final int L() {
        if (this.e) {
            return -1;
        }
        return this.d;
    }

    public final void M(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (z || this.k != 5) {
                return;
            }
            O(4);
        }
    }

    public final void N(int i, boolean z) {
        V v;
        if (i == -1) {
            if (this.e) {
                return;
            } else {
                this.e = true;
            }
        } else {
            if (!this.e && this.d == i) {
                return;
            }
            this.e = false;
            this.d = Math.max(0, i);
        }
        if (this.s != null) {
            D();
            if (this.k != 4 || (v = this.s.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    public final void O(int i) {
        if (i == this.k) {
            return;
        }
        if (this.s != null) {
            S(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.i && i == 5)) {
            this.k = i;
        }
    }

    public final void P(int i) {
        V v;
        if (this.k == i) {
            return;
        }
        this.k = i;
        WeakReference<V> weakReference = this.s;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 6 || i == 3) {
            T(true);
        } else if (i == 5 || i == 4) {
            T(false);
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        v.setImportantForAccessibility(1);
        v.sendAccessibilityEvent(32);
        d dVar = this.u;
        if (dVar != null) {
            dVar.b(i, v);
        }
    }

    public final boolean Q(View view, float f2) {
        if (this.j) {
            return true;
        }
        if (view.getTop() < this.h) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.h)) / ((float) this.d) > 0.1f;
    }

    public final void R(int i, View view) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.h;
        } else if (i == 6) {
            i2 = this.g;
            if (this.c && i2 <= (i3 = this.f)) {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = J();
        } else {
            if (!this.i || i != 5) {
                throw new IllegalArgumentException(lhg.a(i, "Illegal state argument: "));
            }
            i2 = this.r;
        }
        if (!this.m.s(view.getLeft(), i2, view)) {
            P(i);
            return;
        }
        P(2);
        this.l = i;
        f fVar = new f(view, i);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        view.postOnAnimation(fVar);
    }

    public final void S(int i) {
        V v = this.s.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (v.isAttachedToWindow()) {
                v.post(new b(v, i));
                return;
            }
        }
        R(i, v);
    }

    public final void T(boolean z) {
        WeakReference<V> weakReference = this.s;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.z != null) {
                    return;
                } else {
                    this.z = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.s.get()) {
                    if (z) {
                        this.z.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        childAt.setImportantForAccessibility(2);
                    } else {
                        HashMap hashMap = this.z;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.z.get(childAt)).intValue();
                            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                            childAt.setImportantForAccessibility(intValue);
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            this.z = null;
        }
    }

    @Override // com.vk.core.ui.bottomsheet.internal.a.InterfaceC0786a
    public final void c(@NonNull ViewPager viewPager) {
        this.t = new WeakReference<>(G(K(viewPager)));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public final bqx0 h(@NonNull View view, @NonNull bqx0 bqx0Var) {
        u080 u080Var = this.J;
        return u080Var != null ? u080Var.b(view, bqx0Var) : bqx0Var;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void i(@NonNull CoordinatorLayout.f fVar) {
        this.s = null;
        this.m = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l() {
        this.s = null;
        this.m = null;
        com.vk.core.ui.bottomsheet.internal.a aVar = this.C;
        ViewPager viewPager = aVar.c;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(aVar);
        }
        aVar.c = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        com.vk.core.ui.bottomsheet.internal.f fVar;
        if (this.D) {
            if (!v.isShown()) {
                this.n = true;
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.w = -1;
                VelocityTracker velocityTracker = this.v;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.v = null;
                }
            }
            if (this.v == null) {
                this.v = VelocityTracker.obtain();
            }
            this.v.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.x = (int) motionEvent.getY();
                if (this.k != 2) {
                    WeakReference<View> weakReference = this.t;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.O(x, this.x, view)) {
                        this.w = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.y = true;
                    }
                }
                this.n = this.w == -1 && !coordinatorLayout.O(x, this.x, v);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.y = false;
                this.w = -1;
                if (this.n) {
                    this.n = false;
                    return false;
                }
            }
            if (this.n || (fVar = this.m) == null || !fVar.r(motionEvent)) {
                WeakReference<View> weakReference2 = this.t;
                View view2 = weakReference2 != null ? weakReference2.get() : null;
                if (actionMasked != 2 || view2 == null || this.n || this.k == 1 || coordinatorLayout.O((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || this.m == null || gq.a(motionEvent, this.x) <= this.m.b) {
                    float y = motionEvent.getY();
                    if (actionMasked == 2 && Math.abs(this.x - y) > this.m.b) {
                        if (this.G.d(this.x - y, this.k)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n(CoordinatorLayout coordinatorLayout, V v, int i) {
        int measuredHeight;
        int i2;
        int i3;
        int i4;
        int I;
        int measuredHeight2;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        boolean z = this.A != coordinatorLayout.getMeasuredHeight() || this.B != coordinatorLayout.getMeasuredWidth() || this.E || this.F;
        this.E = false;
        this.A = coordinatorLayout.getMeasuredHeight();
        this.B = coordinatorLayout.getMeasuredWidth();
        if (this.s == null) {
            this.s = new WeakReference<>(v);
            d dVar = this.u;
            if (dVar != null) {
                dVar.c();
            }
        }
        if (this.m == null) {
            this.m = new com.vk.core.ui.bottomsheet.internal.f(coordinatorLayout.getContext(), coordinatorLayout, this.K);
        }
        int top = v.getTop();
        coordinatorLayout.R(i, v);
        View G = G(v);
        if (G != null) {
            if (G instanceof NestedScrollView) {
                I = I();
                measuredHeight2 = ((NestedScrollView) G).getChildAt(0).getMeasuredHeight();
            } else if (G instanceof ScrollView) {
                I = I();
                measuredHeight2 = ((ScrollView) G).getChildAt(0).getMeasuredHeight();
            } else {
                if (!(G instanceof RecyclerView)) {
                    i2 = 0;
                    this.H.e(i2, this.b.getMeasuredHeight(), coordinatorLayout.getMeasuredHeight(), coordinatorLayout.getMeasuredWidth(), this.I);
                    b.a aVar = this.I;
                    i3 = aVar.a;
                    if (i3 <= 0) {
                        N(i3, false);
                        this.j = false;
                    } else {
                        N(0, false);
                        this.j = true;
                        if (this.k == 4) {
                            this.k = 3;
                        }
                    }
                    this.q = coordinatorLayout.getWidth();
                    this.r = coordinatorLayout.getHeight();
                    this.f = Math.max(0, aVar.b);
                    this.g = this.r / 2;
                    D();
                    if (z) {
                        v.offsetTopAndBottom(top - v.getTop());
                        if ((this.H.a() && this.k == 3) || (i4 = this.k) == 4) {
                            S(this.k);
                        } else if (i4 == 2 && this.l == 3 && top != J() && this.H.b()) {
                            S(this.l);
                        }
                    } else {
                        int i5 = this.k;
                        if (i5 == 3) {
                            v.offsetTopAndBottom(J());
                        } else if (i5 == 6) {
                            v.offsetTopAndBottom(this.g);
                        } else if (this.i && i5 == 5) {
                            v.offsetTopAndBottom(this.r);
                        } else if (i5 == 4) {
                            v.offsetTopAndBottom(this.h);
                        } else if (i5 == 1 || i5 == 2) {
                            v.offsetTopAndBottom(top - v.getTop());
                        }
                    }
                    this.t = new WeakReference<>(G(v));
                    return true;
                }
                I = I();
                measuredHeight2 = G.getMeasuredHeight();
            }
            measuredHeight = I - measuredHeight2;
        } else {
            measuredHeight = coordinatorLayout.getMeasuredHeight() - v.getMeasuredHeight();
        }
        i2 = measuredHeight;
        this.H.e(i2, this.b.getMeasuredHeight(), coordinatorLayout.getMeasuredHeight(), coordinatorLayout.getMeasuredWidth(), this.I);
        b.a aVar2 = this.I;
        i3 = aVar2.a;
        if (i3 <= 0) {
        }
        this.q = coordinatorLayout.getWidth();
        this.r = coordinatorLayout.getHeight();
        this.f = Math.max(0, aVar2.b);
        this.g = this.r / 2;
        D();
        if (z) {
        }
        this.t = new WeakReference<>(G(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(@NonNull View view, @NonNull View view2, float f2) {
        WeakReference<View> weakReference = this.t;
        return (weakReference == null || view2 != weakReference.get() || this.k == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.t;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < J()) {
                int J = top - J();
                iArr[1] = J;
                int i5 = -J;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                v.offsetTopAndBottom(i5);
                P(3);
            } else if (this.D) {
                iArr[1] = i2;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                v.offsetTopAndBottom(-i2);
                P(1);
            }
        } else if (i2 < 0 && !E(view)) {
            int i6 = this.h;
            if (i4 > i6 && !this.i) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                v.offsetTopAndBottom(i8);
                P(4);
            } else if (this.D) {
                iArr[1] = i2;
                WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
                v.offsetTopAndBottom(-i2);
                P(1);
            }
        }
        F(v.getTop());
        this.o = i2;
        this.p = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void w(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).d;
        if (i == 1 || i == 2) {
            this.k = 4;
        } else {
            this.k = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable x(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.o = 0;
        this.p = false;
        return (i & 2) != 0;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int d;
        public final int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, ModalBottomSheetBehavior modalBottomSheetBehavior) {
            super(parcelable);
            this.d = modalBottomSheetBehavior.k;
            this.e = modalBottomSheetBehavior.d;
            this.f = modalBottomSheetBehavior.c;
            this.g = modalBottomSheetBehavior.i;
            this.h = modalBottomSheetBehavior.j;
        }
    }

    public static abstract class d {
        public abstract void a(@NonNull View view, float f);

        public abstract void b(int i, @NonNull View view);

        public void c() {
        }
    }
}
