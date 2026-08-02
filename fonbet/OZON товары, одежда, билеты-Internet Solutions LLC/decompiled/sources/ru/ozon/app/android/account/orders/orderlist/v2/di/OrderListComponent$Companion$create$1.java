package ru.ozon.app.android.account.orders.orderlist.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.orders.orderlist.v2.data.mapper.OrderListMapper;
import ru.ozon.app.android.action.custom.ButtonWidgetCustomActionHandlers;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentDependencies;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;

@Metadata(d1 = {"\u0000u\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u0010(\u001a\u00060$j\u0002`%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"ru/ozon/app/android/account/orders/orderlist/v2/di/OrderListComponent$Companion$create$1", "Lru/ozon/app/android/account/orders/orderlist/v2/di/OrderListComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/checkoutgeo/payment/di/CheckoutPaymentComponentApi;", "checkoutPaymentComponentApi", "Lru/ozon/app/android/checkoutgeo/payment/di/CheckoutPaymentComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentDependencies;", "customActionHandlersComponentDependencies", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentDependencies;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/mapper/OrderListMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/mapper/OrderListMapper;", "mapper", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/action/custom/ButtonWidgetCustomActionHandlers;", "getButtonWidgetCustomActionHandlers", "()Lru/ozon/app/android/action/custom/ButtonWidgetCustomActionHandlers;", "buttonWidgetCustomActionHandlers", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderListComponent$Companion$create$1 implements OrderListComponent {
    private final ActionComponentApi actionComponentApi;
    private final AnalyticsComponentApi analyticsComponentApi;
    private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
    private final CheckoutPaymentComponentApi checkoutPaymentComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final CustomActionHandlersComponentDependencies customActionHandlersComponentDependencies;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new OrderListComponent$Companion$create$1$mapper$2(this));
    private final StorageComponentApi storageComponentApi;

    OrderListComponent$Companion$create$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.checkoutPaymentComponentApi = (CheckoutPaymentComponentApi) c7475g.getComponent(CheckoutPaymentComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        this.analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) c7475g.getComponent(AnalyticsScreenStorageComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.customActionHandlersComponentDependencies = (CustomActionHandlersComponentDependencies) c7475g.getComponent(CustomActionHandlersComponentDependencies.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
    }

    @Override // ru.ozon.app.android.account.orders.orderlist.v2.di.OrderListComponent
    public ButtonWidgetCustomActionHandlers getButtonWidgetCustomActionHandlers() {
        return this.customActionHandlersComponentDependencies.getButtonWidgetCustomActionHandlers();
    }

    @Override // ru.ozon.app.android.account.orders.orderlist.v2.di.OrderListComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.account.orders.orderlist.v2.di.OrderListComponent
    public OrderListMapper getMapper() {
        return (OrderListMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.account.orders.orderlist.v2.di.OrderListComponent
    public StartupArgsService getStartupArgsService() {
        return this.storageComponentApi.getStartupArgsService();
    }

    @Override // ru.ozon.app.android.account.orders.orderlist.v2.di.OrderListComponent
    public CreateAndPayViewModel getViewModel() {
        return new CreateAndPayViewModel(new CreateAndPayRepository(this.actionComponentApi.getActionRepository()), new OrderTrackingBus(), new GooglePayManagerImpl(this.checkoutPaymentComponentApi.getGooglePayAvailabilityStorage()), new CreateAndPayAnalytics(this.analyticsComponentApi.getAnalyticsDataLayer(), this.analyticsComponentApi.getPluginsManager(), this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage()));
    }
}
