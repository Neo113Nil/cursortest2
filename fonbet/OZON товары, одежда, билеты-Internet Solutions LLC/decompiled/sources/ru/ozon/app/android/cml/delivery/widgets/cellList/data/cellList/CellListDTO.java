package ru.ozon.app.android.cml.delivery.widgets.cellList.data.cellList;

import K00.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/data/cellList/CellListDTO;", "", "cellList", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "headerWidgetKey", "", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;Ljava/util/Map;I)V", "getCellList", "()Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getHeaderWidgetKey", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CellListDTO {

    @NotNull
    private final CmlCellListMoleculeDTO cellList;
    private final int headerWidgetKey;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CellListDTO(@NotNull CmlCellListMoleculeDTO cellList, Map<String, TokenizedTrackingInfo> map, int i11) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        this.cellList = cellList;
        this.trackingInfo = map;
        this.headerWidgetKey = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CellListDTO copy$default(CellListDTO cellListDTO, CmlCellListMoleculeDTO cmlCellListMoleculeDTO, Map map, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            cmlCellListMoleculeDTO = cellListDTO.cellList;
        }
        if ((i12 & 2) != 0) {
            map = cellListDTO.trackingInfo;
        }
        if ((i12 & 4) != 0) {
            i11 = cellListDTO.headerWidgetKey;
        }
        return cellListDTO.copy(cmlCellListMoleculeDTO, map, i11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CmlCellListMoleculeDTO getCellList() {
        return this.cellList;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeaderWidgetKey() {
        return this.headerWidgetKey;
    }

    @NotNull
    public final CellListDTO copy(@NotNull CmlCellListMoleculeDTO cellList, Map<String, TokenizedTrackingInfo> trackingInfo, int headerWidgetKey) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        return new CellListDTO(cellList, trackingInfo, headerWidgetKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellListDTO)) {
            return false;
        }
        CellListDTO cellListDTO = (CellListDTO) other;
        return Intrinsics.d(this.cellList, cellListDTO.cellList) && Intrinsics.d(this.trackingInfo, cellListDTO.trackingInfo) && this.headerWidgetKey == cellListDTO.headerWidgetKey;
    }

    @NotNull
    public final CmlCellListMoleculeDTO getCellList() {
        return this.cellList;
    }

    public final int getHeaderWidgetKey() {
        return this.headerWidgetKey;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.cellList.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return Integer.hashCode(this.headerWidgetKey) + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        CmlCellListMoleculeDTO cmlCellListMoleculeDTO = this.cellList;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int i11 = this.headerWidgetKey;
        StringBuilder sb2 = new StringBuilder("CellListDTO(cellList=");
        sb2.append(cmlCellListMoleculeDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", headerWidgetKey=");
        return b.e(i11, ")", sb2);
    }
}
