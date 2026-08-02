package ru.ozon.app.android.injection.factory.factories;

import android.app.Application;
import android.content.res.Resources;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.ads.di.messaging.AdvertisingMessagingApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.analytics.startup.time.di.StartupTimeTrackerComponentApi;
import ru.ozon.app.android.bank.domain.FintechLibApi;
import ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentApi;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi;
import ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponentApi;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchApi;
import ru.ozon.app.android.checkoutcomposer.di.common.CheckoutCommonComponentApi;
import ru.ozon.app.android.checkoutgeo.address.di.AddressComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.cml.delivery.di.CmlDeliveryComponentApi;
import ru.ozon.app.android.cml.domain.di.CmlDomainComponentApi;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.di.RestrictionsComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.core.navigation.interceptors.predicate.di.InterceptorPredicatesComponentApi;
import ru.ozon.app.android.debugmenu.di.DebugMenuComponentApi;
import ru.ozon.app.android.debugmenu.ozondebugmenu.di.OzonDebugMenuComponentApi;
import ru.ozon.app.android.di.UgcRatingComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.domain.session.di.auth.AuthComponentApi;
import ru.ozon.app.android.domain.tiles.di.TilesDomainComponentApi;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoritesUIComponentApi;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.di.LegalsResultStateHolderComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di.StatusEdoStateComponentApi;
import ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi;
import ru.ozon.app.android.fresh.unsorted.di.FreshComponentApi;
import ru.ozon.app.android.geoprovider.di.GeoProviderComponentApi;
import ru.ozon.app.android.injection.DaggerIDaggerComponent;
import ru.ozon.app.android.injection.IDaggerComponent;
import ru.ozon.app.android.injection.IDaggerComponentDependencies;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi;
import ru.ozon.app.android.marketing.coupon.di.CouponComponentApi;
import ru.ozon.app.android.mediaupload.di.MediaUploadComponentApi;
import ru.ozon.app.android.minifyLink.di.MinifyLinkComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.notifications.di.NotificationComponentApi;
import ru.ozon.app.android.offline.di.PdpOfflineScreenComponentApi;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl.OrderShipmentComponentApi;
import ru.ozon.app.android.pdfviewer.di.PdfFileComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.di.PdpScreenStateHolderComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.di.UgcReviewFormComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.di.SelectionsCoreComponentApi;
import ru.ozon.app.android.platform.customActionHandlers.commonActionHandlersFactory.CommonActionHandlersFactoryComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.push.di.PushComponentApi;
import ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponentApi;
import ru.ozon.app.android.returns.ui.di.RmsComponentApi;
import ru.ozon.app.android.search.di.SearchComponentApi;
import ru.ozon.app.android.sentry.di.SentryApiComponent;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.di.CloseFlowWatcherComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.thirdpartylibs.config.di.ThirdPartyLibrariesConfigComponentApi;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.di.api.DeeplinkRouteComponentApi;
import ru.ozon.app.android.travel.data.storage.di.api.TravelStorageApi;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.TravelPushOnboardingComponentApi;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi;
import ru.ozon.app.android.update.di.InAppUpdateComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.app.android.video.di.CdnVideoComponentApi;
import ru.ozon.app.android.video.di.ImagesAnalyticsComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;
import ru.ozon.app.android.web.di.WebComponentApi;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00022\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/injection/factory/factories/IDaggerComponentFactory;", "Lii/a;", "Lru/ozon/app/android/injection/IDaggerComponent;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/injection/IDaggerComponent;", "Landroid/app/Application;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IDaggerComponentFactory implements InterfaceC7081a<IDaggerComponent> {

    @NotNull
    private final Application application;

    public IDaggerComponentFactory(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    @Override // ii.InterfaceC7081a
    @NotNull
    public IDaggerComponent create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        IDaggerComponent.Factory factory = DaggerIDaggerComponent.factory();
        Resources resources = this.application.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class);
        if (IDaggerComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component IDaggerComponentDependencies is not DiComponent");
        }
        IDaggerComponentDependencies iDaggerComponentDependencies = (IDaggerComponentDependencies) componentStorage.b(IDaggerComponentDependencies.class);
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) componentStorage.b(NavigationComponentApi.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) componentStorage.b(StorageComponentApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) componentStorage.b(AnalyticsComponentApi.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        NetworkOzonIdComponentApi networkOzonIdComponentApi = (NetworkOzonIdComponentApi) componentStorage.b(NetworkOzonIdComponentApi.class);
        if (WhitelistComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WhitelistComponentApi is not DiComponent");
        }
        WhitelistComponentApi whitelistComponentApi = (WhitelistComponentApi) componentStorage.b(WhitelistComponentApi.class);
        if (CacheComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CacheComponentApi is not DiComponent");
        }
        CacheComponentApi cacheComponentApi = (CacheComponentApi) componentStorage.b(CacheComponentApi.class);
        if (FirebaseAnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FirebaseAnalyticsComponentApi is not DiComponent");
        }
        FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi = (FirebaseAnalyticsComponentApi) componentStorage.b(FirebaseAnalyticsComponentApi.class);
        if (NotificationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NotificationComponentApi is not DiComponent");
        }
        NotificationComponentApi notificationComponentApi = (NotificationComponentApi) componentStorage.b(NotificationComponentApi.class);
        if (PushComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component PushComponentApi is not DiComponent");
        }
        PushComponentApi pushComponentApi = (PushComponentApi) componentStorage.b(PushComponentApi.class);
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) componentStorage.b(AndroidPlatformComponentApi.class);
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) componentStorage.b(AccountComponentApi.class);
        if (AppLocaleComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLocaleComponentApi is not DiComponent");
        }
        AppLocaleComponentApi appLocaleComponentApi = (AppLocaleComponentApi) componentStorage.b(AppLocaleComponentApi.class);
        if (LocationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component LocationComponentApi is not DiComponent");
        }
        LocationComponentApi locationComponentApi = (LocationComponentApi) componentStorage.b(LocationComponentApi.class);
        if (CartComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartComponentApi is not DiComponent");
        }
        CartComponentApi cartComponentApi = (CartComponentApi) componentStorage.b(CartComponentApi.class);
        if (TabsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TabsComponentApi is not DiComponent");
        }
        TabsComponentApi tabsComponentApi = (TabsComponentApi) componentStorage.b(TabsComponentApi.class);
        if (WebComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WebComponentApi is not DiComponent");
        }
        WebComponentApi webComponentApi = (WebComponentApi) componentStorage.b(WebComponentApi.class);
        if (VideoComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component VideoComponentApi is not DiComponent");
        }
        VideoComponentApi videoComponentApi = (VideoComponentApi) componentStorage.b(VideoComponentApi.class);
        if (CartServiceApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartServiceApi is not DiComponent");
        }
        CartServiceApi cartServiceApi = (CartServiceApi) componentStorage.b(CartServiceApi.class);
        if (CartAtomBinderComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartAtomBinderComponentApi is not DiComponent");
        }
        CartAtomBinderComponentApi cartAtomBinderComponentApi = (CartAtomBinderComponentApi) componentStorage.b(CartAtomBinderComponentApi.class);
        if (AddressComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AddressComponentApi is not DiComponent");
        }
        AddressComponentApi addressComponentApi = (AddressComponentApi) componentStorage.b(AddressComponentApi.class);
        if (DebugMenuComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component DebugMenuComponentApi is not DiComponent");
        }
        DebugMenuComponentApi debugMenuComponentApi = (DebugMenuComponentApi) componentStorage.b(DebugMenuComponentApi.class);
        if (OzonDebugMenuComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OzonDebugMenuComponentApi is not DiComponent");
        }
        OzonDebugMenuComponentApi ozonDebugMenuComponentApi = (OzonDebugMenuComponentApi) componentStorage.b(OzonDebugMenuComponentApi.class);
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) componentStorage.b(ComposerComponentApi.class);
        if (FreshComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FreshComponentApi is not DiComponent");
        }
        FreshComponentApi freshComponentApi = (FreshComponentApi) componentStorage.b(FreshComponentApi.class);
        if (MediaUploadComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component MediaUploadComponentApi is not DiComponent");
        }
        MediaUploadComponentApi mediaUploadComponentApi = (MediaUploadComponentApi) componentStorage.b(MediaUploadComponentApi.class);
        if (FintechLibApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FintechLibApi is not DiComponent");
        }
        FintechLibApi fintechLibApi = (FintechLibApi) componentStorage.b(FintechLibApi.class);
        if (SwitchingButtonComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SwitchingButtonComponentApi is not DiComponent");
        }
        SwitchingButtonComponentApi switchingButtonComponentApi = (SwitchingButtonComponentApi) componentStorage.b(SwitchingButtonComponentApi.class);
        if (SearchComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SearchComponentApi is not DiComponent");
        }
        SearchComponentApi searchComponentApi = (SearchComponentApi) componentStorage.b(SearchComponentApi.class);
        if (OzonMapComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OzonMapComponentApi is not DiComponent");
        }
        OzonMapComponentApi ozonMapComponentApi = (OzonMapComponentApi) componentStorage.b(OzonMapComponentApi.class);
        if (VideoCoverComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component VideoCoverComponentApi is not DiComponent");
        }
        VideoCoverComponentApi videoCoverComponentApi = (VideoCoverComponentApi) componentStorage.b(VideoCoverComponentApi.class);
        if (MinifyLinkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component MinifyLinkComponentApi is not DiComponent");
        }
        MinifyLinkComponentApi minifyLinkComponentApi = (MinifyLinkComponentApi) componentStorage.b(MinifyLinkComponentApi.class);
        if (RmsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component RmsComponentApi is not DiComponent");
        }
        RmsComponentApi rmsComponentApi = (RmsComponentApi) componentStorage.b(RmsComponentApi.class);
        if (PdfFileComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component PdfFileComponentApi is not DiComponent");
        }
        PdfFileComponentApi pdfFileComponentApi = (PdfFileComponentApi) componentStorage.b(PdfFileComponentApi.class);
        if (AdvertisingMessagingApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AdvertisingMessagingApi is not DiComponent");
        }
        AdvertisingMessagingApi advertisingMessagingApi = (AdvertisingMessagingApi) componentStorage.b(AdvertisingMessagingApi.class);
        if (FavoriteComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FavoriteComponentApi is not DiComponent");
        }
        FavoriteComponentApi favoriteComponentApi = (FavoriteComponentApi) componentStorage.b(FavoriteComponentApi.class);
        if (FavoriteCoreComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FavoriteCoreComponentApi is not DiComponent");
        }
        FavoriteCoreComponentApi favoriteCoreComponentApi = (FavoriteCoreComponentApi) componentStorage.b(FavoriteCoreComponentApi.class);
        if (CouponComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CouponComponentApi is not DiComponent");
        }
        CouponComponentApi couponComponentApi = (CouponComponentApi) componentStorage.b(CouponComponentApi.class);
        if (ThirdPartyLibrariesConfigComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ThirdPartyLibrariesConfigComponentApi is not DiComponent");
        }
        ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi = (ThirdPartyLibrariesConfigComponentApi) componentStorage.b(ThirdPartyLibrariesConfigComponentApi.class);
        if (InAppUpdateComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component InAppUpdateComponentApi is not DiComponent");
        }
        InAppUpdateComponentApi inAppUpdateComponentApi = (InAppUpdateComponentApi) componentStorage.b(InAppUpdateComponentApi.class);
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) componentStorage.b(ActionComponentApi.class);
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) componentStorage.b(CustomActionHandlersComponentApi.class);
        if (CheckoutPrefetchApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CheckoutPrefetchApi is not DiComponent");
        }
        CheckoutPrefetchApi checkoutPrefetchApi = (CheckoutPrefetchApi) componentStorage.b(CheckoutPrefetchApi.class);
        if (BarcodeCacheComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component BarcodeCacheComponentApi is not DiComponent");
        }
        BarcodeCacheComponentApi barcodeCacheComponentApi = (BarcodeCacheComponentApi) componentStorage.b(BarcodeCacheComponentApi.class);
        if (CheckoutCommonComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CheckoutCommonComponentApi is not DiComponent");
        }
        CheckoutCommonComponentApi checkoutCommonComponentApi = (CheckoutCommonComponentApi) componentStorage.b(CheckoutCommonComponentApi.class);
        if (RestrictionsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component RestrictionsComponentApi is not DiComponent");
        }
        RestrictionsComponentApi restrictionsComponentApi = (RestrictionsComponentApi) componentStorage.b(RestrictionsComponentApi.class);
        if (ComposerWidgetAsyncComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerWidgetAsyncComponentApi is not DiComponent");
        }
        ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) componentStorage.b(ComposerWidgetAsyncComponentApi.class);
        if (GeoProviderComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component GeoProviderComponentApi is not DiComponent");
        }
        GeoProviderComponentApi geoProviderComponentApi = (GeoProviderComponentApi) componentStorage.b(GeoProviderComponentApi.class);
        if (MapCommonComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component MapCommonComponentApi is not DiComponent");
        }
        MapCommonComponentApi mapCommonComponentApi = (MapCommonComponentApi) componentStorage.b(MapCommonComponentApi.class);
        if (OnboardingCheckerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingCheckerComponentApi is not DiComponent");
        }
        OnboardingCheckerComponentApi onboardingCheckerComponentApi = (OnboardingCheckerComponentApi) componentStorage.b(OnboardingCheckerComponentApi.class);
        if (CdnVideoComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CdnVideoComponentApi is not DiComponent");
        }
        CdnVideoComponentApi cdnVideoComponentApi = (CdnVideoComponentApi) componentStorage.b(CdnVideoComponentApi.class);
        if (CoroutineDispatchersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CoroutineDispatchersComponentApi is not DiComponent");
        }
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) componentStorage.b(CoroutineDispatchersComponentApi.class);
        if (AuthComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AuthComponentApi is not DiComponent");
        }
        AuthComponentApi authComponentApi = (AuthComponentApi) componentStorage.b(AuthComponentApi.class);
        if (CloseFlowWatcherComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CloseFlowWatcherComponentApi is not DiComponent");
        }
        CloseFlowWatcherComponentApi closeFlowWatcherComponentApi = (CloseFlowWatcherComponentApi) componentStorage.b(CloseFlowWatcherComponentApi.class);
        if (CdnHostManagerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CdnHostManagerComponentApi is not DiComponent");
        }
        CdnHostManagerComponentApi cdnHostManagerComponentApi = (CdnHostManagerComponentApi) componentStorage.b(CdnHostManagerComponentApi.class);
        if (SearchPrefetchApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SearchPrefetchApi is not DiComponent");
        }
        SearchPrefetchApi searchPrefetchApi = (SearchPrefetchApi) componentStorage.b(SearchPrefetchApi.class);
        if (FavoritesUIComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FavoritesUIComponentApi is not DiComponent");
        }
        FavoritesUIComponentApi favoritesUIComponentApi = (FavoritesUIComponentApi) componentStorage.b(FavoritesUIComponentApi.class);
        if (FavoritesDataComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FavoritesDataComponentApi is not DiComponent");
        }
        FavoritesDataComponentApi favoritesDataComponentApi = (FavoritesDataComponentApi) componentStorage.b(FavoritesDataComponentApi.class);
        if (ImagesAnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ImagesAnalyticsComponentApi is not DiComponent");
        }
        ImagesAnalyticsComponentApi imagesAnalyticsComponentApi = (ImagesAnalyticsComponentApi) componentStorage.b(ImagesAnalyticsComponentApi.class);
        if (CommonActionHandlersFactoryComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CommonActionHandlersFactoryComponentApi is not DiComponent");
        }
        CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi = (CommonActionHandlersFactoryComponentApi) componentStorage.b(CommonActionHandlersFactoryComponentApi.class);
        if (PdpScreenStateHolderComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component PdpScreenStateHolderComponentApi is not DiComponent");
        }
        PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi = (PdpScreenStateHolderComponentApi) componentStorage.b(PdpScreenStateHolderComponentApi.class);
        if (StartupTimeTrackerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StartupTimeTrackerComponentApi is not DiComponent");
        }
        StartupTimeTrackerComponentApi startupTimeTrackerComponentApi = (StartupTimeTrackerComponentApi) componentStorage.b(StartupTimeTrackerComponentApi.class);
        if (FreshNavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FreshNavigationComponentApi is not DiComponent");
        }
        FreshNavigationComponentApi freshNavigationComponentApi = (FreshNavigationComponentApi) componentStorage.b(FreshNavigationComponentApi.class);
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) componentStorage.b(AnalyticsScreenStorageComponentApi.class);
        if (LegalsResultStateHolderComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component LegalsResultStateHolderComponentApi is not DiComponent");
        }
        LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi = (LegalsResultStateHolderComponentApi) componentStorage.b(LegalsResultStateHolderComponentApi.class);
        if (StatusEdoStateComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StatusEdoStateComponentApi is not DiComponent");
        }
        StatusEdoStateComponentApi statusEdoStateComponentApi = (StatusEdoStateComponentApi) componentStorage.b(StatusEdoStateComponentApi.class);
        if (InterceptorPredicatesComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component InterceptorPredicatesComponentApi is not DiComponent");
        }
        InterceptorPredicatesComponentApi interceptorPredicatesComponentApi = (InterceptorPredicatesComponentApi) componentStorage.b(InterceptorPredicatesComponentApi.class);
        if (CheckoutPaymentComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CheckoutPaymentComponentApi is not DiComponent");
        }
        CheckoutPaymentComponentApi checkoutPaymentComponentApi = (CheckoutPaymentComponentApi) componentStorage.b(CheckoutPaymentComponentApi.class);
        if (OrderShipmentComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OrderShipmentComponentApi is not DiComponent");
        }
        OrderShipmentComponentApi orderShipmentComponentApi = (OrderShipmentComponentApi) componentStorage.b(OrderShipmentComponentApi.class);
        if (PdpOfflineScreenComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component PdpOfflineScreenComponentApi is not DiComponent");
        }
        PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi = (PdpOfflineScreenComponentApi) componentStorage.b(PdpOfflineScreenComponentApi.class);
        if (TravelPushOnboardingComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TravelPushOnboardingComponentApi is not DiComponent");
        }
        TravelPushOnboardingComponentApi travelPushOnboardingComponentApi = (TravelPushOnboardingComponentApi) componentStorage.b(TravelPushOnboardingComponentApi.class);
        if (DeeplinkRouteComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component DeeplinkRouteComponentApi is not DiComponent");
        }
        DeeplinkRouteComponentApi deeplinkRouteComponentApi = (DeeplinkRouteComponentApi) componentStorage.b(DeeplinkRouteComponentApi.class);
        if (MorkovskOnboardingComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component MorkovskOnboardingComponentApi is not DiComponent");
        }
        MorkovskOnboardingComponentApi morkovskOnboardingComponentApi = (MorkovskOnboardingComponentApi) componentStorage.b(MorkovskOnboardingComponentApi.class);
        if (TilesDomainComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TilesDomainComponentApi is not DiComponent");
        }
        TilesDomainComponentApi tilesDomainComponentApi = (TilesDomainComponentApi) componentStorage.b(TilesDomainComponentApi.class);
        if (UgcRatingComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component UgcRatingComponentApi is not DiComponent");
        }
        UgcRatingComponentApi ugcRatingComponentApi = (UgcRatingComponentApi) componentStorage.b(UgcRatingComponentApi.class);
        if (UgcReviewFormComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component UgcReviewFormComponentApi is not DiComponent");
        }
        UgcReviewFormComponentApi ugcReviewFormComponentApi = (UgcReviewFormComponentApi) componentStorage.b(UgcReviewFormComponentApi.class);
        if (SelectionsCoreComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SelectionsCoreComponentApi is not DiComponent");
        }
        SelectionsCoreComponentApi selectionsCoreComponentApi = (SelectionsCoreComponentApi) componentStorage.b(SelectionsCoreComponentApi.class);
        if (TravelStorageApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TravelStorageApi is not DiComponent");
        }
        TravelStorageApi travelStorageApi = (TravelStorageApi) componentStorage.b(TravelStorageApi.class);
        if (ComposerDebugMenuHostApiComponent.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerDebugMenuHostApiComponent is not DiComponent");
        }
        ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent = (ComposerDebugMenuHostApiComponent) componentStorage.b(ComposerDebugMenuHostApiComponent.class);
        if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
        }
        Limb2ComponentApi limb2ComponentApi = (Limb2ComponentApi) componentStorage.b(Limb2ComponentApi.class);
        if (SentryApiComponent.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SentryApiComponent is not DiComponent");
        }
        SentryApiComponent sentryApiComponent = (SentryApiComponent) componentStorage.b(SentryApiComponent.class);
        if (AppOnboardingComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppOnboardingComponentApi is not DiComponent");
        }
        AppOnboardingComponentApi appOnboardingComponentApi = (AppOnboardingComponentApi) componentStorage.b(AppOnboardingComponentApi.class);
        if (CmlDomainComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CmlDomainComponentApi is not DiComponent");
        }
        CmlDomainComponentApi cmlDomainComponentApi = (CmlDomainComponentApi) componentStorage.b(CmlDomainComponentApi.class);
        if (CmlDeliveryComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CmlDeliveryComponentApi is not DiComponent");
        }
        CmlDeliveryComponentApi cmlDeliveryComponentApi = (CmlDeliveryComponentApi) componentStorage.b(CmlDeliveryComponentApi.class);
        if (NotificationStatusComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NotificationStatusComponentApi is not DiComponent");
        }
        NotificationStatusComponentApi notificationStatusComponentApi = (NotificationStatusComponentApi) componentStorage.b(NotificationStatusComponentApi.class);
        if (StorefrontCommonComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorefrontCommonComponentApi is not DiComponent");
        }
        return factory.create(resources, contextComponentDependencies, iDaggerComponentDependencies, navigationComponentApi, storageComponentApi, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, whitelistComponentApi, cacheComponentApi, firebaseAnalyticsComponentApi, notificationComponentApi, pushComponentApi, androidPlatformComponentApi, accountComponentApi, appLocaleComponentApi, locationComponentApi, cartComponentApi, tabsComponentApi, webComponentApi, videoComponentApi, cartServiceApi, cartAtomBinderComponentApi, addressComponentApi, debugMenuComponentApi, ozonDebugMenuComponentApi, composerComponentApi, barcodeCacheComponentApi, freshComponentApi, mediaUploadComponentApi, fintechLibApi, searchComponentApi, switchingButtonComponentApi, ozonMapComponentApi, videoCoverComponentApi, advertisingMessagingApi, minifyLinkComponentApi, rmsComponentApi, pdfFileComponentApi, favoriteCoreComponentApi, favoriteComponentApi, couponComponentApi, thirdPartyLibrariesConfigComponentApi, inAppUpdateComponentApi, actionComponentApi, customActionHandlersComponentApi, checkoutPrefetchApi, checkoutCommonComponentApi, checkoutPaymentComponentApi, restrictionsComponentApi, composerWidgetAsyncComponentApi, geoProviderComponentApi, mapCommonComponentApi, cdnVideoComponentApi, onboardingCheckerComponentApi, closeFlowWatcherComponentApi, coroutineDispatchersComponentApi, authComponentApi, searchPrefetchApi, cdnHostManagerComponentApi, favoritesUIComponentApi, favoritesDataComponentApi, imagesAnalyticsComponentApi, commonActionHandlersFactoryComponentApi, pdpScreenStateHolderComponentApi, startupTimeTrackerComponentApi, freshNavigationComponentApi, analyticsScreenStorageComponentApi, legalsResultStateHolderComponentApi, statusEdoStateComponentApi, interceptorPredicatesComponentApi, orderShipmentComponentApi, pdpOfflineScreenComponentApi, travelPushOnboardingComponentApi, deeplinkRouteComponentApi, morkovskOnboardingComponentApi, tilesDomainComponentApi, ugcRatingComponentApi, ugcReviewFormComponentApi, selectionsCoreComponentApi, travelStorageApi, composerDebugMenuHostApiComponent, limb2ComponentApi, sentryApiComponent, appOnboardingComponentApi, cmlDomainComponentApi, cmlDeliveryComponentApi, notificationStatusComponentApi, (StorefrontCommonComponentApi) componentStorage.b(StorefrontCommonComponentApi.class));
    }
}
