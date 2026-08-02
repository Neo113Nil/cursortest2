package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.airlineCustomCell.AirlineCustomCellDTO;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v2.TripLegV2DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/SegmentPartDTO;", "", "airlineCell", "Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO;", "tripLeg", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO;", "transferCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO;Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getAirlineCell", "()Lru/ozon/app/android/travel/molecules/dto/airlineCustomCell/AirlineCustomCellDTO;", "getTripLeg", "()Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO;", "getTransferCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SegmentPartDTO {
    public static final int $stable = 8;

    @NotNull
    private final AirlineCustomCellDTO airlineCell;
    private final CellDTO transferCell;

    @NotNull
    private final TripLegV2DTO tripLeg;

    public SegmentPartDTO(@NotNull AirlineCustomCellDTO airlineCell, @NotNull TripLegV2DTO tripLeg, CellDTO cellDTO) {
        Intrinsics.checkNotNullParameter(airlineCell, "airlineCell");
        Intrinsics.checkNotNullParameter(tripLeg, "tripLeg");
        this.airlineCell = airlineCell;
        this.tripLeg = tripLeg;
        this.transferCell = cellDTO;
    }

    public static /* synthetic */ SegmentPartDTO copy$default(SegmentPartDTO segmentPartDTO, AirlineCustomCellDTO airlineCustomCellDTO, TripLegV2DTO tripLegV2DTO, CellDTO cellDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            airlineCustomCellDTO = segmentPartDTO.airlineCell;
        }
        if ((i11 & 2) != 0) {
            tripLegV2DTO = segmentPartDTO.tripLeg;
        }
        if ((i11 & 4) != 0) {
            cellDTO = segmentPartDTO.transferCell;
        }
        return segmentPartDTO.copy(airlineCustomCellDTO, tripLegV2DTO, cellDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AirlineCustomCellDTO getAirlineCell() {
        return this.airlineCell;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TripLegV2DTO getTripLeg() {
        return this.tripLeg;
    }

    /* renamed from: component3, reason: from getter */
    public final CellDTO getTransferCell() {
        return this.transferCell;
    }

    @NotNull
    public final SegmentPartDTO copy(@NotNull AirlineCustomCellDTO airlineCell, @NotNull TripLegV2DTO tripLeg, CellDTO transferCell) {
        Intrinsics.checkNotNullParameter(airlineCell, "airlineCell");
        Intrinsics.checkNotNullParameter(tripLeg, "tripLeg");
        return new SegmentPartDTO(airlineCell, tripLeg, transferCell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentPartDTO)) {
            return false;
        }
        SegmentPartDTO segmentPartDTO = (SegmentPartDTO) other;
        return Intrinsics.d(this.airlineCell, segmentPartDTO.airlineCell) && Intrinsics.d(this.tripLeg, segmentPartDTO.tripLeg) && Intrinsics.d(this.transferCell, segmentPartDTO.transferCell);
    }

    @NotNull
    public final AirlineCustomCellDTO getAirlineCell() {
        return this.airlineCell;
    }

    public final CellDTO getTransferCell() {
        return this.transferCell;
    }

    @NotNull
    public final TripLegV2DTO getTripLeg() {
        return this.tripLeg;
    }

    public int hashCode() {
        int hashCode = (this.tripLeg.hashCode() + (this.airlineCell.hashCode() * 31)) * 31;
        CellDTO cellDTO = this.transferCell;
        return hashCode + (cellDTO == null ? 0 : cellDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "SegmentPartDTO(airlineCell=" + this.airlineCell + ", tripLeg=" + this.tripLeg + ", transferCell=" + this.transferCell + ")";
    }
}
