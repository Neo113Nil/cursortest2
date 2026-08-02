package ru.ozon.app.android.geo.map.presentation.iconsadapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.databinding.MapBannerBinding;
import ru.ozon.app.android.geo.databinding.MapControlsV2Binding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.banner.MapBannerContainer;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.controls.MapControlsContainer;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u001b\u0010\u0012\u001a\u00020\n*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001c\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\fJ!\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R*\u00109\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010/¨\u0006@"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/iconsadapter/PageIconsAdapter;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/controls/MapControlsContainer;", "mapControlsContainer", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/banner/MapBannerContainer;", "mapBannerContainer", "<init>", "(Landroid/view/View;Lru/ozon/app/android/geo/map/presentation/iconsadapter/controls/MapControlsContainer;Lru/ozon/app/android/geo/map/presentation/iconsadapter/banner/MapBannerContainer;)V", "", "hideControls", "()V", "showControls", "removeControls", "removeBanner", "Landroidx/constraintlayout/widget/ConstraintLayout;", "bottomPanel", "repositionView", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;)V", "", "getViewBottomMargin", "(Landroid/view/View;)I", "", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon;", "items", "", "isSelectApp", "applyIconsState", "(Ljava/util/List;Z)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "bannerItem", "applyBannerState", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;Z)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;", "bannerState", "updateBannerState", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;)V", "detachFromPage", "Landroid/view/ViewGroup;", "composerRootView", "anchorView", "changeAnchor", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "bottomPanelView", "onSlide", "(Landroid/view/View;)V", "Landroid/view/View;", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/controls/MapControlsContainer;", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/banner/MapBannerContainer;", "Lru/ozon/app/android/geo/databinding/MapControlsV2Binding;", "controlsBinding", "Lru/ozon/app/android/geo/databinding/MapControlsV2Binding;", "Lru/ozon/app/android/geo/databinding/MapBannerBinding;", "bannerBinding", "Lru/ozon/app/android/geo/databinding/MapBannerBinding;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "controlsVisible", "Z", "getControlsVisible", "()Z", "setControlsVisible", "(Z)V", "anchor", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PageIconsAdapter {
    private View anchor;
    private MapBannerBinding bannerBinding;

    @NotNull
    private final View containerView;
    private MapControlsV2Binding controlsBinding;
    private boolean controlsVisible;

    @NotNull
    private final MapBannerContainer mapBannerContainer;

    @NotNull
    private final MapControlsContainer mapControlsContainer;

    public PageIconsAdapter(@NotNull View containerView, @NotNull MapControlsContainer mapControlsContainer, @NotNull MapBannerContainer mapBannerContainer) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(mapControlsContainer, "mapControlsContainer");
        Intrinsics.checkNotNullParameter(mapBannerContainer, "mapBannerContainer");
        this.containerView = containerView;
        this.mapControlsContainer = mapControlsContainer;
        this.mapBannerContainer = mapBannerContainer;
    }

    private final int getViewBottomMargin(View bottomPanel) {
        int[] iArr = new int[2];
        bottomPanel.getLocationOnScreen(iArr);
        return this.containerView.getTop() + (this.containerView.getHeight() - iArr[1]);
    }

    private final void hideControls() {
        ConstraintLayout constraintLayout;
        MapControlsV2Binding mapControlsV2Binding = this.controlsBinding;
        if (mapControlsV2Binding == null || (constraintLayout = mapControlsV2Binding.getConstraintLayout()) == null) {
            return;
        }
        ViewExtKt.gone(constraintLayout);
    }

    private final void removeBanner() {
        MapBannerBinding mapBannerBinding = this.bannerBinding;
        if (mapBannerBinding != null) {
            View view = this.containerView;
            Intrinsics.g(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) view).removeView(mapBannerBinding.getConstraintLayout());
            this.bannerBinding = null;
        }
    }

    private final void removeControls() {
        MapControlsV2Binding mapControlsV2Binding = this.controlsBinding;
        if (mapControlsV2Binding != null) {
            View view = this.containerView;
            Intrinsics.g(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) view).removeView(mapControlsV2Binding.getConstraintLayout());
            this.controlsBinding = null;
        }
    }

    private final void repositionView(ConstraintLayout constraintLayout, View view) {
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = getViewBottomMargin(view);
        constraintLayout.setLayoutParams(marginLayoutParams);
    }

    private final void showControls() {
        ConstraintLayout constraintLayout;
        MapControlsV2Binding mapControlsV2Binding = this.controlsBinding;
        if (mapControlsV2Binding == null || (constraintLayout = mapControlsV2Binding.getConstraintLayout()) == null) {
            return;
        }
        ViewExtKt.show(constraintLayout);
    }

    public final void applyBannerState(AddressEditMapVO.MapIcon.BannerIcon bannerItem, boolean isSelectApp) {
        if (this.bannerBinding == null) {
            removeBanner();
            this.bannerBinding = this.mapBannerContainer.getBannerBinding();
            View view = this.containerView;
            Intrinsics.g(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            MapBannerBinding mapBannerBinding = this.bannerBinding;
            viewGroup.addView(mapBannerBinding != null ? mapBannerBinding.getConstraintLayout() : null);
        }
        this.mapBannerContainer.bind(bannerItem, isSelectApp);
    }

    public final void applyIconsState(@NotNull List<? extends AddressEditMapVO.MapIcon> items, boolean isSelectApp) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (this.controlsBinding == null) {
            removeControls();
            this.controlsBinding = this.mapControlsContainer.getControlsBinding();
            View view = this.containerView;
            Intrinsics.g(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            MapControlsV2Binding mapControlsV2Binding = this.controlsBinding;
            viewGroup.addView(mapControlsV2Binding != null ? mapControlsV2Binding.getConstraintLayout() : null);
        }
        MapControlsContainer mapControlsContainer = this.mapControlsContainer;
        mapControlsContainer.bind(items, mapControlsContainer.getControlsBinding(), isSelectApp);
        if (this.controlsVisible) {
            showControls();
        } else {
            hideControls();
        }
    }

    public final void changeAnchor(@NotNull ViewGroup composerRootView, View anchorView) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        if (anchorView != null) {
            this.anchor = anchorView;
            onSlide(anchorView);
            return;
        }
        this.anchor = null;
        MapControlsV2Binding mapControlsV2Binding = this.controlsBinding;
        if (mapControlsV2Binding != null && (constraintLayout2 = mapControlsV2Binding.getConstraintLayout()) != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int bottom = composerRootView.getBottom();
            MapControlsV2Binding mapControlsV2Binding2 = this.controlsBinding;
            Intrinsics.f(mapControlsV2Binding2);
            int top = bottom - mapControlsV2Binding2.getConstraintLayout().getTop();
            if (top < 0) {
                top = 0;
            }
            layoutParams.height = top;
            constraintLayout2.setLayoutParams(layoutParams);
        }
        MapBannerBinding mapBannerBinding = this.bannerBinding;
        if (mapBannerBinding == null || (constraintLayout = mapBannerBinding.getConstraintLayout()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int bottom2 = composerRootView.getBottom();
        MapBannerBinding mapBannerBinding2 = this.bannerBinding;
        Intrinsics.f(mapBannerBinding2);
        int top2 = bottom2 - mapBannerBinding2.getConstraintLayout().getTop();
        layoutParams2.height = top2 >= 0 ? top2 : 0;
        constraintLayout.setLayoutParams(layoutParams2);
    }

    public final void detachFromPage() {
        removeControls();
        removeBanner();
    }

    public final void onSlide(@NotNull View bottomPanelView) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        Intrinsics.checkNotNullParameter(bottomPanelView, "bottomPanelView");
        View view = this.anchor;
        if (view != null) {
            bottomPanelView = view;
        }
        MapControlsV2Binding mapControlsV2Binding = this.controlsBinding;
        if (mapControlsV2Binding != null && (constraintLayout2 = mapControlsV2Binding.getConstraintLayout()) != null) {
            repositionView(constraintLayout2, bottomPanelView);
        }
        MapBannerBinding mapBannerBinding = this.bannerBinding;
        if (mapBannerBinding == null || (constraintLayout = mapBannerBinding.getConstraintLayout()) == null) {
            return;
        }
        repositionView(constraintLayout, bottomPanelView);
    }

    public final void setControlsVisible(boolean z11) {
        if (z11 == this.controlsVisible) {
            return;
        }
        this.controlsVisible = z11;
        if (z11) {
            showControls();
        } else {
            hideControls();
        }
    }

    public final void updateBannerState(@NotNull AddressEditMapViewModel.BannerState bannerState) {
        Intrinsics.checkNotNullParameter(bannerState, "bannerState");
        this.mapBannerContainer.updateState(bannerState);
    }
}
