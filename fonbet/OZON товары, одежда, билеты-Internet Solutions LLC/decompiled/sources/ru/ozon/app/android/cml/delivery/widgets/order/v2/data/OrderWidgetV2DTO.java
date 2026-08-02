package ru.ozon.app.android.cml.delivery.widgets.order.v2.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.cellListGroup.data.CellListGroupDTO;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.data.SecureDealMoleculeDTO;
import ru.ozon.app.android.cml.delivery.widgets.order.data.model.OrderWidgetStickyButtonDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/v2/data/OrderWidgetV2DTO;", "", "orderItems", "", "button", "Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderWidgetStickyButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderWidgetStickyButtonDTO;Ljava/util/Map;)V", "getOrderItems", "()Ljava/util/List;", "getButton", "()Lru/ozon/app/android/cml/delivery/widgets/order/data/model/OrderWidgetStickyButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderWidgetV2DTO {

    @NotNull
    private final OrderWidgetStickyButtonDTO button;

    @NotNull
    private final List<Object> orderItems;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public OrderWidgetV2DTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellListGroup", type = CellListGroupDTO.class), @ProtoOneOfSignature(name = "secureDeal", type = SecureDealMoleculeDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> orderItems, @NotNull OrderWidgetStickyButtonDTO button, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(orderItems, "orderItems");
        Intrinsics.checkNotNullParameter(button, "button");
        this.orderItems = orderItems;
        this.button = button;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderWidgetV2DTO copy$default(OrderWidgetV2DTO orderWidgetV2DTO, List list, OrderWidgetStickyButtonDTO orderWidgetStickyButtonDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderWidgetV2DTO.orderItems;
        }
        if ((i11 & 2) != 0) {
            orderWidgetStickyButtonDTO = orderWidgetV2DTO.button;
        }
        if ((i11 & 4) != 0) {
            map = orderWidgetV2DTO.trackingInfo;
        }
        return orderWidgetV2DTO.copy(list, orderWidgetStickyButtonDTO, map);
    }

    @NotNull
    public final List<Object> component1() {
        return this.orderItems;
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
    public final OrderWidgetV2DTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellListGroup", type = CellListGroupDTO.class), @ProtoOneOfSignature(name = "secureDeal", type = SecureDealMoleculeDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> orderItems, @NotNull OrderWidgetStickyButtonDTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(orderItems, "orderItems");
        Intrinsics.checkNotNullParameter(button, "button");
        return new OrderWidgetV2DTO(orderItems, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderWidgetV2DTO)) {
            return false;
        }
        OrderWidgetV2DTO orderWidgetV2DTO = (OrderWidgetV2DTO) other;
        return Intrinsics.d(this.orderItems, orderWidgetV2DTO.orderItems) && Intrinsics.d(this.button, orderWidgetV2DTO.button) && Intrinsics.d(this.trackingInfo, orderWidgetV2DTO.trackingInfo);
    }

    @NotNull
    public final OrderWidgetStickyButtonDTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<Object> getOrderItems() {
        return this.orderItems;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.button.hashCode() + (this.orderItems.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        List<Object> list = this.orderItems;
        OrderWidgetStickyButtonDTO orderWidgetStickyButtonDTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("OrderWidgetV2DTO(orderItems=");
        sb2.append(list);
        sb2.append(", button=");
        sb2.append(orderWidgetStickyButtonDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
