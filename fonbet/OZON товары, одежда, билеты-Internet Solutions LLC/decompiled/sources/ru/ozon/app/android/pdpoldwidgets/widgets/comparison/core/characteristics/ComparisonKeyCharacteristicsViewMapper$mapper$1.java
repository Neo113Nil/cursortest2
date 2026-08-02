package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import Kk.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.CharacteristicsGroupDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupVO;", "invoke", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ComparisonKeyCharacteristicsViewMapper$mapper$1 extends AbstractC7737t implements Function2<ComparisonDTO, d, List<? extends CharacteristicsGroupVO>> {
    final /* synthetic */ ComparisonKeyCharacteristicsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonKeyCharacteristicsViewMapper$mapper$1(ComparisonKeyCharacteristicsViewMapper comparisonKeyCharacteristicsViewMapper) {
        super(2);
        this.this$0 = comparisonKeyCharacteristicsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CharacteristicsGroupVO> invoke(ComparisonDTO dto, d info) {
        Map map;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        CharacteristicsGroupDTO keyCharacteristicsGroup = dto.getKeyCharacteristicsGroup();
        if (keyCharacteristicsGroup != null) {
            ComparisonKeyCharacteristicsViewMapper comparisonKeyCharacteristicsViewMapper = this.this$0;
            long a11 = c.a(comparisonKeyCharacteristicsViewMapper.getClass().getSimpleName(), info.d());
            map = comparisonKeyCharacteristicsViewMapper.expandationState;
            Boolean bool = (Boolean) map.get(Long.valueOf(a11));
            List<CharacteristicsGroupVO> a02 = C7714v.a0(ComparisonCharacteristicsGroupViewMapperKt.toViewObject(keyCharacteristicsGroup, a11, bool != null ? bool.booleanValue() : true));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
