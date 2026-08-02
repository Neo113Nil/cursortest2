package ru.ozon.app.android.checkoutcomposer.total.di;

import DR.a;
import Vg.d;
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
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchApi;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksDelegate;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.GooglePayManagerImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayAnalytics;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000  2\u00060\u0001j\u0002`\u0002:\u0001 R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/di/TotalWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "getTotalVisibilityViewModel", "()Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "getReferrerValueController", "()Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "referrerValueController", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "getCheckoutPrefetchController", "()Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "checkoutPrefetchController", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "getPartnerBanksDelegate", "()Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "partnerBanksDelegate", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "getAsyncCartViewModelProvider", "()Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "asyncCartViewModelProvider", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TotalWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/di/TotalWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/checkoutcomposer/total/di/TotalWidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TotalWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new TotalWidgetComponent() { // from class: ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent$Companion$create$1$1
                private final AnalyticsComponentApi analyticsComponentApi;
                private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
                private final CheckoutPrefetchController checkoutPrefetchController;
                private final d customActionHandlersStoreFactory;
                private final GooglePayAvailabilityStorage googlePayAvailabilityStorage;
                private final PartnerBanksDelegate partnerBanksDelegate;
                private final ReferrerValueController referrerValueController;
                private final RetainComposerComponentApi retainComposerComponentApi;

                {
                    RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class);
                    this.retainComposerComponentApi = retainComposerComponentApi;
                    this.analyticsComponentApi = (AnalyticsComponentApi) C7475g.this.getComponent(AnalyticsComponentApi.class);
                    this.analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) C7475g.this.getComponent(AnalyticsScreenStorageComponentApi.class);
                    this.googlePayAvailabilityStorage = ((CheckoutPaymentComponentApi) C7475g.this.getComponent(CheckoutPaymentComponentApi.class)).getGooglePayAvailabilityStorage();
                    this.referrerValueController = ((ComposerComponentApi) C7475g.this.getComponent(ComposerComponentApi.class)).getReferrerValueController();
                    this.customActionHandlersStoreFactory = ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                    this.checkoutPrefetchController = ((CheckoutPrefetchApi) C7475g.this.getComponent(CheckoutPrefetchApi.class)).getCheckoutPrefetchController();
                    this.partnerBanksDelegate = new PartnerBanksDelegate(retainComposerComponentApi.getTokenizedAnalytics());
                }

                @Override // ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent
                public AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider() {
                    return ((CartServiceApi) C7475g.this.getComponent(CartServiceApi.class)).getAsyncCartViewModelProvider();
                }

                @Override // ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent
                public CheckoutPrefetchController getCheckoutPrefetchController() {
                    return this.checkoutPrefetchController;
                }

                @Override // ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent
                public CreateAndPayViewModel getCreateAndPayViewModel() {
                    return new CreateAndPayViewModel(new CreateAndPayRepository(((ActionComponentApi) C7475g.this.getComponent(ActionComponentApi.class)).getActionRepository()), getOrderTrackingBus(), getGooglePayManager(), new CreateAndPayAnalytics(this.analyticsComponentApi.getAnalyticsDataLayer(), this.analyticsComponentApi.getPluginsManager(), this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage()));
                }

                @Override // ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent
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

                @Override // ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent
                public PartnerBanksDelegate getPartnerBanksDelegate() {
                    return this.partnerBanksDelegate;
                }

                @Override // ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent
                public ReferrerValueController getReferrerValueController() {
                    return this.referrerValueController;
                }

                @Override // ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent
                public TotalVisibilityViewModel getTotalVisibilityViewModel() {
                    return new TotalVisibilityViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<TotalWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TotalWidgetComponent.class), new a(storage, 8));
        }
    }

    @NotNull
    AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider();

    @NotNull
    CheckoutPrefetchController getCheckoutPrefetchController();

    @NotNull
    CreateAndPayViewModel getCreateAndPayViewModel();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    PartnerBanksDelegate getPartnerBanksDelegate();

    @NotNull
    ReferrerValueController getReferrerValueController();

    @NotNull
    TotalVisibilityViewModel getTotalVisibilityViewModel();
}
