package ru.ozon.app.android.common.taglist.taglistv2.presentation.flexboxtaglist;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.common.taglist.taglistv2.data.TagListDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv2/data/TagListDTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/common/taglist/taglistv2/presentation/flexboxtaglist/FlexboxTagListVO;", "invoke", "(Lru/ozon/app/android/common/taglist/taglistv2/data/TagListDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FlexboxTagListWidgetViewMapper$mapper$1 extends AbstractC7737t implements Function2<TagListDTO, d, List<? extends FlexboxTagListVO>> {
    public static final FlexboxTagListWidgetViewMapper$mapper$1 INSTANCE = new FlexboxTagListWidgetViewMapper$mapper$1();

    FlexboxTagListWidgetViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<FlexboxTagListVO> invoke(TagListDTO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return FlexboxTagListVOKt.toFlexBoxVO(dto);
    }
}
