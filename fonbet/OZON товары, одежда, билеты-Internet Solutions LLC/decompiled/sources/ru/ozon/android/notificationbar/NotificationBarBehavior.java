package ru.ozon.android.notificationbar;

import android.view.View;
import android.view.animation.Animation;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.notificationbar.view.NotificationBarContainerView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/ozon/android/notificationbar/NotificationBarBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Lru/ozon/android/notificationbar/view/NotificationBarContainerView;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NotificationBarBehavior extends CoordinatorLayout.c<NotificationBarContainerView> {
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean layoutDependsOn(CoordinatorLayout parent, NotificationBarContainerView notificationBarContainerView, View dependency) {
        NotificationBarContainerView child = notificationBarContainerView;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return dependency.getId() == 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onDependentViewChanged(CoordinatorLayout parent, NotificationBarContainerView notificationBarContainerView, View dependency) {
        NotificationBarContainerView child = notificationBarContainerView;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        child.b(dependency.getTranslationY());
        Animation animation = child.getAnimation();
        if (animation != null && animation.hasStarted()) {
            return false;
        }
        Animation animation2 = child.getAnimation();
        if (animation2 != null && !animation2.hasEnded()) {
            return false;
        }
        child.setTranslationY(child.getF92027a());
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(CoordinatorLayout parent, NotificationBarContainerView notificationBarContainerView, int i11) {
        NotificationBarContainerView child = notificationBarContainerView;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return false;
    }
}
