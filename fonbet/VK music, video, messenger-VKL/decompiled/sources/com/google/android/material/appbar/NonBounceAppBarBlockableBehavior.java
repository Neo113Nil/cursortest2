package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import xsna.iut0;

/* compiled from: NonBounceAppBarBlockableBehavior.kt */
/* loaded from: classes13.dex */
public final class NonBounceAppBarBlockableBehavior extends NonBouncedAppBarLayout.Behavior {
    public boolean r;

    public NonBounceAppBarBlockableBehavior() {
        this.r = true;
    }

    @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.Behavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: O */
    public final void r(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        super.r(coordinatorLayout, nonBouncedAppBarLayout, view, i, i2, iArr, i3);
        if (i3 == 1) {
            int D = D();
            if ((i2 >= 0 || D != 0) && (i2 <= 0 || D != (-nonBouncedAppBarLayout.getTotalScrollRange()))) {
                return;
            }
            iut0.u(view);
        }
    }

    @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.Behavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: P */
    public final void t(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        super.t(coordinatorLayout, nonBouncedAppBarLayout, view, i, i2, i3, i4, i5);
        if (i5 == 1) {
            int D = D();
            if ((i4 >= 0 || D != 0) && (i4 <= 0 || D != (-nonBouncedAppBarLayout.getTotalScrollRange()))) {
                return;
            }
            iut0.u(view);
        }
    }

    @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.Behavior
    public final boolean Q(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, View view, int i) {
        return this.r;
    }

    @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.Behavior, xsna.dwu, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: R */
    public final boolean C(CoordinatorLayout coordinatorLayout, NonBouncedAppBarLayout nonBouncedAppBarLayout, MotionEvent motionEvent) {
        if (this.r) {
            return super.C(coordinatorLayout, nonBouncedAppBarLayout, motionEvent);
        }
        return false;
    }

    @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.Behavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return this.r;
    }

    public NonBounceAppBarBlockableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = true;
    }
}
