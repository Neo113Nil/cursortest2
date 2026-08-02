package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.storefront.data.tiles.tilescroll.TileScrollDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO;", "invoke", "(Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TileScrollViewMapper$mapper$1 extends AbstractC7737t implements Function2<TileScrollDTO, d, List<? extends TileScrollVO>> {
    final /* synthetic */ TileScrollViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileScrollViewMapper$mapper$1(TileScrollViewMapper tileScrollViewMapper) {
        super(2);
        this.this$0 = tileScrollViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<TileScrollVO> invoke(TileScrollDTO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.this$0.component().getTileScrollMapper().map(dto, info);
    }
}
