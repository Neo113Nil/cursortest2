package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import java.util.ArrayList;
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
final class ComparisonCharacteristicsGroupViewMapper$mapper$1 extends AbstractC7737t implements Function2<ComparisonDTO, d, List<? extends CharacteristicsGroupVO>> {
    final /* synthetic */ ComparisonCharacteristicsGroupViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonCharacteristicsGroupViewMapper$mapper$1(ComparisonCharacteristicsGroupViewMapper comparisonCharacteristicsGroupViewMapper) {
        super(2);
        this.this$0 = comparisonCharacteristicsGroupViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CharacteristicsGroupVO> invoke(ComparisonDTO dto, d info) {
        Map map;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        List<CharacteristicsGroupDTO> characteristicsGroups = dto.getCharacteristicsGroups();
        if (characteristicsGroups == null) {
            return K.f71697a;
        }
        List<CharacteristicsGroupDTO> list = characteristicsGroups;
        ComparisonCharacteristicsGroupViewMapper comparisonCharacteristicsGroupViewMapper = this.this$0;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CharacteristicsGroupDTO characteristicsGroupDTO = (CharacteristicsGroupDTO) obj;
            long hashCode = (comparisonCharacteristicsGroupViewMapper.getClass().getSimpleName() + i11 + info.d()).hashCode();
            map = comparisonCharacteristicsGroupViewMapper.expandationState;
            Boolean bool = (Boolean) map.get(Long.valueOf(hashCode));
            arrayList.add(ComparisonCharacteristicsGroupViewMapperKt.toViewObject(characteristicsGroupDTO, hashCode, bool != null ? bool.booleanValue() : true));
            i11 = i12;
        }
        return arrayList;
    }
}
