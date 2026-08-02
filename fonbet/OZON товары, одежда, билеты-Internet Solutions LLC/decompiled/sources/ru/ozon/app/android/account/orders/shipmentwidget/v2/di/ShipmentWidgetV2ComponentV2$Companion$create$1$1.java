package ru.ozon.app.android.account.orders.shipmentwidget.v2.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import gl.C6751a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.common.shipmentwidget.ShipmentWidgetV2Parser;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.mappers.AtomElementMapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.mappers.ButtonsMapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.images.mappers.ImagesMapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.mappers.ProductsMapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.separator.mappers.SeparatorMapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.mappers.TextIconMapper;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000Á\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0013\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0013\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR(\u0010F\u001a\u0010\u0012\f\u0012\n E*\u0004\u0018\u00010D0D0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0018\u0010Z\u001a\u00060Vj\u0002`W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"ru/ozon/app/android/account/orders/shipmentwidget/v2/di/ShipmentWidgetV2ComponentV2$Companion$create$1$1", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/di/ShipmentWidgetV2ComponentV2;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlerComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/account/orders/common/shipmentwidget/ShipmentWidgetV2Parser;", "parser$delegate", "LSc/j;", "getParser", "()Lru/ozon/app/android/account/orders/common/shipmentwidget/ShipmentWidgetV2Parser;", "parser", "Lru/ozon/app/android/utils/AppType;", "appType$delegate", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/mappers/AtomElementMapper;", "atomElementMapper$delegate", "getAtomElementMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/mappers/AtomElementMapper;", "atomElementMapper", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/mappers/TextIconMapper;", "textIconMapper$delegate", "getTextIconMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/mappers/TextIconMapper;", "textIconMapper", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/images/mappers/ImagesMapper;", "imagesMapper$delegate", "getImagesMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/images/mappers/ImagesMapper;", "imagesMapper", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/separator/mappers/SeparatorMapper;", "separatorMapper$delegate", "getSeparatorMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/separator/mappers/SeparatorMapper;", "separatorMapper", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/mappers/ButtonsMapper;", "buttonsMapper$delegate", "getButtonsMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/mappers/ButtonsMapper;", "buttonsMapper", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/mappers/ProductsMapper;", "productsMapper$delegate", "getProductsMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/mappers/ProductsMapper;", "productsMapper", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "googlePayAvailabilityStorage", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "LPc/a;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "kotlin.jvm.PlatformType", "createAndPayViewModelProvider", "LPc/a;", "getCreateAndPayViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "getOrderTrackingBus", "()Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus", "Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "getGooglePayManager", "()Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "googlePayManager", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "getAdultListDelegateProvider", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShipmentWidgetV2ComponentV2$Companion$create$1$1 implements ShipmentWidgetV2ComponentV2 {
    private final AccountComponentApi accountComponentApi;
    private final AnalyticsComponentApi analyticsComponentApi;
    private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;

    /* renamed from: appType$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j appType;
    private final a<CreateAndPayViewModel> createAndPayViewModelProvider;
    private final CustomActionHandlersComponentApi customActionHandlerComponentApi;
    private final GooglePayAvailabilityStorage googlePayAvailabilityStorage;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: parser$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j parser;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: atomElementMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j atomElementMapper = k.b(ShipmentWidgetV2ComponentV2$Companion$create$1$1$atomElementMapper$2.INSTANCE);

    /* renamed from: textIconMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j textIconMapper = k.b(ShipmentWidgetV2ComponentV2$Companion$create$1$1$textIconMapper$2.INSTANCE);

    /* renamed from: imagesMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j imagesMapper = k.b(ShipmentWidgetV2ComponentV2$Companion$create$1$1$imagesMapper$2.INSTANCE);

    /* renamed from: separatorMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j separatorMapper = k.b(ShipmentWidgetV2ComponentV2$Companion$create$1$1$separatorMapper$2.INSTANCE);

    /* renamed from: buttonsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j buttonsMapper = k.b(ShipmentWidgetV2ComponentV2$Companion$create$1$1$buttonsMapper$2.INSTANCE);

    /* renamed from: productsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j productsMapper = k.b(ShipmentWidgetV2ComponentV2$Companion$create$1$1$productsMapper$2.INSTANCE);

    ShipmentWidgetV2ComponentV2$Companion$create$1$1(C7475g c7475g) {
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.customActionHandlerComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.parser = k.b(new ShipmentWidgetV2ComponentV2$Companion$create$1$1$parser$2(c7475g));
        this.appType = k.b(new ShipmentWidgetV2ComponentV2$Companion$create$1$1$appType$2(c7475g));
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        this.analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) c7475g.getComponent(AnalyticsScreenStorageComponentApi.class);
        this.googlePayAvailabilityStorage = ((CheckoutPaymentComponentApi) c7475g.getComponent(CheckoutPaymentComponentApi.class)).getGooglePayAvailabilityStorage();
        this.createAndPayViewModelProvider = new C6751a(c7475g, this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateAndPayViewModel createAndPayViewModelProvider$lambda$0(C7475g c7475g, ShipmentWidgetV2ComponentV2$Companion$create$1$1 shipmentWidgetV2ComponentV2$Companion$create$1$1) {
        return new CreateAndPayViewModel(new CreateAndPayRepository(((ActionComponentApi) c7475g.getComponent(ActionComponentApi.class)).getActionRepository()), shipmentWidgetV2ComponentV2$Companion$create$1$1.getOrderTrackingBus(), shipmentWidgetV2ComponentV2$Companion$create$1$1.getGooglePayManager(), new CreateAndPayAnalytics(shipmentWidgetV2ComponentV2$Companion$create$1$1.analyticsComponentApi.getAnalyticsDataLayer(), shipmentWidgetV2ComponentV2$Companion$create$1$1.analyticsComponentApi.getPluginsManager(), shipmentWidgetV2ComponentV2$Companion$create$1$1.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage()));
    }

    private final GooglePayManager getGooglePayManager() {
        return new GooglePayManagerImpl(this.googlePayAvailabilityStorage);
    }

    private final OrderTrackingBus getOrderTrackingBus() {
        return new OrderTrackingBus();
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public AdultListDelegateProvider getAdultListDelegateProvider() {
        return new AdultListDelegateProvider(this.accountComponentApi.getAdultHandler(), this.networkComponentApi.getFeatureChecker());
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public AppType getAppType() {
        return (AppType) this.appType.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public AtomElementMapper getAtomElementMapper() {
        return (AtomElementMapper) this.atomElementMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public ButtonsMapper getButtonsMapper() {
        return (ButtonsMapper) this.buttonsMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public a<CreateAndPayViewModel> getCreateAndPayViewModelProvider() {
        return this.createAndPayViewModelProvider;
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlerComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public ImagesMapper getImagesMapper() {
        return (ImagesMapper) this.imagesMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public ShipmentWidgetV2Parser getParser() {
        return (ShipmentWidgetV2Parser) this.parser.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public ProductsMapper getProductsMapper() {
        return (ProductsMapper) this.productsMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public SeparatorMapper getSeparatorMapper() {
        return (SeparatorMapper) this.separatorMapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public StartupArgsService getStartupArgsService() {
        return this.storageComponentApi.getStartupArgsService();
    }

    @Override // ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2
    public TextIconMapper getTextIconMapper() {
        return (TextIconMapper) this.textIconMapper.getValue();
    }
}
