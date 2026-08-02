package ru.ozon.app.android.travel.feature.general.common.tab.di;

import Jb.j;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.travel.feature.general.common.tab.di.TravelMiniAppComponent;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.SwitchMapProviderObserver;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelMiniAppFragment;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelMiniAppFragment_MembersInjector;
import ru.ozon.app.android.travel.map.di.TravelMapApi;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;

/* loaded from: classes3.dex */
public final class DaggerTravelMiniAppComponent {

    private static final class Factory implements TravelMiniAppComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.tab.di.TravelMiniAppComponent.Factory
        public TravelMiniAppComponent create(ContextComponentDependencies contextComponentDependencies, LocationComponentApi locationComponentApi, NavigationComponentApi navigationComponentApi, TravelMapApi travelMapApi, NetworkComponentApi networkComponentApi) {
            contextComponentDependencies.getClass();
            locationComponentApi.getClass();
            navigationComponentApi.getClass();
            travelMapApi.getClass();
            networkComponentApi.getClass();
            return new TravelMiniAppComponentImpl(contextComponentDependencies, locationComponentApi, navigationComponentApi, networkComponentApi, travelMapApi, 0);
        }

        private Factory() {
        }
    }

    private static final class TravelMiniAppComponentImpl implements TravelMiniAppComponent {
        private final LocationComponentApi locationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final TravelMapApi travelMapApi;
        private final TravelMiniAppComponentImpl travelMiniAppComponentImpl;

        /* synthetic */ TravelMiniAppComponentImpl(ContextComponentDependencies contextComponentDependencies, LocationComponentApi locationComponentApi, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, TravelMapApi travelMapApi, int i11) {
            this(contextComponentDependencies, locationComponentApi, navigationComponentApi, networkComponentApi, travelMapApi);
        }

        private TravelMiniAppFragment injectTravelMiniAppFragment(TravelMiniAppFragment travelMiniAppFragment) {
            TravelMiniAppFragment_MembersInjector.injectSwitchMapProviderObserver(travelMiniAppFragment, switchMapProviderObserver());
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            TravelMiniAppFragment_MembersInjector.injectFeatureService(travelMiniAppFragment, featureService);
            return travelMiniAppFragment;
        }

        private SwitchMapProviderObserver switchMapProviderObserver() {
            OzonGeoProxyClient ozonGeoProxyClient = this.locationComponentApi.getOzonGeoProxyClient();
            j.c(ozonGeoProxyClient);
            AreaLocalStore areaLocalStore = this.locationComponentApi.getAreaLocalStore();
            j.c(areaLocalStore);
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            TravelGeoProvidersStorage travelGeoProviderStorage = this.travelMapApi.getTravelGeoProviderStorage();
            j.c(travelGeoProviderStorage);
            return new SwitchMapProviderObserver(ozonGeoProxyClient, areaLocalStore, featureService, travelGeoProviderStorage);
        }

        @Override // ru.ozon.app.android.travel.feature.general.common.tab.di.TravelMiniAppComponent
        public void inject(TravelMiniAppFragment travelMiniAppFragment) {
            injectTravelMiniAppFragment(travelMiniAppFragment);
        }

        private TravelMiniAppComponentImpl(ContextComponentDependencies contextComponentDependencies, LocationComponentApi locationComponentApi, NavigationComponentApi navigationComponentApi, NetworkComponentApi networkComponentApi, TravelMapApi travelMapApi) {
            this.travelMiniAppComponentImpl = this;
            this.locationComponentApi = locationComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.travelMapApi = travelMapApi;
        }
    }

    public static TravelMiniAppComponent.Factory factory() {
        return new Factory(0);
    }
}
