package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class TileGrid2GalleryImagePrefetchHelper$multipleDebounceHandler$1 extends C7735q implements Function1<Pair<? extends TileGrid2VO, ? extends Float>, Unit> {
    TileGrid2GalleryImagePrefetchHelper$multipleDebounceHandler$1(Object obj) {
        super(1, obj, TileGrid2GalleryImagePrefetchHelper.class, "onVisibleAreaChanged", "onVisibleAreaChanged(Lkotlin/Pair;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends TileGrid2VO, ? extends Float> pair) {
        invoke2((Pair<TileGrid2VO, Float>) pair);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<TileGrid2VO, Float> p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TileGrid2GalleryImagePrefetchHelper) this.receiver).onVisibleAreaChanged(p02);
    }
}
