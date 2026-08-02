package ru.ozon.app.android.mapcommon.mapcommon.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.geoprovider.di.GeoProviderComponentApi;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider;
import ru.ozon.app.android.mapcommon.map.provider.suggestions.OzonSuggestionsProvider;
import ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponent;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.MapCommonProvider;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.MapCommonProviderImpl;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.SdkSuggestionsControllerWrapperProvider;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.SdkSuggestionsControllerWrapperProviderImpl;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes6.dex */
public final class DaggerMapCommonComponent {

    private static final class Factory implements MapCommonComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponent.Factory
        public MapCommonComponent create(GeoProviderComponentApi geoProviderComponentApi, LocationComponentApi locationComponentApi, NetworkComponentApi networkComponentApi, OzonMapComponentApi ozonMapComponentApi) {
            geoProviderComponentApi.getClass();
            locationComponentApi.getClass();
            networkComponentApi.getClass();
            ozonMapComponentApi.getClass();
            return new MapCommonComponentImpl(geoProviderComponentApi, locationComponentApi, ozonMapComponentApi, networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class MapCommonComponentImpl implements MapCommonComponent {
        private a<MapCommonProvider> bindMapCommonProvider;
        private a<SdkSuggestionsControllerWrapperProvider> bindSdkSuggestionsControllerWrapperProvider;
        private final LocationComponentApi locationComponentApi;
        private final MapCommonComponentImpl mapCommonComponentImpl;
        private a<MapCommonProviderImpl> mapCommonProviderImplProvider;
        private final NetworkComponentApi networkComponentApi;
        private final OzonMapComponentApi ozonMapComponentApi;
        private a<SdkSuggestionsControllerWrapperProviderImpl> sdkSuggestionsControllerWrapperProviderImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92818id;
            private final MapCommonComponentImpl mapCommonComponentImpl;

            SwitchingProvider(MapCommonComponentImpl mapCommonComponentImpl, int i11) {
                this.mapCommonComponentImpl = mapCommonComponentImpl;
                this.f92818id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92818id;
                if (i11 == 0) {
                    OzonMapProvider ozonMapProvider = this.mapCommonComponentImpl.ozonMapComponentApi.getOzonMapProvider();
                    j.c(ozonMapProvider);
                    AreaLocalStore areaLocalStore = this.mapCommonComponentImpl.locationComponentApi.getAreaLocalStore();
                    j.c(areaLocalStore);
                    OzonGeoProxyClient ozonGeoProxyClient = this.mapCommonComponentImpl.locationComponentApi.getOzonGeoProxyClient();
                    j.c(ozonGeoProxyClient);
                    FeatureChecker featureChecker = this.mapCommonComponentImpl.networkComponentApi.getFeatureChecker();
                    j.c(featureChecker);
                    return (T) new MapCommonProviderImpl(ozonMapProvider, areaLocalStore, ozonGeoProxyClient, featureChecker);
                }
                if (i11 != 1) {
                    throw new AssertionError(this.f92818id);
                }
                AreaLocalStore areaLocalStore2 = this.mapCommonComponentImpl.locationComponentApi.getAreaLocalStore();
                j.c(areaLocalStore2);
                OzonSuggestionsProvider ozonSuggestionsProvider = this.mapCommonComponentImpl.ozonMapComponentApi.getOzonSuggestionsProvider();
                j.c(ozonSuggestionsProvider);
                OzonGeoProxyClient ozonGeoProxyClient2 = this.mapCommonComponentImpl.locationComponentApi.getOzonGeoProxyClient();
                j.c(ozonGeoProxyClient2);
                FeatureChecker featureChecker2 = this.mapCommonComponentImpl.networkComponentApi.getFeatureChecker();
                j.c(featureChecker2);
                return (T) new SdkSuggestionsControllerWrapperProviderImpl(areaLocalStore2, ozonSuggestionsProvider, ozonGeoProxyClient2, featureChecker2);
            }
        }

        /* synthetic */ MapCommonComponentImpl(GeoProviderComponentApi geoProviderComponentApi, LocationComponentApi locationComponentApi, OzonMapComponentApi ozonMapComponentApi, NetworkComponentApi networkComponentApi, int i11) {
            this(geoProviderComponentApi, locationComponentApi, ozonMapComponentApi, networkComponentApi);
        }

        private void initialize(GeoProviderComponentApi geoProviderComponentApi, LocationComponentApi locationComponentApi, OzonMapComponentApi ozonMapComponentApi, NetworkComponentApi networkComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.mapCommonComponentImpl, 0);
            this.mapCommonProviderImplProvider = switchingProvider;
            this.bindMapCommonProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.mapCommonComponentImpl, 1);
            this.sdkSuggestionsControllerWrapperProviderImplProvider = switchingProvider2;
            this.bindSdkSuggestionsControllerWrapperProvider = d.b(switchingProvider2);
        }

        @Override // ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi
        public MapCommonProvider getMapCommonProvider() {
            return this.bindMapCommonProvider.get();
        }

        @Override // ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi
        public SdkSuggestionsControllerWrapperProvider getSdkSuggestionsControllerWrapperProvider() {
            return this.bindSdkSuggestionsControllerWrapperProvider.get();
        }

        private MapCommonComponentImpl(GeoProviderComponentApi geoProviderComponentApi, LocationComponentApi locationComponentApi, OzonMapComponentApi ozonMapComponentApi, NetworkComponentApi networkComponentApi) {
            this.mapCommonComponentImpl = this;
            this.ozonMapComponentApi = ozonMapComponentApi;
            this.locationComponentApi = locationComponentApi;
            this.networkComponentApi = networkComponentApi;
            initialize(geoProviderComponentApi, locationComponentApi, ozonMapComponentApi, networkComponentApi);
        }
    }

    public static MapCommonComponent.Factory factory() {
        return new Factory(0);
    }
}
