package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList.TagListVO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTagListDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTagListDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class TagListViewMapper$mapper$1 extends AbstractC7737t implements Function2<SplitElementDTO.SplitTagListDTO, d, List<? extends TagListVO>> {
    public static final TagListViewMapper$mapper$1 INSTANCE = new TagListViewMapper$mapper$1();

    TagListViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<TagListVO> invoke(SplitElementDTO.SplitTagListDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = (widgetInfo.d() + dto.getIndex()).hashCode();
        List<TagButtonDTO> buttons = dto.getButtons();
        ArrayList arrayList = new ArrayList(C7714v.z(buttons, 10));
        int i11 = 0;
        for (Object obj : buttons) {
            int i12 = i11 + 1;
            TagListVO.TagItemVO.TooltipVO tooltipVO = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TagButtonDTO tagButtonDTO = (TagButtonDTO) obj;
            SplitElementDTO.SplitTagListDTO.Tooltip tooltip = dto.getTooltip();
            if (tooltip != null) {
                if (tooltip.getIndex() != i11) {
                    tooltip = null;
                }
                if (tooltip != null) {
                    tooltipVO = tooltip.toVO();
                }
            }
            arrayList.add(new TagListVO.TagItemVO(tagButtonDTO, tooltipVO));
            i11 = i12;
        }
        return C7714v.a0(new TagListVO(hashCode, arrayList, dto.getPaddings()));
    }
}
