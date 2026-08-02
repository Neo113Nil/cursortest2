package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick.CharacteristicsPickVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO;", "invoke", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ComparisonCharacteristicsPickViewMapper$mapper$1 extends AbstractC7737t implements Function2<ComparisonDTO, d, List<? extends CharacteristicsPickVO>> {
    final /* synthetic */ ComparisonCharacteristicsPickViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonCharacteristicsPickViewMapper$mapper$1(ComparisonCharacteristicsPickViewMapper comparisonCharacteristicsPickViewMapper) {
        super(2);
        this.this$0 = comparisonCharacteristicsPickViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CharacteristicsPickVO> invoke(ComparisonDTO dto, d info) {
        CharacteristicsPickVO viewObject;
        List<CharacteristicsPickVO> a02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        ComparisonCharacteristicsPickViewMapper comparisonCharacteristicsPickViewMapper = this.this$0;
        Object cell = dto.getCharacteristicsPick().getCell();
        comparisonCharacteristicsPickViewMapper.cellDto = cell instanceof CellAtom.CellAtomWithSubtitle ? (CellAtom.CellAtomWithSubtitle) cell : null;
        viewObject = this.this$0.toViewObject(dto.getCharacteristicsPick(), this.this$0.getClass().getSimpleName() + info.d());
        return (viewObject == null || (a02 = C7714v.a0(viewObject)) == null) ? K.f71697a : a02;
    }
}
