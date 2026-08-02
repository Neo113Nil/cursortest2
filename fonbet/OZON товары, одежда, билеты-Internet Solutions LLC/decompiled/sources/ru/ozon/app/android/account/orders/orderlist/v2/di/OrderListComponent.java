package ru.ozon.app.android.account.orders.orderlist.v2.di;

import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderlist.v2.data.mapper.OrderListMapper;
import ru.ozon.app.android.action.custom.ButtonWidgetCustomActionHandlers;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u000e\u001a\u00060\nj\u0002`\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/di/OrderListComponent;", "Lhi/a;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/mapper/OrderListMapper;", "getMapper", "()Lru/ozon/app/android/account/orders/orderlist/v2/data/mapper/OrderListMapper;", "mapper", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/action/custom/ButtonWidgetCustomActionHandlers;", "getButtonWidgetCustomActionHandlers", "()Lru/ozon/app/android/action/custom/ButtonWidgetCustomActionHandlers;", "buttonWidgetCustomActionHandlers", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OrderListComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/di/OrderListComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/account/orders/orderlist/v2/di/OrderListComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/account/orders/orderlist/v2/di/OrderListComponent;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final OrderListComponent create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new OrderListComponent$Companion$create$1(storage);
        }
    }

    @NotNull
    ButtonWidgetCustomActionHandlers getButtonWidgetCustomActionHandlers();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    OrderListMapper getMapper();

    @NotNull
    StartupArgsService getStartupArgsService();

    @NotNull
    CreateAndPayViewModel getViewModel();
}
