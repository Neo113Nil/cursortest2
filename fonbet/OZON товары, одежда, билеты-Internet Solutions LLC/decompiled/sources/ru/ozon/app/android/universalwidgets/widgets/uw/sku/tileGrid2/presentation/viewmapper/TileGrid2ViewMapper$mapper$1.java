package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper;

import T00.a;
import T00.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "invoke", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TileGrid2ViewMapper$mapper$1 extends AbstractC7737t implements Function2<TileGrid2VO, d, List<? extends TileGrid2VO>> {
    final /* synthetic */ TileGrid2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ViewMapper$mapper$1(TileGrid2ViewMapper tileGrid2ViewMapper) {
        super(2);
        this.this$0 = tileGrid2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<TileGrid2VO> invoke(TileGrid2VO dto, d info) {
        boolean scrollWidgetKeyByPositionEnabled;
        a b11;
        e h11;
        String j11;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        scrollWidgetKeyByPositionEnabled = this.this$0.getScrollWidgetKeyByPositionEnabled();
        if (scrollWidgetKeyByPositionEnabled && (b11 = info.b()) != null && (h11 = b11.h()) != null && (j11 = h11.j()) != null && h.e0(j11, "/cart", false)) {
            dto.setScrollWidgetKey(info.d().hashCode() + dto.getIndex());
        }
        return C7714v.a0(dto);
    }
}
