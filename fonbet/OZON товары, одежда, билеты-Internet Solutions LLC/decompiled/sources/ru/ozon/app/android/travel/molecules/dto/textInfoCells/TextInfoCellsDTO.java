package ru.ozon.app.android.travel.molecules.dto.textInfoCells;

import Kk.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellsDTO;", "", "cells", "", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getCells", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextInfoCellsDTO {

    @NotNull
    private final List<TextInfoCellDTO> cells;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TextInfoCellsDTO(@NotNull List<TextInfoCellDTO> cells, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cells = cells;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextInfoCellsDTO copy$default(TextInfoCellsDTO textInfoCellsDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = textInfoCellsDTO.cells;
        }
        if ((i11 & 2) != 0) {
            map = textInfoCellsDTO.trackingInfo;
        }
        return textInfoCellsDTO.copy(list, map);
    }

    @NotNull
    public final List<TextInfoCellDTO> component1() {
        return this.cells;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final TextInfoCellsDTO copy(@NotNull List<TextInfoCellDTO> cells, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new TextInfoCellsDTO(cells, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInfoCellsDTO)) {
            return false;
        }
        TextInfoCellsDTO textInfoCellsDTO = (TextInfoCellsDTO) other;
        return Intrinsics.d(this.cells, textInfoCellsDTO.cells) && Intrinsics.d(this.trackingInfo, textInfoCellsDTO.trackingInfo);
    }

    @NotNull
    public final List<TextInfoCellDTO> getCells() {
        return this.cells;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.cells.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("TextInfoCellsDTO(cells=", ", trackingInfo=", ")", this.cells, this.trackingInfo);
    }
}
