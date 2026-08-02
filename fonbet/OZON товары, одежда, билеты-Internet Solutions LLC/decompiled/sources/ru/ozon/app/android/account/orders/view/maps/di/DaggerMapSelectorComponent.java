package ru.ozon.app.android.account.orders.view.maps.di;

import Jb.j;
import Jb.k;
import Pc.a;
import android.content.Context;
import com.google.android.gms.maps.model.LatLng;
import java.util.Set;
import ru.ozon.app.android.account.orders.view.maps.MapSelectorAnalyticsImpl;
import ru.ozon.app.android.account.orders.view.maps.MapsRouteViewModelImpl;
import ru.ozon.app.android.account.orders.view.maps.RouteMapper;
import ru.ozon.app.android.account.orders.view.maps.di.MapSelectorComponent;
import ru.ozon.app.android.account.orders.view.maps.domain.GoogleMapRouteHandler;
import ru.ozon.app.android.account.orders.view.maps.domain.MapRouteHandler;
import ru.ozon.app.android.account.orders.view.maps.domain.MapsRouterImpl;
import ru.ozon.app.android.account.orders.view.maps.domain.YandexMapRouteHandler;
import ru.ozon.app.android.account.orders.view.maps.domain.YandexNavigationLinkGenerator;
import ru.ozon.app.android.account.orders.view.maps.ui.MapsRouteFragment;
import ru.ozon.app.android.account.orders.view.maps.ui.MapsRouteFragment_MembersInjector;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes11.dex */
public final class DaggerMapSelectorComponent {

    private static final class Factory implements MapSelectorComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.account.orders.view.maps.di.MapSelectorComponent.Factory
        public MapSelectorComponent create(String str, LatLng latLng, NetworkComponentApi networkComponentApi, NavigationComponentApi navigationComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, ComposerComponentApi composerComponentApi, ContextComponentDependencies contextComponentDependencies) {
            str.getClass();
            latLng.getClass();
            networkComponentApi.getClass();
            navigationComponentApi.getClass();
            analyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            composerComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new MapSelectorComponentImpl(networkComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, navigationComponentApi, composerComponentApi, contextComponentDependencies, str, latLng, 0);
        }

        private Factory() {
        }
    }

    private static final class MapSelectorComponentImpl implements MapSelectorComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private final MapSelectorComponentImpl mapSelectorComponentImpl;
        private a<MapsRouteViewModelImpl> mapsRouteViewModelImplProvider;
        private final LatLng pvzLocation;
        private final String title;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92130id;
            private final MapSelectorComponentImpl mapSelectorComponentImpl;

            SwitchingProvider(MapSelectorComponentImpl mapSelectorComponentImpl, int i11) {
                this.mapSelectorComponentImpl = mapSelectorComponentImpl;
                this.f92130id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92130id == 0) {
                    return (T) new MapsRouteViewModelImpl(this.mapSelectorComponentImpl.title, this.mapSelectorComponentImpl.pvzLocation, new RouteMapper(), this.mapSelectorComponentImpl.mapsRouterImpl());
                }
                throw new AssertionError(this.f92130id);
            }
        }

        /* synthetic */ MapSelectorComponentImpl(NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ContextComponentDependencies contextComponentDependencies, String str, LatLng latLng, int i11) {
            this(networkComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, navigationComponentApi, composerComponentApi, contextComponentDependencies, str, latLng);
        }

        private void initialize(NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ContextComponentDependencies contextComponentDependencies, String str, LatLng latLng) {
            this.mapsRouteViewModelImplProvider = new SwitchingProvider(this.mapSelectorComponentImpl, 0);
        }

        private MapsRouteFragment injectMapsRouteFragment(MapsRouteFragment mapsRouteFragment) {
            MapsRouteFragment_MembersInjector.injectPViewModel(mapsRouteFragment, this.mapsRouteViewModelImplProvider);
            MapsRouteFragment_MembersInjector.injectMapSelectorAnalytics(mapsRouteFragment, mapSelectorAnalyticsImpl());
            return mapsRouteFragment;
        }

        private MapSelectorAnalyticsImpl mapSelectorAnalyticsImpl() {
            AnalyticsDataLayer analyticsDataLayer = this.analyticsComponentApi.getAnalyticsDataLayer();
            j.c(analyticsDataLayer);
            PluginsManager pluginsManager = this.analyticsComponentApi.getPluginsManager();
            j.c(pluginsManager);
            Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
            j.c(analyticsScreenStorage);
            return new MapSelectorAnalyticsImpl(analyticsDataLayer, pluginsManager, analyticsScreenStorage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapsRouterImpl mapsRouterImpl() {
            Set<MapRouteHandler> ofMapRouteHandler = setOfMapRouteHandler();
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new MapsRouterImpl(ofMapRouteHandler, context);
        }

        private Set<MapRouteHandler> setOfMapRouteHandler() {
            k d11 = k.d(2);
            d11.a(new GoogleMapRouteHandler());
            d11.a(yandexMapRouteHandler());
            return d11.c();
        }

        private YandexMapRouteHandler yandexMapRouteHandler() {
            return new YandexMapRouteHandler(new YandexNavigationLinkGenerator());
        }

        @Override // ru.ozon.app.android.account.orders.view.maps.di.MapSelectorComponent
        public void inject(MapsRouteFragment mapsRouteFragment) {
            injectMapsRouteFragment(mapsRouteFragment);
        }

        private MapSelectorComponentImpl(NetworkComponentApi networkComponentApi, AnalyticsComponentApi analyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ContextComponentDependencies contextComponentDependencies, String str, LatLng latLng) {
            this.mapSelectorComponentImpl = this;
            this.title = str;
            this.pvzLocation = latLng;
            this.contextComponentDependencies = contextComponentDependencies;
            this.analyticsComponentApi = analyticsComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            initialize(networkComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, navigationComponentApi, composerComponentApi, contextComponentDependencies, str, latLng);
        }
    }

    public static MapSelectorComponent.Factory factory() {
        return new Factory(0);
    }
}
