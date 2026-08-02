package ru.ozon.app.android.account.orders.orderlist.v4.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.orders.common.shipmentwidget.ShipmentWidgetV2Parser;
import ru.ozon.app.android.account.orders.orderlist.v4.core.OrderListV4Parser;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/orders/orderlist/v4/core/OrderListV4Parser;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderListV4Component$Companion$create$1$1$orderListParser$2 extends AbstractC7737t implements Function0<OrderListV4Parser> {
    final /* synthetic */ OrderListV4Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderListV4Component$Companion$create$1$1$orderListParser$2(OrderListV4Component$Companion$create$1$1 orderListV4Component$Companion$create$1$1) {
        super(0);
        this.this$0 = orderListV4Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderListV4Parser invoke() {
        NetworkComponentApi networkComponentApi;
        ContextComponentDependencies contextComponentDependencies;
        AndroidPlatformComponentApi androidPlatformComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        JsonParser jsonDeserializer = networkComponentApi.getJsonDeserializer();
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        ShipmentWidgetV2Parser shipmentWidgetV2Parser = new ShipmentWidgetV2Parser(jsonDeserializer, contextComponentDependencies.getContext());
        androidPlatformComponentApi = this.this$0.androidPlatformComponentApi;
        return new OrderListV4Parser(shipmentWidgetV2Parser, androidPlatformComponentApi.getAppType());
    }
}
