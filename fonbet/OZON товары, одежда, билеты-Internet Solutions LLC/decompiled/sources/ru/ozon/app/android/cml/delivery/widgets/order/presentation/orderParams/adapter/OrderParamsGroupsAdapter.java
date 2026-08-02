package ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.cml.delivery.R$id;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.orderParams.OrderParamsItem;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/adapter/OrderParamsGroupsAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/orderParams/OrderParamsItem;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/recyclerview/widget/RecyclerView$u;", "viewPool", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/recyclerview/widget/RecyclerView$u;)V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderParamsGroupsAdapter extends AsyncListDifferDelegationAdapter<OrderParamsItem> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderParamsGroupsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull RecyclerView.u viewPool) {
        super(new OrderParamsItemCallback());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewPool, "viewPool");
        this.delegatesManager.addDelegate(R$id.cellListGroup_itemId, CellListGroupDelegateKt.cellListGroupAdapterDelegate(actionHandler, viewPool));
        this.delegatesManager.addDelegate(R$id.secureDeal_itemId, SecureDealDelegateKt.secureDealAdapterDelegate(actionHandler));
    }
}
