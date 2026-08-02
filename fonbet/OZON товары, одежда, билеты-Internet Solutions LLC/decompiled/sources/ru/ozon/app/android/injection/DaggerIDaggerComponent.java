package ru.ozon.app.android.injection;

import BZ.e;
import Eg0.b;
import GZ.g;
import GZ.k;
import Gg0.f;
import Jb.j;
import Pc.a;
import Ub.d;
import WZ.l;
import We.E;
import We.InterfaceC4875q;
import Xh0.c;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.recyclerview.widget.m;
import bh0.InterfaceC5666b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.identity.intents.AddressConstants;
import com.google.android.gms.wallet.WalletConstants;
import com.google.common.collect.A;
import com.google.common.collect.AbstractC5881z;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.squareup.moshi.Moshi;
import ei0.InterfaceC6369b;
import fi0.w;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Map;
import java.util.Set;
import nZ.C8475a;
import nf.C8590c;
import org.maplibre.android.log.Logger;
import qj.C9067a;
import retrofit2.Retrofit;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.header.core.HeaderConfig;
import ru.ozon.android.composerCommonViewKit.header.core.HeaderViewMapper;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.app.android.ActivityInitializer;
import ru.ozon.app.android.ActivityInitializerImpl;
import ru.ozon.app.android.ButtonWidgetCustomActionHandlersImpl;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.auth.biometry.BiometryAuthenicator;
import ru.ozon.app.android.account.auth.biometry.keystore.KeyStoreRepository;
import ru.ozon.app.android.account.authEvents.AuthEventsCollector;
import ru.ozon.app.android.account.coupon.ApplyCouponState;
import ru.ozon.app.android.account.currency.CurrencyRepository;
import ru.ozon.app.android.account.currency.CurrencyState;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.eventBus.EmailActualizedEventBus;
import ru.ozon.app.android.account.eventBus.UserDataChangedEventBus;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.account.locale.app.data.AppLocaleChangedEventBus;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.account.orders.OrderListChangeStateViewModel;
import ru.ozon.app.android.account.orders.OrdersCountStorage;
import ru.ozon.app.android.account.orders.barcode.di.ScreenBrightnessChangerModule;
import ru.ozon.app.android.account.orders.barcode.di.ScreenBrightnessChangerModule_ProvideBarcodeScreenBrightnessChangerFactory;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.FloorBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.MaxBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger;
import ru.ozon.app.android.account.orders.barcodePopover.v1.configurator.BrightnessChangerConfigurator;
import ru.ozon.app.android.account.orders.cancelpostingsv2.CancelPostingsConfigurator;
import ru.ozon.app.android.account.orders.core.OrientationLockConfigurator;
import ru.ozon.app.android.account.orders.di.OrderDetailsCoreModule_Companion_ProvideChangePaymentApiFactory;
import ru.ozon.app.android.account.orders.di.OrderNavigationModule_ProvideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.account.orders.emptyscreen.BarcodeFullScreenOfflineFactory;
import ru.ozon.app.android.account.orders.emptyscreen.BarcodeStatusWidgetFactory;
import ru.ozon.app.android.account.orders.emptyscreen.BarcodeWidgetFactory;
import ru.ozon.app.android.account.orders.emptyscreen.EmptyScreenIslandSeparatorFactory;
import ru.ozon.app.android.account.orders.emptyscreen.EmptyScreenStatusWidgetFactory;
import ru.ozon.app.android.account.orders.emptyscreen.EmptyScreenWithBarcodeFactory;
import ru.ozon.app.android.account.orders.emptyscreen.ExtendBackgroundFactory;
import ru.ozon.app.android.account.orders.emptyscreen.InternalTeethFactory;
import ru.ozon.app.android.account.orders.emptyscreen.OzonBankOfflineInfoWidgetFactory;
import ru.ozon.app.android.account.orders.emptyscreen.copytext.CopyTextNavigationHandler;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager;
import ru.ozon.app.android.account.orders.ordergallery.DownloadPDFActionHandler;
import ru.ozon.app.android.account.orders.ordergallery.OrderGalleryConfigurator;
import ru.ozon.app.android.account.orders.total.TotalConfigurator;
import ru.ozon.app.android.account.session.SessionListUpdatedEventBus;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.action.analytics.ActionUsageAnalytics;
import ru.ozon.app.android.action.custom.ButtonWidgetCustomActionHandlers;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegate;
import ru.ozon.app.android.actionHandlers.monetization.confirmBloggerChannel.ConfirmBloggerChannelActionHandler;
import ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerActionHandler;
import ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerViewModel;
import ru.ozon.app.android.actionHandlers.monetization.shareLinkBloggerFromTile.ShareLinkBloggerFromTileActionHandler;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.SubmitBloggerPersonalDataActionHandler;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPostMobile.SubmitBloggerPostActionHandler;
import ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.SellerSubscribeActionHandler;
import ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.SellerUnsubscribeActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.dismissAndOpenGallery.DismissAndOpenGalleryActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.dismissAndPopAndRefresh.DismissAndPopAndRefreshActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.doubleDismissAndRedirect.DoubleDismissAndRedirectActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.doubleDismissAndRefresh.DoubleDismissAndRefreshActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.SubmitSelectionFormActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.UpdateCellSelectionFormActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.UpdateProductsSelectionFormActionHandler;
import ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractor;
import ru.ozon.app.android.ads.di.AdsNavigationDiModule_ProvideDeeplinkHandlerFactory;
import ru.ozon.app.android.ads.di.messaging.AdvertisingMessagingApi;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4WarmupInfoProvider;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PreCreateInfoProvider;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerWarmupInfoProvider;
import ru.ozon.app.android.analytics.AnalyticsInitializer;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponentApi;
import ru.ozon.app.android.analytics.modules.AuthAnalytics;
import ru.ozon.app.android.analytics.modules.AuthAnalyticsImpl;
import ru.ozon.app.android.analytics.modules.DataLayerInitializer;
import ru.ozon.app.android.analytics.modules.DataLayerInitializerImpl;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorage;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.analytics.startup.time.di.StartupTimeTrackerComponentApi;
import ru.ozon.app.android.analytics.store.AppStoreInfoProvider;
import ru.ozon.app.android.analytics.store.AppStoreRouter;
import ru.ozon.app.android.apparel.navigation.ApparelNavigationModule_ProvideDeeplinkHandlersSet$miniapp_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.atoms.common.navigation.AtomNavigator;
import ru.ozon.app.android.atoms.data.deprecated.di.LegacyCommonAtomParserModelsModule_Companion_ProvideLegacyCommonAtomParserModelsFactory;
import ru.ozon.app.android.authCustomActionHandlers.email.ConfirmEmailCustomActionHandler;
import ru.ozon.app.android.authCustomActionHandlers.email.VerifyEmailCustomActionHandler;
import ru.ozon.app.android.authCustomActionHandlers.unbindVk.UnbindVKIDCustomActionHandler;
import ru.ozon.app.android.autopicker.di.AutoPickerExportModule;
import ru.ozon.app.android.autopicker.di.AutoPickerExportModule_ProvideExportWidgetsFactory;
import ru.ozon.app.android.autopicker.view.productpickersearch.di.ProductPickerNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.configurator.ProductPickerSearchParamsConfigurator;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.ProductPickerDetailsConfig;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.resetbutton.ResetButtonViewMapper;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.sections.SectionsViewMapper;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.selector.SelectorViewMapper;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.stickyblock.StickyBlockViewMapper;
import ru.ozon.app.android.bank.domain.FintechLibApi;
import ru.ozon.app.android.bank.lifecycle.FintechActivityLifecycleCallback;
import ru.ozon.app.android.bank.navigation.BankAuthDestinationInterceptor;
import ru.ozon.app.android.bank.navigation.BankGlobalDeeplinkInterceptor;
import ru.ozon.app.android.bank.widgets.premiumPoints.core.PremiumPointsPreCreateInfoProvider;
import ru.ozon.app.android.bank.widgets.premiumPoints.data.PremiumPointsWarmupInfoProvider;
import ru.ozon.app.android.barcode.barcodeProductsList.actions.getProductsPage.AppendProductsActionHandler;
import ru.ozon.app.android.barcode.barcodeProductsList.actions.getProductsPage.ReplaceProductsActionHandler;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager;
import ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentApi;
import ru.ozon.app.android.barcodecache.wearable.WearableBarcodeSyncer;
import ru.ozon.app.android.barcodecache.wearable.pageConfigurator.CabinetBarcodeOnWearableDeviceConfigurator;
import ru.ozon.app.android.barcodecache.wearable.pageConfigurator.HomeBarcodeOnWearableDeviceConfigurator;
import ru.ozon.app.android.button.di.CsmaButtonCommonModule;
import ru.ozon.app.android.button.di.CsmaButtonCommonModule_ProvideComposerActionApiFactory;
import ru.ozon.app.android.cabinet.FlashCallConfigurator;
import ru.ozon.app.android.cabinet.activationtitle.ActivationTitleConfig;
import ru.ozon.app.android.cabinet.activationtitle.ActivationTitleViewMapper;
import ru.ozon.app.android.cabinet.activationtitle.data.CodeActivationAnalytics;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeApi;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeRepositoryImpl;
import ru.ozon.app.android.cabinet.activationtitle.di.ActivationTitleModule_Companion_ProvideDiscountCodeApiFactory;
import ru.ozon.app.android.cabinet.activationtitle.di.ActivationTitleModule_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.cabinet.activationtitle.presentation.DiscountCodeViewModel;
import ru.ozon.app.android.cabinet.biometry.BiometryStateConfigurator;
import ru.ozon.app.android.cabinet.cache.configurator.OrderCacheConfigurator;
import ru.ozon.app.android.cabinet.certificates.CertificatesConfig;
import ru.ozon.app.android.cabinet.certificates.CertificatesModule_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.cabinet.certificates.CertificatesViewMapper;
import ru.ozon.app.android.cabinet.chatinfo.presentation.UpdateChatInfoConfigurator;
import ru.ozon.app.android.cabinet.di.CabinetNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.cabinet.di.ScanItModule_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.cabinet.profile.RefreshOnActualizeEmailConfigurator;
import ru.ozon.app.android.cabinet.profile.RefreshOnUserDataChangedConfigurator;
import ru.ozon.app.android.cabinet.profile.SessionListUpdatedConfigurator;
import ru.ozon.app.android.cabinet.profileAvatar.configurators.ProfileAvatarConfigurator;
import ru.ozon.app.android.cabinet.scanItIntro.ScanItIntroConfig;
import ru.ozon.app.android.cabinet.scanItIntro.data.ScanItIntroMapper;
import ru.ozon.app.android.cabinet.scanItIntro.presentation.ScanItIntroViewMapper;
import ru.ozon.app.android.cabinet.sectionheader.SectionHeaderConfig;
import ru.ozon.app.android.cabinet.sectionheader.SectionHeaderModule_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.cabinet.sectionheader.SectionHeaderViewMapper;
import ru.ozon.app.android.cabinet.tabSelector.TabSelectorConfig;
import ru.ozon.app.android.cabinet.tabSelector.data.TabSelectorMapper;
import ru.ozon.app.android.cabinet.tabSelector.presentation.TabSelectorViewMapper;
import ru.ozon.app.android.cart.CartSharedViewPoolSizeSetterConfigurator;
import ru.ozon.app.android.cart.alltocart.core.AllToCartConfig;
import ru.ozon.app.android.cart.alltocart.core.AllToCartViewMapper;
import ru.ozon.app.android.cart.alltocart.di.AllToCartModule_ProvideAllToCartWidgetFactory;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartViewModel;
import ru.ozon.app.android.cart.cartSplitV2.RemoveCartSplitActionHandler;
import ru.ozon.app.android.cart.cartSplitV2.SwipeRemoveCartSplitActionHandler;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.warmup.CartSplitV2WarmupInfoProvider;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.warmup.CartSplitV2WarmupInfoProviderV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator;
import ru.ozon.app.android.cart.common.data.prefetch.CartPrefetchController;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.FreshAddToCartRetryHandler;
import ru.ozon.app.android.cart.common.domain.delegate.CartChangeChecker;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder;
import ru.ozon.app.android.cart.common.interceptor.CartDeeplinkInterceptor;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.configurator.AddToCartLoaderConfigurator;
import ru.ozon.app.android.cart.configurator.AsyncCartConfigurator;
import ru.ozon.app.android.cart.configurator.CartConfigurator;
import ru.ozon.app.android.cart.configurator.CartKeyboardInsetConfigurator;
import ru.ozon.app.android.cart.configurator.CartOnScreenEventHandlerConfigurator;
import ru.ozon.app.android.cart.configurator.CartPrefetchConfigurator;
import ru.ozon.app.android.cart.configurator.CartRefreshEventConfigurator;
import ru.ozon.app.android.cart.configurator.CartRestoreItemConfigurator;
import ru.ozon.app.android.cart.configurator.CartScreenStateConfigurator;
import ru.ozon.app.android.cart.configurator.CartSplitSwipeConfigurator;
import ru.ozon.app.android.cart.configurator.FamilyCartConfigurator;
import ru.ozon.app.android.cart.configurator.FamilyCartOnScreenEventHandlerConfigurator;
import ru.ozon.app.android.cart.configurator.FamilyCartRefreshEventConfigurator;
import ru.ozon.app.android.cart.configurator.FreshCartConfigurator;
import ru.ozon.app.android.cart.configurator.ResetCartModeConfigurator;
import ru.ozon.app.android.cart.configurator.interceptors.CartComposerInterceptor;
import ru.ozon.app.android.cart.configurator.interceptors.skuPromo.SkuPromoCartComposerInterceptor;
import ru.ozon.app.android.cart.configurator.preCreating.CartPreCreateViewConfiguratorV2;
import ru.ozon.app.android.cart.controls.v2.data.warmup.ControlsV2WarmupInfoProvider;
import ru.ozon.app.android.cart.controls.v3.data.warmup.ControlsV3WarmupInfoProvider;
import ru.ozon.app.android.cart.di.CartNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.cart.domain.delegate.UpdateCartOnStartDelegate;
import ru.ozon.app.android.cart.master.data.warmup.MasterWarmupInfoProvider;
import ru.ozon.app.android.cart.postRender.customAction.PostRenderActionHandler;
import ru.ozon.app.android.cart.premiumPointsTrainV2.data.warmup.PremiumPointsTrainV2WarmupInfoProvider;
import ru.ozon.app.android.cart.totalV3.data.warmup.TotalV3WarmupInfoProvider;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.cart.ui.addToCart.AddToCartActionHandler;
import ru.ozon.app.android.cart.ui.cartActionProcessor.CartActionsProcessorConfigurator;
import ru.ozon.app.android.cart.ui.cartActionProcessor.CartActionsProcessorConfiguratorFactory;
import ru.ozon.app.android.cart.ui.cartActionProcessor.actionHandlers.AddToCartResponseActionWithActionHandler;
import ru.ozon.app.android.cart.ui.customActionHandler.navigateToCartAndRefresh.NavigateToCartAndRefreshActionHandler;
import ru.ozon.app.android.cart.ui.customActionHandler.navigateToCartAndRefresh.NavigateToCartAndRefreshNavigationHandler;
import ru.ozon.app.android.cart.ui.customActionHandler.navigateToRootCart.NavigateToRootCartNavigationHandler;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi;
import ru.ozon.app.android.cart.ui.performTwoActions.PerformTwoActionsHandler;
import ru.ozon.app.android.cdn.host.manager.di.CdnHostManagerComponentApi;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchApi;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.checkoutcomposer.CheckoutPreCreationConfigurator;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputCustomActionHandler;
import ru.ozon.app.android.checkoutcomposer.common.cardbinding.data.CardBindingConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.configurator.AddressPartsInputPageConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.configurator.CheckoutRequestInterceptor;
import ru.ozon.app.android.checkoutcomposer.common.configurator.InitCheckoutRequestConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.configurator.RemoveRfbsSplitConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.configurator.ScrollToWidgetConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.configurator.OptionsSelectorSheetResultConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.configurator.SearchSheetResultConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.localgoods.LocalGoodsForCheckoutRepositoryImpl;
import ru.ozon.app.android.checkoutcomposer.common.scrollToWidget.CheckoutScrollToWidgetKeyRepository;
import ru.ozon.app.android.checkoutcomposer.deeplink.PreloadImagesConfigurator;
import ru.ozon.app.android.checkoutcomposer.di.CheckoutNavigationModule_ProvideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.checkoutcomposer.di.common.CheckoutCommonComponentApi;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.configurator.CheckoutClearCacheConfigurator;
import ru.ozon.app.android.checkoutcomposer.total.configurator.ClearReferrerConfigurator;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data.warmup.TotalStickyV2WarmupInfoProvider;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager;
import ru.ozon.app.android.checkoutgeo.address.di.AddressComponentApi;
import ru.ozon.app.android.checkoutgeo.checkout.localgoods.LocalGoodsForCheckoutRepository;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayManager;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayPreferences;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.checkoutorderdone.di.OrderDoneNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.OrderDoneConfigurator;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.OrderDoneRefreshCartConfigurator;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.RefreshOnStartPageConfigurator;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.deliveryc2c.DeliveryOrderDoneConfigurator;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.actionHandlers.SaveUserTipsChooseActionHandler;
import ru.ozon.app.android.checkoutui.configurators.CheckoutRefreshConfigurator;
import ru.ozon.app.android.checkoutui.configurators.FirstRequestSetupConfigurator;
import ru.ozon.app.android.cml.delivery.actionHandler.CmlComposerActionWithActionHandler;
import ru.ozon.app.android.cml.delivery.actionHandler.cellList.collapse.CollapseCellListActionHandler;
import ru.ozon.app.android.cml.delivery.actionHandler.cellList.expand.ExpandCellListActionHandler;
import ru.ozon.app.android.cml.delivery.actionHandler.orderAction.CmlOrderActionHandler;
import ru.ozon.app.android.cml.delivery.actionHandler.updatePassport.CmlUpdatePassportActionHandler;
import ru.ozon.app.android.cml.delivery.actionHandler.validateDeclaredPrice.ValidateDeclaredPriceActionHandler;
import ru.ozon.app.android.cml.delivery.actionHandler.validateDeclaredPrice.ValidateOrderDeclaredPriceActionHandler;
import ru.ozon.app.android.cml.delivery.actionHandler.validatePassport.CmlValidatePassportActionHandler;
import ru.ozon.app.android.cml.delivery.configurators.AddNewCardConfigurator;
import ru.ozon.app.android.cml.delivery.configurators.EditOrderConfigurator;
import ru.ozon.app.android.cml.delivery.configurators.ParcelPhotoAddConfigurator;
import ru.ozon.app.android.cml.delivery.di.CmlDeliveryComponentApi;
import ru.ozon.app.android.cml.delivery.di.CmlDeliveryNavigationModule;
import ru.ozon.app.android.cml.delivery.di.CmlDeliveryNavigationModule_ProvideDeeplinkHandlerFactory;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.InputCurtainViewModel;
import ru.ozon.app.android.cml.domain.configurators.CmlEventsHandlerConfigurator;
import ru.ozon.app.android.cml.domain.di.CmlDomainComponentApi;
import ru.ozon.app.android.cml.domain.refresh.CmlEventsController;
import ru.ozon.app.android.cml.feature.tabs.navigation.CmlAppHandler;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.actionHandlers.ChangeCurrencyActionHandler;
import ru.ozon.app.android.common.actionHandlers.ClosePromoStickyBubbleAction;
import ru.ozon.app.android.common.actionHandlers.CopyAndDismissActionHandler;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.common.actionHandlers.ModifySearchUrlViewModel;
import ru.ozon.app.android.common.actionHandlers.OpenApplicationStoreActionHandler;
import ru.ozon.app.android.common.actionHandlers.PickImageActionHandler;
import ru.ozon.app.android.common.actionHandlers.RedirectWithPrefetchActionHandler;
import ru.ozon.app.android.common.actionHandlers.SaveLocaleActionHandler;
import ru.ozon.app.android.common.actionHandlers.ScrollToTopActionHandler;
import ru.ozon.app.android.common.actionHandlers.SetBugReportActionHandler;
import ru.ozon.app.android.common.actionHandlers.SetCookieAndRefreshHandler;
import ru.ozon.app.android.common.actionHandlers.SetTeensModeActionHandler;
import ru.ozon.app.android.common.actionHandlers.ViewPromoPlacementBannerActionHandler;
import ru.ozon.app.android.common.actionHandlers.ViewPromoStickyBubbleAction;
import ru.ozon.app.android.common.actionHandlers.applySorting.ApplySortingActionHandler;
import ru.ozon.app.android.common.actionHandlers.applySorting.ApplySortingViewModel;
import ru.ozon.app.android.common.actionHandlers.di.CommonActionHandlersDiModule_Companion_ProvideSearchHistoryApiFactory;
import ru.ozon.app.android.common.actionHandlers.mallFilter.MallFilterNotificationActionHandler;
import ru.ozon.app.android.common.actionHandlers.removeSuggestion.RemoveSuggestionActionHandler;
import ru.ozon.app.android.common.actionHandlers.removeSuggestion.RemoveSuggestionApi;
import ru.ozon.app.android.common.actionHandlers.setPublicProfile.SetPublicProfileStatusActionHandler;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareButtonRepository;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkViewModel;
import ru.ozon.app.android.common.actionHandlers.shareSellerLink.ShareSellerLinkActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.SubscribeAuthorViewModel;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers.SubscribeAuthorActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers.UnsubscribeAuthorActionHandler;
import ru.ozon.app.android.common.activate_code.ActivateCodeViewMapper;
import ru.ozon.app.android.common.activate_code.core.ActivateCodeConfig;
import ru.ozon.app.android.common.activate_code.di.ActivateCodeWidgetModule;
import ru.ozon.app.android.common.activate_code.di.ActivateCodeWidgetModule_ProvideActivateCodeWidgetFactory;
import ru.ozon.app.android.common.cache.di.SearchConfiguratorFactoryModule_Companion_ProvideSearchCacheTrackerApiFactory;
import ru.ozon.app.android.common.cellList.v2.data.warmup.CellListV2WarmupInfoProvider;
import ru.ozon.app.android.common.configurator.dialogSearch.DialogSearchPageLoadConfigurator;
import ru.ozon.app.android.common.configurator.dialogSearch.DialogSearchPageLoadConfiguratorFactory;
import ru.ozon.app.android.common.configurator.search.SearchPageLoadConfigurator;
import ru.ozon.app.android.common.configurator.search.SearchPageLoadConfiguratorFactory;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.common.disclaimer.DisclaimerViewMapper;
import ru.ozon.app.android.common.disclaimer.customActions.ActualizeEmailActionHandler;
import ru.ozon.app.android.common.filterWidgets.filters.configurators.FilterValuesModalConfigurator;
import ru.ozon.app.android.common.filterWidgets.filters.configurators.FiltersKeyboardInsetConfigurator;
import ru.ozon.app.android.common.filterWidgets.filters.configurators.MainFilterConfigurator;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.FilterSharedViewModel;
import ru.ozon.app.android.common.header.di.HeaderModule_ProvideHeader$header_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.common.navigationblocks.core.NavigationBlocksV2Config;
import ru.ozon.app.android.common.navigationblocks.core.NavigationBlocksV2ViewMapper;
import ru.ozon.app.android.common.navigationblocks.di.NavigationBlocksV2Module_ProvideNavigationBlocksV2WidgetFactory;
import ru.ozon.app.android.common.productselectormobile.PickerRefreshLinkStore;
import ru.ozon.app.android.common.productselectormobile.core.AutopickerBottomSheetRepository;
import ru.ozon.app.android.common.productselectormobile.core.ProductSelectorMobileConfig;
import ru.ozon.app.android.common.productselectormobile.core.ProductSelectorMobileMapper;
import ru.ozon.app.android.common.productselectormobile.core.ProductSelectorMobileViewMapper;
import ru.ozon.app.android.common.productselectormobile.di.ProductSelectorMobileModule_ProvideExportWidgetsFactory;
import ru.ozon.app.android.common.productselectormobile.util.AutopickerBottomSheetConfigurator;
import ru.ozon.app.android.common.productselectormobile.util.AutopickerResultConfigurator;
import ru.ozon.app.android.common.promobanner.core.PromoBannerV2Config;
import ru.ozon.app.android.common.promobanner.core.PromoBannerV2ViewMapper;
import ru.ozon.app.android.common.promobanner.di.PromoBannerV2WidgetModule_Companion_ProvidePromoBannerV2WidgetFactory;
import ru.ozon.app.android.common.request.SearchCacheTrackerApi;
import ru.ozon.app.android.common.roundedcells.core.RoundedCellsConfig;
import ru.ozon.app.android.common.roundedcells.core.RoundedCellsViewMapper;
import ru.ozon.app.android.common.roundedcells.di.RoundedCellsModule_ProvideRoundedCellsModuleWidgetFactory;
import ru.ozon.app.android.common.serviceCarousel.core.ServiceCarouselPreCreateInfoProvider;
import ru.ozon.app.android.common.tabs.core.TabsV2Config;
import ru.ozon.app.android.common.tabs.core.TabsV2StickyViewMapper;
import ru.ozon.app.android.common.tabs.core.TabsV2ViewMapper;
import ru.ozon.app.android.common.tabs.core.TabsV2ViewModel;
import ru.ozon.app.android.common.tabs.data.TabOnBoardingRepository;
import ru.ozon.app.android.common.tabs.di.TabsV2Module_ProvideTabsV2WidgetFactory;
import ru.ozon.app.android.common.tabs.presentation.onboarding.TabsOnBoardingViewModel;
import ru.ozon.app.android.common.taglist.taglistv3.data.TagListWarmupInfoProvider;
import ru.ozon.app.android.common.twocards.core.TwoCardsConfig;
import ru.ozon.app.android.common.twocards.core.TwoCardsViewMapper;
import ru.ozon.app.android.common.twocards.di.TwoCardsModule_ProvideTwoCardsWidgetFactory;
import ru.ozon.app.android.commonwidgets.actionHandlers.RefreshTopComposerActionHandler;
import ru.ozon.app.android.commonwidgets.di.CommonWidgetsV1DiModule_ProvideWidgetFactory;
import ru.ozon.app.android.commonwidgets.di.StorefrontCommonV1Module_ProvideWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.annotation.data.AnnotationConfig;
import ru.ozon.app.android.commonwidgets.widgets.annotation.di.AnnotationWidgetModule_ProvideAnnotationWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.annotation.presentation.AnnotationNoUiViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.annotation.presentation.AnnotationViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cell.core.CellConfig;
import ru.ozon.app.android.commonwidgets.widgets.cell.core.CellViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cellList.core.CellListConfig;
import ru.ozon.app.android.commonwidgets.widgets.cellList.core.CellListHeaderViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cellList.core.CellListViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.closeButton.data.CloseButtonConfig;
import ru.ozon.app.android.commonwidgets.widgets.closeButton.di.CloseButtonModule_ProvideCloseButtonWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.closeButton.presentation.CloseButtonViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.curtain.DeepLinkProcessor;
import ru.ozon.app.android.commonwidgets.widgets.curtain.data.CurtainConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtain.di.CurtainWidgetModule_ProvideCurtainWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.CurtainCustomViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.ui.CurtainViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.core.CurtainNavBarConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.core.CurtainNavBarViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.di.CurtainNavBarWidgetModule_ProvideDiscountCodeWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.RemoveAddressAlertCustomActionHandler;
import ru.ozon.app.android.commonwidgets.widgets.disclaimer.data.DisclaimerConfig;
import ru.ozon.app.android.commonwidgets.widgets.emptyState.core.CommonEmptyStateViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.emptyState.core.EmptyStateConfig;
import ru.ozon.app.android.commonwidgets.widgets.emptyState.presentation.ExampleActionHandler;
import ru.ozon.app.android.commonwidgets.widgets.emptyState.presentation.ExampleActionHandler2;
import ru.ozon.app.android.commonwidgets.widgets.headerWidget.data.PageHeaderConfig;
import ru.ozon.app.android.commonwidgets.widgets.headerWidget.presentation.PageHeaderViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.logosList.data.LogosListConfig;
import ru.ozon.app.android.commonwidgets.widgets.logosList.di.LogosListModule_ProvideLogosListWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.LogosListViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.data.NavBarIconButtonNavbarConfig;
import ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.di.NavBarIconButtonWidgetModule_ProvideIconButtonWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation.NavbarIconButtonViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.pixel.data.PixelConfig;
import ru.ozon.app.android.commonwidgets.widgets.pixel.presentation.PixelViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.refresh.RefreshConfig;
import ru.ozon.app.android.commonwidgets.widgets.refresh.RefreshViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.core.RestrictionsConfig;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.core.RestrictionsMapper;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.core.RestrictionsNoUIViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.data.store.RestrictionsAppStore;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.data.store.RestrictionsScreenStore;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.data.warmup.ResctrictionsWarmupInfoProvider;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.di.RestrictionsComponentApi;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.core.ResultsHeaderConfig;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.core.ResultsHeaderMapper;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.core.ResultsHeaderViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.di.ResultsHeaderModule_Companion_ProvideResultsHeaderApiFactory;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultsHeaderApi;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultsHeaderRepositoryImpl;
import ru.ozon.app.android.commonwidgets.widgets.share.core.ShareLinkConfig;
import ru.ozon.app.android.commonwidgets.widgets.share.core.ShareLinkViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.share.data.ShareButtonApi;
import ru.ozon.app.android.commonwidgets.widgets.share.data.ShareButtonRepositoryImpl;
import ru.ozon.app.android.commonwidgets.widgets.share.di.ShareButtonModule_Companion_ProvidesShareButtonApiFactory;
import ru.ozon.app.android.commonwidgets.widgets.stickyBehaviorBarrier.data.StickyBehaviorBarrierConfig;
import ru.ozon.app.android.commonwidgets.widgets.stickyBehaviorBarrier.di.StickyBehaviorBarrierModule_ProvideStickyBehaviorBarrierWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.stickyBehaviorBarrier.presentation.StickyBehaviorBarrierViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsConfig;
import ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsMapper;
import ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.textblock.di.TextBlockWidgetModule_ProvideDiscountCodeWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.textblock.presentation.main.TextBlockViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.textblock.presentation.sticky.TextBlockNoUiViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.themeSelector.ThemeSelectorConfig;
import ru.ozon.app.android.commonwidgets.widgets.themeSelector.ThemeSelectorViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.tracking.core.TrackingConfig;
import ru.ozon.app.android.commonwidgets.widgets.tracking.core.TrackingViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.tracking.di.TrackingWidgetModule_Companion_ProvideMasterWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.valuestotal.core.ValuesTotalConfig;
import ru.ozon.app.android.commonwidgets.widgets.valuestotal.core.ValuesTotalViewMapper;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.configurator.RefreshByResultConfigurator;
import ru.ozon.app.android.composer.configurator.state.factory.ComposerInterceptorFactory;
import ru.ozon.app.android.composer.configurator.storage.ComposerConfiguratorStorage;
import ru.ozon.app.android.composer.configurator.storage.ConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.ComposerLifecycleConfigurator;
import ru.ozon.app.android.composer.configurators.FullScreenConfigurator;
import ru.ozon.app.android.composer.configurators.RefreshByCurrencyConfigurator;
import ru.ozon.app.android.composer.configurators.RefreshByLocaleConfigurator;
import ru.ozon.app.android.composer.configurators.VKIDRefreshStateConfigurator;
import ru.ozon.app.android.composer.configurators.factory.BottomNavigationScrollConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.factory.ComposerActionAndRedirectConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.factory.ComposerLifecycleConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.factory.FullScreenConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.factory.NotificationConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.factory.RefreshByCurrencyConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.factory.RefreshByGenderConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.factory.RefreshByLocaleConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.factory.RefreshByUserConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.factory.StoriesConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.factory.VKIDRefreshStateConfiguratorFactory;
import ru.ozon.app.android.composer.configurators.factory.VoiceRecognitionConfiguratorFactory;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.ComposerInterceptorFactoryModule;
import ru.ozon.app.android.composer.di.ComposerInterceptorFactoryModule_ProvideMiniAppComposerInterceptorFactory;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.domain.cache.CachePreferences;
import ru.ozon.app.android.composer.initialwidgets.DefaultInitialWidgetsProvider;
import ru.ozon.app.android.composer.initialwidgets.EmptyInitialWidgetProvider;
import ru.ozon.app.android.composer.navigations.destinations.ComposerDeeplinkBottomSheetDestination;
import ru.ozon.app.android.composer.navigations.navigators.ComposerNestedPageNavigationHandler;
import ru.ozon.app.android.composer.network.cache.CacheComposerInterceptor;
import ru.ozon.app.android.composer.network.cache.ComposerCacheService;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CacheErrorInterceptor;
import ru.ozon.app.android.composer.network.cronet.ComposerCronetMetricsListener;
import ru.ozon.app.android.composer.network.di.CacheComposerInterceptorFactory;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.network.redirect.RestrictRedirectsNetworkInterceptor;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.composer.showroom.di.ShowroomNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.universalscreen.view.ComposerComposeThemeWrapper;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.deeplink.disableOnBoarding.OnBoardingDisplayDisableDeeplinkHandler;
import ru.ozon.app.android.composer.widgets.v2.onboarding.deeplink.disableOnBoarding.OnBoardingDisplayDisableNavigationHandler;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingModule_Companion_ProvideDefaultOnBoardingDisplayOnPageRepositoryFactory;
import ru.ozon.app.android.configurators.scanitintro.ScanItIntroConfigurator;
import ru.ozon.app.android.configurators.statusbar.LightStatusBarConfigurator;
import ru.ozon.app.android.core.navigation.deeplink.storefront.home.HomeDestinationFactoryImpl;
import ru.ozon.app.android.core.navigation.deeplink.storefront.search.precreate.CategoryMainPageFreshPreCreationConfigurator;
import ru.ozon.app.android.core.navigation.deeplink.storefront.search.precreate.CategoryPreCreationConfigurator;
import ru.ozon.app.android.core.navigation.deeplink.storefront.seller.ExpressSellerAppHandler;
import ru.ozon.app.android.core.navigation.deeplink.storefront.seller.SellerAppHandler;
import ru.ozon.app.android.core.navigation.deeplink.storefront.web.WebViewAuthDestinationInterceptor;
import ru.ozon.app.android.core.navigation.interceptors.AtMostEmployeeUserDestinationInterceptorImpl;
import ru.ozon.app.android.core.navigation.interceptors.AtMostQaUserDestinationInterceptorImpl;
import ru.ozon.app.android.core.navigation.interceptors.AuthDestinationInterceptorImpl;
import ru.ozon.app.android.core.navigation.interceptors.predicate.di.InterceptorPredicatesComponentApi;
import ru.ozon.app.android.core.navigation.interceptors.tab.apps.ExpressAppHandler;
import ru.ozon.app.android.core.navigation.interceptors.tab.apps.MainAppHandler;
import ru.ozon.app.android.core.navigation.interceptors.tab.apps.TravelAppHandler;
import ru.ozon.app.android.core.navigation.navigators.ExternalAppNavigationHandler;
import ru.ozon.app.android.core.navigation.navigators.ExternalBrowserNavigationHandler;
import ru.ozon.app.android.core.navigation.navigators.RestartAppNavigationHandler;
import ru.ozon.app.android.courieronmap.di.CourierOnMapNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.cscore.actionButton.configurators.OrderChangeActionButtonsConfigurator;
import ru.ozon.app.android.cscore.actionButton.presentation.ActionButtonViewModel;
import ru.ozon.app.android.cscore.buttonv2.configurators.SingleActionButtonConfigurator;
import ru.ozon.app.android.cscore.core.configurators.OrderCacheStateInterceptor;
import ru.ozon.app.android.cscore.core.configurators.RefreshOnStartConfigurator;
import ru.ozon.app.android.cscore.couriertips.configurators.RefreshAnchorScreenConfigurator;
import ru.ozon.app.android.cscore.orderTracking.configurators.updater.LKOrderTrackingV4UpdaterConfigurator;
import ru.ozon.app.android.cscore.orderTracking.configurators.updater.MainOrderTrackingV4UpdaterConfigurator;
import ru.ozon.app.android.cscore.orderTracking.viewmodels.OrderTrackingV4ViewModel;
import ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler.OrderDetailChangeHandlerViewModel;
import ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler.OrderDetailsChangeHandlerConfigurator;
import ru.ozon.app.android.cscore.orderlist.configurators.OrderFiltersConfigurator;
import ru.ozon.app.android.cscore.orderlist.configurators.RefreshAfterTimeChangeConfigurator;
import ru.ozon.app.android.cscore.orderlist.configurators.RefreshByOrderChangeConfigurator;
import ru.ozon.app.android.cscore.payment.configurators.AddUserCardConfigurator;
import ru.ozon.app.android.cscore.selectpayment.configurators.SelectPaymentConfigurator;
import ru.ozon.app.android.csma.api.ComposerActionApi;
import ru.ozon.app.android.data.markdown.MarkDownParser;
import ru.ozon.app.android.data.markdown.TextParserProvider;
import ru.ozon.app.android.data.markdown.di.MarkDownModule_ProvideMarkWonFactory;
import ru.ozon.app.android.datePicker.DatePickerDialogFragment;
import ru.ozon.app.android.datePicker.DatePickerDialogFragment_MembersInjector;
import ru.ozon.app.android.datePicker.DatePickerMapper;
import ru.ozon.app.android.datePicker.DatePickerViewModel;
import ru.ozon.app.android.debugmenu.core.navigation.navigators.TestNamespaceNavigationHandler;
import ru.ozon.app.android.debugmenu.deeplink.EnvironmentDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.ExtraHeaderDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.FeatureFlagDeeplinkHandler;
import ru.ozon.app.android.debugmenu.deeplink.FintechAutoTestDeeplinkHandler;
import ru.ozon.app.android.debugmenu.di.DebugMenuComponentApi;
import ru.ozon.app.android.debugmenu.di.DebugNavigationModule_ProvideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.debugmenu.ozondebugmenu.OzonDebugMenuHelper;
import ru.ozon.app.android.debugmenu.ozondebugmenu.di.OzonDebugMenuComponentApi;
import ru.ozon.app.android.debugmenu.userqa.domain.UserQASegmentInteractor;
import ru.ozon.app.android.deeplinks.KeepActivityHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.AddCardActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentRepositoryImpl;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentViewModel;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.api.SelectPaymentApi;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.di.SelectPaymentModule_Companion_ProvideSelectPaymentApiFactory;
import ru.ozon.app.android.delivery.customActionsHandlers.call.ClassifiedCallActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.call.CourierOnMapCallActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.callCourier.CallCourierActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.cancelOrderV3.CancelOrderV3ActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.changeItemQuantity.ChangeItemQuantityActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.checkoutRefresh.CheckoutDismissAndRefreshActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.checkoutRefresh.CheckoutPopAndRefreshActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.cleanCncAddress.CleanCncAddressActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.dismissAndScrollByWidgetKey.DismissAndScrollByScrollWidgetKeyActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.dismissandrefresh.DismissAndRefreshMapActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.favoritesList.FavoriteListAddActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.FetchCancelReasonsActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsRepositoryImpl;
import ru.ozon.app.android.delivery.customActionsHandlers.getDirections.GetDirectionsActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.gocheckout.GoCheckoutActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.openNotificationSettings.OpenNotificationSettingsActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.ozonid.InstantLoginActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.ozonid.LogoutActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.ozonid.UserAuthBiometryActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll.PostRefreshWithScrollActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.refreshWithNewComment.RefreshWithNewCommentActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.refreshWithSelectedIds.RefreshWithSelectedIdsActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.removePost.PostApi;
import ru.ozon.app.android.delivery.customActionsHandlers.removePost.PostRepository;
import ru.ozon.app.android.delivery.customActionsHandlers.removePost.RemovePostActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.removePost.RemovePostModule;
import ru.ozon.app.android.delivery.customActionsHandlers.removePost.RemovePostModule_ProvidePostApiFactory;
import ru.ozon.app.android.delivery.customActionsHandlers.removePost.RemovePostViewModel;
import ru.ozon.app.android.delivery.customActionsHandlers.removeSplit.RemoveSplitActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.removeSplit.RemoveSplitConfigurator;
import ru.ozon.app.android.delivery.customActionsHandlers.reorder.ReorderActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeAnalytics;
import ru.ozon.app.android.delivery.customActionsHandlers.showNotification.ShowNotificationBarActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.toggleProductList.ToggleProductListActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.updateSelectedMapTab.UpdateSelectedMapTabActionHandler;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.configurator.UploadPhotosConfigurator;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel.ComponentUploadPhotosViewModelImpl;
import ru.ozon.app.android.deliveryreview.di.DeliveryReviewNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.di.UgcRatingComponentApi;
import ru.ozon.app.android.di.module.customActionHandler.CustomActionHandlerModule_Companion_ProvidesCustomWidgetActionHandlerFactory;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.domain.session.di.auth.AuthComponentApi;
import ru.ozon.app.android.domain.session.interactors.AuthInteractor;
import ru.ozon.app.android.domain.session.interactors.BiometryInteractor;
import ru.ozon.app.android.domain.session.interactors.SberIdInteractor;
import ru.ozon.app.android.domain.session.receiver.AuthDeeplinkReceiver;
import ru.ozon.app.android.domain.session.repository.BiometryInfoRepository;
import ru.ozon.app.android.domain.session.repository.mappers.AuthFlowMapper;
import ru.ozon.app.android.domain.session.storage.AuthOriginStorage;
import ru.ozon.app.android.domain.session.utils.OTPPeriodFormatterBuilder;
import ru.ozon.app.android.domain.tiles.DislikeRecommendationActionHandler;
import ru.ozon.app.android.domain.tiles.di.TilesDomainComponentApi;
import ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractor;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.featureChecker.FailedExternalLinkRetryFeatureChecker;
import ru.ozon.app.android.environment.EnvironmentInitializer;
import ru.ozon.app.android.error.summary.di.navigation.ErrorSummaryNavigationDiModule_ProvideDeeplinkHandlerFactory;
import ru.ozon.app.android.faq.di.FaqNavigationModule_ProvideDeeplinkHandlersSet$faq_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.favorites.accesscontrol.AccessControlConfigurator;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlViewModel;
import ru.ozon.app.android.favorites.configurators.CreateFavoritesListAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.CreateShoppingListAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.CreateShoppingListInputInsetsConfigurator;
import ru.ozon.app.android.favorites.configurators.DeleteFavoritesListAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.EditListFavoriteAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.FavoritesMediaPickerConfigurator;
import ru.ozon.app.android.favorites.configurators.ListAccessChangedConfigurator;
import ru.ozon.app.android.favorites.configurators.PinStatusFavoritesListAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.RemoveFromFavoritesListAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.RenameFavoritesListAsyncConfigurator;
import ru.ozon.app.android.favorites.data.family.FamilyAccountRefresher;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider;
import ru.ozon.app.android.favorites.di.FavoritesNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.favorites.di.FavoritesWidgetModule_Companion_ProvideWidgetsFactory;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoriteComposerActionExecutor;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesComposerActionHandler;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesCustomActionHandlerInteractor;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.domain.favoriteToggleProductButton.FavoriteToggleProductButtonInteractor;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractor;
import ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistsInteractor;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;
import ru.ozon.app.android.favorites.favoriteproduct.v1.data.FavoriteProductConfig;
import ru.ozon.app.android.favorites.favoriteproduct.v1.ui.FavoriteProductWidgetViewMapper;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.actionhandler.AddToFavoriteActionHandler;
import ru.ozon.app.android.favorites.ui.actionhandler.FamilyActionHandler;
import ru.ozon.app.android.favorites.ui.actionhandler.FamilyGetLinkActionHandler;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteDeleteListActionHandler;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListAddActionHandlerImpl;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteListRemoveActionHandler;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteShareListActionHandler;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteWishlistRemoveActionHandler;
import ru.ozon.app.android.favorites.ui.actionhandler.RemoveFromFavoriteActionHandler;
import ru.ozon.app.android.favorites.ui.actionhandler.RemoveFromFavoritesActionHandler;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.app.android.favorites.ui.configurators.CatalogFavoritesConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.CreateFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.CreateShoppingListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.DeleteFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.EditListFavoriteConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.FamilyAccountConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.FavoritesSellersScrollToUpConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.NotificationConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.PinStatusFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.RemoveFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.RemoveFromFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.RenameFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.UpdateByFavoritesConfigurator;
import ru.ozon.app.android.favorites.ui.deeplink.FavoritesDeeplinkHandlerDelegate;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.di.FavoritesUIComponentApi;
import ru.ozon.app.android.favorites.ui.favoriteToggleProductButton.viewmodel.FavoriteToggleProductButtonViewModel;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.configurator.OnFavoriteEntityChangedConfigurator;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.favorites.ui.wishlists.DeleteWishlistViewModel;
import ru.ozon.app.android.fresh.cart.domain.actionHandlers.FreshAddToCartActionHandler;
import ru.ozon.app.android.fresh.cart.domain.actionHandlers.FreshPostRefreshWithScrollActionHandler;
import ru.ozon.app.android.fresh.cart.domain.actionHandlers.FreshRemoveCartItemsActionHandler;
import ru.ozon.app.android.fresh.cart.domain.actionHandlers.FreshRemoveCartItemsOnModalActionHandler;
import ru.ozon.app.android.fresh.cart.domain.actionHandlers.FreshRemoveCartTileActionHandler;
import ru.ozon.app.android.fresh.chat.actionHandlers.CheckFreshAIConversationStatusActionHandler;
import ru.ozon.app.android.fresh.chat.actionHandlers.CreateFreshAIConversationActionHandler;
import ru.ozon.app.android.fresh.chat.viewModels.FreshAISharedViewModel;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusViewModel;
import ru.ozon.app.android.fresh.checkout.domain.actionHandlers.CreateFreshOrderActionHandler;
import ru.ozon.app.android.fresh.checkout.domain.actionHandlers.CreateFreshOrderV2ActionHandler;
import ru.ozon.app.android.fresh.checkout.domain.actionHandlers.InputFormActionHandler;
import ru.ozon.app.android.fresh.common.configurators.addlegal.AddLegalMobileConfigurator;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.di.LegalsResultStateHolderComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActModule_Companion_ProvideB2bAcceptActApiFactory;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActViewModel;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.api.B2bAcceptActApi;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDeleteConsignee.B2bDeleteConsigneeActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDeleteConsignee.B2bDeleteConsigneeModule_Companion_ProvideB2bDeleteConsigneeApiFactory;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDeleteConsignee.B2bDeleteConsigneeViewModel;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDeleteConsignee.api.B2bDeleteConsigneeApi;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDeleteConsignee.data.B2bDeleteConsigneeRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileModule_Companion_ProvideB2bDownloadFileApiFactory;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileViewModel;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.api.B2bDownloadFileApi;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalModule_Companion_ProvideB2bSwitchUserApiFactory;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalViewModel;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.api.B2bRemoveLegalApi;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.B2bResetEdoVerificationActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.B2bResetEdoVerificationModule_Companion_ProvideB2bResetEdoVerificationApiFactory;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.B2bResetEdoVerificationViewModel;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.api.B2bResetEdoVerificationApi;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.data.B2bResetEdoVerificationRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.B2bSelectConsigneeActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.B2bSelectConsigneeModule_Companion_ProvideB2bSelectConsigneeApiFactory;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.B2bSelectConsigneeViewModel;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.api.B2bSelectConsigneeApi;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.data.B2bSelectConsigneeRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.di.B2BNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.fresh.feature.b2b.domain.DocsDeliveryRepository;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.RefreshByStatusEdoConfigurator;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.StatusEdoState;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di.StatusEdoStateComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di.factory.RefreshByStatusEdoConfiguratorFactory;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.RefreshPageConfigurator;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.ConsigneeAddressSearchConfigurator;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoStatusStorage;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.AddressSearchConfigurator;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModelImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.LegalDetailsFileSelectConfigurator;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.common.LegalsFlowConfigurator;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationConfigurator;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.RecActsDeclinerFileSelectConfigurator;
import ru.ozon.app.android.fresh.geo.di.FreshGeoDeeplinkHandlersModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.viewMapper.CatalogueTabsPreCreateInfoProvider;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselPreCreateInfoProvider;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.presentation.ScrollActionListPreCreateInfoProvider;
import ru.ozon.app.android.fresh.navigation.configurators.AddressPopUpStateConfigurator;
import ru.ozon.app.android.fresh.navigation.configurators.AvatarProfileConfigurator;
import ru.ozon.app.android.fresh.navigation.configurators.CategoryMainPageFreshConfigurator;
import ru.ozon.app.android.fresh.navigation.configurators.ConfirmDeleteResultConfigurator;
import ru.ozon.app.android.fresh.navigation.configurators.DismissOnAddressUpdateConfigurator;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.fresh.navigation.di.components.FreshNavigationComponentApi;
import ru.ozon.app.android.fresh.navigation.di.modules.FreshDeeplinkHandlersModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.fresh.navigation.interceptors.MoveCartItemsInterceptor;
import ru.ozon.app.android.fresh.navigation.interceptors.MoveCartItemsPayloadHandler;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarRepository;
import ru.ozon.app.android.fresh.navigation.profileAvatar.presentation.AvatarProfileViewModel;
import ru.ozon.app.android.fresh.unsorted.di.FreshComponentApi;
import ru.ozon.app.android.fresh.unsorted.di.FreshUnsortedDeeplinkHandlersModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.presentation.AddressSelectorLitePreCreateInfoProvider;
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.domain.FreshDeliverySubscribeActionHandler;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.actionHandlers.GetRecShelfActionHandler;
import ru.ozon.app.android.geo.addressBookBarV2.core.AddressBookBarV2PreCreateInfoProvider;
import ru.ozon.app.android.geo.addressBookBarV2.data.AddressBookBarV2WarmupInfoProvider;
import ru.ozon.app.android.geo.common.configurators.AddressBookStateConfigurator;
import ru.ozon.app.android.geo.common.configurators.AddressSelectorRefresherConfigurator;
import ru.ozon.app.android.geo.common.configurators.FirstRequestMapConfigurator;
import ru.ozon.app.android.geo.common.configurators.RefreshByLocationConfigurator;
import ru.ozon.app.android.geo.common.configurators.factory.ComposerAddressSelectorConfiguratorFactory;
import ru.ozon.app.android.geo.common.configurators.factory.RefreshByLocationConfiguratorFactory;
import ru.ozon.app.android.geo.di.GeoNavigationModule_ProvideDeeplinkHandlersSet$geo_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapConfigurator;
import ru.ozon.app.android.geoprovider.di.GeoProviderComponentApi;
import ru.ozon.app.android.initializers.ActionInitializeModule;
import ru.ozon.app.android.initializers.ActionInitializeModule_BindFintechLibActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideAbToolActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideAdvertisingMessagingInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideAnalyticsInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideApplicationLifecycleInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideAppsFlyerActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideAtomActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideAuthActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideCleanCustomBundleStateActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideComposerActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideComposerCacheInvalidatorInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideComposerLoggingActionsInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideConfiguratorsActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideDarkThemeInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideEnvironmentInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideFreshLiveActivityInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideHapticsInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideHttpLoggingActionIntializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideJetpackComposeInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideJodaActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideLastLocationInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideLeakCanaryInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideLimbActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideLoggerInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideMapsActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideMessengerFeatureActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideNativePaymentInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideOzonDebugMenuSdkInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideOzonGalleryInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideOzonIdAccountInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideOzonInAppUpdateInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvidePikazonActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvidePrefetchManagerActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvidePushInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideRxErrorPluginInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideSberPayInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideScreenRouterActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideSentrySessionIdInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideSetLocaleActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideShortcutsInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideStartupTimeTrackerInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideStringsProviderInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideTabConfigInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideTrackerActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideTrackerDebugMenuInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideUpdateCartInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideUserStateActionInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideWebViewInitializerFactory;
import ru.ozon.app.android.initializers.ActionInitializeModule_ProvideWhitelistingInitializerFactory;
import ru.ozon.app.android.initializers.AdvertisingMessagingInitializer;
import ru.ozon.app.android.initializers.AppInitializer;
import ru.ozon.app.android.initializers.DarkThemeInitializer;
import ru.ozon.app.android.initializers.FreshLiveActivityInitializer;
import ru.ozon.app.android.initializers.HapticsInitializer;
import ru.ozon.app.android.initializers.JetpackComposeInitializer;
import ru.ozon.app.android.initializers.JodaActionInitializer;
import ru.ozon.app.android.initializers.MapsActionInitializer;
import ru.ozon.app.android.initializers.PrefetchManagerActionInitializer;
import ru.ozon.app.android.initializers.PushInitializer;
import ru.ozon.app.android.initializers.RxErrorPluginInitializer;
import ru.ozon.app.android.initializers.SberPayInitializer;
import ru.ozon.app.android.initializers.ScreenRouterActionInitializer;
import ru.ozon.app.android.initializers.StringsProviderInitializer;
import ru.ozon.app.android.initializers.TabConfigInitializer;
import ru.ozon.app.android.initializers.WebViewInitializer;
import ru.ozon.app.android.initializers.abtool.AbToolActionInitializer;
import ru.ozon.app.android.initializers.appsflyer.AppsFlyerActionInitializer;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.app.android.initializers.atoms.navigator.GalleryNavigator;
import ru.ozon.app.android.initializers.auth.AuthActionInitializer;
import ru.ozon.app.android.initializers.auth.commands.AbToolAuthStateCommand;
import ru.ozon.app.android.initializers.auth.commands.AdultAuthStateCommand;
import ru.ozon.app.android.initializers.auth.commands.AuthAnalyticsStateCommand;
import ru.ozon.app.android.initializers.auth.commands.AuthStateCommand;
import ru.ozon.app.android.initializers.auth.commands.CartAuthStateCommand;
import ru.ozon.app.android.initializers.auth.commands.OzonBankStateCommand;
import ru.ozon.app.android.initializers.auth.commands.OzonMessengerAuthStateCommand;
import ru.ozon.app.android.initializers.auth.commands.OzonPushAuthStateCommand;
import ru.ozon.app.android.initializers.auth.commands.TabAuthStateCommand;
import ru.ozon.app.android.initializers.auth.commands.TravelTabAuthStateCommand;
import ru.ozon.app.android.initializers.bundle.CleanCustomBundleStateActionInitializer;
import ru.ozon.app.android.initializers.cache.ComposerCacheInvalidatorInitializer;
import ru.ozon.app.android.initializers.configurators.ComposerActionInitializer;
import ru.ozon.app.android.initializers.configurators.ConfiguratorsActionInitializer;
import ru.ozon.app.android.initializers.debug.OzonDebugMenuSdkInitializer;
import ru.ozon.app.android.initializers.fintech.FintechLibActionInitializer;
import ru.ozon.app.android.initializers.gallery.OzonGalleryInitializer;
import ru.ozon.app.android.initializers.inappupdate.OzonInAppUpdateInitializer;
import ru.ozon.app.android.initializers.lastlocation.LastLocationInitializer;
import ru.ozon.app.android.initializers.lifecycle.ApplicationLifecycleInitializer;
import ru.ozon.app.android.initializers.lifecycle.ApplicationLifecycleModule_Companion_ProvideStyleParserLifecycleAdapterFactory;
import ru.ozon.app.android.initializers.lifecycle.ApplicationLifecycleObserver;
import ru.ozon.app.android.initializers.lifecycle.ConfigChangesComponentCallback;
import ru.ozon.app.android.initializers.lifecycle.orientation.BottomSheetFragmentsAppearanceUpdater;
import ru.ozon.app.android.initializers.lifecycle.orientation.FragmentsAppearanceUpdater;
import ru.ozon.app.android.initializers.lifecycle.orientation.FragmentsLifecycleHandler;
import ru.ozon.app.android.initializers.lifecycle.orientation.OrientationLifecycleHandler;
import ru.ozon.app.android.initializers.limb.LimbActionInitializer;
import ru.ozon.app.android.initializers.localization.SetLocaleActionInitializer;
import ru.ozon.app.android.initializers.localization.util.LocalizationActivityCallback;
import ru.ozon.app.android.initializers.localization.util.LocalizationSwitcher;
import ru.ozon.app.android.initializers.logger.ComposerLoggingActionsInitializer;
import ru.ozon.app.android.initializers.logger.HttpLoggingActionIntializer;
import ru.ozon.app.android.initializers.logger.LoggerInitializer;
import ru.ozon.app.android.initializers.messenger.MessengerFeatureActionInitializer;
import ru.ozon.app.android.initializers.nativePayment.NativePaymentInitializer;
import ru.ozon.app.android.initializers.sentry.SentrySampleRateHolder;
import ru.ozon.app.android.initializers.sentry.SentrySessionIdInitializer;
import ru.ozon.app.android.initializers.shortcuts.DynamicShortcutsInitializer;
import ru.ozon.app.android.initializers.startup.time.StartupTimeTrackerInitializer;
import ru.ozon.app.android.initializers.tracker.TrackerActionInitializer;
import ru.ozon.app.android.initializers.tracker.TrackerDebugMenuInitializer;
import ru.ozon.app.android.initializers.tracker.TrackerDynamicSettingsModifier;
import ru.ozon.app.android.initializers.updatecart.UpdateCartInitializer;
import ru.ozon.app.android.initializers.user.OzonIdAccountInitializer;
import ru.ozon.app.android.initializers.user.OzonIdActivityCallback;
import ru.ozon.app.android.initializers.user.UserStateActionInitializer;
import ru.ozon.app.android.initializers.warmer.MoshiAdapterWarmer;
import ru.ozon.app.android.initializers.warmer.MoshiAdapterWarmerImpl;
import ru.ozon.app.android.initializers.warmer.WarmUpCallback;
import ru.ozon.app.android.initializers.whitelisting.WhitelistingInitializer;
import ru.ozon.app.android.injection.IDaggerComponent;
import ru.ozon.app.android.injection.composer.di.ComposerExportedModule_Companion_ProvideComposerComposeThemeWrapperFactory;
import ru.ozon.app.android.injection.composer.di.ComposerExportedModule_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.leakcanary.LeakCanaryInitializer;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.location.AddressLocalStore;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.location.LocationRepository;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.LastLocationRepository;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.MapPreferences;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;
import ru.ozon.app.android.marketing.coupon.di.CouponComponentApi;
import ru.ozon.app.android.marketing.coupon.domain.CouponInteractor;
import ru.ozon.app.android.marketing.di.MarketingNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.marketing.di.MarketingWidgetsModule_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.core.BigPromoCounterNavBarPreCreateInfoProvider;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.data.BigPromoCounterNavBarWarmupInfoProvider;
import ru.ozon.app.android.marketing.widgets.bundleV2.bundleProduct.navigation.CloseBottomSheetNavigationHandler;
import ru.ozon.app.android.marketing.widgets.couponList.core.CouponListConfig;
import ru.ozon.app.android.marketing.widgets.couponList.core.CouponListViewMapper;
import ru.ozon.app.android.marketing.widgets.couponList.core.CouponMapper;
import ru.ozon.app.android.marketing.widgets.couponList.presentation.CouponListDecoration;
import ru.ozon.app.android.marketing.widgets.couponPromo.core.CouponPromoConfig;
import ru.ozon.app.android.marketing.widgets.couponPromo.core.CouponPromoMapper;
import ru.ozon.app.android.marketing.widgets.couponPromo.core.CouponPromoNoUiViewMapper;
import ru.ozon.app.android.marketing.widgets.couponPromo.core.CouponPromoViewMapper;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoRouter;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersPreCreateInfoProvider;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersWarmupInfoProvider;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsBottomSheetConfigurator;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsConfigurator;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsStateConfigurator;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.core.SellerCarouselConfig;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.core.SellerCarouselViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.core.SellerMapper;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.core.SellerCategoryListConfig;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.core.SellerCategoryListViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerNavigation.core.SellerNavigationConfig;
import ru.ozon.app.android.marketing.widgets.sellerNavigation.core.SellerNavigationViewMapper;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.mediaupload.di.MediaUploadComponentApi;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCase;
import ru.ozon.app.android.messenger.di.MessengerFeatureModule;
import ru.ozon.app.android.messenger.di.MessengerFeatureModule_ProvideAIMessengerFeatureFactory;
import ru.ozon.app.android.messenger.di.MessengerFeatureModule_ProvideBloggerFeatureFactory;
import ru.ozon.app.android.messenger.di.MessengerFeatureModule_ProvideMessengerFeatureFactory;
import ru.ozon.app.android.messenger.di.MessengerNavigationModule_ProvideDeeplinkHandlerFactory;
import ru.ozon.app.android.messenger.di.NamespaceModule;
import ru.ozon.app.android.messenger.di.NamespaceModule_ProvideAIChatFeatureNamespaceFactory;
import ru.ozon.app.android.messenger.di.NamespaceModule_ProvideBloggerChatNamespaceFactory;
import ru.ozon.app.android.messenger.di.NamespaceModule_ProvideMessengerFeatureNamespaceFactory;
import ru.ozon.app.android.messenger.initializer.MessengerActionHandlerImpl;
import ru.ozon.app.android.messenger.initializer.MessengerInitializer;
import ru.ozon.app.android.messenger.initializer.MessengerNonFatalLogger;
import ru.ozon.app.android.messenger.initializer.TrackerAnalyticsAdapterImpl;
import ru.ozon.app.android.messenger.initializer.di.MessengerInitializerModule_Companion_ProvideAiMessengerActionHandlerImplFactory;
import ru.ozon.app.android.messenger.initializer.di.MessengerInitializerModule_Companion_ProvideBloggerMessengerActionHandlerImplFactory;
import ru.ozon.app.android.messenger.initializer.di.MessengerInitializerModule_Companion_ProvideMessengerActionHandlerImplFactory;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.core.MessengerCounterPreCreateInfoProvider;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.data.MessengerCounterWarmupInfoProvider;
import ru.ozon.app.android.minifyLink.data.MinifyLinkRepository;
import ru.ozon.app.android.minifyLink.di.MinifyLinkComponentApi;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.monetization.configurators.AddressSearchSheetResultConfigurator;
import ru.ozon.app.android.monetization.configurators.BloggerPersonalDataKeyboardConfigurator;
import ru.ozon.app.android.monetization.di.MonetizationNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.interceptors.AtMostEmployeeUserDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorMultiplePredicate;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.FeatureUpdater;
import ru.ozon.app.android.network.auth.AuthNetworkService;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.network.initializers.OzonIdInitializerDelegate;
import ru.ozon.app.android.network.interceptors.DynamicUrlInterceptor;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.network.websockets.AppVisibility;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.notifications.NotificationsManager;
import ru.ozon.app.android.notifications.di.NotificationComponentApi;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.offline.di.PdpOfflineScreenComponentApi;
import ru.ozon.app.android.orderdetails.cancelExplanation.deeplink.CancelExplanationDeeplinkHandler;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.configurator.ConfirmDeliveryDateActionButtonsConfigurator;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.ConfirmDateButtonViewModel;
import ru.ozon.app.android.orderdetails.di.OrderDetailsNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.configurators.NestedScrollingDisabledConfigurator;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.configurator.ScrollToShipmentConfigurator;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.repository.OrderDetailsScrollToShipmentRepository;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl.OrderShipmentComponentApi;
import ru.ozon.app.android.orders.cml.deeplinks.configurators.DeliveryDetailsPageConfigurator;
import ru.ozon.app.android.orders.cml.di.CmlOrdersNavigationModule;
import ru.ozon.app.android.orders.cml.di.CmlOrdersNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.ordertracking.utils.ProcessLifecyclePublisherImpl;
import ru.ozon.app.android.ordertracking.v4.OrderTrackingV4PreCreateInfoProvider;
import ru.ozon.app.android.ordertracking.v4.data.OrderTrackingV4WarmupInfoProvider;
import ru.ozon.app.android.partpayment.contractbtn.ContractBtnConfig;
import ru.ozon.app.android.partpayment.contractbtn.ContractBtnModule_Companion_ProvideContractBtnWidgetFactory;
import ru.ozon.app.android.partpayment.contractbtn.ContractBtnViewMapper;
import ru.ozon.app.android.partpayment.di.HomeCreditNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.partpayment.formpage.FormPageConfig;
import ru.ozon.app.android.partpayment.formpage.PartPaymentSummaryPageConfigurator;
import ru.ozon.app.android.partpayment.formpage.ResultControllerConfigurator;
import ru.ozon.app.android.partpayment.formpage.data.FormPageApiDataSource;
import ru.ozon.app.android.partpayment.formpage.data.autocomplete.MaskAutocompleteRepository;
import ru.ozon.app.android.partpayment.formpage.data.photo.PhotoRepository;
import ru.ozon.app.android.partpayment.formpage.data.validation.PassFormRepository;
import ru.ozon.app.android.partpayment.formpage.di.FormPageModule_Companion_ProvideFormPageApiDataSourceFactory;
import ru.ozon.app.android.partpayment.formpage.di.FormPageModule_Companion_ProvideFormPageWidgetFactory;
import ru.ozon.app.android.partpayment.formpage.view.FormPageRouter;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewMapper;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModelImpl;
import ru.ozon.app.android.partpayment.homecredit.HomeCreditActionHandler;
import ru.ozon.app.android.partpayment.homecredit.HomeCreditActionHandlerModule_Companion_ProvideHomeCreditApiFactory;
import ru.ozon.app.android.partpayment.homecredit.HomeCreditApi;
import ru.ozon.app.android.partpayment.landing.di.LandingModule_Companion_ProvideFormPageLandingLimitWidgetFactory;
import ru.ozon.app.android.partpayment.landing.limit.data.FormPageLandingLimitRepository;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitConfig;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitNoUiViewMapper;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitUiViewMapper;
import ru.ozon.app.android.partpayment.landing.limit.view.LandingLimitViewModelImpl;
import ru.ozon.app.android.partpayment.smssign.SmsSignConfig;
import ru.ozon.app.android.partpayment.smssign.data.SmsSignRepository;
import ru.ozon.app.android.partpayment.smssign.di.SmsSignModule_Companion_ProvideSmsSignWidgetFactory;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignNoUiViewMapper;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewMapper;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModelImpl;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.feature.di.PaymentNavigationModule_ProvideDeeplinkHandlersSet$payment_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.payment.ui.changepayment.actionhandler.ChangePaymentActionHandler;
import ru.ozon.app.android.payment.ui.changepayment.configurator.ChangePaymentConfigurator;
import ru.ozon.app.android.payment.ui.changepayment.configurator.ChangePaymentMethodConfigurator;
import ru.ozon.app.android.payment.ui.changepayment.data.ChangePaymentApi;
import ru.ozon.app.android.payment.ui.changepayment.presentation.ChangePaymentViewModel;
import ru.ozon.app.android.payment.ui.changepaymentmethodandpay.ChangePaymentMethodAndPayActionHandler;
import ru.ozon.app.android.payment.ui.configurators.AvailableNativePaymentInterceptor;
import ru.ozon.app.android.payment.ui.configurators.orderDetails.OrderDetailsPayConfigurator;
import ru.ozon.app.android.payment.ui.configurators.orderDetails.OrderPayConfigurator;
import ru.ozon.app.android.payment.ui.createOrderV2.CreateOrderV2ActionHandler;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.payment.ui.createorder.CreateOrderActionHandler;
import ru.ozon.app.android.payment.ui.createpayment.CreatePaymentActionHandler;
import ru.ozon.app.android.payment.ui.createservice.ClickOrderConfigurator;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceActionHandler;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceRepository;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceViewModel;
import ru.ozon.app.android.payment.ui.fastPay.FastPayRepository;
import ru.ozon.app.android.payment.ui.fastPay.checkFastPay.CheckFastPayActionHandler;
import ru.ozon.app.android.payment.ui.fastPay.checkFastPay.CheckFastPayConfigurator;
import ru.ozon.app.android.payment.ui.fastPay.checkFastPay.CheckFastPayViewModel;
import ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayActionHandler;
import ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayConfigurator;
import ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayViewModel;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderC2CActionHandler;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderC2CConfigurator;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderC2CRepository;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderC2CViewModel;
import ru.ozon.app.android.pdfviewer.di.PdfFileComponentApi;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;
import ru.ozon.app.android.pdp.actionHandlers.addToCartWithRedirect.AddToCartWithRedirectActionHandler;
import ru.ozon.app.android.pdp.actionHandlers.copyToClipboard.CopyToClipboardActionHandler;
import ru.ozon.app.android.pdp.di.module.PdpNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.pdp.offline.PdpOfflineScreenFactory;
import ru.ozon.app.android.pdp.offline.widgetfactory.GalleryV4WidgetFactory;
import ru.ozon.app.android.pdp.offline.widgetfactory.PdpStatusWidgetFactory;
import ru.ozon.app.android.pdp.offline.widgetfactory.PriceV4WidgetFactory;
import ru.ozon.app.android.pdp.offline.widgetfactory.TextProductNameWidgetFactory;
import ru.ozon.app.android.pdp.ui.configurators.common.additionalViewPool.AdditionRecycledViewPoolConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.comparison.configurator.ComparisonConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonApi;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonMapper;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonRepository;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.AddToComparisonViewModel;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.ComparisonRefreshViewModel;
import ru.ozon.app.android.pdp.ui.configurators.di.PdpComparisonModule_Companion_ProvideComparisonApiFactory;
import ru.ozon.app.android.pdp.ui.configurators.monetization.BottomSheetInsetsConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshAfterDismissAndPopPageConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.monetization.bloggerFormSubmit.BloggerRefreshChannelsPageConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.monetization.bloggerFormSubmit.BloggerRefreshMainPageConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.monetization.bloggerFormSubmit.BloggerRefreshPostsPageAfterFormSubmitConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.EdgeToEdgeConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.monetization.edgeConfigurator.TopEdgeConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.monetization.shareLinkBloggerCopyResult.ShareLinkBloggerCopyResultConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.pdp.PdpConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModelImpl;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.PdpScreenStateHolder$CacheState;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.PdpScreenStateHolder$State;
import ru.ozon.app.android.pdp.ui.configurators.pdp.screenstateholder.di.PdpScreenStateHolderComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.commentsList.CommentsListConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.common.HideToolbarConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ProductReviewRepository;
import ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.ListReviewSortsViewModel;
import ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.configurator.ListReviewConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.QuestionsConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.ReviewSuccessConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.SubmitCachedReviewConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.SubmitCachedReviewViewModel;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.di.UgcReviewFormComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewGallery.ReviewGalleryV2Configurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.RefreshSelectionConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.actionHandler.RemoveSelectionItemProductActionHandler;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.di.SelectionsCoreComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductsEventManager;
import ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode.DynamicTeenModeConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode.StaticTeenModeConfigurator;
import ru.ozon.app.android.pdp.view.pdp.PdpGalleryFullViewConfigurator;
import ru.ozon.app.android.pdp.view.pdp.RefreshByAdultStateConfigurator;
import ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.applybutton.DismissRefreshAndScrollActionHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetConfigurator;
import ru.ozon.app.android.pdp.widgets.galleryV4.core.GalleryV4Config;
import ru.ozon.app.android.pdp.widgets.helpfulHints.configurator.OrderDoneLiteInfoConfigurator;
import ru.ozon.app.android.pdp.widgets.priceV4.core.PriceV4Config;
import ru.ozon.app.android.pdpoldwidgets.di.PdpOldWidgetsExportModule_Companion_ProvideExportOldWidgetsFactory;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.ComparisonConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselViewModel;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.ComparisonCharacteristicsGroupViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.ComparisonCharacteristicsPickViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.ComparisonJustDifferencesViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.ComparisonKeyCharacteristicsViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.core.CrosslinkConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.core.CrosslinkViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.core.GalleryV2Config;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.core.GalleryV2Mapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.core.GalleryV2ViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.core.NamedValueListConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.core.cell.NamedValueListCellViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.core.header.NamedValueListHeaderViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.textBlock.core.TextBlockConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.core.TrustFactorConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.core.TrustFactorViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.core.VideoConsultationBannerConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.core.VideoConsultationBannerViewMapper;
import ru.ozon.app.android.pdpvideomolecule.presentation.VideoMoleculeConfigurator;
import ru.ozon.app.android.pdpvideomolecule.presentation.VideoPreloadCleanerConfigurator;
import ru.ozon.app.android.pikazon.PikazonActionInitializer;
import ru.ozon.app.android.pikazon.PikazonEventListenerInterceptor;
import ru.ozon.app.android.pikazon.PikazonUserAgentInterceptor;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.di.PikazonModule;
import ru.ozon.app.android.pikazon.di.PikazonModule_ProvideCronetMetricListenerFactory;
import ru.ozon.app.android.pikazon.di.PikazonModule_ProvidePikazonClientFactory;
import ru.ozon.app.android.pikazon.di.PikazonModule_ProvidePikazonEventListenerFactoryFactory;
import ru.ozon.app.android.pikazon.di.PikazonModule_ProviderCronetConfigFactory;
import ru.ozon.app.android.pikazon.performance.PikazonEventListenerFactory;
import ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreStateDelegate;
import ru.ozon.app.android.platform.customActionHandlers.DismissOrCloseMiniappActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.PopActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.ReloadFromCurrentWidgetPageActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.commonActionHandlersFactory.CommonActionHandlersFactoryComponentApi;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.ComposerActionAndRedirectViewModel;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.configurator.ComposerActionAndRedirectConfigurator;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithSaveScrollActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithRefresh.ComposerActionWithRefreshCustomActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.openDeeplinkForResult.OpenDeeplinkForRefreshResultActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.openDeleteListingModal.ClassifiedOpenDeleteListingModalActionHandler;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.platform.lifecycle.activity.ActivityLifeCycleHolder;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.platform.orientation.ScreenOrientationDelegate;
import ru.ozon.app.android.platform.theme.DarkThemeManager;
import ru.ozon.app.android.precreation.PreCreateInfoProvider;
import ru.ozon.app.android.precreation.PreCreateWidgetsFacade;
import ru.ozon.app.android.precreation.configurators.SearchPreCreationConfigurator;
import ru.ozon.app.android.precreation.providers.TagListPreCreateInfoProvider;
import ru.ozon.app.android.push.OzonPushManager;
import ru.ozon.app.android.push.di.PushComponentApi;
import ru.ozon.app.android.regulardraw.deeplinkhandlers.DailyRewardsConfigurator;
import ru.ozon.app.android.regulardraw.deeplinkhandlers.MorkovskModalMenuConfigurator;
import ru.ozon.app.android.regulardraw.deeplinkhandlers.PrizesConfigurator;
import ru.ozon.app.android.regulardraw.miniapp.deeplinkhandler.MorkovskWelcomeScreenConfigurator;
import ru.ozon.app.android.regulardraw.miniapp.di.RegularDrawNavigationModule_Companion_BindRegularDrawAppHandler$regulardraw_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.regulardraw.miniapp.di.RegularDrawNavigationModule_Companion_ProvideDeeplinkHandlersSet$regulardraw_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingConfigurator;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponentApi;
import ru.ozon.app.android.regulardraw.onboarding.lottery.LotteryForceShowOnboardingActionHandler;
import ru.ozon.app.android.regulardraw.onboarding.lottery.LotteryOpenPurchaseTicketPageActionHandler;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.actionhandler.MainDrawMajorScreenProgressUpdateActionHandler;
import ru.ozon.app.android.returns.actionModal.deeplink.ReturnActionModalDeeplinkHandler;
import ru.ozon.app.android.returns.actionModal.presentation.ReturnActionModalConfigurator;
import ru.ozon.app.android.returns.cancels.di.CancelsNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.returns.creation.di.ReturnCreationNavigationModule;
import ru.ozon.app.android.returns.creation.di.ReturnCreationNavigationModule_ProvideDeeplinkHandlersFactory;
import ru.ozon.app.android.returns.creation.pageconfigurators.PhotoPickerConfigurator;
import ru.ozon.app.android.returns.creation.pageconfigurators.ReturnCreationItemRemovedConfigurator;
import ru.ozon.app.android.returns.creation.pageconfigurators.ReturnCreationPhotoUpdatedConfigurator;
import ru.ozon.app.android.returns.details.deeplink.ReturnDetailsDeeplinkHandler;
import ru.ozon.app.android.returns.details.deeplink.ReturnDetailsNormalizeBackStackConfigurator;
import ru.ozon.app.android.returns.edit.di.ReturnEditNavigationModule;
import ru.ozon.app.android.returns.edit.di.ReturnEditNavigationModule_ProvideDeeplinkHandlersFactory;
import ru.ozon.app.android.returns.howToReturnGoods.HowToReturnGoodsNavigationModule;
import ru.ozon.app.android.returns.howToReturnGoods.HowToReturnGoodsNavigationModule_ProvideDeeplinkHandlersFactory;
import ru.ozon.app.android.returns.list.configurator.ReturnListUpdateConfigurator;
import ru.ozon.app.android.returns.list.deeplink.ReturnListDeeplinkHandler;
import ru.ozon.app.android.returns.list.deeplink.ReturnListNormalizeBackStackConfigurator;
import ru.ozon.app.android.returns.ui.di.RmsComponentApi;
import ru.ozon.app.android.returns.ui.domain.ReturnUpdateInteractor;
import ru.ozon.app.android.returns.ui.domain.actionhandlers.SaveReturnItemReasonCommentActionActionHandler;
import ru.ozon.app.android.returns.ui.domain.actionhandlers.SaveReturnReasonDescriptionActionHandler;
import ru.ozon.app.android.returns.ui.domain.actionhandlers.SaveReturnReasonDescriptionViewModel;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;
import ru.ozon.app.android.scanit.di.ScanItNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.search.SearchHideKeyboardOnOpenConfigurator;
import ru.ozon.app.android.search.aiMessenger.actionHandlers.AiRefreshActionHandlerImpl;
import ru.ozon.app.android.search.aiMessenger.actionHandlers.DeleteAiConversationActionHandlerImpl;
import ru.ozon.app.android.search.catalog.components.meta.MetaWidgetConfig;
import ru.ozon.app.android.search.catalog.components.meta.MetaWidgetViewMapper;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.AllStepViewModel;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.ProductSelectorDataAllStepNoUiViewMapper;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.core.SelectorDataViewAnalyticDelegate;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataConfig;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.di.ProductSelectorModule_ProvideWidgetsFactory;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.ProductSelectorDataConcreteStepNoUiViewMapper;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.data.ConcreteStepCellDataSource;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain.ApplyFilterActionProcessor;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain.DiscardFilterActionProcesser;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain.FilterActionProcessor;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain.RangeChangeFilterProcesser;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.domain.ResetFilterActionProcesser;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.ConcreteStepViewModel;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.core.SearchResultsSortV2Config;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.core.SearchResultsSortV2Mapper;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.core.SearchResultsSortV2ViewMapper;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.core.SortMarginMeasurer;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.di.SearchResultsSortV2Module_ProvideSearchResultsSortV2WidgetFactory;
import ru.ozon.app.android.search.categories.VoiceRecognitionConfigurator;
import ru.ozon.app.android.search.deeplink.CategoryPageConfigurator;
import ru.ozon.app.android.search.deeplink.FeedbackTilePreCreationConfigurator;
import ru.ozon.app.android.search.deeplink.RemoveRVItemAnimationConfigurator;
import ru.ozon.app.android.search.deeplink.SearchByImageConfigurator;
import ru.ozon.app.android.search.deeplink.SuggestionsPrefetchConfigurator;
import ru.ozon.app.android.search.deeplink.factory.SearchByImageConfiguratorFactory;
import ru.ozon.app.android.search.di.SearchComponentApi;
import ru.ozon.app.android.search.di.SearchNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.SearchRedirectToGlobalActionHandlerImpl;
import ru.ozon.app.android.search.navigation.SearchRouterImpl;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsV2PreCreateInfoProvider;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsV2WarmupInfoProvider;
import ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightCustomActionHandlerImpl;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarPreCreateInfoProvider;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarWarmupInfoProvider;
import ru.ozon.app.android.search.widgets.suggestions.ui.prefetch.SuggestionsPrefetchViewModel;
import ru.ozon.app.android.select.feature.entry.SelectAppStoreAvailabilityChecker;
import ru.ozon.app.android.sentry.di.SentryApiComponent;
import ru.ozon.app.android.session.auth.core.AuthConfig;
import ru.ozon.app.android.session.auth.data.mapper.AuthMapper;
import ru.ozon.app.android.session.auth.di.AuthWidgetModule_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.session.auth.presentation.viewMapper.AuthViewMapper;
import ru.ozon.app.android.session.auth.presentation.viewmodel.AuthViewModel;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApi;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountRepository;
import ru.ozon.app.android.session.deleteAccount.deleteAccountButton.data.DeleteAccountButtonConfig;
import ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation.DeleteAccountButtonViewMapper;
import ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation.DeleteAccountButtonViewModelImpl;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.data.DeleteAccountDescriptionConfig;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main.DeleteAccountDescriptionViewMapper;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyNoUIViewMapper;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyViewModelImpl;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data.ConfirmDeleteOtpConfig;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data.InputTypeMapper;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpNoUiViewMapper;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpViewModelImpl;
import ru.ozon.app.android.session.deleteAccount.di.DeleteAccountModule_ProvideConfirmDeleteOtpFactory;
import ru.ozon.app.android.session.deleteAccount.di.DeleteAccountModule_ProvideDeleteAccountApiFactory;
import ru.ozon.app.android.session.deleteAccount.di.DeleteAccountModule_ProvideDeleteAccountButtonFactory;
import ru.ozon.app.android.session.deleteAccount.di.DeleteAccountModule_ProvideDeleteAccountDescriptionFactory;
import ru.ozon.app.android.session.di.OzonIdSessionNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.session.editCredential.di.NewCredentialsModule_Companion_ProvideEditCredentialsWidgetFactory;
import ru.ozon.app.android.session.editCredential.di.NewCredentialsModule_Companion_ProvideOtpWidgetFactory;
import ru.ozon.app.android.session.editCredential.newCredentials.core.NewCredentialsConfig;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsConfigurator;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewMapper;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel.NewCredentialsViewModelImpl;
import ru.ozon.app.android.session.editCredential.otp.core.OTPWidgetConfig;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetMapper;
import ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetViewMapper;
import ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModelImpl;
import ru.ozon.app.android.session.editUserFullName.core.EditUserFullNameConfig;
import ru.ozon.app.android.session.editUserFullName.core.EditUserFullNameViewMapper;
import ru.ozon.app.android.session.editUserFullName.data.EditUserFullNameApi;
import ru.ozon.app.android.session.editUserFullName.data.EditUserFullNameMapper;
import ru.ozon.app.android.session.editUserFullName.data.EditUserFullNameRepository;
import ru.ozon.app.android.session.editUserFullName.di.EditUserFullNameModule_ProvideEditUserFullNameApiFactory;
import ru.ozon.app.android.session.editUserFullName.di.EditUserFullNameModule_ProvideWidgetFactory;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModelImpl;
import ru.ozon.app.android.session.editUserFullName.presentation.TextFieldBinder;
import ru.ozon.app.android.session.editUserFullName.presentation.TextFieldFactory;
import ru.ozon.app.android.session.flashcall.core.RequestPhoneAccessConfigurator;
import ru.ozon.app.android.session.instantLoginSettings.InstantLoginSettingsConfig;
import ru.ozon.app.android.session.instantLoginSettings.customActions.InstantLoginActionHandlerImpl;
import ru.ozon.app.android.session.instantLoginSettings.di.InstantLoginModule_ProvideWidgetFactory;
import ru.ozon.app.android.session.instantLoginSettings.ui.InstantLoginManager;
import ru.ozon.app.android.session.instantLoginSettings.ui.InstantLoginSettingsViewMapper;
import ru.ozon.app.android.session.logout.core.LogoutConfig;
import ru.ozon.app.android.session.logout.customActions.LogoutActionHandlerImpl;
import ru.ozon.app.android.session.logout.di.LogoutModule_ProvideWidgetFactory;
import ru.ozon.app.android.session.logout.presentation.LogoutViewMapper;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesApi;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesConfig;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllRepository;
import ru.ozon.app.android.session.logoutonall.di.LogoutOnAllDevicesWidgetModule;
import ru.ozon.app.android.session.logoutonall.di.LogoutOnAllDevicesWidgetModule_ProvideApiFactory;
import ru.ozon.app.android.session.logoutonall.di.LogoutOnAllDevicesWidgetModule_ProvideLogoutOnAllDevicesWidgetFactory;
import ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewMapper;
import ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewModelImpl;
import ru.ozon.app.android.session.security.UserAuthBiometrySettingsViewMapper;
import ru.ozon.app.android.session.security.customActions.UserAuthBiometryActionHandlerImpl;
import ru.ozon.app.android.session.security.data.UserAuthBiometrySettingsConfig;
import ru.ozon.app.android.session.security.di.SecurityWidgetV1Module_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometrySettingsMapper;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewModelImpl;
import ru.ozon.app.android.session.sessionList.SessionListConfigurator;
import ru.ozon.app.android.session.sessionList.SessionListConfiguratorFactory;
import ru.ozon.app.android.session.userAdultModalMobile.ViewAnalyticSenderDelegate;
import ru.ozon.app.android.session.userAdultModalMobile.data.AdultConfirmationRepository;
import ru.ozon.app.android.session.userAdultModalMobile.data.UserAdultModalConfig;
import ru.ozon.app.android.session.userAdultModalMobile.di.UserAdultConfirmationModule_Companion_ProvideApiFactory;
import ru.ozon.app.android.session.userAdultModalMobile.di.UserAdultConfirmationModule_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.session.userAdultModalMobile.domain.ComposerActionsExecutor;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.AdultConfirmationViewModel;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.BirthdayModelBuilder;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.UserAdultModalMapper;
import ru.ozon.app.android.session.userAdultModalMobile.presentation.UserAdultModalNoUiViewMapper;
import ru.ozon.app.android.session.userAdultModalMobileV2.handlers.ComposerActionWithActionHandlerV2;
import ru.ozon.app.android.session.userAdultModalMobileV2.handlers.OneTimePostRefreshHandlerV2;
import ru.ozon.app.android.session.userSocialsMobile.core.UserSocialsMobileConfig;
import ru.ozon.app.android.session.userSocialsMobile.data.header.UserSocialsMobileHeaderMapper;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UserSocialsMobileApi;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UserSocialsMobileItemMapper;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UserSocialsMobileRepository;
import ru.ozon.app.android.session.userSocialsMobile.di.UserSocialsMobileModule_Companion_ProvideUserSocialsMobileApiFactory;
import ru.ozon.app.android.session.userSocialsMobile.di.UserSocialsMobileModule_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.session.userSocialsMobile.presentation.header.UserSocialsMobileHeaderViewMapper;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewMapper;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModelImpl;
import ru.ozon.app.android.startup.initializers.NamedActionInitializerProvider;
import ru.ozon.app.android.storage.adult.AdultState;
import ru.ozon.app.android.storage.adult.AdultStateStore;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import ru.ozon.app.android.storage.cookiePreference.ExtraCookieStorage;
import ru.ozon.app.android.storage.cookiePreference.RefreshByGenderCookieEvents;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.extraHeaders.ExtraHeadersDataSource;
import ru.ozon.app.android.storage.firstLaunch.FirstLaunchStateStorage;
import ru.ozon.app.android.storage.logging.HttpLoggingLevelStorage;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.storefront.actionHandlers.AiRefreshActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.CloseFlowActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.CloseMiniappActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.DeleteAiConversationActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.DeleteSearchInsightCustomActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.PopAndRedirectActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.RedirectToSelectActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.SearchRedirectToGlobalActionHandler;
import ru.ozon.app.android.storefront.configurators.SharedViewPoolSizeSetterConfigurator;
import ru.ozon.app.android.storefront.core.atoms.di.LegacyStorefrontAtomParserModelsModule_Companion_ProvideLegacyStorefrontAtomParserModelsFactory;
import ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusProvider;
import ru.ozon.app.android.storefront.di.StoreFrontNavigationModule_ProvideDeeplinkHandlers$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.EnablePushNotificationsActionHandler;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewModel;
import ru.ozon.app.android.storefront.initialwidgetfabrics.ShellNavBarInitialWidgetFabricImpl;
import ru.ozon.app.android.storefront.onboardingscreen.di.CloseFlowWatcherComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.domain.OnboardingInteractor;
import ru.ozon.app.android.storefront.onboardingscreen.onboardingv2.OnboardingActionHandler;
import ru.ozon.app.android.storefront.stories.di.StoriesWidgetsModule_ProvideStorefrontWidgetsFactory;
import ru.ozon.app.android.storefront.stories.playstories.composer.StoriesConfigurator;
import ru.ozon.app.android.storefront.stories.playstories.core.PlayStoriesConfig;
import ru.ozon.app.android.storefront.stories.playstories.core.PlayStoriesViewMapper;
import ru.ozon.app.android.storefront.stories.playstories.di.StoriesNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3Configurator;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3ViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.StoryV3UpdateStore;
import ru.ozon.app.android.storefront.stories.setContainer.SetContainerConfig;
import ru.ozon.app.android.storefront.stories.setContainer.SetContainerStoriesV3UpdateViewMapper;
import ru.ozon.app.android.storefront.stories.setContainer.SetContainerViewMapper;
import ru.ozon.app.android.storefront.stories.setOfPreviews.SetOfPreviewsConfig;
import ru.ozon.app.android.storefront.stories.setOfPreviews.SetOfPreviewsViewMapper;
import ru.ozon.app.android.storefront.widgets.appOnboarding.deeplinkhandler.AppOnboardingConfigurator;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;
import ru.ozon.app.android.storefront.widgets.cms.di.CmsWidgetsV1DiModule_ProvideWidgetFactory;
import ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleConfig;
import ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleMapper;
import ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.common.CloseFlowAndActionDoActionHandler;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation.PopBackStackActionHandler;
import ru.ozon.app.android.storefront.widgets.helpCert.domain.ActivateHelpCertActionHandler;
import ru.ozon.app.android.storefront.widgets.login.core.LoginConfig;
import ru.ozon.app.android.storefront.widgets.login.data.LoginMapper;
import ru.ozon.app.android.storefront.widgets.login.di.LoginModule_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.storefront.widgets.login.presentation.LoginViewMapper;
import ru.ozon.app.android.storefront.widgets.miniappHeader.core.MiniAppHeaderPreCreateInfoProvider;
import ru.ozon.app.android.storefront.widgets.navbarv2.core.ShellNavBarV2PreCreateInfoProvider;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2PreCreateInfoProvider;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.data.NavigationSliderV2WarmupInfoProvider;
import ru.ozon.app.android.storefront.widgets.rateApp.CompositeCustomActionHandler;
import ru.ozon.app.android.storefront.widgets.rateApp.RateAppRouter;
import ru.ozon.app.android.storefront.widgets.rateApp.RateInAppActionHandler;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.switchUser.loader.LoaderConfigurator;
import ru.ozon.app.android.switchUser.loader.LoaderConfiguratorFactory;
import ru.ozon.app.android.tabbar.data.TabConfigManager;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;
import ru.ozon.app.android.tabbar.di.TabsComponentApi;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.domain.TravelTabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.feature.configurator.BottomNavigationScrollConfigurator;
import ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation.viewmodel.HideTabBarOnScrollViewModel;
import ru.ozon.app.android.thirdpartylibs.config.di.ThirdPartyLibrariesConfigComponentApi;
import ru.ozon.app.android.travel.actionhandler.addPassToWallet.AddPassToWalletActionHandler;
import ru.ozon.app.android.travel.actionhandler.calendarEvent.CalendarEventActionHandler;
import ru.ozon.app.android.travel.actionhandler.callAction.TravelCallActionHandler;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.PopRouteAndRefreshActionHandler;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.PushRouteAndRefreshActionHandler;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.di.api.DeeplinkRouteComponentApi;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEventPublisher;
import ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event.DeeplinkRouteEventReceiver;
import ru.ozon.app.android.travel.actionhandler.forceRedirect.TravelForceRedirectActionHandler;
import ru.ozon.app.android.travel.actionhandler.forceRefresh.TravelForceRefreshActionHandler;
import ru.ozon.app.android.travel.actionhandler.modalParentRefresh.ModalParentRefreshActionHandler;
import ru.ozon.app.android.travel.actionhandler.notificationAction.SwitchNotificationActionHandler;
import ru.ozon.app.android.travel.actionhandler.performActionsList.PerformActionsListActionHandler;
import ru.ozon.app.android.travel.actionhandler.popAndRefresh.PopAndRefreshActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelDownloadFile.TravelDownloadFileActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelGetDirectionsActionHandler.TravelGetDirectionsActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.ModalParentRefreshSharedViewModel;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.TravelCustomPostResultActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.TravelResultActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelResultActionV2.TrackableActions;
import ru.ozon.app.android.travel.actionhandler.travelResultActionV2.TravelResultActionV2Handler;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResultApi;
import ru.ozon.app.android.travel.commonapi.di.TravelCommonApiModule_Companion_ProvideTravelCommonActionResultApiFactory;
import ru.ozon.app.android.travel.data.storage.TravelStorageManagerHolder;
import ru.ozon.app.android.travel.data.storage.di.api.TravelStorageApi;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorage;
import ru.ozon.app.android.travel.feature.avia.di.TravelAviaNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.travel.feature.b2b.di.TravelB2BNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.travel.feature.entry.TravelWarmUpAdaptersCallback;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.TravelPushOnboardingComponentApi;
import ru.ozon.app.android.travel.feature.general.booking.actionHandlers.hotelsBookSuccessValidation.HotelsBookSuccessValidationActionHandler;
import ru.ozon.app.android.travel.feature.general.booking.configurators.HotelsBookModalPageConfigurator;
import ru.ozon.app.android.travel.feature.general.booking.configurators.HotelsBookPageStorageInitializerConfigurator;
import ru.ozon.app.android.travel.feature.general.booking.configurators.HotelsBookTotalRefreshConfigurator;
import ru.ozon.app.android.travel.feature.general.booking.di.TravelGeneralBookingNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.configurator.AdditionalServicesPageConfigurator;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.view.SearchResultsNavTitleV2PreCreateInfoProvider;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.configurator.TravelAddNewPassengerFormV2InputDateSelectorConfigurator;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.configurator.TravelAddNewPassengerFormV2InputSelectorConfigurator;
import ru.ozon.app.android.travel.feature.general.common.actionHandlers.TravelAppIconChangeActionHandler;
import ru.ozon.app.android.travel.feature.general.common.actions.SupportedResultActionHandlersImpl;
import ru.ozon.app.android.travel.feature.general.common.configurators.IconChooserModalPageConfigurator;
import ru.ozon.app.android.travel.feature.general.common.configurators.IconChooserRootPageConfigurator;
import ru.ozon.app.android.travel.feature.general.common.configurators.TravelPassengersPageStorageInitializerConfigurator;
import ru.ozon.app.android.travel.feature.general.common.di.TravelGeneralNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.travel.feature.general.common.offline.TravelOfflineWidgetsProviderImpl;
import ru.ozon.app.android.travel.feature.general.common.preCreation.cellList.TravelCellListPreCreationInfoProvider;
import ru.ozon.app.android.travel.feature.general.common.preCreation.navBar.TravelNavBarPreCreationInfoProvider;
import ru.ozon.app.android.travel.feature.general.common.preCreation.navTitle.TravelNavTitlePreCreationInfoProvider;
import ru.ozon.app.android.travel.feature.general.common.shared.checkout.CheckoutRefreshPageConfigurator;
import ru.ozon.app.android.travel.feature.general.common.shared.filtersButton.TravelFiltersKeyboardInsetConfigurator;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconButton.presentation.IconButtonPreCreateInfoProvider;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data.MilesForBuyersWarmUpAdapterInfoProvider;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.view.RailwayScrollPriceCalendarPreCreateInfoProvider;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelFiltersButton.preCreation.TravelFiltersButtonPreCreationInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.CellHorizontalListPreCreationInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.data.HotTicketsWarmUpAdapterInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsPreCreationInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.MainTabsPreCreationInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitlePreCreationInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4WarmUpAdapterInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4PreCreateInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.data.SearchFormV5WarmUpAdapterInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation.SearchFormV5PreCreateInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.presentation.SearchFormBarPreCreationInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelNotificationModalCheck.data.TravelNotificationWarmUpAdapterInfoProvider;
import ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.presentation.PaymentDetailsPreCreateInfoProvider;
import ru.ozon.app.android.travel.feature.hotels.di.TravelHotelsNavigationModule_ProvideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.hotels.interceptor.EnsureMiniappTravelDeeplinkInterceptor;
import ru.ozon.app.android.travel.feature.hotels.map.di.TravelHotelsMapNavigationModule_ProvideDeeplinkHandlerSetFactory;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.configurator.HotelsMapInfoConfigurator;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.shared.presentation.HotelsGalleryFullConfigurator;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.data.HotelsHorizontalShelvesWarmUpAdapterInfoProvider;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.HotelsHorizontalShelvesPreCreationInfoProvider;
import ru.ozon.app.android.travel.feature.railway.di.TravelRailwayNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.view.RailwaySearchResultsV3PreCreateInfoProvider;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view.RailwaySearchResultsV4PreCreateInfoProvider;
import ru.ozon.app.android.travel.feature.tours.di.TravelToursNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.anchorRefresh.TravelAnchorRefreshConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.downloadFile.TravelDownloadFileConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.fullScreen.FullScreenInsetsConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.hideAppbar.TravelHideAppbarConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.modalParentRefresh.ModalParentRefreshConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.onBackPressed.MainTabRedirectOnBackPressedConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.configurator.TravelMainPreCreateConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.configurator.TravelOrderListPreCreateConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.configurator.TravelRailwaySERPPreCreateConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.configurator.TravelThankYouPreCreateConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.refreshOnStart.TravelRefreshOnRestartPageConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.route.MapInfoDeeplinkRouteConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.route.MapInfoDeeplinkRouteViewModel;
import ru.ozon.app.android.travel.pageconfigurator.searchForm.SearchFormRefreshPageConfigurator;
import ru.ozon.app.android.travel.pageconfigurator.timeoutRedirect.TravelTimeoutRedirectConfigurator;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.TravelFunnelBackgroundColorDestinationBehavior;
import ru.ozon.app.android.travel.utils.destinationBehavior.behavior.TravelFunnelFullScreenDestinationBehavior;
import ru.ozon.app.android.ugc.core.configurator.SocialProfileConfigurator;
import ru.ozon.app.android.ugc.core.configurator.TopAuthorsLandingConfigurator;
import ru.ozon.app.android.ugc.core.configurator.TopAuthorsOnboardingConfigurator;
import ru.ozon.app.android.ugc.core.di.modules.UgcCoreNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.data.ReviewGalleryPreviewWarmupInfoProvider;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryWarmupInfoProvider;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterLikeActionHandler;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler.CommentActionHandler;
import ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler.CommentFooterViewModel;
import ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler.CommentModalActionHandler;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.TranslateReviewActionHandler;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateViewModel;
import ru.ozon.app.android.ugc.core.widgets.singlereview.warmup.SingleReviewWarmupInfoProvider;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation.HideStickyCellActionHandler;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation.StickyCellViewModel;
import ru.ozon.app.android.ugc.di.modules.UgcNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.ugc.payout.di.modules.UgcPayoutNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.PromoReviewRefreshConfigurator;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaPickerConfigurator;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.ReviewFormConfigurator;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler.SendRatingOnlyActionHandler;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler.SendReviewActionHandlerV1;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler.SendReviewActionHandlerV2;
import ru.ozon.app.android.ui.gallery.configurator.GalleryLauncherConfigurator;
import ru.ozon.app.android.ui.session.biometry.BiometricAuthViewModelImpl;
import ru.ozon.app.android.ui.session.configurators.auth.AuthPostDataConfigurator;
import ru.ozon.app.android.ui.session.configurators.auth.smsretriever.SmsRetrieverConfigurator;
import ru.ozon.app.android.ui.session.profile.ProfileInfoConfigurator;
import ru.ozon.app.android.ui.start.HomePageConfigurator;
import ru.ozon.app.android.ui.start.HomePageViewModelImpl;
import ru.ozon.app.android.ui.start.di.HomePageModule_ProvideProtectionAppDialogPluginProviderFactory;
import ru.ozon.app.android.ui.start.launch.LauncherStateDialogProcessor;
import ru.ozon.app.android.ui.start.launch.UpdateInAppLaunchStateDialogProcessor;
import ru.ozon.app.android.ui.start.launch.notification.BxNotificationPermissionProcessor;
import ru.ozon.app.android.ui.start.launch.notification.RequestNotificationPermissionProcessor;
import ru.ozon.app.android.ui.start.launch.notification.SelectNotificationPermissionProcessor;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi;
import ru.ozon.app.android.universalwidgets.di.UniversalWidgetsNavigationModule_ProvideDeeplinkHandlersSetFactory;
import ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.configurator.home.FailedExternalPageRetryNotificationConfigurator;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.precreate.UniversalObjectWidgetPreCreateProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation.SkuScrollPreCreateInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.data.warmup.TileGrid2WarmupInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedProductsBottomSheetConfigurator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.precreate.TileGrid2PreCreateProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.warmup.TileScrollWarmupInfoProvider;
import ru.ozon.app.android.update.InAppUpdateController;
import ru.ozon.app.android.update.di.InAppUpdateComponentApi;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.app.android.video.di.CdnVideoComponentApi;
import ru.ozon.app.android.video.di.ImagesAnalyticsComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;
import ru.ozon.app.android.videomolecule.di.VideoMoleculeDeeplinkHandlersModule_ProvideDeeplinkHandlersFactory;
import ru.ozon.app.android.warmup.WarmupAdaptersFacade;
import ru.ozon.app.android.warmup.WarmupInfoProvider;
import ru.ozon.app.android.web.di.WebComponentApi;
import ru.ozon.app.android.web.webview.ai.CheckAiConversation;
import ru.ozon.app.android.whitelist.common.WhiteListDomainsOzonAppsHandler;
import ru.ozon.app.android.widgets.selectlink.data.SelectLinkConfig;
import ru.ozon.app.android.widgets.selectlink.di.SelectLinkWidgetModule;
import ru.ozon.app.android.widgets.selectlink.di.SelectLinkWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.widgets.selectlink.presentation.SelectLinkViewMapper;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetResultConfigurator;
import ru.ozon.fintech.lib.FintechCoreLib;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.atoms.parsing.AtomParserModel;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes6.dex */
public final class DaggerIDaggerComponent {

    private static final class Factory implements IDaggerComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.injection.IDaggerComponent.Factory
        public IDaggerComponent create(Resources resources, ContextComponentDependencies contextComponentDependencies, IDaggerComponentDependencies iDaggerComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WhitelistComponentApi whitelistComponentApi, CacheComponentApi cacheComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, NotificationComponentApi notificationComponentApi, PushComponentApi pushComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AccountComponentApi accountComponentApi, AppLocaleComponentApi appLocaleComponentApi, LocationComponentApi locationComponentApi, CartComponentApi cartComponentApi, TabsComponentApi tabsComponentApi, WebComponentApi webComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, AddressComponentApi addressComponentApi, DebugMenuComponentApi debugMenuComponentApi, OzonDebugMenuComponentApi ozonDebugMenuComponentApi, ComposerComponentApi composerComponentApi, BarcodeCacheComponentApi barcodeCacheComponentApi, FreshComponentApi freshComponentApi, MediaUploadComponentApi mediaUploadComponentApi, FintechLibApi fintechLibApi, SearchComponentApi searchComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, OzonMapComponentApi ozonMapComponentApi, VideoCoverComponentApi videoCoverComponentApi, AdvertisingMessagingApi advertisingMessagingApi, MinifyLinkComponentApi minifyLinkComponentApi, RmsComponentApi rmsComponentApi, PdfFileComponentApi pdfFileComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoriteComponentApi favoriteComponentApi, CouponComponentApi couponComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CheckoutPrefetchApi checkoutPrefetchApi, CheckoutCommonComponentApi checkoutCommonComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, RestrictionsComponentApi restrictionsComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, GeoProviderComponentApi geoProviderComponentApi, MapCommonComponentApi mapCommonComponentApi, CdnVideoComponentApi cdnVideoComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, AuthComponentApi authComponentApi, SearchPrefetchApi searchPrefetchApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, FavoritesUIComponentApi favoritesUIComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi, PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, FreshNavigationComponentApi freshNavigationComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi, InterceptorPredicatesComponentApi interceptorPredicatesComponentApi, OrderShipmentComponentApi orderShipmentComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, DeeplinkRouteComponentApi deeplinkRouteComponentApi, MorkovskOnboardingComponentApi morkovskOnboardingComponentApi, TilesDomainComponentApi tilesDomainComponentApi, UgcRatingComponentApi ugcRatingComponentApi, UgcReviewFormComponentApi ugcReviewFormComponentApi, SelectionsCoreComponentApi selectionsCoreComponentApi, TravelStorageApi travelStorageApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, Limb2ComponentApi limb2ComponentApi, SentryApiComponent sentryApiComponent, AppOnboardingComponentApi appOnboardingComponentApi, CmlDomainComponentApi cmlDomainComponentApi, CmlDeliveryComponentApi cmlDeliveryComponentApi, NotificationStatusComponentApi notificationStatusComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi) {
            resources.getClass();
            contextComponentDependencies.getClass();
            iDaggerComponentDependencies.getClass();
            navigationComponentApi.getClass();
            storageComponentApi.getClass();
            analyticsComponentApi.getClass();
            networkComponentApi.getClass();
            networkOzonIdComponentApi.getClass();
            whitelistComponentApi.getClass();
            cacheComponentApi.getClass();
            firebaseAnalyticsComponentApi.getClass();
            notificationComponentApi.getClass();
            pushComponentApi.getClass();
            androidPlatformComponentApi.getClass();
            accountComponentApi.getClass();
            appLocaleComponentApi.getClass();
            locationComponentApi.getClass();
            cartComponentApi.getClass();
            tabsComponentApi.getClass();
            webComponentApi.getClass();
            videoComponentApi.getClass();
            cartServiceApi.getClass();
            cartAtomBinderComponentApi.getClass();
            addressComponentApi.getClass();
            debugMenuComponentApi.getClass();
            ozonDebugMenuComponentApi.getClass();
            composerComponentApi.getClass();
            barcodeCacheComponentApi.getClass();
            freshComponentApi.getClass();
            mediaUploadComponentApi.getClass();
            fintechLibApi.getClass();
            searchComponentApi.getClass();
            switchingButtonComponentApi.getClass();
            ozonMapComponentApi.getClass();
            videoCoverComponentApi.getClass();
            advertisingMessagingApi.getClass();
            minifyLinkComponentApi.getClass();
            rmsComponentApi.getClass();
            pdfFileComponentApi.getClass();
            favoriteCoreComponentApi.getClass();
            favoriteComponentApi.getClass();
            couponComponentApi.getClass();
            thirdPartyLibrariesConfigComponentApi.getClass();
            inAppUpdateComponentApi.getClass();
            actionComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            checkoutPrefetchApi.getClass();
            checkoutCommonComponentApi.getClass();
            checkoutPaymentComponentApi.getClass();
            restrictionsComponentApi.getClass();
            composerWidgetAsyncComponentApi.getClass();
            geoProviderComponentApi.getClass();
            mapCommonComponentApi.getClass();
            cdnVideoComponentApi.getClass();
            onboardingCheckerComponentApi.getClass();
            closeFlowWatcherComponentApi.getClass();
            coroutineDispatchersComponentApi.getClass();
            authComponentApi.getClass();
            searchPrefetchApi.getClass();
            cdnHostManagerComponentApi.getClass();
            favoritesUIComponentApi.getClass();
            favoritesDataComponentApi.getClass();
            imagesAnalyticsComponentApi.getClass();
            commonActionHandlersFactoryComponentApi.getClass();
            pdpScreenStateHolderComponentApi.getClass();
            startupTimeTrackerComponentApi.getClass();
            freshNavigationComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            legalsResultStateHolderComponentApi.getClass();
            statusEdoStateComponentApi.getClass();
            interceptorPredicatesComponentApi.getClass();
            orderShipmentComponentApi.getClass();
            pdpOfflineScreenComponentApi.getClass();
            travelPushOnboardingComponentApi.getClass();
            deeplinkRouteComponentApi.getClass();
            morkovskOnboardingComponentApi.getClass();
            tilesDomainComponentApi.getClass();
            ugcRatingComponentApi.getClass();
            ugcReviewFormComponentApi.getClass();
            selectionsCoreComponentApi.getClass();
            travelStorageApi.getClass();
            composerDebugMenuHostApiComponent.getClass();
            limb2ComponentApi.getClass();
            sentryApiComponent.getClass();
            appOnboardingComponentApi.getClass();
            cmlDomainComponentApi.getClass();
            cmlDeliveryComponentApi.getClass();
            notificationStatusComponentApi.getClass();
            storefrontCommonComponentApi.getClass();
            return new IDaggerComponentImpl(new AutoPickerExportModule(), new ActionInitializeModule(), new ComposerInterceptorFactoryModule(), new NamespaceModule(), new ReturnEditNavigationModule(), new HowToReturnGoodsNavigationModule(), new ReturnCreationNavigationModule(), new CmlOrdersNavigationModule(), new CmlDeliveryNavigationModule(), new MessengerFeatureModule(), new RemovePostModule(), new PikazonModule(), new CsmaButtonCommonModule(), new ScreenBrightnessChangerModule(), new ActivateCodeWidgetModule(), new SelectLinkWidgetModule(), new LogoutOnAllDevicesWidgetModule(), contextComponentDependencies, iDaggerComponentDependencies, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, whitelistComponentApi, cacheComponentApi, barcodeCacheComponentApi, firebaseAnalyticsComponentApi, notificationComponentApi, pushComponentApi, androidPlatformComponentApi, accountComponentApi, appLocaleComponentApi, locationComponentApi, cartComponentApi, tabsComponentApi, webComponentApi, videoComponentApi, cartServiceApi, cartAtomBinderComponentApi, addressComponentApi, debugMenuComponentApi, ozonDebugMenuComponentApi, composerComponentApi, mediaUploadComponentApi, advertisingMessagingApi, freshNavigationComponentApi, freshComponentApi, fintechLibApi, searchComponentApi, favoriteCoreComponentApi, favoriteComponentApi, switchingButtonComponentApi, videoCoverComponentApi, ozonMapComponentApi, minifyLinkComponentApi, rmsComponentApi, pdfFileComponentApi, couponComponentApi, thirdPartyLibrariesConfigComponentApi, inAppUpdateComponentApi, actionComponentApi, customActionHandlersComponentApi, checkoutPrefetchApi, restrictionsComponentApi, checkoutCommonComponentApi, checkoutPaymentComponentApi, composerWidgetAsyncComponentApi, geoProviderComponentApi, mapCommonComponentApi, cdnVideoComponentApi, authComponentApi, coroutineDispatchersComponentApi, cdnHostManagerComponentApi, closeFlowWatcherComponentApi, onboardingCheckerComponentApi, searchPrefetchApi, favoritesUIComponentApi, favoritesDataComponentApi, imagesAnalyticsComponentApi, commonActionHandlersFactoryComponentApi, pdpScreenStateHolderComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, legalsResultStateHolderComponentApi, statusEdoStateComponentApi, interceptorPredicatesComponentApi, orderShipmentComponentApi, pdpOfflineScreenComponentApi, travelPushOnboardingComponentApi, deeplinkRouteComponentApi, morkovskOnboardingComponentApi, ugcRatingComponentApi, tilesDomainComponentApi, ugcReviewFormComponentApi, selectionsCoreComponentApi, travelStorageApi, limb2ComponentApi, sentryApiComponent, appOnboardingComponentApi, cmlDomainComponentApi, cmlDeliveryComponentApi, notificationStatusComponentApi, storefrontCommonComponentApi, resources, 0);
        }

        private Factory() {
        }
    }

    private static final class IDaggerComponentImpl implements IDaggerComponent {
        private a<AbToolActionInitializer> abToolActionInitializerProvider;
        private a<AccessControlConfigurator> accessControlConfiguratorProvider;
        private a<AccessControlViewModel> accessControlViewModelProvider;
        private final AccountComponentApi accountComponentApi;
        private a<ActionButtonViewModel> actionButtonViewModelProvider;
        private a<ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel> actionButtonViewModelProvider2;
        private final ActionComponentApi actionComponentApi;
        private final ActionInitializeModule actionInitializeModule;
        private a<ActionsFooterLikeActionHandler> actionsFooterLikeActionHandlerProvider;
        private a<ActionsFooterViewModelImpl> actionsFooterViewModelImplProvider;
        private final ActivateCodeWidgetModule activateCodeWidgetModule;
        private a<ActivateHelpCertActionHandler> activateHelpCertActionHandlerProvider;
        private a<ActivityInitializerImpl> activityInitializerImplProvider;
        private a<ActualizeEmailActionHandler> actualizeEmailActionHandlerProvider;
        private a<AddCardActionHandler> addCardActionHandlerProvider;
        private a<AddLegalMobileConfigurator> addLegalMobileConfiguratorProvider;
        private a<AddNewCardConfigurator> addNewCardConfiguratorProvider;
        private a<AddToCartActionHandler> addToCartActionHandlerProvider;
        private a<AddToCartLoaderConfigurator> addToCartLoaderConfiguratorProvider;
        private a<AddToCartResponseActionWithActionHandler> addToCartResponseActionWithActionHandlerProvider;
        private a<AddToCartViewModel> addToCartViewModelProvider;
        private a<AddToCartWithRedirectActionHandler> addToCartWithRedirectActionHandlerProvider;
        private a<AddToComparisonViewModel> addToComparisonViewModelProvider;
        private a<AddToFavoriteActionHandler> addToFavoriteActionHandlerProvider;
        private a<AddUserCardConfigurator> addUserCardConfiguratorProvider;
        private a<AdditionRecycledViewPoolConfigurator> additionRecycledViewPoolConfiguratorProvider;
        private a<AdditionalServicesPageConfigurator> additionalServicesPageConfiguratorProvider;
        private a<AddressBookStateConfigurator> addressBookStateConfiguratorProvider;
        private final AddressComponentApi addressComponentApi;
        private a<AddressEditMapConfigurator> addressEditMapConfiguratorProvider;
        private a<AddressPartsInputCustomActionHandler> addressPartsInputCustomActionHandlerProvider;
        private a<AddressPartsInputPageConfigurator> addressPartsInputPageConfiguratorProvider;
        private a<AddressPopUpStateConfigurator> addressPopUpStateConfiguratorProvider;
        private a<AddressSearchConfigurator> addressSearchConfiguratorProvider;
        private a<AddressSearchSheetResultConfigurator> addressSearchSheetResultConfiguratorProvider;
        private a<AddressSelectorRefresherConfigurator> addressSelectorRefresherConfiguratorProvider;
        private a<AdultConfirmationViewModel> adultConfirmationViewModelProvider;
        private final AdvertisingMessagingApi advertisingMessagingApi;
        private a<AdvertisingMessagingInitializer> advertisingMessagingInitializerProvider;
        private a<AiRefreshActionHandlerImpl> aiRefreshActionHandlerImplProvider;
        private a<AllStepViewModel> allStepViewModelProvider;
        private a<AllToCartViewModel> allToCartViewModelProvider;
        private final AnalyticsComponentApi analyticsComponentApi;
        private a<AnalyticsInitializer> analyticsInitializerProvider;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private final AndroidPlatformComponentApi androidPlatformComponentApi;
        private a<AppInitializer> appInitializerProvider;
        private final AppLocaleComponentApi appLocaleComponentApi;
        private a<AppOnboardingConfigurator> appOnboardingConfiguratorProvider;
        private a<AppendProductsActionHandler> appendProductsActionHandlerProvider;
        private a<ApplicationLifecycleInitializer> applicationLifecycleInitializerProvider;
        private a<ApplicationLifecycleObserver> applicationLifecycleObserverProvider;
        private a<ApplySortingActionHandler> applySortingActionHandlerProvider;
        private a<ApplySortingViewModel> applySortingViewModelProvider;
        private a<AppsFlyerActionInitializer> appsFlyerActionInitializerProvider;
        private a<AsyncCartConfigurator> asyncCartConfiguratorProvider;
        private a<AtMostEmployeeUserDestinationInterceptorImpl> atMostEmployeeUserDestinationInterceptorImplProvider;
        private a<AtMostQaUserDestinationInterceptorImpl> atMostQaUserDestinationInterceptorImplProvider;
        private a<AtomActionInitializer> atomActionInitializerProvider;
        private a<AuthActionInitializer> authActionInitializerProvider;
        private a<AuthAnalyticsImpl> authAnalyticsImplProvider;
        private final AuthComponentApi authComponentApi;
        private a<AuthDestinationInterceptorImpl> authDestinationInterceptorImplProvider;
        private a<AuthOriginStorage> authOriginStorageProvider;
        private a<AuthPostDataConfigurator> authPostDataConfiguratorProvider;
        private a<AuthViewModel> authViewModelProvider;
        private final AutoPickerExportModule autoPickerExportModule;
        private a<AutopickerBottomSheetConfigurator> autopickerBottomSheetConfiguratorProvider;
        private a<AutopickerBottomSheetRepository> autopickerBottomSheetRepositoryProvider;
        private a<AutopickerResultConfigurator> autopickerResultConfiguratorProvider;
        private a<AvailableNativePaymentInterceptor> availableNativePaymentInterceptorProvider;
        private a<AvatarProfileConfigurator> avatarProfileConfiguratorProvider;
        private a<AvatarProfileViewModel> avatarProfileViewModelProvider;
        private a<B2bAcceptActActionHandler> b2bAcceptActActionHandlerProvider;
        private a<B2bAcceptActViewModel> b2bAcceptActViewModelProvider;
        private a<B2bDeleteConsigneeActionHandler> b2bDeleteConsigneeActionHandlerProvider;
        private a<B2bDeleteConsigneeViewModel> b2bDeleteConsigneeViewModelProvider;
        private a<B2bDownloadFileActionHandler> b2bDownloadFileActionHandlerProvider;
        private a<B2bDownloadFileViewModel> b2bDownloadFileViewModelProvider;
        private a<B2bRemoveLegalActionHandler> b2bRemoveLegalActionHandlerProvider;
        private a<B2bRemoveLegalViewModel> b2bRemoveLegalViewModelProvider;
        private a<B2bResetEdoVerificationActionHandler> b2bResetEdoVerificationActionHandlerProvider;
        private a<B2bResetEdoVerificationViewModel> b2bResetEdoVerificationViewModelProvider;
        private a<B2bSelectConsigneeActionHandler> b2bSelectConsigneeActionHandlerProvider;
        private a<B2bSelectConsigneeViewModel> b2bSelectConsigneeViewModelProvider;
        private final BarcodeCacheComponentApi barcodeCacheComponentApi;
        private a<BarcodeFullScreenOfflineFactory> barcodeFullScreenOfflineFactoryProvider;
        private a<ActivityInitializer> bindActivityInitializerProvider;
        private a<DataLayerInitializer> bindDataLayerInitializer$main_prodGoogleAllVendorsReleaseProvider;
        private a<NamedActionInitializerProvider> bindFintechLibActionInitializerProvider;
        private a<GooglePayManager> bindGooglePayManagerProvider;
        private a<LocalGoodsForCheckoutRepository> bindLocalGoodsForCheckoutRepository$checkout_prodGoogleAllVendorsReleaseProvider;
        private a<MoshiAdapterWarmer> bindMoshiAdapterWarmer$main_prodGoogleAllVendorsReleaseProvider;
        private a<IZ.a> bindOnBoardingDisplayDisableDeeplinkHandlerProvider;
        private a<ShareButtonRepository> bindShareButtonRepositoryProvider;
        private a<AuthAnalytics> bindsAuthAnalytics$main_prodGoogleAllVendorsReleaseProvider;
        private a<BiometricAuthViewModelImpl> biometricAuthViewModelImplProvider;
        private a<BiometryStateConfigurator> biometryStateConfiguratorProvider;
        private a<BloggerPersonalDataKeyboardConfigurator> bloggerPersonalDataKeyboardConfiguratorProvider;
        private a<BloggerRefreshChannelsPageConfigurator> bloggerRefreshChannelsPageConfiguratorProvider;
        private a<BloggerRefreshMainPageConfigurator> bloggerRefreshMainPageConfiguratorProvider;
        private a<BloggerRefreshPostsPageAfterFormSubmitConfigurator> bloggerRefreshPostsPageAfterFormSubmitConfiguratorProvider;
        private a<BottomNavigationScrollConfigurator> bottomNavigationScrollConfiguratorProvider;
        private a<BottomSheetFragmentsAppearanceUpdater> bottomSheetFragmentsAppearanceUpdaterProvider;
        private a<BottomSheetInsetsConfigurator> bottomSheetInsetsConfiguratorProvider;
        private a<BrightnessChangerConfigurator> brightnessChangerConfiguratorProvider;
        private a<BxNotificationPermissionProcessor> bxNotificationPermissionProcessorProvider;
        private a<CabinetBarcodeOnWearableDeviceConfigurator> cabinetBarcodeOnWearableDeviceConfiguratorProvider;
        private a<CacheComposerInterceptor> cacheComposerInterceptorProvider;
        private a<CalendarEventActionHandler> calendarEventActionHandlerProvider;
        private a<CallApiViewModelImpl> callApiViewModelImplProvider;
        private a<CallCourierActionHandler> callCourierActionHandlerProvider;
        private a<CancelOrderV3ActionHandler> cancelOrderV3ActionHandlerProvider;
        private a<CancelPostingsConfigurator> cancelPostingsConfiguratorProvider;
        private a<ru.ozon.app.android.returns.cancels.cancelpostingsv2.CancelPostingsConfigurator> cancelPostingsConfiguratorProvider2;
        private a<CardBindingConfigurator> cardBindingConfiguratorProvider;
        private a<CartActionsProcessorConfigurator> cartActionsProcessorConfiguratorProvider;
        private final CartAtomBinderComponentApi cartAtomBinderComponentApi;
        private final CartComponentApi cartComponentApi;
        private a<CartComposerInterceptor> cartComposerInterceptorProvider;
        private a<CartConfigurator> cartConfiguratorProvider;
        private a<CartKeyboardInsetConfigurator> cartKeyboardInsetConfiguratorProvider;
        private a<CartOnScreenEventHandlerConfigurator> cartOnScreenEventHandlerConfiguratorProvider;
        private a<CartPreCreateViewConfiguratorV2> cartPreCreateViewConfiguratorV2Provider;
        private a<CartPrefetchConfigurator> cartPrefetchConfiguratorProvider;
        private a<CartRefreshEventConfigurator> cartRefreshEventConfiguratorProvider;
        private a<CartRestoreItemConfigurator> cartRestoreItemConfiguratorProvider;
        private a<CartScreenStateConfigurator> cartScreenStateConfiguratorProvider;
        private final CartServiceApi cartServiceApi;
        private a<CartSharedViewPoolSizeSetterConfigurator> cartSharedViewPoolSizeSetterConfiguratorProvider;
        private a<CartSplitSwipeConfigurator> cartSplitSwipeConfiguratorProvider;
        private a<CatalogFavoritesConfigurator> catalogFavoritesConfiguratorProvider;
        private a<CategoryMainPageFreshConfigurator> categoryMainPageFreshConfiguratorProvider;
        private a<CategoryMainPageFreshPreCreationConfigurator> categoryMainPageFreshPreCreationConfiguratorProvider;
        private a<CategoryPageConfigurator> categoryPageConfiguratorProvider;
        private a<CategoryPreCreationConfigurator> categoryPreCreationConfiguratorProvider;
        private final CdnHostManagerComponentApi cdnHostManagerComponentApi;
        private a<ChangeItemQuantityActionHandler> changeItemQuantityActionHandlerProvider;
        private a<ChangePaymentActionHandler> changePaymentActionHandlerProvider;
        private a<ChangePaymentConfigurator> changePaymentConfiguratorProvider;
        private a<ChangePaymentMethodConfigurator> changePaymentMethodConfiguratorProvider;
        private a<ChangePaymentViewModel> changePaymentViewModelProvider;
        private a<CheckFastPayConfigurator> checkFastPayConfiguratorProvider;
        private a<CheckFastPayViewModel> checkFastPayViewModelProvider;
        private a<CheckoutClearCacheConfigurator> checkoutClearCacheConfiguratorProvider;
        private final CheckoutCommonComponentApi checkoutCommonComponentApi;
        private final CheckoutPaymentComponentApi checkoutPaymentComponentApi;
        private a<CheckoutPreCreationConfigurator> checkoutPreCreationConfiguratorProvider;
        private final CheckoutPrefetchApi checkoutPrefetchApi;
        private a<CheckoutRefreshConfigurator> checkoutRefreshConfiguratorProvider;
        private a<CheckoutRefreshPageConfigurator> checkoutRefreshPageConfiguratorProvider;
        private a<CheckoutRequestInterceptor> checkoutRequestInterceptorProvider;
        private a<ClassifiedCallActionHandler> classifiedCallActionHandlerProvider;
        private a<ClassifiedOpenDeleteListingModalActionHandler> classifiedOpenDeleteListingModalActionHandlerProvider;
        private a<CleanCustomBundleStateActionInitializer> cleanCustomBundleStateActionInitializerProvider;
        private a<ClearReferrerConfigurator> clearReferrerConfiguratorProvider;
        private a<ClickOrderConfigurator> clickOrderConfiguratorProvider;
        private a<CloseFlowActionHandler> closeFlowActionHandlerProvider;
        private a<CloseFlowAndActionDoActionHandler> closeFlowAndActionDoActionHandlerProvider;
        private a<CloseMiniappActionHandler> closeMiniappActionHandlerProvider;
        private a<CmlComposerActionWithActionHandler> cmlComposerActionWithActionHandlerProvider;
        private final CmlDeliveryNavigationModule cmlDeliveryNavigationModule;
        private final CmlDomainComponentApi cmlDomainComponentApi;
        private a<CmlEventsHandlerConfigurator> cmlEventsHandlerConfiguratorProvider;
        private a<CmlOrderActionHandler> cmlOrderActionHandlerProvider;
        private final CmlOrdersNavigationModule cmlOrdersNavigationModule;
        private a<CmlUpdatePassportActionHandler> cmlUpdatePassportActionHandlerProvider;
        private a<CmlValidatePassportActionHandler> cmlValidatePassportActionHandlerProvider;
        private a<CommentActionHandler> commentActionHandlerProvider;
        private a<CommentFooterViewModel> commentFooterViewModelProvider;
        private a<CommentModalActionHandler> commentModalActionHandlerProvider;
        private a<CommentsListConfigurator> commentsListConfiguratorProvider;
        private final CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi;
        private a<ComparisonConfigurator> comparisonConfiguratorProvider;
        private a<ComparisonRefreshViewModel> comparisonRefreshViewModelProvider;
        private a<ComponentUploadPhotosViewModelImpl> componentUploadPhotosViewModelImplProvider;
        private a<ComposerActionAndRedirectActionHandler> composerActionAndRedirectActionHandlerProvider;
        private a<ComposerActionAndRedirectConfigurator> composerActionAndRedirectConfiguratorProvider;
        private a<ComposerActionAndRedirectViewModel> composerActionAndRedirectViewModelProvider;
        private a<ComposerActionInitializer> composerActionInitializerProvider;
        private a<ComposerActionWithActionHandler> composerActionWithActionHandlerProvider;
        private a<ComposerActionWithRefreshCustomActionHandler> composerActionWithRefreshCustomActionHandlerProvider;
        private a<ComposerActionWithSaveScrollActionHandler> composerActionWithSaveScrollActionHandlerProvider;
        private a<ComposerCacheInvalidatorInitializer> composerCacheInvalidatorInitializerProvider;
        private final ComposerComponentApi composerComponentApi;
        private final ComposerInterceptorFactoryModule composerInterceptorFactoryModule;
        private a<ComposerLifecycleConfigurator> composerLifecycleConfiguratorProvider;
        private a<ComposerLoggingActionsInitializer> composerLoggingActionsInitializerProvider;
        private a<CompositeCustomActionHandler> compositeCustomActionHandlerProvider;
        private a<ConcreteStepViewModel> concreteStepViewModelProvider;
        private a<ConfiguratorsActionInitializer> configuratorsActionInitializerProvider;
        private a<ConfirmDateButtonViewModel> confirmDateButtonViewModelProvider;
        private a<ConfirmDeleteOtpViewModelImpl> confirmDeleteOtpViewModelImplProvider;
        private a<ConfirmDeleteResultConfigurator> confirmDeleteResultConfiguratorProvider;
        private a<ru.ozon.app.android.checkoutgeo.checkout.configurators.ConfirmDeleteResultConfigurator> confirmDeleteResultConfiguratorProvider2;
        private a<ConfirmDeliveryDateActionButtonsConfigurator> confirmDeliveryDateActionButtonsConfiguratorProvider;
        private a<ConfirmEmailCustomActionHandler> confirmEmailCustomActionHandlerProvider;
        private a<ConsigneeAddressSearchConfigurator> consigneeAddressSearchConfiguratorProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<CopyAndDismissActionHandler> copyAndDismissActionHandlerProvider;
        private a<CopyTextActionHandler> copyTextActionHandlerProvider;
        private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
        private final CouponComponentApi couponComponentApi;
        private a<CouponViewModelImpl> couponViewModelImplProvider;
        private a<CourierOnMapCallActionHandler> courierOnMapCallActionHandlerProvider;
        private a<CreateAndPayConfigurator> createAndPayConfiguratorProvider;
        private a<CreateAndPayViewModel> createAndPayViewModelProvider;
        private a<CreateFavoritesListAsyncConfigurator> createFavoritesListAsyncConfiguratorProvider;
        private a<CreateFavoritesListConfigurator> createFavoritesListConfiguratorProvider;
        private a<CreateOrderActionHandler> createOrderActionHandlerProvider;
        private a<CreateOrderV2ActionHandler> createOrderV2ActionHandlerProvider;
        private a<CreatePaymentActionHandler> createPaymentActionHandlerProvider;
        private a<CreateServiceActionHandler> createServiceActionHandlerProvider;
        private a<CreateServiceViewModel> createServiceViewModelProvider;
        private a<CreateShoppingListAsyncConfigurator> createShoppingListAsyncConfiguratorProvider;
        private a<CreateShoppingListConfigurator> createShoppingListConfiguratorProvider;
        private a<CreateShoppingListInputInsetsConfigurator> createShoppingListInputInsetsConfiguratorProvider;
        private final CsmaButtonCommonModule csmaButtonCommonModule;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private a<DailyRewardsConfigurator> dailyRewardsConfiguratorProvider;
        private a<DarkThemeInitializer> darkThemeInitializerProvider;
        private a<DataLayerInitializerImpl> dataLayerInitializerImplProvider;
        private a<DatePickerViewModel> datePickerViewModelProvider;
        private final DebugMenuComponentApi debugMenuComponentApi;
        private final DeeplinkRouteComponentApi deeplinkRouteComponentApi;
        private a<DefaultInitialWidgetsProvider> defaultInitialWidgetsProvider;
        private a<DeleteAccountButtonViewModelImpl> deleteAccountButtonViewModelImplProvider;
        private a<DeleteAccountDescriptionStickyViewModelImpl> deleteAccountDescriptionStickyViewModelImplProvider;
        private a<DeleteAiConversationActionHandlerImpl> deleteAiConversationActionHandlerImplProvider;
        private a<DeleteFavoritesListAsyncConfigurator> deleteFavoritesListAsyncConfiguratorProvider;
        private a<DeleteFavoritesListConfigurator> deleteFavoritesListConfiguratorProvider;
        private a<DeleteSearchInsightCustomActionHandlerImpl> deleteSearchInsightCustomActionHandlerImplProvider;
        private a<DeleteWishlistViewModel> deleteWishlistViewModelProvider;
        private a<DeliveryDetailsPageConfigurator> deliveryDetailsPageConfiguratorProvider;
        private a<DeliveryOrderDoneConfigurator> deliveryOrderDoneConfiguratorProvider;
        private a<DialogSearchPageLoadConfigurator> dialogSearchPageLoadConfiguratorProvider;
        private a<DiscountCodeViewModel> discountCodeViewModelProvider;
        private a<DislikeRecommendationActionHandler> dislikeRecommendationActionHandlerProvider;
        private a<DismissAndPopAndRefreshActionHandler> dismissAndPopAndRefreshActionHandlerProvider;
        private a<DismissAndRefreshMapActionHandler> dismissAndRefreshMapActionHandlerProvider;
        private a<DismissAndScrollByScrollWidgetKeyActionHandler> dismissAndScrollByScrollWidgetKeyActionHandlerProvider;
        private a<DismissOnAddressUpdateConfigurator> dismissOnAddressUpdateConfiguratorProvider;
        private a<DismissOrCloseMiniappActionHandler> dismissOrCloseMiniappActionHandlerProvider;
        private a<DismissRefreshAndScrollActionHandler> dismissRefreshAndScrollActionHandlerProvider;
        private a<DocsDeliveryFormViewModelImpl> docsDeliveryFormViewModelImplProvider;
        private a<DoubleDismissAndRedirectActionHandler> doubleDismissAndRedirectActionHandlerProvider;
        private a<DoubleDismissAndRefreshActionHandler> doubleDismissAndRefreshActionHandlerProvider;
        private a<DownloadPDFActionHandler> downloadPDFActionHandlerProvider;
        private a<DynamicShortcutsInitializer> dynamicShortcutsInitializerProvider;
        private a<DynamicTeenModeConfigurator> dynamicTeenModeConfiguratorProvider;
        private a<EdgeToEdgeConfigurator> edgeToEdgeConfiguratorProvider;
        private a<EditListFavoriteAsyncConfigurator> editListFavoriteAsyncConfiguratorProvider;
        private a<EditListFavoriteConfigurator> editListFavoriteConfiguratorProvider;
        private a<EditOrderConfigurator> editOrderConfiguratorProvider;
        private a<EditUserFullNameViewModelImpl> editUserFullNameViewModelImplProvider;
        private a<EmptyInitialWidgetProvider> emptyInitialWidgetProvider;
        private a<EmptyScreenWithBarcodeFactory> emptyScreenWithBarcodeFactoryProvider;
        private a<EnvironmentInitializer> environmentInitializerProvider;
        private a<MessengerActionHandlerImpl.Factory> factoryProvider;
        private a<FailedExternalPageRetryNotificationConfigurator> failedExternalPageRetryNotificationConfiguratorProvider;
        private a<FamilyAccountConfigurator> familyAccountConfiguratorProvider;
        private a<FamilyCartConfigurator> familyCartConfiguratorProvider;
        private a<FamilyCartOnScreenEventHandlerConfigurator> familyCartOnScreenEventHandlerConfiguratorProvider;
        private a<FamilyCartRefreshEventConfigurator> familyCartRefreshEventConfiguratorProvider;
        private final FavoriteComponentApi favoriteComponentApi;
        private final FavoriteCoreComponentApi favoriteCoreComponentApi;
        private a<FavoriteDeleteListActionHandler> favoriteDeleteListActionHandlerProvider;
        private a<FavoriteListAddActionHandlerImpl> favoriteListAddActionHandlerImplProvider;
        private a<FavoriteListRemoveActionHandler> favoriteListRemoveActionHandlerProvider;
        private a<FavoriteShareListActionHandler> favoriteShareListActionHandlerProvider;
        private a<FavoriteToggleProductButtonViewModel> favoriteToggleProductButtonViewModelProvider;
        private a<FavoriteWishlistRemoveActionHandler> favoriteWishlistRemoveActionHandlerProvider;
        private final FavoritesDataComponentApi favoritesDataComponentApi;
        private a<FavoritesDeeplinkHandlerDelegate> favoritesDeeplinkHandlerDelegateProvider;
        private a<FavoritesMediaPickerConfigurator> favoritesMediaPickerConfiguratorProvider;
        private a<FavoritesSellersScrollToUpConfigurator> favoritesSellersScrollToUpConfiguratorProvider;
        private final FavoritesUIComponentApi favoritesUIComponentApi;
        private a<FeedbackTilePreCreationConfigurator> feedbackTilePreCreationConfiguratorProvider;
        private a<FetchCancelReasonsActionHandler> fetchCancelReasonsActionHandlerProvider;
        private a<FilterSharedViewModel> filterSharedViewModelProvider;
        private a<FilterValuesModalConfigurator> filterValuesModalConfiguratorProvider;
        private a<FiltersKeyboardInsetConfigurator> filtersKeyboardInsetConfiguratorProvider;
        private a<FintechLibActionInitializer> fintechLibActionInitializerProvider;
        private final FintechLibApi fintechLibApi;
        private a<FirstRequestMapConfigurator> firstRequestMapConfiguratorProvider;
        private a<FirstRequestSetupConfigurator> firstRequestSetupConfiguratorProvider;
        private a<FlashCallConfigurator> flashCallConfiguratorProvider;
        private a<FormPageViewModelImpl> formPageViewModelImplProvider;
        private a<FragmentsAppearanceUpdater> fragmentsAppearanceUpdaterProvider;
        private a<FragmentsLifecycleHandler> fragmentsLifecycleHandlerProvider;
        private a<FreshAISharedViewModel> freshAISharedViewModelProvider;
        private a<FreshCartConfigurator> freshCartConfiguratorProvider;
        private final FreshComponentApi freshComponentApi;
        private a<FreshLiveActivityInitializer> freshLiveActivityInitializerProvider;
        private final FreshNavigationComponentApi freshNavigationComponentApi;
        private a<FreshPostRefreshWithScrollActionHandler> freshPostRefreshWithScrollActionHandlerProvider;
        private a<FreshRemoveCartItemsActionHandler> freshRemoveCartItemsActionHandlerProvider;
        private a<FreshRemoveCartTileActionHandler> freshRemoveCartTileActionHandlerProvider;
        private a<FullScreenConfigurator> fullScreenConfiguratorProvider;
        private a<FullScreenInsetsConfigurator> fullScreenInsetsConfiguratorProvider;
        private a<GalleryLauncherConfigurator> galleryLauncherConfiguratorProvider;
        private a<GalleryV3ViewModelImpl> galleryV3ViewModelImplProvider;
        private a<AddressUpdateManager> getAddressManagerProvider;
        private a<CacheErrorInterceptor> getCacheErrorInterceptorProvider;
        private a<CartAtomBinder> getCartAtomBinderProvider;
        private a<Context> getContextProvider;
        private a<GetDirectionsActionHandler> getDirectionsActionHandlerProvider;
        private a<ExtraHeadersDataSource> getExtraHeadersDataSourceProvider;
        private a<FeatureChecker> getFeatureCheckerProvider;
        private a<FileDownloaderViewModel> getFileDownloaderViewModelProvider;
        private a<FintechCoreLib> getFintechCoreLibBankProvider;
        private a<FintechCoreLib> getFintechCoreLibPayProvider;
        private a<FintechCoreLib> getFintechCoreLibRkoProvider;
        private a<Ob0.a> getOzonIdAppApiProvider;
        private a<OzonIdCookieEvents> getOzonIdCookieEventsProvider;
        private a<OzonPushManager> getOzonPushManagerProvider;
        private a<GetRecShelfActionHandler> getRecShelfActionHandlerProvider;
        private a<RestrictRedirectsNetworkInterceptor> getRestrictRedirectsNetworkInterceptorProvider;
        private a<GoCheckoutActionHandler> goCheckoutActionHandlerProvider;
        private a<GooglePayManagerImpl> googlePayManagerImplProvider;
        private a<HandlersInhibitor> handlersInhibitorProvider;
        private a<HapticsInitializer> hapticsInitializerProvider;
        private a<HideTabBarOnScrollViewModel> hideTabBarOnScrollViewModelProvider;
        private a<HideToolbarConfigurator> hideToolbarConfiguratorProvider;
        private a<HomeBarcodeOnWearableDeviceConfigurator> homeBarcodeOnWearableDeviceConfiguratorProvider;
        private a<HomeCreditActionHandler> homeCreditActionHandlerProvider;
        private a<HomePageConfigurator> homePageConfiguratorProvider;
        private a<HomePageViewModelImpl> homePageViewModelImplProvider;
        private a<HotelsBookModalPageConfigurator> hotelsBookModalPageConfiguratorProvider;
        private a<HotelsBookPageStorageInitializerConfigurator> hotelsBookPageStorageInitializerConfiguratorProvider;
        private a<HotelsBookSuccessValidationActionHandler> hotelsBookSuccessValidationActionHandlerProvider;
        private a<HotelsBookTotalRefreshConfigurator> hotelsBookTotalRefreshConfiguratorProvider;
        private a<HotelsGalleryFullConfigurator> hotelsGalleryFullConfiguratorProvider;
        private a<HotelsMapInfoConfigurator> hotelsMapInfoConfiguratorProvider;
        private final HowToReturnGoodsNavigationModule howToReturnGoodsNavigationModule;
        private a<HttpLoggingActionIntializer> httpLoggingActionIntializerProvider;
        private final IDaggerComponentDependencies iDaggerComponentDependencies;
        private final IDaggerComponentImpl iDaggerComponentImpl;
        private a<IconChooserModalPageConfigurator> iconChooserModalPageConfiguratorProvider;
        private a<IconChooserRootPageConfigurator> iconChooserRootPageConfiguratorProvider;
        private final ImagesAnalyticsComponentApi imagesAnalyticsComponentApi;
        private final InAppUpdateComponentApi inAppUpdateComponentApi;
        private a<InitCheckoutRequestConfigurator> initCheckoutRequestConfiguratorProvider;
        private a<InputCurtainViewModel> inputCurtainViewModelProvider;
        private a<InstantLoginActionHandlerImpl> instantLoginActionHandlerImplProvider;
        private final InterceptorPredicatesComponentApi interceptorPredicatesComponentApi;
        private a<JetpackComposeInitializer> jetpackComposeInitializerProvider;
        private a<JodaActionInitializer> jodaActionInitializerProvider;
        private a<LKOrderTrackingV4UpdaterConfigurator> lKOrderTrackingV4UpdaterConfiguratorProvider;
        private a<LandingLimitViewModelImpl> landingLimitViewModelImplProvider;
        private a<LastLocationInitializer> lastLocationInitializerProvider;
        private a<LeakCanaryInitializer> leakCanaryInitializerProvider;
        private a<LegalDetailsFileSelectConfigurator> legalDetailsFileSelectConfiguratorProvider;
        private a<LegalsFlowConfigurator> legalsFlowConfiguratorProvider;
        private final LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi;
        private a<LightStatusBarConfigurator> lightStatusBarConfiguratorProvider;
        private final Limb2ComponentApi limb2ComponentApi;
        private a<LimbActionInitializer> limbActionInitializerProvider;
        private a<LinkFastPayConfigurator> linkFastPayConfiguratorProvider;
        private a<LinkFastPayViewModel> linkFastPayViewModelProvider;
        private a<ListAccessChangedConfigurator> listAccessChangedConfiguratorProvider;
        private a<ListReviewConfigurator> listReviewConfiguratorProvider;
        private a<ListReviewSortsViewModel> listReviewSortsViewModelProvider;
        private a<LoaderConfigurator> loaderConfiguratorProvider;
        private a<LocalGoodsForCheckoutRepositoryImpl> localGoodsForCheckoutRepositoryImplProvider;
        private a<LocalizationActivityCallback> localizationActivityCallbackProvider;
        private final LocationComponentApi locationComponentApi;
        private a<LoggerInitializer> loggerInitializerProvider;
        private a<LogoutActionHandlerImpl> logoutActionHandlerImplProvider;
        private a<LogoutOnAllDevicesViewModelImpl> logoutOnAllDevicesViewModelImplProvider;
        private final LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule;
        private a<LongPollingPageComposerInterceptor> longPollingPageComposerInterceptorProvider;
        private a<LotteryForceShowOnboardingActionHandler> lotteryForceShowOnboardingActionHandlerProvider;
        private a<LotteryOpenPurchaseTicketPageActionHandler> lotteryOpenPurchaseTicketPageActionHandlerProvider;
        private a<MainDrawMajorScreenProgressUpdateActionHandler> mainDrawMajorScreenProgressUpdateActionHandlerProvider;
        private a<MainFilterConfigurator> mainFilterConfiguratorProvider;
        private a<MainOrderTrackingV4UpdaterConfigurator> mainOrderTrackingV4UpdaterConfiguratorProvider;
        private a<MainTabRedirectOnBackPressedConfigurator> mainTabRedirectOnBackPressedConfiguratorProvider;
        private a<MallFilterNotificationActionHandler> mallFilterNotificationActionHandlerProvider;
        private a<MapInfoDeeplinkRouteConfigurator> mapInfoDeeplinkRouteConfiguratorProvider;
        private a<MapInfoDeeplinkRouteViewModel> mapInfoDeeplinkRouteViewModelProvider;
        private a<MapsActionInitializer> mapsActionInitializerProvider;
        private a<MediaPickerConfigurator> mediaPickerConfiguratorProvider;
        private final MediaUploadComponentApi mediaUploadComponentApi;
        private a<MessengerFeatureActionInitializer> messengerFeatureActionInitializerProvider;
        private final MessengerFeatureModule messengerFeatureModule;
        private final MinifyLinkComponentApi minifyLinkComponentApi;
        private a<MinifyLinkViewModel> minifyLinkViewModelProvider;
        private a<ModalParentRefreshActionHandler> modalParentRefreshActionHandlerProvider;
        private a<ModalParentRefreshConfigurator> modalParentRefreshConfiguratorProvider;
        private a<ModalParentRefreshSharedViewModel> modalParentRefreshSharedViewModelProvider;
        private a<ModifySearchUrlViewModel> modifySearchUrlViewModelProvider;
        private a<MorkovskModalMenuConfigurator> morkovskModalMenuConfiguratorProvider;
        private final MorkovskOnboardingComponentApi morkovskOnboardingComponentApi;
        private a<MorkovskOnboardingConfigurator> morkovskOnboardingConfiguratorProvider;
        private a<MorkovskWelcomeScreenConfigurator> morkovskWelcomeScreenConfiguratorProvider;
        private a<MoshiAdapterWarmerImpl> moshiAdapterWarmerImplProvider;
        private a<MoveCartItemsInterceptor> moveCartItemsInterceptorProvider;
        private final NamespaceModule namespaceModule;
        private a<NativePaymentInitializer> nativePaymentInitializerProvider;
        private a<NavTitleMapper> navTitleMapperProvider;
        private final NavigationComponentApi navigationComponentApi;
        private a<NestedScrollingDisabledConfigurator> nestedScrollingDisabledConfiguratorProvider;
        private a<ru.ozon.app.android.returns.cancels.modalConstructor.presentation.configurators.NestedScrollingDisabledConfigurator> nestedScrollingDisabledConfiguratorProvider2;
        private final NetworkComponentApi networkComponentApi;
        private final NetworkOzonIdComponentApi networkOzonIdComponentApi;
        private a<NewCredentialsConfigurator> newCredentialsConfiguratorProvider;
        private a<NewCredentialsViewModelImpl> newCredentialsViewModelImplProvider;
        private final NotificationComponentApi notificationComponentApi;
        private a<NotificationConfigurator> notificationConfiguratorProvider;
        private final NotificationStatusComponentApi notificationStatusComponentApi;
        private a<NotificationsSettingsBottomSheetConfigurator> notificationsSettingsBottomSheetConfiguratorProvider;
        private a<NotificationsSettingsConfigurator> notificationsSettingsConfiguratorProvider;
        private a<NotificationsSettingsStateConfigurator> notificationsSettingsStateConfiguratorProvider;
        private a<OTPPeriodFormatterBuilder> oTPPeriodFormatterBuilderProvider;
        private a<OTPWidgetViewModelImpl> oTPWidgetViewModelImplProvider;
        private a<OnBoardingDisplayDisableDeeplinkHandler> onBoardingDisplayDisableDeeplinkHandlerProvider;
        private a<OnFavoriteEntityChangedConfigurator> onFavoriteEntityChangedConfiguratorProvider;
        private a<OnboardingActionHandler> onboardingActionHandlerProvider;
        private final OnboardingCheckerComponentApi onboardingCheckerComponentApi;
        private a<OpenApplicationStoreActionHandler> openApplicationStoreActionHandlerProvider;
        private a<OpenDeeplinkForRefreshResultActionHandler> openDeeplinkForRefreshResultActionHandlerProvider;
        private a<OpenNotificationSettingsActionHandler> openNotificationSettingsActionHandlerProvider;
        private a<OptionsSelectorSheetResultConfigurator> optionsSelectorSheetResultConfiguratorProvider;
        private a<OrderCacheConfigurator> orderCacheConfiguratorProvider;
        private a<OrderCacheStateInterceptor> orderCacheStateInterceptorProvider;
        private a<OrderChangeActionButtonsConfigurator> orderChangeActionButtonsConfiguratorProvider;
        private a<OrderDetailChangeHandlerViewModel> orderDetailChangeHandlerViewModelProvider;
        private a<OrderDetailsChangeHandlerConfigurator> orderDetailsChangeHandlerConfiguratorProvider;
        private a<OrderDetailsPayConfigurator> orderDetailsPayConfiguratorProvider;
        private a<OrderDoneConfigurator> orderDoneConfiguratorProvider;
        private a<OrderDoneLiteInfoConfigurator> orderDoneLiteInfoConfiguratorProvider;
        private a<OrderDoneRefreshCartConfigurator> orderDoneRefreshCartConfiguratorProvider;
        private a<OrderFiltersConfigurator> orderFiltersConfiguratorProvider;
        private a<OrderGalleryConfigurator> orderGalleryConfiguratorProvider;
        private a<OrderListChangeStateViewModel> orderListChangeStateViewModelProvider;
        private a<OrderPayConfigurator> orderPayConfiguratorProvider;
        private final OrderShipmentComponentApi orderShipmentComponentApi;
        private a<OrderTrackingV4ViewModel> orderTrackingV4ViewModelProvider;
        private a<OrientationLockConfigurator> orientationLockConfiguratorProvider;
        private final OzonDebugMenuComponentApi ozonDebugMenuComponentApi;
        private a<OzonDebugMenuSdkInitializer> ozonDebugMenuSdkInitializerProvider;
        private a<OzonGalleryInitializer> ozonGalleryInitializerProvider;
        private a<OzonIdAccountInitializer> ozonIdAccountInitializerProvider;
        private a<OzonIdActivityCallback> ozonIdActivityCallbackProvider;
        private a<OzonInAppUpdateInitializer> ozonInAppUpdateInitializerProvider;
        private a<ParcelPhotoAddConfigurator> parcelPhotoAddConfiguratorProvider;
        private a<PartPaymentSummaryPageConfigurator> partPaymentSummaryPageConfiguratorProvider;
        private final PdfFileComponentApi pdfFileComponentApi;
        private a<PdpConfigurator> pdpConfiguratorProvider;
        private a<PdpGalleryFullViewConfigurator> pdpGalleryFullViewConfiguratorProvider;
        private final PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi;
        private a<PdpOfflineScreenFactory> pdpOfflineScreenFactoryProvider;
        private final PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi;
        private a<PerformTwoActionsHandler> performTwoActionsHandlerProvider;
        private a<PhotoPickerConfigurator> photoPickerConfiguratorProvider;
        private a<PickImageActionHandler> pickImageActionHandlerProvider;
        private a<PickerRefreshLinkStore> pickerRefreshLinkStoreProvider;
        private a<PikazonActionInitializer> pikazonActionInitializerProvider;
        private final PikazonModule pikazonModule;
        private a<PikazonUserAgentInterceptor> pikazonUserAgentInterceptorProvider;
        private a<PinStatusFavoritesListAsyncConfigurator> pinStatusFavoritesListAsyncConfiguratorProvider;
        private a<PinStatusFavoritesListConfigurator> pinStatusFavoritesListConfiguratorProvider;
        private a<PlayStoriesV3Configurator> playStoriesV3ConfiguratorProvider;
        private a<PlayStoriesV3ViewModel> playStoriesV3ViewModelProvider;
        private a<PopActionHandler> popActionHandlerProvider;
        private a<PopAndRedirectActionHandler> popAndRedirectActionHandlerProvider;
        private a<ru.ozon.app.android.fresh.common.domain.actionHandlers.PopAndRedirectActionHandler> popAndRedirectActionHandlerProvider2;
        private a<PopAndRefreshActionHandler> popAndRefreshActionHandlerProvider;
        private a<PopBackStackActionHandler> popBackStackActionHandlerProvider;
        private a<PopRouteAndRefreshActionHandler> popRouteAndRefreshActionHandlerProvider;
        private a<PostRefreshWithScrollActionHandler> postRefreshWithScrollActionHandlerProvider;
        private a<PreCreateWidgetsFacade> preCreateWidgetsFacadeProvider;
        private a<PrefetchManagerActionInitializer> prefetchManagerActionInitializerProvider;
        private a<PreloadImagesConfigurator> preloadImagesConfiguratorProvider;
        private a<PrizesConfigurator> prizesConfiguratorProvider;
        private a<ProductPickerSearchParamsConfigurator> productPickerSearchParamsConfiguratorProvider;
        private a<ProfileAvatarConfigurator> profileAvatarConfiguratorProvider;
        private a<ProfileInfoConfigurator> profileInfoConfiguratorProvider;
        private a<PromoPushEnableViewModel> promoPushEnableViewModelProvider;
        private a<PromoReviewRefreshConfigurator> promoReviewRefreshConfiguratorProvider;
        private a<PromptStatusViewModel> promptStatusViewModelProvider;
        private a<ru.ozon.android.messenger.api.a> provideAIMessengerFeatureProvider;
        private a<ComposerActionsExecutor> provideApiProvider;
        private a<ru.ozon.android.messenger.api.a> provideBloggerFeatureProvider;
        private a<ChangePaymentApi> provideChangePaymentApiProvider;
        private a<ComposerActionApi> provideComposerActionApiProvider;
        private a<ComposerCronetMetricsListener> provideCronetMetricListenerProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsReleaseProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlerSetProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlersProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsReleaseProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsReleaseProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsReleaseProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlersSet$faq_prodGoogleAllVendorsReleaseProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlersSet$geo_prodGoogleAllVendorsReleaseProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlersSet$miniapp_prodGoogleAllVendorsReleaseProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlersSet$payment_prodGoogleAllVendorsReleaseProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlersSet$regulardraw_prodGoogleAllVendorsReleaseProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider10;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider11;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider12;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider13;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider14;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider15;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider16;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider17;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider18;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider19;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider2;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider20;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider21;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider22;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider23;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider24;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider25;
        private a<IZ.a> provideDeeplinkHandlersSetProvider26;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider27;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider28;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider29;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider3;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider30;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider31;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider4;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider5;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider6;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider7;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider8;
        private a<Set<IZ.a>> provideDeeplinkHandlersSetProvider9;
        private a<FormPageApiDataSource> provideFormPageApiDataSourceProvider;
        private a<KeepActivityHandler> provideKeepDeeplinkActivityOnExternalDeeplinkProvider;
        private a<d> provideMarkWonProvider;
        private a<ru.ozon.android.messenger.api.a> provideMessengerFeatureProvider;
        private a<E> providePikazonClientProvider;
        private a<PikazonEventListenerFactory> providePikazonEventListenerFactoryProvider;
        private a<SearchCacheTrackerApi> provideSearchCacheTrackerApiProvider;
        private a<TravelCommonActionResultApi> provideTravelCommonActionResultApiProvider;
        private a<CronetConfig> providerCronetConfigProvider;
        private a<ShareButtonApi> providesShareButtonApiProvider;
        private final PushComponentApi pushComponentApi;
        private a<PushInitializer> pushInitializerProvider;
        private a<PushRouteAndRefreshActionHandler> pushRouteAndRefreshActionHandlerProvider;
        private a<QuestionsConfigurator> questionsConfiguratorProvider;
        private a<RateInAppActionHandler> rateInAppActionHandlerProvider;
        private a<RecActsDeclinerFileSelectConfigurator> recActsDeclinerFileSelectConfiguratorProvider;
        private a<RedirectWithPrefetchActionHandler> redirectWithPrefetchActionHandlerProvider;
        private a<RefreshAfterDismissAndPopPageConfigurator> refreshAfterDismissAndPopPageConfiguratorProvider;
        private a<RefreshAfterTimeChangeConfigurator> refreshAfterTimeChangeConfiguratorProvider;
        private a<RefreshAnchorScreenConfigurator> refreshAnchorScreenConfiguratorProvider;
        private a<RefreshByAdultStateConfigurator> refreshByAdultStateConfiguratorProvider;
        private a<RefreshByCurrencyConfigurator> refreshByCurrencyConfiguratorProvider;
        private a<RefreshByFragmentResultPageConfigurator> refreshByFragmentResultPageConfiguratorProvider;
        private a<RefreshByLocaleConfigurator> refreshByLocaleConfiguratorProvider;
        private a<RefreshByLocationConfigurator> refreshByLocationConfiguratorProvider;
        private a<RefreshByOrderChangeConfigurator> refreshByOrderChangeConfiguratorProvider;
        private a<RefreshByResultConfigurator> refreshByResultConfiguratorProvider;
        private a<RefreshByStatusEdoConfigurator> refreshByStatusEdoConfiguratorProvider;
        private a<RefreshOnActualizeEmailConfigurator> refreshOnActualizeEmailConfiguratorProvider;
        private a<RefreshOnStartConfigurator> refreshOnStartConfiguratorProvider;
        private a<RefreshOnStartPageConfigurator> refreshOnStartPageConfiguratorProvider;
        private a<RefreshOnUserDataChangedConfigurator> refreshOnUserDataChangedConfiguratorProvider;
        private a<RefreshPageConfigurator> refreshPageConfiguratorProvider;
        private a<RefreshSelectionConfigurator> refreshSelectionConfiguratorProvider;
        private a<RefreshWithNewCommentActionHandler> refreshWithNewCommentActionHandlerProvider;
        private a<RefreshWithSelectedIdsActionHandler> refreshWithSelectedIdsActionHandlerProvider;
        private a<RegistrationConfigurator> registrationConfiguratorProvider;
        private a<RelatedProductsBottomSheetConfigurator> relatedProductsBottomSheetConfiguratorProvider;
        private a<ReloadFromCurrentWidgetPageActionHandler> reloadFromCurrentWidgetPageActionHandlerProvider;
        private a<RemoveAddressAlertCustomActionHandler> removeAddressAlertCustomActionHandlerProvider;
        private a<RemoveCartSplitActionHandler> removeCartSplitActionHandlerProvider;
        private a<RemoveFavoritesListConfigurator> removeFavoritesListConfiguratorProvider;
        private a<RemoveFromFavoriteActionHandler> removeFromFavoriteActionHandlerProvider;
        private a<RemoveFromFavoritesActionHandler> removeFromFavoritesActionHandlerProvider;
        private a<RemoveFromFavoritesListAsyncConfigurator> removeFromFavoritesListAsyncConfiguratorProvider;
        private a<RemoveFromFavoritesListConfigurator> removeFromFavoritesListConfiguratorProvider;
        private a<RemovePostActionHandler> removePostActionHandlerProvider;
        private final RemovePostModule removePostModule;
        private a<RemovePostViewModel> removePostViewModelProvider;
        private a<RemoveRVItemAnimationConfigurator> removeRVItemAnimationConfiguratorProvider;
        private a<RemoveRfbsSplitConfigurator> removeRfbsSplitConfiguratorProvider;
        private a<RemoveSelectionItemProductActionHandler> removeSelectionItemProductActionHandlerProvider;
        private a<RemoveSplitActionHandler> removeSplitActionHandlerProvider;
        private a<RemoveSplitConfigurator> removeSplitConfiguratorProvider;
        private a<RemoveSuggestionActionHandler> removeSuggestionActionHandlerProvider;
        private a<RenameFavoritesListAsyncConfigurator> renameFavoritesListAsyncConfiguratorProvider;
        private a<RenameFavoritesListConfigurator> renameFavoritesListConfiguratorProvider;
        private a<ReorderActionHandler> reorderActionHandlerProvider;
        private a<ReplaceProductsActionHandler> replaceProductsActionHandlerProvider;
        private a<RequestPhoneAccessConfigurator> requestPhoneAccessConfiguratorProvider;
        private a<ResetCartModeConfigurator> resetCartModeConfiguratorProvider;
        private final RestrictionsComponentApi restrictionsComponentApi;
        private a<ResultControllerConfigurator> resultControllerConfiguratorProvider;
        private a<ReturnActionModalConfigurator> returnActionModalConfiguratorProvider;
        private a<ReturnCreationItemRemovedConfigurator> returnCreationItemRemovedConfiguratorProvider;
        private final ReturnCreationNavigationModule returnCreationNavigationModule;
        private a<ReturnCreationPhotoUpdatedConfigurator> returnCreationPhotoUpdatedConfiguratorProvider;
        private a<ReturnDetailsNormalizeBackStackConfigurator> returnDetailsNormalizeBackStackConfiguratorProvider;
        private final ReturnEditNavigationModule returnEditNavigationModule;
        private a<ReturnListNormalizeBackStackConfigurator> returnListNormalizeBackStackConfiguratorProvider;
        private a<ReturnListUpdateConfigurator> returnListUpdateConfiguratorProvider;
        private a<ReviewConfigurator> reviewConfiguratorProvider;
        private a<ReviewFormConfigurator> reviewFormConfiguratorProvider;
        private a<ReviewGalleryV2Configurator> reviewGalleryV2ConfiguratorProvider;
        private a<ReviewSuccessConfigurator> reviewSuccessConfiguratorProvider;
        private final RmsComponentApi rmsComponentApi;
        private a<RxErrorPluginInitializer> rxErrorPluginInitializerProvider;
        private a<SaveReturnItemReasonCommentActionActionHandler> saveReturnItemReasonCommentActionActionHandlerProvider;
        private a<SaveReturnReasonDescriptionActionHandler> saveReturnReasonDescriptionActionHandlerProvider;
        private a<SaveReturnReasonDescriptionViewModel> saveReturnReasonDescriptionViewModelProvider;
        private a<SaveUserTipsChooseActionHandler> saveUserTipsChooseActionHandlerProvider;
        private a<ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.actionHandlers.SaveUserTipsChooseActionHandler> saveUserTipsChooseActionHandlerProvider2;
        private a<SberPayInitializer> sberPayInitializerProvider;
        private a<ScanItIntroConfigurator> scanItIntroConfiguratorProvider;
        private final ScreenBrightnessChangerModule screenBrightnessChangerModule;
        private a<ScreenRouterActionInitializer> screenRouterActionInitializerProvider;
        private a<ScrollToShipmentConfigurator> scrollToShipmentConfiguratorProvider;
        private a<ScrollToWidgetConfigurator> scrollToWidgetConfiguratorProvider;
        private a<SearchByImageConfigurator> searchByImageConfiguratorProvider;
        private a<SearchFormRefreshPageConfigurator> searchFormRefreshPageConfiguratorProvider;
        private a<SearchHideKeyboardOnOpenConfigurator> searchHideKeyboardOnOpenConfiguratorProvider;
        private a<SearchPageLoadConfigurator> searchPageLoadConfiguratorProvider;
        private a<SearchPreCreationConfigurator> searchPreCreationConfiguratorProvider;
        private final SearchPrefetchApi searchPrefetchApi;
        private a<SearchRedirectToGlobalActionHandlerImpl> searchRedirectToGlobalActionHandlerImplProvider;
        private a<SearchSheetResultConfigurator> searchSheetResultConfiguratorProvider;
        private final SelectLinkWidgetModule selectLinkWidgetModule;
        private a<SelectNotificationPermissionProcessor> selectNotificationPermissionProcessorProvider;
        private a<SelectPaymentConfigurator> selectPaymentConfiguratorProvider;
        private a<SelectPaymentViewModel> selectPaymentViewModelProvider;
        private final SelectionsCoreComponentApi selectionsCoreComponentApi;
        private a<SellerSubscribeActionHandler> sellerSubscribeActionHandlerProvider;
        private a<SellerUnsubscribeActionHandler> sellerUnsubscribeActionHandlerProvider;
        private a<SendRatingOnlyActionHandler> sendRatingOnlyActionHandlerProvider;
        private a<SendReviewActionHandlerV1> sendReviewActionHandlerV1Provider;
        private a<SendReviewActionHandlerV2> sendReviewActionHandlerV2Provider;
        private a<SentrySessionIdInitializer> sentrySessionIdInitializerProvider;
        private a<SessionListConfigurator> sessionListConfiguratorProvider;
        private a<SessionListUpdatedConfigurator> sessionListUpdatedConfiguratorProvider;
        private a<SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory> setCookieAndRefreshAssistedFactoryProvider;
        private a<SetLocaleActionInitializer> setLocaleActionInitializerProvider;
        private a<Set<PreCreateInfoProvider>> setOfPreCreateInfoProvider;
        private a<Set<WarmupInfoProvider>> setOfWarmupInfoProvider;
        private a<SetPublicProfileStatusActionHandler> setPublicProfileStatusActionHandlerProvider;
        private a<ShareBarcodeActionHandler> shareBarcodeActionHandlerProvider;
        private a<ShareButtonRepositoryImpl> shareButtonRepositoryImplProvider;
        private a<ShareLinkActionHandler> shareLinkActionHandlerProvider;
        private a<ShareLinkBloggerCopyResultConfigurator> shareLinkBloggerCopyResultConfiguratorProvider;
        private a<ShareLinkBloggerViewModel> shareLinkBloggerViewModelProvider;
        private a<ShareLinkViewModel> shareLinkViewModelProvider;
        private a<ShareSellerLinkActionHandler> shareSellerLinkActionHandlerProvider;
        private a<SharedViewPoolSizeSetterConfigurator> sharedViewPoolSizeSetterConfiguratorProvider;
        private a<ShoppingListsViewModel> shoppingListsViewModelProvider;
        private a<SingleActionButtonConfigurator> singleActionButtonConfiguratorProvider;
        private a<SkuPromoCartComposerInterceptor> skuPromoCartComposerInterceptorProvider;
        private a<SmsRetrieverConfigurator> smsRetrieverConfiguratorProvider;
        private a<SmsSignViewModelImpl> smsSignViewModelImplProvider;
        private a<SocialProfileConfigurator> socialProfileConfiguratorProvider;
        private final StartupTimeTrackerComponentApi startupTimeTrackerComponentApi;
        private a<StartupTimeTrackerInitializer> startupTimeTrackerInitializerProvider;
        private a<StaticTeenModeConfigurator> staticTeenModeConfiguratorProvider;
        private final StatusEdoStateComponentApi statusEdoStateComponentApi;
        private a<StickyCellViewModel> stickyCellViewModelProvider;
        private final StorageComponentApi storageComponentApi;
        private final StorefrontCommonComponentApi storefrontCommonComponentApi;
        private a<StoriesConfigurator> storiesConfiguratorProvider;
        private a<StringsProviderInitializer> stringsProviderInitializerProvider;
        private a<SubmitBloggerPostActionHandler> submitBloggerPostActionHandlerProvider;
        private a<SubmitCachedReviewConfigurator> submitCachedReviewConfiguratorProvider;
        private a<SubmitCachedReviewViewModel> submitCachedReviewViewModelProvider;
        private a<SubmitSelectionFormActionHandler> submitSelectionFormActionHandlerProvider;
        private a<SubscribeAuthorActionHandler> subscribeAuthorActionHandlerProvider;
        private a<SubscribeAuthorViewModel> subscribeAuthorViewModelProvider;
        private a<SuggestionsPrefetchConfigurator> suggestionsPrefetchConfiguratorProvider;
        private a<SuggestionsPrefetchViewModel> suggestionsPrefetchViewModelProvider;
        private a<SwipeViewModel> swipeViewModelProvider;
        private a<TabConfigInitializer> tabConfigInitializerProvider;
        private final TabsComponentApi tabsComponentApi;
        private a<TabsOnBoardingViewModel> tabsOnBoardingViewModelProvider;
        private a<TabsV2ViewModel> tabsV2ViewModelProvider;
        private a<TileRelatedProductsBottomSheetConfigurator> tileRelatedProductsBottomSheetConfiguratorProvider;
        private final TilesDomainComponentApi tilesDomainComponentApi;
        private a<ToggleProductListActionHandler> toggleProductListActionHandlerProvider;
        private a<TopAuthorsLandingConfigurator> topAuthorsLandingConfiguratorProvider;
        private a<TopAuthorsOnboardingConfigurator> topAuthorsOnboardingConfiguratorProvider;
        private a<TopEdgeConfigurator> topEdgeConfiguratorProvider;
        private a<TotalConfigurator> totalConfiguratorProvider;
        private a<TouristCountSelectorConfigurator> touristCountSelectorConfiguratorProvider;
        private a<TrackerActionInitializer> trackerActionInitializerProvider;
        private a<TrackerAnalyticsAdapterImpl> trackerAnalyticsAdapterImplProvider;
        private a<TrackerDebugMenuInitializer> trackerDebugMenuInitializerProvider;
        private a<TranslateReviewActionHandler> translateReviewActionHandlerProvider;
        private a<TranslateViewModel> translateViewModelProvider;
        private a<TravelAddNewPassengerFormV2InputDateSelectorConfigurator> travelAddNewPassengerFormV2InputDateSelectorConfiguratorProvider;
        private a<TravelAddNewPassengerFormV2InputSelectorConfigurator> travelAddNewPassengerFormV2InputSelectorConfiguratorProvider;
        private a<TravelAnchorRefreshConfigurator> travelAnchorRefreshConfiguratorProvider;
        private a<TravelCallActionHandler> travelCallActionHandlerProvider;
        private a<TravelCustomPostResultActionHandler> travelCustomPostResultActionHandlerProvider;
        private a<TravelDownloadFileActionHandler> travelDownloadFileActionHandlerProvider;
        private a<TravelDownloadFileConfigurator> travelDownloadFileConfiguratorProvider;
        private a<TravelFiltersKeyboardInsetConfigurator> travelFiltersKeyboardInsetConfiguratorProvider;
        private a<TravelForceRedirectActionHandler> travelForceRedirectActionHandlerProvider;
        private a<TravelForceRefreshActionHandler> travelForceRefreshActionHandlerProvider;
        private a<TravelHideAppbarConfigurator> travelHideAppbarConfiguratorProvider;
        private a<TravelMainPreCreateConfigurator> travelMainPreCreateConfiguratorProvider;
        private a<TravelOrderListPreCreateConfigurator> travelOrderListPreCreateConfiguratorProvider;
        private a<TravelPassengersPageStorageInitializerConfigurator> travelPassengersPageStorageInitializerConfiguratorProvider;
        private a<TravelRailwaySERPPreCreateConfigurator> travelRailwaySERPPreCreateConfiguratorProvider;
        private a<TravelRefreshOnRestartPageConfigurator> travelRefreshOnRestartPageConfiguratorProvider;
        private a<TravelResultActionHandler> travelResultActionHandlerProvider;
        private final TravelStorageApi travelStorageApi;
        private a<TravelThankYouPreCreateConfigurator> travelThankYouPreCreateConfiguratorProvider;
        private a<TravelTimeoutRedirectConfigurator> travelTimeoutRedirectConfiguratorProvider;
        private a<UgcCachedActionsSharedViewModel> ugcCachedActionsSharedViewModelProvider;
        private final UgcReviewFormComponentApi ugcReviewFormComponentApi;
        private a<UnbindVKIDCustomActionHandler> unbindVKIDCustomActionHandlerProvider;
        private a<UnsubscribeAuthorActionHandler> unsubscribeAuthorActionHandlerProvider;
        private a<UpdateByFavoritesConfigurator> updateByFavoritesConfiguratorProvider;
        private a<UpdateCartInitializer> updateCartInitializerProvider;
        private a<UpdateCellSelectionFormActionHandler> updateCellSelectionFormActionHandlerProvider;
        private a<UpdateChatInfoConfigurator> updateChatInfoConfiguratorProvider;
        private a<UpdateOrderC2CActionHandler> updateOrderC2CActionHandlerProvider;
        private a<UpdateOrderC2CConfigurator> updateOrderC2CConfiguratorProvider;
        private a<UpdateOrderC2CViewModel> updateOrderC2CViewModelProvider;
        private a<UpdateProductsSelectionFormActionHandler> updateProductsSelectionFormActionHandlerProvider;
        private a<UpdateSelectedMapTabActionHandler> updateSelectedMapTabActionHandlerProvider;
        private a<UploadPhotosConfigurator> uploadPhotosConfiguratorProvider;
        private a<UserAuthBiometryActionHandlerImpl> userAuthBiometryActionHandlerImplProvider;
        private a<UserAuthBiometryViewModelImpl> userAuthBiometryViewModelImplProvider;
        private a<UserSocialsMobileItemViewModelImpl> userSocialsMobileItemViewModelImplProvider;
        private a<UserStateActionInitializer> userStateActionInitializerProvider;
        private a<VKIDRefreshStateConfigurator> vKIDRefreshStateConfiguratorProvider;
        private a<VerifyEmailCustomActionHandler> verifyEmailCustomActionHandlerProvider;
        private final VideoComponentApi videoComponentApi;
        private a<VideoMoleculeConfigurator> videoMoleculeConfiguratorProvider;
        private a<ru.ozon.app.android.videomolecule.presentation.VideoMoleculeConfigurator> videoMoleculeConfiguratorProvider2;
        private a<VideoPreloadCleanerConfigurator> videoPreloadCleanerConfiguratorProvider;
        private a<VoiceRecognitionConfigurator> voiceRecognitionConfiguratorProvider;
        private a<WarmupAdaptersFacade> warmupAdaptersFacadeProvider;
        private final WebComponentApi webComponentApi;
        private a<WebViewAuthDestinationInterceptor> webViewAuthDestinationInterceptorProvider;
        private a<WebViewInitializer> webViewInitializerProvider;
        private final WhitelistComponentApi whitelistComponentApi;
        private a<WhitelistingInitializer> whitelistingInitializerProvider;
        private a<YandexSearchSheetResultConfigurator> yandexSearchSheetResultConfiguratorProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final IDaggerComponentImpl iDaggerComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92812id;

            SwitchingProvider(IDaggerComponentImpl iDaggerComponentImpl, int i11) {
                this.iDaggerComponentImpl = iDaggerComponentImpl;
                this.f92812id = i11;
            }

            private T get0() {
                switch (this.f92812id) {
                    case 0:
                        return (T) new DatePickerViewModel(new DatePickerMapper());
                    case 1:
                        Context context = (Context) this.iDaggerComponentImpl.getContextProvider.get();
                        g ozonRouter = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter);
                        return (T) MarkDownModule_ProvideMarkWonFactory.provideMarkWon(context, ozonRouter);
                    case 2:
                        T t2 = (T) this.iDaggerComponentImpl.contextComponentDependencies.getContext();
                        j.c(t2);
                        return t2;
                    case 3:
                        AuthStateStorage authStateStorage = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage);
                        OzonIdActivityCallback ozonIdActivityCallback = (OzonIdActivityCallback) this.iDaggerComponentImpl.ozonIdActivityCallbackProvider.get();
                        AuthEventsCollector authEventsCollector = this.iDaggerComponentImpl.accountComponentApi.getAuthEventsCollector();
                        j.c(authEventsCollector);
                        return (T) new AuthDestinationInterceptorImpl(authStateStorage, ozonIdActivityCallback, authEventsCollector, (Ob0.a) this.iDaggerComponentImpl.getOzonIdAppApiProvider.get());
                    case 4:
                        return (T) new OzonIdActivityCallback((Ob0.a) this.iDaggerComponentImpl.getOzonIdAppApiProvider.get());
                    case 5:
                        T t11 = (T) this.iDaggerComponentImpl.networkOzonIdComponentApi.getOzonIdAppApi();
                        j.c(t11);
                        return t11;
                    case 6:
                        T t12 = (T) this.iDaggerComponentImpl.pushComponentApi.getOzonPushManager();
                        j.c(t12);
                        return t12;
                    case 7:
                        return (T) new CreateAndPayViewModel(this.iDaggerComponentImpl.createAndPayRepository(), new OrderTrackingBus(), (GooglePayManager) this.iDaggerComponentImpl.bindGooglePayManagerProvider.get(), this.iDaggerComponentImpl.createAndPayAnalytics());
                    case 8:
                        GooglePayAvailabilityStorage googlePayAvailabilityStorage = this.iDaggerComponentImpl.checkoutPaymentComponentApi.getGooglePayAvailabilityStorage();
                        j.c(googlePayAvailabilityStorage);
                        return (T) new GooglePayManagerImpl(googlePayAvailabilityStorage);
                    case 9:
                        SharedPreferences sharedPreferences = this.iDaggerComponentImpl.storageComponentApi.getSharedPreferences();
                        j.c(sharedPreferences);
                        return (T) new StickyCellViewModel(sharedPreferences);
                    case 10:
                        return (T) new LinkFastPayViewModel(this.iDaggerComponentImpl.fastPayRepository());
                    case 11:
                        return (T) new CheckFastPayViewModel(this.iDaggerComponentImpl.fastPayRepository());
                    case 12:
                        ActionV2Repository actionRepository = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository);
                        CoroutineDispatcherProvider dispatcherProvider = this.iDaggerComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider);
                        return (T) new ShareLinkBloggerViewModel(actionRepository, dispatcherProvider);
                    case 13:
                        return (T) new HandlersInhibitor();
                    case 14:
                        T t13 = (T) this.iDaggerComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(t13);
                        return t13;
                    case 15:
                        return (T) new InputCurtainViewModel();
                    case 16:
                        return (T) new FreshAISharedViewModel();
                    case 17:
                        return (T) new PromptStatusViewModel();
                    case 18:
                        ActionV2Repository actionRepository2 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository2);
                        EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler = this.iDaggerComponentImpl.androidPlatformComponentApi.getEnableNotificationsSuggestingHandler();
                        j.c(enableNotificationsSuggestingHandler);
                        CoroutineDispatcherProvider dispatcherProvider2 = this.iDaggerComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider2);
                        NotificationStatusProvider notificationStatusProvider = this.iDaggerComponentImpl.notificationStatusComponentApi.getNotificationStatusProvider();
                        j.c(notificationStatusProvider);
                        return (T) new PromoPushEnableViewModel(actionRepository2, enableNotificationsSuggestingHandler, dispatcherProvider2, notificationStatusProvider);
                    case 19:
                        TravelCommonActionResultApi travelCommonActionResultApi = (TravelCommonActionResultApi) this.iDaggerComponentImpl.provideTravelCommonActionResultApiProvider.get();
                        Vg.d customActionHandlersStoreFactory = this.iDaggerComponentImpl.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                        j.c(customActionHandlersStoreFactory);
                        return (T) new TravelResultActionHandler(travelCommonActionResultApi, customActionHandlersStoreFactory, new SupportedResultActionHandlersImpl());
                    case 20:
                        Retrofit retrofit = this.iDaggerComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) TravelCommonApiModule_Companion_ProvideTravelCommonActionResultApiFactory.provideTravelCommonActionResultApi(retrofit);
                    case 21:
                        TravelCommonActionResultApi travelCommonActionResultApi2 = (TravelCommonActionResultApi) this.iDaggerComponentImpl.provideTravelCommonActionResultApiProvider.get();
                        Vg.d customActionHandlersStoreFactory2 = this.iDaggerComponentImpl.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                        j.c(customActionHandlersStoreFactory2);
                        return (T) new TravelCustomPostResultActionHandler(travelCommonActionResultApi2, customActionHandlersStoreFactory2, new SupportedResultActionHandlersImpl());
                    case 22:
                        return (T) new TravelForceRedirectActionHandler();
                    case 23:
                        return (T) new TravelForceRefreshActionHandler();
                    case 24:
                        return (T) new ModalParentRefreshActionHandler(this.iDaggerComponentImpl.modalParentRefreshSharedViewModelProvider);
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                        return (T) new ModalParentRefreshSharedViewModel();
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        return (T) new PopAndRefreshActionHandler();
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        return (T) new TravelDownloadFileActionHandler(this.iDaggerComponentImpl.getFileDownloaderViewModelProvider);
                    case 28:
                        T t14 = (T) this.iDaggerComponentImpl.pdfFileComponentApi.getFileDownloaderViewModel();
                        j.c(t14);
                        return t14;
                    case 29:
                        return (T) new TravelCallActionHandler((Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        return (T) new CalendarEventActionHandler();
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        DeeplinkRouteEventPublisher deeplinkRouteEventPublisher = this.iDaggerComponentImpl.deeplinkRouteComponentApi.getDeeplinkRouteEventPublisher();
                        j.c(deeplinkRouteEventPublisher);
                        return (T) new PushRouteAndRefreshActionHandler(deeplinkRouteEventPublisher);
                    case 32:
                        DeeplinkRouteEventPublisher deeplinkRouteEventPublisher2 = this.iDaggerComponentImpl.deeplinkRouteComponentApi.getDeeplinkRouteEventPublisher();
                        j.c(deeplinkRouteEventPublisher2);
                        return (T) new PopRouteAndRefreshActionHandler(deeplinkRouteEventPublisher2);
                    case 33:
                        return (T) new HotelsBookSuccessValidationActionHandler();
                    case 34:
                        return (T) new AddCardActionHandler(this.iDaggerComponentImpl.selectPaymentViewModelProvider);
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        SelectPaymentRepositoryImpl selectPaymentRepositoryImpl = this.iDaggerComponentImpl.selectPaymentRepositoryImpl();
                        JsonParser jsonDeserializer = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer);
                        return (T) new SelectPaymentViewModel(selectPaymentRepositoryImpl, jsonDeserializer);
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        AdultHandler adultHandler = this.iDaggerComponentImpl.accountComponentApi.getAdultHandler();
                        j.c(adultHandler);
                        FavoritesCustomActionHandlerInteractor favoritesCustomActionHandlerInteractor = this.iDaggerComponentImpl.favoritesCustomActionHandlerInteractor();
                        FavoriteManager favoriteManager = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavoriteManager();
                        j.c(favoriteManager);
                        return (T) new AddToFavoriteActionHandler(adultHandler, favoritesCustomActionHandlerInteractor, favoriteManager);
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        JsonParser jsonDeserializer2 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer2);
                        return (T) new GoCheckoutActionHandler(jsonDeserializer2);
                    case 38:
                        return (T) new ClassifiedCallActionHandler((Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        return (T) new ReloadFromCurrentWidgetPageActionHandler((FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 40:
                        return (T) new CourierOnMapCallActionHandler((Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 41:
                        return (T) new CallCourierActionHandler((Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 42:
                        return (T) new RemoveFromFavoriteActionHandler(this.iDaggerComponentImpl.favoritesCustomActionHandlerInteractor());
                    case 43:
                        return (T) new RemoveSplitActionHandler();
                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        return (T) new ShareLinkActionHandler(this.iDaggerComponentImpl.shareLinkViewModelProvider);
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        return (T) new ShareLinkViewModel((ShareButtonRepository) this.iDaggerComponentImpl.bindShareButtonRepositoryProvider.get());
                    case 46:
                        return (T) new ShareButtonRepositoryImpl((ShareButtonApi) this.iDaggerComponentImpl.providesShareButtonApiProvider.get());
                    case 47:
                        Retrofit retrofit3 = this.iDaggerComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit3);
                        return (T) ShareButtonModule_Companion_ProvidesShareButtonApiFactory.providesShareButtonApi(retrofit3);
                    case 48:
                        ActionV2Repository actionRepository3 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository3);
                        return (T) new ShareSellerLinkActionHandler(actionRepository3);
                    case 49:
                        a aVar = this.iDaggerComponentImpl.removePostViewModelProvider;
                        JsonParser jsonDeserializer3 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer3);
                        return (T) new RemovePostActionHandler(aVar, jsonDeserializer3);
                    case 50:
                        return (T) new RemovePostViewModel(this.iDaggerComponentImpl.postRepository());
                    case 51:
                        return (T) new ComposerActionAndRedirectActionHandler(this.iDaggerComponentImpl.composerActionAndRedirectViewModelProvider);
                    case 52:
                        ActionV2Repository actionRepository4 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository4);
                        return (T) new ComposerActionAndRedirectViewModel(actionRepository4);
                    case 53:
                        return (T) new DownloadPDFActionHandler();
                    case 54:
                        return (T) new CloseFlowActionHandler();
                    case 55:
                        ActionV2Repository actionRepository5 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository5);
                        return (T) new ComposerActionWithRefreshCustomActionHandler(actionRepository5);
                    case 56:
                        g ozonRouter2 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter2);
                        return (T) new ClassifiedOpenDeleteListingModalActionHandler(ozonRouter2);
                    case 57:
                        g ozonRouter3 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter3);
                        return (T) new OpenDeeplinkForRefreshResultActionHandler(ozonRouter3);
                    case 58:
                        AppType appType = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType);
                        ActionV2Repository actionRepository6 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository6);
                        return (T) new ComposerActionWithActionHandler(appType, actionRepository6, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 59:
                        AppType appType2 = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType2);
                        ActionV2Repository actionRepository7 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository7);
                        return (T) new ComposerActionWithSaveScrollActionHandler(appType2, actionRepository7, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 60:
                        AppStoreInfoProvider appStoreInfoProvider = this.iDaggerComponentImpl.analyticsComponentApi.getAppStoreInfoProvider();
                        j.c(appStoreInfoProvider);
                        return (T) new OpenApplicationStoreActionHandler(appStoreInfoProvider);
                    case 61:
                        EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler2 = this.iDaggerComponentImpl.androidPlatformComponentApi.getEnableNotificationsSuggestingHandler();
                        j.c(enableNotificationsSuggestingHandler2);
                        return (T) new OpenNotificationSettingsActionHandler(enableNotificationsSuggestingHandler2);
                    case 62:
                        return (T) new AddressPartsInputCustomActionHandler();
                    case 63:
                        return (T) new RemoveAddressAlertCustomActionHandler();
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                        return (T) new DismissAndScrollByScrollWidgetKeyActionHandler();
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                        return (T) new PopActionHandler();
                    case 66:
                        OnboardingInteractor onboardingCheckerInteractor = this.iDaggerComponentImpl.onboardingCheckerComponentApi.getOnboardingCheckerInteractor();
                        j.c(onboardingCheckerInteractor);
                        return (T) new OnboardingActionHandler(onboardingCheckerInteractor);
                    case 67:
                        return (T) new PopAndRedirectActionHandler();
                    case 68:
                        return (T) new CloseMiniappActionHandler();
                    case 69:
                        return (T) new RateInAppActionHandler(this.iDaggerComponentImpl.rateAppRouter());
                    case 70:
                        ActionV2Repository actionRepository8 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository8);
                        Vg.d customActionHandlersStoreFactory3 = this.iDaggerComponentImpl.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                        j.c(customActionHandlersStoreFactory3);
                        return (T) new CompositeCustomActionHandler(actionRepository8, customActionHandlersStoreFactory3);
                    case 71:
                        a aVar2 = this.iDaggerComponentImpl.subscribeAuthorViewModelProvider;
                        AuthStateStorage authStateStorage2 = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage2);
                        return (T) new SubscribeAuthorActionHandler(aVar2, authStateStorage2);
                    case 72:
                        AppType appType3 = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType3);
                        ActionV2Repository actionRepository9 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository9);
                        SubscribeAuthorsIdStorage subscribeAuthorsIdStorage = this.iDaggerComponentImpl.storageComponentApi.getSubscribeAuthorsIdStorage();
                        j.c(subscribeAuthorsIdStorage);
                        return (T) new SubscribeAuthorViewModel(appType3, actionRepository9, subscribeAuthorsIdStorage);
                    case ModuleDescriptor.MODULE_VERSION /* 73 */:
                        a aVar3 = this.iDaggerComponentImpl.subscribeAuthorViewModelProvider;
                        AuthStateStorage authStateStorage3 = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage3);
                        return (T) new UnsubscribeAuthorActionHandler(aVar3, authStateStorage3);
                    case 74:
                        return (T) new SaveUserTipsChooseActionHandler();
                    case 75:
                        return (T) new DismissOrCloseMiniappActionHandler();
                    case 76:
                        return (T) new UpdateSelectedMapTabActionHandler();
                    case 77:
                        return (T) new FavoriteListRemoveActionHandler(this.iDaggerComponentImpl.favoriteToggleProductButtonViewModelProvider);
                    case 78:
                        FavoriteToggleProductButtonInteractor favoriteToggleProductButtonInteractor = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavoriteToggleProductButtonInteractor();
                        j.c(favoriteToggleProductButtonInteractor);
                        return (T) new FavoriteToggleProductButtonViewModel(favoriteToggleProductButtonInteractor);
                    case 79:
                        WishlistItemsInteractor wishlistItemsInteractor = this.iDaggerComponentImpl.favoriteCoreComponentApi.getWishlistItemsInteractor();
                        j.c(wishlistItemsInteractor);
                        return (T) new FavoriteListAddActionHandlerImpl(wishlistItemsInteractor);
                    case 80:
                        AdultHandler adultHandler2 = this.iDaggerComponentImpl.accountComponentApi.getAdultHandler();
                        j.c(adultHandler2);
                        FavoritesListsInteractor favoritesListsInteractor = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavoritesListsInteractor();
                        j.c(favoritesListsInteractor);
                        return (T) new FavoriteShareListActionHandler(adultHandler2, favoritesListsInteractor, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 81:
                        return (T) new FavoriteDeleteListActionHandler(this.iDaggerComponentImpl.deleteWishlistViewModelProvider);
                    case 82:
                        WishlistsInteractor wishlistsInteractor = this.iDaggerComponentImpl.favoriteCoreComponentApi.getWishlistsInteractor();
                        j.c(wishlistsInteractor);
                        FavoritesListsEventsManager favoritesListsEventsManager = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager);
                        return (T) new DeleteWishlistViewModel(wishlistsInteractor, favoritesListsEventsManager);
                    case 83:
                        return (T) new RemoveFromFavoritesActionHandler();
                    case 84:
                        ActionV2Repository actionRepository10 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository10);
                        Vg.d customActionHandlersStoreFactory4 = this.iDaggerComponentImpl.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                        j.c(customActionHandlersStoreFactory4);
                        WishlistEventManager wishlistEventManager = this.iDaggerComponentImpl.favoriteCoreComponentApi.getWishlistEventManager();
                        j.c(wishlistEventManager);
                        return (T) new FavoriteWishlistRemoveActionHandler(actionRepository10, customActionHandlersStoreFactory4, wishlistEventManager);
                    case 85:
                        ActionV2Repository actionRepository11 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository11);
                        SelectionProductsEventManager selectionProductsEventManager = this.iDaggerComponentImpl.selectionsCoreComponentApi.getSelectionProductsEventManager();
                        j.c(selectionProductsEventManager);
                        return (T) new RemoveSelectionItemProductActionHandler(actionRepository11, selectionProductsEventManager);
                    case 86:
                        TileDislikeInteractor tilesDislikeInteractor = this.iDaggerComponentImpl.tilesDomainComponentApi.getTilesDislikeInteractor();
                        j.c(tilesDislikeInteractor);
                        return (T) new DislikeRecommendationActionHandler(tilesDislikeInteractor);
                    case 87:
                        ActionV2Repository actionRepository12 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository12);
                        return (T) new ActivateHelpCertActionHandler(actionRepository12);
                    case 88:
                        JsonParser jsonDeserializer4 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer4);
                        return (T) new GetDirectionsActionHandler(jsonDeserializer4);
                    case 89:
                        return (T) new PopBackStackActionHandler();
                    case 90:
                        return (T) new CloseFlowAndActionDoActionHandler();
                    case 91:
                        return (T) new DeleteSearchInsightCustomActionHandlerImpl();
                    case 92:
                        return (T) new SearchRedirectToGlobalActionHandlerImpl();
                    case 93:
                        return (T) new DeleteAiConversationActionHandlerImpl();
                    case 94:
                        return (T) new AiRefreshActionHandlerImpl();
                    case 95:
                        return (T) new CopyTextActionHandler();
                    case 96:
                        return (T) new CopyAndDismissActionHandler();
                    case 97:
                        SearchUrlPrefetchService searchUrlPrefetchService = this.iDaggerComponentImpl.searchPrefetchApi.getSearchUrlPrefetchService();
                        j.c(searchUrlPrefetchService);
                        return (T) new RedirectWithPrefetchActionHandler(searchUrlPrefetchService, this.iDaggerComponentImpl.modifySearchUrlViewModelProvider);
                    case 98:
                        FeatureService featureService = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        return (T) new ModifySearchUrlViewModel(featureService);
                    case Logger.NONE /* 99 */:
                        return (T) new RemoveSuggestionActionHandler(this.iDaggerComponentImpl.removeSuggestionApi());
                    default:
                        throw new AssertionError(this.f92812id);
                }
            }

            private T get1() {
                switch (this.f92812id) {
                    case 100:
                        return (T) new ApplySortingActionHandler(this.iDaggerComponentImpl.applySortingViewModelProvider);
                    case 101:
                        return (T) new ApplySortingViewModel();
                    case 102:
                        ActionV2Repository actionRepository = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository);
                        return (T) new SetPublicProfileStatusActionHandler(actionRepository);
                    case 103:
                        ActionV2Repository actionRepository2 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository2);
                        SharedPreferences sharedPreferences = this.iDaggerComponentImpl.storageComponentApi.getSharedPreferences();
                        j.c(sharedPreferences);
                        return (T) new MallFilterNotificationActionHandler(actionRepository2, sharedPreferences);
                    case 104:
                        AppVersionService appVersionService = this.iDaggerComponentImpl.networkComponentApi.getAppVersionService();
                        j.c(appVersionService);
                        return (T) new PickImageActionHandler(appVersionService);
                    case 105:
                        HomeCreditApi homeCreditApi = this.iDaggerComponentImpl.homeCreditApi();
                        g ozonRouter = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter);
                        return (T) new HomeCreditActionHandler(homeCreditApi, ozonRouter);
                    case 106:
                        CancelReasonsRepositoryImpl cancelReasonsRepositoryImpl = this.iDaggerComponentImpl.cancelReasonsRepositoryImpl();
                        CoroutineDispatcherProvider dispatcherProvider = this.iDaggerComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider);
                        return (T) new FetchCancelReasonsActionHandler(cancelReasonsRepositoryImpl, dispatcherProvider);
                    case 107:
                        JsonParser jsonDeserializer = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer);
                        CartService cartService = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService);
                        CoroutineDispatcherProvider dispatcherProvider2 = this.iDaggerComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider2);
                        return (T) new ReorderActionHandler(jsonDeserializer, cartService, dispatcherProvider2);
                    case 108:
                        return (T) new DismissAndRefreshMapActionHandler();
                    case 109:
                        return (T) new ToggleProductListActionHandler();
                    case 110:
                        return (T) new RefreshWithSelectedIdsActionHandler();
                    case 111:
                        return (T) new RefreshWithNewCommentActionHandler();
                    case 112:
                        ActionV2Repository actionRepository3 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository3);
                        CartPrefetchController cartPrefetchController = this.iDaggerComponentImpl.cartServiceApi.getCartPrefetchController();
                        j.c(cartPrefetchController);
                        CartService cartService2 = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService2);
                        CartEventsController cartEventsController = this.iDaggerComponentImpl.cartComponentApi.getCartEventsController();
                        j.c(cartEventsController);
                        return (T) new CancelOrderV3ActionHandler(actionRepository3, cartPrefetchController, cartService2, cartEventsController);
                    case 113:
                        return (T) new ShareBarcodeActionHandler(this.iDaggerComponentImpl.shareBarcodeAnalytics());
                    case 114:
                        JsonParser jsonDeserializer2 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer2);
                        return (T) new PostRefreshWithScrollActionHandler(jsonDeserializer2);
                    case 115:
                        JsonParser jsonDeserializer3 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer3);
                        CartEventsController cartEventsController2 = this.iDaggerComponentImpl.cartComponentApi.getCartEventsController();
                        j.c(cartEventsController2);
                        return (T) new ChangeItemQuantityActionHandler(jsonDeserializer3, cartEventsController2);
                    case 116:
                        return (T) new FreshRemoveCartItemsActionHandler();
                    case 117:
                        return (T) new FreshPostRefreshWithScrollActionHandler();
                    case 118:
                        JsonParser jsonDeserializer4 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer4);
                        return (T) new FreshRemoveCartTileActionHandler(jsonDeserializer4);
                    case 119:
                        return (T) new ru.ozon.app.android.fresh.common.domain.actionHandlers.PopAndRedirectActionHandler();
                    case 120:
                        return (T) new ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.actionHandlers.SaveUserTipsChooseActionHandler();
                    case 121:
                        e miniAppConfigHolder = this.iDaggerComponentImpl.navigationComponentApi.getMiniAppConfigHolder();
                        j.c(miniAppConfigHolder);
                        return (T) new GetRecShelfActionHandler(miniAppConfigHolder);
                    case 122:
                        return (T) new B2bResetEdoVerificationActionHandler(this.iDaggerComponentImpl.b2bResetEdoVerificationViewModelProvider);
                    case 123:
                        return (T) new B2bResetEdoVerificationViewModel(this.iDaggerComponentImpl.b2bResetEdoVerificationRepositoryImpl(), this.iDaggerComponentImpl.addEdoStatusStorage());
                    case 124:
                        a aVar = this.iDaggerComponentImpl.b2bRemoveLegalViewModelProvider;
                        TabConfigUpdateDelegate tabConfigRequestDelegate = this.iDaggerComponentImpl.tabsComponentApi.getTabConfigRequestDelegate();
                        j.c(tabConfigRequestDelegate);
                        return (T) new B2bRemoveLegalActionHandler(aVar, tabConfigRequestDelegate);
                    case 125:
                        return (T) new B2bRemoveLegalViewModel(this.iDaggerComponentImpl.b2bRemoveLegalRepositoryImpl());
                    case 126:
                        JsonParser jsonDeserializer5 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer5);
                        return (T) new B2bDownloadFileActionHandler(jsonDeserializer5, this.iDaggerComponentImpl.b2bDownloadFileViewModelProvider);
                    case 127:
                        return (T) new B2bDownloadFileViewModel(this.iDaggerComponentImpl.b2bDownloadFileRepositoryImpl());
                    case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                        JsonParser jsonDeserializer6 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer6);
                        return (T) new B2bAcceptActActionHandler(jsonDeserializer6, this.iDaggerComponentImpl.b2bAcceptActViewModelProvider);
                    case 129:
                        return (T) new B2bAcceptActViewModel(this.iDaggerComponentImpl.b2bAcceptActRepositoryImpl());
                    case 130:
                        return (T) new B2bSelectConsigneeActionHandler(this.iDaggerComponentImpl.b2bSelectConsigneeViewModelProvider);
                    case 131:
                        return (T) new B2bSelectConsigneeViewModel(this.iDaggerComponentImpl.b2bSelectConsigneeRepositoryImpl());
                    case 132:
                        return (T) new B2bDeleteConsigneeActionHandler(this.iDaggerComponentImpl.b2bDeleteConsigneeViewModelProvider);
                    case 133:
                        return (T) new B2bDeleteConsigneeViewModel(this.iDaggerComponentImpl.b2bDeleteConsigneeRepositoryImpl());
                    case 134:
                        return (T) new DismissRefreshAndScrollActionHandler();
                    case 135:
                        CartService cartService3 = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService3);
                        return (T) new AddToCartWithRedirectActionHandler(cartService3);
                    case 136:
                        ActionV2Repository actionRepository4 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository4);
                        AuthStateStorage authStateStorage = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage);
                        SellerFavoriteService sellerFavoriteService = this.iDaggerComponentImpl.accountComponentApi.getSellerFavoriteService();
                        j.c(sellerFavoriteService);
                        return (T) new SellerSubscribeActionHandler(actionRepository4, authStateStorage, sellerFavoriteService);
                    case 137:
                        ActionV2Repository actionRepository5 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository5);
                        AuthStateStorage authStateStorage2 = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage2);
                        SellerFavoriteService sellerFavoriteService2 = this.iDaggerComponentImpl.accountComponentApi.getSellerFavoriteService();
                        j.c(sellerFavoriteService2);
                        return (T) new SellerUnsubscribeActionHandler(actionRepository5, authStateStorage2, sellerFavoriteService2);
                    case 138:
                        ActionV2Repository actionRepository6 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository6);
                        return (T) new ActualizeEmailActionHandler(actionRepository6, (Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 139:
                        ActionV2Repository actionRepository7 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository7);
                        EmailActualizedEventBus emailActualizedEventBus = this.iDaggerComponentImpl.accountComponentApi.getEmailActualizedEventBus();
                        j.c(emailActualizedEventBus);
                        return (T) new ConfirmEmailCustomActionHandler(actionRepository7, emailActualizedEventBus);
                    case 140:
                        ActionV2Repository actionRepository8 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository8);
                        return (T) new VerifyEmailCustomActionHandler(actionRepository8);
                    case 141:
                        ActionV2Repository actionRepository9 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository9);
                        return (T) new UnbindVKIDCustomActionHandler(actionRepository9);
                    case 142:
                        return (T) new ActionsFooterLikeActionHandler(this.iDaggerComponentImpl.actionsFooterViewModelImplProvider, this.iDaggerComponentImpl.ugcCachedActionsSharedViewModelProvider);
                    case 143:
                        ActionV2Repository actionRepository10 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository10);
                        return (T) new ActionsFooterViewModelImpl(actionRepository10);
                    case 144:
                        return (T) new UgcCachedActionsSharedViewModel();
                    case 145:
                        a aVar2 = this.iDaggerComponentImpl.translateViewModelProvider;
                        ActionAnalyticDelegate actionAnalyticDelegate = this.iDaggerComponentImpl.actionComponentApi.getActionAnalyticDelegate();
                        j.c(actionAnalyticDelegate);
                        return (T) new TranslateReviewActionHandler(aVar2, actionAnalyticDelegate);
                    case 146:
                        ActionV2Repository actionRepository11 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository11);
                        ConnectionHandler internetConnectionUtils = this.iDaggerComponentImpl.networkComponentApi.getInternetConnectionUtils();
                        j.c(internetConnectionUtils);
                        return (T) new TranslateViewModel(actionRepository11, internetConnectionUtils);
                    case 147:
                        return (T) new CommentActionHandler(this.iDaggerComponentImpl.commentFooterViewModelProvider);
                    case 148:
                        AuthStateStorage authStateStorage3 = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage3);
                        return (T) new CommentFooterViewModel(authStateStorage3);
                    case 149:
                        return (T) new CommentModalActionHandler(this.iDaggerComponentImpl.commentFooterViewModelProvider);
                    case 150:
                        ActionV2Repository actionRepository12 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository12);
                        Vg.d customActionHandlersStoreFactory = this.iDaggerComponentImpl.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                        j.c(customActionHandlersStoreFactory);
                        return (T) new SubmitSelectionFormActionHandler(actionRepository12, customActionHandlersStoreFactory);
                    case 151:
                        ActionV2Repository actionRepository13 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository13);
                        return (T) new UpdateProductsSelectionFormActionHandler(actionRepository13);
                    case 152:
                        ActionV2Repository actionRepository14 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository14);
                        return (T) new UpdateCellSelectionFormActionHandler(actionRepository14);
                    case 153:
                        return (T) new DoubleDismissAndRedirectActionHandler();
                    case 154:
                        return (T) new DoubleDismissAndRefreshActionHandler();
                    case 155:
                        return (T) new DismissAndPopAndRefreshActionHandler();
                    case 156:
                        return (T) new SaveReturnReasonDescriptionActionHandler(this.iDaggerComponentImpl.saveReturnReasonDescriptionViewModelProvider);
                    case 157:
                        ActionV2Repository actionRepository15 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository15);
                        return (T) new SaveReturnReasonDescriptionViewModel(actionRepository15);
                    case 158:
                        return (T) new SaveReturnItemReasonCommentActionActionHandler(this.iDaggerComponentImpl.saveReturnReasonDescriptionViewModelProvider);
                    case 159:
                        return (T) new UserAuthBiometryActionHandlerImpl((UserAuthBiometryViewModelImpl) this.iDaggerComponentImpl.userAuthBiometryViewModelImplProvider.get());
                    case 160:
                        Fb0.a biometryAuth = this.iDaggerComponentImpl.authComponentApi.getBiometryAuth();
                        j.c(biometryAuth);
                        return (T) new UserAuthBiometryViewModelImpl(biometryAuth);
                    case 161:
                        return (T) new InstantLoginActionHandlerImpl(this.iDaggerComponentImpl.instantLoginManager());
                    case 162:
                        return (T) new LogoutActionHandlerImpl((Ob0.a) this.iDaggerComponentImpl.getOzonIdAppApiProvider.get());
                    case 163:
                        ActionV2Repository actionRepository16 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository16);
                        return (T) new MainDrawMajorScreenProgressUpdateActionHandler(actionRepository16);
                    case 164:
                        MorkovskOnboardingDelegate morkovskOnboardingDelegate = this.iDaggerComponentImpl.morkovskOnboardingComponentApi.getMorkovskOnboardingDelegate();
                        j.c(morkovskOnboardingDelegate);
                        return (T) new LotteryOpenPurchaseTicketPageActionHandler(morkovskOnboardingDelegate);
                    case 165:
                        MorkovskOnboardingDelegate morkovskOnboardingDelegate2 = this.iDaggerComponentImpl.morkovskOnboardingComponentApi.getMorkovskOnboardingDelegate();
                        j.c(morkovskOnboardingDelegate2);
                        return (T) new LotteryForceShowOnboardingActionHandler(morkovskOnboardingDelegate2);
                    case 166:
                        return (T) new ChangePaymentActionHandler(this.iDaggerComponentImpl.changePaymentViewModelProvider);
                    case 167:
                        Context context = (Context) this.iDaggerComponentImpl.getContextProvider.get();
                        ChangePaymentApi changePaymentApi = (ChangePaymentApi) this.iDaggerComponentImpl.provideChangePaymentApiProvider.get();
                        JsonParser jsonDeserializer7 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer7);
                        OrderChangePreferences orderChangePreferences = this.iDaggerComponentImpl.accountComponentApi.getOrderChangePreferences();
                        j.c(orderChangePreferences);
                        GooglePayAvailabilityStorage googlePayAvailabilityStorage = this.iDaggerComponentImpl.checkoutPaymentComponentApi.getGooglePayAvailabilityStorage();
                        j.c(googlePayAvailabilityStorage);
                        return (T) new ChangePaymentViewModel(context, changePaymentApi, jsonDeserializer7, orderChangePreferences, googlePayAvailabilityStorage, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 168:
                        Retrofit retrofit = this.iDaggerComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) OrderDetailsCoreModule_Companion_ProvideChangePaymentApiFactory.provideChangePaymentApi(retrofit);
                    case 169:
                        return (T) new CreateOrderActionHandler(this.iDaggerComponentImpl.createAndPayViewModelProvider);
                    case 170:
                        a aVar3 = this.iDaggerComponentImpl.createAndPayViewModelProvider;
                        ApplicationInfoDataSource applicationInfoStorage = this.iDaggerComponentImpl.storageComponentApi.getApplicationInfoStorage();
                        j.c(applicationInfoStorage);
                        return (T) new CreatePaymentActionHandler(aVar3, applicationInfoStorage);
                    case 171:
                        return (T) new CreateServiceActionHandler(this.iDaggerComponentImpl.createServiceViewModelProvider);
                    case 172:
                        return (T) new CreateServiceViewModel(this.iDaggerComponentImpl.createServiceRepository());
                    case 173:
                        return (T) new UpdateOrderC2CActionHandler(this.iDaggerComponentImpl.updateOrderC2CViewModelProvider);
                    case 174:
                        return (T) new UpdateOrderC2CViewModel(this.iDaggerComponentImpl.updateOrderC2CRepository());
                    case 175:
                        return (T) new CreateOrderV2ActionHandler(this.iDaggerComponentImpl.createAndPayViewModelProvider);
                    case 176:
                        ActionV2Repository actionRepository17 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository17);
                        return (T) new AppendProductsActionHandler(actionRepository17);
                    case 177:
                        ActionV2Repository actionRepository18 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository18);
                        return (T) new ReplaceProductsActionHandler(actionRepository18);
                    case 178:
                        ActionV2Repository actionRepository19 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository19);
                        Vg.d customActionHandlersStoreFactory2 = this.iDaggerComponentImpl.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                        j.c(customActionHandlersStoreFactory2);
                        return (T) new SubmitBloggerPostActionHandler(actionRepository19, customActionHandlersStoreFactory2);
                    case 179:
                        JsonParser jsonDeserializer8 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer8);
                        return (T) new RemoveCartSplitActionHandler(jsonDeserializer8);
                    case 180:
                        return (T) new AddToCartActionHandler(this.iDaggerComponentImpl.addToCartViewModelProvider);
                    case 181:
                        CartService cartService4 = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService4);
                        JsonParser jsonDeserializer9 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer9);
                        CartEventsController cartEventsController3 = this.iDaggerComponentImpl.cartComponentApi.getCartEventsController();
                        j.c(cartEventsController3);
                        return (T) new AddToCartViewModel(cartService4, jsonDeserializer9, cartEventsController3);
                    case 182:
                        Vg.d customActionHandlersStoreFactory3 = this.iDaggerComponentImpl.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                        j.c(customActionHandlersStoreFactory3);
                        JsonParser jsonDeserializer10 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer10);
                        CoroutineDispatcherProvider dispatcherProvider3 = this.iDaggerComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider3);
                        return (T) new PerformTwoActionsHandler(customActionHandlersStoreFactory3, jsonDeserializer10, dispatcherProvider3);
                    case 183:
                        AppType appType = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType);
                        ActionV2Repository actionRepository20 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository20);
                        return (T) new AddToCartResponseActionWithActionHandler(appType, actionRepository20, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 184:
                        ActionV2Repository actionRepository21 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository21);
                        Vg.d customActionHandlersStoreFactory4 = this.iDaggerComponentImpl.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                        j.c(customActionHandlersStoreFactory4);
                        CmlEventsController cmlEventsController = this.iDaggerComponentImpl.cmlDomainComponentApi.getCmlEventsController();
                        j.c(cmlEventsController);
                        return (T) new CmlComposerActionWithActionHandler(actionRepository21, customActionHandlersStoreFactory4, cmlEventsController);
                    case 185:
                        ActionV2Repository actionRepository22 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository22);
                        Vg.d customActionHandlersStoreFactory5 = this.iDaggerComponentImpl.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                        j.c(customActionHandlersStoreFactory5);
                        return (T) new CmlOrderActionHandler(actionRepository22, customActionHandlersStoreFactory5);
                    case 186:
                        return (T) new CmlUpdatePassportActionHandler();
                    case 187:
                        ActionV2Repository actionRepository23 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository23);
                        Vg.d customActionHandlersStoreFactory6 = this.iDaggerComponentImpl.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                        j.c(customActionHandlersStoreFactory6);
                        return (T) new CmlValidatePassportActionHandler(actionRepository23, customActionHandlersStoreFactory6);
                    case 188:
                        return (T) new SendReviewActionHandlerV1();
                    case 189:
                        return (T) new SendReviewActionHandlerV2();
                    case 190:
                        return (T) new SendRatingOnlyActionHandler();
                    case 191:
                        return (T) new AutopickerBottomSheetRepository();
                    case 192:
                        return (T) new AllStepViewModel(this.iDaggerComponentImpl.filterActionProcessor(), (PickerRefreshLinkStore) this.iDaggerComponentImpl.pickerRefreshLinkStoreProvider.get());
                    case 193:
                        return (T) new PickerRefreshLinkStore();
                    case 194:
                        return (T) new ConcreteStepViewModel(new ConcreteStepCellDataSource(), this.iDaggerComponentImpl.filterActionProcessor(), (PickerRefreshLinkStore) this.iDaggerComponentImpl.pickerRefreshLinkStoreProvider.get());
                    case 195:
                        return (T) new SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory() { // from class: ru.ozon.app.android.injection.DaggerIDaggerComponent.IDaggerComponentImpl.SwitchingProvider.1
                            @Override // ru.ozon.app.android.common.actionHandlers.SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory
                            public SetCookieAndRefreshHandler create(ComposerReferences composerReferences) {
                                ExtraCookieStorage extraCookieStorage = SwitchingProvider.this.iDaggerComponentImpl.storageComponentApi.getExtraCookieStorage();
                                j.c(extraCookieStorage);
                                RefreshByGenderCookieEvents refreshByGenderCookieEvents = SwitchingProvider.this.iDaggerComponentImpl.storageComponentApi.getRefreshByGenderCookieEvents();
                                j.c(refreshByGenderCookieEvents);
                                return new SetCookieAndRefreshHandler(composerReferences, extraCookieStorage, refreshByGenderCookieEvents, (Ob0.a) SwitchingProvider.this.iDaggerComponentImpl.getOzonIdAppApiProvider.get());
                            }
                        };
                    case 196:
                        AuthStateStorage authStateStorage4 = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage4);
                        CouponActivationRepository couponActivationRepository = this.iDaggerComponentImpl.couponComponentApi.getCouponActivationRepository();
                        j.c(couponActivationRepository);
                        CouponStorage couponStorage = this.iDaggerComponentImpl.couponComponentApi.getCouponStorage();
                        j.c(couponStorage);
                        return (T) new CouponViewModelImpl(authStateStorage4, couponActivationRepository, couponStorage);
                    case 197:
                        T t2 = (T) this.iDaggerComponentImpl.cartAtomBinderComponentApi.getCartAtomBinder();
                        j.c(t2);
                        return t2;
                    case 198:
                        return (T) new FormPageViewModelImpl(this.iDaggerComponentImpl.passFormRepository(), this.iDaggerComponentImpl.maskAutocompleteRepository(), this.iDaggerComponentImpl.photoRepository());
                    case 199:
                        Retrofit retrofit3 = this.iDaggerComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit3);
                        return (T) FormPageModule_Companion_ProvideFormPageApiDataSourceFactory.provideFormPageApiDataSource(retrofit3);
                    default:
                        throw new AssertionError(this.f92812id);
                }
            }

            private T get2() {
                switch (this.f92812id) {
                    case m.e.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                        return (T) new SmsSignViewModelImpl((Context) this.iDaggerComponentImpl.getContextProvider.get(), this.iDaggerComponentImpl.smsSignRepository());
                    case 201:
                        return (T) new LandingLimitViewModelImpl(this.iDaggerComponentImpl.formPageLandingLimitRepository());
                    case 202:
                        CartService cartService = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService);
                        return (T) new AllToCartViewModel(cartService);
                    case 203:
                        DiscountCodeRepositoryImpl discountCodeRepositoryImpl = this.iDaggerComponentImpl.discountCodeRepositoryImpl();
                        JsonParser jsonDeserializer = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer);
                        return (T) new DiscountCodeViewModel(discountCodeRepositoryImpl, jsonDeserializer, this.iDaggerComponentImpl.codeActivationAnalytics());
                    case 204:
                        return (T) new PlayStoriesV3ViewModel(new StoryV3UpdateStore());
                    case 205:
                        return (T) new NavTitleMapper((Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 206:
                        return (T) new TabsOnBoardingViewModel(this.iDaggerComponentImpl.tabOnBoardingRepository(), OnBoardingModule_Companion_ProvideDefaultOnBoardingDisplayOnPageRepositoryFactory.provideDefaultOnBoardingDisplayOnPageRepository(), this.iDaggerComponentImpl.default_());
                    case 207:
                        InterfaceC4875q cookieJar = this.iDaggerComponentImpl.networkComponentApi.getCookieJar();
                        j.c(cookieJar);
                        RefreshByGenderCookieEvents refreshByGenderCookieEvents = this.iDaggerComponentImpl.storageComponentApi.getRefreshByGenderCookieEvents();
                        j.c(refreshByGenderCookieEvents);
                        NetworkComponentConfig networkComponentConfig = this.iDaggerComponentImpl.networkComponentApi.getNetworkComponentConfig();
                        j.c(networkComponentConfig);
                        return (T) new TabsV2ViewModel(cookieJar, refreshByGenderCookieEvents, networkComponentConfig);
                    case 208:
                        FavoritesListsInteractor favoritesListsInteractor = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavoritesListsInteractor();
                        j.c(favoritesListsInteractor);
                        FavoritesListsEventsManager favoritesListsEventsManager = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager);
                        return (T) new ShoppingListsViewModel(favoritesListsInteractor, favoritesListsEventsManager);
                    case 209:
                        MinifyLinkRepository minifyLinkRepository = this.iDaggerComponentImpl.minifyLinkComponentApi.getMinifyLinkRepository();
                        j.c(minifyLinkRepository);
                        return (T) new MinifyLinkViewModel(minifyLinkRepository);
                    case 210:
                        return (T) new AdultConfirmationViewModel(this.iDaggerComponentImpl.adultConfirmationRepository(), new BirthdayModelBuilder());
                    case 211:
                        Retrofit retrofit = this.iDaggerComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) UserAdultConfirmationModule_Companion_ProvideApiFactory.provideApi(retrofit);
                    case 212:
                        return (T) new UserSocialsMobileItemViewModelImpl(this.iDaggerComponentImpl.userSocialsMobileRepository());
                    case 213:
                        return (T) new LogoutOnAllDevicesViewModelImpl(this.iDaggerComponentImpl.logoutOnAllRepository());
                    case 214:
                        DeleteAccountRepository deleteAccountRepository = this.iDaggerComponentImpl.deleteAccountRepository();
                        OrdersCountStorage orderCountsStorage = this.iDaggerComponentImpl.accountComponentApi.getOrderCountsStorage();
                        j.c(orderCountsStorage);
                        return (T) new ConfirmDeleteOtpViewModelImpl(deleteAccountRepository, orderCountsStorage);
                    case com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor.MODULE_VERSION /* 215 */:
                        return (T) new OTPPeriodFormatterBuilder();
                    case 216:
                        return (T) new DeleteAccountDescriptionStickyViewModelImpl(this.iDaggerComponentImpl.deleteAccountRepository());
                    case 217:
                        return (T) new DeleteAccountButtonViewModelImpl(this.iDaggerComponentImpl.deleteAccountRepository(), (Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 218:
                        ActionV2Repository actionRepository = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository);
                        CheckoutPrefetchController checkoutPrefetchController = this.iDaggerComponentImpl.checkoutPrefetchApi.getCheckoutPrefetchController();
                        j.c(checkoutPrefetchController);
                        return (T) new NewCredentialsViewModelImpl(actionRepository, checkoutPrefetchController);
                    case 219:
                        AuthInteractor authInteractor = this.iDaggerComponentImpl.authComponentApi.getAuthInteractor();
                        j.c(authInteractor);
                        AuthFlowMapper authFlowMapper = this.iDaggerComponentImpl.authFlowMapper();
                        UserDataChangedEventBus userDataChangedEventBus = this.iDaggerComponentImpl.accountComponentApi.getUserDataChangedEventBus();
                        j.c(userDataChangedEventBus);
                        return (T) new OTPWidgetViewModelImpl(authInteractor, authFlowMapper, userDataChangedEventBus);
                    case 220:
                        AuthInteractor authInteractor2 = this.iDaggerComponentImpl.authComponentApi.getAuthInteractor();
                        j.c(authInteractor2);
                        AuthFlowMapper authFlowMapper2 = this.iDaggerComponentImpl.authFlowMapper();
                        BiometryInteractor biometryInteractor = this.iDaggerComponentImpl.authComponentApi.getBiometryInteractor();
                        j.c(biometryInteractor);
                        SberIdInteractor sberIdInteractor = this.iDaggerComponentImpl.authComponentApi.getSberIdInteractor();
                        j.c(sberIdInteractor);
                        AuthDeeplinkReceiver authDeeplinkReceiver = this.iDaggerComponentImpl.authComponentApi.getAuthDeeplinkReceiver();
                        j.c(authDeeplinkReceiver);
                        return (T) new AuthViewModel(authInteractor2, authFlowMapper2, biometryInteractor, sberIdInteractor, authDeeplinkReceiver);
                    case 221:
                        Fb0.a biometryAuth = this.iDaggerComponentImpl.authComponentApi.getBiometryAuth();
                        j.c(biometryAuth);
                        return (T) new BiometricAuthViewModelImpl(biometryAuth);
                    case 222:
                        return (T) new AuthOriginStorage();
                    case 223:
                        Context context = (Context) this.iDaggerComponentImpl.getContextProvider.get();
                        EditUserFullNameRepository editUserFullNameRepository = this.iDaggerComponentImpl.editUserFullNameRepository();
                        CheckoutPrefetchController checkoutPrefetchController2 = this.iDaggerComponentImpl.checkoutPrefetchApi.getCheckoutPrefetchController();
                        j.c(checkoutPrefetchController2);
                        return (T) new EditUserFullNameViewModelImpl(context, editUserFullNameRepository, checkoutPrefetchController2);
                    case 224:
                        return (T) new ProductPickerSearchParamsConfigurator();
                    case 225:
                        return (T) new AutopickerBottomSheetConfigurator((AutopickerBottomSheetRepository) this.iDaggerComponentImpl.autopickerBottomSheetRepositoryProvider.get());
                    case 226:
                        return (T) new AutopickerResultConfigurator();
                    case 227:
                        return (T) new ConfirmDeleteResultConfigurator();
                    case 228:
                        return (T) new DismissOnAddressUpdateConfigurator((AddressUpdateManager) this.iDaggerComponentImpl.getAddressManagerProvider.get());
                    case 229:
                        T t2 = (T) this.iDaggerComponentImpl.addressComponentApi.getAddressManager();
                        j.c(t2);
                        return t2;
                    case 230:
                        return (T) new CategoryMainPageFreshConfigurator();
                    case 231:
                        return (T) new AvatarProfileConfigurator(this.iDaggerComponentImpl.avatarProfileViewModelProvider);
                    case 232:
                        AvatarRepository avatarProfileRepository = this.iDaggerComponentImpl.freshNavigationComponentApi.getAvatarProfileRepository();
                        j.c(avatarProfileRepository);
                        CoroutineDispatcherProvider dispatcherProvider = this.iDaggerComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider);
                        ImageResizer imageResizer = this.iDaggerComponentImpl.androidPlatformComponentApi.getImageResizer();
                        j.c(imageResizer);
                        return (T) new AvatarProfileViewModel(avatarProfileRepository, dispatcherProvider, imageResizer);
                    case 233:
                        g ozonRouter = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter);
                        return (T) new ReturnListNormalizeBackStackConfigurator(ozonRouter);
                    case 234:
                        g ozonRouter2 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter2);
                        return (T) new ReturnDetailsNormalizeBackStackConfigurator(ozonRouter2);
                    case 235:
                        return (T) new ReturnActionModalConfigurator();
                    case 236:
                        return (T) new DeliveryDetailsPageConfigurator();
                    case 237:
                        return (T) new MorkovskModalMenuConfigurator();
                    case 238:
                        return (T) new DailyRewardsConfigurator();
                    case 239:
                        return (T) new PrizesConfigurator();
                    case 240:
                        MorkovskOnboardingDelegate morkovskOnboardingDelegate = this.iDaggerComponentImpl.morkovskOnboardingComponentApi.getMorkovskOnboardingDelegate();
                        j.c(morkovskOnboardingDelegate);
                        return (T) new MorkovskOnboardingConfigurator(morkovskOnboardingDelegate);
                    case 241:
                        return (T) new MorkovskWelcomeScreenConfigurator();
                    case 242:
                        return (T) new BloggerRefreshMainPageConfigurator();
                    case 243:
                        return (T) new BloggerRefreshPostsPageAfterFormSubmitConfigurator();
                    case 244:
                        return (T) new BloggerRefreshChannelsPageConfigurator();
                    case 245:
                        return (T) new RefreshAfterDismissAndPopPageConfigurator();
                    case 246:
                        return (T) new BottomSheetInsetsConfigurator();
                    case 247:
                        return (T) new RefreshByFragmentResultPageConfigurator();
                    case 248:
                        return (T) new EdgeToEdgeConfigurator();
                    case 249:
                        return (T) new TopEdgeConfigurator();
                    case m.e.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                        return (T) new ShareLinkBloggerCopyResultConfigurator(this.iDaggerComponentImpl.shareLinkBloggerViewModelProvider);
                    case 251:
                        return (T) new BloggerPersonalDataKeyboardConfigurator();
                    case 252:
                        return (T) new AddressSearchSheetResultConfigurator();
                    case 253:
                        return (T) new ScanItIntroConfigurator();
                    case 254:
                        return (T) new LightStatusBarConfigurator();
                    case 255:
                        return (T) new SearchHideKeyboardOnOpenConfigurator();
                    case 256:
                        return (T) new FeedbackTilePreCreationConfigurator();
                    case 257:
                        return (T) new CategoryPageConfigurator((FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 258:
                        a aVar = this.iDaggerComponentImpl.suggestionsPrefetchViewModelProvider;
                        SearchUrlPrefetchService searchUrlPrefetchService = this.iDaggerComponentImpl.searchPrefetchApi.getSearchUrlPrefetchService();
                        j.c(searchUrlPrefetchService);
                        return (T) new SuggestionsPrefetchConfigurator(aVar, searchUrlPrefetchService, this.iDaggerComponentImpl.modifySearchUrlViewModelProvider);
                    case 259:
                        return (T) new SuggestionsPrefetchViewModel();
                    case 260:
                        return (T) new RemoveRVItemAnimationConfigurator();
                    case 261:
                        return (T) new CheckoutRefreshPageConfigurator();
                    case 262:
                        return (T) new TravelFiltersKeyboardInsetConfigurator();
                    case 263:
                        TravelStorageManagerHolder travelStorageManagerHolder = this.iDaggerComponentImpl.travelStorageApi.getTravelStorageManagerHolder();
                        j.c(travelStorageManagerHolder);
                        return (T) new TravelPassengersPageStorageInitializerConfigurator(travelStorageManagerHolder);
                    case 264:
                        TravelStorageManagerHolder travelStorageManagerHolder2 = this.iDaggerComponentImpl.travelStorageApi.getTravelStorageManagerHolder();
                        j.c(travelStorageManagerHolder2);
                        return (T) new IconChooserRootPageConfigurator(travelStorageManagerHolder2);
                    case 265:
                        TravelStorageManagerHolder travelStorageManagerHolder3 = this.iDaggerComponentImpl.travelStorageApi.getTravelStorageManagerHolder();
                        j.c(travelStorageManagerHolder3);
                        return (T) new IconChooserModalPageConfigurator(travelStorageManagerHolder3);
                    case 266:
                        return (T) new ModalParentRefreshConfigurator(this.iDaggerComponentImpl.modalParentRefreshSharedViewModelProvider);
                    case 267:
                        g ozonRouter3 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter3);
                        return (T) new TravelTimeoutRedirectConfigurator(ozonRouter3);
                    case 268:
                        return (T) new TravelAnchorRefreshConfigurator();
                    case 269:
                        return (T) new MainTabRedirectOnBackPressedConfigurator();
                    case 270:
                        return (T) new TravelDownloadFileConfigurator(this.iDaggerComponentImpl.getFileDownloaderViewModelProvider);
                    case 271:
                        return (T) new TravelRefreshOnRestartPageConfigurator();
                    case 272:
                        return (T) new TravelHideAppbarConfigurator();
                    case 273:
                        return (T) new SearchFormRefreshPageConfigurator();
                    case 274:
                        a aVar2 = this.iDaggerComponentImpl.mapInfoDeeplinkRouteViewModelProvider;
                        DeeplinkRouteEventReceiver deeplinkRouteEventReceiver = this.iDaggerComponentImpl.deeplinkRouteComponentApi.getDeeplinkRouteEventReceiver();
                        j.c(deeplinkRouteEventReceiver);
                        return (T) new MapInfoDeeplinkRouteConfigurator(aVar2, deeplinkRouteEventReceiver);
                    case 275:
                        return (T) new MapInfoDeeplinkRouteViewModel();
                    case 276:
                        return (T) new FullScreenInsetsConfigurator();
                    case 277:
                        return (T) new TravelMainPreCreateConfigurator(Jb.d.a(this.iDaggerComponentImpl.preCreateWidgetsFacadeProvider));
                    case 278:
                        Ib.a a11 = Jb.d.a(this.iDaggerComponentImpl.setOfPreCreateInfoProvider);
                        FeatureService featureService = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        return (T) new PreCreateWidgetsFacade(a11, featureService);
                    case 279:
                        return (T) A.F(new TravelCellListPreCreationInfoProvider(), new TravelNavBarPreCreationInfoProvider(), new TravelNavTitlePreCreationInfoProvider(), new TravelFiltersButtonPreCreationInfoProvider(), new RailwayScrollPriceCalendarPreCreateInfoProvider(), new IconButtonPreCreateInfoProvider(), new MainTabsPreCreationInfoProvider(), new SearchFormV4PreCreateInfoProvider(), new SearchFormV5PreCreateInfoProvider(), new SearchFormBarPreCreationInfoProvider(), new HotTicketsPreCreationInfoProvider(), new MiniAppTitlePreCreationInfoProvider(), new CellHorizontalListPreCreationInfoProvider(), new SearchResultsNavTitleV2PreCreateInfoProvider(), new HotelsHorizontalShelvesPreCreationInfoProvider(), new AddressBookBarV2PreCreateInfoProvider(), new SearchBarPreCreateInfoProvider(), this.iDaggerComponentImpl.bigPromoCounterNavBarPreCreateInfoProvider(), new PremiumPointsPreCreateInfoProvider(), new AdvBannerV4PreCreateInfoProvider(), new HammersPreCreateInfoProvider(), this.iDaggerComponentImpl.navigationSliderV2PreCreateInfoProvider(), new MessengerCounterPreCreateInfoProvider(), new OrderTrackingV4PreCreateInfoProvider(), new TagListPreCreateInfoProvider(), new SearchResultsV2PreCreateInfoProvider(), new SkuScrollPreCreateInfoProvider(), this.iDaggerComponentImpl.tileGrid2PreCreateProvider(), new ShellNavBarV2PreCreateInfoProvider(), new AddressSelectorLitePreCreateInfoProvider(), new MiniAppHeaderPreCreateInfoProvider(), new PromoCarouselPreCreateInfoProvider(), new ServiceCarouselPreCreateInfoProvider(), new CatalogueTabsPreCreateInfoProvider(), new UniversalObjectWidgetPreCreateProvider(), new ScrollActionListPreCreateInfoProvider(), new PaymentDetailsPreCreateInfoProvider(), new RailwaySearchResultsV3PreCreateInfoProvider(), new RailwaySearchResultsV4PreCreateInfoProvider());
                    case 280:
                        return (T) new TravelThankYouPreCreateConfigurator(Jb.d.a(this.iDaggerComponentImpl.preCreateWidgetsFacadeProvider));
                    case 281:
                        return (T) new TravelOrderListPreCreateConfigurator(Jb.d.a(this.iDaggerComponentImpl.preCreateWidgetsFacadeProvider));
                    case 282:
                        return (T) new TravelRailwaySERPPreCreateConfigurator(Jb.d.a(this.iDaggerComponentImpl.preCreateWidgetsFacadeProvider));
                    case 283:
                        return (T) new TravelAddNewPassengerFormV2InputSelectorConfigurator();
                    case 284:
                        return (T) new TravelAddNewPassengerFormV2InputDateSelectorConfigurator();
                    case 285:
                        TravelStorageManagerHolder travelStorageManagerHolder4 = this.iDaggerComponentImpl.travelStorageApi.getTravelStorageManagerHolder();
                        j.c(travelStorageManagerHolder4);
                        return (T) new HotelsBookPageStorageInitializerConfigurator(travelStorageManagerHolder4);
                    case 286:
                        TravelStorageManagerHolder travelStorageManagerHolder5 = this.iDaggerComponentImpl.travelStorageApi.getTravelStorageManagerHolder();
                        j.c(travelStorageManagerHolder5);
                        return (T) new HotelsBookModalPageConfigurator(travelStorageManagerHolder5);
                    case 287:
                        return (T) new HotelsBookTotalRefreshConfigurator();
                    case 288:
                        return (T) new AdditionalServicesPageConfigurator();
                    case 289:
                        return (T) new HotelsGalleryFullConfigurator();
                    case 290:
                        return (T) new HotelsMapInfoConfigurator();
                    case 291:
                        return (T) new TouristCountSelectorConfigurator();
                    case 292:
                        CoroutineDispatcherProvider dispatcherProvider2 = this.iDaggerComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider2);
                        JsonParser jsonDeserializer2 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer2);
                        return (T) new RemoveSplitConfigurator(dispatcherProvider2, jsonDeserializer2);
                    case 293:
                        a aVar3 = this.iDaggerComponentImpl.homePageViewModelImplProvider;
                        InAppUpdateController inAppUpdateController = this.iDaggerComponentImpl.inAppUpdateComponentApi.getInAppUpdateController();
                        j.c(inAppUpdateController);
                        return (T) new HomePageConfigurator(aVar3, inAppUpdateController, (PreCreateWidgetsFacade) this.iDaggerComponentImpl.preCreateWidgetsFacadeProvider.get(), (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 294:
                        return (T) new HomePageViewModelImpl(this.iDaggerComponentImpl.protectionAppDialogHostApi(), this.iDaggerComponentImpl.setOfLauncherStateDialogProcessor(), (ActivityInitializer) this.iDaggerComponentImpl.bindActivityInitializerProvider.get());
                    case 295:
                        FirstLaunchStateStorage firstLaunchStateStorage = this.iDaggerComponentImpl.storageComponentApi.getFirstLaunchStateStorage();
                        j.c(firstLaunchStateStorage);
                        return (T) new BxNotificationPermissionProcessor(firstLaunchStateStorage, (Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 296:
                        FirstLaunchStateStorage firstLaunchStateStorage2 = this.iDaggerComponentImpl.storageComponentApi.getFirstLaunchStateStorage();
                        j.c(firstLaunchStateStorage2);
                        return (T) new SelectNotificationPermissionProcessor(firstLaunchStateStorage2, (Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 297:
                        ComposerLocationRepository composerLocationRepository = this.iDaggerComponentImpl.locationComponentApi.getComposerLocationRepository();
                        j.c(composerLocationRepository);
                        return (T) new ActivityInitializerImpl(composerLocationRepository);
                    case 298:
                        return (T) new UploadPhotosConfigurator(this.iDaggerComponentImpl.componentUploadPhotosViewModelImplProvider);
                    case 299:
                        PickedAttachmentsMapper.ReviewAttachmentsMapper reviewAttachmentsMapper = new PickedAttachmentsMapper.ReviewAttachmentsMapper();
                        ImageResizer imageResizer2 = this.iDaggerComponentImpl.androidPlatformComponentApi.getImageResizer();
                        j.c(imageResizer2);
                        UploadImageUseCase uploadImageUseCase = this.iDaggerComponentImpl.mediaUploadComponentApi.getUploadImageUseCase();
                        j.c(uploadImageUseCase);
                        return (T) new ComponentUploadPhotosViewModelImpl(reviewAttachmentsMapper, imageResizer2, uploadImageUseCase);
                    default:
                        throw new AssertionError(this.f92812id);
                }
            }

            private T get3() {
                switch (this.f92812id) {
                    case 300:
                        ReturnCreationEventManager returnCreationEventManager = this.iDaggerComponentImpl.rmsComponentApi.getReturnCreationEventManager();
                        j.c(returnCreationEventManager);
                        return (T) new ReturnCreationItemRemovedConfigurator(returnCreationEventManager);
                    case 301:
                        ReturnCreationEventManager returnCreationEventManager2 = this.iDaggerComponentImpl.rmsComponentApi.getReturnCreationEventManager();
                        j.c(returnCreationEventManager2);
                        return (T) new ReturnCreationPhotoUpdatedConfigurator(returnCreationEventManager2);
                    case 302:
                        return (T) new PhotoPickerConfigurator();
                    case 303:
                        g ozonRouter = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter);
                        FavoritesListsEventsManager favoritesListsEventsManager = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager);
                        return (T) new CreateShoppingListConfigurator(ozonRouter, favoritesListsEventsManager);
                    case 304:
                        FavoritesListsEventsManager favoritesListsEventsManager2 = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager2);
                        return (T) new RenameFavoritesListConfigurator(favoritesListsEventsManager2, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 305:
                        FavoritesListsEventsManager favoritesListsEventsManager3 = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager3);
                        return (T) new PinStatusFavoritesListConfigurator(favoritesListsEventsManager3);
                    case 306:
                        FavoritesListsEventsManager favoritesListsEventsManager4 = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager4);
                        return (T) new DeleteFavoritesListConfigurator(favoritesListsEventsManager4);
                    case 307:
                        FavoritesListsEventsManager favoritesListsEventsManager5 = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager5);
                        return (T) new ListAccessChangedConfigurator(favoritesListsEventsManager5);
                    case 308:
                        FavoritesListsEventsManager favoritesListsEventsManager6 = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager6);
                        FavoritesComposerActionHandler favoritesComposerActionHandler = this.iDaggerComponentImpl.favoritesComposerActionHandler();
                        l tokenizedAnalytics = this.iDaggerComponentImpl.composerComponentApi.getTokenizedAnalytics();
                        j.c(tokenizedAnalytics);
                        return (T) new CreateFavoritesListConfigurator(favoritesListsEventsManager6, favoritesComposerActionHandler, tokenizedAnalytics);
                    case 309:
                        return (T) new RemoveFavoritesListConfigurator(Jb.d.a(this.iDaggerComponentImpl.shoppingListsViewModelProvider));
                    case 310:
                        return (T) new RemoveFromFavoritesListConfigurator();
                    case 311:
                        return (T) new AccessControlConfigurator(this.iDaggerComponentImpl.accessControlViewModelProvider);
                    case 312:
                        FavoritesListsInteractor favoritesListsInteractor = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavoritesListsInteractor();
                        j.c(favoritesListsInteractor);
                        FeatureChecker featureChecker = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        l tokenizedAnalytics2 = this.iDaggerComponentImpl.composerComponentApi.getTokenizedAnalytics();
                        j.c(tokenizedAnalytics2);
                        return (T) new AccessControlViewModel(favoritesListsInteractor, featureChecker, tokenizedAnalytics2);
                    case 313:
                        FavoriteEventManager favEventManager = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavEventManager();
                        j.c(favEventManager);
                        return (T) new OnFavoriteEntityChangedConfigurator(favEventManager);
                    case 314:
                        FavoriteEventManager favEventManager2 = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavEventManager();
                        j.c(favEventManager2);
                        return (T) new EditListFavoriteConfigurator(favEventManager2, this.iDaggerComponentImpl.favoritesComposerActionHandler());
                    case 315:
                        FavoriteManager favoriteManager = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavoriteManager();
                        j.c(favoriteManager);
                        return (T) new CatalogFavoritesConfigurator(favoriteManager);
                    case 316:
                        FavoriteManager favoriteManager2 = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavoriteManager();
                        j.c(favoriteManager2);
                        return (T) new UpdateByFavoritesConfigurator(favoriteManager2);
                    case 317:
                        g ozonRouter2 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter2);
                        FavoritesListsEventsManager favoritesListsEventsManager7 = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager7);
                        return (T) new CreateShoppingListAsyncConfigurator(ozonRouter2, favoritesListsEventsManager7);
                    case 318:
                        FavoritesListsEventsManager favoritesListsEventsManager8 = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager8);
                        FavoritesComposerActionHandler favoritesComposerActionHandler2 = this.iDaggerComponentImpl.favoritesComposerActionHandler();
                        l tokenizedAnalytics3 = this.iDaggerComponentImpl.composerComponentApi.getTokenizedAnalytics();
                        j.c(tokenizedAnalytics3);
                        return (T) new CreateFavoritesListAsyncConfigurator(favoritesListsEventsManager8, favoritesComposerActionHandler2, tokenizedAnalytics3);
                    case 319:
                        FavoritesListsEventsManager favoritesListsEventsManager9 = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager9);
                        return (T) new DeleteFavoritesListAsyncConfigurator(favoritesListsEventsManager9);
                    case 320:
                        FavoritesListsEventsManager favoritesListsEventsManager10 = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager10);
                        return (T) new PinStatusFavoritesListAsyncConfigurator(favoritesListsEventsManager10);
                    case 321:
                        FavoritesListsEventsManager favoritesListsEventsManager11 = this.iDaggerComponentImpl.favoritesUIComponentApi.getFavoritesListsEventsManager();
                        j.c(favoritesListsEventsManager11);
                        return (T) new RenameFavoritesListAsyncConfigurator(favoritesListsEventsManager11, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 322:
                        FavoriteEventManager favEventManager3 = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavEventManager();
                        j.c(favEventManager3);
                        return (T) new EditListFavoriteAsyncConfigurator(favEventManager3, this.iDaggerComponentImpl.favoritesComposerActionHandler());
                    case 323:
                        return (T) new RemoveFromFavoritesListAsyncConfigurator();
                    case 324:
                        return (T) new FavoritesSellersScrollToUpConfigurator();
                    case 325:
                        return (T) new CreateShoppingListInputInsetsConfigurator();
                    case 326:
                        FamilyAccountRefresher familyAccountRefresher = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFamilyAccountRefresher();
                        j.c(familyAccountRefresher);
                        return (T) new FamilyAccountConfigurator(familyAccountRefresher);
                    case 327:
                        return (T) new FavoritesMediaPickerConfigurator();
                    case 328:
                        ReturnUpdateInteractor returnChangeInteractor = this.iDaggerComponentImpl.rmsComponentApi.getReturnChangeInteractor();
                        j.c(returnChangeInteractor);
                        return (T) new ReturnListUpdateConfigurator(returnChangeInteractor);
                    case 329:
                        a aVar = this.iDaggerComponentImpl.selectPaymentViewModelProvider;
                        g ozonRouter3 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter3);
                        CheckoutPrefetchController checkoutPrefetchController = this.iDaggerComponentImpl.checkoutPrefetchApi.getCheckoutPrefetchController();
                        j.c(checkoutPrefetchController);
                        return (T) new AddUserCardConfigurator(aVar, ozonRouter3, checkoutPrefetchController);
                    case 330:
                        return (T) new CategoryPreCreationConfigurator(Jb.d.a(this.iDaggerComponentImpl.preCreateWidgetsFacadeProvider));
                    case 331:
                        return (T) new CategoryMainPageFreshPreCreationConfigurator(Jb.d.a(this.iDaggerComponentImpl.preCreateWidgetsFacadeProvider));
                    case 332:
                        return (T) new SearchPreCreationConfigurator(Jb.d.a(this.iDaggerComponentImpl.preCreateWidgetsFacadeProvider));
                    case 333:
                        a aVar2 = this.iDaggerComponentImpl.comparisonRefreshViewModelProvider;
                        a aVar3 = this.iDaggerComponentImpl.galleryV3ViewModelImplProvider;
                        CartService cartService = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService);
                        FavoriteInteractor favoriteInteractor = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavoriteInteractor();
                        j.c(favoriteInteractor);
                        FeatureChecker featureChecker2 = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        PdpScreenStateHolder$CacheState pdpScreenStateHolderCacheState = this.iDaggerComponentImpl.pdpScreenStateHolderComponentApi.pdpScreenStateHolderCacheState();
                        j.c(pdpScreenStateHolderCacheState);
                        PdpOfflineScreenWidgetsData pdpEmptyScreenService = this.iDaggerComponentImpl.pdpOfflineScreenComponentApi.pdpEmptyScreenService();
                        j.c(pdpEmptyScreenService);
                        return (T) new PdpConfigurator(aVar2, aVar3, cartService, favoriteInteractor, featureChecker2, pdpScreenStateHolderCacheState, pdpEmptyScreenService);
                    case 334:
                        return (T) new ComparisonRefreshViewModel();
                    case 335:
                        return (T) new GalleryV3ViewModelImpl();
                    case 336:
                        return (T) new PdpGalleryFullViewConfigurator();
                    case 337:
                        AdultState adultState = this.iDaggerComponentImpl.storageComponentApi.getAdultState();
                        j.c(adultState);
                        return (T) new RefreshByAdultStateConfigurator(adultState);
                    case 338:
                        return (T) new QuestionsConfigurator(this.iDaggerComponentImpl.callApiViewModelImplProvider);
                    case 339:
                        AuthStateStorage authStateStorage = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage);
                        return (T) new CallApiViewModelImpl(authStateStorage, this.iDaggerComponentImpl.productReviewRepository());
                    case 340:
                        return (T) new ComparisonConfigurator(this.iDaggerComponentImpl.addToComparisonViewModelProvider, this.iDaggerComponentImpl.comparisonRefreshViewModelProvider);
                    case 341:
                        return (T) new AddToComparisonViewModel(this.iDaggerComponentImpl.comparisonRepository());
                    case 342:
                        return (T) new OrderDoneLiteInfoConfigurator();
                    case 343:
                        return (T) new RelatedProductsBottomSheetConfigurator();
                    case 344:
                        return (T) new ReviewSuccessConfigurator();
                    case 345:
                        return (T) new SubmitCachedReviewConfigurator(this.iDaggerComponentImpl.submitCachedReviewViewModelProvider);
                    case 346:
                        ActionV2Repository actionRepository = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository);
                        ReviewFormRepository reviewFormRepository = this.iDaggerComponentImpl.ugcReviewFormComponentApi.getReviewFormRepository();
                        j.c(reviewFormRepository);
                        return (T) new SubmitCachedReviewViewModel(actionRepository, reviewFormRepository);
                    case 347:
                        return (T) new RefreshSelectionConfigurator();
                    case 348:
                        return (T) new MediaPickerConfigurator();
                    case 349:
                        return (T) new ReviewFormConfigurator();
                    case 350:
                        return (T) new ReviewConfigurator(this.iDaggerComponentImpl.listReviewSortsViewModelProvider);
                    case 351:
                        return (T) new ListReviewSortsViewModel();
                    case 352:
                        return (T) new CommentsListConfigurator();
                    case 353:
                        return (T) new ReviewGalleryV2Configurator();
                    case 354:
                        FeatureService featureService = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        return (T) new ListReviewConfigurator(featureService);
                    case 355:
                        return (T) new AdditionRecycledViewPoolConfigurator();
                    case 356:
                        return (T) new SocialProfileConfigurator();
                    case 357:
                        return (T) new TopAuthorsLandingConfigurator();
                    case 358:
                        return (T) new TopAuthorsOnboardingConfigurator();
                    case 359:
                        return (T) new StaticTeenModeConfigurator();
                    case 360:
                        return (T) new DynamicTeenModeConfigurator();
                    case 361:
                        return (T) new HideToolbarConfigurator();
                    case 362:
                        PlayerPreloader playerPreloader = this.iDaggerComponentImpl.videoComponentApi.getPlayerPreloader();
                        j.c(playerPreloader);
                        return (T) new VideoPreloadCleanerConfigurator(playerPreloader);
                    case 363:
                        return (T) new VideoMoleculeConfigurator();
                    case 364:
                        return (T) new PromoReviewRefreshConfigurator();
                    case 365:
                        return (T) new LegalsFlowConfigurator();
                    case 366:
                        LegalsResultStateHolder legalsResultStateHolder = this.iDaggerComponentImpl.legalsResultStateHolderComponentApi.getLegalsResultStateHolder();
                        j.c(legalsResultStateHolder);
                        return (T) new AddLegalMobileConfigurator(legalsResultStateHolder);
                    case 367:
                        return (T) new AddressSearchConfigurator(this.iDaggerComponentImpl.docsDeliveryFormViewModelImplProvider);
                    case 368:
                        DocsDeliveryRepository docsDeliveryRepository = this.iDaggerComponentImpl.docsDeliveryRepository();
                        OzonGeoProxyClient ozonGeoProxyClient = this.iDaggerComponentImpl.locationComponentApi.getOzonGeoProxyClient();
                        j.c(ozonGeoProxyClient);
                        AreaLocalStore areaLocalStore = this.iDaggerComponentImpl.locationComponentApi.getAreaLocalStore();
                        j.c(areaLocalStore);
                        return (T) new DocsDeliveryFormViewModelImpl(docsDeliveryRepository, ozonGeoProxyClient, areaLocalStore);
                    case 369:
                        return (T) new ConsigneeAddressSearchConfigurator();
                    case 370:
                        return (T) new RefreshPageConfigurator();
                    case 371:
                        return (T) new RegistrationConfigurator();
                    case 372:
                        return (T) new LegalDetailsFileSelectConfigurator();
                    case 373:
                        return (T) new RecActsDeclinerFileSelectConfigurator();
                    case 374:
                        return (T) new ResultControllerConfigurator(this.iDaggerComponentImpl.formPageViewModelImplProvider);
                    case 375:
                        return (T) new PartPaymentSummaryPageConfigurator(this.iDaggerComponentImpl.formPageViewModelImplProvider);
                    case 376:
                        CartEventsController cartEventsController = this.iDaggerComponentImpl.cartComponentApi.getCartEventsController();
                        j.c(cartEventsController);
                        CoroutineDispatcherProvider dispatcherProvider = this.iDaggerComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider);
                        JsonParser jsonDeserializer = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer);
                        AddressLocalStore addressLocalStore = this.iDaggerComponentImpl.locationComponentApi.getAddressLocalStore();
                        j.c(addressLocalStore);
                        FeatureService featureService2 = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService2);
                        return (T) new CartConfigurator(cartEventsController, dispatcherProvider, jsonDeserializer, addressLocalStore, featureService2);
                    case 377:
                        FeatureChecker featureChecker3 = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        CartService cartService2 = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService2);
                        return (T) new CartPreCreateViewConfiguratorV2(featureChecker3, cartService2);
                    case 378:
                        CartScreenStateHolder cartScreenStateHolder = this.iDaggerComponentImpl.cartServiceApi.getCartScreenStateHolder();
                        j.c(cartScreenStateHolder);
                        CurrentMiniAppHolder currentMiniAppHolder = this.iDaggerComponentImpl.navigationComponentApi.getCurrentMiniAppHolder();
                        j.c(currentMiniAppHolder);
                        return (T) new CartScreenStateConfigurator(cartScreenStateHolder, currentMiniAppHolder, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 379:
                        CartService cartService3 = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService3);
                        CartScreenStateHolder cartScreenStateHolder2 = this.iDaggerComponentImpl.cartServiceApi.getCartScreenStateHolder();
                        j.c(cartScreenStateHolder2);
                        CoroutineDispatcherProvider dispatcherProvider2 = this.iDaggerComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider2);
                        return (T) new AddToCartLoaderConfigurator(cartService3, cartScreenStateHolder2, dispatcherProvider2);
                    case 380:
                        return (T) new CartSharedViewPoolSizeSetterConfigurator();
                    case 381:
                        CartService cartService4 = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService4);
                        CartEventsController cartEventsController2 = this.iDaggerComponentImpl.cartComponentApi.getCartEventsController();
                        j.c(cartEventsController2);
                        CartChangeChecker cartChangeChecker = this.iDaggerComponentImpl.cartServiceApi.getCartChangeChecker();
                        j.c(cartChangeChecker);
                        e miniAppConfigHolder = this.iDaggerComponentImpl.navigationComponentApi.getMiniAppConfigHolder();
                        j.c(miniAppConfigHolder);
                        CartModeManager cartModeService = this.iDaggerComponentImpl.cartServiceApi.getCartModeService();
                        j.c(cartModeService);
                        CartNavigationService cartNavigationService = this.iDaggerComponentImpl.cartServiceApi.getCartNavigationService();
                        j.c(cartNavigationService);
                        return (T) new CartRefreshEventConfigurator(cartService4, cartEventsController2, cartChangeChecker, miniAppConfigHolder, cartModeService, cartNavigationService);
                    case 382:
                        CartService cartService5 = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService5);
                        CartEventsController cartEventsController3 = this.iDaggerComponentImpl.cartComponentApi.getCartEventsController();
                        j.c(cartEventsController3);
                        CartChangeChecker cartChangeChecker2 = this.iDaggerComponentImpl.cartServiceApi.getCartChangeChecker();
                        j.c(cartChangeChecker2);
                        e miniAppConfigHolder2 = this.iDaggerComponentImpl.navigationComponentApi.getMiniAppConfigHolder();
                        j.c(miniAppConfigHolder2);
                        CartModeManager cartModeService2 = this.iDaggerComponentImpl.cartServiceApi.getCartModeService();
                        j.c(cartModeService2);
                        CartNavigationService cartNavigationService2 = this.iDaggerComponentImpl.cartServiceApi.getCartNavigationService();
                        j.c(cartNavigationService2);
                        return (T) new FamilyCartRefreshEventConfigurator(cartService5, cartEventsController3, cartChangeChecker2, miniAppConfigHolder2, cartModeService2, cartNavigationService2);
                    case 383:
                        CartEventsController cartEventsController4 = this.iDaggerComponentImpl.cartComponentApi.getCartEventsController();
                        j.c(cartEventsController4);
                        CartModeManager cartModeService3 = this.iDaggerComponentImpl.cartServiceApi.getCartModeService();
                        j.c(cartModeService3);
                        CartNavigationService cartNavigationService3 = this.iDaggerComponentImpl.cartServiceApi.getCartNavigationService();
                        j.c(cartNavigationService3);
                        e miniAppConfigHolder3 = this.iDaggerComponentImpl.navigationComponentApi.getMiniAppConfigHolder();
                        j.c(miniAppConfigHolder3);
                        return (T) new CartOnScreenEventHandlerConfigurator(cartEventsController4, cartModeService3, cartNavigationService3, miniAppConfigHolder3);
                    case 384:
                        return (T) new CartKeyboardInsetConfigurator();
                    case 385:
                        return (T) new CartRestoreItemConfigurator();
                    case 386:
                        return (T) new FreshCartConfigurator();
                    case 387:
                        CartModeManager cartModeService4 = this.iDaggerComponentImpl.cartServiceApi.getCartModeService();
                        j.c(cartModeService4);
                        g ozonRouter4 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter4);
                        return (T) new ResetCartModeConfigurator(cartModeService4, ozonRouter4);
                    case 388:
                        return (T) new CartSplitSwipeConfigurator((FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get(), this.iDaggerComponentImpl.swipeViewModelProvider);
                    case 389:
                        return (T) new SwipeViewModel((HandlersInhibitor) this.iDaggerComponentImpl.handlersInhibitorProvider.get(), new GroupSwipeCoordinator());
                    case 390:
                        CartEventsController cartEventsController5 = this.iDaggerComponentImpl.cartComponentApi.getCartEventsController();
                        j.c(cartEventsController5);
                        CoroutineDispatcherProvider dispatcherProvider3 = this.iDaggerComponentImpl.coroutineDispatchersComponentApi.getDispatcherProvider();
                        j.c(dispatcherProvider3);
                        JsonParser jsonDeserializer2 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer2);
                        AddressLocalStore addressLocalStore2 = this.iDaggerComponentImpl.locationComponentApi.getAddressLocalStore();
                        j.c(addressLocalStore2);
                        return (T) new FamilyCartConfigurator(cartEventsController5, dispatcherProvider3, jsonDeserializer2, addressLocalStore2);
                    case 391:
                        CartEventsController cartEventsController6 = this.iDaggerComponentImpl.cartComponentApi.getCartEventsController();
                        j.c(cartEventsController6);
                        CartModeManager cartModeService5 = this.iDaggerComponentImpl.cartServiceApi.getCartModeService();
                        j.c(cartModeService5);
                        CartNavigationService cartNavigationService4 = this.iDaggerComponentImpl.cartServiceApi.getCartNavigationService();
                        j.c(cartNavigationService4);
                        e miniAppConfigHolder4 = this.iDaggerComponentImpl.navigationComponentApi.getMiniAppConfigHolder();
                        j.c(miniAppConfigHolder4);
                        return (T) new FamilyCartOnScreenEventHandlerConfigurator(cartEventsController6, cartModeService5, cartNavigationService4, miniAppConfigHolder4);
                    case 392:
                        CartPrefetchController cartPrefetchController = this.iDaggerComponentImpl.cartServiceApi.getCartPrefetchController();
                        j.c(cartPrefetchController);
                        return (T) new CartPrefetchConfigurator(cartPrefetchController);
                    case 393:
                        AsyncCartViewModelProviderWrapper asyncCartViewModelProvider = this.iDaggerComponentImpl.cartServiceApi.getAsyncCartViewModelProvider();
                        j.c(asyncCartViewModelProvider);
                        return (T) new AsyncCartConfigurator(asyncCartViewModelProvider);
                    case 394:
                        g ozonRouter5 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter5);
                        return (T) new OrderDoneConfigurator(ozonRouter5);
                    case 395:
                        return (T) new RefreshOnStartPageConfigurator();
                    case 396:
                        CartService cartService6 = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService6);
                        return (T) new OrderDoneRefreshCartConfigurator(cartService6);
                    case 397:
                        g ozonRouter6 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter6);
                        e miniAppConfigHolder5 = this.iDaggerComponentImpl.navigationComponentApi.getMiniAppConfigHolder();
                        j.c(miniAppConfigHolder5);
                        return (T) new DeliveryOrderDoneConfigurator(ozonRouter6, miniAppConfigHolder5);
                    case 398:
                        CheckoutScrollToWidgetKeyRepository checkoutScrollToWidgetKeyRepository = this.iDaggerComponentImpl.checkoutCommonComponentApi.getCheckoutScrollToWidgetKeyRepository();
                        j.c(checkoutScrollToWidgetKeyRepository);
                        return (T) new ScrollToWidgetConfigurator(checkoutScrollToWidgetKeyRepository);
                    case 399:
                        return (T) new CheckoutPreCreationConfigurator((FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    default:
                        throw new AssertionError(this.f92812id);
                }
            }

            private T get4() {
                switch (this.f92812id) {
                    case 400:
                        return (T) new AddressPartsInputPageConfigurator();
                    case 401:
                        return (T) new ru.ozon.app.android.checkoutgeo.checkout.configurators.ConfirmDeleteResultConfigurator();
                    case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                        CartEventsController cartEventsController = this.iDaggerComponentImpl.cartComponentApi.getCartEventsController();
                        j.c(cartEventsController);
                        return (T) new RemoveRfbsSplitConfigurator(cartEventsController);
                    case 403:
                        ReferrerValueController referrerValueController = this.iDaggerComponentImpl.composerComponentApi.getReferrerValueController();
                        j.c(referrerValueController);
                        return (T) new ClearReferrerConfigurator(referrerValueController);
                    case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                        return (T) new CheckoutRefreshConfigurator();
                    case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                        Context context = (Context) this.iDaggerComponentImpl.getContextProvider.get();
                        JsonSerializer jsonSerializer = this.iDaggerComponentImpl.networkComponentApi.getJsonSerializer();
                        j.c(jsonSerializer);
                        JsonParser jsonDeserializer = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer);
                        return (T) new PreloadImagesConfigurator(context, jsonSerializer, jsonDeserializer);
                    case WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED /* 406 */:
                        return (T) new CardBindingConfigurator();
                    case 407:
                        CheckoutPrefetchController checkoutPrefetchController = this.iDaggerComponentImpl.checkoutPrefetchApi.getCheckoutPrefetchController();
                        j.c(checkoutPrefetchController);
                        return (T) new CheckoutClearCacheConfigurator(checkoutPrefetchController);
                    case 408:
                        return (T) new OptionsSelectorSheetResultConfigurator();
                    case WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR /* 409 */:
                        return (T) new SearchSheetResultConfigurator();
                    case WalletConstants.ERROR_CODE_INVALID_TRANSACTION /* 410 */:
                        return (T) new YandexSearchSheetResultConfigurator();
                    case WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE /* 411 */:
                        NotificationsManager notificationsManager = this.iDaggerComponentImpl.notificationComponentApi.getNotificationsManager();
                        j.c(notificationsManager);
                        return (T) new UpdateChatInfoConfigurator(notificationsManager);
                    case WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION /* 412 */:
                        return (T) new RefreshAnchorScreenConfigurator();
                    case WalletConstants.ERROR_CODE_UNKNOWN /* 413 */:
                        AuthStateStorage authStateStorage = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage);
                        CachePreferences geCachePreferences = this.iDaggerComponentImpl.composerComponentApi.geCachePreferences();
                        j.c(geCachePreferences);
                        return (T) new OrderCacheConfigurator(authStateStorage, geCachePreferences);
                    case 414:
                        return (T) new ProfileAvatarConfigurator();
                    case 415:
                        return (T) new ProfileInfoConfigurator();
                    case 416:
                        SessionListUpdatedEventBus sessionListUpdatedEventBus = this.iDaggerComponentImpl.accountComponentApi.getSessionListUpdatedEventBus();
                        j.c(sessionListUpdatedEventBus);
                        return (T) new SessionListUpdatedConfigurator(sessionListUpdatedEventBus);
                    case 417:
                        EmailActualizedEventBus emailActualizedEventBus = this.iDaggerComponentImpl.accountComponentApi.getEmailActualizedEventBus();
                        j.c(emailActualizedEventBus);
                        return (T) new RefreshOnActualizeEmailConfigurator(emailActualizedEventBus);
                    case 418:
                        UserDataChangedEventBus userDataChangedEventBus = this.iDaggerComponentImpl.accountComponentApi.getUserDataChangedEventBus();
                        j.c(userDataChangedEventBus);
                        return (T) new RefreshOnUserDataChangedConfigurator(userDataChangedEventBus);
                    case 419:
                        OrderTrackingBus orderTrackingBus = new OrderTrackingBus();
                        a aVar = this.iDaggerComponentImpl.orderListChangeStateViewModelProvider;
                        a aVar2 = this.iDaggerComponentImpl.orderTrackingV4ViewModelProvider;
                        BarcodeCacheManager persistentCacheManager = this.iDaggerComponentImpl.barcodeCacheComponentApi.getPersistentCacheManager();
                        j.c(persistentCacheManager);
                        AuthStateStorage authStateStorage2 = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage2);
                        return (T) new LKOrderTrackingV4UpdaterConfigurator(orderTrackingBus, aVar, aVar2, persistentCacheManager, authStateStorage2);
                    case 420:
                        OrderChangePreferences orderChangePreferences = this.iDaggerComponentImpl.accountComponentApi.getOrderChangePreferences();
                        j.c(orderChangePreferences);
                        return (T) new OrderListChangeStateViewModel(orderChangePreferences);
                    case 421:
                        ActionV2Repository actionRepository = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository);
                        return (T) new OrderTrackingV4ViewModel(actionRepository, new ProcessLifecyclePublisherImpl());
                    case 422:
                        OrderTrackingBus orderTrackingBus2 = new OrderTrackingBus();
                        a aVar3 = this.iDaggerComponentImpl.orderListChangeStateViewModelProvider;
                        a aVar4 = this.iDaggerComponentImpl.orderTrackingV4ViewModelProvider;
                        BarcodeCacheManager persistentCacheManager2 = this.iDaggerComponentImpl.barcodeCacheComponentApi.getPersistentCacheManager();
                        j.c(persistentCacheManager2);
                        AuthStateStorage authStateStorage3 = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage3);
                        return (T) new MainOrderTrackingV4UpdaterConfigurator(orderTrackingBus2, aVar3, aVar4, persistentCacheManager2, authStateStorage3);
                    case 423:
                        a aVar5 = this.iDaggerComponentImpl.actionButtonViewModelProvider;
                        OrderChangePreferences orderChangePreferences2 = this.iDaggerComponentImpl.accountComponentApi.getOrderChangePreferences();
                        j.c(orderChangePreferences2);
                        return (T) new OrderChangeActionButtonsConfigurator(aVar5, orderChangePreferences2);
                    case 424:
                        ComposerActionApi composerActionApi = (ComposerActionApi) this.iDaggerComponentImpl.provideComposerActionApiProvider.get();
                        JsonParser jsonDeserializer2 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer2);
                        return (T) new ActionButtonViewModel(composerActionApi, jsonDeserializer2);
                    case 425:
                        CsmaButtonCommonModule csmaButtonCommonModule = this.iDaggerComponentImpl.csmaButtonCommonModule;
                        Retrofit retrofit = this.iDaggerComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) CsmaButtonCommonModule_ProvideComposerActionApiFactory.provideComposerActionApi(csmaButtonCommonModule, retrofit);
                    case 426:
                        return (T) new NotificationsSettingsConfigurator();
                    case 427:
                        return (T) new NotificationsSettingsBottomSheetConfigurator();
                    case 428:
                        return (T) new CancelPostingsConfigurator();
                    case 429:
                        a aVar6 = this.iDaggerComponentImpl.actionButtonViewModelProvider2;
                        OrderChangePreferences orderChangePreferences3 = this.iDaggerComponentImpl.accountComponentApi.getOrderChangePreferences();
                        j.c(orderChangePreferences3);
                        return (T) new SingleActionButtonConfigurator(aVar6, orderChangePreferences3);
                    case 430:
                        ComposerActionApi composerActionApi2 = (ComposerActionApi) this.iDaggerComponentImpl.provideComposerActionApiProvider.get();
                        JsonParser jsonDeserializer3 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer3);
                        return (T) new ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel(composerActionApi2, jsonDeserializer3);
                    case 431:
                        return (T) new OrderFiltersConfigurator();
                    case 432:
                        return (T) new RefreshByOrderChangeConfigurator(this.iDaggerComponentImpl.orderListChangeStateViewModelProvider);
                    case 433:
                        ScreenOrientationDelegate screenOrientationDelegate = this.iDaggerComponentImpl.androidPlatformComponentApi.getScreenOrientationDelegate();
                        j.c(screenOrientationDelegate);
                        return (T) new OrientationLockConfigurator(screenOrientationDelegate);
                    case 434:
                        return (T) new RefreshAfterTimeChangeConfigurator();
                    case 435:
                        return (T) new OrderPayConfigurator(this.iDaggerComponentImpl.createAndPayViewModelProvider);
                    case 436:
                        a aVar7 = this.iDaggerComponentImpl.actionButtonViewModelProvider2;
                        a aVar8 = this.iDaggerComponentImpl.selectPaymentViewModelProvider;
                        OrderChangePreferences orderChangePreferences4 = this.iDaggerComponentImpl.accountComponentApi.getOrderChangePreferences();
                        j.c(orderChangePreferences4);
                        g ozonRouter = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter);
                        return (T) new SelectPaymentConfigurator(aVar7, aVar8, orderChangePreferences4, ozonRouter);
                    case 437:
                        return (T) new OrderDetailsChangeHandlerConfigurator(this.iDaggerComponentImpl.orderDetailChangeHandlerViewModelProvider);
                    case 438:
                        OrderChangeManager orderChangeManager = this.iDaggerComponentImpl.accountComponentApi.getOrderChangeManager();
                        j.c(orderChangeManager);
                        return (T) new OrderDetailChangeHandlerViewModel(orderChangeManager);
                    case 439:
                        return (T) new RefreshOnStartConfigurator();
                    case 440:
                        g ozonRouter2 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter2);
                        a aVar9 = this.iDaggerComponentImpl.changePaymentViewModelProvider;
                        a aVar10 = this.iDaggerComponentImpl.createAndPayViewModelProvider;
                        ApplicationInfoDataSource applicationInfoStorage = this.iDaggerComponentImpl.storageComponentApi.getApplicationInfoStorage();
                        j.c(applicationInfoStorage);
                        return (T) new TotalConfigurator(ozonRouter2, aVar9, aVar10, applicationInfoStorage);
                    case 441:
                        return (T) new ChangePaymentMethodConfigurator();
                    case 442:
                        return (T) new BrightnessChangerConfigurator(this.iDaggerComponentImpl.screenBrightnessChanger());
                    case 443:
                        WearableBarcodeSyncer wearableBarcodeSyncer = this.iDaggerComponentImpl.barcodeCacheComponentApi.getWearableBarcodeSyncer();
                        j.c(wearableBarcodeSyncer);
                        AuthStateStorage authStateStorage4 = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage4);
                        AppType appType = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType);
                        return (T) new CabinetBarcodeOnWearableDeviceConfigurator(wearableBarcodeSyncer, authStateStorage4, appType);
                    case 444:
                        WearableBarcodeSyncer wearableBarcodeSyncer2 = this.iDaggerComponentImpl.barcodeCacheComponentApi.getWearableBarcodeSyncer();
                        j.c(wearableBarcodeSyncer2);
                        AuthStateStorage authStateStorage5 = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage5);
                        AppType appType2 = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType2);
                        return (T) new HomeBarcodeOnWearableDeviceConfigurator(wearableBarcodeSyncer2, authStateStorage5, appType2);
                    case 445:
                        return (T) new OrderGalleryConfigurator(this.iDaggerComponentImpl.getFileDownloaderViewModelProvider);
                    case 446:
                        return (T) new RefreshByResultConfigurator();
                    case 447:
                        a aVar11 = this.iDaggerComponentImpl.createAndPayViewModelProvider;
                        g ozonRouter3 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter3);
                        OrderChangePreferences orderChangePreferences5 = this.iDaggerComponentImpl.accountComponentApi.getOrderChangePreferences();
                        j.c(orderChangePreferences5);
                        AndroidPlatformComponentConfig androidPlatformComponentConfig = this.iDaggerComponentImpl.androidPlatformComponentApi.getAndroidPlatformComponentConfig();
                        j.c(androidPlatformComponentConfig);
                        return (T) new CreateAndPayConfigurator(aVar11, ozonRouter3, orderChangePreferences5, androidPlatformComponentConfig, this.iDaggerComponentImpl.googlePayManagerImpl(), (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 448:
                        return (T) new ChangePaymentConfigurator();
                    case 449:
                        a aVar12 = this.iDaggerComponentImpl.updateOrderC2CViewModelProvider;
                        g ozonRouter4 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter4);
                        return (T) new UpdateOrderC2CConfigurator(aVar12, ozonRouter4);
                    case 450:
                        a aVar13 = this.iDaggerComponentImpl.createServiceViewModelProvider;
                        g ozonRouter5 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter5);
                        OrderChangePreferences orderChangePreferences6 = this.iDaggerComponentImpl.accountComponentApi.getOrderChangePreferences();
                        j.c(orderChangePreferences6);
                        return (T) new ClickOrderConfigurator(aVar13, ozonRouter5, orderChangePreferences6);
                    case 451:
                        return (T) new LinkFastPayConfigurator(this.iDaggerComponentImpl.linkFastPayViewModelProvider);
                    case 452:
                        return (T) new CheckFastPayConfigurator(this.iDaggerComponentImpl.checkFastPayViewModelProvider);
                    case 453:
                        return (T) new OrderDetailsPayConfigurator(this.iDaggerComponentImpl.createAndPayViewModelProvider);
                    case 454:
                        return (T) new ConfirmDeliveryDateActionButtonsConfigurator(Jb.d.a(this.iDaggerComponentImpl.confirmDateButtonViewModelProvider));
                    case 455:
                        ActionV2Repository actionRepository2 = this.iDaggerComponentImpl.actionComponentApi.getActionRepository();
                        j.c(actionRepository2);
                        JsonParser jsonDeserializer4 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer4);
                        return (T) new ConfirmDateButtonViewModel(actionRepository2, jsonDeserializer4);
                    case 456:
                        OrderDetailsScrollToShipmentRepository orderDetailsScrollToShipmentKeyRepository = this.iDaggerComponentImpl.orderShipmentComponentApi.getOrderDetailsScrollToShipmentKeyRepository();
                        j.c(orderDetailsScrollToShipmentKeyRepository);
                        return (T) new ScrollToShipmentConfigurator(orderDetailsScrollToShipmentKeyRepository);
                    case 457:
                        return (T) new NestedScrollingDisabledConfigurator();
                    case 458:
                        return (T) new PlayStoriesV3Configurator();
                    case 459:
                        return (T) new ru.ozon.app.android.videomolecule.presentation.VideoMoleculeConfigurator();
                    case 460:
                        return (T) new SharedViewPoolSizeSetterConfigurator();
                    case 461:
                        return (T) new AppOnboardingConfigurator();
                    case 462:
                        return (T) new TileRelatedProductsBottomSheetConfigurator();
                    case 463:
                        return (T) new FailedExternalPageRetryNotificationConfigurator();
                    case 464:
                        return (T) new FilterValuesModalConfigurator();
                    case 465:
                        return (T) new MainFilterConfigurator(this.iDaggerComponentImpl.filterSharedViewModelProvider);
                    case 466:
                        return (T) new FilterSharedViewModel();
                    case 467:
                        return (T) new FiltersKeyboardInsetConfigurator((FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 468:
                        return (T) new AddressEditMapConfigurator();
                    case 469:
                        return (T) new FlashCallConfigurator();
                    case 470:
                        return (T) new RequestPhoneAccessConfigurator();
                    case 471:
                        return (T) new NewCredentialsConfigurator();
                    case 472:
                        return (T) new SmsRetrieverConfigurator((FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 473:
                        return (T) new GalleryLauncherConfigurator();
                    case 474:
                        CmlEventsController cmlEventsController = this.iDaggerComponentImpl.cmlDomainComponentApi.getCmlEventsController();
                        j.c(cmlEventsController);
                        return (T) new CmlEventsHandlerConfigurator(cmlEventsController);
                    case 475:
                        return (T) new EditOrderConfigurator();
                    case 476:
                        return (T) new ParcelPhotoAddConfigurator();
                    case 477:
                        return (T) new AddNewCardConfigurator();
                    case 478:
                        return (T) new ru.ozon.app.android.returns.cancels.cancelpostingsv2.CancelPostingsConfigurator();
                    case 479:
                        return (T) new ru.ozon.app.android.returns.cancels.modalConstructor.presentation.configurators.NestedScrollingDisabledConfigurator();
                    case 480:
                        return (T) new PdpOfflineScreenFactory(this.iDaggerComponentImpl.galleryV4WidgetFactory(), this.iDaggerComponentImpl.priceV4WidgetFactory(), this.iDaggerComponentImpl.textProductNameWidgetFactory(), this.iDaggerComponentImpl.pdpStatusWidgetFactory());
                    case 481:
                        BarcodeCacheManager persistentCacheManager3 = this.iDaggerComponentImpl.barcodeCacheComponentApi.getPersistentCacheManager();
                        j.c(persistentCacheManager3);
                        Moshi moshi = this.iDaggerComponentImpl.networkComponentApi.getMoshi();
                        j.c(moshi);
                        return (T) new BarcodeFullScreenOfflineFactory(persistentCacheManager3, moshi);
                    case 482:
                        BarcodeStatusWidgetFactory barcodeStatusWidgetFactory = this.iDaggerComponentImpl.barcodeStatusWidgetFactory();
                        EmptyScreenStatusWidgetFactory emptyScreenStatusWidgetFactory = this.iDaggerComponentImpl.emptyScreenStatusWidgetFactory();
                        OzonBankOfflineInfoWidgetFactory ozonBankOfflineInfoWidgetFactory = this.iDaggerComponentImpl.ozonBankOfflineInfoWidgetFactory();
                        BarcodeWidgetFactory barcodeWidgetFactory = this.iDaggerComponentImpl.barcodeWidgetFactory();
                        EmptyScreenIslandSeparatorFactory emptyScreenIslandSeparatorFactory = this.iDaggerComponentImpl.emptyScreenIslandSeparatorFactory();
                        InternalTeethFactory internalTeethFactory = this.iDaggerComponentImpl.internalTeethFactory();
                        ExtendBackgroundFactory extendBackgroundFactory = this.iDaggerComponentImpl.extendBackgroundFactory();
                        TravelOfflineWidgetsProviderImpl travelOfflineWidgetsProviderImpl = this.iDaggerComponentImpl.travelOfflineWidgetsProviderImpl();
                        AppType appType3 = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType3);
                        return (T) new EmptyScreenWithBarcodeFactory(barcodeStatusWidgetFactory, emptyScreenStatusWidgetFactory, ozonBankOfflineInfoWidgetFactory, barcodeWidgetFactory, emptyScreenIslandSeparatorFactory, internalTeethFactory, extendBackgroundFactory, travelOfflineWidgetsProviderImpl, appType3);
                    case 483:
                        ShellNavBarInitialWidgetFabricImpl shellNavBarInitialWidgetFabricImpl = new ShellNavBarInitialWidgetFabricImpl();
                        AppType appType4 = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType4);
                        return (T) new DefaultInitialWidgetsProvider(shellNavBarInitialWidgetFabricImpl, appType4);
                    case 484:
                        return (T) new EmptyInitialWidgetProvider();
                    case 485:
                        FreshAddToCartRetryHandler freshAddToCartRetryHandler = this.iDaggerComponentImpl.cartComponentApi.getFreshAddToCartRetryHandler();
                        j.c(freshAddToCartRetryHandler);
                        return (T) new AddressPopUpStateConfigurator(freshAddToCartRetryHandler);
                    case 486:
                        MoveCartItemsPayloadHandler moveCartItemsPayloadHandler = this.iDaggerComponentImpl.freshNavigationComponentApi.getMoveCartItemsPayloadHandler();
                        j.c(moveCartItemsPayloadHandler);
                        return (T) new MoveCartItemsInterceptor(moveCartItemsPayloadHandler);
                    case 487:
                        return (T) new OrderCacheStateInterceptor();
                    case 488:
                        CartModeManager cartModeService = this.iDaggerComponentImpl.cartServiceApi.getCartModeService();
                        j.c(cartModeService);
                        return (T) new CartComposerInterceptor(cartModeService);
                    case 489:
                        return (T) new SkuPromoCartComposerInterceptor();
                    case 490:
                        ApplicationInfoDataSource applicationInfoStorage2 = this.iDaggerComponentImpl.storageComponentApi.getApplicationInfoStorage();
                        j.c(applicationInfoStorage2);
                        LocalGoodsForCheckoutRepository localGoodsForCheckoutRepository = (LocalGoodsForCheckoutRepository) this.iDaggerComponentImpl.bindLocalGoodsForCheckoutRepository$checkout_prodGoogleAllVendorsReleaseProvider.get();
                        GooglePayAvailabilityStorage googlePayAvailabilityStorage = this.iDaggerComponentImpl.checkoutPaymentComponentApi.getGooglePayAvailabilityStorage();
                        j.c(googlePayAvailabilityStorage);
                        return (T) new FirstRequestSetupConfigurator(applicationInfoStorage2, localGoodsForCheckoutRepository, googlePayAvailabilityStorage);
                    case 491:
                        return (T) new LocalGoodsForCheckoutRepositoryImpl();
                    case 492:
                        ApplicationInfoDataSource applicationInfoStorage3 = this.iDaggerComponentImpl.storageComponentApi.getApplicationInfoStorage();
                        j.c(applicationInfoStorage3);
                        LocalGoodsForCheckoutRepository localGoodsForCheckoutRepository2 = (LocalGoodsForCheckoutRepository) this.iDaggerComponentImpl.bindLocalGoodsForCheckoutRepository$checkout_prodGoogleAllVendorsReleaseProvider.get();
                        GooglePayAvailabilityStorage googlePayAvailabilityStorage2 = this.iDaggerComponentImpl.checkoutPaymentComponentApi.getGooglePayAvailabilityStorage();
                        j.c(googlePayAvailabilityStorage2);
                        return (T) new InitCheckoutRequestConfigurator(applicationInfoStorage3, localGoodsForCheckoutRepository2, googlePayAvailabilityStorage2);
                    case 493:
                        LastLocationRepository lastLocationRepository = this.iDaggerComponentImpl.locationComponentApi.getLastLocationRepository();
                        j.c(lastLocationRepository);
                        JsonParser jsonDeserializer5 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer5);
                        JsonSerializer jsonSerializer2 = this.iDaggerComponentImpl.networkComponentApi.getJsonSerializer();
                        j.c(jsonSerializer2);
                        return (T) new CheckoutRequestInterceptor(lastLocationRepository, jsonDeserializer5, jsonSerializer2);
                    case 494:
                        return (T) new BiometryStateConfigurator(this.iDaggerComponentImpl.biometryInfoRepository(), (Ob0.a) this.iDaggerComponentImpl.getOzonIdAppApiProvider.get());
                    case 495:
                        return (T) new NotificationsSettingsStateConfigurator((Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 496:
                        SberPayManager sberPayManager = this.iDaggerComponentImpl.checkoutPaymentComponentApi.getSberPayManager();
                        j.c(sberPayManager);
                        return (T) new AvailableNativePaymentInterceptor(sberPayManager);
                    case 497:
                        LocationRepository locationRepository = this.iDaggerComponentImpl.locationComponentApi.getLocationRepository();
                        j.c(locationRepository);
                        LastLocationRepository lastLocationRepository2 = this.iDaggerComponentImpl.locationComponentApi.getLastLocationRepository();
                        j.c(lastLocationRepository2);
                        return (T) new FirstRequestMapConfigurator(locationRepository, lastLocationRepository2, (Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 498:
                        FreshAddToCartRetryHandler freshAddToCartRetryHandler2 = this.iDaggerComponentImpl.cartComponentApi.getFreshAddToCartRetryHandler();
                        j.c(freshAddToCartRetryHandler2);
                        return (T) new AddressBookStateConfigurator(freshAddToCartRetryHandler2);
                    case 499:
                        JsonParser jsonDeserializer6 = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer6);
                        return (T) new AuthPostDataConfigurator(jsonDeserializer6, (AuthOriginStorage) this.iDaggerComponentImpl.authOriginStorageProvider.get());
                    default:
                        throw new AssertionError(this.f92812id);
                }
            }

            private T get5() {
                switch (this.f92812id) {
                    case CounterView.COUNTER_MAX_DEFAULT /* 500 */:
                        return (T) new LongPollingPageComposerInterceptor();
                    case 501:
                        k routeFactory = this.iDaggerComponentImpl.navigationComponentApi.getRouteFactory();
                        j.c(routeFactory);
                        return (T) NavigationModule_Companion_ProvideKeepDeeplinkActivityOnExternalDeeplinkFactory.provideKeepDeeplinkActivityOnExternalDeeplink(routeFactory, this.iDaggerComponentImpl.bankGlobalDeeplinkInterceptor());
                    case 502:
                        Map mapOfIntegerAndNamedActionInitializerProvider = this.iDaggerComponentImpl.mapOfIntegerAndNamedActionInitializerProvider();
                        c startupTimeTracker = this.iDaggerComponentImpl.startupTimeTrackerComponentApi.getStartupTimeTracker();
                        j.c(startupTimeTracker);
                        return (T) new AppInitializer(mapOfIntegerAndNamedActionInitializerProvider, startupTimeTracker);
                    case 503:
                        Application application = this.iDaggerComponentImpl.contextComponentDependencies.getApplication();
                        j.c(application);
                        return (T) new TrackerDebugMenuInitializer(application);
                    case 504:
                        return (T) new LoggerInitializer();
                    case 505:
                        Application application2 = this.iDaggerComponentImpl.contextComponentDependencies.getApplication();
                        j.c(application2);
                        EnvironmentService environmentService = this.iDaggerComponentImpl.storageComponentApi.getEnvironmentService();
                        j.c(environmentService);
                        AuthNetworkService authNetworkService = this.iDaggerComponentImpl.networkComponentApi.getAuthNetworkService();
                        j.c(authNetworkService);
                        return (T) new EnvironmentInitializer(application2, environmentService, authNetworkService, (Ob0.a) this.iDaggerComponentImpl.getOzonIdAppApiProvider.get());
                    case 506:
                        return (T) new LeakCanaryInitializer();
                    case 507:
                        return (T) new RxErrorPluginInitializer();
                    case 508:
                        Ld0.c ozonLimbDiStore = this.iDaggerComponentImpl.limb2ComponentApi.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore);
                        return (T) new WhitelistingInitializer(ozonLimbDiStore);
                    case 509:
                        Application application3 = this.iDaggerComponentImpl.contextComponentDependencies.getApplication();
                        j.c(application3);
                        Set ofDeeplinkHandler = this.iDaggerComponentImpl.setOfDeeplinkHandler();
                        Set ofNavigationHandlerOf = this.iDaggerComponentImpl.setOfNavigationHandlerOf();
                        Set ofAppHandler = this.iDaggerComponentImpl.setOfAppHandler();
                        C8475a navigation = this.iDaggerComponentImpl.navigationComponentApi.getNavigation();
                        j.c(navigation);
                        return (T) new ScreenRouterActionInitializer(application3, ofDeeplinkHandler, ofNavigationHandlerOf, ofAppHandler, navigation);
                    case 510:
                        Context context = (Context) this.iDaggerComponentImpl.getContextProvider.get();
                        DomainsInteractor domainsInteractor = this.iDaggerComponentImpl.whitelistComponentApi.getDomainsInteractor();
                        j.c(domainsInteractor);
                        WebViewAuthDestinationInterceptor webViewAuthDestinationInterceptor = (WebViewAuthDestinationInterceptor) this.iDaggerComponentImpl.webViewAuthDestinationInterceptorProvider.get();
                        WhiteListDomainsOzonAppsHandler whiteListDomainsOzonAppsHandler = this.iDaggerComponentImpl.whiteListDomainsOzonAppsHandler();
                        HZ.a deeplinkHandlersCache = this.iDaggerComponentImpl.navigationComponentApi.getDeeplinkHandlersCache();
                        j.c(deeplinkHandlersCache);
                        FeatureChecker featureChecker = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        FeatureService featureService = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        AuthDestinationInterceptor authDestinationInterceptor = (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get();
                        FreshPdpInBottomSheetHandler freshPdpInBottomSheetHandler = this.iDaggerComponentImpl.freshNavigationComponentApi.getFreshPdpInBottomSheetHandler();
                        j.c(freshPdpInBottomSheetHandler);
                        ExternalFintechSettings externalFintechSettings = this.iDaggerComponentImpl.fintechLibApi.getExternalFintechSettings();
                        j.c(externalFintechSettings);
                        ExternalFintechSettings rkoExternalFintechSettings = this.iDaggerComponentImpl.fintechLibApi.getRkoExternalFintechSettings();
                        j.c(rkoExternalFintechSettings);
                        ExternalFintechSettings payExternalFintechSettings = this.iDaggerComponentImpl.fintechLibApi.getPayExternalFintechSettings();
                        j.c(payExternalFintechSettings);
                        g ozonRouter = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter);
                        Ob0.a aVar = (Ob0.a) this.iDaggerComponentImpl.getOzonIdAppApiProvider.get();
                        BankAuthDestinationInterceptor bankAuthDestinationInterceptor = this.iDaggerComponentImpl.bankAuthDestinationInterceptor();
                        CheckAiConversation checkAiConversation = this.iDaggerComponentImpl.webComponentApi.getCheckAiConversation();
                        j.c(checkAiConversation);
                        Ib.a a11 = Jb.d.a(this.iDaggerComponentImpl.provideMessengerFeatureProvider);
                        Ib.a a12 = Jb.d.a(this.iDaggerComponentImpl.provideAIMessengerFeatureProvider);
                        Ib.a a13 = Jb.d.a(this.iDaggerComponentImpl.provideBloggerFeatureProvider);
                        CartService cartService = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService);
                        return (T) NavigationModule_Companion_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(context, domainsInteractor, webViewAuthDestinationInterceptor, whiteListDomainsOzonAppsHandler, deeplinkHandlersCache, featureChecker, featureService, authDestinationInterceptor, freshPdpInBottomSheetHandler, externalFintechSettings, rkoExternalFintechSettings, payExternalFintechSettings, ozonRouter, aVar, bankAuthDestinationInterceptor, checkAiConversation, a11, a12, a13, cartService);
                    case 511:
                        return (T) new WebViewAuthDestinationInterceptor((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case UserVerificationMethods.USER_VERIFY_NONE /* 512 */:
                        return (T) MessengerFeatureModule_ProvideMessengerFeatureFactory.provideMessengerFeature(this.iDaggerComponentImpl.messengerFeatureModule, this.iDaggerComponentImpl.messengerInitializer(), this.iDaggerComponentImpl.namedMessengerExternalActionHandler(), this.iDaggerComponentImpl.namedString());
                    case 513:
                        C9067a networkInfoProvider = this.iDaggerComponentImpl.networkComponentApi.getNetworkInfoProvider();
                        j.c(networkInfoProvider);
                        InterfaceC6369b ozonTracker = this.iDaggerComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker);
                        Sg.a analyticsScreenStorage = this.iDaggerComponentImpl.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                        j.c(analyticsScreenStorage);
                        Sg.a applicationAnalyticsScreenStorage = this.iDaggerComponentImpl.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
                        j.c(applicationAnalyticsScreenStorage);
                        return (T) new TrackerAnalyticsAdapterImpl(networkInfoProvider, ozonTracker, analyticsScreenStorage, applicationAnalyticsScreenStorage);
                    case 514:
                        return (T) new MessengerActionHandlerImpl.Factory() { // from class: ru.ozon.app.android.injection.DaggerIDaggerComponent.IDaggerComponentImpl.SwitchingProvider.2
                            @Override // ru.ozon.app.android.messenger.initializer.MessengerActionHandlerImpl.Factory
                            public MessengerActionHandlerImpl create(String str) {
                                ComposerNavigator composerNavigator = SwitchingProvider.this.iDaggerComponentImpl.composerComponentApi.getComposerNavigator();
                                j.c(composerNavigator);
                                i iVar = (i) SwitchingProvider.this.iDaggerComponentImpl.trackerAnalyticsAdapterImplProvider.get();
                                CartService cartService2 = SwitchingProvider.this.iDaggerComponentImpl.cartServiceApi.getCartService();
                                j.c(cartService2);
                                FavoriteInteractor favoriteInteractor = SwitchingProvider.this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavoriteInteractor();
                                j.c(favoriteInteractor);
                                AppStoreInfoProvider appStoreInfoProvider = SwitchingProvider.this.iDaggerComponentImpl.analyticsComponentApi.getAppStoreInfoProvider();
                                j.c(appStoreInfoProvider);
                                ActionUsageAnalytics actionUsageAnalytics = SwitchingProvider.this.iDaggerComponentImpl.actionComponentApi.getActionUsageAnalytics();
                                j.c(actionUsageAnalytics);
                                return new MessengerActionHandlerImpl(composerNavigator, iVar, cartService2, favoriteInteractor, appStoreInfoProvider, actionUsageAnalytics, (Context) SwitchingProvider.this.iDaggerComponentImpl.getContextProvider.get(), str);
                            }
                        };
                    case 515:
                        return (T) MessengerFeatureModule_ProvideAIMessengerFeatureFactory.provideAIMessengerFeature(this.iDaggerComponentImpl.messengerFeatureModule, this.iDaggerComponentImpl.messengerInitializer(), this.iDaggerComponentImpl.namedMessengerExternalActionHandler2(), NamespaceModule_ProvideAIChatFeatureNamespaceFactory.provideAIChatFeatureNamespace(this.iDaggerComponentImpl.namespaceModule));
                    case 516:
                        return (T) MessengerFeatureModule_ProvideBloggerFeatureFactory.provideBloggerFeature(this.iDaggerComponentImpl.messengerFeatureModule, this.iDaggerComponentImpl.messengerInitializer(), this.iDaggerComponentImpl.namedMessengerExternalActionHandler3(), NamespaceModule_ProvideBloggerChatNamespaceFactory.provideBloggerChatNamespace(this.iDaggerComponentImpl.namespaceModule));
                    case 517:
                        return (T) B2BNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case 518:
                        FeatureChecker featureChecker2 = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        AuthDestinationInterceptor authDestinationInterceptor2 = (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get();
                        AppType appType = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType);
                        return (T) OrderNavigationModule_ProvideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsReleaseFactory.provideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsRelease(featureChecker2, authDestinationInterceptor2, appType);
                    case 519:
                        CartService cartService2 = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService2);
                        JsonParser jsonDeserializer = this.iDaggerComponentImpl.networkComponentApi.getJsonDeserializer();
                        j.c(jsonDeserializer);
                        AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor = (AtMostQaUserDestinationInterceptor) this.iDaggerComponentImpl.atMostQaUserDestinationInterceptorImplProvider.get();
                        CartDeeplinkInterceptor cartDeeplinkInterceptor = this.iDaggerComponentImpl.cartDeeplinkInterceptor();
                        FeatureChecker featureChecker3 = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        FeatureService featureService2 = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService2);
                        AppType appType2 = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType2);
                        return (T) CartNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(cartService2, jsonDeserializer, atMostQaUserDestinationInterceptor, cartDeeplinkInterceptor, featureChecker3, featureService2, appType2);
                    case 520:
                        InterceptorMultiplePredicate bindAtMostQaUserPredicate = this.iDaggerComponentImpl.interceptorPredicatesComponentApi.bindAtMostQaUserPredicate();
                        j.c(bindAtMostQaUserPredicate);
                        return (T) new AtMostQaUserDestinationInterceptorImpl(bindAtMostQaUserPredicate);
                    case 521:
                        FeatureChecker featureChecker4 = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        AppType appType3 = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType3);
                        return (T) SearchNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(featureChecker4, appType3, (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case 522:
                        AuthDestinationInterceptor authDestinationInterceptor3 = (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get();
                        FeatureChecker featureChecker5 = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        DomainsInteractor domainsInteractor2 = this.iDaggerComponentImpl.whitelistComponentApi.getDomainsInteractor();
                        j.c(domainsInteractor2);
                        AppType appType4 = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType4);
                        return (T) UgcNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(authDestinationInterceptor3, featureChecker5, domainsInteractor2, appType4);
                    case 523:
                        return (T) UgcCoreNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet();
                    case 524:
                        return (T) UgcPayoutNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet();
                    case 525:
                        FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate = (FavoritesDeeplinkHandlerDelegate) this.iDaggerComponentImpl.favoritesDeeplinkHandlerDelegateProvider.get();
                        FeatureChecker featureChecker6 = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        AppType appType5 = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType5);
                        return (T) FavoritesNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(favoritesDeeplinkHandlerDelegate, featureChecker6, appType5);
                    case 526:
                        TabConfigCache tabConfigCache = this.iDaggerComponentImpl.tabsComponentApi.getTabConfigCache();
                        j.c(tabConfigCache);
                        return (T) new FavoritesDeeplinkHandlerDelegate(tabConfigCache);
                    case 527:
                        AuthDestinationInterceptor authDestinationInterceptor4 = (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get();
                        UserManager userManager = this.iDaggerComponentImpl.accountComponentApi.getUserManager();
                        j.c(userManager);
                        AuthDeeplinkReceiver authDeeplinkReceiver = this.iDaggerComponentImpl.authComponentApi.getAuthDeeplinkReceiver();
                        j.c(authDeeplinkReceiver);
                        AuthInteractor authInteractor = this.iDaggerComponentImpl.authComponentApi.getAuthInteractor();
                        j.c(authInteractor);
                        AuthFlowMapper authFlowMapper = this.iDaggerComponentImpl.authFlowMapper();
                        AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor2 = (AtMostQaUserDestinationInterceptor) this.iDaggerComponentImpl.atMostQaUserDestinationInterceptorImplProvider.get();
                        AppType appType6 = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType6);
                        return (T) CabinetNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(authDestinationInterceptor4, userManager, authDeeplinkReceiver, authInteractor, authFlowMapper, atMostQaUserDestinationInterceptor2, appType6);
                    case 528:
                        return (T) PdpNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet();
                    case 529:
                        AuthDestinationInterceptor authDestinationInterceptor5 = (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get();
                        OrderDetailsScrollToShipmentRepository orderDetailsScrollToShipmentKeyRepository = this.iDaggerComponentImpl.orderShipmentComponentApi.getOrderDetailsScrollToShipmentKeyRepository();
                        j.c(orderDetailsScrollToShipmentKeyRepository);
                        AppType appType7 = this.iDaggerComponentImpl.androidPlatformComponentApi.getAppType();
                        j.c(appType7);
                        e miniAppConfigHolder = this.iDaggerComponentImpl.navigationComponentApi.getMiniAppConfigHolder();
                        j.c(miniAppConfigHolder);
                        return (T) OrderDetailsNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(authDestinationInterceptor5, orderDetailsScrollToShipmentKeyRepository, appType7, miniAppConfigHolder);
                    case 530:
                        return (T) ScanItNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet();
                    case 531:
                        return (T) OrderDoneNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case 532:
                        LocalGoodsForCheckoutRepository localGoodsForCheckoutRepository = (LocalGoodsForCheckoutRepository) this.iDaggerComponentImpl.bindLocalGoodsForCheckoutRepository$checkout_prodGoogleAllVendorsReleaseProvider.get();
                        AuthDestinationInterceptor authDestinationInterceptor6 = (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get();
                        CheckoutScrollToWidgetKeyRepository checkoutScrollToWidgetKeyRepository = this.iDaggerComponentImpl.checkoutCommonComponentApi.getCheckoutScrollToWidgetKeyRepository();
                        j.c(checkoutScrollToWidgetKeyRepository);
                        return (T) CheckoutNavigationModule_ProvideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsReleaseFactory.provideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsRelease(localGoodsForCheckoutRepository, authDestinationInterceptor6, checkoutScrollToWidgetKeyRepository, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 533:
                        return (T) HomeCreditNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case 534:
                        return (T) MarketingNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case 535:
                        return (T) FaqNavigationModule_ProvideDeeplinkHandlersSet$faq_prodGoogleAllVendorsReleaseFactory.provideDeeplinkHandlersSet$faq_prodGoogleAllVendorsRelease();
                    case 536:
                        return (T) StoriesNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case 537:
                        return (T) ProductPickerNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet();
                    case 538:
                        return (T) UniversalWidgetsNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet();
                    case 539:
                        return (T) DeliveryReviewNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case 540:
                        return (T) TravelAviaNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get(), new TravelFunnelFullScreenDestinationBehavior());
                    case 541:
                        AuthDestinationInterceptor authDestinationInterceptor7 = (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get();
                        AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor3 = (AtMostQaUserDestinationInterceptor) this.iDaggerComponentImpl.atMostQaUserDestinationInterceptorImplProvider.get();
                        TravelFunnelFullScreenDestinationBehavior travelFunnelFullScreenDestinationBehavior = new TravelFunnelFullScreenDestinationBehavior();
                        TravelFunnelBackgroundColorDestinationBehavior travelFunnelBackgroundColorDestinationBehavior = new TravelFunnelBackgroundColorDestinationBehavior();
                        HZ.a deeplinkHandlersCache2 = this.iDaggerComponentImpl.navigationComponentApi.getDeeplinkHandlersCache();
                        j.c(deeplinkHandlersCache2);
                        return (T) TravelGeneralNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(authDestinationInterceptor7, atMostQaUserDestinationInterceptor3, travelFunnelFullScreenDestinationBehavior, travelFunnelBackgroundColorDestinationBehavior, deeplinkHandlersCache2);
                    case 542:
                        return (T) TravelGeneralBookingNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get(), new TravelFunnelFullScreenDestinationBehavior());
                    case 543:
                        AuthDestinationInterceptor authDestinationInterceptor8 = (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get();
                        TravelFunnelFullScreenDestinationBehavior travelFunnelFullScreenDestinationBehavior2 = new TravelFunnelFullScreenDestinationBehavior();
                        HZ.a deeplinkHandlersCache3 = this.iDaggerComponentImpl.navigationComponentApi.getDeeplinkHandlersCache();
                        j.c(deeplinkHandlersCache3);
                        return (T) TravelB2BNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(authDestinationInterceptor8, travelFunnelFullScreenDestinationBehavior2, deeplinkHandlersCache3);
                    case 544:
                        return (T) TravelRailwayNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get(), new TravelFunnelFullScreenDestinationBehavior());
                    case 545:
                        AuthDestinationInterceptor authDestinationInterceptor9 = (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get();
                        EnsureMiniappTravelDeeplinkInterceptor ensureMiniappTravelDeeplinkInterceptor = new EnsureMiniappTravelDeeplinkInterceptor();
                        TabConfigCache tabConfigCache2 = this.iDaggerComponentImpl.tabsComponentApi.getTabConfigCache();
                        j.c(tabConfigCache2);
                        return (T) TravelHotelsNavigationModule_ProvideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsReleaseFactory.provideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsRelease(authDestinationInterceptor9, ensureMiniappTravelDeeplinkInterceptor, tabConfigCache2);
                    case 546:
                        return (T) TravelHotelsMapNavigationModule_ProvideDeeplinkHandlerSetFactory.provideDeeplinkHandlerSet();
                    case 547:
                        return (T) TravelToursNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case 548:
                        return (T) VideoMoleculeDeeplinkHandlersModule_ProvideDeeplinkHandlersFactory.provideDeeplinkHandlers();
                    case 549:
                        EnvironmentDeeplinkHandler environmentDeeplinkHandler = this.iDaggerComponentImpl.environmentDeeplinkHandler();
                        FeatureFlagDeeplinkHandler featureFlagDeeplinkHandler = this.iDaggerComponentImpl.featureFlagDeeplinkHandler();
                        ExtraHeaderDeeplinkHandler extraHeaderDeeplinkHandler = this.iDaggerComponentImpl.extraHeaderDeeplinkHandler();
                        AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor4 = (AtMostQaUserDestinationInterceptor) this.iDaggerComponentImpl.atMostQaUserDestinationInterceptorImplProvider.get();
                        AtMostEmployeeUserDestinationInterceptor atMostEmployeeUserDestinationInterceptor = (AtMostEmployeeUserDestinationInterceptor) this.iDaggerComponentImpl.atMostEmployeeUserDestinationInterceptorImplProvider.get();
                        UserQASegmentInteractor userQASegmentInteractor = this.iDaggerComponentImpl.debugMenuComponentApi.getUserQASegmentInteractor();
                        j.c(userQASegmentInteractor);
                        AuthDestinationInterceptor authDestinationInterceptor10 = (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get();
                        PlayerPreferences playerPreferences = this.iDaggerComponentImpl.videoComponentApi.getPlayerPreferences();
                        j.c(playerPreferences);
                        DarkThemeManager darkThemeManager = this.iDaggerComponentImpl.androidPlatformComponentApi.getDarkThemeManager();
                        j.c(darkThemeManager);
                        MapPreferences mapPreferences = this.iDaggerComponentImpl.locationComponentApi.getMapPreferences();
                        j.c(mapPreferences);
                        FintechAutoTestDeeplinkHandler fintechAutoTestDeeplinkHandler = this.iDaggerComponentImpl.fintechAutoTestDeeplinkHandler();
                        SberPayPreferences sberPayPreferences = this.iDaggerComponentImpl.checkoutPaymentComponentApi.getSberPayPreferences();
                        j.c(sberPayPreferences);
                        OzonDebugMenuHelper ozonDebugMenuHelper = this.iDaggerComponentImpl.ozonDebugMenuComponentApi.getOzonDebugMenuHelper();
                        j.c(ozonDebugMenuHelper);
                        DebugToolsService debugToolService = this.iDaggerComponentImpl.storageComponentApi.getDebugToolService();
                        j.c(debugToolService);
                        Ld0.c ozonLimbDiStore2 = this.iDaggerComponentImpl.limb2ComponentApi.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore2);
                        return (T) DebugNavigationModule_ProvideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsReleaseFactory.provideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsRelease(environmentDeeplinkHandler, featureFlagDeeplinkHandler, extraHeaderDeeplinkHandler, atMostQaUserDestinationInterceptor4, atMostEmployeeUserDestinationInterceptor, userQASegmentInteractor, authDestinationInterceptor10, playerPreferences, darkThemeManager, mapPreferences, fintechAutoTestDeeplinkHandler, sberPayPreferences, ozonDebugMenuHelper, debugToolService, ozonLimbDiStore2);
                    case 550:
                        T t2 = (T) this.iDaggerComponentImpl.storageComponentApi.getExtraHeadersDataSource();
                        j.c(t2);
                        return t2;
                    case 551:
                        InterceptorMultiplePredicate bindAtMostEmployeeUserPredicate = this.iDaggerComponentImpl.interceptorPredicatesComponentApi.bindAtMostEmployeeUserPredicate();
                        j.c(bindAtMostEmployeeUserPredicate);
                        return (T) new AtMostEmployeeUserDestinationInterceptorImpl(bindAtMostEmployeeUserPredicate);
                    case 552:
                        return (T) CourierOnMapNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case 553:
                        return (T) ApparelNavigationModule_ProvideDeeplinkHandlersSet$miniapp_prodGoogleAllVendorsReleaseFactory.provideDeeplinkHandlersSet$miniapp_prodGoogleAllVendorsRelease();
                    case 554:
                        return (T) GeoNavigationModule_ProvideDeeplinkHandlersSet$geo_prodGoogleAllVendorsReleaseFactory.provideDeeplinkHandlersSet$geo_prodGoogleAllVendorsRelease((FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES /* 555 */:
                        DomainsInteractor domainsInteractor3 = this.iDaggerComponentImpl.whitelistComponentApi.getDomainsInteractor();
                        j.c(domainsInteractor3);
                        return (T) FreshDeeplinkHandlersModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(domainsInteractor3);
                    case 556:
                        return (T) OzonIdSessionNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get(), (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 557:
                        return (T) CmlOrdersNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(this.iDaggerComponentImpl.cmlOrdersNavigationModule, (AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case 558:
                        return (T) RegularDrawNavigationModule_Companion_ProvideDeeplinkHandlersSet$regulardraw_prodGoogleAllVendorsReleaseFactory.provideDeeplinkHandlersSet$regulardraw_prodGoogleAllVendorsRelease();
                    case 559:
                        return (T) PaymentNavigationModule_ProvideDeeplinkHandlersSet$payment_prodGoogleAllVendorsReleaseFactory.provideDeeplinkHandlersSet$payment_prodGoogleAllVendorsRelease();
                    case 560:
                        TeensModeStorage teensModeStorage = this.iDaggerComponentImpl.storageComponentApi.getTeensModeStorage();
                        j.c(teensModeStorage);
                        return (T) MonetizationNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet(teensModeStorage);
                    case 561:
                        return (T) CancelsNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet((AuthDestinationInterceptor) this.iDaggerComponentImpl.authDestinationInterceptorImplProvider.get());
                    case 562:
                        return (T) new OnBoardingDisplayDisableDeeplinkHandler((AtMostQaUserDestinationInterceptor) this.iDaggerComponentImpl.atMostQaUserDestinationInterceptorImplProvider.get());
                    case 563:
                        return (T) new OzonIdAccountInitializer(this.iDaggerComponentImpl.ozonIdInitializerDelegate());
                    case 564:
                        T t11 = (T) this.iDaggerComponentImpl.storageComponentApi.getOzonIdCookieEvents();
                        j.c(t11);
                        return t11;
                    case 565:
                        OzonDebugMenuHelper ozonDebugMenuHelper2 = this.iDaggerComponentImpl.ozonDebugMenuComponentApi.getOzonDebugMenuHelper();
                        j.c(ozonDebugMenuHelper2);
                        return (T) new OzonDebugMenuSdkInitializer(ozonDebugMenuHelper2);
                    case 566:
                        YY.a cdnChooserHostApi = this.iDaggerComponentImpl.cdnHostManagerComponentApi.getCdnChooserHostApi();
                        j.c(cdnChooserHostApi);
                        OzonDebugMenuHelper ozonDebugMenuHelper3 = this.iDaggerComponentImpl.ozonDebugMenuComponentApi.getOzonDebugMenuHelper();
                        j.c(ozonDebugMenuHelper3);
                        return (T) new LimbActionInitializer(cdnChooserHostApi, ozonDebugMenuHelper3);
                    case 567:
                        Ib.a a14 = Jb.d.a(this.iDaggerComponentImpl.getOzonIdCookieEventsProvider);
                        FeatureService featureService3 = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService3);
                        return (T) new SentrySessionIdInitializer(a14, featureService3, this.iDaggerComponentImpl.sentrySampleRateHolder(), (Ob0.a) this.iDaggerComponentImpl.getOzonIdAppApiProvider.get(), (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 568:
                        FeatureService featureService4 = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService4);
                        DebugToolsService debugToolService2 = this.iDaggerComponentImpl.storageComponentApi.getDebugToolService();
                        j.c(debugToolService2);
                        UserStatusStorage userStatusStorage = this.iDaggerComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage);
                        DynamicUrlInterceptor dynamicUrlInterceptor = this.iDaggerComponentImpl.networkComponentApi.getDynamicUrlInterceptor();
                        j.c(dynamicUrlInterceptor);
                        return (T) new AbToolActionInitializer(featureService4, debugToolService2, userStatusStorage, dynamicUrlInterceptor, this.iDaggerComponentImpl.getAddressManagerProvider, this.iDaggerComponentImpl.getRestrictRedirectsNetworkInterceptorProvider, this.iDaggerComponentImpl.getCacheErrorInterceptorProvider);
                    case 569:
                        T t12 = (T) this.iDaggerComponentImpl.composerComponentApi.getRestrictRedirectsNetworkInterceptor();
                        j.c(t12);
                        return t12;
                    case 570:
                        T t13 = (T) this.iDaggerComponentImpl.composerComponentApi.getCacheErrorInterceptor();
                        j.c(t13);
                        return t13;
                    case 571:
                        InterfaceC6369b ozonTracker2 = this.iDaggerComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker2);
                        TrackerDynamicSettingsModifier trackerDynamicSettingsModifier = this.iDaggerComponentImpl.trackerDynamicSettingsModifier();
                        DebugToolsService debugToolService3 = this.iDaggerComponentImpl.storageComponentApi.getDebugToolService();
                        j.c(debugToolService3);
                        return (T) new TrackerActionInitializer(ozonTracker2, trackerDynamicSettingsModifier, debugToolService3);
                    case 572:
                        PluginsManager pluginsManager = this.iDaggerComponentImpl.analyticsComponentApi.getPluginsManager();
                        j.c(pluginsManager);
                        return (T) new AnalyticsInitializer(pluginsManager, (DataLayerInitializer) this.iDaggerComponentImpl.bindDataLayerInitializer$main_prodGoogleAllVendorsReleaseProvider.get(), (AuthAnalytics) this.iDaggerComponentImpl.bindsAuthAnalytics$main_prodGoogleAllVendorsReleaseProvider.get());
                    case 573:
                        Context context2 = (Context) this.iDaggerComponentImpl.getContextProvider.get();
                        AnalyticsDataLayer analyticsDataLayer = this.iDaggerComponentImpl.analyticsComponentApi.getAnalyticsDataLayer();
                        j.c(analyticsDataLayer);
                        PluginsManager pluginsManager2 = this.iDaggerComponentImpl.analyticsComponentApi.getPluginsManager();
                        j.c(pluginsManager2);
                        Sg.a analyticsScreenStorage2 = this.iDaggerComponentImpl.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                        j.c(analyticsScreenStorage2);
                        return (T) new DataLayerInitializerImpl(context2, analyticsDataLayer, pluginsManager2, analyticsScreenStorage2);
                    case 574:
                        ComposerLocationRepository composerLocationRepository = this.iDaggerComponentImpl.locationComponentApi.getComposerLocationRepository();
                        j.c(composerLocationRepository);
                        UserManager userManager2 = this.iDaggerComponentImpl.accountComponentApi.getUserManager();
                        j.c(userManager2);
                        AnalyticsDataLayer analyticsDataLayer2 = this.iDaggerComponentImpl.analyticsComponentApi.getAnalyticsDataLayer();
                        j.c(analyticsDataLayer2);
                        PluginsManager pluginsManager3 = this.iDaggerComponentImpl.analyticsComponentApi.getPluginsManager();
                        j.c(pluginsManager3);
                        Sg.a analyticsScreenStorage3 = this.iDaggerComponentImpl.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                        j.c(analyticsScreenStorage3);
                        return (T) new AuthAnalyticsImpl(composerLocationRepository, userManager2, analyticsDataLayer2, pluginsManager3, analyticsScreenStorage3);
                    case 575:
                        return (T) new JodaActionInitializer((Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 576:
                        Context context3 = (Context) this.iDaggerComponentImpl.getContextProvider.get();
                        E e11 = (E) this.iDaggerComponentImpl.providePikazonClientProvider.get();
                        FeatureService featureService5 = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService5);
                        PikazonPerformanceAvailabilityChecker pikazonPerformanceAvailabilityChecker = this.iDaggerComponentImpl.imagesAnalyticsComponentApi.getPikazonPerformanceAvailabilityChecker();
                        j.c(pikazonPerformanceAvailabilityChecker);
                        f placeholderTimeHandler = this.iDaggerComponentImpl.imagesAnalyticsComponentApi.getPlaceholderTimeHandler();
                        j.c(placeholderTimeHandler);
                        AppVersionService appVersionService = this.iDaggerComponentImpl.networkComponentApi.getAppVersionService();
                        j.c(appVersionService);
                        Fg0.a ozonTrackerErrorsLogger = this.iDaggerComponentImpl.imagesAnalyticsComponentApi.getOzonTrackerErrorsLogger();
                        j.c(ozonTrackerErrorsLogger);
                        b ozonLoggerErrorsLogger = this.iDaggerComponentImpl.imagesAnalyticsComponentApi.getOzonLoggerErrorsLogger();
                        j.c(ozonLoggerErrorsLogger);
                        InterfaceC6369b ozonTracker3 = this.iDaggerComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker3);
                        return (T) new PikazonActionInitializer(context3, e11, featureService5, pikazonPerformanceAvailabilityChecker, placeholderTimeHandler, appVersionService, ozonTrackerErrorsLogger, ozonLoggerErrorsLogger, ozonTracker3);
                    case 577:
                        PikazonModule pikazonModule = this.iDaggerComponentImpl.pikazonModule;
                        InterfaceC4875q cookieJar = this.iDaggerComponentImpl.networkComponentApi.getCookieJar();
                        j.c(cookieJar);
                        PikazonUserAgentInterceptor pikazonUserAgentInterceptor = (PikazonUserAgentInterceptor) this.iDaggerComponentImpl.pikazonUserAgentInterceptorProvider.get();
                        PikazonEventListenerFactory pikazonEventListenerFactory = (PikazonEventListenerFactory) this.iDaggerComponentImpl.providePikazonEventListenerFactoryProvider.get();
                        FeatureChecker featureChecker7 = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        CronetOkHttpClientProvider cronetOkHttpClientProvider = this.iDaggerComponentImpl.networkComponentApi.getCronetOkHttpClientProvider();
                        j.c(cronetOkHttpClientProvider);
                        CronetConfig cronetConfig = (CronetConfig) this.iDaggerComponentImpl.providerCronetConfigProvider.get();
                        ComposerCronetMetricsListener composerCronetMetricsListener = (ComposerCronetMetricsListener) this.iDaggerComponentImpl.provideCronetMetricListenerProvider.get();
                        InterfaceC6369b ozonTracker4 = this.iDaggerComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker4);
                        Ld0.c ozonLimbDiStore3 = this.iDaggerComponentImpl.limb2ComponentApi.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore3);
                        return (T) PikazonModule_ProvidePikazonClientFactory.providePikazonClient(pikazonModule, cookieJar, pikazonUserAgentInterceptor, pikazonEventListenerFactory, featureChecker7, cronetOkHttpClientProvider, cronetConfig, composerCronetMetricsListener, ozonTracker4, ozonLimbDiStore3);
                    case 578:
                        AppVersionService appVersionService2 = this.iDaggerComponentImpl.networkComponentApi.getAppVersionService();
                        j.c(appVersionService2);
                        return (T) new PikazonUserAgentInterceptor(appVersionService2);
                    case 579:
                        return (T) PikazonModule_ProvidePikazonEventListenerFactoryFactory.providePikazonEventListenerFactory(this.iDaggerComponentImpl.pikazonModule, (Context) this.iDaggerComponentImpl.getContextProvider.get(), (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get(), this.iDaggerComponentImpl.pikazonEventListenerInterceptor());
                    case 580:
                        return (T) PikazonModule_ProviderCronetConfigFactory.providerCronetConfig(this.iDaggerComponentImpl.pikazonModule);
                    case 581:
                        PikazonModule pikazonModule2 = this.iDaggerComponentImpl.pikazonModule;
                        C9067a networkInfoProvider2 = this.iDaggerComponentImpl.networkComponentApi.getNetworkInfoProvider();
                        j.c(networkInfoProvider2);
                        InterfaceC6369b ozonTracker5 = this.iDaggerComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker5);
                        PerformanceTrackerDelegate performanceTrackerDelegate = this.iDaggerComponentImpl.analyticsComponentApi.getPerformanceTrackerDelegate();
                        j.c(performanceTrackerDelegate);
                        return (T) PikazonModule_ProvideCronetMetricListenerFactory.provideCronetMetricListener(pikazonModule2, networkInfoProvider2, ozonTracker5, performanceTrackerDelegate, this.iDaggerComponentImpl.pikazonEventListenerInterceptor(), (CronetConfig) this.iDaggerComponentImpl.providerCronetConfigProvider.get());
                    case 582:
                        C8590c httpLoggingInterceptorWithLimits = this.iDaggerComponentImpl.networkComponentApi.getHttpLoggingInterceptorWithLimits();
                        j.c(httpLoggingInterceptorWithLimits);
                        HttpLoggingLevelStorage httpLoggingLevelStorage = this.iDaggerComponentImpl.storageComponentApi.getHttpLoggingLevelStorage();
                        j.c(httpLoggingLevelStorage);
                        return (T) new HttpLoggingActionIntializer(httpLoggingInterceptorWithLimits, httpLoggingLevelStorage);
                    case 583:
                        Context context4 = (Context) this.iDaggerComponentImpl.getContextProvider.get();
                        EnvironmentService environmentService2 = this.iDaggerComponentImpl.storageComponentApi.getEnvironmentService();
                        j.c(environmentService2);
                        OzonGeoProxyClient ozonGeoProxyClient = this.iDaggerComponentImpl.locationComponentApi.getOzonGeoProxyClient();
                        j.c(ozonGeoProxyClient);
                        AreaLocalStore areaLocalStore = this.iDaggerComponentImpl.locationComponentApi.getAreaLocalStore();
                        j.c(areaLocalStore);
                        AppVersionService appVersionService3 = this.iDaggerComponentImpl.networkComponentApi.getAppVersionService();
                        j.c(appVersionService3);
                        ConnectionHandler internetConnectionUtils = this.iDaggerComponentImpl.networkComponentApi.getInternetConnectionUtils();
                        j.c(internetConnectionUtils);
                        return (T) new MapsActionInitializer(context4, environmentService2, ozonGeoProxyClient, areaLocalStore, appVersionService3, internetConnectionUtils);
                    case 584:
                        Application application4 = this.iDaggerComponentImpl.contextComponentDependencies.getApplication();
                        j.c(application4);
                        return (T) new ApplicationLifecycleInitializer(application4, (ApplicationLifecycleObserver) this.iDaggerComponentImpl.applicationLifecycleObserverProvider.get(), this.iDaggerComponentImpl.setOfComponentCallbacks(), this.iDaggerComponentImpl.setOfActivityLifecycleCallbacks());
                    case 585:
                        FeatureChecker featureChecker8 = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        InterfaceC6369b ozonTracker6 = this.iDaggerComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker6);
                        UserStatusStorage userStatusStorage2 = this.iDaggerComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage2);
                        return (T) new ApplicationLifecycleObserver(featureChecker8, ozonTracker6, userStatusStorage2);
                    case 586:
                        return (T) new FragmentsAppearanceUpdater((Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 587:
                        return (T) new FragmentsLifecycleHandler((FragmentsAppearanceUpdater) this.iDaggerComponentImpl.fragmentsAppearanceUpdaterProvider.get(), (BottomSheetFragmentsAppearanceUpdater) this.iDaggerComponentImpl.bottomSheetFragmentsAppearanceUpdaterProvider.get());
                    case 588:
                        return (T) new BottomSheetFragmentsAppearanceUpdater((Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 589:
                        Moshi moshi = this.iDaggerComponentImpl.networkComponentApi.getMoshi();
                        j.c(moshi);
                        return (T) new MoshiAdapterWarmerImpl(moshi, (WarmupAdaptersFacade) this.iDaggerComponentImpl.warmupAdaptersFacadeProvider.get());
                    case 590:
                        Ib.a a15 = Jb.d.a(this.iDaggerComponentImpl.setOfWarmupInfoProvider);
                        FeatureService featureService6 = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService6);
                        return (T) new WarmupAdaptersFacade(a15, featureService6);
                    case 591:
                        return (T) A.F(new MilesForBuyersWarmUpAdapterInfoProvider(), new HotTicketsWarmUpAdapterInfoProvider(), new TravelNotificationWarmUpAdapterInfoProvider(), new SearchFormV4WarmUpAdapterInfoProvider(), new SearchFormV5WarmUpAdapterInfoProvider(), new HotelsHorizontalShelvesWarmUpAdapterInfoProvider(), new AddressBookBarV2WarmupInfoProvider(), new SearchBarWarmupInfoProvider(), new BigPromoCounterNavBarWarmupInfoProvider(), new PremiumPointsWarmupInfoProvider(), new AdvBannerV4WarmupInfoProvider(), new HammersWarmupInfoProvider(), new NavigationSliderV2WarmupInfoProvider(), new MessengerCounterWarmupInfoProvider(), new OrderTrackingV4WarmupInfoProvider(), new AdvVideoBannerWarmupInfoProvider(), new TagListWarmupInfoProvider(), new TileGrid2WarmupInfoProvider(), new SearchResultsV2WarmupInfoProvider(), new ResctrictionsWarmupInfoProvider(), new CellListV2WarmupInfoProvider(), new TotalStickyV2WarmupInfoProvider(), new CartSplitV2WarmupInfoProvider(), new PremiumPointsTrainV2WarmupInfoProvider(), new MasterWarmupInfoProvider(), new ControlsV2WarmupInfoProvider(), new ControlsV3WarmupInfoProvider(), new TotalV3WarmupInfoProvider(), new CartSplitV2WarmupInfoProviderV2(), new TileScrollWarmupInfoProvider(), new ReviewGalleryPreviewWarmupInfoProvider(), new SingleReviewWarmupInfoProvider(), new ReviewGalleryWarmupInfoProvider());
                    case 592:
                        AuthStateStorage authStateStorage = this.iDaggerComponentImpl.storageComponentApi.getAuthStateStorage();
                        j.c(authStateStorage);
                        return (T) new AuthActionInitializer(authStateStorage, this.iDaggerComponentImpl.setOfAuthStateCommand());
                    case 593:
                        T t14 = (T) this.iDaggerComponentImpl.fintechLibApi.getFintechCoreLibBank();
                        j.c(t14);
                        return t14;
                    case 594:
                        return (T) new PushInitializer((OzonPushManager) this.iDaggerComponentImpl.getOzonPushManagerProvider.get());
                    case 595:
                        SharedPreferences sharedPreferences = this.iDaggerComponentImpl.storageComponentApi.getSharedPreferences();
                        j.c(sharedPreferences);
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        Set ofAtomNavigator = this.iDaggerComponentImpl.setOfAtomNavigator();
                        UserStatusStorage userStatusStorage3 = this.iDaggerComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage3);
                        return (T) new AtomActionInitializer(sharedPreferences2, ofAtomNavigator, userStatusStorage3, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get(), this.iDaggerComponentImpl.setOfAtomParserModel());
                    case 596:
                        DarkThemeManager darkThemeManager2 = this.iDaggerComponentImpl.androidPlatformComponentApi.getDarkThemeManager();
                        j.c(darkThemeManager2);
                        return (T) new DarkThemeInitializer(darkThemeManager2);
                    case 597:
                        TabConfigCache tabConfigCache3 = this.iDaggerComponentImpl.tabsComponentApi.getTabConfigCache();
                        j.c(tabConfigCache3);
                        return (T) new TabConfigInitializer(tabConfigCache3);
                    case 598:
                        AppLaunchAnalytics appLaunchAnalytics = this.iDaggerComponentImpl.analyticsComponentApi.getAppLaunchAnalytics();
                        j.c(appLaunchAnalytics);
                        AppsFlyerConversionStorage appsFlyerConversionStorage = this.iDaggerComponentImpl.analyticsComponentApi.getAppsFlyerConversionStorage();
                        j.c(appsFlyerConversionStorage);
                        g ozonRouter2 = this.iDaggerComponentImpl.navigationComponentApi.getOzonRouter();
                        j.c(ozonRouter2);
                        return (T) new AppsFlyerActionInitializer(appLaunchAnalytics, appsFlyerConversionStorage, ozonRouter2);
                    case 599:
                        UserManager userManager3 = this.iDaggerComponentImpl.accountComponentApi.getUserManager();
                        j.c(userManager3);
                        return (T) new UserStateActionInitializer(userManager3, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    default:
                        throw new AssertionError(this.f92812id);
                }
            }

            private T get6() {
                switch (this.f92812id) {
                    case 600:
                        ComposerConfiguratorStorage composerConfiguratorStorage = this.iDaggerComponentImpl.composerComponentApi.getComposerConfiguratorStorage();
                        j.c(composerConfiguratorStorage);
                        return (T) new ConfiguratorsActionInitializer(composerConfiguratorStorage, this.iDaggerComponentImpl.setOfConfiguratorFactory());
                    case 601:
                        return (T) new StoriesConfigurator();
                    case 602:
                        ComposerLocationRepository composerLocationRepository = this.iDaggerComponentImpl.locationComponentApi.getComposerLocationRepository();
                        j.c(composerLocationRepository);
                        return (T) new RefreshByLocationConfigurator(composerLocationRepository);
                    case 603:
                        return (T) new FullScreenConfigurator();
                    case 604:
                        FeatureService featureService = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        CurrentMiniAppHolder currentMiniAppHolder = this.iDaggerComponentImpl.navigationComponentApi.getCurrentMiniAppHolder();
                        j.c(currentMiniAppHolder);
                        return (T) new BottomNavigationScrollConfigurator(featureService, currentMiniAppHolder, this.iDaggerComponentImpl.hideTabBarOnScrollViewModelProvider);
                    case 605:
                        return (T) new HideTabBarOnScrollViewModel();
                    case 606:
                        InterfaceC6369b ozonTracker = this.iDaggerComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker);
                        return (T) new ComposerLifecycleConfigurator(ozonTracker);
                    case 607:
                        return (T) new ComposerActionAndRedirectConfigurator(this.iDaggerComponentImpl.composerActionAndRedirectViewModelProvider);
                    case 608:
                        return (T) new VoiceRecognitionConfigurator();
                    case 609:
                        CurrencyState currencyLocalStore = this.iDaggerComponentImpl.accountComponentApi.getCurrencyLocalStore();
                        j.c(currencyLocalStore);
                        return (T) new RefreshByCurrencyConfigurator(currencyLocalStore);
                    case 610:
                        AppLocaleChangedEventBus appLocaleChangedEventBus = this.iDaggerComponentImpl.appLocaleComponentApi.getAppLocaleChangedEventBus();
                        j.c(appLocaleChangedEventBus);
                        return (T) new RefreshByLocaleConfigurator(appLocaleChangedEventBus);
                    case 611:
                        FavoritesComposerActionHandler favoritesComposerActionHandler = this.iDaggerComponentImpl.favoritesComposerActionHandler();
                        l tokenizedAnalytics = this.iDaggerComponentImpl.composerComponentApi.getTokenizedAnalytics();
                        j.c(tokenizedAnalytics);
                        return (T) new NotificationConfigurator(favoritesComposerActionHandler, tokenizedAnalytics);
                    case 612:
                        AddressUpdateManager addressUpdateManager = (AddressUpdateManager) this.iDaggerComponentImpl.getAddressManagerProvider.get();
                        TabConfigUpdateDelegate tabConfigRequestDelegate = this.iDaggerComponentImpl.tabsComponentApi.getTabConfigRequestDelegate();
                        j.c(tabConfigRequestDelegate);
                        CartScreenStateHolder cartScreenStateHolder = this.iDaggerComponentImpl.cartServiceApi.getCartScreenStateHolder();
                        j.c(cartScreenStateHolder);
                        CartEventsController cartEventsController = this.iDaggerComponentImpl.cartComponentApi.getCartEventsController();
                        j.c(cartEventsController);
                        CartModeManager cartModeService = this.iDaggerComponentImpl.cartServiceApi.getCartModeService();
                        j.c(cartModeService);
                        PdpScreenStateHolder$State pdpScreenStateHolderCurrentState = this.iDaggerComponentImpl.pdpScreenStateHolderComponentApi.pdpScreenStateHolderCurrentState();
                        j.c(pdpScreenStateHolderCurrentState);
                        return (T) new AddressSelectorRefresherConfigurator(addressUpdateManager, tabConfigRequestDelegate, cartScreenStateHolder, cartEventsController, cartModeService, pdpScreenStateHolderCurrentState);
                    case 613:
                        return (T) new VKIDRefreshStateConfigurator((Ob0.a) this.iDaggerComponentImpl.getOzonIdAppApiProvider.get());
                    case 614:
                        return (T) new SearchByImageConfigurator();
                    case 615:
                        CartService cartService = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService);
                        Vg.d customActionHandlersStoreFactory = this.iDaggerComponentImpl.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                        j.c(customActionHandlersStoreFactory);
                        return (T) new CartActionsProcessorConfigurator(cartService, customActionHandlersStoreFactory, this.iDaggerComponentImpl.addToCartViewModelProvider);
                    case 616:
                        return (T) new SessionListConfigurator();
                    case 617:
                        return (T) new SearchPageLoadConfigurator((SearchCacheTrackerApi) this.iDaggerComponentImpl.provideSearchCacheTrackerApiProvider.get());
                    case 618:
                        Retrofit retrofit = this.iDaggerComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) SearchConfiguratorFactoryModule_Companion_ProvideSearchCacheTrackerApiFactory.provideSearchCacheTrackerApi(retrofit);
                    case 619:
                        return (T) new DialogSearchPageLoadConfigurator((SearchCacheTrackerApi) this.iDaggerComponentImpl.provideSearchCacheTrackerApiProvider.get());
                    case 620:
                        return (T) new LoaderConfigurator();
                    case 621:
                        StatusEdoState statusEdoState = this.iDaggerComponentImpl.statusEdoStateComponentApi.getStatusEdoState();
                        j.c(statusEdoState);
                        return (T) new RefreshByStatusEdoConfigurator(statusEdoState);
                    case 622:
                        ComposerConfiguratorStorage composerConfiguratorStorage2 = this.iDaggerComponentImpl.composerComponentApi.getComposerConfiguratorStorage();
                        j.c(composerConfiguratorStorage2);
                        return (T) new ComposerActionInitializer(composerConfiguratorStorage2, this.iDaggerComponentImpl.setOfComposerInterceptorFactory());
                    case 623:
                        ComposerCacheService composerCacheService = this.iDaggerComponentImpl.composerComponentApi.getComposerCacheService();
                        j.c(composerCacheService);
                        return (T) new CacheComposerInterceptor(composerCacheService);
                    case 624:
                        return (T) new WebViewInitializer();
                    case 625:
                        Application application = this.iDaggerComponentImpl.contextComponentDependencies.getApplication();
                        j.c(application);
                        return (T) new StringsProviderInitializer(application);
                    case 626:
                        Application application2 = this.iDaggerComponentImpl.contextComponentDependencies.getApplication();
                        j.c(application2);
                        return (T) new SetLocaleActionInitializer(application2, this.iDaggerComponentImpl.localizationSwitcher(), this.iDaggerComponentImpl.localizationActivityCallbackProvider);
                    case 627:
                        return (T) new LocalizationActivityCallback(this.iDaggerComponentImpl.localizationSwitcher());
                    case 628:
                        Context context = (Context) this.iDaggerComponentImpl.getContextProvider.get();
                        E10.c prefetchManager = this.iDaggerComponentImpl.composerComponentApi.getPrefetchManager();
                        j.c(prefetchManager);
                        return (T) new PrefetchManagerActionInitializer(context, prefetchManager);
                    case 629:
                        AdvertisingMessagingInteractor advertisingMessagingInteractor = this.iDaggerComponentImpl.advertisingMessagingApi.getAdvertisingMessagingInteractor();
                        j.c(advertisingMessagingInteractor);
                        return (T) new AdvertisingMessagingInitializer(advertisingMessagingInteractor);
                    case 630:
                        AdultHandler adultHandler = this.iDaggerComponentImpl.accountComponentApi.getAdultHandler();
                        j.c(adultHandler);
                        ComposerCacheService composerCacheService2 = this.iDaggerComponentImpl.composerComponentApi.getComposerCacheService();
                        j.c(composerCacheService2);
                        CartService cartService2 = this.iDaggerComponentImpl.cartServiceApi.getCartService();
                        j.c(cartService2);
                        FavoriteManager favoriteManager = this.iDaggerComponentImpl.favoriteCoreComponentApi.getFavoriteManager();
                        j.c(favoriteManager);
                        UserManager userManager = this.iDaggerComponentImpl.accountComponentApi.getUserManager();
                        j.c(userManager);
                        ComposerLocationRepository composerLocationRepository2 = this.iDaggerComponentImpl.locationComponentApi.getComposerLocationRepository();
                        j.c(composerLocationRepository2);
                        CurrencyState currencyLocalStore2 = this.iDaggerComponentImpl.accountComponentApi.getCurrencyLocalStore();
                        j.c(currencyLocalStore2);
                        AddressUpdateManager addressUpdateManager2 = (AddressUpdateManager) this.iDaggerComponentImpl.getAddressManagerProvider.get();
                        ApplyCouponState couponUpdateState = this.iDaggerComponentImpl.accountComponentApi.getCouponUpdateState();
                        j.c(couponUpdateState);
                        return (T) new ComposerCacheInvalidatorInitializer(adultHandler, composerCacheService2, cartService2, favoriteManager, userManager, composerLocationRepository2, currencyLocalStore2, addressUpdateManager2, couponUpdateState);
                    case 631:
                        return (T) new OzonGalleryInitializer((Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 632:
                        return (T) new UpdateCartInitializer(this.iDaggerComponentImpl.updateCartOnStartDelegate());
                    case 633:
                        OzonPushManager ozonPushManager = (OzonPushManager) this.iDaggerComponentImpl.getOzonPushManagerProvider.get();
                        Set<InterfaceC5666b> liveActivityListeners = this.iDaggerComponentImpl.freshComponentApi.getLiveActivityListeners();
                        j.c(liveActivityListeners);
                        return (T) new FreshLiveActivityInitializer(ozonPushManager, liveActivityListeners);
                    case 634:
                        return (T) new HapticsInitializer((FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 635:
                        return (T) new ComposerLoggingActionsInitializer((FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 636:
                        c startupTimeTracker = this.iDaggerComponentImpl.startupTimeTrackerComponentApi.getStartupTimeTracker();
                        j.c(startupTimeTracker);
                        InterfaceC6369b ozonTracker2 = this.iDaggerComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker2);
                        FeatureService featureService2 = this.iDaggerComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService2);
                        return (T) new StartupTimeTrackerInitializer(startupTimeTracker, ozonTracker2, featureService2);
                    case 637:
                        return (T) ActionInitializeModule_BindFintechLibActionInitializerFactory.bindFintechLibActionInitializer(this.iDaggerComponentImpl.actionInitializeModule, this.iDaggerComponentImpl.fintechLibActionInitializerProvider);
                    case 638:
                        return (T) new FintechLibActionInitializer(Jb.d.a(this.iDaggerComponentImpl.getFintechCoreLibBankProvider), Jb.d.a(this.iDaggerComponentImpl.getFintechCoreLibRkoProvider), Jb.d.a(this.iDaggerComponentImpl.getFintechCoreLibPayProvider));
                    case 639:
                        T t2 = (T) this.iDaggerComponentImpl.fintechLibApi.getFintechCoreLibRko();
                        j.c(t2);
                        return t2;
                    case 640:
                        T t11 = (T) this.iDaggerComponentImpl.fintechLibApi.getFintechCoreLibPay();
                        j.c(t11);
                        return t11;
                    case 641:
                        LocationRepository locationRepository = this.iDaggerComponentImpl.locationComponentApi.getLocationRepository();
                        j.c(locationRepository);
                        LastLocationRepository lastLocationRepository = this.iDaggerComponentImpl.locationComponentApi.getLastLocationRepository();
                        j.c(lastLocationRepository);
                        return (T) new LastLocationInitializer(locationRepository, lastLocationRepository);
                    case 642:
                        SberPayManager sberPayManager = this.iDaggerComponentImpl.checkoutPaymentComponentApi.getSberPayManager();
                        j.c(sberPayManager);
                        return (T) new SberPayInitializer(sberPayManager);
                    case 643:
                        GooglePayManager googlePayManager = (GooglePayManager) this.iDaggerComponentImpl.bindGooglePayManagerProvider.get();
                        FeatureChecker featureChecker = (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get();
                        AndroidPlatformComponentConfig androidPlatformComponentConfig = this.iDaggerComponentImpl.androidPlatformComponentApi.getAndroidPlatformComponentConfig();
                        j.c(androidPlatformComponentConfig);
                        return (T) new NativePaymentInitializer(googlePayManager, featureChecker, androidPlatformComponentConfig, (Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 644:
                        ManualSaveRestoreStateDelegate manualSavedStateDelegate = this.iDaggerComponentImpl.androidPlatformComponentApi.getManualSavedStateDelegate();
                        j.c(manualSavedStateDelegate);
                        return (T) new CleanCustomBundleStateActionInitializer(manualSavedStateDelegate, (FeatureChecker) this.iDaggerComponentImpl.getFeatureCheckerProvider.get());
                    case 645:
                        return (T) new JetpackComposeInitializer((Context) this.iDaggerComponentImpl.getContextProvider.get(), Jb.d.a(this.iDaggerComponentImpl.getFeatureCheckerProvider));
                    case 646:
                        return (T) new DynamicShortcutsInitializer((Context) this.iDaggerComponentImpl.getContextProvider.get());
                    case 647:
                        Ld0.c ozonLimbDiStore = this.iDaggerComponentImpl.limb2ComponentApi.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore);
                        InterfaceC6369b ozonTracker3 = this.iDaggerComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker3);
                        return (T) new OzonInAppUpdateInitializer(ozonLimbDiStore, ozonTracker3);
                    case 648:
                        return (T) new MessengerFeatureActionInitializer(Jb.d.a(this.iDaggerComponentImpl.provideMessengerFeatureProvider), Jb.d.a(this.iDaggerComponentImpl.provideAIMessengerFeatureProvider), Jb.d.a(this.iDaggerComponentImpl.provideBloggerFeatureProvider));
                    default:
                        throw new AssertionError(this.f92812id);
                }
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92812id / 100) {
                    case 0:
                        return get0();
                    case 1:
                        return get1();
                    case 2:
                        return get2();
                    case 3:
                        return get3();
                    case 4:
                        return get4();
                    case 5:
                        return get5();
                    case 6:
                        return get6();
                    default:
                        throw new AssertionError(this.f92812id);
                }
            }
        }

        /* synthetic */ IDaggerComponentImpl(AutoPickerExportModule autoPickerExportModule, ActionInitializeModule actionInitializeModule, ComposerInterceptorFactoryModule composerInterceptorFactoryModule, NamespaceModule namespaceModule, ReturnEditNavigationModule returnEditNavigationModule, HowToReturnGoodsNavigationModule howToReturnGoodsNavigationModule, ReturnCreationNavigationModule returnCreationNavigationModule, CmlOrdersNavigationModule cmlOrdersNavigationModule, CmlDeliveryNavigationModule cmlDeliveryNavigationModule, MessengerFeatureModule messengerFeatureModule, RemovePostModule removePostModule, PikazonModule pikazonModule, CsmaButtonCommonModule csmaButtonCommonModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, ActivateCodeWidgetModule activateCodeWidgetModule, SelectLinkWidgetModule selectLinkWidgetModule, LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule, ContextComponentDependencies contextComponentDependencies, IDaggerComponentDependencies iDaggerComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WhitelistComponentApi whitelistComponentApi, CacheComponentApi cacheComponentApi, BarcodeCacheComponentApi barcodeCacheComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, NotificationComponentApi notificationComponentApi, PushComponentApi pushComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AccountComponentApi accountComponentApi, AppLocaleComponentApi appLocaleComponentApi, LocationComponentApi locationComponentApi, CartComponentApi cartComponentApi, TabsComponentApi tabsComponentApi, WebComponentApi webComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, AddressComponentApi addressComponentApi, DebugMenuComponentApi debugMenuComponentApi, OzonDebugMenuComponentApi ozonDebugMenuComponentApi, ComposerComponentApi composerComponentApi, MediaUploadComponentApi mediaUploadComponentApi, AdvertisingMessagingApi advertisingMessagingApi, FreshNavigationComponentApi freshNavigationComponentApi, FreshComponentApi freshComponentApi, FintechLibApi fintechLibApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoriteComponentApi favoriteComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, OzonMapComponentApi ozonMapComponentApi, MinifyLinkComponentApi minifyLinkComponentApi, RmsComponentApi rmsComponentApi, PdfFileComponentApi pdfFileComponentApi, CouponComponentApi couponComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CheckoutPrefetchApi checkoutPrefetchApi, RestrictionsComponentApi restrictionsComponentApi, CheckoutCommonComponentApi checkoutCommonComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, GeoProviderComponentApi geoProviderComponentApi, MapCommonComponentApi mapCommonComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AuthComponentApi authComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, SearchPrefetchApi searchPrefetchApi, FavoritesUIComponentApi favoritesUIComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi, PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi, InterceptorPredicatesComponentApi interceptorPredicatesComponentApi, OrderShipmentComponentApi orderShipmentComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, DeeplinkRouteComponentApi deeplinkRouteComponentApi, MorkovskOnboardingComponentApi morkovskOnboardingComponentApi, UgcRatingComponentApi ugcRatingComponentApi, TilesDomainComponentApi tilesDomainComponentApi, UgcReviewFormComponentApi ugcReviewFormComponentApi, SelectionsCoreComponentApi selectionsCoreComponentApi, TravelStorageApi travelStorageApi, Limb2ComponentApi limb2ComponentApi, SentryApiComponent sentryApiComponent, AppOnboardingComponentApi appOnboardingComponentApi, CmlDomainComponentApi cmlDomainComponentApi, CmlDeliveryComponentApi cmlDeliveryComponentApi, NotificationStatusComponentApi notificationStatusComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi, Resources resources, int i11) {
            this(autoPickerExportModule, actionInitializeModule, composerInterceptorFactoryModule, namespaceModule, returnEditNavigationModule, howToReturnGoodsNavigationModule, returnCreationNavigationModule, cmlOrdersNavigationModule, cmlDeliveryNavigationModule, messengerFeatureModule, removePostModule, pikazonModule, csmaButtonCommonModule, screenBrightnessChangerModule, activateCodeWidgetModule, selectLinkWidgetModule, logoutOnAllDevicesWidgetModule, contextComponentDependencies, iDaggerComponentDependencies, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, whitelistComponentApi, cacheComponentApi, barcodeCacheComponentApi, firebaseAnalyticsComponentApi, notificationComponentApi, pushComponentApi, androidPlatformComponentApi, accountComponentApi, appLocaleComponentApi, locationComponentApi, cartComponentApi, tabsComponentApi, webComponentApi, videoComponentApi, cartServiceApi, cartAtomBinderComponentApi, addressComponentApi, debugMenuComponentApi, ozonDebugMenuComponentApi, composerComponentApi, mediaUploadComponentApi, advertisingMessagingApi, freshNavigationComponentApi, freshComponentApi, fintechLibApi, searchComponentApi, favoriteCoreComponentApi, favoriteComponentApi, switchingButtonComponentApi, videoCoverComponentApi, ozonMapComponentApi, minifyLinkComponentApi, rmsComponentApi, pdfFileComponentApi, couponComponentApi, thirdPartyLibrariesConfigComponentApi, inAppUpdateComponentApi, actionComponentApi, customActionHandlersComponentApi, checkoutPrefetchApi, restrictionsComponentApi, checkoutCommonComponentApi, checkoutPaymentComponentApi, composerWidgetAsyncComponentApi, geoProviderComponentApi, mapCommonComponentApi, cdnVideoComponentApi, authComponentApi, coroutineDispatchersComponentApi, cdnHostManagerComponentApi, closeFlowWatcherComponentApi, onboardingCheckerComponentApi, searchPrefetchApi, favoritesUIComponentApi, favoritesDataComponentApi, imagesAnalyticsComponentApi, commonActionHandlersFactoryComponentApi, pdpScreenStateHolderComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, legalsResultStateHolderComponentApi, statusEdoStateComponentApi, interceptorPredicatesComponentApi, orderShipmentComponentApi, pdpOfflineScreenComponentApi, travelPushOnboardingComponentApi, deeplinkRouteComponentApi, morkovskOnboardingComponentApi, ugcRatingComponentApi, tilesDomainComponentApi, ugcReviewFormComponentApi, selectionsCoreComponentApi, travelStorageApi, limb2ComponentApi, sentryApiComponent, appOnboardingComponentApi, cmlDomainComponentApi, cmlDeliveryComponentApi, notificationStatusComponentApi, storefrontCommonComponentApi, resources);
        }

        private AbToolAuthStateCommand abToolAuthStateCommand() {
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            UserManager userManager = this.accountComponentApi.getUserManager();
            j.c(userManager);
            return new AbToolAuthStateCommand(featureService, userManager);
        }

        private ActivateCodeConfig activateCodeConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ActivateCodeConfig(jsonDeserializer);
        }

        private ActivateCodeViewMapper activateCodeViewMapper() {
            CouponInteractor couponInteractor = this.couponComponentApi.getCouponInteractor();
            j.c(couponInteractor);
            CouponStorage couponStorage = this.couponComponentApi.getCouponStorage();
            j.c(couponStorage);
            return new ActivateCodeViewMapper(couponInteractor, couponStorage);
        }

        private ActivationTitleConfig activationTitleConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ActivationTitleConfig(jsonDeserializer);
        }

        private ActivationTitleViewMapper activationTitleViewMapper() {
            a<DiscountCodeViewModel> aVar = this.discountCodeViewModelProvider;
            CheckoutPrefetchController checkoutPrefetchController = this.checkoutPrefetchApi.getCheckoutPrefetchController();
            j.c(checkoutPrefetchController);
            return new ActivationTitleViewMapper(aVar, checkoutPrefetchController);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AddEdoStatusStorage addEdoStatusStorage() {
            StatusEdoState statusEdoState = this.statusEdoStateComponentApi.getStatusEdoState();
            j.c(statusEdoState);
            return new AddEdoStatusStorage(statusEdoState);
        }

        private AddPassToWalletActionHandler addPassToWalletActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new AddPassToWalletActionHandler(actionRepository);
        }

        private AdultAuthStateCommand adultAuthStateCommand() {
            AdultState adultState = this.storageComponentApi.getAdultState();
            j.c(adultState);
            AdultStateStore adultStore = this.storageComponentApi.getAdultStore();
            j.c(adultStore);
            return new AdultAuthStateCommand(adultState, adultStore);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AdultConfirmationRepository adultConfirmationRepository() {
            ComposerActionsExecutor composerActionsExecutor = this.provideApiProvider.get();
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            JsonSerializer jsonSerializer = this.networkComponentApi.getJsonSerializer();
            j.c(jsonSerializer);
            return new AdultConfirmationRepository(composerActionsExecutor, jsonDeserializer, jsonSerializer);
        }

        private AllToCartConfig allToCartConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new AllToCartConfig(jsonDeserializer);
        }

        private AllToCartViewMapper allToCartViewMapper() {
            return new AllToCartViewMapper(this.allToCartViewModelProvider, this.handlersInhibitorProvider.get());
        }

        private AnnotationConfig annotationConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new AnnotationConfig(jsonDeserializer);
        }

        private AnnotationNoUiViewMapper annotationNoUiViewMapper() {
            return new AnnotationNoUiViewMapper(this.getContextProvider.get(), createFavoritesListDelegate());
        }

        private AnnotationViewMapper annotationViewMapper() {
            return new AnnotationViewMapper(this.getContextProvider.get(), createFavoritesListDelegate());
        }

        private AppStoreRouter appStoreRouter() {
            Context context = this.getContextProvider.get();
            AppStoreInfoProvider appStoreInfoProvider = this.analyticsComponentApi.getAppStoreInfoProvider();
            j.c(appStoreInfoProvider);
            return new AppStoreRouter(context, appStoreInfoProvider);
        }

        private AuthAnalyticsStateCommand authAnalyticsStateCommand() {
            UserManager userManager = this.accountComponentApi.getUserManager();
            j.c(userManager);
            fi0.e customPropertyTracker = this.analyticsComponentApi.getCustomPropertyTracker();
            j.c(customPropertyTracker);
            ComposerLocationRepository composerLocationRepository = this.locationComponentApi.getComposerLocationRepository();
            j.c(composerLocationRepository);
            return new AuthAnalyticsStateCommand(userManager, customPropertyTracker, composerLocationRepository, this.getFeatureCheckerProvider.get());
        }

        private AuthConfig authConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new AuthConfig(jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AuthFlowMapper authFlowMapper() {
            KeyStoreRepository keyStoreRepository = this.accountComponentApi.getKeyStoreRepository();
            j.c(keyStoreRepository);
            return new AuthFlowMapper(keyStoreRepository);
        }

        private AuthMapper authMapper() {
            return new AuthMapper(this.authOriginStorageProvider.get());
        }

        private AuthViewMapper authViewMapper() {
            a<AuthViewModel> aVar = this.authViewModelProvider;
            a<BiometricAuthViewModelImpl> aVar2 = this.biometricAuthViewModelImplProvider;
            BiometryAuthenicator biometryAuthenicator = biometryAuthenicator();
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            JsonSerializer jsonSerializer = this.networkComponentApi.getJsonSerializer();
            j.c(jsonSerializer);
            return new AuthViewMapper(aVar, aVar2, biometryAuthenicator, ozonRouter, jsonSerializer, authMapper());
        }

        private B2bAcceptActApi b2bAcceptActApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return B2bAcceptActModule_Companion_ProvideB2bAcceptActApiFactory.provideB2bAcceptActApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public B2bAcceptActRepositoryImpl b2bAcceptActRepositoryImpl() {
            return new B2bAcceptActRepositoryImpl(b2bAcceptActApi());
        }

        private B2bDeleteConsigneeApi b2bDeleteConsigneeApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return B2bDeleteConsigneeModule_Companion_ProvideB2bDeleteConsigneeApiFactory.provideB2bDeleteConsigneeApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public B2bDeleteConsigneeRepositoryImpl b2bDeleteConsigneeRepositoryImpl() {
            return new B2bDeleteConsigneeRepositoryImpl(b2bDeleteConsigneeApi());
        }

        private B2bDownloadFileApi b2bDownloadFileApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return B2bDownloadFileModule_Companion_ProvideB2bDownloadFileApiFactory.provideB2bDownloadFileApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public B2bDownloadFileRepositoryImpl b2bDownloadFileRepositoryImpl() {
            return new B2bDownloadFileRepositoryImpl(b2bDownloadFileApi());
        }

        private B2bRemoveLegalApi b2bRemoveLegalApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return B2bRemoveLegalModule_Companion_ProvideB2bSwitchUserApiFactory.provideB2bSwitchUserApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public B2bRemoveLegalRepositoryImpl b2bRemoveLegalRepositoryImpl() {
            return new B2bRemoveLegalRepositoryImpl(b2bRemoveLegalApi());
        }

        private B2bResetEdoVerificationApi b2bResetEdoVerificationApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return B2bResetEdoVerificationModule_Companion_ProvideB2bResetEdoVerificationApiFactory.provideB2bResetEdoVerificationApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public B2bResetEdoVerificationRepositoryImpl b2bResetEdoVerificationRepositoryImpl() {
            return new B2bResetEdoVerificationRepositoryImpl(b2bResetEdoVerificationApi());
        }

        private B2bSelectConsigneeApi b2bSelectConsigneeApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return B2bSelectConsigneeModule_Companion_ProvideB2bSelectConsigneeApiFactory.provideB2bSelectConsigneeApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public B2bSelectConsigneeRepositoryImpl b2bSelectConsigneeRepositoryImpl() {
            return new B2bSelectConsigneeRepositoryImpl(b2bSelectConsigneeApi());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BankAuthDestinationInterceptor bankAuthDestinationInterceptor() {
            return new BankAuthDestinationInterceptor(this.authDestinationInterceptorImplProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BankGlobalDeeplinkInterceptor bankGlobalDeeplinkInterceptor() {
            Application application = this.contextComponentDependencies.getApplication();
            j.c(application);
            FintechActivityLifecycleCallback fintechActivityLifecycleCallback = this.iDaggerComponentDependencies.getFintechActivityLifecycleCallback();
            j.c(fintechActivityLifecycleCallback);
            return new BankGlobalDeeplinkInterceptor(application, fintechActivityLifecycleCallback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BarcodeStatusWidgetFactory barcodeStatusWidgetFactory() {
            AppVersionService appVersionService = this.networkComponentApi.getAppVersionService();
            j.c(appVersionService);
            TeensModeStorage teensModeStorage = this.storageComponentApi.getTeensModeStorage();
            j.c(teensModeStorage);
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new BarcodeStatusWidgetFactory(appVersionService, teensModeStorage, moshi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BarcodeWidgetFactory barcodeWidgetFactory() {
            BarcodeCacheManager persistentCacheManager = this.barcodeCacheComponentApi.getPersistentCacheManager();
            j.c(persistentCacheManager);
            AppVersionService appVersionService = this.networkComponentApi.getAppVersionService();
            j.c(appVersionService);
            CurrentMiniAppHolder currentMiniAppHolder = this.navigationComponentApi.getCurrentMiniAppHolder();
            j.c(currentMiniAppHolder);
            TeensModeStorage teensModeStorage = this.storageComponentApi.getTeensModeStorage();
            j.c(teensModeStorage);
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new BarcodeWidgetFactory(persistentCacheManager, appVersionService, currentMiniAppHolder, teensModeStorage, moshi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BigPromoCounterNavBarPreCreateInfoProvider bigPromoCounterNavBarPreCreateInfoProvider() {
            return new BigPromoCounterNavBarPreCreateInfoProvider(this.getFeatureCheckerProvider.get());
        }

        private BiometryAuthenicator biometryAuthenicator() {
            KeyStoreRepository keyStoreRepository = this.accountComponentApi.getKeyStoreRepository();
            j.c(keyStoreRepository);
            return new BiometryAuthenicator(keyStoreRepository);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public BiometryInfoRepository biometryInfoRepository() {
            return new BiometryInfoRepository(Jb.d.a(this.getOzonIdAppApiProvider));
        }

        private BottomNavigationScrollConfiguratorFactory bottomNavigationScrollConfiguratorFactory() {
            return new BottomNavigationScrollConfiguratorFactory(this.bottomNavigationScrollConfiguratorProvider);
        }

        private CacheComposerInterceptorFactory cacheComposerInterceptorFactory() {
            return new CacheComposerInterceptorFactory(this.cacheComposerInterceptorProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CancelReasonsRepositoryImpl cancelReasonsRepositoryImpl() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new CancelReasonsRepositoryImpl(actionRepository);
        }

        private CartActionsProcessorConfiguratorFactory cartActionsProcessorConfiguratorFactory() {
            return new CartActionsProcessorConfiguratorFactory(this.cartActionsProcessorConfiguratorProvider);
        }

        private CartAuthStateCommand cartAuthStateCommand() {
            CartService cartService = this.cartServiceApi.getCartService();
            j.c(cartService);
            return new CartAuthStateCommand(cartService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CartDeeplinkInterceptor cartDeeplinkInterceptor() {
            HZ.d deeplinkMiniAppMapper = this.navigationComponentApi.getDeeplinkMiniAppMapper();
            j.c(deeplinkMiniAppMapper);
            FeatureChecker featureChecker = this.getFeatureCheckerProvider.get();
            CartNavigationService cartNavigationService = this.cartServiceApi.getCartNavigationService();
            j.c(cartNavigationService);
            return new CartDeeplinkInterceptor(deeplinkMiniAppMapper, featureChecker, cartNavigationService);
        }

        private CellConfig cellConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new CellConfig(jsonDeserializer);
        }

        private CellListConfig cellListConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new CellListConfig(jsonDeserializer);
        }

        private CellListViewMapper cellListViewMapper() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return new CellListViewMapper(customActionHandlersStoreFactory);
        }

        private CellViewMapper cellViewMapper() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return new CellViewMapper(customActionHandlersStoreFactory);
        }

        private CertificatesConfig certificatesConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new CertificatesConfig(jsonDeserializer);
        }

        private ChangeCurrencyActionHandler changeCurrencyActionHandler() {
            CurrencyRepository currencyRepository = this.accountComponentApi.getCurrencyRepository();
            j.c(currencyRepository);
            return new ChangeCurrencyActionHandler(currencyRepository);
        }

        private ChangePaymentMethodAndPayActionHandler changePaymentMethodAndPayActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            a<CreateAndPayViewModel> aVar = this.createAndPayViewModelProvider;
            ApplicationInfoDataSource applicationInfoStorage = this.storageComponentApi.getApplicationInfoStorage();
            j.c(applicationInfoStorage);
            return new ChangePaymentMethodAndPayActionHandler(actionRepository, aVar, applicationInfoStorage);
        }

        private CheckFastPayActionHandler checkFastPayActionHandler() {
            return new CheckFastPayActionHandler(this.checkFastPayViewModelProvider);
        }

        private CheckFreshAIConversationStatusActionHandler checkFreshAIConversationStatusActionHandler() {
            a<PromptStatusViewModel> aVar = this.promptStatusViewModelProvider;
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new CheckFreshAIConversationStatusActionHandler(aVar, actionRepository);
        }

        private CleanCncAddressActionHandler cleanCncAddressActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new CleanCncAddressActionHandler(actionRepository);
        }

        private CloseButtonConfig closeButtonConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new CloseButtonConfig(jsonDeserializer);
        }

        private ClosePromoStickyBubbleAction closePromoStickyBubbleAction() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new ClosePromoStickyBubbleAction(actionRepository);
        }

        private CmlAppHandler cmlAppHandler() {
            e miniAppConfigHolder = this.navigationComponentApi.getMiniAppConfigHolder();
            j.c(miniAppConfigHolder);
            return new CmlAppHandler(miniAppConfigHolder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CodeActivationAnalytics codeActivationAnalytics() {
            AnalyticsDataLayer analyticsDataLayer = this.analyticsComponentApi.getAnalyticsDataLayer();
            j.c(analyticsDataLayer);
            PluginsManager pluginsManager = this.analyticsComponentApi.getPluginsManager();
            j.c(pluginsManager);
            Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
            j.c(analyticsScreenStorage);
            return new CodeActivationAnalytics(analyticsDataLayer, pluginsManager, analyticsScreenStorage);
        }

        private CollapseCellListActionHandler collapseCellListActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new CollapseCellListActionHandler(actionRepository);
        }

        private CommonEmptyStateViewMapper commonEmptyStateViewMapper() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new CommonEmptyStateViewMapper(ozonRouter, this.getFeatureCheckerProvider.get());
        }

        private ComparisonApi comparisonApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return PdpComparisonModule_Companion_ProvideComparisonApiFactory.provideComparisonApi(retrofit);
        }

        private ComparisonCarouselViewMapper comparisonCarouselViewMapper() {
            ProductFavoriteDelegateProvider favoriteProductDelegate = this.favoriteComponentApi.getFavoriteProductDelegate();
            j.c(favoriteProductDelegate);
            return new ComparisonCarouselViewMapper(favoriteProductDelegate, comparisonCarouselViewModel(), this.handlersInhibitorProvider.get(), this.getCartAtomBinderProvider);
        }

        private ComparisonCarouselViewModel comparisonCarouselViewModel() {
            CartService cartService = this.cartServiceApi.getCartService();
            j.c(cartService);
            SubscriptionService subscriptionServiceProvider = this.accountComponentApi.getSubscriptionServiceProvider();
            j.c(subscriptionServiceProvider);
            FavoriteInteractor favoriteInteractor = this.favoriteCoreComponentApi.getFavoriteInteractor();
            j.c(favoriteInteractor);
            return new ComparisonCarouselViewModel(cartService, subscriptionServiceProvider, favoriteInteractor);
        }

        private ComparisonCharacteristicsPickViewMapper comparisonCharacteristicsPickViewMapper() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new ComparisonCharacteristicsPickViewMapper(ozonRouter, this.handlersInhibitorProvider.get());
        }

        private ComparisonConfig comparisonConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ComparisonConfig(jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ComparisonRepository comparisonRepository() {
            return new ComparisonRepository(comparisonApi(), new ComparisonMapper());
        }

        private ComposerActionAndRedirectConfiguratorFactory composerActionAndRedirectConfiguratorFactory() {
            return new ComposerActionAndRedirectConfiguratorFactory(this.composerActionAndRedirectConfiguratorProvider);
        }

        private ComposerActionWithActionHandlerV2 composerActionWithActionHandlerV2() {
            OneTimePostRefreshHandlerV2 oneTimePostRefreshHandlerV2 = oneTimePostRefreshHandlerV2();
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new ComposerActionWithActionHandlerV2(oneTimePostRefreshHandlerV2, appType, actionRepository, this.getFeatureCheckerProvider.get());
        }

        private ComposerAddressSelectorConfiguratorFactory composerAddressSelectorConfiguratorFactory() {
            return new ComposerAddressSelectorConfiguratorFactory(this.addressSelectorRefresherConfiguratorProvider);
        }

        private ComposerLifecycleConfiguratorFactory composerLifecycleConfiguratorFactory() {
            return new ComposerLifecycleConfiguratorFactory(this.composerLifecycleConfiguratorProvider);
        }

        private ConfigChangesComponentCallback configChangesComponentCallback() {
            ActivityLifeCycleHolder activityLifeCycleHolder = this.androidPlatformComponentApi.getActivityLifeCycleHolder();
            j.c(activityLifeCycleHolder);
            return new ConfigChangesComponentCallback(activityLifeCycleHolder, this.fragmentsAppearanceUpdaterProvider.get());
        }

        private ConfirmBloggerChannelActionHandler confirmBloggerChannelActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new ConfirmBloggerChannelActionHandler(actionRepository);
        }

        private ConfirmDeleteOtpConfig confirmDeleteOtpConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ConfirmDeleteOtpConfig(jsonDeserializer);
        }

        private ConfirmDeleteOtpNoUiViewMapper confirmDeleteOtpNoUiViewMapper() {
            a<ConfirmDeleteOtpViewModelImpl> aVar = this.confirmDeleteOtpViewModelImplProvider;
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new ConfirmDeleteOtpNoUiViewMapper(aVar, ozonRouter, new InputTypeMapper(), this.oTPPeriodFormatterBuilderProvider.get());
        }

        private ContractBtnConfig contractBtnConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ContractBtnConfig(jsonDeserializer);
        }

        private ContractBtnViewMapper contractBtnViewMapper() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new ContractBtnViewMapper(ozonRouter);
        }

        private CouponListConfig couponListConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new CouponListConfig(jsonDeserializer);
        }

        private CouponListViewMapper couponListViewMapper() {
            CouponMapper couponMapper = new CouponMapper();
            CouponPromoRouter couponPromoRouter = couponPromoRouter();
            Context context = this.getContextProvider.get();
            CouponListDecoration couponListDecoration = new CouponListDecoration();
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            return new CouponListViewMapper(couponMapper, couponPromoRouter, context, couponListDecoration, adultHandler, this.couponViewModelImplProvider, this.getFeatureCheckerProvider.get());
        }

        private CouponPromoConfig couponPromoConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new CouponPromoConfig(jsonDeserializer);
        }

        private CouponPromoMapper couponPromoMapper() {
            return new CouponPromoMapper(this.getContextProvider.get(), textParserProvider());
        }

        private CouponPromoNoUiViewMapper couponPromoNoUiViewMapper() {
            return new CouponPromoNoUiViewMapper(couponPromoMapper(), couponPromoRouter());
        }

        private CouponPromoRouter couponPromoRouter() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new CouponPromoRouter(ozonRouter);
        }

        private CouponPromoViewMapper couponPromoViewMapper() {
            return new CouponPromoViewMapper(couponPromoRouter(), couponPromoMapper(), this.couponViewModelImplProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CreateAndPayAnalytics createAndPayAnalytics() {
            AnalyticsDataLayer analyticsDataLayer = this.analyticsComponentApi.getAnalyticsDataLayer();
            j.c(analyticsDataLayer);
            PluginsManager pluginsManager = this.analyticsComponentApi.getPluginsManager();
            j.c(pluginsManager);
            Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
            j.c(analyticsScreenStorage);
            return new CreateAndPayAnalytics(analyticsDataLayer, pluginsManager, analyticsScreenStorage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CreateAndPayRepository createAndPayRepository() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new CreateAndPayRepository(actionRepository);
        }

        private CreateFavoritesListDelegate createFavoritesListDelegate() {
            FavoritesListsInteractor favoritesListsInteractor = this.favoriteCoreComponentApi.getFavoritesListsInteractor();
            j.c(favoritesListsInteractor);
            FavoritesListsEventsManager favoritesListsEventsManager = this.favoritesUIComponentApi.getFavoritesListsEventsManager();
            j.c(favoritesListsEventsManager);
            AuthStateStorage authStateStorage = this.storageComponentApi.getAuthStateStorage();
            j.c(authStateStorage);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new CreateFavoritesListDelegate(favoritesListsInteractor, favoritesListsEventsManager, authStateStorage, ozonRouter);
        }

        private CreateFreshAIConversationActionHandler createFreshAIConversationActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new CreateFreshAIConversationActionHandler(actionRepository, this.freshAISharedViewModelProvider);
        }

        private CreateFreshOrderActionHandler createFreshOrderActionHandler() {
            return new CreateFreshOrderActionHandler(this.createAndPayViewModelProvider);
        }

        private CreateFreshOrderV2ActionHandler createFreshOrderV2ActionHandler() {
            return new CreateFreshOrderV2ActionHandler(this.createAndPayViewModelProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CreateServiceRepository createServiceRepository() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new CreateServiceRepository(actionRepository);
        }

        private CrosslinkConfig crosslinkConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new CrosslinkConfig(jsonDeserializer);
        }

        private CrosslinkViewMapper crosslinkViewMapper() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new CrosslinkViewMapper(ozonRouter, this.handlersInhibitorProvider.get());
        }

        private CurtainConfig curtainConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new CurtainConfig(jsonDeserializer);
        }

        private CurtainCustomViewMapper curtainCustomViewMapper() {
            return new CurtainCustomViewMapper(new DeepLinkProcessor(), this.getFeatureCheckerProvider.get());
        }

        private CurtainNavBarConfig curtainNavBarConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new CurtainNavBarConfig(jsonDeserializer);
        }

        private CurtainNavBarViewMapper curtainNavBarViewMapper() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return new CurtainNavBarViewMapper(customActionHandlersStoreFactory);
        }

        private CurtainViewMapper curtainViewMapper() {
            return new CurtainViewMapper(this.getFeatureCheckerProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OnBoardingDisplayDisableRepository.Default default_() {
            SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
            j.c(sharedPreferences);
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            AppVersionService appVersionService = this.networkComponentApi.getAppVersionService();
            j.c(appVersionService);
            return new OnBoardingDisplayDisableRepository.Default(sharedPreferences, featureService, appVersionService);
        }

        private DeleteAccountApi deleteAccountApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return DeleteAccountModule_ProvideDeleteAccountApiFactory.provideDeleteAccountApi(retrofit);
        }

        private DeleteAccountButtonConfig deleteAccountButtonConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new DeleteAccountButtonConfig(jsonDeserializer);
        }

        private DeleteAccountButtonViewMapper deleteAccountButtonViewMapper() {
            return new DeleteAccountButtonViewMapper(this.deleteAccountButtonViewModelImplProvider);
        }

        private DeleteAccountDescriptionConfig deleteAccountDescriptionConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new DeleteAccountDescriptionConfig(jsonDeserializer);
        }

        private DeleteAccountDescriptionStickyNoUIViewMapper deleteAccountDescriptionStickyNoUIViewMapper() {
            return new DeleteAccountDescriptionStickyNoUIViewMapper(this.deleteAccountDescriptionStickyViewModelImplProvider);
        }

        private DeleteAccountDescriptionViewMapper deleteAccountDescriptionViewMapper() {
            return new DeleteAccountDescriptionViewMapper(this.deleteAccountDescriptionStickyViewModelImplProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DeleteAccountRepository deleteAccountRepository() {
            return new DeleteAccountRepository(deleteAccountApi());
        }

        private DialogSearchPageLoadConfiguratorFactory dialogSearchPageLoadConfiguratorFactory() {
            return new DialogSearchPageLoadConfiguratorFactory(this.dialogSearchPageLoadConfiguratorProvider);
        }

        private DisclaimerConfig disclaimerConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new DisclaimerConfig(jsonDeserializer);
        }

        private DisclaimerViewMapper disclaimerViewMapper() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return new DisclaimerViewMapper(customActionHandlersStoreFactory, this.getContextProvider.get());
        }

        private DiscountCodeApi discountCodeApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return ActivationTitleModule_Companion_ProvideDiscountCodeApiFactory.provideDiscountCodeApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DiscountCodeRepositoryImpl discountCodeRepositoryImpl() {
            return new DiscountCodeRepositoryImpl(discountCodeApi());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DocsDeliveryRepository docsDeliveryRepository() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return new DocsDeliveryRepository(retrofit);
        }

        private EditUserFullNameApi editUserFullNameApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return EditUserFullNameModule_ProvideEditUserFullNameApiFactory.provideEditUserFullNameApi(retrofit);
        }

        private EditUserFullNameConfig editUserFullNameConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new EditUserFullNameConfig(jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public EditUserFullNameRepository editUserFullNameRepository() {
            return new EditUserFullNameRepository(editUserFullNameApi());
        }

        private EditUserFullNameViewMapper editUserFullNameViewMapper() {
            return new EditUserFullNameViewMapper(new EditUserFullNameMapper(), this.editUserFullNameViewModelImplProvider, new TextFieldFactory(), new TextFieldBinder());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public EmptyScreenIslandSeparatorFactory emptyScreenIslandSeparatorFactory() {
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new EmptyScreenIslandSeparatorFactory(moshi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public EmptyScreenStatusWidgetFactory emptyScreenStatusWidgetFactory() {
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new EmptyScreenStatusWidgetFactory(appType, moshi);
        }

        private EmptyStateConfig emptyStateConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new EmptyStateConfig(jsonDeserializer);
        }

        private EnablePushNotificationsActionHandler enablePushNotificationsActionHandler() {
            return new EnablePushNotificationsActionHandler(this.promoPushEnableViewModelProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public EnvironmentDeeplinkHandler environmentDeeplinkHandler() {
            AtMostQaUserDestinationInterceptorImpl atMostQaUserDestinationInterceptorImpl = this.atMostQaUserDestinationInterceptorImplProvider.get();
            FlavorType flavorType = this.iDaggerComponentDependencies.getFlavorType();
            j.c(flavorType);
            EnvironmentService environmentService = this.storageComponentApi.getEnvironmentService();
            j.c(environmentService);
            return new EnvironmentDeeplinkHandler(atMostQaUserDestinationInterceptorImpl, flavorType, environmentService);
        }

        private ExpandCellListActionHandler expandCellListActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new ExpandCellListActionHandler(actionRepository);
        }

        private ExpressAppHandler expressAppHandler() {
            e miniAppConfigHolder = this.navigationComponentApi.getMiniAppConfigHolder();
            j.c(miniAppConfigHolder);
            return new ExpressAppHandler(miniAppConfigHolder, this.getFeatureCheckerProvider.get());
        }

        private ExpressSellerAppHandler expressSellerAppHandler() {
            e miniAppConfigHolder = this.navigationComponentApi.getMiniAppConfigHolder();
            j.c(miniAppConfigHolder);
            return new ExpressSellerAppHandler(miniAppConfigHolder, this.getFeatureCheckerProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ExtendBackgroundFactory extendBackgroundFactory() {
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new ExtendBackgroundFactory(moshi);
        }

        private ExternalAppNavigationHandler externalAppNavigationHandler() {
            AppStoreRouter appStoreRouter = appStoreRouter();
            SelectAppStoreAvailabilityChecker selectAppStoreAvailabilityChecker = selectAppStoreAvailabilityChecker();
            EnvironmentService environmentService = this.storageComponentApi.getEnvironmentService();
            j.c(environmentService);
            return new ExternalAppNavigationHandler(appStoreRouter, selectAppStoreAvailabilityChecker, environmentService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ExtraHeaderDeeplinkHandler extraHeaderDeeplinkHandler() {
            return new ExtraHeaderDeeplinkHandler(this.atMostQaUserDestinationInterceptorImplProvider.get(), this.getExtraHeadersDataSourceProvider);
        }

        private FailedExternalLinkRetryFeatureChecker failedExternalLinkRetryFeatureChecker() {
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            return new FailedExternalLinkRetryFeatureChecker(featureService, appType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FastPayRepository fastPayRepository() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new FastPayRepository(actionRepository);
        }

        private FavoriteComposerActionExecutor favoriteComposerActionExecutor() {
            FavoritesServiceProvider favoritesServiceProvider = this.favoriteCoreComponentApi.getFavoritesServiceProvider();
            j.c(favoritesServiceProvider);
            FavoriteManager favoriteManager = this.favoriteCoreComponentApi.getFavoriteManager();
            j.c(favoriteManager);
            return new FavoriteComposerActionExecutor(favoritesServiceProvider, favoriteManager);
        }

        private FavoriteProductConfig favoriteProductConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new FavoriteProductConfig(jsonDeserializer);
        }

        private FavoriteProductWidgetViewMapper favoriteProductWidgetViewMapper() {
            ProductFavoriteDelegateProvider favoriteProductDelegate = this.favoriteComponentApi.getFavoriteProductDelegate();
            j.c(favoriteProductDelegate);
            return new FavoriteProductWidgetViewMapper(favoriteProductDelegate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FavoritesComposerActionHandler favoritesComposerActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            FavoriteEventManager favEventManager = this.favoriteCoreComponentApi.getFavEventManager();
            j.c(favEventManager);
            FavoriteManager favoriteManager = this.favoriteCoreComponentApi.getFavoriteManager();
            j.c(favoriteManager);
            WishlistEventManager wishlistEventManager = this.favoriteCoreComponentApi.getWishlistEventManager();
            j.c(wishlistEventManager);
            return new FavoritesComposerActionHandler(actionRepository, favEventManager, favoriteManager, wishlistEventManager, this.getFeatureCheckerProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FavoritesCustomActionHandlerInteractor favoritesCustomActionHandlerInteractor() {
            return new FavoritesCustomActionHandlerInteractor(favoriteComposerActionExecutor());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FeatureFlagDeeplinkHandler featureFlagDeeplinkHandler() {
            AtMostQaUserDestinationInterceptorImpl atMostQaUserDestinationInterceptorImpl = this.atMostQaUserDestinationInterceptorImplProvider.get();
            FeatureUpdater featureUpdater = this.networkComponentApi.getFeatureUpdater();
            j.c(featureUpdater);
            return new FeatureFlagDeeplinkHandler(atMostQaUserDestinationInterceptorImpl, featureUpdater);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FilterActionProcessor filterActionProcessor() {
            return new FilterActionProcessor(new ApplyFilterActionProcessor(), new DiscardFilterActionProcesser(), new ResetFilterActionProcesser(), new RangeChangeFilterProcesser());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FintechAutoTestDeeplinkHandler fintechAutoTestDeeplinkHandler() {
            return new FintechAutoTestDeeplinkHandler(this.atMostQaUserDestinationInterceptorImplProvider.get());
        }

        private FormPageConfig formPageConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new FormPageConfig(jsonDeserializer);
        }

        private FormPageLandingLimitConfig formPageLandingLimitConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new FormPageLandingLimitConfig(jsonDeserializer);
        }

        private FormPageLandingLimitNoUiViewMapper formPageLandingLimitNoUiViewMapper() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new FormPageLandingLimitNoUiViewMapper(ozonRouter, this.landingLimitViewModelImplProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FormPageLandingLimitRepository formPageLandingLimitRepository() {
            return new FormPageLandingLimitRepository(this.provideFormPageApiDataSourceProvider.get());
        }

        private FormPageLandingLimitUiViewMapper formPageLandingLimitUiViewMapper() {
            return new FormPageLandingLimitUiViewMapper(this.landingLimitViewModelImplProvider);
        }

        private FormPageRouter formPageRouter() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new FormPageRouter(ozonRouter);
        }

        private FormPageViewMapper formPageViewMapper() {
            return new FormPageViewMapper(this.formPageViewModelImplProvider, formPageRouter(), this.getContextProvider.get());
        }

        private FreshAddToCartActionHandler freshAddToCartActionHandler() {
            CartService cartService = this.cartServiceApi.getCartService();
            j.c(cartService);
            return new FreshAddToCartActionHandler(cartService);
        }

        private FreshRemoveCartItemsOnModalActionHandler freshRemoveCartItemsOnModalActionHandler() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new FreshRemoveCartItemsOnModalActionHandler(jsonDeserializer, actionRepository);
        }

        private FullScreenConfiguratorFactory fullScreenConfiguratorFactory() {
            return new FullScreenConfiguratorFactory(this.fullScreenConfiguratorProvider);
        }

        private GalleryV2Config galleryV2Config() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new GalleryV2Config(jsonDeserializer);
        }

        private GalleryV2ViewMapper galleryV2ViewMapper() {
            GalleryV2Mapper galleryV2Mapper = new GalleryV2Mapper();
            Ib.a a11 = Jb.d.a(this.handlersInhibitorProvider);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new GalleryV2ViewMapper(galleryV2Mapper, a11, ozonRouter);
        }

        private GalleryV4Config galleryV4Config() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new GalleryV4Config(jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GalleryV4WidgetFactory galleryV4WidgetFactory() {
            PdpOfflineScreenWidgetsData pdpEmptyScreenService = this.pdpOfflineScreenComponentApi.pdpEmptyScreenService();
            j.c(pdpEmptyScreenService);
            GalleryV4Config galleryV4Config = galleryV4Config();
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new GalleryV4WidgetFactory(pdpEmptyScreenService, galleryV4Config, moshi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GooglePayManagerImpl googlePayManagerImpl() {
            GooglePayAvailabilityStorage googlePayAvailabilityStorage = this.checkoutPaymentComponentApi.getGooglePayAvailabilityStorage();
            j.c(googlePayAvailabilityStorage);
            return new GooglePayManagerImpl(googlePayAvailabilityStorage);
        }

        private HeaderConfig headerConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new HeaderConfig(jsonDeserializer);
        }

        private HeaderViewMapper headerViewMapper() {
            ActionHandlersFactory actionHandlersFactory = this.commonActionHandlersFactoryComponentApi.getActionHandlersFactory();
            j.c(actionHandlersFactory);
            return new HeaderViewMapper(actionHandlersFactory);
        }

        private HideStickyCellActionHandler hideStickyCellActionHandler() {
            return new HideStickyCellActionHandler(this.stickyCellViewModelProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public HomeCreditApi homeCreditApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return HomeCreditActionHandlerModule_Companion_ProvideHomeCreditApiFactory.provideHomeCreditApi(retrofit);
        }

        private void initialize(AutoPickerExportModule autoPickerExportModule, ActionInitializeModule actionInitializeModule, ComposerInterceptorFactoryModule composerInterceptorFactoryModule, NamespaceModule namespaceModule, ReturnEditNavigationModule returnEditNavigationModule, HowToReturnGoodsNavigationModule howToReturnGoodsNavigationModule, ReturnCreationNavigationModule returnCreationNavigationModule, CmlOrdersNavigationModule cmlOrdersNavigationModule, CmlDeliveryNavigationModule cmlDeliveryNavigationModule, MessengerFeatureModule messengerFeatureModule, RemovePostModule removePostModule, PikazonModule pikazonModule, CsmaButtonCommonModule csmaButtonCommonModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, ActivateCodeWidgetModule activateCodeWidgetModule, SelectLinkWidgetModule selectLinkWidgetModule, LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule, ContextComponentDependencies contextComponentDependencies, IDaggerComponentDependencies iDaggerComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WhitelistComponentApi whitelistComponentApi, CacheComponentApi cacheComponentApi, BarcodeCacheComponentApi barcodeCacheComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, NotificationComponentApi notificationComponentApi, PushComponentApi pushComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AccountComponentApi accountComponentApi, AppLocaleComponentApi appLocaleComponentApi, LocationComponentApi locationComponentApi, CartComponentApi cartComponentApi, TabsComponentApi tabsComponentApi, WebComponentApi webComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, AddressComponentApi addressComponentApi, DebugMenuComponentApi debugMenuComponentApi, OzonDebugMenuComponentApi ozonDebugMenuComponentApi, ComposerComponentApi composerComponentApi, MediaUploadComponentApi mediaUploadComponentApi, AdvertisingMessagingApi advertisingMessagingApi, FreshNavigationComponentApi freshNavigationComponentApi, FreshComponentApi freshComponentApi, FintechLibApi fintechLibApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoriteComponentApi favoriteComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, OzonMapComponentApi ozonMapComponentApi, MinifyLinkComponentApi minifyLinkComponentApi, RmsComponentApi rmsComponentApi, PdfFileComponentApi pdfFileComponentApi, CouponComponentApi couponComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CheckoutPrefetchApi checkoutPrefetchApi, RestrictionsComponentApi restrictionsComponentApi, CheckoutCommonComponentApi checkoutCommonComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, GeoProviderComponentApi geoProviderComponentApi, MapCommonComponentApi mapCommonComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AuthComponentApi authComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, SearchPrefetchApi searchPrefetchApi, FavoritesUIComponentApi favoritesUIComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi, PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi, InterceptorPredicatesComponentApi interceptorPredicatesComponentApi, OrderShipmentComponentApi orderShipmentComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, DeeplinkRouteComponentApi deeplinkRouteComponentApi, MorkovskOnboardingComponentApi morkovskOnboardingComponentApi, UgcRatingComponentApi ugcRatingComponentApi, TilesDomainComponentApi tilesDomainComponentApi, UgcReviewFormComponentApi ugcReviewFormComponentApi, SelectionsCoreComponentApi selectionsCoreComponentApi, TravelStorageApi travelStorageApi, Limb2ComponentApi limb2ComponentApi, SentryApiComponent sentryApiComponent, AppOnboardingComponentApi appOnboardingComponentApi, CmlDomainComponentApi cmlDomainComponentApi, CmlDeliveryComponentApi cmlDeliveryComponentApi, NotificationStatusComponentApi notificationStatusComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi, Resources resources) {
            this.datePickerViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 0);
            this.getContextProvider = new SwitchingProvider(this.iDaggerComponentImpl, 2);
            this.provideMarkWonProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 1));
            this.getOzonIdAppApiProvider = new SwitchingProvider(this.iDaggerComponentImpl, 5);
            this.ozonIdActivityCallbackProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 4));
            this.authDestinationInterceptorImplProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 3));
            this.getOzonPushManagerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 6);
            SwitchingProvider switchingProvider = new SwitchingProvider(this.iDaggerComponentImpl, 8);
            this.googlePayManagerImplProvider = switchingProvider;
            this.bindGooglePayManagerProvider = Jb.m.a(switchingProvider);
            this.createAndPayViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 7);
            this.stickyCellViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 9);
            this.linkFastPayViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 10);
            this.checkFastPayViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 11);
            this.shareLinkBloggerViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 12);
            this.handlersInhibitorProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 13));
            this.getFeatureCheckerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 14);
            this.inputCurtainViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 15);
            this.freshAISharedViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 16);
            this.promptStatusViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 17);
            this.promoPushEnableViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 18);
            this.provideTravelCommonActionResultApiProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 20));
            this.travelResultActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 19);
            this.travelCustomPostResultActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 21);
            this.travelForceRedirectActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 22);
            this.travelForceRefreshActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 23);
            this.modalParentRefreshSharedViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 25);
            this.modalParentRefreshActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 24);
            this.popAndRefreshActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 26);
            this.getFileDownloaderViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 28);
            this.travelDownloadFileActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 27);
            this.travelCallActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 29);
            this.calendarEventActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 30);
            this.pushRouteAndRefreshActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 31);
            this.popRouteAndRefreshActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 32);
            this.hotelsBookSuccessValidationActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 33);
            this.selectPaymentViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 35);
            this.addCardActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 34);
            this.addToFavoriteActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 36);
            this.goCheckoutActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 37);
            this.classifiedCallActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 38);
            this.reloadFromCurrentWidgetPageActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 39);
            this.courierOnMapCallActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 40);
            this.callCourierActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 41);
            this.removeFromFavoriteActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 42);
            this.removeSplitActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 43);
            this.providesShareButtonApiProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 47));
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.iDaggerComponentImpl, 46);
            this.shareButtonRepositoryImplProvider = switchingProvider2;
            this.bindShareButtonRepositoryProvider = Jb.m.a(switchingProvider2);
            this.shareLinkViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 45);
            this.shareLinkActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 44);
            this.shareSellerLinkActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 48);
            this.removePostViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 50);
            this.removePostActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 49);
            this.composerActionAndRedirectViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 52);
            this.composerActionAndRedirectActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 51);
            this.downloadPDFActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 53);
            this.closeFlowActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 54);
            this.composerActionWithRefreshCustomActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 55);
            this.classifiedOpenDeleteListingModalActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 56);
            this.openDeeplinkForRefreshResultActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 57);
            this.composerActionWithActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 58);
            this.composerActionWithSaveScrollActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 59);
            this.openApplicationStoreActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 60);
            this.openNotificationSettingsActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 61);
            this.addressPartsInputCustomActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 62);
            this.removeAddressAlertCustomActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 63);
            this.dismissAndScrollByScrollWidgetKeyActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 64);
            this.popActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 65);
            this.onboardingActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 66);
            this.popAndRedirectActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 67);
            this.closeMiniappActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 68);
            this.rateInAppActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 69);
            this.compositeCustomActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 70);
            this.subscribeAuthorViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 72);
            this.subscribeAuthorActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 71);
            this.unsubscribeAuthorActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 73);
            this.saveUserTipsChooseActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 74);
            this.dismissOrCloseMiniappActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 75);
            this.updateSelectedMapTabActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 76);
            this.favoriteToggleProductButtonViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 78);
            this.favoriteListRemoveActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 77);
            this.favoriteListAddActionHandlerImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 79);
            this.favoriteShareListActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 80);
            this.deleteWishlistViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 82);
            this.favoriteDeleteListActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 81);
            this.removeFromFavoritesActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 83);
            this.favoriteWishlistRemoveActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 84);
            this.removeSelectionItemProductActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 85);
            this.dislikeRecommendationActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 86);
            this.activateHelpCertActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 87);
            this.getDirectionsActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 88);
            this.popBackStackActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 89);
            this.closeFlowAndActionDoActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 90);
            this.deleteSearchInsightCustomActionHandlerImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 91);
            this.searchRedirectToGlobalActionHandlerImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 92);
            this.deleteAiConversationActionHandlerImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 93);
            this.aiRefreshActionHandlerImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 94);
            this.copyTextActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 95);
            this.copyAndDismissActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 96);
            this.modifySearchUrlViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 98);
        }

        private void initialize2(AutoPickerExportModule autoPickerExportModule, ActionInitializeModule actionInitializeModule, ComposerInterceptorFactoryModule composerInterceptorFactoryModule, NamespaceModule namespaceModule, ReturnEditNavigationModule returnEditNavigationModule, HowToReturnGoodsNavigationModule howToReturnGoodsNavigationModule, ReturnCreationNavigationModule returnCreationNavigationModule, CmlOrdersNavigationModule cmlOrdersNavigationModule, CmlDeliveryNavigationModule cmlDeliveryNavigationModule, MessengerFeatureModule messengerFeatureModule, RemovePostModule removePostModule, PikazonModule pikazonModule, CsmaButtonCommonModule csmaButtonCommonModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, ActivateCodeWidgetModule activateCodeWidgetModule, SelectLinkWidgetModule selectLinkWidgetModule, LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule, ContextComponentDependencies contextComponentDependencies, IDaggerComponentDependencies iDaggerComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WhitelistComponentApi whitelistComponentApi, CacheComponentApi cacheComponentApi, BarcodeCacheComponentApi barcodeCacheComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, NotificationComponentApi notificationComponentApi, PushComponentApi pushComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AccountComponentApi accountComponentApi, AppLocaleComponentApi appLocaleComponentApi, LocationComponentApi locationComponentApi, CartComponentApi cartComponentApi, TabsComponentApi tabsComponentApi, WebComponentApi webComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, AddressComponentApi addressComponentApi, DebugMenuComponentApi debugMenuComponentApi, OzonDebugMenuComponentApi ozonDebugMenuComponentApi, ComposerComponentApi composerComponentApi, MediaUploadComponentApi mediaUploadComponentApi, AdvertisingMessagingApi advertisingMessagingApi, FreshNavigationComponentApi freshNavigationComponentApi, FreshComponentApi freshComponentApi, FintechLibApi fintechLibApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoriteComponentApi favoriteComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, OzonMapComponentApi ozonMapComponentApi, MinifyLinkComponentApi minifyLinkComponentApi, RmsComponentApi rmsComponentApi, PdfFileComponentApi pdfFileComponentApi, CouponComponentApi couponComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CheckoutPrefetchApi checkoutPrefetchApi, RestrictionsComponentApi restrictionsComponentApi, CheckoutCommonComponentApi checkoutCommonComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, GeoProviderComponentApi geoProviderComponentApi, MapCommonComponentApi mapCommonComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AuthComponentApi authComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, SearchPrefetchApi searchPrefetchApi, FavoritesUIComponentApi favoritesUIComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi, PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi, InterceptorPredicatesComponentApi interceptorPredicatesComponentApi, OrderShipmentComponentApi orderShipmentComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, DeeplinkRouteComponentApi deeplinkRouteComponentApi, MorkovskOnboardingComponentApi morkovskOnboardingComponentApi, UgcRatingComponentApi ugcRatingComponentApi, TilesDomainComponentApi tilesDomainComponentApi, UgcReviewFormComponentApi ugcReviewFormComponentApi, SelectionsCoreComponentApi selectionsCoreComponentApi, TravelStorageApi travelStorageApi, Limb2ComponentApi limb2ComponentApi, SentryApiComponent sentryApiComponent, AppOnboardingComponentApi appOnboardingComponentApi, CmlDomainComponentApi cmlDomainComponentApi, CmlDeliveryComponentApi cmlDeliveryComponentApi, NotificationStatusComponentApi notificationStatusComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi, Resources resources) {
            this.redirectWithPrefetchActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 97);
            this.removeSuggestionActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 99);
            this.applySortingViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 101);
            this.applySortingActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 100);
            this.setPublicProfileStatusActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 102);
            this.mallFilterNotificationActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 103);
            this.pickImageActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 104);
            this.homeCreditActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 105);
            this.fetchCancelReasonsActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 106);
            this.reorderActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 107);
            this.dismissAndRefreshMapActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 108);
            this.toggleProductListActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 109);
            this.refreshWithSelectedIdsActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 110);
            this.refreshWithNewCommentActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 111);
            this.cancelOrderV3ActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 112);
            this.shareBarcodeActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 113);
            this.postRefreshWithScrollActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 114);
            this.changeItemQuantityActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 115);
            this.freshRemoveCartItemsActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 116);
            this.freshPostRefreshWithScrollActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 117);
            this.freshRemoveCartTileActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 118);
            this.popAndRedirectActionHandlerProvider2 = new SwitchingProvider(this.iDaggerComponentImpl, 119);
            this.saveUserTipsChooseActionHandlerProvider2 = new SwitchingProvider(this.iDaggerComponentImpl, 120);
            this.getRecShelfActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 121);
            this.b2bResetEdoVerificationViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 123);
            this.b2bResetEdoVerificationActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 122);
            this.b2bRemoveLegalViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 125);
            this.b2bRemoveLegalActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 124);
            this.b2bDownloadFileViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 127);
            this.b2bDownloadFileActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 126);
            this.b2bAcceptActViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 129);
            this.b2bAcceptActActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, UserVerificationMethods.USER_VERIFY_PATTERN);
            this.b2bSelectConsigneeViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 131);
            this.b2bSelectConsigneeActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 130);
            this.b2bDeleteConsigneeViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 133);
            this.b2bDeleteConsigneeActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 132);
            this.dismissRefreshAndScrollActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 134);
            this.addToCartWithRedirectActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 135);
            this.sellerSubscribeActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 136);
            this.sellerUnsubscribeActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 137);
            this.actualizeEmailActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 138);
            this.confirmEmailCustomActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 139);
            this.verifyEmailCustomActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 140);
            this.unbindVKIDCustomActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 141);
            this.actionsFooterViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 143);
            this.ugcCachedActionsSharedViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 144);
            this.actionsFooterLikeActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 142);
            this.translateViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 146);
            this.translateReviewActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 145);
            this.commentFooterViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 148);
            this.commentActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 147);
            this.commentModalActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 149);
            this.submitSelectionFormActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 150);
            this.updateProductsSelectionFormActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 151);
            this.updateCellSelectionFormActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 152);
            this.doubleDismissAndRedirectActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 153);
            this.doubleDismissAndRefreshActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 154);
            this.dismissAndPopAndRefreshActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 155);
            this.saveReturnReasonDescriptionViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 157);
            this.saveReturnReasonDescriptionActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 156);
            this.saveReturnItemReasonCommentActionActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 158);
            this.userAuthBiometryViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 160);
            this.userAuthBiometryActionHandlerImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 159);
            this.instantLoginActionHandlerImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 161);
            this.logoutActionHandlerImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 162);
            this.mainDrawMajorScreenProgressUpdateActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 163);
            this.lotteryOpenPurchaseTicketPageActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 164);
            this.lotteryForceShowOnboardingActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 165);
            this.provideChangePaymentApiProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 168));
            this.changePaymentViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 167);
            this.changePaymentActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 166);
            this.createOrderActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 169);
            this.createPaymentActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 170);
            this.createServiceViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 172);
            this.createServiceActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 171);
            this.updateOrderC2CViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 174);
            this.updateOrderC2CActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 173);
            this.createOrderV2ActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 175);
            this.appendProductsActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 176);
            this.replaceProductsActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 177);
            this.submitBloggerPostActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 178);
            this.removeCartSplitActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 179);
            this.addToCartViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 181);
            this.addToCartActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 180);
            this.performTwoActionsHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 182);
            this.addToCartResponseActionWithActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 183);
            this.cmlComposerActionWithActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 184);
            this.cmlOrderActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 185);
            this.cmlUpdatePassportActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 186);
            this.cmlValidatePassportActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 187);
            this.sendReviewActionHandlerV1Provider = new SwitchingProvider(this.iDaggerComponentImpl, 188);
            this.sendReviewActionHandlerV2Provider = new SwitchingProvider(this.iDaggerComponentImpl, 189);
            this.sendRatingOnlyActionHandlerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 190);
            this.autopickerBottomSheetRepositoryProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 191));
            this.pickerRefreshLinkStoreProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 193));
            this.allStepViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 192);
            this.concreteStepViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 194);
            this.setCookieAndRefreshAssistedFactoryProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 195));
            this.couponViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 196);
            this.getCartAtomBinderProvider = new SwitchingProvider(this.iDaggerComponentImpl, 197);
        }

        private void initialize3(AutoPickerExportModule autoPickerExportModule, ActionInitializeModule actionInitializeModule, ComposerInterceptorFactoryModule composerInterceptorFactoryModule, NamespaceModule namespaceModule, ReturnEditNavigationModule returnEditNavigationModule, HowToReturnGoodsNavigationModule howToReturnGoodsNavigationModule, ReturnCreationNavigationModule returnCreationNavigationModule, CmlOrdersNavigationModule cmlOrdersNavigationModule, CmlDeliveryNavigationModule cmlDeliveryNavigationModule, MessengerFeatureModule messengerFeatureModule, RemovePostModule removePostModule, PikazonModule pikazonModule, CsmaButtonCommonModule csmaButtonCommonModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, ActivateCodeWidgetModule activateCodeWidgetModule, SelectLinkWidgetModule selectLinkWidgetModule, LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule, ContextComponentDependencies contextComponentDependencies, IDaggerComponentDependencies iDaggerComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WhitelistComponentApi whitelistComponentApi, CacheComponentApi cacheComponentApi, BarcodeCacheComponentApi barcodeCacheComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, NotificationComponentApi notificationComponentApi, PushComponentApi pushComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AccountComponentApi accountComponentApi, AppLocaleComponentApi appLocaleComponentApi, LocationComponentApi locationComponentApi, CartComponentApi cartComponentApi, TabsComponentApi tabsComponentApi, WebComponentApi webComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, AddressComponentApi addressComponentApi, DebugMenuComponentApi debugMenuComponentApi, OzonDebugMenuComponentApi ozonDebugMenuComponentApi, ComposerComponentApi composerComponentApi, MediaUploadComponentApi mediaUploadComponentApi, AdvertisingMessagingApi advertisingMessagingApi, FreshNavigationComponentApi freshNavigationComponentApi, FreshComponentApi freshComponentApi, FintechLibApi fintechLibApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoriteComponentApi favoriteComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, OzonMapComponentApi ozonMapComponentApi, MinifyLinkComponentApi minifyLinkComponentApi, RmsComponentApi rmsComponentApi, PdfFileComponentApi pdfFileComponentApi, CouponComponentApi couponComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CheckoutPrefetchApi checkoutPrefetchApi, RestrictionsComponentApi restrictionsComponentApi, CheckoutCommonComponentApi checkoutCommonComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, GeoProviderComponentApi geoProviderComponentApi, MapCommonComponentApi mapCommonComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AuthComponentApi authComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, SearchPrefetchApi searchPrefetchApi, FavoritesUIComponentApi favoritesUIComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi, PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi, InterceptorPredicatesComponentApi interceptorPredicatesComponentApi, OrderShipmentComponentApi orderShipmentComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, DeeplinkRouteComponentApi deeplinkRouteComponentApi, MorkovskOnboardingComponentApi morkovskOnboardingComponentApi, UgcRatingComponentApi ugcRatingComponentApi, TilesDomainComponentApi tilesDomainComponentApi, UgcReviewFormComponentApi ugcReviewFormComponentApi, SelectionsCoreComponentApi selectionsCoreComponentApi, TravelStorageApi travelStorageApi, Limb2ComponentApi limb2ComponentApi, SentryApiComponent sentryApiComponent, AppOnboardingComponentApi appOnboardingComponentApi, CmlDomainComponentApi cmlDomainComponentApi, CmlDeliveryComponentApi cmlDeliveryComponentApi, NotificationStatusComponentApi notificationStatusComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi, Resources resources) {
            this.provideFormPageApiDataSourceProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 199));
            this.formPageViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 198);
            this.smsSignViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, m.e.DEFAULT_DRAG_ANIMATION_DURATION);
            this.landingLimitViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 201);
            this.allToCartViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 202);
            this.discountCodeViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 203);
            this.playStoriesV3ViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 204);
            this.navTitleMapperProvider = new SwitchingProvider(this.iDaggerComponentImpl, 205);
            this.tabsOnBoardingViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 206);
            this.tabsV2ViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 207);
            this.shoppingListsViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 208);
            this.minifyLinkViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 209);
            this.provideApiProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 211));
            this.adultConfirmationViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 210);
            this.userSocialsMobileItemViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 212);
            this.logoutOnAllDevicesViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 213);
            this.confirmDeleteOtpViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 214);
            this.oTPPeriodFormatterBuilderProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor.MODULE_VERSION));
            this.deleteAccountDescriptionStickyViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 216);
            this.deleteAccountButtonViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 217);
            this.newCredentialsViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 218);
            this.oTPWidgetViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 219);
            this.authViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 220);
            this.biometricAuthViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 221);
            this.authOriginStorageProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 222));
            this.editUserFullNameViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 223);
            this.productPickerSearchParamsConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 224);
            this.autopickerBottomSheetConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 225);
            this.autopickerResultConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 226);
            this.confirmDeleteResultConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 227);
            this.getAddressManagerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 229);
            this.dismissOnAddressUpdateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 228);
            this.categoryMainPageFreshConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 230);
            this.avatarProfileViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 232);
            this.avatarProfileConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 231);
            this.returnListNormalizeBackStackConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 233);
            this.returnDetailsNormalizeBackStackConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 234);
            this.returnActionModalConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 235);
            this.deliveryDetailsPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 236);
            this.morkovskModalMenuConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 237);
            this.dailyRewardsConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 238);
            this.prizesConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 239);
            this.morkovskOnboardingConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 240);
            this.morkovskWelcomeScreenConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 241);
            this.bloggerRefreshMainPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 242);
            this.bloggerRefreshPostsPageAfterFormSubmitConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 243);
            this.bloggerRefreshChannelsPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 244);
            this.refreshAfterDismissAndPopPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 245);
            this.bottomSheetInsetsConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 246);
            this.refreshByFragmentResultPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 247);
            this.edgeToEdgeConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 248);
            this.topEdgeConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 249);
            this.shareLinkBloggerCopyResultConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, m.e.DEFAULT_SWIPE_ANIMATION_DURATION);
            this.bloggerPersonalDataKeyboardConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 251);
            this.addressSearchSheetResultConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 252);
            this.scanItIntroConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 253);
            this.lightStatusBarConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 254);
            this.searchHideKeyboardOnOpenConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 255);
            this.feedbackTilePreCreationConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 256);
            this.categoryPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 257);
            this.suggestionsPrefetchViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 259);
            this.suggestionsPrefetchConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 258);
            this.removeRVItemAnimationConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 260);
            this.checkoutRefreshPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 261);
            this.travelFiltersKeyboardInsetConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 262);
            this.travelPassengersPageStorageInitializerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 263);
            this.iconChooserRootPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 264);
            this.iconChooserModalPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 265);
            this.modalParentRefreshConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 266);
            this.travelTimeoutRedirectConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 267);
            this.travelAnchorRefreshConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 268);
            this.mainTabRedirectOnBackPressedConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 269);
            this.travelDownloadFileConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 270);
            this.travelRefreshOnRestartPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 271);
            this.travelHideAppbarConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 272);
            this.searchFormRefreshPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 273);
            this.mapInfoDeeplinkRouteViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 275);
            this.mapInfoDeeplinkRouteConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 274);
            this.fullScreenInsetsConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 276);
            this.setOfPreCreateInfoProvider = new SwitchingProvider(this.iDaggerComponentImpl, 279);
            this.preCreateWidgetsFacadeProvider = new SwitchingProvider(this.iDaggerComponentImpl, 278);
            this.travelMainPreCreateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 277);
            this.travelThankYouPreCreateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 280);
            this.travelOrderListPreCreateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 281);
            this.travelRailwaySERPPreCreateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 282);
            this.travelAddNewPassengerFormV2InputSelectorConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 283);
            this.travelAddNewPassengerFormV2InputDateSelectorConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 284);
            this.hotelsBookPageStorageInitializerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 285);
            this.hotelsBookModalPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 286);
            this.hotelsBookTotalRefreshConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 287);
            this.additionalServicesPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 288);
            this.hotelsGalleryFullConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 289);
            this.hotelsMapInfoConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 290);
            this.touristCountSelectorConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 291);
            this.removeSplitConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 292);
            this.bxNotificationPermissionProcessorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 295);
            this.selectNotificationPermissionProcessorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 296);
            SwitchingProvider switchingProvider = new SwitchingProvider(this.iDaggerComponentImpl, 297);
            this.activityInitializerImplProvider = switchingProvider;
            this.bindActivityInitializerProvider = Jb.d.b(switchingProvider);
            this.homePageViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 294);
        }

        private void initialize4(AutoPickerExportModule autoPickerExportModule, ActionInitializeModule actionInitializeModule, ComposerInterceptorFactoryModule composerInterceptorFactoryModule, NamespaceModule namespaceModule, ReturnEditNavigationModule returnEditNavigationModule, HowToReturnGoodsNavigationModule howToReturnGoodsNavigationModule, ReturnCreationNavigationModule returnCreationNavigationModule, CmlOrdersNavigationModule cmlOrdersNavigationModule, CmlDeliveryNavigationModule cmlDeliveryNavigationModule, MessengerFeatureModule messengerFeatureModule, RemovePostModule removePostModule, PikazonModule pikazonModule, CsmaButtonCommonModule csmaButtonCommonModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, ActivateCodeWidgetModule activateCodeWidgetModule, SelectLinkWidgetModule selectLinkWidgetModule, LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule, ContextComponentDependencies contextComponentDependencies, IDaggerComponentDependencies iDaggerComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WhitelistComponentApi whitelistComponentApi, CacheComponentApi cacheComponentApi, BarcodeCacheComponentApi barcodeCacheComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, NotificationComponentApi notificationComponentApi, PushComponentApi pushComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AccountComponentApi accountComponentApi, AppLocaleComponentApi appLocaleComponentApi, LocationComponentApi locationComponentApi, CartComponentApi cartComponentApi, TabsComponentApi tabsComponentApi, WebComponentApi webComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, AddressComponentApi addressComponentApi, DebugMenuComponentApi debugMenuComponentApi, OzonDebugMenuComponentApi ozonDebugMenuComponentApi, ComposerComponentApi composerComponentApi, MediaUploadComponentApi mediaUploadComponentApi, AdvertisingMessagingApi advertisingMessagingApi, FreshNavigationComponentApi freshNavigationComponentApi, FreshComponentApi freshComponentApi, FintechLibApi fintechLibApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoriteComponentApi favoriteComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, OzonMapComponentApi ozonMapComponentApi, MinifyLinkComponentApi minifyLinkComponentApi, RmsComponentApi rmsComponentApi, PdfFileComponentApi pdfFileComponentApi, CouponComponentApi couponComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CheckoutPrefetchApi checkoutPrefetchApi, RestrictionsComponentApi restrictionsComponentApi, CheckoutCommonComponentApi checkoutCommonComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, GeoProviderComponentApi geoProviderComponentApi, MapCommonComponentApi mapCommonComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AuthComponentApi authComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, SearchPrefetchApi searchPrefetchApi, FavoritesUIComponentApi favoritesUIComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi, PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi, InterceptorPredicatesComponentApi interceptorPredicatesComponentApi, OrderShipmentComponentApi orderShipmentComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, DeeplinkRouteComponentApi deeplinkRouteComponentApi, MorkovskOnboardingComponentApi morkovskOnboardingComponentApi, UgcRatingComponentApi ugcRatingComponentApi, TilesDomainComponentApi tilesDomainComponentApi, UgcReviewFormComponentApi ugcReviewFormComponentApi, SelectionsCoreComponentApi selectionsCoreComponentApi, TravelStorageApi travelStorageApi, Limb2ComponentApi limb2ComponentApi, SentryApiComponent sentryApiComponent, AppOnboardingComponentApi appOnboardingComponentApi, CmlDomainComponentApi cmlDomainComponentApi, CmlDeliveryComponentApi cmlDeliveryComponentApi, NotificationStatusComponentApi notificationStatusComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi, Resources resources) {
            this.homePageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 293);
            this.componentUploadPhotosViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 299);
            this.uploadPhotosConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 298);
            this.returnCreationItemRemovedConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 300);
            this.returnCreationPhotoUpdatedConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 301);
            this.photoPickerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 302);
            this.createShoppingListConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 303);
            this.renameFavoritesListConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 304);
            this.pinStatusFavoritesListConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 305);
            this.deleteFavoritesListConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 306);
            this.listAccessChangedConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 307);
            this.createFavoritesListConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 308);
            this.removeFavoritesListConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 309);
            this.removeFromFavoritesListConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 310);
            this.accessControlViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 312);
            this.accessControlConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 311);
            this.onFavoriteEntityChangedConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 313);
            this.editListFavoriteConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 314);
            this.catalogFavoritesConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 315);
            this.updateByFavoritesConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 316);
            this.createShoppingListAsyncConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 317);
            this.createFavoritesListAsyncConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 318);
            this.deleteFavoritesListAsyncConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 319);
            this.pinStatusFavoritesListAsyncConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 320);
            this.renameFavoritesListAsyncConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 321);
            this.editListFavoriteAsyncConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 322);
            this.removeFromFavoritesListAsyncConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 323);
            this.favoritesSellersScrollToUpConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 324);
            this.createShoppingListInputInsetsConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 325);
            this.familyAccountConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 326);
            this.favoritesMediaPickerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 327);
            this.returnListUpdateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 328);
            this.addUserCardConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 329);
            this.categoryPreCreationConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 330);
            this.categoryMainPageFreshPreCreationConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 331);
            this.searchPreCreationConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 332);
            this.comparisonRefreshViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 334);
            this.galleryV3ViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 335);
            this.pdpConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 333);
            this.pdpGalleryFullViewConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 336);
            this.refreshByAdultStateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 337);
            this.callApiViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 339);
            this.questionsConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 338);
            this.addToComparisonViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 341);
            this.comparisonConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 340);
            this.orderDoneLiteInfoConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 342);
            this.relatedProductsBottomSheetConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 343);
            this.reviewSuccessConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 344);
            this.submitCachedReviewViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 346);
            this.submitCachedReviewConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 345);
            this.refreshSelectionConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 347);
            this.mediaPickerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 348);
            this.reviewFormConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 349);
            this.listReviewSortsViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 351);
            this.reviewConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 350);
            this.commentsListConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 352);
            this.reviewGalleryV2ConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 353);
            this.listReviewConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 354);
            this.additionRecycledViewPoolConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 355);
            this.socialProfileConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 356);
            this.topAuthorsLandingConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 357);
            this.topAuthorsOnboardingConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 358);
            this.staticTeenModeConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 359);
            this.dynamicTeenModeConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 360);
            this.hideToolbarConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 361);
            this.videoPreloadCleanerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 362);
            this.videoMoleculeConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 363);
            this.promoReviewRefreshConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 364);
            this.legalsFlowConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 365);
            this.addLegalMobileConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 366);
            this.docsDeliveryFormViewModelImplProvider = new SwitchingProvider(this.iDaggerComponentImpl, 368);
            this.addressSearchConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 367);
            this.consigneeAddressSearchConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 369);
            this.refreshPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 370);
            this.registrationConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 371);
            this.legalDetailsFileSelectConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 372);
            this.recActsDeclinerFileSelectConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 373);
            this.resultControllerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 374);
            this.partPaymentSummaryPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 375);
            this.cartConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 376);
            this.cartPreCreateViewConfiguratorV2Provider = new SwitchingProvider(this.iDaggerComponentImpl, 377);
            this.cartScreenStateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 378);
            this.addToCartLoaderConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 379);
            this.cartSharedViewPoolSizeSetterConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 380);
            this.cartRefreshEventConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 381);
            this.familyCartRefreshEventConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 382);
            this.cartOnScreenEventHandlerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 383);
            this.cartKeyboardInsetConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 384);
            this.cartRestoreItemConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 385);
            this.freshCartConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 386);
            this.resetCartModeConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 387);
            this.swipeViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 389);
            this.cartSplitSwipeConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 388);
            this.familyCartConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 390);
            this.familyCartOnScreenEventHandlerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 391);
            this.cartPrefetchConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 392);
            this.asyncCartConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 393);
            this.orderDoneConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 394);
            this.refreshOnStartPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 395);
            this.orderDoneRefreshCartConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 396);
        }

        private void initialize5(AutoPickerExportModule autoPickerExportModule, ActionInitializeModule actionInitializeModule, ComposerInterceptorFactoryModule composerInterceptorFactoryModule, NamespaceModule namespaceModule, ReturnEditNavigationModule returnEditNavigationModule, HowToReturnGoodsNavigationModule howToReturnGoodsNavigationModule, ReturnCreationNavigationModule returnCreationNavigationModule, CmlOrdersNavigationModule cmlOrdersNavigationModule, CmlDeliveryNavigationModule cmlDeliveryNavigationModule, MessengerFeatureModule messengerFeatureModule, RemovePostModule removePostModule, PikazonModule pikazonModule, CsmaButtonCommonModule csmaButtonCommonModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, ActivateCodeWidgetModule activateCodeWidgetModule, SelectLinkWidgetModule selectLinkWidgetModule, LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule, ContextComponentDependencies contextComponentDependencies, IDaggerComponentDependencies iDaggerComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WhitelistComponentApi whitelistComponentApi, CacheComponentApi cacheComponentApi, BarcodeCacheComponentApi barcodeCacheComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, NotificationComponentApi notificationComponentApi, PushComponentApi pushComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AccountComponentApi accountComponentApi, AppLocaleComponentApi appLocaleComponentApi, LocationComponentApi locationComponentApi, CartComponentApi cartComponentApi, TabsComponentApi tabsComponentApi, WebComponentApi webComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, AddressComponentApi addressComponentApi, DebugMenuComponentApi debugMenuComponentApi, OzonDebugMenuComponentApi ozonDebugMenuComponentApi, ComposerComponentApi composerComponentApi, MediaUploadComponentApi mediaUploadComponentApi, AdvertisingMessagingApi advertisingMessagingApi, FreshNavigationComponentApi freshNavigationComponentApi, FreshComponentApi freshComponentApi, FintechLibApi fintechLibApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoriteComponentApi favoriteComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, OzonMapComponentApi ozonMapComponentApi, MinifyLinkComponentApi minifyLinkComponentApi, RmsComponentApi rmsComponentApi, PdfFileComponentApi pdfFileComponentApi, CouponComponentApi couponComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CheckoutPrefetchApi checkoutPrefetchApi, RestrictionsComponentApi restrictionsComponentApi, CheckoutCommonComponentApi checkoutCommonComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, GeoProviderComponentApi geoProviderComponentApi, MapCommonComponentApi mapCommonComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AuthComponentApi authComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, SearchPrefetchApi searchPrefetchApi, FavoritesUIComponentApi favoritesUIComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi, PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi, InterceptorPredicatesComponentApi interceptorPredicatesComponentApi, OrderShipmentComponentApi orderShipmentComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, DeeplinkRouteComponentApi deeplinkRouteComponentApi, MorkovskOnboardingComponentApi morkovskOnboardingComponentApi, UgcRatingComponentApi ugcRatingComponentApi, TilesDomainComponentApi tilesDomainComponentApi, UgcReviewFormComponentApi ugcReviewFormComponentApi, SelectionsCoreComponentApi selectionsCoreComponentApi, TravelStorageApi travelStorageApi, Limb2ComponentApi limb2ComponentApi, SentryApiComponent sentryApiComponent, AppOnboardingComponentApi appOnboardingComponentApi, CmlDomainComponentApi cmlDomainComponentApi, CmlDeliveryComponentApi cmlDeliveryComponentApi, NotificationStatusComponentApi notificationStatusComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi, Resources resources) {
            this.deliveryOrderDoneConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 397);
            this.scrollToWidgetConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 398);
            this.checkoutPreCreationConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 399);
            this.addressPartsInputPageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 400);
            this.confirmDeleteResultConfiguratorProvider2 = new SwitchingProvider(this.iDaggerComponentImpl, 401);
            this.removeRfbsSplitConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE);
            this.clearReferrerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 403);
            this.checkoutRefreshConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
            this.preloadImagesConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR);
            this.cardBindingConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED);
            this.checkoutClearCacheConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 407);
            this.optionsSelectorSheetResultConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 408);
            this.searchSheetResultConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR);
            this.yandexSearchSheetResultConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, WalletConstants.ERROR_CODE_INVALID_TRANSACTION);
            this.updateChatInfoConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE);
            this.refreshAnchorScreenConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
            this.orderCacheConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, WalletConstants.ERROR_CODE_UNKNOWN);
            this.profileAvatarConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 414);
            this.profileInfoConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 415);
            this.sessionListUpdatedConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 416);
            this.refreshOnActualizeEmailConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 417);
            this.refreshOnUserDataChangedConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 418);
            this.orderListChangeStateViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 420);
            this.orderTrackingV4ViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 421);
            this.lKOrderTrackingV4UpdaterConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 419);
            this.mainOrderTrackingV4UpdaterConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 422);
            this.provideComposerActionApiProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 425));
            this.actionButtonViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 424);
            this.orderChangeActionButtonsConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 423);
            this.notificationsSettingsConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 426);
            this.notificationsSettingsBottomSheetConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 427);
            this.cancelPostingsConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 428);
            this.actionButtonViewModelProvider2 = new SwitchingProvider(this.iDaggerComponentImpl, 430);
            this.singleActionButtonConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 429);
            this.orderFiltersConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 431);
            this.refreshByOrderChangeConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 432);
            this.orientationLockConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 433);
            this.refreshAfterTimeChangeConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 434);
            this.orderPayConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 435);
            this.selectPaymentConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 436);
            this.orderDetailChangeHandlerViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 438);
            this.orderDetailsChangeHandlerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 437);
            this.refreshOnStartConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 439);
            this.totalConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 440);
            this.changePaymentMethodConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 441);
            this.brightnessChangerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 442);
            this.cabinetBarcodeOnWearableDeviceConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 443);
            this.homeBarcodeOnWearableDeviceConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 444);
            this.orderGalleryConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 445);
            this.refreshByResultConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 446);
            this.createAndPayConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 447);
            this.changePaymentConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 448);
            this.updateOrderC2CConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 449);
            this.clickOrderConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 450);
            this.linkFastPayConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 451);
            this.checkFastPayConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 452);
            this.orderDetailsPayConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 453);
            this.confirmDateButtonViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 455);
            this.confirmDeliveryDateActionButtonsConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 454);
            this.scrollToShipmentConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 456);
            this.nestedScrollingDisabledConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 457);
            this.playStoriesV3ConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 458);
            this.videoMoleculeConfiguratorProvider2 = new SwitchingProvider(this.iDaggerComponentImpl, 459);
            this.sharedViewPoolSizeSetterConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 460);
            this.appOnboardingConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 461);
            this.tileRelatedProductsBottomSheetConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 462);
            this.failedExternalPageRetryNotificationConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 463);
            this.filterValuesModalConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 464);
            this.filterSharedViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 466);
            this.mainFilterConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 465);
            this.filtersKeyboardInsetConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 467);
            this.addressEditMapConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 468);
            this.flashCallConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 469);
            this.requestPhoneAccessConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 470);
            this.newCredentialsConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 471);
            this.smsRetrieverConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 472);
            this.galleryLauncherConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 473);
            this.cmlEventsHandlerConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 474);
            this.editOrderConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 475);
            this.parcelPhotoAddConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 476);
            this.addNewCardConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 477);
            this.cancelPostingsConfiguratorProvider2 = new SwitchingProvider(this.iDaggerComponentImpl, 478);
            this.nestedScrollingDisabledConfiguratorProvider2 = new SwitchingProvider(this.iDaggerComponentImpl, 479);
            this.pdpOfflineScreenFactoryProvider = new SwitchingProvider(this.iDaggerComponentImpl, 480);
            this.barcodeFullScreenOfflineFactoryProvider = new SwitchingProvider(this.iDaggerComponentImpl, 481);
            this.emptyScreenWithBarcodeFactoryProvider = new SwitchingProvider(this.iDaggerComponentImpl, 482);
            this.defaultInitialWidgetsProvider = new SwitchingProvider(this.iDaggerComponentImpl, 483);
            this.emptyInitialWidgetProvider = new SwitchingProvider(this.iDaggerComponentImpl, 484);
            this.addressPopUpStateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 485);
            this.moveCartItemsInterceptorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 486);
            this.orderCacheStateInterceptorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 487);
            this.cartComposerInterceptorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 488);
            this.skuPromoCartComposerInterceptorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 489);
            SwitchingProvider switchingProvider = new SwitchingProvider(this.iDaggerComponentImpl, 491);
            this.localGoodsForCheckoutRepositoryImplProvider = switchingProvider;
            this.bindLocalGoodsForCheckoutRepository$checkout_prodGoogleAllVendorsReleaseProvider = Jb.d.b(switchingProvider);
            this.firstRequestSetupConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 490);
            this.initCheckoutRequestConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 492);
            this.checkoutRequestInterceptorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 493);
            this.biometryStateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 494);
            this.notificationsSettingsStateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 495);
        }

        private void initialize6(AutoPickerExportModule autoPickerExportModule, ActionInitializeModule actionInitializeModule, ComposerInterceptorFactoryModule composerInterceptorFactoryModule, NamespaceModule namespaceModule, ReturnEditNavigationModule returnEditNavigationModule, HowToReturnGoodsNavigationModule howToReturnGoodsNavigationModule, ReturnCreationNavigationModule returnCreationNavigationModule, CmlOrdersNavigationModule cmlOrdersNavigationModule, CmlDeliveryNavigationModule cmlDeliveryNavigationModule, MessengerFeatureModule messengerFeatureModule, RemovePostModule removePostModule, PikazonModule pikazonModule, CsmaButtonCommonModule csmaButtonCommonModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, ActivateCodeWidgetModule activateCodeWidgetModule, SelectLinkWidgetModule selectLinkWidgetModule, LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule, ContextComponentDependencies contextComponentDependencies, IDaggerComponentDependencies iDaggerComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WhitelistComponentApi whitelistComponentApi, CacheComponentApi cacheComponentApi, BarcodeCacheComponentApi barcodeCacheComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, NotificationComponentApi notificationComponentApi, PushComponentApi pushComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AccountComponentApi accountComponentApi, AppLocaleComponentApi appLocaleComponentApi, LocationComponentApi locationComponentApi, CartComponentApi cartComponentApi, TabsComponentApi tabsComponentApi, WebComponentApi webComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, AddressComponentApi addressComponentApi, DebugMenuComponentApi debugMenuComponentApi, OzonDebugMenuComponentApi ozonDebugMenuComponentApi, ComposerComponentApi composerComponentApi, MediaUploadComponentApi mediaUploadComponentApi, AdvertisingMessagingApi advertisingMessagingApi, FreshNavigationComponentApi freshNavigationComponentApi, FreshComponentApi freshComponentApi, FintechLibApi fintechLibApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoriteComponentApi favoriteComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, OzonMapComponentApi ozonMapComponentApi, MinifyLinkComponentApi minifyLinkComponentApi, RmsComponentApi rmsComponentApi, PdfFileComponentApi pdfFileComponentApi, CouponComponentApi couponComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CheckoutPrefetchApi checkoutPrefetchApi, RestrictionsComponentApi restrictionsComponentApi, CheckoutCommonComponentApi checkoutCommonComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, GeoProviderComponentApi geoProviderComponentApi, MapCommonComponentApi mapCommonComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AuthComponentApi authComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, SearchPrefetchApi searchPrefetchApi, FavoritesUIComponentApi favoritesUIComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi, PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi, InterceptorPredicatesComponentApi interceptorPredicatesComponentApi, OrderShipmentComponentApi orderShipmentComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, DeeplinkRouteComponentApi deeplinkRouteComponentApi, MorkovskOnboardingComponentApi morkovskOnboardingComponentApi, UgcRatingComponentApi ugcRatingComponentApi, TilesDomainComponentApi tilesDomainComponentApi, UgcReviewFormComponentApi ugcReviewFormComponentApi, SelectionsCoreComponentApi selectionsCoreComponentApi, TravelStorageApi travelStorageApi, Limb2ComponentApi limb2ComponentApi, SentryApiComponent sentryApiComponent, AppOnboardingComponentApi appOnboardingComponentApi, CmlDomainComponentApi cmlDomainComponentApi, CmlDeliveryComponentApi cmlDeliveryComponentApi, NotificationStatusComponentApi notificationStatusComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi, Resources resources) {
            this.availableNativePaymentInterceptorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 496);
            this.firstRequestMapConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 497);
            this.addressBookStateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 498);
            this.authPostDataConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 499);
            this.longPollingPageComposerInterceptorProvider = new SwitchingProvider(this.iDaggerComponentImpl, CounterView.COUNTER_MAX_DEFAULT);
            this.provideKeepDeeplinkActivityOnExternalDeeplinkProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 501));
            this.trackerDebugMenuInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 503);
            this.loggerInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 504);
            this.environmentInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 505);
            this.leakCanaryInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 506);
            this.rxErrorPluginInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 507);
            this.whitelistingInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 508);
            this.webViewAuthDestinationInterceptorProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 511));
            this.trackerAnalyticsAdapterImplProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 513));
            this.factoryProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 514));
            this.provideMessengerFeatureProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, UserVerificationMethods.USER_VERIFY_NONE));
            this.provideAIMessengerFeatureProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 515));
            this.provideBloggerFeatureProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 516));
            this.provideDeeplinkHandlersSetProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 510));
            this.provideDeeplinkHandlersSetProvider2 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 517));
            this.provideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsReleaseProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 518));
            this.atMostQaUserDestinationInterceptorImplProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 520));
            this.provideDeeplinkHandlersSetProvider3 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 519));
            this.provideDeeplinkHandlersSetProvider4 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 521));
            this.provideDeeplinkHandlersSetProvider5 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 522));
            this.provideDeeplinkHandlersSetProvider6 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 523));
            this.provideDeeplinkHandlersSetProvider7 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 524));
            this.favoritesDeeplinkHandlerDelegateProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 526));
            this.provideDeeplinkHandlersSetProvider8 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 525));
            this.provideDeeplinkHandlersSetProvider9 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 527));
            this.provideDeeplinkHandlersSetProvider10 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 528));
            this.provideDeeplinkHandlersSetProvider11 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 529));
            this.provideDeeplinkHandlersSetProvider12 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 530));
            this.provideDeeplinkHandlersSetProvider13 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 531));
            this.provideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsReleaseProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 532));
            this.provideDeeplinkHandlersSetProvider14 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 533));
            this.provideDeeplinkHandlersSetProvider15 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 534));
            this.provideDeeplinkHandlersSet$faq_prodGoogleAllVendorsReleaseProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 535));
            this.provideDeeplinkHandlersSetProvider16 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 536));
            this.provideDeeplinkHandlersSetProvider17 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 537));
            this.provideDeeplinkHandlersSetProvider18 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 538));
            this.provideDeeplinkHandlersSetProvider19 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 539));
            this.provideDeeplinkHandlersSetProvider20 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 540));
            this.provideDeeplinkHandlersSetProvider21 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 541));
            this.provideDeeplinkHandlersSetProvider22 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 542));
            this.provideDeeplinkHandlersSetProvider23 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 543));
            this.provideDeeplinkHandlersSetProvider24 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 544));
            this.provideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsReleaseProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 545));
            this.provideDeeplinkHandlerSetProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 546));
            this.provideDeeplinkHandlersSetProvider25 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 547));
            this.provideDeeplinkHandlersProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 548));
            this.getExtraHeadersDataSourceProvider = new SwitchingProvider(this.iDaggerComponentImpl, 550);
            this.atMostEmployeeUserDestinationInterceptorImplProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 551));
            this.provideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsReleaseProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 549));
            this.provideDeeplinkHandlersSetProvider26 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 552));
            this.provideDeeplinkHandlersSet$miniapp_prodGoogleAllVendorsReleaseProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 553));
            this.provideDeeplinkHandlersSet$geo_prodGoogleAllVendorsReleaseProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 554));
            this.provideDeeplinkHandlersSetProvider27 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES));
            this.provideDeeplinkHandlersSetProvider28 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 556));
            this.provideDeeplinkHandlersSetProvider29 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 557));
            this.provideDeeplinkHandlersSet$regulardraw_prodGoogleAllVendorsReleaseProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 558));
            this.provideDeeplinkHandlersSet$payment_prodGoogleAllVendorsReleaseProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 559));
            this.provideDeeplinkHandlersSetProvider30 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 560));
            this.provideDeeplinkHandlersSetProvider31 = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 561));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.iDaggerComponentImpl, 562);
            this.onBoardingDisplayDisableDeeplinkHandlerProvider = switchingProvider;
            this.bindOnBoardingDisplayDisableDeeplinkHandlerProvider = Jb.m.a(switchingProvider);
            this.screenRouterActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 509);
            this.getOzonIdCookieEventsProvider = new SwitchingProvider(this.iDaggerComponentImpl, 564);
            this.ozonIdAccountInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 563);
            this.ozonDebugMenuSdkInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 565);
            this.limbActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 566);
            this.sentrySessionIdInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 567);
            this.getRestrictRedirectsNetworkInterceptorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 569);
            this.getCacheErrorInterceptorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 570);
            this.abToolActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 568);
            this.trackerActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 571);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.iDaggerComponentImpl, 573);
            this.dataLayerInitializerImplProvider = switchingProvider2;
            this.bindDataLayerInitializer$main_prodGoogleAllVendorsReleaseProvider = Jb.m.a(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.iDaggerComponentImpl, 574);
            this.authAnalyticsImplProvider = switchingProvider3;
            this.bindsAuthAnalytics$main_prodGoogleAllVendorsReleaseProvider = Jb.m.a(switchingProvider3);
            this.analyticsInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 572);
            this.jodaActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 575);
            this.pikazonUserAgentInterceptorProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 578));
            this.providePikazonEventListenerFactoryProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 579));
            this.providerCronetConfigProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 580));
            this.provideCronetMetricListenerProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 581));
            this.providePikazonClientProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 577));
            this.pikazonActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 576);
            this.httpLoggingActionIntializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 582);
            this.mapsActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 583);
            this.applicationLifecycleObserverProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 585));
            this.fragmentsAppearanceUpdaterProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 586));
            this.bottomSheetFragmentsAppearanceUpdaterProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 588));
            this.fragmentsLifecycleHandlerProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 587));
            this.setOfWarmupInfoProvider = new SwitchingProvider(this.iDaggerComponentImpl, 591);
            this.warmupAdaptersFacadeProvider = new SwitchingProvider(this.iDaggerComponentImpl, 590);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.iDaggerComponentImpl, 589);
            this.moshiAdapterWarmerImplProvider = switchingProvider4;
            this.bindMoshiAdapterWarmer$main_prodGoogleAllVendorsReleaseProvider = Jb.d.b(switchingProvider4);
            this.applicationLifecycleInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 584);
            this.getFintechCoreLibBankProvider = new SwitchingProvider(this.iDaggerComponentImpl, 593);
        }

        private void initialize7(AutoPickerExportModule autoPickerExportModule, ActionInitializeModule actionInitializeModule, ComposerInterceptorFactoryModule composerInterceptorFactoryModule, NamespaceModule namespaceModule, ReturnEditNavigationModule returnEditNavigationModule, HowToReturnGoodsNavigationModule howToReturnGoodsNavigationModule, ReturnCreationNavigationModule returnCreationNavigationModule, CmlOrdersNavigationModule cmlOrdersNavigationModule, CmlDeliveryNavigationModule cmlDeliveryNavigationModule, MessengerFeatureModule messengerFeatureModule, RemovePostModule removePostModule, PikazonModule pikazonModule, CsmaButtonCommonModule csmaButtonCommonModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, ActivateCodeWidgetModule activateCodeWidgetModule, SelectLinkWidgetModule selectLinkWidgetModule, LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule, ContextComponentDependencies contextComponentDependencies, IDaggerComponentDependencies iDaggerComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WhitelistComponentApi whitelistComponentApi, CacheComponentApi cacheComponentApi, BarcodeCacheComponentApi barcodeCacheComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, NotificationComponentApi notificationComponentApi, PushComponentApi pushComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AccountComponentApi accountComponentApi, AppLocaleComponentApi appLocaleComponentApi, LocationComponentApi locationComponentApi, CartComponentApi cartComponentApi, TabsComponentApi tabsComponentApi, WebComponentApi webComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, AddressComponentApi addressComponentApi, DebugMenuComponentApi debugMenuComponentApi, OzonDebugMenuComponentApi ozonDebugMenuComponentApi, ComposerComponentApi composerComponentApi, MediaUploadComponentApi mediaUploadComponentApi, AdvertisingMessagingApi advertisingMessagingApi, FreshNavigationComponentApi freshNavigationComponentApi, FreshComponentApi freshComponentApi, FintechLibApi fintechLibApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoriteComponentApi favoriteComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, OzonMapComponentApi ozonMapComponentApi, MinifyLinkComponentApi minifyLinkComponentApi, RmsComponentApi rmsComponentApi, PdfFileComponentApi pdfFileComponentApi, CouponComponentApi couponComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CheckoutPrefetchApi checkoutPrefetchApi, RestrictionsComponentApi restrictionsComponentApi, CheckoutCommonComponentApi checkoutCommonComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, GeoProviderComponentApi geoProviderComponentApi, MapCommonComponentApi mapCommonComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AuthComponentApi authComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, SearchPrefetchApi searchPrefetchApi, FavoritesUIComponentApi favoritesUIComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi, PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi, InterceptorPredicatesComponentApi interceptorPredicatesComponentApi, OrderShipmentComponentApi orderShipmentComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, DeeplinkRouteComponentApi deeplinkRouteComponentApi, MorkovskOnboardingComponentApi morkovskOnboardingComponentApi, UgcRatingComponentApi ugcRatingComponentApi, TilesDomainComponentApi tilesDomainComponentApi, UgcReviewFormComponentApi ugcReviewFormComponentApi, SelectionsCoreComponentApi selectionsCoreComponentApi, TravelStorageApi travelStorageApi, Limb2ComponentApi limb2ComponentApi, SentryApiComponent sentryApiComponent, AppOnboardingComponentApi appOnboardingComponentApi, CmlDomainComponentApi cmlDomainComponentApi, CmlDeliveryComponentApi cmlDeliveryComponentApi, NotificationStatusComponentApi notificationStatusComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi, Resources resources) {
            this.authActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 592);
            this.pushInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 594);
            this.atomActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 595);
            this.darkThemeInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 596);
            this.tabConfigInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 597);
            this.appsFlyerActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 598);
            this.userStateActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 599);
            this.storiesConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 601);
            this.refreshByLocationConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 602);
            this.fullScreenConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 603);
            this.hideTabBarOnScrollViewModelProvider = new SwitchingProvider(this.iDaggerComponentImpl, 605);
            this.bottomNavigationScrollConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 604);
            this.composerLifecycleConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 606);
            this.composerActionAndRedirectConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 607);
            this.voiceRecognitionConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 608);
            this.refreshByCurrencyConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 609);
            this.refreshByLocaleConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 610);
            this.notificationConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 611);
            this.addressSelectorRefresherConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 612);
            this.vKIDRefreshStateConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 613);
            this.searchByImageConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 614);
            this.cartActionsProcessorConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 615);
            this.sessionListConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 616);
            this.provideSearchCacheTrackerApiProvider = Jb.m.a(new SwitchingProvider(this.iDaggerComponentImpl, 618));
            this.searchPageLoadConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 617);
            this.dialogSearchPageLoadConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 619);
            this.loaderConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 620);
            this.refreshByStatusEdoConfiguratorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 621);
            this.configuratorsActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 600);
            this.cacheComposerInterceptorProvider = new SwitchingProvider(this.iDaggerComponentImpl, 623);
            this.composerActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 622);
            this.webViewInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 624);
            this.stringsProviderInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 625);
            this.localizationActivityCallbackProvider = new SwitchingProvider(this.iDaggerComponentImpl, 627);
            this.setLocaleActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 626);
            this.prefetchManagerActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 628);
            this.advertisingMessagingInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 629);
            this.composerCacheInvalidatorInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 630);
            this.ozonGalleryInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 631);
            this.updateCartInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 632);
            this.freshLiveActivityInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 633);
            this.hapticsInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 634);
            this.composerLoggingActionsInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 635);
            this.startupTimeTrackerInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 636);
            this.getFintechCoreLibRkoProvider = new SwitchingProvider(this.iDaggerComponentImpl, 639);
            this.getFintechCoreLibPayProvider = new SwitchingProvider(this.iDaggerComponentImpl, 640);
            this.fintechLibActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 638);
            this.bindFintechLibActionInitializerProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 637));
            this.lastLocationInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 641);
            this.sberPayInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 642);
            this.nativePaymentInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 643);
            this.cleanCustomBundleStateActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 644);
            this.jetpackComposeInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 645);
            this.dynamicShortcutsInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 646);
            this.ozonInAppUpdateInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 647);
            this.messengerFeatureActionInitializerProvider = new SwitchingProvider(this.iDaggerComponentImpl, 648);
            this.appInitializerProvider = Jb.d.b(new SwitchingProvider(this.iDaggerComponentImpl, 502));
        }

        private DatePickerDialogFragment injectDatePickerDialogFragment(DatePickerDialogFragment datePickerDialogFragment) {
            DatePickerDialogFragment_MembersInjector.injectPViewModel(datePickerDialogFragment, this.datePickerViewModelProvider);
            return datePickerDialogFragment;
        }

        private InputFormActionHandler inputFormActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new InputFormActionHandler(actionRepository);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InstantLoginManager instantLoginManager() {
            return new InstantLoginManager(this.getOzonIdAppApiProvider.get());
        }

        private InstantLoginSettingsConfig instantLoginSettingsConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new InstantLoginSettingsConfig(jsonDeserializer);
        }

        private InstantLoginSettingsViewMapper instantLoginSettingsViewMapper() {
            HandlersInhibitor handlersInhibitor = this.handlersInhibitorProvider.get();
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return new InstantLoginSettingsViewMapper(handlersInhibitor, customActionHandlersStoreFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InternalTeethFactory internalTeethFactory() {
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new InternalTeethFactory(moshi);
        }

        private LinkFastPayActionHandler linkFastPayActionHandler() {
            return new LinkFastPayActionHandler(this.linkFastPayViewModelProvider);
        }

        private LoaderConfiguratorFactory loaderConfiguratorFactory() {
            return new LoaderConfiguratorFactory(this.loaderConfiguratorProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LocalizationSwitcher localizationSwitcher() {
            AppLocaleRepository appLocaleRepository = this.appLocaleComponentApi.getAppLocaleRepository();
            j.c(appLocaleRepository);
            return new LocalizationSwitcher(appLocaleRepository);
        }

        private LoginConfig loginConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new LoginConfig(jsonDeserializer);
        }

        private LoginViewMapper loginViewMapper() {
            return new LoginViewMapper(new LoginMapper());
        }

        private LogosListConfig logosListConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new LogosListConfig(jsonDeserializer);
        }

        private LogosListViewMapper logosListViewMapper() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            AsyncCartViewModelProviderWrapper asyncCartViewModelProvider = this.cartServiceApi.getAsyncCartViewModelProvider();
            j.c(asyncCartViewModelProvider);
            return new LogosListViewMapper(customActionHandlersStoreFactory, appType, asyncCartViewModelProvider);
        }

        private LogoutConfig logoutConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new LogoutConfig(jsonDeserializer);
        }

        private LogoutOnAllDevicesApi logoutOnAllDevicesApi() {
            LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule = this.logoutOnAllDevicesWidgetModule;
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return LogoutOnAllDevicesWidgetModule_ProvideApiFactory.provideApi(logoutOnAllDevicesWidgetModule, retrofit);
        }

        private LogoutOnAllDevicesConfig logoutOnAllDevicesConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new LogoutOnAllDevicesConfig(jsonDeserializer);
        }

        private LogoutOnAllDevicesViewMapper logoutOnAllDevicesViewMapper() {
            a<LogoutOnAllDevicesViewModelImpl> aVar = this.logoutOnAllDevicesViewModelImplProvider;
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new LogoutOnAllDevicesViewMapper(aVar, ozonRouter);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LogoutOnAllRepository logoutOnAllRepository() {
            return new LogoutOnAllRepository(logoutOnAllDevicesApi());
        }

        private LogoutViewMapper logoutViewMapper() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return new LogoutViewMapper(customActionHandlersStoreFactory);
        }

        private MainAppHandler mainAppHandler() {
            e miniAppConfigHolder = this.navigationComponentApi.getMiniAppConfigHolder();
            j.c(miniAppConfigHolder);
            return new MainAppHandler(miniAppConfigHolder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Integer, NamedActionInitializerProvider> mapOfIntegerAndNamedActionInitializerProvider() {
            AbstractC5881z.a e11 = AbstractC5881z.e(49);
            e11.b(-17, provideTrackerDebugMenuInitializer());
            e11.b(-16, provideLoggerInitializer());
            e11.b(-14, provideEnvironmentInitializer());
            e11.b(-13, provideLeakCanaryInitializer());
            e11.b(-12, provideRxErrorPluginInitializer());
            e11.b(-11, provideWhitelistingInitializer());
            e11.b(-10, provideScreenRouterActionInitializer());
            e11.b(-3, provideOzonIdAccountInitializer());
            e11.b(-2, provideOzonDebugMenuSdkInitializer());
            e11.b(-1, provideLimbActionInitializer());
            e11.b(0, provideSentrySessionIdInitializer());
            e11.b(1, provideAbToolActionInitializer());
            e11.b(2, provideTrackerActionInitializer());
            e11.b(3, provideAnalyticsInitializer());
            e11.b(6, provideJodaActionInitializer());
            e11.b(7, providePikazonActionInitializer());
            e11.b(8, provideHttpLoggingActionIntializer());
            e11.b(9, provideMapsActionInitializer());
            e11.b(10, provideApplicationLifecycleInitializer());
            e11.b(11, provideAuthActionInitializer());
            e11.b(12, providePushInitializer());
            e11.b(13, provideAtomActionInitializer());
            e11.b(14, provideDarkThemeInitializer());
            e11.b(15, provideTabConfigInitializer());
            e11.b(16, provideAppsFlyerActionInitializer());
            e11.b(17, provideUserStateActionInitializer());
            e11.b(19, provideConfiguratorsActionInitializer());
            e11.b(20, provideComposerActionInitializer());
            e11.b(23, provideWebViewInitializer());
            e11.b(24, provideStringsProviderInitializer());
            e11.b(25, provideSetLocaleActionInitializer());
            e11.b(26, providePrefetchManagerActionInitializer());
            e11.b(33, provideAdvertisingMessagingInitializer());
            e11.b(35, provideComposerCacheInvalidatorInitializer());
            e11.b(36, provideOzonGalleryInitializer());
            e11.b(40, provideUpdateCartInitializer());
            e11.b(41, provideFreshLiveActivityInitializer());
            e11.b(42, provideHapticsInitializer());
            e11.b(44, provideComposerLoggingActionsInitializer());
            e11.b(45, provideStartupTimeTrackerInitializer());
            e11.b(47, this.bindFintechLibActionInitializerProvider.get());
            e11.b(48, provideLastLocationInitializer());
            e11.b(50, provideSberPayInitializer());
            e11.b(51, provideNativePaymentInitializer());
            e11.b(52, provideCleanCustomBundleStateActionInitializer());
            e11.b(53, provideJetpackComposeInitializer());
            e11.b(54, provideShortcutsInitializer());
            e11.b(55, provideOzonInAppUpdateInitializer());
            e11.b(56, provideMessengerFeatureActionInitializer());
            return e11.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MaskAutocompleteRepository maskAutocompleteRepository() {
            FormPageApiDataSource formPageApiDataSource = this.provideFormPageApiDataSourceProvider.get();
            NetworkComponentConfig networkComponentConfig = this.networkComponentApi.getNetworkComponentConfig();
            j.c(networkComponentConfig);
            return new MaskAutocompleteRepository(formPageApiDataSource, networkComponentConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MessengerInitializer messengerInitializer() {
            E okHttpClient = this.networkComponentApi.getOkHttpClient();
            j.c(okHttpClient);
            Context context = this.getContextProvider.get();
            TrackerAnalyticsAdapterImpl trackerAnalyticsAdapterImpl = this.trackerAnalyticsAdapterImplProvider.get();
            NetworkComponentConfig networkComponentConfig = this.networkComponentApi.getNetworkComponentConfig();
            j.c(networkComponentConfig);
            String webSocketLink = this.iDaggerComponentDependencies.getWebSocketLink();
            j.c(webSocketLink);
            MessengerNonFatalLogger messengerNonFatalLogger = new MessengerNonFatalLogger();
            FeatureChecker featureChecker = this.getFeatureCheckerProvider.get();
            InterfaceC6369b ozonTracker = this.analyticsComponentApi.getOzonTracker();
            j.c(ozonTracker);
            AppVersionStorage appVersionStorage = this.storageComponentApi.getAppVersionStorage();
            j.c(appVersionStorage);
            AppVersionService appVersionService = this.networkComponentApi.getAppVersionService();
            j.c(appVersionService);
            return new MessengerInitializer(okHttpClient, context, trackerAnalyticsAdapterImpl, networkComponentConfig, webSocketLink, messengerNonFatalLogger, featureChecker, ozonTracker, appVersionStorage, appVersionService);
        }

        private MetaWidgetConfig metaWidgetConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new MetaWidgetConfig(jsonDeserializer);
        }

        private MetaWidgetViewMapper metaWidgetViewMapper() {
            SearchRouterImpl searchRouterImpl = new SearchRouterImpl();
            FavoriteEntityInteractor favoriteEntityInteractor = this.favoritesDataComponentApi.getFavoriteEntityInteractor();
            j.c(favoriteEntityInteractor);
            return new MetaWidgetViewMapper(searchRouterImpl, favoriteEntityInteractor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ru.ozon.android.messenger.framework.navigation.action.f namedMessengerExternalActionHandler() {
            return MessengerInitializerModule_Companion_ProvideMessengerActionHandlerImplFactory.provideMessengerActionHandlerImpl(this.factoryProvider.get(), namedString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ru.ozon.android.messenger.framework.navigation.action.f namedMessengerExternalActionHandler2() {
            return MessengerInitializerModule_Companion_ProvideAiMessengerActionHandlerImplFactory.provideAiMessengerActionHandlerImpl(this.factoryProvider.get(), NamespaceModule_ProvideAIChatFeatureNamespaceFactory.provideAIChatFeatureNamespace(this.namespaceModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ru.ozon.android.messenger.framework.navigation.action.f namedMessengerExternalActionHandler3() {
            return MessengerInitializerModule_Companion_ProvideBloggerMessengerActionHandlerImplFactory.provideBloggerMessengerActionHandlerImpl(this.factoryProvider.get(), NamespaceModule_ProvideBloggerChatNamespaceFactory.provideBloggerChatNamespace(this.namespaceModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String namedString() {
            NamespaceModule namespaceModule = this.namespaceModule;
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            return NamespaceModule_ProvideMessengerFeatureNamespaceFactory.provideMessengerFeatureNamespace(namespaceModule, appType, this.getFeatureCheckerProvider.get());
        }

        private NamedValueListConfig namedValueListConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new NamedValueListConfig(jsonDeserializer);
        }

        private NavBarIconButtonNavbarConfig navBarIconButtonNavbarConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new NavBarIconButtonNavbarConfig(jsonDeserializer);
        }

        private NavTitleConfig navTitleConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new NavTitleConfig(jsonDeserializer);
        }

        private NavTitleViewMapper navTitleViewMapper() {
            return new NavTitleViewMapper(this.navTitleMapperProvider);
        }

        private NavbarIconButtonViewMapper navbarIconButtonViewMapper() {
            ActionSheetEventHandler actionSheetEventHandler = this.actionComponentApi.getActionSheetEventHandler();
            j.c(actionSheetEventHandler);
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            FavoritesListsInteractor favoritesListsInteractor = this.favoriteCoreComponentApi.getFavoritesListsInteractor();
            j.c(favoritesListsInteractor);
            FavoritesListsEventsManager favoritesListsEventsManager = this.favoritesUIComponentApi.getFavoritesListsEventsManager();
            j.c(favoritesListsEventsManager);
            a<ShoppingListsViewModel> aVar = this.shoppingListsViewModelProvider;
            CartService cartService = this.cartServiceApi.getCartService();
            j.c(cartService);
            CreateFavoritesListDelegate createFavoritesListDelegate = createFavoritesListDelegate();
            SellerFavoriteService sellerFavoriteService = this.accountComponentApi.getSellerFavoriteService();
            j.c(sellerFavoriteService);
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            FavoriteEntityInteractor favoriteEntityInteractor = this.favoritesDataComponentApi.getFavoriteEntityInteractor();
            j.c(favoriteEntityInteractor);
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return new NavbarIconButtonViewMapper(actionSheetEventHandler, jsonDeserializer, favoritesListsInteractor, favoritesListsEventsManager, aVar, cartService, createFavoritesListDelegate, sellerFavoriteService, adultHandler, ozonRouter, favoriteEntityInteractor, customActionHandlersStoreFactory, this.minifyLinkViewModelProvider);
        }

        private NavigationBlocksV2Config navigationBlocksV2Config() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new NavigationBlocksV2Config(jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public NavigationSliderV2PreCreateInfoProvider navigationSliderV2PreCreateInfoProvider() {
            return new NavigationSliderV2PreCreateInfoProvider(this.getFeatureCheckerProvider.get());
        }

        private NewCredentialsConfig newCredentialsConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new NewCredentialsConfig(jsonDeserializer);
        }

        private NewCredentialsViewMapper newCredentialsViewMapper() {
            a<NewCredentialsViewModelImpl> aVar = this.newCredentialsViewModelImplProvider;
            HandlersInhibitor handlersInhibitor = this.handlersInhibitorProvider.get();
            Ob0.a aVar2 = this.getOzonIdAppApiProvider.get();
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new NewCredentialsViewMapper(aVar, handlersInhibitor, aVar2, ozonRouter);
        }

        private NotificationConfiguratorFactory notificationConfiguratorFactory() {
            return new NotificationConfiguratorFactory(this.notificationConfiguratorProvider);
        }

        private OTPWidgetConfig oTPWidgetConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new OTPWidgetConfig(jsonDeserializer);
        }

        private OTPWidgetViewMapper oTPWidgetViewMapper() {
            OTPWidgetMapper oTPWidgetMapper = new OTPWidgetMapper();
            a<OTPWidgetViewModelImpl> aVar = this.oTPWidgetViewModelImplProvider;
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            JsonSerializer jsonSerializer = this.networkComponentApi.getJsonSerializer();
            j.c(jsonSerializer);
            return new OTPWidgetViewMapper(oTPWidgetMapper, aVar, ozonRouter, jsonSerializer, this.oTPPeriodFormatterBuilderProvider.get());
        }

        private OnBoardingDisplayDisableNavigationHandler onBoardingDisplayDisableNavigationHandler() {
            return new OnBoardingDisplayDisableNavigationHandler(default_());
        }

        private OneTimePostRefreshHandlerV2 oneTimePostRefreshHandlerV2() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new OneTimePostRefreshHandlerV2(jsonDeserializer);
        }

        private OrientationLifecycleHandler orientationLifecycleHandler() {
            ScreenOrientationDelegate screenOrientationDelegate = this.androidPlatformComponentApi.getScreenOrientationDelegate();
            j.c(screenOrientationDelegate);
            return new OrientationLifecycleHandler(screenOrientationDelegate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OzonBankOfflineInfoWidgetFactory ozonBankOfflineInfoWidgetFactory() {
            AppVersionService appVersionService = this.networkComponentApi.getAppVersionService();
            j.c(appVersionService);
            FeatureChecker featureChecker = this.getFeatureCheckerProvider.get();
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new OzonBankOfflineInfoWidgetFactory(appVersionService, featureChecker, moshi);
        }

        private OzonBankStateCommand ozonBankStateCommand() {
            return new OzonBankStateCommand(Jb.d.a(this.getFintechCoreLibBankProvider));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OzonIdInitializerDelegate ozonIdInitializerDelegate() {
            Ob0.a aVar = this.getOzonIdAppApiProvider.get();
            AuthEventsCollector authEventsCollector = this.accountComponentApi.getAuthEventsCollector();
            j.c(authEventsCollector);
            return new OzonIdInitializerDelegate(aVar, authEventsCollector, Jb.d.a(this.getOzonIdCookieEventsProvider));
        }

        private OzonMessengerAuthStateCommand ozonMessengerAuthStateCommand() {
            UserManager userManager = this.accountComponentApi.getUserManager();
            j.c(userManager);
            return new OzonMessengerAuthStateCommand(userManager);
        }

        private OzonPushAuthStateCommand ozonPushAuthStateCommand() {
            return new OzonPushAuthStateCommand(Jb.d.a(this.getOzonPushManagerProvider));
        }

        private PageHeaderConfig pageHeaderConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new PageHeaderConfig(jsonDeserializer);
        }

        private PageHeaderViewMapper pageHeaderViewMapper() {
            return new PageHeaderViewMapper(this.getContextProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PassFormRepository passFormRepository() {
            FormPageApiDataSource formPageApiDataSource = this.provideFormPageApiDataSourceProvider.get();
            NetworkComponentConfig networkComponentConfig = this.networkComponentApi.getNetworkComponentConfig();
            j.c(networkComponentConfig);
            return new PassFormRepository(formPageApiDataSource, networkComponentConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PdpStatusWidgetFactory pdpStatusWidgetFactory() {
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new PdpStatusWidgetFactory(moshi);
        }

        private PerformActionsListActionHandler performActionsListActionHandler() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            CoroutineDispatcherProvider dispatcherProvider = this.coroutineDispatchersComponentApi.getDispatcherProvider();
            j.c(dispatcherProvider);
            return new PerformActionsListActionHandler(jsonDeserializer, dispatcherProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PhotoRepository photoRepository() {
            return new PhotoRepository(this.provideFormPageApiDataSourceProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PikazonEventListenerInterceptor pikazonEventListenerInterceptor() {
            PerformanceTrackerDelegate performanceTrackerDelegate = this.analyticsComponentApi.getPerformanceTrackerDelegate();
            j.c(performanceTrackerDelegate);
            Sg.a applicationAnalyticsScreenStorage = this.analyticsScreenStorageComponentApi.getApplicationAnalyticsScreenStorage();
            j.c(applicationAnalyticsScreenStorage);
            return new PikazonEventListenerInterceptor(performanceTrackerDelegate, applicationAnalyticsScreenStorage);
        }

        private PixelConfig pixelConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new PixelConfig(jsonDeserializer);
        }

        private PlayStoriesConfig playStoriesConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new PlayStoriesConfig(jsonDeserializer);
        }

        private PostApi postApi() {
            RemovePostModule removePostModule = this.removePostModule;
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return RemovePostModule_ProvidePostApiFactory.providePostApi(removePostModule, retrofit);
        }

        private PostRenderActionHandler postRenderActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new PostRenderActionHandler(actionRepository);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PostRepository postRepository() {
            return new PostRepository(postApi());
        }

        private PriceV4Config priceV4Config() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new PriceV4Config(jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PriceV4WidgetFactory priceV4WidgetFactory() {
            PdpOfflineScreenWidgetsData pdpEmptyScreenService = this.pdpOfflineScreenComponentApi.pdpEmptyScreenService();
            j.c(pdpEmptyScreenService);
            PriceV4Config priceV4Config = priceV4Config();
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new PriceV4WidgetFactory(pdpEmptyScreenService, priceV4Config, moshi);
        }

        private ProductPickerDetailsConfig productPickerDetailsConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ProductPickerDetailsConfig(jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ProductReviewRepository productReviewRepository() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ProductReviewRepository(actionRepository, jsonDeserializer);
        }

        private ProductSelectorDataAllStepNoUiViewMapper productSelectorDataAllStepNoUiViewMapper() {
            return new ProductSelectorDataAllStepNoUiViewMapper(this.allStepViewModelProvider, new SelectorDataViewAnalyticDelegate());
        }

        private ProductSelectorDataConcreteStepNoUiViewMapper productSelectorDataConcreteStepNoUiViewMapper() {
            a<ConcreteStepViewModel> aVar = this.concreteStepViewModelProvider;
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new ProductSelectorDataConcreteStepNoUiViewMapper(aVar, ozonRouter, new SelectorDataViewAnalyticDelegate());
        }

        private ProductSelectorMobileConfig productSelectorMobileConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ProductSelectorMobileConfig(jsonDeserializer);
        }

        private ProductSelectorMobileDataConfig productSelectorMobileDataConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ProductSelectorMobileDataConfig(jsonDeserializer);
        }

        private ProductSelectorMobileViewMapper productSelectorMobileViewMapper() {
            return new ProductSelectorMobileViewMapper(new ProductSelectorMobileMapper(), this.handlersInhibitorProvider.get(), this.pickerRefreshLinkStoreProvider.get());
        }

        private PromoBannerV2Config promoBannerV2Config() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new PromoBannerV2Config(jsonDeserializer);
        }

        private PromoBannerV2ViewMapper promoBannerV2ViewMapper() {
            return new PromoBannerV2ViewMapper(this.handlersInhibitorProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Lg0.c protectionAppDialogHostApi() {
            Application application = this.contextComponentDependencies.getApplication();
            j.c(application);
            return HomePageModule_ProvideProtectionAppDialogPluginProviderFactory.provideProtectionAppDialogPluginProvider(application);
        }

        private NamedActionInitializerProvider provideAbToolActionInitializer() {
            return ActionInitializeModule_ProvideAbToolActionInitializerFactory.provideAbToolActionInitializer(this.actionInitializeModule, this.abToolActionInitializerProvider);
        }

        private Widget provideActivateCodeWidget() {
            return ActivateCodeWidgetModule_ProvideActivateCodeWidgetFactory.provideActivateCodeWidget(this.activateCodeWidgetModule, activateCodeConfig(), activateCodeViewMapper());
        }

        private NamedActionInitializerProvider provideAdvertisingMessagingInitializer() {
            return ActionInitializeModule_ProvideAdvertisingMessagingInitializerFactory.provideAdvertisingMessagingInitializer(this.actionInitializeModule, this.advertisingMessagingInitializerProvider);
        }

        private Widget provideAllToCartWidget() {
            return AllToCartModule_ProvideAllToCartWidgetFactory.provideAllToCartWidget(allToCartConfig(), allToCartViewMapper());
        }

        private NamedActionInitializerProvider provideAnalyticsInitializer() {
            return ActionInitializeModule_ProvideAnalyticsInitializerFactory.provideAnalyticsInitializer(this.actionInitializeModule, this.analyticsInitializerProvider);
        }

        private Widget provideAnnotationWidget() {
            return AnnotationWidgetModule_ProvideAnnotationWidgetFactory.provideAnnotationWidget(annotationConfig(), annotationViewMapper(), annotationNoUiViewMapper());
        }

        private NamedActionInitializerProvider provideApplicationLifecycleInitializer() {
            return ActionInitializeModule_ProvideApplicationLifecycleInitializerFactory.provideApplicationLifecycleInitializer(this.actionInitializeModule, this.applicationLifecycleInitializerProvider);
        }

        private NamedActionInitializerProvider provideAppsFlyerActionInitializer() {
            return ActionInitializeModule_ProvideAppsFlyerActionInitializerFactory.provideAppsFlyerActionInitializer(this.actionInitializeModule, this.appsFlyerActionInitializerProvider);
        }

        private NamedActionInitializerProvider provideAtomActionInitializer() {
            return ActionInitializeModule_ProvideAtomActionInitializerFactory.provideAtomActionInitializer(this.actionInitializeModule, this.atomActionInitializerProvider);
        }

        private NamedActionInitializerProvider provideAuthActionInitializer() {
            return ActionInitializeModule_ProvideAuthActionInitializerFactory.provideAuthActionInitializer(this.actionInitializeModule, this.authActionInitializerProvider);
        }

        private NamedActionInitializerProvider provideCleanCustomBundleStateActionInitializer() {
            return ActionInitializeModule_ProvideCleanCustomBundleStateActionInitializerFactory.provideCleanCustomBundleStateActionInitializer(this.actionInitializeModule, this.cleanCustomBundleStateActionInitializerProvider);
        }

        private Widget provideCloseButtonWidget() {
            return CloseButtonModule_ProvideCloseButtonWidgetFactory.provideCloseButtonWidget(closeButtonConfig(), new CloseButtonViewMapper());
        }

        private NamedActionInitializerProvider provideComposerActionInitializer() {
            return ActionInitializeModule_ProvideComposerActionInitializerFactory.provideComposerActionInitializer(this.actionInitializeModule, this.composerActionInitializerProvider);
        }

        private NamedActionInitializerProvider provideComposerCacheInvalidatorInitializer() {
            return ActionInitializeModule_ProvideComposerCacheInvalidatorInitializerFactory.provideComposerCacheInvalidatorInitializer(this.actionInitializeModule, this.composerCacheInvalidatorInitializerProvider);
        }

        private NamedActionInitializerProvider provideComposerLoggingActionsInitializer() {
            return ActionInitializeModule_ProvideComposerLoggingActionsInitializerFactory.provideComposerLoggingActionsInitializer(this.actionInitializeModule, this.composerLoggingActionsInitializerProvider);
        }

        private NamedActionInitializerProvider provideConfiguratorsActionInitializer() {
            return ActionInitializeModule_ProvideConfiguratorsActionInitializerFactory.provideConfiguratorsActionInitializer(this.actionInitializeModule, this.configuratorsActionInitializerProvider);
        }

        private Widget provideConfirmDeleteOtp() {
            return DeleteAccountModule_ProvideConfirmDeleteOtpFactory.provideConfirmDeleteOtp(confirmDeleteOtpConfig(), confirmDeleteOtpNoUiViewMapper());
        }

        private Widget provideContractBtnWidget() {
            return ContractBtnModule_Companion_ProvideContractBtnWidgetFactory.provideContractBtnWidget(contractBtnConfig(), contractBtnViewMapper());
        }

        private Widget provideCurtainWidget() {
            return CurtainWidgetModule_ProvideCurtainWidgetFactory.provideCurtainWidget(curtainConfig(), curtainViewMapper(), curtainCustomViewMapper());
        }

        private NamedActionInitializerProvider provideDarkThemeInitializer() {
            return ActionInitializeModule_ProvideDarkThemeInitializerFactory.provideDarkThemeInitializer(this.actionInitializeModule, this.darkThemeInitializerProvider);
        }

        private Set<IZ.a> provideDeeplinkHandler() {
            return ErrorSummaryNavigationDiModule_ProvideDeeplinkHandlerFactory.provideDeeplinkHandler(this.atMostQaUserDestinationInterceptorImplProvider.get());
        }

        private Set<IZ.a> provideDeeplinkHandler2() {
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            return MessengerNavigationModule_ProvideDeeplinkHandlerFactory.provideDeeplinkHandler(appType);
        }

        private Set<IZ.a> provideDeeplinkHandlers() {
            return ReturnCreationNavigationModule_ProvideDeeplinkHandlersFactory.provideDeeplinkHandlers(this.returnCreationNavigationModule, this.getContextProvider.get());
        }

        private Set<IZ.a> provideDeeplinkHandlers$storefront_prodGoogleAllVendorsRelease() {
            TabConfigManager tabConfigManager = this.tabsComponentApi.getTabConfigManager();
            j.c(tabConfigManager);
            TeensModeService teensModeService = this.storefrontCommonComponentApi.getTeensModeService();
            j.c(teensModeService);
            OzonPushManager ozonPushManager = this.getOzonPushManagerProvider.get();
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return StoreFrontNavigationModule_ProvideDeeplinkHandlers$storefront_prodGoogleAllVendorsReleaseFactory.provideDeeplinkHandlers$storefront_prodGoogleAllVendorsRelease(tabConfigManager, teensModeService, ozonPushManager, actionRepository, this.atMostQaUserDestinationInterceptorImplProvider.get(), new HomeDestinationFactoryImpl(), failedExternalLinkRetryFeatureChecker());
        }

        private Widget provideDeleteAccountButton() {
            return DeleteAccountModule_ProvideDeleteAccountButtonFactory.provideDeleteAccountButton(deleteAccountButtonConfig(), deleteAccountButtonViewMapper());
        }

        private Widget provideDeleteAccountDescription() {
            return DeleteAccountModule_ProvideDeleteAccountDescriptionFactory.provideDeleteAccountDescription(deleteAccountDescriptionConfig(), deleteAccountDescriptionViewMapper(), deleteAccountDescriptionStickyNoUIViewMapper());
        }

        private Widget provideDiscountCodeWidget() {
            return CurtainNavBarWidgetModule_ProvideDiscountCodeWidgetFactory.provideDiscountCodeWidget(curtainNavBarConfig(), curtainNavBarViewMapper());
        }

        private Widget provideDiscountCodeWidget2() {
            return TextBlockWidgetModule_ProvideDiscountCodeWidgetFactory.provideDiscountCodeWidget(textBlockConfig2(), new TextBlockViewMapper(), textBlockNoUiViewMapper());
        }

        private Widget provideEditCredentialsWidget() {
            return NewCredentialsModule_Companion_ProvideEditCredentialsWidgetFactory.provideEditCredentialsWidget(newCredentialsConfig(), newCredentialsViewMapper());
        }

        private NamedActionInitializerProvider provideEnvironmentInitializer() {
            return ActionInitializeModule_ProvideEnvironmentInitializerFactory.provideEnvironmentInitializer(this.actionInitializeModule, this.environmentInitializerProvider);
        }

        private Set<Widget> provideExportOldWidgets() {
            return PdpOldWidgetsExportModule_Companion_ProvideExportOldWidgetsFactory.provideExportOldWidgets(comparisonConfig(), comparisonCarouselViewMapper(), new ComparisonJustDifferencesViewMapper(), comparisonCharacteristicsPickViewMapper(), new ComparisonKeyCharacteristicsViewMapper(), new ComparisonCharacteristicsGroupViewMapper(), crosslinkConfig(), crosslinkViewMapper(), galleryV2ViewMapper(), galleryV2Config(), namedValueListConfig(), new NamedValueListHeaderViewMapper(), new NamedValueListCellViewMapper(), textBlockConfig(), new ru.ozon.app.android.pdpoldwidgets.widgets.textBlock.core.TextBlockViewMapper(), videoConsultationBannerConfig(), new VideoConsultationBannerViewMapper(), trustFactorConfig(), trustFactorViewMapper());
        }

        private Set<Widget> provideExportWidgets() {
            return AutoPickerExportModule_ProvideExportWidgetsFactory.provideExportWidgets(this.autoPickerExportModule, productPickerDetailsConfig(), selectorViewMapper(), sectionsViewMapper(), stickyBlockViewMapper(), resetButtonViewMapper());
        }

        private Set<Widget> provideExportWidgets2() {
            return ProductSelectorMobileModule_ProvideExportWidgetsFactory.provideExportWidgets(productSelectorMobileConfig(), productSelectorMobileViewMapper());
        }

        private Widget provideFormPageLandingLimitWidget() {
            return LandingModule_Companion_ProvideFormPageLandingLimitWidgetFactory.provideFormPageLandingLimitWidget(formPageLandingLimitConfig(), formPageLandingLimitUiViewMapper(), formPageLandingLimitNoUiViewMapper());
        }

        private Widget provideFormPageWidget() {
            return FormPageModule_Companion_ProvideFormPageWidgetFactory.provideFormPageWidget(formPageConfig(), formPageViewMapper());
        }

        private NamedActionInitializerProvider provideFreshLiveActivityInitializer() {
            return ActionInitializeModule_ProvideFreshLiveActivityInitializerFactory.provideFreshLiveActivityInitializer(this.actionInitializeModule, this.freshLiveActivityInitializerProvider);
        }

        private NamedActionInitializerProvider provideHapticsInitializer() {
            return ActionInitializeModule_ProvideHapticsInitializerFactory.provideHapticsInitializer(this.actionInitializeModule, this.hapticsInitializerProvider);
        }

        private Widget provideHeader$header_prodGoogleAllVendorsRelease() {
            return HeaderModule_ProvideHeader$header_prodGoogleAllVendorsReleaseFactory.provideHeader$header_prodGoogleAllVendorsRelease(headerViewMapper(), headerConfig());
        }

        private NamedActionInitializerProvider provideHttpLoggingActionIntializer() {
            return ActionInitializeModule_ProvideHttpLoggingActionIntializerFactory.provideHttpLoggingActionIntializer(this.actionInitializeModule, this.httpLoggingActionIntializerProvider);
        }

        private Widget provideIconButtonWidget() {
            return NavBarIconButtonWidgetModule_ProvideIconButtonWidgetFactory.provideIconButtonWidget(navBarIconButtonNavbarConfig(), navbarIconButtonViewMapper());
        }

        private NamedActionInitializerProvider provideJetpackComposeInitializer() {
            return ActionInitializeModule_ProvideJetpackComposeInitializerFactory.provideJetpackComposeInitializer(this.actionInitializeModule, this.jetpackComposeInitializerProvider);
        }

        private NamedActionInitializerProvider provideJodaActionInitializer() {
            return ActionInitializeModule_ProvideJodaActionInitializerFactory.provideJodaActionInitializer(this.actionInitializeModule, this.jodaActionInitializerProvider);
        }

        private NamedActionInitializerProvider provideLastLocationInitializer() {
            return ActionInitializeModule_ProvideLastLocationInitializerFactory.provideLastLocationInitializer(this.actionInitializeModule, this.lastLocationInitializerProvider);
        }

        private NamedActionInitializerProvider provideLeakCanaryInitializer() {
            return ActionInitializeModule_ProvideLeakCanaryInitializerFactory.provideLeakCanaryInitializer(this.actionInitializeModule, this.leakCanaryInitializerProvider);
        }

        private NamedActionInitializerProvider provideLimbActionInitializer() {
            return ActionInitializeModule_ProvideLimbActionInitializerFactory.provideLimbActionInitializer(this.actionInitializeModule, this.limbActionInitializerProvider);
        }

        private NamedActionInitializerProvider provideLoggerInitializer() {
            return ActionInitializeModule_ProvideLoggerInitializerFactory.provideLoggerInitializer(this.actionInitializeModule, this.loggerInitializerProvider);
        }

        private Widget provideLogosListWidget() {
            return LogosListModule_ProvideLogosListWidgetFactory.provideLogosListWidget(logosListConfig(), logosListViewMapper());
        }

        private Widget provideLogoutOnAllDevicesWidget() {
            return LogoutOnAllDevicesWidgetModule_ProvideLogoutOnAllDevicesWidgetFactory.provideLogoutOnAllDevicesWidget(this.logoutOnAllDevicesWidgetModule, logoutOnAllDevicesConfig(), logoutOnAllDevicesViewMapper());
        }

        private NamedActionInitializerProvider provideMapsActionInitializer() {
            return ActionInitializeModule_ProvideMapsActionInitializerFactory.provideMapsActionInitializer(this.actionInitializeModule, this.mapsActionInitializerProvider);
        }

        private Widget provideMasterWidget() {
            return TrackingWidgetModule_Companion_ProvideMasterWidgetFactory.provideMasterWidget(trackingConfig(), new TrackingViewMapper());
        }

        private NamedActionInitializerProvider provideMessengerFeatureActionInitializer() {
            return ActionInitializeModule_ProvideMessengerFeatureActionInitializerFactory.provideMessengerFeatureActionInitializer(this.actionInitializeModule, this.messengerFeatureActionInitializerProvider);
        }

        private ComposerInterceptorFactory provideMiniAppComposerInterceptor() {
            ComposerInterceptorFactoryModule composerInterceptorFactoryModule = this.composerInterceptorFactoryModule;
            HZ.d deeplinkMiniAppMapper = this.navigationComponentApi.getDeeplinkMiniAppMapper();
            j.c(deeplinkMiniAppMapper);
            e miniAppConfigHolder = this.navigationComponentApi.getMiniAppConfigHolder();
            j.c(miniAppConfigHolder);
            return ComposerInterceptorFactoryModule_ProvideMiniAppComposerInterceptorFactory.provideMiniAppComposerInterceptor(composerInterceptorFactoryModule, deeplinkMiniAppMapper, miniAppConfigHolder);
        }

        private NamedActionInitializerProvider provideNativePaymentInitializer() {
            return ActionInitializeModule_ProvideNativePaymentInitializerFactory.provideNativePaymentInitializer(this.actionInitializeModule, this.nativePaymentInitializerProvider);
        }

        private Widget provideNavigationBlocksV2Widget() {
            return NavigationBlocksV2Module_ProvideNavigationBlocksV2WidgetFactory.provideNavigationBlocksV2Widget(navigationBlocksV2Config(), new NavigationBlocksV2ViewMapper());
        }

        private Widget provideOtpWidget() {
            return NewCredentialsModule_Companion_ProvideOtpWidgetFactory.provideOtpWidget(oTPWidgetConfig(), oTPWidgetViewMapper());
        }

        private NamedActionInitializerProvider provideOzonDebugMenuSdkInitializer() {
            return ActionInitializeModule_ProvideOzonDebugMenuSdkInitializerFactory.provideOzonDebugMenuSdkInitializer(this.actionInitializeModule, this.ozonDebugMenuSdkInitializerProvider);
        }

        private NamedActionInitializerProvider provideOzonGalleryInitializer() {
            return ActionInitializeModule_ProvideOzonGalleryInitializerFactory.provideOzonGalleryInitializer(this.actionInitializeModule, this.ozonGalleryInitializerProvider);
        }

        private NamedActionInitializerProvider provideOzonIdAccountInitializer() {
            return ActionInitializeModule_ProvideOzonIdAccountInitializerFactory.provideOzonIdAccountInitializer(this.actionInitializeModule, this.ozonIdAccountInitializerProvider);
        }

        private NamedActionInitializerProvider provideOzonInAppUpdateInitializer() {
            return ActionInitializeModule_ProvideOzonInAppUpdateInitializerFactory.provideOzonInAppUpdateInitializer(this.actionInitializeModule, this.ozonInAppUpdateInitializerProvider);
        }

        private NamedActionInitializerProvider providePikazonActionInitializer() {
            return ActionInitializeModule_ProvidePikazonActionInitializerFactory.providePikazonActionInitializer(this.actionInitializeModule, this.pikazonActionInitializerProvider);
        }

        private NamedActionInitializerProvider providePrefetchManagerActionInitializer() {
            return ActionInitializeModule_ProvidePrefetchManagerActionInitializerFactory.providePrefetchManagerActionInitializer(this.actionInitializeModule, this.prefetchManagerActionInitializerProvider);
        }

        private Widget providePromoBannerV2Widget() {
            return PromoBannerV2WidgetModule_Companion_ProvidePromoBannerV2WidgetFactory.providePromoBannerV2Widget(promoBannerV2Config(), promoBannerV2ViewMapper());
        }

        private NamedActionInitializerProvider providePushInitializer() {
            return ActionInitializeModule_ProvidePushInitializerFactory.providePushInitializer(this.actionInitializeModule, this.pushInitializerProvider);
        }

        private Widget provideRoundedCellsModuleWidget() {
            return RoundedCellsModule_ProvideRoundedCellsModuleWidgetFactory.provideRoundedCellsModuleWidget(roundedCellsConfig(), roundedCellsViewMapper());
        }

        private NamedActionInitializerProvider provideRxErrorPluginInitializer() {
            return ActionInitializeModule_ProvideRxErrorPluginInitializerFactory.provideRxErrorPluginInitializer(this.actionInitializeModule, this.rxErrorPluginInitializerProvider);
        }

        private NamedActionInitializerProvider provideSberPayInitializer() {
            return ActionInitializeModule_ProvideSberPayInitializerFactory.provideSberPayInitializer(this.actionInitializeModule, this.sberPayInitializerProvider);
        }

        private NamedActionInitializerProvider provideScreenRouterActionInitializer() {
            return ActionInitializeModule_ProvideScreenRouterActionInitializerFactory.provideScreenRouterActionInitializer(this.actionInitializeModule, this.screenRouterActionInitializerProvider);
        }

        private Widget provideSearchResultsSortV2Widget() {
            return SearchResultsSortV2Module_ProvideSearchResultsSortV2WidgetFactory.provideSearchResultsSortV2Widget(searchResultsSortV2Config(), searchResultsSortV2ViewMapper());
        }

        private NamedActionInitializerProvider provideSentrySessionIdInitializer() {
            return ActionInitializeModule_ProvideSentrySessionIdInitializerFactory.provideSentrySessionIdInitializer(this.actionInitializeModule, this.sentrySessionIdInitializerProvider);
        }

        private NamedActionInitializerProvider provideSetLocaleActionInitializer() {
            return ActionInitializeModule_ProvideSetLocaleActionInitializerFactory.provideSetLocaleActionInitializer(this.actionInitializeModule, this.setLocaleActionInitializerProvider);
        }

        private NamedActionInitializerProvider provideShortcutsInitializer() {
            return ActionInitializeModule_ProvideShortcutsInitializerFactory.provideShortcutsInitializer(this.actionInitializeModule, this.dynamicShortcutsInitializerProvider);
        }

        private Widget provideSmsSignWidget() {
            return SmsSignModule_Companion_ProvideSmsSignWidgetFactory.provideSmsSignWidget(smsSignConfig(), smsSignViewMapper(), smsSignNoUiViewMapper());
        }

        private NamedActionInitializerProvider provideStartupTimeTrackerInitializer() {
            return ActionInitializeModule_ProvideStartupTimeTrackerInitializerFactory.provideStartupTimeTrackerInitializer(this.actionInitializeModule, this.startupTimeTrackerInitializerProvider);
        }

        private Widget provideStickyBehaviorBarrierWidget() {
            return StickyBehaviorBarrierModule_ProvideStickyBehaviorBarrierWidgetFactory.provideStickyBehaviorBarrierWidget(new StickyBehaviorBarrierConfig(), new StickyBehaviorBarrierViewMapper());
        }

        private Set<Widget> provideStorefrontWidgets() {
            return StoriesWidgetsModule_ProvideStorefrontWidgetsFactory.provideStorefrontWidgets(playStoriesConfig(), setContainerStoriesV3UpdateViewMapper(), new PlayStoriesViewMapper(), setOfPreviewsConfig(), new SetOfPreviewsViewMapper(), setContainerConfig(), new SetContainerViewMapper());
        }

        private NamedActionInitializerProvider provideStringsProviderInitializer() {
            return ActionInitializeModule_ProvideStringsProviderInitializerFactory.provideStringsProviderInitializer(this.actionInitializeModule, this.stringsProviderInitializerProvider);
        }

        private NamedActionInitializerProvider provideTabConfigInitializer() {
            return ActionInitializeModule_ProvideTabConfigInitializerFactory.provideTabConfigInitializer(this.actionInitializeModule, this.tabConfigInitializerProvider);
        }

        private Widget provideTabsV2Widget() {
            return TabsV2Module_ProvideTabsV2WidgetFactory.provideTabsV2Widget(tabsV2Config(), tabsV2ViewMapper(), tabsV2StickyViewMapper());
        }

        private NamedActionInitializerProvider provideTrackerActionInitializer() {
            return ActionInitializeModule_ProvideTrackerActionInitializerFactory.provideTrackerActionInitializer(this.actionInitializeModule, this.trackerActionInitializerProvider);
        }

        private NamedActionInitializerProvider provideTrackerDebugMenuInitializer() {
            return ActionInitializeModule_ProvideTrackerDebugMenuInitializerFactory.provideTrackerDebugMenuInitializer(this.actionInitializeModule, this.trackerDebugMenuInitializerProvider);
        }

        private Widget provideTwoCardsWidget() {
            return TwoCardsModule_ProvideTwoCardsWidgetFactory.provideTwoCardsWidget(twoCardsConfig(), new TwoCardsViewMapper());
        }

        private NamedActionInitializerProvider provideUpdateCartInitializer() {
            return ActionInitializeModule_ProvideUpdateCartInitializerFactory.provideUpdateCartInitializer(this.actionInitializeModule, this.updateCartInitializerProvider);
        }

        private NamedActionInitializerProvider provideUserStateActionInitializer() {
            return ActionInitializeModule_ProvideUserStateActionInitializerFactory.provideUserStateActionInitializer(this.actionInitializeModule, this.userStateActionInitializerProvider);
        }

        private NamedActionInitializerProvider provideWebViewInitializer() {
            return ActionInitializeModule_ProvideWebViewInitializerFactory.provideWebViewInitializer(this.actionInitializeModule, this.webViewInitializerProvider);
        }

        private NamedActionInitializerProvider provideWhitelistingInitializer() {
            return ActionInitializeModule_ProvideWhitelistingInitializerFactory.provideWhitelistingInitializer(this.actionInitializeModule, this.whitelistingInitializerProvider);
        }

        private Set<Widget> provideWidget() {
            return MarketingWidgetsModule_Companion_ProvideWidgetFactory.provideWidget(couponListConfig(), couponListViewMapper(), couponPromoViewMapper(), couponPromoNoUiViewMapper(), couponPromoConfig(), sellerCategoryListConfig(), sellerCategoryListViewMapper(), sellerNavigationConfig(), new SellerNavigationViewMapper(), sellerCarouselConfig(), sellerCarouselViewMapper());
        }

        private Widget provideWidget10() {
            return SelectLinkWidgetModule_ProvideWidgetFactory.provideWidget(this.selectLinkWidgetModule, selectLinkConfig(), new SelectLinkViewMapper());
        }

        private Widget provideWidget11() {
            return UserAdultConfirmationModule_Companion_ProvideWidgetFactory.provideWidget(userAdultModalNoUiViewMapper(), userAdultModalConfig());
        }

        private Widget provideWidget12() {
            return UserSocialsMobileModule_Companion_ProvideWidgetFactory.provideWidget(userSocialsMobileConfig(), userSocialsMobileHeaderViewMapper(), userSocialsMobileItemViewMapper());
        }

        private Widget provideWidget13() {
            return InstantLoginModule_ProvideWidgetFactory.provideWidget(instantLoginSettingsConfig(), instantLoginSettingsViewMapper());
        }

        private Set<Widget> provideWidget14() {
            return SecurityWidgetV1Module_Companion_ProvideWidgetFactory.provideWidget(userAuthBiometrySettingsConfig(), userAuthBiometrySettingsViewMapper());
        }

        private Set<Widget> provideWidget15() {
            return AuthWidgetModule_Companion_ProvideWidgetFactory.provideWidget(authConfig(), authViewMapper());
        }

        private Widget provideWidget16() {
            return EditUserFullNameModule_ProvideWidgetFactory.provideWidget(editUserFullNameConfig(), editUserFullNameViewMapper());
        }

        private Widget provideWidget17() {
            return LogoutModule_ProvideWidgetFactory.provideWidget(logoutConfig(), logoutViewMapper());
        }

        private Set<Widget> provideWidget18() {
            return StorefrontCommonV1Module_ProvideWidgetFactory.provideWidget(shareLinkConfig(), shareLinkViewMapper(), refreshConfig(), new RefreshViewMapper(), valuesTotalConfig(), new ThemeSelectorConfig(), themeSelectorViewMapper(), new ValuesTotalViewMapper(), resultsHeaderConfig(), resultsHeaderViewMapper());
        }

        private Set<Widget> provideWidget2() {
            return ComposerExportedModule_Companion_ProvideWidgetFactory.provideWidget(metaWidgetConfig(), metaWidgetViewMapper());
        }

        private Widget provideWidget3() {
            return SectionHeaderModule_Companion_ProvideWidgetFactory.provideWidget(sectionHeaderConfig(), new SectionHeaderViewMapper());
        }

        private Widget provideWidget4() {
            return ActivationTitleModule_Companion_ProvideWidgetFactory.provideWidget(activationTitleConfig(), activationTitleViewMapper());
        }

        private Set<Widget> provideWidget5() {
            return CertificatesModule_Companion_ProvideWidgetFactory.provideWidget(certificatesConfig(), new CertificatesViewMapper(), tabSelectorConfig(), tabSelectorViewMapper());
        }

        private Set<Widget> provideWidget6() {
            return ScanItModule_Companion_ProvideWidgetFactory.provideWidget(scanItIntroConfig(), scanItIntroViewMapper());
        }

        private Widget provideWidget7() {
            return LoginModule_Companion_ProvideWidgetFactory.provideWidget(loginConfig(), loginViewMapper());
        }

        private Set<Widget> provideWidget8() {
            return CmsWidgetsV1DiModule_ProvideWidgetFactory.provideWidget(navTitleConfig(), navTitleViewMapper());
        }

        private Set<Widget> provideWidget9() {
            return CommonWidgetsV1DiModule_ProvideWidgetFactory.provideWidget(pageHeaderConfig(), pageHeaderViewMapper(), cellConfig(), cellViewMapper(), tabsConfig(), tabsViewMapper(), cellListConfig(), new CellListHeaderViewMapper(), cellListViewMapper(), new PixelViewMapper(), pixelConfig(), disclaimerViewMapper(), disclaimerConfig(), emptyStateConfig(), commonEmptyStateViewMapper(), restrictionsConfig(), restrictionsNoUIViewMapper());
        }

        private Set<Widget> provideWidgets() {
            return ProductSelectorModule_ProvideWidgetsFactory.provideWidgets(productSelectorMobileDataConfig(), productSelectorDataAllStepNoUiViewMapper(), productSelectorDataConcreteStepNoUiViewMapper());
        }

        private Set<Widget> provideWidgets2() {
            return FavoritesWidgetModule_Companion_ProvideWidgetsFactory.provideWidgets(favoriteProductConfig(), favoriteProductWidgetViewMapper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RateAppRouter rateAppRouter() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new RateAppRouter(ozonRouter, this.getFeatureCheckerProvider.get());
        }

        private RefreshByCurrencyConfiguratorFactory refreshByCurrencyConfiguratorFactory() {
            return new RefreshByCurrencyConfiguratorFactory(this.refreshByCurrencyConfiguratorProvider);
        }

        private RefreshByGenderConfiguratorFactory refreshByGenderConfiguratorFactory() {
            RefreshByGenderCookieEvents refreshByGenderCookieEvents = this.storageComponentApi.getRefreshByGenderCookieEvents();
            j.c(refreshByGenderCookieEvents);
            return new RefreshByGenderConfiguratorFactory(refreshByGenderCookieEvents);
        }

        private RefreshByLocaleConfiguratorFactory refreshByLocaleConfiguratorFactory() {
            return new RefreshByLocaleConfiguratorFactory(this.refreshByLocaleConfiguratorProvider);
        }

        private RefreshByLocationConfiguratorFactory refreshByLocationConfiguratorFactory() {
            return new RefreshByLocationConfiguratorFactory(this.refreshByLocationConfiguratorProvider);
        }

        private RefreshByStatusEdoConfiguratorFactory refreshByStatusEdoConfiguratorFactory() {
            return new RefreshByStatusEdoConfiguratorFactory(this.refreshByStatusEdoConfiguratorProvider);
        }

        private RefreshByUserConfiguratorFactory refreshByUserConfiguratorFactory() {
            return new RefreshByUserConfiguratorFactory(this.getOzonIdCookieEventsProvider.get(), this.getContextProvider.get());
        }

        private RefreshConfig refreshConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new RefreshConfig(jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RemoveSuggestionApi removeSuggestionApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return CommonActionHandlersDiModule_Companion_ProvideSearchHistoryApiFactory.provideSearchHistoryApi(retrofit);
        }

        private RequestNotificationPermissionProcessor requestNotificationPermissionProcessor() {
            Ib.a a11 = Jb.d.a(this.bxNotificationPermissionProcessorProvider);
            Ib.a a12 = Jb.d.a(this.selectNotificationPermissionProcessorProvider);
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            return new RequestNotificationPermissionProcessor(a11, a12, appType);
        }

        private ResetButtonViewMapper resetButtonViewMapper() {
            return new ResetButtonViewMapper(this.handlersInhibitorProvider.get());
        }

        private RestartAppNavigationHandler restartAppNavigationHandler() {
            return new RestartAppNavigationHandler(new HomeDestinationFactoryImpl());
        }

        private RestrictionsConfig restrictionsConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new RestrictionsConfig(jsonDeserializer);
        }

        private RestrictionsNoUIViewMapper restrictionsNoUIViewMapper() {
            RestrictionsMapper restrictionsMapper = new RestrictionsMapper();
            RestrictionsAppStore restrictionsAppStore = this.restrictionsComponentApi.getRestrictionsAppStore();
            j.c(restrictionsAppStore);
            return new RestrictionsNoUIViewMapper(restrictionsMapper, restrictionsAppStore, new RestrictionsScreenStore());
        }

        private ResultsHeaderApi resultsHeaderApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return ResultsHeaderModule_Companion_ProvideResultsHeaderApiFactory.provideResultsHeaderApi(retrofit);
        }

        private ResultsHeaderConfig resultsHeaderConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ResultsHeaderConfig(jsonDeserializer);
        }

        private ResultsHeaderRepositoryImpl resultsHeaderRepositoryImpl() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ResultsHeaderRepositoryImpl(jsonDeserializer, resultsHeaderApi());
        }

        private ResultsHeaderViewMapper resultsHeaderViewMapper() {
            ResultsHeaderMapper resultsHeaderMapper = new ResultsHeaderMapper();
            ActionSheetEventHandler actionSheetEventHandler = this.actionComponentApi.getActionSheetEventHandler();
            j.c(actionSheetEventHandler);
            ResultsHeaderRepositoryImpl resultsHeaderRepositoryImpl = resultsHeaderRepositoryImpl();
            a<ShoppingListsViewModel> aVar = this.shoppingListsViewModelProvider;
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            return new ResultsHeaderViewMapper(resultsHeaderMapper, actionSheetEventHandler, resultsHeaderRepositoryImpl, aVar, adultHandler);
        }

        private ReturnDetailsDeeplinkHandler returnDetailsDeeplinkHandler() {
            return new ReturnDetailsDeeplinkHandler(this.authDestinationInterceptorImplProvider.get());
        }

        private ReturnListDeeplinkHandler returnListDeeplinkHandler() {
            return new ReturnListDeeplinkHandler(this.authDestinationInterceptorImplProvider.get());
        }

        private RoundedCellsConfig roundedCellsConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new RoundedCellsConfig(jsonDeserializer);
        }

        private RoundedCellsViewMapper roundedCellsViewMapper() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return new RoundedCellsViewMapper(customActionHandlersStoreFactory);
        }

        private SaveLocaleActionHandler saveLocaleActionHandler() {
            AppLocaleRepository appLocaleRepository = this.appLocaleComponentApi.getAppLocaleRepository();
            j.c(appLocaleRepository);
            return new SaveLocaleActionHandler(appLocaleRepository);
        }

        private ScanItIntroConfig scanItIntroConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ScanItIntroConfig(jsonDeserializer);
        }

        private ScanItIntroViewMapper scanItIntroViewMapper() {
            return new ScanItIntroViewMapper(new ScanItIntroMapper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ScreenBrightnessChanger screenBrightnessChanger() {
            return ScreenBrightnessChangerModule_ProvideBarcodeScreenBrightnessChangerFactory.provideBarcodeScreenBrightnessChanger(this.screenBrightnessChangerModule, this.getFeatureCheckerProvider.get(), new MaxBrightnessChanger(), new FloorBrightnessChanger());
        }

        private SearchByImageConfiguratorFactory searchByImageConfiguratorFactory() {
            return new SearchByImageConfiguratorFactory(this.searchByImageConfiguratorProvider);
        }

        private SearchPageLoadConfiguratorFactory searchPageLoadConfiguratorFactory() {
            return new SearchPageLoadConfiguratorFactory(this.searchPageLoadConfiguratorProvider);
        }

        private SearchResultsSortV2Config searchResultsSortV2Config() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new SearchResultsSortV2Config(jsonDeserializer);
        }

        private SearchResultsSortV2Mapper searchResultsSortV2Mapper() {
            return new SearchResultsSortV2Mapper(sortMarginMeasurer());
        }

        private SearchResultsSortV2ViewMapper searchResultsSortV2ViewMapper() {
            SearchResultsSortV2Mapper searchResultsSortV2Mapper = searchResultsSortV2Mapper();
            SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory setCookieAndRefreshAssistedFactory = this.setCookieAndRefreshAssistedFactoryProvider.get();
            HZ.a deeplinkHandlersCache = this.navigationComponentApi.getDeeplinkHandlersCache();
            j.c(deeplinkHandlersCache);
            k routeFactory = this.navigationComponentApi.getRouteFactory();
            j.c(routeFactory);
            return new SearchResultsSortV2ViewMapper(searchResultsSortV2Mapper, setCookieAndRefreshAssistedFactory, deeplinkHandlersCache, routeFactory, this.getFeatureCheckerProvider.get());
        }

        private SectionHeaderConfig sectionHeaderConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new SectionHeaderConfig(jsonDeserializer);
        }

        private SectionsViewMapper sectionsViewMapper() {
            HandlersInhibitor handlersInhibitor = this.handlersInhibitorProvider.get();
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new SectionsViewMapper(handlersInhibitor, ozonRouter);
        }

        private SelectAppStoreAvailabilityChecker selectAppStoreAvailabilityChecker() {
            FeatureChecker featureChecker = this.getFeatureCheckerProvider.get();
            NativePageDomainsInteractor nativePageDomainsInteractor = this.navigationComponentApi.getNativePageDomainsInteractor();
            j.c(nativePageDomainsInteractor);
            return new SelectAppStoreAvailabilityChecker(featureChecker, nativePageDomainsInteractor);
        }

        private SelectLinkConfig selectLinkConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new SelectLinkConfig(jsonDeserializer);
        }

        private SelectPaymentApi selectPaymentApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return SelectPaymentModule_Companion_ProvideSelectPaymentApiFactory.provideSelectPaymentApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SelectPaymentRepositoryImpl selectPaymentRepositoryImpl() {
            return new SelectPaymentRepositoryImpl(selectPaymentApi());
        }

        private SelectorViewMapper selectorViewMapper() {
            return new SelectorViewMapper(this.handlersInhibitorProvider.get());
        }

        private SellerAppHandler sellerAppHandler() {
            e miniAppConfigHolder = this.navigationComponentApi.getMiniAppConfigHolder();
            j.c(miniAppConfigHolder);
            return new SellerAppHandler(miniAppConfigHolder, this.getFeatureCheckerProvider.get());
        }

        private SellerCarouselConfig sellerCarouselConfig() {
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new SellerCarouselConfig(moshi);
        }

        private SellerCarouselViewMapper sellerCarouselViewMapper() {
            SellerMapper sellerMapper = sellerMapper();
            SellerFavoriteService sellerFavoriteService = this.accountComponentApi.getSellerFavoriteService();
            j.c(sellerFavoriteService);
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            FeatureChecker featureChecker = this.getFeatureCheckerProvider.get();
            FavoriteEventManager favEventManager = this.favoriteCoreComponentApi.getFavEventManager();
            j.c(favEventManager);
            return new SellerCarouselViewMapper(sellerMapper, sellerFavoriteService, adultHandler, featureChecker, favEventManager);
        }

        private SellerCategoryListConfig sellerCategoryListConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new SellerCategoryListConfig(jsonDeserializer);
        }

        private SellerCategoryListViewMapper sellerCategoryListViewMapper() {
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            return new SellerCategoryListViewMapper(adultHandler, this.getFeatureCheckerProvider.get());
        }

        private SellerMapper sellerMapper() {
            SellerFavoriteService sellerFavoriteService = this.accountComponentApi.getSellerFavoriteService();
            j.c(sellerFavoriteService);
            return new SellerMapper(sellerFavoriteService);
        }

        private SellerNavigationConfig sellerNavigationConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new SellerNavigationConfig(jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SentrySampleRateHolder sentrySampleRateHolder() {
            SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
            j.c(sharedPreferences);
            return new SentrySampleRateHolder(sharedPreferences);
        }

        private SessionListConfiguratorFactory sessionListConfiguratorFactory() {
            return new SessionListConfiguratorFactory(this.sessionListConfiguratorProvider);
        }

        private SetBugReportActionHandler setBugReportActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new SetBugReportActionHandler(actionRepository);
        }

        private SetContainerConfig setContainerConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new SetContainerConfig(jsonDeserializer);
        }

        private SetContainerStoriesV3UpdateViewMapper setContainerStoriesV3UpdateViewMapper() {
            return new SetContainerStoriesV3UpdateViewMapper(this.playStoriesV3ViewModelProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<Application.ActivityLifecycleCallbacks> setOfActivityLifecycleCallbacks() {
            Application.ActivityLifecycleCallbacks provideStyleParserLifecycleAdapter = ApplicationLifecycleModule_Companion_ProvideStyleParserLifecycleAdapterFactory.provideStyleParserLifecycleAdapter();
            ActivityLifeCycleHolder activityLifeCycleHolder = this.androidPlatformComponentApi.getActivityLifeCycleHolder();
            j.c(activityLifeCycleHolder);
            OrientationLifecycleHandler orientationLifecycleHandler = orientationLifecycleHandler();
            FragmentsLifecycleHandler fragmentsLifecycleHandler = this.fragmentsLifecycleHandlerProvider.get();
            InAppUpdateController inAppUpdateController = this.inAppUpdateComponentApi.getInAppUpdateController();
            j.c(inAppUpdateController);
            AppVisibility appVisibility = this.networkComponentApi.getAppVisibility();
            j.c(appVisibility);
            WarmUpCallback warmUpCallback = warmUpCallback();
            OzonIdActivityCallback ozonIdActivityCallback = this.ozonIdActivityCallbackProvider.get();
            TravelWarmUpAdaptersCallback travelWarmUpAdaptersCallback = travelWarmUpAdaptersCallback();
            FintechActivityLifecycleCallback fintechActivityLifecycleCallback = this.iDaggerComponentDependencies.getFintechActivityLifecycleCallback();
            j.c(fintechActivityLifecycleCallback);
            return A.F(provideStyleParserLifecycleAdapter, activityLifeCycleHolder, orientationLifecycleHandler, fragmentsLifecycleHandler, inAppUpdateController, appVisibility, warmUpCallback, ozonIdActivityCallback, travelWarmUpAdaptersCallback, fintechActivityLifecycleCallback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<BZ.a> setOfAppHandler() {
            return A.F(NavigationModule_Companion_ProvideFakeOzonAppHandlerFactory.provideFakeOzonAppHandler(), RegularDrawNavigationModule_Companion_BindRegularDrawAppHandler$regulardraw_prodGoogleAllVendorsReleaseFactory.bindRegularDrawAppHandler$regulardraw_prodGoogleAllVendorsRelease(), expressAppHandler(), sellerAppHandler(), expressSellerAppHandler(), mainAppHandler(), travelAppHandler(), cmlAppHandler());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<AtomNavigator> setOfAtomNavigator() {
            return A.C(new GalleryNavigator());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<AtomParserModel> setOfAtomParserModel() {
            A.a m11 = A.m(2);
            m11.l(LegacyCommonAtomParserModelsModule_Companion_ProvideLegacyCommonAtomParserModelsFactory.provideLegacyCommonAtomParserModels());
            m11.l(LegacyStorefrontAtomParserModelsModule_Companion_ProvideLegacyStorefrontAtomParserModelsFactory.provideLegacyStorefrontAtomParserModels());
            return m11.m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<AuthStateCommand> setOfAuthStateCommand() {
            return A.F(cartAuthStateCommand(), adultAuthStateCommand(), abToolAuthStateCommand(), ozonPushAuthStateCommand(), authAnalyticsStateCommand(), tabAuthStateCommand(), ozonBankStateCommand(), ozonMessengerAuthStateCommand(), travelTabAuthStateCommand());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<ComponentCallbacks> setOfComponentCallbacks() {
            return A.C(configChangesComponentCallback());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<ComposerInterceptorFactory> setOfComposerInterceptorFactory() {
            return A.D(provideMiniAppComposerInterceptor(), cacheComposerInterceptorFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<ConfiguratorFactory> setOfConfiguratorFactory() {
            return A.F(refreshByUserConfiguratorFactory(), storiesConfiguratorFactory(), refreshByLocationConfiguratorFactory(), fullScreenConfiguratorFactory(), bottomNavigationScrollConfiguratorFactory(), composerLifecycleConfiguratorFactory(), composerActionAndRedirectConfiguratorFactory(), voiceRecognitionConfiguratorFactory(), refreshByCurrencyConfiguratorFactory(), refreshByLocaleConfiguratorFactory(), notificationConfiguratorFactory(), composerAddressSelectorConfiguratorFactory(), refreshByGenderConfiguratorFactory(), vKIDRefreshStateConfiguratorFactory(), searchByImageConfiguratorFactory(), cartActionsProcessorConfiguratorFactory(), sessionListConfiguratorFactory(), searchPageLoadConfiguratorFactory(), dialogSearchPageLoadConfiguratorFactory(), loaderConfiguratorFactory(), refreshByStatusEdoConfiguratorFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<IZ.a> setOfDeeplinkHandler() {
            A.a m11 = A.m(58);
            m11.l(this.provideDeeplinkHandlersSetProvider.get());
            m11.l(AdsNavigationDiModule_ProvideDeeplinkHandlerFactory.provideDeeplinkHandler());
            m11.l(this.provideDeeplinkHandlersSetProvider2.get());
            m11.l(this.provideDeeplinkHandlersSet$cs_orders_prodGoogleAllVendorsReleaseProvider.get());
            m11.l(this.provideDeeplinkHandlersSetProvider3.get());
            m11.l(this.provideDeeplinkHandlersSetProvider4.get());
            m11.l(this.provideDeeplinkHandlersSetProvider5.get());
            m11.l(this.provideDeeplinkHandlersSetProvider6.get());
            m11.l(this.provideDeeplinkHandlersSetProvider7.get());
            m11.l(this.provideDeeplinkHandlersSetProvider8.get());
            m11.l(this.provideDeeplinkHandlersSetProvider9.get());
            m11.l(this.provideDeeplinkHandlersSetProvider10.get());
            m11.l(this.provideDeeplinkHandlersSetProvider11.get());
            m11.l(this.provideDeeplinkHandlersSetProvider12.get());
            m11.l(this.provideDeeplinkHandlersSetProvider13.get());
            m11.l(this.provideDeeplinkHandlersSet$checkout_prodGoogleAllVendorsReleaseProvider.get());
            m11.l(this.provideDeeplinkHandlersSetProvider14.get());
            m11.l(this.provideDeeplinkHandlersSetProvider15.get());
            m11.l(this.provideDeeplinkHandlersSet$faq_prodGoogleAllVendorsReleaseProvider.get());
            m11.l(this.provideDeeplinkHandlersSetProvider16.get());
            m11.l(this.provideDeeplinkHandlersSetProvider17.get());
            m11.l(this.provideDeeplinkHandlersSetProvider18.get());
            m11.l(this.provideDeeplinkHandlersSetProvider19.get());
            m11.l(this.provideDeeplinkHandlersSetProvider20.get());
            m11.l(this.provideDeeplinkHandlersSetProvider21.get());
            m11.l(this.provideDeeplinkHandlersSetProvider22.get());
            m11.l(this.provideDeeplinkHandlersSetProvider23.get());
            m11.l(this.provideDeeplinkHandlersSetProvider24.get());
            m11.l(this.provideDeeplinkHandlerSet$hotels_prodGoogleAllVendorsReleaseProvider.get());
            m11.l(this.provideDeeplinkHandlerSetProvider.get());
            m11.l(this.provideDeeplinkHandlersSetProvider25.get());
            m11.l(this.provideDeeplinkHandlersProvider.get());
            m11.l(this.provideDeeplinkHandlersSet$debugmenu_prodGoogleAllVendorsReleaseProvider.get());
            m11.l(ReturnEditNavigationModule_ProvideDeeplinkHandlersFactory.provideDeeplinkHandlers(this.returnEditNavigationModule));
            m11.j(HowToReturnGoodsNavigationModule_ProvideDeeplinkHandlersFactory.provideDeeplinkHandlers(this.howToReturnGoodsNavigationModule));
            m11.l(provideDeeplinkHandlers());
            m11.j(this.provideDeeplinkHandlersSetProvider26.get());
            m11.l(provideDeeplinkHandler());
            m11.l(provideDeeplinkHandlers$storefront_prodGoogleAllVendorsRelease());
            m11.l(ShowroomNavigationModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet());
            m11.l(this.provideDeeplinkHandlersSet$miniapp_prodGoogleAllVendorsReleaseProvider.get());
            m11.l(this.provideDeeplinkHandlersSet$geo_prodGoogleAllVendorsReleaseProvider.get());
            m11.l(provideDeeplinkHandler2());
            m11.l(this.provideDeeplinkHandlersSetProvider27.get());
            m11.l(FreshGeoDeeplinkHandlersModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet());
            m11.l(FreshUnsortedDeeplinkHandlersModule_ProvideDeeplinkHandlersSetFactory.provideDeeplinkHandlersSet());
            m11.l(this.provideDeeplinkHandlersSetProvider28.get());
            m11.l(this.provideDeeplinkHandlersSetProvider29.get());
            m11.l(CmlDeliveryNavigationModule_ProvideDeeplinkHandlerFactory.provideDeeplinkHandler(this.cmlDeliveryNavigationModule));
            m11.l(this.provideDeeplinkHandlersSet$regulardraw_prodGoogleAllVendorsReleaseProvider.get());
            m11.l(this.provideDeeplinkHandlersSet$payment_prodGoogleAllVendorsReleaseProvider.get());
            m11.l(this.provideDeeplinkHandlersSetProvider30.get());
            m11.l(this.provideDeeplinkHandlersSetProvider31.get());
            m11.j(returnListDeeplinkHandler());
            m11.j(returnDetailsDeeplinkHandler());
            m11.j(new ReturnActionModalDeeplinkHandler());
            m11.j(this.bindOnBoardingDisplayDisableDeeplinkHandlerProvider.get());
            m11.j(new CancelExplanationDeeplinkHandler());
            return m11.m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<LauncherStateDialogProcessor> setOfLauncherStateDialogProcessor() {
            return A.D(updateInAppLaunchStateDialogProcessor(), requestNotificationPermissionProcessor());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<EZ.a<?>> setOfNavigationHandlerOf() {
            return A.F(new ExternalBrowserNavigationHandler(), externalAppNavigationHandler(), testNamespaceNavigationHandler(), restartAppNavigationHandler(), new CloseBottomSheetNavigationHandler(), new ComposerNestedPageNavigationHandler(), new ComposerDeeplinkBottomSheetDestination.NavHandler(), new NavigateToCartAndRefreshNavigationHandler(), new NavigateToRootCartNavigationHandler(), onBoardingDisplayDisableNavigationHandler(), new CopyTextNavigationHandler());
        }

        private SetOfPreviewsConfig setOfPreviewsConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new SetOfPreviewsConfig(jsonDeserializer);
        }

        private Set<Vg.f> setOfWidgetCustomActionHandler() {
            return A.F(travelResultActionV2Handler(), addPassToWalletActionHandler(), performActionsListActionHandler(), travelGetDirectionsActionHandler(), switchNotificationActionHandler(), travelAppIconChangeActionHandler(), new ExampleActionHandler(), new ExampleActionHandler2(), new RefreshTopComposerActionHandler(), new RedirectToSelectActionHandler(), new FamilyGetLinkActionHandler(), new FamilyActionHandler(), setTeensModeActionHandler(), setBugReportActionHandler(), closePromoStickyBubbleAction(), viewPromoStickyBubbleAction(), viewPromoPlacementBannerActionHandler(), changeCurrencyActionHandler(), saveLocaleActionHandler(), new ScrollToTopActionHandler(), cleanCncAddressActionHandler(), new CheckoutDismissAndRefreshActionHandler(), new CheckoutPopAndRefreshActionHandler(), showNotificationBarActionHandler(), createFreshOrderActionHandler(), createFreshOrderV2ActionHandler(), inputFormActionHandler(), freshRemoveCartItemsOnModalActionHandler(), freshAddToCartActionHandler(), new FreshDeliverySubscribeActionHandler(), new CopyToClipboardActionHandler(), hideStickyCellActionHandler(), new DismissAndOpenGalleryActionHandler(), changePaymentMethodAndPayActionHandler(), linkFastPayActionHandler(), checkFastPayActionHandler(), confirmBloggerChannelActionHandler(), shareLinkBloggerFromTileActionHandler(), shareLinkBloggerActionHandler(), submitBloggerPersonalDataActionHandler(), swipeRemoveCartSplitActionHandler(), postRenderActionHandler(), new NavigateToCartAndRefreshActionHandler(), composerActionWithActionHandlerV2(), validateDeclaredPriceActionHandler(), validateOrderDeclaredPriceActionHandler(), expandCellListActionHandler(), collapseCellListActionHandler(), createFreshAIConversationActionHandler(), checkFreshAIConversationStatusActionHandler(), enablePushNotificationsActionHandler());
        }

        private SetTeensModeActionHandler setTeensModeActionHandler() {
            OzonPushManager ozonPushManager = this.getOzonPushManagerProvider.get();
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new SetTeensModeActionHandler(ozonPushManager, actionRepository);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ShareBarcodeAnalytics shareBarcodeAnalytics() {
            AnalyticsDataLayer analyticsDataLayer = this.analyticsComponentApi.getAnalyticsDataLayer();
            j.c(analyticsDataLayer);
            PluginsManager pluginsManager = this.analyticsComponentApi.getPluginsManager();
            j.c(pluginsManager);
            Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
            j.c(analyticsScreenStorage);
            return new ShareBarcodeAnalytics(analyticsDataLayer, pluginsManager, analyticsScreenStorage);
        }

        private ShareLinkBloggerActionHandler shareLinkBloggerActionHandler() {
            return new ShareLinkBloggerActionHandler(this.shareLinkBloggerViewModelProvider);
        }

        private ShareLinkBloggerFromTileActionHandler shareLinkBloggerFromTileActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new ShareLinkBloggerFromTileActionHandler(actionRepository);
        }

        private ShareLinkConfig shareLinkConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ShareLinkConfig(jsonDeserializer);
        }

        private ShareLinkViewMapper shareLinkViewMapper() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return new ShareLinkViewMapper(customActionHandlersStoreFactory, this.handlersInhibitorProvider.get());
        }

        private ShowNotificationBarActionHandler showNotificationBarActionHandler() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ShowNotificationBarActionHandler(jsonDeserializer);
        }

        private SmsSignConfig smsSignConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new SmsSignConfig(jsonDeserializer);
        }

        private SmsSignNoUiViewMapper smsSignNoUiViewMapper() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new SmsSignNoUiViewMapper(ozonRouter, this.smsSignViewModelImplProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SmsSignRepository smsSignRepository() {
            return new SmsSignRepository(this.provideFormPageApiDataSourceProvider.get());
        }

        private SmsSignViewMapper smsSignViewMapper() {
            return new SmsSignViewMapper(this.smsSignViewModelImplProvider);
        }

        private SortMarginMeasurer sortMarginMeasurer() {
            return new SortMarginMeasurer(this.getContextProvider.get());
        }

        private StickyBlockViewMapper stickyBlockViewMapper() {
            HandlersInhibitor handlersInhibitor = this.handlersInhibitorProvider.get();
            AutopickerBottomSheetRepository autopickerBottomSheetRepository = this.autopickerBottomSheetRepositoryProvider.get();
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new StickyBlockViewMapper(handlersInhibitor, autopickerBottomSheetRepository, ozonRouter);
        }

        private StoriesConfiguratorFactory storiesConfiguratorFactory() {
            return new StoriesConfiguratorFactory(this.storiesConfiguratorProvider);
        }

        private SubmitBloggerPersonalDataActionHandler submitBloggerPersonalDataActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new SubmitBloggerPersonalDataActionHandler(actionRepository, this.handlersInhibitorProvider.get());
        }

        private SwipeRemoveCartSplitActionHandler swipeRemoveCartSplitActionHandler() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new SwipeRemoveCartSplitActionHandler(jsonDeserializer);
        }

        private SwitchNotificationActionHandler switchNotificationActionHandler() {
            EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler = this.androidPlatformComponentApi.getEnableNotificationsSuggestingHandler();
            j.c(enableNotificationsSuggestingHandler);
            return new SwitchNotificationActionHandler(enableNotificationsSuggestingHandler);
        }

        private TabAuthStateCommand tabAuthStateCommand() {
            TabConfigUpdateDelegate tabConfigRequestDelegate = this.tabsComponentApi.getTabConfigRequestDelegate();
            j.c(tabConfigRequestDelegate);
            return new TabAuthStateCommand(tabConfigRequestDelegate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TabOnBoardingRepository tabOnBoardingRepository() {
            SharedPreferences sharedPreferences = this.storageComponentApi.getSharedPreferences();
            j.c(sharedPreferences);
            return new TabOnBoardingRepository(sharedPreferences);
        }

        private TabSelectorConfig tabSelectorConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new TabSelectorConfig(jsonDeserializer);
        }

        private TabSelectorViewMapper tabSelectorViewMapper() {
            return new TabSelectorViewMapper(new TabSelectorMapper());
        }

        private TabsConfig tabsConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new TabsConfig(jsonDeserializer);
        }

        private TabsMapper tabsMapper() {
            return new TabsMapper(this.getContextProvider.get());
        }

        private TabsV2Config tabsV2Config() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new TabsV2Config(jsonDeserializer);
        }

        private TabsV2StickyViewMapper tabsV2StickyViewMapper() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            a<TabsOnBoardingViewModel> aVar = this.tabsOnBoardingViewModelProvider;
            SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory setCookieAndRefreshAssistedFactory = this.setCookieAndRefreshAssistedFactoryProvider.get();
            a<TabsV2ViewModel> aVar2 = this.tabsV2ViewModelProvider;
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            return new TabsV2StickyViewMapper(customActionHandlersStoreFactory, aVar, setCookieAndRefreshAssistedFactory, aVar2, appType);
        }

        private TabsV2ViewMapper tabsV2ViewMapper() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            a<TabsOnBoardingViewModel> aVar = this.tabsOnBoardingViewModelProvider;
            SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory setCookieAndRefreshAssistedFactory = this.setCookieAndRefreshAssistedFactoryProvider.get();
            a<TabsV2ViewModel> aVar2 = this.tabsV2ViewModelProvider;
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            return new TabsV2ViewMapper(customActionHandlersStoreFactory, aVar, setCookieAndRefreshAssistedFactory, aVar2, appType);
        }

        private TabsViewMapper tabsViewMapper() {
            return new TabsViewMapper(tabsMapper());
        }

        private TestNamespaceNavigationHandler testNamespaceNavigationHandler() {
            InterfaceC6369b ozonTracker = this.analyticsComponentApi.getOzonTracker();
            j.c(ozonTracker);
            return new TestNamespaceNavigationHandler(ozonTracker);
        }

        private TextBlockConfig textBlockConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new TextBlockConfig(jsonDeserializer);
        }

        private ru.ozon.app.android.commonwidgets.widgets.textblock.TextBlockConfig textBlockConfig2() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ru.ozon.app.android.commonwidgets.widgets.textblock.TextBlockConfig(jsonDeserializer);
        }

        private TextBlockNoUiViewMapper textBlockNoUiViewMapper() {
            return new TextBlockNoUiViewMapper(this.getContextProvider.get());
        }

        private TextParserProvider textParserProvider() {
            return new TextParserProvider(getMarkDownParser());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TextProductNameWidgetFactory textProductNameWidgetFactory() {
            PdpOfflineScreenWidgetsData pdpEmptyScreenService = this.pdpOfflineScreenComponentApi.pdpEmptyScreenService();
            j.c(pdpEmptyScreenService);
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new TextProductNameWidgetFactory(pdpEmptyScreenService, moshi);
        }

        private ThemeSelectorViewMapper themeSelectorViewMapper() {
            DarkThemeManager darkThemeManager = this.androidPlatformComponentApi.getDarkThemeManager();
            j.c(darkThemeManager);
            return new ThemeSelectorViewMapper(darkThemeManager);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TileGrid2PreCreateProvider tileGrid2PreCreateProvider() {
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            return new TileGrid2PreCreateProvider(featureService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TrackerDynamicSettingsModifier trackerDynamicSettingsModifier() {
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            w trackerDynamicSettings = this.analyticsComponentApi.getTrackerDynamicSettings();
            j.c(trackerDynamicSettings);
            return new TrackerDynamicSettingsModifier(featureService, trackerDynamicSettings);
        }

        private TrackingConfig trackingConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new TrackingConfig(jsonDeserializer);
        }

        private TravelAppHandler travelAppHandler() {
            e miniAppConfigHolder = this.navigationComponentApi.getMiniAppConfigHolder();
            j.c(miniAppConfigHolder);
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            return new TravelAppHandler(miniAppConfigHolder, featureService);
        }

        private TravelAppIconChangeActionHandler travelAppIconChangeActionHandler() {
            Context context = this.getContextProvider.get();
            TravelStorageManagerHolder travelStorageManagerHolder = this.travelStorageApi.getTravelStorageManagerHolder();
            j.c(travelStorageManagerHolder);
            return new TravelAppIconChangeActionHandler(context, travelStorageManagerHolder);
        }

        private TravelGetDirectionsActionHandler travelGetDirectionsActionHandler() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new TravelGetDirectionsActionHandler(jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TravelOfflineWidgetsProviderImpl travelOfflineWidgetsProviderImpl() {
            OfflineTravelStorage offlineStorage = this.travelStorageApi.getOfflineStorage();
            j.c(offlineStorage);
            CoroutineDispatcherProvider dispatcherProvider = this.coroutineDispatchersComponentApi.getDispatcherProvider();
            j.c(dispatcherProvider);
            return new TravelOfflineWidgetsProviderImpl(offlineStorage, dispatcherProvider);
        }

        private TravelResultActionV2Handler travelResultActionV2Handler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            SupportedResultActionHandlersImpl supportedResultActionHandlersImpl = new SupportedResultActionHandlersImpl();
            PerformanceTrackerDelegate performanceTrackerDelegate = this.analyticsComponentApi.getPerformanceTrackerDelegate();
            j.c(performanceTrackerDelegate);
            return new TravelResultActionV2Handler(actionRepository, customActionHandlersStoreFactory, supportedResultActionHandlersImpl, performanceTrackerDelegate, new TrackableActions());
        }

        private TravelTabAuthStateCommand travelTabAuthStateCommand() {
            TravelTabConfigUpdateDelegate travelTabConfigUpdateDelegate = this.tabsComponentApi.getTravelTabConfigUpdateDelegate();
            j.c(travelTabConfigUpdateDelegate);
            return new TravelTabAuthStateCommand(travelTabConfigUpdateDelegate);
        }

        private TravelWarmUpAdaptersCallback travelWarmUpAdaptersCallback() {
            Moshi moshi = this.networkComponentApi.getMoshi();
            j.c(moshi);
            return new TravelWarmUpAdaptersCallback(moshi, Jb.d.a(this.warmupAdaptersFacadeProvider));
        }

        private TrustFactorConfig trustFactorConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new TrustFactorConfig(jsonDeserializer);
        }

        private TrustFactorViewMapper trustFactorViewMapper() {
            g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            return new TrustFactorViewMapper(ozonRouter);
        }

        private TwoCardsConfig twoCardsConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new TwoCardsConfig(jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UpdateCartOnStartDelegate updateCartOnStartDelegate() {
            CartService cartService = this.cartServiceApi.getCartService();
            j.c(cartService);
            CartEventsController cartEventsController = this.cartComponentApi.getCartEventsController();
            j.c(cartEventsController);
            CartModeManager cartModeService = this.cartServiceApi.getCartModeService();
            j.c(cartModeService);
            return new UpdateCartOnStartDelegate(cartService, cartEventsController, cartModeService);
        }

        private UpdateInAppLaunchStateDialogProcessor updateInAppLaunchStateDialogProcessor() {
            InAppUpdateController inAppUpdateController = this.inAppUpdateComponentApi.getInAppUpdateController();
            j.c(inAppUpdateController);
            return new UpdateInAppLaunchStateDialogProcessor(inAppUpdateController);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UpdateOrderC2CRepository updateOrderC2CRepository() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new UpdateOrderC2CRepository(actionRepository);
        }

        private UserAdultModalConfig userAdultModalConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new UserAdultModalConfig(jsonDeserializer);
        }

        private UserAdultModalMapper userAdultModalMapper() {
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            return new UserAdultModalMapper(appType);
        }

        private UserAdultModalNoUiViewMapper userAdultModalNoUiViewMapper() {
            return new UserAdultModalNoUiViewMapper(new ViewAnalyticSenderDelegate(), this.datePickerViewModelProvider, this.adultConfirmationViewModelProvider, userAdultModalMapper());
        }

        private UserAuthBiometrySettingsConfig userAuthBiometrySettingsConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new UserAuthBiometrySettingsConfig(jsonDeserializer);
        }

        private UserAuthBiometrySettingsViewMapper userAuthBiometrySettingsViewMapper() {
            UserAuthBiometrySettingsMapper userAuthBiometrySettingsMapper = new UserAuthBiometrySettingsMapper();
            Fb0.a biometryAuth = this.authComponentApi.getBiometryAuth();
            j.c(biometryAuth);
            return new UserAuthBiometrySettingsViewMapper(userAuthBiometrySettingsMapper, biometryAuth, this.userAuthBiometryViewModelImplProvider);
        }

        private UserSocialsMobileApi userSocialsMobileApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return UserSocialsMobileModule_Companion_ProvideUserSocialsMobileApiFactory.provideUserSocialsMobileApi(retrofit);
        }

        private UserSocialsMobileConfig userSocialsMobileConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new UserSocialsMobileConfig(jsonDeserializer);
        }

        private UserSocialsMobileHeaderViewMapper userSocialsMobileHeaderViewMapper() {
            return new UserSocialsMobileHeaderViewMapper(new UserSocialsMobileHeaderMapper());
        }

        private UserSocialsMobileItemViewMapper userSocialsMobileItemViewMapper() {
            return new UserSocialsMobileItemViewMapper(new UserSocialsMobileItemMapper(), this.userSocialsMobileItemViewModelImplProvider);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UserSocialsMobileRepository userSocialsMobileRepository() {
            return new UserSocialsMobileRepository(userSocialsMobileApi());
        }

        private VKIDRefreshStateConfiguratorFactory vKIDRefreshStateConfiguratorFactory() {
            return new VKIDRefreshStateConfiguratorFactory(this.vKIDRefreshStateConfiguratorProvider);
        }

        private ValidateDeclaredPriceActionHandler validateDeclaredPriceActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new ValidateDeclaredPriceActionHandler(actionRepository, this.inputCurtainViewModelProvider);
        }

        private ValidateOrderDeclaredPriceActionHandler validateOrderDeclaredPriceActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new ValidateOrderDeclaredPriceActionHandler(actionRepository, this.inputCurtainViewModelProvider);
        }

        private ValuesTotalConfig valuesTotalConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new ValuesTotalConfig(jsonDeserializer);
        }

        private VideoConsultationBannerConfig videoConsultationBannerConfig() {
            JsonParser jsonDeserializer = this.networkComponentApi.getJsonDeserializer();
            j.c(jsonDeserializer);
            return new VideoConsultationBannerConfig(jsonDeserializer);
        }

        private ViewPromoPlacementBannerActionHandler viewPromoPlacementBannerActionHandler() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new ViewPromoPlacementBannerActionHandler(actionRepository);
        }

        private ViewPromoStickyBubbleAction viewPromoStickyBubbleAction() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new ViewPromoStickyBubbleAction(actionRepository);
        }

        private VoiceRecognitionConfiguratorFactory voiceRecognitionConfiguratorFactory() {
            return new VoiceRecognitionConfiguratorFactory(this.voiceRecognitionConfiguratorProvider);
        }

        private WarmUpCallback warmUpCallback() {
            return new WarmUpCallback(this.bindMoshiAdapterWarmer$main_prodGoogleAllVendorsReleaseProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public WhiteListDomainsOzonAppsHandler whiteListDomainsOzonAppsHandler() {
            NativePageDomainsInteractor nativePageDomainsInteractor = this.navigationComponentApi.getNativePageDomainsInteractor();
            j.c(nativePageDomainsInteractor);
            return new WhiteListDomainsOzonAppsHandler(nativePageDomainsInteractor);
        }

        @Override // ru.ozon.app.android.deeplinks.di.DeeplinkActivityComponentDependencies
        public ActivityInitializer getActivityInitializer() {
            return this.bindActivityInitializerProvider.get();
        }

        @Override // ru.ozon.app.android.injection.IDaggerComponent
        public AppInitializer getAppInitializer() {
            return this.appInitializerProvider.get();
        }

        @Override // ru.ozon.app.android.switchUser.di.SwitchUserDependencies
        public AuthDestinationInterceptor getAuthDestinationInterceptor() {
            return this.authDestinationInterceptorImplProvider.get();
        }

        @Override // ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentDependencies
        public ButtonWidgetCustomActionHandlers getButtonWidgetCustomActionHandlers() {
            return new ButtonWidgetCustomActionHandlersImpl();
        }

        @Override // ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies
        public ComposerComposeThemeWrapper getComposeThemeWrapper() {
            e miniAppConfigHolder = this.navigationComponentApi.getMiniAppConfigHolder();
            j.c(miniAppConfigHolder);
            return ComposerExportedModule_Companion_ProvideComposerComposeThemeWrapperFactory.provideComposerComposeThemeWrapper(miniAppConfigHolder);
        }

        @Override // ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies
        public Map<Class<?>, a<QZ.g>> getComposerStateConfiguratorProviders() {
            AbstractC5881z.a e11 = AbstractC5881z.e(15);
            e11.b(AddressPopUpStateConfigurator.class, this.addressPopUpStateConfiguratorProvider);
            e11.b(MoveCartItemsInterceptor.class, this.moveCartItemsInterceptorProvider);
            e11.b(OrderCacheStateInterceptor.class, this.orderCacheStateInterceptorProvider);
            e11.b(CartComposerInterceptor.class, this.cartComposerInterceptorProvider);
            e11.b(SkuPromoCartComposerInterceptor.class, this.skuPromoCartComposerInterceptorProvider);
            e11.b(FirstRequestSetupConfigurator.class, this.firstRequestSetupConfiguratorProvider);
            e11.b(InitCheckoutRequestConfigurator.class, this.initCheckoutRequestConfiguratorProvider);
            e11.b(CheckoutRequestInterceptor.class, this.checkoutRequestInterceptorProvider);
            e11.b(BiometryStateConfigurator.class, this.biometryStateConfiguratorProvider);
            e11.b(NotificationsSettingsStateConfigurator.class, this.notificationsSettingsStateConfiguratorProvider);
            e11.b(AvailableNativePaymentInterceptor.class, this.availableNativePaymentInterceptorProvider);
            e11.b(FirstRequestMapConfigurator.class, this.firstRequestMapConfiguratorProvider);
            e11.b(AddressBookStateConfigurator.class, this.addressBookStateConfiguratorProvider);
            e11.b(AuthPostDataConfigurator.class, this.authPostDataConfiguratorProvider);
            e11.b(LongPollingPageComposerInterceptor.class, this.longPollingPageComposerInterceptorProvider);
            return e11.a();
        }

        @Override // ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies
        public Map<Class<?>, a<ComposerScreenConfig.PageConfigurator>> getConfiguratorProviders() {
            AbstractC5881z.a e11 = AbstractC5881z.e(228);
            e11.b(ProductPickerSearchParamsConfigurator.class, this.productPickerSearchParamsConfiguratorProvider);
            e11.b(AutopickerBottomSheetConfigurator.class, this.autopickerBottomSheetConfiguratorProvider);
            e11.b(AutopickerResultConfigurator.class, this.autopickerResultConfiguratorProvider);
            e11.b(ConfirmDeleteResultConfigurator.class, this.confirmDeleteResultConfiguratorProvider);
            e11.b(DismissOnAddressUpdateConfigurator.class, this.dismissOnAddressUpdateConfiguratorProvider);
            e11.b(CategoryMainPageFreshConfigurator.class, this.categoryMainPageFreshConfiguratorProvider);
            e11.b(AvatarProfileConfigurator.class, this.avatarProfileConfiguratorProvider);
            e11.b(ReturnListNormalizeBackStackConfigurator.class, this.returnListNormalizeBackStackConfiguratorProvider);
            e11.b(ReturnDetailsNormalizeBackStackConfigurator.class, this.returnDetailsNormalizeBackStackConfiguratorProvider);
            e11.b(ReturnActionModalConfigurator.class, this.returnActionModalConfiguratorProvider);
            e11.b(DeliveryDetailsPageConfigurator.class, this.deliveryDetailsPageConfiguratorProvider);
            e11.b(MorkovskModalMenuConfigurator.class, this.morkovskModalMenuConfiguratorProvider);
            e11.b(DailyRewardsConfigurator.class, this.dailyRewardsConfiguratorProvider);
            e11.b(PrizesConfigurator.class, this.prizesConfiguratorProvider);
            e11.b(MorkovskOnboardingConfigurator.class, this.morkovskOnboardingConfiguratorProvider);
            e11.b(MorkovskWelcomeScreenConfigurator.class, this.morkovskWelcomeScreenConfiguratorProvider);
            e11.b(BloggerRefreshMainPageConfigurator.class, this.bloggerRefreshMainPageConfiguratorProvider);
            e11.b(BloggerRefreshPostsPageAfterFormSubmitConfigurator.class, this.bloggerRefreshPostsPageAfterFormSubmitConfiguratorProvider);
            e11.b(BloggerRefreshChannelsPageConfigurator.class, this.bloggerRefreshChannelsPageConfiguratorProvider);
            e11.b(RefreshAfterDismissAndPopPageConfigurator.class, this.refreshAfterDismissAndPopPageConfiguratorProvider);
            e11.b(BottomSheetInsetsConfigurator.class, this.bottomSheetInsetsConfiguratorProvider);
            e11.b(RefreshByFragmentResultPageConfigurator.class, this.refreshByFragmentResultPageConfiguratorProvider);
            e11.b(EdgeToEdgeConfigurator.class, this.edgeToEdgeConfiguratorProvider);
            e11.b(TopEdgeConfigurator.class, this.topEdgeConfiguratorProvider);
            e11.b(ShareLinkBloggerCopyResultConfigurator.class, this.shareLinkBloggerCopyResultConfiguratorProvider);
            e11.b(BloggerPersonalDataKeyboardConfigurator.class, this.bloggerPersonalDataKeyboardConfiguratorProvider);
            e11.b(AddressSearchSheetResultConfigurator.class, this.addressSearchSheetResultConfiguratorProvider);
            e11.b(ScanItIntroConfigurator.class, this.scanItIntroConfiguratorProvider);
            e11.b(LightStatusBarConfigurator.class, this.lightStatusBarConfiguratorProvider);
            e11.b(SearchHideKeyboardOnOpenConfigurator.class, this.searchHideKeyboardOnOpenConfiguratorProvider);
            e11.b(FeedbackTilePreCreationConfigurator.class, this.feedbackTilePreCreationConfiguratorProvider);
            e11.b(CategoryPageConfigurator.class, this.categoryPageConfiguratorProvider);
            e11.b(SuggestionsPrefetchConfigurator.class, this.suggestionsPrefetchConfiguratorProvider);
            e11.b(RemoveRVItemAnimationConfigurator.class, this.removeRVItemAnimationConfiguratorProvider);
            e11.b(CheckoutRefreshPageConfigurator.class, this.checkoutRefreshPageConfiguratorProvider);
            e11.b(TravelFiltersKeyboardInsetConfigurator.class, this.travelFiltersKeyboardInsetConfiguratorProvider);
            e11.b(TravelPassengersPageStorageInitializerConfigurator.class, this.travelPassengersPageStorageInitializerConfiguratorProvider);
            e11.b(IconChooserRootPageConfigurator.class, this.iconChooserRootPageConfiguratorProvider);
            e11.b(IconChooserModalPageConfigurator.class, this.iconChooserModalPageConfiguratorProvider);
            e11.b(ModalParentRefreshConfigurator.class, this.modalParentRefreshConfiguratorProvider);
            e11.b(TravelTimeoutRedirectConfigurator.class, this.travelTimeoutRedirectConfiguratorProvider);
            e11.b(TravelAnchorRefreshConfigurator.class, this.travelAnchorRefreshConfiguratorProvider);
            e11.b(MainTabRedirectOnBackPressedConfigurator.class, this.mainTabRedirectOnBackPressedConfiguratorProvider);
            e11.b(TravelDownloadFileConfigurator.class, this.travelDownloadFileConfiguratorProvider);
            e11.b(TravelRefreshOnRestartPageConfigurator.class, this.travelRefreshOnRestartPageConfiguratorProvider);
            e11.b(TravelHideAppbarConfigurator.class, this.travelHideAppbarConfiguratorProvider);
            e11.b(SearchFormRefreshPageConfigurator.class, this.searchFormRefreshPageConfiguratorProvider);
            e11.b(MapInfoDeeplinkRouteConfigurator.class, this.mapInfoDeeplinkRouteConfiguratorProvider);
            e11.b(FullScreenInsetsConfigurator.class, this.fullScreenInsetsConfiguratorProvider);
            e11.b(TravelMainPreCreateConfigurator.class, this.travelMainPreCreateConfiguratorProvider);
            e11.b(TravelThankYouPreCreateConfigurator.class, this.travelThankYouPreCreateConfiguratorProvider);
            e11.b(TravelOrderListPreCreateConfigurator.class, this.travelOrderListPreCreateConfiguratorProvider);
            e11.b(TravelRailwaySERPPreCreateConfigurator.class, this.travelRailwaySERPPreCreateConfiguratorProvider);
            e11.b(TravelAddNewPassengerFormV2InputSelectorConfigurator.class, this.travelAddNewPassengerFormV2InputSelectorConfiguratorProvider);
            e11.b(TravelAddNewPassengerFormV2InputDateSelectorConfigurator.class, this.travelAddNewPassengerFormV2InputDateSelectorConfiguratorProvider);
            e11.b(HotelsBookPageStorageInitializerConfigurator.class, this.hotelsBookPageStorageInitializerConfiguratorProvider);
            e11.b(HotelsBookModalPageConfigurator.class, this.hotelsBookModalPageConfiguratorProvider);
            e11.b(HotelsBookTotalRefreshConfigurator.class, this.hotelsBookTotalRefreshConfiguratorProvider);
            e11.b(AdditionalServicesPageConfigurator.class, this.additionalServicesPageConfiguratorProvider);
            e11.b(HotelsGalleryFullConfigurator.class, this.hotelsGalleryFullConfiguratorProvider);
            e11.b(HotelsMapInfoConfigurator.class, this.hotelsMapInfoConfiguratorProvider);
            e11.b(TouristCountSelectorConfigurator.class, this.touristCountSelectorConfiguratorProvider);
            e11.b(RemoveSplitConfigurator.class, this.removeSplitConfiguratorProvider);
            e11.b(HomePageConfigurator.class, this.homePageConfiguratorProvider);
            e11.b(UploadPhotosConfigurator.class, this.uploadPhotosConfiguratorProvider);
            e11.b(ReturnCreationItemRemovedConfigurator.class, this.returnCreationItemRemovedConfiguratorProvider);
            e11.b(ReturnCreationPhotoUpdatedConfigurator.class, this.returnCreationPhotoUpdatedConfiguratorProvider);
            e11.b(PhotoPickerConfigurator.class, this.photoPickerConfiguratorProvider);
            e11.b(CreateShoppingListConfigurator.class, this.createShoppingListConfiguratorProvider);
            e11.b(RenameFavoritesListConfigurator.class, this.renameFavoritesListConfiguratorProvider);
            e11.b(PinStatusFavoritesListConfigurator.class, this.pinStatusFavoritesListConfiguratorProvider);
            e11.b(DeleteFavoritesListConfigurator.class, this.deleteFavoritesListConfiguratorProvider);
            e11.b(ListAccessChangedConfigurator.class, this.listAccessChangedConfiguratorProvider);
            e11.b(CreateFavoritesListConfigurator.class, this.createFavoritesListConfiguratorProvider);
            e11.b(RemoveFavoritesListConfigurator.class, this.removeFavoritesListConfiguratorProvider);
            e11.b(RemoveFromFavoritesListConfigurator.class, this.removeFromFavoritesListConfiguratorProvider);
            e11.b(AccessControlConfigurator.class, this.accessControlConfiguratorProvider);
            e11.b(OnFavoriteEntityChangedConfigurator.class, this.onFavoriteEntityChangedConfiguratorProvider);
            e11.b(EditListFavoriteConfigurator.class, this.editListFavoriteConfiguratorProvider);
            e11.b(CatalogFavoritesConfigurator.class, this.catalogFavoritesConfiguratorProvider);
            e11.b(UpdateByFavoritesConfigurator.class, this.updateByFavoritesConfiguratorProvider);
            e11.b(CreateShoppingListAsyncConfigurator.class, this.createShoppingListAsyncConfiguratorProvider);
            e11.b(CreateFavoritesListAsyncConfigurator.class, this.createFavoritesListAsyncConfiguratorProvider);
            e11.b(DeleteFavoritesListAsyncConfigurator.class, this.deleteFavoritesListAsyncConfiguratorProvider);
            e11.b(PinStatusFavoritesListAsyncConfigurator.class, this.pinStatusFavoritesListAsyncConfiguratorProvider);
            e11.b(RenameFavoritesListAsyncConfigurator.class, this.renameFavoritesListAsyncConfiguratorProvider);
            e11.b(EditListFavoriteAsyncConfigurator.class, this.editListFavoriteAsyncConfiguratorProvider);
            e11.b(RemoveFromFavoritesListAsyncConfigurator.class, this.removeFromFavoritesListAsyncConfiguratorProvider);
            e11.b(FavoritesSellersScrollToUpConfigurator.class, this.favoritesSellersScrollToUpConfiguratorProvider);
            e11.b(CreateShoppingListInputInsetsConfigurator.class, this.createShoppingListInputInsetsConfiguratorProvider);
            e11.b(FamilyAccountConfigurator.class, this.familyAccountConfiguratorProvider);
            e11.b(FavoritesMediaPickerConfigurator.class, this.favoritesMediaPickerConfiguratorProvider);
            e11.b(ReturnListUpdateConfigurator.class, this.returnListUpdateConfiguratorProvider);
            e11.b(AddUserCardConfigurator.class, this.addUserCardConfiguratorProvider);
            e11.b(CategoryPreCreationConfigurator.class, this.categoryPreCreationConfiguratorProvider);
            e11.b(CategoryMainPageFreshPreCreationConfigurator.class, this.categoryMainPageFreshPreCreationConfiguratorProvider);
            e11.b(SearchPreCreationConfigurator.class, this.searchPreCreationConfiguratorProvider);
            e11.b(PdpConfigurator.class, this.pdpConfiguratorProvider);
            e11.b(PdpGalleryFullViewConfigurator.class, this.pdpGalleryFullViewConfiguratorProvider);
            e11.b(RefreshByAdultStateConfigurator.class, this.refreshByAdultStateConfiguratorProvider);
            e11.b(QuestionsConfigurator.class, this.questionsConfiguratorProvider);
            e11.b(ComparisonConfigurator.class, this.comparisonConfiguratorProvider);
            e11.b(OrderDoneLiteInfoConfigurator.class, this.orderDoneLiteInfoConfiguratorProvider);
            e11.b(RelatedProductsBottomSheetConfigurator.class, this.relatedProductsBottomSheetConfiguratorProvider);
            e11.b(ReviewSuccessConfigurator.class, this.reviewSuccessConfiguratorProvider);
            e11.b(SubmitCachedReviewConfigurator.class, this.submitCachedReviewConfiguratorProvider);
            e11.b(RefreshSelectionConfigurator.class, this.refreshSelectionConfiguratorProvider);
            e11.b(MediaPickerConfigurator.class, this.mediaPickerConfiguratorProvider);
            e11.b(ReviewFormConfigurator.class, this.reviewFormConfiguratorProvider);
            e11.b(ReviewConfigurator.class, this.reviewConfiguratorProvider);
            e11.b(CommentsListConfigurator.class, this.commentsListConfiguratorProvider);
            e11.b(ReviewGalleryV2Configurator.class, this.reviewGalleryV2ConfiguratorProvider);
            e11.b(ListReviewConfigurator.class, this.listReviewConfiguratorProvider);
            e11.b(AdditionRecycledViewPoolConfigurator.class, this.additionRecycledViewPoolConfiguratorProvider);
            e11.b(SocialProfileConfigurator.class, this.socialProfileConfiguratorProvider);
            e11.b(TopAuthorsLandingConfigurator.class, this.topAuthorsLandingConfiguratorProvider);
            e11.b(TopAuthorsOnboardingConfigurator.class, this.topAuthorsOnboardingConfiguratorProvider);
            e11.b(StaticTeenModeConfigurator.class, this.staticTeenModeConfiguratorProvider);
            e11.b(DynamicTeenModeConfigurator.class, this.dynamicTeenModeConfiguratorProvider);
            e11.b(HideToolbarConfigurator.class, this.hideToolbarConfiguratorProvider);
            e11.b(VideoPreloadCleanerConfigurator.class, this.videoPreloadCleanerConfiguratorProvider);
            e11.b(VideoMoleculeConfigurator.class, this.videoMoleculeConfiguratorProvider);
            e11.b(PromoReviewRefreshConfigurator.class, this.promoReviewRefreshConfiguratorProvider);
            e11.b(LegalsFlowConfigurator.class, this.legalsFlowConfiguratorProvider);
            e11.b(AddLegalMobileConfigurator.class, this.addLegalMobileConfiguratorProvider);
            e11.b(AddressSearchConfigurator.class, this.addressSearchConfiguratorProvider);
            e11.b(ConsigneeAddressSearchConfigurator.class, this.consigneeAddressSearchConfiguratorProvider);
            e11.b(RefreshPageConfigurator.class, this.refreshPageConfiguratorProvider);
            e11.b(RegistrationConfigurator.class, this.registrationConfiguratorProvider);
            e11.b(LegalDetailsFileSelectConfigurator.class, this.legalDetailsFileSelectConfiguratorProvider);
            e11.b(RecActsDeclinerFileSelectConfigurator.class, this.recActsDeclinerFileSelectConfiguratorProvider);
            e11.b(ResultControllerConfigurator.class, this.resultControllerConfiguratorProvider);
            e11.b(PartPaymentSummaryPageConfigurator.class, this.partPaymentSummaryPageConfiguratorProvider);
            e11.b(CartConfigurator.class, this.cartConfiguratorProvider);
            e11.b(CartPreCreateViewConfiguratorV2.class, this.cartPreCreateViewConfiguratorV2Provider);
            e11.b(CartScreenStateConfigurator.class, this.cartScreenStateConfiguratorProvider);
            e11.b(AddToCartLoaderConfigurator.class, this.addToCartLoaderConfiguratorProvider);
            e11.b(CartSharedViewPoolSizeSetterConfigurator.class, this.cartSharedViewPoolSizeSetterConfiguratorProvider);
            e11.b(CartRefreshEventConfigurator.class, this.cartRefreshEventConfiguratorProvider);
            e11.b(FamilyCartRefreshEventConfigurator.class, this.familyCartRefreshEventConfiguratorProvider);
            e11.b(CartOnScreenEventHandlerConfigurator.class, this.cartOnScreenEventHandlerConfiguratorProvider);
            e11.b(CartKeyboardInsetConfigurator.class, this.cartKeyboardInsetConfiguratorProvider);
            e11.b(CartRestoreItemConfigurator.class, this.cartRestoreItemConfiguratorProvider);
            e11.b(FreshCartConfigurator.class, this.freshCartConfiguratorProvider);
            e11.b(ResetCartModeConfigurator.class, this.resetCartModeConfiguratorProvider);
            e11.b(CartSplitSwipeConfigurator.class, this.cartSplitSwipeConfiguratorProvider);
            e11.b(FamilyCartConfigurator.class, this.familyCartConfiguratorProvider);
            e11.b(FamilyCartOnScreenEventHandlerConfigurator.class, this.familyCartOnScreenEventHandlerConfiguratorProvider);
            e11.b(CartPrefetchConfigurator.class, this.cartPrefetchConfiguratorProvider);
            e11.b(AsyncCartConfigurator.class, this.asyncCartConfiguratorProvider);
            e11.b(OrderDoneConfigurator.class, this.orderDoneConfiguratorProvider);
            e11.b(RefreshOnStartPageConfigurator.class, this.refreshOnStartPageConfiguratorProvider);
            e11.b(OrderDoneRefreshCartConfigurator.class, this.orderDoneRefreshCartConfiguratorProvider);
            e11.b(DeliveryOrderDoneConfigurator.class, this.deliveryOrderDoneConfiguratorProvider);
            e11.b(ScrollToWidgetConfigurator.class, this.scrollToWidgetConfiguratorProvider);
            e11.b(CheckoutPreCreationConfigurator.class, this.checkoutPreCreationConfiguratorProvider);
            e11.b(AddressPartsInputPageConfigurator.class, this.addressPartsInputPageConfiguratorProvider);
            e11.b(ru.ozon.app.android.checkoutgeo.checkout.configurators.ConfirmDeleteResultConfigurator.class, this.confirmDeleteResultConfiguratorProvider2);
            e11.b(RemoveRfbsSplitConfigurator.class, this.removeRfbsSplitConfiguratorProvider);
            e11.b(ClearReferrerConfigurator.class, this.clearReferrerConfiguratorProvider);
            e11.b(CheckoutRefreshConfigurator.class, this.checkoutRefreshConfiguratorProvider);
            e11.b(PreloadImagesConfigurator.class, this.preloadImagesConfiguratorProvider);
            e11.b(CardBindingConfigurator.class, this.cardBindingConfiguratorProvider);
            e11.b(CheckoutClearCacheConfigurator.class, this.checkoutClearCacheConfiguratorProvider);
            e11.b(OptionsSelectorSheetResultConfigurator.class, this.optionsSelectorSheetResultConfiguratorProvider);
            e11.b(SearchSheetResultConfigurator.class, this.searchSheetResultConfiguratorProvider);
            e11.b(YandexSearchSheetResultConfigurator.class, this.yandexSearchSheetResultConfiguratorProvider);
            e11.b(UpdateChatInfoConfigurator.class, this.updateChatInfoConfiguratorProvider);
            e11.b(RefreshAnchorScreenConfigurator.class, this.refreshAnchorScreenConfiguratorProvider);
            e11.b(OrderCacheConfigurator.class, this.orderCacheConfiguratorProvider);
            e11.b(ProfileAvatarConfigurator.class, this.profileAvatarConfiguratorProvider);
            e11.b(ProfileInfoConfigurator.class, this.profileInfoConfiguratorProvider);
            e11.b(SessionListUpdatedConfigurator.class, this.sessionListUpdatedConfiguratorProvider);
            e11.b(RefreshOnActualizeEmailConfigurator.class, this.refreshOnActualizeEmailConfiguratorProvider);
            e11.b(RefreshOnUserDataChangedConfigurator.class, this.refreshOnUserDataChangedConfiguratorProvider);
            e11.b(LKOrderTrackingV4UpdaterConfigurator.class, this.lKOrderTrackingV4UpdaterConfiguratorProvider);
            e11.b(MainOrderTrackingV4UpdaterConfigurator.class, this.mainOrderTrackingV4UpdaterConfiguratorProvider);
            e11.b(OrderChangeActionButtonsConfigurator.class, this.orderChangeActionButtonsConfiguratorProvider);
            e11.b(NotificationsSettingsConfigurator.class, this.notificationsSettingsConfiguratorProvider);
            e11.b(NotificationsSettingsBottomSheetConfigurator.class, this.notificationsSettingsBottomSheetConfiguratorProvider);
            e11.b(CancelPostingsConfigurator.class, this.cancelPostingsConfiguratorProvider);
            e11.b(SingleActionButtonConfigurator.class, this.singleActionButtonConfiguratorProvider);
            e11.b(OrderFiltersConfigurator.class, this.orderFiltersConfiguratorProvider);
            e11.b(RefreshByOrderChangeConfigurator.class, this.refreshByOrderChangeConfiguratorProvider);
            e11.b(OrientationLockConfigurator.class, this.orientationLockConfiguratorProvider);
            e11.b(RefreshAfterTimeChangeConfigurator.class, this.refreshAfterTimeChangeConfiguratorProvider);
            e11.b(OrderPayConfigurator.class, this.orderPayConfiguratorProvider);
            e11.b(SelectPaymentConfigurator.class, this.selectPaymentConfiguratorProvider);
            e11.b(OrderDetailsChangeHandlerConfigurator.class, this.orderDetailsChangeHandlerConfiguratorProvider);
            e11.b(RefreshOnStartConfigurator.class, this.refreshOnStartConfiguratorProvider);
            e11.b(TotalConfigurator.class, this.totalConfiguratorProvider);
            e11.b(ChangePaymentMethodConfigurator.class, this.changePaymentMethodConfiguratorProvider);
            e11.b(BrightnessChangerConfigurator.class, this.brightnessChangerConfiguratorProvider);
            e11.b(CabinetBarcodeOnWearableDeviceConfigurator.class, this.cabinetBarcodeOnWearableDeviceConfiguratorProvider);
            e11.b(HomeBarcodeOnWearableDeviceConfigurator.class, this.homeBarcodeOnWearableDeviceConfiguratorProvider);
            e11.b(OrderGalleryConfigurator.class, this.orderGalleryConfiguratorProvider);
            e11.b(RefreshByResultConfigurator.class, this.refreshByResultConfiguratorProvider);
            e11.b(CreateAndPayConfigurator.class, this.createAndPayConfiguratorProvider);
            e11.b(ChangePaymentConfigurator.class, this.changePaymentConfiguratorProvider);
            e11.b(UpdateOrderC2CConfigurator.class, this.updateOrderC2CConfiguratorProvider);
            e11.b(ClickOrderConfigurator.class, this.clickOrderConfiguratorProvider);
            e11.b(LinkFastPayConfigurator.class, this.linkFastPayConfiguratorProvider);
            e11.b(CheckFastPayConfigurator.class, this.checkFastPayConfiguratorProvider);
            e11.b(OrderDetailsPayConfigurator.class, this.orderDetailsPayConfiguratorProvider);
            e11.b(ConfirmDeliveryDateActionButtonsConfigurator.class, this.confirmDeliveryDateActionButtonsConfiguratorProvider);
            e11.b(ScrollToShipmentConfigurator.class, this.scrollToShipmentConfiguratorProvider);
            e11.b(NestedScrollingDisabledConfigurator.class, this.nestedScrollingDisabledConfiguratorProvider);
            e11.b(PlayStoriesV3Configurator.class, this.playStoriesV3ConfiguratorProvider);
            e11.b(ru.ozon.app.android.videomolecule.presentation.VideoMoleculeConfigurator.class, this.videoMoleculeConfiguratorProvider2);
            e11.b(SharedViewPoolSizeSetterConfigurator.class, this.sharedViewPoolSizeSetterConfiguratorProvider);
            e11.b(AppOnboardingConfigurator.class, this.appOnboardingConfiguratorProvider);
            e11.b(TileRelatedProductsBottomSheetConfigurator.class, this.tileRelatedProductsBottomSheetConfiguratorProvider);
            e11.b(FailedExternalPageRetryNotificationConfigurator.class, this.failedExternalPageRetryNotificationConfiguratorProvider);
            e11.b(FilterValuesModalConfigurator.class, this.filterValuesModalConfiguratorProvider);
            e11.b(MainFilterConfigurator.class, this.mainFilterConfiguratorProvider);
            e11.b(FiltersKeyboardInsetConfigurator.class, this.filtersKeyboardInsetConfiguratorProvider);
            e11.b(AddressEditMapConfigurator.class, this.addressEditMapConfiguratorProvider);
            e11.b(FlashCallConfigurator.class, this.flashCallConfiguratorProvider);
            e11.b(RequestPhoneAccessConfigurator.class, this.requestPhoneAccessConfiguratorProvider);
            e11.b(NewCredentialsConfigurator.class, this.newCredentialsConfiguratorProvider);
            e11.b(SmsRetrieverConfigurator.class, this.smsRetrieverConfiguratorProvider);
            e11.b(GalleryLauncherConfigurator.class, this.galleryLauncherConfiguratorProvider);
            e11.b(CmlEventsHandlerConfigurator.class, this.cmlEventsHandlerConfiguratorProvider);
            e11.b(EditOrderConfigurator.class, this.editOrderConfiguratorProvider);
            e11.b(ParcelPhotoAddConfigurator.class, this.parcelPhotoAddConfiguratorProvider);
            e11.b(AddNewCardConfigurator.class, this.addNewCardConfiguratorProvider);
            e11.b(ru.ozon.app.android.returns.cancels.cancelpostingsv2.CancelPostingsConfigurator.class, this.cancelPostingsConfiguratorProvider2);
            e11.b(ru.ozon.app.android.returns.cancels.modalConstructor.presentation.configurators.NestedScrollingDisabledConfigurator.class, this.nestedScrollingDisabledConfiguratorProvider2);
            return e11.a();
        }

        public Map<Class<?>, a<CustomActionHandler>> getCustomActionHandler() {
            AbstractC5881z.a e11 = AbstractC5881z.e(141);
            e11.b(TravelResultActionHandler.class, this.travelResultActionHandlerProvider);
            e11.b(TravelCustomPostResultActionHandler.class, this.travelCustomPostResultActionHandlerProvider);
            e11.b(TravelForceRedirectActionHandler.class, this.travelForceRedirectActionHandlerProvider);
            e11.b(TravelForceRefreshActionHandler.class, this.travelForceRefreshActionHandlerProvider);
            e11.b(ModalParentRefreshActionHandler.class, this.modalParentRefreshActionHandlerProvider);
            e11.b(PopAndRefreshActionHandler.class, this.popAndRefreshActionHandlerProvider);
            e11.b(TravelDownloadFileActionHandler.class, this.travelDownloadFileActionHandlerProvider);
            e11.b(TravelCallActionHandler.class, this.travelCallActionHandlerProvider);
            e11.b(CalendarEventActionHandler.class, this.calendarEventActionHandlerProvider);
            e11.b(PushRouteAndRefreshActionHandler.class, this.pushRouteAndRefreshActionHandlerProvider);
            e11.b(PopRouteAndRefreshActionHandler.class, this.popRouteAndRefreshActionHandlerProvider);
            e11.b(HotelsBookSuccessValidationActionHandler.class, this.hotelsBookSuccessValidationActionHandlerProvider);
            e11.b(AddCardActionHandler.class, this.addCardActionHandlerProvider);
            e11.b(AddToFavoriteActionHandler.class, this.addToFavoriteActionHandlerProvider);
            e11.b(GoCheckoutActionHandler.class, this.goCheckoutActionHandlerProvider);
            e11.b(ClassifiedCallActionHandler.class, this.classifiedCallActionHandlerProvider);
            e11.b(ReloadFromCurrentWidgetPageActionHandler.class, this.reloadFromCurrentWidgetPageActionHandlerProvider);
            e11.b(CourierOnMapCallActionHandler.class, this.courierOnMapCallActionHandlerProvider);
            e11.b(CallCourierActionHandler.class, this.callCourierActionHandlerProvider);
            e11.b(RemoveFromFavoriteActionHandler.class, this.removeFromFavoriteActionHandlerProvider);
            e11.b(RemoveSplitActionHandler.class, this.removeSplitActionHandlerProvider);
            e11.b(ShareLinkActionHandler.class, this.shareLinkActionHandlerProvider);
            e11.b(ShareSellerLinkActionHandler.class, this.shareSellerLinkActionHandlerProvider);
            e11.b(RemovePostActionHandler.class, this.removePostActionHandlerProvider);
            e11.b(ComposerActionAndRedirectActionHandler.class, this.composerActionAndRedirectActionHandlerProvider);
            e11.b(DownloadPDFActionHandler.class, this.downloadPDFActionHandlerProvider);
            e11.b(CloseFlowActionHandler.class, this.closeFlowActionHandlerProvider);
            e11.b(ComposerActionWithRefreshCustomActionHandler.class, this.composerActionWithRefreshCustomActionHandlerProvider);
            e11.b(ClassifiedOpenDeleteListingModalActionHandler.class, this.classifiedOpenDeleteListingModalActionHandlerProvider);
            e11.b(OpenDeeplinkForRefreshResultActionHandler.class, this.openDeeplinkForRefreshResultActionHandlerProvider);
            e11.b(ComposerActionWithActionHandler.class, this.composerActionWithActionHandlerProvider);
            e11.b(ComposerActionWithSaveScrollActionHandler.class, this.composerActionWithSaveScrollActionHandlerProvider);
            e11.b(OpenApplicationStoreActionHandler.class, this.openApplicationStoreActionHandlerProvider);
            e11.b(OpenNotificationSettingsActionHandler.class, this.openNotificationSettingsActionHandlerProvider);
            e11.b(AddressPartsInputCustomActionHandler.class, this.addressPartsInputCustomActionHandlerProvider);
            e11.b(RemoveAddressAlertCustomActionHandler.class, this.removeAddressAlertCustomActionHandlerProvider);
            e11.b(DismissAndScrollByScrollWidgetKeyActionHandler.class, this.dismissAndScrollByScrollWidgetKeyActionHandlerProvider);
            e11.b(PopActionHandler.class, this.popActionHandlerProvider);
            e11.b(OnboardingActionHandler.class, this.onboardingActionHandlerProvider);
            e11.b(PopAndRedirectActionHandler.class, this.popAndRedirectActionHandlerProvider);
            e11.b(CloseMiniappActionHandler.class, this.closeMiniappActionHandlerProvider);
            e11.b(RateInAppActionHandler.class, this.rateInAppActionHandlerProvider);
            e11.b(CompositeCustomActionHandler.class, this.compositeCustomActionHandlerProvider);
            e11.b(SubscribeAuthorActionHandler.class, this.subscribeAuthorActionHandlerProvider);
            e11.b(UnsubscribeAuthorActionHandler.class, this.unsubscribeAuthorActionHandlerProvider);
            e11.b(SaveUserTipsChooseActionHandler.class, this.saveUserTipsChooseActionHandlerProvider);
            e11.b(DismissOrCloseMiniappActionHandler.class, this.dismissOrCloseMiniappActionHandlerProvider);
            e11.b(UpdateSelectedMapTabActionHandler.class, this.updateSelectedMapTabActionHandlerProvider);
            e11.b(FavoriteListRemoveActionHandler.class, this.favoriteListRemoveActionHandlerProvider);
            e11.b(FavoriteListAddActionHandler.class, this.favoriteListAddActionHandlerImplProvider);
            e11.b(FavoriteShareListActionHandler.class, this.favoriteShareListActionHandlerProvider);
            e11.b(FavoriteDeleteListActionHandler.class, this.favoriteDeleteListActionHandlerProvider);
            e11.b(RemoveFromFavoritesActionHandler.class, this.removeFromFavoritesActionHandlerProvider);
            e11.b(FavoriteWishlistRemoveActionHandler.class, this.favoriteWishlistRemoveActionHandlerProvider);
            e11.b(RemoveSelectionItemProductActionHandler.class, this.removeSelectionItemProductActionHandlerProvider);
            e11.b(DislikeRecommendationActionHandler.class, this.dislikeRecommendationActionHandlerProvider);
            e11.b(ActivateHelpCertActionHandler.class, this.activateHelpCertActionHandlerProvider);
            e11.b(GetDirectionsActionHandler.class, this.getDirectionsActionHandlerProvider);
            e11.b(PopBackStackActionHandler.class, this.popBackStackActionHandlerProvider);
            e11.b(CloseFlowAndActionDoActionHandler.class, this.closeFlowAndActionDoActionHandlerProvider);
            e11.b(DeleteSearchInsightCustomActionHandler.class, this.deleteSearchInsightCustomActionHandlerImplProvider);
            e11.b(SearchRedirectToGlobalActionHandler.class, this.searchRedirectToGlobalActionHandlerImplProvider);
            e11.b(DeleteAiConversationActionHandler.class, this.deleteAiConversationActionHandlerImplProvider);
            e11.b(AiRefreshActionHandler.class, this.aiRefreshActionHandlerImplProvider);
            e11.b(CopyTextActionHandler.class, this.copyTextActionHandlerProvider);
            e11.b(CopyAndDismissActionHandler.class, this.copyAndDismissActionHandlerProvider);
            e11.b(RedirectWithPrefetchActionHandler.class, this.redirectWithPrefetchActionHandlerProvider);
            e11.b(RemoveSuggestionActionHandler.class, this.removeSuggestionActionHandlerProvider);
            e11.b(ApplySortingActionHandler.class, this.applySortingActionHandlerProvider);
            e11.b(SetPublicProfileStatusActionHandler.class, this.setPublicProfileStatusActionHandlerProvider);
            e11.b(MallFilterNotificationActionHandler.class, this.mallFilterNotificationActionHandlerProvider);
            e11.b(PickImageActionHandler.class, this.pickImageActionHandlerProvider);
            e11.b(HomeCreditActionHandler.class, this.homeCreditActionHandlerProvider);
            e11.b(FetchCancelReasonsActionHandler.class, this.fetchCancelReasonsActionHandlerProvider);
            e11.b(ReorderActionHandler.class, this.reorderActionHandlerProvider);
            e11.b(DismissAndRefreshMapActionHandler.class, this.dismissAndRefreshMapActionHandlerProvider);
            e11.b(ToggleProductListActionHandler.class, this.toggleProductListActionHandlerProvider);
            e11.b(RefreshWithSelectedIdsActionHandler.class, this.refreshWithSelectedIdsActionHandlerProvider);
            e11.b(RefreshWithNewCommentActionHandler.class, this.refreshWithNewCommentActionHandlerProvider);
            e11.b(CancelOrderV3ActionHandler.class, this.cancelOrderV3ActionHandlerProvider);
            e11.b(ShareBarcodeActionHandler.class, this.shareBarcodeActionHandlerProvider);
            e11.b(PostRefreshWithScrollActionHandler.class, this.postRefreshWithScrollActionHandlerProvider);
            e11.b(ChangeItemQuantityActionHandler.class, this.changeItemQuantityActionHandlerProvider);
            e11.b(FreshRemoveCartItemsActionHandler.class, this.freshRemoveCartItemsActionHandlerProvider);
            e11.b(FreshPostRefreshWithScrollActionHandler.class, this.freshPostRefreshWithScrollActionHandlerProvider);
            e11.b(FreshRemoveCartTileActionHandler.class, this.freshRemoveCartTileActionHandlerProvider);
            e11.b(ru.ozon.app.android.fresh.common.domain.actionHandlers.PopAndRedirectActionHandler.class, this.popAndRedirectActionHandlerProvider2);
            e11.b(ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.actionHandlers.SaveUserTipsChooseActionHandler.class, this.saveUserTipsChooseActionHandlerProvider2);
            e11.b(GetRecShelfActionHandler.class, this.getRecShelfActionHandlerProvider);
            e11.b(B2bResetEdoVerificationActionHandler.class, this.b2bResetEdoVerificationActionHandlerProvider);
            e11.b(B2bRemoveLegalActionHandler.class, this.b2bRemoveLegalActionHandlerProvider);
            e11.b(B2bDownloadFileActionHandler.class, this.b2bDownloadFileActionHandlerProvider);
            e11.b(B2bAcceptActActionHandler.class, this.b2bAcceptActActionHandlerProvider);
            e11.b(B2bSelectConsigneeActionHandler.class, this.b2bSelectConsigneeActionHandlerProvider);
            e11.b(B2bDeleteConsigneeActionHandler.class, this.b2bDeleteConsigneeActionHandlerProvider);
            e11.b(DismissRefreshAndScrollActionHandler.class, this.dismissRefreshAndScrollActionHandlerProvider);
            e11.b(AddToCartWithRedirectActionHandler.class, this.addToCartWithRedirectActionHandlerProvider);
            e11.b(SellerSubscribeActionHandler.class, this.sellerSubscribeActionHandlerProvider);
            e11.b(SellerUnsubscribeActionHandler.class, this.sellerUnsubscribeActionHandlerProvider);
            e11.b(ActualizeEmailActionHandler.class, this.actualizeEmailActionHandlerProvider);
            e11.b(ConfirmEmailCustomActionHandler.class, this.confirmEmailCustomActionHandlerProvider);
            e11.b(VerifyEmailCustomActionHandler.class, this.verifyEmailCustomActionHandlerProvider);
            e11.b(UnbindVKIDCustomActionHandler.class, this.unbindVKIDCustomActionHandlerProvider);
            e11.b(ActionsFooterLikeActionHandler.class, this.actionsFooterLikeActionHandlerProvider);
            e11.b(TranslateReviewActionHandler.class, this.translateReviewActionHandlerProvider);
            e11.b(CommentActionHandler.class, this.commentActionHandlerProvider);
            e11.b(CommentModalActionHandler.class, this.commentModalActionHandlerProvider);
            e11.b(SubmitSelectionFormActionHandler.class, this.submitSelectionFormActionHandlerProvider);
            e11.b(UpdateProductsSelectionFormActionHandler.class, this.updateProductsSelectionFormActionHandlerProvider);
            e11.b(UpdateCellSelectionFormActionHandler.class, this.updateCellSelectionFormActionHandlerProvider);
            e11.b(DoubleDismissAndRedirectActionHandler.class, this.doubleDismissAndRedirectActionHandlerProvider);
            e11.b(DoubleDismissAndRefreshActionHandler.class, this.doubleDismissAndRefreshActionHandlerProvider);
            e11.b(DismissAndPopAndRefreshActionHandler.class, this.dismissAndPopAndRefreshActionHandlerProvider);
            e11.b(SaveReturnReasonDescriptionActionHandler.class, this.saveReturnReasonDescriptionActionHandlerProvider);
            e11.b(SaveReturnItemReasonCommentActionActionHandler.class, this.saveReturnItemReasonCommentActionActionHandlerProvider);
            e11.b(UserAuthBiometryActionHandler.class, this.userAuthBiometryActionHandlerImplProvider);
            e11.b(InstantLoginActionHandler.class, this.instantLoginActionHandlerImplProvider);
            e11.b(LogoutActionHandler.class, this.logoutActionHandlerImplProvider);
            e11.b(MainDrawMajorScreenProgressUpdateActionHandler.class, this.mainDrawMajorScreenProgressUpdateActionHandlerProvider);
            e11.b(LotteryOpenPurchaseTicketPageActionHandler.class, this.lotteryOpenPurchaseTicketPageActionHandlerProvider);
            e11.b(LotteryForceShowOnboardingActionHandler.class, this.lotteryForceShowOnboardingActionHandlerProvider);
            e11.b(ChangePaymentActionHandler.class, this.changePaymentActionHandlerProvider);
            e11.b(CreateOrderActionHandler.class, this.createOrderActionHandlerProvider);
            e11.b(CreatePaymentActionHandler.class, this.createPaymentActionHandlerProvider);
            e11.b(CreateServiceActionHandler.class, this.createServiceActionHandlerProvider);
            e11.b(UpdateOrderC2CActionHandler.class, this.updateOrderC2CActionHandlerProvider);
            e11.b(CreateOrderV2ActionHandler.class, this.createOrderV2ActionHandlerProvider);
            e11.b(AppendProductsActionHandler.class, this.appendProductsActionHandlerProvider);
            e11.b(ReplaceProductsActionHandler.class, this.replaceProductsActionHandlerProvider);
            e11.b(SubmitBloggerPostActionHandler.class, this.submitBloggerPostActionHandlerProvider);
            e11.b(RemoveCartSplitActionHandler.class, this.removeCartSplitActionHandlerProvider);
            e11.b(AddToCartActionHandler.class, this.addToCartActionHandlerProvider);
            e11.b(PerformTwoActionsHandler.class, this.performTwoActionsHandlerProvider);
            e11.b(AddToCartResponseActionWithActionHandler.class, this.addToCartResponseActionWithActionHandlerProvider);
            e11.b(CmlComposerActionWithActionHandler.class, this.cmlComposerActionWithActionHandlerProvider);
            e11.b(CmlOrderActionHandler.class, this.cmlOrderActionHandlerProvider);
            e11.b(CmlUpdatePassportActionHandler.class, this.cmlUpdatePassportActionHandlerProvider);
            e11.b(CmlValidatePassportActionHandler.class, this.cmlValidatePassportActionHandlerProvider);
            e11.b(SendReviewActionHandlerV1.class, this.sendReviewActionHandlerV1Provider);
            e11.b(SendReviewActionHandlerV2.class, this.sendReviewActionHandlerV2Provider);
            e11.b(SendRatingOnlyActionHandler.class, this.sendRatingOnlyActionHandlerProvider);
            return e11.a();
        }

        @Override // ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentDependencies
        public Map<Class<?>, a<Vg.f>> getCustomWidgetActionHandler() {
            return CustomActionHandlerModule_Companion_ProvidesCustomWidgetActionHandlerFactory.providesCustomWidgetActionHandler(getCustomActionHandler(), setOfWidgetCustomActionHandler());
        }

        @Override // ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies
        public Map<Class<?>, a<E00.a>> getEmptyStateInterceptors() {
            return AbstractC5881z.u(this.pdpOfflineScreenFactoryProvider, this.barcodeFullScreenOfflineFactoryProvider, this.emptyScreenWithBarcodeFactoryProvider);
        }

        @Override // ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies
        public Map<Class<?>, a<C00.a>> getInitialWidgetsProviders() {
            return AbstractC5881z.s(this.defaultInitialWidgetsProvider, this.emptyInitialWidgetProvider);
        }

        @Override // ru.ozon.app.android.data.markdown.MarkDownApi
        public MarkDownParser getMarkDownParser() {
            return new MarkDownParser(this.provideMarkWonProvider.get());
        }

        @Override // ru.ozon.app.android.commonwidgets.widgets.restrictions.di.RestrictionsComponentApi
        public RestrictionsAppStore getRestrictionsAppStore() {
            RestrictionsAppStore restrictionsAppStore = this.restrictionsComponentApi.getRestrictionsAppStore();
            j.c(restrictionsAppStore);
            return restrictionsAppStore;
        }

        @Override // ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies
        public Set<Widget> getWidgets() {
            A.a m11 = A.m(52);
            m11.l(provideExportWidgets());
            m11.l(provideWidgets());
            m11.j(provideSearchResultsSortV2Widget());
            m11.l(provideWidget());
            m11.l(provideWidgets2());
            m11.l(provideWidget2());
            m11.l(provideExportOldWidgets());
            m11.j(provideFormPageWidget());
            m11.j(provideSmsSignWidget());
            m11.j(provideFormPageLandingLimitWidget());
            m11.j(provideContractBtnWidget());
            m11.j(provideAllToCartWidget());
            m11.j(provideWidget3());
            m11.j(provideWidget4());
            m11.l(provideWidget5());
            m11.l(provideWidget6());
            m11.l(provideStorefrontWidgets());
            m11.j(provideWidget7());
            m11.l(provideWidget8());
            m11.l(provideWidget9());
            m11.j(provideStickyBehaviorBarrierWidget());
            m11.j(provideCloseButtonWidget());
            m11.j(provideLogosListWidget());
            m11.j(provideMasterWidget());
            m11.j(provideActivateCodeWidget());
            m11.j(provideTabsV2Widget());
            m11.j(providePromoBannerV2Widget());
            m11.j(provideNavigationBlocksV2Widget());
            m11.l(provideExportWidgets2());
            m11.j(provideRoundedCellsModuleWidget());
            m11.j(provideTwoCardsWidget());
            m11.j(provideIconButtonWidget());
            m11.j(provideHeader$header_prodGoogleAllVendorsRelease());
            m11.j(provideWidget10());
            m11.j(provideWidget11());
            m11.j(provideWidget12());
            m11.j(provideLogoutOnAllDevicesWidget());
            m11.j(provideWidget13());
            m11.l(provideWidget14());
            m11.j(provideConfirmDeleteOtp());
            m11.j(provideDeleteAccountDescription());
            m11.j(provideDeleteAccountButton());
            m11.j(provideEditCredentialsWidget());
            m11.j(provideOtpWidget());
            m11.l(provideWidget15());
            m11.j(provideWidget16());
            m11.j(provideWidget17());
            m11.l(provideWidget18());
            m11.j(provideDiscountCodeWidget());
            m11.j(provideAnnotationWidget());
            m11.j(provideCurtainWidget());
            m11.j(provideDiscountCodeWidget2());
            return m11.m();
        }

        @Override // ru.ozon.app.android.datePicker.di.DatePickerDialogFragmentComponent
        public void inject(DatePickerDialogFragment datePickerDialogFragment) {
            injectDatePickerDialogFragment(datePickerDialogFragment);
        }

        @Override // ru.ozon.app.android.deeplinks.di.DeeplinkActivityComponentDependencies
        public KeepActivityHandler keepActivityHandler() {
            return this.provideKeepDeeplinkActivityOnExternalDeeplinkProvider.get();
        }

        private IDaggerComponentImpl(AutoPickerExportModule autoPickerExportModule, ActionInitializeModule actionInitializeModule, ComposerInterceptorFactoryModule composerInterceptorFactoryModule, NamespaceModule namespaceModule, ReturnEditNavigationModule returnEditNavigationModule, HowToReturnGoodsNavigationModule howToReturnGoodsNavigationModule, ReturnCreationNavigationModule returnCreationNavigationModule, CmlOrdersNavigationModule cmlOrdersNavigationModule, CmlDeliveryNavigationModule cmlDeliveryNavigationModule, MessengerFeatureModule messengerFeatureModule, RemovePostModule removePostModule, PikazonModule pikazonModule, CsmaButtonCommonModule csmaButtonCommonModule, ScreenBrightnessChangerModule screenBrightnessChangerModule, ActivateCodeWidgetModule activateCodeWidgetModule, SelectLinkWidgetModule selectLinkWidgetModule, LogoutOnAllDevicesWidgetModule logoutOnAllDevicesWidgetModule, ContextComponentDependencies contextComponentDependencies, IDaggerComponentDependencies iDaggerComponentDependencies, NavigationComponentApi navigationComponentApi, StorageComponentApi storageComponentApi, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, NetworkOzonIdComponentApi networkOzonIdComponentApi, WhitelistComponentApi whitelistComponentApi, CacheComponentApi cacheComponentApi, BarcodeCacheComponentApi barcodeCacheComponentApi, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, NotificationComponentApi notificationComponentApi, PushComponentApi pushComponentApi, AndroidPlatformComponentApi androidPlatformComponentApi, AccountComponentApi accountComponentApi, AppLocaleComponentApi appLocaleComponentApi, LocationComponentApi locationComponentApi, CartComponentApi cartComponentApi, TabsComponentApi tabsComponentApi, WebComponentApi webComponentApi, VideoComponentApi videoComponentApi, CartServiceApi cartServiceApi, CartAtomBinderComponentApi cartAtomBinderComponentApi, AddressComponentApi addressComponentApi, DebugMenuComponentApi debugMenuComponentApi, OzonDebugMenuComponentApi ozonDebugMenuComponentApi, ComposerComponentApi composerComponentApi, MediaUploadComponentApi mediaUploadComponentApi, AdvertisingMessagingApi advertisingMessagingApi, FreshNavigationComponentApi freshNavigationComponentApi, FreshComponentApi freshComponentApi, FintechLibApi fintechLibApi, SearchComponentApi searchComponentApi, FavoriteCoreComponentApi favoriteCoreComponentApi, FavoriteComponentApi favoriteComponentApi, SwitchingButtonComponentApi switchingButtonComponentApi, VideoCoverComponentApi videoCoverComponentApi, OzonMapComponentApi ozonMapComponentApi, MinifyLinkComponentApi minifyLinkComponentApi, RmsComponentApi rmsComponentApi, PdfFileComponentApi pdfFileComponentApi, CouponComponentApi couponComponentApi, ThirdPartyLibrariesConfigComponentApi thirdPartyLibrariesConfigComponentApi, InAppUpdateComponentApi inAppUpdateComponentApi, ActionComponentApi actionComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, CheckoutPrefetchApi checkoutPrefetchApi, RestrictionsComponentApi restrictionsComponentApi, CheckoutCommonComponentApi checkoutCommonComponentApi, CheckoutPaymentComponentApi checkoutPaymentComponentApi, ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, GeoProviderComponentApi geoProviderComponentApi, MapCommonComponentApi mapCommonComponentApi, CdnVideoComponentApi cdnVideoComponentApi, AuthComponentApi authComponentApi, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, CdnHostManagerComponentApi cdnHostManagerComponentApi, CloseFlowWatcherComponentApi closeFlowWatcherComponentApi, OnboardingCheckerComponentApi onboardingCheckerComponentApi, SearchPrefetchApi searchPrefetchApi, FavoritesUIComponentApi favoritesUIComponentApi, FavoritesDataComponentApi favoritesDataComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, CommonActionHandlersFactoryComponentApi commonActionHandlersFactoryComponentApi, PdpScreenStateHolderComponentApi pdpScreenStateHolderComponentApi, StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, StatusEdoStateComponentApi statusEdoStateComponentApi, InterceptorPredicatesComponentApi interceptorPredicatesComponentApi, OrderShipmentComponentApi orderShipmentComponentApi, PdpOfflineScreenComponentApi pdpOfflineScreenComponentApi, TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, DeeplinkRouteComponentApi deeplinkRouteComponentApi, MorkovskOnboardingComponentApi morkovskOnboardingComponentApi, UgcRatingComponentApi ugcRatingComponentApi, TilesDomainComponentApi tilesDomainComponentApi, UgcReviewFormComponentApi ugcReviewFormComponentApi, SelectionsCoreComponentApi selectionsCoreComponentApi, TravelStorageApi travelStorageApi, Limb2ComponentApi limb2ComponentApi, SentryApiComponent sentryApiComponent, AppOnboardingComponentApi appOnboardingComponentApi, CmlDomainComponentApi cmlDomainComponentApi, CmlDeliveryComponentApi cmlDeliveryComponentApi, NotificationStatusComponentApi notificationStatusComponentApi, StorefrontCommonComponentApi storefrontCommonComponentApi, Resources resources) {
            this.iDaggerComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.navigationComponentApi = navigationComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.networkOzonIdComponentApi = networkOzonIdComponentApi;
            this.accountComponentApi = accountComponentApi;
            this.actionComponentApi = actionComponentApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.coroutineDispatchersComponentApi = coroutineDispatchersComponentApi;
            this.androidPlatformComponentApi = androidPlatformComponentApi;
            this.travelStorageApi = travelStorageApi;
            this.pushComponentApi = pushComponentApi;
            this.appLocaleComponentApi = appLocaleComponentApi;
            this.checkoutPaymentComponentApi = checkoutPaymentComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            this.cartServiceApi = cartServiceApi;
            this.notificationStatusComponentApi = notificationStatusComponentApi;
            this.pdfFileComponentApi = pdfFileComponentApi;
            this.deeplinkRouteComponentApi = deeplinkRouteComponentApi;
            this.favoriteCoreComponentApi = favoriteCoreComponentApi;
            this.removePostModule = removePostModule;
            this.onboardingCheckerComponentApi = onboardingCheckerComponentApi;
            this.favoritesUIComponentApi = favoritesUIComponentApi;
            this.selectionsCoreComponentApi = selectionsCoreComponentApi;
            this.tilesDomainComponentApi = tilesDomainComponentApi;
            this.searchPrefetchApi = searchPrefetchApi;
            this.cartComponentApi = cartComponentApi;
            this.statusEdoStateComponentApi = statusEdoStateComponentApi;
            this.tabsComponentApi = tabsComponentApi;
            this.authComponentApi = authComponentApi;
            this.morkovskOnboardingComponentApi = morkovskOnboardingComponentApi;
            this.cmlDomainComponentApi = cmlDomainComponentApi;
            this.autoPickerExportModule = autoPickerExportModule;
            this.couponComponentApi = couponComponentApi;
            this.favoriteComponentApi = favoriteComponentApi;
            this.favoritesDataComponentApi = favoritesDataComponentApi;
            this.cartAtomBinderComponentApi = cartAtomBinderComponentApi;
            this.checkoutPrefetchApi = checkoutPrefetchApi;
            this.restrictionsComponentApi = restrictionsComponentApi;
            this.activateCodeWidgetModule = activateCodeWidgetModule;
            this.minifyLinkComponentApi = minifyLinkComponentApi;
            this.commonActionHandlersFactoryComponentApi = commonActionHandlersFactoryComponentApi;
            this.selectLinkWidgetModule = selectLinkWidgetModule;
            this.logoutOnAllDevicesWidgetModule = logoutOnAllDevicesWidgetModule;
            this.addressComponentApi = addressComponentApi;
            this.freshNavigationComponentApi = freshNavigationComponentApi;
            this.inAppUpdateComponentApi = inAppUpdateComponentApi;
            this.locationComponentApi = locationComponentApi;
            this.mediaUploadComponentApi = mediaUploadComponentApi;
            this.rmsComponentApi = rmsComponentApi;
            this.composerComponentApi = composerComponentApi;
            this.pdpScreenStateHolderComponentApi = pdpScreenStateHolderComponentApi;
            this.pdpOfflineScreenComponentApi = pdpOfflineScreenComponentApi;
            this.ugcReviewFormComponentApi = ugcReviewFormComponentApi;
            this.videoComponentApi = videoComponentApi;
            this.legalsResultStateHolderComponentApi = legalsResultStateHolderComponentApi;
            this.checkoutCommonComponentApi = checkoutCommonComponentApi;
            this.notificationComponentApi = notificationComponentApi;
            this.barcodeCacheComponentApi = barcodeCacheComponentApi;
            this.csmaButtonCommonModule = csmaButtonCommonModule;
            this.screenBrightnessChangerModule = screenBrightnessChangerModule;
            this.orderShipmentComponentApi = orderShipmentComponentApi;
            this.iDaggerComponentDependencies = iDaggerComponentDependencies;
            this.actionInitializeModule = actionInitializeModule;
            this.limb2ComponentApi = limb2ComponentApi;
            this.whitelistComponentApi = whitelistComponentApi;
            this.fintechLibApi = fintechLibApi;
            this.webComponentApi = webComponentApi;
            this.messengerFeatureModule = messengerFeatureModule;
            this.namespaceModule = namespaceModule;
            this.interceptorPredicatesComponentApi = interceptorPredicatesComponentApi;
            this.debugMenuComponentApi = debugMenuComponentApi;
            this.ozonDebugMenuComponentApi = ozonDebugMenuComponentApi;
            this.returnEditNavigationModule = returnEditNavigationModule;
            this.howToReturnGoodsNavigationModule = howToReturnGoodsNavigationModule;
            this.returnCreationNavigationModule = returnCreationNavigationModule;
            this.storefrontCommonComponentApi = storefrontCommonComponentApi;
            this.cmlOrdersNavigationModule = cmlOrdersNavigationModule;
            this.cmlDeliveryNavigationModule = cmlDeliveryNavigationModule;
            this.cdnHostManagerComponentApi = cdnHostManagerComponentApi;
            this.pikazonModule = pikazonModule;
            this.imagesAnalyticsComponentApi = imagesAnalyticsComponentApi;
            this.composerInterceptorFactoryModule = composerInterceptorFactoryModule;
            this.advertisingMessagingApi = advertisingMessagingApi;
            this.freshComponentApi = freshComponentApi;
            this.startupTimeTrackerComponentApi = startupTimeTrackerComponentApi;
            initialize(autoPickerExportModule, actionInitializeModule, composerInterceptorFactoryModule, namespaceModule, returnEditNavigationModule, howToReturnGoodsNavigationModule, returnCreationNavigationModule, cmlOrdersNavigationModule, cmlDeliveryNavigationModule, messengerFeatureModule, removePostModule, pikazonModule, csmaButtonCommonModule, screenBrightnessChangerModule, activateCodeWidgetModule, selectLinkWidgetModule, logoutOnAllDevicesWidgetModule, contextComponentDependencies, iDaggerComponentDependencies, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, whitelistComponentApi, cacheComponentApi, barcodeCacheComponentApi, firebaseAnalyticsComponentApi, notificationComponentApi, pushComponentApi, androidPlatformComponentApi, accountComponentApi, appLocaleComponentApi, locationComponentApi, cartComponentApi, tabsComponentApi, webComponentApi, videoComponentApi, cartServiceApi, cartAtomBinderComponentApi, addressComponentApi, debugMenuComponentApi, ozonDebugMenuComponentApi, composerComponentApi, mediaUploadComponentApi, advertisingMessagingApi, freshNavigationComponentApi, freshComponentApi, fintechLibApi, searchComponentApi, favoriteCoreComponentApi, favoriteComponentApi, switchingButtonComponentApi, videoCoverComponentApi, ozonMapComponentApi, minifyLinkComponentApi, rmsComponentApi, pdfFileComponentApi, couponComponentApi, thirdPartyLibrariesConfigComponentApi, inAppUpdateComponentApi, actionComponentApi, customActionHandlersComponentApi, checkoutPrefetchApi, restrictionsComponentApi, checkoutCommonComponentApi, checkoutPaymentComponentApi, composerWidgetAsyncComponentApi, geoProviderComponentApi, mapCommonComponentApi, cdnVideoComponentApi, authComponentApi, coroutineDispatchersComponentApi, cdnHostManagerComponentApi, closeFlowWatcherComponentApi, onboardingCheckerComponentApi, searchPrefetchApi, favoritesUIComponentApi, favoritesDataComponentApi, imagesAnalyticsComponentApi, commonActionHandlersFactoryComponentApi, pdpScreenStateHolderComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, legalsResultStateHolderComponentApi, statusEdoStateComponentApi, interceptorPredicatesComponentApi, orderShipmentComponentApi, pdpOfflineScreenComponentApi, travelPushOnboardingComponentApi, deeplinkRouteComponentApi, morkovskOnboardingComponentApi, ugcRatingComponentApi, tilesDomainComponentApi, ugcReviewFormComponentApi, selectionsCoreComponentApi, travelStorageApi, limb2ComponentApi, sentryApiComponent, appOnboardingComponentApi, cmlDomainComponentApi, cmlDeliveryComponentApi, notificationStatusComponentApi, storefrontCommonComponentApi, resources);
            initialize2(autoPickerExportModule, actionInitializeModule, composerInterceptorFactoryModule, namespaceModule, returnEditNavigationModule, howToReturnGoodsNavigationModule, returnCreationNavigationModule, cmlOrdersNavigationModule, cmlDeliveryNavigationModule, messengerFeatureModule, removePostModule, pikazonModule, csmaButtonCommonModule, screenBrightnessChangerModule, activateCodeWidgetModule, selectLinkWidgetModule, logoutOnAllDevicesWidgetModule, contextComponentDependencies, iDaggerComponentDependencies, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, whitelistComponentApi, cacheComponentApi, barcodeCacheComponentApi, firebaseAnalyticsComponentApi, notificationComponentApi, pushComponentApi, androidPlatformComponentApi, accountComponentApi, appLocaleComponentApi, locationComponentApi, cartComponentApi, tabsComponentApi, webComponentApi, videoComponentApi, cartServiceApi, cartAtomBinderComponentApi, addressComponentApi, debugMenuComponentApi, ozonDebugMenuComponentApi, composerComponentApi, mediaUploadComponentApi, advertisingMessagingApi, freshNavigationComponentApi, freshComponentApi, fintechLibApi, searchComponentApi, favoriteCoreComponentApi, favoriteComponentApi, switchingButtonComponentApi, videoCoverComponentApi, ozonMapComponentApi, minifyLinkComponentApi, rmsComponentApi, pdfFileComponentApi, couponComponentApi, thirdPartyLibrariesConfigComponentApi, inAppUpdateComponentApi, actionComponentApi, customActionHandlersComponentApi, checkoutPrefetchApi, restrictionsComponentApi, checkoutCommonComponentApi, checkoutPaymentComponentApi, composerWidgetAsyncComponentApi, geoProviderComponentApi, mapCommonComponentApi, cdnVideoComponentApi, authComponentApi, coroutineDispatchersComponentApi, cdnHostManagerComponentApi, closeFlowWatcherComponentApi, onboardingCheckerComponentApi, searchPrefetchApi, favoritesUIComponentApi, favoritesDataComponentApi, imagesAnalyticsComponentApi, commonActionHandlersFactoryComponentApi, pdpScreenStateHolderComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, legalsResultStateHolderComponentApi, statusEdoStateComponentApi, interceptorPredicatesComponentApi, orderShipmentComponentApi, pdpOfflineScreenComponentApi, travelPushOnboardingComponentApi, deeplinkRouteComponentApi, morkovskOnboardingComponentApi, ugcRatingComponentApi, tilesDomainComponentApi, ugcReviewFormComponentApi, selectionsCoreComponentApi, travelStorageApi, limb2ComponentApi, sentryApiComponent, appOnboardingComponentApi, cmlDomainComponentApi, cmlDeliveryComponentApi, notificationStatusComponentApi, storefrontCommonComponentApi, resources);
            initialize3(autoPickerExportModule, actionInitializeModule, composerInterceptorFactoryModule, namespaceModule, returnEditNavigationModule, howToReturnGoodsNavigationModule, returnCreationNavigationModule, cmlOrdersNavigationModule, cmlDeliveryNavigationModule, messengerFeatureModule, removePostModule, pikazonModule, csmaButtonCommonModule, screenBrightnessChangerModule, activateCodeWidgetModule, selectLinkWidgetModule, logoutOnAllDevicesWidgetModule, contextComponentDependencies, iDaggerComponentDependencies, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, whitelistComponentApi, cacheComponentApi, barcodeCacheComponentApi, firebaseAnalyticsComponentApi, notificationComponentApi, pushComponentApi, androidPlatformComponentApi, accountComponentApi, appLocaleComponentApi, locationComponentApi, cartComponentApi, tabsComponentApi, webComponentApi, videoComponentApi, cartServiceApi, cartAtomBinderComponentApi, addressComponentApi, debugMenuComponentApi, ozonDebugMenuComponentApi, composerComponentApi, mediaUploadComponentApi, advertisingMessagingApi, freshNavigationComponentApi, freshComponentApi, fintechLibApi, searchComponentApi, favoriteCoreComponentApi, favoriteComponentApi, switchingButtonComponentApi, videoCoverComponentApi, ozonMapComponentApi, minifyLinkComponentApi, rmsComponentApi, pdfFileComponentApi, couponComponentApi, thirdPartyLibrariesConfigComponentApi, inAppUpdateComponentApi, actionComponentApi, customActionHandlersComponentApi, checkoutPrefetchApi, restrictionsComponentApi, checkoutCommonComponentApi, checkoutPaymentComponentApi, composerWidgetAsyncComponentApi, geoProviderComponentApi, mapCommonComponentApi, cdnVideoComponentApi, authComponentApi, coroutineDispatchersComponentApi, cdnHostManagerComponentApi, closeFlowWatcherComponentApi, onboardingCheckerComponentApi, searchPrefetchApi, favoritesUIComponentApi, favoritesDataComponentApi, imagesAnalyticsComponentApi, commonActionHandlersFactoryComponentApi, pdpScreenStateHolderComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, legalsResultStateHolderComponentApi, statusEdoStateComponentApi, interceptorPredicatesComponentApi, orderShipmentComponentApi, pdpOfflineScreenComponentApi, travelPushOnboardingComponentApi, deeplinkRouteComponentApi, morkovskOnboardingComponentApi, ugcRatingComponentApi, tilesDomainComponentApi, ugcReviewFormComponentApi, selectionsCoreComponentApi, travelStorageApi, limb2ComponentApi, sentryApiComponent, appOnboardingComponentApi, cmlDomainComponentApi, cmlDeliveryComponentApi, notificationStatusComponentApi, storefrontCommonComponentApi, resources);
            initialize4(autoPickerExportModule, actionInitializeModule, composerInterceptorFactoryModule, namespaceModule, returnEditNavigationModule, howToReturnGoodsNavigationModule, returnCreationNavigationModule, cmlOrdersNavigationModule, cmlDeliveryNavigationModule, messengerFeatureModule, removePostModule, pikazonModule, csmaButtonCommonModule, screenBrightnessChangerModule, activateCodeWidgetModule, selectLinkWidgetModule, logoutOnAllDevicesWidgetModule, contextComponentDependencies, iDaggerComponentDependencies, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, whitelistComponentApi, cacheComponentApi, barcodeCacheComponentApi, firebaseAnalyticsComponentApi, notificationComponentApi, pushComponentApi, androidPlatformComponentApi, accountComponentApi, appLocaleComponentApi, locationComponentApi, cartComponentApi, tabsComponentApi, webComponentApi, videoComponentApi, cartServiceApi, cartAtomBinderComponentApi, addressComponentApi, debugMenuComponentApi, ozonDebugMenuComponentApi, composerComponentApi, mediaUploadComponentApi, advertisingMessagingApi, freshNavigationComponentApi, freshComponentApi, fintechLibApi, searchComponentApi, favoriteCoreComponentApi, favoriteComponentApi, switchingButtonComponentApi, videoCoverComponentApi, ozonMapComponentApi, minifyLinkComponentApi, rmsComponentApi, pdfFileComponentApi, couponComponentApi, thirdPartyLibrariesConfigComponentApi, inAppUpdateComponentApi, actionComponentApi, customActionHandlersComponentApi, checkoutPrefetchApi, restrictionsComponentApi, checkoutCommonComponentApi, checkoutPaymentComponentApi, composerWidgetAsyncComponentApi, geoProviderComponentApi, mapCommonComponentApi, cdnVideoComponentApi, authComponentApi, coroutineDispatchersComponentApi, cdnHostManagerComponentApi, closeFlowWatcherComponentApi, onboardingCheckerComponentApi, searchPrefetchApi, favoritesUIComponentApi, favoritesDataComponentApi, imagesAnalyticsComponentApi, commonActionHandlersFactoryComponentApi, pdpScreenStateHolderComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, legalsResultStateHolderComponentApi, statusEdoStateComponentApi, interceptorPredicatesComponentApi, orderShipmentComponentApi, pdpOfflineScreenComponentApi, travelPushOnboardingComponentApi, deeplinkRouteComponentApi, morkovskOnboardingComponentApi, ugcRatingComponentApi, tilesDomainComponentApi, ugcReviewFormComponentApi, selectionsCoreComponentApi, travelStorageApi, limb2ComponentApi, sentryApiComponent, appOnboardingComponentApi, cmlDomainComponentApi, cmlDeliveryComponentApi, notificationStatusComponentApi, storefrontCommonComponentApi, resources);
            initialize5(autoPickerExportModule, actionInitializeModule, composerInterceptorFactoryModule, namespaceModule, returnEditNavigationModule, howToReturnGoodsNavigationModule, returnCreationNavigationModule, cmlOrdersNavigationModule, cmlDeliveryNavigationModule, messengerFeatureModule, removePostModule, pikazonModule, csmaButtonCommonModule, screenBrightnessChangerModule, activateCodeWidgetModule, selectLinkWidgetModule, logoutOnAllDevicesWidgetModule, contextComponentDependencies, iDaggerComponentDependencies, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, whitelistComponentApi, cacheComponentApi, barcodeCacheComponentApi, firebaseAnalyticsComponentApi, notificationComponentApi, pushComponentApi, androidPlatformComponentApi, accountComponentApi, appLocaleComponentApi, locationComponentApi, cartComponentApi, tabsComponentApi, webComponentApi, videoComponentApi, cartServiceApi, cartAtomBinderComponentApi, addressComponentApi, debugMenuComponentApi, ozonDebugMenuComponentApi, composerComponentApi, mediaUploadComponentApi, advertisingMessagingApi, freshNavigationComponentApi, freshComponentApi, fintechLibApi, searchComponentApi, favoriteCoreComponentApi, favoriteComponentApi, switchingButtonComponentApi, videoCoverComponentApi, ozonMapComponentApi, minifyLinkComponentApi, rmsComponentApi, pdfFileComponentApi, couponComponentApi, thirdPartyLibrariesConfigComponentApi, inAppUpdateComponentApi, actionComponentApi, customActionHandlersComponentApi, checkoutPrefetchApi, restrictionsComponentApi, checkoutCommonComponentApi, checkoutPaymentComponentApi, composerWidgetAsyncComponentApi, geoProviderComponentApi, mapCommonComponentApi, cdnVideoComponentApi, authComponentApi, coroutineDispatchersComponentApi, cdnHostManagerComponentApi, closeFlowWatcherComponentApi, onboardingCheckerComponentApi, searchPrefetchApi, favoritesUIComponentApi, favoritesDataComponentApi, imagesAnalyticsComponentApi, commonActionHandlersFactoryComponentApi, pdpScreenStateHolderComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, legalsResultStateHolderComponentApi, statusEdoStateComponentApi, interceptorPredicatesComponentApi, orderShipmentComponentApi, pdpOfflineScreenComponentApi, travelPushOnboardingComponentApi, deeplinkRouteComponentApi, morkovskOnboardingComponentApi, ugcRatingComponentApi, tilesDomainComponentApi, ugcReviewFormComponentApi, selectionsCoreComponentApi, travelStorageApi, limb2ComponentApi, sentryApiComponent, appOnboardingComponentApi, cmlDomainComponentApi, cmlDeliveryComponentApi, notificationStatusComponentApi, storefrontCommonComponentApi, resources);
            initialize6(autoPickerExportModule, actionInitializeModule, composerInterceptorFactoryModule, namespaceModule, returnEditNavigationModule, howToReturnGoodsNavigationModule, returnCreationNavigationModule, cmlOrdersNavigationModule, cmlDeliveryNavigationModule, messengerFeatureModule, removePostModule, pikazonModule, csmaButtonCommonModule, screenBrightnessChangerModule, activateCodeWidgetModule, selectLinkWidgetModule, logoutOnAllDevicesWidgetModule, contextComponentDependencies, iDaggerComponentDependencies, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, whitelistComponentApi, cacheComponentApi, barcodeCacheComponentApi, firebaseAnalyticsComponentApi, notificationComponentApi, pushComponentApi, androidPlatformComponentApi, accountComponentApi, appLocaleComponentApi, locationComponentApi, cartComponentApi, tabsComponentApi, webComponentApi, videoComponentApi, cartServiceApi, cartAtomBinderComponentApi, addressComponentApi, debugMenuComponentApi, ozonDebugMenuComponentApi, composerComponentApi, mediaUploadComponentApi, advertisingMessagingApi, freshNavigationComponentApi, freshComponentApi, fintechLibApi, searchComponentApi, favoriteCoreComponentApi, favoriteComponentApi, switchingButtonComponentApi, videoCoverComponentApi, ozonMapComponentApi, minifyLinkComponentApi, rmsComponentApi, pdfFileComponentApi, couponComponentApi, thirdPartyLibrariesConfigComponentApi, inAppUpdateComponentApi, actionComponentApi, customActionHandlersComponentApi, checkoutPrefetchApi, restrictionsComponentApi, checkoutCommonComponentApi, checkoutPaymentComponentApi, composerWidgetAsyncComponentApi, geoProviderComponentApi, mapCommonComponentApi, cdnVideoComponentApi, authComponentApi, coroutineDispatchersComponentApi, cdnHostManagerComponentApi, closeFlowWatcherComponentApi, onboardingCheckerComponentApi, searchPrefetchApi, favoritesUIComponentApi, favoritesDataComponentApi, imagesAnalyticsComponentApi, commonActionHandlersFactoryComponentApi, pdpScreenStateHolderComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, legalsResultStateHolderComponentApi, statusEdoStateComponentApi, interceptorPredicatesComponentApi, orderShipmentComponentApi, pdpOfflineScreenComponentApi, travelPushOnboardingComponentApi, deeplinkRouteComponentApi, morkovskOnboardingComponentApi, ugcRatingComponentApi, tilesDomainComponentApi, ugcReviewFormComponentApi, selectionsCoreComponentApi, travelStorageApi, limb2ComponentApi, sentryApiComponent, appOnboardingComponentApi, cmlDomainComponentApi, cmlDeliveryComponentApi, notificationStatusComponentApi, storefrontCommonComponentApi, resources);
            initialize7(autoPickerExportModule, actionInitializeModule, composerInterceptorFactoryModule, namespaceModule, returnEditNavigationModule, howToReturnGoodsNavigationModule, returnCreationNavigationModule, cmlOrdersNavigationModule, cmlDeliveryNavigationModule, messengerFeatureModule, removePostModule, pikazonModule, csmaButtonCommonModule, screenBrightnessChangerModule, activateCodeWidgetModule, selectLinkWidgetModule, logoutOnAllDevicesWidgetModule, contextComponentDependencies, iDaggerComponentDependencies, navigationComponentApi, storageComponentApi, composerDebugMenuHostApiComponent, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, whitelistComponentApi, cacheComponentApi, barcodeCacheComponentApi, firebaseAnalyticsComponentApi, notificationComponentApi, pushComponentApi, androidPlatformComponentApi, accountComponentApi, appLocaleComponentApi, locationComponentApi, cartComponentApi, tabsComponentApi, webComponentApi, videoComponentApi, cartServiceApi, cartAtomBinderComponentApi, addressComponentApi, debugMenuComponentApi, ozonDebugMenuComponentApi, composerComponentApi, mediaUploadComponentApi, advertisingMessagingApi, freshNavigationComponentApi, freshComponentApi, fintechLibApi, searchComponentApi, favoriteCoreComponentApi, favoriteComponentApi, switchingButtonComponentApi, videoCoverComponentApi, ozonMapComponentApi, minifyLinkComponentApi, rmsComponentApi, pdfFileComponentApi, couponComponentApi, thirdPartyLibrariesConfigComponentApi, inAppUpdateComponentApi, actionComponentApi, customActionHandlersComponentApi, checkoutPrefetchApi, restrictionsComponentApi, checkoutCommonComponentApi, checkoutPaymentComponentApi, composerWidgetAsyncComponentApi, geoProviderComponentApi, mapCommonComponentApi, cdnVideoComponentApi, authComponentApi, coroutineDispatchersComponentApi, cdnHostManagerComponentApi, closeFlowWatcherComponentApi, onboardingCheckerComponentApi, searchPrefetchApi, favoritesUIComponentApi, favoritesDataComponentApi, imagesAnalyticsComponentApi, commonActionHandlersFactoryComponentApi, pdpScreenStateHolderComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, legalsResultStateHolderComponentApi, statusEdoStateComponentApi, interceptorPredicatesComponentApi, orderShipmentComponentApi, pdpOfflineScreenComponentApi, travelPushOnboardingComponentApi, deeplinkRouteComponentApi, morkovskOnboardingComponentApi, ugcRatingComponentApi, tilesDomainComponentApi, ugcReviewFormComponentApi, selectionsCoreComponentApi, travelStorageApi, limb2ComponentApi, sentryApiComponent, appOnboardingComponentApi, cmlDomainComponentApi, cmlDeliveryComponentApi, notificationStatusComponentApi, storefrontCommonComponentApi, resources);
        }
    }

    public static IDaggerComponent.Factory factory() {
        return new Factory(0);
    }
}
