package ru.ozon.app.android.orderdetails.orderSmartAddress.viewObject;

import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/orderdetails/orderSmartAddress/viewObject/OrderSmartAddressVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "deliveryPlaceCell", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "deliveryInfoBadge", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAddress", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getDeliveryPlaceCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDeliveryInfoBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderSmartAddressVO implements c {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final TextDTO address;

    @NotNull
    private final CommonControlSettings common;
    private final BadgeDTO deliveryInfoBadge;
    private final CellDTO deliveryPlaceCell;
    private final long id;

    @NotNull
    private final TextDTO title;

    public OrderSmartAddressVO(long j11, @NotNull TextDTO title, @NotNull TextDTO address, CellDTO cellDTO, BadgeDTO badgeDTO, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(common, "common");
        this.id = j11;
        this.title = title;
        this.address = address;
        this.deliveryPlaceCell = cellDTO;
        this.deliveryInfoBadge = badgeDTO;
        this.common = common;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderSmartAddressVO)) {
            return false;
        }
        OrderSmartAddressVO orderSmartAddressVO = (OrderSmartAddressVO) other;
        return this.id == orderSmartAddressVO.id && Intrinsics.d(this.title, orderSmartAddressVO.title) && Intrinsics.d(this.address, orderSmartAddressVO.address) && Intrinsics.d(this.deliveryPlaceCell, orderSmartAddressVO.deliveryPlaceCell) && Intrinsics.d(this.deliveryInfoBadge, orderSmartAddressVO.deliveryInfoBadge) && Intrinsics.d(this.common, orderSmartAddressVO.common);
    }

    @NotNull
    public final TextDTO getAddress() {
        return this.address;
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final BadgeDTO getDeliveryInfoBadge() {
        return this.deliveryInfoBadge;
    }

    public final CellDTO getDeliveryPlaceCell() {
        return this.deliveryPlaceCell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.address, b.a(this.title, Long.hashCode(this.id) * 31, 31), 31);
        CellDTO cellDTO = this.deliveryPlaceCell;
        int hashCode = (a11 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.deliveryInfoBadge;
        return this.common.hashCode() + ((hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.address;
        CellDTO cellDTO = this.deliveryPlaceCell;
        BadgeDTO badgeDTO = this.deliveryInfoBadge;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder b11 = a.b("OrderSmartAddressVO(id=", j11, ", title=", textDTO);
        b11.append(", address=");
        b11.append(textDTO2);
        b11.append(", deliveryPlaceCell=");
        b11.append(cellDTO);
        b11.append(", deliveryInfoBadge=");
        b11.append(badgeDTO);
        b11.append(", common=");
        b11.append(commonControlSettings);
        b11.append(")");
        return b11.toString();
    }
}
