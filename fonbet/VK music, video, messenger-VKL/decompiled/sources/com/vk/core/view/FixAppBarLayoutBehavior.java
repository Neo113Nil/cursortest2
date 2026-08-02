package com.vk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import xsna.iut0;

/* loaded from: classes17.dex */
public class FixAppBarLayoutBehavior extends AppBarExpandableControllerBehaviour {
    public FixAppBarLayoutBehavior() {
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: S */
    public final void r(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        super.r(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        if (i3 == 1) {
            int D = D();
            if ((i2 >= 0 || D != 0) && (i2 <= 0 || D != (-appBarLayout.getTotalScrollRange()))) {
                return;
            }
            iut0.u(view);
        }
    }

    @Override // com.vk.core.view.AppBarExpandableControllerBehaviour, com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: U */
    public final boolean z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        return this.q;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        super.t(coordinatorLayout, appBarLayout, view2, i, i2, i3, i4, i5);
        if (i5 == 1) {
            int D = D();
            if ((i4 >= 0 || D != 0) && (i4 <= 0 || D != (-appBarLayout.getTotalScrollRange()))) {
                return;
            }
            iut0.u(view2);
        }
    }

    @Override // com.vk.core.view.AppBarExpandableControllerBehaviour, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return this.q;
    }

    public FixAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
