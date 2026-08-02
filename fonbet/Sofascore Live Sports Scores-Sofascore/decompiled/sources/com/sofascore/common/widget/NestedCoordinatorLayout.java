package com.sofascore.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.o9d;
import defpackage.p9d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/common/widget/NestedCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "", "", "enabled", "", "setNestedScrollingEnabled", "(Z)V", "common_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NestedCoordinatorLayout extends CoordinatorLayout implements o9d {
    public final p9d y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedCoordinatorLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        p9d p9dVar = new p9d(this);
        p9dVar.g(true);
        this.y = p9dVar;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, defpackage.q9d
    public final void b(int i, View view) {
        view.getClass();
        super.b(i, view);
        this.y.i(i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, defpackage.q9d
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        view.getClass();
        iArr.getClass();
        int[] iArr2 = {0, 0};
        dispatchNestedPreScroll(i, i2, iArr, null);
        if (iArr[1] == 0) {
            super.d(view, i, i2, iArr2, i3);
            iArr[0] = iArr2[0];
            iArr[1] = iArr2[1];
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.y.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.y.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.y.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.y.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, defpackage.r9d
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        view.getClass();
        iArr.getClass();
        int[] iArr2 = {0, r4};
        view.getLocationInWindow(iArr2);
        super.g(view, i, i2, i3, i4, i5, iArr);
        int i6 = iArr2[1];
        view.getLocationInWindow(iArr2);
        int i7 = iArr2[1] - i6;
        this.y.d(i, i2, i3, i4 + i7, null, i5, iArr);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, defpackage.q9d
    public final void h(View view, int i, int i2, int i3, int i4, int i5) {
        view.getClass();
        super.h(view, i, i2, i3, i4, i5);
        this.y.d(i, i2, i3, i4, null, i5, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.y.f(0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, defpackage.q9d
    public final boolean i(View view, View view2, int i, int i2) {
        view.getClass();
        view2.getClass();
        return this.y.h(i, i2) || super.i(view, view2, i, i2);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.y.d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        view.getClass();
        super.onNestedFling(view, f, f2, z);
        return this.y.a(f, f2, z);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        view.getClass();
        return this.y.b(f, f2) || super.onNestedPreFling(view, f, f2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        view.getClass();
        iArr.getClass();
        int[] iArr2 = {0, 0};
        dispatchNestedPreScroll(i, i2, iArr, null);
        if (iArr[1] == 0) {
            super.d(view, i, i2, iArr2, 0);
            iArr[0] = iArr2[0];
            iArr[1] = iArr2[1];
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        view.getClass();
        h(view, i, i2, i3, i4, 0);
        dispatchNestedScroll(i, i2, i3, i4, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        view.getClass();
        view2.getClass();
        return startNestedScroll(i) || i(view, view2, i, 0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        view.getClass();
        b(0, view);
        stopNestedScroll();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean enabled) {
        this.y.g(enabled);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.y.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.y.i(0);
    }
}
