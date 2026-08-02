package ru.ozon.app.android.search.widgets.brandList.presentation;

import Bl0.C2652m;
import GZ.g;
import S0.InterfaceC3967k;
import Vg.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2TopPartVO;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BrandListWidgetKt$BrandListWidget$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ e.a $actionHandlerBuilder;
    final /* synthetic */ EmptyStateV2TopPartVO $placeholder;
    final /* synthetic */ g $router;
    final /* synthetic */ ComposeSisBrandFavoriteButtonDelegateFactory $sisBrandFavoriteButtonDelegateFactory;
    final /* synthetic */ BrandListVI $state;
    final /* synthetic */ BrandListViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BrandListWidgetKt$BrandListWidget$4(BrandListVI brandListVI, e.a aVar, g gVar, ComposeSisBrandFavoriteButtonDelegateFactory composeSisBrandFavoriteButtonDelegateFactory, EmptyStateV2TopPartVO emptyStateV2TopPartVO, BrandListViewModel brandListViewModel, int i11) {
        super(2);
        this.$state = brandListVI;
        this.$actionHandlerBuilder = aVar;
        this.$router = gVar;
        this.$sisBrandFavoriteButtonDelegateFactory = composeSisBrandFavoriteButtonDelegateFactory;
        this.$placeholder = emptyStateV2TopPartVO;
        this.$viewModel = brandListViewModel;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        BrandListWidgetKt.m962BrandListWidgetQ4CkjMc(this.$state, this.$actionHandlerBuilder, this.$router, this.$sisBrandFavoriteButtonDelegateFactory, this.$placeholder, this.$viewModel, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
