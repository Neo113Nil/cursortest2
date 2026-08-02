package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2CheckBoxVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class TileGrid2ViewHolder$topRightButtonsAdapter$1$1 extends C7719a implements Function1<TileGrid2CheckBoxVO, Unit> {
    TileGrid2ViewHolder$topRightButtonsAdapter$1$1(Object obj) {
        super(1, obj, TileGrid2ViewHolder.class, "onCheckboxClick", "onCheckboxClick(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;)Lkotlin/Unit;", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TileGrid2CheckBoxVO tileGrid2CheckBoxVO) {
        invoke2(tileGrid2CheckBoxVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TileGrid2CheckBoxVO tileGrid2CheckBoxVO) {
        ((TileGrid2ViewHolder) this.receiver).onCheckboxClick(tileGrid2CheckBoxVO);
    }
}
