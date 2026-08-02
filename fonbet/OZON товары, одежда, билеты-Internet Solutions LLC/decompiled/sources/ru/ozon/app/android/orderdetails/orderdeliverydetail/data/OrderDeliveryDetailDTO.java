package ru.ozon.app.android.orderdetails.orderdeliverydetail.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/OrderDeliveryDetailDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/list/ListElementAtom$IconWithTitleMediumListElement;", "leaveAtDoor", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/LeaveAtDoor;", "actions", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "iconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "<init>", "(Lru/ozon/app/android/atoms/data/list/ListElementAtom$IconWithTitleMediumListElement;Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/LeaveAtDoor;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;)V", "getHeader", "()Lru/ozon/app/android/atoms/data/list/ListElementAtom$IconWithTitleMediumListElement;", "getLeaveAtDoor", "()Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/LeaveAtDoor;", "getActions", "()Ljava/util/List;", "getIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderDeliveryDetailDTO {
    public static final int $stable = 8;
    private final List<ButtonV3Atom.LargeBorderlessButton> actions;

    @NotNull
    private final ListElementAtom.IconWithTitleMediumListElement header;
    private final ButtonV3Atom.SmallButtonWithIcon iconButton;
    private final LeaveAtDoor leaveAtDoor;

    public OrderDeliveryDetailDTO(@NotNull ListElementAtom.IconWithTitleMediumListElement header, LeaveAtDoor leaveAtDoor, List<ButtonV3Atom.LargeBorderlessButton> list, ButtonV3Atom.SmallButtonWithIcon smallButtonWithIcon) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.header = header;
        this.leaveAtDoor = leaveAtDoor;
        this.actions = list;
        this.iconButton = smallButtonWithIcon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderDeliveryDetailDTO copy$default(OrderDeliveryDetailDTO orderDeliveryDetailDTO, ListElementAtom.IconWithTitleMediumListElement iconWithTitleMediumListElement, LeaveAtDoor leaveAtDoor, List list, ButtonV3Atom.SmallButtonWithIcon smallButtonWithIcon, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconWithTitleMediumListElement = orderDeliveryDetailDTO.header;
        }
        if ((i11 & 2) != 0) {
            leaveAtDoor = orderDeliveryDetailDTO.leaveAtDoor;
        }
        if ((i11 & 4) != 0) {
            list = orderDeliveryDetailDTO.actions;
        }
        if ((i11 & 8) != 0) {
            smallButtonWithIcon = orderDeliveryDetailDTO.iconButton;
        }
        return orderDeliveryDetailDTO.copy(iconWithTitleMediumListElement, leaveAtDoor, list, smallButtonWithIcon);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ListElementAtom.IconWithTitleMediumListElement getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final LeaveAtDoor getLeaveAtDoor() {
        return this.leaveAtDoor;
    }

    public final List<ButtonV3Atom.LargeBorderlessButton> component3() {
        return this.actions;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallButtonWithIcon getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final OrderDeliveryDetailDTO copy(@NotNull ListElementAtom.IconWithTitleMediumListElement header, LeaveAtDoor leaveAtDoor, List<ButtonV3Atom.LargeBorderlessButton> actions, ButtonV3Atom.SmallButtonWithIcon iconButton) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new OrderDeliveryDetailDTO(header, leaveAtDoor, actions, iconButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDeliveryDetailDTO)) {
            return false;
        }
        OrderDeliveryDetailDTO orderDeliveryDetailDTO = (OrderDeliveryDetailDTO) other;
        return Intrinsics.d(this.header, orderDeliveryDetailDTO.header) && Intrinsics.d(this.leaveAtDoor, orderDeliveryDetailDTO.leaveAtDoor) && Intrinsics.d(this.actions, orderDeliveryDetailDTO.actions) && Intrinsics.d(this.iconButton, orderDeliveryDetailDTO.iconButton);
    }

    public final List<ButtonV3Atom.LargeBorderlessButton> getActions() {
        return this.actions;
    }

    @NotNull
    public final ListElementAtom.IconWithTitleMediumListElement getHeader() {
        return this.header;
    }

    public final ButtonV3Atom.SmallButtonWithIcon getIconButton() {
        return this.iconButton;
    }

    public final LeaveAtDoor getLeaveAtDoor() {
        return this.leaveAtDoor;
    }

    public int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        LeaveAtDoor leaveAtDoor = this.leaveAtDoor;
        int hashCode2 = (hashCode + (leaveAtDoor == null ? 0 : leaveAtDoor.hashCode())) * 31;
        List<ButtonV3Atom.LargeBorderlessButton> list = this.actions;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3Atom.SmallButtonWithIcon smallButtonWithIcon = this.iconButton;
        return hashCode3 + (smallButtonWithIcon != null ? smallButtonWithIcon.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderDeliveryDetailDTO(header=" + this.header + ", leaveAtDoor=" + this.leaveAtDoor + ", actions=" + this.actions + ", iconButton=" + this.iconButton + ")";
    }
}
