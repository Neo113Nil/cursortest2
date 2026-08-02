package ru.ozon.app.android.network.di;

import Fb0.e;
import Jb.d;
import Jb.j;
import Ld0.c;
import Pc.a;
import android.app.Application;
import android.content.Context;
import android.webkit.CookieManager;
import com.google.common.collect.A;
import g00.InterfaceC6608a;
import java.util.Set;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.action.featureflag.AtomActionFlagModule;
import ru.ozon.app.android.action.featureflag.AtomActionFlagModule_ProvideFlagsFactory;
import ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractor;
import ru.ozon.app.android.ads.di.messaging.AdvertisingMessagingApi;
import ru.ozon.app.android.ads.flags.AdvFlagsModule;
import ru.ozon.app.android.ads.flags.AdvFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.adult.AdultStateProcessor;
import ru.ozon.app.android.analytics.flags.AnalyticsFlagsModule;
import ru.ozon.app.android.analytics.flags.AnalyticsFlagsModule_ProvideFeatureFlagsFactory;
import ru.ozon.app.android.cart.common.di.CartCommonFlagsModule;
import ru.ozon.app.android.cart.common.di.CartCommonFlagsModule_ProvideCartCommonFlagsFactory;
import ru.ozon.app.android.cart.domain.prefetch.flags.CartPrefetchFlagsModule;
import ru.ozon.app.android.cart.domain.prefetch.flags.CartPrefetchFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.cart.flags.CartFlagsModule;
import ru.ozon.app.android.cart.flags.CartFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.checkoutcomposer.flags.CheckoutFlagsModule;
import ru.ozon.app.android.checkoutcomposer.flags.CheckoutFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.common.actionHandlers.flags.CommonActionHandlersFlagsModule;
import ru.ozon.app.android.common.actionHandlers.flags.CommonActionHandlersFlagsModule_ProvidePrefetchFlagsFactory;
import ru.ozon.app.android.common.filterWidgets.flags.FiltersFlagsModule;
import ru.ozon.app.android.common.filterWidgets.flags.FiltersFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.common.flags.PrefetchFlagsModule;
import ru.ozon.app.android.common.flags.PrefetchFlagsModule_ProvidePrefetchFlagsFactory;
import ru.ozon.app.android.commonwidgets.di.ff.CommonWidgetsFeatureFlagsModule;
import ru.ozon.app.android.commonwidgets.di.ff.CommonWidgetsFeatureFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.composer.flags.ComposerFlagsModule;
import ru.ozon.app.android.composer.flags.ComposerFlagsModule_ProvideComposerFlagsFactory;
import ru.ozon.app.android.composer.network.cache.flags.CacheFeatureFlagsRegistryModule;
import ru.ozon.app.android.composer.network.cache.flags.CacheFeatureFlagsRegistryModule_ProvideRegistrationModelsFactory;
import ru.ozon.app.android.composer.network.redirect.flags.RedirectFeatureFlagsRegistryModule;
import ru.ozon.app.android.composer.network.redirect.flags.RedirectFeatureFlagsRegistryModule_ProvideFeatureFlagsFactory;
import ru.ozon.app.android.csma.flags.di.CsmaFlagsModule;
import ru.ozon.app.android.csma.flags.di.CsmaFlagsModule_ProvideFlagFactory;
import ru.ozon.app.android.di.component.ApplicationComponent;
import ru.ozon.app.android.domain.flags.StorefrontFlagsModule;
import ru.ozon.app.android.domain.flags.StorefrontFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.domain.flags.TilesFlagsModule;
import ru.ozon.app.android.domain.flags.TilesFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.domain.tiles.flags.TilesDomainFlagsModule;
import ru.ozon.app.android.domain.tiles.flags.TilesDomainFlagsModule_ProvideFavoritesDomainFlagsFactory;
import ru.ozon.app.android.favorites.domain.di.FavoritesDomainFlagsModule;
import ru.ozon.app.android.favorites.domain.di.FavoritesDomainFlagsModule_ProvideFavoritesDomainFlagsFactory;
import ru.ozon.app.android.fintech.flags.FintechFlagsModule;
import ru.ozon.app.android.fintech.flags.FintechFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.fresh.common.flags.FreshFlagsModule;
import ru.ozon.app.android.fresh.common.flags.FreshFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.geo.flags.GeoFlagsModule;
import ru.ozon.app.android.geo.flags.GeoFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.initializers.warmer.compose.ComposeWarmupFlagModule;
import ru.ozon.app.android.initializers.warmer.compose.ComposeWarmupFlagModule_ProvideFlagsFactory;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.mapcommon.map.flags.MapFlagsModule;
import ru.ozon.app.android.mapcommon.map.flags.MapFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.marketing.common.flags.MarketingFlagsModule;
import ru.ozon.app.android.marketing.common.flags.MarketingFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.mediaupload.flags.UploadFlagsModule;
import ru.ozon.app.android.mediaupload.flags.UploadFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.messenger.flags.MessengerFlagsModule;
import ru.ozon.app.android.messenger.flags.MessengerFlagsModule_ProvideFeatureFlagsFactory;
import ru.ozon.app.android.monetization.flags.MonetizationFlagsModule;
import ru.ozon.app.android.monetization.flags.MonetizationFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;
import ru.ozon.app.android.network.auth.AuthNetworkService;
import ru.ozon.app.android.network.common.NetworkHeadersDependencies;
import ru.ozon.app.android.network.cookie.CookieListener;
import ru.ozon.app.android.network.cookie.handler.AdultCookieHandler;
import ru.ozon.app.android.network.cookie.handler.ExtraCookiesHandler;
import ru.ozon.app.android.network.cookie.handler.TeensModeCookieHandler;
import ru.ozon.app.android.network.cookie.listeners.AdultCookieListener;
import ru.ozon.app.android.network.cookie.listeners.ExtraCookiesListener;
import ru.ozon.app.android.network.cookie.listeners.bugReport.BugReportCookieListener;
import ru.ozon.app.android.network.cookie.listeners.teensMode.TeensModeCookieListener;
import ru.ozon.app.android.network.debug.DebugHeaderService;
import ru.ozon.app.android.network.debug.ExtraHeadersService;
import ru.ozon.app.android.network.dependency.AntibotPerfAnalyticServiceImpl;
import ru.ozon.app.android.network.dependency.AuthNetworkServiceImpl;
import ru.ozon.app.android.network.dependency.DebugHeaderServiceImpl;
import ru.ozon.app.android.network.dependency.ExtraHeadersServiceImpl;
import ru.ozon.app.android.network.dependency.LogRequestsServiceImpl;
import ru.ozon.app.android.network.dependency.NetworkHistoryServiceImpl;
import ru.ozon.app.android.network.di.NetworkDependencyComponent;
import ru.ozon.app.android.network.di.module.NetworkConverterModule;
import ru.ozon.app.android.network.di.module.NetworkConverterModule_ProvideAdaptersFactory;
import ru.ozon.app.android.network.di.module.NetworkDependencyModule;
import ru.ozon.app.android.network.di.module.NetworkDependencyModule_Companion_ProvideAppVersionServiceFactory;
import ru.ozon.app.android.network.di.module.NetworkDependencyModule_Companion_ProvideAutoTestUserTraceInterceptorDependenciesFactory;
import ru.ozon.app.android.network.di.module.NetworkDependencyModule_Companion_ProvideCustomHeadersInterceptorDependenciesFactory;
import ru.ozon.app.android.network.di.module.NetworkDependencyModule_Companion_ProvideNetworkComponentConfigFactory;
import ru.ozon.app.android.network.di.module.NetworkFlagsModule;
import ru.ozon.app.android.network.di.module.NetworkFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.network.flags.DeprecatedFeatureFlagsModule;
import ru.ozon.app.android.network.flags.DeprecatedFeatureFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.network.history.NetworkHistoryService;
import ru.ozon.app.android.network.interceptors.dependencies.AutoTestTraceIdInterceptorDependencies;
import ru.ozon.app.android.network.logrequests.LogRequestsService;
import ru.ozon.app.android.network.security.antibot.AntibotPerfAnalyticService;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.payment.feature.flags.PaymentFlagsModule;
import ru.ozon.app.android.payment.feature.flags.PaymentFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.pdp.flags.PdpFlagsModule;
import ru.ozon.app.android.pdp.flags.PdpFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.pikazon.flags.PikazonFlagsModule;
import ru.ozon.app.android.pikazon.flags.PikazonFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.platform.di.module.AndroidPlatformFlagsModule;
import ru.ozon.app.android.platform.di.module.AndroidPlatformFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.precreation.flags.di.PreCreationFeatureFlagsModule;
import ru.ozon.app.android.precreation.flags.di.PreCreationFeatureFlagsModule_ProvidePreCreationFlagsFactory;
import ru.ozon.app.android.push.flags.PushFlagsModule;
import ru.ozon.app.android.push.flags.PushFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.regulardraw.flags.RegularDrawFlagsModule;
import ru.ozon.app.android.regulardraw.flags.RegularDrawFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.search.flags.SearchFlagsModule;
import ru.ozon.app.android.search.flags.SearchFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.separator.di.SeparatorFlagsModule;
import ru.ozon.app.android.separator.di.SeparatorFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.storage.adult.AdultState;
import ru.ozon.app.android.storage.adult.AdultStateStore;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.bugReport.BugReportCookieState;
import ru.ozon.app.android.storage.cookiePreference.ExtraCookieStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.entity.network.NetworkHistoryDao;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.extraHeaders.ExtraHeadersDataSource;
import ru.ozon.app.android.storage.railwaymock.RailwayMockStorage;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.travel.feature.entry.flags.TravelEntryFlagsModule;
import ru.ozon.app.android.travel.feature.entry.flags.TravelEntryFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.travel.feature.general.common.flags.TravelGeneralFlagsModule;
import ru.ozon.app.android.travel.feature.general.common.flags.TravelGeneralFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.travel.feature.general.order.flags.TravelOrderFlagsModule;
import ru.ozon.app.android.travel.feature.general.order.flags.TravelOrderFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.travel.feature.hotels.flags.TravelHotelsFlagsModule;
import ru.ozon.app.android.travel.feature.hotels.flags.TravelHotelsFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.travel.feature.hotels.map.flags.TravelHotelsMapFlagsModule;
import ru.ozon.app.android.travel.feature.hotels.map.flags.TravelHotelsMapFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.travel.feature.tours.flags.TravelToursFlagsModule;
import ru.ozon.app.android.travel.feature.tours.flags.TravelToursFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.travel.map.flags.TravelMapFlagsModule;
import ru.ozon.app.android.travel.map.flags.TravelMapFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.flag.di.TravelPreCreateWidgetsConfigurationFlagModule;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.flag.di.TravelPreCreateWidgetsConfigurationFlagModule_ProvidePreCreationFlagsFactory;
import ru.ozon.app.android.ugc.core.flags.UgcCoreFlagsModule;
import ru.ozon.app.android.ugc.core.flags.UgcCoreFlagsModule_ProvideFlags$core_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.ugc.flags.UgcFlagsModule;
import ru.ozon.app.android.ugc.flags.UgcFlagsModule_ProvideFlags$ugc_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.universalwidgets.flags.UniversalWidgetsFlagsModule;
import ru.ozon.app.android.universalwidgets.flags.UniversalWidgetsFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.video.player.flags.PlayerFlagsModule;
import ru.ozon.app.android.video.player.flags.PlayerFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.warmup.flags.di.WarmupFeatureFlagsModule;
import ru.ozon.app.android.warmup.flags.di.WarmupFeatureFlagsModule_ProvideWarmupFlagsFactory;
import ru.ozon.app.android.whitelist.common.di.WhitelistFlagsModule;
import ru.ozon.app.android.whitelist.common.di.WhitelistFlagsModule_ProvideFlagsFactory;
import ru.ozon.app.android.widgets.flags.DSFlagsModule;
import ru.ozon.app.android.widgets.flags.DSFlagsModule_ProvideFlagsFactory;
import zb0.g;

/* loaded from: classes6.dex */
public final class DaggerNetworkDependencyComponent {

    private static final class Factory implements NetworkDependencyComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.network.di.NetworkDependencyComponent.Factory
        public NetworkDependencyComponent create(ApplicationComponent applicationComponent, AdvertisingMessagingApi advertisingMessagingApi, StorageComponentApi storageComponentApi, Limb2ComponentApi limb2ComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent) {
            applicationComponent.getClass();
            advertisingMessagingApi.getClass();
            storageComponentApi.getClass();
            limb2ComponentApi.getClass();
            composerDebugMenuHostApiComponent.getClass();
            return new NetworkDependencyComponentImpl(new NetworkConverterModule(), new AnalyticsFlagsModule(), new PikazonFlagsModule(), new NetworkFlagsModule(), new WhitelistFlagsModule(), new ComposerFlagsModule(), new MarketingFlagsModule(), new FintechFlagsModule(), new PushFlagsModule(), new PlayerFlagsModule(), new UploadFlagsModule(), new FreshFlagsModule(), new PdpFlagsModule(), new UgcCoreFlagsModule(), new UgcFlagsModule(), new AdvFlagsModule(), new CsmaFlagsModule(), new UniversalWidgetsFlagsModule(), new SearchFlagsModule(), new FiltersFlagsModule(), new StorefrontFlagsModule(), new TilesFlagsModule(), new SeparatorFlagsModule(), new TravelEntryFlagsModule(), new TravelGeneralFlagsModule(), new TravelPreCreateWidgetsConfigurationFlagModule(), new TravelHotelsFlagsModule(), new TravelHotelsMapFlagsModule(), new TravelMapFlagsModule(), new TravelOrderFlagsModule(), new CheckoutFlagsModule(), new CartFlagsModule(), new CartPrefetchFlagsModule(), new CartCommonFlagsModule(), new MessengerFlagsModule(), new MapFlagsModule(), new DeprecatedFeatureFlagsModule(), new CacheFeatureFlagsRegistryModule(), new RedirectFeatureFlagsRegistryModule(), new PreCreationFeatureFlagsModule(), new AtomActionFlagModule(), new WarmupFeatureFlagsModule(), new PrefetchFlagsModule(), new CommonWidgetsFeatureFlagsModule(), new GeoFlagsModule(), new AndroidPlatformFlagsModule(), new ComposeWarmupFlagModule(), new FavoritesDomainFlagsModule(), new DSFlagsModule(), new PaymentFlagsModule(), new RegularDrawFlagsModule(), new MonetizationFlagsModule(), new CommonActionHandlersFlagsModule(), new TravelToursFlagsModule(), new TilesDomainFlagsModule(), applicationComponent, advertisingMessagingApi, storageComponentApi, limb2ComponentApi, composerDebugMenuHostApiComponent, 0);
        }

        private Factory() {
        }
    }

    private static final class NetworkDependencyComponentImpl implements NetworkDependencyComponent {
        private a<AdultCookieHandler> adultCookieHandlerProvider;
        private a<AdultCookieListener> adultCookieListenerProvider;
        private final AdvFlagsModule advFlagsModule;
        private final AdvertisingMessagingApi advertisingMessagingApi;
        private final AnalyticsFlagsModule analyticsFlagsModule;
        private final AndroidPlatformFlagsModule androidPlatformFlagsModule;
        private a<AntibotPerfAnalyticServiceImpl> antibotPerfAnalyticServiceImplProvider;
        private final ApplicationComponent applicationComponent;
        private final AtomActionFlagModule atomActionFlagModule;
        private a<AuthNetworkServiceImpl> authNetworkServiceImplProvider;
        private a<AntibotPerfAnalyticService> bindAntibotPerfAnalyticServiceProvider;
        private a<AuthNetworkService> bindAuthNetworkServiceProvider;
        private a<DebugHeaderService> bindDebugHeaderServiceProvider;
        private a<ExtraHeadersService> bindExtraHeadersServiceProvider;
        private a<LogRequestsService> bindLogRequestsServiceProvider;
        private a<NetworkHistoryService> bindNetworkHistoryServiceProvider;
        private a<BugReportCookieListener> bugReportCookieListenerProvider;
        private final CacheFeatureFlagsRegistryModule cacheFeatureFlagsRegistryModule;
        private final CartCommonFlagsModule cartCommonFlagsModule;
        private final CartFlagsModule cartFlagsModule;
        private final CartPrefetchFlagsModule cartPrefetchFlagsModule;
        private final CheckoutFlagsModule checkoutFlagsModule;
        private final CommonActionHandlersFlagsModule commonActionHandlersFlagsModule;
        private final CommonWidgetsFeatureFlagsModule commonWidgetsFeatureFlagsModule;
        private final ComposeWarmupFlagModule composeWarmupFlagModule;
        private final ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent;
        private final ComposerFlagsModule composerFlagsModule;
        private final CsmaFlagsModule csmaFlagsModule;
        private final DSFlagsModule dSFlagsModule;
        private a<DebugHeaderServiceImpl> debugHeaderServiceImplProvider;
        private final DeprecatedFeatureFlagsModule deprecatedFeatureFlagsModule;
        private a<ExtraCookiesHandler> extraCookiesHandlerProvider;
        private a<ExtraCookiesListener> extraCookiesListenerProvider;
        private a<ExtraHeadersServiceImpl> extraHeadersServiceImplProvider;
        private final FavoritesDomainFlagsModule favoritesDomainFlagsModule;
        private final FiltersFlagsModule filtersFlagsModule;
        private final FintechFlagsModule fintechFlagsModule;
        private final FreshFlagsModule freshFlagsModule;
        private final GeoFlagsModule geoFlagsModule;
        private a<ExtraHeadersDataSource> getExtraHeadersDataSourceProvider;
        private final Limb2ComponentApi limb2ComponentApi;
        private a<LogRequestsServiceImpl> logRequestsServiceImplProvider;
        private final MapFlagsModule mapFlagsModule;
        private final MarketingFlagsModule marketingFlagsModule;
        private final MessengerFlagsModule messengerFlagsModule;
        private final MonetizationFlagsModule monetizationFlagsModule;
        private final NetworkConverterModule networkConverterModule;
        private final NetworkDependencyComponentImpl networkDependencyComponentImpl;
        private final NetworkFlagsModule networkFlagsModule;
        private a<NetworkHistoryServiceImpl> networkHistoryServiceImplProvider;
        private final PaymentFlagsModule paymentFlagsModule;
        private final PdpFlagsModule pdpFlagsModule;
        private final PikazonFlagsModule pikazonFlagsModule;
        private final PlayerFlagsModule playerFlagsModule;
        private final PreCreationFeatureFlagsModule preCreationFeatureFlagsModule;
        private final PrefetchFlagsModule prefetchFlagsModule;
        private a<g> provideAdultCookieHandlersProvider;
        private a<CookieListener> provideAdultCookieListenersProvider;
        private a<AppVersionService> provideAppVersionServiceProvider;
        private a<AutoTestTraceIdInterceptorDependencies> provideAutoTestUserTraceInterceptorDependenciesProvider;
        private a<CookieListener> provideBugReportCookieListenersProvider;
        private a<g> provideCookieHandlersProvider;
        private a<CookieListener> provideCookieListenersProvider;
        private a<NetworkHeadersDependencies> provideCustomHeadersInterceptorDependenciesProvider;
        private a<Long> provideFeatureServiceRefreshIntervalMsProvider;
        private a<NetworkComponentConfig> provideNetworkComponentConfigProvider;
        private a<g> provideTeensModeCookieHandlersProvider;
        private a<CookieListener> provideTeensModeCookieListenersProvider;
        private final PushFlagsModule pushFlagsModule;
        private final RedirectFeatureFlagsRegistryModule redirectFeatureFlagsRegistryModule;
        private final RegularDrawFlagsModule regularDrawFlagsModule;
        private final SearchFlagsModule searchFlagsModule;
        private final SeparatorFlagsModule separatorFlagsModule;
        private final StorageComponentApi storageComponentApi;
        private final StorefrontFlagsModule storefrontFlagsModule;
        private a<TeensModeCookieHandler> teensModeCookieHandlerProvider;
        private a<TeensModeCookieListener> teensModeCookieListenerProvider;
        private final TilesDomainFlagsModule tilesDomainFlagsModule;
        private final TilesFlagsModule tilesFlagsModule;
        private final TravelEntryFlagsModule travelEntryFlagsModule;
        private final TravelGeneralFlagsModule travelGeneralFlagsModule;
        private final TravelHotelsFlagsModule travelHotelsFlagsModule;
        private final TravelHotelsMapFlagsModule travelHotelsMapFlagsModule;
        private final TravelMapFlagsModule travelMapFlagsModule;
        private final TravelOrderFlagsModule travelOrderFlagsModule;
        private final TravelPreCreateWidgetsConfigurationFlagModule travelPreCreateWidgetsConfigurationFlagModule;
        private final TravelToursFlagsModule travelToursFlagsModule;
        private final UgcCoreFlagsModule ugcCoreFlagsModule;
        private final UgcFlagsModule ugcFlagsModule;
        private final UniversalWidgetsFlagsModule universalWidgetsFlagsModule;
        private final UploadFlagsModule uploadFlagsModule;
        private final WarmupFeatureFlagsModule warmupFeatureFlagsModule;
        private final WhitelistFlagsModule whitelistFlagsModule;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92939id;
            private final NetworkDependencyComponentImpl networkDependencyComponentImpl;

            SwitchingProvider(NetworkDependencyComponentImpl networkDependencyComponentImpl, int i11) {
                this.networkDependencyComponentImpl = networkDependencyComponentImpl;
                this.f92939id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92939id) {
                    case 0:
                        return (T) new ExtraHeadersServiceImpl(this.networkDependencyComponentImpl.getExtraHeadersDataSourceProvider);
                    case 1:
                        T t2 = (T) this.networkDependencyComponentImpl.storageComponentApi.getExtraHeadersDataSource();
                        j.c(t2);
                        return t2;
                    case 2:
                        NetworkDependencyModule.Companion companion = NetworkDependencyModule.INSTANCE;
                        DebugToolsService debugToolService = this.networkDependencyComponentImpl.storageComponentApi.getDebugToolService();
                        j.c(debugToolService);
                        return (T) companion.provideFeatureServiceRefreshIntervalMs(debugToolService);
                    case 3:
                        AppType appType = this.networkDependencyComponentImpl.applicationComponent.getAppType();
                        j.c(appType);
                        AppVersionStorage appVersionStorage = this.networkDependencyComponentImpl.storageComponentApi.getAppVersionStorage();
                        j.c(appVersionStorage);
                        return (T) NetworkDependencyModule_Companion_ProvideAppVersionServiceFactory.provideAppVersionService(appType, appVersionStorage);
                    case 4:
                        Context context = this.networkDependencyComponentImpl.applicationComponent.getContext();
                        j.c(context);
                        return (T) new AuthNetworkServiceImpl(context);
                    case 5:
                        DebugToolsService debugToolService2 = this.networkDependencyComponentImpl.storageComponentApi.getDebugToolService();
                        j.c(debugToolService2);
                        InterfaceC6608a provideComposerDebugMenuHostApi = this.networkDependencyComponentImpl.composerDebugMenuHostApiComponent.provideComposerDebugMenuHostApi();
                        j.c(provideComposerDebugMenuHostApi);
                        return (T) new DebugHeaderServiceImpl(debugToolService2, provideComposerDebugMenuHostApi);
                    case 6:
                        NetworkHistoryDao networkHistoryDao = this.networkDependencyComponentImpl.storageComponentApi.getNetworkHistoryDao();
                        j.c(networkHistoryDao);
                        UserStatusStorage userStatusStorage = this.networkDependencyComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage);
                        return (T) new NetworkHistoryServiceImpl(networkHistoryDao, userStatusStorage);
                    case 7:
                        UserStatusStorage userStatusStorage2 = this.networkDependencyComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage2);
                        Context context2 = this.networkDependencyComponentImpl.applicationComponent.getContext();
                        j.c(context2);
                        return (T) new LogRequestsServiceImpl(userStatusStorage2, context2);
                    case 8:
                        Context context3 = this.networkDependencyComponentImpl.applicationComponent.getContext();
                        j.c(context3);
                        return (T) new AntibotPerfAnalyticServiceImpl(context3);
                    case 9:
                        return (T) new AdultCookieListener(this.networkDependencyComponentImpl.adultStateProcessor());
                    case 10:
                        ExtraCookieStorage extraCookieStorage = this.networkDependencyComponentImpl.storageComponentApi.getExtraCookieStorage();
                        j.c(extraCookieStorage);
                        return (T) new ExtraCookiesListener(extraCookieStorage);
                    case 11:
                        TeensModeStorage teensModeStorage = this.networkDependencyComponentImpl.storageComponentApi.getTeensModeStorage();
                        j.c(teensModeStorage);
                        return (T) new TeensModeCookieListener(teensModeStorage);
                    case 12:
                        BugReportCookieState bugReportCookieState = this.networkDependencyComponentImpl.storageComponentApi.getBugReportCookieState();
                        j.c(bugReportCookieState);
                        return (T) new BugReportCookieListener(bugReportCookieState);
                    case 13:
                        return (T) new AdultCookieHandler(this.networkDependencyComponentImpl.adultStateProcessor());
                    case 14:
                        ExtraCookieStorage extraCookieStorage2 = this.networkDependencyComponentImpl.storageComponentApi.getExtraCookieStorage();
                        j.c(extraCookieStorage2);
                        return (T) new ExtraCookiesHandler(extraCookieStorage2);
                    case 15:
                        TeensModeStorage teensModeStorage2 = this.networkDependencyComponentImpl.storageComponentApi.getTeensModeStorage();
                        j.c(teensModeStorage2);
                        return (T) new TeensModeCookieHandler(teensModeStorage2);
                    case 16:
                        String staticApiUrl = this.networkDependencyComponentImpl.applicationComponent.getStaticApiUrl();
                        j.c(staticApiUrl);
                        String apiUrlSuffix = this.networkDependencyComponentImpl.applicationComponent.getApiUrlSuffix();
                        j.c(apiUrlSuffix);
                        e appDomain = this.networkDependencyComponentImpl.applicationComponent.getAppDomain();
                        j.c(appDomain);
                        DeviceType deviceType = this.networkDependencyComponentImpl.applicationComponent.getDeviceType();
                        j.c(deviceType);
                        return (T) NetworkDependencyModule_Companion_ProvideNetworkComponentConfigFactory.provideNetworkComponentConfig(staticApiUrl, apiUrlSuffix, appDomain, deviceType, this.networkDependencyComponentImpl.applicationComponent.getDebugFlag());
                    case 17:
                        UserStatusStorage userStatusStorage3 = this.networkDependencyComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage3);
                        return (T) NetworkDependencyModule_Companion_ProvideAutoTestUserTraceInterceptorDependenciesFactory.provideAutoTestUserTraceInterceptorDependencies(userStatusStorage3);
                    case 18:
                        AdvertisingMessagingInteractor advertisingMessagingInteractor = this.networkDependencyComponentImpl.advertisingMessagingApi.getAdvertisingMessagingInteractor();
                        j.c(advertisingMessagingInteractor);
                        RailwayMockStorage railwayMockStorage = this.networkDependencyComponentImpl.storageComponentApi.getRailwayMockStorage();
                        j.c(railwayMockStorage);
                        UserStatusStorage userStatusStorage4 = this.networkDependencyComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage4);
                        Context context4 = this.networkDependencyComponentImpl.applicationComponent.getContext();
                        j.c(context4);
                        return (T) NetworkDependencyModule_Companion_ProvideCustomHeadersInterceptorDependenciesFactory.provideCustomHeadersInterceptorDependencies(advertisingMessagingInteractor, railwayMockStorage, userStatusStorage4, context4);
                    default:
                        throw new AssertionError(this.f92939id);
                }
            }
        }

        /* synthetic */ NetworkDependencyComponentImpl(NetworkConverterModule networkConverterModule, AnalyticsFlagsModule analyticsFlagsModule, PikazonFlagsModule pikazonFlagsModule, NetworkFlagsModule networkFlagsModule, WhitelistFlagsModule whitelistFlagsModule, ComposerFlagsModule composerFlagsModule, MarketingFlagsModule marketingFlagsModule, FintechFlagsModule fintechFlagsModule, PushFlagsModule pushFlagsModule, PlayerFlagsModule playerFlagsModule, UploadFlagsModule uploadFlagsModule, FreshFlagsModule freshFlagsModule, PdpFlagsModule pdpFlagsModule, UgcCoreFlagsModule ugcCoreFlagsModule, UgcFlagsModule ugcFlagsModule, AdvFlagsModule advFlagsModule, CsmaFlagsModule csmaFlagsModule, UniversalWidgetsFlagsModule universalWidgetsFlagsModule, SearchFlagsModule searchFlagsModule, FiltersFlagsModule filtersFlagsModule, StorefrontFlagsModule storefrontFlagsModule, TilesFlagsModule tilesFlagsModule, SeparatorFlagsModule separatorFlagsModule, TravelEntryFlagsModule travelEntryFlagsModule, TravelGeneralFlagsModule travelGeneralFlagsModule, TravelPreCreateWidgetsConfigurationFlagModule travelPreCreateWidgetsConfigurationFlagModule, TravelHotelsFlagsModule travelHotelsFlagsModule, TravelHotelsMapFlagsModule travelHotelsMapFlagsModule, TravelMapFlagsModule travelMapFlagsModule, TravelOrderFlagsModule travelOrderFlagsModule, CheckoutFlagsModule checkoutFlagsModule, CartFlagsModule cartFlagsModule, CartPrefetchFlagsModule cartPrefetchFlagsModule, CartCommonFlagsModule cartCommonFlagsModule, MessengerFlagsModule messengerFlagsModule, MapFlagsModule mapFlagsModule, DeprecatedFeatureFlagsModule deprecatedFeatureFlagsModule, CacheFeatureFlagsRegistryModule cacheFeatureFlagsRegistryModule, RedirectFeatureFlagsRegistryModule redirectFeatureFlagsRegistryModule, PreCreationFeatureFlagsModule preCreationFeatureFlagsModule, AtomActionFlagModule atomActionFlagModule, WarmupFeatureFlagsModule warmupFeatureFlagsModule, PrefetchFlagsModule prefetchFlagsModule, CommonWidgetsFeatureFlagsModule commonWidgetsFeatureFlagsModule, GeoFlagsModule geoFlagsModule, AndroidPlatformFlagsModule androidPlatformFlagsModule, ComposeWarmupFlagModule composeWarmupFlagModule, FavoritesDomainFlagsModule favoritesDomainFlagsModule, DSFlagsModule dSFlagsModule, PaymentFlagsModule paymentFlagsModule, RegularDrawFlagsModule regularDrawFlagsModule, MonetizationFlagsModule monetizationFlagsModule, CommonActionHandlersFlagsModule commonActionHandlersFlagsModule, TravelToursFlagsModule travelToursFlagsModule, TilesDomainFlagsModule tilesDomainFlagsModule, ApplicationComponent applicationComponent, AdvertisingMessagingApi advertisingMessagingApi, StorageComponentApi storageComponentApi, Limb2ComponentApi limb2ComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, int i11) {
            this(networkConverterModule, analyticsFlagsModule, pikazonFlagsModule, networkFlagsModule, whitelistFlagsModule, composerFlagsModule, marketingFlagsModule, fintechFlagsModule, pushFlagsModule, playerFlagsModule, uploadFlagsModule, freshFlagsModule, pdpFlagsModule, ugcCoreFlagsModule, ugcFlagsModule, advFlagsModule, csmaFlagsModule, universalWidgetsFlagsModule, searchFlagsModule, filtersFlagsModule, storefrontFlagsModule, tilesFlagsModule, separatorFlagsModule, travelEntryFlagsModule, travelGeneralFlagsModule, travelPreCreateWidgetsConfigurationFlagModule, travelHotelsFlagsModule, travelHotelsMapFlagsModule, travelMapFlagsModule, travelOrderFlagsModule, checkoutFlagsModule, cartFlagsModule, cartPrefetchFlagsModule, cartCommonFlagsModule, messengerFlagsModule, mapFlagsModule, deprecatedFeatureFlagsModule, cacheFeatureFlagsRegistryModule, redirectFeatureFlagsRegistryModule, preCreationFeatureFlagsModule, atomActionFlagModule, warmupFeatureFlagsModule, prefetchFlagsModule, commonWidgetsFeatureFlagsModule, geoFlagsModule, androidPlatformFlagsModule, composeWarmupFlagModule, favoritesDomainFlagsModule, dSFlagsModule, paymentFlagsModule, regularDrawFlagsModule, monetizationFlagsModule, commonActionHandlersFlagsModule, travelToursFlagsModule, tilesDomainFlagsModule, applicationComponent, advertisingMessagingApi, storageComponentApi, limb2ComponentApi, composerDebugMenuHostApiComponent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AdultStateProcessor adultStateProcessor() {
            AdultState adultState = this.storageComponentApi.getAdultState();
            j.c(adultState);
            AdultStateStore adultStore = this.storageComponentApi.getAdultStore();
            j.c(adultStore);
            return new AdultStateProcessor(adultState, adultStore);
        }

        private void initialize(NetworkConverterModule networkConverterModule, AnalyticsFlagsModule analyticsFlagsModule, PikazonFlagsModule pikazonFlagsModule, NetworkFlagsModule networkFlagsModule, WhitelistFlagsModule whitelistFlagsModule, ComposerFlagsModule composerFlagsModule, MarketingFlagsModule marketingFlagsModule, FintechFlagsModule fintechFlagsModule, PushFlagsModule pushFlagsModule, PlayerFlagsModule playerFlagsModule, UploadFlagsModule uploadFlagsModule, FreshFlagsModule freshFlagsModule, PdpFlagsModule pdpFlagsModule, UgcCoreFlagsModule ugcCoreFlagsModule, UgcFlagsModule ugcFlagsModule, AdvFlagsModule advFlagsModule, CsmaFlagsModule csmaFlagsModule, UniversalWidgetsFlagsModule universalWidgetsFlagsModule, SearchFlagsModule searchFlagsModule, FiltersFlagsModule filtersFlagsModule, StorefrontFlagsModule storefrontFlagsModule, TilesFlagsModule tilesFlagsModule, SeparatorFlagsModule separatorFlagsModule, TravelEntryFlagsModule travelEntryFlagsModule, TravelGeneralFlagsModule travelGeneralFlagsModule, TravelPreCreateWidgetsConfigurationFlagModule travelPreCreateWidgetsConfigurationFlagModule, TravelHotelsFlagsModule travelHotelsFlagsModule, TravelHotelsMapFlagsModule travelHotelsMapFlagsModule, TravelMapFlagsModule travelMapFlagsModule, TravelOrderFlagsModule travelOrderFlagsModule, CheckoutFlagsModule checkoutFlagsModule, CartFlagsModule cartFlagsModule, CartPrefetchFlagsModule cartPrefetchFlagsModule, CartCommonFlagsModule cartCommonFlagsModule, MessengerFlagsModule messengerFlagsModule, MapFlagsModule mapFlagsModule, DeprecatedFeatureFlagsModule deprecatedFeatureFlagsModule, CacheFeatureFlagsRegistryModule cacheFeatureFlagsRegistryModule, RedirectFeatureFlagsRegistryModule redirectFeatureFlagsRegistryModule, PreCreationFeatureFlagsModule preCreationFeatureFlagsModule, AtomActionFlagModule atomActionFlagModule, WarmupFeatureFlagsModule warmupFeatureFlagsModule, PrefetchFlagsModule prefetchFlagsModule, CommonWidgetsFeatureFlagsModule commonWidgetsFeatureFlagsModule, GeoFlagsModule geoFlagsModule, AndroidPlatformFlagsModule androidPlatformFlagsModule, ComposeWarmupFlagModule composeWarmupFlagModule, FavoritesDomainFlagsModule favoritesDomainFlagsModule, DSFlagsModule dSFlagsModule, PaymentFlagsModule paymentFlagsModule, RegularDrawFlagsModule regularDrawFlagsModule, MonetizationFlagsModule monetizationFlagsModule, CommonActionHandlersFlagsModule commonActionHandlersFlagsModule, TravelToursFlagsModule travelToursFlagsModule, TilesDomainFlagsModule tilesDomainFlagsModule, ApplicationComponent applicationComponent, AdvertisingMessagingApi advertisingMessagingApi, StorageComponentApi storageComponentApi, Limb2ComponentApi limb2ComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent) {
            this.getExtraHeadersDataSourceProvider = new SwitchingProvider(this.networkDependencyComponentImpl, 1);
            SwitchingProvider switchingProvider = new SwitchingProvider(this.networkDependencyComponentImpl, 0);
            this.extraHeadersServiceImplProvider = switchingProvider;
            this.bindExtraHeadersServiceProvider = d.b(switchingProvider);
            this.provideFeatureServiceRefreshIntervalMsProvider = d.b(new SwitchingProvider(this.networkDependencyComponentImpl, 2));
            this.provideAppVersionServiceProvider = d.b(new SwitchingProvider(this.networkDependencyComponentImpl, 3));
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.networkDependencyComponentImpl, 4);
            this.authNetworkServiceImplProvider = switchingProvider2;
            this.bindAuthNetworkServiceProvider = d.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.networkDependencyComponentImpl, 5);
            this.debugHeaderServiceImplProvider = switchingProvider3;
            this.bindDebugHeaderServiceProvider = d.b(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.networkDependencyComponentImpl, 6);
            this.networkHistoryServiceImplProvider = switchingProvider4;
            this.bindNetworkHistoryServiceProvider = d.b(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.networkDependencyComponentImpl, 7);
            this.logRequestsServiceImplProvider = switchingProvider5;
            this.bindLogRequestsServiceProvider = d.b(switchingProvider5);
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.networkDependencyComponentImpl, 8);
            this.antibotPerfAnalyticServiceImplProvider = switchingProvider6;
            this.bindAntibotPerfAnalyticServiceProvider = d.b(switchingProvider6);
            SwitchingProvider switchingProvider7 = new SwitchingProvider(this.networkDependencyComponentImpl, 9);
            this.adultCookieListenerProvider = switchingProvider7;
            this.provideAdultCookieListenersProvider = d.b(switchingProvider7);
            SwitchingProvider switchingProvider8 = new SwitchingProvider(this.networkDependencyComponentImpl, 10);
            this.extraCookiesListenerProvider = switchingProvider8;
            this.provideCookieListenersProvider = d.b(switchingProvider8);
            SwitchingProvider switchingProvider9 = new SwitchingProvider(this.networkDependencyComponentImpl, 11);
            this.teensModeCookieListenerProvider = switchingProvider9;
            this.provideTeensModeCookieListenersProvider = d.b(switchingProvider9);
            SwitchingProvider switchingProvider10 = new SwitchingProvider(this.networkDependencyComponentImpl, 12);
            this.bugReportCookieListenerProvider = switchingProvider10;
            this.provideBugReportCookieListenersProvider = d.b(switchingProvider10);
            SwitchingProvider switchingProvider11 = new SwitchingProvider(this.networkDependencyComponentImpl, 13);
            this.adultCookieHandlerProvider = switchingProvider11;
            this.provideAdultCookieHandlersProvider = d.b(switchingProvider11);
            SwitchingProvider switchingProvider12 = new SwitchingProvider(this.networkDependencyComponentImpl, 14);
            this.extraCookiesHandlerProvider = switchingProvider12;
            this.provideCookieHandlersProvider = d.b(switchingProvider12);
            SwitchingProvider switchingProvider13 = new SwitchingProvider(this.networkDependencyComponentImpl, 15);
            this.teensModeCookieHandlerProvider = switchingProvider13;
            this.provideTeensModeCookieHandlersProvider = d.b(switchingProvider13);
            this.provideNetworkComponentConfigProvider = d.b(new SwitchingProvider(this.networkDependencyComponentImpl, 16));
            this.provideAutoTestUserTraceInterceptorDependenciesProvider = d.b(new SwitchingProvider(this.networkDependencyComponentImpl, 17));
            this.provideCustomHeadersInterceptorDependenciesProvider = d.b(new SwitchingProvider(this.networkDependencyComponentImpl, 18));
        }

        private Set<Object> provideAdapters() {
            NetworkConverterModule networkConverterModule = this.networkConverterModule;
            Application application = this.applicationComponent.getApplication();
            j.c(application);
            return NetworkConverterModule_ProvideAdaptersFactory.provideAdapters(networkConverterModule, application);
        }

        private Set<FeatureFlagRegistrationModel> provideFlags() {
            TilesFlagsModule tilesFlagsModule = this.tilesFlagsModule;
            EnvironmentService environmentService = this.storageComponentApi.getEnvironmentService();
            j.c(environmentService);
            return TilesFlagsModule_ProvideFlagsFactory.provideFlags(tilesFlagsModule, environmentService);
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public String apiUrl() {
            String staticApiUrl = this.applicationComponent.getStaticApiUrl();
            j.c(staticApiUrl);
            return staticApiUrl;
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public AntibotPerfAnalyticService getAntibotPerfAnalyticService() {
            return this.bindAntibotPerfAnalyticServiceProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public AppVersionService getAppVersionService() {
            return this.provideAppVersionServiceProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public AuthNetworkService getAuthNetworkService() {
            return this.bindAuthNetworkServiceProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public AutoTestTraceIdInterceptorDependencies getAutoTestTraceIdInterceptorDependencies() {
            return this.provideAutoTestUserTraceInterceptorDependenciesProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public Set<CookieListener> getCookieListeners() {
            return A.G(this.provideAdultCookieListenersProvider.get(), this.provideCookieListenersProvider.get(), this.provideTeensModeCookieListenersProvider.get(), this.provideBugReportCookieListenersProvider.get());
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public DebugHeaderService getDebugHeaderService() {
            return this.bindDebugHeaderServiceProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public ExtraHeadersService getExtraHeadersService() {
            return this.bindExtraHeadersServiceProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public Set<FeatureFlagRegistrationModel> getFeatureFlags() {
            A.a m11 = A.m(54);
            m11.l(AnalyticsFlagsModule_ProvideFeatureFlagsFactory.provideFeatureFlags(this.analyticsFlagsModule));
            m11.l(PikazonFlagsModule_ProvideFlagsFactory.provideFlags(this.pikazonFlagsModule));
            m11.l(NetworkFlagsModule_ProvideFlagsFactory.provideFlags(this.networkFlagsModule));
            m11.l(WhitelistFlagsModule_ProvideFlagsFactory.provideFlags(this.whitelistFlagsModule));
            m11.l(ComposerFlagsModule_ProvideComposerFlagsFactory.provideComposerFlags(this.composerFlagsModule));
            m11.l(MarketingFlagsModule_ProvideFlagsFactory.provideFlags(this.marketingFlagsModule));
            m11.l(FintechFlagsModule_ProvideFlagsFactory.provideFlags(this.fintechFlagsModule));
            m11.l(PushFlagsModule_ProvideFlagsFactory.provideFlags(this.pushFlagsModule));
            m11.l(PlayerFlagsModule_ProvideFlagsFactory.provideFlags(this.playerFlagsModule));
            m11.l(UploadFlagsModule_ProvideFlagsFactory.provideFlags(this.uploadFlagsModule));
            m11.l(FreshFlagsModule_ProvideFlagsFactory.provideFlags(this.freshFlagsModule));
            m11.l(PdpFlagsModule_ProvideFlagsFactory.provideFlags(this.pdpFlagsModule));
            m11.l(UgcCoreFlagsModule_ProvideFlags$core_prodGoogleAllVendorsReleaseFactory.provideFlags$core_prodGoogleAllVendorsRelease(this.ugcCoreFlagsModule));
            m11.l(UgcFlagsModule_ProvideFlags$ugc_prodGoogleAllVendorsReleaseFactory.provideFlags$ugc_prodGoogleAllVendorsRelease(this.ugcFlagsModule));
            m11.l(AdvFlagsModule_ProvideFlagsFactory.provideFlags(this.advFlagsModule));
            m11.l(CsmaFlagsModule_ProvideFlagFactory.provideFlag(this.csmaFlagsModule));
            m11.l(UniversalWidgetsFlagsModule_ProvideFlagsFactory.provideFlags(this.universalWidgetsFlagsModule));
            m11.l(SearchFlagsModule_ProvideFlagsFactory.provideFlags(this.searchFlagsModule));
            m11.l(FiltersFlagsModule_ProvideFlagsFactory.provideFlags(this.filtersFlagsModule));
            m11.l(StorefrontFlagsModule_ProvideFlagsFactory.provideFlags(this.storefrontFlagsModule));
            m11.l(provideFlags());
            m11.j(SeparatorFlagsModule_ProvideFlagsFactory.provideFlags(this.separatorFlagsModule));
            m11.l(TravelEntryFlagsModule_ProvideFlagsFactory.provideFlags(this.travelEntryFlagsModule));
            m11.l(TravelGeneralFlagsModule_ProvideFlagsFactory.provideFlags(this.travelGeneralFlagsModule));
            m11.l(TravelPreCreateWidgetsConfigurationFlagModule_ProvidePreCreationFlagsFactory.providePreCreationFlags(this.travelPreCreateWidgetsConfigurationFlagModule));
            m11.l(TravelHotelsFlagsModule_ProvideFlagsFactory.provideFlags(this.travelHotelsFlagsModule));
            m11.l(TravelHotelsMapFlagsModule_ProvideFlagsFactory.provideFlags(this.travelHotelsMapFlagsModule));
            m11.l(TravelMapFlagsModule_ProvideFlagsFactory.provideFlags(this.travelMapFlagsModule));
            m11.l(TravelOrderFlagsModule_ProvideFlagsFactory.provideFlags(this.travelOrderFlagsModule));
            m11.l(CheckoutFlagsModule_ProvideFlagsFactory.provideFlags(this.checkoutFlagsModule));
            m11.l(CartFlagsModule_ProvideFlagsFactory.provideFlags(this.cartFlagsModule));
            m11.l(CartPrefetchFlagsModule_ProvideFlagsFactory.provideFlags(this.cartPrefetchFlagsModule));
            m11.l(CartCommonFlagsModule_ProvideCartCommonFlagsFactory.provideCartCommonFlags(this.cartCommonFlagsModule));
            m11.l(MessengerFlagsModule_ProvideFeatureFlagsFactory.provideFeatureFlags(this.messengerFlagsModule));
            m11.l(MapFlagsModule_ProvideFlagsFactory.provideFlags(this.mapFlagsModule));
            m11.l(DeprecatedFeatureFlagsModule_ProvideFlagsFactory.provideFlags(this.deprecatedFeatureFlagsModule));
            m11.l(CacheFeatureFlagsRegistryModule_ProvideRegistrationModelsFactory.provideRegistrationModels(this.cacheFeatureFlagsRegistryModule));
            m11.l(RedirectFeatureFlagsRegistryModule_ProvideFeatureFlagsFactory.provideFeatureFlags(this.redirectFeatureFlagsRegistryModule));
            m11.l(PreCreationFeatureFlagsModule_ProvidePreCreationFlagsFactory.providePreCreationFlags(this.preCreationFeatureFlagsModule));
            m11.l(AtomActionFlagModule_ProvideFlagsFactory.provideFlags(this.atomActionFlagModule));
            m11.l(WarmupFeatureFlagsModule_ProvideWarmupFlagsFactory.provideWarmupFlags(this.warmupFeatureFlagsModule));
            m11.l(PrefetchFlagsModule_ProvidePrefetchFlagsFactory.providePrefetchFlags(this.prefetchFlagsModule));
            m11.l(CommonWidgetsFeatureFlagsModule_ProvideFlagsFactory.provideFlags(this.commonWidgetsFeatureFlagsModule));
            m11.l(GeoFlagsModule_ProvideFlagsFactory.provideFlags(this.geoFlagsModule));
            m11.l(AndroidPlatformFlagsModule_ProvideFlagsFactory.provideFlags(this.androidPlatformFlagsModule));
            m11.l(ComposeWarmupFlagModule_ProvideFlagsFactory.provideFlags(this.composeWarmupFlagModule));
            m11.j(FavoritesDomainFlagsModule_ProvideFavoritesDomainFlagsFactory.provideFavoritesDomainFlags(this.favoritesDomainFlagsModule));
            m11.l(DSFlagsModule_ProvideFlagsFactory.provideFlags(this.dSFlagsModule));
            m11.l(PaymentFlagsModule_ProvideFlagsFactory.provideFlags(this.paymentFlagsModule));
            m11.l(RegularDrawFlagsModule_ProvideFlagsFactory.provideFlags(this.regularDrawFlagsModule));
            m11.l(MonetizationFlagsModule_ProvideFlagsFactory.provideFlags(this.monetizationFlagsModule));
            m11.l(CommonActionHandlersFlagsModule_ProvidePrefetchFlagsFactory.providePrefetchFlags(this.commonActionHandlersFlagsModule));
            m11.l(TravelToursFlagsModule_ProvideFlagsFactory.provideFlags(this.travelToursFlagsModule));
            m11.j(TilesDomainFlagsModule_ProvideFavoritesDomainFlagsFactory.provideFavoritesDomainFlags(this.tilesDomainFlagsModule));
            return m11.m();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public Long getFeatureServiceRefreshInterval() {
            return this.provideFeatureServiceRefreshIntervalMsProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public LogRequestsService getLogRequestsService() {
            return this.bindLogRequestsServiceProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public Set<Object> getMoshiAdapters() {
            return A.u(provideAdapters());
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public NetworkComponentConfig getNetworkComponentConfig() {
            return this.provideNetworkComponentConfigProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public NetworkHeadersDependencies getNetworkHeadersDependencies() {
            return this.provideCustomHeadersInterceptorDependenciesProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public NetworkHistoryService getNetworkHistoryService() {
            return this.bindNetworkHistoryServiceProvider.get();
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public Set<g> getOzonIdCookieHandlers() {
            return A.E(this.provideAdultCookieHandlersProvider.get(), this.provideCookieHandlersProvider.get(), this.provideTeensModeCookieHandlersProvider.get());
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public c getOzonLimbDiStore() {
            c ozonLimbDiStore = this.limb2ComponentApi.getOzonLimbDiStore();
            j.c(ozonLimbDiStore);
            return ozonLimbDiStore;
        }

        @Override // ru.ozon.app.android.network.di.NetworkComponentDependencies
        public CookieManager getWebViewCookieManager() {
            return NetworkDependencyModule.INSTANCE.provideWebViewCookieManager();
        }

        private NetworkDependencyComponentImpl(NetworkConverterModule networkConverterModule, AnalyticsFlagsModule analyticsFlagsModule, PikazonFlagsModule pikazonFlagsModule, NetworkFlagsModule networkFlagsModule, WhitelistFlagsModule whitelistFlagsModule, ComposerFlagsModule composerFlagsModule, MarketingFlagsModule marketingFlagsModule, FintechFlagsModule fintechFlagsModule, PushFlagsModule pushFlagsModule, PlayerFlagsModule playerFlagsModule, UploadFlagsModule uploadFlagsModule, FreshFlagsModule freshFlagsModule, PdpFlagsModule pdpFlagsModule, UgcCoreFlagsModule ugcCoreFlagsModule, UgcFlagsModule ugcFlagsModule, AdvFlagsModule advFlagsModule, CsmaFlagsModule csmaFlagsModule, UniversalWidgetsFlagsModule universalWidgetsFlagsModule, SearchFlagsModule searchFlagsModule, FiltersFlagsModule filtersFlagsModule, StorefrontFlagsModule storefrontFlagsModule, TilesFlagsModule tilesFlagsModule, SeparatorFlagsModule separatorFlagsModule, TravelEntryFlagsModule travelEntryFlagsModule, TravelGeneralFlagsModule travelGeneralFlagsModule, TravelPreCreateWidgetsConfigurationFlagModule travelPreCreateWidgetsConfigurationFlagModule, TravelHotelsFlagsModule travelHotelsFlagsModule, TravelHotelsMapFlagsModule travelHotelsMapFlagsModule, TravelMapFlagsModule travelMapFlagsModule, TravelOrderFlagsModule travelOrderFlagsModule, CheckoutFlagsModule checkoutFlagsModule, CartFlagsModule cartFlagsModule, CartPrefetchFlagsModule cartPrefetchFlagsModule, CartCommonFlagsModule cartCommonFlagsModule, MessengerFlagsModule messengerFlagsModule, MapFlagsModule mapFlagsModule, DeprecatedFeatureFlagsModule deprecatedFeatureFlagsModule, CacheFeatureFlagsRegistryModule cacheFeatureFlagsRegistryModule, RedirectFeatureFlagsRegistryModule redirectFeatureFlagsRegistryModule, PreCreationFeatureFlagsModule preCreationFeatureFlagsModule, AtomActionFlagModule atomActionFlagModule, WarmupFeatureFlagsModule warmupFeatureFlagsModule, PrefetchFlagsModule prefetchFlagsModule, CommonWidgetsFeatureFlagsModule commonWidgetsFeatureFlagsModule, GeoFlagsModule geoFlagsModule, AndroidPlatformFlagsModule androidPlatformFlagsModule, ComposeWarmupFlagModule composeWarmupFlagModule, FavoritesDomainFlagsModule favoritesDomainFlagsModule, DSFlagsModule dSFlagsModule, PaymentFlagsModule paymentFlagsModule, RegularDrawFlagsModule regularDrawFlagsModule, MonetizationFlagsModule monetizationFlagsModule, CommonActionHandlersFlagsModule commonActionHandlersFlagsModule, TravelToursFlagsModule travelToursFlagsModule, TilesDomainFlagsModule tilesDomainFlagsModule, ApplicationComponent applicationComponent, AdvertisingMessagingApi advertisingMessagingApi, StorageComponentApi storageComponentApi, Limb2ComponentApi limb2ComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent) {
            this.networkDependencyComponentImpl = this;
            this.storageComponentApi = storageComponentApi;
            this.applicationComponent = applicationComponent;
            this.composerDebugMenuHostApiComponent = composerDebugMenuHostApiComponent;
            this.networkConverterModule = networkConverterModule;
            this.analyticsFlagsModule = analyticsFlagsModule;
            this.pikazonFlagsModule = pikazonFlagsModule;
            this.networkFlagsModule = networkFlagsModule;
            this.whitelistFlagsModule = whitelistFlagsModule;
            this.composerFlagsModule = composerFlagsModule;
            this.marketingFlagsModule = marketingFlagsModule;
            this.fintechFlagsModule = fintechFlagsModule;
            this.pushFlagsModule = pushFlagsModule;
            this.playerFlagsModule = playerFlagsModule;
            this.uploadFlagsModule = uploadFlagsModule;
            this.freshFlagsModule = freshFlagsModule;
            this.pdpFlagsModule = pdpFlagsModule;
            this.ugcCoreFlagsModule = ugcCoreFlagsModule;
            this.ugcFlagsModule = ugcFlagsModule;
            this.advFlagsModule = advFlagsModule;
            this.csmaFlagsModule = csmaFlagsModule;
            this.universalWidgetsFlagsModule = universalWidgetsFlagsModule;
            this.searchFlagsModule = searchFlagsModule;
            this.filtersFlagsModule = filtersFlagsModule;
            this.storefrontFlagsModule = storefrontFlagsModule;
            this.tilesFlagsModule = tilesFlagsModule;
            this.separatorFlagsModule = separatorFlagsModule;
            this.travelEntryFlagsModule = travelEntryFlagsModule;
            this.travelGeneralFlagsModule = travelGeneralFlagsModule;
            this.travelPreCreateWidgetsConfigurationFlagModule = travelPreCreateWidgetsConfigurationFlagModule;
            this.travelHotelsFlagsModule = travelHotelsFlagsModule;
            this.travelHotelsMapFlagsModule = travelHotelsMapFlagsModule;
            this.travelMapFlagsModule = travelMapFlagsModule;
            this.travelOrderFlagsModule = travelOrderFlagsModule;
            this.checkoutFlagsModule = checkoutFlagsModule;
            this.cartFlagsModule = cartFlagsModule;
            this.cartPrefetchFlagsModule = cartPrefetchFlagsModule;
            this.cartCommonFlagsModule = cartCommonFlagsModule;
            this.messengerFlagsModule = messengerFlagsModule;
            this.mapFlagsModule = mapFlagsModule;
            this.deprecatedFeatureFlagsModule = deprecatedFeatureFlagsModule;
            this.cacheFeatureFlagsRegistryModule = cacheFeatureFlagsRegistryModule;
            this.redirectFeatureFlagsRegistryModule = redirectFeatureFlagsRegistryModule;
            this.preCreationFeatureFlagsModule = preCreationFeatureFlagsModule;
            this.atomActionFlagModule = atomActionFlagModule;
            this.warmupFeatureFlagsModule = warmupFeatureFlagsModule;
            this.prefetchFlagsModule = prefetchFlagsModule;
            this.commonWidgetsFeatureFlagsModule = commonWidgetsFeatureFlagsModule;
            this.geoFlagsModule = geoFlagsModule;
            this.androidPlatformFlagsModule = androidPlatformFlagsModule;
            this.composeWarmupFlagModule = composeWarmupFlagModule;
            this.favoritesDomainFlagsModule = favoritesDomainFlagsModule;
            this.dSFlagsModule = dSFlagsModule;
            this.paymentFlagsModule = paymentFlagsModule;
            this.regularDrawFlagsModule = regularDrawFlagsModule;
            this.monetizationFlagsModule = monetizationFlagsModule;
            this.commonActionHandlersFlagsModule = commonActionHandlersFlagsModule;
            this.travelToursFlagsModule = travelToursFlagsModule;
            this.tilesDomainFlagsModule = tilesDomainFlagsModule;
            this.advertisingMessagingApi = advertisingMessagingApi;
            this.limb2ComponentApi = limb2ComponentApi;
            initialize(networkConverterModule, analyticsFlagsModule, pikazonFlagsModule, networkFlagsModule, whitelistFlagsModule, composerFlagsModule, marketingFlagsModule, fintechFlagsModule, pushFlagsModule, playerFlagsModule, uploadFlagsModule, freshFlagsModule, pdpFlagsModule, ugcCoreFlagsModule, ugcFlagsModule, advFlagsModule, csmaFlagsModule, universalWidgetsFlagsModule, searchFlagsModule, filtersFlagsModule, storefrontFlagsModule, tilesFlagsModule, separatorFlagsModule, travelEntryFlagsModule, travelGeneralFlagsModule, travelPreCreateWidgetsConfigurationFlagModule, travelHotelsFlagsModule, travelHotelsMapFlagsModule, travelMapFlagsModule, travelOrderFlagsModule, checkoutFlagsModule, cartFlagsModule, cartPrefetchFlagsModule, cartCommonFlagsModule, messengerFlagsModule, mapFlagsModule, deprecatedFeatureFlagsModule, cacheFeatureFlagsRegistryModule, redirectFeatureFlagsRegistryModule, preCreationFeatureFlagsModule, atomActionFlagModule, warmupFeatureFlagsModule, prefetchFlagsModule, commonWidgetsFeatureFlagsModule, geoFlagsModule, androidPlatformFlagsModule, composeWarmupFlagModule, favoritesDomainFlagsModule, dSFlagsModule, paymentFlagsModule, regularDrawFlagsModule, monetizationFlagsModule, commonActionHandlersFlagsModule, travelToursFlagsModule, tilesDomainFlagsModule, applicationComponent, advertisingMessagingApi, storageComponentApi, limb2ComponentApi, composerDebugMenuHostApiComponent);
        }
    }

    public static NetworkDependencyComponent.Factory factory() {
        return new Factory(0);
    }
}
