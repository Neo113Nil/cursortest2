package ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.leaveatdoor;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.leaveatdoor.OrderDeliveryDetailLeaveAtDoorVO;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.data.OrderDeliveryDetailV2DTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;", "dto", "Ll20/d;", "<unused var>", "", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/OrderDeliveryDetailLeaveAtDoorVO;", "invoke", "(Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class OrderDeliveryDetailV2LeaveAtDoorViewMapper$mapper$1 extends AbstractC7737t implements Function2<OrderDeliveryDetailV2DTO, d, List<? extends OrderDeliveryDetailLeaveAtDoorVO>> {
    final /* synthetic */ OrderDeliveryDetailV2LeaveAtDoorViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderDeliveryDetailV2LeaveAtDoorViewMapper$mapper$1(OrderDeliveryDetailV2LeaveAtDoorViewMapper orderDeliveryDetailV2LeaveAtDoorViewMapper) {
        super(2);
        this.this$0 = orderDeliveryDetailV2LeaveAtDoorViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<OrderDeliveryDetailLeaveAtDoorVO> invoke(OrderDeliveryDetailV2DTO dto, d dVar) {
        List<OrderDeliveryDetailLeaveAtDoorVO> leaveAtDoor;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
        leaveAtDoor = this.this$0.toLeaveAtDoor(dto);
        return leaveAtDoor;
    }
}
