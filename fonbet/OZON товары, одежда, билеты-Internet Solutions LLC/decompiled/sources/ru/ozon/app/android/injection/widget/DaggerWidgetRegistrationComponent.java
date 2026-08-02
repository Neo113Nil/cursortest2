package ru.ozon.app.android.injection.widget;

import Jb.d;
import Pc.a;
import android.app.Application;
import android.content.Context;
import com.google.common.collect.A;
import com.squareup.moshi.Moshi;
import hi.InterfaceC6958a;
import java.util.Set;
import l20.c;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.composerCommonViewKit.plainText.core.PlainTextConfig;
import ru.ozon.app.android.account.orders.activeorderscount.ActiveOrdersCountConfig;
import ru.ozon.app.android.account.orders.activeorderscount.ActiveOrdersCountWidgetModule;
import ru.ozon.app.android.account.orders.activeorderscount.ActiveOrdersCountWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.barcode.BarcodeConfig;
import ru.ozon.app.android.account.orders.barcode.di.BarcodeWidgetModule;
import ru.ozon.app.android.account.orders.barcode.di.BarcodeWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeViewMapper;
import ru.ozon.app.android.account.orders.barcodePopover.v1.core.BarcodePopoverConfig;
import ru.ozon.app.android.account.orders.barcodePopover.v1.di.BarcodePopoverWidgetModule;
import ru.ozon.app.android.account.orders.barcodePopover.v1.di.BarcodePopoverWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.barcodePopover.v1.presentation.BarcodePopoverViewMapper;
import ru.ozon.app.android.account.orders.buttonv2.core.ActionButtonV2Config;
import ru.ozon.app.android.account.orders.buttonv2.di.ActionButtonV2WidgetModule;
import ru.ozon.app.android.account.orders.buttonv2.di.ActionButtonV2WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.buttonv2.presentation.ActionButtonV2OverlayWidgetViewMapper;
import ru.ozon.app.android.account.orders.cancelpostingsv2.core.CancelPostingsV2Config;
import ru.ozon.app.android.account.orders.cancelpostingsv2.core.CancelPostingsV2Parser;
import ru.ozon.app.android.account.orders.cancelpostingsv2.di.CancelPostingsV2Module_Companion_ProvideCancelPostingsV2$cs_orders_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.account.orders.changeDeliveryTimeButton.data.ChangeDeliveryTimeButtonConfig;
import ru.ozon.app.android.account.orders.changeDeliveryTimeButton.di.ChangeDeliveryTimeButtonModule;
import ru.ozon.app.android.account.orders.changeDeliveryTimeButton.di.ChangeDeliveryTimeButtonModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.changeDeliveryTimeButton.presentation.ChangeDeliveryTimeButtonViewMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.ClickToDeliveryModalConfig;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.delivery.DeliveryViewMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryModalWidgetModule;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryModalWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.commonBarcode.CommonBarcodeConfig;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth.CommonBarcodeFullWidthViewMapper;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded.CommonBarcodeViewMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.DeliveryDateChangedComplaintFormConfig;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.input.DeliveryDateChangedComplaintFormInputViewMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.reason.DeliveryDateChangedComplaintFormReasonViewMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.title.DeliveryDateChangedComplaintFormTitleViewMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormModule;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.di.OrdersCommonModule;
import ru.ozon.app.android.account.orders.di.OrdersCommonModule_ProvideCommonTeeth$cs_orders_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.account.orders.di.OrdersCommonModule_ProvideComposeWidgets$cs_orders_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.account.orders.di.OrdersCommonModule_ProvideOfflineFintechBanner$cs_orders_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.account.orders.di.OrdersCommonModule_ProvideWidgetFactory$cs_orders_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.account.orders.di.OrdersCommonModule_ProvideWidgets$cs_orders_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.account.orders.emptyscreen.fintech.core.OfflineFintechBannerConfig;
import ru.ozon.app.android.account.orders.emptyscreen.fintech.core.OfflineFintechBannerViewMapper;
import ru.ozon.app.android.account.orders.emptyscreen.internalteeth.InternalTeethConfig;
import ru.ozon.app.android.account.orders.emptyscreen.internalteeth.InternalTeethViewMapper;
import ru.ozon.app.android.account.orders.navBarItem.data.NavBarItemConfig;
import ru.ozon.app.android.account.orders.navBarItem.di.NavBarModule;
import ru.ozon.app.android.account.orders.navBarItem.di.NavBarModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.navBarItem.presentation.NavBarItemViewMapper;
import ru.ozon.app.android.account.orders.orderProduct.core.OrderProductsConfig;
import ru.ozon.app.android.account.orders.orderProduct.di.OrderProductsWidgetModule;
import ru.ozon.app.android.account.orders.orderProduct.di.OrderProductsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.orderProduct.presentation.item.OrderProductItemViewMapper;
import ru.ozon.app.android.account.orders.orderProduct.presentation.separator.OrderProductSeparatorViewMapper;
import ru.ozon.app.android.account.orders.orderfilters.core.OrderFiltersConfig;
import ru.ozon.app.android.account.orders.orderfilters.core.OrderFiltersViewMapper;
import ru.ozon.app.android.account.orders.orderfilters.di.OrderFiltersModule;
import ru.ozon.app.android.account.orders.orderfilters.di.OrderFiltersModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.ordergallery.core.OrderGalleryConfig;
import ru.ozon.app.android.account.orders.ordergallery.core.OrderGalleryViewMapper;
import ru.ozon.app.android.account.orders.ordergallery.di.OrderGalleryWidgetModule;
import ru.ozon.app.android.account.orders.ordergallery.di.OrderGalleryWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.orderlist.v2.OrderListViewMapper;
import ru.ozon.app.android.account.orders.orderlist.v2.data.OrderListConfig;
import ru.ozon.app.android.account.orders.orderlist.v2.di.OrderListModule;
import ru.ozon.app.android.account.orders.orderlist.v2.di.OrderListModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.productsPackage.data.ProductsPackageConfig;
import ru.ozon.app.android.account.orders.productsPackage.di.ProductsPackageModule;
import ru.ozon.app.android.account.orders.productsPackage.di.ProductsPackageModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.productsPackage.presentation.ProductsPackageViewMapper;
import ru.ozon.app.android.account.orders.recipientWidget.RecipientConfig;
import ru.ozon.app.android.account.orders.recipientWidget.di.RecipientWidgetModule;
import ru.ozon.app.android.account.orders.recipientWidget.di.RecipientWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewMapper;
import ru.ozon.app.android.account.orders.selectPayment.data.SelectPaymentConfig;
import ru.ozon.app.android.account.orders.selectPayment.di.SelectPaymentModule;
import ru.ozon.app.android.account.orders.selectPayment.di.SelectPaymentModule_ProvideWidgetFactory;
import ru.ozon.app.android.account.orders.selectPayment.presentation.SelectPaymentOverlayViewMapper;
import ru.ozon.app.android.account.orders.selectPayment.presentation.SelectPaymentViewMapper;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4Config;
import ru.ozon.app.android.ads.widgets.advBanner.v4.di.AdvBannerV4DiModule_ProvideWidgetFactory;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewMapper;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.single.AdvBannerV4PlainSingleViewMapper;
import ru.ozon.app.android.ads.widgets.advInfo.data.AdvInfoConfig;
import ru.ozon.app.android.ads.widgets.advInfo.data.AdvInfoMapper;
import ru.ozon.app.android.ads.widgets.advInfo.di.AdvInfoDiModule_ProvideAdvInfoFactory;
import ru.ozon.app.android.ads.widgets.advInfo.presentation.AdvInfoViewMapper;
import ru.ozon.app.android.ads.widgets.advPageStay.data.AdvPageStayConfig;
import ru.ozon.app.android.ads.widgets.advPageStay.di.AdvPageStayDiModule;
import ru.ozon.app.android.ads.widgets.advPageStay.di.AdvPageStayDiModule_ProvideAdvRefreshWithDelayFactory;
import ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayViewMapper;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.data.AdvRefreshWithDelayConfig;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.di.AdvRefreshWithDelayDiModule_ProvideAdvRefreshWithDelayFactory;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.AdvRefreshWithDelayViewMapper;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2Config;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2NewViewMapper;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.di.AdvVideoBannerV2WidgetDiModule_ProvideWidgetFactory;
import ru.ozon.app.android.bank.widgets.aboutInstallment.core.AboutInstallmentConfig;
import ru.ozon.app.android.bank.widgets.aboutInstallment.core.AboutInstallmentViewMapper;
import ru.ozon.app.android.bank.widgets.adBanner.core.AdBannerConfig;
import ru.ozon.app.android.bank.widgets.adBanner.core.AdBannerViewMapper;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.core.BankAccountStatusConfig;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.core.BankAccountStatusViewMapper;
import ru.ozon.app.android.bank.widgets.cbottom.core.CbottomWidgetConfig;
import ru.ozon.app.android.bank.widgets.cbottom.core.CbottomWidgetViewMapper;
import ru.ozon.app.android.bank.widgets.di.OzonBankWidgetModule_ProvideOzonBankWidgets$ozonbank_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.bank.widgets.installmentPayment.core.InstallmentPaymentConfig;
import ru.ozon.app.android.bank.widgets.installmentPayment.core.InstallmentPaymentViewMapper;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.core.InstallmentPaymentScheduleConfig;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.core.InstallmentPaymentScheduleViewMapper;
import ru.ozon.app.android.bank.widgets.openBankAccount.core.OpenBankAccountConfig;
import ru.ozon.app.android.bank.widgets.openBankAccount.core.OpenBankAccountViewMapper;
import ru.ozon.app.android.bank.widgets.premiumPoints.core.PremiumPointsConfig;
import ru.ozon.app.android.bank.widgets.premiumPoints.core.PremiumPointsViewMapper;
import ru.ozon.app.android.bank.widgets.productStarsTile.core.ProductStarsTileViewMapper;
import ru.ozon.app.android.bank.widgets.starPoints.core.StarPointsConfig;
import ru.ozon.app.android.bank.widgets.starPoints.core.StarPointsViewMapper;
import ru.ozon.app.android.barcode.barcodeProductsList.core.BarcodeProductsListConfig;
import ru.ozon.app.android.barcode.barcodeProductsList.di.BarcodeProductsListWidgetModule;
import ru.ozon.app.android.barcode.barcodeProductsList.di.BarcodeProductsListWidgetModule_ProvideWidget$barcode_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewMapper.BarcodeProductsListWidgetMapper;
import ru.ozon.app.android.button.core.ActionButtonConfig;
import ru.ozon.app.android.button.core.ActionButtonOverlayViewMapper;
import ru.ozon.app.android.button.core.ActionButtonViewMapper;
import ru.ozon.app.android.button.di.ActionButtonModule;
import ru.ozon.app.android.button.di.ActionButtonModule_ProvideWidgetFactory;
import ru.ozon.app.android.cabinet.di.DeliveryCabinetWidgetV2Module;
import ru.ozon.app.android.cabinet.di.DeliveryCabinetWidgetV2Module_ProvideWidgets$cabinet_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.cart.async.core.AsyncConfig;
import ru.ozon.app.android.cart.async.di.AsyncWidgetModule;
import ru.ozon.app.android.cart.async.di.AsyncWidgetModule_ProvideAsyncWidgetFactory;
import ru.ozon.app.android.cart.async.presentation.AsyncViewMapper;
import ru.ozon.app.android.cart.cartButtonWithTooltip.data.CartButtonWithTooltipConfig;
import ru.ozon.app.android.cart.cartButtonWithTooltip.di.CartButtonWithTooltipModule_ProvideCartButtonWithTooltipWidgetFactory;
import ru.ozon.app.android.cart.cartButtonWithTooltip.presentation.CartButtonWithTooltipViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2Config;
import ru.ozon.app.android.cart.cartSplitV2.v1.di.CartSplitV2Module;
import ru.ozon.app.android.cart.cartSplitV2.v1.di.CartSplitV2Module_ProvideCartSplitV2WidgetFactory;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.CartSplitV2TitleViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2SubWidgetsConfig;
import ru.ozon.app.android.cart.cartSplitV2.v2.di.CartSplitV2ModuleV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.di.CartSplitV2ModuleV2_ProvideCartSplitV2WidgetFactory;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.CartSplitV2CellItemViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.CartSplitV2HeaderViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductViewMapper;
import ru.ozon.app.android.cart.checkoutPrefetch.data.CheckoutPrefetchConfig;
import ru.ozon.app.android.cart.checkoutPrefetch.di.CheckoutPrefetchWidgetModule;
import ru.ozon.app.android.cart.checkoutPrefetch.di.CheckoutPrefetchWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.cart.checkoutPrefetch.presentation.CheckoutPrefetchViewMapper;
import ru.ozon.app.android.cart.controls.v2.data.ControlsConfig;
import ru.ozon.app.android.cart.controls.v2.di.ControlsModule;
import ru.ozon.app.android.cart.controls.v2.di.ControlsModule_ProvideControlsWidgetFactory;
import ru.ozon.app.android.cart.controls.v2.presentation.ControlsViewMapper;
import ru.ozon.app.android.cart.controls.v3.data.ControlsV3Config;
import ru.ozon.app.android.cart.controls.v3.di.ControlsV3Module;
import ru.ozon.app.android.cart.controls.v3.di.ControlsV3Module_ProvideControlsWidgetFactory;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3ViewMapper;
import ru.ozon.app.android.cart.di.CartWidget2Module;
import ru.ozon.app.android.cart.di.CartWidget2Module_ProvideComposeWidgetsFactory;
import ru.ozon.app.android.cart.di.CartWidget2Module_ProvideMarketingDetailWidgetFactory;
import ru.ozon.app.android.cart.emptyCart.core.v2.data.EmptyCartV2Config;
import ru.ozon.app.android.cart.emptyCart.core.v2.di.EmptyCartV2Module;
import ru.ozon.app.android.cart.emptyCart.core.v2.di.EmptyCartV2Module_ProvideEmptyCartV2Factory;
import ru.ozon.app.android.cart.emptyCart.core.v2.presentation.EmptyCartV2ViewMapper;
import ru.ozon.app.android.cart.emptyoverlay.presentation.EmptyOverlayViewMapper;
import ru.ozon.app.android.cart.familyGroup.di.FamilyGroupWidgetModule_ProvideWidgetFactories$cart_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailWidgetConfig;
import ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailWidgetViewMapper;
import ru.ozon.app.android.cart.master.data.MasterConfig;
import ru.ozon.app.android.cart.master.di.MasterWidgetModule;
import ru.ozon.app.android.cart.master.di.MasterWidgetModule_ProvideMasterWidgetFactory;
import ru.ozon.app.android.cart.master.presentation.MasterViewMapper;
import ru.ozon.app.android.cart.pixel.core.PixelConfig;
import ru.ozon.app.android.cart.pixel.di.PixelModule;
import ru.ozon.app.android.cart.pixel.di.PixelModule_ProvidePixelWidgetFactory;
import ru.ozon.app.android.cart.pixel.presentation.PixelViewMapper;
import ru.ozon.app.android.cart.postRender.di.PostRenderWidgetModule_ProvideWidgetFactories$cart_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.cart.premiumPointsTrainV2.data.PremiumPointsTrainConfigV2;
import ru.ozon.app.android.cart.premiumPointsTrainV2.di.PremiumPointsTrainV2Module;
import ru.ozon.app.android.cart.premiumPointsTrainV2.di.PremiumPointsTrainV2Module_ProvideWidget$cart_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.PremiumPointsTrainV2MultipleViewMapper;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.singleCarriageTrain.PremiumPointsTrainV2SingleViewMapper;
import ru.ozon.app.android.cart.totalV3.core.TotalConfig;
import ru.ozon.app.android.cart.totalV3.di.TotalV3WidgetModule;
import ru.ozon.app.android.cart.totalV3.di.TotalV3WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.cart.totalV3.presentation.TotalViewMapper;
import ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module;
import ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module_ProvideComposeWidgets$checkout_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.checkoutcomposer.di.CheckoutWidget2Module_ProvideWidgets$checkout_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.checkoutorderdone.di.OrderDoneWidgets2Module;
import ru.ozon.app.android.checkoutorderdone.di.OrderDoneWidgets2Module_ProvideComposeWidgetsFactory;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.core.OrderDoneDisclaimerConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.core.OrderDoneDisclaimerWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di.OrderDoneDisclaimerWidgetModule;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di.OrderDoneDisclaimerWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.core.EnableNotificationsSnackbarConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.core.EnableNotificationsSnackbarWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.di.EnableNotificationsSnackbarWidgetModule;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.di.EnableNotificationsSnackbarWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarStickyWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di.OrderDoneButtonBarWidgetModule;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di.OrderDoneButtonBarWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.core.OrderDoneCrossButtonConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.core.OrderDoneCrossButtonWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.di.OrderDoneCrossButtonWidgetModule;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.di.OrderDoneCrossButtonWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.core.OrderDonePaymentStatusConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.core.OrderDonePaymentStatusViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.di.OrderDonePaymentStatusWidgetModule;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.di.OrderDonePaymentStatusWidgetModule_ProvideWidget$orderdone_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.core.OrderDoneTotalConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.core.OrderDoneTotalElementViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.di.OrderDoneTotalWidgetModule;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.di.OrderDoneTotalWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.boxList.data.BoxListConfig;
import ru.ozon.app.android.cml.delivery.widgets.boxList.data.BoxListParser;
import ru.ozon.app.android.cml.delivery.widgets.boxList.di.BoxListWidgetModule_ProvideBoxListWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.mapper.BoxListViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.mapper.SelectButtonViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.CmlCellListConfig;
import ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListModule_ProvideCmlCellListWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.cellList.viewMapper.CellListViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.data.ParcelPhotoAddConfig;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.di.ParcelPhotoAddModule_ProvideParcelPhotoAddWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.input.data.InputWidgetConfig;
import ru.ozon.app.android.cml.delivery.widgets.input.di.InputWidgetModule_ProvideInputWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.data.InputCurtainConfig;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.di.InputCurtainModule_ProvideInputWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.InputCurtainViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.di.OrderWidgetModule_ProvideOrderWidgetV1Factory;
import ru.ozon.app.android.cml.delivery.widgets.order.di.OrderWidgetModule_ProvideOrderWidgetV2Factory;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.data.OrderCalculatorConfig;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.di.OrderCalculatorModule_ProvideOrderCalculatorWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.OrderCalculatorViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.orderGeoInfo.data.OrderGeoInfoConfig;
import ru.ozon.app.android.cml.delivery.widgets.orderGeoInfo.di.OrderGeoInfoModule_ProvideOrderGeoInfoWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.orderGeoInfo.presentation.OrderGeoInfoViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.data.ParticipantPhoneConfig;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.di.ParticipantPhoneModule_ProvideParticipantPhoneWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di.PersonalInfoVerificationModule_ProvidePersonalInfoVerificationWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.data.RegionSearchConfig;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.di.RegionSearchModule_ProvideRegionSearchWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.RegionSearchViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.searchBar.di.SearchBarModule_ProvideSearchBarWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.secureDeal.data.SecureDealConfig;
import ru.ozon.app.android.cml.delivery.widgets.secureDeal.di.SecureDealModule_ProvideSecureDealWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.secureDeal.presentation.SecureDealViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.SecureDealCurtainConfig;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.SecureDealCurtainParser;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di.SecureDealCurtainModule_ProvideSecureDealCurtainWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.buttons.SecureDealButtonsViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal.SecureDealDataViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.selectCategory.data.SelectCategoryConfig;
import ru.ozon.app.android.cml.delivery.widgets.selectCategory.di.SelectCategoryModule_ProvideSelectCategoryWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.selectCategory.presentation.SelectCategoryViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.stickyButton.data.StickyButtonConfig;
import ru.ozon.app.android.cml.delivery.widgets.stickyButton.di.StickyButtonModule_ProvideStickyButtonWidgetFactory;
import ru.ozon.app.android.cml.delivery.widgets.stickyButton.presentation.StickyButtonViewMapper;
import ru.ozon.app.android.common.buttonwidget.core.ButtonConfig;
import ru.ozon.app.android.common.buttonwidget.core.ButtonV2ViewMapper;
import ru.ozon.app.android.common.buttonwidget.core.ButtonV3ViewMapper;
import ru.ozon.app.android.common.buttonwidget.core.ButtonViewMapper;
import ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetV2Module_ProvideButtonWidget$button_widget_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.common.buttonwidget.sticky.ButtonViewStickyNoUIMapper;
import ru.ozon.app.android.common.buttonwidget.sticky.ButtonViewV3StickyNoUIMapper;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.di.FiltersWidgetV2Module_ProvideFiltersWidget$filter_widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.boolfilter.BoolFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.BrandAspectsViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandFilter.bottom.BrandBottomViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandFilter.cells.BrandCellViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandFilter.title.BrandTitleViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.footer.CategoryFooterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.item.CategoryItemViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.AspectsColorFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.CircleColorFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.SquareColorFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.commonseparator.CommonSeparatorViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.disclosure.DisclosureViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.islandSeparator.FiltersIslandSeparatorViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter.MultipleRangesViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.button.FilterButtonViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar.FilterNavBarViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.openRangeFilter.OpenRangeFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter.RangeFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.TagFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter.TextInputFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.timerangefilter.TimeRangeFilterViewMapper;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.FilterValuesConfig;
import ru.ozon.app.android.common.filterWidgets.filtervalues.di.FilterValuesModule_ProvideFiltersWidget$filter_widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesNoUiViewMapper;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.common.progressivemolecula.core.ProgressiveTextConfig;
import ru.ozon.app.android.common.progressivemolecula.core.ProgressiveTextOverlayViewMapper;
import ru.ozon.app.android.common.progressivemolecula.core.ProgressiveTextViewMapper;
import ru.ozon.app.android.common.progressivemolecula.di.ProgressiveTextModule;
import ru.ozon.app.android.common.progressivemolecula.di.ProgressiveTextModule_ProvideProgressiveTextWidget$progressive_molecula_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.common.serviceCarousel.core.ServiceCarouselViewMapper;
import ru.ozon.app.android.common.taglist.di.TagListModule_ProvideTagListFactory;
import ru.ozon.app.android.common.taglist.taglistv2.presentation.flexboxtaglist.FlexboxTagListWidgetViewMapper;
import ru.ozon.app.android.common.taglist.taglistv2.presentation.scrollingtaglist.ScrollingTagListWidgetViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.data.TagListV3Config;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.flexbox.FlexboxTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.flexbox.StickyFlexboxTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.HidingStickyScrollingTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.ScrollingTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.StickyScrollingTagListV3ViewMapper;
import ru.ozon.app.android.common.ui.actionCards.core.ActionCardsConfig;
import ru.ozon.app.android.common.ui.actionCards.core.ActionCardsViewMapper;
import ru.ozon.app.android.common.ui.actionCards.di.ActionCardsModule;
import ru.ozon.app.android.common.ui.actionCards.di.ActionCardsModule_ProvideActionCardsWidget$action_cards_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.commonwidgets.di.CommonWidgetsV2DiModule_ProvideComposeWidgets$widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.commonwidgets.di.CommonWidgetsV2DiModule_ProvideWidget$widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.commonwidgets.di.CommonWidgetsV2DiModule_ProvideWidgetFactory$widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.commonwidgets.di.CurtainSettingsWidgetsModule_ProvideWidget$widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.commonwidgets.di.StorefrontCommonV2Module_ProvideWidget$commonwidgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.commonwidgets.widgets.actionTrigger.data.ActionTriggerConfig;
import ru.ozon.app.android.commonwidgets.widgets.actionTrigger.di.ActionTriggerWidgetModule_ProvideAnnotationWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.actionTrigger.presentation.ActionTriggerViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.data.BorderlessButtonConfig;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di.BorderlessButtonWidgetModule;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di.BorderlessButtonWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.mapper.BorderlessButtonViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cellListV2.core.CellListV2Config;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.data.CurtainContentConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.di.CurtainContentWidgetModule_ProvideAnnotationWidgetFactory;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation.CurtainContentViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.curtainHeader.core.CurtainHeaderConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtainHeader.core.CurtainHeaderViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.core.CurtainSettingsConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.core.CurtainSettingsViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.error.data.ErrorConfig;
import ru.ozon.app.android.commonwidgets.widgets.error.presentation.ErrorViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.core.IconButtonWidgetConfig;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.core.IconButtonWidgetViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.serviceCarousel.data.ServiceCarouselConfig;
import ru.ozon.app.android.composer.di.modules.DefaultWidgetsModule;
import ru.ozon.app.android.composer.di.modules.DefaultWidgetsModule_DefaultWidgets$composer_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.courieronmap.data.CourierOnMapConfig;
import ru.ozon.app.android.courieronmap.di.CourierOnMapModule_Companion_ProvideWidget$courieronmap_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.courieronmap.presentation.CourierOnMapViewMapper;
import ru.ozon.app.android.cscore.copybutton.CopyButtonConfig;
import ru.ozon.app.android.cscore.copybutton.CopyButtonViewMapper;
import ru.ozon.app.android.cscore.extendBackground.core.ExtendBackgroundConfig;
import ru.ozon.app.android.cscore.extendBackground.di.ExtendBackgroundWidgetModule;
import ru.ozon.app.android.cscore.extendBackground.di.ExtendBackgroundWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.cscore.extendBackground.presentation.ExtendBackgroundViewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.data.TipCourierDetailsConfig;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di.TipCourierDetailsV2Module;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di.TipCourierDetailsV2Module_ProvideWidgetFactory;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button.TipCourierDetailButtonViewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsTipsViewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.data.TipCourierHeaderConfig;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.di.TipCourierHeaderWidgetModule;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.di.TipCourierHeaderWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.overlay.TipCourierHeaderOverlayViewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.simple.TipCourierHeaderViewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.data.TipProductPhotosConfig;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.di.TipProductPhotosModule;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.di.TipProductPhotosModule_ProvideWidgetFactory;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation.TipProductPhotosViewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewV2Config;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di.TipCourierReviewV2WidgetModule;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di.TipCourierReviewV2WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.button.TipCourierReviewOverlayViewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.TipCourierReviewViewMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.DeliveryReviewFormConfig;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidget2Module;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidget2Module_ProvideDeliveryReviewFormWidgetFactory;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.footer.DeliveryReviewFormFooterViewMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.header.DeliveryReviewFormHeaderViewMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormItemViewMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewHeader.data.DeliveryReviewHeaderConfig;
import ru.ozon.app.android.deliveryreview.deliveryReviewHeader.di.DeliveryReviewHeaderModule;
import ru.ozon.app.android.deliveryreview.deliveryReviewHeader.di.DeliveryReviewHeaderModule_ProvideDeliveryReviewHeaderWidget$deliveryreview_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation.DeliveryReviewHeaderViewMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewSuccess.data.DeliveryReviewSuccessConfig;
import ru.ozon.app.android.deliveryreview.deliveryReviewSuccess.di.DeliveryReviewSuccessModule;
import ru.ozon.app.android.deliveryreview.deliveryReviewSuccess.di.DeliveryReviewSuccessModule_ProvideDeliveryReviewSuccessWidget$deliveryreview_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.deliveryreview.deliveryReviewSuccess.presentation.DeliveryReviewSuccessViewMapper;
import ru.ozon.app.android.di.IslandSeparatorWidgetModule_ProvideIslandSeparatorWidgetFactory;
import ru.ozon.app.android.faq.accordion.presentation.FaqAccordionViewMapper;
import ru.ozon.app.android.faq.di.FaqWidgetModule;
import ru.ozon.app.android.faq.di.FaqWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlConfig;
import ru.ozon.app.android.favorites.accesscontrol.di.AccessControlWidgetModule_ProvideAccessControlWidgetFactory;
import ru.ozon.app.android.favorites.accesscontrol.presentation.item.AccessControlViewMapper;
import ru.ozon.app.android.favorites.accesscontrol.presentation.users.AccessControlUserViewMapper;
import ru.ozon.app.android.favorites.applyWishlist.data.ApplyWishlistConfig;
import ru.ozon.app.android.favorites.applyWishlist.di.ApplyWishlistModule_ProvideApplyWishlistWidgetFactory;
import ru.ozon.app.android.favorites.applyWishlist.presentation.ApplyWishlistViewMapper;
import ru.ozon.app.android.favorites.buttonStack.data.ButtonStackConfig;
import ru.ozon.app.android.favorites.buttonStack.di.ButtonStackWidgetModule_ProvideButtonStackWidgetFactory;
import ru.ozon.app.android.favorites.buttonStack.presentation.ButtonStackViewMapper;
import ru.ozon.app.android.favorites.buttonStack.presentation.OverlayStickyBannerViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.data.CreateShoppingListConfig;
import ru.ozon.app.android.favorites.createshoppinglist.di.CreateShoppingListModule_ProvideCreateShoppingListWidgetFactory;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSaveButtonViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSuggestItemViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSuggestTitleViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListTitleViewMapper;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.spacer.CreateShoppingListSpacerViewMapper;
import ru.ozon.app.android.favorites.familyProfileAvatar.data.FamilyProfileAvatarConfig;
import ru.ozon.app.android.favorites.familyProfileAvatar.di.FamilyProfileAvatarModule_ProvideFamilyProfileAvatarWidgetFactory;
import ru.ozon.app.android.favorites.familyProfileAvatar.presentation.FamilyProfileAvatarViewMapper;
import ru.ozon.app.android.favorites.favoriteproduct.v2.data.FavoriteProductV2Config;
import ru.ozon.app.android.favorites.favoriteproduct.v2.di.FavoriteProductV2WidgetModule;
import ru.ozon.app.android.favorites.favoriteproduct.v2.di.FavoriteProductV2WidgetModule_ProvideFavoriteProductV2WidgetFactory;
import ru.ozon.app.android.favorites.favoriteproduct.v2.ui.FavoriteProductV2WidgetViewMapper;
import ru.ozon.app.android.favorites.shoppinglistv2.data.ShoppingListsV2Config;
import ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2Module_ProvideShoppingListsV2WidgetFactory;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.createlist.ShoppingListsV2CreateListViewMapper;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.item.ShoppingListsV2ItemViewMapper;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.title.ShoppingListsV2TitleViewMapper;
import ru.ozon.app.android.favorites.wishlistMultiselect.data.WishlistMultiselectConfig;
import ru.ozon.app.android.favorites.wishlistMultiselect.di.WishlistMultiselectModule_ProvideWishlistMultiselectWidgetFactory;
import ru.ozon.app.android.favorites.wishlistMultiselect.presentation.WishlistMultiselectNoUiViewMapper;
import ru.ozon.app.android.fresh.cart.di.FreshCartWidgetsModule;
import ru.ozon.app.android.fresh.cart.di.FreshCartWidgetsModule_ProvideComposeWidgetSet$widgets_cart_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.fresh.cart.widgets.cartClickTile.data.CartClickTileConfig;
import ru.ozon.app.android.fresh.cart.widgets.cartClickTile.di.CartClickTileWidgetModule;
import ru.ozon.app.android.fresh.cart.widgets.cartClickTile.di.CartClickTileWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.cart.widgets.cartClickTile.presentation.CartClickTileViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.data.CartControlsConfig;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.di.CartControlsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.cartIconButton.data.CartIconButtonConfig;
import ru.ozon.app.android.fresh.cart.widgets.cartIconButton.di.CartIconButtonWidgetModule;
import ru.ozon.app.android.fresh.cart.widgets.cartIconButton.di.CartIconButtonWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.cart.widgets.cartIconButton.presentation.CartIconButtonViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.data.CartMasterConfig;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.di.CartMasterWidgetModule;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.di.CartMasterWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.presentation.CartMasterViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.data.CartTileConfig;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.di.CartTileWidgetModule;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.di.CartTileWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.checkoutMaster.data.CheckoutMasterConfig;
import ru.ozon.app.android.fresh.cart.widgets.checkoutMaster.di.CheckoutMasterWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.data.ReorderTileConfig;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.di.ReorderTileWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.data.StickyTotalConfig;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalWidgetModule;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalOverlayViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewMapper;
import ru.ozon.app.android.fresh.chat.di.FreshChatWidgetsModule_ProvideComposeWidgetSet$chat_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.fresh.chat.widgets.messageBubble.core.MessageBubbleConfig;
import ru.ozon.app.android.fresh.chat.widgets.messageBubble.core.MessageBubbleViewMapper;
import ru.ozon.app.android.fresh.chat.widgets.messageBubble.di.MessageBubbleWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.core.PromptStatusConfig;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.core.PromptStatusViewMapper;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.di.PromptStatusWidgetModule;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.di.PromptStatusWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.core.PromptSuggestionsConfig;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.core.PromptSuggestionsViewMapper;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.di.PromptSuggestionsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.chat.widgets.responseActions.core.ResponseActionsConfig;
import ru.ozon.app.android.fresh.chat.widgets.responseActions.core.ResponseActionsViewMapper;
import ru.ozon.app.android.fresh.chat.widgets.responseActions.di.ResponseActionsWidgetModule;
import ru.ozon.app.android.fresh.chat.widgets.responseActions.di.ResponseActionsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.data.CellListConfig;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.di.CellListWidgetModule;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.di.CellListWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.data.CheckoutProductsConfig;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.di.CheckoutProductsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation.CheckoutProductsViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.data.CheckoutStickyTotalConfig;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.di.CheckoutStickyTotalWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation.CheckoutStickyTotalOverlayViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.data.CheckoutTotalConfig;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.di.CheckoutTotalWidgetModule_ProvideTotalWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsConfig;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.di.DetailedCheckoutProductsWidgetModule;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.di.DetailedCheckoutProductsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation.DetailedCheckoutProductsViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.data.InputFormConfig;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.di.InputFormWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation.InputFormViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.data.FreshPaymentInfoConfig;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.di.FreshPaymentInfoWidgetModule_ProvidePaymentInfoV2WidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.FreshPaymentInfoViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsToggle.FreshPremiumPointsToggleConfig;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsToggle.FreshPremiumPointsToggleViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsToggle.FreshPremiumPointsToggleWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.data.FreshPremiumPointsTrainConfig;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.di.FreshPremiumPointsTrainWidgetModule_ProvideWidget$widgets_checkout_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.FreshPremiumPointsTrainMultipleViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.singleCarriageTrain.FreshPremiumPointsTrainSingleViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.searchBankList.data.SearchBankListConfig;
import ru.ozon.app.android.fresh.checkout.widgets.searchBankList.di.SearchBankListWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.searchBankList.mapper.SearchBankListViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.data.StickyOzonBankPromoConfig;
import ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.di.StickyOzonBankPromoWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.presentation.StickyOzonBankPromoOverlayViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.data.StickyPromoBadgeConfig;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.di.StickyPromoBadgeWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation.StickyPromoBadgeViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.data.TimeSlotsConfig;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.di.TimeSlotsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.presentation.TimeSlotsViewMapper;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;
import ru.ozon.app.android.fresh.feature.b2b.di.B2bComposeWidgetsFactoryModule_ProvideComposeWidgets$b2b_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.fresh.feature.b2b.di.B2bWidgetsModule_ProvideWidgets$b2b_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.core.AccompanyingDocsDownloadingConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsDownloadingViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.data.AccountListMobileConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.presentation.AccountListMobileViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.AddConsigneeConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.core.AddEdoButtonsViewMapperV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.core.AddEdoConfigV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.core.AddEdoFormViewMapperV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addLegal.core.AddLegalConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addLegal.presentation.AddLegalViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.bannerEdo.core.BannerEdoConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.bannerEdo.presentation.BannerEdoViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.core.ChangeEmailConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.core.CompanyCardConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation.CompanyCardViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.consigneeList.data.ConsigneeListConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.consigneeList.presentation.ConsigneeListViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.currentConsignee.data.CurrentConsigneeConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.currentConsignee.presentation.CurrentConsigneeViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.data.DocsTableConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.presentation.DocsTableViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.core.DocsTableV2Config;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.core.DocsTableV2DocumentViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.core.DocsTableV2TitleViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.core.DocsDeliveryFormConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.submitButton.DocsDeliverySubmitButtonViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.core.EdoProvidersConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.presentation.EdoProvidersViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.core.EdoDatePickerConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation.EdoDatePickerViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.employeesTable.data.EmployeesTableConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.employeesTable.presentation.EmployeesTableViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.core.FaqConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.core.LegalDetailsEditorConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.core.LegalDocsConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.emptyState.LegalDocsEmptyViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order.LegalDocsOrderViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.title.LegalDocsTitleViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.AddLegalAddressMobileConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.AddLegalAddressMobileViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.core.AddLegalInnMobileConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.core.AddLegalInnMobileViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.core.AddLegalMobileConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.core.AddLegalMobileViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.CheckLegalInfoConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation.CheckLegalInfoViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.core.RegistrationConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.core.RegistrationViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.data.UserLegalEntitiesConfigV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.presentation.UserLegalEntitiesViewMapperV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.data.UserLegalEntitiesConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.presentation.UserLegalEntitiesViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewMapper_Factory;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewMapper_MembersInjector;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.data.RoleInvitationCreatorConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content.RoleInvitationCreatorContentViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.submitButton.RoleInvitationCreatorSubmitViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.core.SimpleInfoConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.body.SimpleInfoBodyViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.footer.SimpleInfoFooterViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.data.StatusBannerConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.presentation.StatusBannerViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.StatusEdoConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.presentation.StatusEdoViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.trustFactors.core.TrustFactorsConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.trustFactors.presentation.TrustFactorsViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.VerificationEdoCheckingOperatorConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.presentation.VerificationEdoCheckingOperatorViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.data.VerificationEdoCheckingUserConfig;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation.VerificationEdoCheckingUserViewMapper;
import ru.ozon.app.android.fresh.geo.widgets.addressPopupButton.data.AddressPopupButtonConfig;
import ru.ozon.app.android.fresh.geo.widgets.addressPopupButton.di.AddressPopupButtonWidgetModule;
import ru.ozon.app.android.fresh.geo.widgets.addressPopupButton.di.AddressPopupButtonWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.geo.widgets.addressPopupButton.presentation.AddressPopupButtonViewMapper;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.data.DeliveryRatingConfig;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.di.DeliveryRatingWidgetModule;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.di.DeliveryRatingWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.presentation.DeliveryRatingNewDesignViewMapper;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.presentation.DeliveryRatingViewMapper;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.data.GeotrackingBottomButtonConfig;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.di.GeotrackingBottomButtonWidgetModule;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.di.GeotrackingBottomButtonWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.presentation.GeotrackingBottomButtonOverlapMapper;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.data.GeotrackingMapV2Config;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2WidgetModule;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewMapper;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.data.OrderInfoConfig;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.di.OrderInfoWidgetModule;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.di.OrderInfoWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.OrderInfoViewMapper;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.data.OrderItemsConfig;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.di.OrderItemsWidgetModule;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.di.OrderItemsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemsViewMapper;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.title.OrderItemsTitleViewMapper;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.data.OrderStatusV3Config;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.di.OrderStatusV3WidgetModule;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.di.OrderStatusV3WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusV3ViewMapper;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.data.AddressCommunicationConfig;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.di.AddressCommunicationWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.di.AddressCommunicationWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewMapper;
import ru.ozon.app.android.fresh.main.widgets.bannerList.data.BannerListConfig;
import ru.ozon.app.android.fresh.main.widgets.bannerList.di.BannerListWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.bannerList.di.BannerListWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.bannerList.presentation.BannerRowViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.di.CatalogShelfWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.di.CatalogShelfWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.header.CatalogShelfHeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfRowViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.optimized.CatalogShelfRowViewMapperNew;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.data.CatalogTileConfig;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.di.CatalogTileWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.di.CatalogTileWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.CatalogTileViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.CatalogTileScrollConfig;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.di.CatalogTileScrollWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.di.CatalogTileScrollWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.CatalogTileScrollViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di.CatalogueTabsWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di.CatalogueTabsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.viewMapper.CatalogueTabsViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.data.CatalogTabsV2Config;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di.CatalogTabsV2WidgetModule;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di.CatalogTabsV2WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.data.CouponGoalsV2Config;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.di.CouponGoalsV2WidgetModule;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.di.CouponGoalsV2WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.CouponGoalsV2ViewMapper;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.data.CurtainGoalsV2Config;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.di.CurtainGoalsV2WidgetModule;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.di.CurtainGoalsV2WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation.CurtainGoalsV2ViewMapper;
import ru.ozon.app.android.fresh.main.widgets.customCell.data.CustomCellConfig;
import ru.ozon.app.android.fresh.main.widgets.customCell.di.CustomCellWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.customCell.di.CustomCellWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.customCell.presentation.CustomCellViewMapper;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.data.FakeSearchConfig;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.di.FakeSearchWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.di.FakeSearchWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchViewMapper;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.data.FreshMiniappHeaderConfig;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.di.FreshMiniappHeaderWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.di.FreshMiniappHeaderWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation.FreshMiniappHeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.header.data.HeaderConfig;
import ru.ozon.app.android.fresh.main.widgets.header.di.HeaderWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.header.di.HeaderWidgetModule_ProvideHeaderApiFactory;
import ru.ozon.app.android.fresh.main.widgets.header.di.HeaderWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.header.presentation.HeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.data.ExpressNavigationSliderV2Config;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.header.ExpressNavigationSliderV2HeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items.ExpressNavigationSliderV2ItemsViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.separator.ExpressNavigationSliderV2SeparatorViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavSliderV3Parser;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavigationSliderV3Config;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.di.NavSliderV3WidgetModule;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.di.NavSliderV3WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.header.NavigationSliderV3HeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row.NavigationSliderV3RowViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.separator.NavigationSliderV3SeparatorViewMapper;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data.NotificationCarouselV2Config;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2WidgetModule;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewMapper;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.data.OrderTrackingConfig;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.di.OrderTrackingWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.di.OrderTrackingWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation.OrderTrackingViewMapper;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.di.ScrollWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.di.ScrollWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation.ScrollViewMapper;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselConfig;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselWidgetParser;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.di.PromoCarouselWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.di.PromoCarouselWidgetModule_ProvideParserFactory;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.di.PromoCarouselWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselViewMapper;
import ru.ozon.app.android.fresh.main.widgets.redirectButton.data.ExpressRedirectButtonConfig;
import ru.ozon.app.android.fresh.main.widgets.redirectButton.di.ExpressRedirectButtonWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.redirectButton.di.ExpressRedirectButtonWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.redirectButton.presentation.ExpressRedirectButtonViewMapper;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.data.ScrollActionListConfig;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.di.ScrollActionListModule;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.di.ScrollActionListModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.presentation.ScrollActionListViewMapper;
import ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.data.StickyPromoBannerConfig;
import ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.di.StickyPromoBannerWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.di.StickyPromoBannerWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.presentation.StickyPromoBannerViewMapper;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.core.WiseSkuScrollConfig;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.core.WiseSkuScrollViewMapper;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollWidgetModule;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.di.FreshUnsortedWidgetsModule;
import ru.ozon.app.android.fresh.unsorted.di.FreshUnsortedWidgetsModule_ProvideComposeWidgetSet$widgets_unsorted_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.data.AddressSelectorLiteConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.di.AddressSelectorLiteWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.di.AddressSelectorLiteWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.presentation.AddressSelectorLiteViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.data.AutoCatalogConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.di.AutoCatalogWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.di.AutoCatalogWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.presentation.AutoCatalogTileGridMediumViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.presentation.AutoCatalogTileGridMiniViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.data.BottomCartWidgetConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.di.BottomCartWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.di.BottomCartWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.BottomCartOverlayMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.data.BottomContainerConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.di.BottomContainerWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.di.BottomContainerWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.presentation.BottomContainerViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.data.BrandzoneCarouselConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.di.BrandzoneCarouselWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.di.BrandzoneCarouselWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.presentation.BrandzoneCarouselViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.data.CharityAddressSelectorConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.di.CharityAddressSelectorWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.di.CharityAddressSelectorWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.presentation.CharityAddressSelectorViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.data.CourierTipsConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.di.CourierTipsWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.data.DeliveryProblemsConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.di.DeliveryProblemsWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.di.DeliveryProblemsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.presentation.DeliveryProblemsViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.data.DeliveryToCharitiesInfoConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.di.DeliveryToCharitiesInfoModule;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.di.DeliveryToCharitiesInfoModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.presentation.DeliveryToCharitiesInfoViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.data.DeliveryWidgetV2Config;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.di.DeliveryWidgetV2Module;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.di.DeliveryWidgetV2Module_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2OverlayViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data.DeliveryWidgetV3Config;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.di.DeliveryWidgetV3Module;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.di.DeliveryWidgetV3Module_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.data.DeliveryWidgetV4Config;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.di.DeliveryWidgetV4Module_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidgetBigOzon.v1.DeliveryWidgetBigOzonConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidgetBigOzon.v1.DeliveryWidgetBigOzonModule;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidgetBigOzon.v1.DeliveryWidgetBigOzonModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.expressAvailability.data.ExpressAvailabilityConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.expressAvailability.di.ExpressAvailabilityWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.expressAvailability.di.ExpressAvailabilityWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.expressAvailability.presentation.ExpressAvailabilityViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.data.FeedbackCurtainConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.di.FeedbackCurtainWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.di.FeedbackCurtainWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.presentation.FeedbackCurtainViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.data.FlexButtonsConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.di.FlexButtonsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.presentation.FlexButtonsViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.data.FreshTileGridConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di.FreshTileGridWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di.FreshTileGridWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.FreshTileGridBaseViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.FreshTileGridMediumViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.FreshTileGridMiniViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.plug.FreshTileGridPlugViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.data.HomeButtonConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.di.HomeButtonWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.di.HomeButtonWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.data.IconButtonsConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.di.IconButtonsWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.di.IconButtonsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.iconButtons.presentation.IconButtonsViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.data.ImageBadgeListConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.di.ImageBadgeListWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.di.ImageBadgeListWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation.ImageBadgeListViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.data.InfoDropDownConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.di.InfoDropDownWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.di.InfoDropDownWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.presentation.InfoDropDownItemViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.core.FreshPaymentScheduleConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.core.FreshPaymentScheduleViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.di.FreshPaymentScheduleWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.data.IslandSeparatorConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.di.IslandSeparatorWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.di.IslandSeparatorWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.presentation.IslandSeparatorViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.data.ExpressNavBarConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.di.ExpressNavBarWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.di.ExpressNavBarWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.overlay.ExpressNavBarOverlayMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.navTitle.data.ExpressNavTitleConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.navTitle.di.ExpressNavTitleWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.navTitle.di.ExpressNavTitleWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.navTitle.presentation.ExpressNavTitleViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.data.OrderStatusLiveActivityConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.di.OrderStatusLiveActivityWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.di.OrderStatusLiveActivityWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.presentation.OrderStatusLiveActivityViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.data.PdpAspectsConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.di.PdpAspectsWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.di.PdpAspectsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation.PdpAspectsViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.data.PdpNutritionInfoConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.di.PdpNutritionInfoWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.di.PdpNutritionInfoWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.presentation.PdpNutritionInfoViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.data.ProductsInBotConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.data.ProductsInBotParser;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.di.ProductsInBotWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.di.ProductsInBotWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.button.BotConfirmButtonViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items.BotItemViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.data.ProductsInBotV2Config;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.di.ProductsInBotV2WidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.di.ProductsInBotV2WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2ViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.data.ProfileAvatarConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.di.ProfileAvatarWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.ProfileAvatarViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.data.ProfileTilesConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.di.ProfileTilesWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.ProfileTilesViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.data.PromoOfferConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.di.PromoOfferWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.di.PromoOfferWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation.PromoOfferViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.data.RecShelfConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.di.RecShelfWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.di.RecShelfWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.di.SearchBarWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.di.SearchBarWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.data.SeparatorBadgeConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.di.SeparatorBadgeWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.di.SeparatorBadgeWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.presentation.SeparatorBadgeViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.serviceCarousel.data.FreshServiceCarouselConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.serviceCarousel.di.FreshServiceCarouselWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.serviceCarousel.di.FreshServiceCarouselWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.data.SteppedThermometerConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.di.SteppedThermometerModule;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.di.SteppedThermometerModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation.SteppedThermometerViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.tagList.data.TagListConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.tagList.di.TagListWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.tagList.presentation.TagListViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.data.TextBlockConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.di.TextBlockWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.presentation.TextBlockViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.di.TextBlockV2WidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.data.WholeSaleConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.di.WholeSaleWidgetModule;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.di.WholeSaleWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.WholeSaleViewMapper;
import ru.ozon.app.android.geo.di.GeoWidget2Module;
import ru.ozon.app.android.geo.di.GeoWidget2Module_ProvideWidgets$geo_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.injection.widget.WidgetRegistrationComponent;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.marketing.di.MarketingWidgets2Module;
import ru.ozon.app.android.marketing.di.MarketingWidgets2Module_ProvideComposeWidgets$marketing_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.marketing.di.MarketingWidgets2Module_ProvideWidgets$marketing_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.marketing.di.MarketingWidgetsFactoryModule;
import ru.ozon.app.android.marketing.di.MarketingWidgetsFactoryModule_ProvideWidgets$marketing_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.marketing.widgets.actionProgress.core.ActionProgressConfig;
import ru.ozon.app.android.marketing.widgets.actionProgress.core.ActionProgressOverlayViewMapper;
import ru.ozon.app.android.marketing.widgets.badgeTimer.data.BadgeTimerConfig;
import ru.ozon.app.android.marketing.widgets.badgeTimer.presentation.BadgeTimerViewMapper;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.core.BigPromoCheckoutConfig;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.core.BigPromoCheckoutViewMapper;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.di.BigPromoCheckoutWidgetModule;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.di.BigPromoCheckoutWidgetModule_ProvideBigPromoWidgetFactory;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.core.BigPromoNavbarConfig;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.core.BigPromoNavbarViewMapper;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.di.BigPromoNavbarWidgetModule_ProvideBigPromoWidgetFactory;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.core.BigPromoPDPConfig;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.core.BigPromoPDPViewMapper;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.di.BigPromoPDPWidgetModule_ProvideBigPromoWidgetFactory;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusConfig;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusImageTitleViewMapper;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusTextTitleViewMapper;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.di.BlackFridayStatusModule_ProvideWidgetFactory;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.core.BlackFridayCounterConfig;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.core.BlackFridayCounterViewMapper;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.di.BlackFridayCounterModule_ProvideWidgetFactory;
import ru.ozon.app.android.marketing.widgets.cartButton.core.CartButtonViewMapper;
import ru.ozon.app.android.marketing.widgets.coupon.core.CouponConfig;
import ru.ozon.app.android.marketing.widgets.coupon.core.CouponViewMapper;
import ru.ozon.app.android.marketing.widgets.coupon.core.HighlightsCouponOverlayViewMapper;
import ru.ozon.app.android.marketing.widgets.enableNotifications.core.EnableNotificationsConfig;
import ru.ozon.app.android.marketing.widgets.enableNotifications.core.EnableNotificationsViewMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3BodyViewMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3Config;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3GradientHeaderViewMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3HeaderViewMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3Parser;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3WidgetModule_ProvideHammersWidgetFactory;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3WidgetModule_ProvideParserFactory;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.core.OldHammersV3BodyViewMapper;
import ru.ozon.app.android.marketing.widgets.highlightProducts.core.HighlightProductsConfig;
import ru.ozon.app.android.marketing.widgets.highlightProducts.core.HighlightProductsOverlayViewMapper;
import ru.ozon.app.android.marketing.widgets.highlightProducts.core.HighlightProductsViewMapper;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperConfig;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.NotificationsSettingsConfig;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.NotificationsSettingsSelectorConfig;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.cell.NotificationsSettingsCellViewMapper;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.selector.NotificationsSettingsSelectorViewMapper;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.title.NotificationsSettingsTitleViewMapper;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.core.PdpCouponListV2Config;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.core.PdpCouponListV2ViewMapper;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.core.PromoStickyBubbleConfig;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsLadder.core.SellerActionLadderConfig;
import ru.ozon.app.android.marketing.widgets.sellerActionsLadder.core.SellerActionLadderViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.SellerActionPreviewConfig;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.SellerActionsPreviewDtoToDtoWrapperMapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.async.SellerActionPreviewAsyncViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.dsCell.SellerActionPreviewDsCellViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.progressLadder.SellerActionPreviewProgressLadderViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.progressLadderCell.SellerActionPreviewProgressLadderCellViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.separator.SellerActionPreviewSeparatorViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.core.SellerTransparencyProfileConfig;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.core.SellerTransparencyProfileViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.core.SellerTransparencyV3Config;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.core.SellerTransparencyV3ViewMapper;
import ru.ozon.app.android.marketing.widgets.shopButtons.core.ShopButtonsConfig;
import ru.ozon.app.android.marketing.widgets.shopButtons.presentation.ShopButtonsViewMapper;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.core.SisBrandFavoriteConfig;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.core.SisBrandFavoriteViewMapper;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.di.SisBrandFavoriteWidgetModule;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.di.SisBrandFavoriteWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.marketing.widgets.stickyLadder.core.StickyLadderConfig;
import ru.ozon.app.android.marketing.widgets.stickyLadder.core.StickyLadderViewMapper;
import ru.ozon.app.android.marketing.widgets.timerWidget.core.TimerWidgetConfig;
import ru.ozon.app.android.marketing.widgets.timerWidget.core.TimerWidgetViewMapper;
import ru.ozon.app.android.marketing.widgets.timerWidget.di.TimerWidgetModule_ProvideTimerWidgetFactory;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.core.WannaDiscountDecisionConfig;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.core.WannaDiscountDecisionViewMapper;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.core.WannaDiscountV2Config;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.core.WannaDiscountV2ViewMapper;
import ru.ozon.app.android.messenger.di.MessengerWidgetsV2Module_ProvideWidgets$messenger_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.messenger.widgets.chatList.core.ChatListConfig;
import ru.ozon.app.android.messenger.widgets.chatListHeader.core.ChatListHeaderConfig;
import ru.ozon.app.android.messenger.widgets.chatListHeader.core.ChatListHeaderViewMapper;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.core.MessengerCounterV2Config;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.core.MessengerCounterV2ViewMapper;
import ru.ozon.app.android.monetization.di.MonetizationWidgetsModule_ProvideComposeWidgets$monetization_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.monetization.di.MonetizationWidgetsModule_ProvideMonetizationWidgets$monetization_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.monetization.widgets.inputSubmit.core.InputSubmitConfig;
import ru.ozon.app.android.monetization.widgets.inputSubmit.core.InputSubmitViewMapper;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.core.UnreadMessageIndicatorConfig;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.core.UnreadMessageIndicatorViewMapper;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.network.serialize.MoshiJsonDeserializer;
import ru.ozon.app.android.orderdetails.cancelReasons.core.SelectCancelReasonConfig;
import ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonModule;
import ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonModule_ProvideWidget$orderdetails_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.orderdetails.cheques.data.ChequesConfig;
import ru.ozon.app.android.orderdetails.cheques.di.ChequesWidgetModule;
import ru.ozon.app.android.orderdetails.cheques.di.ChequesWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.cheques.presentation.cheque.ChequeViewMapper;
import ru.ozon.app.android.orderdetails.cheques.presentation.title.ChequesTitleViewMapper;
import ru.ozon.app.android.orderdetails.customsfees.core.CustomsFeesConfig;
import ru.ozon.app.android.orderdetails.customsfees.core.CustomsFeesViewMapper;
import ru.ozon.app.android.orderdetails.customsfees.di.CustomsFeesModule;
import ru.ozon.app.android.orderdetails.customsfees.di.CustomsFeesModule_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.dateselector.data.DateSelectorConfig;
import ru.ozon.app.android.orderdetails.dateselector.di.DateSelectorWidgetModule;
import ru.ozon.app.android.orderdetails.dateselector.di.DateSelectorWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.dateselector.presentation.DateSelectorViewMapper;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.data.DeliveryTimeConfig;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.data.DeliveryTimeSelectorViewMapper;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.di.DeliveryTimeSelectorV1Module;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.di.DeliveryTimeSelectorV1Module_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.core.DeliveryTimeSelectorV2Config;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.core.DeliveryTimeSelectorV2Parser;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.di.DeliveryTimeSelectorV2Module_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.viewMapper.ConfirmDateButtonViewMapper;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewMapper.DeliveryTimeSelectorV2ViewMapper;
import ru.ozon.app.android.orderdetails.di.CSOrderDetailsWidgets2Module_ProvideComposeWidgetsFactory;
import ru.ozon.app.android.orderdetails.di.CSOrderDetailsWidgets2Module_ProvideNotificationBarRestrictionWidget$orderdetails_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.orderdetails.di.CSOrderDetailsWidgets2Module_ProvideWidgets$orderdetails_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.orderdetails.modalConstructor.core.ModalConstructorConfig;
import ru.ozon.app.android.orderdetails.modalConstructor.di.ModalConstructorModule;
import ru.ozon.app.android.orderdetails.modalConstructor.di.ModalConstructorModule_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.disclaimer.DisclaimerViewMapper;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.image.ImageWrapperViewMapper;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.imageList.HorizontalScrollImagesViewMapper;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.separator.ModalConstructSeparatorViewMapper;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.text.TextWrapperViewMapper;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.core.NotificationBarRestrictionConfig;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.core.NotificationBarRestrictionViewMapper;
import ru.ozon.app.android.orderdetails.orderTimeline.data.OrderTimelineConfig;
import ru.ozon.app.android.orderdetails.orderTimeline.di.OrderTimelineV2Module;
import ru.ozon.app.android.orderdetails.orderTimeline.di.OrderTimelineV2Module_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.orderTimeline.presentation.OrderTimelineViewMapper;
import ru.ozon.app.android.orderdetails.orderTotal.core.OrderTotalConfig;
import ru.ozon.app.android.orderdetails.orderTotal.core.OrderTotalStickyViewMapper;
import ru.ozon.app.android.orderdetails.orderTotal.core.OrderTotalSummaryViewMapper;
import ru.ozon.app.android.orderdetails.orderTotal.di.OrderTotalModule;
import ru.ozon.app.android.orderdetails.orderTotal.di.OrderTotalModule_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.orderactions.v1.data.OrderActionsConfig;
import ru.ozon.app.android.orderdetails.orderactions.v1.di.OrderActionsModule;
import ru.ozon.app.android.orderdetails.orderactions.v1.di.OrderActionsModule_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.orderactions.v1.presentation.OrderActionsViewMapper;
import ru.ozon.app.android.orderdetails.orderactions.v2.di.OrderActionsV2Module;
import ru.ozon.app.android.orderdetails.orderactions.v2.di.OrderActionsV2Module_ProvideWidgetFactories$orderdetails_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.data.OrderDeliveryDetailConfig;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions.OrderDeliveryDetailActionsViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.header.OrderDeliveryDetailHeaderViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.iconButton.OrderDeliveryDetailIconButtonViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.leaveatdoor.OrderDeliveryDetailLeaveAtDoorViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.lsatdivider.OrderDeliveryDetailLastDividerViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.data.OrderDeliveryDetailV2Config;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.di.OrderDeliveryDetailV2Module;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.di.OrderDeliveryDetailV2Module_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.actions.OrderDeliveryDetailV2ActionsViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.header.OrderDeliveryDetailV2HeaderViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.leaveatdoor.OrderDeliveryDetailV2LeaveAtDoorViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.lsatdivider.OrderDeliveryDetailV2LastDividerViewMapper;
import ru.ozon.app.android.orderdetails.orderdetailsitem.core.OrderDetailsItemConfig;
import ru.ozon.app.android.orderdetails.orderdetailsitem.core.OrderDetailsItemViewMapper;
import ru.ozon.app.android.orderdetails.orderdetailsitem.di.OrderDetailsItemModule;
import ru.ozon.app.android.orderdetails.orderdetailsitem.di.OrderDetailsItemModule_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.OrderShipmentConfig;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl.OrderShipmentModule_Companion_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action.ActionOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.annotation.AnnotationOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting.PositingOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.provider.StatusProviderOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.status.StatusOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.text.TextOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.title.TitleOrderShipmentViewMapper;
import ru.ozon.app.android.orderdetails.orderstatus.OrderStatusConfig;
import ru.ozon.app.android.orderdetails.orderstatus.OrderStatusViewMapper;
import ru.ozon.app.android.orderdetails.orderstatus.di.OrderStatusModule;
import ru.ozon.app.android.orderdetails.orderstatus.di.OrderStatusModule_ProvideOrderStatusWidget$orderdetails_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.orderdetails.productsToPay.core.ProductsToPayConfig;
import ru.ozon.app.android.orderdetails.productsToPay.core.ProductsToPayParser;
import ru.ozon.app.android.orderdetails.productsToPay.di.ProductsToPayModule_Companion_ProvideProductsToPay$orderdetails_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.cell.viewMapper.ProductsToPayCellViewMapper;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewMapper.ProductsToPayViewMapper;
import ru.ozon.app.android.orderdetails.radiogroup.data.RadioGroupWidgetConfig;
import ru.ozon.app.android.orderdetails.radiogroup.di.RadioGroupWidgetModule;
import ru.ozon.app.android.orderdetails.radiogroup.di.RadioGroupWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.radiogroup.presentation.RadioGroupWidgetViewMapper;
import ru.ozon.app.android.orderdetails.replytocourierinfo.data.ReplyToCourierInfoWidgetConfig;
import ru.ozon.app.android.orderdetails.replytocourierinfo.di.ReplyToCourierInfoWidgetModule;
import ru.ozon.app.android.orderdetails.replytocourierinfo.di.ReplyToCourierInfoWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.replytocourierinfo.presentation.ReplyToCourierInfoWidgetViewMapper;
import ru.ozon.app.android.orderdetails.timeLeft.data.TimeLeftConfig;
import ru.ozon.app.android.orderdetails.timeLeft.di.TimeLeftWidgetModule;
import ru.ozon.app.android.orderdetails.timeLeft.di.TimeLeftWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.timeLeft.presentation.TimeLeftViewMapper;
import ru.ozon.app.android.orderdetails.trackshipment.data.OrderTrackShipmentConfig;
import ru.ozon.app.android.orderdetails.trackshipment.di.OrderTrackShipmentModule;
import ru.ozon.app.android.orderdetails.trackshipment.di.OrderTrackShipmentModule_ProvideWidgetFactory;
import ru.ozon.app.android.orderdetails.trackshipment.presentation.OrderTrackShipmentViewMapper;
import ru.ozon.app.android.orders.cml.deliveryInfo.core.DeliveryInfoConfig;
import ru.ozon.app.android.orders.cml.deliveryInfo.di.DeliveryInfoWidgetModule;
import ru.ozon.app.android.orders.cml.deliveryInfo.di.DeliveryInfoWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewMapper.DeliveryInfoViewMapper;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.core.DeliveryOrderInputConfig;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.di.DeliveryOrderInputWidgetModule;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.di.DeliveryOrderInputWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewMapper.DeliveryOrderInputViewMapper;
import ru.ozon.app.android.orders.cml.deliveryOrderList.core.DeliveryOrderListConfig;
import ru.ozon.app.android.orders.cml.deliveryOrderList.di.DeliveryOrderListWidgetModule;
import ru.ozon.app.android.orders.cml.deliveryOrderList.di.DeliveryOrderListWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.viewMapper.DeliveryOrderViewMapper;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.core.DeliveryOrderOnDetailsConfig;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.di.DeliveryOrderOnDetailsWidgetModule;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.di.DeliveryOrderOnDetailsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.viewMappers.DeliveryOrderOnDetailsViewMapper;
import ru.ozon.app.android.orders.cml.groupButtons.core.GroupButtonsConfig;
import ru.ozon.app.android.orders.cml.groupButtons.di.GroupButtonsWidgetModule;
import ru.ozon.app.android.orders.cml.groupButtons.di.GroupButtonsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.orders.cml.groupButtons.presentation.viewMapper.GroupButtonsViewMapper;
import ru.ozon.app.android.orders.cml.parcelTimeline.di.ParcelTimelineWidgetModule_ProvideWidgetFactories$orders_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.ordertracking.v4.OrderTrackingV4ViewMapper;
import ru.ozon.app.android.ordertracking.v4.data.OrderTrackingV4Config;
import ru.ozon.app.android.ordertracking.v4.di.OrderTrackingV4WidgetModule_Companion_ProvideWidget$orderTracking_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.overlayIslandSeparator.OverlayIslandSeparatorViewMapper;
import ru.ozon.app.android.pdp.di.module.PdpWidgetsModule;
import ru.ozon.app.android.pdp.di.module.PdpWidgetsModule_ProvideComposeWidgets$pdp_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.pdp.di.module.PdpWidgetsModule_ProvideWidgets$pdp_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.core.AspectsV4Config;
import ru.ozon.app.android.pdp.widgets.aspectProductV2.core.AspectProductV2Config;
import ru.ozon.app.android.pdp.widgets.aspectProductV2.core.AspectProductV2ViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.AspectsCompactV2Config;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.color.AspectsCompactV2ColorViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.footer.AspectV2FooterViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.header.AspectV2HeaderViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.image.AspectsCompactV2ImageViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.media.AspectsCompactV2MediaViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.pack.AspectsCompactV2PackViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.text.AspectsCompactV2TextViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.textIcon.AspectsCompactV2TextIconViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.tiles.AspectsCompactV2TilesViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.AspectsV2Config;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.applybutton.ApplyButtonViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.color.AspectV2ColorViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.image.AspectV2ImageViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.imagetitle.AspectV2ImageTitleViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.media.AspectV2MediaViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.pack.AspectsV2PackViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.text.AspectV2TextViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.texticon.AspectV2TextIconViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.tiles.AspectV2TileViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV4.core.AspectsV4FlexImageViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV4.core.AspectsV4HorizontalImageViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.core.AspectsV4InfoExpandableTextViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.infoSimpleText.core.AspectsV4InfoSimpleTextViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV4.markdownReason.core.AspectsV4MarkdownReasonViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.core.AspectsV4FlexSizeViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.core.AspectsV4HorizontalSizeViewMapper;
import ru.ozon.app.android.pdp.widgets.badgeList.core.BadgeListConfig;
import ru.ozon.app.android.pdp.widgets.badgeList.presentation.flex.BadgeListWidgetPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.badgeList.presentation.scrollable.ScrollableBadgeListViewMapper;
import ru.ozon.app.android.pdp.widgets.badgeList.presentation.scrollable.ScrollableBadgeListWidgetPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.brand.core.BrandConfig;
import ru.ozon.app.android.pdp.widgets.brand.core.button.SimpleBrandViewMapper;
import ru.ozon.app.android.pdp.widgets.brand.core.button.SimpleBrandWidgetPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.brand.core.cell.OriginalBrandViewMapper;
import ru.ozon.app.android.pdp.widgets.brand.core.cell.OriginalBrandWidgetPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.brand.core.dsButton.ButtonBrandViewMapper;
import ru.ozon.app.android.pdp.widgets.brand.core.dsButton.ButtonBrandWidgetPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.brand.core.dsCell.DsCellBrandViewMapper;
import ru.ozon.app.android.pdp.widgets.brand.core.dsCell.DsCellBrandWidgetPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantConfig;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantViewMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantViewMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.plain.PlainQuantViewMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Config;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartViewV4BottomSheetMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartViewV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartV4BottomSheetViewMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartV4ViewMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.badge.DoubleCartWithBadgeV4BottomSheetViewMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.badge.DoubleCartWithBadgeV4ViewMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.plain.PlainViewV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.core.CartButtonV5Config;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.core.CartButtonV5ViewMapper;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.core.CashbackPointsConfig;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.core.CashbackPointsDoubleItemViewMapper;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.core.CashbackPointsSingleItemViewMapper;
import ru.ozon.app.android.pdp.widgets.characteristics.core.CharacteristicsConfig;
import ru.ozon.app.android.pdp.widgets.characteristics.core.CharacteristicsViewMapper;
import ru.ozon.app.android.pdp.widgets.crosssale.core.CrossSaleConfig;
import ru.ozon.app.android.pdp.widgets.crosssale.core.CrossSaleViewMapper;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.delivery.v5.core.DeliveryConfigV5;
import ru.ozon.app.android.pdp.widgets.delivery.v5.core.DeliveryV5ViewMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.DeliveryV6Config;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.async.DeliveryV6AsyncPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.footer.DeliveryV6FooterViewMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.header.annotation.DeliveryV6HeaderAnnotationViewMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.header.button.DeliveryV6HeaderButtonViewMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.header.title.DeliveryV6HeaderTitleViewMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.sections.DeliveryV6SectionsViewMapper;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.core.DescriptionAccordionConfig;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.core.DescriptionAccordionViewMapper;
import ru.ozon.app.android.pdp.widgets.galleryFullView.core.GalleryFullViewConfig;
import ru.ozon.app.android.pdp.widgets.galleryFullView.core.GalleryFullViewViewMapper;
import ru.ozon.app.android.pdp.widgets.galleryV3.core.GalleryV3Config;
import ru.ozon.app.android.pdp.widgets.galleryV3.core.GalleryV3EmptyStateViewMapper;
import ru.ozon.app.android.pdp.widgets.galleryV3.core.GalleryV3Parser;
import ru.ozon.app.android.pdp.widgets.galleryV3.core.GalleryV3ViewMapper;
import ru.ozon.app.android.pdp.widgets.galleryV4.core.GalleryV4Config;
import ru.ozon.app.android.pdp.widgets.galleryV4.core.GalleryV4FullStateViewMapper;
import ru.ozon.app.android.pdp.widgets.galleryV4.core.GalleryV4SimpleStateViewMapper;
import ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5Config;
import ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5FullStateSingleButtonViewMapper;
import ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5FullStateViewMapper;
import ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5SimpleStateViewMapper;
import ru.ozon.app.android.pdp.widgets.helpfulHints.data.HelpfulHintsConfig;
import ru.ozon.app.android.pdp.widgets.helpfulHints.presentation.HelpfulHintsNoUIMapper;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.InstallmentPurchaseConfig;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.InstallmentPurchaseParser;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.periods.InstallmentPeriodsViewMapper;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase.InstallmentPurchaseViewMapper;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.core.title.InstallmentTitleViewMapper;
import ru.ozon.app.android.pdp.widgets.isFavoriteProduct.core.IsFavoriteProductConfig;
import ru.ozon.app.android.pdp.widgets.isFavoriteProduct.core.WidgetImagePlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.markdown.core.MarkdownConfig;
import ru.ozon.app.android.pdp.widgets.markdown.core.MarkdownViewMapper;
import ru.ozon.app.android.pdp.widgets.navBar.core.NavBarConfig;
import ru.ozon.app.android.pdp.widgets.navBar.core.NavBarViewMapper;
import ru.ozon.app.android.pdp.widgets.navTitle.core.PdpNavTitleConfig;
import ru.ozon.app.android.pdp.widgets.navTitle.presentation.PdpNavTitleViewMapper;
import ru.ozon.app.android.pdp.widgets.nutritionInfoV2.core.NutritionIfoV2ViewMapper;
import ru.ozon.app.android.pdp.widgets.nutritionInfoV2.core.NutritionInfoV2Config;
import ru.ozon.app.android.pdp.widgets.othersellers.core.OtherSellersConfig;
import ru.ozon.app.android.pdp.widgets.othersellers.core.footer.OtherSellersFooterViewMapper;
import ru.ozon.app.android.pdp.widgets.othersellers.core.seller.OtherSellersSellerViewMapper;
import ru.ozon.app.android.pdp.widgets.othersellers.core.title.OtherSellersTitleViewMapper;
import ru.ozon.app.android.pdp.widgets.outofstock.core.OutOfStockConfig;
import ru.ozon.app.android.pdp.widgets.outofstock.core.OutOfStockViewMapper;
import ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.core.PreOrderSubscriptionButtonConfig;
import ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.core.PreOrderSubscriptionButtonViewMapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.core.PriceActionsConfig;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.core.PriceActionsViewMapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.core.PriceCellConfig;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.core.PriceCellViewMapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core.PriceV2Config;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core.PriceV2InfoViewMapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core.PriceV2MainPriceViewMapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core.PriceV2MultiplicityViewMapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core.PriceV2SeparatorViewMapper;
import ru.ozon.app.android.pdp.widgets.priceV4.core.PriceV4Config;
import ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.bottom.PriceV4BottomPriceBanksViewMapper;
import ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.bottom.PriceV4BottomPriceBanksWithBadgeViewMapper;
import ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.bottom.PriceV4BottomPriceViewMapper;
import ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.bottom.PriceV4BottomPriceWithBadgeViewMapper;
import ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.bottom.PriceV4BottomViewMapper;
import ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.bottom.PriceV4BottomWithFinBadgeViewMapper;
import ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.top.PriceV4TopViewMapper;
import ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.top.PriceV4TopWithFinBadgeViewMapper;
import ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.top.PriceV4TopWithStarsBadgeViewMapper;
import ru.ozon.app.android.pdp.widgets.productStarsTile.core.ProductStarsTileConfig;
import ru.ozon.app.android.pdp.widgets.publishedAt.core.PublishedAtConfig;
import ru.ozon.app.android.pdp.widgets.publishedAt.data.PublishedAtViewMapper;
import ru.ozon.app.android.pdp.widgets.refreshPdpProcessor.core.RefreshPdpProcessorConfig;
import ru.ozon.app.android.pdp.widgets.refreshPdpProcessor.core.RefreshPdpProcessorViewMapper;
import ru.ozon.app.android.pdp.widgets.richContent.core.RichContentBillboardViewMapper;
import ru.ozon.app.android.pdp.widgets.richContent.core.RichContentBulletListViewMapper;
import ru.ozon.app.android.pdp.widgets.richContent.core.RichContentConfig;
import ru.ozon.app.android.pdp.widgets.richContent.core.RichContentDoubleTileViewMapper;
import ru.ozon.app.android.pdp.widgets.richContent.core.RichContentImageListViewMapper;
import ru.ozon.app.android.pdp.widgets.richContent.core.RichContentNumberListViewMapper;
import ru.ozon.app.android.pdp.widgets.richContent.core.RichContentSpacerViewMapper;
import ru.ozon.app.android.pdp.widgets.richContent.core.RichContentTextViewMapper;
import ru.ozon.app.android.pdp.widgets.richContent.core.RichContentViewMapper;
import ru.ozon.app.android.pdp.widgets.selectSeller.core.SelectSellerBrandViewMapper;
import ru.ozon.app.android.pdp.widgets.selectSeller.core.SelectSellerConfig;
import ru.ozon.app.android.pdp.widgets.selectSeller.core.SelectSellerViewMapper;
import ru.ozon.app.android.pdp.widgets.seller.core.SellerConfig;
import ru.ozon.app.android.pdp.widgets.seller.core.SellerViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerPoints.core.SellerPointsConfig;
import ru.ozon.app.android.pdp.widgets.sellerPoints.core.SellerPointsViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerSimple.core.SellerSimpleConfig;
import ru.ozon.app.android.pdp.widgets.sellerSimple.core.SellerSimpleViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerV4.core.SellerV4Config;
import ru.ozon.app.android.pdp.widgets.sellerV4.core.SellerV4FullStateViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerV4.core.SellerV4ListStateViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerV4.core.SellerV4SimpleStateViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerV7.core.SellerV7Config;
import ru.ozon.app.android.pdp.widgets.sellerV7.core.SellerV7HeaderViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerV7.core.SellerV7HeaderWidgetPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerV7.core.SellerV7IslandsCellViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerV7.core.SellerV7IslandsCellWidgetPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerV7.core.SellerV7SimpleCellViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerV7.core.SellerV7SimpleCellWidgetPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerV7.core.SellerV7SimpleHeaderViewMapper;
import ru.ozon.app.android.pdp.widgets.sellerV7.core.SellerV7SimpleHeaderWidgetPlaceholderViewMapper;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.core.SellerSortSwitcherConfig;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.core.SellerSortSwitcherViewMapper;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.core.sticky.SellerSortSwitcherStickyViewMapper;
import ru.ozon.app.android.pdp.widgets.tags.core.TagsConfig;
import ru.ozon.app.android.pdp.widgets.tags.core.TagsViewMapper;
import ru.ozon.app.android.pdp.widgets.textDescription.core.TextDescriptionConfig;
import ru.ozon.app.android.pdp.widgets.textDescription.core.TextDescriptionViewMapper;
import ru.ozon.app.android.pdp.widgets.translateButton.core.TranslateButtonConfig;
import ru.ozon.app.android.pdp.widgets.wholesaleInputButton.core.WholesaleInputButtonConfig;
import ru.ozon.app.android.pdp.widgets.wholesaleInputButton.core.WholesaleInputButtonViewMapper;
import ru.ozon.app.android.pdpoldwidgets.di.PdpOldWidgetsModule;
import ru.ozon.app.android.pdpoldwidgets.di.PdpOldWidgetsModule_ProvideWidgets$pdp_old_widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.core.AddToComparisonButtonConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.core.AddToComparisonButtonViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.caption.core.CaptionConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.caption.core.CaptionViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.core.MarketingActionsConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.core.MarketingActionsViewMapper;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollConfig;
import ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollModule_ProvideSkuThinScrollModuleWidgetFactory;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewMapper;
import ru.ozon.app.android.product.tiles.common.FavoriteProductMoleculeV2Mapper;
import ru.ozon.app.android.regulardraw.di.RegularDrawWidgetsModule_ProvideComposeWidgets$regulardraw_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.regulardraw.di.RegularDrawWidgetsModule_ProvideRegularDrawWidgets$regulardraw_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.EmptyScreenConfig;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.button.EmptyScreenButtonViewMapper;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.main.EmptyScreenViewMapper;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.di.EmptyScreenWidgetModule;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.di.EmptyScreenWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.EntryBannerWidgetConfig;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.multi.EntryBannerWidgetMultiViewMapper;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.single.EntryBannerWidgetSingleViewMapper;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.core.MainDrawMajorScreenConfig;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.core.MainDrawMajorScreenViewMapper;
import ru.ozon.app.android.regulardraw.widgets.morkovskBackgroundImage.core.MorkovskBackgroundImageConfig;
import ru.ozon.app.android.regulardraw.widgets.morkovskBackgroundImage.core.MorkovskBackgroundImageViewMapper;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.core.MorkovskTabbarConfig;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.core.MorkovskTabbarViewMapper;
import ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.core.WelcomeScreenConfig;
import ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.core.WelcomeScreenViewMapper;
import ru.ozon.app.android.regulardraw.widgets.navbar.core.MorkovskNavBarConfig;
import ru.ozon.app.android.regulardraw.widgets.navbar.core.MorkovskNavBarViewMapper;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.core.MorkovskOnboardingInfoConfig;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.core.MorkovskOnboardingInfoViewMapper;
import ru.ozon.app.android.regulardraw.widgets.warningTooltip.core.WarningTooltipConfig;
import ru.ozon.app.android.regulardraw.widgets.warningTooltip.core.WarningTooltipViewMapper;
import ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetModule;
import ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetModule_ProvideComposeWidgets$details_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.buttons.core.ReturnActionButtonsConfig;
import ru.ozon.app.android.returns.buttons.di.ReturnActionButtonsWidgetModule;
import ru.ozon.app.android.returns.buttons.di.ReturnActionButtonsWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.buttons.viewMapper.ReturnActionButtonsViewMapper;
import ru.ozon.app.android.returns.cancels.cancelReasons.di.SelectCancelReasonModule_ProvideWidget$cancels_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.reasons.SelectCancelReasonsViewMapper;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky.SelectCancelReasonStickyViewMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.di.CancelPostingsV2Module_Companion_ProvideCancelPostingsV2$cancels_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.annotation.CancelPostingsV2AnnotationViewMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.button.CancelPostingsV2ButtonViewMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting.CancelPostingsV2PostingViewMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.selectall.CancelPostingsV2SelectAllViewMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.shipment.CancelPostingsV2ShipmentViewMapper;
import ru.ozon.app.android.returns.creation.di.ReturnCreationWidgetsModule;
import ru.ozon.app.android.returns.creation.di.ReturnCreationWidgetsModule_ProvideComposeWidgetsFactory;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.delivery.viewMapper.ReturnCreationDeliveryViewMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewMapper.ReturnCreationGroupViewMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewMapper.ReturnCreationItemViewMapper;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.core.ReturnCreationActiveDeliveriesConfig;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di.ReturnCreationActiveDeliveriesWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di.ReturnCreationActiveDeliveriesWidgetModule_ProvideActiveDeliveriesWidgetFactory;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.element.viewMapper.ElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.sticky.viewMapper.StickyViewMapper;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.di.ReturnCreationItemInfoWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.di.ReturnCreationItemInfoWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky.ItemWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.itemsList.core.ReturnCreationItemsListConfig;
import ru.ozon.app.android.returns.creation.widgets.itemsList.core.ReturnCreationItemsListParser;
import ru.ozon.app.android.returns.creation.widgets.itemsList.di.ReturnCreationOrderWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.itemsList.di.ReturnCreationOrderWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.creation.widgets.methods.core.ReturnCreationMethodsConfig;
import ru.ozon.app.android.returns.creation.widgets.methods.core.atom.AtomElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.dates.DatesElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.images.ImagesElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.textwithiconbutton.TextWithIconButtonElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.returns.creation.widgets.modal.core.ReturnCreationModalConfig;
import ru.ozon.app.android.returns.creation.widgets.modal.di.ReturnCreationModalWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.modal.di.ReturnCreationModalWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.creation.widgets.modal.presentation.viewMapper.ReturnCreationModalViewMapper;
import ru.ozon.app.android.returns.creation.widgets.orders.core.ReturnCreationOrdersConfig;
import ru.ozon.app.android.returns.creation.widgets.orders.core.ReturnCreationOrdersParser;
import ru.ozon.app.android.returns.creation.widgets.orders.di.ReturnCreationOrdersWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.orders.di.ReturnCreationOrdersWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.creation.widgets.orders.presentation.pagination.viewMapper.PaginationViewMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.core.ReturnCreationPhotoPickerConfig;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.core.ReturnCreationPhotoPickerParser;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewMapper.ButtonsWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewMapper.PhotosWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.title.viewMapper.TitleWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.core.ReturnCreationReasonsConfig;
import ru.ozon.app.android.returns.creation.widgets.reasons.core.ReturnCreationReasonsParser;
import ru.ozon.app.android.returns.creation.widgets.reasons.di.ReturnCreationReasonsWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.reasons.di.ReturnCreationReasonsWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.button.viewMapper.AddMoreButtonWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewMapper.ReasonWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.core.ReturnCreationSelectedItemsConfig;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.core.ReturnCreationSelectedItemsParser;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.di.ReturnCreationSelectedItemsWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.di.ReturnCreationSelectedItemsWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewMapper.ReturnCreationSelectedItemViewMapper;
import ru.ozon.app.android.returns.creation.widgets.steps.core.ReturnCreationStepsConfig;
import ru.ozon.app.android.returns.creation.widgets.steps.di.ReturnCreationStepsWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.steps.di.ReturnCreationStepsWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.creation.widgets.steps.viewMapper.ReturnCreationStepsViewMapper;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.core.ReturnTextAreaButtonConfig;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.di.ReturnTextAreaButtonWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.di.ReturnTextAreaButtonWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.presentation.mapper.ReturnTextAreaButtonViewMapper;
import ru.ozon.app.android.returns.creation.widgets.total.core.ReturnCreationTotalConfig;
import ru.ozon.app.android.returns.creation.widgets.total.di.ReturnCreationTotalWidgetModule;
import ru.ozon.app.android.returns.creation.widgets.total.di.ReturnCreationTotalWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.creation.widgets.total.presentation.viewMapper.ReturnCreationTotalViewMapper;
import ru.ozon.app.android.returns.details.data.ReturnDetailsConfig;
import ru.ozon.app.android.returns.details.di.ReturnDetailsWidgetModule;
import ru.ozon.app.android.returns.details.di.ReturnDetailsWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.details.viewMapper.ReturnDetailsViewMapper;
import ru.ozon.app.android.returns.detailsHeaderButton.ReturnDetailsHeaderButtonWidgetModule;
import ru.ozon.app.android.returns.detailsHeaderButton.ReturnDetailsHeaderButtonWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.edit.data.ReturnEditConfig;
import ru.ozon.app.android.returns.edit.data.ReturnEditParser;
import ru.ozon.app.android.returns.edit.di.ReturnEditWidgetModule;
import ru.ozon.app.android.returns.edit.di.ReturnEditWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.edit.presentation.comment.ReturnTextEditBlockViewMapper;
import ru.ozon.app.android.returns.edit.presentation.photo.ReturnImageEditViewMapper;
import ru.ozon.app.android.returns.edit.presentation.sticky.ReturnEditStickyViewMapper;
import ru.ozon.app.android.returns.list.data.ReturnListConfig;
import ru.ozon.app.android.returns.list.data.ReturnListParser;
import ru.ozon.app.android.returns.list.di.ReturnListWidgetModule;
import ru.ozon.app.android.returns.list.di.ReturnListWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.list.viewMapper.ReturnListViewMapper;
import ru.ozon.app.android.returns.listEmpty.data.ReturnListEmptyConfig;
import ru.ozon.app.android.returns.listEmpty.di.ReturnListEmptyModule;
import ru.ozon.app.android.returns.listEmpty.di.ReturnListEmptyModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.listEmpty.presentation.banner.mapper.BannerViewMapper;
import ru.ozon.app.android.returns.listEmpty.presentation.instruction.mapper.InstructionMapper;
import ru.ozon.app.android.returns.listEmpty.presentation.instruction.mapper.InstructionViewMapper;
import ru.ozon.app.android.returns.listEmpty.presentation.util.TextBlockDecoration;
import ru.ozon.app.android.returns.returnBalanceModal.core.ReturnBalanceModalConfig;
import ru.ozon.app.android.returns.returnBalanceModal.di.ReturnBalanceModalWidgetModule;
import ru.ozon.app.android.returns.returnBalanceModal.di.ReturnBalanceModalWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.returnableItemsList.core.ReturnableItemsListConfig;
import ru.ozon.app.android.returns.returnableItemsList.core.ReturnableItemsParser;
import ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListWidgetModule;
import ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewMapper.PaginationMobileViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewMapper.ReturnableItemsListViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewMapper.ReturnableItemsTitleViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.totalMobile.viewMapper.TotalMobileViewMapper;
import ru.ozon.app.android.returns.total.core.ReturnDetailsTotalConfig;
import ru.ozon.app.android.returns.total.di.ReturnDetailsTotalWidgetModule;
import ru.ozon.app.android.returns.total.di.ReturnDetailsTotalWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.returns.total.viewMapper.ReturnDetailsTotalViewMapper;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewMapper.StickyBottomEarsWidgetMapper;
import ru.ozon.app.android.returns.ui.molecules.cellContent.mapper.ReturnCellContentViewMapper;
import ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewMapper.OpenCloudViewMapper;
import ru.ozon.app.android.rfbs.deliverycomplain.data.DeliveryComplainWidgetConfig;
import ru.ozon.app.android.rfbs.deliverycomplain.di.DeliveryComplainWidgetModule;
import ru.ozon.app.android.rfbs.deliverycomplain.di.DeliveryComplainWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.DeliveryComplainOverlayViewMapper;
import ru.ozon.app.android.search.catalog.components.categoryMenu.data.CategoryMenuConfig;
import ru.ozon.app.android.search.catalog.components.categoryMenu.di.CategoryMenuDiModule_ProvideCategoryMenuWidgetFactory;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.button.CategoryMenuButtonOverlayViewMapper;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.item.CategoryMenuItemViewMapper;
import ru.ozon.app.android.search.catalog.components.categorylogos.core.CategoryLogosViewMapper;
import ru.ozon.app.android.search.catalog.components.categorylogos.core.CategoryLogosWidgetConfig;
import ru.ozon.app.android.search.catalog.components.categorylogos.di.CategoryLogosDiModule_ProvideCategoryLogosWidgetFactory;
import ru.ozon.app.android.search.catalog.components.clusters.di.ClustersDiModule_ProvideClusters$search_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.core.FullTextSearchHeaderV3ViewMapper;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.data.FullTextSearchHeaderV3Config;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.di.FullTextSearchHeaderV3Module_ProvideWidgetsFactory;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.core.FullTextSearchHeaderV4ViewMapper;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.data.FullTextSearchHeaderV4Config;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.di.FullTextSearchHeaderV4Module_ProvideWidgetsFactory;
import ru.ozon.app.android.search.di.SearchWidgetV2DiModule;
import ru.ozon.app.android.search.di.SearchWidgetV2DiModule_ProvideComposeWidgets$search_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.SearchResultsCanParseDelegate;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.combiner.SearchResultsPlaceholderCombiner;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.TextMeasurer;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridConfig;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridViewMapper;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.di.SearchResultsV2Module_ProvideSearchResultsGridFactory;
import ru.ozon.app.android.search.searchscreen.presentation.components.separator.SearchResultsSeparatorMapper;
import ru.ozon.app.android.search.widgets.aiHelper.data.AiHelperConfig;
import ru.ozon.app.android.search.widgets.aiHelper.di.AiHelperModule_ProvideFeedbackTileWidgetFactory;
import ru.ozon.app.android.search.widgets.aiHelper.presentation.AiHelperViewMapper;
import ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarConfig;
import ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarModule_ProvideSearchBarMobileWidgetFactory;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarViewMapper;
import ru.ozon.app.android.search.widgets.expandableCells.core.ExpandableCellViewMapper;
import ru.ozon.app.android.search.widgets.expandableCells.core.ExpandableCellsConfig;
import ru.ozon.app.android.search.widgets.expandableCells.core.TileGrid2SkeletonViewMapper;
import ru.ozon.app.android.search.widgets.expandableCells.core.TileScrollSkeletonViewMapper;
import ru.ozon.app.android.search.widgets.expandableCells.di.ExpandableCellsModule_ProvideExpandableCellsWidget3Factory;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.FeedbackFormConfig;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.di.FeedbackFormModule_ProvideFeedbackFormWidgetFactory;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.cell.FeedbackCellViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.input.FeedbackInputViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.sendButton.FeedbackSendButtonViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.spacer.FeedbackSpacerViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.FeedbackFormV2Config;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.di.FeedbackFormV2Module_ProvideFeedbackFormWidgetFactory;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.cell.FeedbackCellV2ViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input.FeedbackInputV2ViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.sendButton.FeedbackSendButtonV2ViewMapper;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.spacer.FeedbackSpacerV2ViewMapper;
import ru.ozon.app.android.search.widgets.feedbackTile.data.FeedbackTileConfig;
import ru.ozon.app.android.search.widgets.feedbackTile.di.FeedbackTileModule_ProvideFeedbackTileWidgetFactory;
import ru.ozon.app.android.search.widgets.feedbackTile.presentation.FeedbackTileViewMapper;
import ru.ozon.app.android.search.widgets.history.catalog.data.SearchHistoryConfig;
import ru.ozon.app.android.search.widgets.history.catalog.di.SearchHistoryModule_ProvideSearchHistoryWidgetFactory;
import ru.ozon.app.android.search.widgets.history.catalog.presentation.SearchHistoryViewMapper;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryConfig;
import ru.ozon.app.android.search.widgets.history.search.di.HistoryModule_ProvideHistoryWidgetFactory;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewMapper;
import ru.ozon.app.android.search.widgets.insight.di.InsightWidgetModule_ProvideInsightWidget$search_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.search.widgets.modalButton.data.ModalButtonConfig;
import ru.ozon.app.android.search.widgets.modalButton.di.ModalButtonDiModule_ProvideModalButtonWidgetFactory;
import ru.ozon.app.android.search.widgets.modalButton.presentation.ModalButtonBurgerViewMapper;
import ru.ozon.app.android.search.widgets.modalButton.presentation.ModalButtonViewMapper;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.data.SearchCategoryHeaderConfig;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.data.SearchCategoryHeaderViewMapper;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.di.SearchCategoryHeaderDiModule_ProvideWidgetFactory;
import ru.ozon.app.android.search.widgets.searchOnboarding.data.SearchOnboardingConfig;
import ru.ozon.app.android.search.widgets.searchOnboarding.di.SearchOnboardingModule_ProvideSearchOnboardingWidgetFactory;
import ru.ozon.app.android.search.widgets.searchOnboarding.presentation.SearchOnboardingViewMapper;
import ru.ozon.app.android.search.widgets.searchRequest.data.SearchRequestConfig;
import ru.ozon.app.android.search.widgets.searchRequest.di.SearchRequestDiModule_ProvideSearchRequestWidgetFactory;
import ru.ozon.app.android.search.widgets.searchRequest.presentation.SearchRequestViewMapper;
import ru.ozon.app.android.search.widgets.searchResult.error.data.SearchResultErrorConfig;
import ru.ozon.app.android.search.widgets.searchResult.error.di.SearchResultErrorDiModule_ProvideSearchResultErrorWidgetFactory;
import ru.ozon.app.android.search.widgets.searchResult.error.presentation.SearchResultErrorViewMapper;
import ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarViewMapper;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarConfig;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarViewMapper;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchBarMobileModule_ProvideSearchBarMobileWidgetFactory;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionConfig;
import ru.ozon.app.android.search.widgets.suggestion.di.SearchSuggestionsModule_ProvideSearchSuggestionsWidgetFactory;
import ru.ozon.app.android.search.widgets.suggestion.presentation.SuggestionsViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.core.SuggestionsConfig;
import ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsModule_ProvideSuggestionsFactory;
import ru.ozon.app.android.search.widgets.suggestions.ui.prefetch.SuggestionsPrefetchViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.badgetitlesubtitle.SuggestionsBadgeTitleSubtitleViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.cell.SuggestionsCellViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.titlesubtitle.SuggestionsTitleSubtitleViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestionsList.SuggestionsTitleViewMapper;
import ru.ozon.app.android.search.widgets.tapTags.v2.core.TapTagsV2Config;
import ru.ozon.app.android.search.widgets.tapTags.v2.core.TapTagsV2ViewMapper;
import ru.ozon.app.android.search.widgets.tapTags.v2.di.TapTagsV2Module_ProvideTapTagsV2Factory;
import ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3Config;
import ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3ViewMapper;
import ru.ozon.app.android.search.widgets.tapTags.v3.di.TapTagsV3Module_ProvideTapTagsV3Factory;
import ru.ozon.app.android.search.widgets.title.core.SearchHistoryTitleViewMapper;
import ru.ozon.app.android.search.widgets.title.core.SuggestionTitleViewMapper;
import ru.ozon.app.android.sellerproducts.di.SellerProductsWidgetsModule;
import ru.ozon.app.android.sellerproducts.di.SellerProductsWidgetsModule_ProvideWidgetFactory;
import ru.ozon.app.android.sellerproducts.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.sellerproducts.header.model.HeaderMapper;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.SellerProductsWidgetConfig;
import ru.ozon.app.android.sellerproducts.sellerProducts.presentation.SellerProductsViewMapper;
import ru.ozon.app.android.separator.core.SeparatorConfig;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.separator.di.SeparatorModule_ProvideSeparatorWidgetFactory;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.core.ExternalVerificationHandlerMobileConfig;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.di.EditCredentialsWidgetsModule;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.di.EditCredentialsWidgetsModule_ProvideExternalVerificationHandlerMobileWidget$session_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.ExternalVerificationHandlerMobileViewMapperNoUi;
import ru.ozon.app.android.session.flashcall.core.RequestPhoneAccessViewMapper;
import ru.ozon.app.android.session.flashcall.core.RequestPhoneAccessWidgetConfig;
import ru.ozon.app.android.session.flashcall.di.FlashCallWidget2Module;
import ru.ozon.app.android.session.flashcall.di.FlashCallWidget2Module_ProvideWidgets$session_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.session.logoMobile.data.LogoMobileConfig;
import ru.ozon.app.android.session.logoMobile.di.LogoMobileWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.session.logoMobile.mapper.LogoMobileViewMapper;
import ru.ozon.app.android.session.mySettingsHeader.data.MySettingsHeaderConfig;
import ru.ozon.app.android.session.mySettingsHeader.di.MySettingsHeaderWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.session.mySettingsHeader.mapper.MySettingsHeaderViewMapper;
import ru.ozon.app.android.session.session.data.SessionConfig;
import ru.ozon.app.android.session.session.di.SessionWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.session.session.mapper.SessionViewMapper;
import ru.ozon.app.android.session.sessionList.data.SessionListConfig;
import ru.ozon.app.android.session.sessionList.di.SessionListWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.session.sessionList.mapper.CurrentSessionTitleViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.CurrentSessionViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListAnnotationViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListHeaderViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListLogoutButtonViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListTitleViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListViewMapper;
import ru.ozon.app.android.session.userAdultModalMobileV2.di.UserAdultConfirmationModuleV2_Companion_ProvideComposeWidgets$session_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.stickyIslandSeparator.StickyIslandSeparatorViewMapper;
import ru.ozon.app.android.storefront.feature.notifications.di.NotificationWidgetModule_ProvideComposeWidgets$notifications_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.stories.di.PlayStoriesV3WidgetModule;
import ru.ozon.app.android.storefront.stories.di.PlayStoriesV3WidgetModule_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.stories.playstoriesv3.core.PlayStoriesV3Config;
import ru.ozon.app.android.storefront.stories.playstoriesv3.core.PlayStoriesV3ViewMapper;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingWidgetModule;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingWidgetModule_ProvideAppOnboarding$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.bloggerLanding.di.BloggerLandingModule_ProvideBloggerLanding$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.BannerCarouselConfig;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.BannerCarouselViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.captionwidget.CaptionWidgetConfig;
import ru.ozon.app.android.storefront.widgets.cms.captionwidget.CaptionWidgetViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.di.CmsWidgetsV2DiModule_ProvideComposeWidgets$cms_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.cms.di.CmsWidgetsV2DiModule_ProvideWidget$cms_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.core.HorizontalAutoScrollConfig;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.core.HorizontalAutoScrollViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.navbar.NavBarOverlayViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.core.RichPromoScrollConfig;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.core.RichPromoScrollViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.richtext.RichTextWidgetConfig;
import ru.ozon.app.android.storefront.widgets.cms.richtext.RichTextWidgetViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.title.TitleConfig;
import ru.ozon.app.android.storefront.widgets.cms.title.TitleViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.webview.WebViewWidgetConfig;
import ru.ozon.app.android.storefront.widgets.cms.webview.WebViewWidgetViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.core.NpsRatingConfig;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.core.NpsRatingViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.di.NpsRatingRegistrationModule_ProvideWidgetFactory;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core.RateConfig;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core.RateViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di.RateRegistrationModule_ProvideWidgetFactory;
import ru.ozon.app.android.storefront.widgets.feedback.result.core.ResultConfig;
import ru.ozon.app.android.storefront.widgets.feedback.result.core.ResultViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.result.di.ResultModule_ProvideWidgetFactory;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.core.FinanceHeaderConfig;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.core.FinanceHeaderViewMapper;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.di.FinanceHeaderModule_ProvideFinanceHeader$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.FinanceWidgetConfig;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.carousel.CarouselCardViewMapper;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.couple.CoupleCardViewMapper;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.single.SingleCardViewMapper;
import ru.ozon.app.android.storefront.widgets.financeWidget.di.FinanceWidgetModule;
import ru.ozon.app.android.storefront.widgets.financeWidget.di.FinanceWidgetModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.financeWidgetV2.di.FinanceWidgetV2Module;
import ru.ozon.app.android.storefront.widgets.financeWidgetV2.di.FinanceWidgetV2Module_ProvideComposeWidgetsFactory;
import ru.ozon.app.android.storefront.widgets.helpCert.data.HelpCertConfig;
import ru.ozon.app.android.storefront.widgets.helpCert.di.HelpCertModule_ProvideHelpCertFactory;
import ru.ozon.app.android.storefront.widgets.helpCert.ui.HelpCertViewMapper;
import ru.ozon.app.android.storefront.widgets.inAppPush.core.InAppPushConfig;
import ru.ozon.app.android.storefront.widgets.inAppPush.core.InAppPushViewMapper;
import ru.ozon.app.android.storefront.widgets.inAppPush.di.InAppPushModule_ProvideMiniappHeaderWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.megaRaffle.core.ActionProgressViewMapper;
import ru.ozon.app.android.storefront.widgets.megaRaffle.di.ActionProgressModule_ProvideMegaRaffleWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.megadraw.core.MegaDrawConfig;
import ru.ozon.app.android.storefront.widgets.megadraw.core.MegaDrawViewMapper;
import ru.ozon.app.android.storefront.widgets.megadraw.di.MegaDrawModule;
import ru.ozon.app.android.storefront.widgets.megadraw.di.MegaDrawModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.miniappHeader.core.MiniappHeaderConfig;
import ru.ozon.app.android.storefront.widgets.miniappHeader.core.MiniappHeaderViewMapper;
import ru.ozon.app.android.storefront.widgets.miniappHeader.di.MiniappHeaderModule_ProvideMiniappHeaderWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.NavLikezoneCaruselConfig;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.multi.NavLikezoneCaruselMultiViewMapper;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.single.NavLikezoneCaruselSingleViewMapper;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.di.NavLikezoneCaruselDiModule;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.di.NavLikezoneCaruselDiModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.navbarApparel.NavBarApparelConfig;
import ru.ozon.app.android.storefront.widgets.navbarApparel.core.NavBarApparelViewMapper;
import ru.ozon.app.android.storefront.widgets.navbarApparel.di.NavBarApparelDiModule_ProvideNavBarApparelWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.navbarv2.di.ShellNavBarDiModule_ProvideShellNavbar$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksConfig;
import ru.ozon.app.android.storefront.widgets.naviBlocks.di.NaviBlocksModule;
import ru.ozon.app.android.storefront.widgets.naviBlocks.di.NaviBlocksModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.coupleNew.CoupleNaviBlockViewMapperNew;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.lastempty.LastEmptyNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carousel.CarouselNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carouselNew.CarouselNaviBlockViewMapperNew;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.oneframe.OneFrameNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.oneframeNew.OneFrameNaviBlockViewMapperNew;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.di.NaviBlocksV3Module;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.di.NaviBlocksV3Module_ProvideNaviBlocksWidgetFactoryFactory;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.di.NaviBlocksV5Module;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.di.NaviBlocksV5Module_ProvideNaviBlocksWidgetFactoryFactory;
import ru.ozon.app.android.storefront.widgets.naviCategories.data.NaviCategoriesConfig;
import ru.ozon.app.android.storefront.widgets.naviCategories.di.NaviCategoriesModule;
import ru.ozon.app.android.storefront.widgets.naviCategories.di.NaviCategoriesModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.big.DoubleNaviCategoriesViewMapper;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.empty.EmptyNaviCategoriesViewMapper;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.single.SingleNaviCategoriesViewMapper;
import ru.ozon.app.android.storefront.widgets.naviGrid.core.NaviGridConfig;
import ru.ozon.app.android.storefront.widgets.naviGrid.core.accent.NaviGridAccentViewMapper;
import ru.ozon.app.android.storefront.widgets.naviGrid.core.horizontalPair.NaviGridHorizontalPairViewMapper;
import ru.ozon.app.android.storefront.widgets.naviGrid.core.verticalCouple.NaviGridVerticalCoupleViewMapper;
import ru.ozon.app.android.storefront.widgets.naviGrid.di.NaviGridModule;
import ru.ozon.app.android.storefront.widgets.naviGrid.di.NaviGridModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.naviGrid3.core.NaviGrid3Config;
import ru.ozon.app.android.storefront.widgets.naviGrid3.core.NaviGrid3ViewMapper;
import ru.ozon.app.android.storefront.widgets.naviGrid3.di.NaviGrid3Module;
import ru.ozon.app.android.storefront.widgets.naviGrid3.di.NaviGrid3Module_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.navigationSlider.data.NavigationSliderConfig;
import ru.ozon.app.android.storefront.widgets.navigationSlider.di.NavigationSliderModule_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderViewMapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2Config;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2ScrollableViewMapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2ViewMapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.di.NavigationSliderV2Module_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.core.NavigationSliderV3ScrollableViewMapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.core.NavigationSliderV3ViewMapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.di.NavigationSliderV3Module_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.placementSlider.di.PromoPlacementModule;
import ru.ozon.app.android.storefront.widgets.placementSlider.di.PromoPlacementModule_ProvidePromoPlacementWidgetFactoryFactory;
import ru.ozon.app.android.storefront.widgets.playvideo.data.PlayVideoConfig;
import ru.ozon.app.android.storefront.widgets.playvideo.di.PlayVideoModule_ProvideWidgetFactory;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoNoUiViewMapper;
import ru.ozon.app.android.storefront.widgets.profile.core.ProfileCellConfig;
import ru.ozon.app.android.storefront.widgets.profile.core.ProfileCellViewMapper;
import ru.ozon.app.android.storefront.widgets.profile.di.ProfileCellWidgetModule_ProvideProfileCellWidgetFactory;
import ru.ozon.app.android.storefront.widgets.profileIconButton.di.ProfileIconButtonWidgetModule;
import ru.ozon.app.android.storefront.widgets.profileIconButton.di.ProfileIconButtonWidgetModule_ProvideIconButtonWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.rateApp.di.RateAppDiModule_ProvideRateAppComposeWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.scrollAnchor.di.ScrollAnchorDiModule_ProvideScrollAnchorWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.scrollAnchor.presentation.ScrollAnchorViewMapper;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.di.ShellNavTitleDiModule_ProvideShellNavTitleComposeWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.stickyCart.core.StickyCartConfig;
import ru.ozon.app.android.storefront.widgets.stickyCart.core.StickyCartViewMapper;
import ru.ozon.app.android.storefront.widgets.stickyCart.di.StickyCartModule_ProvideScrollAnchorWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.stickyScroll.core.StickyScrollConfig;
import ru.ozon.app.android.storefront.widgets.stickyScroll.core.StickyScrollViewMapper;
import ru.ozon.app.android.storefront.widgets.stickyScroll.di.StickyScrollModule_ProvideScrollAnchorWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.videoScroll.core.VideoScrollConfig;
import ru.ozon.app.android.storefront.widgets.videoScroll.core.VideoScrollViewMapper;
import ru.ozon.app.android.storefront.widgets.videoScroll.di.VideoScrollWidgetModule;
import ru.ozon.app.android.storefront.widgets.videoScroll.di.VideoScrollWidgetModule_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.storefront.widgets.videoTile.core.VideoTileConfig;
import ru.ozon.app.android.storefront.widgets.videoTile.core.VideoTileViewMapper;
import ru.ozon.app.android.storefront.widgets.videoTile.di.VideoTileWidgetModule;
import ru.ozon.app.android.storefront.widgets.videoTile.di.VideoTileWidgetModule_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.data.HideTabBarOnScrollConfig;
import ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.di.HideTabbarOnScrollWidgetModule_ProvideHideTabBarOnScrollWidget$tabbar_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation.HideTabBarOnScrollViewMapper;
import ru.ozon.app.android.travel.feature.avia.di.TravelAviaWidgetFactoryModule_ProvideWidgetFactories$avia_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.avia.di.TravelAviaWidgetFactoryModule_ProvideWidgets$avia_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.avia.di.TravelAviaWidgetV2Module_Companion_ProvideComposeWidgets$avia_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.avia.di.TravelAviaWidgetV2Module_Companion_ProvideWidgets$avia_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data.AdditionalLuggageV2Config;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2ViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggageTotal.data.AdditionalLuggageTotalShadedConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggageTotal.presentation.AdditionalLuggageTotalViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.data.AdditionalServiceCardConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.presentation.AdditionalServiceCardViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.data.AviaBookedTicketInfoConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.presentation.AviaBookedTicketInfoViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.luggageCell.AviaCheckTariffsLuggageCellViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.subtitle.AviaCheckTariffsSubtitleViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.title.AviaCheckTariffsTitleViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.data.AviaCheckTariffsPriceDetailsConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.AviaCheckTariffsPriceDetailsViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.data.AviaComplexSearchFormConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation.AviaComplexSearchFormViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.data.AviaDetailedInfoV3Config;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3ViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.tabs.AviaDetailedInfoV3TabsViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.AviaSearchResultV3Config;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultV3ViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.data.BuyTogetherConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.presentation.BuyTogetherViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.data.DirectFlightsDropdownConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.data.FlightRouteDetailsConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.presentation.annotation.FlightRouteDetailsAnnotationViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.presentation.flight.FlightRouteDetailsViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.data.FlightSeatsLegendConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.presentation.FlightSeatsLegendViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.FlightSeatsSchemeConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockStickyViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeBlockViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.total.FlightSeatsSchemeTotalStickyViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.data.HelpInsuranceConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.HelpInsuranceViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.data.InsurancePanelConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.InsurancePanelViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.data.LuggageRequirementsV2Config;
import ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.presentation.LuggageRequirementsV2ViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.orderFlightInfo.data.OrderFlightInfoConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.orderFlightInfo.presentation.OrderFlightInfoViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.data.PassengersLuggageSelectionConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.PassengersLuggageSelectionViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.data.ReturnPolicyConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.presentation.ReturnPolicyViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.data.ServicePackageSelectionConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.presentation.ServicePackageSelectionViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.presentation.button.ServicePackageSelectionButtonNoUiViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.stepper.data.StepperConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.stepper.presentation.StepperViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.tariffLuggage.v2.data.TariffLuggageV2Config;
import ru.ozon.app.android.travel.feature.avia.widgets.tariffLuggage.v2.presentation.TariffLuggageV2ViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.data.TravelFlightCheckTariffV2Config;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2ViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.data.ServicePackSelectionV3Config;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.ServicePackSelectionV3ViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageSelected.v3.data.TravelServicePackageSelectedV3Config;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageSelected.v3.presentation.TravelServicePackageSelectedV3ViewMapper;
import ru.ozon.app.android.travel.feature.b2b.di.TravelB2BWidgetFactoryModule_ProvideComposeWidgets$b2b_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.b2b.di.TravelB2BWidgetV2Module_ProvideWidgets$b2b_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceBar.data.AccountBalanceBarConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceBar.presentation.AccountBalanceBarViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.data.AccountBalanceInfoConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.presentation.AccountBalanceInfoViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.data.B2bContactUsConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.presentation.B2bContactUsViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.data.PromoBannerB2BConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.presentation.PromoBannerB2BViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.data.TravelCompanyDocumentsConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.presentation.TravelCompanyDocumentsViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.data.TravelDocumentsToEmailConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.header.TravelDocumentsToEmailHeaderViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.TravelDocumentsToEmailListViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.data.TravelModalPersonalManagerConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelModalPersonalManager.presentation.TravelModalPersonalManagerViewMapper;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentConfig;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.di.TravelGeneralBookingWidgetFactoryModule;
import ru.ozon.app.android.travel.feature.general.booking.di.TravelGeneralBookingWidgetFactoryModule_ProvideWidgets$booking_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.booking.di.TravelGeneralBookingWidgetV2Module_Companion_ProvideWidgets$booking_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.data.AdditionalServicesConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.data.CustomerContactsV2Config;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation.CustomerContactsV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation.scroller.CustomerContactsScrollerViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.data.HotelsBookAdditionsConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.data.HotelsBookTotalV2Config;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.data.HotelsCheckoutTitleConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.presentation.HotelsCheckoutTitleViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.presentation.timer.HotelsCheckoutTitleOverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.data.PassengersDirectoryV2Config;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.PassengersDirectoryV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data.PassengersDirectoryV3Config;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.buttons.PassengersDirectoryV3ButtonNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.category.PassengersDirectoryV3CategoryViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.emptyState.PassengersDirectoryV3EmptyStateViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.input.PassengersDirectoryV3InputNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.data.PassengersLuggageButtonConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.presentation.PassengersLuggageButtonNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.data.PassengersMatcherV2Config;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.PassengersMatcherV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.button.PassengersMatcherV2ButtonNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersDynamicStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersSimpleViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.overlay.QuickFiltersOverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v1.data.SearchResultsNavTitleConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v1.presentation.SearchResultsNavTitleViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.data.SearchResultsNavTitleV2Config;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.presentation.SearchResultsNavTitleV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.data.TravelAddNewPassengerFormV2Config;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.TravelAddNewPassengerFormV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3Config;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3ViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerFormClearButton.data.TravelAddNewPassengerFormClearButtonConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerFormClearButton.presentation.TravelAddNewPassengerFormClearButtonViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelBookingImportantInformation.data.TravelBookingImportantInformationConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelBookingImportantInformation.presentation.TravelBookingImportantInformationViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelBookingImportantInformationPlaceholder.data.TravelBookingImportantInformationPlaceholderConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelBookingImportantInformationPlaceholder.presentation.TravelBookingImportantInformationPlaceholderViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.data.TravelQuickFiltersConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.normal.TravelQuickFiltersViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.sticky.TravelQuickFiltersOverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.data.TravelSearchSortAndFilterConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation.TravelSearchSortAndFilterViewMapper;
import ru.ozon.app.android.travel.feature.general.common.di.TravelGeneralWidgetFactoryModule;
import ru.ozon.app.android.travel.feature.general.common.di.TravelGeneralWidgetFactoryModule_ProvideComposeWidgets$common_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.common.di.TravelGeneralWidgetFactoryModule_ProvideWidgets$common_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.common.di.TravelGeneralWidgetV2Module;
import ru.ozon.app.android.travel.feature.general.common.di.TravelGeneralWidgetV2Module_ProvideWidgetFactories$common_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.common.di.TravelGeneralWidgetV2Module_ProvideWidgets$common_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.common.di.TravelGeneralWidgetV2Module_ProvideWidgetsV2$common_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.BadgeListViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusCellToggle.data.BonusCellToggleConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusCellToggle.presentation.BonusCellToggleViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.data.ButtonWidgetConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.presentation.ButtonWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.presentation.sticky.ButtonWidgetStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.data.ButtonWidgetV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.presentation.ButtonWidgetV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.presentation.sticky.ButtonWidgetV2StickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.data.ButtonWithInformationConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.horizontal.ButtonWithInformationViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.vertical.VerticalButtonWithInformationViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonsActionSheet.data.ButtonsActionSheetConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonsActionSheet.presentation.ButtonsActionSheetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.data.DisposableBannerConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.presentation.DisposableBannerViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.data.EmptyStateWidgetConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.presentation.full.EmptyStateFullWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.presentation.fullBottomButtons.EmptyStateFullBottomButtonsWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.presentation.overlay.EmptyStateOverlayWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.presentation.wrap.EmptyStateWrapWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.full.EmptyStateV2FullNoFiltersWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.full.EmptyStateV2FullWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.overlay.EmptyStateV2OverlayNoFiltersWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.overlay.EmptyStateV2OverlayWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.wrap.EmptyStateV2WrapNoFiltersWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.presentation.mapper.wrap.EmptyStateV2WrapWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data.EmptyStateV3Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.mapper.EmptyStateV3FullWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.mapper.EmptyStateV3WrapWidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.footer.FiltersFooterStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header.FiltersHeaderStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.FiltersSectionViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.data.FiltersButtonWithCounterConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.presentation.FiltersButtonWithCounterViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconButton.data.IconButtonConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconButton.presentation.IconButtonViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.data.InvisibleRefresherConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.presentation.InvisibleRefresherOverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data.MilesForBuyersConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data.MilesForBuyersModalInfoConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.overlay.MilesForBuyersModalInfoButtonsOverlayMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.MilesForBuyersModalInfoViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.modalToggler.data.ModalTogglerConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.modalToggler.presentation.ModalTogglerViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.navBarButton.data.NavBarButtonConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.navBarButton.presentation.NavBarButtonViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v1.data.NotificationInformerConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v1.data.RedirectSnackBarConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v1.presentation.NotificationInformerViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v2.data.NotificationInformerV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationInformer.v2.presentation.NotificationInformerV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.data.NotificationSubscriptionBannerConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v1.data.OverlayButtonsConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v1.presentation.OverlayButtonsViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.data.OverlayButtonsV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.OverlayButtonsV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.pendingAction.data.PendingActionConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.pendingAction.presentation.PendingActionNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.data.PricesHistogramConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.data.PricesHistogramV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.data.PromoCodeApplierConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.presentation.PromoCodeApplierViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.data.RailwayScrollPriceCalendarConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.data.RoundedNavBarConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.presentation.RoundedNavBarViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.data.ScrollAnchorConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.data.ServicePackageCarouselConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.shortcutsController.data.ShortcutsControllerConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.shortcutsController.presentation.ShortcutsControllerNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v1.data.TimeoutAndActionConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v1.presentation.TimeoutAndActionViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v1.data.TravelCellListConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v1.presentation.TravelCellListViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.data.TravelCellListV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.presentation.list.TravelCellListV2ListViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.presentation.title.TravelCellListV2TitleViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.data.TravelCellListV3Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelFiltersButton.data.TravelFiltersButtonConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelFiltersButton.presentation.TravelFiltersButtonViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelHiddenErrorTimeout.data.TravelHiddenErrorTimeoutConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelHiddenErrorTimeout.presentation.TravelHiddenErrorTimeoutNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelImage.v1.data.TravelImageConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelImage.v1.presentation.TravelImageViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelImportantInfoModal.data.TravelImportantInfoModalConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelImportantInfoModal.presentation.TravelImportantInfoModalViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelInfoBadge.v1.data.TravelInfoBadgeConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelInfoBadge.v1.presentation.TravelInfoBadgeViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelLinkButton.v1.data.TravelLinkButtonConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelLinkButton.v1.presentation.TravelLinkButtonViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelNavTitle.v3.data.TravelNavTitleV3Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelNavTitle.v3.presentation.TravelNavTitleV3ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.data.TravelPaymentV3Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.TravelPaymentV3ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.data.TravelPaymentV4Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.data.TravelSortingV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.presentation.TravelSortingV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.data.TravelTextConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.presentation.TravelTextViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.presentation.overlay.bottom.TravelTextBottomOverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.presentation.overlay.top.TravelTextTopOverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v2.data.TravelTextV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v2.presentation.TravelTextV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v2.presentation.bottom.TravelTextV2StickyBottomViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v2.presentation.top.TravelTextV2StickyTopViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.data.TravelTextWithBadgeConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.presentation.TravelTextWithBadgeViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.data.TravelTextWithSubtitleConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.presentation.TravelTextWithSubtitleViewMapper;
import ru.ozon.app.android.travel.feature.general.main.di.TravelGeneralMainWidgetFactoryModule_ProvideWidgets$main_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.main.di.TravelGeneralMainWidgetV2Module_Companion_ProvideComposeWidgets$main_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.main.di.TravelGeneralMainWidgetV2Module_Companion_ProvideWidgets$main_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.data.CalendarConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation.CalendarViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarPriceLegend.data.CalendarPriceLegendConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarPriceLegend.presentation.CalendarPriceLegendViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.data.HotTicketsConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.data.MainTabsConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.MainTabsViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.data.MiniAppTitleConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitleViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.data.PointsInputWidgetConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.presentation.PointInputNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data.PriceCalendarFooterConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation.PriceCalendarFooterViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.data.PriceCalendarFooterV3Config;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.PriceCalendarFooterV3BottomViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.data.PriceCalendarHeaderV3Config;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.presentation.PriceCalendarHeaderV3OverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4Config;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4ViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.data.SearchFormBarConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.presentation.SearchFormBarViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.data.StickyPromoRedirectV2Config;
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.presentation.StickyPromoRedirectV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.data.TopTravelModalConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.TopTravelModalViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelNotificationModalCheck.data.TravelNotificationModalCheckConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelNotificationModalCheck.presentation.TravelNotificationModalCheckNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data.TravelPassengersCountSelectorConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersCountSelectorViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.data.TravelPriceCalendarV3Config;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.TravelPriceCalendarV3ViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.data.TravelSearchBarConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation.TravelSearchBarViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderCounter.data.UnpaidOrderCounterConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.data.UnpaidOrderListConfig;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.UnpaidOrderListViewMapper;
import ru.ozon.app.android.travel.feature.general.order.di.TravelGeneralOrderWidgetModule_ProvideWidgetsFactory;
import ru.ozon.app.android.travel.feature.general.order.di.TravelGeneralOrderWidgetV2Module_Companion_ProvideComposeWidgets$order_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.order.di.TravelGeneralOrderWidgetV2Module_Companion_ProvideWidgets$order_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.data.ButtonsBarConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.presentation.ButtonsBarViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.presentation.sticky.ButtonsBarStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.buyersContacts.data.BuyersContactsConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.buyersContacts.presentation.BuyersContactsViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.data.HorizontalIconButtonsConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.presentation.HorizontalIconButtonsViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderHeader.data.OrderHeaderConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderHeader.presentation.OrderHeaderViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.data.OrderNavBarConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarOverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPassengersDetails.data.OrderPassengersDetailsConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPassengersDetails.presentation.OrderPassengersDetailsViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.data.OrderPaymentStatusConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.presentation.OrderPaymentStatusViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.presentation.timer.OrderPaymentStatusTimerViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.data.PaymentDetailsConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.presentation.PaymentDetailsViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.stepListWithScale.data.StepListWithScaleConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.stepListWithScale.presentation.StepListWithScaleViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.data.TravelModalPriceDetailInformationV3Config;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.TravelModalPriceDetailInformationV3ViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.data.TravelModalPriceDetailInformationV4Config;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.TravelModalPriceDetailInformationV4ViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderLinks.data.TravelOrderLinksConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderLinks.presentation.TravelOrderLinksViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.data.TravelOrderListMobileConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.TravelOrderListMobileViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.timer.TravelOrderListTimeViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.data.TravelOrderNavContentConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.presentation.TravelOrderNavContentViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data.TravelPriceDetailInformationV2Config;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.TravelPriceDetailInformationV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.sticky.TravelPriceDetailInformationV2NoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.services.di.TravelGeneralServicesWidgetFactoryModule_ProvideWidgetsFactory;
import ru.ozon.app.android.travel.feature.general.services.di.TravelGeneralServicesWidgetV2Module_Companion_ProvideWidgets$services_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.data.AdditionalReturnServiceCellConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.presentation.AdditionalReturnServiceCellViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.data.AdditionalServiceCellConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.presentation.AdditionalServiceCellViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.data.AdditionalServicesOfferConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.data.AdditionalServicesOfferShadedConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.presentation.AdditionalServicesOfferViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.data.AdditionalServicesTotalConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.data.AdditionalServicesTotalShadedConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.presentation.AdditionalServicesTotalViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.hiddenQueryServicesManager.data.HiddenQueryServicesManagerConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.hiddenQueryServicesManager.presentation.HiddenQueryServicesManagerViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.data.InfoPopupConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.presentation.InfoPopupViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.data.InfoPopupV2Config;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.presentation.InfoPopupV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.data.InfoPopupV4Config;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.InfoPopupV4ViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky.InfoPopupV4StickyViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.serviceBlock.data.ServiceBlockConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.serviceBlock.data.ServiceBlockShadedConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.serviceBlock.presentation.ServiceBlockViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.textInfoCells.data.TextInfoCellsConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.textInfoCells.presentation.TextInfoCellsViewMapper;
import ru.ozon.app.android.travel.feature.hotels.di.TravelHotelsWidgetFactoryModule_ProvideWidgets$hotels_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.hotels.di.TravelHotelsWidgetV2Module_Companion_ProvideWidgets$hotels_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.hotels.map.di.TravelHotelsMapWidgetV2Module;
import ru.ozon.app.android.travel.feature.hotels.map.di.TravelHotelsMapWidgetV2Module_ProvideWidgets$map_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data.AddHotelGuestsV5Config;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5ViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.scroller.AddHotelGuestsScrollerViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.data.CellWithTimerConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.presentation.CellWithTimerViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5Config;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.HotelsSearchResultsV5SkeletonViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.map.HotelsSearchResultsV5MapOverlayViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.notification.HotelsSearchResultsV5NotificationViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.onboarding.HotelsSearchResultsV5OnboardingNoUiViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.data.HotelsGalleryFeedConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.presentation.HotelsGalleryFeedViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.data.HotelsHorizontalShelvesConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.HotelsHorizontalShelvesViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.data.HotelsOrderRoomsDetailsConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.presentation.HotelsOrderRoomsDetailsViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data.HotelsPageButtonV5Config;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5OverlayViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.data.HotelsPageDetailsConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.HotelsPageDetailsViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.data.HotelsPageDetailsFullConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.HotelsPageDetailsFullViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.data.HotelsPageHeaderConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.data.HotelsPageHeaderRoundedConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.presentation.HotelsPageHeaderViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageReviews.data.HotelsPageReviewsConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageReviews.presentation.HotelsPageReviewsViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.data.HotelsReviewsConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.presentation.HotelsReviewsViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.data.HotelsRoomsDetailsFullConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation.HotelsRoomsDetailsFullViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.data.HotelsRoomsDetailsFullV3Config;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.presentation.HotelsRoomsDetailsFullV3ViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsVerticalShelves.data.HotelsVerticalShelvesConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsVerticalShelves.presentation.HotelsVerticalShelvesViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.data.SkiResortInfoConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.data.TransparentNavBarV2Config;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2ViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.data.TravelHotelCardV3Config;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation.TravelHotelCardV3ViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.data.TravelRoomsGuestsCardCompactConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.data.TravelRoomsGuestsCardConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.compactVersion.TravelRoomsGuestsCardCompactViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.fullVersion.TravelRoomsGuestsCardViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.di.TravelOldWidgetsWidgetV2Module_Companion_ProvideWidgets$old_widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data.ReportDocumentConfig;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation.ReportDocumentViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.data.TravelModalPriceDetailInformationConfig;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.presentation.header.TravelModalPriceDetailInformationHeaderViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.presentation.sections.TravelModalPriceDetailInformationViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.data.TravelPriceDetailInformationConfig;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.TravelPriceDetailInformationViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.sticky.TravelPriceDetailInformationNoUiViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.data.TravelScrollPriceCalendarConfig;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data.TravelScrollPriceCalendarV2Config;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.TravelScrollPriceCalendarV2ViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelSorting.data.TravelSortingConfig;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelSorting.presentation.TravelSortingViewMapper;
import ru.ozon.app.android.travel.feature.railway.di.TravelRailwayWidgetFactoryModule;
import ru.ozon.app.android.travel.feature.railway.di.TravelRailwayWidgetFactoryModule_ProvideWidgets$railway_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.railway.di.TravelRailwayWidgetV2Module_Companion_ProvideComposeWidgets$railway_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.railway.di.TravelRailwayWidgetV2Module_Companion_ProvideWidget$railway_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.data.AvailablePromotionConfig;
import ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.presentation.AvailablePromotionViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayStepsHeader.data.RailwayStepsHeaderConfig;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayStepsHeader.presentation.RailwayStepsHeaderViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.data.RailwayTrainInformationConfig;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.presentation.RailwayTrainInformationViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageDetails.data.TravelCarriageDetailsConfig;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageDetails.presentation.TravelCarriageDetailsViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data.TravelCarriageSelectV3Config;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.TravelCarriageSelectV3ViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.data.TravelCarriageTypeSelectV2Config;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation.TravelCarriageTypeSelectV2ViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelNavTrain.data.TravelNavTrainConfig;
import ru.ozon.app.android.travel.feature.railway.widgets.travelNavTrain.presentation.TravelNavTrainViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.TravelRailwaySeatSelectWithSchemeV2Config;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.button.TravelRailwaySeatSelectStickyButtonViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.TravelRailwaySeatSelectFooterViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeV2ViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainCheckIn.data.TravelTrainCheckInConfig;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainCheckIn.presentation.TravelTrainCheckInViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.data.TravelTrainRouteConfig;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TravelTrainRouteViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.data.TravelTrainSeatInfoV2Config;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.presentation.TravelTrainSeatInfoV2ViewMapper;
import ru.ozon.app.android.travel.feature.tours.di.TravelToursWidgetFactoryModule;
import ru.ozon.app.android.travel.feature.tours.di.TravelToursWidgetFactoryModule_ProvideWidgets$tours_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.tours.di.TravelToursWidgetV2Module_Companion_ProvideComposeWidgets$tours_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.tours.di.TravelToursWidgetV2Module_Companion_ProvideWidgets$tours_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.button.presentation.OrderToursChangeFormButtonViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.data.OrderToursChangeFormConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation.OrderToursChangeFormViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3Config;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.config.TouristCountSelectorV3ConfigViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.footer.TouristCountSelectorV3FooterViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.data.ToursBookInformerConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.presentation.ToursBookInformerViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.data.ToursFlightDetailsConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.presentation.ToursFlightDetailsViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data.ToursFlightOptionsConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.ToursFlightOptionsViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.timer.ToursFlightOptionsTimerViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.data.ToursHotelInfoCardConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.presentation.ToursHotelInfoCardViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.data.ToursLoaderConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation.ToursLoaderViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data.ToursMealConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.ToursMealViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyBottom.ToursMealStickyBottomViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyTop.ToursMealStickyTopViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.loading.ToursSearchResultLoadingOverlayViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.data.ToursSummaryConfig;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.presentation.ToursSummaryViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.presentation.header.ToursSummaryHeaderViewMapper;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingViewMapper;
import ru.ozon.app.android.ugc.core.di.modules.UgcCoreWidgetsModule;
import ru.ozon.app.android.ugc.core.di.modules.UgcCoreWidgetsModule_ProvideComposeWidgets$core_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.ugc.core.di.modules.UgcCoreWidgetsModule_ProvideSingleReviewMappers$core_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.ugc.core.di.modules.UgcCoreWidgetsModule_ProvideWidgets$core_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentInputV3NoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsHeaderV3NoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsListHeaderV3ViewMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsListV3Config;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsListV3ViewMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsScrollNoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.listreviews.core.ListReviewsConfig;
import ru.ozon.app.android.ugc.core.widgets.listreviews.core.more.ListReviewsMoreViewMapper;
import ru.ozon.app.android.ugc.core.widgets.listreviews.core.sorts.ListReviewsSortsViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core.ReportAbuseFormButtonViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core.ReportAbuseFormConfig;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core.ReportAbuseFormViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.core.ReviewGalleryFeedConfig;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.core.ReviewGalleryFeedRoundedBottomViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.core.ReviewGalleryFeedViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.core.ReviewGalleryPreviewConfig;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.core.ReviewGalleryPreviewViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryV2Config;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryV2NoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryViewMapper;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionConfig;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText.SelectionItemDescriptionTextViewMapper;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle.SelectionItemDescriptionTitleViewMapper;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.noui.SelectionItemDescriptionNoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.socialHeader.SelectionItemDescriptionSocialHeaderViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.SingleReviewConfig;
import ru.ozon.app.android.ugc.core.widgets.singlereview.SingleReviewViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.aspects.SingleReviewAspectsViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.badgeText.BadgeTextViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.ButtonsViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.CommentFooterViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.contextReviews.ContextReviewsViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaList.SingleReviewMediaListViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow.SingleReviewGalleryRowViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.singleVideo.SingleReviewSingleVideoViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgeItemsList.SingleReviewBadgeItemsListViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgesList.SingleReviewBadgesListViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating.SingleReviewHeaderInfoViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.singleBadge.SingleReviewBadgeViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader.SingleReviewSocialHeaderViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo.SingleReviewUserInfoViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.variant.SingleReviewVariantViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.MediaCentricViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentricHeader.MediaCentricHeaderViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.otherReviewButton.OtherReviewButtonViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.singleAspect.SingleReviewAspectViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.TranslateButtonViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.userLikes.UserLikesViewMapper;
import ru.ozon.app.android.ugc.core.widgets.tilesReviewsList.core.TilesReviewsListConfig;
import ru.ozon.app.android.ugc.di.modules.UgcWidgetsModule;
import ru.ozon.app.android.ugc.di.modules.UgcWidgetsModule_ProvideComposeWidgets$ugc_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.ugc.di.modules.UgcWidgetsModule_ProvideWidgets$ugc_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.ugc.payout.di.modules.UgcPayoutWidgetsModule;
import ru.ozon.app.android.ugc.payout.di.modules.UgcPayoutWidgetsModule_ProvideWidgets$payout_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core.PinnedReviewConfig;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core.PinnedReviewViewMapper;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core.PromoReviewItemViewMapper;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core.PromoReviewProductsV3Config;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.core.PromoReviewSectionHeaderViewMapper;
import ru.ozon.app.android.ugc.widgets.additionalReview.core.AdditionalReviewConfig;
import ru.ozon.app.android.ugc.widgets.additionalReview.core.AdditionalReviewNoUIViewMapper;
import ru.ozon.app.android.ugc.widgets.additionalReview.core.AdditionalReviewViewMapper;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.core.AdditionalReviewV2Config;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.core.AdditionalReviewV2ViewMapper;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaPickerViewMapper;
import ru.ozon.app.android.ugc.widgets.createReviewButton.core.CreateReviewButtonConfig;
import ru.ozon.app.android.ugc.widgets.createReviewButton.core.CreateReviewButtonViewMapper;
import ru.ozon.app.android.ugc.widgets.createlistwrapper.data.CreateListWrapperConfig;
import ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperNoUiViewMapper;
import ru.ozon.app.android.ugc.widgets.listanswers.core.ListAnswersConfig;
import ru.ozon.app.android.ugc.widgets.listanswers.core.answer.AnswerNoUiViewMapper;
import ru.ozon.app.android.ugc.widgets.listanswers.core.answer.AnswerViewMapper;
import ru.ozon.app.android.ugc.widgets.listquestions.core.ListQuestionsConfig;
import ru.ozon.app.android.ugc.widgets.listquestions.core.more.MoreQuestionsViewMapper;
import ru.ozon.app.android.ugc.widgets.newquestionform.core.NewQuestionFormConfig;
import ru.ozon.app.android.ugc.widgets.newquestionform.core.NewQuestionFormOverlayViewMapper;
import ru.ozon.app.android.ugc.widgets.productVariant.core.ProductVariantConfig;
import ru.ozon.app.android.ugc.widgets.productVariant.presentation.ProductVariantViewMapper;
import ru.ozon.app.android.ugc.widgets.productsforreview.core.ProductsForReviewConfig;
import ru.ozon.app.android.ugc.widgets.productsforreview.core.ProductsForReviewViewMapper;
import ru.ozon.app.android.ugc.widgets.profileHeader.core.ProfileHeaderConfig;
import ru.ozon.app.android.ugc.widgets.profileHeader.core.ProfileHeaderViewMapper;
import ru.ozon.app.android.ugc.widgets.profileInputs.core.ProfileInputsConfig;
import ru.ozon.app.android.ugc.widgets.profileInputs.core.ProfileInputsViewMapper;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.core.RateItemsV2Config;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2OverlayViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewFiltersButton.core.ReviewFiltersButtonConfig;
import ru.ozon.app.android.ugc.widgets.reviewFiltersButton.presentation.ReviewFiltersButtonViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewTiles.core.ReviewTilesConfig;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.ReviewTilesViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.core.ReviewsFilterConfig;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.core.ReviewsFilterViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.bottomText.ReviewsPreviewBottomTextViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.core.ReviewsPreviewConfig;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.image.ReviewsPreviewImageViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewsprogress.core.ReviewsProgressConfig;
import ru.ozon.app.android.ugc.widgets.reviewsprogress.core.ReviewsProgressViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewstatus.core.ReviewStatusConfig;
import ru.ozon.app.android.ugc.widgets.reviewstatus.core.ReviewStatusViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewstitle.ReviewsTitleConfig;
import ru.ozon.app.android.ugc.widgets.reviewstitle.ReviewsTitleViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.cell.SelectionFormCellViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.cellSelector.SelectionFormCellSelectorViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.core.SelectionItemFormConfig;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.disclaimer.SelectionFormDisclaimerViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.header.SelectionFormHeaderViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormTextAreaViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormTextFieldViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.SelectionFormProductPickerViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton.SelectionFormSubmitButtonViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionsList.core.SelectionsListConfig;
import ru.ozon.app.android.ugc.widgets.selectionsList.core.SelectionsListGridEmptyViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionsList.core.SelectionsListGridViewMapper;
import ru.ozon.app.android.ugc.widgets.selectionsList.core.SelectionsListHorizontalViewMapper;
import ru.ozon.app.android.ugc.widgets.singlequestion.core.SingleQuestionConfig;
import ru.ozon.app.android.ugc.widgets.singlequestion.core.SingleQuestionViewMapper;
import ru.ozon.app.android.ugc.widgets.stickyBubble.core.StickyBubbleConfig;
import ru.ozon.app.android.ugc.widgets.stickyBubble.core.StickyBubbleViewMapper;
import ru.ozon.app.android.ugc.widgets.ugccounters.core.UgcCountersConfig;
import ru.ozon.app.android.ugc.widgets.ugccounters.core.UgcCountersViewMapper;
import ru.ozon.app.android.ugc.widgets.ugccounters.core.UgcCountersWidgetPlaceholderViewMapper;
import ru.ozon.app.android.ugc.widgets.usersFinalRating.core.UsersFinalRatingConfig;
import ru.ozon.app.android.ugc.widgets.usersFinalRating.core.UsersFinalRatingViewMapper;
import ru.ozon.app.android.ugc.widgets.usersFinalRatingV2.core.UsersFinalRatingV2Config;
import ru.ozon.app.android.ugc.widgets.usersFinalRatingV2.core.UsersFinalRatingV2ViewMapper;
import ru.ozon.app.android.ugc.widgets.usersGrades.core.UsersGradesConfig;
import ru.ozon.app.android.ugc.widgets.usersGrades.core.UsersGradesViewMapper;
import ru.ozon.app.android.ui.widgets.textWidget.data.TextWidgetConfig;
import ru.ozon.app.android.ui.widgets.textWidget.di.TextWidgetModule;
import ru.ozon.app.android.ui.widgets.textWidget.di.TextWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.data.MaxiTileConfig;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.di.MaxiTileWidgetModule_ProvideWidgets$universalwidgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.MaxiTileViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.core.UniversalObjectScrollConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.core.UniversalObjectScrollViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.di.ObjectScrollWidgetV2Module;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.di.ObjectScrollWidgetV2Module_ProvideWidgets$universalwidgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.core.UniversalObjectConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectV2Module;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectV2Module_ProvideWidgetsFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer.UniversalWidgetFooterViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.core.UniversalObjectGrid2ViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core.UniversalGrid3TextInsideItemViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core.UniversalGrid3TextOutsideItemViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.UniversalObjectGridOneBannerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.UniversalObjectGridOneViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.UniversalObjectGridOneSingleItemBannerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.UniversalObjectGridOneSingleItemViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.header.UniversalWidgetHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.navi.UniversalObjectNaviViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.data.ScrollConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollModule_ProvideSkuScrollFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation.SkuScrollViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.separator.SkuSeparatorViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.data.SkuGrid1Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Module_ProvideSkuGrid1Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.presentation.SkuGrid1ViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.data.SkuGrid2Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.di.SkuGrid2Module_ProvideSkuGrid2Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation.SkuGrid2ThinViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation.SkuGrid2ViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.data.SkuGrid3Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.di.SkuGrid3Module_ProvideSkuGrid3Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation.SkuGrid3ThinViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation.SkuGrid3ViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.data.SkuListConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.di.SkuListModule_ProvideSkuListFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.presentation.SkuListViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.mapper.SmallTileMoleculeMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.data.TileGrid2Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGridV2Module_ProvideTileGrid2Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.doubleCartButton.TileGrid2DoubleCartButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.emptyCartButton.TileGrid2EmptyCartButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.reservebutton.TileGrid2ReserveButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartButton.TileGrid2CartButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartContainer.TileGrid2CartContainerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.separator.TileGrid2SimpleSeparatorMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2DefaultViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2SimpleRightViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2ThinViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.TileGrid3Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.mapper.TileGrid3Mapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3Module_ProvideTileGrid3Factory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.TileGrid3ViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.separator.TileGrid3SeparatorMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.StorefrontWidgetsModule_ProvideWidgets$universalwidgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.TileScrollViewMapper;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.widgets.commonTextWidget.data.CommonTextWidgetConfig;
import ru.ozon.app.android.widgets.commonTextWidget.di.CommonTextWidgetModule;
import ru.ozon.app.android.widgets.commonTextWidget.di.CommonTextWidgetModule_ProvideWidgetFactory;
import ru.ozon.app.android.widgets.debug.di.DebugWidgetsModule;
import ru.ozon.app.android.widgets.debug.di.DebugWidgetsModule_ProvideWidgets$widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.widgets.di.CommonWidgetsV2Module_ProvideComposeWidgets$widgets_prodGoogleAllVendorsReleaseFactory;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;
import ru.ozon.app.android.widgets.plainText.di.PlainTextWidgetModule_ProvideWidgetFactory;

/* loaded from: classes6.dex */
public final class DaggerWidgetRegistrationComponent {

    private static final class Factory implements WidgetRegistrationComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.injection.widget.WidgetRegistrationComponent.Factory
        public WidgetRegistrationComponent create(Context context, Application application, JsonParser jsonParser, JsonSerializer jsonSerializer, Moshi moshi, FeatureChecker featureChecker, AppType appType) {
            context.getClass();
            application.getClass();
            jsonParser.getClass();
            jsonSerializer.getClass();
            moshi.getClass();
            featureChecker.getClass();
            appType.getClass();
            return new WidgetRegistrationComponentImpl(new SearchWidgetV2DiModule(), new PdpWidgetsModule(), new PdpOldWidgetsModule(), new UgcWidgetsModule(), new UgcCoreWidgetsModule(), new UgcPayoutWidgetsModule(), new OrdersCommonModule(), new OrderListModule(), new ProductsPackageModule(), new SelectPaymentModule(), new NavBarModule(), new ChangeDeliveryTimeButtonModule(), new RecipientWidgetModule(), new OrderFiltersModule(), new OrderGalleryWidgetModule(), new DeliveryDateChangedComplaintFormModule(), new DeliveryComplainWidgetModule(), new BarcodeWidgetModule(), new ActionButtonV2WidgetModule(), new ActiveOrdersCountWidgetModule(), new ClickToDeliveryModalWidgetModule(), new BarcodePopoverWidgetModule(), new OrderProductsWidgetModule(), new EditCredentialsWidgetsModule(), new AddressCommunicationWidgetModule(), new BannerListWidgetModule(), new CatalogShelfWidgetModule(), new CatalogueTabsWidgetModule(), new CatalogTabsV2WidgetModule(), new CouponGoalsV2WidgetModule(), new CurtainGoalsV2WidgetModule(), new OrderTrackingWidgetModule(), new PromoCarouselWidgetModule(), new ExpressRedirectButtonWidgetModule(), new ExpressNavigationSliderWidgetModule(), new FakeSearchWidgetModule(), new NavSliderV3WidgetModule(), new ScrollWidgetModule(), new FreshMiniappHeaderWidgetModule(), new ScrollActionListModule(), new HeaderWidgetModule(), new CatalogTileScrollWidgetModule(), new CatalogTileWidgetModule(), new NotificationCarouselV2WidgetModule(), new CustomCellWidgetModule(), new WiseSkuScrollWidgetModule(), new StickyPromoBannerWidgetModule(), new AddressPopupButtonWidgetModule(), new DeliveryRatingWidgetModule(), new GeotrackingMapV2WidgetModule(), new OrderInfoWidgetModule(), new OrderItemsWidgetModule(), new OrderStatusV3WidgetModule(), new GeotrackingBottomButtonWidgetModule(), new FreshCartWidgetsModule(), new CartTileWidgetModule(), new CartClickTileWidgetModule(), new CartMasterWidgetModule(), new CartIconButtonWidgetModule(), new StickyTotalWidgetModule(), new DetailedCheckoutProductsWidgetModule(), new CellListWidgetModule(), new FreshUnsortedWidgetsModule(), new AddressSelectorLiteWidgetModule(), new AutoCatalogWidgetModule(), new BottomCartWidgetModule(), new BrandzoneCarouselWidgetModule(), new CharityAddressSelectorWidgetModule(), new CourierTipsWidgetModule(), new DeliveryProblemsWidgetModule(), new DeliveryToCharitiesInfoModule(), new DeliveryWidgetV2Module(), new DeliveryWidgetV3Module(), new DeliveryWidgetBigOzonModule(), new HomeButtonWidgetModule(), new IconButtonsWidgetModule(), new InfoDropDownWidgetModule(), new IslandSeparatorWidgetModule(), new OrderStatusLiveActivityWidgetModule(), new ProductsInBotWidgetModule(), new SearchBarWidgetModule(), new WholeSaleWidgetModule(), new FreshServiceCarouselWidgetModule(), new ExpressNavBarWidgetModule(), new ExpressNavTitleWidgetModule(), new ExpressAvailabilityWidgetModule(), new FeedbackCurtainWidgetModule(), new PromoOfferWidgetModule(), new RecShelfWidgetModule(), new SeparatorBadgeWidgetModule(), new ImageBadgeListWidgetModule(), new BottomContainerWidgetModule(), new ProductsInBotV2WidgetModule(), new PdpAspectsWidgetModule(), new PdpNutritionInfoWidgetModule(), new FreshTileGridWidgetModule(), new SteppedThermometerModule(), new TravelToursWidgetFactoryModule(), new TravelRailwayWidgetFactoryModule(), new TravelHotelsMapWidgetV2Module(), new TravelGeneralWidgetV2Module(), new TravelGeneralWidgetFactoryModule(), new TravelGeneralBookingWidgetFactoryModule(), new PremiumPointsTrainV2Module(), new ReturnListWidgetModule(), new ReturnListEmptyModule(), new ReturnDetailsWidgetModule(), new ReturnDetailsHeaderButtonWidgetModule(), new ReturnActionModalWidgetModule(), new ReturnableItemsListWidgetModule(), new ReturnEditWidgetModule(), new ReturnDetailsTotalWidgetModule(), new ReturnActionButtonsWidgetModule(), new ReturnBalanceModalWidgetModule(), new OrderActionsV2Module(), new OrderDetailsItemModule(), new CustomsFeesModule(), new OrderTotalModule(), new OrderTimelineV2Module(), new OrderTrackShipmentModule(), new TimeLeftWidgetModule(), new OrderActionsModule(), new OrderDeliveryDetailV2Module(), new OrderStatusModule(), new ChequesWidgetModule(), new DateSelectorWidgetModule(), new DeliveryTimeSelectorV1Module(), new RadioGroupWidgetModule(), new ReplyToCourierInfoWidgetModule(), new SelectCancelReasonModule(), new ExtendBackgroundWidgetModule(), new ModalConstructorModule(), new CheckoutWidget2Module(), new AdvPageStayDiModule(), new MarketingWidgets2Module(), new MarketingWidgetsFactoryModule(), new SisBrandFavoriteWidgetModule(), new BigPromoCheckoutWidgetModule(), new MegaDrawModule(), new NaviBlocksModule(), new NaviBlocksV3Module(), new NaviBlocksV5Module(), new NaviCategoriesModule(), new NaviGridModule(), new NaviGrid3Module(), new VideoTileWidgetModule(), new VideoScrollWidgetModule(), new FinanceWidgetModule(), new FinanceWidgetV2Module(), new AppOnboardingWidgetModule(), new PromoPlacementModule(), new ProfileIconButtonWidgetModule(), new NavLikezoneCaruselDiModule(), new DefaultWidgetsModule(), new FavoriteProductV2WidgetModule(), new FlashCallWidget2Module(), new SellerProductsWidgetsModule(), new FaqWidgetModule(), new PlayStoriesV3WidgetModule(), new CartWidget2Module(), new ControlsModule(), new ControlsV3Module(), new MasterWidgetModule(), new TotalV3WidgetModule(), new CartSplitV2Module(), new CartSplitV2ModuleV2(), new EmptyCartV2Module(), new CheckoutPrefetchWidgetModule(), new PixelModule(), new AsyncWidgetModule(), new DebugWidgetsModule(), new ActionCardsModule(), new ProgressiveTextModule(), new ru.ozon.app.android.di.IslandSeparatorWidgetModule(), new OrderDoneWidgets2Module(), new OrderDonePaymentStatusWidgetModule(), new OrderDoneDisclaimerWidgetModule(), new OrderDoneTotalWidgetModule(), new OrderDoneCrossButtonWidgetModule(), new OrderDoneButtonBarWidgetModule(), new EnableNotificationsSnackbarWidgetModule(), new ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsWidgetModule(), new ObjectScrollWidgetV2Module(), new UniversalObjectV2Module(), new CommonTextWidgetModule(), new ActionButtonModule(), new GeoWidget2Module(), new DeliveryCabinetWidgetV2Module(), new DeliveryReviewFormWidget2Module(), new DeliveryReviewHeaderModule(), new DeliveryReviewSuccessModule(), new ReturnCreationWidgetsModule(), new ReturnCreationModalWidgetModule(), new ReturnCreationActiveDeliveriesWidgetModule(), new ReturnCreationMethodsWidgetModule(), new ReturnCreationTotalWidgetModule(), new ReturnCreationSelectedItemsWidgetModule(), new ReturnCreationStepsWidgetModule(), new ReturnCreationOrdersWidgetModule(), new ReturnCreationOrderWidgetModule(), new ReturnCreationReasonsWidgetModule(), new ReturnTextAreaButtonWidgetModule(), new ReturnCreationPhotoPickerWidgetModule(), new ReturnCreationItemInfoWidgetModule(), new DeliveryOrderOnDetailsWidgetModule(), new DeliveryInfoWidgetModule(), new DeliveryOrderInputWidgetModule(), new GroupButtonsWidgetModule(), new DeliveryOrderListWidgetModule(), new TipCourierDetailsV2Module(), new TipCourierHeaderWidgetModule(), new TipCourierReviewV2WidgetModule(), new TipProductPhotosModule(), new EmptyScreenWidgetModule(), new BarcodeProductsListWidgetModule(), new BorderlessButtonWidgetModule(), new TextWidgetModule(), new ru.ozon.app.android.returns.cancels.cancelReasons.di.SelectCancelReasonModule(), new ru.ozon.app.android.returns.cancels.modalConstructor.di.ModalConstructorModule(), new PromptStatusWidgetModule(), new ResponseActionsWidgetModule(), context, application, jsonParser, jsonSerializer, moshi, featureChecker, appType, 0);
        }

        private Factory() {
        }
    }

    private static final class WidgetRegistrationComponentImpl implements WidgetRegistrationComponent {
        private final ActionButtonModule actionButtonModule;
        private final ActionButtonV2WidgetModule actionButtonV2WidgetModule;
        private final ActionCardsModule actionCardsModule;
        private final ActiveOrdersCountWidgetModule activeOrdersCountWidgetModule;
        private final AddressCommunicationWidgetModule addressCommunicationWidgetModule;
        private final AddressPopupButtonWidgetModule addressPopupButtonWidgetModule;
        private final AddressSelectorLiteWidgetModule addressSelectorLiteWidgetModule;
        private final AdvPageStayDiModule advPageStayDiModule;
        private final AppOnboardingWidgetModule appOnboardingWidgetModule;
        private final AppType appType;
        private final Application application;
        private final AsyncWidgetModule asyncWidgetModule;
        private final AutoCatalogWidgetModule autoCatalogWidgetModule;
        private final BannerListWidgetModule bannerListWidgetModule;
        private final BarcodePopoverWidgetModule barcodePopoverWidgetModule;
        private final BarcodeProductsListWidgetModule barcodeProductsListWidgetModule;
        private final BarcodeWidgetModule barcodeWidgetModule;
        private final BigPromoCheckoutWidgetModule bigPromoCheckoutWidgetModule;
        private final BorderlessButtonWidgetModule borderlessButtonWidgetModule;
        private final BottomCartWidgetModule bottomCartWidgetModule;
        private final BottomContainerWidgetModule bottomContainerWidgetModule;
        private final BrandzoneCarouselWidgetModule brandzoneCarouselWidgetModule;
        private final CartClickTileWidgetModule cartClickTileWidgetModule;
        private final CartIconButtonWidgetModule cartIconButtonWidgetModule;
        private final CartMasterWidgetModule cartMasterWidgetModule;
        private final CartSplitV2Module cartSplitV2Module;
        private final CartSplitV2ModuleV2 cartSplitV2ModuleV2;
        private final CartTileWidgetModule cartTileWidgetModule;
        private final CartWidget2Module cartWidget2Module;
        private final CatalogShelfWidgetModule catalogShelfWidgetModule;
        private final CatalogTabsV2WidgetModule catalogTabsV2WidgetModule;
        private final CatalogTileScrollWidgetModule catalogTileScrollWidgetModule;
        private final CatalogTileWidgetModule catalogTileWidgetModule;
        private final CatalogueTabsWidgetModule catalogueTabsWidgetModule;
        private final CellListWidgetModule cellListWidgetModule;
        private final ChangeDeliveryTimeButtonModule changeDeliveryTimeButtonModule;
        private final CharityAddressSelectorWidgetModule charityAddressSelectorWidgetModule;
        private final CheckoutPrefetchWidgetModule checkoutPrefetchWidgetModule;
        private final CheckoutWidget2Module checkoutWidget2Module;
        private final ChequesWidgetModule chequesWidgetModule;
        private final ClickToDeliveryModalWidgetModule clickToDeliveryModalWidgetModule;
        private final CommonTextWidgetModule commonTextWidgetModule;
        private final Context context;
        private final ControlsModule controlsModule;
        private final ControlsV3Module controlsV3Module;
        private final CouponGoalsV2WidgetModule couponGoalsV2WidgetModule;
        private final CourierTipsWidgetModule courierTipsWidgetModule;
        private final ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsWidgetModule courierTipsWidgetModule2;
        private final CurtainGoalsV2WidgetModule curtainGoalsV2WidgetModule;
        private final CustomCellWidgetModule customCellWidgetModule;
        private final CustomsFeesModule customsFeesModule;
        private final DateSelectorWidgetModule dateSelectorWidgetModule;
        private final DebugWidgetsModule debugWidgetsModule;
        private final DefaultWidgetsModule defaultWidgetsModule;
        private final DeliveryCabinetWidgetV2Module deliveryCabinetWidgetV2Module;
        private final DeliveryComplainWidgetModule deliveryComplainWidgetModule;
        private final DeliveryDateChangedComplaintFormModule deliveryDateChangedComplaintFormModule;
        private final DeliveryInfoWidgetModule deliveryInfoWidgetModule;
        private final DeliveryOrderInputWidgetModule deliveryOrderInputWidgetModule;
        private final DeliveryOrderListWidgetModule deliveryOrderListWidgetModule;
        private final DeliveryOrderOnDetailsWidgetModule deliveryOrderOnDetailsWidgetModule;
        private final DeliveryProblemsWidgetModule deliveryProblemsWidgetModule;
        private final DeliveryRatingWidgetModule deliveryRatingWidgetModule;
        private final DeliveryReviewFormWidget2Module deliveryReviewFormWidget2Module;
        private final DeliveryReviewHeaderModule deliveryReviewHeaderModule;
        private final DeliveryReviewSuccessModule deliveryReviewSuccessModule;
        private final DeliveryTimeSelectorV1Module deliveryTimeSelectorV1Module;
        private final DeliveryToCharitiesInfoModule deliveryToCharitiesInfoModule;
        private final DeliveryWidgetBigOzonModule deliveryWidgetBigOzonModule;
        private final DeliveryWidgetV2Module deliveryWidgetV2Module;
        private final DeliveryWidgetV3Module deliveryWidgetV3Module;
        private final DetailedCheckoutProductsWidgetModule detailedCheckoutProductsWidgetModule;
        private final EditCredentialsWidgetsModule editCredentialsWidgetsModule;
        private final EmptyCartV2Module emptyCartV2Module;
        private final EmptyScreenWidgetModule emptyScreenWidgetModule;
        private final EnableNotificationsSnackbarWidgetModule enableNotificationsSnackbarWidgetModule;
        private final ExpressAvailabilityWidgetModule expressAvailabilityWidgetModule;
        private final ExpressNavBarWidgetModule expressNavBarWidgetModule;
        private final ExpressNavTitleWidgetModule expressNavTitleWidgetModule;
        private final ExpressNavigationSliderWidgetModule expressNavigationSliderWidgetModule;
        private final ExpressRedirectButtonWidgetModule expressRedirectButtonWidgetModule;
        private final ExtendBackgroundWidgetModule extendBackgroundWidgetModule;
        private final FakeSearchWidgetModule fakeSearchWidgetModule;
        private final FaqWidgetModule faqWidgetModule;
        private final FavoriteProductV2WidgetModule favoriteProductV2WidgetModule;
        private final FeatureChecker featureChecker;
        private final FeedbackCurtainWidgetModule feedbackCurtainWidgetModule;
        private final FinanceWidgetModule financeWidgetModule;
        private final FinanceWidgetV2Module financeWidgetV2Module;
        private final FlashCallWidget2Module flashCallWidget2Module;
        private final FreshCartWidgetsModule freshCartWidgetsModule;
        private final FreshMiniappHeaderWidgetModule freshMiniappHeaderWidgetModule;
        private final FreshServiceCarouselWidgetModule freshServiceCarouselWidgetModule;
        private final FreshTileGridWidgetModule freshTileGridWidgetModule;
        private final FreshUnsortedWidgetsModule freshUnsortedWidgetsModule;
        private final GeoWidget2Module geoWidget2Module;
        private final GeotrackingBottomButtonWidgetModule geotrackingBottomButtonWidgetModule;
        private final GeotrackingMapV2WidgetModule geotrackingMapV2WidgetModule;
        private final GroupButtonsWidgetModule groupButtonsWidgetModule;
        private final HeaderWidgetModule headerWidgetModule;
        private a<HideTabBarOnScrollConfig> hideTabBarOnScrollConfigProvider;
        private a<HideTabBarOnScrollViewMapper> hideTabBarOnScrollViewMapperProvider;
        private final HomeButtonWidgetModule homeButtonWidgetModule;
        private final IconButtonsWidgetModule iconButtonsWidgetModule;
        private final ImageBadgeListWidgetModule imageBadgeListWidgetModule;
        private final InfoDropDownWidgetModule infoDropDownWidgetModule;
        private final IslandSeparatorWidgetModule islandSeparatorWidgetModule;
        private final ru.ozon.app.android.di.IslandSeparatorWidgetModule islandSeparatorWidgetModule2;
        private final JsonParser jsonDeserializer;
        private final JsonSerializer jsonSerializer;
        private final MarketingWidgets2Module marketingWidgets2Module;
        private final MarketingWidgetsFactoryModule marketingWidgetsFactoryModule;
        private final MasterWidgetModule masterWidgetModule;
        private final MegaDrawModule megaDrawModule;
        private final ModalConstructorModule modalConstructorModule;
        private final ru.ozon.app.android.returns.cancels.modalConstructor.di.ModalConstructorModule modalConstructorModule2;
        private final Moshi moshi;
        private final NavBarModule navBarModule;
        private final NavLikezoneCaruselDiModule navLikezoneCaruselDiModule;
        private final NavSliderV3WidgetModule navSliderV3WidgetModule;
        private final NaviBlocksModule naviBlocksModule;
        private final NaviBlocksV3Module naviBlocksV3Module;
        private final NaviBlocksV5Module naviBlocksV5Module;
        private final NaviCategoriesModule naviCategoriesModule;
        private final NaviGrid3Module naviGrid3Module;
        private final NaviGridModule naviGridModule;
        private final NotificationCarouselV2WidgetModule notificationCarouselV2WidgetModule;
        private final ObjectScrollWidgetV2Module objectScrollWidgetV2Module;
        private final OrderActionsModule orderActionsModule;
        private final OrderActionsV2Module orderActionsV2Module;
        private final OrderDeliveryDetailV2Module orderDeliveryDetailV2Module;
        private final OrderDetailsItemModule orderDetailsItemModule;
        private final OrderDoneButtonBarWidgetModule orderDoneButtonBarWidgetModule;
        private final OrderDoneCrossButtonWidgetModule orderDoneCrossButtonWidgetModule;
        private final OrderDoneDisclaimerWidgetModule orderDoneDisclaimerWidgetModule;
        private final OrderDonePaymentStatusWidgetModule orderDonePaymentStatusWidgetModule;
        private final OrderDoneTotalWidgetModule orderDoneTotalWidgetModule;
        private final OrderDoneWidgets2Module orderDoneWidgets2Module;
        private final OrderFiltersModule orderFiltersModule;
        private final OrderGalleryWidgetModule orderGalleryWidgetModule;
        private final OrderInfoWidgetModule orderInfoWidgetModule;
        private final OrderItemsWidgetModule orderItemsWidgetModule;
        private final OrderListModule orderListModule;
        private final OrderProductsWidgetModule orderProductsWidgetModule;
        private final OrderStatusLiveActivityWidgetModule orderStatusLiveActivityWidgetModule;
        private final OrderStatusModule orderStatusModule;
        private final OrderStatusV3WidgetModule orderStatusV3WidgetModule;
        private final OrderTimelineV2Module orderTimelineV2Module;
        private final OrderTotalModule orderTotalModule;
        private final OrderTrackShipmentModule orderTrackShipmentModule;
        private final OrderTrackingWidgetModule orderTrackingWidgetModule;
        private final OrdersCommonModule ordersCommonModule;
        private final PdpAspectsWidgetModule pdpAspectsWidgetModule;
        private final PdpNutritionInfoWidgetModule pdpNutritionInfoWidgetModule;
        private final PdpOldWidgetsModule pdpOldWidgetsModule;
        private final PdpWidgetsModule pdpWidgetsModule;
        private final PixelModule pixelModule;
        private final PlayStoriesV3WidgetModule playStoriesV3WidgetModule;
        private final PremiumPointsTrainV2Module premiumPointsTrainV2Module;
        private final ProductsInBotV2WidgetModule productsInBotV2WidgetModule;
        private final ProductsInBotWidgetModule productsInBotWidgetModule;
        private final ProductsPackageModule productsPackageModule;
        private final ProfileIconButtonWidgetModule profileIconButtonWidgetModule;
        private final ProgressiveTextModule progressiveTextModule;
        private final PromoCarouselWidgetModule promoCarouselWidgetModule;
        private final PromoOfferWidgetModule promoOfferWidgetModule;
        private final PromoPlacementModule promoPlacementModule;
        private final PromptStatusWidgetModule promptStatusWidgetModule;
        private final RadioGroupWidgetModule radioGroupWidgetModule;
        private final RecShelfWidgetModule recShelfWidgetModule;
        private final RecipientWidgetModule recipientWidgetModule;
        private final ReplyToCourierInfoWidgetModule replyToCourierInfoWidgetModule;
        private final ResponseActionsWidgetModule responseActionsWidgetModule;
        private final ReturnActionButtonsWidgetModule returnActionButtonsWidgetModule;
        private final ReturnActionModalWidgetModule returnActionModalWidgetModule;
        private final ReturnBalanceModalWidgetModule returnBalanceModalWidgetModule;
        private final ReturnCreationActiveDeliveriesWidgetModule returnCreationActiveDeliveriesWidgetModule;
        private final ReturnCreationItemInfoWidgetModule returnCreationItemInfoWidgetModule;
        private final ReturnCreationMethodsWidgetModule returnCreationMethodsWidgetModule;
        private final ReturnCreationModalWidgetModule returnCreationModalWidgetModule;
        private final ReturnCreationOrderWidgetModule returnCreationOrderWidgetModule;
        private final ReturnCreationOrdersWidgetModule returnCreationOrdersWidgetModule;
        private final ReturnCreationPhotoPickerWidgetModule returnCreationPhotoPickerWidgetModule;
        private final ReturnCreationReasonsWidgetModule returnCreationReasonsWidgetModule;
        private final ReturnCreationSelectedItemsWidgetModule returnCreationSelectedItemsWidgetModule;
        private final ReturnCreationStepsWidgetModule returnCreationStepsWidgetModule;
        private final ReturnCreationTotalWidgetModule returnCreationTotalWidgetModule;
        private final ReturnCreationWidgetsModule returnCreationWidgetsModule;
        private final ReturnDetailsHeaderButtonWidgetModule returnDetailsHeaderButtonWidgetModule;
        private final ReturnDetailsTotalWidgetModule returnDetailsTotalWidgetModule;
        private final ReturnDetailsWidgetModule returnDetailsWidgetModule;
        private final ReturnEditWidgetModule returnEditWidgetModule;
        private final ReturnListEmptyModule returnListEmptyModule;
        private final ReturnListWidgetModule returnListWidgetModule;
        private final ReturnTextAreaButtonWidgetModule returnTextAreaButtonWidgetModule;
        private final ReturnableItemsListWidgetModule returnableItemsListWidgetModule;
        private final ScrollActionListModule scrollActionListModule;
        private final ScrollWidgetModule scrollWidgetModule;
        private final SearchBarWidgetModule searchBarWidgetModule;
        private final SearchWidgetV2DiModule searchWidgetV2DiModule;
        private final SelectCancelReasonModule selectCancelReasonModule;
        private final ru.ozon.app.android.returns.cancels.cancelReasons.di.SelectCancelReasonModule selectCancelReasonModule2;
        private final SelectPaymentModule selectPaymentModule;
        private final SellerProductsWidgetsModule sellerProductsWidgetsModule;
        private final SeparatorBadgeWidgetModule separatorBadgeWidgetModule;
        private final SisBrandFavoriteWidgetModule sisBrandFavoriteWidgetModule;
        private final SteppedThermometerModule steppedThermometerModule;
        private final StickyPromoBannerWidgetModule stickyPromoBannerWidgetModule;
        private final StickyTotalWidgetModule stickyTotalWidgetModule;
        private a<TextMeasurer> textMeasurerProvider;
        private final TextWidgetModule textWidgetModule;
        private a<TileGrid3Mapper> tileGrid3MapperProvider;
        private final TimeLeftWidgetModule timeLeftWidgetModule;
        private final TipCourierDetailsV2Module tipCourierDetailsV2Module;
        private final TipCourierHeaderWidgetModule tipCourierHeaderWidgetModule;
        private final TipCourierReviewV2WidgetModule tipCourierReviewV2WidgetModule;
        private final TipProductPhotosModule tipProductPhotosModule;
        private final TotalV3WidgetModule totalV3WidgetModule;
        private final TravelGeneralBookingWidgetFactoryModule travelGeneralBookingWidgetFactoryModule;
        private final TravelGeneralWidgetFactoryModule travelGeneralWidgetFactoryModule;
        private final TravelGeneralWidgetV2Module travelGeneralWidgetV2Module;
        private final TravelHotelsMapWidgetV2Module travelHotelsMapWidgetV2Module;
        private final TravelRailwayWidgetFactoryModule travelRailwayWidgetFactoryModule;
        private final TravelToursWidgetFactoryModule travelToursWidgetFactoryModule;
        private final UgcCoreWidgetsModule ugcCoreWidgetsModule;
        private final UgcPayoutWidgetsModule ugcPayoutWidgetsModule;
        private final UgcWidgetsModule ugcWidgetsModule;
        private final UniversalObjectV2Module universalObjectV2Module;
        private final VideoScrollWidgetModule videoScrollWidgetModule;
        private final VideoTileWidgetModule videoTileWidgetModule;
        private final WholeSaleWidgetModule wholeSaleWidgetModule;
        private final WidgetRegistrationComponentImpl widgetRegistrationComponentImpl;
        private final WiseSkuScrollWidgetModule wiseSkuScrollWidgetModule;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92815id;
            private final WidgetRegistrationComponentImpl widgetRegistrationComponentImpl;

            SwitchingProvider(WidgetRegistrationComponentImpl widgetRegistrationComponentImpl, int i11) {
                this.widgetRegistrationComponentImpl = widgetRegistrationComponentImpl;
                this.f92815id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92815id;
                if (i11 == 0) {
                    return (T) new TileGrid3Mapper(this.widgetRegistrationComponentImpl.context, this.widgetRegistrationComponentImpl.smallTileMoleculeMapper());
                }
                if (i11 == 1) {
                    return (T) new TextMeasurer(this.widgetRegistrationComponentImpl.context);
                }
                if (i11 == 2) {
                    return (T) new HideTabBarOnScrollConfig();
                }
                if (i11 == 3) {
                    return (T) new HideTabBarOnScrollViewMapper();
                }
                throw new AssertionError(this.f92815id);
            }
        }

        /* synthetic */ WidgetRegistrationComponentImpl(SearchWidgetV2DiModule searchWidgetV2DiModule, PdpWidgetsModule pdpWidgetsModule, PdpOldWidgetsModule pdpOldWidgetsModule, UgcWidgetsModule ugcWidgetsModule, UgcCoreWidgetsModule ugcCoreWidgetsModule, UgcPayoutWidgetsModule ugcPayoutWidgetsModule, OrdersCommonModule ordersCommonModule, OrderListModule orderListModule, ProductsPackageModule productsPackageModule, SelectPaymentModule selectPaymentModule, NavBarModule navBarModule, ChangeDeliveryTimeButtonModule changeDeliveryTimeButtonModule, RecipientWidgetModule recipientWidgetModule, OrderFiltersModule orderFiltersModule, OrderGalleryWidgetModule orderGalleryWidgetModule, DeliveryDateChangedComplaintFormModule deliveryDateChangedComplaintFormModule, DeliveryComplainWidgetModule deliveryComplainWidgetModule, BarcodeWidgetModule barcodeWidgetModule, ActionButtonV2WidgetModule actionButtonV2WidgetModule, ActiveOrdersCountWidgetModule activeOrdersCountWidgetModule, ClickToDeliveryModalWidgetModule clickToDeliveryModalWidgetModule, BarcodePopoverWidgetModule barcodePopoverWidgetModule, OrderProductsWidgetModule orderProductsWidgetModule, EditCredentialsWidgetsModule editCredentialsWidgetsModule, AddressCommunicationWidgetModule addressCommunicationWidgetModule, BannerListWidgetModule bannerListWidgetModule, CatalogShelfWidgetModule catalogShelfWidgetModule, CatalogueTabsWidgetModule catalogueTabsWidgetModule, CatalogTabsV2WidgetModule catalogTabsV2WidgetModule, CouponGoalsV2WidgetModule couponGoalsV2WidgetModule, CurtainGoalsV2WidgetModule curtainGoalsV2WidgetModule, OrderTrackingWidgetModule orderTrackingWidgetModule, PromoCarouselWidgetModule promoCarouselWidgetModule, ExpressRedirectButtonWidgetModule expressRedirectButtonWidgetModule, ExpressNavigationSliderWidgetModule expressNavigationSliderWidgetModule, FakeSearchWidgetModule fakeSearchWidgetModule, NavSliderV3WidgetModule navSliderV3WidgetModule, ScrollWidgetModule scrollWidgetModule, FreshMiniappHeaderWidgetModule freshMiniappHeaderWidgetModule, ScrollActionListModule scrollActionListModule, HeaderWidgetModule headerWidgetModule, CatalogTileScrollWidgetModule catalogTileScrollWidgetModule, CatalogTileWidgetModule catalogTileWidgetModule, NotificationCarouselV2WidgetModule notificationCarouselV2WidgetModule, CustomCellWidgetModule customCellWidgetModule, WiseSkuScrollWidgetModule wiseSkuScrollWidgetModule, StickyPromoBannerWidgetModule stickyPromoBannerWidgetModule, AddressPopupButtonWidgetModule addressPopupButtonWidgetModule, DeliveryRatingWidgetModule deliveryRatingWidgetModule, GeotrackingMapV2WidgetModule geotrackingMapV2WidgetModule, OrderInfoWidgetModule orderInfoWidgetModule, OrderItemsWidgetModule orderItemsWidgetModule, OrderStatusV3WidgetModule orderStatusV3WidgetModule, GeotrackingBottomButtonWidgetModule geotrackingBottomButtonWidgetModule, FreshCartWidgetsModule freshCartWidgetsModule, CartTileWidgetModule cartTileWidgetModule, CartClickTileWidgetModule cartClickTileWidgetModule, CartMasterWidgetModule cartMasterWidgetModule, CartIconButtonWidgetModule cartIconButtonWidgetModule, StickyTotalWidgetModule stickyTotalWidgetModule, DetailedCheckoutProductsWidgetModule detailedCheckoutProductsWidgetModule, CellListWidgetModule cellListWidgetModule, FreshUnsortedWidgetsModule freshUnsortedWidgetsModule, AddressSelectorLiteWidgetModule addressSelectorLiteWidgetModule, AutoCatalogWidgetModule autoCatalogWidgetModule, BottomCartWidgetModule bottomCartWidgetModule, BrandzoneCarouselWidgetModule brandzoneCarouselWidgetModule, CharityAddressSelectorWidgetModule charityAddressSelectorWidgetModule, CourierTipsWidgetModule courierTipsWidgetModule, DeliveryProblemsWidgetModule deliveryProblemsWidgetModule, DeliveryToCharitiesInfoModule deliveryToCharitiesInfoModule, DeliveryWidgetV2Module deliveryWidgetV2Module, DeliveryWidgetV3Module deliveryWidgetV3Module, DeliveryWidgetBigOzonModule deliveryWidgetBigOzonModule, HomeButtonWidgetModule homeButtonWidgetModule, IconButtonsWidgetModule iconButtonsWidgetModule, InfoDropDownWidgetModule infoDropDownWidgetModule, IslandSeparatorWidgetModule islandSeparatorWidgetModule, OrderStatusLiveActivityWidgetModule orderStatusLiveActivityWidgetModule, ProductsInBotWidgetModule productsInBotWidgetModule, SearchBarWidgetModule searchBarWidgetModule, WholeSaleWidgetModule wholeSaleWidgetModule, FreshServiceCarouselWidgetModule freshServiceCarouselWidgetModule, ExpressNavBarWidgetModule expressNavBarWidgetModule, ExpressNavTitleWidgetModule expressNavTitleWidgetModule, ExpressAvailabilityWidgetModule expressAvailabilityWidgetModule, FeedbackCurtainWidgetModule feedbackCurtainWidgetModule, PromoOfferWidgetModule promoOfferWidgetModule, RecShelfWidgetModule recShelfWidgetModule, SeparatorBadgeWidgetModule separatorBadgeWidgetModule, ImageBadgeListWidgetModule imageBadgeListWidgetModule, BottomContainerWidgetModule bottomContainerWidgetModule, ProductsInBotV2WidgetModule productsInBotV2WidgetModule, PdpAspectsWidgetModule pdpAspectsWidgetModule, PdpNutritionInfoWidgetModule pdpNutritionInfoWidgetModule, FreshTileGridWidgetModule freshTileGridWidgetModule, SteppedThermometerModule steppedThermometerModule, TravelToursWidgetFactoryModule travelToursWidgetFactoryModule, TravelRailwayWidgetFactoryModule travelRailwayWidgetFactoryModule, TravelHotelsMapWidgetV2Module travelHotelsMapWidgetV2Module, TravelGeneralWidgetV2Module travelGeneralWidgetV2Module, TravelGeneralWidgetFactoryModule travelGeneralWidgetFactoryModule, TravelGeneralBookingWidgetFactoryModule travelGeneralBookingWidgetFactoryModule, PremiumPointsTrainV2Module premiumPointsTrainV2Module, ReturnListWidgetModule returnListWidgetModule, ReturnListEmptyModule returnListEmptyModule, ReturnDetailsWidgetModule returnDetailsWidgetModule, ReturnDetailsHeaderButtonWidgetModule returnDetailsHeaderButtonWidgetModule, ReturnActionModalWidgetModule returnActionModalWidgetModule, ReturnableItemsListWidgetModule returnableItemsListWidgetModule, ReturnEditWidgetModule returnEditWidgetModule, ReturnDetailsTotalWidgetModule returnDetailsTotalWidgetModule, ReturnActionButtonsWidgetModule returnActionButtonsWidgetModule, ReturnBalanceModalWidgetModule returnBalanceModalWidgetModule, OrderActionsV2Module orderActionsV2Module, OrderDetailsItemModule orderDetailsItemModule, CustomsFeesModule customsFeesModule, OrderTotalModule orderTotalModule, OrderTimelineV2Module orderTimelineV2Module, OrderTrackShipmentModule orderTrackShipmentModule, TimeLeftWidgetModule timeLeftWidgetModule, OrderActionsModule orderActionsModule, OrderDeliveryDetailV2Module orderDeliveryDetailV2Module, OrderStatusModule orderStatusModule, ChequesWidgetModule chequesWidgetModule, DateSelectorWidgetModule dateSelectorWidgetModule, DeliveryTimeSelectorV1Module deliveryTimeSelectorV1Module, RadioGroupWidgetModule radioGroupWidgetModule, ReplyToCourierInfoWidgetModule replyToCourierInfoWidgetModule, SelectCancelReasonModule selectCancelReasonModule, ExtendBackgroundWidgetModule extendBackgroundWidgetModule, ModalConstructorModule modalConstructorModule, CheckoutWidget2Module checkoutWidget2Module, AdvPageStayDiModule advPageStayDiModule, MarketingWidgets2Module marketingWidgets2Module, MarketingWidgetsFactoryModule marketingWidgetsFactoryModule, SisBrandFavoriteWidgetModule sisBrandFavoriteWidgetModule, BigPromoCheckoutWidgetModule bigPromoCheckoutWidgetModule, MegaDrawModule megaDrawModule, NaviBlocksModule naviBlocksModule, NaviBlocksV3Module naviBlocksV3Module, NaviBlocksV5Module naviBlocksV5Module, NaviCategoriesModule naviCategoriesModule, NaviGridModule naviGridModule, NaviGrid3Module naviGrid3Module, VideoTileWidgetModule videoTileWidgetModule, VideoScrollWidgetModule videoScrollWidgetModule, FinanceWidgetModule financeWidgetModule, FinanceWidgetV2Module financeWidgetV2Module, AppOnboardingWidgetModule appOnboardingWidgetModule, PromoPlacementModule promoPlacementModule, ProfileIconButtonWidgetModule profileIconButtonWidgetModule, NavLikezoneCaruselDiModule navLikezoneCaruselDiModule, DefaultWidgetsModule defaultWidgetsModule, FavoriteProductV2WidgetModule favoriteProductV2WidgetModule, FlashCallWidget2Module flashCallWidget2Module, SellerProductsWidgetsModule sellerProductsWidgetsModule, FaqWidgetModule faqWidgetModule, PlayStoriesV3WidgetModule playStoriesV3WidgetModule, CartWidget2Module cartWidget2Module, ControlsModule controlsModule, ControlsV3Module controlsV3Module, MasterWidgetModule masterWidgetModule, TotalV3WidgetModule totalV3WidgetModule, CartSplitV2Module cartSplitV2Module, CartSplitV2ModuleV2 cartSplitV2ModuleV2, EmptyCartV2Module emptyCartV2Module, CheckoutPrefetchWidgetModule checkoutPrefetchWidgetModule, PixelModule pixelModule, AsyncWidgetModule asyncWidgetModule, DebugWidgetsModule debugWidgetsModule, ActionCardsModule actionCardsModule, ProgressiveTextModule progressiveTextModule, ru.ozon.app.android.di.IslandSeparatorWidgetModule islandSeparatorWidgetModule2, OrderDoneWidgets2Module orderDoneWidgets2Module, OrderDonePaymentStatusWidgetModule orderDonePaymentStatusWidgetModule, OrderDoneDisclaimerWidgetModule orderDoneDisclaimerWidgetModule, OrderDoneTotalWidgetModule orderDoneTotalWidgetModule, OrderDoneCrossButtonWidgetModule orderDoneCrossButtonWidgetModule, OrderDoneButtonBarWidgetModule orderDoneButtonBarWidgetModule, EnableNotificationsSnackbarWidgetModule enableNotificationsSnackbarWidgetModule, ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsWidgetModule courierTipsWidgetModule2, ObjectScrollWidgetV2Module objectScrollWidgetV2Module, UniversalObjectV2Module universalObjectV2Module, CommonTextWidgetModule commonTextWidgetModule, ActionButtonModule actionButtonModule, GeoWidget2Module geoWidget2Module, DeliveryCabinetWidgetV2Module deliveryCabinetWidgetV2Module, DeliveryReviewFormWidget2Module deliveryReviewFormWidget2Module, DeliveryReviewHeaderModule deliveryReviewHeaderModule, DeliveryReviewSuccessModule deliveryReviewSuccessModule, ReturnCreationWidgetsModule returnCreationWidgetsModule, ReturnCreationModalWidgetModule returnCreationModalWidgetModule, ReturnCreationActiveDeliveriesWidgetModule returnCreationActiveDeliveriesWidgetModule, ReturnCreationMethodsWidgetModule returnCreationMethodsWidgetModule, ReturnCreationTotalWidgetModule returnCreationTotalWidgetModule, ReturnCreationSelectedItemsWidgetModule returnCreationSelectedItemsWidgetModule, ReturnCreationStepsWidgetModule returnCreationStepsWidgetModule, ReturnCreationOrdersWidgetModule returnCreationOrdersWidgetModule, ReturnCreationOrderWidgetModule returnCreationOrderWidgetModule, ReturnCreationReasonsWidgetModule returnCreationReasonsWidgetModule, ReturnTextAreaButtonWidgetModule returnTextAreaButtonWidgetModule, ReturnCreationPhotoPickerWidgetModule returnCreationPhotoPickerWidgetModule, ReturnCreationItemInfoWidgetModule returnCreationItemInfoWidgetModule, DeliveryOrderOnDetailsWidgetModule deliveryOrderOnDetailsWidgetModule, DeliveryInfoWidgetModule deliveryInfoWidgetModule, DeliveryOrderInputWidgetModule deliveryOrderInputWidgetModule, GroupButtonsWidgetModule groupButtonsWidgetModule, DeliveryOrderListWidgetModule deliveryOrderListWidgetModule, TipCourierDetailsV2Module tipCourierDetailsV2Module, TipCourierHeaderWidgetModule tipCourierHeaderWidgetModule, TipCourierReviewV2WidgetModule tipCourierReviewV2WidgetModule, TipProductPhotosModule tipProductPhotosModule, EmptyScreenWidgetModule emptyScreenWidgetModule, BarcodeProductsListWidgetModule barcodeProductsListWidgetModule, BorderlessButtonWidgetModule borderlessButtonWidgetModule, TextWidgetModule textWidgetModule, ru.ozon.app.android.returns.cancels.cancelReasons.di.SelectCancelReasonModule selectCancelReasonModule2, ru.ozon.app.android.returns.cancels.modalConstructor.di.ModalConstructorModule modalConstructorModule2, PromptStatusWidgetModule promptStatusWidgetModule, ResponseActionsWidgetModule responseActionsWidgetModule, Context context, Application application, JsonParser jsonParser, JsonSerializer jsonSerializer, Moshi moshi, FeatureChecker featureChecker, AppType appType, int i11) {
            this(searchWidgetV2DiModule, pdpWidgetsModule, pdpOldWidgetsModule, ugcWidgetsModule, ugcCoreWidgetsModule, ugcPayoutWidgetsModule, ordersCommonModule, orderListModule, productsPackageModule, selectPaymentModule, navBarModule, changeDeliveryTimeButtonModule, recipientWidgetModule, orderFiltersModule, orderGalleryWidgetModule, deliveryDateChangedComplaintFormModule, deliveryComplainWidgetModule, barcodeWidgetModule, actionButtonV2WidgetModule, activeOrdersCountWidgetModule, clickToDeliveryModalWidgetModule, barcodePopoverWidgetModule, orderProductsWidgetModule, editCredentialsWidgetsModule, addressCommunicationWidgetModule, bannerListWidgetModule, catalogShelfWidgetModule, catalogueTabsWidgetModule, catalogTabsV2WidgetModule, couponGoalsV2WidgetModule, curtainGoalsV2WidgetModule, orderTrackingWidgetModule, promoCarouselWidgetModule, expressRedirectButtonWidgetModule, expressNavigationSliderWidgetModule, fakeSearchWidgetModule, navSliderV3WidgetModule, scrollWidgetModule, freshMiniappHeaderWidgetModule, scrollActionListModule, headerWidgetModule, catalogTileScrollWidgetModule, catalogTileWidgetModule, notificationCarouselV2WidgetModule, customCellWidgetModule, wiseSkuScrollWidgetModule, stickyPromoBannerWidgetModule, addressPopupButtonWidgetModule, deliveryRatingWidgetModule, geotrackingMapV2WidgetModule, orderInfoWidgetModule, orderItemsWidgetModule, orderStatusV3WidgetModule, geotrackingBottomButtonWidgetModule, freshCartWidgetsModule, cartTileWidgetModule, cartClickTileWidgetModule, cartMasterWidgetModule, cartIconButtonWidgetModule, stickyTotalWidgetModule, detailedCheckoutProductsWidgetModule, cellListWidgetModule, freshUnsortedWidgetsModule, addressSelectorLiteWidgetModule, autoCatalogWidgetModule, bottomCartWidgetModule, brandzoneCarouselWidgetModule, charityAddressSelectorWidgetModule, courierTipsWidgetModule, deliveryProblemsWidgetModule, deliveryToCharitiesInfoModule, deliveryWidgetV2Module, deliveryWidgetV3Module, deliveryWidgetBigOzonModule, homeButtonWidgetModule, iconButtonsWidgetModule, infoDropDownWidgetModule, islandSeparatorWidgetModule, orderStatusLiveActivityWidgetModule, productsInBotWidgetModule, searchBarWidgetModule, wholeSaleWidgetModule, freshServiceCarouselWidgetModule, expressNavBarWidgetModule, expressNavTitleWidgetModule, expressAvailabilityWidgetModule, feedbackCurtainWidgetModule, promoOfferWidgetModule, recShelfWidgetModule, separatorBadgeWidgetModule, imageBadgeListWidgetModule, bottomContainerWidgetModule, productsInBotV2WidgetModule, pdpAspectsWidgetModule, pdpNutritionInfoWidgetModule, freshTileGridWidgetModule, steppedThermometerModule, travelToursWidgetFactoryModule, travelRailwayWidgetFactoryModule, travelHotelsMapWidgetV2Module, travelGeneralWidgetV2Module, travelGeneralWidgetFactoryModule, travelGeneralBookingWidgetFactoryModule, premiumPointsTrainV2Module, returnListWidgetModule, returnListEmptyModule, returnDetailsWidgetModule, returnDetailsHeaderButtonWidgetModule, returnActionModalWidgetModule, returnableItemsListWidgetModule, returnEditWidgetModule, returnDetailsTotalWidgetModule, returnActionButtonsWidgetModule, returnBalanceModalWidgetModule, orderActionsV2Module, orderDetailsItemModule, customsFeesModule, orderTotalModule, orderTimelineV2Module, orderTrackShipmentModule, timeLeftWidgetModule, orderActionsModule, orderDeliveryDetailV2Module, orderStatusModule, chequesWidgetModule, dateSelectorWidgetModule, deliveryTimeSelectorV1Module, radioGroupWidgetModule, replyToCourierInfoWidgetModule, selectCancelReasonModule, extendBackgroundWidgetModule, modalConstructorModule, checkoutWidget2Module, advPageStayDiModule, marketingWidgets2Module, marketingWidgetsFactoryModule, sisBrandFavoriteWidgetModule, bigPromoCheckoutWidgetModule, megaDrawModule, naviBlocksModule, naviBlocksV3Module, naviBlocksV5Module, naviCategoriesModule, naviGridModule, naviGrid3Module, videoTileWidgetModule, videoScrollWidgetModule, financeWidgetModule, financeWidgetV2Module, appOnboardingWidgetModule, promoPlacementModule, profileIconButtonWidgetModule, navLikezoneCaruselDiModule, defaultWidgetsModule, favoriteProductV2WidgetModule, flashCallWidget2Module, sellerProductsWidgetsModule, faqWidgetModule, playStoriesV3WidgetModule, cartWidget2Module, controlsModule, controlsV3Module, masterWidgetModule, totalV3WidgetModule, cartSplitV2Module, cartSplitV2ModuleV2, emptyCartV2Module, checkoutPrefetchWidgetModule, pixelModule, asyncWidgetModule, debugWidgetsModule, actionCardsModule, progressiveTextModule, islandSeparatorWidgetModule2, orderDoneWidgets2Module, orderDonePaymentStatusWidgetModule, orderDoneDisclaimerWidgetModule, orderDoneTotalWidgetModule, orderDoneCrossButtonWidgetModule, orderDoneButtonBarWidgetModule, enableNotificationsSnackbarWidgetModule, courierTipsWidgetModule2, objectScrollWidgetV2Module, universalObjectV2Module, commonTextWidgetModule, actionButtonModule, geoWidget2Module, deliveryCabinetWidgetV2Module, deliveryReviewFormWidget2Module, deliveryReviewHeaderModule, deliveryReviewSuccessModule, returnCreationWidgetsModule, returnCreationModalWidgetModule, returnCreationActiveDeliveriesWidgetModule, returnCreationMethodsWidgetModule, returnCreationTotalWidgetModule, returnCreationSelectedItemsWidgetModule, returnCreationStepsWidgetModule, returnCreationOrdersWidgetModule, returnCreationOrderWidgetModule, returnCreationReasonsWidgetModule, returnTextAreaButtonWidgetModule, returnCreationPhotoPickerWidgetModule, returnCreationItemInfoWidgetModule, deliveryOrderOnDetailsWidgetModule, deliveryInfoWidgetModule, deliveryOrderInputWidgetModule, groupButtonsWidgetModule, deliveryOrderListWidgetModule, tipCourierDetailsV2Module, tipCourierHeaderWidgetModule, tipCourierReviewV2WidgetModule, tipProductPhotosModule, emptyScreenWidgetModule, barcodeProductsListWidgetModule, borderlessButtonWidgetModule, textWidgetModule, selectCancelReasonModule2, modalConstructorModule2, promptStatusWidgetModule, responseActionsWidgetModule, context, application, jsonParser, jsonSerializer, moshi, featureChecker, appType);
        }

        private AboutInstallmentConfig aboutInstallmentConfig() {
            return new AboutInstallmentConfig(this.jsonDeserializer);
        }

        private AccessControlConfig accessControlConfig() {
            return new AccessControlConfig(this.jsonDeserializer);
        }

        private AccompanyingDocsDownloadingConfig accompanyingDocsDownloadingConfig() {
            return new AccompanyingDocsDownloadingConfig(this.jsonDeserializer);
        }

        private AccountBalanceBarConfig accountBalanceBarConfig() {
            return new AccountBalanceBarConfig(this.jsonDeserializer);
        }

        private AccountBalanceInfoConfig accountBalanceInfoConfig() {
            return new AccountBalanceInfoConfig(this.jsonDeserializer);
        }

        private AccountListMobileConfig accountListMobileConfig() {
            return new AccountListMobileConfig(this.jsonDeserializer);
        }

        private ActionButtonConfig actionButtonConfig() {
            return new ActionButtonConfig(this.jsonDeserializer);
        }

        private ActionButtonV2Config actionButtonV2Config() {
            return new ActionButtonV2Config(this.moshi);
        }

        private ActionCardsConfig actionCardsConfig() {
            return new ActionCardsConfig(this.jsonDeserializer);
        }

        private ActionProgressConfig actionProgressConfig() {
            return new ActionProgressConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.storefront.widgets.megaRaffle.core.ActionProgressConfig actionProgressConfig2() {
            return new ru.ozon.app.android.storefront.widgets.megaRaffle.core.ActionProgressConfig(this.jsonDeserializer);
        }

        private ActionTriggerConfig actionTriggerConfig() {
            return new ActionTriggerConfig(this.jsonDeserializer);
        }

        private ActiveOrdersCountConfig activeOrdersCountConfig() {
            return new ActiveOrdersCountConfig(this.jsonDeserializer, this.context);
        }

        private AdBannerConfig adBannerConfig() {
            return new AdBannerConfig(this.jsonDeserializer);
        }

        private AddConsigneeConfig addConsigneeConfig() {
            return new AddConsigneeConfig(this.jsonDeserializer);
        }

        private AddEdoConfigV2 addEdoConfigV2() {
            return new AddEdoConfigV2(this.jsonDeserializer);
        }

        private AddHotelGuestsV5Config addHotelGuestsV5Config() {
            return new AddHotelGuestsV5Config(this.jsonDeserializer);
        }

        private AddLegalAddressMobileConfig addLegalAddressMobileConfig() {
            return new AddLegalAddressMobileConfig(this.jsonDeserializer);
        }

        private AddLegalConfig addLegalConfig() {
            return new AddLegalConfig(this.jsonDeserializer);
        }

        private AddLegalInnMobileConfig addLegalInnMobileConfig() {
            return new AddLegalInnMobileConfig(this.jsonDeserializer);
        }

        private AddLegalMobileConfig addLegalMobileConfig() {
            return new AddLegalMobileConfig(this.jsonDeserializer);
        }

        private AddToComparisonButtonConfig addToComparisonButtonConfig() {
            return new AddToComparisonButtonConfig(this.jsonDeserializer);
        }

        private AdditionalLuggageTotalShadedConfig additionalLuggageTotalShadedConfig() {
            return new AdditionalLuggageTotalShadedConfig(this.jsonDeserializer);
        }

        private AdditionalLuggageV2Config additionalLuggageV2Config() {
            return new AdditionalLuggageV2Config(this.jsonDeserializer);
        }

        private AdditionalReturnServiceCellConfig additionalReturnServiceCellConfig() {
            return new AdditionalReturnServiceCellConfig(this.jsonDeserializer);
        }

        private AdditionalReviewConfig additionalReviewConfig() {
            return new AdditionalReviewConfig(this.jsonDeserializer);
        }

        private AdditionalReviewV2Config additionalReviewV2Config() {
            return new AdditionalReviewV2Config(this.jsonDeserializer);
        }

        private AdditionalServiceCardConfig additionalServiceCardConfig() {
            return new AdditionalServiceCardConfig(this.jsonDeserializer);
        }

        private AdditionalServiceCellConfig additionalServiceCellConfig() {
            return new AdditionalServiceCellConfig(this.jsonDeserializer);
        }

        private AdditionalServicesConfig additionalServicesConfig() {
            return new AdditionalServicesConfig(this.jsonDeserializer);
        }

        private AdditionalServicesOfferConfig additionalServicesOfferConfig() {
            return new AdditionalServicesOfferConfig(this.jsonDeserializer);
        }

        private AdditionalServicesOfferShadedConfig additionalServicesOfferShadedConfig() {
            return new AdditionalServicesOfferShadedConfig(this.jsonDeserializer);
        }

        private AdditionalServicesTotalConfig additionalServicesTotalConfig() {
            return new AdditionalServicesTotalConfig(this.jsonDeserializer);
        }

        private AdditionalServicesTotalShadedConfig additionalServicesTotalShadedConfig() {
            return new AdditionalServicesTotalShadedConfig(this.jsonDeserializer);
        }

        private AddressCommunicationConfig addressCommunicationConfig() {
            return new AddressCommunicationConfig(this.jsonDeserializer);
        }

        private AddressPopupButtonConfig addressPopupButtonConfig() {
            return new AddressPopupButtonConfig(this.jsonDeserializer);
        }

        private AddressSelectorLiteConfig addressSelectorLiteConfig() {
            return new AddressSelectorLiteConfig(this.jsonDeserializer);
        }

        private AdvBannerV4Config advBannerV4Config() {
            return new AdvBannerV4Config(this.jsonDeserializer, this.context);
        }

        private AdvInfoConfig advInfoConfig() {
            return new AdvInfoConfig(this.jsonDeserializer);
        }

        private AdvInfoViewMapper advInfoViewMapper() {
            return new AdvInfoViewMapper(new AdvInfoMapper());
        }

        private AdvPageStayConfig advPageStayConfig() {
            return new AdvPageStayConfig(this.jsonDeserializer);
        }

        private AdvRefreshWithDelayConfig advRefreshWithDelayConfig() {
            return new AdvRefreshWithDelayConfig(this.jsonDeserializer);
        }

        private AdvVideoBannerV2Config advVideoBannerV2Config() {
            return new AdvVideoBannerV2Config(this.jsonDeserializer);
        }

        private AiHelperConfig aiHelperConfig() {
            return new AiHelperConfig(this.jsonDeserializer);
        }

        private ApplyWishlistConfig applyWishlistConfig() {
            return new ApplyWishlistConfig(this.jsonDeserializer);
        }

        private AspectProductV2Config aspectProductV2Config() {
            return new AspectProductV2Config(this.jsonDeserializer);
        }

        private AspectsCompactV2Config aspectsCompactV2Config() {
            return new AspectsCompactV2Config(this.jsonDeserializer);
        }

        private AspectsV2Config aspectsV2Config() {
            return new AspectsV2Config(this.jsonDeserializer);
        }

        private AspectsV4Config aspectsV4Config() {
            return new AspectsV4Config(this.jsonDeserializer);
        }

        private AsyncConfig asyncConfig() {
            return new AsyncConfig(this.jsonDeserializer);
        }

        private AutoCatalogConfig autoCatalogConfig() {
            return new AutoCatalogConfig(this.jsonDeserializer, headerApi());
        }

        private AvailablePromotionConfig availablePromotionConfig() {
            return new AvailablePromotionConfig(this.jsonDeserializer);
        }

        private AviaBookedTicketInfoConfig aviaBookedTicketInfoConfig() {
            return new AviaBookedTicketInfoConfig(this.jsonDeserializer);
        }

        private AviaCheckTariffsConfig aviaCheckTariffsConfig() {
            return new AviaCheckTariffsConfig(this.jsonDeserializer);
        }

        private AviaCheckTariffsPriceDetailsConfig aviaCheckTariffsPriceDetailsConfig() {
            return new AviaCheckTariffsPriceDetailsConfig(this.jsonDeserializer);
        }

        private AviaComplexSearchFormConfig aviaComplexSearchFormConfig() {
            return new AviaComplexSearchFormConfig(this.jsonDeserializer);
        }

        private AviaDetailedInfoV3Config aviaDetailedInfoV3Config() {
            return new AviaDetailedInfoV3Config(this.jsonDeserializer);
        }

        private AviaSearchResultV3Config aviaSearchResultV3Config() {
            return new AviaSearchResultV3Config(this.jsonDeserializer);
        }

        private B2bContactUsConfig b2bContactUsConfig() {
            return new B2bContactUsConfig(this.jsonDeserializer);
        }

        private BadgeListConfig badgeListConfig() {
            return new BadgeListConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.data.BadgeListConfig badgeListConfig2() {
            return new ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.data.BadgeListConfig(this.jsonDeserializer);
        }

        private BadgeTimerConfig badgeTimerConfig() {
            return new BadgeTimerConfig(this.jsonDeserializer);
        }

        private BankAccountStatusConfig bankAccountStatusConfig() {
            return new BankAccountStatusConfig(this.jsonDeserializer);
        }

        private BannerCarouselConfig bannerCarouselConfig() {
            return new BannerCarouselConfig(this.moshi);
        }

        private BannerEdoConfig bannerEdoConfig() {
            return new BannerEdoConfig(this.jsonDeserializer);
        }

        private BannerListConfig bannerListConfig() {
            return new BannerListConfig(this.jsonDeserializer);
        }

        private BarcodeConfig barcodeConfig() {
            return new BarcodeConfig(this.jsonDeserializer);
        }

        private BarcodePopoverConfig barcodePopoverConfig() {
            return new BarcodePopoverConfig(this.jsonDeserializer);
        }

        private BarcodeProductsListConfig barcodeProductsListConfig() {
            return new BarcodeProductsListConfig(this.jsonDeserializer);
        }

        private BigPromoCheckoutConfig bigPromoCheckoutConfig() {
            return new BigPromoCheckoutConfig(this.jsonDeserializer);
        }

        private BigPromoNavbarConfig bigPromoNavbarConfig() {
            return new BigPromoNavbarConfig(this.jsonDeserializer);
        }

        private BigPromoPDPConfig bigPromoPDPConfig() {
            return new BigPromoPDPConfig(this.jsonDeserializer);
        }

        private BlackFridayCounterConfig blackFridayCounterConfig() {
            return new BlackFridayCounterConfig(this.jsonDeserializer);
        }

        private BlackFridayStatusConfig blackFridayStatusConfig() {
            return new BlackFridayStatusConfig(this.jsonDeserializer);
        }

        private BonusCellToggleConfig bonusCellToggleConfig() {
            return new BonusCellToggleConfig(this.jsonDeserializer);
        }

        private BorderlessButtonConfig borderlessButtonConfig() {
            return new BorderlessButtonConfig(this.jsonDeserializer);
        }

        private BottomCartWidgetConfig bottomCartWidgetConfig() {
            return new BottomCartWidgetConfig(this.jsonDeserializer);
        }

        private BottomContainerConfig bottomContainerConfig() {
            return new BottomContainerConfig(this.jsonDeserializer);
        }

        private BoxListConfig boxListConfig() {
            return new BoxListConfig(boxListParser());
        }

        private BoxListParser boxListParser() {
            return new BoxListParser(this.jsonDeserializer);
        }

        private BrandConfig brandConfig() {
            return new BrandConfig(this.jsonDeserializer);
        }

        private BrandzoneCarouselConfig brandzoneCarouselConfig() {
            return new BrandzoneCarouselConfig(this.jsonDeserializer);
        }

        private ButtonConfig buttonConfig() {
            return new ButtonConfig(this.jsonDeserializer);
        }

        private ButtonStackConfig buttonStackConfig() {
            return new ButtonStackConfig(this.jsonDeserializer);
        }

        private ButtonWidgetConfig buttonWidgetConfig() {
            return new ButtonWidgetConfig(this.jsonDeserializer);
        }

        private ButtonWidgetV2Config buttonWidgetV2Config() {
            return new ButtonWidgetV2Config(this.jsonDeserializer);
        }

        private ButtonWithInformationConfig buttonWithInformationConfig() {
            return new ButtonWithInformationConfig(this.jsonDeserializer);
        }

        private ButtonsActionSheetConfig buttonsActionSheetConfig() {
            return new ButtonsActionSheetConfig(this.jsonDeserializer);
        }

        private ButtonsBarConfig buttonsBarConfig() {
            return new ButtonsBarConfig(this.jsonDeserializer);
        }

        private BuyTogetherConfig buyTogetherConfig() {
            return new BuyTogetherConfig(this.jsonDeserializer);
        }

        private BuyersContactsConfig buyersContactsConfig() {
            return new BuyersContactsConfig(this.jsonDeserializer);
        }

        private CalendarPriceLegendConfig calendarPriceLegendConfig() {
            return new CalendarPriceLegendConfig(this.jsonDeserializer);
        }

        private CancelPostingsV2Config cancelPostingsV2Config() {
            return new CancelPostingsV2Config(cancelPostingsV2Parser());
        }

        private ru.ozon.app.android.returns.cancels.cancelpostingsv2.core.CancelPostingsV2Config cancelPostingsV2Config2() {
            return new ru.ozon.app.android.returns.cancels.cancelpostingsv2.core.CancelPostingsV2Config(cancelPostingsV2Parser2());
        }

        private CancelPostingsV2Parser cancelPostingsV2Parser() {
            return new CancelPostingsV2Parser(this.jsonDeserializer);
        }

        private ru.ozon.app.android.returns.cancels.cancelpostingsv2.core.CancelPostingsV2Parser cancelPostingsV2Parser2() {
            return new ru.ozon.app.android.returns.cancels.cancelpostingsv2.core.CancelPostingsV2Parser(this.jsonDeserializer);
        }

        private CaptionConfig captionConfig() {
            return new CaptionConfig(this.jsonDeserializer);
        }

        private CaptionWidgetConfig captionWidgetConfig() {
            return new CaptionWidgetConfig(this.jsonDeserializer);
        }

        private CartButtonQuantConfig cartButtonQuantConfig() {
            return new CartButtonQuantConfig(this.jsonDeserializer);
        }

        private CartButtonV4Config cartButtonV4Config() {
            return new CartButtonV4Config(this.jsonDeserializer);
        }

        private CartButtonV5Config cartButtonV5Config() {
            return new CartButtonV5Config(this.jsonDeserializer);
        }

        private CartButtonWithTooltipConfig cartButtonWithTooltipConfig() {
            return new CartButtonWithTooltipConfig(this.jsonDeserializer);
        }

        private CartClickTileConfig cartClickTileConfig() {
            return new CartClickTileConfig(this.jsonDeserializer);
        }

        private CartControlsConfig cartControlsConfig() {
            return new CartControlsConfig(this.jsonDeserializer);
        }

        private CartIconButtonConfig cartIconButtonConfig() {
            return new CartIconButtonConfig(this.jsonDeserializer);
        }

        private CartMasterConfig cartMasterConfig() {
            return new CartMasterConfig(this.jsonDeserializer);
        }

        private CartSplitV2Config cartSplitV2Config() {
            return new CartSplitV2Config(this.jsonDeserializer);
        }

        private CartSplitV2SubWidgetsConfig cartSplitV2SubWidgetsConfig() {
            return new CartSplitV2SubWidgetsConfig(this.jsonDeserializer, this.jsonSerializer);
        }

        private CartTileConfig cartTileConfig() {
            return new CartTileConfig(this.jsonDeserializer);
        }

        private CashbackPointsConfig cashbackPointsConfig() {
            return new CashbackPointsConfig(this.jsonDeserializer);
        }

        private CatalogTabsV2Config catalogTabsV2Config() {
            return new CatalogTabsV2Config(this.jsonDeserializer);
        }

        private CatalogTileConfig catalogTileConfig() {
            return new CatalogTileConfig(this.jsonDeserializer);
        }

        private CatalogTileScrollConfig catalogTileScrollConfig() {
            return new CatalogTileScrollConfig(this.jsonDeserializer);
        }

        private CategoryLogosWidgetConfig categoryLogosWidgetConfig() {
            return new CategoryLogosWidgetConfig(this.jsonDeserializer);
        }

        private CategoryMenuConfig categoryMenuConfig() {
            return new CategoryMenuConfig(this.jsonDeserializer);
        }

        private CbottomWidgetConfig cbottomWidgetConfig() {
            return new CbottomWidgetConfig(this.jsonDeserializer);
        }

        private CellListConfig cellListConfig() {
            return new CellListConfig(this.jsonDeserializer);
        }

        private CellListV2Config cellListV2Config() {
            return new CellListV2Config(this.jsonDeserializer);
        }

        private CellWithTimerConfig cellWithTimerConfig() {
            return new CellWithTimerConfig(this.jsonDeserializer);
        }

        private ChangeDeliveryTimeButtonConfig changeDeliveryTimeButtonConfig() {
            return new ChangeDeliveryTimeButtonConfig(this.jsonDeserializer);
        }

        private ChangeEmailConfig changeEmailConfig() {
            return new ChangeEmailConfig(this.jsonDeserializer);
        }

        private CharacteristicsConfig characteristicsConfig() {
            return new CharacteristicsConfig(this.jsonDeserializer);
        }

        private CharityAddressSelectorConfig charityAddressSelectorConfig() {
            return new CharityAddressSelectorConfig(this.jsonDeserializer);
        }

        private ChatListConfig chatListConfig() {
            return new ChatListConfig(this.jsonDeserializer);
        }

        private ChatListHeaderConfig chatListHeaderConfig() {
            return new ChatListHeaderConfig(this.jsonDeserializer);
        }

        private CheckLegalInfoConfig checkLegalInfoConfig() {
            return new CheckLegalInfoConfig(this.jsonDeserializer);
        }

        private CheckoutMasterConfig checkoutMasterConfig() {
            return new CheckoutMasterConfig(this.jsonDeserializer);
        }

        private CheckoutPrefetchConfig checkoutPrefetchConfig() {
            return new CheckoutPrefetchConfig(this.jsonDeserializer);
        }

        private CheckoutProductsConfig checkoutProductsConfig() {
            return new CheckoutProductsConfig(this.jsonDeserializer);
        }

        private CheckoutStickyTotalConfig checkoutStickyTotalConfig() {
            return new CheckoutStickyTotalConfig(this.jsonDeserializer);
        }

        private CheckoutTotalConfig checkoutTotalConfig() {
            return new CheckoutTotalConfig(this.jsonDeserializer);
        }

        private ChequesConfig chequesConfig() {
            return new ChequesConfig(this.jsonDeserializer);
        }

        private ClickToDeliveryModalConfig clickToDeliveryModalConfig() {
            return new ClickToDeliveryModalConfig(this.jsonDeserializer, this.context);
        }

        private CmlCellListConfig cmlCellListConfig() {
            return new CmlCellListConfig(this.jsonDeserializer);
        }

        private CommentsListV3Config commentsListV3Config() {
            return new CommentsListV3Config(this.jsonDeserializer);
        }

        private CommonBarcodeConfig commonBarcodeConfig() {
            return new CommonBarcodeConfig(this.jsonDeserializer);
        }

        private CommonTextWidgetConfig commonTextWidgetConfig() {
            return new CommonTextWidgetConfig(this.jsonDeserializer);
        }

        private CompanyCardConfig companyCardConfig() {
            return new CompanyCardConfig(this.jsonDeserializer);
        }

        private ConsigneeListConfig consigneeListConfig() {
            return new ConsigneeListConfig(this.jsonDeserializer);
        }

        private ControlsConfig controlsConfig() {
            return new ControlsConfig(this.jsonDeserializer);
        }

        private ControlsV3Config controlsV3Config() {
            return new ControlsV3Config(this.jsonDeserializer);
        }

        private CopyButtonConfig copyButtonConfig() {
            return new CopyButtonConfig(this.jsonDeserializer);
        }

        private CouponConfig couponConfig() {
            return new CouponConfig(this.jsonDeserializer);
        }

        private CouponGoalsV2Config couponGoalsV2Config() {
            return new CouponGoalsV2Config(this.jsonDeserializer);
        }

        private CourierOnMapConfig courierOnMapConfig() {
            return new CourierOnMapConfig(this.jsonDeserializer);
        }

        private CourierTipsConfig courierTipsConfig() {
            return new CourierTipsConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.CourierTipsConfig courierTipsConfig2() {
            return new ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.CourierTipsConfig(this.jsonDeserializer);
        }

        private CreateListWrapperConfig createListWrapperConfig() {
            return new CreateListWrapperConfig(this.jsonDeserializer);
        }

        private CreateReviewButtonConfig createReviewButtonConfig() {
            return new CreateReviewButtonConfig(this.jsonDeserializer);
        }

        private CreateShoppingListConfig createShoppingListConfig() {
            return new CreateShoppingListConfig(this.jsonDeserializer);
        }

        private CrossSaleConfig crossSaleConfig() {
            return new CrossSaleConfig(this.jsonDeserializer);
        }

        private CurrentConsigneeConfig currentConsigneeConfig() {
            return new CurrentConsigneeConfig(this.jsonDeserializer);
        }

        private CurtainContentConfig curtainContentConfig() {
            return new CurtainContentConfig(this.jsonDeserializer);
        }

        private CurtainGoalsV2Config curtainGoalsV2Config() {
            return new CurtainGoalsV2Config(this.jsonDeserializer);
        }

        private CurtainHeaderConfig curtainHeaderConfig() {
            return new CurtainHeaderConfig(this.jsonDeserializer);
        }

        private CurtainSettingsConfig curtainSettingsConfig() {
            return new CurtainSettingsConfig(this.jsonDeserializer);
        }

        private CustomCellConfig customCellConfig() {
            return new CustomCellConfig(this.jsonDeserializer);
        }

        private CustomerContactsV2Config customerContactsV2Config() {
            return new CustomerContactsV2Config(this.jsonDeserializer);
        }

        private CustomsFeesConfig customsFeesConfig() {
            return new CustomsFeesConfig(this.jsonDeserializer);
        }

        private DateSelectorConfig dateSelectorConfig() {
            return new DateSelectorConfig(this.jsonDeserializer);
        }

        private Set<i> defaultWidgets$composer_prodGoogleAllVendorsRelease() {
            return DefaultWidgetsModule_DefaultWidgets$composer_prodGoogleAllVendorsReleaseFactory.defaultWidgets$composer_prodGoogleAllVendorsRelease(this.defaultWidgetsModule, this.appType);
        }

        private DeliveryComplainWidgetConfig deliveryComplainWidgetConfig() {
            return new DeliveryComplainWidgetConfig(this.jsonDeserializer);
        }

        private DeliveryConfigV5 deliveryConfigV5() {
            return new DeliveryConfigV5(this.jsonDeserializer);
        }

        private DeliveryDateChangedComplaintFormConfig deliveryDateChangedComplaintFormConfig() {
            return new DeliveryDateChangedComplaintFormConfig(this.jsonDeserializer);
        }

        private DeliveryInfoConfig deliveryInfoConfig() {
            return new DeliveryInfoConfig(this.jsonDeserializer);
        }

        private DeliveryOrderInputConfig deliveryOrderInputConfig() {
            return new DeliveryOrderInputConfig(this.jsonDeserializer);
        }

        private DeliveryOrderListConfig deliveryOrderListConfig() {
            return new DeliveryOrderListConfig(this.jsonDeserializer);
        }

        private DeliveryOrderOnDetailsConfig deliveryOrderOnDetailsConfig() {
            return new DeliveryOrderOnDetailsConfig(this.jsonDeserializer);
        }

        private DeliveryProblemsConfig deliveryProblemsConfig() {
            return new DeliveryProblemsConfig(this.jsonDeserializer);
        }

        private DeliveryRatingConfig deliveryRatingConfig() {
            return new DeliveryRatingConfig(this.jsonDeserializer);
        }

        private DeliveryReviewFormConfig deliveryReviewFormConfig() {
            return new DeliveryReviewFormConfig(this.jsonDeserializer);
        }

        private DeliveryReviewHeaderConfig deliveryReviewHeaderConfig() {
            return new DeliveryReviewHeaderConfig(this.jsonDeserializer);
        }

        private DeliveryReviewSuccessConfig deliveryReviewSuccessConfig() {
            return new DeliveryReviewSuccessConfig(this.jsonDeserializer);
        }

        private DeliveryTimeConfig deliveryTimeConfig() {
            return new DeliveryTimeConfig(this.jsonDeserializer);
        }

        private DeliveryTimeSelectorV2Config deliveryTimeSelectorV2Config() {
            return new DeliveryTimeSelectorV2Config(deliveryTimeSelectorV2Parser());
        }

        private DeliveryTimeSelectorV2Parser deliveryTimeSelectorV2Parser() {
            return new DeliveryTimeSelectorV2Parser(this.jsonDeserializer);
        }

        private DeliveryToCharitiesInfoConfig deliveryToCharitiesInfoConfig() {
            return new DeliveryToCharitiesInfoConfig(this.jsonDeserializer);
        }

        private DeliveryV6Config deliveryV6Config() {
            return new DeliveryV6Config(this.jsonDeserializer);
        }

        private DeliveryWidgetBigOzonConfig deliveryWidgetBigOzonConfig() {
            return new DeliveryWidgetBigOzonConfig(this.jsonDeserializer);
        }

        private DeliveryWidgetV2Config deliveryWidgetV2Config() {
            return new DeliveryWidgetV2Config(this.jsonDeserializer);
        }

        private DeliveryWidgetV3Config deliveryWidgetV3Config() {
            return new DeliveryWidgetV3Config(this.jsonDeserializer);
        }

        private DeliveryWidgetV4Config deliveryWidgetV4Config() {
            return new DeliveryWidgetV4Config(this.jsonDeserializer);
        }

        private DescriptionAccordionConfig descriptionAccordionConfig() {
            return new DescriptionAccordionConfig(this.jsonDeserializer);
        }

        private DetailedCheckoutProductsConfig detailedCheckoutProductsConfig() {
            return new DetailedCheckoutProductsConfig(this.jsonDeserializer, headerApi());
        }

        private DialogSearchBarConfig dialogSearchBarConfig() {
            return new DialogSearchBarConfig(this.jsonDeserializer);
        }

        private DirectFlightsDropdownConfig directFlightsDropdownConfig() {
            return new DirectFlightsDropdownConfig(this.jsonDeserializer);
        }

        private DisposableBannerConfig disposableBannerConfig() {
            return new DisposableBannerConfig(this.jsonDeserializer);
        }

        private DocsDeliveryFormConfig docsDeliveryFormConfig() {
            return new DocsDeliveryFormConfig(this.jsonDeserializer);
        }

        private DocsTableConfig docsTableConfig() {
            return new DocsTableConfig(this.jsonDeserializer);
        }

        private DocsTableV2Config docsTableV2Config() {
            return new DocsTableV2Config(this.jsonDeserializer);
        }

        private EdoDatePickerConfig edoDatePickerConfig() {
            return new EdoDatePickerConfig(this.jsonDeserializer);
        }

        private EdoProvidersConfig edoProvidersConfig() {
            return new EdoProvidersConfig(this.jsonDeserializer);
        }

        private EmployeesTableConfig employeesTableConfig() {
            return new EmployeesTableConfig(this.jsonDeserializer);
        }

        private EmptyCartV2Config emptyCartV2Config() {
            return new EmptyCartV2Config(this.jsonDeserializer);
        }

        private EmptyScreenConfig emptyScreenConfig() {
            return new EmptyScreenConfig(this.jsonDeserializer);
        }

        private EmptyStateV2Config emptyStateV2Config() {
            return new EmptyStateV2Config(this.jsonDeserializer);
        }

        private EmptyStateV3Config emptyStateV3Config() {
            return new EmptyStateV3Config(this.jsonDeserializer);
        }

        private EmptyStateWidgetConfig emptyStateWidgetConfig() {
            return new EmptyStateWidgetConfig(this.jsonDeserializer);
        }

        private EnableNotificationsConfig enableNotificationsConfig() {
            return new EnableNotificationsConfig(this.jsonDeserializer);
        }

        private EnableNotificationsSnackbarConfig enableNotificationsSnackbarConfig() {
            return new EnableNotificationsSnackbarConfig(this.jsonDeserializer);
        }

        private EntryBannerWidgetConfig entryBannerWidgetConfig() {
            return new EntryBannerWidgetConfig(this.jsonDeserializer);
        }

        private ErrorConfig errorConfig() {
            return new ErrorConfig(this.jsonDeserializer);
        }

        private ExpandableCellsConfig expandableCellsConfig() {
            return new ExpandableCellsConfig(this.jsonDeserializer);
        }

        private ExpressAvailabilityConfig expressAvailabilityConfig() {
            return new ExpressAvailabilityConfig(this.jsonDeserializer);
        }

        private ExpressNavBarConfig expressNavBarConfig() {
            return new ExpressNavBarConfig(this.jsonDeserializer);
        }

        private ExpressNavTitleConfig expressNavTitleConfig() {
            return new ExpressNavTitleConfig(this.jsonDeserializer);
        }

        private ExpressNavigationSliderV2Config expressNavigationSliderV2Config() {
            return new ExpressNavigationSliderV2Config(this.jsonDeserializer);
        }

        private ExpressRedirectButtonConfig expressRedirectButtonConfig() {
            return new ExpressRedirectButtonConfig(this.jsonDeserializer);
        }

        private ExtendBackgroundConfig extendBackgroundConfig() {
            return new ExtendBackgroundConfig(this.jsonDeserializer);
        }

        private ExternalVerificationHandlerMobileConfig externalVerificationHandlerMobileConfig() {
            return new ExternalVerificationHandlerMobileConfig(this.jsonDeserializer);
        }

        private FakeSearchConfig fakeSearchConfig() {
            return new FakeSearchConfig(this.jsonDeserializer);
        }

        private FamilyProfileAvatarConfig familyProfileAvatarConfig() {
            return new FamilyProfileAvatarConfig(this.jsonDeserializer);
        }

        private FaqConfig faqConfig() {
            return new FaqConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.faq.data.FaqConfig faqConfig2() {
            return new ru.ozon.app.android.faq.data.FaqConfig(this.jsonDeserializer, this.application);
        }

        private FavoriteProductV2Config favoriteProductV2Config() {
            return new FavoriteProductV2Config(this.jsonDeserializer);
        }

        private FeedbackCurtainConfig feedbackCurtainConfig() {
            return new FeedbackCurtainConfig(this.jsonDeserializer);
        }

        private FeedbackFormConfig feedbackFormConfig() {
            return new FeedbackFormConfig(this.jsonDeserializer);
        }

        private FeedbackFormV2Config feedbackFormV2Config() {
            return new FeedbackFormV2Config(this.jsonDeserializer);
        }

        private FeedbackTileConfig feedbackTileConfig() {
            return new FeedbackTileConfig(this.jsonDeserializer);
        }

        private FilterValuesConfig filterValuesConfig() {
            return new FilterValuesConfig(this.jsonDeserializer);
        }

        private FiltersButtonWithCounterConfig filtersButtonWithCounterConfig() {
            return new FiltersButtonWithCounterConfig(this.jsonDeserializer);
        }

        private FiltersConfig filtersConfig() {
            return new FiltersConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.common.filterWidgets.filters.core.FiltersConfig filtersConfig2() {
            return new ru.ozon.app.android.common.filterWidgets.filters.core.FiltersConfig(this.jsonDeserializer);
        }

        private FinanceHeaderConfig financeHeaderConfig() {
            return new FinanceHeaderConfig(this.jsonDeserializer);
        }

        private FinanceWidgetConfig financeWidgetConfig() {
            return new FinanceWidgetConfig(this.jsonDeserializer);
        }

        private FlexButtonsConfig flexButtonsConfig() {
            return new FlexButtonsConfig(this.jsonDeserializer);
        }

        private FlightRouteDetailsConfig flightRouteDetailsConfig() {
            return new FlightRouteDetailsConfig(this.jsonDeserializer);
        }

        private FlightSeatsLegendConfig flightSeatsLegendConfig() {
            return new FlightSeatsLegendConfig(this.jsonDeserializer);
        }

        private FlightSeatsSchemeConfig flightSeatsSchemeConfig() {
            return new FlightSeatsSchemeConfig(this.jsonDeserializer);
        }

        private FreshMiniappHeaderConfig freshMiniappHeaderConfig() {
            return new FreshMiniappHeaderConfig(this.jsonDeserializer);
        }

        private FreshPaymentInfoConfig freshPaymentInfoConfig() {
            return new FreshPaymentInfoConfig(this.jsonDeserializer);
        }

        private FreshPaymentScheduleConfig freshPaymentScheduleConfig() {
            return new FreshPaymentScheduleConfig(this.jsonDeserializer);
        }

        private FreshPremiumPointsToggleConfig freshPremiumPointsToggleConfig() {
            return new FreshPremiumPointsToggleConfig(this.jsonDeserializer);
        }

        private FreshPremiumPointsTrainConfig freshPremiumPointsTrainConfig() {
            return new FreshPremiumPointsTrainConfig(this.jsonDeserializer);
        }

        private FreshServiceCarouselConfig freshServiceCarouselConfig() {
            return new FreshServiceCarouselConfig(this.jsonDeserializer);
        }

        private FreshTileGridConfig freshTileGridConfig() {
            return new FreshTileGridConfig(this.jsonDeserializer, headerApi());
        }

        private FullTextSearchHeaderV3Config fullTextSearchHeaderV3Config() {
            return new FullTextSearchHeaderV3Config(this.jsonDeserializer);
        }

        private FullTextSearchHeaderV4Config fullTextSearchHeaderV4Config() {
            return new FullTextSearchHeaderV4Config(this.jsonDeserializer);
        }

        private GalleryFullViewConfig galleryFullViewConfig() {
            return new GalleryFullViewConfig(this.jsonDeserializer);
        }

        private GalleryV3Config galleryV3Config() {
            return new GalleryV3Config(galleryV3Parser());
        }

        private GalleryV3Parser galleryV3Parser() {
            return new GalleryV3Parser(this.jsonDeserializer);
        }

        private GalleryV4Config galleryV4Config() {
            return new GalleryV4Config(this.jsonDeserializer);
        }

        private GalleryV5Config galleryV5Config() {
            return new GalleryV5Config(this.jsonDeserializer);
        }

        private GeotrackingBottomButtonConfig geotrackingBottomButtonConfig() {
            return new GeotrackingBottomButtonConfig(this.jsonDeserializer);
        }

        private GeotrackingMapV2Config geotrackingMapV2Config() {
            return new GeotrackingMapV2Config(this.jsonDeserializer);
        }

        private GroupButtonsConfig groupButtonsConfig() {
            return new GroupButtonsConfig(this.jsonDeserializer);
        }

        private HammersV3Config hammersV3Config() {
            return new HammersV3Config(hammersV3Parser());
        }

        private HammersV3Parser hammersV3Parser() {
            return HammersV3WidgetModule_ProvideParserFactory.provideParser(this.moshi);
        }

        private HeaderApi headerApi() {
            return HeaderWidgetModule_ProvideHeaderApiFactory.provideHeaderApi(this.headerWidgetModule, new HeaderViewMapper());
        }

        private HeaderConfig headerConfig() {
            return new HeaderConfig(this.jsonDeserializer);
        }

        private HeaderWidgetViewMapper headerWidgetViewMapper() {
            return new HeaderWidgetViewMapper(new HeaderMapper());
        }

        private HelpCertConfig helpCertConfig() {
            return new HelpCertConfig(this.jsonDeserializer);
        }

        private HelpInsuranceConfig helpInsuranceConfig() {
            return new HelpInsuranceConfig(this.jsonDeserializer);
        }

        private HelpfulHintsConfig helpfulHintsConfig() {
            return new HelpfulHintsConfig(this.jsonDeserializer);
        }

        private HiddenQueryServicesManagerConfig hiddenQueryServicesManagerConfig() {
            return new HiddenQueryServicesManagerConfig(this.jsonDeserializer);
        }

        private HighlightProductsConfig highlightProductsConfig() {
            return new HighlightProductsConfig(this.jsonDeserializer);
        }

        private HighlightsWrapperConfig highlightsWrapperConfig() {
            return new HighlightsWrapperConfig(this.jsonDeserializer);
        }

        private HistoryConfig historyConfig() {
            return new HistoryConfig(this.jsonDeserializer);
        }

        private HomeButtonConfig homeButtonConfig() {
            return new HomeButtonConfig(this.jsonDeserializer);
        }

        private HorizontalAutoScrollConfig horizontalAutoScrollConfig() {
            return new HorizontalAutoScrollConfig(this.jsonDeserializer);
        }

        private HorizontalIconButtonsConfig horizontalIconButtonsConfig() {
            return new HorizontalIconButtonsConfig(this.jsonDeserializer);
        }

        private HotTicketsConfig hotTicketsConfig() {
            return new HotTicketsConfig(this.jsonDeserializer);
        }

        private HotelsBookAdditionsConfig hotelsBookAdditionsConfig() {
            return new HotelsBookAdditionsConfig(this.jsonDeserializer);
        }

        private HotelsBookTotalV2Config hotelsBookTotalV2Config() {
            return new HotelsBookTotalV2Config(this.jsonDeserializer);
        }

        private HotelsCheckoutTitleConfig hotelsCheckoutTitleConfig() {
            return new HotelsCheckoutTitleConfig(this.jsonDeserializer);
        }

        private HotelsGalleryConfig hotelsGalleryConfig() {
            return new HotelsGalleryConfig(this.jsonDeserializer);
        }

        private HotelsGalleryFeedConfig hotelsGalleryFeedConfig() {
            return new HotelsGalleryFeedConfig(this.jsonDeserializer);
        }

        private HotelsHorizontalShelvesConfig hotelsHorizontalShelvesConfig() {
            return new HotelsHorizontalShelvesConfig(this.jsonDeserializer);
        }

        private HotelsOrderRoomsDetailsConfig hotelsOrderRoomsDetailsConfig() {
            return new HotelsOrderRoomsDetailsConfig(this.jsonDeserializer);
        }

        private HotelsPageButtonV5Config hotelsPageButtonV5Config() {
            return new HotelsPageButtonV5Config(this.jsonDeserializer);
        }

        private HotelsPageDetailsConfig hotelsPageDetailsConfig() {
            return new HotelsPageDetailsConfig(this.jsonDeserializer);
        }

        private HotelsPageDetailsFullConfig hotelsPageDetailsFullConfig() {
            return new HotelsPageDetailsFullConfig(this.jsonDeserializer);
        }

        private HotelsPageHeaderConfig hotelsPageHeaderConfig() {
            return new HotelsPageHeaderConfig(this.jsonDeserializer);
        }

        private HotelsPageHeaderRoundedConfig hotelsPageHeaderRoundedConfig() {
            return new HotelsPageHeaderRoundedConfig(this.jsonDeserializer);
        }

        private HotelsPageReviewsConfig hotelsPageReviewsConfig() {
            return new HotelsPageReviewsConfig(this.jsonDeserializer);
        }

        private HotelsReviewsConfig hotelsReviewsConfig() {
            return new HotelsReviewsConfig(this.jsonDeserializer);
        }

        private HotelsRoomsDetailsFullConfig hotelsRoomsDetailsFullConfig() {
            return new HotelsRoomsDetailsFullConfig(this.jsonDeserializer);
        }

        private HotelsRoomsDetailsFullV3Config hotelsRoomsDetailsFullV3Config() {
            return new HotelsRoomsDetailsFullV3Config(this.jsonDeserializer);
        }

        private HotelsSearchResultsV5Config hotelsSearchResultsV5Config() {
            return new HotelsSearchResultsV5Config(this.jsonDeserializer);
        }

        private HotelsVerticalShelvesConfig hotelsVerticalShelvesConfig() {
            return new HotelsVerticalShelvesConfig(this.jsonDeserializer);
        }

        private IconButtonConfig iconButtonConfig() {
            return new IconButtonConfig(this.jsonDeserializer);
        }

        private IconButtonWidgetConfig iconButtonWidgetConfig() {
            return new IconButtonWidgetConfig(this.jsonDeserializer);
        }

        private IconButtonsConfig iconButtonsConfig() {
            return new IconButtonsConfig(this.jsonDeserializer);
        }

        private ImageBadgeListConfig imageBadgeListConfig() {
            return new ImageBadgeListConfig(this.jsonDeserializer);
        }

        private InAppPushConfig inAppPushConfig() {
            return new InAppPushConfig(this.jsonDeserializer);
        }

        private InfoDropDownConfig infoDropDownConfig() {
            return new InfoDropDownConfig(this.jsonDeserializer);
        }

        private InfoPopupConfig infoPopupConfig() {
            return new InfoPopupConfig(this.jsonDeserializer);
        }

        private InfoPopupV2Config infoPopupV2Config() {
            return new InfoPopupV2Config(this.jsonDeserializer);
        }

        private InfoPopupV4Config infoPopupV4Config() {
            return new InfoPopupV4Config(this.jsonDeserializer);
        }

        private void initialize(SearchWidgetV2DiModule searchWidgetV2DiModule, PdpWidgetsModule pdpWidgetsModule, PdpOldWidgetsModule pdpOldWidgetsModule, UgcWidgetsModule ugcWidgetsModule, UgcCoreWidgetsModule ugcCoreWidgetsModule, UgcPayoutWidgetsModule ugcPayoutWidgetsModule, OrdersCommonModule ordersCommonModule, OrderListModule orderListModule, ProductsPackageModule productsPackageModule, SelectPaymentModule selectPaymentModule, NavBarModule navBarModule, ChangeDeliveryTimeButtonModule changeDeliveryTimeButtonModule, RecipientWidgetModule recipientWidgetModule, OrderFiltersModule orderFiltersModule, OrderGalleryWidgetModule orderGalleryWidgetModule, DeliveryDateChangedComplaintFormModule deliveryDateChangedComplaintFormModule, DeliveryComplainWidgetModule deliveryComplainWidgetModule, BarcodeWidgetModule barcodeWidgetModule, ActionButtonV2WidgetModule actionButtonV2WidgetModule, ActiveOrdersCountWidgetModule activeOrdersCountWidgetModule, ClickToDeliveryModalWidgetModule clickToDeliveryModalWidgetModule, BarcodePopoverWidgetModule barcodePopoverWidgetModule, OrderProductsWidgetModule orderProductsWidgetModule, EditCredentialsWidgetsModule editCredentialsWidgetsModule, AddressCommunicationWidgetModule addressCommunicationWidgetModule, BannerListWidgetModule bannerListWidgetModule, CatalogShelfWidgetModule catalogShelfWidgetModule, CatalogueTabsWidgetModule catalogueTabsWidgetModule, CatalogTabsV2WidgetModule catalogTabsV2WidgetModule, CouponGoalsV2WidgetModule couponGoalsV2WidgetModule, CurtainGoalsV2WidgetModule curtainGoalsV2WidgetModule, OrderTrackingWidgetModule orderTrackingWidgetModule, PromoCarouselWidgetModule promoCarouselWidgetModule, ExpressRedirectButtonWidgetModule expressRedirectButtonWidgetModule, ExpressNavigationSliderWidgetModule expressNavigationSliderWidgetModule, FakeSearchWidgetModule fakeSearchWidgetModule, NavSliderV3WidgetModule navSliderV3WidgetModule, ScrollWidgetModule scrollWidgetModule, FreshMiniappHeaderWidgetModule freshMiniappHeaderWidgetModule, ScrollActionListModule scrollActionListModule, HeaderWidgetModule headerWidgetModule, CatalogTileScrollWidgetModule catalogTileScrollWidgetModule, CatalogTileWidgetModule catalogTileWidgetModule, NotificationCarouselV2WidgetModule notificationCarouselV2WidgetModule, CustomCellWidgetModule customCellWidgetModule, WiseSkuScrollWidgetModule wiseSkuScrollWidgetModule, StickyPromoBannerWidgetModule stickyPromoBannerWidgetModule, AddressPopupButtonWidgetModule addressPopupButtonWidgetModule, DeliveryRatingWidgetModule deliveryRatingWidgetModule, GeotrackingMapV2WidgetModule geotrackingMapV2WidgetModule, OrderInfoWidgetModule orderInfoWidgetModule, OrderItemsWidgetModule orderItemsWidgetModule, OrderStatusV3WidgetModule orderStatusV3WidgetModule, GeotrackingBottomButtonWidgetModule geotrackingBottomButtonWidgetModule, FreshCartWidgetsModule freshCartWidgetsModule, CartTileWidgetModule cartTileWidgetModule, CartClickTileWidgetModule cartClickTileWidgetModule, CartMasterWidgetModule cartMasterWidgetModule, CartIconButtonWidgetModule cartIconButtonWidgetModule, StickyTotalWidgetModule stickyTotalWidgetModule, DetailedCheckoutProductsWidgetModule detailedCheckoutProductsWidgetModule, CellListWidgetModule cellListWidgetModule, FreshUnsortedWidgetsModule freshUnsortedWidgetsModule, AddressSelectorLiteWidgetModule addressSelectorLiteWidgetModule, AutoCatalogWidgetModule autoCatalogWidgetModule, BottomCartWidgetModule bottomCartWidgetModule, BrandzoneCarouselWidgetModule brandzoneCarouselWidgetModule, CharityAddressSelectorWidgetModule charityAddressSelectorWidgetModule, CourierTipsWidgetModule courierTipsWidgetModule, DeliveryProblemsWidgetModule deliveryProblemsWidgetModule, DeliveryToCharitiesInfoModule deliveryToCharitiesInfoModule, DeliveryWidgetV2Module deliveryWidgetV2Module, DeliveryWidgetV3Module deliveryWidgetV3Module, DeliveryWidgetBigOzonModule deliveryWidgetBigOzonModule, HomeButtonWidgetModule homeButtonWidgetModule, IconButtonsWidgetModule iconButtonsWidgetModule, InfoDropDownWidgetModule infoDropDownWidgetModule, IslandSeparatorWidgetModule islandSeparatorWidgetModule, OrderStatusLiveActivityWidgetModule orderStatusLiveActivityWidgetModule, ProductsInBotWidgetModule productsInBotWidgetModule, SearchBarWidgetModule searchBarWidgetModule, WholeSaleWidgetModule wholeSaleWidgetModule, FreshServiceCarouselWidgetModule freshServiceCarouselWidgetModule, ExpressNavBarWidgetModule expressNavBarWidgetModule, ExpressNavTitleWidgetModule expressNavTitleWidgetModule, ExpressAvailabilityWidgetModule expressAvailabilityWidgetModule, FeedbackCurtainWidgetModule feedbackCurtainWidgetModule, PromoOfferWidgetModule promoOfferWidgetModule, RecShelfWidgetModule recShelfWidgetModule, SeparatorBadgeWidgetModule separatorBadgeWidgetModule, ImageBadgeListWidgetModule imageBadgeListWidgetModule, BottomContainerWidgetModule bottomContainerWidgetModule, ProductsInBotV2WidgetModule productsInBotV2WidgetModule, PdpAspectsWidgetModule pdpAspectsWidgetModule, PdpNutritionInfoWidgetModule pdpNutritionInfoWidgetModule, FreshTileGridWidgetModule freshTileGridWidgetModule, SteppedThermometerModule steppedThermometerModule, TravelToursWidgetFactoryModule travelToursWidgetFactoryModule, TravelRailwayWidgetFactoryModule travelRailwayWidgetFactoryModule, TravelHotelsMapWidgetV2Module travelHotelsMapWidgetV2Module, TravelGeneralWidgetV2Module travelGeneralWidgetV2Module, TravelGeneralWidgetFactoryModule travelGeneralWidgetFactoryModule, TravelGeneralBookingWidgetFactoryModule travelGeneralBookingWidgetFactoryModule, PremiumPointsTrainV2Module premiumPointsTrainV2Module, ReturnListWidgetModule returnListWidgetModule, ReturnListEmptyModule returnListEmptyModule, ReturnDetailsWidgetModule returnDetailsWidgetModule, ReturnDetailsHeaderButtonWidgetModule returnDetailsHeaderButtonWidgetModule, ReturnActionModalWidgetModule returnActionModalWidgetModule, ReturnableItemsListWidgetModule returnableItemsListWidgetModule, ReturnEditWidgetModule returnEditWidgetModule, ReturnDetailsTotalWidgetModule returnDetailsTotalWidgetModule, ReturnActionButtonsWidgetModule returnActionButtonsWidgetModule, ReturnBalanceModalWidgetModule returnBalanceModalWidgetModule, OrderActionsV2Module orderActionsV2Module, OrderDetailsItemModule orderDetailsItemModule, CustomsFeesModule customsFeesModule, OrderTotalModule orderTotalModule, OrderTimelineV2Module orderTimelineV2Module, OrderTrackShipmentModule orderTrackShipmentModule, TimeLeftWidgetModule timeLeftWidgetModule, OrderActionsModule orderActionsModule, OrderDeliveryDetailV2Module orderDeliveryDetailV2Module, OrderStatusModule orderStatusModule, ChequesWidgetModule chequesWidgetModule, DateSelectorWidgetModule dateSelectorWidgetModule, DeliveryTimeSelectorV1Module deliveryTimeSelectorV1Module, RadioGroupWidgetModule radioGroupWidgetModule, ReplyToCourierInfoWidgetModule replyToCourierInfoWidgetModule, SelectCancelReasonModule selectCancelReasonModule, ExtendBackgroundWidgetModule extendBackgroundWidgetModule, ModalConstructorModule modalConstructorModule, CheckoutWidget2Module checkoutWidget2Module, AdvPageStayDiModule advPageStayDiModule, MarketingWidgets2Module marketingWidgets2Module, MarketingWidgetsFactoryModule marketingWidgetsFactoryModule, SisBrandFavoriteWidgetModule sisBrandFavoriteWidgetModule, BigPromoCheckoutWidgetModule bigPromoCheckoutWidgetModule, MegaDrawModule megaDrawModule, NaviBlocksModule naviBlocksModule, NaviBlocksV3Module naviBlocksV3Module, NaviBlocksV5Module naviBlocksV5Module, NaviCategoriesModule naviCategoriesModule, NaviGridModule naviGridModule, NaviGrid3Module naviGrid3Module, VideoTileWidgetModule videoTileWidgetModule, VideoScrollWidgetModule videoScrollWidgetModule, FinanceWidgetModule financeWidgetModule, FinanceWidgetV2Module financeWidgetV2Module, AppOnboardingWidgetModule appOnboardingWidgetModule, PromoPlacementModule promoPlacementModule, ProfileIconButtonWidgetModule profileIconButtonWidgetModule, NavLikezoneCaruselDiModule navLikezoneCaruselDiModule, DefaultWidgetsModule defaultWidgetsModule, FavoriteProductV2WidgetModule favoriteProductV2WidgetModule, FlashCallWidget2Module flashCallWidget2Module, SellerProductsWidgetsModule sellerProductsWidgetsModule, FaqWidgetModule faqWidgetModule, PlayStoriesV3WidgetModule playStoriesV3WidgetModule, CartWidget2Module cartWidget2Module, ControlsModule controlsModule, ControlsV3Module controlsV3Module, MasterWidgetModule masterWidgetModule, TotalV3WidgetModule totalV3WidgetModule, CartSplitV2Module cartSplitV2Module, CartSplitV2ModuleV2 cartSplitV2ModuleV2, EmptyCartV2Module emptyCartV2Module, CheckoutPrefetchWidgetModule checkoutPrefetchWidgetModule, PixelModule pixelModule, AsyncWidgetModule asyncWidgetModule, DebugWidgetsModule debugWidgetsModule, ActionCardsModule actionCardsModule, ProgressiveTextModule progressiveTextModule, ru.ozon.app.android.di.IslandSeparatorWidgetModule islandSeparatorWidgetModule2, OrderDoneWidgets2Module orderDoneWidgets2Module, OrderDonePaymentStatusWidgetModule orderDonePaymentStatusWidgetModule, OrderDoneDisclaimerWidgetModule orderDoneDisclaimerWidgetModule, OrderDoneTotalWidgetModule orderDoneTotalWidgetModule, OrderDoneCrossButtonWidgetModule orderDoneCrossButtonWidgetModule, OrderDoneButtonBarWidgetModule orderDoneButtonBarWidgetModule, EnableNotificationsSnackbarWidgetModule enableNotificationsSnackbarWidgetModule, ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsWidgetModule courierTipsWidgetModule2, ObjectScrollWidgetV2Module objectScrollWidgetV2Module, UniversalObjectV2Module universalObjectV2Module, CommonTextWidgetModule commonTextWidgetModule, ActionButtonModule actionButtonModule, GeoWidget2Module geoWidget2Module, DeliveryCabinetWidgetV2Module deliveryCabinetWidgetV2Module, DeliveryReviewFormWidget2Module deliveryReviewFormWidget2Module, DeliveryReviewHeaderModule deliveryReviewHeaderModule, DeliveryReviewSuccessModule deliveryReviewSuccessModule, ReturnCreationWidgetsModule returnCreationWidgetsModule, ReturnCreationModalWidgetModule returnCreationModalWidgetModule, ReturnCreationActiveDeliveriesWidgetModule returnCreationActiveDeliveriesWidgetModule, ReturnCreationMethodsWidgetModule returnCreationMethodsWidgetModule, ReturnCreationTotalWidgetModule returnCreationTotalWidgetModule, ReturnCreationSelectedItemsWidgetModule returnCreationSelectedItemsWidgetModule, ReturnCreationStepsWidgetModule returnCreationStepsWidgetModule, ReturnCreationOrdersWidgetModule returnCreationOrdersWidgetModule, ReturnCreationOrderWidgetModule returnCreationOrderWidgetModule, ReturnCreationReasonsWidgetModule returnCreationReasonsWidgetModule, ReturnTextAreaButtonWidgetModule returnTextAreaButtonWidgetModule, ReturnCreationPhotoPickerWidgetModule returnCreationPhotoPickerWidgetModule, ReturnCreationItemInfoWidgetModule returnCreationItemInfoWidgetModule, DeliveryOrderOnDetailsWidgetModule deliveryOrderOnDetailsWidgetModule, DeliveryInfoWidgetModule deliveryInfoWidgetModule, DeliveryOrderInputWidgetModule deliveryOrderInputWidgetModule, GroupButtonsWidgetModule groupButtonsWidgetModule, DeliveryOrderListWidgetModule deliveryOrderListWidgetModule, TipCourierDetailsV2Module tipCourierDetailsV2Module, TipCourierHeaderWidgetModule tipCourierHeaderWidgetModule, TipCourierReviewV2WidgetModule tipCourierReviewV2WidgetModule, TipProductPhotosModule tipProductPhotosModule, EmptyScreenWidgetModule emptyScreenWidgetModule, BarcodeProductsListWidgetModule barcodeProductsListWidgetModule, BorderlessButtonWidgetModule borderlessButtonWidgetModule, TextWidgetModule textWidgetModule, ru.ozon.app.android.returns.cancels.cancelReasons.di.SelectCancelReasonModule selectCancelReasonModule2, ru.ozon.app.android.returns.cancels.modalConstructor.di.ModalConstructorModule modalConstructorModule2, PromptStatusWidgetModule promptStatusWidgetModule, ResponseActionsWidgetModule responseActionsWidgetModule, Context context, Application application, JsonParser jsonParser, JsonSerializer jsonSerializer, Moshi moshi, FeatureChecker featureChecker, AppType appType) {
            this.tileGrid3MapperProvider = new SwitchingProvider(this.widgetRegistrationComponentImpl, 0);
            this.textMeasurerProvider = new SwitchingProvider(this.widgetRegistrationComponentImpl, 1);
            this.hideTabBarOnScrollConfigProvider = new SwitchingProvider(this.widgetRegistrationComponentImpl, 2);
            this.hideTabBarOnScrollViewMapperProvider = new SwitchingProvider(this.widgetRegistrationComponentImpl, 3);
        }

        private ReconciliationActsDeclinerViewMapper injectReconciliationActsDeclinerViewMapper(ReconciliationActsDeclinerViewMapper reconciliationActsDeclinerViewMapper) {
            ReconciliationActsDeclinerViewMapper_MembersInjector.injectJsonDeserializer(reconciliationActsDeclinerViewMapper, this.jsonDeserializer);
            return reconciliationActsDeclinerViewMapper;
        }

        private InputCurtainConfig inputCurtainConfig() {
            return new InputCurtainConfig(this.jsonDeserializer);
        }

        private InputFormConfig inputFormConfig() {
            return new InputFormConfig(this.jsonDeserializer);
        }

        private InputSubmitConfig inputSubmitConfig() {
            return new InputSubmitConfig(this.jsonDeserializer);
        }

        private InputWidgetConfig inputWidgetConfig() {
            return new InputWidgetConfig(this.jsonDeserializer);
        }

        private InstallmentPaymentConfig installmentPaymentConfig() {
            return new InstallmentPaymentConfig(this.jsonDeserializer);
        }

        private InstallmentPaymentScheduleConfig installmentPaymentScheduleConfig() {
            return new InstallmentPaymentScheduleConfig(this.jsonDeserializer);
        }

        private InstallmentPurchaseConfig installmentPurchaseConfig() {
            return new InstallmentPurchaseConfig(installmentPurchaseParser());
        }

        private InstallmentPurchaseParser installmentPurchaseParser() {
            return new InstallmentPurchaseParser(this.jsonDeserializer);
        }

        private InstructionViewMapper instructionViewMapper() {
            return new InstructionViewMapper(new InstructionMapper(), new TextBlockDecoration());
        }

        private InsurancePanelConfig insurancePanelConfig() {
            return new InsurancePanelConfig(this.jsonDeserializer);
        }

        private InternalTeethConfig internalTeethConfig() {
            return new InternalTeethConfig(this.jsonDeserializer);
        }

        private InvisibleRefresherConfig invisibleRefresherConfig() {
            return new InvisibleRefresherConfig(this.jsonDeserializer);
        }

        private IsFavoriteProductConfig isFavoriteProductConfig() {
            return new IsFavoriteProductConfig(this.jsonDeserializer);
        }

        private IslandSeparatorConfig islandSeparatorConfig() {
            return new IslandSeparatorConfig(this.jsonDeserializer);
        }

        private ru.ozon.android.composerCommonViewKit.islandSeparator.core.IslandSeparatorConfig islandSeparatorConfig2() {
            return new ru.ozon.android.composerCommonViewKit.islandSeparator.core.IslandSeparatorConfig(this.jsonDeserializer);
        }

        private LegalDetailsEditorConfig legalDetailsEditorConfig() {
            return new LegalDetailsEditorConfig(this.jsonDeserializer);
        }

        private LegalDocsConfig legalDocsConfig() {
            return new LegalDocsConfig(this.jsonDeserializer);
        }

        private ListAnswersConfig listAnswersConfig() {
            return new ListAnswersConfig(this.jsonDeserializer);
        }

        private ListQuestionsConfig listQuestionsConfig() {
            return new ListQuestionsConfig(this.jsonDeserializer);
        }

        private ListReviewsConfig listReviewsConfig() {
            return new ListReviewsConfig(this.jsonDeserializer);
        }

        private LogoMobileConfig logoMobileConfig() {
            return new LogoMobileConfig(this.jsonDeserializer);
        }

        private LuggageRequirementsV2Config luggageRequirementsV2Config() {
            return new LuggageRequirementsV2Config(this.jsonDeserializer);
        }

        private MainDrawMajorScreenConfig mainDrawMajorScreenConfig() {
            return new MainDrawMajorScreenConfig(this.jsonDeserializer);
        }

        private MainTabsConfig mainTabsConfig() {
            return new MainTabsConfig(this.jsonDeserializer);
        }

        private MarkdownConfig markdownConfig() {
            return new MarkdownConfig(this.jsonDeserializer);
        }

        private MarketingActionsConfig marketingActionsConfig() {
            return new MarketingActionsConfig(this.jsonDeserializer);
        }

        private MarketingDetailWidgetConfig marketingDetailWidgetConfig() {
            return new MarketingDetailWidgetConfig(this.jsonDeserializer);
        }

        private MasterConfig masterConfig() {
            return new MasterConfig(this.jsonDeserializer);
        }

        private MaxiTileConfig maxiTileConfig() {
            return new MaxiTileConfig(this.jsonDeserializer);
        }

        private MegaDrawConfig megaDrawConfig() {
            return new MegaDrawConfig(this.jsonDeserializer);
        }

        private MessageBubbleConfig messageBubbleConfig() {
            return new MessageBubbleConfig(this.jsonDeserializer);
        }

        private MessengerCounterV2Config messengerCounterV2Config() {
            return new MessengerCounterV2Config(this.jsonDeserializer);
        }

        private MilesForBuyersConfig milesForBuyersConfig() {
            return new MilesForBuyersConfig(this.jsonDeserializer);
        }

        private MilesForBuyersModalInfoConfig milesForBuyersModalInfoConfig() {
            return new MilesForBuyersModalInfoConfig(this.jsonDeserializer);
        }

        private MiniAppTitleConfig miniAppTitleConfig() {
            return new MiniAppTitleConfig(this.jsonDeserializer);
        }

        private MiniappHeaderConfig miniappHeaderConfig() {
            return new MiniappHeaderConfig(this.jsonDeserializer);
        }

        private ModalButtonConfig modalButtonConfig() {
            return new ModalButtonConfig(this.jsonDeserializer);
        }

        private ModalConstructorConfig modalConstructorConfig() {
            return new ModalConstructorConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.returns.cancels.modalConstructor.core.ModalConstructorConfig modalConstructorConfig2() {
            return new ru.ozon.app.android.returns.cancels.modalConstructor.core.ModalConstructorConfig(this.jsonDeserializer);
        }

        private ModalTogglerConfig modalTogglerConfig() {
            return new ModalTogglerConfig(this.jsonDeserializer);
        }

        private MorkovskBackgroundImageConfig morkovskBackgroundImageConfig() {
            return new MorkovskBackgroundImageConfig(this.jsonDeserializer);
        }

        private MorkovskNavBarConfig morkovskNavBarConfig() {
            return new MorkovskNavBarConfig(this.jsonDeserializer);
        }

        private MorkovskOnboardingInfoConfig morkovskOnboardingInfoConfig() {
            return new MorkovskOnboardingInfoConfig(this.jsonDeserializer);
        }

        private MorkovskTabbarConfig morkovskTabbarConfig() {
            return new MorkovskTabbarConfig(this.jsonDeserializer);
        }

        private MoshiJsonDeserializer moshiJsonDeserializer() {
            return new MoshiJsonDeserializer(this.moshi);
        }

        private MySettingsHeaderConfig mySettingsHeaderConfig() {
            return new MySettingsHeaderConfig(this.jsonDeserializer);
        }

        private ViewMapper2<? extends InterfaceC6958a, ?, ? extends c>[] namedViewMapper2OfAndAndArray() {
            return UgcCoreWidgetsModule_ProvideSingleReviewMappers$core_prodGoogleAllVendorsReleaseFactory.provideSingleReviewMappers$core_prodGoogleAllVendorsRelease(this.ugcCoreWidgetsModule, new SingleReviewHeaderInfoViewMapper(), new SingleReviewSocialHeaderViewMapper(), new SingleReviewUserInfoViewMapper(), new SingleReviewBadgesListViewMapper(), new SingleReviewBadgeItemsListViewMapper(), new SingleReviewBadgeViewMapper(), new SingleReviewVariantViewMapper(), new SingleReviewViewMapper(), new SingleReviewSingleVideoViewMapper(), new SingleReviewGalleryRowViewMapper(), new SingleReviewMediaListViewMapper(), new SingleReviewAspectViewMapper(), new UserLikesViewMapper(), new ButtonsViewMapper(), new ActionsFooterViewMapper(), new SingleReviewAspectsViewMapper(), new ContextReviewsViewMapper(), new MediaCentricHeaderViewMapper(), new MediaCentricViewMapper(), new TranslateButtonViewMapper(), new OtherReviewButtonViewMapper(), new CommentFooterViewMapper(), new PlainTextViewMapper2(), new ButtonV3ViewMapper(), new SeparatorViewMapper(), new CommonIslandSeparatorViewMapper2(), new BadgeTextViewMapper());
        }

        private NavBarApparelConfig navBarApparelConfig() {
            return new NavBarApparelConfig(this.jsonDeserializer);
        }

        private NavBarButtonConfig navBarButtonConfig() {
            return new NavBarButtonConfig(this.jsonDeserializer);
        }

        private NavBarConfig navBarConfig() {
            return new NavBarConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.storefront.navBar.NavBarConfig navBarConfig2() {
            return new ru.ozon.app.android.storefront.navBar.NavBarConfig(this.jsonDeserializer);
        }

        private NavBarItemConfig navBarItemConfig() {
            return new NavBarItemConfig(this.jsonDeserializer);
        }

        private NavLikezoneCaruselConfig navLikezoneCaruselConfig() {
            return new NavLikezoneCaruselConfig(this.jsonDeserializer);
        }

        private NavSliderV3Parser navSliderV3Parser() {
            return new NavSliderV3Parser(this.moshi);
        }

        private NaviBlocksConfig naviBlocksConfig() {
            return new NaviBlocksConfig(this.jsonDeserializer);
        }

        private NaviCategoriesConfig naviCategoriesConfig() {
            return new NaviCategoriesConfig(this.jsonDeserializer);
        }

        private NaviGrid3Config naviGrid3Config() {
            return new NaviGrid3Config(this.jsonDeserializer);
        }

        private NaviGridConfig naviGridConfig() {
            return new NaviGridConfig(this.jsonDeserializer);
        }

        private NavigationSliderConfig navigationSliderConfig() {
            return new NavigationSliderConfig(this.jsonDeserializer);
        }

        private NavigationSliderV2Config navigationSliderV2Config() {
            return new NavigationSliderV2Config(this.jsonDeserializer);
        }

        private NavigationSliderV3Config navigationSliderV3Config() {
            return new NavigationSliderV3Config(navSliderV3Parser());
        }

        private ru.ozon.app.android.storefront.widgets.navigationSliderV3.core.NavigationSliderV3Config navigationSliderV3Config2() {
            return new ru.ozon.app.android.storefront.widgets.navigationSliderV3.core.NavigationSliderV3Config(this.jsonDeserializer);
        }

        private NewQuestionFormConfig newQuestionFormConfig() {
            return new NewQuestionFormConfig(this.jsonDeserializer);
        }

        private NotificationBarRestrictionConfig notificationBarRestrictionConfig() {
            return new NotificationBarRestrictionConfig(this.jsonDeserializer);
        }

        private NotificationCarouselV2Config notificationCarouselV2Config() {
            return new NotificationCarouselV2Config(this.jsonDeserializer);
        }

        private NotificationInformerConfig notificationInformerConfig() {
            return new NotificationInformerConfig(this.jsonDeserializer);
        }

        private NotificationInformerV2Config notificationInformerV2Config() {
            return new NotificationInformerV2Config(this.jsonDeserializer);
        }

        private NotificationSubscriptionBannerConfig notificationSubscriptionBannerConfig() {
            return new NotificationSubscriptionBannerConfig(this.jsonDeserializer);
        }

        private NotificationsSettingsConfig notificationsSettingsConfig() {
            return new NotificationsSettingsConfig(this.jsonDeserializer);
        }

        private NotificationsSettingsSelectorConfig notificationsSettingsSelectorConfig() {
            return new NotificationsSettingsSelectorConfig(this.jsonDeserializer);
        }

        private NpsRatingConfig npsRatingConfig() {
            return new NpsRatingConfig(this.jsonDeserializer);
        }

        private NutritionInfoV2Config nutritionInfoV2Config() {
            return new NutritionInfoV2Config(this.jsonDeserializer);
        }

        private OfflineFintechBannerConfig offlineFintechBannerConfig() {
            return new OfflineFintechBannerConfig(this.jsonDeserializer);
        }

        private OpenBankAccountConfig openBankAccountConfig() {
            return new OpenBankAccountConfig(this.jsonDeserializer);
        }

        private OrderActionsConfig orderActionsConfig() {
            return new OrderActionsConfig(this.jsonDeserializer);
        }

        private OrderCalculatorConfig orderCalculatorConfig() {
            return new OrderCalculatorConfig(this.jsonDeserializer);
        }

        private OrderDeliveryDetailConfig orderDeliveryDetailConfig() {
            return new OrderDeliveryDetailConfig(this.jsonDeserializer);
        }

        private OrderDeliveryDetailV2Config orderDeliveryDetailV2Config() {
            return new OrderDeliveryDetailV2Config(this.jsonDeserializer);
        }

        private OrderDetailsItemConfig orderDetailsItemConfig() {
            return new OrderDetailsItemConfig(this.jsonDeserializer);
        }

        private OrderDoneButtonBarConfig orderDoneButtonBarConfig() {
            return new OrderDoneButtonBarConfig(this.jsonDeserializer);
        }

        private OrderDoneCrossButtonConfig orderDoneCrossButtonConfig() {
            return new OrderDoneCrossButtonConfig(this.jsonDeserializer);
        }

        private OrderDoneDisclaimerConfig orderDoneDisclaimerConfig() {
            return new OrderDoneDisclaimerConfig(this.jsonDeserializer);
        }

        private OrderDonePaymentStatusConfig orderDonePaymentStatusConfig() {
            return new OrderDonePaymentStatusConfig(this.jsonDeserializer);
        }

        private OrderDoneTotalConfig orderDoneTotalConfig() {
            return new OrderDoneTotalConfig(this.jsonDeserializer);
        }

        private OrderFiltersConfig orderFiltersConfig() {
            return new OrderFiltersConfig(this.jsonDeserializer);
        }

        private OrderFlightInfoConfig orderFlightInfoConfig() {
            return new OrderFlightInfoConfig(this.jsonDeserializer);
        }

        private OrderGalleryConfig orderGalleryConfig() {
            return new OrderGalleryConfig(this.jsonDeserializer);
        }

        private OrderGeoInfoConfig orderGeoInfoConfig() {
            return new OrderGeoInfoConfig(this.jsonDeserializer);
        }

        private OrderHeaderConfig orderHeaderConfig() {
            return new OrderHeaderConfig(this.jsonDeserializer);
        }

        private OrderInfoConfig orderInfoConfig() {
            return new OrderInfoConfig(this.jsonDeserializer);
        }

        private OrderItemsConfig orderItemsConfig() {
            return new OrderItemsConfig(this.jsonDeserializer);
        }

        private OrderListConfig orderListConfig() {
            return new OrderListConfig(this.jsonDeserializer);
        }

        private OrderNavBarConfig orderNavBarConfig() {
            return new OrderNavBarConfig(this.jsonDeserializer);
        }

        private OrderPassengersDetailsConfig orderPassengersDetailsConfig() {
            return new OrderPassengersDetailsConfig(this.jsonDeserializer);
        }

        private OrderPaymentStatusConfig orderPaymentStatusConfig() {
            return new OrderPaymentStatusConfig(this.jsonDeserializer);
        }

        private OrderProductsConfig orderProductsConfig() {
            return new OrderProductsConfig(this.jsonDeserializer);
        }

        private OrderShipmentConfig orderShipmentConfig() {
            return new OrderShipmentConfig(this.jsonDeserializer);
        }

        private OrderStatusConfig orderStatusConfig() {
            return new OrderStatusConfig(this.jsonDeserializer);
        }

        private OrderStatusLiveActivityConfig orderStatusLiveActivityConfig() {
            return new OrderStatusLiveActivityConfig(this.jsonDeserializer);
        }

        private OrderStatusV3Config orderStatusV3Config() {
            return new OrderStatusV3Config(this.jsonDeserializer);
        }

        private OrderTimelineConfig orderTimelineConfig() {
            return new OrderTimelineConfig(this.jsonDeserializer);
        }

        private OrderTotalConfig orderTotalConfig() {
            return new OrderTotalConfig(this.jsonDeserializer);
        }

        private OrderToursChangeFormConfig orderToursChangeFormConfig() {
            return new OrderToursChangeFormConfig(this.jsonDeserializer);
        }

        private OrderTrackShipmentConfig orderTrackShipmentConfig() {
            return new OrderTrackShipmentConfig(this.jsonDeserializer);
        }

        private OrderTrackingConfig orderTrackingConfig() {
            return new OrderTrackingConfig(this.jsonDeserializer);
        }

        private OrderTrackingV4Config orderTrackingV4Config() {
            return new OrderTrackingV4Config(this.jsonDeserializer);
        }

        private OtherSellersConfig otherSellersConfig() {
            return new OtherSellersConfig(this.jsonDeserializer);
        }

        private OutOfStockConfig outOfStockConfig() {
            return new OutOfStockConfig(this.jsonDeserializer);
        }

        private OverlayButtonsConfig overlayButtonsConfig() {
            return new OverlayButtonsConfig(this.jsonDeserializer);
        }

        private OverlayButtonsV2Config overlayButtonsV2Config() {
            return new OverlayButtonsV2Config(this.jsonDeserializer);
        }

        private ParcelPhotoAddConfig parcelPhotoAddConfig() {
            return new ParcelPhotoAddConfig(this.jsonDeserializer);
        }

        private ParticipantPhoneConfig participantPhoneConfig() {
            return new ParticipantPhoneConfig(this.jsonDeserializer);
        }

        private PassengersDirectoryV2Config passengersDirectoryV2Config() {
            return new PassengersDirectoryV2Config(this.jsonDeserializer);
        }

        private PassengersDirectoryV3Config passengersDirectoryV3Config() {
            return new PassengersDirectoryV3Config(this.jsonDeserializer);
        }

        private PassengersLuggageButtonConfig passengersLuggageButtonConfig() {
            return new PassengersLuggageButtonConfig(this.jsonDeserializer);
        }

        private PassengersLuggageSelectionConfig passengersLuggageSelectionConfig() {
            return new PassengersLuggageSelectionConfig(this.jsonDeserializer);
        }

        private PassengersMatcherV2Config passengersMatcherV2Config() {
            return new PassengersMatcherV2Config(this.jsonDeserializer);
        }

        private PaymentDetailsConfig paymentDetailsConfig() {
            return new PaymentDetailsConfig(this.jsonDeserializer);
        }

        private PdpAspectsConfig pdpAspectsConfig() {
            return new PdpAspectsConfig(this.jsonDeserializer);
        }

        private PdpCouponListV2Config pdpCouponListV2Config() {
            return new PdpCouponListV2Config(this.jsonDeserializer);
        }

        private PdpNavTitleConfig pdpNavTitleConfig() {
            return new PdpNavTitleConfig(this.jsonDeserializer);
        }

        private PdpNutritionInfoConfig pdpNutritionInfoConfig() {
            return new PdpNutritionInfoConfig(this.jsonDeserializer);
        }

        private PendingActionConfig pendingActionConfig() {
            return new PendingActionConfig(this.jsonDeserializer);
        }

        private PinnedReviewConfig pinnedReviewConfig() {
            return new PinnedReviewConfig(this.jsonDeserializer);
        }

        private PixelConfig pixelConfig() {
            return new PixelConfig(this.jsonDeserializer);
        }

        private PlainTextConfig plainTextConfig() {
            return new PlainTextConfig(this.jsonDeserializer);
        }

        private PlayStoriesV3Config playStoriesV3Config() {
            return new PlayStoriesV3Config(this.jsonDeserializer);
        }

        private PlayVideoConfig playVideoConfig() {
            return new PlayVideoConfig(this.jsonDeserializer);
        }

        private PreOrderSubscriptionButtonConfig preOrderSubscriptionButtonConfig() {
            return new PreOrderSubscriptionButtonConfig(this.jsonDeserializer);
        }

        private PremiumPointsConfig premiumPointsConfig() {
            return new PremiumPointsConfig(this.jsonDeserializer);
        }

        private PremiumPointsTrainConfigV2 premiumPointsTrainConfigV2() {
            return new PremiumPointsTrainConfigV2(this.jsonDeserializer);
        }

        private PriceActionsConfig priceActionsConfig() {
            return new PriceActionsConfig(this.jsonDeserializer);
        }

        private PriceCalendarFooterConfig priceCalendarFooterConfig() {
            return new PriceCalendarFooterConfig(this.jsonDeserializer);
        }

        private PriceCalendarFooterV3Config priceCalendarFooterV3Config() {
            return new PriceCalendarFooterV3Config(this.jsonDeserializer);
        }

        private PriceCalendarHeaderV3Config priceCalendarHeaderV3Config() {
            return new PriceCalendarHeaderV3Config(this.jsonDeserializer);
        }

        private PriceCellConfig priceCellConfig() {
            return new PriceCellConfig(this.jsonDeserializer);
        }

        private PriceV2Config priceV2Config() {
            return new PriceV2Config(this.jsonDeserializer);
        }

        private PriceV4Config priceV4Config() {
            return new PriceV4Config(this.jsonDeserializer);
        }

        private PricesHistogramConfig pricesHistogramConfig() {
            return new PricesHistogramConfig(this.jsonDeserializer);
        }

        private PricesHistogramV2Config pricesHistogramV2Config() {
            return new PricesHistogramV2Config(this.jsonDeserializer);
        }

        private ProductStarsTileConfig productStarsTileConfig() {
            return new ProductStarsTileConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.bank.widgets.productStarsTile.core.ProductStarsTileConfig productStarsTileConfig2() {
            return new ru.ozon.app.android.bank.widgets.productStarsTile.core.ProductStarsTileConfig(this.jsonDeserializer);
        }

        private ProductVariantConfig productVariantConfig() {
            return new ProductVariantConfig(this.jsonDeserializer);
        }

        private ProductsForReviewConfig productsForReviewConfig() {
            return new ProductsForReviewConfig(this.jsonDeserializer);
        }

        private ProductsInBotConfig productsInBotConfig() {
            return new ProductsInBotConfig(productsInBotParser());
        }

        private ProductsInBotParser productsInBotParser() {
            return new ProductsInBotParser(this.jsonDeserializer);
        }

        private ProductsInBotV2Config productsInBotV2Config() {
            return new ProductsInBotV2Config(this.jsonDeserializer);
        }

        private ProductsPackageConfig productsPackageConfig() {
            return new ProductsPackageConfig(this.jsonDeserializer);
        }

        private ProductsToPayConfig productsToPayConfig() {
            return new ProductsToPayConfig(productsToPayParser());
        }

        private ProductsToPayParser productsToPayParser() {
            return new ProductsToPayParser(this.jsonDeserializer);
        }

        private ProfileAvatarConfig profileAvatarConfig() {
            return new ProfileAvatarConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.cabinet.profileAvatar.core.ProfileAvatarConfig profileAvatarConfig2() {
            return new ru.ozon.app.android.cabinet.profileAvatar.core.ProfileAvatarConfig(this.jsonDeserializer);
        }

        private ProfileCellConfig profileCellConfig() {
            return new ProfileCellConfig(this.jsonDeserializer);
        }

        private ProfileHeaderConfig profileHeaderConfig() {
            return new ProfileHeaderConfig(this.jsonDeserializer);
        }

        private ProfileInputsConfig profileInputsConfig() {
            return new ProfileInputsConfig(this.jsonDeserializer);
        }

        private ProfileTilesConfig profileTilesConfig() {
            return new ProfileTilesConfig(this.jsonDeserializer);
        }

        private ProgressiveTextConfig progressiveTextConfig() {
            return new ProgressiveTextConfig(this.jsonDeserializer);
        }

        private PromoBannerB2BConfig promoBannerB2BConfig() {
            return new PromoBannerB2BConfig(this.jsonDeserializer);
        }

        private PromoCarouselConfig promoCarouselConfig() {
            return new PromoCarouselConfig(promoCarouselWidgetParser());
        }

        private PromoCarouselWidgetParser promoCarouselWidgetParser() {
            return PromoCarouselWidgetModule_ProvideParserFactory.provideParser(this.promoCarouselWidgetModule, this.context, this.moshi, this.jsonDeserializer);
        }

        private PromoCodeApplierConfig promoCodeApplierConfig() {
            return new PromoCodeApplierConfig(this.jsonDeserializer);
        }

        private PromoOfferConfig promoOfferConfig() {
            return new PromoOfferConfig(this.jsonDeserializer);
        }

        private PromoReviewProductsV3Config promoReviewProductsV3Config() {
            return new PromoReviewProductsV3Config(this.jsonDeserializer);
        }

        private PromoStickyBubbleConfig promoStickyBubbleConfig() {
            return new PromoStickyBubbleConfig(this.jsonDeserializer);
        }

        private PromptStatusConfig promptStatusConfig() {
            return new PromptStatusConfig(this.jsonDeserializer);
        }

        private PromptSuggestionsConfig promptSuggestionsConfig() {
            return new PromptSuggestionsConfig(this.jsonDeserializer);
        }

        private Widget2 provideAccessControlWidget() {
            return AccessControlWidgetModule_ProvideAccessControlWidgetFactory.provideAccessControlWidget(accessControlConfig(), new AccessControlViewMapper(), new AccessControlUserViewMapper());
        }

        private Widget2 provideActionCardsWidget$action_cards_prodGoogleAllVendorsRelease() {
            return ActionCardsModule_ProvideActionCardsWidget$action_cards_prodGoogleAllVendorsReleaseFactory.provideActionCardsWidget$action_cards_prodGoogleAllVendorsRelease(this.actionCardsModule, actionCardsConfig(), new ActionCardsViewMapper());
        }

        private Widget2 provideActiveDeliveriesWidget() {
            return ReturnCreationActiveDeliveriesWidgetModule_ProvideActiveDeliveriesWidgetFactory.provideActiveDeliveriesWidget(this.returnCreationActiveDeliveriesWidgetModule, returnCreationActiveDeliveriesConfig(), new ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.header.viewMapper.HeaderViewMapper(), new ElementViewMapper(), new StickyViewMapper(), new CommonIslandSeparatorViewMapper2());
        }

        private Widget2 provideAdvInfo() {
            return AdvInfoDiModule_ProvideAdvInfoFactory.provideAdvInfo(advInfoConfig(), advInfoViewMapper());
        }

        private Widget2 provideAdvRefreshWithDelay() {
            return AdvRefreshWithDelayDiModule_ProvideAdvRefreshWithDelayFactory.provideAdvRefreshWithDelay(advRefreshWithDelayConfig(), new AdvRefreshWithDelayViewMapper());
        }

        private Widget2 provideAdvRefreshWithDelay2() {
            return AdvPageStayDiModule_ProvideAdvRefreshWithDelayFactory.provideAdvRefreshWithDelay(this.advPageStayDiModule, advPageStayConfig(), new AdvPageStayViewMapper());
        }

        private Widget2 provideAnnotationWidget() {
            return CurtainContentWidgetModule_ProvideAnnotationWidgetFactory.provideAnnotationWidget(curtainContentConfig(), new CurtainContentViewMapper());
        }

        private Widget2 provideAnnotationWidget2() {
            return ActionTriggerWidgetModule_ProvideAnnotationWidgetFactory.provideAnnotationWidget(actionTriggerConfig(), new ActionTriggerViewMapper());
        }

        private Set<i> provideAppOnboarding$storefront_prodGoogleAllVendorsRelease() {
            return AppOnboardingWidgetModule_ProvideAppOnboarding$storefront_prodGoogleAllVendorsReleaseFactory.provideAppOnboarding$storefront_prodGoogleAllVendorsRelease(this.appOnboardingWidgetModule, this.jsonDeserializer);
        }

        private Widget2 provideApplyWishlistWidget() {
            return ApplyWishlistModule_ProvideApplyWishlistWidgetFactory.provideApplyWishlistWidget(applyWishlistConfig(), new ApplyWishlistViewMapper());
        }

        private Set<Widget2> provideAsyncWidget() {
            return AsyncWidgetModule_ProvideAsyncWidgetFactory.provideAsyncWidget(this.asyncWidgetModule, asyncConfig(), new AsyncViewMapper());
        }

        private Widget2 provideBigPromoWidget() {
            return BigPromoNavbarWidgetModule_ProvideBigPromoWidgetFactory.provideBigPromoWidget(bigPromoNavbarConfig(), new BigPromoNavbarViewMapper());
        }

        private Widget2 provideBigPromoWidget2() {
            return BigPromoPDPWidgetModule_ProvideBigPromoWidgetFactory.provideBigPromoWidget(bigPromoPDPConfig(), new BigPromoPDPViewMapper());
        }

        private Widget2 provideBigPromoWidget3() {
            return BigPromoCheckoutWidgetModule_ProvideBigPromoWidgetFactory.provideBigPromoWidget(this.bigPromoCheckoutWidgetModule, bigPromoCheckoutConfig(), new BigPromoCheckoutViewMapper());
        }

        private Set<i> provideBloggerLanding$storefront_prodGoogleAllVendorsRelease() {
            return BloggerLandingModule_ProvideBloggerLanding$storefront_prodGoogleAllVendorsReleaseFactory.provideBloggerLanding$storefront_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Widget2 provideBoxListWidget() {
            return BoxListWidgetModule_ProvideBoxListWidgetFactory.provideBoxListWidget(boxListConfig(), new BoxListViewMapper(), new SelectButtonViewMapper());
        }

        private Widget2 provideButtonStackWidget() {
            return ButtonStackWidgetModule_ProvideButtonStackWidgetFactory.provideButtonStackWidget(buttonStackConfig(), new ButtonStackViewMapper(), new OverlayStickyBannerViewMapper());
        }

        private Widget2 provideButtonWidget$button_widget_prodGoogleAllVendorsRelease() {
            return ButtonWidgetV2Module_ProvideButtonWidget$button_widget_prodGoogleAllVendorsReleaseFactory.provideButtonWidget$button_widget_prodGoogleAllVendorsRelease(buttonConfig(), new ButtonViewMapper(), new ButtonV2ViewMapper(), new ButtonV3ViewMapper(), new ButtonViewStickyNoUIMapper(), new ButtonViewV3StickyNoUIMapper());
        }

        private Widget2 provideCancelPostingsV2$cancels_prodGoogleAllVendorsRelease() {
            return CancelPostingsV2Module_Companion_ProvideCancelPostingsV2$cancels_prodGoogleAllVendorsReleaseFactory.provideCancelPostingsV2$cancels_prodGoogleAllVendorsRelease(cancelPostingsV2Config2(), new CancelPostingsV2AnnotationViewMapper(), new CancelPostingsV2SelectAllViewMapper(), new CancelPostingsV2ShipmentViewMapper(), new CancelPostingsV2MonopostingViewMapper(), new CancelPostingsV2PostingViewMapper(), new CancelPostingsV2ButtonViewMapper());
        }

        private Widget2 provideCancelPostingsV2$cs_orders_prodGoogleAllVendorsRelease() {
            return CancelPostingsV2Module_Companion_ProvideCancelPostingsV2$cs_orders_prodGoogleAllVendorsReleaseFactory.provideCancelPostingsV2$cs_orders_prodGoogleAllVendorsRelease(cancelPostingsV2Config(), new ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.annotation.CancelPostingsV2AnnotationViewMapper(), new ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.selectall.CancelPostingsV2SelectAllViewMapper(), new ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.shipment.CancelPostingsV2ShipmentViewMapper(), new ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewMapper(), new ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.posting.CancelPostingsV2PostingViewMapper(), new ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button.CancelPostingsV2ButtonViewMapper());
        }

        private Widget2 provideCartButtonWithTooltipWidget() {
            return CartButtonWithTooltipModule_ProvideCartButtonWithTooltipWidgetFactory.provideCartButtonWithTooltipWidget(cartButtonWithTooltipConfig(), new CartButtonWithTooltipViewMapper());
        }

        private Set<Widget2> provideCartSplitV2Widget() {
            return CartSplitV2Module_ProvideCartSplitV2WidgetFactory.provideCartSplitV2Widget(this.cartSplitV2Module, cartSplitV2Config(), new CartSplitV2ItemViewMapper(), new CartSplitV2TitleViewMapper());
        }

        private Set<Widget2> provideCartSplitV2Widget2() {
            return CartSplitV2ModuleV2_ProvideCartSplitV2WidgetFactory.provideCartSplitV2Widget(this.cartSplitV2ModuleV2, cartSplitV2SubWidgetsConfig(), new CartSplitV2HeaderViewMapper(), new CartSplitV2ProductViewMapper(), new CartSplitV2ControlsViewMapper(), new CartSplitV2AccessoriesViewMapper(), new CommonIslandSeparatorViewMapper2(), new SeparatorViewMapper(), new CartSplitV2CellItemViewMapper());
        }

        private Widget2 provideCategoryLogosWidget() {
            return CategoryLogosDiModule_ProvideCategoryLogosWidgetFactory.provideCategoryLogosWidget(categoryLogosWidgetConfig(), new CategoryLogosViewMapper());
        }

        private Widget2 provideCategoryMenuWidget() {
            return CategoryMenuDiModule_ProvideCategoryMenuWidgetFactory.provideCategoryMenuWidget(categoryMenuConfig(), new CategoryMenuItemViewMapper(), new CategoryMenuButtonOverlayViewMapper());
        }

        private Widget2 provideCmlCellListWidget() {
            return CmlCellListModule_ProvideCmlCellListWidgetFactory.provideCmlCellListWidget(cmlCellListConfig(), new ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.header.viewMapper.HeaderViewMapper(), new CellListViewMapper(), new ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewMapper.ButtonsViewMapper(), new CommonIslandSeparatorViewMapper2(), new SeparatorViewMapper());
        }

        private Set<Widget2> provideCommonTeeth$cs_orders_prodGoogleAllVendorsRelease() {
            return OrdersCommonModule_ProvideCommonTeeth$cs_orders_prodGoogleAllVendorsReleaseFactory.provideCommonTeeth$cs_orders_prodGoogleAllVendorsRelease(this.ordersCommonModule, internalTeethConfig(), new InternalTeethViewMapper());
        }

        private Set<i> provideComposeWidgetSet$chat_prodGoogleAllVendorsRelease() {
            return FreshChatWidgetsModule_ProvideComposeWidgetSet$chat_prodGoogleAllVendorsReleaseFactory.provideComposeWidgetSet$chat_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgetSet$widgets_cart_prodGoogleAllVendorsRelease() {
            return FreshCartWidgetsModule_ProvideComposeWidgetSet$widgets_cart_prodGoogleAllVendorsReleaseFactory.provideComposeWidgetSet$widgets_cart_prodGoogleAllVendorsRelease(this.freshCartWidgetsModule, this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgetSet$widgets_unsorted_prodGoogleAllVendorsRelease() {
            return FreshUnsortedWidgetsModule_ProvideComposeWidgetSet$widgets_unsorted_prodGoogleAllVendorsReleaseFactory.provideComposeWidgetSet$widgets_unsorted_prodGoogleAllVendorsRelease(this.freshUnsortedWidgetsModule, this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets() {
            return CSOrderDetailsWidgets2Module_ProvideComposeWidgetsFactory.provideComposeWidgets(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$avia_prodGoogleAllVendorsRelease() {
            return TravelAviaWidgetV2Module_Companion_ProvideComposeWidgets$avia_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$avia_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$b2b_prodGoogleAllVendorsRelease() {
            return B2bComposeWidgetsFactoryModule_ProvideComposeWidgets$b2b_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$b2b_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$b2b_prodGoogleAllVendorsRelease2() {
            return TravelB2BWidgetFactoryModule_ProvideComposeWidgets$b2b_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$b2b_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$checkout_prodGoogleAllVendorsRelease() {
            return CheckoutWidget2Module_ProvideComposeWidgets$checkout_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$checkout_prodGoogleAllVendorsRelease(this.checkoutWidget2Module, this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$cms_prodGoogleAllVendorsRelease() {
            return CmsWidgetsV2DiModule_ProvideComposeWidgets$cms_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$cms_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$common_prodGoogleAllVendorsRelease() {
            return TravelGeneralWidgetFactoryModule_ProvideComposeWidgets$common_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$common_prodGoogleAllVendorsRelease(this.travelGeneralWidgetFactoryModule, this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$core_prodGoogleAllVendorsRelease() {
            return UgcCoreWidgetsModule_ProvideComposeWidgets$core_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$core_prodGoogleAllVendorsRelease(this.ugcCoreWidgetsModule, new CellListV2ViewMapper(), this.jsonDeserializer, new SeparatorViewMapper(), new CommonIslandSeparatorViewMapper2(), new PlainTextViewMapper2(), new ButtonV3ViewMapper());
        }

        private Set<i> provideComposeWidgets$cs_orders_prodGoogleAllVendorsRelease() {
            return OrdersCommonModule_ProvideComposeWidgets$cs_orders_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$cs_orders_prodGoogleAllVendorsRelease(this.ordersCommonModule, this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$main_prodGoogleAllVendorsRelease() {
            return TravelGeneralMainWidgetV2Module_Companion_ProvideComposeWidgets$main_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$main_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$marketing_prodGoogleAllVendorsRelease() {
            return MarketingWidgets2Module_ProvideComposeWidgets$marketing_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$marketing_prodGoogleAllVendorsRelease(this.marketingWidgets2Module, this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$monetization_prodGoogleAllVendorsRelease() {
            return MonetizationWidgetsModule_ProvideComposeWidgets$monetization_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$monetization_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$notifications_prodGoogleAllVendorsRelease() {
            return NotificationWidgetModule_ProvideComposeWidgets$notifications_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$notifications_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$order_prodGoogleAllVendorsRelease() {
            return TravelGeneralOrderWidgetV2Module_Companion_ProvideComposeWidgets$order_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$order_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$pdp_prodGoogleAllVendorsRelease() {
            return PdpWidgetsModule_ProvideComposeWidgets$pdp_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$pdp_prodGoogleAllVendorsRelease(this.pdpWidgetsModule, this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$railway_prodGoogleAllVendorsRelease() {
            return TravelRailwayWidgetV2Module_Companion_ProvideComposeWidgets$railway_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$railway_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$regulardraw_prodGoogleAllVendorsRelease() {
            return RegularDrawWidgetsModule_ProvideComposeWidgets$regulardraw_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$regulardraw_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$search_prodGoogleAllVendorsRelease() {
            return SearchWidgetV2DiModule_ProvideComposeWidgets$search_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$search_prodGoogleAllVendorsRelease(this.searchWidgetV2DiModule, this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$session_prodGoogleAllVendorsRelease() {
            return UserAdultConfirmationModuleV2_Companion_ProvideComposeWidgets$session_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$session_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$tours_prodGoogleAllVendorsRelease() {
            return TravelToursWidgetV2Module_Companion_ProvideComposeWidgets$tours_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$tours_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$ugc_prodGoogleAllVendorsRelease() {
            return UgcWidgetsModule_ProvideComposeWidgets$ugc_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$ugc_prodGoogleAllVendorsRelease(this.ugcWidgetsModule, new SeparatorViewMapper(), new CommonIslandSeparatorViewMapper2(), new PlainTextViewMapper2(), this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$widgets_prodGoogleAllVendorsRelease() {
            return CommonWidgetsV2DiModule_ProvideComposeWidgets$widgets_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$widgets_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets$widgets_prodGoogleAllVendorsRelease2() {
            return CommonWidgetsV2Module_ProvideComposeWidgets$widgets_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$widgets_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets2() {
            return FinanceWidgetV2Module_ProvideComposeWidgetsFactory.provideComposeWidgets(this.financeWidgetV2Module, this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets3() {
            return CartWidget2Module_ProvideComposeWidgetsFactory.provideComposeWidgets(this.cartWidget2Module, this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets4() {
            return OrderDoneWidgets2Module_ProvideComposeWidgetsFactory.provideComposeWidgets(this.orderDoneWidgets2Module, this.jsonDeserializer);
        }

        private Set<i> provideComposeWidgets5() {
            return ReturnCreationWidgetsModule_ProvideComposeWidgetsFactory.provideComposeWidgets(this.returnCreationWidgetsModule, this.jsonDeserializer);
        }

        private Widget2 provideControlsWidget() {
            return ControlsModule_ProvideControlsWidgetFactory.provideControlsWidget(this.controlsModule, controlsConfig(), new ControlsViewMapper());
        }

        private Widget2 provideControlsWidget2() {
            return ControlsV3Module_ProvideControlsWidgetFactory.provideControlsWidget(this.controlsV3Module, controlsV3Config(), new ControlsV3ViewMapper());
        }

        private Widget2 provideCreateShoppingListWidget() {
            return CreateShoppingListModule_ProvideCreateShoppingListWidgetFactory.provideCreateShoppingListWidget(createShoppingListConfig(), new CreateShoppingListTitleViewMapper(), new CreateShoppingListSuggestTitleViewMapper(), new CreateShoppingListSuggestItemViewMapper(), new CreateShoppingListSpacerViewMapper(), new CreateShoppingListSaveButtonViewMapper());
        }

        private Widget2 provideDeliveryReviewFormWidget() {
            return DeliveryReviewFormWidget2Module_ProvideDeliveryReviewFormWidgetFactory.provideDeliveryReviewFormWidget(this.deliveryReviewFormWidget2Module, deliveryReviewFormConfig(), new DeliveryReviewFormHeaderViewMapper(), new DeliveryReviewFormItemViewMapper(), new DeliveryReviewFormFooterViewMapper());
        }

        private Widget2 provideDeliveryReviewHeaderWidget$deliveryreview_prodGoogleAllVendorsRelease() {
            return DeliveryReviewHeaderModule_ProvideDeliveryReviewHeaderWidget$deliveryreview_prodGoogleAllVendorsReleaseFactory.provideDeliveryReviewHeaderWidget$deliveryreview_prodGoogleAllVendorsRelease(this.deliveryReviewHeaderModule, deliveryReviewHeaderConfig(), new DeliveryReviewHeaderViewMapper());
        }

        private Widget2 provideDeliveryReviewSuccessWidget$deliveryreview_prodGoogleAllVendorsRelease() {
            return DeliveryReviewSuccessModule_ProvideDeliveryReviewSuccessWidget$deliveryreview_prodGoogleAllVendorsReleaseFactory.provideDeliveryReviewSuccessWidget$deliveryreview_prodGoogleAllVendorsRelease(this.deliveryReviewSuccessModule, deliveryReviewSuccessConfig(), new DeliveryReviewSuccessViewMapper());
        }

        private Set<Widget2> provideEmptyCartV2() {
            return EmptyCartV2Module_ProvideEmptyCartV2Factory.provideEmptyCartV2(this.emptyCartV2Module, emptyCartV2Config(), new EmptyCartV2ViewMapper());
        }

        private Widget2 provideExpandableCellsWidget3() {
            return ExpandableCellsModule_ProvideExpandableCellsWidget3Factory.provideExpandableCellsWidget3(expandableCellsConfig(), new ExpandableCellViewMapper(), new TileGrid2SkeletonViewMapper(), new TileScrollSkeletonViewMapper());
        }

        private Widget2 provideExternalVerificationHandlerMobileWidget$session_prodGoogleAllVendorsRelease() {
            return EditCredentialsWidgetsModule_ProvideExternalVerificationHandlerMobileWidget$session_prodGoogleAllVendorsReleaseFactory.provideExternalVerificationHandlerMobileWidget$session_prodGoogleAllVendorsRelease(this.editCredentialsWidgetsModule, externalVerificationHandlerMobileConfig(), new ExternalVerificationHandlerMobileViewMapperNoUi());
        }

        private Widget2 provideFamilyProfileAvatarWidget() {
            return FamilyProfileAvatarModule_ProvideFamilyProfileAvatarWidgetFactory.provideFamilyProfileAvatarWidget(familyProfileAvatarConfig(), new FamilyProfileAvatarViewMapper());
        }

        private Widget2 provideFavoriteProductV2Widget() {
            return FavoriteProductV2WidgetModule_ProvideFavoriteProductV2WidgetFactory.provideFavoriteProductV2Widget(this.favoriteProductV2WidgetModule, favoriteProductV2Config(), new FavoriteProductV2WidgetViewMapper());
        }

        private Widget2 provideFeedbackFormWidget() {
            return FeedbackFormModule_ProvideFeedbackFormWidgetFactory.provideFeedbackFormWidget(feedbackFormConfig(), new FeedbackCellViewMapper(), new FeedbackInputViewMapper(), new FeedbackSpacerViewMapper(), new FeedbackSendButtonViewMapper());
        }

        private Widget2 provideFeedbackFormWidget2() {
            return FeedbackFormV2Module_ProvideFeedbackFormWidgetFactory.provideFeedbackFormWidget(feedbackFormV2Config(), new FeedbackCellV2ViewMapper(), new FeedbackInputV2ViewMapper(), new FeedbackSpacerV2ViewMapper(), new FeedbackSendButtonV2ViewMapper());
        }

        private Widget2 provideFeedbackTileWidget() {
            return FeedbackTileModule_ProvideFeedbackTileWidgetFactory.provideFeedbackTileWidget(feedbackTileConfig(), new FeedbackTileViewMapper());
        }

        private Widget2 provideFeedbackTileWidget2() {
            return AiHelperModule_ProvideFeedbackTileWidgetFactory.provideFeedbackTileWidget(aiHelperConfig(), new AiHelperViewMapper());
        }

        private Widget2 provideFiltersWidget$filter_widgets_prodGoogleAllVendorsRelease() {
            return FiltersWidgetV2Module_ProvideFiltersWidget$filter_widgets_prodGoogleAllVendorsReleaseFactory.provideFiltersWidget$filter_widgets_prodGoogleAllVendorsRelease(filtersConfig2(), new BoolFilterViewMapper(), new FilterButtonViewMapper(), new BrandBottomViewMapper(), new BrandCellViewMapper(), new BrandTitleViewMapper(), new CategoryFooterViewMapper(), new CategoryItemViewMapper(), new CircleColorFilterViewMapper(), new SquareColorFilterViewMapper(), new CommonSeparatorViewMapper(), new DisclosureViewMapper(), new ru.ozon.app.android.common.filterWidgets.filters.presentation.header.HeaderViewMapper(), new MultipleRangesViewMapper(), new FilterNavBarViewMapper(), new OpenRangeFilterViewMapper(), new RangeFilterViewMapper(), new TagFilterViewMapper(), new TextInputFilterViewMapper(), new TimeRangeFilterViewMapper(), new AspectsColorFilterViewMapper(), new BrandAspectsViewMapper(), new FiltersIslandSeparatorViewMapper());
        }

        private Widget2 provideFiltersWidget$filter_widgets_prodGoogleAllVendorsRelease2() {
            return FilterValuesModule_ProvideFiltersWidget$filter_widgets_prodGoogleAllVendorsReleaseFactory.provideFiltersWidget$filter_widgets_prodGoogleAllVendorsRelease(filterValuesConfig(), new FilterValuesNoUiViewMapper(), new FilterNavBarViewMapper());
        }

        private Widget2 provideFinanceHeader$storefront_prodGoogleAllVendorsRelease() {
            return FinanceHeaderModule_ProvideFinanceHeader$storefront_prodGoogleAllVendorsReleaseFactory.provideFinanceHeader$storefront_prodGoogleAllVendorsRelease(financeHeaderConfig(), new FinanceHeaderViewMapper());
        }

        private Widget2 provideHammersWidget() {
            return HammersV3WidgetModule_ProvideHammersWidgetFactory.provideHammersWidget(hammersV3Config(), new HammersV3HeaderViewMapper(), new HammersV3BodyViewMapper(), new OldHammersV3BodyViewMapper(), new HammersV3GradientHeaderViewMapper());
        }

        private Widget2 provideHelpCert() {
            return HelpCertModule_ProvideHelpCertFactory.provideHelpCert(helpCertConfig(), new HelpCertViewMapper());
        }

        private Set<i> provideHideTabBarOnScrollWidget$tabbar_prodGoogleAllVendorsRelease() {
            return HideTabbarOnScrollWidgetModule_ProvideHideTabBarOnScrollWidget$tabbar_prodGoogleAllVendorsReleaseFactory.provideHideTabBarOnScrollWidget$tabbar_prodGoogleAllVendorsRelease(this.hideTabBarOnScrollConfigProvider, this.hideTabBarOnScrollViewMapperProvider);
        }

        private Widget2 provideHistoryWidget() {
            return HistoryModule_ProvideHistoryWidgetFactory.provideHistoryWidget(historyConfig(), new HistoryViewMapper());
        }

        private i provideIconButtonWidget$storefront_prodGoogleAllVendorsRelease() {
            return ProfileIconButtonWidgetModule_ProvideIconButtonWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideIconButtonWidget$storefront_prodGoogleAllVendorsRelease(this.profileIconButtonWidgetModule, this.jsonDeserializer);
        }

        private Widget2 provideInputWidget() {
            return InputWidgetModule_ProvideInputWidgetFactory.provideInputWidget(inputWidgetConfig(), new InputWidgetViewMapper());
        }

        private Widget2 provideInputWidget2() {
            return InputCurtainModule_ProvideInputWidgetFactory.provideInputWidget(inputCurtainConfig(), new InputCurtainViewMapper());
        }

        private Set<Widget2> provideIslandSeparatorWidget() {
            return IslandSeparatorWidgetModule_ProvideIslandSeparatorWidgetFactory.provideIslandSeparatorWidget(this.islandSeparatorWidgetModule2, islandSeparatorConfig2(), new CommonIslandSeparatorViewMapper2(), new OverlayIslandSeparatorViewMapper(), new StickyIslandSeparatorViewMapper());
        }

        private Set<Widget2> provideMarketingDetailWidget() {
            return CartWidget2Module_ProvideMarketingDetailWidgetFactory.provideMarketingDetailWidget(this.cartWidget2Module, marketingDetailWidgetConfig(), new MarketingDetailWidgetViewMapper());
        }

        private Set<Widget2> provideMasterWidget() {
            return MasterWidgetModule_ProvideMasterWidgetFactory.provideMasterWidget(this.masterWidgetModule, masterConfig(), new MasterViewMapper(), new EmptyOverlayViewMapper(), this.featureChecker);
        }

        private Widget2 provideMegaRaffleWidget$storefront_prodGoogleAllVendorsRelease() {
            return ActionProgressModule_ProvideMegaRaffleWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideMegaRaffleWidget$storefront_prodGoogleAllVendorsRelease(actionProgressConfig2(), new ActionProgressViewMapper());
        }

        private Widget2 provideMiniappHeaderWidget$storefront_prodGoogleAllVendorsRelease() {
            return MiniappHeaderModule_ProvideMiniappHeaderWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideMiniappHeaderWidget$storefront_prodGoogleAllVendorsRelease(miniappHeaderConfig(), new MiniappHeaderViewMapper());
        }

        private Widget2 provideMiniappHeaderWidget$storefront_prodGoogleAllVendorsRelease2() {
            return InAppPushModule_ProvideMiniappHeaderWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideMiniappHeaderWidget$storefront_prodGoogleAllVendorsRelease(inAppPushConfig(), new InAppPushViewMapper());
        }

        private Widget2 provideModalButtonWidget() {
            return ModalButtonDiModule_ProvideModalButtonWidgetFactory.provideModalButtonWidget(modalButtonConfig(), new ModalButtonViewMapper(), new ModalButtonBurgerViewMapper());
        }

        private Set<Widget2> provideMonetizationWidgets$monetization_prodGoogleAllVendorsRelease() {
            return MonetizationWidgetsModule_ProvideMonetizationWidgets$monetization_prodGoogleAllVendorsReleaseFactory.provideMonetizationWidgets$monetization_prodGoogleAllVendorsRelease(inputSubmitConfig(), new InputSubmitViewMapper(), unreadMessageIndicatorConfig(), new UnreadMessageIndicatorViewMapper());
        }

        private Widget2 provideNavBarApparelWidget$storefront_prodGoogleAllVendorsRelease() {
            return NavBarApparelDiModule_ProvideNavBarApparelWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideNavBarApparelWidget$storefront_prodGoogleAllVendorsRelease(navBarApparelConfig(), new NavBarApparelViewMapper());
        }

        private Set<i> provideNaviBlocksWidgetFactory() {
            return NaviBlocksV3Module_ProvideNaviBlocksWidgetFactoryFactory.provideNaviBlocksWidgetFactory(this.naviBlocksV3Module, this.jsonDeserializer);
        }

        private Set<i> provideNaviBlocksWidgetFactory2() {
            return NaviBlocksV5Module_ProvideNaviBlocksWidgetFactoryFactory.provideNaviBlocksWidgetFactory(this.naviBlocksV5Module, this.jsonDeserializer);
        }

        private Widget2 provideNotificationBarRestrictionWidget$orderdetails_prodGoogleAllVendorsRelease() {
            return CSOrderDetailsWidgets2Module_ProvideNotificationBarRestrictionWidget$orderdetails_prodGoogleAllVendorsReleaseFactory.provideNotificationBarRestrictionWidget$orderdetails_prodGoogleAllVendorsRelease(notificationBarRestrictionConfig(), new NotificationBarRestrictionViewMapper());
        }

        private Set<Widget2> provideOfflineFintechBanner$cs_orders_prodGoogleAllVendorsRelease() {
            return OrdersCommonModule_ProvideOfflineFintechBanner$cs_orders_prodGoogleAllVendorsReleaseFactory.provideOfflineFintechBanner$cs_orders_prodGoogleAllVendorsRelease(this.ordersCommonModule, offlineFintechBannerConfig(), new OfflineFintechBannerViewMapper());
        }

        private Widget2 provideOrderCalculatorWidget() {
            return OrderCalculatorModule_ProvideOrderCalculatorWidgetFactory.provideOrderCalculatorWidget(orderCalculatorConfig(), new OrderCalculatorViewMapper());
        }

        private Widget2 provideOrderGeoInfoWidget() {
            return OrderGeoInfoModule_ProvideOrderGeoInfoWidgetFactory.provideOrderGeoInfoWidget(orderGeoInfoConfig(), new OrderGeoInfoViewMapper());
        }

        private Widget2 provideOrderStatusWidget$orderdetails_prodGoogleAllVendorsRelease() {
            return OrderStatusModule_ProvideOrderStatusWidget$orderdetails_prodGoogleAllVendorsReleaseFactory.provideOrderStatusWidget$orderdetails_prodGoogleAllVendorsRelease(this.orderStatusModule, orderStatusConfig(), new OrderStatusViewMapper());
        }

        private Set<Widget2> provideOzonBankWidgets$ozonbank_prodGoogleAllVendorsRelease() {
            return OzonBankWidgetModule_ProvideOzonBankWidgets$ozonbank_prodGoogleAllVendorsReleaseFactory.provideOzonBankWidgets$ozonbank_prodGoogleAllVendorsRelease(openBankAccountConfig(), new OpenBankAccountViewMapper(), bankAccountStatusConfig(), new BankAccountStatusViewMapper(), premiumPointsConfig(), new PremiumPointsViewMapper(), starPointsConfig(), new StarPointsViewMapper(), installmentPaymentConfig(), new InstallmentPaymentViewMapper(), aboutInstallmentConfig(), new AboutInstallmentViewMapper(), new ProductStarsTileViewMapper(), productStarsTileConfig2(), installmentPaymentScheduleConfig(), new InstallmentPaymentScheduleViewMapper(), cbottomWidgetConfig(), new CbottomWidgetViewMapper(), adBannerConfig(), new AdBannerViewMapper());
        }

        private Widget2 provideParcelPhotoAddWidget() {
            return ParcelPhotoAddModule_ProvideParcelPhotoAddWidgetFactory.provideParcelPhotoAddWidget(parcelPhotoAddConfig(), new ParcelPhotoAddViewMapper());
        }

        private Widget2 provideParticipantPhoneWidget() {
            return ParticipantPhoneModule_ProvideParticipantPhoneWidgetFactory.provideParticipantPhoneWidget(participantPhoneConfig(), new ParticipantPhoneViewMapper());
        }

        private Widget2 providePaymentInfoV2Widget() {
            return FreshPaymentInfoWidgetModule_ProvidePaymentInfoV2WidgetFactory.providePaymentInfoV2Widget(freshPaymentInfoConfig(), new FreshPaymentInfoViewMapper());
        }

        private Widget2 providePixelWidget() {
            return PixelModule_ProvidePixelWidgetFactory.providePixelWidget(this.pixelModule, pixelConfig(), new PixelViewMapper());
        }

        private Widget2 provideProductsToPay$orderdetails_prodGoogleAllVendorsRelease() {
            return ProductsToPayModule_Companion_ProvideProductsToPay$orderdetails_prodGoogleAllVendorsReleaseFactory.provideProductsToPay$orderdetails_prodGoogleAllVendorsRelease(productsToPayConfig(), new ProductsToPayViewMapper(), new ProductsToPayCellViewMapper(), new HorizontalScrollImagesViewMapper(), new ru.ozon.app.android.orderdetails.productsToPay.presentation.separator.viewMapper.SeparatorViewMapper());
        }

        private Widget2 provideProfileCellWidget() {
            return ProfileCellWidgetModule_ProvideProfileCellWidgetFactory.provideProfileCellWidget(profileCellConfig(), new ProfileCellViewMapper());
        }

        private Widget2 provideProgressiveTextWidget$progressive_molecula_prodGoogleAllVendorsRelease() {
            return ProgressiveTextModule_ProvideProgressiveTextWidget$progressive_molecula_prodGoogleAllVendorsReleaseFactory.provideProgressiveTextWidget$progressive_molecula_prodGoogleAllVendorsRelease(this.progressiveTextModule, progressiveTextConfig(), new ProgressiveTextViewMapper(), new ProgressiveTextOverlayViewMapper());
        }

        private Set<i> providePromoPlacementWidgetFactory() {
            return PromoPlacementModule_ProvidePromoPlacementWidgetFactoryFactory.providePromoPlacementWidgetFactory(this.promoPlacementModule, this.jsonDeserializer);
        }

        private Set<i> provideRateAppComposeWidget$storefront_prodGoogleAllVendorsRelease() {
            return RateAppDiModule_ProvideRateAppComposeWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideRateAppComposeWidget$storefront_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Widget2 provideRegionSearchWidget() {
            return RegionSearchModule_ProvideRegionSearchWidgetFactory.provideRegionSearchWidget(regionSearchConfig(), new RegionSearchViewMapper());
        }

        private Set<Widget2> provideRegularDrawWidgets$regulardraw_prodGoogleAllVendorsRelease() {
            return RegularDrawWidgetsModule_ProvideRegularDrawWidgets$regulardraw_prodGoogleAllVendorsReleaseFactory.provideRegularDrawWidgets$regulardraw_prodGoogleAllVendorsRelease(morkovskBackgroundImageConfig(), new MorkovskBackgroundImageViewMapper(), morkovskNavBarConfig(), new MorkovskNavBarViewMapper(), mainDrawMajorScreenConfig(), new MainDrawMajorScreenViewMapper(), morkovskTabbarConfig(), new MorkovskTabbarViewMapper(), entryBannerWidgetConfig(), new EntryBannerWidgetSingleViewMapper(), new EntryBannerWidgetMultiViewMapper(), welcomeScreenConfig(), new WelcomeScreenViewMapper(), morkovskOnboardingInfoConfig(), new MorkovskOnboardingInfoViewMapper(), warningTooltipConfig(), new WarningTooltipViewMapper());
        }

        private Widget2 provideScrollAnchorWidget$storefront_prodGoogleAllVendorsRelease() {
            return ScrollAnchorDiModule_ProvideScrollAnchorWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideScrollAnchorWidget$storefront_prodGoogleAllVendorsRelease(scrollAnchorConfig2(), new ScrollAnchorViewMapper());
        }

        private Widget2 provideScrollAnchorWidget$storefront_prodGoogleAllVendorsRelease2() {
            return StickyScrollModule_ProvideScrollAnchorWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideScrollAnchorWidget$storefront_prodGoogleAllVendorsRelease(stickyScrollConfig(), new StickyScrollViewMapper());
        }

        private Widget2 provideScrollAnchorWidget$storefront_prodGoogleAllVendorsRelease3() {
            return StickyCartModule_ProvideScrollAnchorWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideScrollAnchorWidget$storefront_prodGoogleAllVendorsRelease(stickyCartConfig(), new StickyCartViewMapper());
        }

        private Widget2 provideSearchBarMobileWidget() {
            return SearchBarMobileModule_ProvideSearchBarMobileWidgetFactory.provideSearchBarMobileWidget(searchBarConfig(), new SearchBarViewMapper(), new ActiveSearchBarViewMapper());
        }

        private Widget2 provideSearchBarMobileWidget2() {
            return DialogSearchBarModule_ProvideSearchBarMobileWidgetFactory.provideSearchBarMobileWidget(dialogSearchBarConfig(), new DialogSearchBarViewMapper());
        }

        private Widget2 provideSearchBarWidget() {
            return SearchBarModule_ProvideSearchBarWidgetFactory.provideSearchBarWidget(searchBarConfig3(), new ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation.SearchBarViewMapper());
        }

        private Widget2 provideSearchHistoryWidget() {
            return SearchHistoryModule_ProvideSearchHistoryWidgetFactory.provideSearchHistoryWidget(searchHistoryConfig(), new SearchHistoryViewMapper(), new SearchHistoryTitleViewMapper());
        }

        private Widget2 provideSearchOnboardingWidget() {
            return SearchOnboardingModule_ProvideSearchOnboardingWidgetFactory.provideSearchOnboardingWidget(searchOnboardingConfig(), new SearchOnboardingViewMapper());
        }

        private Widget2 provideSearchRequestWidget() {
            return SearchRequestDiModule_ProvideSearchRequestWidgetFactory.provideSearchRequestWidget(searchRequestConfig(), new SearchRequestViewMapper());
        }

        private Widget2 provideSearchResultErrorWidget() {
            return SearchResultErrorDiModule_ProvideSearchResultErrorWidgetFactory.provideSearchResultErrorWidget(searchResultErrorConfig(), new SearchResultErrorViewMapper());
        }

        private Widget2 provideSearchResultsGrid() {
            return SearchResultsV2Module_ProvideSearchResultsGridFactory.provideSearchResultsGrid(searchResultsGridConfig(), new SearchResultsGridViewMapper(), new SearchResultsSeparatorMapper());
        }

        private Set<Widget2> provideSearchSuggestionsWidget() {
            return SearchSuggestionsModule_ProvideSearchSuggestionsWidgetFactory.provideSearchSuggestionsWidget(suggestionConfig(), new SuggestionsViewMapper(), new SuggestionTitleViewMapper());
        }

        private Widget2 provideSecureDealCurtainWidget() {
            return SecureDealCurtainModule_ProvideSecureDealCurtainWidgetFactory.provideSecureDealCurtainWidget(secureDealCurtainConfig(), new SecureDealDataViewMapper(), new SecureDealButtonsViewMapper());
        }

        private Widget2 provideSecureDealWidget() {
            return SecureDealModule_ProvideSecureDealWidgetFactory.provideSecureDealWidget(secureDealConfig(), new SecureDealViewMapper());
        }

        private Widget2 provideSelectCategoryWidget() {
            return SelectCategoryModule_ProvideSelectCategoryWidgetFactory.provideSelectCategoryWidget(selectCategoryConfig(), new SelectCategoryViewMapper());
        }

        private Widget2 provideSeparatorWidget() {
            return SeparatorModule_ProvideSeparatorWidgetFactory.provideSeparatorWidget(separatorConfig(), new SeparatorViewMapper());
        }

        private Set<i> provideShellNavTitleComposeWidget$storefront_prodGoogleAllVendorsRelease() {
            return ShellNavTitleDiModule_ProvideShellNavTitleComposeWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideShellNavTitleComposeWidget$storefront_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Widget2 provideShoppingListsV2Widget() {
            return ShoppingListsV2Module_ProvideShoppingListsV2WidgetFactory.provideShoppingListsV2Widget(shoppingListsV2Config(), new ShoppingListsV2CreateListViewMapper(), new ShoppingListsV2ItemViewMapper(), new ShoppingListsV2TitleViewMapper());
        }

        private Widget2 provideSkuGrid1() {
            return SkuGrid1Module_ProvideSkuGrid1Factory.provideSkuGrid1(skuGrid1Config(), new SkuGrid1ViewMapper(), new ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper(), new FooterViewMapper(), new RichHeaderViewMapper());
        }

        private Widget2 provideSkuGrid2() {
            return SkuGrid2Module_ProvideSkuGrid2Factory.provideSkuGrid2(skuGrid2Config(), new SkuGrid2ViewMapper(), new SkuGrid2ThinViewMapper(), new ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper(), new FooterViewMapper(), new RichHeaderViewMapper(), new SkuSeparatorViewMapper());
        }

        private Widget2 provideSkuGrid3() {
            return SkuGrid3Module_ProvideSkuGrid3Factory.provideSkuGrid3(skuGrid3Config(), new SkuGrid3ViewMapper(), new SkuGrid3ThinViewMapper(), new ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper(), new FooterViewMapper(), new RichHeaderViewMapper(), new SkuSeparatorViewMapper());
        }

        private Widget2 provideSkuList() {
            return SkuListModule_ProvideSkuListFactory.provideSkuList(skuListConfig(), new SkuListViewMapper(), new ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper(), new FooterViewMapper(), new RichHeaderViewMapper());
        }

        private Set<Widget2> provideSkuScroll() {
            return SkuScrollModule_ProvideSkuScrollFactory.provideSkuScroll(new SkuScrollViewMapper(), scrollConfig(), new ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper(), new FooterViewMapper(), new RichHeaderViewMapper());
        }

        private Widget2 provideSkuThinScrollModuleWidget() {
            return SkuThinScrollModule_ProvideSkuThinScrollModuleWidgetFactory.provideSkuThinScrollModuleWidget(skuThinScrollConfig(), new SkuThinScrollViewMapper());
        }

        private Widget2 provideStickyButtonWidget() {
            return StickyButtonModule_ProvideStickyButtonWidgetFactory.provideStickyButtonWidget(stickyButtonConfig(), new StickyButtonViewMapper());
        }

        private Widget2 provideSuggestions() {
            return SuggestionsModule_ProvideSuggestionsFactory.provideSuggestions(suggestionsConfig(), new SuggestionsTitleViewMapper(), new CommonIslandSeparatorViewMapper2(), new SeparatorViewMapper(), new SuggestionsTitleSubtitleViewMapper(), new SuggestionsBadgeTitleSubtitleViewMapper(), new ServiceCarouselViewMapper(), new SuggestionWithFilterViewMapper(), new SuggestionsPrefetchViewMapper(), new SuggestionsCellViewMapper());
        }

        private Set<Widget2> provideTagList() {
            return TagListModule_ProvideTagListFactory.provideTagList(tagListConfig2(), new ScrollingTagListWidgetViewMapper(), tagListV3Config(), new ScrollingTagListV3ViewMapper(), new StickyScrollingTagListV3ViewMapper(), new HidingStickyScrollingTagListV3ViewMapper(), new FlexboxTagListV3ViewMapper(), new StickyFlexboxTagListV3ViewMapper(), new FlexboxTagListWidgetViewMapper());
        }

        private Widget2 provideTapTagsV2() {
            return TapTagsV2Module_ProvideTapTagsV2Factory.provideTapTagsV2(tapTagsV2Config(), new TapTagsV2ViewMapper());
        }

        private Widget2 provideTapTagsV3() {
            return TapTagsV3Module_ProvideTapTagsV3Factory.provideTapTagsV3(tapTagsV3Config(), new TapTagsV3ViewMapper());
        }

        private Widget2 provideTileGrid2() {
            return TileGridV2Module_ProvideTileGrid2Factory.provideTileGrid2(tileGrid2Config(), new HeaderViewMapper2(), new TileGrid2DefaultViewMapper(), new TileGrid2SimpleRightViewMapper(), new TileGrid2SimpleSeparatorMapper(), new TileGrid2CartButtonViewMapper(), new TileGrid2CartContainerViewMapper(), new TileGrid2EmptyCartButtonViewMapper(), new TileGrid2DoubleCartButtonViewMapper(), new TileGrid2ThinViewMapper(), new TileGrid2ReserveButtonViewMapper(), new TileGrid2BannerViewMapper(), new TileGrid2BannerButtonViewMapper());
        }

        private Widget2 provideTileGrid3() {
            return TileGrid3Module_ProvideTileGrid3Factory.provideTileGrid3(tileGrid3Config(), new HeaderViewMapper2(), new TileGrid3ViewMapper(), new TileGrid3SeparatorMapper());
        }

        private Widget2 provideTimerWidget() {
            return TimerWidgetModule_ProvideTimerWidgetFactory.provideTimerWidget(timerWidgetConfig(), new TimerWidgetViewMapper());
        }

        private Widget2 provideTotalWidget() {
            return CheckoutTotalWidgetModule_ProvideTotalWidgetFactory.provideTotalWidget(checkoutTotalConfig(), new CheckoutTotalViewMapper(), new FreshCheckoutProgressBarViewMapper());
        }

        private Widget2 provideWidget() {
            return SearchCategoryHeaderDiModule_ProvideWidgetFactory.provideWidget(searchCategoryHeaderConfig(), new SearchCategoryHeaderViewMapper());
        }

        private Widget2 provideWidget$barcode_prodGoogleAllVendorsRelease() {
            return BarcodeProductsListWidgetModule_ProvideWidget$barcode_prodGoogleAllVendorsReleaseFactory.provideWidget$barcode_prodGoogleAllVendorsRelease(this.barcodeProductsListWidgetModule, barcodeProductsListConfig(), new BarcodeProductsListWidgetMapper());
        }

        private Widget2 provideWidget$cancels_prodGoogleAllVendorsRelease() {
            return SelectCancelReasonModule_ProvideWidget$cancels_prodGoogleAllVendorsReleaseFactory.provideWidget$cancels_prodGoogleAllVendorsRelease(this.selectCancelReasonModule2, selectCancelReasonConfig2(), new SelectCancelReasonsViewMapper(), new SelectCancelReasonStickyViewMapper());
        }

        private Set<Widget2> provideWidget$cart_prodGoogleAllVendorsRelease() {
            return PremiumPointsTrainV2Module_ProvideWidget$cart_prodGoogleAllVendorsReleaseFactory.provideWidget$cart_prodGoogleAllVendorsRelease(this.premiumPointsTrainV2Module, premiumPointsTrainConfigV2(), new PremiumPointsTrainV2SingleViewMapper(), new PremiumPointsTrainV2MultipleViewMapper());
        }

        private Set<Widget2> provideWidget$cms_prodGoogleAllVendorsRelease() {
            return CmsWidgetsV2DiModule_ProvideWidget$cms_prodGoogleAllVendorsReleaseFactory.provideWidget$cms_prodGoogleAllVendorsRelease(navBarConfig2(), new NavBarOverlayViewMapper(), captionWidgetConfig(), new CaptionWidgetViewMapper(), bannerCarouselConfig(), new BannerCarouselViewMapper(), new RichTextWidgetViewMapper(), richTextWidgetConfig(), titleConfig(), new TitleViewMapper(), new WebViewWidgetViewMapper(), webViewWidgetConfig(), horizontalAutoScrollConfig(), new HorizontalAutoScrollViewMapper(), richPromoScrollConfig(), new RichPromoScrollViewMapper());
        }

        private Set<Widget2> provideWidget$commonwidgets_prodGoogleAllVendorsRelease() {
            return StorefrontCommonV2Module_ProvideWidget$commonwidgets_prodGoogleAllVendorsReleaseFactory.provideWidget$commonwidgets_prodGoogleAllVendorsRelease(iconButtonWidgetConfig(), new IconButtonWidgetViewMapper());
        }

        private Widget2 provideWidget$courieronmap_prodGoogleAllVendorsRelease() {
            return CourierOnMapModule_Companion_ProvideWidget$courieronmap_prodGoogleAllVendorsReleaseFactory.provideWidget$courieronmap_prodGoogleAllVendorsRelease(courierOnMapConfig(), new CourierOnMapViewMapper());
        }

        private Widget2 provideWidget$creation_prodGoogleAllVendorsRelease() {
            return ReturnCreationModalWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory.provideWidget$creation_prodGoogleAllVendorsRelease(this.returnCreationModalWidgetModule, returnCreationModalConfig(), new ReturnCreationModalViewMapper());
        }

        private Widget2 provideWidget$creation_prodGoogleAllVendorsRelease2() {
            return ReturnCreationTotalWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory.provideWidget$creation_prodGoogleAllVendorsRelease(this.returnCreationTotalWidgetModule, returnCreationTotalConfig(), new ReturnCreationTotalViewMapper());
        }

        private Widget2 provideWidget$creation_prodGoogleAllVendorsRelease3() {
            return ReturnCreationSelectedItemsWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory.provideWidget$creation_prodGoogleAllVendorsRelease(this.returnCreationSelectedItemsWidgetModule, returnCreationSelectedItemsConfig(), new ReturnCreationSelectedItemViewMapper(), new CommonIslandSeparatorViewMapper2());
        }

        private Widget2 provideWidget$creation_prodGoogleAllVendorsRelease4() {
            return ReturnCreationStepsWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory.provideWidget$creation_prodGoogleAllVendorsRelease(this.returnCreationStepsWidgetModule, returnCreationStepsConfig(), new ReturnCreationStepsViewMapper());
        }

        private Widget2 provideWidget$creation_prodGoogleAllVendorsRelease5() {
            return ReturnCreationOrdersWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory.provideWidget$creation_prodGoogleAllVendorsRelease(this.returnCreationOrdersWidgetModule, returnCreationOrdersConfig(), new OpenCloudViewMapper(), new ReturnCreationGroupViewMapper(), new ReturnCreationDeliveryViewMapper(), new ReturnCreationItemViewMapper(), new PaginationViewMapper(), new CommonIslandSeparatorViewMapper2(), new ExtendBackgroundViewMapper());
        }

        private Widget2 provideWidget$creation_prodGoogleAllVendorsRelease6() {
            return ReturnCreationOrderWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory.provideWidget$creation_prodGoogleAllVendorsRelease(this.returnCreationOrderWidgetModule, returnCreationItemsListConfig(), new ReturnCreationGroupViewMapper(), new ReturnCreationDeliveryViewMapper(), new ReturnCreationItemViewMapper(), new CommonIslandSeparatorViewMapper2());
        }

        private Widget2 provideWidget$creation_prodGoogleAllVendorsRelease7() {
            return ReturnCreationReasonsWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory.provideWidget$creation_prodGoogleAllVendorsRelease(this.returnCreationReasonsWidgetModule, returnCreationReasonsConfig(), new OpenCloudViewMapper(), new ItemWidgetViewMapper(), new ru.ozon.app.android.returns.creation.widgets.reasons.presentation.header.viewMapper.HeaderWidgetViewMapper(), new ReasonWidgetViewMapper(), new AddMoreButtonWidgetViewMapper(), new CommonIslandSeparatorViewMapper2(), new StickyBottomEarsWidgetMapper());
        }

        private Widget2 provideWidget$creation_prodGoogleAllVendorsRelease8() {
            return ReturnTextAreaButtonWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory.provideWidget$creation_prodGoogleAllVendorsRelease(this.returnTextAreaButtonWidgetModule, returnTextAreaButtonConfig(), new ReturnTextAreaButtonViewMapper());
        }

        private Widget2 provideWidget$details_prodGoogleAllVendorsRelease() {
            return ReturnListWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory.provideWidget$details_prodGoogleAllVendorsRelease(this.returnListWidgetModule, returnListConfig(), new ReturnListViewMapper(), new CommonIslandSeparatorViewMapper2());
        }

        private Widget2 provideWidget$details_prodGoogleAllVendorsRelease2() {
            return ReturnListEmptyModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory.provideWidget$details_prodGoogleAllVendorsRelease(this.returnListEmptyModule, returnListEmptyConfig(), new BannerViewMapper(), instructionViewMapper());
        }

        private Widget2 provideWidget$details_prodGoogleAllVendorsRelease3() {
            return ReturnDetailsWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory.provideWidget$details_prodGoogleAllVendorsRelease(this.returnDetailsWidgetModule, returnDetailsConfig(), new ReturnDetailsViewMapper());
        }

        private Widget2 provideWidget$details_prodGoogleAllVendorsRelease4() {
            return ReturnDetailsHeaderButtonWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory.provideWidget$details_prodGoogleAllVendorsRelease(this.returnDetailsHeaderButtonWidgetModule, copyButtonConfig(), new CopyButtonViewMapper());
        }

        private Widget2 provideWidget$details_prodGoogleAllVendorsRelease5() {
            return ReturnableItemsListWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory.provideWidget$details_prodGoogleAllVendorsRelease(this.returnableItemsListWidgetModule, returnableItemsListConfig(), new ReturnableItemsTitleViewMapper(), new ReturnableItemsListViewMapper(), new PaginationMobileViewMapper(), new TotalMobileViewMapper(), new CommonIslandSeparatorViewMapper2());
        }

        private Widget2 provideWidget$details_prodGoogleAllVendorsRelease6() {
            return ReturnEditWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory.provideWidget$details_prodGoogleAllVendorsRelease(this.returnEditWidgetModule, returnEditConfig(), new ReturnTextEditBlockViewMapper(), new ReturnImageEditViewMapper(), new ReturnEditStickyViewMapper(), new CommonIslandSeparatorViewMapper2());
        }

        private Widget2 provideWidget$details_prodGoogleAllVendorsRelease7() {
            return ReturnDetailsTotalWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory.provideWidget$details_prodGoogleAllVendorsRelease(this.returnDetailsTotalWidgetModule, returnDetailsTotalConfig(), new ReturnDetailsTotalViewMapper());
        }

        private Widget2 provideWidget$details_prodGoogleAllVendorsRelease8() {
            return ReturnActionButtonsWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory.provideWidget$details_prodGoogleAllVendorsRelease(this.returnActionButtonsWidgetModule, returnActionButtonsConfig(), new ReturnActionButtonsViewMapper());
        }

        private Widget2 provideWidget$details_prodGoogleAllVendorsRelease9() {
            return ReturnBalanceModalWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory.provideWidget$details_prodGoogleAllVendorsRelease(this.returnBalanceModalWidgetModule, returnBalanceModalConfig(), new ReturnCellContentViewMapper());
        }

        private Widget2 provideWidget$orderTracking_prodGoogleAllVendorsRelease() {
            return OrderTrackingV4WidgetModule_Companion_ProvideWidget$orderTracking_prodGoogleAllVendorsReleaseFactory.provideWidget$orderTracking_prodGoogleAllVendorsRelease(orderTrackingV4Config(), new OrderTrackingV4ViewMapper());
        }

        private Widget2 provideWidget$orderdetails_prodGoogleAllVendorsRelease() {
            return SelectCancelReasonModule_ProvideWidget$orderdetails_prodGoogleAllVendorsReleaseFactory.provideWidget$orderdetails_prodGoogleAllVendorsRelease(this.selectCancelReasonModule, selectCancelReasonConfig(), new ru.ozon.app.android.orderdetails.cancelReasons.presentation.reasons.SelectCancelReasonsViewMapper(), new ru.ozon.app.android.orderdetails.cancelReasons.presentation.sticky.SelectCancelReasonStickyViewMapper());
        }

        private Widget2 provideWidget$orderdone_prodGoogleAllVendorsRelease() {
            return OrderDonePaymentStatusWidgetModule_ProvideWidget$orderdone_prodGoogleAllVendorsReleaseFactory.provideWidget$orderdone_prodGoogleAllVendorsRelease(this.orderDonePaymentStatusWidgetModule, orderDonePaymentStatusConfig(), new OrderDonePaymentStatusViewMapper());
        }

        private Set<Widget2> provideWidget$railway_prodGoogleAllVendorsRelease() {
            return TravelRailwayWidgetV2Module_Companion_ProvideWidget$railway_prodGoogleAllVendorsReleaseFactory.provideWidget$railway_prodGoogleAllVendorsRelease(travelCarriageDetailsConfig(), new TravelCarriageDetailsViewMapper(), travelTrainCheckInConfig(), new TravelTrainCheckInViewMapper(), travelCarriageSelectV3Config(), new TravelCarriageSelectV3ViewMapper(), new ListTrackingViewMapper(), travelTrainSeatInfoV2Config(), new TravelTrainSeatInfoV2ViewMapper(), travelCarriageTypeSelectV2Config(), new TravelCarriageTypeSelectV2ViewMapper(), new TravelRailwaySeatSelectFooterViewMapper(), new TravelRailwaySeatSelectStickyButtonViewMapper(), travelRailwaySeatSelectWithSchemeV2Config(), new TravelRailwaySeatSelectWithSchemeV2ViewMapper(), travelNavTrainConfig(), new TravelNavTrainViewMapper(), travelTrainRouteConfig(), new TravelTrainRouteViewMapper(), railwayTrainInformationConfig(), new RailwayTrainInformationViewMapper(), availablePromotionConfig(), new AvailablePromotionViewMapper(), railwayStepsHeaderConfig(), new RailwayStepsHeaderViewMapper());
        }

        private Widget2 provideWidget$storefront_prodGoogleAllVendorsRelease() {
            return NavigationSliderModule_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideWidget$storefront_prodGoogleAllVendorsRelease(navigationSliderConfig(), new NavigationSliderViewMapper());
        }

        private Widget2 provideWidget$storefront_prodGoogleAllVendorsRelease2() {
            return NavigationSliderV2Module_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideWidget$storefront_prodGoogleAllVendorsRelease(navigationSliderV2Config(), new NavigationSliderV2ViewMapper(), new NavigationSliderV2ScrollableViewMapper());
        }

        private Widget2 provideWidget$storefront_prodGoogleAllVendorsRelease3() {
            return VideoTileWidgetModule_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideWidget$storefront_prodGoogleAllVendorsRelease(this.videoTileWidgetModule, videoTileConfig(), new VideoTileViewMapper());
        }

        private Widget2 provideWidget$storefront_prodGoogleAllVendorsRelease4() {
            return VideoScrollWidgetModule_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideWidget$storefront_prodGoogleAllVendorsRelease(this.videoScrollWidgetModule, videoScrollConfig(), new VideoScrollViewMapper());
        }

        private Widget2 provideWidget$storefront_prodGoogleAllVendorsRelease5() {
            return NavigationSliderV3Module_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideWidget$storefront_prodGoogleAllVendorsRelease(navigationSliderV3Config2(), new NavigationSliderV3ViewMapper(), new NavigationSliderV3ScrollableViewMapper());
        }

        private Widget2 provideWidget$storefront_prodGoogleAllVendorsRelease6() {
            return PlayStoriesV3WidgetModule_ProvideWidget$storefront_prodGoogleAllVendorsReleaseFactory.provideWidget$storefront_prodGoogleAllVendorsRelease(this.playStoriesV3WidgetModule, playStoriesV3Config(), new PlayStoriesV3ViewMapper());
        }

        private Set<Widget2> provideWidget$widgets_checkout_prodGoogleAllVendorsRelease() {
            return FreshPremiumPointsTrainWidgetModule_ProvideWidget$widgets_checkout_prodGoogleAllVendorsReleaseFactory.provideWidget$widgets_checkout_prodGoogleAllVendorsRelease(freshPremiumPointsTrainConfig(), new FreshPremiumPointsTrainSingleViewMapper(), new FreshPremiumPointsTrainMultipleViewMapper());
        }

        private Set<Widget2> provideWidget$widgets_prodGoogleAllVendorsRelease() {
            return CommonWidgetsV2DiModule_ProvideWidget$widgets_prodGoogleAllVendorsReleaseFactory.provideWidget$widgets_prodGoogleAllVendorsRelease(cellListV2Config(), new CellListV2ViewMapper(), errorConfig(), new ErrorViewMapper(), serviceCarouselConfig(), new ServiceCarouselViewMapper());
        }

        private Set<Widget2> provideWidget$widgets_prodGoogleAllVendorsRelease2() {
            return CurtainSettingsWidgetsModule_ProvideWidget$widgets_prodGoogleAllVendorsReleaseFactory.provideWidget$widgets_prodGoogleAllVendorsRelease(curtainSettingsConfig(), new CurtainSettingsViewMapper(), curtainHeaderConfig(), new CurtainHeaderViewMapper());
        }

        private Widget2 provideWidget10() {
            return DeliveryDateChangedComplaintFormModule_ProvideWidgetFactory.provideWidget(this.deliveryDateChangedComplaintFormModule, deliveryDateChangedComplaintFormConfig(), new DeliveryDateChangedComplaintFormTitleViewMapper(), new DeliveryDateChangedComplaintFormReasonViewMapper(), new DeliveryDateChangedComplaintFormInputViewMapper());
        }

        private Widget2 provideWidget100() {
            return SteppedThermometerModule_ProvideWidgetFactory.provideWidget(this.steppedThermometerModule, steppedThermometerConfig(), new SteppedThermometerViewMapper());
        }

        private Widget2 provideWidget101() {
            return ProfileAvatarWidgetModule_ProvideWidgetFactory.provideWidget(profileAvatarConfig(), new ProfileAvatarViewMapper());
        }

        private Widget2 provideWidget102() {
            return ProfileTilesWidgetModule_ProvideWidgetFactory.provideWidget(profileTilesConfig(), new ProfileTilesViewMapper());
        }

        private Widget2 provideWidget103() {
            return TagListWidgetModule_ProvideWidgetFactory.provideWidget(tagListConfig(), new TagListViewMapper());
        }

        private Widget2 provideWidget104() {
            return FlexButtonsWidgetModule_ProvideWidgetFactory.provideWidget(flexButtonsConfig(), new FlexButtonsViewMapper());
        }

        private Widget2 provideWidget105() {
            return OrderDetailsItemModule_ProvideWidgetFactory.provideWidget(this.orderDetailsItemModule, orderDetailsItemConfig(), new OrderDetailsItemViewMapper());
        }

        private Widget2 provideWidget106() {
            return CustomsFeesModule_ProvideWidgetFactory.provideWidget(this.customsFeesModule, customsFeesConfig(), new CustomsFeesViewMapper());
        }

        private Widget2 provideWidget107() {
            return OrderTotalModule_ProvideWidgetFactory.provideWidget(this.orderTotalModule, orderTotalConfig(), new OrderTotalSummaryViewMapper(), new OrderTotalStickyViewMapper());
        }

        private Widget2 provideWidget108() {
            return OrderShipmentModule_Companion_ProvideWidgetFactory.provideWidget(orderShipmentConfig(), new PositingOrderShipmentViewMapper(), new AnnotationOrderShipmentViewMapper(), new ActionOrderShipmentViewMapper(), new StatusOrderShipmentViewMapper(), new TextOrderShipmentViewMapper(), new TitleOrderShipmentViewMapper(), new StatusProviderOrderShipmentViewMapper());
        }

        private Widget2 provideWidget109() {
            return OrderTimelineV2Module_ProvideWidgetFactory.provideWidget(this.orderTimelineV2Module, orderTimelineConfig(), new OrderTimelineViewMapper());
        }

        private Widget2 provideWidget11() {
            return DeliveryComplainWidgetModule_ProvideWidgetFactory.provideWidget(this.deliveryComplainWidgetModule, deliveryComplainWidgetConfig(), new DeliveryComplainOverlayViewMapper());
        }

        private Widget2 provideWidget110() {
            return OrderTrackShipmentModule_ProvideWidgetFactory.provideWidget(this.orderTrackShipmentModule, orderTrackShipmentConfig(), new OrderTrackShipmentViewMapper());
        }

        private Widget2 provideWidget111() {
            return TimeLeftWidgetModule_ProvideWidgetFactory.provideWidget(this.timeLeftWidgetModule, timeLeftConfig(), new TimeLeftViewMapper());
        }

        private Widget2 provideWidget112() {
            return OrderActionsModule_ProvideWidgetFactory.provideWidget(this.orderActionsModule, orderActionsConfig(), new OrderActionsViewMapper());
        }

        private Widget2 provideWidget113() {
            return OrderDeliveryDetailV2Module_ProvideWidgetFactory.provideWidget(this.orderDeliveryDetailV2Module, orderDeliveryDetailV2Config(), new OrderDeliveryDetailV2HeaderViewMapper(), new OrderDeliveryDetailV2ActionsViewMapper(), new OrderDeliveryDetailV2LeaveAtDoorViewMapper(), new OrderDeliveryDetailV2LastDividerViewMapper());
        }

        private Widget2 provideWidget114() {
            return ChequesWidgetModule_ProvideWidgetFactory.provideWidget(this.chequesWidgetModule, chequesConfig(), new ChequesTitleViewMapper(), new ChequeViewMapper());
        }

        private Widget2 provideWidget115() {
            return DateSelectorWidgetModule_ProvideWidgetFactory.provideWidget(this.dateSelectorWidgetModule, dateSelectorConfig(), new DateSelectorViewMapper());
        }

        private Widget2 provideWidget116() {
            return DeliveryTimeSelectorV1Module_ProvideWidgetFactory.provideWidget(this.deliveryTimeSelectorV1Module, deliveryTimeConfig(), new DeliveryTimeSelectorViewMapper());
        }

        private Widget2 provideWidget117() {
            return DeliveryTimeSelectorV2Module_ProvideWidgetFactory.provideWidget(deliveryTimeSelectorV2Config(), new DeliveryTimeSelectorV2ViewMapper(), new CellListV2ViewMapper(), new ConfirmDateButtonViewMapper());
        }

        private Widget2 provideWidget118() {
            return RadioGroupWidgetModule_ProvideWidgetFactory.provideWidget(this.radioGroupWidgetModule, radioGroupWidgetConfig(), new RadioGroupWidgetViewMapper());
        }

        private Widget2 provideWidget119() {
            return ReplyToCourierInfoWidgetModule_ProvideWidgetFactory.provideWidget(this.replyToCourierInfoWidgetModule, replyToCourierInfoWidgetConfig(), new ReplyToCourierInfoWidgetViewMapper());
        }

        private Widget2 provideWidget12() {
            return BarcodeWidgetModule_ProvideWidgetFactory.provideWidget(this.barcodeWidgetModule, barcodeConfig(), new BarcodeViewMapper());
        }

        private Widget2 provideWidget120() {
            return ExtendBackgroundWidgetModule_ProvideWidgetFactory.provideWidget(this.extendBackgroundWidgetModule, extendBackgroundConfig(), new ExtendBackgroundViewMapper());
        }

        private Widget2 provideWidget121() {
            return ModalConstructorModule_ProvideWidgetFactory.provideWidget(this.modalConstructorModule, modalConstructorConfig(), new ru.ozon.app.android.orderdetails.modalConstructor.presentation.button.ButtonViewMapper(), new DisclaimerViewMapper(), new TextWrapperViewMapper(), new ImageWrapperViewMapper(), new ModalConstructSeparatorViewMapper(), new CellListV2ViewMapper(), new HorizontalScrollImagesViewMapper());
        }

        private Widget2 provideWidget122() {
            return AdvBannerV4DiModule_ProvideWidgetFactory.provideWidget(advBannerV4Config(), new AdvBannerV4PlainViewMapper(), new AdvBannerV4PlainSingleViewMapper());
        }

        private Widget2 provideWidget123() {
            return AdvVideoBannerV2WidgetDiModule_ProvideWidgetFactory.provideWidget(advVideoBannerV2Config(), new AdvVideoBannerV2NewViewMapper());
        }

        private Widget2 provideWidget124() {
            return BlackFridayStatusModule_ProvideWidgetFactory.provideWidget(blackFridayStatusConfig(), new BlackFridayStatusTextTitleViewMapper(), new BlackFridayStatusImageTitleViewMapper());
        }

        private Widget2 provideWidget125() {
            return BlackFridayCounterModule_ProvideWidgetFactory.provideWidget(blackFridayCounterConfig(), new BlackFridayCounterViewMapper());
        }

        private Widget2 provideWidget126() {
            return SisBrandFavoriteWidgetModule_ProvideWidgetFactory.provideWidget(this.sisBrandFavoriteWidgetModule, sisBrandFavoriteConfig(), new SisBrandFavoriteViewMapper());
        }

        private Widget2 provideWidget127() {
            return NpsRatingRegistrationModule_ProvideWidgetFactory.provideWidget(npsRatingConfig(), new NpsRatingViewMapper());
        }

        private Widget2 provideWidget128() {
            return ResultModule_ProvideWidgetFactory.provideWidget(resultConfig(), new ResultViewMapper(), new RateMainButtonViewMapper());
        }

        private Widget2 provideWidget129() {
            return RateRegistrationModule_ProvideWidgetFactory.provideWidget(rateConfig(), new RateViewMapper(), new RateMainButtonViewMapper());
        }

        private Widget2 provideWidget13() {
            return ActionButtonV2WidgetModule_ProvideWidgetFactory.provideWidget(this.actionButtonV2WidgetModule, actionButtonV2Config(), new ActionButtonV2OverlayWidgetViewMapper());
        }

        private Widget2 provideWidget130() {
            return PlayVideoModule_ProvideWidgetFactory.provideWidget(playVideoConfig(), new PlayVideoNoUiViewMapper());
        }

        private Widget2 provideWidget131() {
            return SessionListWidgetModule_ProvideWidgetFactory.provideWidget(sessionListConfig(), new CurrentSessionTitleViewMapper(), new SessionListLogoutButtonViewMapper(), new SessionListAnnotationViewMapper(), new CurrentSessionViewMapper(), new SessionListTitleViewMapper(), new SessionListHeaderViewMapper(), new SessionListViewMapper());
        }

        private Widget2 provideWidget132() {
            return SessionWidgetModule_ProvideWidgetFactory.provideWidget(sessionConfig(), new SessionViewMapper());
        }

        private Widget2 provideWidget133() {
            return MySettingsHeaderWidgetModule_ProvideWidgetFactory.provideWidget(mySettingsHeaderConfig(), new MySettingsHeaderViewMapper());
        }

        private Widget2 provideWidget134() {
            return LogoMobileWidgetModule_ProvideWidgetFactory.provideWidget(logoMobileConfig(), new LogoMobileViewMapper());
        }

        private Set<Widget2> provideWidget135() {
            return SellerProductsWidgetsModule_ProvideWidgetFactory.provideWidget(this.sellerProductsWidgetsModule, sellerProductsWidgetConfig(), new SellerProductsViewMapper(), headerWidgetViewMapper());
        }

        private Set<Widget2> provideWidget136() {
            return FaqWidgetModule_ProvideWidgetFactory.provideWidget(this.faqWidgetModule, faqConfig2(), new FaqAccordionViewMapper(), new CommonIslandSeparatorViewMapper2());
        }

        private Widget2 provideWidget137() {
            return TotalV3WidgetModule_ProvideWidgetFactory.provideWidget(this.totalV3WidgetModule, totalConfig(), new TotalViewMapper());
        }

        private Widget2 provideWidget138() {
            return CheckoutPrefetchWidgetModule_ProvideWidgetFactory.provideWidget(this.checkoutPrefetchWidgetModule, checkoutPrefetchConfig(), new CheckoutPrefetchViewMapper());
        }

        private Widget2 provideWidget139() {
            return OrderDoneDisclaimerWidgetModule_ProvideWidgetFactory.provideWidget(this.orderDoneDisclaimerWidgetModule, orderDoneDisclaimerConfig(), new OrderDoneDisclaimerWidgetViewMapper());
        }

        private Widget2 provideWidget14() {
            return ActiveOrdersCountWidgetModule_ProvideWidgetFactory.provideWidget(this.activeOrdersCountWidgetModule, activeOrdersCountConfig());
        }

        private Widget2 provideWidget140() {
            return OrderDoneTotalWidgetModule_ProvideWidgetFactory.provideWidget(this.orderDoneTotalWidgetModule, orderDoneTotalConfig(), new OrderDoneTotalElementViewMapper());
        }

        private Widget2 provideWidget141() {
            return OrderDoneCrossButtonWidgetModule_ProvideWidgetFactory.provideWidget(this.orderDoneCrossButtonWidgetModule, orderDoneCrossButtonConfig(), new OrderDoneCrossButtonWidgetViewMapper());
        }

        private Widget2 provideWidget142() {
            return OrderDoneButtonBarWidgetModule_ProvideWidgetFactory.provideWidget(this.orderDoneButtonBarWidgetModule, orderDoneButtonBarConfig(), new OrderDoneButtonBarStickyWidgetViewMapper(), new OrderDoneButtonBarWidgetViewMapper());
        }

        private Widget2 provideWidget143() {
            return EnableNotificationsSnackbarWidgetModule_ProvideWidgetFactory.provideWidget(this.enableNotificationsSnackbarWidgetModule, enableNotificationsSnackbarConfig(), new EnableNotificationsSnackbarWidgetViewMapper());
        }

        private Widget2 provideWidget144() {
            return CourierTipsWidgetModule_ProvideWidgetFactory.provideWidget(this.courierTipsWidgetModule2, courierTipsConfig2(), new CourierTipsViewMapper());
        }

        private Widget2 provideWidget145() {
            return PlainTextWidgetModule_ProvideWidgetFactory.provideWidget(plainTextConfig(), new PlainTextViewMapper2());
        }

        private Widget2 provideWidget146() {
            return CommonTextWidgetModule_ProvideWidgetFactory.provideWidget(this.commonTextWidgetModule, commonTextWidgetConfig(), new HeaderViewMapper2(), new PlainTextViewMapper2(), new ru.ozon.app.android.widgets.commonTextWidget.cellList.core.CellListV2ViewMapper(), new ru.ozon.app.android.widgets.commonTextWidget.separator.core.SeparatorViewMapper());
        }

        private Widget2 provideWidget147() {
            return ActionButtonModule_ProvideWidgetFactory.provideWidget(this.actionButtonModule, actionButtonConfig(), new ActionButtonViewMapper(), new ActionButtonOverlayViewMapper());
        }

        private Widget2 provideWidget148() {
            return ReturnCreationMethodsWidgetModule_ProvideWidgetFactory.provideWidget(this.returnCreationMethodsWidgetModule, returnCreationMethodsConfig(), new AtomElementViewMapper(), new ImagesElementViewMapper(), new TextWithIconButtonElementViewMapper(), new DatesElementViewMapper(), new CommonIslandSeparatorViewMapper2());
        }

        private Widget2 provideWidget149() {
            return ReturnCreationPhotoPickerWidgetModule_ProvideWidgetFactory.provideWidget(this.returnCreationPhotoPickerWidgetModule, returnCreationPhotoPickerConfig(), new ItemWidgetViewMapper(), new TitleWidgetViewMapper(), new PhotosWidgetViewMapper(), new ButtonsWidgetViewMapper(), new CommonIslandSeparatorViewMapper2(), new StickyBottomEarsWidgetMapper());
        }

        private Widget2 provideWidget15() {
            return ClickToDeliveryModalWidgetModule_ProvideWidgetFactory.provideWidget(this.clickToDeliveryModalWidgetModule, clickToDeliveryModalConfig(), new SeparatorViewMapper(), new ru.ozon.app.android.account.orders.clicktodeliverymodal.core.title.TitleViewMapper(), new ru.ozon.app.android.account.orders.clicktodeliverymodal.core.buttons.ButtonsViewMapper(), new DeliveryViewMapper());
        }

        private Widget2 provideWidget150() {
            return DeliveryOrderOnDetailsWidgetModule_ProvideWidgetFactory.provideWidget(this.deliveryOrderOnDetailsWidgetModule, deliveryOrderOnDetailsConfig(), new DeliveryOrderOnDetailsViewMapper());
        }

        private Widget2 provideWidget151() {
            return DeliveryInfoWidgetModule_ProvideWidgetFactory.provideWidget(this.deliveryInfoWidgetModule, deliveryInfoConfig(), new DeliveryInfoViewMapper());
        }

        private Widget2 provideWidget152() {
            return DeliveryOrderInputWidgetModule_ProvideWidgetFactory.provideWidget(this.deliveryOrderInputWidgetModule, deliveryOrderInputConfig(), new DeliveryOrderInputViewMapper());
        }

        private Widget2 provideWidget153() {
            return GroupButtonsWidgetModule_ProvideWidgetFactory.provideWidget(this.groupButtonsWidgetModule, groupButtonsConfig(), new GroupButtonsViewMapper());
        }

        private Widget2 provideWidget154() {
            return DeliveryOrderListWidgetModule_ProvideWidgetFactory.provideWidget(this.deliveryOrderListWidgetModule, deliveryOrderListConfig(), new DeliveryOrderViewMapper());
        }

        private Widget2 provideWidget155() {
            return TipCourierDetailsV2Module_ProvideWidgetFactory.provideWidget(this.tipCourierDetailsV2Module, tipCourierDetailsConfig(), new TipCourierDetailButtonViewMapper(), new TipCourierDetailsTipsViewMapper());
        }

        private Widget2 provideWidget156() {
            return TipCourierHeaderWidgetModule_ProvideWidgetFactory.provideWidget(this.tipCourierHeaderWidgetModule, tipCourierHeaderConfig(), new TipCourierHeaderViewMapper(), new TipCourierHeaderOverlayViewMapper());
        }

        private Widget2 provideWidget157() {
            return TipCourierReviewV2WidgetModule_ProvideWidgetFactory.provideWidget(this.tipCourierReviewV2WidgetModule, tipCourierReviewV2Config(), new TipCourierReviewViewMapper(), new TipCourierReviewOverlayViewMapper());
        }

        private Widget2 provideWidget158() {
            return TipProductPhotosModule_ProvideWidgetFactory.provideWidget(this.tipProductPhotosModule, tipProductPhotosConfig(), new TipProductPhotosViewMapper());
        }

        private Widget2 provideWidget159() {
            return EmptyScreenWidgetModule_ProvideWidgetFactory.provideWidget(this.emptyScreenWidgetModule, emptyScreenConfig(), new EmptyScreenViewMapper(), new EmptyScreenButtonViewMapper());
        }

        private Widget2 provideWidget16() {
            return BarcodePopoverWidgetModule_ProvideWidgetFactory.provideWidget(this.barcodePopoverWidgetModule, barcodePopoverConfig(), new BarcodePopoverViewMapper());
        }

        private Widget2 provideWidget160() {
            return BorderlessButtonWidgetModule_ProvideWidgetFactory.provideWidget(this.borderlessButtonWidgetModule, borderlessButtonConfig(), new BorderlessButtonViewMapper());
        }

        private Widget2 provideWidget161() {
            return TextWidgetModule_ProvideWidgetFactory.provideWidget(this.textWidgetModule, textWidgetConfig(), new TextWidgetViewMapper());
        }

        private Widget2 provideWidget162() {
            return ru.ozon.app.android.returns.cancels.modalConstructor.di.ModalConstructorModule_ProvideWidgetFactory.provideWidget(this.modalConstructorModule2, modalConstructorConfig2(), new ru.ozon.app.android.returns.cancels.modalConstructor.presentation.button.ButtonViewMapper(), new ru.ozon.app.android.returns.cancels.modalConstructor.presentation.disclaimer.DisclaimerViewMapper(), new ru.ozon.app.android.returns.cancels.modalConstructor.presentation.text.TextWrapperViewMapper(), new ru.ozon.app.android.returns.cancels.modalConstructor.presentation.image.ImageWrapperViewMapper(), new ru.ozon.app.android.returns.cancels.modalConstructor.presentation.separator.ModalConstructSeparatorViewMapper(), new CellListV2ViewMapper(), new ru.ozon.app.android.returns.cancels.modalConstructor.presentation.imageList.HorizontalScrollImagesViewMapper());
        }

        private Widget2 provideWidget163() {
            return PromptStatusWidgetModule_ProvideWidgetFactory.provideWidget(this.promptStatusWidgetModule, promptStatusConfig(), new PromptStatusViewMapper());
        }

        private Widget2 provideWidget164() {
            return ResponseActionsWidgetModule_ProvideWidgetFactory.provideWidget(this.responseActionsWidgetModule, responseActionsConfig(), new ResponseActionsViewMapper());
        }

        private Widget2 provideWidget165() {
            return PromptSuggestionsWidgetModule_ProvideWidgetFactory.provideWidget(promptSuggestionsConfig(), new PromptSuggestionsViewMapper());
        }

        private Widget2 provideWidget166() {
            return MessageBubbleWidgetModule_ProvideWidgetFactory.provideWidget(messageBubbleConfig(), new MessageBubbleViewMapper());
        }

        private Set<i> provideWidget167() {
            return CatalogTabsV2WidgetModule_ProvideWidgetFactory.provideWidget(this.catalogTabsV2WidgetModule, catalogTabsV2Config());
        }

        private Set<i> provideWidget168() {
            return DeliveryWidgetV4Module_ProvideWidgetFactory.provideWidget(deliveryWidgetV4Config());
        }

        private Widget2 provideWidget17() {
            return OrderProductsWidgetModule_ProvideWidgetFactory.provideWidget(this.orderProductsWidgetModule, orderProductsConfig(), new OrderProductItemViewMapper(), new OrderProductSeparatorViewMapper());
        }

        private Widget2 provideWidget18() {
            return AddressCommunicationWidgetModule_ProvideWidgetFactory.provideWidget(this.addressCommunicationWidgetModule, addressCommunicationConfig(), new AddressCommunicationViewMapper());
        }

        private Widget2 provideWidget19() {
            return BannerListWidgetModule_ProvideWidgetFactory.provideWidget(this.bannerListWidgetModule, bannerListConfig(), new BannerRowViewMapper());
        }

        private Widget2 provideWidget2() {
            return OrderListModule_ProvideWidgetFactory.provideWidget(this.orderListModule, orderListConfig(), new OrderListViewMapper());
        }

        private Widget2 provideWidget20() {
            return CatalogShelfWidgetModule_ProvideWidgetFactory.provideWidget(this.catalogShelfWidgetModule, new CatalogShelfHeaderViewMapper(), new CatalogShelfRowViewMapper(), this.jsonDeserializer, this.context, new CatalogShelfRowViewMapperNew());
        }

        private Widget2 provideWidget21() {
            return CatalogueTabsWidgetModule_ProvideWidgetFactory.provideWidget(this.catalogueTabsWidgetModule, new CatalogueTabsViewMapper(), this.jsonDeserializer, this.context, this.moshi);
        }

        private Widget2 provideWidget22() {
            return CouponGoalsV2WidgetModule_ProvideWidgetFactory.provideWidget(this.couponGoalsV2WidgetModule, couponGoalsV2Config(), new CouponGoalsV2ViewMapper());
        }

        private Widget2 provideWidget23() {
            return CurtainGoalsV2WidgetModule_ProvideWidgetFactory.provideWidget(this.curtainGoalsV2WidgetModule, curtainGoalsV2Config(), new CurtainGoalsV2ViewMapper());
        }

        private Widget2 provideWidget24() {
            return OrderTrackingWidgetModule_ProvideWidgetFactory.provideWidget(this.orderTrackingWidgetModule, orderTrackingConfig(), new OrderTrackingViewMapper());
        }

        private Widget2 provideWidget25() {
            return PromoCarouselWidgetModule_ProvideWidgetFactory.provideWidget(this.promoCarouselWidgetModule, promoCarouselConfig(), new PromoCarouselViewMapper());
        }

        private Widget2 provideWidget26() {
            return ExpressRedirectButtonWidgetModule_ProvideWidgetFactory.provideWidget(this.expressRedirectButtonWidgetModule, expressRedirectButtonConfig(), new ExpressRedirectButtonViewMapper());
        }

        private Widget2 provideWidget27() {
            return ExpressNavigationSliderWidgetModule_ProvideWidgetFactory.provideWidget(this.expressNavigationSliderWidgetModule, expressNavigationSliderV2Config(), new ExpressNavigationSliderV2HeaderViewMapper(), new ExpressNavigationSliderV2SeparatorViewMapper(), new ExpressNavigationSliderV2ItemsViewMapper());
        }

        private Widget2 provideWidget28() {
            return FakeSearchWidgetModule_ProvideWidgetFactory.provideWidget(this.fakeSearchWidgetModule, fakeSearchConfig(), new FakeSearchViewMapper());
        }

        private Widget2 provideWidget29() {
            return NavSliderV3WidgetModule_ProvideWidgetFactory.provideWidget(this.navSliderV3WidgetModule, navigationSliderV3Config(), new NavigationSliderV3HeaderViewMapper(), new NavigationSliderV3RowViewMapper(), new NavigationSliderV3SeparatorViewMapper());
        }

        private Widget2 provideWidget3() {
            return ProductsPackageModule_ProvideWidgetFactory.provideWidget(this.productsPackageModule, productsPackageConfig(), new ProductsPackageViewMapper());
        }

        private Widget2 provideWidget30() {
            return ScrollWidgetModule_ProvideWidgetFactory.provideWidget(this.scrollWidgetModule, new ScrollViewMapper(), new ru.ozon.app.android.fresh.main.widgets.product.common.header.HeaderWidgetViewMapper(), new ru.ozon.app.android.fresh.main.widgets.product.common.richheader.presentation.RichHeaderViewMapper(), new ru.ozon.app.android.fresh.main.widgets.product.common.footer.FooterViewMapper(), scrollConfig2());
        }

        private Widget2 provideWidget31() {
            return FreshMiniappHeaderWidgetModule_ProvideWidgetFactory.provideWidget(this.freshMiniappHeaderWidgetModule, freshMiniappHeaderConfig(), new FreshMiniappHeaderViewMapper());
        }

        private Widget2 provideWidget32() {
            return ScrollActionListModule_ProvideWidgetFactory.provideWidget(this.scrollActionListModule, scrollActionListConfig(), new ScrollActionListViewMapper());
        }

        private Widget2 provideWidget33() {
            return HeaderWidgetModule_ProvideWidgetFactory.provideWidget(this.headerWidgetModule, headerConfig(), new HeaderViewMapper());
        }

        private Widget2 provideWidget34() {
            return CatalogTileScrollWidgetModule_ProvideWidgetFactory.provideWidget(this.catalogTileScrollWidgetModule, new CatalogTileScrollViewMapper(), catalogTileScrollConfig());
        }

        private Widget2 provideWidget35() {
            return CatalogTileWidgetModule_ProvideWidgetFactory.provideWidget(this.catalogTileWidgetModule, catalogTileConfig(), new CatalogTileViewMapper());
        }

        private Widget2 provideWidget36() {
            return NotificationCarouselV2WidgetModule_ProvideWidgetFactory.provideWidget(this.notificationCarouselV2WidgetModule, notificationCarouselV2Config(), new NotificationCarouselV2ViewMapper());
        }

        private Widget2 provideWidget37() {
            return CustomCellWidgetModule_ProvideWidgetFactory.provideWidget(this.customCellWidgetModule, customCellConfig(), new CustomCellViewMapper());
        }

        private Widget2 provideWidget38() {
            return WiseSkuScrollWidgetModule_ProvideWidgetFactory.provideWidget(this.wiseSkuScrollWidgetModule, wiseSkuScrollConfig(), new WiseSkuScrollViewMapper());
        }

        private Widget2 provideWidget39() {
            return StickyPromoBannerWidgetModule_ProvideWidgetFactory.provideWidget(this.stickyPromoBannerWidgetModule, stickyPromoBannerConfig(), new StickyPromoBannerViewMapper());
        }

        private Widget2 provideWidget4() {
            return SelectPaymentModule_ProvideWidgetFactory.provideWidget(this.selectPaymentModule, selectPaymentConfig(), new SelectPaymentViewMapper(), new SelectPaymentOverlayViewMapper());
        }

        private Widget2 provideWidget40() {
            return AddressPopupButtonWidgetModule_ProvideWidgetFactory.provideWidget(this.addressPopupButtonWidgetModule, addressPopupButtonConfig(), new AddressPopupButtonViewMapper());
        }

        private Widget2 provideWidget41() {
            return DeliveryRatingWidgetModule_ProvideWidgetFactory.provideWidget(this.deliveryRatingWidgetModule, deliveryRatingConfig(), new DeliveryRatingViewMapper(), new DeliveryRatingNewDesignViewMapper());
        }

        private Widget2 provideWidget42() {
            return GeotrackingMapV2WidgetModule_ProvideWidgetFactory.provideWidget(this.geotrackingMapV2WidgetModule, geotrackingMapV2Config(), new GeotrackingMapV2ViewMapper());
        }

        private Widget2 provideWidget43() {
            return OrderInfoWidgetModule_ProvideWidgetFactory.provideWidget(this.orderInfoWidgetModule, orderInfoConfig(), new OrderInfoViewMapper());
        }

        private Widget2 provideWidget44() {
            return OrderItemsWidgetModule_ProvideWidgetFactory.provideWidget(this.orderItemsWidgetModule, orderItemsConfig(), new OrderItemsTitleViewMapper(), new OrderItemsViewMapper());
        }

        private Widget2 provideWidget45() {
            return OrderStatusV3WidgetModule_ProvideWidgetFactory.provideWidget(this.orderStatusV3WidgetModule, orderStatusV3Config(), new OrderStatusV3ViewMapper());
        }

        private Widget2 provideWidget46() {
            return GeotrackingBottomButtonWidgetModule_ProvideWidgetFactory.provideWidget(this.geotrackingBottomButtonWidgetModule, geotrackingBottomButtonConfig(), new GeotrackingBottomButtonOverlapMapper());
        }

        private Widget2 provideWidget47() {
            return CartTileWidgetModule_ProvideWidgetFactory.provideWidget(this.cartTileWidgetModule, cartTileConfig(), new CartTileViewMapper());
        }

        private Widget2 provideWidget48() {
            return CartClickTileWidgetModule_ProvideWidgetFactory.provideWidget(this.cartClickTileWidgetModule, cartClickTileConfig(), new CartClickTileViewMapper());
        }

        private Widget2 provideWidget49() {
            return CartMasterWidgetModule_ProvideWidgetFactory.provideWidget(this.cartMasterWidgetModule, cartMasterConfig(), new CartMasterViewMapper());
        }

        private Widget2 provideWidget5() {
            return NavBarModule_ProvideWidgetFactory.provideWidget(this.navBarModule, navBarItemConfig(), new NavBarItemViewMapper());
        }

        private Widget2 provideWidget50() {
            return CartIconButtonWidgetModule_ProvideWidgetFactory.provideWidget(this.cartIconButtonWidgetModule, cartIconButtonConfig(), new CartIconButtonViewMapper());
        }

        private Widget2 provideWidget51() {
            return CartControlsWidgetModule_ProvideWidgetFactory.provideWidget(cartControlsConfig(), new CartControlsViewMapper());
        }

        private Widget2 provideWidget52() {
            return ReorderTileWidgetModule_ProvideWidgetFactory.provideWidget(reorderTileConfig(), new ReorderTileViewMapper(), headerApi());
        }

        private Widget2 provideWidget53() {
            return CheckoutMasterWidgetModule_ProvideWidgetFactory.provideWidget(checkoutMasterConfig(), new CartMasterViewMapper());
        }

        private Widget2 provideWidget54() {
            return StickyTotalWidgetModule_ProvideWidgetFactory.provideWidget(this.stickyTotalWidgetModule, stickyTotalConfig(), new StickyTotalOverlayViewMapper(), new StickyTotalPDPViewMapper());
        }

        private Widget2 provideWidget55() {
            return CheckoutStickyTotalWidgetModule_ProvideWidgetFactory.provideWidget(checkoutStickyTotalConfig(), new CheckoutStickyTotalOverlayViewMapper(), new FreshCheckoutProgressBarViewMapper());
        }

        private Widget2 provideWidget56() {
            return StickyOzonBankPromoWidgetModule_ProvideWidgetFactory.provideWidget(stickyOzonBankPromoConfig(), new StickyOzonBankPromoOverlayViewMapper());
        }

        private Widget2 provideWidget57() {
            return TimeSlotsWidgetModule_ProvideWidgetFactory.provideWidget(timeSlotsConfig(), new TimeSlotsViewMapper());
        }

        private Widget2 provideWidget58() {
            return CheckoutProductsWidgetModule_ProvideWidgetFactory.provideWidget(checkoutProductsConfig(), new CheckoutProductsViewMapper());
        }

        private Widget2 provideWidget59() {
            return FreshPremiumPointsToggleWidgetModule_ProvideWidgetFactory.provideWidget(freshPremiumPointsToggleConfig(), new FreshPremiumPointsToggleViewMapper());
        }

        private Widget2 provideWidget6() {
            return ChangeDeliveryTimeButtonModule_ProvideWidgetFactory.provideWidget(this.changeDeliveryTimeButtonModule, changeDeliveryTimeButtonConfig(), new ChangeDeliveryTimeButtonViewMapper());
        }

        private Widget2 provideWidget60() {
            return SearchBankListWidgetModule_ProvideWidgetFactory.provideWidget(searchBankListConfig(), new SearchBankListViewMapper());
        }

        private Widget2 provideWidget61() {
            return DetailedCheckoutProductsWidgetModule_ProvideWidgetFactory.provideWidget(this.detailedCheckoutProductsWidgetModule, detailedCheckoutProductsConfig(), new DetailedCheckoutProductsViewMapper(), headerApi());
        }

        private Widget2 provideWidget62() {
            return InputFormWidgetModule_ProvideWidgetFactory.provideWidget(inputFormConfig(), new InputFormViewMapper());
        }

        private Widget2 provideWidget63() {
            return StickyPromoBadgeWidgetModule_ProvideWidgetFactory.provideWidget(stickyPromoBadgeConfig(), new StickyPromoBadgeViewMapper());
        }

        private Widget2 provideWidget64() {
            return CellListWidgetModule_ProvideWidgetFactory.provideWidget(this.cellListWidgetModule, cellListConfig(), new ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation.CellListViewMapper());
        }

        private Widget2 provideWidget65() {
            return AddressSelectorLiteWidgetModule_ProvideWidgetFactory.provideWidget(this.addressSelectorLiteWidgetModule, addressSelectorLiteConfig(), new AddressSelectorLiteViewMapper());
        }

        private Set<Widget2> provideWidget66() {
            return AutoCatalogWidgetModule_ProvideWidgetFactory.provideWidget(this.autoCatalogWidgetModule, autoCatalogConfig(), new AutoCatalogTileGridMediumViewMapper(), new AutoCatalogTileGridMiniViewMapper(), new FreshTileGridPlugViewMapper(), headerApi());
        }

        private Widget2 provideWidget67() {
            return BottomCartWidgetModule_ProvideWidgetFactory.provideWidget(this.bottomCartWidgetModule, bottomCartWidgetConfig(), new BottomCartWidgetViewMapper(), new BottomCartOverlayMapper());
        }

        private Widget2 provideWidget68() {
            return BrandzoneCarouselWidgetModule_ProvideWidgetFactory.provideWidget(this.brandzoneCarouselWidgetModule, brandzoneCarouselConfig(), new BrandzoneCarouselViewMapper());
        }

        private Widget2 provideWidget69() {
            return CharityAddressSelectorWidgetModule_ProvideWidgetFactory.provideWidget(this.charityAddressSelectorWidgetModule, charityAddressSelectorConfig(), new CharityAddressSelectorViewMapper());
        }

        private Widget2 provideWidget7() {
            return RecipientWidgetModule_ProvideWidgetFactory.provideWidget(this.recipientWidgetModule, recipientConfig(), new RecipientViewMapper());
        }

        private Widget2 provideWidget70() {
            return ru.ozon.app.android.fresh.unsorted.widgets.courierTips.di.CourierTipsWidgetModule_ProvideWidgetFactory.provideWidget(this.courierTipsWidgetModule, courierTipsConfig(), new ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.CourierTipsViewMapper());
        }

        private Widget2 provideWidget71() {
            return DeliveryProblemsWidgetModule_ProvideWidgetFactory.provideWidget(this.deliveryProblemsWidgetModule, deliveryProblemsConfig(), new DeliveryProblemsViewMapper());
        }

        private Widget2 provideWidget72() {
            return DeliveryToCharitiesInfoModule_ProvideWidgetFactory.provideWidget(this.deliveryToCharitiesInfoModule, deliveryToCharitiesInfoConfig(), new DeliveryToCharitiesInfoViewMapper());
        }

        private Widget2 provideWidget73() {
            return DeliveryWidgetV2Module_ProvideWidgetFactory.provideWidget(this.deliveryWidgetV2Module, deliveryWidgetV2Config(), new DeliveryWidgetV2OverlayViewMapper());
        }

        private Widget2 provideWidget74() {
            return DeliveryWidgetV3Module_ProvideWidgetFactory.provideWidget(this.deliveryWidgetV3Module, deliveryWidgetV3Config(), new DeliveryWidgetV3OverlayViewMapper());
        }

        private Widget2 provideWidget75() {
            return DeliveryWidgetBigOzonModule_ProvideWidgetFactory.provideWidget(this.deliveryWidgetBigOzonModule, deliveryWidgetBigOzonConfig(), new DeliveryWidgetV2OverlayViewMapper());
        }

        private Widget2 provideWidget76() {
            return HomeButtonWidgetModule_ProvideWidgetFactory.provideWidget(this.homeButtonWidgetModule, homeButtonConfig(), new HomeButtonViewMapper());
        }

        private Widget2 provideWidget77() {
            return IconButtonsWidgetModule_ProvideWidgetFactory.provideWidget(this.iconButtonsWidgetModule, iconButtonsConfig(), new IconButtonsViewMapper());
        }

        private Widget2 provideWidget78() {
            return InfoDropDownWidgetModule_ProvideWidgetFactory.provideWidget(this.infoDropDownWidgetModule, infoDropDownConfig(), new InfoDropDownItemViewMapper());
        }

        private Widget2 provideWidget79() {
            return IslandSeparatorWidgetModule_ProvideWidgetFactory.provideWidget(this.islandSeparatorWidgetModule, islandSeparatorConfig(), new IslandSeparatorViewMapper());
        }

        private Widget2 provideWidget8() {
            return OrderFiltersModule_ProvideWidgetFactory.provideWidget(this.orderFiltersModule, orderFiltersConfig(), new OrderFiltersViewMapper());
        }

        private Widget2 provideWidget80() {
            return OrderStatusLiveActivityWidgetModule_ProvideWidgetFactory.provideWidget(this.orderStatusLiveActivityWidgetModule, orderStatusLiveActivityConfig(), new OrderStatusLiveActivityViewMapper());
        }

        private Widget2 provideWidget81() {
            return ProductsInBotWidgetModule_ProvideWidgetFactory.provideWidget(this.productsInBotWidgetModule, productsInBotConfig(), new BotItemViewMapper(), new BotConfirmButtonViewMapper());
        }

        private Widget2 provideWidget82() {
            return SearchBarWidgetModule_ProvideWidgetFactory.provideWidget(this.searchBarWidgetModule, searchBarConfig2(), new ru.ozon.app.android.fresh.unsorted.widgets.searchBar.presentation.SearchBarViewMapper());
        }

        private Widget2 provideWidget83() {
            return TextBlockWidgetModule_ProvideWidgetFactory.provideWidget(textBlockConfig(), new TextBlockViewMapper());
        }

        private Widget2 provideWidget84() {
            return WholeSaleWidgetModule_ProvideWidgetFactory.provideWidget(this.wholeSaleWidgetModule, wholeSaleConfig(), new WholeSaleViewMapper());
        }

        private Widget2 provideWidget85() {
            return FreshServiceCarouselWidgetModule_ProvideWidgetFactory.provideWidget(this.freshServiceCarouselWidgetModule, freshServiceCarouselConfig(), new ServiceCarouselViewMapper());
        }

        private Widget2 provideWidget86() {
            return ExpressNavBarWidgetModule_ProvideWidgetFactory.provideWidget(this.expressNavBarWidgetModule, expressNavBarConfig(), new ExpressNavBarOverlayMapper());
        }

        private Widget2 provideWidget87() {
            return ExpressNavTitleWidgetModule_ProvideWidgetFactory.provideWidget(this.expressNavTitleWidgetModule, expressNavTitleConfig(), new ExpressNavTitleViewMapper());
        }

        private Widget2 provideWidget88() {
            return ExpressAvailabilityWidgetModule_ProvideWidgetFactory.provideWidget(this.expressAvailabilityWidgetModule, expressAvailabilityConfig(), new ExpressAvailabilityViewMapper());
        }

        private Widget2 provideWidget89() {
            return FeedbackCurtainWidgetModule_ProvideWidgetFactory.provideWidget(this.feedbackCurtainWidgetModule, feedbackCurtainConfig(), new FeedbackCurtainViewMapper());
        }

        private Widget2 provideWidget9() {
            return OrderGalleryWidgetModule_ProvideWidgetFactory.provideWidget(this.orderGalleryWidgetModule, orderGalleryConfig(), new OrderGalleryViewMapper());
        }

        private Widget2 provideWidget90() {
            return PromoOfferWidgetModule_ProvideWidgetFactory.provideWidget(this.promoOfferWidgetModule, promoOfferConfig(), new PromoOfferViewMapper());
        }

        private Widget2 provideWidget91() {
            return RecShelfWidgetModule_ProvideWidgetFactory.provideWidget(this.recShelfWidgetModule, recShelfConfig(), new RecShelfViewMapper());
        }

        private Widget2 provideWidget92() {
            return SeparatorBadgeWidgetModule_ProvideWidgetFactory.provideWidget(this.separatorBadgeWidgetModule, separatorBadgeConfig(), new SeparatorBadgeViewMapper());
        }

        private Widget2 provideWidget93() {
            return ImageBadgeListWidgetModule_ProvideWidgetFactory.provideWidget(this.imageBadgeListWidgetModule, imageBadgeListConfig(), new ImageBadgeListViewMapper());
        }

        private Widget2 provideWidget94() {
            return BottomContainerWidgetModule_ProvideWidgetFactory.provideWidget(this.bottomContainerWidgetModule, bottomContainerConfig(), new BottomContainerViewMapper());
        }

        private Widget2 provideWidget95() {
            return ProductsInBotV2WidgetModule_ProvideWidgetFactory.provideWidget(this.productsInBotV2WidgetModule, productsInBotV2Config(), new ProductsInBotV2ViewMapper());
        }

        private Widget2 provideWidget96() {
            return PdpAspectsWidgetModule_ProvideWidgetFactory.provideWidget(this.pdpAspectsWidgetModule, pdpAspectsConfig(), new PdpAspectsViewMapper());
        }

        private Widget2 provideWidget97() {
            return PdpNutritionInfoWidgetModule_ProvideWidgetFactory.provideWidget(this.pdpNutritionInfoWidgetModule, pdpNutritionInfoConfig(), new PdpNutritionInfoViewMapper());
        }

        private Set<Widget2> provideWidget98() {
            return FreshTileGridWidgetModule_ProvideWidgetFactory.provideWidget(this.freshTileGridWidgetModule, freshTileGridConfig(), new FreshTileGridBaseViewMapper(), new FreshTileGridMediumViewMapper(), new FreshTileGridMiniViewMapper(), new FreshTileGridPlugViewMapper(), headerApi());
        }

        private Widget2 provideWidget99() {
            return FreshPaymentScheduleWidgetModule_ProvideWidgetFactory.provideWidget(freshPaymentScheduleConfig(), new FreshPaymentScheduleViewMapper());
        }

        private Set<i> provideWidgetFactories$avia_prodGoogleAllVendorsRelease() {
            return TravelAviaWidgetFactoryModule_ProvideWidgetFactories$avia_prodGoogleAllVendorsReleaseFactory.provideWidgetFactories$avia_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Set<i> provideWidgetFactories$common_prodGoogleAllVendorsRelease() {
            return TravelGeneralWidgetV2Module_ProvideWidgetFactories$common_prodGoogleAllVendorsReleaseFactory.provideWidgetFactories$common_prodGoogleAllVendorsRelease(this.travelGeneralWidgetV2Module, this.jsonDeserializer);
        }

        private Set<i> provideWidgetFactory$widgets_prodGoogleAllVendorsRelease() {
            return CommonWidgetsV2DiModule_ProvideWidgetFactory$widgets_prodGoogleAllVendorsReleaseFactory.provideWidgetFactory$widgets_prodGoogleAllVendorsRelease(this.jsonDeserializer);
        }

        private Widget2 provideWidgets() {
            return FullTextSearchHeaderV3Module_ProvideWidgetsFactory.provideWidgets(fullTextSearchHeaderV3Config(), new FullTextSearchHeaderV3ViewMapper());
        }

        private Set<Widget2> provideWidgets$avia_prodGoogleAllVendorsRelease() {
            return TravelAviaWidgetV2Module_Companion_ProvideWidgets$avia_prodGoogleAllVendorsReleaseFactory.provideWidgets$avia_prodGoogleAllVendorsRelease(orderFlightInfoConfig(), new OrderFlightInfoViewMapper(), servicePackSelectionV3Config(), new ServicePackSelectionV3ViewMapper(), servicePackageSelectionConfig(), new ServicePackageSelectionViewMapper(), new ServicePackageSelectionButtonNoUiViewMapper(), travelServicePackageSelectedV3Config(), new TravelServicePackageSelectedV3ViewMapper(), flightSeatsLegendConfig(), new FlightSeatsLegendViewMapper(), insurancePanelConfig(), new InsurancePanelViewMapper(), helpInsuranceConfig(), new HelpInsuranceViewMapper(), travelFlightCheckTariffV2Config(), new TravelFlightCheckTariffV2ViewMapper(), luggageRequirementsV2Config(), new LuggageRequirementsV2ViewMapper(), additionalLuggageTotalShadedConfig(), new AdditionalLuggageTotalViewMapper(), tariffLuggageV2Config(), new TariffLuggageV2ViewMapper(), additionalServiceCardConfig(), new AdditionalServiceCardViewMapper(), stepperConfig(), new StepperViewMapper(), additionalLuggageV2Config(), new AdditionalLuggageV2ViewMapper(), new AviaSearchResultV3ViewMapper(), aviaSearchResultV3Config(), aviaCheckTariffsConfig(), new AviaCheckTariffsViewMapper(), new AviaCheckTariffsTitleViewMapper(), aviaCheckTariffsPriceDetailsConfig(), new AviaCheckTariffsSubtitleViewMapper(), new AviaCheckTariffsLuggageCellViewMapper(), new AviaCheckTariffsPriceDetailsViewMapper(), aviaBookedTicketInfoConfig(), new AviaBookedTicketInfoViewMapper(), flightSeatsSchemeConfig(), new FlightSeatsSchemeBlockViewMapper(), new FlightSeatsSchemeTotalStickyViewMapper(), new FlightSeatsSchemePassengersBlockStickyViewMapper(), aviaDetailedInfoV3Config(), new AviaDetailedInfoV3TabsViewMapper(), new AviaDetailedInfoV3ViewMapper(), flightRouteDetailsConfig(), new FlightRouteDetailsViewMapper(), new FlightRouteDetailsAnnotationViewMapper(), new ListTrackingViewMapper(), buyTogetherConfig(), new BuyTogetherViewMapper(), aviaComplexSearchFormConfig(), new AviaComplexSearchFormViewMapper(), passengersLuggageSelectionConfig(), new PassengersLuggageSelectionViewMapper(), returnPolicyConfig(), new ReturnPolicyViewMapper(), directFlightsDropdownConfig(), new DirectFlightsDropdownViewMapper());
        }

        private Set<i> provideWidgets$avia_prodGoogleAllVendorsRelease2() {
            return TravelAviaWidgetFactoryModule_ProvideWidgets$avia_prodGoogleAllVendorsReleaseFactory.provideWidgets$avia_prodGoogleAllVendorsRelease(new ListTrackingViewMapper());
        }

        private Set<Widget2> provideWidgets$b2b_prodGoogleAllVendorsRelease() {
            return B2bWidgetsModule_ProvideWidgets$b2b_prodGoogleAllVendorsReleaseFactory.provideWidgets$b2b_prodGoogleAllVendorsRelease(legalDocsConfig(), edoDatePickerConfig(), docsDeliveryFormConfig(), accompanyingDocsDownloadingConfig(), new LegalDocsEmptyViewMapper(), new LegalDocsTitleViewMapper(), new LegalDocsOrderViewMapper(), new EdoDatePickerViewMapper(), new DocsDeliveryFormViewMapper(), new DocsDeliverySubmitButtonViewMapper(), new AccompanyingDocsDownloadingViewMapper(), simpleInfoConfig(), new SimpleInfoBodyViewMapper(), new SimpleInfoFooterViewMapper(), addEdoConfigV2(), new AddEdoFormViewMapperV2(), new AddEdoButtonsViewMapperV2(), addLegalAddressMobileConfig(), new AddLegalAddressMobileViewMapper(), addLegalInnMobileConfig(), new AddLegalInnMobileViewMapper(), addLegalMobileConfig(), new AddLegalMobileViewMapper(), userLegalEntitiesConfig(), new UserLegalEntitiesViewMapper(), userLegalEntitiesConfigV2(), new UserLegalEntitiesViewMapperV2(), checkLegalInfoConfig(), new CheckLegalInfoViewMapper(), accountListMobileConfig(), new AccountListMobileViewMapper(), bannerEdoConfig(), trustFactorsConfig(), faqConfig(), companyCardConfig(), edoProvidersConfig(), addLegalConfig(), new BannerEdoViewMapper(), new TrustFactorsViewMapper(), legalDetailsEditorConfig(), new FaqViewMapper(), new CompanyCardViewMapper(), new EdoProvidersViewMapper(), new LegalDetailsEditorViewMapper(), new AddLegalViewMapper(), docsTableConfig(), new DocsTableViewMapper(), reconciliationActsDeclinerConfig(), reconciliationActsDeclinerViewMapper(), statusEdoConfig(), new StatusEdoViewMapper(), currentConsigneeConfig(), new CurrentConsigneeViewMapper(), consigneeListConfig(), new ConsigneeListViewMapper(), addConsigneeConfig(), new AddConsigneeViewMapper(), statusBannerConfig(), new StatusBannerViewMapper(), verificationEdoCheckingUserConfig(), new VerificationEdoCheckingUserViewMapper(), verificationEdoCheckingOperatorConfig(), new VerificationEdoCheckingOperatorViewMapper(), docsTableV2Config(), new DocsTableV2TitleViewMapper(), new DocsTableV2DocumentViewMapper(), registrationConfig(), new RegistrationViewMapper(), changeEmailConfig(), new ChangeEmailViewMapper(), employeesTableConfig(), new EmployeesTableViewMapper(), roleInvitationCreatorConfig(), new RoleInvitationCreatorContentViewMapper(), new RoleInvitationCreatorSubmitViewMapper());
        }

        private Set<Widget2> provideWidgets$b2b_prodGoogleAllVendorsRelease2() {
            return TravelB2BWidgetV2Module_ProvideWidgets$b2b_prodGoogleAllVendorsReleaseFactory.provideWidgets$b2b_prodGoogleAllVendorsRelease(travelCompanyDocumentsConfig(), new TravelCompanyDocumentsViewMapper(), promoBannerB2BConfig(), new PromoBannerB2BViewMapper(), travelDocumentsToEmailConfig(), new TravelDocumentsToEmailHeaderViewMapper(), new TravelDocumentsToEmailListViewMapper(), travelModalPersonalManagerConfig(), new TravelModalPersonalManagerViewMapper(), accountBalanceBarConfig(), new AccountBalanceBarViewMapper(), accountBalanceInfoConfig(), new AccountBalanceInfoViewMapper(), b2bContactUsConfig(), new B2bContactUsViewMapper(), travelPersonalAccountReplenishmentConfig(), new TravelPersonalAccountReplenishmentViewMapper());
        }

        private Set<Widget2> provideWidgets$booking_prodGoogleAllVendorsRelease() {
            return TravelGeneralBookingWidgetV2Module_Companion_ProvideWidgets$booking_prodGoogleAllVendorsReleaseFactory.provideWidgets$booking_prodGoogleAllVendorsRelease(travelBookingImportantInformationConfig(), new TravelBookingImportantInformationViewMapper(), travelBookingImportantInformationPlaceholderConfig(), new TravelBookingImportantInformationPlaceholderViewMapper(), travelSearchSortAndFilterConfig(), new TravelSearchSortAndFilterViewMapper(), passengersDirectoryV2Config(), new PassengersDirectoryV2ViewMapper(), passengersDirectoryV3Config(), new PassengersDirectoryV3InputNoUiViewMapper(), new PassengersDirectoryV3ButtonNoUiViewMapper(), new PassengersDirectoryV3CategoryViewMapper(), new PassengersDirectoryV3EmptyStateViewMapper(), passengersLuggageButtonConfig(), new PassengersLuggageButtonNoUiViewMapper(), passengersMatcherV2Config(), new PassengersMatcherV2ViewMapper(), new PassengersMatcherV2ButtonNoUiViewMapper(), quickFiltersConfig(), new QuickFiltersOverlayViewMapper(), new QuickFiltersSimpleViewMapper(), new QuickFiltersDynamicStickyViewMapper(), searchResultsNavTitleConfig(), new SearchResultsNavTitleViewMapper(), searchResultsNavTitleV2Config(), new SearchResultsNavTitleV2ViewMapper(), travelQuickFiltersConfig(), new TravelQuickFiltersViewMapper(), new TravelQuickFiltersOverlayViewMapper(), customerContactsV2Config(), new CustomerContactsV2ViewMapper(), new CustomerContactsScrollerViewMapper(), travelAddNewPassengerFormV2Config(), new TravelAddNewPassengerFormV2ViewMapper(), travelAddNewPassengerFormV3Config(), new TravelAddNewPassengerFormV3ViewMapper(), travelAddNewPassengerFormClearButtonConfig(), new TravelAddNewPassengerFormClearButtonViewMapper(), hotelsBookAdditionsConfig(), new HotelsBookAdditionsViewMapper(), hotelsBookTotalV2Config(), new HotelsBookTotalV2ViewMapper(), additionalServicesConfig(), new AdditionalServicesViewMapper(), hotelsCheckoutTitleConfig(), new HotelsCheckoutTitleViewMapper(), new HotelsCheckoutTitleOverlayViewMapper());
        }

        private Set<Widget2> provideWidgets$cabinet_prodGoogleAllVendorsRelease() {
            return DeliveryCabinetWidgetV2Module_ProvideWidgets$cabinet_prodGoogleAllVendorsReleaseFactory.provideWidgets$cabinet_prodGoogleAllVendorsRelease(this.deliveryCabinetWidgetV2Module, profileAvatarConfig2(), new ru.ozon.app.android.cabinet.profileAvatar.core.ProfileAvatarViewMapper());
        }

        private Set<Widget2> provideWidgets$common_prodGoogleAllVendorsRelease() {
            return TravelGeneralWidgetV2Module_ProvideWidgets$common_prodGoogleAllVendorsReleaseFactory.provideWidgets$common_prodGoogleAllVendorsRelease(this.travelGeneralWidgetV2Module, emptyStateWidgetConfig(), new EmptyStateFullWidgetViewMapper(), new EmptyStateFullBottomButtonsWidgetViewMapper(), new EmptyStateOverlayWidgetViewMapper(), new EmptyStateWrapWidgetViewMapper(), travelHiddenErrorTimeoutConfig(), new TravelHiddenErrorTimeoutNoUiViewMapper(), travelFiltersButtonConfig(), new TravelFiltersButtonViewMapper(), travelImportantInfoModalConfig(), new TravelImportantInfoModalViewMapper(), modalTogglerConfig(), new ModalTogglerViewMapper(), disposableBannerConfig(), new DisposableBannerViewMapper(), pricesHistogramConfig(), new PricesHistogramViewMapper(), pricesHistogramV2Config(), new PricesHistogramV2ViewMapper(), travelNavTitleV3Config(), new TravelNavTitleV3ViewMapper(), travelTextConfig(), new TravelTextViewMapper(), new TravelTextTopOverlayViewMapper(), new TravelTextBottomOverlayViewMapper(), travelTextV2Config(), new TravelTextV2ViewMapper(), new TravelTextV2StickyTopViewMapper(), new TravelTextV2StickyBottomViewMapper(), redirectSnackBarConfig(), notificationInformerConfig(), new NotificationInformerViewMapper(), buttonWidgetConfig(), new ButtonWidgetViewMapper(), new ButtonWidgetStickyViewMapper(), buttonWidgetV2Config(), new ButtonWidgetV2ViewMapper(), new ButtonWidgetV2StickyViewMapper(), buttonsActionSheetConfig(), new ButtonsActionSheetViewMapper(), travelLinkButtonConfig(), new TravelLinkButtonViewMapper(), new TravelPaymentV3ViewMapper(), travelPaymentV3Config(), travelCellListConfig(), new TravelCellListViewMapper(), travelTextWithBadgeConfig(), new TravelTextWithBadgeViewMapper(), filtersButtonWithCounterConfig(), new FiltersButtonWithCounterViewMapper(), iconButtonConfig(), new IconButtonViewMapper(), travelCellListV2Config(), new TravelCellListV2TitleViewMapper(), new TravelCellListV2ListViewMapper(), travelCellListV3Config(), new TravelCellListV3ViewMapper(), new ListTrackingViewMapper(), travelTextWithSubtitleConfig(), new TravelTextWithSubtitleViewMapper(), buttonWithInformationConfig(), new ButtonWithInformationViewMapper(), new VerticalButtonWithInformationViewMapper(), travelInfoBadgeConfig(), new TravelInfoBadgeViewMapper(), pendingActionConfig(), new PendingActionNoUiViewMapper(), navBarButtonConfig(), new NavBarButtonViewMapper(), timeoutAndActionConfig(), new TimeoutAndActionViewMapper(), overlayButtonsConfig(), new OverlayButtonsViewMapper(), bonusCellToggleConfig(), new BonusCellToggleViewMapper(), promoCodeApplierConfig(), new PromoCodeApplierViewMapper(), notificationSubscriptionBannerConfig(), new NotificationSubscriptionBannerViewMapper(), travelPaymentV4Config(), new TravelPaymentV4ViewMapper(), badgeListConfig2(), new BadgeListViewMapper(), travelImageConfig(), new TravelImageViewMapper(), scrollAnchorConfig(), new ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.presentation.ScrollAnchorViewMapper(), railwayScrollPriceCalendarConfig(), new RailwayScrollPriceCalendarViewMapper(), new RailwayScrollPriceCalendarStickyViewMapper());
        }

        private Set<Widget2> provideWidgets$core_prodGoogleAllVendorsRelease() {
            return UgcCoreWidgetsModule_ProvideWidgets$core_prodGoogleAllVendorsReleaseFactory.provideWidgets$core_prodGoogleAllVendorsRelease(this.ugcCoreWidgetsModule, namedViewMapper2OfAndAndArray(), singleReviewConfig(), listReviewsConfig(), new ListReviewsSortsViewMapper(), new ListReviewsMoreViewMapper(), commentsListV3Config(), new CommentsListV3ViewMapper(), new CommentInputV3NoUiViewMapper(), new CommentsHeaderV3NoUiViewMapper(), new CommentsListHeaderV3ViewMapper(), new CommentsScrollNoUiViewMapper(), reportAbuseFormConfig(), new ReportAbuseFormViewMapper(), new ReportAbuseFormButtonViewMapper(), new ReviewGalleryViewMapper(), new ReviewGalleryV2NoUiViewMapper(), reviewGalleryV2Config(), reviewGalleryFeedConfig(), new ReviewGalleryFeedViewMapper(), new ReviewGalleryFeedRoundedBottomViewMapper(), reviewGalleryPreviewConfig(), new ReviewGalleryPreviewViewMapper(), tilesReviewsListConfig(), new SkuThinScrollViewMapper(), selectionItemDescriptionConfig(), new SelectionItemDescriptionTitleViewMapper(), new SelectionItemDescriptionTextViewMapper(), new SelectionItemDescriptionSocialHeaderViewMapper(), new SelectionItemDescriptionNoUiViewMapper(), new PlainTextViewMapper2(), new SeparatorViewMapper());
        }

        private Set<Widget2> provideWidgets$cs_orders_prodGoogleAllVendorsRelease() {
            return OrdersCommonModule_ProvideWidgets$cs_orders_prodGoogleAllVendorsReleaseFactory.provideWidgets$cs_orders_prodGoogleAllVendorsRelease(this.ordersCommonModule, commonBarcodeConfig(), new CommonBarcodeViewMapper(), new CommonBarcodeFullWidthViewMapper());
        }

        private Set<Widget2> provideWidgets$hotels_prodGoogleAllVendorsRelease() {
            return TravelHotelsWidgetV2Module_Companion_ProvideWidgets$hotels_prodGoogleAllVendorsReleaseFactory.provideWidgets$hotels_prodGoogleAllVendorsRelease(hotelsPageHeaderConfig(), hotelsPageHeaderRoundedConfig(), new HotelsPageHeaderViewMapper(), hotelsPageDetailsFullConfig(), new HotelsPageDetailsFullViewMapper(), hotelsPageDetailsConfig(), new HotelsPageDetailsViewMapper(), hotelsRoomsDetailsFullConfig(), new HotelsRoomsDetailsFullViewMapper(), hotelsRoomsDetailsFullV3Config(), new HotelsRoomsDetailsFullV3ViewMapper(), travelHotelCardV3Config(), new TravelHotelCardV3ViewMapper(), travelRoomsGuestsCardConfig(), new TravelRoomsGuestsCardViewMapper(), travelRoomsGuestsCardCompactConfig(), new TravelRoomsGuestsCardCompactViewMapper(), hotelsPageReviewsConfig(), new HotelsPageReviewsViewMapper(), hotelsReviewsConfig(), new HotelsReviewsViewMapper(), addHotelGuestsV5Config(), new AddHotelGuestsV5ViewMapper(), new ListTrackingViewMapper(), new AddHotelGuestsScrollerViewMapper(), hotelsSearchResultsV5Config(), new HotelsSearchResultsV5CardViewMapper(), new HotelsSearchResultsV5SkeletonViewMapper(), new HotelsSearchResultsV5LoadingNoUiViewMapper(), new HotelsSearchResultsV5MapOverlayViewMapper(), new HotelsSearchResultsV5OnboardingNoUiViewMapper(), new HotelsSearchResultsV5NotificationViewMapper(), cellWithTimerConfig(), new CellWithTimerViewMapper(), skiResortInfoConfig(), new SkiResortInfoViewMapper(), transparentNavBarV2Config(), new TransparentNavBarV2ViewMapper(), hotelsGalleryConfig(), new HotelsGalleryViewMapper(), hotelsHorizontalShelvesConfig(), new HotelsHorizontalShelvesViewMapper(), hotelsVerticalShelvesConfig(), new HotelsVerticalShelvesViewMapper(), hotelsOrderRoomsDetailsConfig(), new HotelsOrderRoomsDetailsViewMapper(), hotelsPageButtonV5Config(), new HotelsPageButtonV5OverlayViewMapper(), hotelsGalleryFeedConfig(), new HotelsGalleryFeedViewMapper());
        }

        private Set<i> provideWidgets$hotels_prodGoogleAllVendorsRelease2() {
            return TravelHotelsWidgetFactoryModule_ProvideWidgets$hotels_prodGoogleAllVendorsReleaseFactory.provideWidgets$hotels_prodGoogleAllVendorsRelease(new ListTrackingViewMapper(), this.jsonDeserializer);
        }

        private Set<Widget2> provideWidgets$main_prodGoogleAllVendorsRelease() {
            return TravelGeneralMainWidgetV2Module_Companion_ProvideWidgets$main_prodGoogleAllVendorsReleaseFactory.provideWidgets$main_prodGoogleAllVendorsRelease(new CalendarConfig(), new CalendarViewMapper(), calendarPriceLegendConfig(), new CalendarPriceLegendViewMapper(), mainTabsConfig(), new MainTabsViewMapper(), miniAppTitleConfig(), new MiniAppTitleViewMapper(), new PointsInputWidgetConfig(), new PointInputNoUiViewMapper(), priceCalendarFooterConfig(), new PriceCalendarFooterViewMapper(), priceCalendarFooterV3Config(), new PriceCalendarFooterV3BottomViewMapper(), priceCalendarHeaderV3Config(), new PriceCalendarHeaderV3OverlayViewMapper(), searchFormV4Config(), new SearchFormV4ViewMapper(), searchFormBarConfig(), new SearchFormBarViewMapper(), stickyPromoRedirectV2Config(), new StickyPromoRedirectV2ViewMapper(), topTravelModalConfig(), new TopTravelModalViewMapper(), travelPassengersCountSelectorConfig(), new TravelPassengersCountSelectorViewMapper(), travelPriceCalendarV3Config(), new TravelPriceCalendarV3ViewMapper(), travelSearchBarConfig(), new TravelSearchBarViewMapper(), unpaidOrderListConfig(), new UnpaidOrderListViewMapper(), unpaidOrderCounterConfig(), new TravelNotificationModalCheckNoUiViewMapper(), travelNotificationModalCheckConfig(), hotTicketsConfig(), new HotTicketsViewMapper(), new ListTrackingViewMapper());
        }

        private Set<Widget2> provideWidgets$marketing_prodGoogleAllVendorsRelease() {
            return MarketingWidgets2Module_ProvideWidgets$marketing_prodGoogleAllVendorsReleaseFactory.provideWidgets$marketing_prodGoogleAllVendorsRelease(this.marketingWidgets2Module, pdpCouponListV2Config(), new PdpCouponListV2ViewMapper(), wannaDiscountDecisionConfig(), new WannaDiscountDecisionViewMapper(), wannaDiscountV2Config(), new WannaDiscountV2ViewMapper(), sellerTransparencyProfileConfig(), new SellerTransparencyProfileViewMapper(), new SellerTransparencyV3ViewMapper(), sellerTransparencyV3Config(), badgeTimerConfig(), new BadgeTimerViewMapper(), enableNotificationsConfig(), new EnableNotificationsViewMapper(), notificationsSettingsConfig(), new NotificationsSettingsCellViewMapper(), new NotificationsSettingsTitleViewMapper(), notificationsSettingsSelectorConfig(), new NotificationsSettingsSelectorViewMapper(), highlightProductsConfig(), new HighlightProductsOverlayViewMapper(), new HighlightProductsViewMapper(), highlightsWrapperConfig(), new HighlightsCouponOverlayViewMapper(), promoStickyBubbleConfig(), new PromoStickyBubbleViewMapper(), new CartButtonViewMapper(), couponConfig(), new CouponViewMapper(), actionProgressConfig(), new ActionProgressOverlayViewMapper(), new ru.ozon.app.android.marketing.widgets.actionProgress.core.ActionProgressViewMapper(), new ru.ozon.app.android.marketing.ui.trustfactors.core.TrustFactorsViewMapper(), trustFactorsConfig2(), shopButtonsConfig(), new ShopButtonsViewMapper(), sellerActionLadderConfig(), new SellerActionLadderViewMapper(), sellerActionPreviewConfig(), new SellerActionPreviewDsCellViewMapper(), new SellerActionPreviewSeparatorViewMapper(), new SellerActionPreviewProgressLadderViewMapper(), new SellerActionPreviewProgressLadderCellViewMapper(), new SellerActionPreviewAsyncViewMapper(), stickyLadderConfig(), new StickyLadderViewMapper());
        }

        private Set<Widget2> provideWidgets$messenger_prodGoogleAllVendorsRelease() {
            return MessengerWidgetsV2Module_ProvideWidgets$messenger_prodGoogleAllVendorsReleaseFactory.provideWidgets$messenger_prodGoogleAllVendorsRelease(messengerCounterV2Config(), new MessengerCounterV2ViewMapper(), chatListConfig(), new CommonIslandSeparatorViewMapper2(), new CellListV2ViewMapper(), chatListHeaderConfig(), new ChatListHeaderViewMapper());
        }

        private Set<Widget2> provideWidgets$old_widgets_prodGoogleAllVendorsRelease() {
            return TravelOldWidgetsWidgetV2Module_Companion_ProvideWidgets$old_widgets_prodGoogleAllVendorsReleaseFactory.provideWidgets$old_widgets_prodGoogleAllVendorsRelease(reportDocumentConfig(), new ReportDocumentViewMapper(), travelModalPriceDetailInformationConfig(), new TravelModalPriceDetailInformationHeaderViewMapper(), new TravelModalPriceDetailInformationViewMapper(), travelScrollPriceCalendarV2Config(), new TravelScrollPriceCalendarV2ViewMapper(), travelPriceDetailInformationConfig(), new TravelPriceDetailInformationViewMapper(), new TravelPriceDetailInformationNoUiViewMapper(), travelSortingConfig(), new TravelSortingViewMapper(), travelScrollPriceCalendarConfig(), new TravelScrollPriceCalendarViewMapper());
        }

        private Set<Widget2> provideWidgets$order_prodGoogleAllVendorsRelease() {
            return TravelGeneralOrderWidgetV2Module_Companion_ProvideWidgets$order_prodGoogleAllVendorsReleaseFactory.provideWidgets$order_prodGoogleAllVendorsRelease(buttonsBarConfig(), new ButtonsBarViewMapper(), new ButtonsBarStickyViewMapper(), horizontalIconButtonsConfig(), new HorizontalIconButtonsViewMapper(), orderHeaderConfig(), new OrderHeaderViewMapper(), orderPassengersDetailsConfig(), new OrderPassengersDetailsViewMapper(), paymentDetailsConfig(), new PaymentDetailsViewMapper(), stepListWithScaleConfig(), new StepListWithScaleViewMapper(), travelOrderLinksConfig(), new TravelOrderLinksViewMapper(), travelOrderListMobileConfig(), new TravelOrderListTimeViewMapper(), new TravelOrderListMobileViewMapper(), buyersContactsConfig(), new BuyersContactsViewMapper(), travelPriceDetailInformationV2Config(), new TravelPriceDetailInformationV2ViewMapper(), new TravelPriceDetailInformationV2NoUiViewMapper(), travelModalPriceDetailInformationV3Config(), new TravelModalPriceDetailInformationV3ViewMapper(), travelModalPriceDetailInformationV4Config(), new TravelModalPriceDetailInformationV4ViewMapper(), travelOrderNavContentConfig(), new TravelOrderNavContentViewMapper(), orderPaymentStatusConfig(), new OrderPaymentStatusViewMapper(), new OrderPaymentStatusTimerViewMapper(), orderNavBarConfig(), new OrderNavBarOverlayViewMapper());
        }

        private Set<Widget2> provideWidgets$orderdetails_prodGoogleAllVendorsRelease() {
            return CSOrderDetailsWidgets2Module_ProvideWidgets$orderdetails_prodGoogleAllVendorsReleaseFactory.provideWidgets$orderdetails_prodGoogleAllVendorsRelease(copyButtonConfig(), new CopyButtonViewMapper(), orderDeliveryDetailConfig(), new OrderDeliveryDetailActionsViewMapper(), new OrderDeliveryDetailHeaderViewMapper(), new OrderDeliveryDetailIconButtonViewMapper(), new OrderDeliveryDetailLeaveAtDoorViewMapper(), new OrderDeliveryDetailLastDividerViewMapper());
        }

        private Set<Widget2> provideWidgets$payout_prodGoogleAllVendorsRelease() {
            return UgcPayoutWidgetsModule_ProvideWidgets$payout_prodGoogleAllVendorsReleaseFactory.provideWidgets$payout_prodGoogleAllVendorsRelease(this.ugcPayoutWidgetsModule, pinnedReviewConfig(), new PinnedReviewViewMapper(), promoReviewProductsV3Config(), new PromoReviewItemViewMapper(), new PromoReviewSectionHeaderViewMapper(), new SeparatorViewMapper(), new CommonIslandSeparatorViewMapper2());
        }

        private Set<Widget2> provideWidgets$pdp_old_widgets_prodGoogleAllVendorsRelease() {
            return PdpOldWidgetsModule_ProvideWidgets$pdp_old_widgets_prodGoogleAllVendorsReleaseFactory.provideWidgets$pdp_old_widgets_prodGoogleAllVendorsRelease(this.pdpOldWidgetsModule, addToComparisonButtonConfig(), new AddToComparisonButtonViewMapper(), captionConfig(), new CaptionViewMapper(), marketingActionsConfig(), new MarketingActionsViewMapper());
        }

        private Set<Widget2> provideWidgets$pdp_prodGoogleAllVendorsRelease() {
            return PdpWidgetsModule_ProvideWidgets$pdp_prodGoogleAllVendorsReleaseFactory.provideWidgets$pdp_prodGoogleAllVendorsRelease(this.pdpWidgetsModule, new WidgetImagePlaceholderViewMapper(), isFavoriteProductConfig(), installmentPurchaseConfig(), new InstallmentPurchaseViewMapper(), new InstallmentPeriodsViewMapper(), new InstallmentTitleViewMapper(), descriptionAccordionConfig(), new DescriptionAccordionViewMapper(), publishedAtConfig(), new PublishedAtViewMapper(), priceActionsConfig(), new PriceActionsViewMapper(), priceCellConfig(), new PriceCellViewMapper(), priceV2Config(), new PriceV2InfoViewMapper(), new PriceV2MultiplicityViewMapper(), new PriceV2MainPriceViewMapper(), new PriceV2SeparatorViewMapper(), priceV4Config(), new PriceV4TopViewMapper(), new PriceV4BottomViewMapper(), new PriceV4TopWithFinBadgeViewMapper(), new PriceV4TopWithStarsBadgeViewMapper(), new PriceV4BottomWithFinBadgeViewMapper(), new PriceV4BottomPriceWithBadgeViewMapper(), new PriceV4BottomPriceViewMapper(), new PriceV4BottomPriceBanksViewMapper(), new PriceV4BottomPriceBanksWithBadgeViewMapper(), sellerPointsConfig(), new SellerPointsViewMapper(), badgeListConfig(), new ru.ozon.app.android.pdp.widgets.badgeList.presentation.flex.BadgeListViewMapper(), new BadgeListWidgetPlaceholderViewMapper(), new ScrollableBadgeListViewMapper(), new ScrollableBadgeListWidgetPlaceholderViewMapper(), textDescriptionConfig(), new TextDescriptionViewMapper(), characteristicsConfig(), new CharacteristicsViewMapper(), galleryV3Config(), galleryV4Config(), new GalleryV4FullStateViewMapper(), new GalleryV4SimpleStateViewMapper(), galleryV5Config(), new GalleryV5FullStateViewMapper(), new GalleryV5SimpleStateViewMapper(), new GalleryV5FullStateSingleButtonViewMapper(), new GalleryV3ViewMapper(), new GalleryV3EmptyStateViewMapper(), deliveryConfigV5(), new DeliveryV5ViewMapper(), deliveryV6Config(), new AsyncDeliveryPlaceholderViewMapper(), new DeliveryV6AsyncPlaceholderViewMapper(), new DeliveryV6HeaderAnnotationViewMapper(), new DeliveryV6HeaderTitleViewMapper(), new DeliveryV6HeaderButtonViewMapper(), new DeliveryV6SectionsViewMapper(), new DeliveryV6FooterViewMapper(), sellerConfig(), new SellerViewMapper(), cartButtonV4Config(), new CartViewV4Mapper(), new CartViewV4BottomSheetMapper(), new DoubleCartV4ViewMapper(), new DoubleCartV4BottomSheetViewMapper(), new DoubleCartWithBadgeV4ViewMapper(), new DoubleCartWithBadgeV4BottomSheetViewMapper(), new PlainViewV4Mapper(), new SubscribeViewV4Mapper(), cartButtonQuantConfig(), new CartQuantViewMapper(), new DoubleCartQuantViewMapper(), new PlainQuantViewMapper(), new SubscribeQuantViewMapper(), nutritionInfoV2Config(), new NutritionIfoV2ViewMapper(), brandConfig(), new OriginalBrandViewMapper(), new OriginalBrandWidgetPlaceholderViewMapper(), new DsCellBrandViewMapper(), new DsCellBrandWidgetPlaceholderViewMapper(), new SimpleBrandViewMapper(), new SimpleBrandWidgetPlaceholderViewMapper(), new ButtonBrandViewMapper(), new ButtonBrandWidgetPlaceholderViewMapper(), sellerV4Config(), new SellerV4SimpleStateViewMapper(), new SellerV4ListStateViewMapper(), new SellerV4FullStateViewMapper(), sellerV7Config(), new SellerV7HeaderViewMapper(), new SellerV7HeaderWidgetPlaceholderViewMapper(), new SellerV7SimpleHeaderViewMapper(), new SellerV7SimpleHeaderWidgetPlaceholderViewMapper(), new SellerV7IslandsCellViewMapper(), new SellerV7IslandsCellWidgetPlaceholderViewMapper(), new SellerV7SimpleCellViewMapper(), new SellerV7SimpleCellWidgetPlaceholderViewMapper(), selectSellerConfig(), new SelectSellerViewMapper(), new SelectSellerBrandViewMapper(), helpfulHintsConfig(), new HelpfulHintsNoUIMapper(), richContentConfig(), new RichContentViewMapper(), new RichContentBillboardViewMapper(), new RichContentSpacerViewMapper(), new RichContentTextViewMapper(), new RichContentDoubleTileViewMapper(), new RichContentBulletListViewMapper(), new RichContentImageListViewMapper(), new RichContentNumberListViewMapper(), aspectsV2Config(), aspectsCompactV2Config(), new AspectsCompactV2TextViewMapper(), new AspectsCompactV2ImageViewMapper(), new AspectsCompactV2ColorViewMapper(), new AspectsCompactV2TextIconViewMapper(), new AspectsCompactV2TilesViewMapper(), new AspectsCompactV2MediaViewMapper(), new AspectsCompactV2PackViewMapper(), new AspectV2HeaderViewMapper(), new AspectV2FooterViewMapper(), new AspectV2TextViewMapper(), new AspectV2ColorViewMapper(), new AspectV2MediaViewMapper(), new AspectsV2PackViewMapper(), new AspectV2TileViewMapper(), new AspectV2ImageViewMapper(), new AspectV2TextIconViewMapper(), new AspectV2ImageTitleViewMapper(), new ApplyButtonViewMapper(), aspectProductV2Config(), new AspectProductV2ViewMapper(), crossSaleConfig(), new CrossSaleViewMapper(), refreshPdpProcessorConfig(), new RefreshPdpProcessorViewMapper(), translateButtonConfig(), new ru.ozon.app.android.pdp.widgets.translateButton.core.TranslateButtonViewMapper(), sellerSortSwitcherConfig(), new SellerSortSwitcherViewMapper(), new SellerSortSwitcherStickyViewMapper(), galleryFullViewConfig(), new GalleryFullViewViewMapper(), tagsConfig(), new TagsViewMapper(), sellerSimpleConfig(), new SellerSimpleViewMapper(), markdownConfig(), new MarkdownViewMapper(), outOfStockConfig(), new OutOfStockViewMapper(), preOrderSubscriptionButtonConfig(), new PreOrderSubscriptionButtonViewMapper(), otherSellersConfig(), new OtherSellersTitleViewMapper(), new OtherSellersSellerViewMapper(), new OtherSellersFooterViewMapper(), cashbackPointsConfig(), new CashbackPointsSingleItemViewMapper(), new CashbackPointsDoubleItemViewMapper(), aspectsV4Config(), new AspectsV4HorizontalImageViewMapper(), new AspectsV4FlexImageViewMapper(), new AspectsV4InfoExpandableTextViewMapper(), new AspectsV4InfoSimpleTextViewMapper(), new AspectsV4MarkdownReasonViewMapper(), new AspectsV4FlexSizeViewMapper(), new AspectsV4HorizontalSizeViewMapper(), pdpNavTitleConfig(), new PdpNavTitleViewMapper(), navBarConfig(), new NavBarViewMapper(), productStarsTileConfig(), new ru.ozon.app.android.pdp.widgets.productStarsTile.core.ProductStarsTileViewMapper(), wholesaleInputButtonConfig(), new WholesaleInputButtonViewMapper(), new CartButtonV5ViewMapper(), cartButtonV5Config());
        }

        private Set<Widget2> provideWidgets$services_prodGoogleAllVendorsRelease() {
            return TravelGeneralServicesWidgetV2Module_Companion_ProvideWidgets$services_prodGoogleAllVendorsReleaseFactory.provideWidgets$services_prodGoogleAllVendorsRelease(additionalReturnServiceCellConfig(), new AdditionalReturnServiceCellViewMapper(), additionalServiceCellConfig(), new AdditionalServiceCellViewMapper(), additionalServicesOfferConfig(), additionalServicesOfferShadedConfig(), new AdditionalServicesOfferViewMapper(), additionalServicesTotalConfig(), additionalServicesTotalShadedConfig(), new AdditionalServicesTotalViewMapper(), hiddenQueryServicesManagerConfig(), new HiddenQueryServicesManagerViewMapper(), infoPopupConfig(), new InfoPopupViewMapper(), infoPopupV2Config(), new InfoPopupV2ViewMapper(), infoPopupV4Config(), new InfoPopupV4ViewMapper(), new InfoPopupV4StickyViewMapper(), serviceBlockConfig(), serviceBlockShadedConfig(), new ServiceBlockViewMapper(), new TextInfoCellsViewMapper(), textInfoCellsConfig());
        }

        private Set<Widget2> provideWidgets$session_prodGoogleAllVendorsRelease() {
            return FlashCallWidget2Module_ProvideWidgets$session_prodGoogleAllVendorsReleaseFactory.provideWidgets$session_prodGoogleAllVendorsRelease(this.flashCallWidget2Module, requestPhoneAccessWidgetConfig(), new RequestPhoneAccessViewMapper());
        }

        private Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease() {
            return MegaDrawModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory.provideWidgets$storefront_prodGoogleAllVendorsRelease(this.megaDrawModule, megaDrawConfig(), new MegaDrawViewMapper(), new HeaderViewMapper2());
        }

        private Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease2() {
            return NaviBlocksModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory.provideWidgets$storefront_prodGoogleAllVendorsRelease(this.naviBlocksModule, naviBlocksConfig(), new OneFrameNaviBlockViewMapper(), new CarouselNaviBlockViewMapper(), new CoupleNaviBlockViewMapper(), new OneFrameNaviBlockViewMapperNew(), new CarouselNaviBlockViewMapperNew(), new CoupleNaviBlockViewMapperNew(), new LastEmptyNaviBlockViewMapper());
        }

        private Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease3() {
            return NaviCategoriesModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory.provideWidgets$storefront_prodGoogleAllVendorsRelease(this.naviCategoriesModule, naviCategoriesConfig(), new SingleNaviCategoriesViewMapper(), new DoubleNaviCategoriesViewMapper(), new EmptyNaviCategoriesViewMapper());
        }

        private Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease4() {
            return NaviGridModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory.provideWidgets$storefront_prodGoogleAllVendorsRelease(this.naviGridModule, naviGridConfig(), new NaviGridHorizontalPairViewMapper(), new NaviGridAccentViewMapper(), new NaviGridVerticalCoupleViewMapper());
        }

        private Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease5() {
            return NaviGrid3Module_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory.provideWidgets$storefront_prodGoogleAllVendorsRelease(this.naviGrid3Module, naviGrid3Config(), new NaviGrid3ViewMapper());
        }

        private Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease6() {
            return FinanceWidgetModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory.provideWidgets$storefront_prodGoogleAllVendorsRelease(this.financeWidgetModule, financeWidgetConfig(), new SingleCardViewMapper(), new CoupleCardViewMapper(), new CarouselCardViewMapper());
        }

        private Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease7() {
            return NavLikezoneCaruselDiModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory.provideWidgets$storefront_prodGoogleAllVendorsRelease(this.navLikezoneCaruselDiModule, navLikezoneCaruselConfig(), new NavLikezoneCaruselMultiViewMapper(), new NavLikezoneCaruselSingleViewMapper());
        }

        private Set<Widget2> provideWidgets$tours_prodGoogleAllVendorsRelease() {
            return TravelToursWidgetV2Module_Companion_ProvideWidgets$tours_prodGoogleAllVendorsReleaseFactory.provideWidgets$tours_prodGoogleAllVendorsRelease(touristCountSelectorConfig(), new TouristCountSelectorViewMapper(), touristCountSelectorV3Config(), new TouristCountSelectorV3ConfigViewMapper(), new TouristCountSelectorV3RoomViewMapper(), new TouristCountSelectorV3FooterViewMapper(), toursFlightDetailsConfig(), new ToursFlightDetailsViewMapper(), toursLoaderConfig(), new ToursLoaderViewMapper(), toursSearchResultConfig(), new ToursSearchResultViewMapper(), new ToursSearchResultLoadingOverlayViewMapper(), toursHotelInfoCardConfig(), new ToursHotelInfoCardViewMapper(), toursSummaryConfig(), new ToursSummaryHeaderViewMapper(), new ToursSummaryViewMapper(), toursFlightOptionsConfig(), new ToursFlightOptionsViewMapper(), new ToursFlightOptionsTimerViewMapper(), toursMealConfig(), new ToursMealStickyTopViewMapper(), new ToursMealViewMapper(), new ToursMealStickyBottomViewMapper(), toursBookInformerConfig(), new ToursBookInformerViewMapper(), orderToursChangeFormConfig(), new OrderToursChangeFormViewMapper(), new OrderToursChangeFormButtonViewMapper());
        }

        private Set<i> provideWidgets$tours_prodGoogleAllVendorsRelease2() {
            return TravelToursWidgetFactoryModule_ProvideWidgets$tours_prodGoogleAllVendorsReleaseFactory.provideWidgets$tours_prodGoogleAllVendorsRelease(this.travelToursWidgetFactoryModule, new ListTrackingViewMapper());
        }

        private Set<Widget2> provideWidgets$ugc_prodGoogleAllVendorsRelease() {
            return UgcWidgetsModule_ProvideWidgets$ugc_prodGoogleAllVendorsReleaseFactory.provideWidgets$ugc_prodGoogleAllVendorsRelease(this.ugcWidgetsModule, new UgcCountersViewMapper(), new UgcCountersWidgetPlaceholderViewMapper(), ugcCountersConfig(), new SeparatorViewMapper(), new CommonIslandSeparatorViewMapper2(), productVariantConfig(), new ProductVariantViewMapper(), createReviewButtonConfig(), new CreateReviewButtonViewMapper(), usersGradesConfig(), new UsersGradesViewMapper(), usersFinalRatingConfig(), new UsersFinalRatingViewMapper(), additionalReviewV2Config(), new AdditionalReviewV2ViewMapper(), reviewsProgressConfig(), new ReviewsProgressViewMapper(), reviewStatusConfig(), new ReviewStatusViewMapper(), productsForReviewConfig(), new ProductsForReviewViewMapper(), reviewsTitleConfig(), new ReviewsTitleViewMapper(), singleQuestionConfig(), new SingleQuestionViewMapper(), listQuestionsConfig(), new MoreQuestionsViewMapper(), listAnswersConfig(), new AnswerViewMapper(), new AnswerNoUiViewMapper(), new ru.ozon.app.android.ugc.widgets.listanswers.core.header.HeaderViewMapper(), profileHeaderConfig(), new ProfileHeaderViewMapper(), new MediaPickerViewMapper(), reviewFiltersButtonConfig(), new ReviewFiltersButtonViewMapper(), reviewsFilterConfig(), new ReviewsFilterViewMapper(), usersFinalRatingV2Config(), new UsersFinalRatingV2ViewMapper(), additionalReviewConfig(), new AdditionalReviewNoUIViewMapper(), new AdditionalReviewViewMapper(), reviewsPreviewConfig(), new ReviewsPreviewImageViewMapper(), new ReviewsPreviewBottomTextViewMapper(), new ReviewsPreviewVideoViewMapper(), reviewTilesConfig(), new ReviewTilesViewMapper(), stickyBubbleConfig(), new StickyBubbleViewMapper(), newQuestionFormConfig(), new NewQuestionFormOverlayViewMapper(), rateItemsV2Config(), new RateItemsV2OverlayViewMapper(), selectionItemFormConfig(), new SelectionFormHeaderViewMapper(), new SelectionFormSubmitButtonViewMapper(), new SelectionFormTextAreaViewMapper(), new SelectionFormTextFieldViewMapper(), new SelectionFormCellViewMapper(), new SelectionFormDisclaimerViewMapper(), new SelectionFormCellSelectorViewMapper(), new SelectionFormProductPickerViewMapper(), new PlainTextViewMapper2(), selectionsListConfig(), new SelectionsListHorizontalViewMapper(), new SelectionsListGridViewMapper(), new SelectionsListGridEmptyViewMapper(), createListWrapperConfig(), new CreateListWrapperNoUiViewMapper(), profileInputsConfig(), new ProfileInputsViewMapper());
        }

        private Set<Widget2> provideWidgets$universalwidgets_prodGoogleAllVendorsRelease() {
            return StorefrontWidgetsModule_ProvideWidgets$universalwidgets_prodGoogleAllVendorsReleaseFactory.provideWidgets$universalwidgets_prodGoogleAllVendorsRelease(tileScrollConfig(), new TileScrollViewMapper(), new HeaderViewMapper2());
        }

        private Set<Widget2> provideWidgets$universalwidgets_prodGoogleAllVendorsRelease2() {
            return MaxiTileWidgetModule_ProvideWidgets$universalwidgets_prodGoogleAllVendorsReleaseFactory.provideWidgets$universalwidgets_prodGoogleAllVendorsRelease(maxiTileConfig(), new MaxiTileViewMapper());
        }

        private Set<Widget2> provideWidgets$universalwidgets_prodGoogleAllVendorsRelease3() {
            return ObjectScrollWidgetV2Module_ProvideWidgets$universalwidgets_prodGoogleAllVendorsReleaseFactory.provideWidgets$universalwidgets_prodGoogleAllVendorsRelease(this.objectScrollWidgetV2Module, universalObjectScrollConfig(), new UniversalObjectScrollViewMapper(), new HeaderViewMapper2());
        }

        private Widget2 provideWidgets2() {
            return FullTextSearchHeaderV4Module_ProvideWidgetsFactory.provideWidgets(fullTextSearchHeaderV4Config(), new FullTextSearchHeaderV4ViewMapper());
        }

        private Set<Widget2> provideWidgets3() {
            return UniversalObjectV2Module_ProvideWidgetsFactory.provideWidgets(this.universalObjectV2Module, universalObjectConfig(), new UniversalWidgetHeaderViewMapper(), new HeaderViewMapper2(), new UniversalObjectGrid2ViewMapper(), new UniversalGrid3TextOutsideItemViewMapper(), new UniversalGrid3TextInsideItemViewMapper(), new UniversalObjectGridOneViewMapper(), new UniversalObjectGridOneBannerViewMapper(), new UniversalObjectGridOneSingleItemBannerViewMapper(), new UniversalObjectGridOneSingleItemViewMapper(), new UniversalObjectNaviViewMapper(), new UniversalWidgetFooterViewMapper());
        }

        private Set<i> provideWidgets4() {
            return TravelGeneralServicesWidgetFactoryModule_ProvideWidgetsFactory.provideWidgets(this.jsonDeserializer);
        }

        private Set<Widget2> provideWidgetsV2$common_prodGoogleAllVendorsRelease() {
            return TravelGeneralWidgetV2Module_ProvideWidgetsV2$common_prodGoogleAllVendorsReleaseFactory.provideWidgetsV2$common_prodGoogleAllVendorsRelease(this.travelGeneralWidgetV2Module, notificationInformerV2Config(), new NotificationInformerV2ViewMapper(), milesForBuyersModalInfoConfig(), new MilesForBuyersModalInfoViewMapper(), new MilesForBuyersModalInfoButtonsOverlayMapper(), milesForBuyersConfig(), new MilesForBuyersViewMapper(), servicePackageCarouselConfig(), new ServicePackageCarouselViewMapper(), emptyStateV2Config(), new EmptyStateV2OverlayWidgetViewMapper(), new EmptyStateV2WrapWidgetViewMapper(), new EmptyStateV2WrapNoFiltersWidgetViewMapper(), new EmptyStateV2OverlayNoFiltersWidgetViewMapper(), new EmptyStateV2FullNoFiltersWidgetViewMapper(), new EmptyStateV2FullWidgetViewMapper(), filtersConfig(), new FiltersHeaderStickyViewMapper(), new FiltersSectionViewMapper(), new FiltersFooterStickyViewMapper(), overlayButtonsV2Config(), new OverlayButtonsV2ViewMapper(), invisibleRefresherConfig(), new InvisibleRefresherOverlayViewMapper(), emptyStateV3Config(), new EmptyStateV3FullWidgetViewMapper(), new EmptyStateV3WrapWidgetViewMapper(), travelSortingV2Config(), new TravelSortingV2ViewMapper(), roundedNavBarConfig(), new RoundedNavBarViewMapper(), shortcutsControllerConfig(), new ShortcutsControllerNoUiViewMapper(), scrollAnchorConfig(), new ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.presentation.ScrollAnchorViewMapper(), new ListTrackingViewMapper());
        }

        private Widget2 provideWishlistMultiselectWidget() {
            return WishlistMultiselectModule_ProvideWishlistMultiselectWidgetFactory.provideWishlistMultiselectWidget(wishlistMultiselectConfig(), new WishlistMultiselectNoUiViewMapper());
        }

        private PublishedAtConfig publishedAtConfig() {
            return new PublishedAtConfig(this.jsonDeserializer);
        }

        private QuickFiltersConfig quickFiltersConfig() {
            return new QuickFiltersConfig(this.jsonDeserializer);
        }

        private RadioGroupWidgetConfig radioGroupWidgetConfig() {
            return new RadioGroupWidgetConfig(this.jsonDeserializer);
        }

        private RailwayScrollPriceCalendarConfig railwayScrollPriceCalendarConfig() {
            return new RailwayScrollPriceCalendarConfig(this.jsonDeserializer);
        }

        private RailwayStepsHeaderConfig railwayStepsHeaderConfig() {
            return new RailwayStepsHeaderConfig(this.jsonDeserializer);
        }

        private RailwayTrainInformationConfig railwayTrainInformationConfig() {
            return new RailwayTrainInformationConfig(this.jsonDeserializer);
        }

        private RateConfig rateConfig() {
            return new RateConfig(this.jsonDeserializer);
        }

        private RateItemsV2Config rateItemsV2Config() {
            return new RateItemsV2Config(this.jsonDeserializer);
        }

        private RecShelfConfig recShelfConfig() {
            return new RecShelfConfig(this.jsonDeserializer);
        }

        private RecipientConfig recipientConfig() {
            return new RecipientConfig(this.jsonDeserializer);
        }

        private ReconciliationActsDeclinerConfig reconciliationActsDeclinerConfig() {
            return new ReconciliationActsDeclinerConfig(this.jsonDeserializer);
        }

        private ReconciliationActsDeclinerViewMapper reconciliationActsDeclinerViewMapper() {
            return injectReconciliationActsDeclinerViewMapper(ReconciliationActsDeclinerViewMapper_Factory.newInstance());
        }

        private RedirectSnackBarConfig redirectSnackBarConfig() {
            return new RedirectSnackBarConfig(this.jsonDeserializer);
        }

        private RefreshPdpProcessorConfig refreshPdpProcessorConfig() {
            return new RefreshPdpProcessorConfig(this.jsonDeserializer);
        }

        private RegionSearchConfig regionSearchConfig() {
            return new RegionSearchConfig(this.jsonDeserializer);
        }

        private RegistrationConfig registrationConfig() {
            return new RegistrationConfig(this.jsonDeserializer);
        }

        private ReorderTileConfig reorderTileConfig() {
            return new ReorderTileConfig(this.jsonDeserializer, headerApi());
        }

        private ReplyToCourierInfoWidgetConfig replyToCourierInfoWidgetConfig() {
            return new ReplyToCourierInfoWidgetConfig(this.jsonDeserializer);
        }

        private ReportAbuseFormConfig reportAbuseFormConfig() {
            return new ReportAbuseFormConfig(this.jsonDeserializer);
        }

        private ReportDocumentConfig reportDocumentConfig() {
            return new ReportDocumentConfig(this.jsonDeserializer);
        }

        private RequestPhoneAccessWidgetConfig requestPhoneAccessWidgetConfig() {
            return new RequestPhoneAccessWidgetConfig(this.jsonDeserializer);
        }

        private ResponseActionsConfig responseActionsConfig() {
            return new ResponseActionsConfig(this.jsonDeserializer);
        }

        private ResultConfig resultConfig() {
            return new ResultConfig(this.jsonDeserializer);
        }

        private ReturnActionButtonsConfig returnActionButtonsConfig() {
            return new ReturnActionButtonsConfig(this.jsonDeserializer);
        }

        private ReturnBalanceModalConfig returnBalanceModalConfig() {
            return new ReturnBalanceModalConfig(this.jsonDeserializer);
        }

        private ReturnCreationActiveDeliveriesConfig returnCreationActiveDeliveriesConfig() {
            return new ReturnCreationActiveDeliveriesConfig(this.jsonDeserializer, this.context);
        }

        private ReturnCreationItemsListConfig returnCreationItemsListConfig() {
            return new ReturnCreationItemsListConfig(returnCreationItemsListParser());
        }

        private ReturnCreationItemsListParser returnCreationItemsListParser() {
            return new ReturnCreationItemsListParser(this.jsonDeserializer, this.context);
        }

        private ReturnCreationMethodsConfig returnCreationMethodsConfig() {
            return new ReturnCreationMethodsConfig(this.moshi, this.context);
        }

        private ReturnCreationModalConfig returnCreationModalConfig() {
            return new ReturnCreationModalConfig(this.jsonDeserializer);
        }

        private ReturnCreationOrdersConfig returnCreationOrdersConfig() {
            return new ReturnCreationOrdersConfig(returnCreationOrdersParser());
        }

        private ReturnCreationOrdersParser returnCreationOrdersParser() {
            return new ReturnCreationOrdersParser(this.jsonDeserializer, this.context);
        }

        private ReturnCreationPhotoPickerConfig returnCreationPhotoPickerConfig() {
            return new ReturnCreationPhotoPickerConfig(returnCreationPhotoPickerParser());
        }

        private ReturnCreationPhotoPickerParser returnCreationPhotoPickerParser() {
            return new ReturnCreationPhotoPickerParser(this.jsonDeserializer, this.context);
        }

        private ReturnCreationReasonsConfig returnCreationReasonsConfig() {
            return new ReturnCreationReasonsConfig(returnCreationReasonsParser());
        }

        private ReturnCreationReasonsParser returnCreationReasonsParser() {
            return new ReturnCreationReasonsParser(this.jsonDeserializer, this.context);
        }

        private ReturnCreationSelectedItemsConfig returnCreationSelectedItemsConfig() {
            return new ReturnCreationSelectedItemsConfig(returnCreationSelectedItemsParser());
        }

        private ReturnCreationSelectedItemsParser returnCreationSelectedItemsParser() {
            return new ReturnCreationSelectedItemsParser(this.jsonDeserializer, this.context);
        }

        private ReturnCreationStepsConfig returnCreationStepsConfig() {
            return new ReturnCreationStepsConfig(this.jsonDeserializer);
        }

        private ReturnCreationTotalConfig returnCreationTotalConfig() {
            return new ReturnCreationTotalConfig(this.jsonDeserializer);
        }

        private ReturnDetailsConfig returnDetailsConfig() {
            return new ReturnDetailsConfig(this.jsonDeserializer);
        }

        private ReturnDetailsTotalConfig returnDetailsTotalConfig() {
            return new ReturnDetailsTotalConfig(this.jsonDeserializer);
        }

        private ReturnEditConfig returnEditConfig() {
            return new ReturnEditConfig(returnEditParser());
        }

        private ReturnEditParser returnEditParser() {
            return new ReturnEditParser(this.jsonDeserializer);
        }

        private ReturnListConfig returnListConfig() {
            return new ReturnListConfig(returnListParser());
        }

        private ReturnListEmptyConfig returnListEmptyConfig() {
            return new ReturnListEmptyConfig(this.jsonDeserializer);
        }

        private ReturnListParser returnListParser() {
            return new ReturnListParser(this.jsonDeserializer);
        }

        private ReturnPolicyConfig returnPolicyConfig() {
            return new ReturnPolicyConfig(this.jsonDeserializer);
        }

        private ReturnTextAreaButtonConfig returnTextAreaButtonConfig() {
            return new ReturnTextAreaButtonConfig(this.jsonDeserializer);
        }

        private ReturnableItemsListConfig returnableItemsListConfig() {
            return new ReturnableItemsListConfig(returnableItemsParser());
        }

        private ReturnableItemsParser returnableItemsParser() {
            return new ReturnableItemsParser(this.jsonDeserializer);
        }

        private ReviewFiltersButtonConfig reviewFiltersButtonConfig() {
            return new ReviewFiltersButtonConfig(this.jsonDeserializer);
        }

        private ReviewGalleryFeedConfig reviewGalleryFeedConfig() {
            return new ReviewGalleryFeedConfig(this.jsonDeserializer);
        }

        private ReviewGalleryPreviewConfig reviewGalleryPreviewConfig() {
            return new ReviewGalleryPreviewConfig(this.jsonDeserializer);
        }

        private ReviewGalleryV2Config reviewGalleryV2Config() {
            return new ReviewGalleryV2Config(this.jsonDeserializer);
        }

        private ReviewStatusConfig reviewStatusConfig() {
            return new ReviewStatusConfig(this.jsonDeserializer);
        }

        private ReviewTilesConfig reviewTilesConfig() {
            return new ReviewTilesConfig(this.jsonDeserializer);
        }

        private ReviewsFilterConfig reviewsFilterConfig() {
            return new ReviewsFilterConfig(this.jsonDeserializer);
        }

        private ReviewsPreviewConfig reviewsPreviewConfig() {
            return new ReviewsPreviewConfig(this.jsonDeserializer);
        }

        private ReviewsProgressConfig reviewsProgressConfig() {
            return new ReviewsProgressConfig(this.jsonDeserializer);
        }

        private ReviewsTitleConfig reviewsTitleConfig() {
            return new ReviewsTitleConfig(this.jsonDeserializer);
        }

        private RichContentConfig richContentConfig() {
            return new RichContentConfig(this.context, this.jsonDeserializer);
        }

        private RichPromoScrollConfig richPromoScrollConfig() {
            return new RichPromoScrollConfig(this.jsonDeserializer);
        }

        private RichTextWidgetConfig richTextWidgetConfig() {
            return new RichTextWidgetConfig(this.jsonDeserializer);
        }

        private RoleInvitationCreatorConfig roleInvitationCreatorConfig() {
            return new RoleInvitationCreatorConfig(this.jsonDeserializer);
        }

        private RoundedNavBarConfig roundedNavBarConfig() {
            return new RoundedNavBarConfig(this.jsonDeserializer);
        }

        private ScrollActionListConfig scrollActionListConfig() {
            return new ScrollActionListConfig(this.jsonDeserializer);
        }

        private ScrollAnchorConfig scrollAnchorConfig() {
            return new ScrollAnchorConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.storefront.widgets.scrollAnchor.data.ScrollAnchorConfig scrollAnchorConfig2() {
            return new ru.ozon.app.android.storefront.widgets.scrollAnchor.data.ScrollAnchorConfig(this.jsonDeserializer);
        }

        private ScrollConfig scrollConfig() {
            return new ScrollConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.fresh.main.widgets.product.scroll.data.ScrollConfig scrollConfig2() {
            return new ru.ozon.app.android.fresh.main.widgets.product.scroll.data.ScrollConfig(this.jsonDeserializer);
        }

        private SearchBankListConfig searchBankListConfig() {
            return new SearchBankListConfig(this.jsonDeserializer);
        }

        private SearchBarConfig searchBarConfig() {
            return new SearchBarConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.fresh.unsorted.widgets.searchBar.data.SearchBarConfig searchBarConfig2() {
            return new ru.ozon.app.android.fresh.unsorted.widgets.searchBar.data.SearchBarConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.cml.delivery.widgets.searchBar.data.SearchBarConfig searchBarConfig3() {
            return new ru.ozon.app.android.cml.delivery.widgets.searchBar.data.SearchBarConfig(this.jsonDeserializer);
        }

        private SearchCategoryHeaderConfig searchCategoryHeaderConfig() {
            return new SearchCategoryHeaderConfig(this.jsonDeserializer);
        }

        private SearchFormBarConfig searchFormBarConfig() {
            return new SearchFormBarConfig(this.jsonDeserializer);
        }

        private SearchFormV4Config searchFormV4Config() {
            return new SearchFormV4Config(this.jsonDeserializer);
        }

        private SearchHistoryConfig searchHistoryConfig() {
            return new SearchHistoryConfig(this.jsonDeserializer);
        }

        private SearchOnboardingConfig searchOnboardingConfig() {
            return new SearchOnboardingConfig(this.jsonDeserializer);
        }

        private SearchRequestConfig searchRequestConfig() {
            return new SearchRequestConfig(this.jsonDeserializer);
        }

        private SearchResultErrorConfig searchResultErrorConfig() {
            return new SearchResultErrorConfig(this.jsonDeserializer);
        }

        private SearchResultsGridConfig searchResultsGridConfig() {
            return new SearchResultsGridConfig(this.context, d.a(this.textMeasurerProvider), new SearchResultsPlaceholderCombiner(), new SearchResultsCanParseDelegate(), this.jsonDeserializer);
        }

        private SearchResultsNavTitleConfig searchResultsNavTitleConfig() {
            return new SearchResultsNavTitleConfig(this.jsonDeserializer);
        }

        private SearchResultsNavTitleV2Config searchResultsNavTitleV2Config() {
            return new SearchResultsNavTitleV2Config(this.jsonDeserializer);
        }

        private SecureDealConfig secureDealConfig() {
            return new SecureDealConfig(this.jsonDeserializer);
        }

        private SecureDealCurtainConfig secureDealCurtainConfig() {
            return new SecureDealCurtainConfig(secureDealCurtainParser());
        }

        private SecureDealCurtainParser secureDealCurtainParser() {
            return new SecureDealCurtainParser(this.jsonDeserializer);
        }

        private SelectCancelReasonConfig selectCancelReasonConfig() {
            return new SelectCancelReasonConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.returns.cancels.cancelReasons.core.SelectCancelReasonConfig selectCancelReasonConfig2() {
            return new ru.ozon.app.android.returns.cancels.cancelReasons.core.SelectCancelReasonConfig(this.jsonDeserializer);
        }

        private SelectCategoryConfig selectCategoryConfig() {
            return new SelectCategoryConfig(this.jsonDeserializer);
        }

        private SelectPaymentConfig selectPaymentConfig() {
            return new SelectPaymentConfig(this.jsonDeserializer);
        }

        private SelectSellerConfig selectSellerConfig() {
            return new SelectSellerConfig(this.jsonDeserializer);
        }

        private SelectionItemDescriptionConfig selectionItemDescriptionConfig() {
            return new SelectionItemDescriptionConfig(this.jsonDeserializer);
        }

        private SelectionItemFormConfig selectionItemFormConfig() {
            return new SelectionItemFormConfig(this.jsonDeserializer);
        }

        private SelectionsListConfig selectionsListConfig() {
            return new SelectionsListConfig(this.jsonDeserializer);
        }

        private SellerActionLadderConfig sellerActionLadderConfig() {
            return new SellerActionLadderConfig(this.jsonDeserializer);
        }

        private SellerActionPreviewConfig sellerActionPreviewConfig() {
            return new SellerActionPreviewConfig(this.jsonDeserializer, new SellerActionsPreviewDtoToDtoWrapperMapper());
        }

        private SellerConfig sellerConfig() {
            return new SellerConfig(this.jsonDeserializer);
        }

        private SellerPointsConfig sellerPointsConfig() {
            return new SellerPointsConfig(this.jsonDeserializer);
        }

        private SellerProductsWidgetConfig sellerProductsWidgetConfig() {
            return new SellerProductsWidgetConfig(this.jsonDeserializer);
        }

        private SellerSimpleConfig sellerSimpleConfig() {
            return new SellerSimpleConfig(this.jsonDeserializer);
        }

        private SellerSortSwitcherConfig sellerSortSwitcherConfig() {
            return new SellerSortSwitcherConfig(this.jsonDeserializer);
        }

        private SellerTransparencyProfileConfig sellerTransparencyProfileConfig() {
            return new SellerTransparencyProfileConfig(this.jsonDeserializer);
        }

        private SellerTransparencyV3Config sellerTransparencyV3Config() {
            return new SellerTransparencyV3Config(this.jsonDeserializer);
        }

        private SellerV4Config sellerV4Config() {
            return new SellerV4Config(this.jsonDeserializer);
        }

        private SellerV7Config sellerV7Config() {
            return new SellerV7Config(this.jsonDeserializer);
        }

        private SeparatorBadgeConfig separatorBadgeConfig() {
            return new SeparatorBadgeConfig(this.jsonDeserializer);
        }

        private SeparatorConfig separatorConfig() {
            return new SeparatorConfig(this.jsonDeserializer, this.context);
        }

        private ServiceBlockConfig serviceBlockConfig() {
            return new ServiceBlockConfig(this.jsonDeserializer);
        }

        private ServiceBlockShadedConfig serviceBlockShadedConfig() {
            return new ServiceBlockShadedConfig(this.jsonDeserializer);
        }

        private ServiceCarouselConfig serviceCarouselConfig() {
            return new ServiceCarouselConfig(this.jsonDeserializer);
        }

        private ServicePackSelectionV3Config servicePackSelectionV3Config() {
            return new ServicePackSelectionV3Config(this.jsonDeserializer);
        }

        private ServicePackageCarouselConfig servicePackageCarouselConfig() {
            return new ServicePackageCarouselConfig(this.jsonDeserializer);
        }

        private ServicePackageSelectionConfig servicePackageSelectionConfig() {
            return new ServicePackageSelectionConfig(this.jsonDeserializer);
        }

        private SessionConfig sessionConfig() {
            return new SessionConfig(this.jsonDeserializer);
        }

        private SessionListConfig sessionListConfig() {
            return new SessionListConfig(this.jsonDeserializer);
        }

        private ShopButtonsConfig shopButtonsConfig() {
            return new ShopButtonsConfig(this.jsonDeserializer);
        }

        private ShoppingListsV2Config shoppingListsV2Config() {
            return new ShoppingListsV2Config(this.jsonDeserializer);
        }

        private ShortcutsControllerConfig shortcutsControllerConfig() {
            return new ShortcutsControllerConfig(this.jsonDeserializer);
        }

        private SimpleInfoConfig simpleInfoConfig() {
            return new SimpleInfoConfig(this.jsonDeserializer);
        }

        private SingleQuestionConfig singleQuestionConfig() {
            return new SingleQuestionConfig(this.jsonDeserializer);
        }

        private SingleReviewConfig singleReviewConfig() {
            return new SingleReviewConfig(this.jsonDeserializer);
        }

        private SisBrandFavoriteConfig sisBrandFavoriteConfig() {
            return new SisBrandFavoriteConfig(this.jsonDeserializer);
        }

        private SkiResortInfoConfig skiResortInfoConfig() {
            return new SkiResortInfoConfig(this.jsonDeserializer);
        }

        private SkuGrid1Config skuGrid1Config() {
            return new SkuGrid1Config(this.jsonDeserializer);
        }

        private SkuGrid2Config skuGrid2Config() {
            return new SkuGrid2Config(this.jsonDeserializer);
        }

        private SkuGrid3Config skuGrid3Config() {
            return new SkuGrid3Config(this.jsonDeserializer);
        }

        private SkuListConfig skuListConfig() {
            return new SkuListConfig(this.jsonDeserializer);
        }

        private SkuThinScrollConfig skuThinScrollConfig() {
            return new SkuThinScrollConfig(this.jsonDeserializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SmallTileMoleculeMapper smallTileMoleculeMapper() {
            return new SmallTileMoleculeMapper(new FavoriteProductMoleculeV2Mapper());
        }

        private StarPointsConfig starPointsConfig() {
            return new StarPointsConfig(this.jsonDeserializer);
        }

        private StatusBannerConfig statusBannerConfig() {
            return new StatusBannerConfig(this.jsonDeserializer);
        }

        private StatusEdoConfig statusEdoConfig() {
            return new StatusEdoConfig(this.jsonDeserializer);
        }

        private StepListWithScaleConfig stepListWithScaleConfig() {
            return new StepListWithScaleConfig(this.jsonDeserializer);
        }

        private SteppedThermometerConfig steppedThermometerConfig() {
            return new SteppedThermometerConfig(this.jsonDeserializer);
        }

        private StepperConfig stepperConfig() {
            return new StepperConfig(this.jsonDeserializer);
        }

        private StickyBubbleConfig stickyBubbleConfig() {
            return new StickyBubbleConfig(this.jsonDeserializer);
        }

        private StickyButtonConfig stickyButtonConfig() {
            return new StickyButtonConfig(this.jsonDeserializer);
        }

        private StickyCartConfig stickyCartConfig() {
            return new StickyCartConfig(this.jsonDeserializer);
        }

        private StickyLadderConfig stickyLadderConfig() {
            return new StickyLadderConfig(this.jsonDeserializer);
        }

        private StickyOzonBankPromoConfig stickyOzonBankPromoConfig() {
            return new StickyOzonBankPromoConfig(this.jsonDeserializer);
        }

        private StickyPromoBadgeConfig stickyPromoBadgeConfig() {
            return new StickyPromoBadgeConfig(this.jsonDeserializer);
        }

        private StickyPromoBannerConfig stickyPromoBannerConfig() {
            return new StickyPromoBannerConfig(this.jsonDeserializer);
        }

        private StickyPromoRedirectV2Config stickyPromoRedirectV2Config() {
            return new StickyPromoRedirectV2Config(this.jsonDeserializer);
        }

        private StickyScrollConfig stickyScrollConfig() {
            return new StickyScrollConfig(this.jsonDeserializer);
        }

        private StickyTotalConfig stickyTotalConfig() {
            return new StickyTotalConfig(this.jsonDeserializer);
        }

        private SuggestionConfig suggestionConfig() {
            return new SuggestionConfig(this.jsonDeserializer);
        }

        private SuggestionsConfig suggestionsConfig() {
            return new SuggestionsConfig(this.jsonDeserializer, this.context);
        }

        private TagListConfig tagListConfig() {
            return new TagListConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.common.taglist.taglistv2.data.TagListConfig tagListConfig2() {
            return new ru.ozon.app.android.common.taglist.taglistv2.data.TagListConfig(this.jsonDeserializer);
        }

        private TagListV3Config tagListV3Config() {
            return new TagListV3Config(this.jsonDeserializer);
        }

        private TagsConfig tagsConfig() {
            return new TagsConfig(this.jsonDeserializer);
        }

        private TapTagsV2Config tapTagsV2Config() {
            return new TapTagsV2Config(this.jsonDeserializer);
        }

        private TapTagsV3Config tapTagsV3Config() {
            return new TapTagsV3Config(this.jsonDeserializer);
        }

        private TariffLuggageV2Config tariffLuggageV2Config() {
            return new TariffLuggageV2Config(this.jsonDeserializer);
        }

        private TextBlockConfig textBlockConfig() {
            return new TextBlockConfig(this.jsonDeserializer);
        }

        private TextDescriptionConfig textDescriptionConfig() {
            return new TextDescriptionConfig(this.jsonDeserializer);
        }

        private TextInfoCellsConfig textInfoCellsConfig() {
            return new TextInfoCellsConfig(this.jsonDeserializer);
        }

        private TextWidgetConfig textWidgetConfig() {
            return new TextWidgetConfig(this.jsonDeserializer);
        }

        private TileGrid2Config tileGrid2Config() {
            return new TileGrid2Config(this.context, this.jsonDeserializer);
        }

        private TileGrid3Config tileGrid3Config() {
            return new TileGrid3Config(this.jsonDeserializer, d.a(this.tileGrid3MapperProvider));
        }

        private TileScrollConfig tileScrollConfig() {
            return new TileScrollConfig(this.jsonDeserializer);
        }

        private TilesReviewsListConfig tilesReviewsListConfig() {
            return new TilesReviewsListConfig(this.jsonDeserializer);
        }

        private TimeLeftConfig timeLeftConfig() {
            return new TimeLeftConfig(this.jsonDeserializer);
        }

        private TimeSlotsConfig timeSlotsConfig() {
            return new TimeSlotsConfig(this.jsonDeserializer);
        }

        private TimeoutAndActionConfig timeoutAndActionConfig() {
            return new TimeoutAndActionConfig(this.jsonDeserializer);
        }

        private TimerWidgetConfig timerWidgetConfig() {
            return new TimerWidgetConfig(this.jsonDeserializer);
        }

        private TipCourierDetailsConfig tipCourierDetailsConfig() {
            return new TipCourierDetailsConfig(this.jsonDeserializer);
        }

        private TipCourierHeaderConfig tipCourierHeaderConfig() {
            return new TipCourierHeaderConfig(this.jsonDeserializer);
        }

        private TipCourierReviewV2Config tipCourierReviewV2Config() {
            return new TipCourierReviewV2Config(this.jsonDeserializer);
        }

        private TipProductPhotosConfig tipProductPhotosConfig() {
            return new TipProductPhotosConfig(this.jsonDeserializer);
        }

        private TitleConfig titleConfig() {
            return new TitleConfig(this.jsonDeserializer);
        }

        private TopTravelModalConfig topTravelModalConfig() {
            return new TopTravelModalConfig(this.jsonDeserializer);
        }

        private TotalConfig totalConfig() {
            return new TotalConfig(this.jsonDeserializer);
        }

        private TouristCountSelectorConfig touristCountSelectorConfig() {
            return new TouristCountSelectorConfig(this.jsonDeserializer);
        }

        private TouristCountSelectorV3Config touristCountSelectorV3Config() {
            return new TouristCountSelectorV3Config(this.jsonDeserializer);
        }

        private ToursBookInformerConfig toursBookInformerConfig() {
            return new ToursBookInformerConfig(this.jsonDeserializer);
        }

        private ToursFlightDetailsConfig toursFlightDetailsConfig() {
            return new ToursFlightDetailsConfig(this.jsonDeserializer);
        }

        private ToursFlightOptionsConfig toursFlightOptionsConfig() {
            return new ToursFlightOptionsConfig(this.jsonDeserializer);
        }

        private ToursHotelInfoCardConfig toursHotelInfoCardConfig() {
            return new ToursHotelInfoCardConfig(this.jsonDeserializer);
        }

        private ToursLoaderConfig toursLoaderConfig() {
            return new ToursLoaderConfig(this.jsonDeserializer);
        }

        private ToursMealConfig toursMealConfig() {
            return new ToursMealConfig(this.jsonDeserializer);
        }

        private ToursSearchResultConfig toursSearchResultConfig() {
            return new ToursSearchResultConfig(this.jsonDeserializer);
        }

        private ToursSummaryConfig toursSummaryConfig() {
            return new ToursSummaryConfig(this.jsonDeserializer);
        }

        private TranslateButtonConfig translateButtonConfig() {
            return new TranslateButtonConfig(this.jsonDeserializer);
        }

        private TransparentNavBarV2Config transparentNavBarV2Config() {
            return new TransparentNavBarV2Config(this.jsonDeserializer);
        }

        private TravelAddNewPassengerFormClearButtonConfig travelAddNewPassengerFormClearButtonConfig() {
            return new TravelAddNewPassengerFormClearButtonConfig(this.jsonDeserializer);
        }

        private TravelAddNewPassengerFormV2Config travelAddNewPassengerFormV2Config() {
            return new TravelAddNewPassengerFormV2Config(this.jsonDeserializer);
        }

        private TravelAddNewPassengerFormV3Config travelAddNewPassengerFormV3Config() {
            return new TravelAddNewPassengerFormV3Config(this.jsonDeserializer);
        }

        private TravelBookingImportantInformationConfig travelBookingImportantInformationConfig() {
            return new TravelBookingImportantInformationConfig(this.jsonDeserializer);
        }

        private TravelBookingImportantInformationPlaceholderConfig travelBookingImportantInformationPlaceholderConfig() {
            return new TravelBookingImportantInformationPlaceholderConfig(this.jsonDeserializer);
        }

        private TravelCarriageDetailsConfig travelCarriageDetailsConfig() {
            return new TravelCarriageDetailsConfig(this.jsonDeserializer);
        }

        private TravelCarriageSelectV3Config travelCarriageSelectV3Config() {
            return new TravelCarriageSelectV3Config(this.jsonDeserializer);
        }

        private TravelCarriageTypeSelectV2Config travelCarriageTypeSelectV2Config() {
            return new TravelCarriageTypeSelectV2Config(this.jsonDeserializer);
        }

        private TravelCellListConfig travelCellListConfig() {
            return new TravelCellListConfig(this.jsonDeserializer);
        }

        private TravelCellListV2Config travelCellListV2Config() {
            return new TravelCellListV2Config(this.jsonDeserializer);
        }

        private TravelCellListV3Config travelCellListV3Config() {
            return new TravelCellListV3Config(this.jsonDeserializer);
        }

        private TravelCompanyDocumentsConfig travelCompanyDocumentsConfig() {
            return new TravelCompanyDocumentsConfig(this.jsonDeserializer);
        }

        private TravelDocumentsToEmailConfig travelDocumentsToEmailConfig() {
            return new TravelDocumentsToEmailConfig(this.jsonDeserializer);
        }

        private TravelFiltersButtonConfig travelFiltersButtonConfig() {
            return new TravelFiltersButtonConfig(this.jsonDeserializer);
        }

        private TravelFlightCheckTariffV2Config travelFlightCheckTariffV2Config() {
            return new TravelFlightCheckTariffV2Config(this.jsonDeserializer);
        }

        private TravelHiddenErrorTimeoutConfig travelHiddenErrorTimeoutConfig() {
            return new TravelHiddenErrorTimeoutConfig(this.jsonDeserializer);
        }

        private TravelHotelCardV3Config travelHotelCardV3Config() {
            return new TravelHotelCardV3Config(this.jsonDeserializer);
        }

        private TravelImageConfig travelImageConfig() {
            return new TravelImageConfig(this.jsonDeserializer);
        }

        private TravelImportantInfoModalConfig travelImportantInfoModalConfig() {
            return new TravelImportantInfoModalConfig(this.jsonDeserializer);
        }

        private TravelInfoBadgeConfig travelInfoBadgeConfig() {
            return new TravelInfoBadgeConfig(this.jsonDeserializer);
        }

        private TravelLinkButtonConfig travelLinkButtonConfig() {
            return new TravelLinkButtonConfig(this.jsonDeserializer);
        }

        private TravelModalPersonalManagerConfig travelModalPersonalManagerConfig() {
            return new TravelModalPersonalManagerConfig(this.jsonDeserializer);
        }

        private TravelModalPriceDetailInformationConfig travelModalPriceDetailInformationConfig() {
            return new TravelModalPriceDetailInformationConfig(this.jsonDeserializer);
        }

        private TravelModalPriceDetailInformationV3Config travelModalPriceDetailInformationV3Config() {
            return new TravelModalPriceDetailInformationV3Config(this.jsonDeserializer);
        }

        private TravelModalPriceDetailInformationV4Config travelModalPriceDetailInformationV4Config() {
            return new TravelModalPriceDetailInformationV4Config(this.jsonDeserializer);
        }

        private TravelNavTitleV3Config travelNavTitleV3Config() {
            return new TravelNavTitleV3Config(this.jsonDeserializer);
        }

        private TravelNavTrainConfig travelNavTrainConfig() {
            return new TravelNavTrainConfig(this.jsonDeserializer);
        }

        private TravelNotificationModalCheckConfig travelNotificationModalCheckConfig() {
            return new TravelNotificationModalCheckConfig(this.jsonDeserializer);
        }

        private TravelOrderLinksConfig travelOrderLinksConfig() {
            return new TravelOrderLinksConfig(this.jsonDeserializer);
        }

        private TravelOrderListMobileConfig travelOrderListMobileConfig() {
            return new TravelOrderListMobileConfig(this.jsonDeserializer);
        }

        private TravelOrderNavContentConfig travelOrderNavContentConfig() {
            return new TravelOrderNavContentConfig(this.jsonDeserializer);
        }

        private TravelPassengersCountSelectorConfig travelPassengersCountSelectorConfig() {
            return new TravelPassengersCountSelectorConfig(this.jsonDeserializer);
        }

        private TravelPaymentV3Config travelPaymentV3Config() {
            return new TravelPaymentV3Config(this.jsonDeserializer);
        }

        private TravelPaymentV4Config travelPaymentV4Config() {
            return new TravelPaymentV4Config(this.jsonDeserializer);
        }

        private TravelPersonalAccountReplenishmentConfig travelPersonalAccountReplenishmentConfig() {
            return new TravelPersonalAccountReplenishmentConfig(this.jsonDeserializer);
        }

        private TravelPriceCalendarV3Config travelPriceCalendarV3Config() {
            return new TravelPriceCalendarV3Config(this.jsonDeserializer);
        }

        private TravelPriceDetailInformationConfig travelPriceDetailInformationConfig() {
            return new TravelPriceDetailInformationConfig(this.jsonDeserializer);
        }

        private TravelPriceDetailInformationV2Config travelPriceDetailInformationV2Config() {
            return new TravelPriceDetailInformationV2Config(this.jsonDeserializer);
        }

        private TravelQuickFiltersConfig travelQuickFiltersConfig() {
            return new TravelQuickFiltersConfig(this.jsonDeserializer);
        }

        private TravelRailwaySeatSelectWithSchemeV2Config travelRailwaySeatSelectWithSchemeV2Config() {
            return new TravelRailwaySeatSelectWithSchemeV2Config(this.jsonDeserializer);
        }

        private TravelRoomsGuestsCardCompactConfig travelRoomsGuestsCardCompactConfig() {
            return new TravelRoomsGuestsCardCompactConfig(this.jsonDeserializer);
        }

        private TravelRoomsGuestsCardConfig travelRoomsGuestsCardConfig() {
            return new TravelRoomsGuestsCardConfig(this.jsonDeserializer);
        }

        private TravelScrollPriceCalendarConfig travelScrollPriceCalendarConfig() {
            return new TravelScrollPriceCalendarConfig(this.jsonDeserializer);
        }

        private TravelScrollPriceCalendarV2Config travelScrollPriceCalendarV2Config() {
            return new TravelScrollPriceCalendarV2Config(this.jsonDeserializer);
        }

        private TravelSearchBarConfig travelSearchBarConfig() {
            return new TravelSearchBarConfig(this.jsonDeserializer);
        }

        private TravelSearchSortAndFilterConfig travelSearchSortAndFilterConfig() {
            return new TravelSearchSortAndFilterConfig(this.jsonDeserializer);
        }

        private TravelServicePackageSelectedV3Config travelServicePackageSelectedV3Config() {
            return new TravelServicePackageSelectedV3Config(this.jsonDeserializer);
        }

        private TravelSortingConfig travelSortingConfig() {
            return new TravelSortingConfig(this.jsonDeserializer);
        }

        private TravelSortingV2Config travelSortingV2Config() {
            return new TravelSortingV2Config(this.jsonDeserializer);
        }

        private TravelTextConfig travelTextConfig() {
            return new TravelTextConfig(this.jsonDeserializer);
        }

        private TravelTextV2Config travelTextV2Config() {
            return new TravelTextV2Config(this.jsonDeserializer);
        }

        private TravelTextWithBadgeConfig travelTextWithBadgeConfig() {
            return new TravelTextWithBadgeConfig(this.jsonDeserializer);
        }

        private TravelTextWithSubtitleConfig travelTextWithSubtitleConfig() {
            return new TravelTextWithSubtitleConfig(this.jsonDeserializer);
        }

        private TravelTrainCheckInConfig travelTrainCheckInConfig() {
            return new TravelTrainCheckInConfig(this.jsonDeserializer);
        }

        private TravelTrainRouteConfig travelTrainRouteConfig() {
            return new TravelTrainRouteConfig(this.jsonDeserializer);
        }

        private TravelTrainSeatInfoV2Config travelTrainSeatInfoV2Config() {
            return new TravelTrainSeatInfoV2Config(this.jsonDeserializer);
        }

        private TrustFactorsConfig trustFactorsConfig() {
            return new TrustFactorsConfig(this.jsonDeserializer);
        }

        private ru.ozon.app.android.marketing.ui.trustfactors.core.TrustFactorsConfig trustFactorsConfig2() {
            return new ru.ozon.app.android.marketing.ui.trustfactors.core.TrustFactorsConfig(this.jsonDeserializer);
        }

        private UgcCountersConfig ugcCountersConfig() {
            return new UgcCountersConfig(this.jsonDeserializer);
        }

        private UniversalObjectConfig universalObjectConfig() {
            return new UniversalObjectConfig(this.jsonDeserializer);
        }

        private UniversalObjectScrollConfig universalObjectScrollConfig() {
            return new UniversalObjectScrollConfig(this.jsonDeserializer);
        }

        private UnpaidOrderCounterConfig unpaidOrderCounterConfig() {
            return new UnpaidOrderCounterConfig(this.jsonDeserializer, this.context);
        }

        private UnpaidOrderListConfig unpaidOrderListConfig() {
            return new UnpaidOrderListConfig(this.jsonDeserializer);
        }

        private UnreadMessageIndicatorConfig unreadMessageIndicatorConfig() {
            return new UnreadMessageIndicatorConfig(this.jsonDeserializer);
        }

        private UserLegalEntitiesConfig userLegalEntitiesConfig() {
            return new UserLegalEntitiesConfig(this.jsonDeserializer);
        }

        private UserLegalEntitiesConfigV2 userLegalEntitiesConfigV2() {
            return new UserLegalEntitiesConfigV2(this.jsonDeserializer);
        }

        private UsersFinalRatingConfig usersFinalRatingConfig() {
            return new UsersFinalRatingConfig(this.jsonDeserializer);
        }

        private UsersFinalRatingV2Config usersFinalRatingV2Config() {
            return new UsersFinalRatingV2Config(this.jsonDeserializer);
        }

        private UsersGradesConfig usersGradesConfig() {
            return new UsersGradesConfig(this.jsonDeserializer);
        }

        private VerificationEdoCheckingOperatorConfig verificationEdoCheckingOperatorConfig() {
            return new VerificationEdoCheckingOperatorConfig(this.jsonDeserializer);
        }

        private VerificationEdoCheckingUserConfig verificationEdoCheckingUserConfig() {
            return new VerificationEdoCheckingUserConfig(this.jsonDeserializer);
        }

        private VideoScrollConfig videoScrollConfig() {
            return new VideoScrollConfig(moshiJsonDeserializer());
        }

        private VideoTileConfig videoTileConfig() {
            return new VideoTileConfig(this.jsonDeserializer);
        }

        private WannaDiscountDecisionConfig wannaDiscountDecisionConfig() {
            return new WannaDiscountDecisionConfig(this.jsonDeserializer);
        }

        private WannaDiscountV2Config wannaDiscountV2Config() {
            return new WannaDiscountV2Config(this.jsonDeserializer);
        }

        private WarningTooltipConfig warningTooltipConfig() {
            return new WarningTooltipConfig(this.jsonDeserializer);
        }

        private WebViewWidgetConfig webViewWidgetConfig() {
            return new WebViewWidgetConfig(this.jsonDeserializer);
        }

        private WelcomeScreenConfig welcomeScreenConfig() {
            return new WelcomeScreenConfig(this.jsonDeserializer);
        }

        private WholeSaleConfig wholeSaleConfig() {
            return new WholeSaleConfig(this.jsonDeserializer);
        }

        private WholesaleInputButtonConfig wholesaleInputButtonConfig() {
            return new WholesaleInputButtonConfig(this.jsonDeserializer);
        }

        private WiseSkuScrollConfig wiseSkuScrollConfig() {
            return new WiseSkuScrollConfig(this.jsonDeserializer);
        }

        private WishlistMultiselectConfig wishlistMultiselectConfig() {
            return new WishlistMultiselectConfig(this.jsonDeserializer);
        }

        @Override // ru.ozon.app.android.composer.di.WidgetRegistrationComponentApi
        public Set<i> getSdkWidgets() {
            A.a m11 = A.m(73);
            m11.l(provideComposeWidgets$search_prodGoogleAllVendorsRelease());
            m11.j(ClustersDiModule_ProvideClusters$search_prodGoogleAllVendorsReleaseFactory.provideClusters$search_prodGoogleAllVendorsRelease());
            m11.j(InsightWidgetModule_ProvideInsightWidget$search_prodGoogleAllVendorsReleaseFactory.provideInsightWidget$search_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$pdp_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$ugc_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$core_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$b2b_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$cs_orders_prodGoogleAllVendorsRelease());
            m11.l(OrdersCommonModule_ProvideWidgetFactory$cs_orders_prodGoogleAllVendorsReleaseFactory.provideWidgetFactory$cs_orders_prodGoogleAllVendorsRelease(this.ordersCommonModule));
            m11.l(provideWidget167());
            m11.l(provideComposeWidgetSet$widgets_cart_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgetSet$widgets_unsorted_prodGoogleAllVendorsRelease());
            m11.l(provideWidget168());
            m11.j(TextBlockV2WidgetModule_ProvideWidgetFactory.provideWidget());
            m11.l(provideComposeWidgets$tours_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$tours_prodGoogleAllVendorsRelease2());
            m11.l(provideComposeWidgets$railway_prodGoogleAllVendorsRelease());
            m11.l(TravelRailwayWidgetFactoryModule_ProvideWidgets$railway_prodGoogleAllVendorsReleaseFactory.provideWidgets$railway_prodGoogleAllVendorsRelease(this.travelRailwayWidgetFactoryModule));
            m11.l(provideWidgets$hotels_prodGoogleAllVendorsRelease2());
            m11.l(TravelHotelsMapWidgetV2Module_ProvideWidgets$map_prodGoogleAllVendorsReleaseFactory.provideWidgets$map_prodGoogleAllVendorsRelease(this.travelHotelsMapWidgetV2Module));
            m11.l(provideWidgetFactories$common_prodGoogleAllVendorsRelease());
            m11.l(TravelGeneralWidgetFactoryModule_ProvideWidgets$common_prodGoogleAllVendorsReleaseFactory.provideWidgets$common_prodGoogleAllVendorsRelease(this.travelGeneralWidgetFactoryModule));
            m11.l(provideComposeWidgets$common_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$main_prodGoogleAllVendorsRelease());
            m11.l(TravelGeneralMainWidgetFactoryModule_ProvideWidgets$main_prodGoogleAllVendorsReleaseFactory.provideWidgets$main_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$order_prodGoogleAllVendorsRelease());
            m11.l(TravelGeneralOrderWidgetModule_ProvideWidgetsFactory.provideWidgets());
            m11.l(provideWidgets4());
            m11.l(TravelGeneralBookingWidgetFactoryModule_ProvideWidgets$booking_prodGoogleAllVendorsReleaseFactory.provideWidgets$booking_prodGoogleAllVendorsRelease(this.travelGeneralBookingWidgetFactoryModule));
            m11.l(provideComposeWidgets$b2b_prodGoogleAllVendorsRelease2());
            m11.l(provideComposeWidgets$avia_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$avia_prodGoogleAllVendorsRelease2());
            m11.l(provideWidgetFactories$avia_prodGoogleAllVendorsRelease());
            m11.l(ReturnActionModalWidgetModule_ProvideComposeWidgets$details_prodGoogleAllVendorsReleaseFactory.provideComposeWidgets$details_prodGoogleAllVendorsRelease(this.returnActionModalWidgetModule));
            m11.l(provideComposeWidgets());
            m11.j(OrderActionsV2Module_ProvideWidgetFactories$orderdetails_prodGoogleAllVendorsReleaseFactory.provideWidgetFactories$orderdetails_prodGoogleAllVendorsRelease(this.orderActionsV2Module));
            m11.l(CheckoutWidget2Module_ProvideWidgets$checkout_prodGoogleAllVendorsReleaseFactory.provideWidgets$checkout_prodGoogleAllVendorsRelease(this.checkoutWidget2Module));
            m11.l(provideComposeWidgets$checkout_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$marketing_prodGoogleAllVendorsRelease());
            m11.l(MarketingWidgetsFactoryModule_ProvideWidgets$marketing_prodGoogleAllVendorsReleaseFactory.provideWidgets$marketing_prodGoogleAllVendorsRelease(this.marketingWidgetsFactoryModule));
            m11.l(provideNaviBlocksWidgetFactory());
            m11.l(provideNaviBlocksWidgetFactory2());
            m11.l(provideShellNavTitleComposeWidget$storefront_prodGoogleAllVendorsRelease());
            m11.j(ShellNavBarDiModule_ProvideShellNavbar$storefront_prodGoogleAllVendorsReleaseFactory.provideShellNavbar$storefront_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets2());
            m11.l(provideRateAppComposeWidget$storefront_prodGoogleAllVendorsRelease());
            m11.l(provideAppOnboarding$storefront_prodGoogleAllVendorsRelease());
            m11.l(providePromoPlacementWidgetFactory());
            m11.j(provideIconButtonWidget$storefront_prodGoogleAllVendorsRelease());
            m11.l(provideBloggerLanding$storefront_prodGoogleAllVendorsRelease());
            m11.l(defaultWidgets$composer_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets3());
            m11.l(FamilyGroupWidgetModule_ProvideWidgetFactories$cart_prodGoogleAllVendorsReleaseFactory.provideWidgetFactories$cart_prodGoogleAllVendorsRelease());
            m11.l(PostRenderWidgetModule_ProvideWidgetFactories$cart_prodGoogleAllVendorsReleaseFactory.provideWidgetFactories$cart_prodGoogleAllVendorsRelease());
            m11.l(DebugWidgetsModule_ProvideWidgets$widgets_prodGoogleAllVendorsReleaseFactory.provideWidgets$widgets_prodGoogleAllVendorsRelease(this.debugWidgetsModule));
            m11.l(provideWidgetFactory$widgets_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$widgets_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets4());
            m11.l(provideComposeWidgets$cms_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$widgets_prodGoogleAllVendorsRelease2());
            m11.l(GeoWidget2Module_ProvideWidgets$geo_prodGoogleAllVendorsReleaseFactory.provideWidgets$geo_prodGoogleAllVendorsRelease(this.geoWidget2Module));
            m11.l(provideComposeWidgets5());
            m11.j(ReturnCreationItemInfoWidgetModule_ProvideWidgetFactory.provideWidget(this.returnCreationItemInfoWidgetModule));
            m11.l(ParcelTimelineWidgetModule_ProvideWidgetFactories$orders_prodGoogleAllVendorsReleaseFactory.provideWidgetFactories$orders_prodGoogleAllVendorsRelease());
            m11.j(OrderWidgetModule_ProvideOrderWidgetV1Factory.provideOrderWidgetV1());
            m11.j(OrderWidgetModule_ProvideOrderWidgetV2Factory.provideOrderWidgetV2());
            m11.j(PersonalInfoVerificationModule_ProvidePersonalInfoVerificationWidgetFactory.providePersonalInfoVerificationWidget());
            m11.l(provideComposeWidgets$regulardraw_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$monetization_prodGoogleAllVendorsRelease());
            m11.l(provideHideTabBarOnScrollWidget$tabbar_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgetSet$chat_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$session_prodGoogleAllVendorsRelease());
            m11.l(provideComposeWidgets$notifications_prodGoogleAllVendorsRelease());
            return m11.m();
        }

        @Override // ru.ozon.app.android.composer.di.WidgetRegistrationComponentApi
        public Set<Widget2> getWidgets() {
            A.a m11 = A.m(343);
            m11.j(provideSkuGrid1());
            m11.j(provideSkuGrid2());
            m11.j(provideSkuGrid3());
            m11.j(provideSkuList());
            m11.l(provideSkuScroll());
            m11.j(provideTileGrid2());
            m11.j(provideTileGrid3());
            m11.l(provideWidgets$universalwidgets_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$universalwidgets_prodGoogleAllVendorsRelease2());
            m11.j(provideSkuThinScrollModuleWidget());
            m11.j(provideSearchResultsGrid());
            m11.j(provideSearchResultErrorWidget());
            m11.j(provideWidgets());
            m11.j(provideCategoryMenuWidget());
            m11.j(provideExpandableCellsWidget3());
            m11.j(provideCategoryLogosWidget());
            m11.j(provideTapTagsV2());
            m11.j(provideTapTagsV3());
            m11.j(provideSearchHistoryWidget());
            m11.j(provideHistoryWidget());
            m11.l(provideSearchSuggestionsWidget());
            m11.j(provideSearchBarMobileWidget());
            m11.j(provideModalButtonWidget());
            m11.j(provideSearchRequestWidget());
            m11.j(provideWidget());
            m11.j(provideSuggestions());
            m11.j(provideWidgets2());
            m11.j(provideFeedbackTileWidget());
            m11.j(provideFeedbackFormWidget());
            m11.j(provideFeedbackFormWidget2());
            m11.j(provideSearchBarMobileWidget2());
            m11.j(provideSearchOnboardingWidget());
            m11.j(provideFeedbackTileWidget2());
            m11.l(provideWidgets$pdp_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$pdp_old_widgets_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$ugc_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$core_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$payout_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$b2b_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$cs_orders_prodGoogleAllVendorsRelease());
            m11.l(provideCommonTeeth$cs_orders_prodGoogleAllVendorsRelease());
            m11.l(provideOfflineFintechBanner$cs_orders_prodGoogleAllVendorsRelease());
            m11.j(provideWidget2());
            m11.j(provideWidget3());
            m11.j(provideWidget4());
            m11.j(provideWidget5());
            m11.j(provideWidget6());
            m11.j(provideWidget7());
            m11.j(provideWidget8());
            m11.j(provideWidget9());
            m11.j(provideCancelPostingsV2$cs_orders_prodGoogleAllVendorsRelease());
            m11.j(provideWidget10());
            m11.j(provideWidget11());
            m11.j(provideWidget12());
            m11.j(provideWidget13());
            m11.j(provideWidget14());
            m11.j(provideWidget15());
            m11.j(provideWidget16());
            m11.j(provideWidget17());
            m11.j(provideExternalVerificationHandlerMobileWidget$session_prodGoogleAllVendorsRelease());
            m11.j(provideWidget18());
            m11.j(provideWidget19());
            m11.j(provideWidget20());
            m11.j(provideWidget21());
            m11.j(provideWidget22());
            m11.j(provideWidget23());
            m11.j(provideWidget24());
            m11.j(provideWidget25());
            m11.j(provideWidget26());
            m11.j(provideWidget27());
            m11.j(provideWidget28());
            m11.j(provideWidget29());
            m11.j(provideWidget30());
            m11.j(provideWidget31());
            m11.j(provideWidget32());
            m11.j(provideWidget33());
            m11.j(provideWidget34());
            m11.j(provideWidget35());
            m11.j(provideWidget36());
            m11.j(provideWidget37());
            m11.j(provideWidget38());
            m11.j(provideWidget39());
            m11.j(provideWidget40());
            m11.j(provideWidget41());
            m11.j(provideWidget42());
            m11.j(provideWidget43());
            m11.j(provideWidget44());
            m11.j(provideWidget45());
            m11.j(provideWidget46());
            m11.j(provideWidget47());
            m11.j(provideWidget48());
            m11.j(provideWidget49());
            m11.j(provideWidget50());
            m11.j(provideWidget51());
            m11.j(provideWidget52());
            m11.j(provideWidget53());
            m11.j(provideWidget54());
            m11.j(provideWidget55());
            m11.j(provideWidget56());
            m11.j(providePaymentInfoV2Widget());
            m11.j(provideWidget57());
            m11.j(provideTotalWidget());
            m11.j(provideWidget58());
            m11.j(provideWidget59());
            m11.l(provideWidget$widgets_checkout_prodGoogleAllVendorsRelease());
            m11.j(provideWidget60());
            m11.j(provideWidget61());
            m11.j(provideWidget62());
            m11.j(provideWidget63());
            m11.j(provideWidget64());
            m11.j(provideWidget65());
            m11.l(provideWidget66());
            m11.j(provideWidget67());
            m11.j(provideWidget68());
            m11.j(provideWidget69());
            m11.j(provideWidget70());
            m11.j(provideWidget71());
            m11.j(provideWidget72());
            m11.j(provideWidget73());
            m11.j(provideWidget74());
            m11.j(provideWidget75());
            m11.j(provideWidget76());
            m11.j(provideWidget77());
            m11.j(provideWidget78());
            m11.j(provideWidget79());
            m11.j(provideWidget80());
            m11.j(provideWidget81());
            m11.j(provideWidget82());
            m11.j(provideWidget83());
            m11.j(provideWidget84());
            m11.j(provideWidget85());
            m11.j(provideWidget86());
            m11.j(provideWidget87());
            m11.j(provideWidget88());
            m11.j(provideWidget89());
            m11.j(provideWidget90());
            m11.j(provideWidget91());
            m11.j(provideWidget92());
            m11.j(provideWidget93());
            m11.j(provideWidget94());
            m11.j(provideWidget95());
            m11.j(provideWidget96());
            m11.j(provideWidget97());
            m11.l(provideWidget98());
            m11.j(provideWidget99());
            m11.j(provideWidget100());
            m11.j(provideWidget101());
            m11.j(provideWidget102());
            m11.j(provideWidget103());
            m11.j(provideWidget104());
            m11.l(provideWidgets$tours_prodGoogleAllVendorsRelease());
            m11.l(provideWidget$railway_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$hotels_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$common_prodGoogleAllVendorsRelease());
            m11.l(provideWidgetsV2$common_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$main_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$order_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$services_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$booking_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$b2b_prodGoogleAllVendorsRelease2());
            m11.l(provideWidgets$avia_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$old_widgets_prodGoogleAllVendorsRelease());
            m11.l(provideWidget$cart_prodGoogleAllVendorsRelease());
            m11.l(provideOzonBankWidgets$ozonbank_prodGoogleAllVendorsRelease());
            m11.j(provideWidget$details_prodGoogleAllVendorsRelease());
            m11.j(provideWidget$details_prodGoogleAllVendorsRelease2());
            m11.j(provideWidget$details_prodGoogleAllVendorsRelease3());
            m11.j(provideWidget$details_prodGoogleAllVendorsRelease4());
            m11.j(provideWidget$details_prodGoogleAllVendorsRelease5());
            m11.j(provideWidget$details_prodGoogleAllVendorsRelease6());
            m11.j(provideWidget$details_prodGoogleAllVendorsRelease7());
            m11.j(provideWidget$details_prodGoogleAllVendorsRelease8());
            m11.j(provideWidget$details_prodGoogleAllVendorsRelease9());
            m11.l(provideWidgets$orderdetails_prodGoogleAllVendorsRelease());
            m11.j(provideNotificationBarRestrictionWidget$orderdetails_prodGoogleAllVendorsRelease());
            m11.j(provideWidget105());
            m11.j(provideWidget106());
            m11.j(provideWidget107());
            m11.j(provideWidget108());
            m11.j(provideWidget109());
            m11.j(provideWidget110());
            m11.j(provideWidget111());
            m11.j(provideWidget112());
            m11.j(provideWidget113());
            m11.j(provideOrderStatusWidget$orderdetails_prodGoogleAllVendorsRelease());
            m11.j(provideProductsToPay$orderdetails_prodGoogleAllVendorsRelease());
            m11.j(provideWidget114());
            m11.j(provideWidget115());
            m11.j(provideWidget116());
            m11.j(provideWidget117());
            m11.j(provideWidget118());
            m11.j(provideWidget119());
            m11.j(provideWidget$orderdetails_prodGoogleAllVendorsRelease());
            m11.j(provideWidget120());
            m11.j(provideWidget121());
            m11.j(provideAdvInfo());
            m11.j(provideWidget122());
            m11.j(provideAdvRefreshWithDelay());
            m11.j(provideWidget123());
            m11.j(provideAdvRefreshWithDelay2());
            m11.l(provideWidgets$marketing_prodGoogleAllVendorsRelease());
            m11.j(provideHammersWidget());
            m11.j(provideBigPromoWidget());
            m11.j(provideTimerWidget());
            m11.j(provideBigPromoWidget2());
            m11.j(provideWidget124());
            m11.j(provideWidget125());
            m11.j(provideWidget126());
            m11.j(provideBigPromoWidget3());
            m11.j(provideWidget127());
            m11.j(provideWidget128());
            m11.j(provideWidget129());
            m11.j(provideScrollAnchorWidget$storefront_prodGoogleAllVendorsRelease());
            m11.j(provideScrollAnchorWidget$storefront_prodGoogleAllVendorsRelease2());
            m11.j(provideScrollAnchorWidget$storefront_prodGoogleAllVendorsRelease3());
            m11.j(provideMegaRaffleWidget$storefront_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$storefront_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$storefront_prodGoogleAllVendorsRelease2());
            m11.l(provideWidgets$storefront_prodGoogleAllVendorsRelease3());
            m11.l(provideWidgets$storefront_prodGoogleAllVendorsRelease4());
            m11.l(provideWidgets$storefront_prodGoogleAllVendorsRelease5());
            m11.j(provideMiniappHeaderWidget$storefront_prodGoogleAllVendorsRelease());
            m11.j(provideWidget$storefront_prodGoogleAllVendorsRelease());
            m11.j(provideWidget$storefront_prodGoogleAllVendorsRelease2());
            m11.j(provideNavBarApparelWidget$storefront_prodGoogleAllVendorsRelease());
            m11.j(provideProfileCellWidget());
            m11.j(provideMiniappHeaderWidget$storefront_prodGoogleAllVendorsRelease2());
            m11.j(provideWidget$storefront_prodGoogleAllVendorsRelease3());
            m11.j(provideWidget$storefront_prodGoogleAllVendorsRelease4());
            m11.j(provideWidget130());
            m11.j(provideFinanceHeader$storefront_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$storefront_prodGoogleAllVendorsRelease6());
            m11.j(provideHelpCert());
            m11.j(provideWidget$storefront_prodGoogleAllVendorsRelease5());
            m11.l(provideWidgets$storefront_prodGoogleAllVendorsRelease7());
            m11.j(provideAccessControlWidget());
            m11.j(provideFavoriteProductV2Widget());
            m11.j(provideCreateShoppingListWidget());
            m11.j(provideShoppingListsV2Widget());
            m11.j(provideButtonStackWidget());
            m11.j(provideWishlistMultiselectWidget());
            m11.j(provideApplyWishlistWidget());
            m11.j(provideFamilyProfileAvatarWidget());
            m11.j(provideWidget$orderTracking_prodGoogleAllVendorsRelease());
            m11.j(provideWidget131());
            m11.j(provideWidget132());
            m11.j(provideWidget133());
            m11.l(provideWidgets$session_prodGoogleAllVendorsRelease());
            m11.j(provideWidget134());
            m11.l(provideWidget135());
            m11.l(provideWidget136());
            m11.j(provideWidget$storefront_prodGoogleAllVendorsRelease6());
            m11.l(provideMarketingDetailWidget());
            m11.j(provideControlsWidget());
            m11.j(provideControlsWidget2());
            m11.l(provideMasterWidget());
            m11.j(provideWidget137());
            m11.l(provideCartSplitV2Widget());
            m11.l(provideCartSplitV2Widget2());
            m11.l(provideEmptyCartV2());
            m11.j(provideWidget138());
            m11.j(provideCartButtonWithTooltipWidget());
            m11.j(providePixelWidget());
            m11.l(provideAsyncWidget());
            m11.l(provideWidgets$messenger_prodGoogleAllVendorsRelease());
            m11.l(provideWidget$widgets_prodGoogleAllVendorsRelease());
            m11.j(provideButtonWidget$button_widget_prodGoogleAllVendorsRelease());
            m11.l(provideWidget$widgets_prodGoogleAllVendorsRelease2());
            m11.j(provideActionCardsWidget$action_cards_prodGoogleAllVendorsRelease());
            m11.l(provideTagList());
            m11.j(provideProgressiveTextWidget$progressive_molecula_prodGoogleAllVendorsRelease());
            m11.l(provideIslandSeparatorWidget());
            m11.j(provideWidget$orderdone_prodGoogleAllVendorsRelease());
            m11.j(provideWidget139());
            m11.j(provideWidget140());
            m11.j(provideWidget141());
            m11.j(provideWidget142());
            m11.j(provideWidget143());
            m11.j(provideWidget144());
            m11.l(provideWidgets$universalwidgets_prodGoogleAllVendorsRelease3());
            m11.l(provideWidgets3());
            m11.l(provideWidget$cms_prodGoogleAllVendorsRelease());
            m11.j(provideSeparatorWidget());
            m11.j(provideWidget145());
            m11.j(provideWidget146());
            m11.j(provideWidget147());
            m11.j(provideWidget$courieronmap_prodGoogleAllVendorsRelease());
            m11.l(provideWidgets$cabinet_prodGoogleAllVendorsRelease());
            m11.j(provideDeliveryReviewFormWidget());
            m11.j(provideDeliveryReviewHeaderWidget$deliveryreview_prodGoogleAllVendorsRelease());
            m11.j(provideDeliveryReviewSuccessWidget$deliveryreview_prodGoogleAllVendorsRelease());
            m11.j(provideWidget$creation_prodGoogleAllVendorsRelease());
            m11.j(provideActiveDeliveriesWidget());
            m11.j(provideWidget148());
            m11.j(provideWidget$creation_prodGoogleAllVendorsRelease2());
            m11.j(provideWidget$creation_prodGoogleAllVendorsRelease3());
            m11.j(provideWidget$creation_prodGoogleAllVendorsRelease4());
            m11.j(provideWidget$creation_prodGoogleAllVendorsRelease5());
            m11.j(provideWidget$creation_prodGoogleAllVendorsRelease6());
            m11.j(provideWidget$creation_prodGoogleAllVendorsRelease7());
            m11.j(provideWidget$creation_prodGoogleAllVendorsRelease8());
            m11.j(provideWidget149());
            m11.j(provideWidget150());
            m11.j(provideWidget151());
            m11.j(provideWidget152());
            m11.j(provideWidget153());
            m11.j(provideWidget154());
            m11.j(provideOrderCalculatorWidget());
            m11.j(provideBoxListWidget());
            m11.j(provideRegionSearchWidget());
            m11.j(provideParticipantPhoneWidget());
            m11.j(provideInputWidget());
            m11.j(provideStickyButtonWidget());
            m11.j(provideSearchBarWidget());
            m11.j(provideInputWidget2());
            m11.j(provideSelectCategoryWidget());
            m11.j(provideOrderGeoInfoWidget());
            m11.j(provideCmlCellListWidget());
            m11.j(provideSecureDealWidget());
            m11.j(provideSecureDealCurtainWidget());
            m11.j(provideParcelPhotoAddWidget());
            m11.j(provideWidget155());
            m11.j(provideWidget156());
            m11.j(provideWidget157());
            m11.j(provideWidget158());
            m11.l(provideRegularDrawWidgets$regulardraw_prodGoogleAllVendorsRelease());
            m11.j(provideWidget159());
            m11.j(provideWidget$barcode_prodGoogleAllVendorsRelease());
            m11.l(provideMonetizationWidgets$monetization_prodGoogleAllVendorsRelease());
            m11.j(provideFiltersWidget$filter_widgets_prodGoogleAllVendorsRelease());
            m11.j(provideFiltersWidget$filter_widgets_prodGoogleAllVendorsRelease2());
            m11.l(provideWidget$commonwidgets_prodGoogleAllVendorsRelease());
            m11.j(provideWidget160());
            m11.j(provideAnnotationWidget());
            m11.j(provideAnnotationWidget2());
            m11.j(provideWidget161());
            m11.j(provideCancelPostingsV2$cancels_prodGoogleAllVendorsRelease());
            m11.j(provideWidget$cancels_prodGoogleAllVendorsRelease());
            m11.j(provideWidget162());
            m11.j(provideWidget163());
            m11.j(provideWidget164());
            m11.j(provideWidget165());
            m11.j(provideWidget166());
            return m11.m();
        }

        private WidgetRegistrationComponentImpl(SearchWidgetV2DiModule searchWidgetV2DiModule, PdpWidgetsModule pdpWidgetsModule, PdpOldWidgetsModule pdpOldWidgetsModule, UgcWidgetsModule ugcWidgetsModule, UgcCoreWidgetsModule ugcCoreWidgetsModule, UgcPayoutWidgetsModule ugcPayoutWidgetsModule, OrdersCommonModule ordersCommonModule, OrderListModule orderListModule, ProductsPackageModule productsPackageModule, SelectPaymentModule selectPaymentModule, NavBarModule navBarModule, ChangeDeliveryTimeButtonModule changeDeliveryTimeButtonModule, RecipientWidgetModule recipientWidgetModule, OrderFiltersModule orderFiltersModule, OrderGalleryWidgetModule orderGalleryWidgetModule, DeliveryDateChangedComplaintFormModule deliveryDateChangedComplaintFormModule, DeliveryComplainWidgetModule deliveryComplainWidgetModule, BarcodeWidgetModule barcodeWidgetModule, ActionButtonV2WidgetModule actionButtonV2WidgetModule, ActiveOrdersCountWidgetModule activeOrdersCountWidgetModule, ClickToDeliveryModalWidgetModule clickToDeliveryModalWidgetModule, BarcodePopoverWidgetModule barcodePopoverWidgetModule, OrderProductsWidgetModule orderProductsWidgetModule, EditCredentialsWidgetsModule editCredentialsWidgetsModule, AddressCommunicationWidgetModule addressCommunicationWidgetModule, BannerListWidgetModule bannerListWidgetModule, CatalogShelfWidgetModule catalogShelfWidgetModule, CatalogueTabsWidgetModule catalogueTabsWidgetModule, CatalogTabsV2WidgetModule catalogTabsV2WidgetModule, CouponGoalsV2WidgetModule couponGoalsV2WidgetModule, CurtainGoalsV2WidgetModule curtainGoalsV2WidgetModule, OrderTrackingWidgetModule orderTrackingWidgetModule, PromoCarouselWidgetModule promoCarouselWidgetModule, ExpressRedirectButtonWidgetModule expressRedirectButtonWidgetModule, ExpressNavigationSliderWidgetModule expressNavigationSliderWidgetModule, FakeSearchWidgetModule fakeSearchWidgetModule, NavSliderV3WidgetModule navSliderV3WidgetModule, ScrollWidgetModule scrollWidgetModule, FreshMiniappHeaderWidgetModule freshMiniappHeaderWidgetModule, ScrollActionListModule scrollActionListModule, HeaderWidgetModule headerWidgetModule, CatalogTileScrollWidgetModule catalogTileScrollWidgetModule, CatalogTileWidgetModule catalogTileWidgetModule, NotificationCarouselV2WidgetModule notificationCarouselV2WidgetModule, CustomCellWidgetModule customCellWidgetModule, WiseSkuScrollWidgetModule wiseSkuScrollWidgetModule, StickyPromoBannerWidgetModule stickyPromoBannerWidgetModule, AddressPopupButtonWidgetModule addressPopupButtonWidgetModule, DeliveryRatingWidgetModule deliveryRatingWidgetModule, GeotrackingMapV2WidgetModule geotrackingMapV2WidgetModule, OrderInfoWidgetModule orderInfoWidgetModule, OrderItemsWidgetModule orderItemsWidgetModule, OrderStatusV3WidgetModule orderStatusV3WidgetModule, GeotrackingBottomButtonWidgetModule geotrackingBottomButtonWidgetModule, FreshCartWidgetsModule freshCartWidgetsModule, CartTileWidgetModule cartTileWidgetModule, CartClickTileWidgetModule cartClickTileWidgetModule, CartMasterWidgetModule cartMasterWidgetModule, CartIconButtonWidgetModule cartIconButtonWidgetModule, StickyTotalWidgetModule stickyTotalWidgetModule, DetailedCheckoutProductsWidgetModule detailedCheckoutProductsWidgetModule, CellListWidgetModule cellListWidgetModule, FreshUnsortedWidgetsModule freshUnsortedWidgetsModule, AddressSelectorLiteWidgetModule addressSelectorLiteWidgetModule, AutoCatalogWidgetModule autoCatalogWidgetModule, BottomCartWidgetModule bottomCartWidgetModule, BrandzoneCarouselWidgetModule brandzoneCarouselWidgetModule, CharityAddressSelectorWidgetModule charityAddressSelectorWidgetModule, CourierTipsWidgetModule courierTipsWidgetModule, DeliveryProblemsWidgetModule deliveryProblemsWidgetModule, DeliveryToCharitiesInfoModule deliveryToCharitiesInfoModule, DeliveryWidgetV2Module deliveryWidgetV2Module, DeliveryWidgetV3Module deliveryWidgetV3Module, DeliveryWidgetBigOzonModule deliveryWidgetBigOzonModule, HomeButtonWidgetModule homeButtonWidgetModule, IconButtonsWidgetModule iconButtonsWidgetModule, InfoDropDownWidgetModule infoDropDownWidgetModule, IslandSeparatorWidgetModule islandSeparatorWidgetModule, OrderStatusLiveActivityWidgetModule orderStatusLiveActivityWidgetModule, ProductsInBotWidgetModule productsInBotWidgetModule, SearchBarWidgetModule searchBarWidgetModule, WholeSaleWidgetModule wholeSaleWidgetModule, FreshServiceCarouselWidgetModule freshServiceCarouselWidgetModule, ExpressNavBarWidgetModule expressNavBarWidgetModule, ExpressNavTitleWidgetModule expressNavTitleWidgetModule, ExpressAvailabilityWidgetModule expressAvailabilityWidgetModule, FeedbackCurtainWidgetModule feedbackCurtainWidgetModule, PromoOfferWidgetModule promoOfferWidgetModule, RecShelfWidgetModule recShelfWidgetModule, SeparatorBadgeWidgetModule separatorBadgeWidgetModule, ImageBadgeListWidgetModule imageBadgeListWidgetModule, BottomContainerWidgetModule bottomContainerWidgetModule, ProductsInBotV2WidgetModule productsInBotV2WidgetModule, PdpAspectsWidgetModule pdpAspectsWidgetModule, PdpNutritionInfoWidgetModule pdpNutritionInfoWidgetModule, FreshTileGridWidgetModule freshTileGridWidgetModule, SteppedThermometerModule steppedThermometerModule, TravelToursWidgetFactoryModule travelToursWidgetFactoryModule, TravelRailwayWidgetFactoryModule travelRailwayWidgetFactoryModule, TravelHotelsMapWidgetV2Module travelHotelsMapWidgetV2Module, TravelGeneralWidgetV2Module travelGeneralWidgetV2Module, TravelGeneralWidgetFactoryModule travelGeneralWidgetFactoryModule, TravelGeneralBookingWidgetFactoryModule travelGeneralBookingWidgetFactoryModule, PremiumPointsTrainV2Module premiumPointsTrainV2Module, ReturnListWidgetModule returnListWidgetModule, ReturnListEmptyModule returnListEmptyModule, ReturnDetailsWidgetModule returnDetailsWidgetModule, ReturnDetailsHeaderButtonWidgetModule returnDetailsHeaderButtonWidgetModule, ReturnActionModalWidgetModule returnActionModalWidgetModule, ReturnableItemsListWidgetModule returnableItemsListWidgetModule, ReturnEditWidgetModule returnEditWidgetModule, ReturnDetailsTotalWidgetModule returnDetailsTotalWidgetModule, ReturnActionButtonsWidgetModule returnActionButtonsWidgetModule, ReturnBalanceModalWidgetModule returnBalanceModalWidgetModule, OrderActionsV2Module orderActionsV2Module, OrderDetailsItemModule orderDetailsItemModule, CustomsFeesModule customsFeesModule, OrderTotalModule orderTotalModule, OrderTimelineV2Module orderTimelineV2Module, OrderTrackShipmentModule orderTrackShipmentModule, TimeLeftWidgetModule timeLeftWidgetModule, OrderActionsModule orderActionsModule, OrderDeliveryDetailV2Module orderDeliveryDetailV2Module, OrderStatusModule orderStatusModule, ChequesWidgetModule chequesWidgetModule, DateSelectorWidgetModule dateSelectorWidgetModule, DeliveryTimeSelectorV1Module deliveryTimeSelectorV1Module, RadioGroupWidgetModule radioGroupWidgetModule, ReplyToCourierInfoWidgetModule replyToCourierInfoWidgetModule, SelectCancelReasonModule selectCancelReasonModule, ExtendBackgroundWidgetModule extendBackgroundWidgetModule, ModalConstructorModule modalConstructorModule, CheckoutWidget2Module checkoutWidget2Module, AdvPageStayDiModule advPageStayDiModule, MarketingWidgets2Module marketingWidgets2Module, MarketingWidgetsFactoryModule marketingWidgetsFactoryModule, SisBrandFavoriteWidgetModule sisBrandFavoriteWidgetModule, BigPromoCheckoutWidgetModule bigPromoCheckoutWidgetModule, MegaDrawModule megaDrawModule, NaviBlocksModule naviBlocksModule, NaviBlocksV3Module naviBlocksV3Module, NaviBlocksV5Module naviBlocksV5Module, NaviCategoriesModule naviCategoriesModule, NaviGridModule naviGridModule, NaviGrid3Module naviGrid3Module, VideoTileWidgetModule videoTileWidgetModule, VideoScrollWidgetModule videoScrollWidgetModule, FinanceWidgetModule financeWidgetModule, FinanceWidgetV2Module financeWidgetV2Module, AppOnboardingWidgetModule appOnboardingWidgetModule, PromoPlacementModule promoPlacementModule, ProfileIconButtonWidgetModule profileIconButtonWidgetModule, NavLikezoneCaruselDiModule navLikezoneCaruselDiModule, DefaultWidgetsModule defaultWidgetsModule, FavoriteProductV2WidgetModule favoriteProductV2WidgetModule, FlashCallWidget2Module flashCallWidget2Module, SellerProductsWidgetsModule sellerProductsWidgetsModule, FaqWidgetModule faqWidgetModule, PlayStoriesV3WidgetModule playStoriesV3WidgetModule, CartWidget2Module cartWidget2Module, ControlsModule controlsModule, ControlsV3Module controlsV3Module, MasterWidgetModule masterWidgetModule, TotalV3WidgetModule totalV3WidgetModule, CartSplitV2Module cartSplitV2Module, CartSplitV2ModuleV2 cartSplitV2ModuleV2, EmptyCartV2Module emptyCartV2Module, CheckoutPrefetchWidgetModule checkoutPrefetchWidgetModule, PixelModule pixelModule, AsyncWidgetModule asyncWidgetModule, DebugWidgetsModule debugWidgetsModule, ActionCardsModule actionCardsModule, ProgressiveTextModule progressiveTextModule, ru.ozon.app.android.di.IslandSeparatorWidgetModule islandSeparatorWidgetModule2, OrderDoneWidgets2Module orderDoneWidgets2Module, OrderDonePaymentStatusWidgetModule orderDonePaymentStatusWidgetModule, OrderDoneDisclaimerWidgetModule orderDoneDisclaimerWidgetModule, OrderDoneTotalWidgetModule orderDoneTotalWidgetModule, OrderDoneCrossButtonWidgetModule orderDoneCrossButtonWidgetModule, OrderDoneButtonBarWidgetModule orderDoneButtonBarWidgetModule, EnableNotificationsSnackbarWidgetModule enableNotificationsSnackbarWidgetModule, ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsWidgetModule courierTipsWidgetModule2, ObjectScrollWidgetV2Module objectScrollWidgetV2Module, UniversalObjectV2Module universalObjectV2Module, CommonTextWidgetModule commonTextWidgetModule, ActionButtonModule actionButtonModule, GeoWidget2Module geoWidget2Module, DeliveryCabinetWidgetV2Module deliveryCabinetWidgetV2Module, DeliveryReviewFormWidget2Module deliveryReviewFormWidget2Module, DeliveryReviewHeaderModule deliveryReviewHeaderModule, DeliveryReviewSuccessModule deliveryReviewSuccessModule, ReturnCreationWidgetsModule returnCreationWidgetsModule, ReturnCreationModalWidgetModule returnCreationModalWidgetModule, ReturnCreationActiveDeliveriesWidgetModule returnCreationActiveDeliveriesWidgetModule, ReturnCreationMethodsWidgetModule returnCreationMethodsWidgetModule, ReturnCreationTotalWidgetModule returnCreationTotalWidgetModule, ReturnCreationSelectedItemsWidgetModule returnCreationSelectedItemsWidgetModule, ReturnCreationStepsWidgetModule returnCreationStepsWidgetModule, ReturnCreationOrdersWidgetModule returnCreationOrdersWidgetModule, ReturnCreationOrderWidgetModule returnCreationOrderWidgetModule, ReturnCreationReasonsWidgetModule returnCreationReasonsWidgetModule, ReturnTextAreaButtonWidgetModule returnTextAreaButtonWidgetModule, ReturnCreationPhotoPickerWidgetModule returnCreationPhotoPickerWidgetModule, ReturnCreationItemInfoWidgetModule returnCreationItemInfoWidgetModule, DeliveryOrderOnDetailsWidgetModule deliveryOrderOnDetailsWidgetModule, DeliveryInfoWidgetModule deliveryInfoWidgetModule, DeliveryOrderInputWidgetModule deliveryOrderInputWidgetModule, GroupButtonsWidgetModule groupButtonsWidgetModule, DeliveryOrderListWidgetModule deliveryOrderListWidgetModule, TipCourierDetailsV2Module tipCourierDetailsV2Module, TipCourierHeaderWidgetModule tipCourierHeaderWidgetModule, TipCourierReviewV2WidgetModule tipCourierReviewV2WidgetModule, TipProductPhotosModule tipProductPhotosModule, EmptyScreenWidgetModule emptyScreenWidgetModule, BarcodeProductsListWidgetModule barcodeProductsListWidgetModule, BorderlessButtonWidgetModule borderlessButtonWidgetModule, TextWidgetModule textWidgetModule, ru.ozon.app.android.returns.cancels.cancelReasons.di.SelectCancelReasonModule selectCancelReasonModule2, ru.ozon.app.android.returns.cancels.modalConstructor.di.ModalConstructorModule modalConstructorModule2, PromptStatusWidgetModule promptStatusWidgetModule, ResponseActionsWidgetModule responseActionsWidgetModule, Context context, Application application, JsonParser jsonParser, JsonSerializer jsonSerializer, Moshi moshi, FeatureChecker featureChecker, AppType appType) {
            this.widgetRegistrationComponentImpl = this;
            this.jsonDeserializer = jsonParser;
            this.context = context;
            this.pdpWidgetsModule = pdpWidgetsModule;
            this.pdpOldWidgetsModule = pdpOldWidgetsModule;
            this.ugcWidgetsModule = ugcWidgetsModule;
            this.ugcCoreWidgetsModule = ugcCoreWidgetsModule;
            this.ugcPayoutWidgetsModule = ugcPayoutWidgetsModule;
            this.ordersCommonModule = ordersCommonModule;
            this.orderListModule = orderListModule;
            this.productsPackageModule = productsPackageModule;
            this.selectPaymentModule = selectPaymentModule;
            this.navBarModule = navBarModule;
            this.changeDeliveryTimeButtonModule = changeDeliveryTimeButtonModule;
            this.recipientWidgetModule = recipientWidgetModule;
            this.orderFiltersModule = orderFiltersModule;
            this.orderGalleryWidgetModule = orderGalleryWidgetModule;
            this.deliveryDateChangedComplaintFormModule = deliveryDateChangedComplaintFormModule;
            this.deliveryComplainWidgetModule = deliveryComplainWidgetModule;
            this.barcodeWidgetModule = barcodeWidgetModule;
            this.actionButtonV2WidgetModule = actionButtonV2WidgetModule;
            this.moshi = moshi;
            this.activeOrdersCountWidgetModule = activeOrdersCountWidgetModule;
            this.clickToDeliveryModalWidgetModule = clickToDeliveryModalWidgetModule;
            this.barcodePopoverWidgetModule = barcodePopoverWidgetModule;
            this.orderProductsWidgetModule = orderProductsWidgetModule;
            this.editCredentialsWidgetsModule = editCredentialsWidgetsModule;
            this.addressCommunicationWidgetModule = addressCommunicationWidgetModule;
            this.bannerListWidgetModule = bannerListWidgetModule;
            this.catalogShelfWidgetModule = catalogShelfWidgetModule;
            this.catalogueTabsWidgetModule = catalogueTabsWidgetModule;
            this.couponGoalsV2WidgetModule = couponGoalsV2WidgetModule;
            this.curtainGoalsV2WidgetModule = curtainGoalsV2WidgetModule;
            this.orderTrackingWidgetModule = orderTrackingWidgetModule;
            this.promoCarouselWidgetModule = promoCarouselWidgetModule;
            this.expressRedirectButtonWidgetModule = expressRedirectButtonWidgetModule;
            this.expressNavigationSliderWidgetModule = expressNavigationSliderWidgetModule;
            this.fakeSearchWidgetModule = fakeSearchWidgetModule;
            this.navSliderV3WidgetModule = navSliderV3WidgetModule;
            this.scrollWidgetModule = scrollWidgetModule;
            this.freshMiniappHeaderWidgetModule = freshMiniappHeaderWidgetModule;
            this.scrollActionListModule = scrollActionListModule;
            this.headerWidgetModule = headerWidgetModule;
            this.catalogTileScrollWidgetModule = catalogTileScrollWidgetModule;
            this.catalogTileWidgetModule = catalogTileWidgetModule;
            this.notificationCarouselV2WidgetModule = notificationCarouselV2WidgetModule;
            this.customCellWidgetModule = customCellWidgetModule;
            this.wiseSkuScrollWidgetModule = wiseSkuScrollWidgetModule;
            this.stickyPromoBannerWidgetModule = stickyPromoBannerWidgetModule;
            this.addressPopupButtonWidgetModule = addressPopupButtonWidgetModule;
            this.deliveryRatingWidgetModule = deliveryRatingWidgetModule;
            this.geotrackingMapV2WidgetModule = geotrackingMapV2WidgetModule;
            this.orderInfoWidgetModule = orderInfoWidgetModule;
            this.orderItemsWidgetModule = orderItemsWidgetModule;
            this.orderStatusV3WidgetModule = orderStatusV3WidgetModule;
            this.geotrackingBottomButtonWidgetModule = geotrackingBottomButtonWidgetModule;
            this.cartTileWidgetModule = cartTileWidgetModule;
            this.cartClickTileWidgetModule = cartClickTileWidgetModule;
            this.cartMasterWidgetModule = cartMasterWidgetModule;
            this.cartIconButtonWidgetModule = cartIconButtonWidgetModule;
            this.stickyTotalWidgetModule = stickyTotalWidgetModule;
            this.detailedCheckoutProductsWidgetModule = detailedCheckoutProductsWidgetModule;
            this.cellListWidgetModule = cellListWidgetModule;
            this.addressSelectorLiteWidgetModule = addressSelectorLiteWidgetModule;
            this.autoCatalogWidgetModule = autoCatalogWidgetModule;
            this.bottomCartWidgetModule = bottomCartWidgetModule;
            this.brandzoneCarouselWidgetModule = brandzoneCarouselWidgetModule;
            this.charityAddressSelectorWidgetModule = charityAddressSelectorWidgetModule;
            this.courierTipsWidgetModule = courierTipsWidgetModule;
            this.deliveryProblemsWidgetModule = deliveryProblemsWidgetModule;
            this.deliveryToCharitiesInfoModule = deliveryToCharitiesInfoModule;
            this.deliveryWidgetV2Module = deliveryWidgetV2Module;
            this.deliveryWidgetV3Module = deliveryWidgetV3Module;
            this.deliveryWidgetBigOzonModule = deliveryWidgetBigOzonModule;
            this.homeButtonWidgetModule = homeButtonWidgetModule;
            this.iconButtonsWidgetModule = iconButtonsWidgetModule;
            this.infoDropDownWidgetModule = infoDropDownWidgetModule;
            this.islandSeparatorWidgetModule = islandSeparatorWidgetModule;
            this.orderStatusLiveActivityWidgetModule = orderStatusLiveActivityWidgetModule;
            this.productsInBotWidgetModule = productsInBotWidgetModule;
            this.searchBarWidgetModule = searchBarWidgetModule;
            this.wholeSaleWidgetModule = wholeSaleWidgetModule;
            this.freshServiceCarouselWidgetModule = freshServiceCarouselWidgetModule;
            this.expressNavBarWidgetModule = expressNavBarWidgetModule;
            this.expressNavTitleWidgetModule = expressNavTitleWidgetModule;
            this.expressAvailabilityWidgetModule = expressAvailabilityWidgetModule;
            this.feedbackCurtainWidgetModule = feedbackCurtainWidgetModule;
            this.promoOfferWidgetModule = promoOfferWidgetModule;
            this.recShelfWidgetModule = recShelfWidgetModule;
            this.separatorBadgeWidgetModule = separatorBadgeWidgetModule;
            this.imageBadgeListWidgetModule = imageBadgeListWidgetModule;
            this.bottomContainerWidgetModule = bottomContainerWidgetModule;
            this.productsInBotV2WidgetModule = productsInBotV2WidgetModule;
            this.pdpAspectsWidgetModule = pdpAspectsWidgetModule;
            this.pdpNutritionInfoWidgetModule = pdpNutritionInfoWidgetModule;
            this.freshTileGridWidgetModule = freshTileGridWidgetModule;
            this.steppedThermometerModule = steppedThermometerModule;
            this.travelGeneralWidgetV2Module = travelGeneralWidgetV2Module;
            this.premiumPointsTrainV2Module = premiumPointsTrainV2Module;
            this.returnListWidgetModule = returnListWidgetModule;
            this.returnListEmptyModule = returnListEmptyModule;
            this.returnDetailsWidgetModule = returnDetailsWidgetModule;
            this.returnDetailsHeaderButtonWidgetModule = returnDetailsHeaderButtonWidgetModule;
            this.returnableItemsListWidgetModule = returnableItemsListWidgetModule;
            this.returnEditWidgetModule = returnEditWidgetModule;
            this.returnDetailsTotalWidgetModule = returnDetailsTotalWidgetModule;
            this.returnActionButtonsWidgetModule = returnActionButtonsWidgetModule;
            this.returnBalanceModalWidgetModule = returnBalanceModalWidgetModule;
            this.orderDetailsItemModule = orderDetailsItemModule;
            this.customsFeesModule = customsFeesModule;
            this.orderTotalModule = orderTotalModule;
            this.orderTimelineV2Module = orderTimelineV2Module;
            this.orderTrackShipmentModule = orderTrackShipmentModule;
            this.timeLeftWidgetModule = timeLeftWidgetModule;
            this.orderActionsModule = orderActionsModule;
            this.orderDeliveryDetailV2Module = orderDeliveryDetailV2Module;
            this.orderStatusModule = orderStatusModule;
            this.chequesWidgetModule = chequesWidgetModule;
            this.dateSelectorWidgetModule = dateSelectorWidgetModule;
            this.deliveryTimeSelectorV1Module = deliveryTimeSelectorV1Module;
            this.radioGroupWidgetModule = radioGroupWidgetModule;
            this.replyToCourierInfoWidgetModule = replyToCourierInfoWidgetModule;
            this.selectCancelReasonModule = selectCancelReasonModule;
            this.extendBackgroundWidgetModule = extendBackgroundWidgetModule;
            this.modalConstructorModule = modalConstructorModule;
            this.advPageStayDiModule = advPageStayDiModule;
            this.marketingWidgets2Module = marketingWidgets2Module;
            this.sisBrandFavoriteWidgetModule = sisBrandFavoriteWidgetModule;
            this.bigPromoCheckoutWidgetModule = bigPromoCheckoutWidgetModule;
            this.megaDrawModule = megaDrawModule;
            this.naviBlocksModule = naviBlocksModule;
            this.naviCategoriesModule = naviCategoriesModule;
            this.naviGridModule = naviGridModule;
            this.naviGrid3Module = naviGrid3Module;
            this.videoTileWidgetModule = videoTileWidgetModule;
            this.videoScrollWidgetModule = videoScrollWidgetModule;
            this.financeWidgetModule = financeWidgetModule;
            this.navLikezoneCaruselDiModule = navLikezoneCaruselDiModule;
            this.favoriteProductV2WidgetModule = favoriteProductV2WidgetModule;
            this.flashCallWidget2Module = flashCallWidget2Module;
            this.sellerProductsWidgetsModule = sellerProductsWidgetsModule;
            this.faqWidgetModule = faqWidgetModule;
            this.application = application;
            this.playStoriesV3WidgetModule = playStoriesV3WidgetModule;
            this.cartWidget2Module = cartWidget2Module;
            this.controlsModule = controlsModule;
            this.controlsV3Module = controlsV3Module;
            this.masterWidgetModule = masterWidgetModule;
            this.featureChecker = featureChecker;
            this.totalV3WidgetModule = totalV3WidgetModule;
            this.cartSplitV2Module = cartSplitV2Module;
            this.cartSplitV2ModuleV2 = cartSplitV2ModuleV2;
            this.jsonSerializer = jsonSerializer;
            this.emptyCartV2Module = emptyCartV2Module;
            this.checkoutPrefetchWidgetModule = checkoutPrefetchWidgetModule;
            this.pixelModule = pixelModule;
            this.asyncWidgetModule = asyncWidgetModule;
            this.actionCardsModule = actionCardsModule;
            this.progressiveTextModule = progressiveTextModule;
            this.islandSeparatorWidgetModule2 = islandSeparatorWidgetModule2;
            this.orderDonePaymentStatusWidgetModule = orderDonePaymentStatusWidgetModule;
            this.orderDoneDisclaimerWidgetModule = orderDoneDisclaimerWidgetModule;
            this.orderDoneTotalWidgetModule = orderDoneTotalWidgetModule;
            this.orderDoneCrossButtonWidgetModule = orderDoneCrossButtonWidgetModule;
            this.orderDoneButtonBarWidgetModule = orderDoneButtonBarWidgetModule;
            this.enableNotificationsSnackbarWidgetModule = enableNotificationsSnackbarWidgetModule;
            this.courierTipsWidgetModule2 = courierTipsWidgetModule2;
            this.objectScrollWidgetV2Module = objectScrollWidgetV2Module;
            this.universalObjectV2Module = universalObjectV2Module;
            this.commonTextWidgetModule = commonTextWidgetModule;
            this.actionButtonModule = actionButtonModule;
            this.deliveryCabinetWidgetV2Module = deliveryCabinetWidgetV2Module;
            this.deliveryReviewFormWidget2Module = deliveryReviewFormWidget2Module;
            this.deliveryReviewHeaderModule = deliveryReviewHeaderModule;
            this.deliveryReviewSuccessModule = deliveryReviewSuccessModule;
            this.returnCreationModalWidgetModule = returnCreationModalWidgetModule;
            this.returnCreationActiveDeliveriesWidgetModule = returnCreationActiveDeliveriesWidgetModule;
            this.returnCreationMethodsWidgetModule = returnCreationMethodsWidgetModule;
            this.returnCreationTotalWidgetModule = returnCreationTotalWidgetModule;
            this.returnCreationSelectedItemsWidgetModule = returnCreationSelectedItemsWidgetModule;
            this.returnCreationStepsWidgetModule = returnCreationStepsWidgetModule;
            this.returnCreationOrdersWidgetModule = returnCreationOrdersWidgetModule;
            this.returnCreationOrderWidgetModule = returnCreationOrderWidgetModule;
            this.returnCreationReasonsWidgetModule = returnCreationReasonsWidgetModule;
            this.returnTextAreaButtonWidgetModule = returnTextAreaButtonWidgetModule;
            this.returnCreationPhotoPickerWidgetModule = returnCreationPhotoPickerWidgetModule;
            this.deliveryOrderOnDetailsWidgetModule = deliveryOrderOnDetailsWidgetModule;
            this.deliveryInfoWidgetModule = deliveryInfoWidgetModule;
            this.deliveryOrderInputWidgetModule = deliveryOrderInputWidgetModule;
            this.groupButtonsWidgetModule = groupButtonsWidgetModule;
            this.deliveryOrderListWidgetModule = deliveryOrderListWidgetModule;
            this.tipCourierDetailsV2Module = tipCourierDetailsV2Module;
            this.tipCourierHeaderWidgetModule = tipCourierHeaderWidgetModule;
            this.tipCourierReviewV2WidgetModule = tipCourierReviewV2WidgetModule;
            this.tipProductPhotosModule = tipProductPhotosModule;
            this.emptyScreenWidgetModule = emptyScreenWidgetModule;
            this.barcodeProductsListWidgetModule = barcodeProductsListWidgetModule;
            this.borderlessButtonWidgetModule = borderlessButtonWidgetModule;
            this.textWidgetModule = textWidgetModule;
            this.selectCancelReasonModule2 = selectCancelReasonModule2;
            this.modalConstructorModule2 = modalConstructorModule2;
            this.promptStatusWidgetModule = promptStatusWidgetModule;
            this.responseActionsWidgetModule = responseActionsWidgetModule;
            this.searchWidgetV2DiModule = searchWidgetV2DiModule;
            this.catalogTabsV2WidgetModule = catalogTabsV2WidgetModule;
            this.freshCartWidgetsModule = freshCartWidgetsModule;
            this.freshUnsortedWidgetsModule = freshUnsortedWidgetsModule;
            this.travelToursWidgetFactoryModule = travelToursWidgetFactoryModule;
            this.travelRailwayWidgetFactoryModule = travelRailwayWidgetFactoryModule;
            this.travelHotelsMapWidgetV2Module = travelHotelsMapWidgetV2Module;
            this.travelGeneralWidgetFactoryModule = travelGeneralWidgetFactoryModule;
            this.travelGeneralBookingWidgetFactoryModule = travelGeneralBookingWidgetFactoryModule;
            this.returnActionModalWidgetModule = returnActionModalWidgetModule;
            this.orderActionsV2Module = orderActionsV2Module;
            this.checkoutWidget2Module = checkoutWidget2Module;
            this.marketingWidgetsFactoryModule = marketingWidgetsFactoryModule;
            this.naviBlocksV3Module = naviBlocksV3Module;
            this.naviBlocksV5Module = naviBlocksV5Module;
            this.financeWidgetV2Module = financeWidgetV2Module;
            this.appOnboardingWidgetModule = appOnboardingWidgetModule;
            this.promoPlacementModule = promoPlacementModule;
            this.profileIconButtonWidgetModule = profileIconButtonWidgetModule;
            this.defaultWidgetsModule = defaultWidgetsModule;
            this.appType = appType;
            this.debugWidgetsModule = debugWidgetsModule;
            this.orderDoneWidgets2Module = orderDoneWidgets2Module;
            this.geoWidget2Module = geoWidget2Module;
            this.returnCreationWidgetsModule = returnCreationWidgetsModule;
            this.returnCreationItemInfoWidgetModule = returnCreationItemInfoWidgetModule;
            initialize(searchWidgetV2DiModule, pdpWidgetsModule, pdpOldWidgetsModule, ugcWidgetsModule, ugcCoreWidgetsModule, ugcPayoutWidgetsModule, ordersCommonModule, orderListModule, productsPackageModule, selectPaymentModule, navBarModule, changeDeliveryTimeButtonModule, recipientWidgetModule, orderFiltersModule, orderGalleryWidgetModule, deliveryDateChangedComplaintFormModule, deliveryComplainWidgetModule, barcodeWidgetModule, actionButtonV2WidgetModule, activeOrdersCountWidgetModule, clickToDeliveryModalWidgetModule, barcodePopoverWidgetModule, orderProductsWidgetModule, editCredentialsWidgetsModule, addressCommunicationWidgetModule, bannerListWidgetModule, catalogShelfWidgetModule, catalogueTabsWidgetModule, catalogTabsV2WidgetModule, couponGoalsV2WidgetModule, curtainGoalsV2WidgetModule, orderTrackingWidgetModule, promoCarouselWidgetModule, expressRedirectButtonWidgetModule, expressNavigationSliderWidgetModule, fakeSearchWidgetModule, navSliderV3WidgetModule, scrollWidgetModule, freshMiniappHeaderWidgetModule, scrollActionListModule, headerWidgetModule, catalogTileScrollWidgetModule, catalogTileWidgetModule, notificationCarouselV2WidgetModule, customCellWidgetModule, wiseSkuScrollWidgetModule, stickyPromoBannerWidgetModule, addressPopupButtonWidgetModule, deliveryRatingWidgetModule, geotrackingMapV2WidgetModule, orderInfoWidgetModule, orderItemsWidgetModule, orderStatusV3WidgetModule, geotrackingBottomButtonWidgetModule, freshCartWidgetsModule, cartTileWidgetModule, cartClickTileWidgetModule, cartMasterWidgetModule, cartIconButtonWidgetModule, stickyTotalWidgetModule, detailedCheckoutProductsWidgetModule, cellListWidgetModule, freshUnsortedWidgetsModule, addressSelectorLiteWidgetModule, autoCatalogWidgetModule, bottomCartWidgetModule, brandzoneCarouselWidgetModule, charityAddressSelectorWidgetModule, courierTipsWidgetModule, deliveryProblemsWidgetModule, deliveryToCharitiesInfoModule, deliveryWidgetV2Module, deliveryWidgetV3Module, deliveryWidgetBigOzonModule, homeButtonWidgetModule, iconButtonsWidgetModule, infoDropDownWidgetModule, islandSeparatorWidgetModule, orderStatusLiveActivityWidgetModule, productsInBotWidgetModule, searchBarWidgetModule, wholeSaleWidgetModule, freshServiceCarouselWidgetModule, expressNavBarWidgetModule, expressNavTitleWidgetModule, expressAvailabilityWidgetModule, feedbackCurtainWidgetModule, promoOfferWidgetModule, recShelfWidgetModule, separatorBadgeWidgetModule, imageBadgeListWidgetModule, bottomContainerWidgetModule, productsInBotV2WidgetModule, pdpAspectsWidgetModule, pdpNutritionInfoWidgetModule, freshTileGridWidgetModule, steppedThermometerModule, travelToursWidgetFactoryModule, travelRailwayWidgetFactoryModule, travelHotelsMapWidgetV2Module, travelGeneralWidgetV2Module, travelGeneralWidgetFactoryModule, travelGeneralBookingWidgetFactoryModule, premiumPointsTrainV2Module, returnListWidgetModule, returnListEmptyModule, returnDetailsWidgetModule, returnDetailsHeaderButtonWidgetModule, returnActionModalWidgetModule, returnableItemsListWidgetModule, returnEditWidgetModule, returnDetailsTotalWidgetModule, returnActionButtonsWidgetModule, returnBalanceModalWidgetModule, orderActionsV2Module, orderDetailsItemModule, customsFeesModule, orderTotalModule, orderTimelineV2Module, orderTrackShipmentModule, timeLeftWidgetModule, orderActionsModule, orderDeliveryDetailV2Module, orderStatusModule, chequesWidgetModule, dateSelectorWidgetModule, deliveryTimeSelectorV1Module, radioGroupWidgetModule, replyToCourierInfoWidgetModule, selectCancelReasonModule, extendBackgroundWidgetModule, modalConstructorModule, checkoutWidget2Module, advPageStayDiModule, marketingWidgets2Module, marketingWidgetsFactoryModule, sisBrandFavoriteWidgetModule, bigPromoCheckoutWidgetModule, megaDrawModule, naviBlocksModule, naviBlocksV3Module, naviBlocksV5Module, naviCategoriesModule, naviGridModule, naviGrid3Module, videoTileWidgetModule, videoScrollWidgetModule, financeWidgetModule, financeWidgetV2Module, appOnboardingWidgetModule, promoPlacementModule, profileIconButtonWidgetModule, navLikezoneCaruselDiModule, defaultWidgetsModule, favoriteProductV2WidgetModule, flashCallWidget2Module, sellerProductsWidgetsModule, faqWidgetModule, playStoriesV3WidgetModule, cartWidget2Module, controlsModule, controlsV3Module, masterWidgetModule, totalV3WidgetModule, cartSplitV2Module, cartSplitV2ModuleV2, emptyCartV2Module, checkoutPrefetchWidgetModule, pixelModule, asyncWidgetModule, debugWidgetsModule, actionCardsModule, progressiveTextModule, islandSeparatorWidgetModule2, orderDoneWidgets2Module, orderDonePaymentStatusWidgetModule, orderDoneDisclaimerWidgetModule, orderDoneTotalWidgetModule, orderDoneCrossButtonWidgetModule, orderDoneButtonBarWidgetModule, enableNotificationsSnackbarWidgetModule, courierTipsWidgetModule2, objectScrollWidgetV2Module, universalObjectV2Module, commonTextWidgetModule, actionButtonModule, geoWidget2Module, deliveryCabinetWidgetV2Module, deliveryReviewFormWidget2Module, deliveryReviewHeaderModule, deliveryReviewSuccessModule, returnCreationWidgetsModule, returnCreationModalWidgetModule, returnCreationActiveDeliveriesWidgetModule, returnCreationMethodsWidgetModule, returnCreationTotalWidgetModule, returnCreationSelectedItemsWidgetModule, returnCreationStepsWidgetModule, returnCreationOrdersWidgetModule, returnCreationOrderWidgetModule, returnCreationReasonsWidgetModule, returnTextAreaButtonWidgetModule, returnCreationPhotoPickerWidgetModule, returnCreationItemInfoWidgetModule, deliveryOrderOnDetailsWidgetModule, deliveryInfoWidgetModule, deliveryOrderInputWidgetModule, groupButtonsWidgetModule, deliveryOrderListWidgetModule, tipCourierDetailsV2Module, tipCourierHeaderWidgetModule, tipCourierReviewV2WidgetModule, tipProductPhotosModule, emptyScreenWidgetModule, barcodeProductsListWidgetModule, borderlessButtonWidgetModule, textWidgetModule, selectCancelReasonModule2, modalConstructorModule2, promptStatusWidgetModule, responseActionsWidgetModule, context, application, jsonParser, jsonSerializer, moshi, featureChecker, appType);
        }
    }

    public static WidgetRegistrationComponent.Factory factory() {
        return new Factory(0);
    }
}
