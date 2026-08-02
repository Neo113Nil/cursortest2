package ru.ozon.app.android.cml.delivery.widgets.order.v1.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data.CellListGroupDTO;
import ru.ozon.app.android.cml.delivery.widgets.order.data.model.OrderWidgetStickyButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/v1/data/OrderWidgetV1DTO;", "", "cellListGroups", "", "Lru/ozon/app/android/cml/delivery/molecules/cellListGroup/data/CellListGroupDTO;", "button", "Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderWidgetStickyButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderWidgetStickyButtonDTO;Ljava/util/Map;)V", "getCellListGroups", "()Ljava/util/List;", "getButton", "()Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderWidgetStickyButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderWidgetV1DTO {

    @NotNull
    private final OrderWidgetStickyButtonDTO button;

    @NotNull
    private final List<CellListGroupDTO> cellListGroups;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public OrderWidgetV1DTO(@NotNull List<CellListGroupDTO> cellListGroups, @NotNull OrderWidgetStickyButtonDTO button, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cellListGroups, "cellListGroups");
        Intrinsics.checkNotNullParameter(button, "button");
        this.cellListGroups = cellListGroups;
        this.button = button;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderWidgetV1DTO copy$default(OrderWidgetV1DTO orderWidgetV1DTO, List list, OrderWidgetStickyButtonDTO orderWidgetStickyButtonDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderWidgetV1DTO.cellListGroups;
        }
        if ((i11 & 2) != 0) {
            orderWidgetStickyButtonDTO = orderWidgetV1DTO.button;
        }
        if ((i11 & 4) != 0) {
            map = orderWidgetV1DTO.trackingInfo;
        }
        return orderWidgetV1DTO.copy(list, orderWidgetStickyButtonDTO, map);
    }

    @NotNull
    public final List<CellListGroupDTO> component1() {
        return this.cellListGroups;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final OrderWidgetStickyButtonDTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final OrderWidgetV1DTO copy(@NotNull List<CellListGroupDTO> cellListGroups, @NotNull OrderWidgetStickyButtonDTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cellListGroups, "cellListGroups");
        Intrinsics.checkNotNullParameter(button, "button");
        return new OrderWidgetV1DTO(cellListGroups, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderWidgetV1DTO)) {
            return false;
        }
        OrderWidgetV1DTO orderWidgetV1DTO = (OrderWidgetV1DTO) other;
        return Intrinsics.d(this.cellListGroups, orderWidgetV1DTO.cellListGroups) && Intrinsics.d(this.button, orderWidgetV1DTO.button) && Intrinsics.d(this.trackingInfo, orderWidgetV1DTO.trackingInfo);
    }

    @NotNull
    public final OrderWidgetStickyButtonDTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<CellListGroupDTO> getCellListGroups() {
        return this.cellListGroups;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.button.hashCode() + (this.cellListGroups.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        List<CellListGroupDTO> list = this.cellListGroups;
        OrderWidgetStickyButtonDTO orderWidgetStickyButtonDTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("OrderWidgetV1DTO(cellListGroups=");
        sb2.append(list);
        sb2.append(", button=");
        sb2.append(orderWidgetStickyButtonDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
