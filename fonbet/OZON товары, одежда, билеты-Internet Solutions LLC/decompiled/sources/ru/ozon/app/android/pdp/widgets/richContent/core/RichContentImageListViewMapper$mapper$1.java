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
import ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.list.RichContentImageListVoWrapper;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/list/RichContentImageListVoWrapper;", "invoke", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class RichContentImageListViewMapper$mapper$1 extends AbstractC7737t implements Function2<RichContentDTO.Content.ListItemDTO, d, List<? extends RichContentImageListVoWrapper>> {
    final /* synthetic */ RichContentImageListViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RichContentImageListViewMapper$mapper$1(RichContentImageListViewMapper richContentImageListViewMapper) {
        super(2);
        this.this$0 = richContentImageListViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<RichContentImageListVoWrapper> invoke(RichContentDTO.Content.ListItemDTO dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        int widgetPosition = RichContentUtilsKt.widgetPosition(dto);
        long widgetId = MapperExtKt.widgetId(widgetInfo) + widgetPosition;
        RichContentVO.Item.ListItem voListItem = RichContentMapperExtKt.toVoListItem(dto, this.this$0.component().getContext());
        Intrinsics.g(voListItem, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO.Item.ListItem.ImageList");
        RichContentVO.Item.ListItem.ImageList imageList = (RichContentVO.Item.ListItem.ImageList) voListItem;
        Boolean isExpanded = dto.isExpanded();
        return C7714v.a0(new RichContentImageListVoWrapper(imageList, isExpanded != null ? isExpanded.booleanValue() : false, widgetPosition, dto.getTabGroupId(), widgetId));
    }
}
