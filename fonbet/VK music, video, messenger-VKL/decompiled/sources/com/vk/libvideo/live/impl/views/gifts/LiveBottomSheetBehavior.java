package com.vk.libvideo.live.impl.views.gifts;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.view.recommended.RecommendedBottomView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.ccf0;
import xsna.gq;
import xsna.iah0;
import xsna.iut0;
import xsna.lhg;
import xsna.xwk;
import xsna.zut0;

/* loaded from: classes3.dex */
public class LiveBottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int b;
    public int c;
    public boolean d;
    public int e;
    public zut0 f;
    public int g;
    public WeakReference<V> h;
    public WeakReference<View> i;
    public int j;
    public boolean k;
    public final int l;
    public final float m;
    public int n;
    public boolean o;
    public int p;
    public final boolean q;
    public boolean r;
    public int s;
    public boolean t;
    public ccf0 u;
    public final a v;
    public VelocityTracker w;
    public int x;

    public class a extends zut0.c {
        public a() {
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionVertical(View view, int i, int i2) {
            LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
            return xwk.b(i, liveBottomSheetBehavior.b, liveBottomSheetBehavior.d ? liveBottomSheetBehavior.g : liveBottomSheetBehavior.c);
        }

        @Override // xsna.zut0.c
        public final int getViewVerticalDragRange(View view) {
            int i;
            int i2;
            LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
            if (liveBottomSheetBehavior.d) {
                i = liveBottomSheetBehavior.g;
                i2 = liveBottomSheetBehavior.b;
            } else {
                i = liveBottomSheetBehavior.c;
                i2 = liveBottomSheetBehavior.b;
            }
            return i - i2;
        }

        @Override // xsna.zut0.c
        public final void onViewDragStateChanged(int i) {
            if (i == 1) {
                LiveBottomSheetBehavior.this.G(1);
            }
        }

        @Override // xsna.zut0.c
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            LiveBottomSheetBehavior.this.h.get();
        }

        @Override // xsna.zut0.c
        public final void onViewReleased(View view, float f, float f2) {
            int i;
            int i2 = 3;
            LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i = liveBottomSheetBehavior.b;
            } else if (liveBottomSheetBehavior.d && liveBottomSheetBehavior.H(view, f2)) {
                i = liveBottomSheetBehavior.g;
                i2 = 5;
            } else {
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    int top = view.getTop();
                    if (Math.abs(top - liveBottomSheetBehavior.b) < Math.abs(top - liveBottomSheetBehavior.c)) {
                        i = liveBottomSheetBehavior.b;
                    } else {
                        i = liveBottomSheetBehavior.c;
                    }
                } else {
                    i = liveBottomSheetBehavior.c;
                }
                i2 = 4;
            }
            if (!liveBottomSheetBehavior.f.s(view.getLeft(), i)) {
                liveBottomSheetBehavior.G(i2);
                return;
            }
            liveBottomSheetBehavior.G(2);
            d dVar = new d(view, i2);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.postOnAnimation(dVar);
        }

        @Override // xsna.zut0.c
        public final boolean tryCaptureView(View view, int i) {
            WeakReference<V> weakReference;
            View view2;
            LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
            int i2 = liveBottomSheetBehavior.e;
            if (i2 == 1 || liveBottomSheetBehavior.k) {
                return false;
            }
            return ((i2 == 3 && liveBottomSheetBehavior.j == i && (view2 = liveBottomSheetBehavior.i.get()) != null && view2.canScrollVertically(-1)) || (weakReference = liveBottomSheetBehavior.h) == null || weakReference.get() != view) ? false : true;
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
            LiveBottomSheetBehavior.this.I(this.c, view);
        }
    }

    public static abstract class c {
    }

    public class d implements Runnable {
        public final View b;
        public final int c;

        public d(View view, int i) {
            ccf0 ccf0Var;
            this.b = view;
            this.c = i;
            if (LiveBottomSheetBehavior.this.h.get() == null || (ccf0Var = LiveBottomSheetBehavior.this.u) == null) {
                return;
            }
            RecommendedBottomView recommendedBottomView = ccf0Var.a;
            recommendedBottomView.F.b();
            if (i == 5) {
                recommendedBottomView.D = true;
            } else {
                recommendedBottomView.F.l1();
                recommendedBottomView.D = false;
            }
            recommendedBottomView.setAlpha(1.0f);
        }

        @Override // java.lang.Runnable
        public final void run() {
            LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
            zut0 zut0Var = liveBottomSheetBehavior.f;
            if (zut0Var == null || !zut0Var.h()) {
                liveBottomSheetBehavior.G(this.c);
            } else {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                this.b.postOnAnimation(this);
            }
        }
    }

    public LiveBottomSheetBehavior() {
        this.e = 4;
        this.l = iah0.a(24.0f);
        this.v = new a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void A(View view, View view2) {
        int i;
        int i2 = 3;
        if (view.getTop() == this.b) {
            G(3);
            return;
        }
        WeakReference<View> weakReference = this.i;
        if (weakReference != null && view2 == weakReference.get() && this.t) {
            if (this.s > 0) {
                i = this.b;
            } else {
                if (this.d) {
                    this.w.computeCurrentVelocity(1000, this.m);
                    if (H(view, this.w.getYVelocity(this.j))) {
                        i = this.g;
                        i2 = 5;
                    }
                }
                if (this.s == 0) {
                    int top = view.getTop();
                    if (Math.abs(top - this.b) < Math.abs(top - this.c)) {
                        i = this.b;
                    } else {
                        i = this.c;
                    }
                } else {
                    i = this.c;
                }
                i2 = 4;
            }
            if (this.f.u(view.getLeft(), i, view)) {
                G(2);
                d dVar = new d(view, i2);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.postOnAnimation(dVar);
            } else {
                G(i2);
            }
            this.t = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.e == 1 && actionMasked == 0) {
            return true;
        }
        zut0 zut0Var = this.f;
        if (zut0Var != null) {
            zut0Var.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.j = -1;
            VelocityTracker velocityTracker = this.w;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.w = null;
            }
        }
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        if (actionMasked == 2 && !this.r) {
            float a2 = gq.a(motionEvent, this.x);
            zut0 zut0Var2 = this.f;
            if (a2 > zut0Var2.b) {
                zut0Var2.c(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.r;
    }

    public final View D(View view) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View D = D(viewGroup.getChildAt(i));
            if (D != null) {
                return D;
            }
        }
        return null;
    }

    public final void E(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (this.o) {
                return;
            } else {
                this.o = true;
            }
        } else {
            if (!this.o && this.n == i) {
                return;
            }
            this.o = false;
            this.n = Math.max(0, i);
            this.c = this.g - i;
        }
        if (this.e != 4 || (weakReference = this.h) == null || (v = weakReference.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    public final void F(int i) {
        if (i == this.e) {
            return;
        }
        WeakReference<V> weakReference = this.h;
        if (weakReference == null) {
            if (i == 4 || i == 3 || (this.d && i == 5)) {
                this.e = i;
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
                v.post(new b(v, i));
                return;
            }
        }
        I(i, v);
    }

    public final void G(int i) {
        ccf0 ccf0Var;
        if (this.e == i) {
            return;
        }
        this.e = i;
        WeakReference<V> weakReference = this.h;
        if (weakReference == null || weakReference.get() == null || (ccf0Var = this.u) == null) {
            return;
        }
        RecommendedBottomView recommendedBottomView = ccf0Var.a;
        recommendedBottomView.D = i == 5;
        if (i == 5) {
            recommendedBottomView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final boolean H(View view, float f) {
        if (this.q) {
            return true;
        }
        if (view.getTop() < this.c) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.c)) / ((float) this.n) > 0.5f;
    }

    public final void I(int i, View view) {
        int i2;
        if (i == 4) {
            i2 = this.c;
        } else if (i == 3) {
            i2 = this.b;
        } else {
            if (!this.d || i != 5) {
                throw new IllegalArgumentException(lhg.a(i, "Illegal state argument: "));
            }
            i2 = this.g;
        }
        if (!this.f.u(view.getLeft(), i2, view)) {
            G(i);
            return;
        }
        G(2);
        d dVar = new d(view, i);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        view.postOnAnimation(dVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            this.r = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.j = -1;
            VelocityTracker velocityTracker = this.w;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.w = null;
            }
        }
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.x = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.i;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null && coordinatorLayout.O(x, this.x, view)) {
                this.j = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.k = true;
            }
            this.r = this.j == -1 && !coordinatorLayout.O(x, this.x, v);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.k = false;
            this.j = -1;
            if (this.r) {
                this.r = false;
                return false;
            }
        }
        if (this.r || !this.f.t(motionEvent)) {
            View view2 = this.i.get();
            if (actionMasked != 2 || view2 == null || this.r || this.e == 1 || gq.a(motionEvent, this.x) <= this.l) {
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
        this.g = coordinatorLayout.getHeight();
        if (this.o) {
            if (this.p == 0) {
                this.p = coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.design_bottom_sheet_peek_height_min);
            }
            i2 = Math.max(this.p, this.g - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.n;
        }
        int max = Math.max(0, this.g - v.getHeight());
        this.b = max;
        int max2 = Math.max(this.g - i2, max);
        this.c = max2;
        int i3 = this.e;
        if (i3 == 3) {
            v.offsetTopAndBottom(this.b);
        } else if (this.d && i3 == 5) {
            v.offsetTopAndBottom(this.g);
        } else if (i3 == 4) {
            v.offsetTopAndBottom(max2);
        } else if (i3 == 1 || i3 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        if (this.f == null) {
            this.f = new zut0(coordinatorLayout.getContext(), coordinatorLayout, this.v);
        }
        this.h = new WeakReference<>(v);
        this.i = new WeakReference<>(D(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(View view, View view2, float f) {
        return view2 == this.i.get() && this.e != 3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void q(View view, View view2, int i, int[] iArr) {
        if (view2 != this.i.get()) {
            return;
        }
        int top = view.getTop();
        int i2 = top - i;
        if (i > 0) {
            int i3 = this.b;
            if (i2 < i3) {
                int i4 = top - i3;
                iArr[1] = i4;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.offsetTopAndBottom(-i4);
                G(3);
            } else {
                iArr[1] = i;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                view.offsetTopAndBottom(-i);
                G(1);
            }
        } else if (i < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.c;
            if (i2 <= i5 || this.d) {
                iArr[1] = i;
                WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                view.offsetTopAndBottom(-i);
                G(1);
            } else {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
                view.offsetTopAndBottom(-i6);
                G(4);
            }
        }
        view.getTop();
        this.h.get();
        this.s = i;
        this.t = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void w(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).d;
        if (i == 1 || i == 2) {
            this.e = 4;
        } else {
            this.e = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable x(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this.e);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean y(int i, View view) {
        this.s = 0;
        this.t = false;
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

    public LiveBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.e = 4;
        this.l = iah0.a(24.0f);
        this.v = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && (i = peekValue.data) == -1) {
            E(i);
        } else {
            E(obtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        this.d = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false);
        this.q = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        obtainStyledAttributes.recycle();
        this.m = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
