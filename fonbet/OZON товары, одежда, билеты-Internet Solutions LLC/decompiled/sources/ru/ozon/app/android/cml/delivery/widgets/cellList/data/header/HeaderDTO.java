package ru.ozon.app.android.cml.delivery.widgets.cellList.data.header;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/data/header/HeaderDTO;", "", "cellList", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;)V", "getCellList", "()Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HeaderDTO {

    @NotNull
    private final CmlCellListMoleculeDTO cellList;

    public HeaderDTO(@NotNull CmlCellListMoleculeDTO cellList) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        this.cellList = cellList;
    }

    public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, CmlCellListMoleculeDTO cmlCellListMoleculeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cmlCellListMoleculeDTO = headerDTO.cellList;
        }
        return headerDTO.copy(cmlCellListMoleculeDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CmlCellListMoleculeDTO getCellList() {
        return this.cellList;
    }

    @NotNull
    public final HeaderDTO copy(@NotNull CmlCellListMoleculeDTO cellList) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        return new HeaderDTO(cellList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HeaderDTO) && Intrinsics.d(this.cellList, ((HeaderDTO) other).cellList);
    }

    @NotNull
    public final CmlCellListMoleculeDTO getCellList() {
        return this.cellList;
    }

    public int hashCode() {
        return this.cellList.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeaderDTO(cellList=" + this.cellList + ")";
    }
}
