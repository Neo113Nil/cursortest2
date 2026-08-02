package ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.viewItem;

import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewItem.DeliveryInfoVO;
import ru.ozon.app.android.orders.cml.deliveryOrderList.data.InputDTO;
import ru.ozon.app.android.orders.cml.deliveryOrderList.data.StatusDTO;
import ru.ozon.app.android.orders.cml.groupButtons.presentation.viewItem.GroupButtonsVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010+R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/viewItem/DeliveryOrderVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/StatusDTO;", "status", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "cities", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/InputDTO;", "input", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;", "cellList", "Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;", "buttons", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "verticalPadding", "<init>", "(JLru/ozon/app/android/orders/cml/deliveryOrderList/data/StatusDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/orders/cml/deliveryOrderList/data/InputDTO;Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/StatusDTO;", "getStatus", "()Lru/ozon/app/android/orders/cml/deliveryOrderList/data/StatusDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getCities", "()Ljava/util/List;", "Lru/ozon/app/android/orders/cml/deliveryOrderList/data/InputDTO;", "getInput", "()Lru/ozon/app/android/orders/cml/deliveryOrderList/data/InputDTO;", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;", "getCellList", "()Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;", "Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;", "getButtons", "()Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "getVerticalPadding", "()Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryOrderVO implements c {
    private final GroupButtonsVO buttons;

    @NotNull
    private final DeliveryInfoVO cellList;

    @NotNull
    private final List<BadgeDTO> cities;
    private final CommonControlSettings common;
    private final long id;
    private final InputDTO input;

    @NotNull
    private final StatusDTO status;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final VerticalPadding verticalPadding;

    public DeliveryOrderVO(long j11, @NotNull StatusDTO status, TextDTO textDTO, TextDTO textDTO2, @NotNull List<BadgeDTO> cities, InputDTO inputDTO, @NotNull DeliveryInfoVO cellList, GroupButtonsVO groupButtonsVO, CommonControlSettings commonControlSettings, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(cities, "cities");
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        this.id = j11;
        this.status = status;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.cities = cities;
        this.input = inputDTO;
        this.cellList = cellList;
        this.buttons = groupButtonsVO;
        this.common = commonControlSettings;
        this.verticalPadding = verticalPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOrderVO)) {
            return false;
        }
        DeliveryOrderVO deliveryOrderVO = (DeliveryOrderVO) other;
        return this.id == deliveryOrderVO.id && Intrinsics.d(this.status, deliveryOrderVO.status) && Intrinsics.d(this.title, deliveryOrderVO.title) && Intrinsics.d(this.subtitle, deliveryOrderVO.subtitle) && Intrinsics.d(this.cities, deliveryOrderVO.cities) && Intrinsics.d(this.input, deliveryOrderVO.input) && Intrinsics.d(this.cellList, deliveryOrderVO.cellList) && Intrinsics.d(this.buttons, deliveryOrderVO.buttons) && Intrinsics.d(this.common, deliveryOrderVO.common) && Intrinsics.d(this.verticalPadding, deliveryOrderVO.verticalPadding);
    }

    public final GroupButtonsVO getButtons() {
        return this.buttons;
    }

    @NotNull
    public final DeliveryInfoVO getCellList() {
        return this.cellList;
    }

    @NotNull
    public final List<BadgeDTO> getCities() {
        return this.cities;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final InputDTO getInput() {
        return this.input;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final StatusDTO getStatus() {
        return this.status;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int b11 = g.b((hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.cities);
        InputDTO inputDTO = this.input;
        int hashCode3 = (this.cellList.hashCode() + ((b11 + (inputDTO == null ? 0 : inputDTO.hashCode())) * 31)) * 31;
        GroupButtonsVO groupButtonsVO = this.buttons;
        int hashCode4 = (hashCode3 + (groupButtonsVO == null ? 0 : groupButtonsVO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode5 = (hashCode4 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        VerticalPadding verticalPadding = this.verticalPadding;
        return hashCode5 + (verticalPadding != null ? verticalPadding.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        StatusDTO statusDTO = this.status;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<BadgeDTO> list = this.cities;
        InputDTO inputDTO = this.input;
        DeliveryInfoVO deliveryInfoVO = this.cellList;
        GroupButtonsVO groupButtonsVO = this.buttons;
        CommonControlSettings commonControlSettings = this.common;
        VerticalPadding verticalPadding = this.verticalPadding;
        StringBuilder sb2 = new StringBuilder("DeliveryOrderVO(id=");
        sb2.append(j11);
        sb2.append(", status=");
        sb2.append(statusDTO);
        D3.g.i(", title=", ", subtitle=", sb2, textDTO, textDTO2);
        sb2.append(", cities=");
        sb2.append(list);
        sb2.append(", input=");
        sb2.append(inputDTO);
        sb2.append(", cellList=");
        sb2.append(deliveryInfoVO);
        sb2.append(", buttons=");
        sb2.append(groupButtonsVO);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", verticalPadding=");
        sb2.append(verticalPadding);
        sb2.append(")");
        return sb2.toString();
    }
}
