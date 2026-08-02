package com.google.android.material.appbar;

import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bqx0;
import xsna.byu;
import xsna.dwu;
import xsna.fpo0;
import xsna.i2u0;
import xsna.iut0;
import xsna.rq2;
import xsna.u080;
import xsna.xwk;

@CoordinatorLayout.d(Behavior.class)
/* loaded from: classes13.dex */
public class NonBouncedAppBarLayout extends LinearLayout {
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public bqx0 g;
    public ArrayList h;
    public boolean i;
    public boolean j;
    public int[] k;
    public final b l;
    public boolean m;
    public boolean n;
    public boolean o;

    public static class BlockingBehaviour extends Behavior {
        @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.Behavior
        public final boolean Q(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, View view, int i) {
            return false;
        }

        @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.Behavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return false;
        }
    }

    public static class ScrollingViewBehavior extends byu {
        public ScrollingViewBehavior() {
        }

        @Override // xsna.byu
        public final View H(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof NonBouncedAppBarLayout) {
                    return (NonBouncedAppBarLayout) view;
                }
            }
            return null;
        }

        @Override // xsna.byu
        public final float J(View view) {
            int i;
            if (!(view instanceof NonBouncedAppBarLayout)) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) view;
            int totalScrollRange = nonBouncedAppBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = nonBouncedAppBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) nonBouncedAppBarLayout.getLayoutParams()).a;
            int E = cVar instanceof Behavior ? ((Behavior) cVar).E() : 0;
            return ((downNestedPreScrollRange == 0 || totalScrollRange + E > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) ? (E / i) + 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // xsna.byu
        public final int K(View view) {
            return view instanceof NonBouncedAppBarLayout ? ((NonBouncedAppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(View view, View view2) {
            return view2 instanceof NonBouncedAppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
            if (!(cVar instanceof Behavior)) {
                return false;
            }
            int bottom = (((view2.getBottom() - view.getTop()) + ((Behavior) cVar).k) + this.f) - I(view2);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.offsetTopAndBottom(bottom);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean v(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            NonBouncedAppBarLayout nonBouncedAppBarLayout;
            ArrayList E = coordinatorLayout.E(view);
            int size = E.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    nonBouncedAppBarLayout = null;
                    break;
                }
                View view2 = (View) E.get(i);
                if (view2 instanceof NonBouncedAppBarLayout) {
                    nonBouncedAppBarLayout = (NonBouncedAppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (nonBouncedAppBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.d;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    nonBouncedAppBarLayout.h(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
            this.g = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public class a implements u080 {
        public a() {
        }

        @Override // xsna.u080
        public final bqx0 b(View view, bqx0 bqx0Var) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            NonBouncedAppBarLayout nonBouncedAppBarLayout = NonBouncedAppBarLayout.this;
            bqx0 bqx0Var2 = nonBouncedAppBarLayout.getFitsSystemWindows() ? bqx0Var : null;
            if (!Objects.equals(nonBouncedAppBarLayout.g, bqx0Var2)) {
                nonBouncedAppBarLayout.g = bqx0Var2;
                nonBouncedAppBarLayout.b = -1;
                nonBouncedAppBarLayout.c = -1;
                nonBouncedAppBarLayout.d = -1;
            }
            return bqx0Var;
        }
    }

    public static class b implements d {
        public a a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ a[] $VALUES;
            public static final a COLLAPSED;
            public static final a EXPANDED;
            public static final a IDLE;

            static {
                a aVar = new a("EXPANDED", 0);
                EXPANDED = aVar;
                a aVar2 = new a("COLLAPSED", 1);
                COLLAPSED = aVar2;
                a aVar3 = new a("IDLE", 2);
                IDLE = aVar3;
                $VALUES = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
        public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout, int i) {
            if (i == 0) {
                this.a = a.EXPANDED;
            } else if (Math.abs(i) >= nonBouncedAppBarLayout.getTotalScrollRange()) {
                this.a = a.COLLAPSED;
            } else {
                this.a = a.IDLE;
            }
        }
    }

    public static class c extends LinearLayout.LayoutParams {
        public int a;
        public Interpolator b;

        public final void a(int i) {
            this.a = i;
        }
    }

    public interface d {
        void a(NonBouncedAppBarLayout nonBouncedAppBarLayout, int i);
    }

    public NonBouncedAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        b bVar = new b();
        bVar.a = b.a.IDLE;
        this.l = bVar;
        this.m = false;
        this.n = false;
        this.o = false;
        setOrientation(1);
        fpo0.c(context, "Theme.AppCompat", fpo0.a);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        i2u0.b(this, attributeSet, 0, R$style.Widget_Design_AppBarLayout);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout, 0, R$style.Widget_Design_AppBarLayout);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.AppBarLayout_android_background);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setBackground(drawable);
        if (obtainStyledAttributes.hasValue(R$styleable.AppBarLayout_expanded)) {
            h(obtainStyledAttributes.getBoolean(R$styleable.AppBarLayout_expanded, false), false, false);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.AppBarLayout_elevation)) {
            i2u0.a(this, obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppBarLayout_elevation, 0));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.AppBarLayout_android_keyboardNavigationCluster)) {
            setKeyboardNavigationCluster(obtainStyledAttributes.getBoolean(R$styleable.AppBarLayout_android_keyboardNavigationCluster, false));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
            setTouchscreenBlocksFocus(obtainStyledAttributes.getBoolean(R$styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
        }
        obtainStyledAttributes.recycle();
        super.setStateListAnimator(null);
        iut0.d.c(this, new a());
        a(bVar);
    }

    public static c d(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            c cVar = new c((LinearLayout.LayoutParams) layoutParams);
            cVar.a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar2 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.a = 1;
            return cVar2;
        }
        c cVar3 = new c(layoutParams);
        cVar3.a = 1;
        return cVar3;
    }

    public final void a(d dVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (dVar == null || this.h.contains(dVar)) {
            return;
        }
        this.h.add(dVar);
    }

    public final void b(int i) {
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = (d) this.h.get(i2);
                if (dVar != null) {
                    dVar.a(this, i);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout_Layout);
        cVar.a = obtainStyledAttributes.getInt(R$styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
        if (obtainStyledAttributes.hasValue(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
            cVar.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        obtainStyledAttributes.recycle();
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean e() {
        return getState() == b.a.COLLAPSED;
    }

    public final boolean f() {
        return getState() == b.a.EXPANDED;
    }

    public final void g() {
        h(true, true, true);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.a = 1;
        return cVar;
    }

    public int getDownNestedPreScrollRange() {
        int topInset;
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = cVar.a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + i2;
                if ((i3 & 8) != 0) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    i2 = childAt.getMinimumHeight() + i4;
                } else {
                    if ((i3 & 2) != 0) {
                        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                        topInset = childAt.getMinimumHeight();
                    } else {
                        topInset = getTopInset();
                    }
                    i2 = (measuredHeight - topInset) + i4;
                }
            }
        }
        int max = Math.max(0, i2);
        this.c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
            int i4 = cVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                i3 -= getTopInset() + childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.d = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public b.a getState() {
        return this.l.a;
    }

    @Deprecated
    public float getTargetElevation() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int getTopInset() {
        bqx0 bqx0Var = this.g;
        if (bqx0Var != null) {
            return bqx0Var.a.i(1).b;
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
            if ((i4 & 2) != 0) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                i3 -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void h(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.k == null) {
            this.k = new int[2];
        }
        int[] iArr = this.k;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.i;
        int i2 = R$attr.state_collapsible;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.j) ? R$attr.state_collapsed : -R$attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        boolean z2 = false;
        this.e = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            if (((c) getChildAt(i5).getLayoutParams()).b != null) {
                this.e = true;
                break;
            }
            i5++;
        }
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            }
            int i7 = ((c) getChildAt(i6).getLayoutParams()).a;
            if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                z2 = true;
                break;
            }
            i6++;
        }
        if (this.i != z2) {
            this.i = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        h(z, isLaidOut(), true);
    }

    public void setExpandingBlocked(boolean z) {
        this.m = z;
        this.n = z && this.o;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("NonBouncedAppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Deprecated
    public void setTargetElevation(float f) {
        i2u0.a(this, f);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return d(layoutParams);
    }

    public static class Behavior extends dwu<NonBouncedAppBarLayout> {
        public int k;
        public ValueAnimator l;
        public int m;
        public boolean n;
        public float o;
        public WeakReference<View> p;
        public boolean q;

        public Behavior() {
            this.m = -1;
            this.q = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void U(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = nonBouncedAppBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = nonBouncedAppBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (view != null) {
                int i4 = ((c) view.getLayoutParams()).a;
                boolean z3 = true;
                if ((i4 & 1) != 0) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    int minimumHeight = view.getMinimumHeight();
                    if (i2 <= 0 || (i4 & 12) == 0 ? !((i4 & 2) == 0 || (-i) < (view.getBottom() - minimumHeight) - nonBouncedAppBarLayout.getTopInset()) : (-i) >= (view.getBottom() - minimumHeight) - nonBouncedAppBarLayout.getTopInset()) {
                        z2 = true;
                        if (nonBouncedAppBarLayout.j == z2) {
                            nonBouncedAppBarLayout.j = z2;
                            nonBouncedAppBarLayout.refreshDrawableState();
                        } else {
                            z3 = false;
                        }
                        if (!z) {
                            if (z3) {
                                ArrayList F = coordinatorLayout.F(nonBouncedAppBarLayout);
                                int size = F.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    CoordinatorLayout.c cVar = ((CoordinatorLayout.f) ((View) F.get(i5)).getLayoutParams()).a;
                                    if (cVar instanceof ScrollingViewBehavior) {
                                        if (((ScrollingViewBehavior) cVar).g == 0) {
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        nonBouncedAppBarLayout.jumpDrawablesToCurrentState();
                    }
                }
                z2 = false;
                if (nonBouncedAppBarLayout.j == z2) {
                }
                if (!z) {
                }
                nonBouncedAppBarLayout.jumpDrawablesToCurrentState();
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void B(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) view;
            nonBouncedAppBarLayout.n = false;
            nonBouncedAppBarLayout.o = true;
            if (i == 0) {
                S(coordinatorLayout, nonBouncedAppBarLayout, this.q);
            }
            this.p = new WeakReference<>(view2);
        }

        @Override // xsna.azt0
        public final int E() {
            return D() + this.k;
        }

        @Override // xsna.dwu
        public final boolean H(NonBouncedAppBarLayout nonBouncedAppBarLayout) {
            WeakReference<View> weakReference = this.p;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // xsna.dwu
        public final int I(NonBouncedAppBarLayout nonBouncedAppBarLayout) {
            return -nonBouncedAppBarLayout.getDownNestedScrollRange();
        }

        @Override // xsna.dwu
        public final int J(NonBouncedAppBarLayout nonBouncedAppBarLayout) {
            return nonBouncedAppBarLayout.getTotalScrollRange();
        }

        @Override // xsna.dwu
        public final void K(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout) {
            S(coordinatorLayout, nonBouncedAppBarLayout, this.q);
        }

        @Override // xsna.dwu
        public final int L(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, int i, int i2, int i3) {
            int i4;
            int i5;
            NonBouncedAppBarLayout nonBouncedAppBarLayout2 = nonBouncedAppBarLayout;
            int E = E();
            if (i2 == 0 || E < i2 || E > i3) {
                this.k = 0;
                return 0;
            }
            int b = xwk.b(i, i2, i3);
            if (E == b) {
                return 0;
            }
            if (nonBouncedAppBarLayout2.e) {
                int abs = Math.abs(b);
                int childCount = nonBouncedAppBarLayout2.getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount) {
                        break;
                    }
                    View childAt = nonBouncedAppBarLayout2.getChildAt(i6);
                    c cVar = (c) childAt.getLayoutParams();
                    Interpolator interpolator = cVar.b;
                    if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                        i6++;
                    } else if (interpolator != null) {
                        int i7 = cVar.a;
                        if ((i7 & 1) != 0) {
                            i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                            if ((i7 & 2) != 0) {
                                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                                i5 -= childAt.getMinimumHeight();
                            }
                        } else {
                            i5 = 0;
                        }
                        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                        if (childAt.getFitsSystemWindows()) {
                            i5 -= nonBouncedAppBarLayout2.getTopInset();
                        }
                        if (i5 > 0) {
                            float f = i5;
                            i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(b);
                        }
                    }
                }
            }
            i4 = b;
            boolean G = G(i4);
            int i8 = E - b;
            this.k = b - i4;
            if (!G && nonBouncedAppBarLayout2.e) {
                coordinatorLayout.B(nonBouncedAppBarLayout2);
            }
            nonBouncedAppBarLayout2.b(D());
            U(coordinatorLayout, nonBouncedAppBarLayout2, b, b < E ? -1 : 1, false);
            return i8;
        }

        public final void N(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, int i) {
            int abs = Math.abs(E() - i);
            float abs2 = Math.abs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int round = abs2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / nonBouncedAppBarLayout.getHeight()) + 1.0f) * 150.0f);
            int E = E();
            if (E == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(rq2.e);
                this.l.addUpdateListener(new com.google.android.material.appbar.d(this, coordinatorLayout, nonBouncedAppBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration(Math.min(round, 600));
            this.l.setIntValues(E, i);
            this.l.start();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public void r(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            T(i2, nonBouncedAppBarLayout, view, i3);
            if (nonBouncedAppBarLayout.n || i2 == 0) {
                return;
            }
            if (i2 < 0) {
                this.q = true;
                i5 = -nonBouncedAppBarLayout.getTotalScrollRange();
                i4 = nonBouncedAppBarLayout.getDownNestedPreScrollRange() + i5;
            } else {
                i4 = 0;
                this.q = false;
                i5 = -nonBouncedAppBarLayout.getUpNestedPreScrollRange();
            }
            int i6 = i5;
            int i7 = i4;
            if (i6 != i7) {
                iArr[1] = L(coordinatorLayout, nonBouncedAppBarLayout, E() - i2, i6, i7);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public void t(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            T(i4, nonBouncedAppBarLayout, view, i5);
            if (!nonBouncedAppBarLayout.n && i4 < 0) {
                L(coordinatorLayout, nonBouncedAppBarLayout, E() - i4, -nonBouncedAppBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        public boolean Q(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, View view, int i) {
            ValueAnimator valueAnimator;
            boolean z = false;
            if (nonBouncedAppBarLayout.m) {
                return false;
            }
            nonBouncedAppBarLayout.o = true;
            if ((i & 2) != 0 && nonBouncedAppBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= nonBouncedAppBarLayout.getHeight()) {
                z = true;
            }
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.p = null;
            return z;
        }

        @Override // xsna.dwu, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public boolean C(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, MotionEvent motionEvent) {
            return nonBouncedAppBarLayout.m || super.C(coordinatorLayout, nonBouncedAppBarLayout, motionEvent);
        }

        public final void S(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, boolean z) {
            int E = E();
            int childCount = nonBouncedAppBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = nonBouncedAppBarLayout.getChildAt(i);
                int i2 = -E;
                if (childAt.getTop() <= i2 && childAt.getBottom() >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = nonBouncedAppBarLayout.getChildAt(i);
                int i3 = ((c) childAt2.getLayoutParams()).a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == nonBouncedAppBarLayout.getChildCount() - 1) {
                        i5 += nonBouncedAppBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        i5 += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (E < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if (E != 0 && (!z || E == i5)) {
                        i4 = i5;
                    }
                    N(coordinatorLayout, nonBouncedAppBarLayout, xwk.b(i4, -nonBouncedAppBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        public final void T(int i, NonBouncedAppBarLayout nonBouncedAppBarLayout, View view, int i2) {
            if (i2 == 1) {
                int D = D();
                if ((i >= 0 || D != 0) && (i <= 0 || D != (-nonBouncedAppBarLayout.getTotalScrollRange()))) {
                    return;
                }
                nonBouncedAppBarLayout.postDelayed(new com.google.android.material.appbar.c(view), 200L);
            }
        }

        @Override // xsna.azt0, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
            int round;
            NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) view;
            super.n(coordinatorLayout, nonBouncedAppBarLayout, i);
            int pendingAction = nonBouncedAppBarLayout.getPendingAction();
            int i2 = this.m;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = nonBouncedAppBarLayout.getChildAt(i2);
                int i3 = -childAt.getBottom();
                if (this.n) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    round = nonBouncedAppBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    round = Math.round(childAt.getHeight() * this.o) + i3;
                }
                M(coordinatorLayout, nonBouncedAppBarLayout, round);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -nonBouncedAppBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        N(coordinatorLayout, nonBouncedAppBarLayout, i4);
                    } else {
                        M(coordinatorLayout, nonBouncedAppBarLayout, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        N(coordinatorLayout, nonBouncedAppBarLayout, 0);
                    } else {
                        M(coordinatorLayout, nonBouncedAppBarLayout, 0);
                    }
                }
            }
            nonBouncedAppBarLayout.f = 0;
            this.m = -1;
            G(xwk.b(D(), -nonBouncedAppBarLayout.getTotalScrollRange(), 0));
            U(coordinatorLayout, nonBouncedAppBarLayout, D(), 0, true);
            nonBouncedAppBarLayout.b(D());
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) nonBouncedAppBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.U(nonBouncedAppBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void w(View view, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                this.m = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            this.m = savedState.d;
            this.o = savedState.e;
            this.n = savedState.f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable x(View view) {
            NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int D = D();
            int childCount = nonBouncedAppBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = nonBouncedAppBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + D;
                if (childAt.getTop() + D <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.d = i;
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    savedState.f = bottom == nonBouncedAppBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.e = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return absSavedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return Q(coordinatorLayout, (NonBouncedAppBarLayout) view, view2, i);
        }

        public static class SavedState extends androidx.customview.view.AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            public int d;
            public float e;
            public boolean f;

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
                    return new SavedState(parcel, null);
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.d = parcel.readInt();
                this.e = parcel.readFloat();
                this.f = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.d);
                parcel.writeFloat(this.e);
                parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m = -1;
            this.q = false;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.a = 1;
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return d(layoutParams);
    }

    @Override // android.view.View
    public final void setStateListAnimator(StateListAnimator stateListAnimator) {
    }
}
