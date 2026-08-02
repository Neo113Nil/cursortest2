package com.vk.core.ui.bottomsheet.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.a;
import com.vk.core.ui.bottomsheet.internal.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.WeakHashMap;
import ru.ok.android.utils.Logger;
import xsna.b0u0;
import xsna.gq;
import xsna.iah0;
import xsna.iut0;
import xsna.lhg;
import xsna.nmr0;
import xsna.omr0;

/* loaded from: classes17.dex */
public class VkBottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements a.InterfaceC0786a {
    public static Field y;
    public final float b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public f j;
    public boolean k;
    public int l;
    public boolean m;
    public int n;
    public WeakReference<V> o;
    public WeakReference<View> p;
    public a q;
    public VelocityTracker r;
    public int s;
    public int t;
    public boolean u;
    public final b v;
    public boolean w;
    public com.vk.core.ui.bottomsheet.internal.a x;

    public class b extends f.c {
        public b() {
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final int a(int i, View view) {
            return view.getLeft();
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final int b(int i, View view) {
            VkBottomSheetBehavior vkBottomSheetBehavior = VkBottomSheetBehavior.this;
            int i2 = vkBottomSheetBehavior.d;
            int i3 = vkBottomSheetBehavior.h ? vkBottomSheetBehavior.n : vkBottomSheetBehavior.f;
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final int d() {
            int i;
            int i2;
            VkBottomSheetBehavior vkBottomSheetBehavior = VkBottomSheetBehavior.this;
            if (vkBottomSheetBehavior.h) {
                i = vkBottomSheetBehavior.n;
                i2 = vkBottomSheetBehavior.d;
            } else {
                i = vkBottomSheetBehavior.f;
                i2 = vkBottomSheetBehavior.d;
            }
            return i - i2;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final void g(int i) {
            if (i == 1) {
                VkBottomSheetBehavior.this.K(1);
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final void h(View view, int i, int i2, int i3, int i4) {
            VkBottomSheetBehavior.this.D(i2);
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final void i(View view, float f, float f2) {
            int i;
            int i2 = 3;
            VkBottomSheetBehavior vkBottomSheetBehavior = VkBottomSheetBehavior.this;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i = vkBottomSheetBehavior.d;
            } else if (vkBottomSheetBehavior.h && vkBottomSheetBehavior.L(view, f2)) {
                i = vkBottomSheetBehavior.n;
                i2 = 5;
            } else {
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int top = view.getTop();
                    if (Math.abs(top - vkBottomSheetBehavior.d) < Math.abs(top - vkBottomSheetBehavior.f)) {
                        i = vkBottomSheetBehavior.d;
                    } else {
                        i = vkBottomSheetBehavior.f;
                    }
                } else {
                    i = vkBottomSheetBehavior.f;
                }
                i2 = 4;
            }
            if (!vkBottomSheetBehavior.j.q(view.getLeft(), i)) {
                vkBottomSheetBehavior.K(i2);
                return;
            }
            vkBottomSheetBehavior.K(2);
            c cVar = new c(view, i2);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.postOnAnimation(cVar);
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final boolean j(View view, int i) {
            View view2;
            VkBottomSheetBehavior vkBottomSheetBehavior = VkBottomSheetBehavior.this;
            int i2 = vkBottomSheetBehavior.i;
            if (i2 == 1 || vkBottomSheetBehavior.u) {
                return false;
            }
            if (i2 == 3 && vkBottomSheetBehavior.s == i && (view2 = vkBottomSheetBehavior.p.get()) != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            return vkBottomSheetBehavior.G() == view;
        }
    }

    public class c implements Runnable {
        public final View b;
        public final int c;

        public c(View view, int i) {
            this.b = view;
            this.c = i;
            VkBottomSheetBehavior.this.G();
        }

        @Override // java.lang.Runnable
        public final void run() {
            VkBottomSheetBehavior vkBottomSheetBehavior = VkBottomSheetBehavior.this;
            f fVar = vkBottomSheetBehavior.j;
            if (fVar == null || !fVar.g()) {
                vkBottomSheetBehavior.K(this.c);
            } else {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                this.b.postOnAnimation(this);
            }
        }
    }

    public VkBottomSheetBehavior() {
        this.e = true;
        this.g = 0;
        this.i = 4;
        this.w = true;
        this.v = new b();
    }

    public static <V extends View> VkBottomSheetBehavior<V> F(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        if (cVar instanceof VkBottomSheetBehavior) {
            return (VkBottomSheetBehavior) cVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    @Nullable
    public static View H(ViewPager viewPager) {
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null || adapter.getCount() == 0 || viewPager.getChildCount() == 0) {
            return null;
        }
        if (y == null) {
            try {
                Field declaredField = ViewPager.g.class.getDeclaredField(Logger.METHOD_E);
                y = declaredField;
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
                    if (y.getInt(gVar) == currentItem) {
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
    public final void A(View view, View view2) {
        int i;
        if (this.w) {
            int i2 = 3;
            if (view.getTop() == this.d) {
                K(3);
                return;
            }
            if (view2 == this.p.get() && this.m) {
                int top = view.getTop();
                if (this.l > 0) {
                    i = this.d;
                } else {
                    if (this.h) {
                        this.r.computeCurrentVelocity(1000, this.b);
                        VelocityTracker velocityTracker = this.r;
                        int i3 = this.s;
                        Map<VelocityTracker, omr0> map = nmr0.a;
                        if (L(view, velocityTracker.getYVelocity(i3))) {
                            i = this.n;
                            i2 = 5;
                        }
                    }
                    if (this.l != 0) {
                        int i4 = this.n;
                        if (i4 == 0 || top <= i4 - this.c) {
                            i = this.f;
                        } else {
                            i = i4;
                            i2 = 5;
                        }
                    } else if (Math.abs(top - this.d) < Math.abs(top - this.f)) {
                        i = this.d;
                    } else {
                        i = this.f;
                    }
                    i2 = 4;
                }
                if (this.j.s(view.getLeft(), i, view)) {
                    K(2);
                    c cVar = new c(view, i2);
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    view.postOnAnimation(cVar);
                } else {
                    K(i2);
                }
                this.m = false;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean C(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown() || !this.w) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.i != 1 || actionMasked != 0) {
            if (this.j == null) {
                this.j = new f(coordinatorLayout.getContext(), coordinatorLayout, this.v);
            }
            this.j.k(motionEvent);
            if (actionMasked == 0) {
                this.s = -1;
                VelocityTracker velocityTracker = this.r;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.r = null;
                }
            }
            if (this.r == null) {
                this.r = VelocityTracker.obtain();
            }
            this.r.addMovement(motionEvent);
            if (actionMasked == 2 && !this.k) {
                float a2 = gq.a(motionEvent, this.t);
                f fVar = this.j;
                if (a2 > fVar.b) {
                    fVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
                }
            }
        }
        return true;
    }

    public final void D(int i) {
        a aVar;
        V G = G();
        if (G == null || (aVar = this.q) == null) {
            return;
        }
        if (i > this.f) {
            aVar.i(G, (r2 - i) / this.c);
        } else {
            aVar.i(G, (r2 - i) / (r2 - this.d));
        }
    }

    public final View E(View view) {
        if ((view instanceof RecyclerView) && view.getVisibility() == 0) {
            return view;
        }
        if (view instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) view;
            if (this.x == null) {
                this.x = new com.vk.core.ui.bottomsheet.internal.a(this);
            }
            com.vk.core.ui.bottomsheet.internal.a aVar = this.x;
            ViewPager viewPager2 = aVar.c;
            if (viewPager2 != null) {
                viewPager2.removeOnPageChangeListener(aVar);
            }
            aVar.c = viewPager;
            viewPager.addOnPageChangeListener(aVar);
            return E(H(viewPager));
        }
        if (view instanceof NestedScrollView) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View E = E(viewGroup.getChildAt(i));
            if (E != null) {
                return E;
            }
        }
        return null;
    }

    public final V G() {
        WeakReference<V> weakReference = this.o;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void I(int i) {
        this.e = true;
        this.c = Math.max(0, i);
        this.f = this.n - i;
    }

    public final void J(int i) {
        int i2;
        if (i == this.i) {
            return;
        }
        if (this.o == null) {
            if (i == 4 || i == 3 || (this.h && i == 5)) {
                this.i = i;
                return;
            }
            return;
        }
        V G = G();
        if (G == null) {
            return;
        }
        if (i == 4) {
            i2 = this.f;
            WeakReference<View> weakReference = this.p;
            View view = weakReference == null ? null : weakReference.get();
            if (view != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (view.canScrollVertically(-1)) {
                    view.scrollTo(0, 0);
                }
            }
        } else if (i == 3) {
            i2 = this.d;
        } else {
            if (!this.h || i != 5) {
                throw new IllegalArgumentException(lhg.a(i, "Illegal state argument: "));
            }
            i2 = this.n;
        }
        K(2);
        if (this.j.s(G.getLeft(), i2, G)) {
            c cVar = new c(G, i);
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            G.postOnAnimation(cVar);
        }
    }

    public final void K(int i) {
        a aVar;
        if (this.i == i) {
            return;
        }
        this.i = i;
        V G = G();
        if (G == null || (aVar = this.q) == null) {
            return;
        }
        aVar.j(i, G);
    }

    public final boolean L(View view, float f) {
        if (view.getTop() < this.f) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f)) / ((float) this.c) > 0.5f;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.a.InterfaceC0786a
    public final void c(@NonNull ViewPager viewPager) {
        this.p = new WeakReference<>(E(H(viewPager)));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        f fVar;
        if (v.isShown() && this.w) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.s = -1;
                VelocityTracker velocityTracker = this.r;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.r = null;
                }
            }
            if (this.r == null) {
                this.r = VelocityTracker.obtain();
            }
            this.r.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.t = (int) motionEvent.getY();
                WeakReference<View> weakReference = this.p;
                View view = weakReference == null ? null : weakReference.get();
                if (view == null || !coordinatorLayout.O(x, this.t, view)) {
                    this.u = false;
                } else {
                    this.s = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.u = true;
                }
                this.k = this.s == -1 && !coordinatorLayout.O(x, this.t, v);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.u = false;
                this.s = -1;
                if (this.k) {
                    this.k = false;
                    return false;
                }
            }
            if (this.k || (fVar = this.j) == null || !fVar.r(motionEvent)) {
                WeakReference<View> weakReference2 = this.p;
                View view2 = weakReference2 != null ? weakReference2.get() : null;
                if (actionMasked != 2 || view2 == null || this.k || this.i == 1 || coordinatorLayout.O((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || gq.a(motionEvent, this.t) <= this.j.b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean n(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2 = this.i;
        if (i2 != 1 && i2 != 2) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
                v.setFitsSystemWindows(true);
            }
            try {
                coordinatorLayout.R(i, v);
            } catch (Exception unused) {
            }
        }
        this.n = iah0.a(96) + coordinatorLayout.getHeight();
        this.d = Math.max(this.g, coordinatorLayout.getHeight() - v.getHeight());
        if (this.e) {
            this.f = Math.max(coordinatorLayout.getHeight() - this.c, this.d);
        } else {
            this.c = Math.max(0, coordinatorLayout.getHeight() - this.f);
        }
        int i3 = this.i;
        if (i3 == 3) {
            int i4 = this.d;
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            v.offsetTopAndBottom(i4);
        } else if (this.h && i3 == 5) {
            int i5 = this.n;
            WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
            v.offsetTopAndBottom(i5);
        } else if (i3 == 4) {
            int i6 = this.f;
            WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
            v.offsetTopAndBottom(i6);
        }
        if (this.j == null) {
            this.j = new f(coordinatorLayout.getContext(), coordinatorLayout, this.v);
        }
        this.o = new WeakReference<>(v);
        this.p = new WeakReference<>(E(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(View view, View view2, float f) {
        return this.w && view2 == this.p.get() && this.i != 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r7.canScrollVertically(-1) == false) goto L22;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(View view, View view2, int i, int[] iArr) {
        if (this.w) {
            WeakReference<View> weakReference = this.p;
            if (view2 != (weakReference == null ? null : weakReference.get())) {
                return;
            }
            int top = view.getTop();
            int i2 = top - i;
            if (i > 0) {
                int i3 = this.d;
                if (i2 < i3) {
                    int i4 = top - i3;
                    iArr[1] = i4;
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    view.offsetTopAndBottom(-i4);
                    K(3);
                } else {
                    iArr[1] = i;
                    WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                    view.offsetTopAndBottom(-i);
                    K(1);
                }
            } else if (i < 0) {
                if (this.i == 3) {
                    WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                }
                int i5 = this.f;
                if (i2 <= i5 || this.h) {
                    iArr[1] = i;
                    WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
                    view.offsetTopAndBottom(-i);
                    K(1);
                } else {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    WeakHashMap<View, b0u0> weakHashMap5 = iut0.a;
                    view.offsetTopAndBottom(-i6);
                    K(4);
                }
            }
            D(view.getTop());
            this.l = i;
            this.m = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void w(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        savedState.getSuperState();
        int i = savedState.b;
        if (i == 1 || i == 2) {
            this.i = 4;
        } else {
            this.i = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable x(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this.i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean y(int i, View view) {
        if (this.w) {
            this.l = 0;
            this.m = false;
            if ((i & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.b = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.b = i;
        }
    }

    public VkBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
        this.g = 0;
        this.i = 4;
        this.w = true;
        this.b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.v = new b();
    }

    public static abstract class a {
        public abstract void j(int i, @NonNull View view);

        public void i(@NonNull View view, float f) {
        }
    }
}
