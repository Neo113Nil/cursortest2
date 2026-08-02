package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.di;

import Fu.C3060a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.data.OrderNavBarMapper;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarViewModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/di/OrderNavBarComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarViewModel;", "viewModel", "Companion", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OrderNavBarComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/di/OrderNavBarComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/di/OrderNavBarComponent;", "create", "(Lk20/g;)Lk20/e;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OrderNavBarComponent create$lambda$0(final C7475g c7475g) {
            return new OrderNavBarComponent(c7475g) { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.di.OrderNavBarComponent$Companion$create$1$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(OrderNavBarComponent$Companion$create$1$1$mapper$2.INSTANCE);

                {
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.di.OrderNavBarComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.di.OrderNavBarComponent
                public OrderNavBarMapper getMapper() {
                    return (OrderNavBarMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.di.OrderNavBarComponent
                public OrderNavBarViewModel getViewModel() {
                    return new OrderNavBarViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<OrderNavBarComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(OrderNavBarComponent.class), new C3060a(storage, 5));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    OrderNavBarMapper getMapper();

    @NotNull
    OrderNavBarViewModel getViewModel();
}
