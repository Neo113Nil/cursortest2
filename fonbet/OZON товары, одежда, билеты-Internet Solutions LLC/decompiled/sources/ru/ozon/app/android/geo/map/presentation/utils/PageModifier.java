package ru.ozon.app.android.geo.map.presentation.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/utils/PageModifier;", "", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "attachToPage", "", "composerRootView", "Landroid/view/ViewGroup;", "detachFromPage", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PageModifier {

    @NotNull
    private final View containerView;

    public PageModifier(@NotNull View containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    public final void attachToPage(@NotNull ViewGroup composerRootView) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(composerRootView);
        if (composerCoordinatorLayout != null) {
            RecyclerView composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(composerRootView);
            SwipeRefreshLayout composerSwipeRefresh = ComposerViewExtensionKt.composerSwipeRefresh(composerRootView);
            if (composerSwipeRefresh != null) {
                ViewExtKt.gone(composerSwipeRefresh);
                composerSwipeRefresh.removeView(composerRecyclerView);
                CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -2);
                fVar.f41884c = 80;
                Unit unit = Unit.f71690a;
                composerCoordinatorLayout.addView(composerRecyclerView, fVar);
            }
            ViewGroup.LayoutParams layoutParams = composerRecyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            composerCoordinatorLayout.addView(this.containerView, 0);
        }
    }

    public final void detachFromPage(@NotNull ViewGroup composerRootView) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(composerRootView);
        if (composerCoordinatorLayout == null || (viewGroup = (ViewGroup) composerCoordinatorLayout.findViewById(R$id.containerLayout)) == null) {
            return;
        }
        composerCoordinatorLayout.removeView(viewGroup);
        RecyclerView composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(composerRootView);
        SwipeRefreshLayout composerSwipeRefresh = ComposerViewExtensionKt.composerSwipeRefresh(composerRootView);
        if (composerSwipeRefresh != null) {
            composerCoordinatorLayout.removeView(composerRecyclerView);
            composerSwipeRefresh.addView(composerRecyclerView, new CoordinatorLayout.f(-1, -1));
            ViewExtKt.show(composerSwipeRefresh);
        }
        ViewGroup.LayoutParams layoutParams = composerRecyclerView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
    }
}
