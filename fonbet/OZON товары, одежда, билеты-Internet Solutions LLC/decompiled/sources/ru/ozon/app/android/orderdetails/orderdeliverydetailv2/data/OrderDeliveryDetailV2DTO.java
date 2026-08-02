package ru.ozon.app.android.orderdetails.orderdeliverydetailv2.data;

import B90.C2618u;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.data.LeaveAtDoor;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetailv2/data/OrderDeliveryDetailV2DTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/list/ListElementAtom$ListElement;", "leaveAtDoor", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/LeaveAtDoor;", "actions", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "<init>", "(Lru/ozon/app/android/atoms/data/list/ListElementAtom$ListElement;Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/LeaveAtDoor;Ljava/util/List;)V", "getHeader", "()Lru/ozon/app/android/atoms/data/list/ListElementAtom$ListElement;", "getLeaveAtDoor", "()Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/LeaveAtDoor;", "getActions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderDeliveryDetailV2DTO {
    public static final int $stable = 8;
    private final List<ButtonV3Atom.LargeBorderlessButton> actions;

    @NotNull
    private final ListElementAtom.ListElement header;
    private final LeaveAtDoor leaveAtDoor;

    public OrderDeliveryDetailV2DTO(@NotNull ListElementAtom.ListElement header, LeaveAtDoor leaveAtDoor, List<ButtonV3Atom.LargeBorderlessButton> list) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.header = header;
        this.leaveAtDoor = leaveAtDoor;
        this.actions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderDeliveryDetailV2DTO copy$default(OrderDeliveryDetailV2DTO orderDeliveryDetailV2DTO, ListElementAtom.ListElement listElement, LeaveAtDoor leaveAtDoor, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            listElement = orderDeliveryDetailV2DTO.header;
        }
        if ((i11 & 2) != 0) {
            leaveAtDoor = orderDeliveryDetailV2DTO.leaveAtDoor;
        }
        if ((i11 & 4) != 0) {
            list = orderDeliveryDetailV2DTO.actions;
        }
        return orderDeliveryDetailV2DTO.copy(listElement, leaveAtDoor, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ListElementAtom.ListElement getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final LeaveAtDoor getLeaveAtDoor() {
        return this.leaveAtDoor;
    }

    public final List<ButtonV3Atom.LargeBorderlessButton> component3() {
        return this.actions;
    }

    @NotNull
    public final OrderDeliveryDetailV2DTO copy(@NotNull ListElementAtom.ListElement header, LeaveAtDoor leaveAtDoor, List<ButtonV3Atom.LargeBorderlessButton> actions) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new OrderDeliveryDetailV2DTO(header, leaveAtDoor, actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDeliveryDetailV2DTO)) {
            return false;
        }
        OrderDeliveryDetailV2DTO orderDeliveryDetailV2DTO = (OrderDeliveryDetailV2DTO) other;
        return Intrinsics.d(this.header, orderDeliveryDetailV2DTO.header) && Intrinsics.d(this.leaveAtDoor, orderDeliveryDetailV2DTO.leaveAtDoor) && Intrinsics.d(this.actions, orderDeliveryDetailV2DTO.actions);
    }

    public final List<ButtonV3Atom.LargeBorderlessButton> getActions() {
        return this.actions;
    }

    @NotNull
    public final ListElementAtom.ListElement getHeader() {
        return this.header;
    }

    public final LeaveAtDoor getLeaveAtDoor() {
        return this.leaveAtDoor;
    }

    public int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        LeaveAtDoor leaveAtDoor = this.leaveAtDoor;
        int hashCode2 = (hashCode + (leaveAtDoor == null ? 0 : leaveAtDoor.hashCode())) * 31;
        List<ButtonV3Atom.LargeBorderlessButton> list = this.actions;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ListElementAtom.ListElement listElement = this.header;
        LeaveAtDoor leaveAtDoor = this.leaveAtDoor;
        List<ButtonV3Atom.LargeBorderlessButton> list = this.actions;
        StringBuilder sb2 = new StringBuilder("OrderDeliveryDetailV2DTO(header=");
        sb2.append(listElement);
        sb2.append(", leaveAtDoor=");
        sb2.append(leaveAtDoor);
        sb2.append(", actions=");
        return C2618u.h(sb2, list, ")");
    }
}
