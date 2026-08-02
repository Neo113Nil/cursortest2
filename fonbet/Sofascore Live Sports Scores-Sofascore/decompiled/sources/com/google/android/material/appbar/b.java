package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.da;
import defpackage.p9;
import defpackage.ta0;
import defpackage.x9;
import defpackage.xs3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b extends p9 {
    public final /* synthetic */ AppBarLayout d;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ AppBarLayout.BaseBehavior f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f = baseBehavior;
        this.d = appBarLayout;
        this.e = coordinatorLayout;
    }

    @Override // defpackage.p9
    public final void d(View view, da daVar) {
        View view2;
        this.a.onInitializeAccessibilityNodeInfo(view, daVar.a);
        daVar.k(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.e;
        int childCount = coordinatorLayout.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                view2 = null;
                break;
            }
            view2 = coordinatorLayout.getChildAt(i);
            if (((xs3) view2.getLayoutParams()).a instanceof AppBarLayout.ScrollingViewBehavior) {
                break;
            } else {
                i++;
            }
        }
        if (view2 == null) {
            return;
        }
        int childCount2 = appBarLayout.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            if (((ta0) appBarLayout.getChildAt(i2).getLayoutParams()).a != 0) {
                AppBarLayout.BaseBehavior baseBehavior = this.f;
                if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                    daVar.b(x9.h);
                    daVar.q(true);
                }
                if (baseBehavior.y() != 0) {
                    if (!view2.canScrollVertically(-1)) {
                        daVar.b(x9.i);
                        daVar.q(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            daVar.b(x9.i);
                            daVar.q(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.p9
    public final boolean g(View view, int i, Bundle bundle) {
        View view2;
        AppBarLayout appBarLayout = this.d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f;
        if (baseBehavior.y() != 0) {
            CoordinatorLayout coordinatorLayout = this.e;
            int childCount = coordinatorLayout.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    view2 = null;
                    break;
                }
                view2 = coordinatorLayout.getChildAt(i2);
                if (((xs3) view2.getLayoutParams()).a instanceof AppBarLayout.ScrollingViewBehavior) {
                    break;
                }
                i2++;
            }
            View view3 = view2;
            if (!view3.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i3 = -appBarLayout.getDownNestedPreScrollRange();
            if (i3 != 0) {
                baseBehavior.D(coordinatorLayout, this.d, view3, i3, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
