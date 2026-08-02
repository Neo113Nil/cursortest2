package ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.di;

import Dq.C2878a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/di/FreshCheckoutProgressBarWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FreshCheckoutProgressBarWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/di/FreshCheckoutProgressBarWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/di/FreshCheckoutProgressBarWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FreshCheckoutProgressBarWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new FreshCheckoutProgressBarWidgetComponent() { // from class: ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.di.FreshCheckoutProgressBarWidgetComponent$Companion$create$1$1
                private final AnalyticsComponentApi analyticsComponentApi;
                private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
                private final GooglePayAvailabilityStorage googlePayAvailabilityStorage;

                {
                    this.analyticsComponentApi = (AnalyticsComponentApi) C7475g.this.getComponent(AnalyticsComponentApi.class);
                    this.analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) C7475g.this.getComponent(AnalyticsScreenStorageComponentApi.class);
                    this.googlePayAvailabilityStorage = ((CheckoutPaymentComponentApi) C7475g.this.getComponent(CheckoutPaymentComponentApi.class)).getGooglePayAvailabilityStorage();
                }

                @Override // ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.di.FreshCheckoutProgressBarWidgetComponent
                public CreateAndPayViewModel getCreateAndPayViewModel() {
                    return new CreateAndPayViewModel(new CreateAndPayRepository(((ActionComponentApi) C7475g.this.getComponent(ActionComponentApi.class)).getActionRepository()), getOrderTrackingBus(), getGooglePayManager(), new CreateAndPayAnalytics(this.analyticsComponentApi.getAnalyticsDataLayer(), this.analyticsComponentApi.getPluginsManager(), this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage()));
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
            };
        }

        @NotNull
        public final C7473e<FreshCheckoutProgressBarWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(FreshCheckoutProgressBarWidgetComponent.class), new C2878a(storage, 4));
        }
    }

    @NotNull
    CreateAndPayViewModel getCreateAndPayViewModel();
}
