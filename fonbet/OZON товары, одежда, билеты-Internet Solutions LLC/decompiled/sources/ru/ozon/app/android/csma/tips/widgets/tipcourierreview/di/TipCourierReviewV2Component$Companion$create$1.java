package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di;

import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.composer.di.AnalyticsScreenComponentApi;
import ru.ozon.app.android.csma.tips.core.CsmaPayActionProcesser;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.TipCourierReviewViewModelImpl;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000y\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"ru/ozon/app/android/csma/tips/widgets/tipcourierreview/di/TipCourierReviewV2Component$Companion$create$1", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/di/TipCourierReviewV2Component;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/composer/di/AnalyticsScreenComponentApi;", "analyticsScreenComponentApi", "Lru/ozon/app/android/composer/di/AnalyticsScreenComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/csma/tips/core/CsmaPayActionProcesser;", "actionProcesser", "Lru/ozon/app/android/csma/tips/core/CsmaPayActionProcesser;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "createAndPayRepository$delegate", "LSc/j;", "getCreateAndPayRepository", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "createAndPayRepository", "Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus$delegate", "getOrderTrackingBus", "()Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus", "Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "googlePayManager$delegate", "getGooglePayManager", "()Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "googlePayManager", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;", "createAndPayAnalytics$delegate", "getCreateAndPayAnalytics", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;", "createAndPayAnalytics", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewMapper;", "mapper", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModelImpl;", "getViewModel", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipCourierReviewViewModelImpl;", "viewModel", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierReviewV2Component$Companion$create$1 implements TipCourierReviewV2Component {
    private final ActionComponentApi actionComponentApi;
    private final CsmaPayActionProcesser actionProcesser;
    private final AnalyticsComponentApi analyticsComponentApi;
    private final AnalyticsScreenComponentApi analyticsScreenComponentApi;

    /* renamed from: createAndPayAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j createAndPayAnalytics;

    /* renamed from: createAndPayRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j createAndPayRepository;

    /* renamed from: googlePayManager$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j googlePayManager;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final NavigationComponentApi navigationComponentApi;

    /* renamed from: orderTrackingBus$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderTrackingBus;
    private final StorageComponentApi storageComponentApi;

    TipCourierReviewV2Component$Companion$create$1(C7475g c7475g) {
        StorageComponentApi storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.storageComponentApi = storageComponentApi;
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.analyticsScreenComponentApi = (AnalyticsScreenComponentApi) c7475g.getComponent(AnalyticsScreenComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        this.actionProcesser = new CsmaPayActionProcesser(storageComponentApi.getApplicationInfoStorage());
        this.createAndPayRepository = k.b(new TipCourierReviewV2Component$Companion$create$1$createAndPayRepository$2(this));
        this.orderTrackingBus = k.b(TipCourierReviewV2Component$Companion$create$1$orderTrackingBus$2.INSTANCE);
        this.googlePayManager = k.b(TipCourierReviewV2Component$Companion$create$1$googlePayManager$2.INSTANCE);
        this.createAndPayAnalytics = k.b(new TipCourierReviewV2Component$Companion$create$1$createAndPayAnalytics$2(this));
        this.mapper = k.b(TipCourierReviewV2Component$Companion$create$1$mapper$2.INSTANCE);
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

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di.TipCourierReviewV2Component
    public CreateAndPayViewModel getCreateAndPayViewModel() {
        return new CreateAndPayViewModel(getCreateAndPayRepository(), getOrderTrackingBus(), getGooglePayManager(), getCreateAndPayAnalytics());
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di.TipCourierReviewV2Component
    public TipCourierReviewMapper getMapper() {
        return (TipCourierReviewMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di.TipCourierReviewV2Component
    public g getRouter() {
        return this.navigationComponentApi.getOzonRouter();
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di.TipCourierReviewV2Component
    public TipCourierReviewViewModelImpl getViewModel() {
        return new TipCourierReviewViewModelImpl(getMapper(), this.actionProcesser);
    }
}
