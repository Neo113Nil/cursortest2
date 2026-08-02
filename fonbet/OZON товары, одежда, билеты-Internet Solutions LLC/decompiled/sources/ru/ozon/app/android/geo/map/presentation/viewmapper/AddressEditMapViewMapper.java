package ru.ozon.app.android.geo.map.presentation.viewmapper;

import A00.a;
import BZ.e;
import Pc.a;
import Vg.d;
import android.content.Context;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import i10.k;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.geo.map.DetailsSheetManager;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationLoadingService;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.di.AddressEditMapComponent;
import ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsSender;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapMapper;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl;
import ru.ozon.app.android.geo.mapupdater.MapUpdateEvent;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider;
import ru.ozon.app.android.mapcommon.mapcommon.MapUpdateManager;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModelImpl;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020K0.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u00101R\u0018\u0010R\u001a\u00060Nj\u0002`O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewMapper;", "Lc20/r;", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "Lru/ozon/app/android/geo/map/di/AddressEditMapComponent;", "component", "<init>", "(Lru/ozon/app/android/geo/map/di/AddressEditMapComponent;)V", "state", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "getSelectorType", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;)Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/geo/map/data/AddressEditMapDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "Lru/ozon/app/android/geo/map/di/AddressEditMapComponent;", "Ljava/lang/Class;", "Lru/ozon/app/android/geo/mapupdater/MapUpdateEvent;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewHolder;", "addressEditMapViewHolder", "Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewHolder;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapMapper;", "getMapper", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModelImpl;", "getPViewModel", "()LPc/a;", "pViewModel", "Lru/ozon/app/android/geo/map/DetailsSheetManager;", "getDetailsSheetManager", "()Lru/ozon/app/android/geo/map/DetailsSheetManager;", "detailsSheetManager", "Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "getOzonMapProvider", "()Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "ozonMapProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/composer/ComposerNavigator;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender;", "getMapPerformanceAnalyticsSender", "()Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender;", "mapPerformanceAnalyticsSender", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModelImpl;", "getPShowYandexSearchSheetViewModel", "pShowYandexSearchSheetViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "getMapUpdateManager", "()Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "mapUpdateManager", "LBZ/e;", "getMiniAppConfigHolder", "()LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;", "getClusterizationLoadingService", "()Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;", "clusterizationLoadingService", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapViewMapper extends r<AddressEditMapDTO, AddressEditMapVO> {
    private AddressEditMapViewHolder addressEditMapViewHolder;

    @NotNull
    private final AddressEditMapComponent component;

    @NotNull
    private final List<Class<MapUpdateEvent>> supportedUpdates;

    @NotNull
    private final r.a viewType;

    public AddressEditMapViewMapper(@NotNull AddressEditMapComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.a0(MapUpdateEvent.class);
        this.viewType = r.a.SINGLE;
    }

    private final AppType getAppType() {
        return this.component.getAppType();
    }

    private final ClusterizationLoadingService getClusterizationLoadingService() {
        return this.component.getClusterizationLoadingService();
    }

    private final ComposerNavigator getComposerNavigator() {
        return this.component.getComposerNavigator();
    }

    private final d getCustomActionHandlersStoreFactory() {
        return this.component.getCustomActionHandlersStoreFactory();
    }

    private final DetailsSheetManager getDetailsSheetManager() {
        return this.component.getDetailsSheetManager();
    }

    private final FeatureChecker getFeatureChecker() {
        return this.component.getFeatureChecker();
    }

    private final FeatureService getFeatureService() {
        return this.component.getFeatureService();
    }

    private final MapPerformanceAnalyticsSender getMapPerformanceAnalyticsSender() {
        return this.component.getMapPerformanceAnalyticsSender();
    }

    private final MapUpdateManager getMapUpdateManager() {
        return this.component.getMapUpdateManager();
    }

    private final AddressEditMapMapper getMapper() {
        return this.component.getMapper();
    }

    private final e getMiniAppConfigHolder() {
        return this.component.getMiniAppConfigHolder();
    }

    private final OzonMapProvider getOzonMapProvider() {
        return this.component.getOzonMapProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a<YandexSearchSheetSharedViewModelImpl> getPShowYandexSearchSheetViewModel() {
        return this.component.getPShowYandexSearchSheetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a<AddressEditMapViewModelImpl> getPViewModel() {
        return this.component.getPViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressEditMapDTO.Selector.Type getSelectorType(AddressEditMapVO state) {
        Object obj;
        AddressEditMapDTO.Selector.Type type;
        if (state == null) {
            return AddressEditMapDTO.Selector.Type.TYPE_INVALID;
        }
        if (state.getSelector() == null) {
            return state.getShowCenterPin() ? AddressEditMapDTO.Selector.Type.TYPE_COURIER : AddressEditMapDTO.Selector.Type.TYPE_PICKUP_POINT;
        }
        Iterator<T> it = state.getSelector().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AddressEditMapVO.Selector) obj).getSelected()) {
                break;
            }
        }
        AddressEditMapVO.Selector selector = (AddressEditMapVO.Selector) obj;
        return (selector == null || (type = selector.getType()) == null) ? AddressEditMapDTO.Selector.Type.TYPE_INVALID : type;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    @Override // c20.r
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC6065b<AddressEditMapVO> createHolder(@NotNull i container) {
        boolean z11;
        boolean z12;
        Object obj;
        AddressEditMapVO addressEditMapVO;
        List<l> a11;
        Object obj2;
        Intrinsics.checkNotNullParameter(container, "container");
        AddressEditMapViewModelImpl addressEditMapViewModelImpl = (AddressEditMapViewModelImpl) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a pViewModel;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                pViewModel = AddressEditMapViewMapper.this.getPViewModel();
                AddressEditMapViewModelImpl addressEditMapViewModelImpl2 = (AddressEditMapViewModelImpl) pViewModel.get();
                Intrinsics.g(addressEditMapViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return addressEditMapViewModelImpl2;
            }
        }).a(AddressEditMapViewModelImpl.class);
        Intrinsics.f(addressEditMapViewModelImpl);
        w0 a12 = new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewMapper$createHolder$lambda$3$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a pShowYandexSearchSheetViewModel;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                pShowYandexSearchSheetViewModel = AddressEditMapViewMapper.this.getPShowYandexSearchSheetViewModel();
                YandexSearchSheetSharedViewModelImpl yandexSearchSheetSharedViewModelImpl = (YandexSearchSheetSharedViewModelImpl) pShowYandexSearchSheetViewModel.get();
                Intrinsics.g(yandexSearchSheetSharedViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return yandexSearchSheetSharedViewModelImpl;
            }
        }).a(YandexSearchSheetSharedViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        YandexSearchSheetSharedViewModelImpl yandexSearchSheetSharedViewModelImpl = (YandexSearchSheetSharedViewModelImpl) a12;
        ComposerNavigator composerNavigator = getComposerNavigator();
        MapPerformanceAnalyticsSender mapPerformanceAnalyticsSender = getMapPerformanceAnalyticsSender();
        DetailsSheetManager detailsSheetManager = getDetailsSheetManager();
        OzonMapProvider ozonMapProvider = getOzonMapProvider();
        FeatureChecker featureChecker = getFeatureChecker();
        FeatureService featureService = getFeatureService();
        d customActionHandlersStoreFactory = getCustomActionHandlersStoreFactory();
        MapUpdateManager mapUpdateManager = getMapUpdateManager();
        e miniAppConfigHolder = getMiniAppConfigHolder();
        if (getAppType() == AppType.SELECT) {
            z12 = true;
            z11 = true;
        } else {
            z11 = false;
            z12 = true;
        }
        AddressEditMapViewHolder addressEditMapViewHolder = new AddressEditMapViewHolder(container, addressEditMapViewModelImpl, yandexSearchSheetSharedViewModelImpl, composerNavigator, customActionHandlersStoreFactory, mapUpdateManager, getClusterizationLoadingService(), mapPerformanceAnalyticsSender, detailsSheetManager, ozonMapProvider, featureChecker, featureService, miniAppConfigHolder, z11);
        this.addressEditMapViewHolder = addressEditMapViewHolder;
        k.b<l> h11 = container.J().r().b().h();
        if (h11 != null && (a11 = h11.a()) != null) {
            Iterator<T> it = a11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((l) obj2).d() instanceof AddressEditMapVO) {
                    break;
                }
            }
            l lVar = (l) obj2;
            if (lVar != null) {
                obj = lVar.d();
                addressEditMapVO = obj instanceof AddressEditMapVO ? (AddressEditMapVO) obj : null;
                if (addressEditMapVO != null && addressEditMapVO.getIsNeedStartClusterization() == z12) {
                    addressEditMapViewModelImpl.startClusterizationIfNeeded(addressEditMapVO.getClusterizationEnabled());
                }
                Context context = container.Z().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                addressEditMapViewModelImpl.fetchGeoProviders(context, new AddressEditMapViewMapper$createHolder$2$2(this, addressEditMapVO, addressEditMapViewModelImpl));
                return addressEditMapViewHolder;
            }
        }
        obj = null;
        if (obj instanceof AddressEditMapVO) {
        }
        if (addressEditMapVO != null) {
            addressEditMapViewModelImpl.startClusterizationIfNeeded(addressEditMapVO.getClusterizationEnabled());
        }
        Context context2 = container.Z().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        addressEditMapViewModelImpl.fetchGeoProviders(context2, new AddressEditMapViewMapper$createHolder$2$2(this, addressEditMapVO, addressEditMapViewModelImpl));
        return addressEditMapViewHolder;
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<MapUpdateEvent>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r, I00.d
    public AddressEditMapVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AddressEditMapVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof MapUpdateEvent)) {
            return null;
        }
        MapUpdateEvent mapUpdateEvent = (MapUpdateEvent) update;
        return AddressEditMapVO.copy$default(oldItem, 0L, false, null, null, null, null, mapUpdateEvent.getViewPort(), mapUpdateEvent.getLink(), null, null, null, null, null, false, null, null, null, null, true, false, false, null, null, null, null, false, false, null, null, 536608575, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AddressEditMapVO> map(@NotNull AddressEditMapDTO state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
