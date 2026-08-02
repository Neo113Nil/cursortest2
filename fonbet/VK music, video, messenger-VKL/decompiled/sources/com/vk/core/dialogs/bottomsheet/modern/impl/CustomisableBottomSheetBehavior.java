package com.vk.core.dialogs.bottomsheet.modern.impl;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$dimen;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.log.L;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.gq;
import xsna.iut0;
import xsna.ji;
import xsna.lpk;
import xsna.xwk;
import xsna.zut0;

/* loaded from: classes17.dex */
public class CustomisableBottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public final float b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public zut0 k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    public WeakReference<V> p;

    @Nullable
    public WeakReference<View> q;
    public b r;
    public VelocityTracker s;
    public int t;
    public int u;
    public boolean v;
    public lpk w;
    public int j = 4;
    public final ArrayDeque x = new ArrayDeque();
    public final a y = new a();

    public class a extends zut0.c {
        public a() {
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionVertical(View view, int i, int i2) {
            CustomisableBottomSheetBehavior customisableBottomSheetBehavior = CustomisableBottomSheetBehavior.this;
            return xwk.b(i, customisableBottomSheetBehavior.f, customisableBottomSheetBehavior.h ? customisableBottomSheetBehavior.o : customisableBottomSheetBehavior.g);
        }

        @Override // xsna.zut0.c
        public final int getViewVerticalDragRange(View view) {
            int i;
            int i2;
            CustomisableBottomSheetBehavior customisableBottomSheetBehavior = CustomisableBottomSheetBehavior.this;
            if (customisableBottomSheetBehavior.h) {
                i = customisableBottomSheetBehavior.o;
                i2 = customisableBottomSheetBehavior.f;
            } else {
                i = customisableBottomSheetBehavior.g;
                i2 = customisableBottomSheetBehavior.f;
            }
            return i - i2;
        }

        @Override // xsna.zut0.c
        public final void onViewDragStateChanged(int i) {
            if (i == 1) {
                CustomisableBottomSheetBehavior.this.K(1);
            }
        }

        @Override // xsna.zut0.c
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            CustomisableBottomSheetBehavior.this.D(i2);
        }

        @Override // xsna.zut0.c
        public final void onViewReleased(View view, float f, float f2) {
            int i;
            int i2 = 3;
            CustomisableBottomSheetBehavior customisableBottomSheetBehavior = CustomisableBottomSheetBehavior.this;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i = customisableBottomSheetBehavior.f;
            } else if (customisableBottomSheetBehavior.h && customisableBottomSheetBehavior.L(view, f2)) {
                i = customisableBottomSheetBehavior.o;
                i2 = 5;
            } else {
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int top = view.getTop();
                    if (Math.abs(top - customisableBottomSheetBehavior.f) < Math.abs(top - customisableBottomSheetBehavior.g)) {
                        i = customisableBottomSheetBehavior.f;
                    } else {
                        i = customisableBottomSheetBehavior.g;
                    }
                } else {
                    i = customisableBottomSheetBehavior.g;
                }
                i2 = 4;
            }
            if (!customisableBottomSheetBehavior.k.s(view.getLeft(), i)) {
                customisableBottomSheetBehavior.K(i2);
                return;
            }
            customisableBottomSheetBehavior.K(2);
            c cVar = new c(view, i2);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.postOnAnimation(cVar);
        }

        @Override // xsna.zut0.c
        public final boolean tryCaptureView(View view, int i) {
            WeakReference<V> weakReference;
            View view2;
            CustomisableBottomSheetBehavior customisableBottomSheetBehavior = CustomisableBottomSheetBehavior.this;
            int i2 = customisableBottomSheetBehavior.j;
            if (i2 == 1 || customisableBottomSheetBehavior.v) {
                return false;
            }
            return ((i2 == 3 && customisableBottomSheetBehavior.t == i && (view2 = customisableBottomSheetBehavior.q.get()) != null && view2.canScrollVertically(-1)) || (weakReference = customisableBottomSheetBehavior.p) == null || weakReference.get() != view) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract void a(@NonNull View view, float f);

        public abstract void b(int i, @NonNull View view);
    }

    public class c implements Runnable {
        public final View b;
        public final int c;

        public c(View view, int i) {
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CustomisableBottomSheetBehavior customisableBottomSheetBehavior = CustomisableBottomSheetBehavior.this;
            zut0 zut0Var = customisableBottomSheetBehavior.k;
            if (zut0Var == null || !zut0Var.h()) {
                customisableBottomSheetBehavior.K(this.c);
            } else {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                this.b.postOnAnimation(this);
            }
        }
    }

    public CustomisableBottomSheetBehavior(Context context) {
        this.b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void A(View view, View view2) {
        int i;
        int i2 = 3;
        if (view.getTop() == this.f) {
            K(3);
            return;
        }
        WeakReference<View> weakReference = this.q;
        if (weakReference != null && view2 == weakReference.get() && this.n) {
            if (this.m > 0) {
                i = this.f;
            } else {
                if (this.h) {
                    this.s.computeCurrentVelocity(1000, this.b);
                    if (L(view, this.s.getYVelocity(this.t))) {
                        i = this.o;
                        i2 = 5;
                    }
                }
                if (this.m == 0) {
                    int top = view.getTop();
                    if (Math.abs(top - this.f) < Math.abs(top - this.g)) {
                        i = this.f;
                    } else {
                        i = this.g;
                    }
                } else {
                    i = this.g;
                }
                i2 = 4;
            }
            if (this.k.u(view.getLeft(), i, view)) {
                K(2);
                c cVar = new c(view, i2);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.postOnAnimation(cVar);
            } else {
                K(i2);
            }
            this.n = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        try {
        } catch (Exception e) {
            L.i(e);
        }
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.j == 1 && actionMasked == 0) {
            return true;
        }
        zut0 zut0Var = this.k;
        if (zut0Var != null) {
            zut0Var.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.t = -1;
            VelocityTracker velocityTracker = this.s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.s = null;
            }
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 2 && !this.l) {
            float abs = Math.abs(this.u - motionEvent.getY());
            zut0 zut0Var2 = this.k;
            if (abs > zut0Var2.b) {
                zut0Var2.c(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return true ^ this.l;
    }

    public final void D(int i) {
        b bVar;
        V v = this.p.get();
        if (v == null || (bVar = this.r) == null) {
            return;
        }
        if (i > this.g) {
            bVar.a(v, (r2 - i) / (this.o - r2));
        } else {
            bVar.a(v, (r2 - i) / (r2 - this.f));
        }
    }

    @Nullable
    public View E(View view) {
        if (F(view)) {
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

    public boolean F(View view) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        return view.isNestedScrollingEnabled();
    }

    public final void G(View view) {
        this.q = new WeakReference<>(E(view));
    }

    public final void H() {
        this.l = false;
    }

    public final void I(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (this.d) {
                return;
            } else {
                this.d = true;
            }
        } else {
            if (!this.d && this.c == i) {
                return;
            }
            this.d = false;
            this.c = Math.max(0, i);
            this.g = this.o - i;
        }
        if (this.j != 4 || (weakReference = this.p) == null || (v = weakReference.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.lpk] */
    public final void J(final int i) {
        if (i == this.j) {
            return;
        }
        WeakReference<V> weakReference = this.p;
        if (weakReference == null) {
            if (i == 4 || i == 3 || (this.h && i == 5)) {
                this.j = i;
                return;
            }
            return;
        }
        V v = weakReference.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (v.isAttachedToWindow()) {
                v.getViewTreeObserver().removeOnPreDrawListener(this.w);
                final int i2 = this.j;
                this.w = new ViewTreeObserver.OnPreDrawListener() { // from class: xsna.lpk
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        CustomisableBottomSheetBehavior customisableBottomSheetBehavior = CustomisableBottomSheetBehavior.this;
                        View view = (View) customisableBottomSheetBehavior.p.get();
                        if (view == null) {
                            return true;
                        }
                        if (i2 != customisableBottomSheetBehavior.j) {
                            return true;
                        }
                        customisableBottomSheetBehavior.M(i, view);
                        return true;
                    }
                };
                v.getViewTreeObserver().addOnPreDrawListener(this.w);
                return;
            }
        }
        M(i, v);
    }

    public final void K(int i) {
        b bVar;
        if (this.j == i) {
            return;
        }
        this.j = i;
        V v = this.p.get();
        if (v == null || (bVar = this.r) == null) {
            return;
        }
        bVar.b(i, v);
    }

    public final boolean L(View view, float f) {
        if (this.i) {
            return true;
        }
        if (view.getTop() < this.g) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.g)) / ((float) this.c) > 0.5f;
    }

    public final void M(int i, View view) {
        int i2;
        view.getViewTreeObserver().removeOnPreDrawListener(this.w);
        this.w = null;
        if (i == 4) {
            i2 = this.g;
        } else if (i == 3) {
            i2 = this.f;
        } else {
            if (!this.h || i != 5) {
                if (BuildInfo.m()) {
                    return;
                }
                StringBuilder b2 = ji.b(i, "Illegal state argument: ", " isHideable=");
                b2.append(this.h);
                throw new IllegalArgumentException(b2.toString());
            }
            i2 = this.o;
        }
        if (!this.k.u(view.getLeft(), i2, view)) {
            K(i);
            return;
        }
        K(2);
        c cVar = new c(view, i);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        view.postOnAnimation(cVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            this.l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.t = -1;
            VelocityTracker velocityTracker = this.s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.s = null;
            }
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.u = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.q;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null && coordinatorLayout.O(x, this.u, view)) {
                this.t = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.v = true;
            }
            this.l = this.t == -1 && !coordinatorLayout.O(x, this.u, v);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.v = false;
            this.t = -1;
            if (this.l) {
                this.l = false;
                return false;
            }
        }
        if (this.l || !this.k.t(motionEvent)) {
            WeakReference<View> weakReference2 = this.q;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            if (actionMasked != 2 || view2 == null || this.l || this.j == 1 || coordinatorLayout.O((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || gq.a(motionEvent, this.u) <= this.k.b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean n(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.R(i, v);
        this.o = coordinatorLayout.getHeight();
        if (this.d) {
            if (this.e == 0) {
                this.e = coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.design_bottom_sheet_peek_height_min);
            }
            i2 = Math.max(this.e, this.o - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.c;
        }
        int max = Math.max(0, this.o - v.getHeight());
        this.f = max;
        int max2 = Math.max(this.o - i2, max);
        this.g = max2;
        int i3 = this.j;
        if (i3 == 3) {
            v.offsetTopAndBottom(this.f);
        } else if (this.h && i3 == 5) {
            v.offsetTopAndBottom(this.o);
        } else if (i3 == 4) {
            v.offsetTopAndBottom(max2);
        } else if (i3 == 1 || i3 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        if (this.k == null) {
            this.k = new zut0(coordinatorLayout.getContext(), coordinatorLayout, this.y);
        }
        this.p = new WeakReference<>(v);
        G(v);
        WeakReference<V> weakReference = this.p;
        if (weakReference != null && weakReference.get() != null) {
            while (true) {
                Runnable runnable = (Runnable) this.x.poll();
                if (runnable == null) {
                    break;
                }
                runnable.run();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(View view, View view2, float f) {
        return view2 == this.q.get() && this.j != 3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void q(View view, View view2, int i, int[] iArr) {
        if (view2 != this.q.get()) {
            return;
        }
        int top = view.getTop();
        int i2 = top - i;
        if (i > 0) {
            int i3 = this.f;
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
        } else if (i < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.g;
            if (i2 <= i5 || this.h) {
                iArr[1] = i;
                WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                view.offsetTopAndBottom(-i);
                K(1);
            } else {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
                view.offsetTopAndBottom(-i6);
                K(4);
            }
        }
        D(view.getTop());
        this.m = i;
        this.n = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void w(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).d;
        if (i == 1 || i == 2) {
            this.j = 4;
        } else {
            this.j = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable x(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this.j);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean y(int i, View view) {
        this.m = 0;
        this.n = false;
        return (i & 2) != 0;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int d;

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
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.d = i;
        }
    }
}
