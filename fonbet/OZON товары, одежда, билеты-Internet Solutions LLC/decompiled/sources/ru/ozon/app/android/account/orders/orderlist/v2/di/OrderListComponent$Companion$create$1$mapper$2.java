package ru.ozon.app.android.account.orders.orderlist.v2.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.orders.orderlist.v2.data.mapper.OrderListMapper;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/orders/orderlist/v2/data/mapper/OrderListMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderListComponent$Companion$create$1$mapper$2 extends AbstractC7737t implements Function0<OrderListMapper> {
    final /* synthetic */ OrderListComponent$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderListComponent$Companion$create$1$mapper$2(OrderListComponent$Companion$create$1 orderListComponent$Companion$create$1) {
        super(0);
        this.this$0 = orderListComponent$Companion$create$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderListMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        StorageComponentApi storageComponentApi;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        Context context = contextComponentDependencies.getContext();
        storageComponentApi = this.this$0.storageComponentApi;
        return new OrderListMapper(context, storageComponentApi.getApplicationInfoStorage());
    }
}
