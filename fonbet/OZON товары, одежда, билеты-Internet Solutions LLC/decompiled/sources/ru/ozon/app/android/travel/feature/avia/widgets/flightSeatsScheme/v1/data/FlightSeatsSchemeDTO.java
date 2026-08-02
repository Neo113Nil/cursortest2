package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data;

import Pk0.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.orderTotal.OrderTotalDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.legend.MobileLegendBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.scheme.FlightSeatsSchemeBlockDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003JW\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;", "", "passengersBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO;", "orderTotalBlock", "Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalDTO;", "mobileLegendBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO;", "schemeBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO;", "orderDetailsBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;", "emptySchemeBlock", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "shouldFetchState", "", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO;Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalDTO;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;Z)V", "getPassengersBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO;", "getOrderTotalBlock", "()Lru/ozon/app/android/travel/feature/avia/shared/orderTotal/OrderTotalDTO;", "getMobileLegendBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO;", "getSchemeBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/scheme/FlightSeatsSchemeBlockDTO;", "getOrderDetailsBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;", "getEmptySchemeBlock", "()Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "getShouldFetchState", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeDTO {
    public static final int $stable = 8;
    private final EmptyStateDTO emptySchemeBlock;
    private final MobileLegendBlockDTO mobileLegendBlock;
    private final FlightSeatsSchemeOrderDetailsDTO orderDetailsBlock;

    @NotNull
    private final OrderTotalDTO orderTotalBlock;

    @NotNull
    private final FlightSeatsSchemePassengersBlockDTO passengersBlock;
    private final FlightSeatsSchemeBlockDTO schemeBlock;
    private final boolean shouldFetchState;

    public FlightSeatsSchemeDTO(@NotNull FlightSeatsSchemePassengersBlockDTO passengersBlock, @NotNull OrderTotalDTO orderTotalBlock, MobileLegendBlockDTO mobileLegendBlockDTO, FlightSeatsSchemeBlockDTO flightSeatsSchemeBlockDTO, FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO, EmptyStateDTO emptyStateDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(passengersBlock, "passengersBlock");
        Intrinsics.checkNotNullParameter(orderTotalBlock, "orderTotalBlock");
        this.passengersBlock = passengersBlock;
        this.orderTotalBlock = orderTotalBlock;
        this.mobileLegendBlock = mobileLegendBlockDTO;
        this.schemeBlock = flightSeatsSchemeBlockDTO;
        this.orderDetailsBlock = flightSeatsSchemeOrderDetailsDTO;
        this.emptySchemeBlock = emptyStateDTO;
        this.shouldFetchState = z11;
    }

    public static /* synthetic */ FlightSeatsSchemeDTO copy$default(FlightSeatsSchemeDTO flightSeatsSchemeDTO, FlightSeatsSchemePassengersBlockDTO flightSeatsSchemePassengersBlockDTO, OrderTotalDTO orderTotalDTO, MobileLegendBlockDTO mobileLegendBlockDTO, FlightSeatsSchemeBlockDTO flightSeatsSchemeBlockDTO, FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO, EmptyStateDTO emptyStateDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            flightSeatsSchemePassengersBlockDTO = flightSeatsSchemeDTO.passengersBlock;
        }
        if ((i11 & 2) != 0) {
            orderTotalDTO = flightSeatsSchemeDTO.orderTotalBlock;
        }
        if ((i11 & 4) != 0) {
            mobileLegendBlockDTO = flightSeatsSchemeDTO.mobileLegendBlock;
        }
        if ((i11 & 8) != 0) {
            flightSeatsSchemeBlockDTO = flightSeatsSchemeDTO.schemeBlock;
        }
        if ((i11 & 16) != 0) {
            flightSeatsSchemeOrderDetailsDTO = flightSeatsSchemeDTO.orderDetailsBlock;
        }
        if ((i11 & 32) != 0) {
            emptyStateDTO = flightSeatsSchemeDTO.emptySchemeBlock;
        }
        if ((i11 & 64) != 0) {
            z11 = flightSeatsSchemeDTO.shouldFetchState;
        }
        EmptyStateDTO emptyStateDTO2 = emptyStateDTO;
        boolean z12 = z11;
        FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO2 = flightSeatsSchemeOrderDetailsDTO;
        MobileLegendBlockDTO mobileLegendBlockDTO2 = mobileLegendBlockDTO;
        return flightSeatsSchemeDTO.copy(flightSeatsSchemePassengersBlockDTO, orderTotalDTO, mobileLegendBlockDTO2, flightSeatsSchemeBlockDTO, flightSeatsSchemeOrderDetailsDTO2, emptyStateDTO2, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FlightSeatsSchemePassengersBlockDTO getPassengersBlock() {
        return this.passengersBlock;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final OrderTotalDTO getOrderTotalBlock() {
        return this.orderTotalBlock;
    }

    /* renamed from: component3, reason: from getter */
    public final MobileLegendBlockDTO getMobileLegendBlock() {
        return this.mobileLegendBlock;
    }

    /* renamed from: component4, reason: from getter */
    public final FlightSeatsSchemeBlockDTO getSchemeBlock() {
        return this.schemeBlock;
    }

    /* renamed from: component5, reason: from getter */
    public final FlightSeatsSchemeOrderDetailsDTO getOrderDetailsBlock() {
        return this.orderDetailsBlock;
    }

    /* renamed from: component6, reason: from getter */
    public final EmptyStateDTO getEmptySchemeBlock() {
        return this.emptySchemeBlock;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    @NotNull
    public final FlightSeatsSchemeDTO copy(@NotNull FlightSeatsSchemePassengersBlockDTO passengersBlock, @NotNull OrderTotalDTO orderTotalBlock, MobileLegendBlockDTO mobileLegendBlock, FlightSeatsSchemeBlockDTO schemeBlock, FlightSeatsSchemeOrderDetailsDTO orderDetailsBlock, EmptyStateDTO emptySchemeBlock, boolean shouldFetchState) {
        Intrinsics.checkNotNullParameter(passengersBlock, "passengersBlock");
        Intrinsics.checkNotNullParameter(orderTotalBlock, "orderTotalBlock");
        return new FlightSeatsSchemeDTO(passengersBlock, orderTotalBlock, mobileLegendBlock, schemeBlock, orderDetailsBlock, emptySchemeBlock, shouldFetchState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeDTO)) {
            return false;
        }
        FlightSeatsSchemeDTO flightSeatsSchemeDTO = (FlightSeatsSchemeDTO) other;
        return Intrinsics.d(this.passengersBlock, flightSeatsSchemeDTO.passengersBlock) && Intrinsics.d(this.orderTotalBlock, flightSeatsSchemeDTO.orderTotalBlock) && Intrinsics.d(this.mobileLegendBlock, flightSeatsSchemeDTO.mobileLegendBlock) && Intrinsics.d(this.schemeBlock, flightSeatsSchemeDTO.schemeBlock) && Intrinsics.d(this.orderDetailsBlock, flightSeatsSchemeDTO.orderDetailsBlock) && Intrinsics.d(this.emptySchemeBlock, flightSeatsSchemeDTO.emptySchemeBlock) && this.shouldFetchState == flightSeatsSchemeDTO.shouldFetchState;
    }

    public final EmptyStateDTO getEmptySchemeBlock() {
        return this.emptySchemeBlock;
    }

    public final MobileLegendBlockDTO getMobileLegendBlock() {
        return this.mobileLegendBlock;
    }

    public final FlightSeatsSchemeOrderDetailsDTO getOrderDetailsBlock() {
        return this.orderDetailsBlock;
    }

    @NotNull
    public final OrderTotalDTO getOrderTotalBlock() {
        return this.orderTotalBlock;
    }

    @NotNull
    public final FlightSeatsSchemePassengersBlockDTO getPassengersBlock() {
        return this.passengersBlock;
    }

    public final FlightSeatsSchemeBlockDTO getSchemeBlock() {
        return this.schemeBlock;
    }

    public final boolean getShouldFetchState() {
        return this.shouldFetchState;
    }

    public int hashCode() {
        int hashCode = (this.orderTotalBlock.hashCode() + (this.passengersBlock.hashCode() * 31)) * 31;
        MobileLegendBlockDTO mobileLegendBlockDTO = this.mobileLegendBlock;
        int hashCode2 = (hashCode + (mobileLegendBlockDTO == null ? 0 : mobileLegendBlockDTO.hashCode())) * 31;
        FlightSeatsSchemeBlockDTO flightSeatsSchemeBlockDTO = this.schemeBlock;
        int hashCode3 = (hashCode2 + (flightSeatsSchemeBlockDTO == null ? 0 : flightSeatsSchemeBlockDTO.hashCode())) * 31;
        FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO = this.orderDetailsBlock;
        int hashCode4 = (hashCode3 + (flightSeatsSchemeOrderDetailsDTO == null ? 0 : flightSeatsSchemeOrderDetailsDTO.hashCode())) * 31;
        EmptyStateDTO emptyStateDTO = this.emptySchemeBlock;
        return Boolean.hashCode(this.shouldFetchState) + ((hashCode4 + (emptyStateDTO != null ? emptyStateDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        FlightSeatsSchemePassengersBlockDTO flightSeatsSchemePassengersBlockDTO = this.passengersBlock;
        OrderTotalDTO orderTotalDTO = this.orderTotalBlock;
        MobileLegendBlockDTO mobileLegendBlockDTO = this.mobileLegendBlock;
        FlightSeatsSchemeBlockDTO flightSeatsSchemeBlockDTO = this.schemeBlock;
        FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO = this.orderDetailsBlock;
        EmptyStateDTO emptyStateDTO = this.emptySchemeBlock;
        boolean z11 = this.shouldFetchState;
        StringBuilder sb2 = new StringBuilder("FlightSeatsSchemeDTO(passengersBlock=");
        sb2.append(flightSeatsSchemePassengersBlockDTO);
        sb2.append(", orderTotalBlock=");
        sb2.append(orderTotalDTO);
        sb2.append(", mobileLegendBlock=");
        sb2.append(mobileLegendBlockDTO);
        sb2.append(", schemeBlock=");
        sb2.append(flightSeatsSchemeBlockDTO);
        sb2.append(", orderDetailsBlock=");
        sb2.append(flightSeatsSchemeOrderDetailsDTO);
        sb2.append(", emptySchemeBlock=");
        sb2.append(emptyStateDTO);
        sb2.append(", shouldFetchState=");
        return a.a(")", sb2, z11);
    }

    public /* synthetic */ FlightSeatsSchemeDTO(FlightSeatsSchemePassengersBlockDTO flightSeatsSchemePassengersBlockDTO, OrderTotalDTO orderTotalDTO, MobileLegendBlockDTO mobileLegendBlockDTO, FlightSeatsSchemeBlockDTO flightSeatsSchemeBlockDTO, FlightSeatsSchemeOrderDetailsDTO flightSeatsSchemeOrderDetailsDTO, EmptyStateDTO emptyStateDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(flightSeatsSchemePassengersBlockDTO, orderTotalDTO, mobileLegendBlockDTO, flightSeatsSchemeBlockDTO, flightSeatsSchemeOrderDetailsDTO, emptyStateDTO, (i11 & 64) != 0 ? false : z11);
    }
}
