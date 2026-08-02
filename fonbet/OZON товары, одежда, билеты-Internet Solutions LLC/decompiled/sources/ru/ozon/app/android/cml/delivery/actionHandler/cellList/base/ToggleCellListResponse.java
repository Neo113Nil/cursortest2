package ru.ozon.app.android.cml.delivery.actionHandler.cellList.base;

import Ak.C2436a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/cellList/base/ToggleCellListResponse;", "", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "buttons", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCells", "()Ljava/util/List;", "getButtons", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ToggleCellListResponse {
    private final List<ButtonV3DTO> buttons;

    @NotNull
    private final List<CellDTO> cells;

    public ToggleCellListResponse(@NotNull List<CellDTO> cells, List<ButtonV3DTO> list) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cells = cells;
        this.buttons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToggleCellListResponse copy$default(ToggleCellListResponse toggleCellListResponse, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = toggleCellListResponse.cells;
        }
        if ((i11 & 2) != 0) {
            list2 = toggleCellListResponse.buttons;
        }
        return toggleCellListResponse.copy(list, list2);
    }

    @NotNull
    public final List<CellDTO> component1() {
        return this.cells;
    }

    public final List<ButtonV3DTO> component2() {
        return this.buttons;
    }

    @NotNull
    public final ToggleCellListResponse copy(@NotNull List<CellDTO> cells, List<ButtonV3DTO> buttons) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new ToggleCellListResponse(cells, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleCellListResponse)) {
            return false;
        }
        ToggleCellListResponse toggleCellListResponse = (ToggleCellListResponse) other;
        return Intrinsics.d(this.cells, toggleCellListResponse.cells) && Intrinsics.d(this.buttons, toggleCellListResponse.buttons);
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    public int hashCode() {
        int hashCode = this.cells.hashCode() * 31;
        List<ButtonV3DTO> list = this.buttons;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return C2436a.b("ToggleCellListResponse(cells=", this.cells, ", buttons=", ")", this.buttons);
    }
}
