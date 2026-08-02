package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data.DisclaimerV2Mapper;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0017R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/di/DisclaimerV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2Mapper;", "getMapper", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2Mapper;", "mapper", "LVg/d;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DisclaimerV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/di/DisclaimerV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/di/DisclaimerV2Component;", "create", "(Lk20/g;)Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/di/DisclaimerV2Component;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final DisclaimerV2Component create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new DisclaimerV2Component(storage) { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.di.DisclaimerV2Component$Companion$create$1
                private final ActionComponentApi actionComponentApi;
                private final AnalyticsComponentApi analyticsComponentApi;
                private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
                private final CheckoutPaymentComponentApi checkoutPaymentComponentApi;
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final StorageComponentApi storageComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(DisclaimerV2Component$Companion$create$1$mapper$2.INSTANCE);

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(DisclaimerV2Component$Companion$create$1$handlersInhibitor$2.INSTANCE);

                {
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
                    this.actionComponentApi = (ActionComponentApi) storage.getComponent(ActionComponentApi.class);
                    this.checkoutPaymentComponentApi = (CheckoutPaymentComponentApi) storage.getComponent(CheckoutPaymentComponentApi.class);
                    this.analyticsComponentApi = (AnalyticsComponentApi) storage.getComponent(AnalyticsComponentApi.class);
                    this.analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) storage.getComponent(AnalyticsScreenStorageComponentApi.class);
                    this.storageComponentApi = (StorageComponentApi) storage.getComponent(StorageComponentApi.class);
                }

                @Override // ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.di.DisclaimerV2Component
                public CreateAndPayViewModel getCreateAndPayViewModel() {
                    return new CreateAndPayViewModel(new CreateAndPayRepository(this.actionComponentApi.getActionRepository()), new OrderTrackingBus(), new GooglePayManagerImpl(this.checkoutPaymentComponentApi.getGooglePayAvailabilityStorage()), new CreateAndPayAnalytics(this.analyticsComponentApi.getAnalyticsDataLayer(), this.analyticsComponentApi.getPluginsManager(), this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage()));
                }

                @Override // ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.di.DisclaimerV2Component
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.di.DisclaimerV2Component
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.di.DisclaimerV2Component
                public DisclaimerV2Mapper getMapper() {
                    return (DisclaimerV2Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.di.DisclaimerV2Component
                public StartupArgsService getStartupArgsService() {
                    return this.storageComponentApi.getStartupArgsService();
                }
            };
        }
    }

    @NotNull
    CreateAndPayViewModel getCreateAndPayViewModel();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    DisclaimerV2Mapper getMapper();

    @NotNull
    StartupArgsService getStartupArgsService();
}
