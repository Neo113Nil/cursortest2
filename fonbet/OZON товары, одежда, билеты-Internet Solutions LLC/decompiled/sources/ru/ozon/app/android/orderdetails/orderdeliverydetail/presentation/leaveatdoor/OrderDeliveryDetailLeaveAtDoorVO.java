package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.leaveatdoor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/OrderDeliveryDetailLeaveAtDoorVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/LeaveAtDoorVO;", "leaveAtDoor", "<init>", "(JLru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/LeaveAtDoorVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/LeaveAtDoorVO;", "getLeaveAtDoor", "()Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/leaveatdoor/LeaveAtDoorVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderDeliveryDetailLeaveAtDoorVO implements c {
    private final long id;

    @NotNull
    private final LeaveAtDoorVO leaveAtDoor;

    public OrderDeliveryDetailLeaveAtDoorVO(long j11, @NotNull LeaveAtDoorVO leaveAtDoor) {
        Intrinsics.checkNotNullParameter(leaveAtDoor, "leaveAtDoor");
        this.id = j11;
        this.leaveAtDoor = leaveAtDoor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDeliveryDetailLeaveAtDoorVO)) {
            return false;
        }
        OrderDeliveryDetailLeaveAtDoorVO orderDeliveryDetailLeaveAtDoorVO = (OrderDeliveryDetailLeaveAtDoorVO) other;
        return this.id == orderDeliveryDetailLeaveAtDoorVO.id && Intrinsics.d(this.leaveAtDoor, orderDeliveryDetailLeaveAtDoorVO.leaveAtDoor);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final LeaveAtDoorVO getLeaveAtDoor() {
        return this.leaveAtDoor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.leaveAtDoor.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "OrderDeliveryDetailLeaveAtDoorVO(id=" + this.id + ", leaveAtDoor=" + this.leaveAtDoor + ")";
    }
}
