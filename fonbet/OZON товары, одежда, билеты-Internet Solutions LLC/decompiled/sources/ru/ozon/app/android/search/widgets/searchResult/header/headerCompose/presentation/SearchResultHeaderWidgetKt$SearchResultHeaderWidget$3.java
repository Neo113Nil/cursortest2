package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation;

import Bl0.C2652m;
import GZ.g;
import S0.InterfaceC3967k;
import Vg.e;
import W10.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegateFactory;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchResultHeaderWidgetKt$SearchResultHeaderWidget$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ e.a $actionHandlerBuilder;
    final /* synthetic */ FavoriteEntityComposeDelegateFactory $favoriteEntityComposeDelegateFactory;
    final /* synthetic */ FavoriteEntityInteractor $favoriteEntityInteractor;
    final /* synthetic */ SearchResultHeaderVI $item;
    final /* synthetic */ MinifyLinkViewModel $minifyLinkViewModel;
    final /* synthetic */ g $router;
    final /* synthetic */ c $trackingData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultHeaderWidgetKt$SearchResultHeaderWidget$3(SearchResultHeaderVI searchResultHeaderVI, MinifyLinkViewModel minifyLinkViewModel, g gVar, FavoriteEntityInteractor favoriteEntityInteractor, FavoriteEntityComposeDelegateFactory favoriteEntityComposeDelegateFactory, e.a aVar, c cVar, int i11) {
        super(2);
        this.$item = searchResultHeaderVI;
        this.$minifyLinkViewModel = minifyLinkViewModel;
        this.$router = gVar;
        this.$favoriteEntityInteractor = favoriteEntityInteractor;
        this.$favoriteEntityComposeDelegateFactory = favoriteEntityComposeDelegateFactory;
        this.$actionHandlerBuilder = aVar;
        this.$trackingData = cVar;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        SearchResultHeaderWidgetKt.m979SearchResultHeaderWidgetSI6GP0Y(this.$item, this.$minifyLinkViewModel, this.$router, this.$favoriteEntityInteractor, this.$favoriteEntityComposeDelegateFactory, this.$actionHandlerBuilder, this.$trackingData, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
