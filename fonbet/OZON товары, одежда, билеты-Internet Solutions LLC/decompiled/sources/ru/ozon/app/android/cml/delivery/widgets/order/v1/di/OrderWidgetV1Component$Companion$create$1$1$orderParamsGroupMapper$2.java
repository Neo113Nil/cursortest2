package ru.ozon.app.android.cml.delivery.widgets.order.v1.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data.CellListGroupMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.data.mapper.OrderParamsGroupVOMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/widgets/order/data/mapper/OrderParamsGroupVOMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderWidgetV1Component$Companion$create$1$1$orderParamsGroupMapper$2 extends AbstractC7737t implements Function0<OrderParamsGroupVOMapper> {
    final /* synthetic */ OrderWidgetV1Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderWidgetV1Component$Companion$create$1$1$orderParamsGroupMapper$2(OrderWidgetV1Component$Companion$create$1$1 orderWidgetV1Component$Companion$create$1$1) {
        super(0);
        this.this$0 = orderWidgetV1Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderParamsGroupVOMapper invoke() {
        CellListGroupMapper cellListGroupMapper;
        cellListGroupMapper = this.this$0.getCellListGroupMapper();
        return new OrderParamsGroupVOMapper(cellListGroupMapper);
    }
}
