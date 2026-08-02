package ru.ozon.app.android.checkoutgeo.location.di;

import Jb.d;
import Jb.j;
import Pc.a;
import We.E;
import android.content.Context;
import android.content.SharedPreferences;
import ei0.InterfaceC6369b;
import fi0.e;
import retrofit2.Retrofit;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.checkoutgeo.location.AddressLocalStoreImpl;
import ru.ozon.app.android.checkoutgeo.location.AreaLocalStoreImpl;
import ru.ozon.app.android.checkoutgeo.location.ComposerLocationRepositoryImpl;
import ru.ozon.app.android.checkoutgeo.location.GoogleLocationDataSourceImpl;
import ru.ozon.app.android.checkoutgeo.location.MapUpdateManagerImpl;
import ru.ozon.app.android.checkoutgeo.location.MockLocationRepositoryImpl;
import ru.ozon.app.android.checkoutgeo.location.di.LocationComponent;
import ru.ozon.app.android.checkoutgeo.location.system.SystemLocationDataSourceImpl;
import ru.ozon.app.android.checkoutgeo.location.userlocation.LastLocationRepositoryImpl;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.geoprovider.GeoProviderRepository;
import ru.ozon.app.android.geoprovider.di.GeoProviderComponentApi;
import ru.ozon.app.android.location.AddressLocalStore;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.location.LocationRepository;
import ru.ozon.app.android.location.api.LocationApi;
import ru.ozon.app.android.mapcommon.mapcommon.LastLocationRepository;
import ru.ozon.app.android.mapcommon.mapcommon.MapUpdateManager;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.MapPreferences;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.MapPreferencesImpl;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClientImpl;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.di.StorageComponentApi;

/* loaded from: classes6.dex */
public final class DaggerLocationComponent {

    private static final class Factory implements LocationComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.checkoutgeo.location.di.LocationComponent.Factory
        public LocationComponent create(AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, AccountComponentApi accountComponentApi, GeoProviderComponentApi geoProviderComponentApi) {
            analyticsComponentApi.getClass();
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            storageComponentApi.getClass();
            accountComponentApi.getClass();
            geoProviderComponentApi.getClass();
            return new LocationComponentImpl(analyticsComponentApi, contextComponentDependencies, networkComponentApi, storageComponentApi, accountComponentApi, geoProviderComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class LocationComponentImpl implements LocationComponent {
        private a<AddressLocalStoreImpl> addressLocalStoreImplProvider;
        private final AnalyticsComponentApi analyticsComponentApi;
        private a<AreaLocalStoreImpl> areaLocalStoreImplProvider;
        private a<LastLocationRepository> bindLastLocationRepositoryProvider;
        private a<MapPreferences> bindMapPreferencesProvider;
        private a<MapUpdateManager> bindMapUpdateManagerProvider;
        private a<OzonGeoProxyClient> bindOzonGeoProxyClientProvider;
        private a<AddressLocalStore> bindsAddressLocalStoreProvider;
        private a<AreaLocalStore> bindsAreaLocalStoreProvider;
        private a<ComposerLocationRepositoryImpl> composerLocationRepositoryImplProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private final GeoProviderComponentApi geoProviderComponentApi;
        private a<GoogleLocationDataSourceImpl> googleLocationDataSourceImplProvider;
        private a<LastLocationRepositoryImpl> lastLocationRepositoryImplProvider;
        private final LocationComponentImpl locationComponentImpl;
        private a<MapPreferencesImpl> mapPreferencesImplProvider;
        private a<MapUpdateManagerImpl> mapUpdateManagerImplProvider;
        private a<MockLocationRepositoryImpl> mockLocationRepositoryImplProvider;
        private final NetworkComponentApi networkComponentApi;
        private a<OzonGeoProxyClientImpl> ozonGeoProxyClientImplProvider;
        private a<LocationApi> provideComposerActionApiProvider;
        private a<ComposerLocationRepository> provideComposerLocationRepositoryProvider;
        private a<LocationRepository> provideLocationRepositoryProvider;
        private final StorageComponentApi storageComponentApi;
        private a<SystemLocationDataSourceImpl> systemLocationDataSourceImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92340id;
            private final LocationComponentImpl locationComponentImpl;

            SwitchingProvider(LocationComponentImpl locationComponentImpl, int i11) {
                this.locationComponentImpl = locationComponentImpl;
                this.f92340id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92340id) {
                    case 0:
                        SharedPreferences sharedPreferences = this.locationComponentImpl.storageComponentApi.getSharedPreferences();
                        j.c(sharedPreferences);
                        e customPropertyTracker = this.locationComponentImpl.analyticsComponentApi.getCustomPropertyTracker();
                        j.c(customPropertyTracker);
                        return (T) new AreaLocalStoreImpl(sharedPreferences, customPropertyTracker);
                    case 1:
                        SharedPreferences sharedPreferences2 = this.locationComponentImpl.storageComponentApi.getSharedPreferences();
                        j.c(sharedPreferences2);
                        return (T) new AddressLocalStoreImpl(sharedPreferences2);
                    case 2:
                        Retrofit retrofit = this.locationComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) LocationModule_Companion_ProvideComposerActionApiFactory.provideComposerActionApi(retrofit);
                    case 3:
                        LocationApi locationApi = (LocationApi) this.locationComponentImpl.provideComposerActionApiProvider.get();
                        AreaLocalStore areaLocalStore = (AreaLocalStore) this.locationComponentImpl.bindsAreaLocalStoreProvider.get();
                        JsonParser jsonDeserializer = this.locationComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer);
                        OzonGeoProxyClient ozonGeoProxyClient = (OzonGeoProxyClient) this.locationComponentImpl.bindOzonGeoProxyClientProvider.get();
                        FeatureChecker featureChecker = this.locationComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker);
                        return (T) new ComposerLocationRepositoryImpl(locationApi, areaLocalStore, jsonDeserializer, ozonGeoProxyClient, featureChecker);
                    case 4:
                        GeoProviderRepository geoProviderRepository = this.locationComponentImpl.geoProviderComponentApi.getGeoProviderRepository();
                        j.c(geoProviderRepository);
                        MapPreferences mapPreferences = (MapPreferences) this.locationComponentImpl.bindMapPreferencesProvider.get();
                        E okHttpClient = this.locationComponentImpl.networkComponentApi.getOkHttpClient();
                        j.c(okHttpClient);
                        InterfaceC6369b ozonTracker = this.locationComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker);
                        FeatureChecker featureChecker2 = this.locationComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker2);
                        return (T) new OzonGeoProxyClientImpl(geoProviderRepository, mapPreferences, okHttpClient, ozonTracker, featureChecker2);
                    case 5:
                        Context context = this.locationComponentImpl.contextComponentDependencies.getContext();
                        j.c(context);
                        return (T) new MapPreferencesImpl(context);
                    case 6:
                        a aVar = this.locationComponentImpl.googleLocationDataSourceImplProvider;
                        a aVar2 = this.locationComponentImpl.systemLocationDataSourceImplProvider;
                        FeatureService featureService = this.locationComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        AppVersionService appVersionService = this.locationComponentImpl.networkComponentApi.getAppVersionService();
                        j.c(appVersionService);
                        return (T) new MockLocationRepositoryImpl(aVar, aVar2, featureService, appVersionService);
                    case 7:
                        Context context2 = this.locationComponentImpl.contextComponentDependencies.getContext();
                        j.c(context2);
                        return (T) new GoogleLocationDataSourceImpl(context2);
                    case 8:
                        Context context3 = this.locationComponentImpl.contextComponentDependencies.getContext();
                        j.c(context3);
                        return (T) new SystemLocationDataSourceImpl(context3);
                    case 9:
                        return (T) new LastLocationRepositoryImpl();
                    case 10:
                        return (T) new MapUpdateManagerImpl();
                    default:
                        throw new AssertionError(this.f92340id);
                }
            }
        }

        /* synthetic */ LocationComponentImpl(AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, AccountComponentApi accountComponentApi, GeoProviderComponentApi geoProviderComponentApi, int i11) {
            this(analyticsComponentApi, contextComponentDependencies, networkComponentApi, storageComponentApi, accountComponentApi, geoProviderComponentApi);
        }

        private void initialize(AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, AccountComponentApi accountComponentApi, GeoProviderComponentApi geoProviderComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.locationComponentImpl, 0);
            this.areaLocalStoreImplProvider = switchingProvider;
            this.bindsAreaLocalStoreProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.locationComponentImpl, 1);
            this.addressLocalStoreImplProvider = switchingProvider2;
            this.bindsAddressLocalStoreProvider = d.b(switchingProvider2);
            this.provideComposerActionApiProvider = d.b(new SwitchingProvider(this.locationComponentImpl, 2));
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.locationComponentImpl, 5);
            this.mapPreferencesImplProvider = switchingProvider3;
            this.bindMapPreferencesProvider = d.b(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.locationComponentImpl, 4);
            this.ozonGeoProxyClientImplProvider = switchingProvider4;
            this.bindOzonGeoProxyClientProvider = d.b(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.locationComponentImpl, 3);
            this.composerLocationRepositoryImplProvider = switchingProvider5;
            this.provideComposerLocationRepositoryProvider = d.b(switchingProvider5);
            this.googleLocationDataSourceImplProvider = new SwitchingProvider(this.locationComponentImpl, 7);
            this.systemLocationDataSourceImplProvider = new SwitchingProvider(this.locationComponentImpl, 8);
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.locationComponentImpl, 6);
            this.mockLocationRepositoryImplProvider = switchingProvider6;
            this.provideLocationRepositoryProvider = d.b(switchingProvider6);
            SwitchingProvider switchingProvider7 = new SwitchingProvider(this.locationComponentImpl, 9);
            this.lastLocationRepositoryImplProvider = switchingProvider7;
            this.bindLastLocationRepositoryProvider = d.b(switchingProvider7);
            SwitchingProvider switchingProvider8 = new SwitchingProvider(this.locationComponentImpl, 10);
            this.mapUpdateManagerImplProvider = switchingProvider8;
            this.bindMapUpdateManagerProvider = d.b(switchingProvider8);
        }

        @Override // ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi
        public AddressLocalStore getAddressLocalStore() {
            return this.bindsAddressLocalStoreProvider.get();
        }

        @Override // ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi
        public AreaLocalStore getAreaLocalStore() {
            return this.bindsAreaLocalStoreProvider.get();
        }

        @Override // ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi
        public ComposerLocationRepository getComposerLocationRepository() {
            return this.provideComposerLocationRepositoryProvider.get();
        }

        @Override // ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi
        public LastLocationRepository getLastLocationRepository() {
            return this.bindLastLocationRepositoryProvider.get();
        }

        @Override // ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi
        public LocationRepository getLocationRepository() {
            return this.provideLocationRepositoryProvider.get();
        }

        @Override // ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi
        public MapPreferences getMapPreferences() {
            return this.bindMapPreferencesProvider.get();
        }

        @Override // ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi
        public MapUpdateManager getMapUpdateManager() {
            return this.bindMapUpdateManagerProvider.get();
        }

        @Override // ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi
        public OzonGeoProxyClient getOzonGeoProxyClient() {
            return this.bindOzonGeoProxyClientProvider.get();
        }

        private LocationComponentImpl(AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, StorageComponentApi storageComponentApi, AccountComponentApi accountComponentApi, GeoProviderComponentApi geoProviderComponentApi) {
            this.locationComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.geoProviderComponentApi = geoProviderComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            initialize(analyticsComponentApi, contextComponentDependencies, networkComponentApi, storageComponentApi, accountComponentApi, geoProviderComponentApi);
        }
    }

    public static LocationComponent.Factory factory() {
        return new Factory(0);
    }
}
