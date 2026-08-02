package com.vk.content.tool.view.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vkontakte.android.R;
import xsna.q160;
import xsna.s160;
import xsna.swe0;

/* compiled from: NestedOrderedCoordinatorLayout.kt */
/* loaded from: classes17.dex */
public final class NestedOrderedCoordinatorLayout extends CoordinatorLayout implements q160 {
    public final s160 z;

    public NestedOrderedCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.z = new s160(this);
        setNestedScrollingEnabled(true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.t160
    public final void H0(View view, int i, int i2, int i3, int i4, int i5) {
        super.H0(view, i, i2, i3, i4, i5);
        this.z.d(i, i2, i3, i4, null, i5, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.u160
    public final void a2(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        this.z.d(i, i2, i3, i4, null, i5, null);
        super.a2(view, i, i2, i3, i4, i5, iArr);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.t160
    public final void c0(int i, View view) {
        super.c0(i, view);
        stopNestedScroll(i);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.z.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.z.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.z.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.z.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.t160
    public final boolean h4(View view, View view2, int i, int i2) {
        return this.z.h(i, i2) || super.h4(view, view2, i, i2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.z.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.z.d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        super.onNestedFling(view, f, f2, z);
        return this.z.a(f, f2, z);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.z.b(f, f2) || super.onNestedPreFling(view, f, f2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        w0(view, i, i2, iArr, 0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        H0(view, i, i2, i3, i4, 0);
        dispatchNestedScroll(i, i2, i3, i4, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return startNestedScroll(i) || h4(view, view2, i, 0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c0(0, view);
        stopNestedScroll();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.t160
    public final void s1(View view, int i, int i2, int[] iArr, int i3) {
        w0(view, i, i2, iArr, i3);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.z.g(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.z.h(i, 0);
    }

    @Override // xsna.q160
    public final void stopNestedScroll(int i) {
        this.z.i(i);
    }

    public final void w0(View view, int i, int i2, int[] iArr, int i3) {
        int[] iArr2;
        int[] iArr3 = {0, 0};
        int[] iArr4 = {0, 0};
        boolean z = i + i2 > 0;
        if (z) {
            this.z.c(i, i2, iArr3, null, i3);
        } else {
            super.s1(view, i, i2, iArr3, i3);
        }
        if (iArr3[0] != 0 || iArr3[1] != 0) {
            iArr2 = iArr4;
        } else if (z) {
            super.s1(view, i, i2, iArr4, i3);
            iArr2 = iArr4;
        } else {
            iArr2 = iArr4;
            this.z.c(i, i2, iArr2, null, i3);
        }
        iArr[0] = swe0.g(iArr3[0] + iArr2[0], -Math.abs(i), Math.abs(i));
        iArr[1] = swe0.g(iArr3[1] + iArr2[1], -Math.abs(i2), Math.abs(i2));
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.z.i(0);
    }
}
