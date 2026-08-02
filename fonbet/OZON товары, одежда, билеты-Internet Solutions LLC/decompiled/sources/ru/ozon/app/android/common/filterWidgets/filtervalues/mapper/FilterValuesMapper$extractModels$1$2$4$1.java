package ru.ozon.app.android.common.filterWidgets.filtervalues.mapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/data/AtomDTO;", "atomDTO", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FilterValuesMapper$extractModels$1$2$4$1 extends AbstractC7737t implements Function1<AtomDTO, AtomDTO> {
    final /* synthetic */ FilterValuesMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterValuesMapper$extractModels$1$2$4$1(FilterValuesMapper filterValuesMapper) {
        super(1);
        this.this$0 = filterValuesMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AtomDTO invoke(AtomDTO atomDTO) {
        boolean isSelectFilterValues;
        Intrinsics.checkNotNullParameter(atomDTO, "atomDTO");
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cellWithSubtitleCheckboxRadioCounter = atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter ? (CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) atomDTO : null;
        if (cellWithSubtitleCheckboxRadioCounter != null) {
            isSelectFilterValues = this.this$0.isSelectFilterValues();
            if (isSelectFilterValues) {
                cellWithSubtitleCheckboxRadioCounter = CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.copy$default(cellWithSubtitleCheckboxRadioCounter, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, null, null, null, 1015807, null);
            }
            if (cellWithSubtitleCheckboxRadioCounter != null) {
                return cellWithSubtitleCheckboxRadioCounter;
            }
        }
        return atomDTO;
    }
}
