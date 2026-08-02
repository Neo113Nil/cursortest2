package ru.ozon.app.android.orderdetails.orderSmartAddress.data;

import D3.g;
import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "deliveryPlaceCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "deliveryInfoBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAddress", "getDeliveryPlaceCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getDeliveryInfoBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderSmartAddressDTO {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final TextDTO address;

    @NotNull
    private final CommonControlSettings common;
    private final BadgeDTO deliveryInfoBadge;
    private final CellDTO deliveryPlaceCell;

    @NotNull
    private final TextDTO title;

    public OrderSmartAddressDTO(@NotNull TextDTO title, @NotNull TextDTO address, CellDTO cellDTO, BadgeDTO badgeDTO, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(common, "common");
        this.title = title;
        this.address = address;
        this.deliveryPlaceCell = cellDTO;
        this.deliveryInfoBadge = badgeDTO;
        this.common = common;
    }

    public static /* synthetic */ OrderSmartAddressDTO copy$default(OrderSmartAddressDTO orderSmartAddressDTO, TextDTO textDTO, TextDTO textDTO2, CellDTO cellDTO, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = orderSmartAddressDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = orderSmartAddressDTO.address;
        }
        if ((i11 & 4) != 0) {
            cellDTO = orderSmartAddressDTO.deliveryPlaceCell;
        }
        if ((i11 & 8) != 0) {
            badgeDTO = orderSmartAddressDTO.deliveryInfoBadge;
        }
        if ((i11 & 16) != 0) {
            commonControlSettings = orderSmartAddressDTO.common;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        CellDTO cellDTO2 = cellDTO;
        return orderSmartAddressDTO.copy(textDTO, textDTO2, cellDTO2, badgeDTO, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getAddress() {
        return this.address;
    }

    /* renamed from: component3, reason: from getter */
    public final CellDTO getDeliveryPlaceCell() {
        return this.deliveryPlaceCell;
    }

    /* renamed from: component4, reason: from getter */
    public final BadgeDTO getDeliveryInfoBadge() {
        return this.deliveryInfoBadge;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final OrderSmartAddressDTO copy(@NotNull TextDTO title, @NotNull TextDTO address, CellDTO deliveryPlaceCell, BadgeDTO deliveryInfoBadge, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(common, "common");
        return new OrderSmartAddressDTO(title, address, deliveryPlaceCell, deliveryInfoBadge, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderSmartAddressDTO)) {
            return false;
        }
        OrderSmartAddressDTO orderSmartAddressDTO = (OrderSmartAddressDTO) other;
        return Intrinsics.d(this.title, orderSmartAddressDTO.title) && Intrinsics.d(this.address, orderSmartAddressDTO.address) && Intrinsics.d(this.deliveryPlaceCell, orderSmartAddressDTO.deliveryPlaceCell) && Intrinsics.d(this.deliveryInfoBadge, orderSmartAddressDTO.deliveryInfoBadge) && Intrinsics.d(this.common, orderSmartAddressDTO.common);
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

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = b.a(this.address, this.title.hashCode() * 31, 31);
        CellDTO cellDTO = this.deliveryPlaceCell;
        int hashCode = (a11 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.deliveryInfoBadge;
        return this.common.hashCode() + ((hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.address;
        CellDTO cellDTO = this.deliveryPlaceCell;
        BadgeDTO badgeDTO = this.deliveryInfoBadge;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder g10 = g.g("OrderSmartAddressDTO(title=", textDTO, ", address=", textDTO2, ", deliveryPlaceCell=");
        g10.append(cellDTO);
        g10.append(", deliveryInfoBadge=");
        g10.append(badgeDTO);
        g10.append(", common=");
        return Ak.b.g(g10, commonControlSettings, ")");
    }
}
