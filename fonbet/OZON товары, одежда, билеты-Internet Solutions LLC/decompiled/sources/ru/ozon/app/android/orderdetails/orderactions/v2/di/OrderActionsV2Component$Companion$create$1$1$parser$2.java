package ru.ozon.app.android.orderdetails.orderactions.v2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.orderdetails.orderactions.v2.core.OrderActionsV2Parser;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/orderdetails/orderactions/v2/core/OrderActionsV2Parser;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OrderActionsV2Component$Companion$create$1$1$parser$2 extends AbstractC7737t implements Function0<OrderActionsV2Parser> {
    final /* synthetic */ OrderActionsV2Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderActionsV2Component$Companion$create$1$1$parser$2(OrderActionsV2Component$Companion$create$1$1 orderActionsV2Component$Companion$create$1$1) {
        super(0);
        this.this$0 = orderActionsV2Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderActionsV2Parser invoke() {
        NetworkComponentApi networkComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        return new OrderActionsV2Parser(networkComponentApi.getJsonDeserializer());
    }
}
