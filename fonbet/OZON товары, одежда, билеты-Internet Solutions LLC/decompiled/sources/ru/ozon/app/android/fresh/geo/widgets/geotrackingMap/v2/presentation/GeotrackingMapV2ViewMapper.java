package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.fresh.common.flags.FreshControlCourierAnimation;
import ru.ozon.app.android.fresh.geo.R$layout;
import ru.ozon.app.android.fresh.geo.databinding.WidgetGeotrackingMapV2Binding;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.data.GeotrackingMapV2DTO;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2Component;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J+\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00020&j\b\u0012\u0004\u0012\u00020\u0002`'2\n\u0010%\u001a\u00060#j\u0002`$H\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/di/GeotrackingMapV2Component;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2VO;", "<init>", "()V", "Landroid/view/ViewGroup;", "composerRootView", "Ll10/i;", "container", "", "initOzonMapAsync", "(Landroid/view/ViewGroup;Ll10/i;)V", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel;", "viewModel", "setupBinder", "(Ll10/i;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel;)V", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2Binder;", "createBinderInstance", "(Ll10/i;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModel;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2Binder;", "Landroidx/fragment/app/m;", "fragment", "setupPortraitWindow", "(Landroidx/fragment/app/m;)V", "clearWindow", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/data/GeotrackingMapV2DTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "binder", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2Binder;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/PageModifier;", "pageModifier", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/PageModifier;", "Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "getOzonMapProvider", "()Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "ozonMapProvider", "Lru/ozon/app/android/composer/ComposerNavigator;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeotrackingMapV2ViewMapper extends OverlayWidgetScreenViewItemMapper2<GeotrackingMapV2Component, GeotrackingMapV2DTO, GeotrackingMapV2VO> {
    private GeotrackingMapV2Binder binder;
    private PageModifier pageModifier;

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearWindow(ComponentCallbacksC5392m fragment) {
        View view = fragment.getView();
        if (view != null) {
            view.setFitsSystemWindows(true);
        }
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        Window window = fragment.requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        statusBarController.setFullScreenWindow(window, false);
        StatusBarController.setStatusBarColorByTheme$default(statusBarController, fragment, StatusBarController.UpdateReason.Recovery.INSTANCE, 0, 4, null);
    }

    private final GeotrackingMapV2Binder createBinderInstance(i container, GeotrackingMapV2ViewModel viewModel) {
        return new GeotrackingMapV2Binder(container, viewModel, getComposerNavigator());
    }

    private final ComposerNavigator getComposerNavigator() {
        return component().getComposerNavigator();
    }

    private final OzonMapProvider getOzonMapProvider() {
        return component().getOzonMapProvider();
    }

    private final void initOzonMapAsync(ViewGroup composerRootView, i container) {
        GeotrackingMapV2Binder geotrackingMapV2Binder;
        View inflate = ViewGroupExtKt.inflate(composerRootView, R$layout.widget_geotracking_map_v2);
        Intrinsics.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        WidgetGeotrackingMapV2Binding bind = WidgetGeotrackingMapV2Binding.bind((ViewGroup) inflate);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        OzonMapProvider ozonMapProvider = getOzonMapProvider();
        FrameLayout mapContainer = bind.mapContainer;
        Intrinsics.checkNotNullExpressionValue(mapContainer, "mapContainer");
        OzonMapController provideMapController = ozonMapProvider.provideMapController(mapContainer);
        this.pageModifier = new PageModifier(bind, composerRootView, new GeotrackingMapV2ViewMapper$initOzonMapAsync$1(this));
        setupBinder(container, component().getViewModel());
        PageModifier pageModifier = this.pageModifier;
        if (pageModifier != null && (geotrackingMapV2Binder = this.binder) != null) {
            geotrackingMapV2Binder.setPageModifier(pageModifier);
        }
        GeotrackingMapV2Binder geotrackingMapV2Binder2 = this.binder;
        if (geotrackingMapV2Binder2 != null) {
            Context context = bind.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GeotrackingMapIconProviderV2 geotrackingMapIconProviderV2 = new GeotrackingMapIconProviderV2(provideMapController, component().getNetworkImageDataLoader(), context, component().getTokenizedAnalytics(), Intrinsics.d(component().getMapProviderName(), GeoProviderConfig.SdkType.MapLibre.INSTANCE) && component().getFeatureChecker().isEnabled(FreshControlCourierAnimation.INSTANCE));
            geotrackingMapIconProviderV2.resetPins();
            geotrackingMapV2Binder2.setView(new GeotrackingMapV2View(bind, container, provideMapController, geotrackingMapIconProviderV2));
        }
        PageModifier pageModifier2 = this.pageModifier;
        if (pageModifier2 != null) {
            pageModifier2.attachToPage();
        }
        C10727i.c(K.a(container.K().f()), null, null, new GeotrackingMapV2ViewMapper$initOzonMapAsync$4(provideMapController, this, container, null), 3);
    }

    private final void setupBinder(i container, GeotrackingMapV2ViewModel viewModel) {
        GeotrackingMapV2Binder geotrackingMapV2Binder;
        GeotrackingMapV2Binder geotrackingMapV2Binder2 = this.binder;
        if (geotrackingMapV2Binder2 == null) {
            geotrackingMapV2Binder = createBinderInstance(container, viewModel);
        } else if (geotrackingMapV2Binder2 == null || geotrackingMapV2Binder2.checkValidity(container)) {
            geotrackingMapV2Binder = this.binder;
        } else {
            GeotrackingMapV2Binder geotrackingMapV2Binder3 = this.binder;
            if (geotrackingMapV2Binder3 != null) {
                geotrackingMapV2Binder3.dispose();
            }
            geotrackingMapV2Binder = createBinderInstance(container, viewModel);
        }
        this.binder = geotrackingMapV2Binder;
    }

    private final void setupPortraitWindow(ComponentCallbacksC5392m fragment) {
        View view = fragment.getView();
        if (view != null) {
            view.setFitsSystemWindows(false);
        }
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        Window window = fragment.requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        statusBarController.setFullScreenWindow(window, true);
        statusBarController.setStatusBarBackgroundColor(fragment, StatusBarController.UpdateReason.NewState.INSTANCE, 0);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<GeotrackingMapV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ComponentCallbacksC5392m h11 = container.K().h();
        setupPortraitWindow(h11);
        initOzonMapAsync(container.Z(), container);
        return new GeotrackingMapV2ViewHolder((GeotrackingMapV2ViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                GeotrackingMapV2ViewModelImpl viewModel = GeotrackingMapV2ViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(GeotrackingMapV2ViewModelImpl.class), new GeotrackingMapV2ViewMapper$createHolder$2(this, h11));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<GeotrackingMapV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return GeotrackingMapV2Component.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<GeotrackingMapV2VO> map(@NotNull GeotrackingMapV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
