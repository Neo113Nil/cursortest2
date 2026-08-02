package ru.ozon.app.android.common.filterWidgets.filtervalues.data.cellstore;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;

@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/common/filterWidgets/filtervalues/data/cellstore/CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "roundedCell", "", "index", "<init>", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;I)V", "copy", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;I)Lru/ozon/app/android/common/filterWidgets/filtervalues/data/cellstore/CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "getRoundedCell", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "I", "getIndex", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex {
    private final int index;
    private final FilterValuesCell roundedCell;

    public CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex(FilterValuesCell roundedCell, int i11) {
        Intrinsics.checkNotNullParameter(roundedCell, "roundedCell");
        this.roundedCell = roundedCell;
        this.index = i11;
    }

    public static /* synthetic */ CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex copy$default(CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex cellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex, FilterValuesCell filterValuesCell, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            filterValuesCell = cellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex.roundedCell;
        }
        if ((i12 & 2) != 0) {
            i11 = cellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex.index;
        }
        return cellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex.copy(filterValuesCell, i11);
    }

    public final CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex copy(FilterValuesCell roundedCell, int index) {
        Intrinsics.checkNotNullParameter(roundedCell, "roundedCell");
        return new CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex(roundedCell, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex)) {
            return false;
        }
        CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex cellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex = (CellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex) other;
        return Intrinsics.d(this.roundedCell, cellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex.roundedCell) && this.index == cellToggleUtilsKt$recalculateRoundedCellsBorders$RoundedCellWithIndex.index;
    }

    public final int getIndex() {
        return this.index;
    }

    public final FilterValuesCell getRoundedCell() {
        return this.roundedCell;
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + (this.roundedCell.hashCode() * 31);
    }

    public String toString() {
        return "RoundedCellWithIndex(roundedCell=" + this.roundedCell + ", index=" + this.index + ")";
    }
}
