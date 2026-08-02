package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/PageModifier;", "", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "attachToPage", "", "composerRootView", "Landroid/view/ViewGroup;", "detachFromPage", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PageModifier {

    @NotNull
    private final View containerView;

    public PageModifier(@NotNull View containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    public final void attachToPage(@NotNull ViewGroup composerRootView) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        SwipeRefreshLayout composerSwipeRefresh = ComposerViewExtensionKt.composerSwipeRefresh(composerRootView);
        if (composerSwipeRefresh != null) {
            ViewExtKt.gone(composerSwipeRefresh);
        }
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(composerRootView);
        if (composerCoordinatorLayout != null) {
            composerCoordinatorLayout.addView(this.containerView, 0);
        }
    }

    public final void detachFromPage(@NotNull ViewGroup composerRootView) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(composerRootView);
        if (composerCoordinatorLayout != null) {
            composerCoordinatorLayout.removeView(this.containerView);
        }
        SwipeRefreshLayout composerSwipeRefresh = ComposerViewExtensionKt.composerSwipeRefresh(composerRootView);
        if (composerSwipeRefresh != null) {
            ViewExtKt.show(composerSwipeRefresh);
        }
    }
}
