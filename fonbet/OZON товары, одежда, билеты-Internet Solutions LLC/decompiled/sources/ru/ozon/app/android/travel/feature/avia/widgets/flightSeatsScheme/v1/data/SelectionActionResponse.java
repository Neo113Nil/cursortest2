package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/SelectionActionResponse;", "", "orderDetailsBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;", "orderTotalBlock", "Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalDTO;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalDTO;)V", "getOrderDetailsBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;", "getOrderTotalBlock", "()Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SelectionActionResponse {
    public static final int $stable = 8;
    private final FlightSeatsSchemeOrderDetailsDTO orderDetailsBlock;
    private final OrderTotalDTO orderTotalBlock;

    public SelectionActionResponse(FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO, OrderTotalDTO orderTotalDTO) {
        this.orderDetailsBlock = flightSeatsSchemeOrderDetailsDTO;
        this.orderTotalBlock = orderTotalDTO;
    }

    public static /* synthetic */ SelectionActionResponse copy$default(SelectionActionResponse selectionActionResponse, FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO, OrderTotalDTO orderTotalDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            flightSeatsSchemeOrderDetailsDTO = selectionActionResponse.orderDetailsBlock;
        }
        if ((i11 & 2) != 0) {
            orderTotalDTO = selectionActionResponse.orderTotalBlock;
        }
        return selectionActionResponse.copy(flightSeatsSchemeOrderDetailsDTO, orderTotalDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final FlightSeatsSchemeOrderDetailsDTO getOrderDetailsBlock() {
        return this.orderDetailsBlock;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderTotalDTO getOrderTotalBlock() {
        return this.orderTotalBlock;
    }

    @NotNull
    public final SelectionActionResponse copy(FlightSeatsSchemeOrderDetailsDTO orderDetailsBlock, OrderTotalDTO orderTotalBlock) {
        return new SelectionActionResponse(orderDetailsBlock, orderTotalBlock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionActionResponse)) {
            return false;
        }
        SelectionActionResponse selectionActionResponse = (SelectionActionResponse) other;
        return Intrinsics.d(this.orderDetailsBlock, selectionActionResponse.orderDetailsBlock) && Intrinsics.d(this.orderTotalBlock, selectionActionResponse.orderTotalBlock);
    }

    public final FlightSeatsSchemeOrderDetailsDTO getOrderDetailsBlock() {
        return this.orderDetailsBlock;
    }

    public final OrderTotalDTO getOrderTotalBlock() {
        return this.orderTotalBlock;
    }

    public int hashCode() {
        FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO = this.orderDetailsBlock;
        int hashCode = (flightSeatsSchemeOrderDetailsDTO == null ? 0 : flightSeatsSchemeOrderDetailsDTO.hashCode()) * 31;
        OrderTotalDTO orderTotalDTO = this.orderTotalBlock;
        return hashCode + (orderTotalDTO != null ? orderTotalDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SelectionActionResponse(orderDetailsBlock=" + this.orderDetailsBlock + ", orderTotalBlock=" + this.orderTotalBlock + ")";
    }
}
