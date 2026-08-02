package ru.ozon.app.android.ordertracking.v4.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.cscore.orderTracking.viewmodels.OrderTrackingV4ViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.ordertracking.di.OrderTrackingSingletonComponentApi;
import ru.ozon.app.android.ordertracking.v4.presentation.mapper.OrderTrackingV4Mapper;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0095\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0018\u00109\u001a\u000605j\u0002`68VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"ru/ozon/app/android/ordertracking/v4/di/OrderTrackingV4WidgetComponent$Companion$create$1", "Lru/ozon/app/android/ordertracking/v4/di/OrderTrackingV4WidgetComponent;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/checkoutgeo/payment/di/CheckoutPaymentComponentApi;", "checkoutPaymentComponentApi", "Lru/ozon/app/android/checkoutgeo/payment/di/CheckoutPaymentComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/ordertracking/di/OrderTrackingSingletonComponentApi;", "orderTrackingSingletonComponentApi", "Lru/ozon/app/android/ordertracking/di/OrderTrackingSingletonComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/ordertracking/v4/presentation/mapper/OrderTrackingV4Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/ordertracking/v4/presentation/mapper/OrderTrackingV4Mapper;", "mapper", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider$delegate", "getAdultListDelegateProvider", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "LWZ/l;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel;", "getViewModel", "()Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel;", "viewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTrackingV4WidgetComponent$Companion$create$1 implements OrderTrackingV4WidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final AccountComponentApi accountComponentApi;
    private final ActionComponentApi actionComponentApi;
    private final AnalyticsComponentApi analyticsComponentApi;
    private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
    private final CheckoutPaymentComponentApi checkoutPaymentComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final OrderTrackingSingletonComponentApi orderTrackingSingletonComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tokenizedAnalytics;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(OrderTrackingV4WidgetComponent$Companion$create$1$mapper$2.INSTANCE);

    /* renamed from: adultListDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j adultListDelegateProvider = k.b(new OrderTrackingV4WidgetComponent$Companion$create$1$adultListDelegateProvider$2(this));

    OrderTrackingV4WidgetComponent$Companion$create$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.checkoutPaymentComponentApi = (CheckoutPaymentComponentApi) c7475g.getComponent(CheckoutPaymentComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        this.analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) c7475g.getComponent(AnalyticsScreenStorageComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.orderTrackingSingletonComponentApi = (OrderTrackingSingletonComponentApi) c7475g.getComponent(OrderTrackingSingletonComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.tokenizedAnalytics = k.b(new OrderTrackingV4WidgetComponent$Companion$create$1$tokenizedAnalytics$2(c7475g));
    }

    @Override // ru.ozon.app.android.ordertracking.v4.di.OrderTrackingV4WidgetComponent
    public AdultListDelegateProvider getAdultListDelegateProvider() {
        return (AdultListDelegateProvider) this.adultListDelegateProvider.getValue();
    }

    @Override // ru.ozon.app.android.ordertracking.v4.di.OrderTrackingV4WidgetComponent
    public AppType getAppType() {
        return ((AndroidPlatformComponentDependencies) this.$storage.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
    }

    @Override // ru.ozon.app.android.ordertracking.v4.di.OrderTrackingV4WidgetComponent
    public CreateAndPayViewModel getCreateAndPayViewModel() {
        return new CreateAndPayViewModel(new CreateAndPayRepository(this.actionComponentApi.getActionRepository()), new OrderTrackingBus(), new GooglePayManagerImpl(this.checkoutPaymentComponentApi.getGooglePayAvailabilityStorage()), new CreateAndPayAnalytics(this.analyticsComponentApi.getAnalyticsDataLayer(), this.analyticsComponentApi.getPluginsManager(), this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage()));
    }

    @Override // ru.ozon.app.android.ordertracking.v4.di.OrderTrackingV4WidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.ordertracking.v4.di.OrderTrackingV4WidgetComponent
    public OrderTrackingV4Mapper getMapper() {
        return (OrderTrackingV4Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.ordertracking.v4.di.OrderTrackingV4WidgetComponent
    public StartupArgsService getStartupArgsService() {
        return this.storageComponentApi.getStartupArgsService();
    }

    @Override // ru.ozon.app.android.ordertracking.v4.di.OrderTrackingV4WidgetComponent
    public l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }

    @Override // ru.ozon.app.android.ordertracking.v4.di.OrderTrackingV4WidgetComponent
    public OrderTrackingV4ViewModel getViewModel() {
        return new OrderTrackingV4ViewModel(this.actionComponentApi.getActionRepository(), this.orderTrackingSingletonComponentApi.getProcessLifecycleObserver());
    }
}
