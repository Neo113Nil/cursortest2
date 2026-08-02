package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.leaveatdoor;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.data.LeaveAtDoor;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.data.OrderDeliveryDetailDTO;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"toLeaveAtDoor", "", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/OrderDeliveryDetailLeaveAtDoorVO;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/OrderDeliveryDetailDTO;", "toVO", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/LeaveAtDoorVO;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/LeaveAtDoor;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDeliveryDetailLeaveAtDoorVOKt {
    @NotNull
    public static final List<OrderDeliveryDetailLeaveAtDoorVO> toLeaveAtDoor(@NotNull OrderDeliveryDetailDTO orderDeliveryDetailDTO) {
        List<OrderDeliveryDetailLeaveAtDoorVO> a02;
        Intrinsics.checkNotNullParameter(orderDeliveryDetailDTO, "<this>");
        LeaveAtDoor leaveAtDoor = orderDeliveryDetailDTO.getLeaveAtDoor();
        return (leaveAtDoor == null || (a02 = C7714v.a0(new OrderDeliveryDetailLeaveAtDoorVO((long) leaveAtDoor.hashCode(), toVO(leaveAtDoor)))) == null) ? K.f71697a : a02;
    }

    @NotNull
    public static final LeaveAtDoorVO toVO(@NotNull LeaveAtDoor leaveAtDoor) {
        Intrinsics.checkNotNullParameter(leaveAtDoor, "<this>");
        return new LeaveAtDoorVO(leaveAtDoor.getTitle(), leaveAtDoor.getDelivered() ? R$drawable.ic_s_check : ru.ozon.uni.R$drawable.ic_m_ok, leaveAtDoor.getGallery());
    }
}
