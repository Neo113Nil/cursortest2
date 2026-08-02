package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v2.TripLegV2DTO;
import ru.ozon.app.android.travel.molecules.view.airlineCustomCell.AirlineCustomCellVO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/presentation/SegmentPartVO;", "", "", "id", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO;", "airlineCell", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO;", "tripLeg", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "transferCell", "<init>", "(ILru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO;Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO;", "getAirlineCell", "()Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO;", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO;", "getTripLeg", "()Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTransferCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SegmentPartVO {

    @NotNull
    private final AirlineCustomCellVO airlineCell;
    private final int id;
    private final CellDTO transferCell;

    @NotNull
    private final TripLegV2DTO tripLeg;

    public SegmentPartVO(int i11, @NotNull AirlineCustomCellVO airlineCell, @NotNull TripLegV2DTO tripLeg, CellDTO cellDTO) {
        Intrinsics.checkNotNullParameter(airlineCell, "airlineCell");
        Intrinsics.checkNotNullParameter(tripLeg, "tripLeg");
        this.id = i11;
        this.airlineCell = airlineCell;
        this.tripLeg = tripLeg;
        this.transferCell = cellDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentPartVO)) {
            return false;
        }
        SegmentPartVO segmentPartVO = (SegmentPartVO) other;
        return this.id == segmentPartVO.id && Intrinsics.d(this.airlineCell, segmentPartVO.airlineCell) && Intrinsics.d(this.tripLeg, segmentPartVO.tripLeg) && Intrinsics.d(this.transferCell, segmentPartVO.transferCell);
    }

    @NotNull
    public final AirlineCustomCellVO getAirlineCell() {
        return this.airlineCell;
    }

    public final int getId() {
        return this.id;
    }

    public final CellDTO getTransferCell() {
        return this.transferCell;
    }

    @NotNull
    public final TripLegV2DTO getTripLeg() {
        return this.tripLeg;
    }

    public int hashCode() {
        int hashCode = (this.tripLeg.hashCode() + ((this.airlineCell.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31;
        CellDTO cellDTO = this.transferCell;
        return hashCode + (cellDTO == null ? 0 : cellDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "SegmentPartVO(id=" + this.id + ", airlineCell=" + this.airlineCell + ", tripLeg=" + this.tripLeg + ", transferCell=" + this.transferCell + ")";
    }
}
