package ru.ozon.app.android.common.filterWidgets.filtervalues.data.cellstore;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.models.CellsModel;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u000b\u0010\u0004\u001a\u00070\u0005¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "kotlin.jvm.PlatformType", "cellsModel", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/CellsModel;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/CellsModel;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FilterValuesCellStore$observe$1 extends AbstractC7737t implements Function1<CellsModel, List<? extends FilterValuesCell>> {
    public static final FilterValuesCellStore$observe$1 INSTANCE = new FilterValuesCellStore$observe$1();

    FilterValuesCellStore$observe$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<FilterValuesCell> invoke(CellsModel cellsModel) {
        Intrinsics.checkNotNullParameter(cellsModel, "cellsModel");
        return CellToggleUtilsKt.recalculateHeaderSeparators(CellToggleUtilsKt.recalculateCellsSeparators(CellToggleUtilsKt.recalculateCornerTitleCell(CellToggleUtilsKt.recalculateRoundedCellsBorders(CellToggleUtilsKt.hideCellsBellowNotExpandedHeader(CellToggleUtilsKt.filterHeaderCells(CellToggleUtilsKt.filterTitleCells(CellToggleUtilsKt.filterCellsBySearchText(cellsModel))))))));
    }
}
