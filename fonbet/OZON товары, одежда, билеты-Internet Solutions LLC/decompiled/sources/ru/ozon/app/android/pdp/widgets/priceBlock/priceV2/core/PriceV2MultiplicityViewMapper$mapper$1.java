package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DtoWrapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.multiplicity.PriceV2MultiplicityVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Multiplicity;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/multiplicity/PriceV2MultiplicityVO;", "invoke", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Multiplicity;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class PriceV2MultiplicityViewMapper$mapper$1 extends AbstractC7737t implements Function2<PriceV2DtoWrapper.Multiplicity, d, List<? extends PriceV2MultiplicityVO>> {
    public static final PriceV2MultiplicityViewMapper$mapper$1 INSTANCE = new PriceV2MultiplicityViewMapper$mapper$1();

    PriceV2MultiplicityViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<PriceV2MultiplicityVO> invoke(PriceV2DtoWrapper.Multiplicity dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new PriceV2MultiplicityVO(MapperExtKt.widgetId(widgetInfo), dto.getText(), (dto.getIsLastItem() && dto.getShowBottomRounding().booleanValue()) ? CornersConfig.BOTTOM : CornersConfig.NONE));
    }
}
