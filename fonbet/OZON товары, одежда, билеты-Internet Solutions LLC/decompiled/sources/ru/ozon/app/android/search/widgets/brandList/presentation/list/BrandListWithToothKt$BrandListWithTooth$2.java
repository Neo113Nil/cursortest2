package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import Vg.e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2TopPartVO;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.FavoriteCell;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.TitleCell;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;
import v0.I;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BrandListWithToothKt$BrandListWithTooth$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ e.a $actionHandler;
    final /* synthetic */ I $lazyListState;
    final /* synthetic */ EmptyStateV2TopPartVO $placeholder;
    final /* synthetic */ ComposeSisBrandFavoriteButtonDelegateFactory $sisBrandFavoriteButtonDelegateFactory;
    final /* synthetic */ Map<TitleCell, List<FavoriteCell>> $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BrandListWithToothKt$BrandListWithTooth$2(Map<TitleCell, ? extends List<FavoriteCell>> map, e.a aVar, I i11, ComposeSisBrandFavoriteButtonDelegateFactory composeSisBrandFavoriteButtonDelegateFactory, EmptyStateV2TopPartVO emptyStateV2TopPartVO, int i12) {
        super(2);
        this.$state = map;
        this.$actionHandler = aVar;
        this.$lazyListState = i11;
        this.$sisBrandFavoriteButtonDelegateFactory = composeSisBrandFavoriteButtonDelegateFactory;
        this.$placeholder = emptyStateV2TopPartVO;
        this.$$changed = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        BrandListWithToothKt.m966BrandListWithToothvqFMAM(this.$state, this.$actionHandler, this.$lazyListState, this.$sisBrandFavoriteButtonDelegateFactory, this.$placeholder, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
