package ru.ozon.app.android.travel.map.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.map.di.TravelMapComponent;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;

/* loaded from: classes2.dex */
public final class DaggerTravelMapComponent {

    private static final class Factory implements TravelMapComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.travel.map.di.TravelMapComponent.Factory
        public TravelMapComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new TravelMapComponentImpl(new TravelMapModule(), networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class TravelMapComponentImpl implements TravelMapComponent {
        private a<FeatureService> getFeatureServiceProvider;
        private a<TravelGeoProvidersStorage> provideTravelGeoProvidersStorageProvider;
        private final TravelMapComponentImpl travelMapComponentImpl;

        private static final class GetFeatureServiceProvider implements a<FeatureService> {
            private final NetworkComponentApi networkComponentApi;

            GetFeatureServiceProvider(NetworkComponentApi networkComponentApi) {
                this.networkComponentApi = networkComponentApi;
            }

            @Override // Pc.a
            public FeatureService get() {
                FeatureService featureService = this.networkComponentApi.getFeatureService();
                j.c(featureService);
                return featureService;
            }
        }

        /* synthetic */ TravelMapComponentImpl(TravelMapModule travelMapModule, NetworkComponentApi networkComponentApi, int i11) {
            this(travelMapModule, networkComponentApi);
        }

        private void initialize(TravelMapModule travelMapModule, NetworkComponentApi networkComponentApi) {
            GetFeatureServiceProvider getFeatureServiceProvider = new GetFeatureServiceProvider(networkComponentApi);
            this.getFeatureServiceProvider = getFeatureServiceProvider;
            this.provideTravelGeoProvidersStorageProvider = d.b(TravelMapModule_ProvideTravelGeoProvidersStorageFactory.create(travelMapModule, getFeatureServiceProvider));
        }

        @Override // ru.ozon.app.android.travel.map.di.TravelMapApi
        public TravelGeoProvidersStorage getTravelGeoProviderStorage() {
            return this.provideTravelGeoProvidersStorageProvider.get();
        }

        private TravelMapComponentImpl(TravelMapModule travelMapModule, NetworkComponentApi networkComponentApi) {
            this.travelMapComponentImpl = this;
            initialize(travelMapModule, networkComponentApi);
        }
    }

    public static TravelMapComponent.Factory factory() {
        return new Factory(0);
    }
}
