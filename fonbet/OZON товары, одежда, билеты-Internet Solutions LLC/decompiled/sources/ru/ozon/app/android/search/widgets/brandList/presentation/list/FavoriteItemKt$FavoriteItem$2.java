package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import Vg.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.FavoriteCell;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FavoriteItemKt$FavoriteItem$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ e.a $actionHandlerBuilder;
    final /* synthetic */ FavoriteCell $item;
    final /* synthetic */ ComposeSisBrandFavoriteButtonDelegateFactory $sisBrandFavoriteButtonDelegateFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteItemKt$FavoriteItem$2(FavoriteCell favoriteCell, ComposeSisBrandFavoriteButtonDelegateFactory composeSisBrandFavoriteButtonDelegateFactory, e.a aVar, int i11) {
        super(2);
        this.$item = favoriteCell;
        this.$sisBrandFavoriteButtonDelegateFactory = composeSisBrandFavoriteButtonDelegateFactory;
        this.$actionHandlerBuilder = aVar;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FavoriteItemKt.m968FavoriteItemJHTRYPU(this.$item, this.$sisBrandFavoriteButtonDelegateFactory, this.$actionHandlerBuilder, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
