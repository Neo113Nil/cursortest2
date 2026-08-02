package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.data.TileGrid3VO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.decorator.TileGrid3Decorator;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/data/TileGrid3VO;", "vo", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "<unused var>", "", "invoke", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/data/TileGrid3VO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TileGrid3ViewMapper$mapper$1 extends AbstractC7737t implements Function2<TileGrid3VO, d, List<? extends TileGrid3VO>> {
    final /* synthetic */ TileGrid3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid3ViewMapper$mapper$1(TileGrid3ViewMapper tileGrid3ViewMapper) {
        super(2);
        this.this$0 = tileGrid3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<TileGrid3VO> invoke(TileGrid3VO vo, d dVar) {
        TileGrid3Decorator decorator;
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
        decorator = this.this$0.getDecorator();
        decorator.setTopMargin(vo.getModel().getTheme().getTopOffset());
        return C7714v.a0(vo);
    }
}
