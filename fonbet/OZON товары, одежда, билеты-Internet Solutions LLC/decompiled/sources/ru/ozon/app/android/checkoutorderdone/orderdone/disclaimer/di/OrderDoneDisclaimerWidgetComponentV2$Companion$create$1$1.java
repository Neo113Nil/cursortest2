package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.core.OrderDoneDisclaimerWidgetMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation.OrderDoneDisclaimerViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;

@Metadata(d1 = {"\u0000u\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"ru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/di/OrderDoneDisclaimerWidgetComponentV2$Companion$create$1$1", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/di/OrderDoneDisclaimerWidgetComponentV2;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService$delegate", "LSc/j;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/core/OrderDoneDisclaimerWidgetMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/core/OrderDoneDisclaimerWidgetMapper;", "mapper", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/checkoutgeo/payment/di/CheckoutPaymentComponentApi;", "checkoutPaymentComponentApi", "Lru/ozon/app/android/checkoutgeo/payment/di/CheckoutPaymentComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel;", "getViewModel", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneDisclaimerWidgetComponentV2$Companion$create$1$1 implements OrderDoneDisclaimerWidgetComponentV2 {
    private final ActionComponentApi actionComponentApi;
    private final AnalyticsComponentApi analyticsComponentApi;
    private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
    private final CheckoutPaymentComponentApi checkoutPaymentComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final StorageComponentApi storageComponentApi;
    private final l tokenizedAnalytics;

    /* renamed from: startupArgsService$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j startupArgsService = k.b(new OrderDoneDisclaimerWidgetComponentV2$Companion$create$1$1$startupArgsService$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(OrderDoneDisclaimerWidgetComponentV2$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(OrderDoneDisclaimerWidgetComponentV2$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    OrderDoneDisclaimerWidgetComponentV2$Companion$create$1$1(C7475g c7475g) {
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.tokenizedAnalytics = ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.checkoutPaymentComponentApi = (CheckoutPaymentComponentApi) c7475g.getComponent(CheckoutPaymentComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        this.analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) c7475g.getComponent(AnalyticsScreenStorageComponentApi.class);
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di.OrderDoneDisclaimerWidgetComponentV2
    public CreateAndPayViewModel getCreateAndPayViewModel() {
        return new CreateAndPayViewModel(new CreateAndPayRepository(this.actionComponentApi.getActionRepository()), new OrderTrackingBus(), new GooglePayManagerImpl(this.checkoutPaymentComponentApi.getGooglePayAvailabilityStorage()), new CreateAndPayAnalytics(this.analyticsComponentApi.getAnalyticsDataLayer(), this.analyticsComponentApi.getPluginsManager(), this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage()));
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di.OrderDoneDisclaimerWidgetComponentV2
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di.OrderDoneDisclaimerWidgetComponentV2
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di.OrderDoneDisclaimerWidgetComponentV2
    public OrderDoneDisclaimerWidgetMapper getMapper() {
        return (OrderDoneDisclaimerWidgetMapper) this.mapper.getValue();
    }

    public StartupArgsService getStartupArgsService() {
        return (StartupArgsService) this.startupArgsService.getValue();
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di.OrderDoneDisclaimerWidgetComponentV2
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di.OrderDoneDisclaimerWidgetComponentV2
    public OrderDoneDisclaimerViewModel getViewModel() {
        return new OrderDoneDisclaimerViewModel(getStartupArgsService());
    }
}
