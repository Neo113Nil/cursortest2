package ru.ozon.app.android.orderdetails.trackshipment.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.orderdetails.trackshipment.data.OrderTrackShipmentDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/orderdetails/trackshipment/data/OrderTrackShipmentDTO;", "order", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/orderdetails/trackshipment/presentation/OrderTrackShipmentVO;", "invoke", "(Lru/ozon/app/android/orderdetails/trackshipment/data/OrderTrackShipmentDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class OrderTrackShipmentViewMapper$mapper$1 extends AbstractC7737t implements Function2<OrderTrackShipmentDTO, d, List<? extends OrderTrackShipmentVO>> {
    final /* synthetic */ OrderTrackShipmentViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTrackShipmentViewMapper$mapper$1(OrderTrackShipmentViewMapper orderTrackShipmentViewMapper) {
        super(2);
        this.this$0 = orderTrackShipmentViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<OrderTrackShipmentVO> invoke(OrderTrackShipmentDTO order, d widgetInfo) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(OrderTrackShipmentMapperKt.toVO(order, this.this$0.component().getContext()));
    }
}
