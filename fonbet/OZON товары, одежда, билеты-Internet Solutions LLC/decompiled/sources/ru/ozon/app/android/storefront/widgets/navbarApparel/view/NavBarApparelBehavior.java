package ru.ozon.app.android.storefront.widgets.navbarApparel.view;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarApparel/view/NavBarApparelBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Lru/ozon/app/android/storefront/widgets/navbarApparel/view/NavBarApparelView;", "Lcom/google/android/material/appbar/AppBarLayout;", "dependentView", "<init>", "(Lcom/google/android/material/appbar/AppBarLayout;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "", "layoutDirection", "", "onLayoutChild", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lru/ozon/app/android/storefront/widgets/navbarApparel/view/NavBarApparelView;I)Z", "Landroid/view/View;", "dependency", "layoutDependsOn", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lru/ozon/app/android/storefront/widgets/navbarApparel/view/NavBarApparelView;Landroid/view/View;)Z", "Lcom/google/android/material/appbar/AppBarLayout;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavBarApparelBehavior extends CoordinatorLayout.c<NavBarApparelView> {
    private final AppBarLayout dependentView;

    public NavBarApparelBehavior(AppBarLayout appBarLayout) {
        this.dependentView = appBarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull NavBarApparelView child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return dependency instanceof AppBarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull NavBarApparelView child, int layoutDirection) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.dependentView == null) {
            return false;
        }
        child.setY(r1.getTop());
        return false;
    }
}
