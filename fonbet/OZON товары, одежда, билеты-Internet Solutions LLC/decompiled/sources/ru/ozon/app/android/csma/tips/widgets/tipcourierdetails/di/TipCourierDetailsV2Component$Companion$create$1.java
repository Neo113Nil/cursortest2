package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di;

import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.composer.di.AnalyticsScreenComponentApi;
import ru.ozon.app.android.csma.tips.core.CsmaPayActionProcesser;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModelImpl;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsMapper;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\u008d\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u00101R\u001f\u00108\u001a\u000603j\u0002`48VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0016\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"ru/ozon/app/android/csma/tips/widgets/tipcourierdetails/di/TipCourierDetailsV2Component$Companion$create$1", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/di/TipCourierDetailsV2Component;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "Lru/ozon/app/android/composer/di/AnalyticsScreenComponentApi;", "analyticsScreenComponentApi", "Lru/ozon/app/android/composer/di/AnalyticsScreenComponentApi;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "createAndPayRepository$delegate", "LSc/j;", "getCreateAndPayRepository", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "createAndPayRepository", "Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus$delegate", "getOrderTrackingBus", "()Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus", "Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "googlePayManager$delegate", "getGooglePayManager", "()Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "googlePayManager", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;", "createAndPayAnalytics$delegate", "getCreateAndPayAnalytics", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;", "createAndPayAnalytics", "Lru/ozon/app/android/csma/tips/core/CsmaPayActionProcesser;", "actionProcesser$delegate", "getActionProcesser", "()Lru/ozon/app/android/csma/tips/core/CsmaPayActionProcesser;", "actionProcesser", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersFactory$delegate", "getCustomActionHandlersFactory", "()LVg/d;", "customActionHandlersFactory", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModelImpl;", "getViewModel", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModelImpl;", "viewModel", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "ozonRouter", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierDetailsV2Component$Companion$create$1 implements TipCourierDetailsV2Component {
    private final ActionComponentApi actionComponentApi;
    private final AnalyticsComponentApi analyticsComponentApi;
    private final AnalyticsScreenComponentApi analyticsScreenComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NavigationComponentApi navigationComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: createAndPayRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j createAndPayRepository = k.b(new TipCourierDetailsV2Component$Companion$create$1$createAndPayRepository$2(this));

    /* renamed from: orderTrackingBus$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j orderTrackingBus = k.b(TipCourierDetailsV2Component$Companion$create$1$orderTrackingBus$2.INSTANCE);

    /* renamed from: googlePayManager$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j googlePayManager = k.b(TipCourierDetailsV2Component$Companion$create$1$googlePayManager$2.INSTANCE);

    /* renamed from: createAndPayAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j createAndPayAnalytics = k.b(new TipCourierDetailsV2Component$Companion$create$1$createAndPayAnalytics$2(this));

    /* renamed from: actionProcesser$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j actionProcesser = k.b(new TipCourierDetailsV2Component$Companion$create$1$actionProcesser$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(TipCourierDetailsV2Component$Companion$create$1$mapper$2.INSTANCE);

    /* renamed from: customActionHandlersFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersFactory = k.b(new TipCourierDetailsV2Component$Companion$create$1$customActionHandlersFactory$2(this));

    TipCourierDetailsV2Component$Companion$create$1(C7475g c7475g) {
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.analyticsComponentApi = (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class);
        this.analyticsScreenComponentApi = (AnalyticsScreenComponentApi) c7475g.getComponent(AnalyticsScreenComponentApi.class);
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    private final CsmaPayActionProcesser getActionProcesser() {
        return (CsmaPayActionProcesser) this.actionProcesser.getValue();
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

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di.TipCourierDetailsV2Component
    public CreateAndPayViewModel getCreateAndPayViewModel() {
        return new CreateAndPayViewModel(getCreateAndPayRepository(), getOrderTrackingBus(), getGooglePayManager(), getCreateAndPayAnalytics());
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di.TipCourierDetailsV2Component
    public d getCustomActionHandlersFactory() {
        return (d) this.customActionHandlersFactory.getValue();
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di.TipCourierDetailsV2Component
    public TipCourierDetailsMapper getMapper() {
        return (TipCourierDetailsMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di.TipCourierDetailsV2Component
    public g getOzonRouter() {
        return this.navigationComponentApi.getOzonRouter();
    }

    @Override // ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di.TipCourierDetailsV2Component
    public TipCourierDetailsViewModelImpl getViewModel() {
        return new TipCourierDetailsViewModelImpl(getMapper(), getActionProcesser());
    }
}
