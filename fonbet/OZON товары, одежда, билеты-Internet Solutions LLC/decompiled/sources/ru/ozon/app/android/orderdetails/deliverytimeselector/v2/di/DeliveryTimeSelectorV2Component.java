package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.di;

import Ap.C2441a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data.ConfirmButtonMapper;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data.DeliveryTimeSelectorV2Mapper;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.button.ConfirmDateButtonViewModel;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/di/DeliveryTimeSelectorV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2Mapper;", "getDeliveryTimeSelectorMapper", "()Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2Mapper;", "deliveryTimeSelectorMapper", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/ConfirmButtonMapper;", "getConfirmButtonMapper", "()Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/ConfirmButtonMapper;", "confirmButtonMapper", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel;", "getActionViewModel", "()Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/button/ConfirmDateButtonViewModel;", "actionViewModel", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DeliveryTimeSelectorV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/di/DeliveryTimeSelectorV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/di/DeliveryTimeSelectorV2Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DeliveryTimeSelectorV2Component create$lambda$0(final C7475g c7475g) {
            return new DeliveryTimeSelectorV2Component(c7475g) { // from class: ru.ozon.app.android.orderdetails.deliverytimeselector.v2.di.DeliveryTimeSelectorV2Component$Companion$create$1$1
                private final ActionComponentApi actionComponentApi;
                private final NetworkComponentApi networkComponentApi;

                /* renamed from: deliveryTimeSelectorMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j deliveryTimeSelectorMapper = k.b(DeliveryTimeSelectorV2Component$Companion$create$1$1$deliveryTimeSelectorMapper$2.INSTANCE);

                /* renamed from: confirmButtonMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j confirmButtonMapper = k.b(DeliveryTimeSelectorV2Component$Companion$create$1$1$confirmButtonMapper$2.INSTANCE);

                {
                    this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                    this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
                }

                @Override // ru.ozon.app.android.orderdetails.deliverytimeselector.v2.di.DeliveryTimeSelectorV2Component
                public ConfirmDateButtonViewModel getActionViewModel() {
                    return new ConfirmDateButtonViewModel(this.actionComponentApi.getActionRepository(), this.networkComponentApi.getJsonDeserializer());
                }

                @Override // ru.ozon.app.android.orderdetails.deliverytimeselector.v2.di.DeliveryTimeSelectorV2Component
                public ConfirmButtonMapper getConfirmButtonMapper() {
                    return (ConfirmButtonMapper) this.confirmButtonMapper.getValue();
                }

                @Override // ru.ozon.app.android.orderdetails.deliverytimeselector.v2.di.DeliveryTimeSelectorV2Component
                public DeliveryTimeSelectorV2Mapper getDeliveryTimeSelectorMapper() {
                    return (DeliveryTimeSelectorV2Mapper) this.deliveryTimeSelectorMapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<DeliveryTimeSelectorV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(DeliveryTimeSelectorV2Component.class), new C2441a(storage, 8));
        }
    }

    @NotNull
    ConfirmDateButtonViewModel getActionViewModel();

    @NotNull
    ConfirmButtonMapper getConfirmButtonMapper();

    @NotNull
    DeliveryTimeSelectorV2Mapper getDeliveryTimeSelectorMapper();
}
