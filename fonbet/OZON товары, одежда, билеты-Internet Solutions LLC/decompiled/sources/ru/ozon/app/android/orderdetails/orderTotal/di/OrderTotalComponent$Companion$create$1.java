package ru.ozon.app.android.orderdetails.orderTotal.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.composer.di.AnalyticsScreenComponentApi;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000Y\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"ru/ozon/app/android/orderdetails/orderTotal/di/OrderTotalComponent$Companion$create$1", "Lru/ozon/app/android/orderdetails/orderTotal/di/OrderTotalComponent;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/composer/di/AnalyticsScreenComponentApi;", "analyticsScreenComponentApi", "Lru/ozon/app/android/composer/di/AnalyticsScreenComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "createAndPayRepository$delegate", "LSc/j;", "getCreateAndPayRepository", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "createAndPayRepository", "Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus$delegate", "getOrderTrackingBus", "()Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus", "Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "googlePayManager$delegate", "getGooglePayManager", "()Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "googlePayManager", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;", "createAndPayAnalytics$delegate", "getCreateAndPayAnalytics", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;", "createAndPayAnalytics", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "getApplicationInfoDataSource", "()Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoDataSource", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTotalComponent$Companion$create$1 implements OrderTotalComponent {
    private final ActionComponentApi actionComponentApi;
    private final AnalyticsComponentApi analyticsComponentApi;
    private final AnalyticsScreenComponentApi analyticsScreenComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: createAndPayRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j createAndPayRepository = k.b(new OrderTotalComponent$Companion$create$1$createAndPayRepository$2(this));

    /* renamed from: orderTrackingBus$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderTrackingBus = k.b(OrderTotalComponent$Companion$create$1$orderTrackingBus$2.INSTANCE);

    /* renamed from: googlePayManager$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j googlePayManager = k.b(OrderTotalComponent$Companion$create$1$googlePayManager$2.INSTANCE);

    /* renamed from: createAndPayAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j createAndPayAnalytics = k.b(new OrderTotalComponent$Companion$create$1$createAndPayAnalytics$2(this));

    OrderTotalComponent$Companion$create$1(C7475g c7475g) {
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.analyticsScreenComponentApi = (AnalyticsScreenComponentApi) c7475g.getComponent(AnalyticsScreenComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
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

    @Override // ru.ozon.app.android.orderdetails.orderTotal.di.OrderTotalComponent
    public ApplicationInfoDataSource getApplicationInfoDataSource() {
        return this.storageComponentApi.getApplicationInfoStorage();
    }

    @Override // ru.ozon.app.android.orderdetails.orderTotal.di.OrderTotalComponent
    public CreateAndPayViewModel getCreateAndPayViewModel() {
        return new CreateAndPayViewModel(getCreateAndPayRepository(), getOrderTrackingBus(), getGooglePayManager(), getCreateAndPayAnalytics());
    }
}
