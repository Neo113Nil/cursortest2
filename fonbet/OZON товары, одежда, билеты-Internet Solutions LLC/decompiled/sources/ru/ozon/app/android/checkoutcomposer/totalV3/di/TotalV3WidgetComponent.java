package ru.ozon.app.android.checkoutcomposer.totalV3.di;

import Do.a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u0001\u0015R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/di/TotalV3WidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "getTotalVisibilityViewModel", "()Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TotalV3WidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/di/TotalV3WidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/checkoutcomposer/totalV3/di/TotalV3WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TotalV3WidgetComponent create$lambda$0(final C7475g c7475g) {
            return new TotalV3WidgetComponent() { // from class: ru.ozon.app.android.checkoutcomposer.totalV3.di.TotalV3WidgetComponent$Companion$create$1$1
                private final AnalyticsComponentApi analyticsComponentApi;
                private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
                private final d customActionHandlersStoreFactory;
                private final GooglePayAvailabilityStorage googlePayAvailabilityStorage;
                private final l tokenizedAnalytics;

                {
                    this.analyticsComponentApi = (AnalyticsComponentApi) C7475g.this.getComponent(AnalyticsComponentApi.class);
                    this.analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) C7475g.this.getComponent(AnalyticsScreenStorageComponentApi.class);
                    this.googlePayAvailabilityStorage = ((CheckoutPaymentComponentApi) C7475g.this.getComponent(CheckoutPaymentComponentApi.class)).getGooglePayAvailabilityStorage();
                    this.customActionHandlersStoreFactory = ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                    this.tokenizedAnalytics = ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.checkoutcomposer.totalV3.di.TotalV3WidgetComponent
                public CreateAndPayViewModel getCreateAndPayViewModel() {
                    return new CreateAndPayViewModel(new CreateAndPayRepository(((ActionComponentApi) C7475g.this.getComponent(ActionComponentApi.class)).getActionRepository()), getOrderTrackingBus(), getGooglePayManager(), new CreateAndPayAnalytics(this.analyticsComponentApi.getAnalyticsDataLayer(), this.analyticsComponentApi.getPluginsManager(), this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage()));
                }

                @Override // ru.ozon.app.android.checkoutcomposer.totalV3.di.TotalV3WidgetComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersStoreFactory;
                }

                public GooglePayAvailabilityStorage getGooglePayAvailabilityStorage() {
                    return this.googlePayAvailabilityStorage;
                }

                public GooglePayManager getGooglePayManager() {
                    return new GooglePayManagerImpl(getGooglePayAvailabilityStorage());
                }

                public OrderTrackingBus getOrderTrackingBus() {
                    return new OrderTrackingBus();
                }

                @Override // ru.ozon.app.android.checkoutcomposer.totalV3.di.TotalV3WidgetComponent
                public l getTokenizedAnalytics() {
                    return this.tokenizedAnalytics;
                }

                @Override // ru.ozon.app.android.checkoutcomposer.totalV3.di.TotalV3WidgetComponent
                public TotalVisibilityViewModel getTotalVisibilityViewModel() {
                    return new TotalVisibilityViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<TotalV3WidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TotalV3WidgetComponent.class), new a(storage, 4));
        }
    }

    @NotNull
    CreateAndPayViewModel getCreateAndPayViewModel();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    TotalVisibilityViewModel getTotalVisibilityViewModel();
}
