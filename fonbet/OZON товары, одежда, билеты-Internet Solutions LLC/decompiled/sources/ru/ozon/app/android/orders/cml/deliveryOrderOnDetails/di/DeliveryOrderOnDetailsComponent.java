package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.di;

import BD.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.data.DeliveryOrdersOnDetailsMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/di/DeliveryOrderOnDetailsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/DeliveryOrdersOnDetailsMapper;", "getMapper", "()Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/DeliveryOrdersOnDetailsMapper;", "mapper", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "getAdultListDelegateProvider", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DeliveryOrderOnDetailsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/di/DeliveryOrderOnDetailsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/di/DeliveryOrderOnDetailsComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DeliveryOrderOnDetailsComponent create$lambda$0(final C7475g c7475g) {
            return new DeliveryOrderOnDetailsComponent(c7475g) { // from class: ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.di.DeliveryOrderOnDetailsComponent$Companion$create$1$1
                private final AccountComponentApi accountComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper;
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComposerComponentApi;
                private final l tokenizedAnalytics;

                {
                    this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                    RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.retainComposerComponentApi = retainComposerComponentApi;
                    this.mapper = k.b(DeliveryOrderOnDetailsComponent$Companion$create$1$1$mapper$2.INSTANCE);
                    this.tokenizedAnalytics = retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.di.DeliveryOrderOnDetailsComponent
                public AdultListDelegateProvider getAdultListDelegateProvider() {
                    return new AdultListDelegateProvider(this.accountComponentApi.getAdultHandler(), this.networkComponentApi.getFeatureChecker());
                }

                @Override // ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.di.DeliveryOrderOnDetailsComponent
                public DeliveryOrdersOnDetailsMapper getMapper() {
                    return (DeliveryOrdersOnDetailsMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.di.DeliveryOrderOnDetailsComponent
                public l getTokenizedAnalytics() {
                    return this.tokenizedAnalytics;
                }
            };
        }

        @NotNull
        public final C7473e<DeliveryOrderOnDetailsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(DeliveryOrderOnDetailsComponent.class), new a(storage, 3));
        }
    }

    @NotNull
    AdultListDelegateProvider getAdultListDelegateProvider();

    @NotNull
    DeliveryOrdersOnDetailsMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
