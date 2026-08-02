package ru.ozon.app.android.account.orders.selectPayment.di;

import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;
import ru.ozon.app.android.csma.api.ComposerActionApi;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentRepository;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/selectPayment/di/SelectPaymentComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel;", "getSelectPaymentViewModel", "()Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel;", "selectPaymentViewModel", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "getActionButtonViewModel", "()Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "actionButtonViewModel", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SelectPaymentComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/orders/selectPayment/di/SelectPaymentComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/account/orders/selectPayment/di/SelectPaymentComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/account/orders/selectPayment/di/SelectPaymentComponent;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final SelectPaymentComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new SelectPaymentComponent(storage) { // from class: ru.ozon.app.android.account.orders.selectPayment.di.SelectPaymentComponent$Companion$create$1
                private final ComposerActionApi composerActionApi;
                private final NetworkComponentApi networkComponentApi;
                private final SelectPaymentRepository selectPaymentRepository;

                {
                    NetworkComponentApi networkComponentApi = (NetworkComponentApi) storage.getComponent(NetworkComponentApi.class);
                    this.networkComponentApi = networkComponentApi;
                    this.selectPaymentRepository = SelectPaymentRepository.INSTANCE.create(networkComponentApi.getRetrofit());
                    this.composerActionApi = (ComposerActionApi) networkComponentApi.getRetrofit().create(ComposerActionApi.class);
                }

                @Override // ru.ozon.app.android.account.orders.selectPayment.di.SelectPaymentComponent
                public ActionButtonViewModel getActionButtonViewModel() {
                    ComposerActionApi composerActionApi = this.composerActionApi;
                    Intrinsics.checkNotNullExpressionValue(composerActionApi, "composerActionApi");
                    return new ActionButtonViewModel(composerActionApi, this.networkComponentApi.getJsonDeserializer());
                }

                @Override // ru.ozon.app.android.account.orders.selectPayment.di.SelectPaymentComponent
                public SelectPaymentViewModel getSelectPaymentViewModel() {
                    return new SelectPaymentViewModel(this.selectPaymentRepository, this.networkComponentApi.getJsonDeserializer());
                }
            };
        }
    }

    @NotNull
    ActionButtonViewModel getActionButtonViewModel();

    @NotNull
    SelectPaymentViewModel getSelectPaymentViewModel();
}
