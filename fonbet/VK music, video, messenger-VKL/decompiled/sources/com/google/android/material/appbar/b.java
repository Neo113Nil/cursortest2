package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import xsna.am;
import xsna.hk;

/* compiled from: AppBarLayout.java */
/* loaded from: classes13.dex */
public final class b extends hk {
    public final /* synthetic */ AppBarLayout b;
    public final /* synthetic */ CoordinatorLayout c;
    public final /* synthetic */ AppBarLayout.BaseBehavior d;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.d = baseBehavior;
        this.b = appBarLayout;
        this.c = coordinatorLayout;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        amVar.n(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.b;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.c;
        AppBarLayout.BaseBehavior baseBehavior = this.d;
        View N = AppBarLayout.BaseBehavior.N(baseBehavior, coordinatorLayout);
        if (N == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((AppBarLayout.d) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                if (baseBehavior.E() != (-appBarLayout.getTotalScrollRange())) {
                    amVar.b(am.a.i);
                    amVar.y(true);
                }
                if (baseBehavior.E() != 0) {
                    if (!N.canScrollVertically(-1)) {
                        amVar.b(am.a.j);
                        amVar.y(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            amVar.b(am.a.j);
                            amVar.y(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // xsna.hk
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.b;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.d;
        if (baseBehavior.E() != 0) {
            CoordinatorLayout coordinatorLayout = this.c;
            View N = AppBarLayout.BaseBehavior.N(baseBehavior, coordinatorLayout);
            if (!N.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                baseBehavior.r(coordinatorLayout, this.b, N, 0, i2, new int[]{0, 0}, 1);
                return true;
            }
        }
        return false;
    }
}
