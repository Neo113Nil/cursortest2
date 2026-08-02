package ru.ozon.uni.android.notificationbar;

import android.view.View;
import android.view.animation.Animation;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.notificationbar.view.NotificationBarContainerView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/android/notificationbar/NotificationBarBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView;", "Landroid/view/View;", "anchor", "", "calculateTranslationY", "(Landroid/view/View;)F", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "", "layoutDirection", "", "onLayoutChild", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView;I)Z", "dependency", "layoutDependsOn", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lru/ozon/uni/android/notificationbar/view/NotificationBarContainerView;Landroid/view/View;)Z", "onDependentViewChanged", "anchorId", "I", "isFirstLayout", "Z", "anchorView", "Landroid/view/View;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationBarBehavior extends CoordinatorLayout.c<NotificationBarContainerView> {
    private final int anchorId;
    private View anchorView;
    private boolean isFirstLayout;

    private final float calculateTranslationY(View anchor) {
        return anchor.getTranslationY();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull NotificationBarContainerView child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return dependency.getId() == this.anchorId;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(@NotNull CoordinatorLayout parent, @NotNull NotificationBarContainerView child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        child.setOriginalTranslationY$uni_release(calculateTranslationY(dependency));
        Animation animation = child.getAnimation();
        if (animation != null && animation.hasStarted()) {
            return false;
        }
        Animation animation2 = child.getAnimation();
        if (animation2 != null && !animation2.hasEnded()) {
            return false;
        }
        child.setTranslationY(child.getOriginalTranslationY());
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull NotificationBarContainerView child, int layoutDirection) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.isFirstLayout) {
            this.isFirstLayout = false;
            View findViewById = parent.findViewById(this.anchorId);
            this.anchorView = findViewById;
            if (findViewById != null) {
                child.setOriginalTranslationY$uni_release(calculateTranslationY(findViewById));
            }
        }
        return false;
    }
}
