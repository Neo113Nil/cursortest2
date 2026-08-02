package ru.ozon.app.android.di;

import Jb.d;
import Pc.a;
import android.app.Application;
import com.google.common.collect.AbstractC5881z;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import java.util.Map;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.di.factory.AccountComponentFactory;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.account.locale.app.di.AppLocaleDependenciesApi;
import ru.ozon.app.android.account.locale.app.di.factory.AppLocaleComponentFactory;
import ru.ozon.app.android.action.custom.di.CustomActionHandlerComponentFactoryModule;
import ru.ozon.app.android.action.custom.di.CustomActionHandlerComponentFactoryModule_ProvideFactoryFactory;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.di.ActionComponentFactoryModule;
import ru.ozon.app.android.action.di.ActionComponentFactoryModule_ProvideActionComponent$action_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponentApi;
import ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponentFactory;
import ru.ozon.app.android.ads.di.messaging.AdvertisingMessagingApi;
import ru.ozon.app.android.ads.di.messaging.AdvertisingMessagingDependencyFactory;
import ru.ozon.app.android.advertising.di.AdvertisingServiceComponentApi;
import ru.ozon.app.android.advertising.di.factory.AdvertisingServiceComponentFactory;
import ru.ozon.app.android.analytics.di.AnalyticsComponent;
import ru.ozon.app.android.analytics.di.AnalyticsDependencyComponent;
import ru.ozon.app.android.analytics.di.factory.AnalyticsComponentFactory;
import ru.ozon.app.android.analytics.eventstorage.di.EventStorageComponentApi;
import ru.ozon.app.android.analytics.eventstorage.di.EventStorageComponentFactory;
import ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponentApi;
import ru.ozon.app.android.analytics.firebase.di.factory.FirebaseAnalyticsComponentFactory;
import ru.ozon.app.android.analytics.performance.di.factory.ImagesAnalyticsComponentFactory;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.factory.AnalyticsScreenStorageComponentFactory;
import ru.ozon.app.android.analytics.startup.time.di.StartupTimeTrackerComponentApi;
import ru.ozon.app.android.analytics.startup.time.di.factory.StartupTimeTrackerComponentFactory;
import ru.ozon.app.android.app.launch.handlers.di.AppLaunchHandlersComponentApi;
import ru.ozon.app.android.app.launch.handlers.di.factory.AppLaunchHandlersComponentFactory;
import ru.ozon.app.android.bank.di.FintechLibComponentFactory;
import ru.ozon.app.android.bank.domain.FintechLibApi;
import ru.ozon.app.android.bank.push.di.FintechNotificationServiceApi;
import ru.ozon.app.android.bank.push.di.factory.FintechPushComponentFactory;
import ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentApi;
import ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentFactory;
import ru.ozon.app.android.cabinet.di.AuthComponentFactory;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.di.factory.CartComponentFactory;
import ru.ozon.app.android.cart.domain.di.factory.CartDomainComponentFactory;
import ru.ozon.app.android.cart.domain.di.network.CartNetworkDependenciesApi;
import ru.ozon.app.android.cart.domain.di.network.factory.CartNetworkDependenciesComponentFactory;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi;
import ru.ozon.app.android.cart.ui.di.module.CartAtomBinderFactoryModule;
import ru.ozon.app.android.cart.ui.di.module.CartAtomBinderFactoryModule_ProvideAtomBinderFactory$cart_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponentApi;
import ru.ozon.app.android.cdn.host.manager.di.factory.CdnHostManagerComponentFactory;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchApi;
import ru.ozon.app.android.checkoutcomposer.di.common.CheckoutCommonComponentApi;
import ru.ozon.app.android.checkoutcomposer.di.common.CheckoutCommonComponentFactoryModule;
import ru.ozon.app.android.checkoutcomposer.di.common.CheckoutCommonComponentFactoryModule_ProvideFactoryFactory;
import ru.ozon.app.android.checkoutcomposer.prefetch.CheckoutPrefetchComponentFactory;
import ru.ozon.app.android.checkoutgeo.address.di.AddressComponentApi;
import ru.ozon.app.android.checkoutgeo.address.di.factory.AddressComponentFactory;
import ru.ozon.app.android.checkoutgeo.di.network.GeoNetworkDependenciesApi;
import ru.ozon.app.android.checkoutgeo.di.network.GeoNetworkDependenciesComponentFactory;
import ru.ozon.app.android.checkoutgeo.location.di.factory.LocationComponentFactory;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentFactoryModule;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentFactoryModule_ProvideFactoryFactory;
import ru.ozon.app.android.cml.delivery.di.CmlDeliveryComponentApi;
import ru.ozon.app.android.cml.delivery.di.factory.CmlDeliveryComponentFactory;
import ru.ozon.app.android.cml.domain.di.CmlDomainComponentApi;
import ru.ozon.app.android.cml.domain.di.factory.CmlDomainComponentFactory;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.common.di.SearchPrefetchComponentFactory;
import ru.ozon.app.android.common.filterWidgets.filtervalues.di.AppLocaleDependenciesFactory;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.di.CommonActionHandlersFactoryComponent;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.di.CommonActionHandlersFactoryComponentFactoryModule;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.di.CommonActionHandlersFactoryComponentFactoryModule_BindCommonActionStoreComponentFactory$widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.di.RestrictionsComponentApi;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.di.RestrictionsComponentFactoryModule_BindCartComponentFactoryFactory;
import ru.ozon.app.android.composer.di.ComposerComponent;
import ru.ozon.app.android.composer.di.OzonTrackerSupportedPayloadTypesComponentApi;
import ru.ozon.app.android.composer.di.WidgetRegistrationComponentApi;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.cache.di.cacheHandler.CacheHandlerRegistrationComponentApi;
import ru.ozon.app.android.composer.network.prefetch.di.runningPrefetch.RunningPrefetchedRequestUrlsComponentApi;
import ru.ozon.app.android.composer.network.prefetch.di.runningPrefetch.RunningPrefetchedRequestUrlsComponentFactory;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentFactoryModule;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentFactoryModule_ProvideFactoryFactory;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentFactoryModule;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentFactoryModule_ProvideFactoryFactory;
import ru.ozon.app.android.core.navigation.interceptors.predicate.di.InterceptorPredicatesComponent;
import ru.ozon.app.android.core.navigation.interceptors.predicate.di.InterceptorPredicatesComponentFactory;
import ru.ozon.app.android.cscore.copybutton.di.CopyButtonComponentApi;
import ru.ozon.app.android.cscore.copybutton.di.CopyButtonComponentFactory;
import ru.ozon.app.android.debugmenu.di.DebugMenuComponentApi;
import ru.ozon.app.android.debugmenu.di.factory.DebugMenuComponentFactory;
import ru.ozon.app.android.debugmenu.ozondebugmenu.di.OzonDebugMenuComponentApi;
import ru.ozon.app.android.debugmenu.ozondebugmenu.di.factory.OzonDebugMenuComponentFactoryModule;
import ru.ozon.app.android.debugmenu.ozondebugmenu.di.factory.OzonDebugMenuComponentFactoryModule_ProvideNetworkComponentFactory$debugmenu_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.delivery.customActionsHandlers.di.DeliveryCustomActionHandlersApi;
import ru.ozon.app.android.delivery.customActionsHandlers.di.DeliveryCustomActionHandlersComponentFactory;
import ru.ozon.app.android.di.FactoryComponent;
import ru.ozon.app.android.di.component.ApplicationComponent;
import ru.ozon.app.android.di.component.ApplicationComponentFactory;
import ru.ozon.app.android.domain.session.di.auth.AuthComponentApi;
import ru.ozon.app.android.domain.tiles.di.TilesDomainComponentApi;
import ru.ozon.app.android.domain.tiles.di.factory.TilesDomainComponentFactory;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.FailedExternalLinkRetryComponentApi;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.factory.FailedExternalLinkRetryComponentFactory;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.network.di.TilesNetworkDependenciesApi;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.network.di.factory.TilesNetworkDependenciesComponentFactory;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentFactory;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponent;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentFactory;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentFactory;
import ru.ozon.app.android.favorites.ui.di.FavoritesUIComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoritesUIComponentFactory;
import ru.ozon.app.android.fintech.FintechDependencyComponent;
import ru.ozon.app.android.fintech.factory.FintechDependencyFactory;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.di.LegalsResultStateHolderComponentApi;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.di.factory.LegalsResultStateHolderComponentFactory;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di.StatusEdoStateComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di.factory.StatusEdoStateComponentFactory;
import ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi;
import ru.ozon.app.android.fresh.navigation.di.modules.FreshNavigationComponentFactory;
import ru.ozon.app.android.fresh.unsorted.di.FreshComponentApi;
import ru.ozon.app.android.fresh.unsorted.di.FreshComponentFactory;
import ru.ozon.app.android.geo.map.clusterization.di.ClusterizationComponentApi;
import ru.ozon.app.android.geo.map.clusterization.di.ClusterizationComponentFactory;
import ru.ozon.app.android.geoprovider.di.GeoProviderComponentApi;
import ru.ozon.app.android.geoprovider.di.factory.GeoProviderComponentFactoryModule;
import ru.ozon.app.android.geoprovider.di.factory.GeoProviderComponentFactoryModule_ProvideFactoryFactory;
import ru.ozon.app.android.inapppush.InAppPushHostApi;
import ru.ozon.app.android.inapppush.di.factory.InAppPushComponentFactory;
import ru.ozon.app.android.inappupdate.di.InAppUpdateDependencyComponent;
import ru.ozon.app.android.inappupdate.di.InAppUpdateDependencyFactory;
import ru.ozon.app.android.injection.IDaggerComponent;
import ru.ozon.app.android.injection.analytics.factory.OzonTrackerSupportedPayloadTypesComponentFactory;
import ru.ozon.app.android.injection.cache.CacheComponentFactory;
import ru.ozon.app.android.injection.cache.handler.CacheHandlerRegistrationComponentFactory;
import ru.ozon.app.android.injection.factory.factories.ComposerComponentFactory;
import ru.ozon.app.android.injection.factory.factories.IDaggerComponentFactory;
import ru.ozon.app.android.injection.widget.factory.WidgetRegistrationComponentFactory;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.limb.di.Limb2ComponentFactoryModule;
import ru.ozon.app.android.limb.di.Limb2ComponentFactoryModule_ProvideLimb2ComponentFactory$limb_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.limb2.di.Limb2DependencyComponent;
import ru.ozon.app.android.limb2.di.Limb2DependencyFactory;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.map.di.factory.OzonMapComponentFactory;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.factory.MapCommonComponentFactoryModule;
import ru.ozon.app.android.mapcommon.mapcommon.di.factory.MapCommonComponentFactoryModule_BindMapCommonComponentFactoryFactory;
import ru.ozon.app.android.marketing.coupon.di.CouponComponent;
import ru.ozon.app.android.marketing.coupon.di.CouponComponentFactory;
import ru.ozon.app.android.mediaupload.di.MediaUploadComponentApi;
import ru.ozon.app.android.mediaupload.di.factory.MediaUploadComponentFactory;
import ru.ozon.app.android.metrics.client.di.MetricsClientComponentApi;
import ru.ozon.app.android.metrics.client.di.MetricsClientComponentFactoryModule;
import ru.ozon.app.android.metrics.client.di.MetricsClientComponentFactoryModule_ProvideFactoryFactory;
import ru.ozon.app.android.minifyLink.di.MinifyLinkComponentApi;
import ru.ozon.app.android.minifyLink.di.factory.MinifyLinkComponentApiFactory;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.di.factory.NavigationComponentFactoryModule;
import ru.ozon.app.android.navigation.di.factory.NavigationComponentFactoryModule_BindNavigationComponentFactory$navigation_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.network.di.NetworkComponent;
import ru.ozon.app.android.network.di.NetworkDependencyComponent;
import ru.ozon.app.android.network.di.NetworkDependencyFactory;
import ru.ozon.app.android.network.di.factory.NetworkComponentFactoryModule;
import ru.ozon.app.android.network.di.factory.NetworkComponentFactoryModule_ProvideNetworkComponentFactory$network_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.notifications.di.NotificationComponentApi;
import ru.ozon.app.android.notifications.di.factory.NotificationComponentFactory;
import ru.ozon.app.android.offline.di.PdpOfflineScreenComponentApi;
import ru.ozon.app.android.offline.di.PdpOfflineScreenComponentFactory;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl.OrderShipmentComponentApi;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl.OrderShipmentComponentFactoryModule;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl.OrderShipmentComponentFactoryModule_ProvideFactoryFactory;
import ru.ozon.app.android.ordertracking.di.OrderTrackingSingletonComponentApi;
import ru.ozon.app.android.ordertracking.di.OrderTrackingSingletonComponentFactory;
import ru.ozon.app.android.pdfviewer.di.PdfFileComponentApi;
import ru.ozon.app.android.pdfviewer.di.factory.PdfFileComponentFactory;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.di.PdpScreenStateHolderComponent;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.di.PdpScreenStateHolderComponentFactory;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.di.UgcReviewFormComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.di.UgcReviewFormComponentFactory;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.di.SelectionsCoreComponent;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.di.SelectionsCoreComponentFactory;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.di.factory.AndroidPlatformComponentFactory;
import ru.ozon.app.android.push.di.PushComponentApi;
import ru.ozon.app.android.push.di.factory.PushComponentFactoryModule;
import ru.ozon.app.android.push.di.factory.PushComponentFactoryModule_ProvidePushComponentFactory$push_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponentApi;
import ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponentFactory;
import ru.ozon.app.android.returns.ui.di.RmsComponentApi;
import ru.ozon.app.android.returns.ui.di.RmsComponentFactory;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.di.MarkdownBlockComponentFactory;
import ru.ozon.app.android.search.di.SearchComponentApi;
import ru.ozon.app.android.search.di.SearchComponentFactory;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentFactory;
import ru.ozon.app.android.search.widgets.searchOnboarding.di.repository.SearchOnboardingRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchOnboarding.di.repository.SearchOnboardingRepositoryComponentFactory;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchByImageRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchByImageRepositoryComponentFactory;
import ru.ozon.app.android.seller.di.SisBrandFavoriteComponentApi;
import ru.ozon.app.android.seller.di.SisBrandFavoriteComponentFactory;
import ru.ozon.app.android.sentry.di.SentryApiComponent;
import ru.ozon.app.android.sentry.di.module.SentryComponentFactoryModule;
import ru.ozon.app.android.sentry.di.module.SentryComponentFactoryModule_ProvideLimb2ComponentFactory$sentry_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.di.factory.ComposerDebugTokenFactory;
import ru.ozon.app.android.storage.di.factory.StorageComponentFactory;
import ru.ozon.app.android.storage.user.test.TestUserComponentApi;
import ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.di.factory.OnboardingComponentApiFactory;
import ru.ozon.app.android.storefront.feature.notifications.di.factory.NotificationStatusComponentFactory;
import ru.ozon.app.android.storefront.onboardingscreen.di.CloseFlowWatcherComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerFactoryModule;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerFactoryModule_ProvideFactoryFactory;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentFactoryModule;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentFactoryModule_ProvideFactoryFactory;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.MarkdownBlockApi;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StoreFrontCommonComponentFactory;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponent;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontMessengerBlocksApi;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;
import ru.ozon.app.android.tabbar.di.factory.TabsComponentFactory;
import ru.ozon.app.android.thirdpartylibs.config.di.ThirdPartyLibrariesConfigComponentApi;
import ru.ozon.app.android.thirdpartylibs.config.di.factory.ThirdPartyLibrariesConfigComponentFactory;
import ru.ozon.app.android.tileselector.di.TileSelectorComponent;
import ru.ozon.app.android.tileselector.di.TileSelectorComponentFactory;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.di.api.DeeplinkRouteComponentApi;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.di.factory.DeeplinkRouteFactory;
import ru.ozon.app.android.travel.data.storage.di.api.TravelStorageApi;
import ru.ozon.app.android.travel.data.storage.di.factory.TravelStorageFactory;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.TravelPushOnboardingComponentApi;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.TravelPushOnboardingComponentFactory;
import ru.ozon.app.android.travel.map.di.TravelMapApi;
import ru.ozon.app.android.travel.map.di.factory.TravelMapComponentFactory;
import ru.ozon.app.android.travel.ui.tabs.di.TravelUnpaidOrderStorageApi;
import ru.ozon.app.android.ui.start.di.closeFlowWatcher.CloseFlowWatcherFactoryModule;
import ru.ozon.app.android.ui.start.di.closeFlowWatcher.CloseFlowWatcherFactoryModule_ProvideFactoryFactory;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponent;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentFactory;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.di.factory.StorefrontMessengerBlocksComponentFactory;
import ru.ozon.app.android.update.di.InAppUpdateComponentApi;
import ru.ozon.app.android.update.di.factory.InAppUpdateComponentFactoryModule;
import ru.ozon.app.android.update.di.factory.InAppUpdateComponentFactoryModule_ProvideInAppUpdateComponentFactory$in_app_update_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.user.di.TestUserComponentFactory;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.app.android.video.di.CdnVideoComponentApi;
import ru.ozon.app.android.video.di.ImagesAnalyticsComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.di.factory.CdnVideoComponentFactory;
import ru.ozon.app.android.video.di.factory.VideoComponentFactory;
import ru.ozon.app.android.videocover.di.VideoCoverComponent;
import ru.ozon.app.android.videocover.di.VideoCoverComponentFactory;
import ru.ozon.app.android.web.di.WebComponentApi;
import ru.ozon.app.android.web.di.factory.WebComponentFactory;
import ru.ozon.app.android.whitelist.domain.di.WhitelistComponentFactory;

/* loaded from: classes6.dex */
public final class DaggerFactoryComponent {

    private static final class Factory implements FactoryComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.di.FactoryComponent.Factory
        public FactoryComponent create(Application application) {
            application.getClass();
            return new FactoryComponentImpl(new Limb2ComponentFactoryModule(), new SentryComponentFactoryModule(), new NetworkComponentFactoryModule(), new NavigationComponentFactoryModule(), new PushComponentFactoryModule(), new CartAtomBinderFactoryModule(), new InAppUpdateComponentFactoryModule(), new ActionComponentFactoryModule(), new CustomActionHandlerComponentFactoryModule(), new CheckoutCommonComponentFactoryModule(), new CheckoutPaymentComponentFactoryModule(), new ComposerWidgetAsyncComponentFactoryModule(), new MetricsClientComponentFactoryModule(), new GeoProviderComponentFactoryModule(), new MapCommonComponentFactoryModule(), new OnboardingCheckerFactoryModule(), new OzonDebugMenuComponentFactoryModule(), new CloseFlowWatcherFactoryModule(), new CommonActionHandlersFactoryComponentFactoryModule(), new OnBoardingComponentFactoryModule(), new OrderShipmentComponentFactoryModule(), new AppOnboardingComponentFactoryModule(), application, 0);
        }

        private Factory() {
        }
    }

    private static final class FactoryComponentImpl implements FactoryComponent {
        private final ActionComponentFactoryModule actionComponentFactoryModule;
        private final AppOnboardingComponentFactoryModule appOnboardingComponentFactoryModule;
        private final Application application;
        private final CartAtomBinderFactoryModule cartAtomBinderFactoryModule;
        private final CheckoutCommonComponentFactoryModule checkoutCommonComponentFactoryModule;
        private final CheckoutPaymentComponentFactoryModule checkoutPaymentComponentFactoryModule;
        private final CloseFlowWatcherFactoryModule closeFlowWatcherFactoryModule;
        private final CommonActionHandlersFactoryComponentFactoryModule commonActionHandlersFactoryComponentFactoryModule;
        private final ComposerWidgetAsyncComponentFactoryModule composerWidgetAsyncComponentFactoryModule;
        private final CustomActionHandlerComponentFactoryModule customActionHandlerComponentFactoryModule;
        private final FactoryComponentImpl factoryComponentImpl;
        private final GeoProviderComponentFactoryModule geoProviderComponentFactoryModule;
        private final InAppUpdateComponentFactoryModule inAppUpdateComponentFactoryModule;
        private final Limb2ComponentFactoryModule limb2ComponentFactoryModule;
        private final MapCommonComponentFactoryModule mapCommonComponentFactoryModule;
        private final MetricsClientComponentFactoryModule metricsClientComponentFactoryModule;
        private final NavigationComponentFactoryModule navigationComponentFactoryModule;
        private final NetworkComponentFactoryModule networkComponentFactoryModule;
        private final OnBoardingComponentFactoryModule onBoardingComponentFactoryModule;
        private final OnboardingCheckerFactoryModule onboardingCheckerFactoryModule;
        private final OrderShipmentComponentFactoryModule orderShipmentComponentFactoryModule;
        private final OzonDebugMenuComponentFactoryModule ozonDebugMenuComponentFactoryModule;
        private a<C6740b> provideComponentStorageProvider;
        private final PushComponentFactoryModule pushComponentFactoryModule;
        private final SentryComponentFactoryModule sentryComponentFactoryModule;

        private static final class SwitchingProvider<T> implements a<T> {
            private final FactoryComponentImpl factoryComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92517id;

            SwitchingProvider(FactoryComponentImpl factoryComponentImpl, int i11) {
                this.factoryComponentImpl = factoryComponentImpl;
                this.f92517id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92517id == 0) {
                    return (T) FactoryModule_Companion_ProvideComponentStorageFactory.provideComponentStorage(this.factoryComponentImpl.mapOfClassOfAndComponentFactoryOf());
                }
                throw new AssertionError(this.f92517id);
            }
        }

        /* synthetic */ FactoryComponentImpl(Limb2ComponentFactoryModule limb2ComponentFactoryModule, SentryComponentFactoryModule sentryComponentFactoryModule, NetworkComponentFactoryModule networkComponentFactoryModule, NavigationComponentFactoryModule navigationComponentFactoryModule, PushComponentFactoryModule pushComponentFactoryModule, CartAtomBinderFactoryModule cartAtomBinderFactoryModule, InAppUpdateComponentFactoryModule inAppUpdateComponentFactoryModule, ActionComponentFactoryModule actionComponentFactoryModule, CustomActionHandlerComponentFactoryModule customActionHandlerComponentFactoryModule, CheckoutCommonComponentFactoryModule checkoutCommonComponentFactoryModule, CheckoutPaymentComponentFactoryModule checkoutPaymentComponentFactoryModule, ComposerWidgetAsyncComponentFactoryModule composerWidgetAsyncComponentFactoryModule, MetricsClientComponentFactoryModule metricsClientComponentFactoryModule, GeoProviderComponentFactoryModule geoProviderComponentFactoryModule, MapCommonComponentFactoryModule mapCommonComponentFactoryModule, OnboardingCheckerFactoryModule onboardingCheckerFactoryModule, OzonDebugMenuComponentFactoryModule ozonDebugMenuComponentFactoryModule, CloseFlowWatcherFactoryModule closeFlowWatcherFactoryModule, CommonActionHandlersFactoryComponentFactoryModule commonActionHandlersFactoryComponentFactoryModule, OnBoardingComponentFactoryModule onBoardingComponentFactoryModule, OrderShipmentComponentFactoryModule orderShipmentComponentFactoryModule, AppOnboardingComponentFactoryModule appOnboardingComponentFactoryModule, Application application, int i11) {
            this(limb2ComponentFactoryModule, sentryComponentFactoryModule, networkComponentFactoryModule, navigationComponentFactoryModule, pushComponentFactoryModule, cartAtomBinderFactoryModule, inAppUpdateComponentFactoryModule, actionComponentFactoryModule, customActionHandlerComponentFactoryModule, checkoutCommonComponentFactoryModule, checkoutPaymentComponentFactoryModule, composerWidgetAsyncComponentFactoryModule, metricsClientComponentFactoryModule, geoProviderComponentFactoryModule, mapCommonComponentFactoryModule, onboardingCheckerFactoryModule, ozonDebugMenuComponentFactoryModule, closeFlowWatcherFactoryModule, commonActionHandlersFactoryComponentFactoryModule, onBoardingComponentFactoryModule, orderShipmentComponentFactoryModule, appOnboardingComponentFactoryModule, application);
        }

        private ApplicationComponentFactory applicationComponentFactory() {
            return new ApplicationComponentFactory(this.application);
        }

        private IDaggerComponentFactory iDaggerComponentFactory() {
            return new IDaggerComponentFactory(this.application);
        }

        private void initialize(Limb2ComponentFactoryModule limb2ComponentFactoryModule, SentryComponentFactoryModule sentryComponentFactoryModule, NetworkComponentFactoryModule networkComponentFactoryModule, NavigationComponentFactoryModule navigationComponentFactoryModule, PushComponentFactoryModule pushComponentFactoryModule, CartAtomBinderFactoryModule cartAtomBinderFactoryModule, InAppUpdateComponentFactoryModule inAppUpdateComponentFactoryModule, ActionComponentFactoryModule actionComponentFactoryModule, CustomActionHandlerComponentFactoryModule customActionHandlerComponentFactoryModule, CheckoutCommonComponentFactoryModule checkoutCommonComponentFactoryModule, CheckoutPaymentComponentFactoryModule checkoutPaymentComponentFactoryModule, ComposerWidgetAsyncComponentFactoryModule composerWidgetAsyncComponentFactoryModule, MetricsClientComponentFactoryModule metricsClientComponentFactoryModule, GeoProviderComponentFactoryModule geoProviderComponentFactoryModule, MapCommonComponentFactoryModule mapCommonComponentFactoryModule, OnboardingCheckerFactoryModule onboardingCheckerFactoryModule, OzonDebugMenuComponentFactoryModule ozonDebugMenuComponentFactoryModule, CloseFlowWatcherFactoryModule closeFlowWatcherFactoryModule, CommonActionHandlersFactoryComponentFactoryModule commonActionHandlersFactoryComponentFactoryModule, OnBoardingComponentFactoryModule onBoardingComponentFactoryModule, OrderShipmentComponentFactoryModule orderShipmentComponentFactoryModule, AppOnboardingComponentFactoryModule appOnboardingComponentFactoryModule, Application application) {
            this.provideComponentStorageProvider = d.b(new SwitchingProvider(this.factoryComponentImpl, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Class<? extends InterfaceC6958a>, InterfaceC7081a<? extends InterfaceC6958a>> mapOfClassOfAndComponentFactoryOf() {
            AbstractC5881z.a e11 = AbstractC5881z.e(125);
            e11.b(CoroutineDispatchersComponentApi.class, FactoryModule_Companion_ProvideCoroutineDispatchersComponentApiFactory.provideCoroutineDispatchersComponentApi());
            e11.b(TabsUiControllerComponentApi.class, FactoryModule_Companion_ProvideTabsUiControllerComponentApiFactory.provideTabsUiControllerComponentApi());
            e11.b(AnalyticsDependencyComponent.class, FactoryModule_Companion_BindAnalyticsDependencyComponentFactoryFactory.bindAnalyticsDependencyComponentFactory());
            e11.b(Limb2ComponentApi.class, Limb2ComponentFactoryModule_ProvideLimb2ComponentFactory$limb_prodGoogleAllVendorsReleaseFactory.provideLimb2ComponentFactory$limb_prodGoogleAllVendorsRelease(this.limb2ComponentFactoryModule));
            e11.b(SentryApiComponent.class, SentryComponentFactoryModule_ProvideLimb2ComponentFactory$sentry_prodGoogleAllVendorsReleaseFactory.provideLimb2ComponentFactory$sentry_prodGoogleAllVendorsRelease(this.sentryComponentFactoryModule));
            e11.b(NetworkComponent.class, NetworkComponentFactoryModule_ProvideNetworkComponentFactory$network_prodGoogleAllVendorsReleaseFactory.provideNetworkComponentFactory$network_prodGoogleAllVendorsRelease(this.networkComponentFactoryModule));
            e11.b(NavigationComponentApi.class, NavigationComponentFactoryModule_BindNavigationComponentFactory$navigation_prodGoogleAllVendorsReleaseFactory.bindNavigationComponentFactory$navigation_prodGoogleAllVendorsRelease(this.navigationComponentFactoryModule));
            e11.b(PushComponentApi.class, PushComponentFactoryModule_ProvidePushComponentFactory$push_prodGoogleAllVendorsReleaseFactory.providePushComponentFactory$push_prodGoogleAllVendorsRelease(this.pushComponentFactoryModule));
            e11.b(CartAtomBinderComponentApi.class, CartAtomBinderFactoryModule_ProvideAtomBinderFactory$cart_prodGoogleAllVendorsReleaseFactory.provideAtomBinderFactory$cart_prodGoogleAllVendorsRelease(this.cartAtomBinderFactoryModule));
            e11.b(InAppUpdateComponentApi.class, InAppUpdateComponentFactoryModule_ProvideInAppUpdateComponentFactory$in_app_update_prodGoogleAllVendorsReleaseFactory.provideInAppUpdateComponentFactory$in_app_update_prodGoogleAllVendorsRelease(this.inAppUpdateComponentFactoryModule));
            e11.b(ActionComponentApi.class, ActionComponentFactoryModule_ProvideActionComponent$action_prodGoogleAllVendorsReleaseFactory.provideActionComponent$action_prodGoogleAllVendorsRelease(this.actionComponentFactoryModule));
            e11.b(CustomActionHandlersComponentApi.class, CustomActionHandlerComponentFactoryModule_ProvideFactoryFactory.provideFactory(this.customActionHandlerComponentFactoryModule));
            e11.b(CheckoutCommonComponentApi.class, CheckoutCommonComponentFactoryModule_ProvideFactoryFactory.provideFactory(this.checkoutCommonComponentFactoryModule));
            e11.b(CheckoutPaymentComponentApi.class, CheckoutPaymentComponentFactoryModule_ProvideFactoryFactory.provideFactory(this.checkoutPaymentComponentFactoryModule));
            e11.b(RestrictionsComponentApi.class, RestrictionsComponentFactoryModule_BindCartComponentFactoryFactory.bindCartComponentFactory());
            e11.b(ComposerWidgetAsyncComponentApi.class, ComposerWidgetAsyncComponentFactoryModule_ProvideFactoryFactory.provideFactory(this.composerWidgetAsyncComponentFactoryModule));
            e11.b(MetricsClientComponentApi.class, MetricsClientComponentFactoryModule_ProvideFactoryFactory.provideFactory(this.metricsClientComponentFactoryModule));
            e11.b(GeoProviderComponentApi.class, GeoProviderComponentFactoryModule_ProvideFactoryFactory.provideFactory(this.geoProviderComponentFactoryModule));
            e11.b(MapCommonComponentApi.class, MapCommonComponentFactoryModule_BindMapCommonComponentFactoryFactory.bindMapCommonComponentFactory(this.mapCommonComponentFactoryModule));
            e11.b(OnboardingCheckerComponentApi.class, OnboardingCheckerFactoryModule_ProvideFactoryFactory.provideFactory(this.onboardingCheckerFactoryModule));
            e11.b(OzonDebugMenuComponentApi.class, OzonDebugMenuComponentFactoryModule_ProvideNetworkComponentFactory$debugmenu_prodGoogleAllVendorsReleaseFactory.provideNetworkComponentFactory$debugmenu_prodGoogleAllVendorsRelease(this.ozonDebugMenuComponentFactoryModule));
            e11.b(CloseFlowWatcherComponentApi.class, CloseFlowWatcherFactoryModule_ProvideFactoryFactory.provideFactory(this.closeFlowWatcherFactoryModule));
            e11.b(CommonActionHandlersFactoryComponent.class, CommonActionHandlersFactoryComponentFactoryModule_BindCommonActionStoreComponentFactory$widgets_prodGoogleAllVendorsReleaseFactory.bindCommonActionStoreComponentFactory$widgets_prodGoogleAllVendorsRelease(this.commonActionHandlersFactoryComponentFactoryModule));
            e11.b(OnBoardingComponentApi.class, OnBoardingComponentFactoryModule_ProvideFactoryFactory.provideFactory(this.onBoardingComponentFactoryModule));
            e11.b(OrderShipmentComponentApi.class, OrderShipmentComponentFactoryModule_ProvideFactoryFactory.provideFactory(this.orderShipmentComponentFactoryModule));
            e11.b(AppOnboardingComponentApi.class, AppOnboardingComponentFactoryModule_ProvideFactoryFactory.provideFactory(this.appOnboardingComponentFactoryModule));
            e11.b(ApplicationComponent.class, applicationComponentFactory());
            e11.b(IDaggerComponent.class, iDaggerComponentFactory());
            e11.b(ComposerComponent.class, new ComposerComponentFactory());
            e11.b(WidgetRegistrationComponentApi.class, new WidgetRegistrationComponentFactory());
            e11.b(OzonTrackerSupportedPayloadTypesComponentApi.class, new OzonTrackerSupportedPayloadTypesComponentFactory());
            e11.b(NetworkDependencyComponent.class, new NetworkDependencyFactory());
            e11.b(Limb2DependencyComponent.class, new Limb2DependencyFactory());
            e11.b(FintechDependencyComponent.class, new FintechDependencyFactory());
            e11.b(CacheHandlerRegistrationComponentApi.class, new CacheHandlerRegistrationComponentFactory());
            e11.b(CacheComponentApi.class, new CacheComponentFactory());
            e11.b(RunningPrefetchedRequestUrlsComponentApi.class, new RunningPrefetchedRequestUrlsComponentFactory());
            e11.b(AppLocaleDependenciesApi.class, new AppLocaleDependenciesFactory());
            e11.b(InterceptorPredicatesComponent.class, new InterceptorPredicatesComponentFactory());
            e11.b(InAppUpdateDependencyComponent.class, new InAppUpdateDependencyFactory());
            e11.b(WhitelistComponentApi.class, new WhitelistComponentFactory());
            e11.b(AnalyticsComponent.class, new AnalyticsComponentFactory());
            e11.b(AnalyticsScreenStorageComponentApi.class, new AnalyticsScreenStorageComponentFactory());
            e11.b(StartupTimeTrackerComponentApi.class, new StartupTimeTrackerComponentFactory());
            e11.b(FirebaseAnalyticsComponentApi.class, new FirebaseAnalyticsComponentFactory());
            e11.b(StorageComponentApi.class, new StorageComponentFactory());
            e11.b(ComposerDebugMenuHostApiComponent.class, new ComposerDebugTokenFactory());
            e11.b(NotificationComponentApi.class, new NotificationComponentFactory());
            e11.b(AdvertisingServiceComponentApi.class, new AdvertisingServiceComponentFactory());
            e11.b(AndroidPlatformComponentApi.class, new AndroidPlatformComponentFactory());
            e11.b(AccountComponentApi.class, new AccountComponentFactory());
            e11.b(AppLocaleComponentApi.class, new AppLocaleComponentFactory());
            e11.b(LocationComponentApi.class, new LocationComponentFactory());
            e11.b(TabsComponentApi.class, new TabsComponentFactory());
            e11.b(WebComponentApi.class, new WebComponentFactory());
            e11.b(VideoComponentApi.class, new VideoComponentFactory());
            e11.b(CartServiceApi.class, new CartDomainComponentFactory());
            e11.b(AddressComponentApi.class, new AddressComponentFactory());
            e11.b(DebugMenuComponentApi.class, new DebugMenuComponentFactory());
            e11.b(FreshComponentApi.class, new FreshComponentFactory());
            e11.b(FreshNavigationComponentApi.class, new FreshNavigationComponentFactory());
            e11.b(FintechLibApi.class, new FintechLibComponentFactory());
            e11.b(FintechNotificationServiceApi.class, new FintechPushComponentFactory());
            e11.b(StorefrontCommonComponent.class, new StoreFrontCommonComponentFactory());
            e11.b(SwitchingButtonComponent.class, new SwitchingButtonComponentFactory());
            e11.b(VideoCoverComponent.class, new VideoCoverComponentFactory());
            e11.b(AdvertisingMessagingApi.class, new AdvertisingMessagingDependencyFactory());
            e11.b(SearchComponentApi.class, new SearchComponentFactory());
            e11.b(MediaUploadComponentApi.class, new MediaUploadComponentFactory());
            e11.b(CopyButtonComponentApi.class, new CopyButtonComponentFactory());
            e11.b(BarcodeCacheComponentApi.class, new BarcodeCacheComponentFactory());
            e11.b(OzonMapComponentApi.class, new OzonMapComponentFactory());
            e11.b(FavoriteCoreComponent.class, new FavoriteCoreComponentFactory());
            e11.b(TileSelectorComponent.class, new TileSelectorComponentFactory());
            e11.b(MinifyLinkComponentApi.class, new MinifyLinkComponentApiFactory());
            e11.b(RmsComponentApi.class, new RmsComponentFactory());
            e11.b(PdfFileComponentApi.class, new PdfFileComponentFactory());
            e11.b(SearchHistoryRepositoryComponentApi.class, new SearchHistoryRepositoryComponentFactory());
            e11.b(SearchPrefetchApi.class, new SearchPrefetchComponentFactory());
            e11.b(AuthComponentApi.class, new AuthComponentFactory());
            e11.b(PixelRepositoryComponentApi.class, new PixelRepositoryComponentFactory());
            e11.b(OrderTrackingSingletonComponentApi.class, new OrderTrackingSingletonComponentFactory());
            e11.b(CouponComponent.class, new CouponComponentFactory());
            e11.b(ThirdPartyLibrariesConfigComponentApi.class, new ThirdPartyLibrariesConfigComponentFactory());
            e11.b(TestUserComponentApi.class, new TestUserComponentFactory());
            e11.b(CartComponentApi.class, new CartComponentFactory());
            e11.b(CheckoutPrefetchApi.class, new CheckoutPrefetchComponentFactory());
            e11.b(CdnVideoComponentApi.class, new CdnVideoComponentFactory());
            e11.b(LegalsResultStateHolderComponentApi.class, new LegalsResultStateHolderComponentFactory());
            e11.b(OnboardingComponentApi.class, new OnboardingComponentApiFactory());
            e11.b(AppLaunchHandlersComponentApi.class, new AppLaunchHandlersComponentFactory());
            e11.b(CdnHostManagerComponentApi.class, new CdnHostManagerComponentFactory());
            e11.b(FavoritesUIComponentApi.class, new FavoritesUIComponentFactory());
            e11.b(FavoriteComponentApi.class, new FavoriteComponentFactory());
            e11.b(FavoritesDataComponentApi.class, new FavoritesDataComponentFactory());
            e11.b(ImagesAnalyticsComponentApi.class, new ImagesAnalyticsComponentFactory());
            e11.b(TravelMapApi.class, new TravelMapComponentFactory());
            e11.b(PdpScreenStateHolderComponent.class, new PdpScreenStateHolderComponentFactory());
            e11.b(EventStorageComponentApi.class, new EventStorageComponentFactory());
            e11.b(DeliveryCustomActionHandlersApi.class, new DeliveryCustomActionHandlersComponentFactory());
            e11.b(StatusEdoStateComponentApi.class, new StatusEdoStateComponentFactory());
            e11.b(TravelUnpaidOrderStorageApi.class, new ru.ozon.app.android.travel.ui.tabs.di.factory.StorageComponentFactory());
            e11.b(InAppPushHostApi.class, new InAppPushComponentFactory());
            e11.b(StorefrontMessengerBlocksApi.class, new StorefrontMessengerBlocksComponentFactory());
            e11.b(CartNetworkDependenciesApi.class, new CartNetworkDependenciesComponentFactory());
            e11.b(GeoNetworkDependenciesApi.class, new GeoNetworkDependenciesComponentFactory());
            e11.b(SisBrandFavoriteComponentApi.class, new SisBrandFavoriteComponentFactory());
            e11.b(PdpOfflineScreenComponentApi.class, new PdpOfflineScreenComponentFactory());
            e11.b(TravelPushOnboardingComponentApi.class, new TravelPushOnboardingComponentFactory());
            e11.b(DeeplinkRouteComponentApi.class, new DeeplinkRouteFactory());
            e11.b(MorkovskOnboardingComponentApi.class, new MorkovskOnboardingComponentFactory());
            e11.b(TilesDomainComponentApi.class, new TilesDomainComponentFactory());
            e11.b(SearchByImageRepositoryComponentApi.class, new SearchByImageRepositoryComponentFactory());
            e11.b(SearchOnboardingRepositoryComponentApi.class, new SearchOnboardingRepositoryComponentFactory());
            e11.b(UgcRatingComponentApi.class, new UgcRatingComponentFactory());
            e11.b(UgcReviewFormComponentApi.class, new UgcReviewFormComponentFactory());
            e11.b(SelectionsCoreComponent.class, new SelectionsCoreComponentFactory());
            e11.b(TravelStorageApi.class, new TravelStorageFactory());
            e11.b(CmlDomainComponentApi.class, new CmlDomainComponentFactory());
            e11.b(CmlDeliveryComponentApi.class, new CmlDeliveryComponentFactory());
            e11.b(ClusterizationComponentApi.class, new ClusterizationComponentFactory());
            e11.b(MarkdownBlockApi.class, new MarkdownBlockComponentFactory());
            e11.b(NotificationStatusComponentApi.class, new NotificationStatusComponentFactory());
            e11.b(FailedExternalLinkRetryComponentApi.class, new FailedExternalLinkRetryComponentFactory());
            e11.b(TilesNetworkDependenciesApi.class, new TilesNetworkDependenciesComponentFactory());
            return e11.a();
        }

        @Override // ru.ozon.app.android.di.FactoryComponent
        public C6740b getComponentStorage() {
            return this.provideComponentStorageProvider.get();
        }

        private FactoryComponentImpl(Limb2ComponentFactoryModule limb2ComponentFactoryModule, SentryComponentFactoryModule sentryComponentFactoryModule, NetworkComponentFactoryModule networkComponentFactoryModule, NavigationComponentFactoryModule navigationComponentFactoryModule, PushComponentFactoryModule pushComponentFactoryModule, CartAtomBinderFactoryModule cartAtomBinderFactoryModule, InAppUpdateComponentFactoryModule inAppUpdateComponentFactoryModule, ActionComponentFactoryModule actionComponentFactoryModule, CustomActionHandlerComponentFactoryModule customActionHandlerComponentFactoryModule, CheckoutCommonComponentFactoryModule checkoutCommonComponentFactoryModule, CheckoutPaymentComponentFactoryModule checkoutPaymentComponentFactoryModule, ComposerWidgetAsyncComponentFactoryModule composerWidgetAsyncComponentFactoryModule, MetricsClientComponentFactoryModule metricsClientComponentFactoryModule, GeoProviderComponentFactoryModule geoProviderComponentFactoryModule, MapCommonComponentFactoryModule mapCommonComponentFactoryModule, OnboardingCheckerFactoryModule onboardingCheckerFactoryModule, OzonDebugMenuComponentFactoryModule ozonDebugMenuComponentFactoryModule, CloseFlowWatcherFactoryModule closeFlowWatcherFactoryModule, CommonActionHandlersFactoryComponentFactoryModule commonActionHandlersFactoryComponentFactoryModule, OnBoardingComponentFactoryModule onBoardingComponentFactoryModule, OrderShipmentComponentFactoryModule orderShipmentComponentFactoryModule, AppOnboardingComponentFactoryModule appOnboardingComponentFactoryModule, Application application) {
            this.factoryComponentImpl = this;
            this.limb2ComponentFactoryModule = limb2ComponentFactoryModule;
            this.sentryComponentFactoryModule = sentryComponentFactoryModule;
            this.networkComponentFactoryModule = networkComponentFactoryModule;
            this.navigationComponentFactoryModule = navigationComponentFactoryModule;
            this.pushComponentFactoryModule = pushComponentFactoryModule;
            this.cartAtomBinderFactoryModule = cartAtomBinderFactoryModule;
            this.inAppUpdateComponentFactoryModule = inAppUpdateComponentFactoryModule;
            this.actionComponentFactoryModule = actionComponentFactoryModule;
            this.customActionHandlerComponentFactoryModule = customActionHandlerComponentFactoryModule;
            this.checkoutCommonComponentFactoryModule = checkoutCommonComponentFactoryModule;
            this.checkoutPaymentComponentFactoryModule = checkoutPaymentComponentFactoryModule;
            this.composerWidgetAsyncComponentFactoryModule = composerWidgetAsyncComponentFactoryModule;
            this.metricsClientComponentFactoryModule = metricsClientComponentFactoryModule;
            this.geoProviderComponentFactoryModule = geoProviderComponentFactoryModule;
            this.mapCommonComponentFactoryModule = mapCommonComponentFactoryModule;
            this.onboardingCheckerFactoryModule = onboardingCheckerFactoryModule;
            this.ozonDebugMenuComponentFactoryModule = ozonDebugMenuComponentFactoryModule;
            this.closeFlowWatcherFactoryModule = closeFlowWatcherFactoryModule;
            this.commonActionHandlersFactoryComponentFactoryModule = commonActionHandlersFactoryComponentFactoryModule;
            this.onBoardingComponentFactoryModule = onBoardingComponentFactoryModule;
            this.orderShipmentComponentFactoryModule = orderShipmentComponentFactoryModule;
            this.appOnboardingComponentFactoryModule = appOnboardingComponentFactoryModule;
            this.application = application;
            initialize(limb2ComponentFactoryModule, sentryComponentFactoryModule, networkComponentFactoryModule, navigationComponentFactoryModule, pushComponentFactoryModule, cartAtomBinderFactoryModule, inAppUpdateComponentFactoryModule, actionComponentFactoryModule, customActionHandlerComponentFactoryModule, checkoutCommonComponentFactoryModule, checkoutPaymentComponentFactoryModule, composerWidgetAsyncComponentFactoryModule, metricsClientComponentFactoryModule, geoProviderComponentFactoryModule, mapCommonComponentFactoryModule, onboardingCheckerFactoryModule, ozonDebugMenuComponentFactoryModule, closeFlowWatcherFactoryModule, commonActionHandlersFactoryComponentFactoryModule, onBoardingComponentFactoryModule, orderShipmentComponentFactoryModule, appOnboardingComponentFactoryModule, application);
        }
    }

    public static FactoryComponent.Factory factory() {
        return new Factory(0);
    }
}
