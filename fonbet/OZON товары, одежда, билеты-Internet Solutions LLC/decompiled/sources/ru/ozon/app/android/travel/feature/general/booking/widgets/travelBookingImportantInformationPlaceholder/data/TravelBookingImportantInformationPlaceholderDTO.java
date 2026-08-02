package ru.ozon.app.android.travel.feature.general.booking.widgets.travelBookingImportantInformationPlaceholder.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelBookingImportantInformationPlaceholder/data/TravelBookingImportantInformationPlaceholderDTO;", "", "cell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;)V", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TravelBookingImportantInformationPlaceholderDTO {

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cell;

    public TravelBookingImportantInformationPlaceholderDTO(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
    }

    public static /* synthetic */ TravelBookingImportantInformationPlaceholderDTO copy$default(TravelBookingImportantInformationPlaceholderDTO travelBookingImportantInformationPlaceholderDTO, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellWithSubtitle24Icon = travelBookingImportantInformationPlaceholderDTO.cell;
        }
        return travelBookingImportantInformationPlaceholderDTO.copy(cellWithSubtitle24Icon);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getCell() {
        return this.cell;
    }

    @NotNull
    public final TravelBookingImportantInformationPlaceholderDTO copy(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new TravelBookingImportantInformationPlaceholderDTO(cell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TravelBookingImportantInformationPlaceholderDTO) && Intrinsics.d(this.cell, ((TravelBookingImportantInformationPlaceholderDTO) other).cell);
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getCell() {
        return this.cell;
    }

    public int hashCode() {
        return this.cell.hashCode();
    }

    @NotNull
    public String toString() {
        return "TravelBookingImportantInformationPlaceholderDTO(cell=" + this.cell + ")";
    }
}
