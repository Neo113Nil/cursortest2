package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarWidgetMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.AnalyticsScreenComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\u0089\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"ru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/di/OrderDoneButtonBarWidgetComponent$Companion$create$1", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/di/OrderDoneButtonBarWidgetComponent;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "Lru/ozon/app/android/composer/di/AnalyticsScreenComponentApi;", "analyticsScreenComponentApi", "Lru/ozon/app/android/composer/di/AnalyticsScreenComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "createAndPayRepository$delegate", "LSc/j;", "getCreateAndPayRepository", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "createAndPayRepository", "Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus$delegate", "getOrderTrackingBus", "()Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus", "Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "googlePayManager$delegate", "getGooglePayManager", "()Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "googlePayManager", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;", "createAndPayAnalytics$delegate", "getCreateAndPayAnalytics", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;", "createAndPayAnalytics", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/core/OrderDoneButtonBarWidgetMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/core/OrderDoneButtonBarWidgetMapper;", "mapper", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl;", "getViewModel", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl;", "viewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "getApplicationInfoDataSource", "()Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoDataSource", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneButtonBarWidgetComponent$Companion$create$1 implements OrderDoneButtonBarWidgetComponent {
    private final ActionComponentApi actionComponentApi;
    private final AnalyticsComponentApi analyticsComponentApi;
    private final AnalyticsScreenComponentApi analyticsScreenComponentApi;
    private final CartServiceApi cartServiceApi;
    private final ComposerComponentApi composerComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: createAndPayRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j createAndPayRepository = k.b(new OrderDoneButtonBarWidgetComponent$Companion$create$1$createAndPayRepository$2(this));

    /* renamed from: orderTrackingBus$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderTrackingBus = k.b(OrderDoneButtonBarWidgetComponent$Companion$create$1$orderTrackingBus$2.INSTANCE);

    /* renamed from: googlePayManager$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j googlePayManager = k.b(OrderDoneButtonBarWidgetComponent$Companion$create$1$googlePayManager$2.INSTANCE);

    /* renamed from: createAndPayAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j createAndPayAnalytics = k.b(new OrderDoneButtonBarWidgetComponent$Companion$create$1$createAndPayAnalytics$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(OrderDoneButtonBarWidgetComponent$Companion$create$1$mapper$2.INSTANCE);

    OrderDoneButtonBarWidgetComponent$Companion$create$1(C7475g c7475g) {
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
        this.analyticsScreenComponentApi = (AnalyticsScreenComponentApi) c7475g.getComponent(AnalyticsScreenComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.composerComponentApi = (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class);
    }

    private final CreateAndPayAnalytics getCreateAndPayAnalytics() {
        return (CreateAndPayAnalytics) this.createAndPayAnalytics.getValue();
    }

    private final CreateAndPayRepository getCreateAndPayRepository() {
        return (CreateAndPayRepository) this.createAndPayRepository.getValue();
    }

    private final GooglePayManager getGooglePayManager() {
        return (GooglePayManager) this.googlePayManager.getValue();
    }

    private final OrderTrackingBus getOrderTrackingBus() {
        return (OrderTrackingBus) this.orderTrackingBus.getValue();
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di.OrderDoneButtonBarWidgetComponent
    public ApplicationInfoDataSource getApplicationInfoDataSource() {
        return this.storageComponentApi.getApplicationInfoStorage();
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di.OrderDoneButtonBarWidgetComponent
    public CreateAndPayViewModel getCreateAndPayViewModel() {
        return new CreateAndPayViewModel(getCreateAndPayRepository(), getOrderTrackingBus(), getGooglePayManager(), getCreateAndPayAnalytics());
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di.OrderDoneButtonBarWidgetComponent
    public OrderDoneButtonBarWidgetMapper getMapper() {
        return (OrderDoneButtonBarWidgetMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di.OrderDoneButtonBarWidgetComponent
    public ComposerNavigator getNavigator() {
        return this.composerComponentApi.getComposerNavigator();
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di.OrderDoneButtonBarWidgetComponent
    public OrderDoneButtonBarViewModelImpl getViewModel() {
        return new OrderDoneButtonBarViewModelImpl(this.actionComponentApi.getActionRepository(), this.networkComponentApi.getJsonDeserializer(), this.cartServiceApi.getCartService());
    }
}
