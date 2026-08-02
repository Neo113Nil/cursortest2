package ru.ozon.app.android.pdp.widgets.richContent.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.text.RichContentTextVoWrapper;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$TextDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/text/RichContentTextVoWrapper;", "invoke", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$TextDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class RichContentTextViewMapper$mapper$1 extends AbstractC7737t implements Function2<RichContentDTO.Content.TextDTO, d, List<? extends RichContentTextVoWrapper>> {
    public static final RichContentTextViewMapper$mapper$1 INSTANCE = new RichContentTextViewMapper$mapper$1();

    RichContentTextViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<RichContentTextVoWrapper> invoke(RichContentDTO.Content.TextDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        int widgetPosition = RichContentUtilsKt.widgetPosition(dto);
        long widgetId = MapperExtKt.widgetId(widgetInfo) + widgetPosition;
        RichContentVO.Item.Text voText = RichContentMapperExtKt.toVoText(dto);
        Boolean isExpanded = dto.isExpanded();
        return C7714v.a0(new RichContentTextVoWrapper(voText, isExpanded != null ? isExpanded.booleanValue() : false, widgetPosition, dto.getTabGroupId(), widgetId));
    }
}
