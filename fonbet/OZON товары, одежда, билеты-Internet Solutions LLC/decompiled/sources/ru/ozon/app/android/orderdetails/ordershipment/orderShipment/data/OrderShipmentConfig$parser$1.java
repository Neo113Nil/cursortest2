package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "params", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OrderShipmentConfig$parser$1 extends AbstractC7737t implements Function2<String, String, List<? extends OrderShipmentItemDTO>> {
    final /* synthetic */ OrderShipmentConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderShipmentConfig$parser$1(OrderShipmentConfig orderShipmentConfig) {
        super(2);
        this.this$0 = orderShipmentConfig;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<OrderShipmentItemDTO> invoke(String str, String str2) {
        JsonParser jsonParser;
        OrderShipmentItemDTO addScrollWidgetId;
        jsonParser = this.this$0.deserializer;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        OrderShipmentDTO orderShipmentDTO = (OrderShipmentDTO) jsonParser.fromJson(str2, OrderShipmentDTO.class);
        List<OrderShipmentItemDTO> items = orderShipmentDTO.getItems();
        OrderShipmentConfig orderShipmentConfig = this.this$0;
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            addScrollWidgetId = orderShipmentConfig.addScrollWidgetId((OrderShipmentItemDTO) it.next(), orderShipmentDTO.getId());
            arrayList.add(addScrollWidgetId);
        }
        return arrayList;
    }
}
