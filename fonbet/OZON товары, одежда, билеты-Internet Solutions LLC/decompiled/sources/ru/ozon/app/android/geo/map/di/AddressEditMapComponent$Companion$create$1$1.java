package ru.ozon.app.android.geo.map.di;

import BZ.e;
import By.C2678b;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.eventstorage.di.EventStorageComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.geo.map.DetailsSheetManager;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationLoadingService;
import ru.ozon.app.android.geo.map.clusterization.di.ClusterizationComponentApi;
import ru.ozon.app.android.geo.map.di.AddressEditMapComponent$Companion$create$1$1;
import ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsSender;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapMapper;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapStateReducer;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl;
import ru.ozon.app.android.geoprovider.di.GeoProviderComponentApi;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider;
import ru.ozon.app.android.mapcommon.mapcommon.MapUpdateManager;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModelImpl;

@Metadata(d1 = {"\u0000Ñ\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\"\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010BR\u001e\u0010F\u001a\u00060Dj\u0002`E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010K\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010P\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010U\u001a\u00020T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010Z\u001a\u00020Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020_0^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020c0^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010a¨\u0006f"}, d2 = {"ru/ozon/app/android/geo/map/di/AddressEditMapComponent$Companion$create$1$1", "Lru/ozon/app/android/geo/map/di/AddressEditMapComponent;", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "locationComponentApi", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "Lru/ozon/app/android/mapcommon/map/di/OzonMapComponentApi;", "ozonMapComponentApi", "Lru/ozon/app/android/mapcommon/map/di/OzonMapComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/analytics/eventstorage/di/EventStorageComponentApi;", "eventStorageComponentApi", "Lru/ozon/app/android/analytics/eventstorage/di/EventStorageComponentApi;", "Lru/ozon/app/android/geoprovider/di/GeoProviderComponentApi;", "geoProviderComponentApi", "Lru/ozon/app/android/geoprovider/di/GeoProviderComponentApi;", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/geo/map/clusterization/di/ClusterizationComponentApi;", "clusterizationComponentApi", "Lru/ozon/app/android/geo/map/clusterization/di/ClusterizationComponentApi;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapMapper;", "mapper", "Lru/ozon/app/android/geo/map/DetailsSheetManager;", "detailsSheetManager$delegate", "getDetailsSheetManager", "()Lru/ozon/app/android/geo/map/DetailsSheetManager;", "detailsSheetManager", "Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "ozonMapProvider$delegate", "getOzonMapProvider", "()Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "ozonMapProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService$delegate", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator$delegate", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender;", "mapPerformanceAnalyticsSender$delegate", "getMapPerformanceAnalyticsSender", "()Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsSender;", "mapPerformanceAnalyticsSender", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LVg/d;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "mapUpdateManager", "Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "getMapUpdateManager", "()Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "LBZ/e;", "miniAppConfigHolder", "LBZ/e;", "getMiniAppConfigHolder", "()LBZ/e;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;", "clusterizationLoadingService", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;", "getClusterizationLoadingService", "()Lru/ozon/app/android/geo/map/clusterization/ClusterizationLoadingService;", "LPc/a;", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModelImpl;", "getPViewModel", "()LPc/a;", "pViewModel", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModelImpl;", "getPShowYandexSearchSheetViewModel", "pShowYandexSearchSheetViewModel", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapComponent$Companion$create$1$1 implements AddressEditMapComponent {
    private final AnalyticsComponentApi analyticsComponentApi;
    private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
    private final AppType appType;
    private final ClusterizationComponentApi clusterizationComponentApi;
    private final ClusterizationLoadingService clusterizationLoadingService;

    /* renamed from: composerNavigator$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j composerNavigator;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final d customActionHandlersStoreFactory;

    /* renamed from: detailsSheetManager$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j detailsSheetManager;
    private final EventStorageComponentApi eventStorageComponentApi;

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j featureChecker;

    /* renamed from: featureService$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j featureService;
    private final GeoProviderComponentApi geoProviderComponentApi;
    private final LocationComponentApi locationComponentApi;

    /* renamed from: mapPerformanceAnalyticsSender$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapPerformanceAnalyticsSender;
    private final MapUpdateManager mapUpdateManager;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final e miniAppConfigHolder;
    private final NetworkComponentApi networkComponentApi;
    private final OzonMapComponentApi ozonMapComponentApi;

    /* renamed from: ozonMapProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j ozonMapProvider;
    private final RetainComposerComponentApi retainComponentApi;

    AddressEditMapComponent$Companion$create$1$1(C7475g c7475g) {
        this.locationComponentApi = (LocationComponentApi) c7475g.getComponent(LocationComponentApi.class);
        this.ozonMapComponentApi = (OzonMapComponentApi) c7475g.getComponent(OzonMapComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        this.eventStorageComponentApi = (EventStorageComponentApi) c7475g.getComponent(EventStorageComponentApi.class);
        this.geoProviderComponentApi = (GeoProviderComponentApi) c7475g.getComponent(GeoProviderComponentApi.class);
        this.analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) c7475g.getComponent(AnalyticsScreenStorageComponentApi.class);
        CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        ClusterizationComponentApi clusterizationComponentApi = (ClusterizationComponentApi) c7475g.getComponent(ClusterizationComponentApi.class);
        this.clusterizationComponentApi = clusterizationComponentApi;
        this.mapper = k.b(AddressEditMapComponent$Companion$create$1$1$mapper$2.INSTANCE);
        this.detailsSheetManager = k.b(AddressEditMapComponent$Companion$create$1$1$detailsSheetManager$2.INSTANCE);
        this.ozonMapProvider = k.b(new AddressEditMapComponent$Companion$create$1$1$ozonMapProvider$2(this));
        this.featureChecker = k.b(new AddressEditMapComponent$Companion$create$1$1$featureChecker$2(this));
        this.featureService = k.b(new AddressEditMapComponent$Companion$create$1$1$featureService$2(this));
        this.composerNavigator = k.b(new AddressEditMapComponent$Companion$create$1$1$composerNavigator$2(this));
        this.mapPerformanceAnalyticsSender = k.b(new AddressEditMapComponent$Companion$create$1$1$mapPerformanceAnalyticsSender$2(this));
        this.customActionHandlersStoreFactory = customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
        this.mapUpdateManager = ((LocationComponentApi) c7475g.getComponent(LocationComponentApi.class)).getMapUpdateManager();
        this.miniAppConfigHolder = ((NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class)).getMiniAppConfigHolder();
        this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
        this.clusterizationLoadingService = clusterizationComponentApi.getClusterizationLoadingService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YandexSearchSheetSharedViewModelImpl _get_pShowYandexSearchSheetViewModel_$lambda$1() {
        return new YandexSearchSheetSharedViewModelImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressEditMapViewModelImpl _get_pViewModel_$lambda$0(AddressEditMapComponent$Companion$create$1$1 addressEditMapComponent$Companion$create$1$1) {
        return new AddressEditMapViewModelImpl(addressEditMapComponent$Companion$create$1$1.locationComponentApi.getLocationRepository(), addressEditMapComponent$Companion$create$1$1.locationComponentApi.getAreaLocalStore(), new AddressEditMapStateReducer(), addressEditMapComponent$Companion$create$1$1.geoProviderComponentApi.getGeoProviderRepository(), addressEditMapComponent$Companion$create$1$1.locationComponentApi.getLastLocationRepository(), addressEditMapComponent$Companion$create$1$1.clusterizationComponentApi.getClusterizationLoadingService());
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public AppType getAppType() {
        return this.appType;
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public ClusterizationLoadingService getClusterizationLoadingService() {
        return this.clusterizationLoadingService;
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public ComposerNavigator getComposerNavigator() {
        return (ComposerNavigator) this.composerNavigator.getValue();
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersStoreFactory;
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public DetailsSheetManager getDetailsSheetManager() {
        return (DetailsSheetManager) this.detailsSheetManager.getValue();
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public FeatureService getFeatureService() {
        return (FeatureService) this.featureService.getValue();
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public MapPerformanceAnalyticsSender getMapPerformanceAnalyticsSender() {
        return (MapPerformanceAnalyticsSender) this.mapPerformanceAnalyticsSender.getValue();
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public MapUpdateManager getMapUpdateManager() {
        return this.mapUpdateManager;
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public AddressEditMapMapper getMapper() {
        return (AddressEditMapMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public e getMiniAppConfigHolder() {
        return this.miniAppConfigHolder;
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public OzonMapProvider getOzonMapProvider() {
        return (OzonMapProvider) this.ozonMapProvider.getValue();
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public a<YandexSearchSheetSharedViewModelImpl> getPShowYandexSearchSheetViewModel() {
        return new C2678b();
    }

    @Override // ru.ozon.app.android.geo.map.di.AddressEditMapComponent
    public a<AddressEditMapViewModelImpl> getPViewModel() {
        return new a() { // from class: By.c
            @Override // Pc.a
            public final Object get() {
                AddressEditMapViewModelImpl _get_pViewModel_$lambda$0;
                _get_pViewModel_$lambda$0 = AddressEditMapComponent$Companion$create$1$1._get_pViewModel_$lambda$0(AddressEditMapComponent$Companion$create$1$1.this);
                return _get_pViewModel_$lambda$0;
            }
        };
    }
}
