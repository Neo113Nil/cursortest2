package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation;

import Bl0.C2652m;
import GZ.g;
import S0.InterfaceC3967k;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchResultHeaderWidgetKt$SearchOriginalText$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SearchResultHeaderColors $colors;
    final /* synthetic */ SearchResultHeaderVI $item;
    final /* synthetic */ g $router;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultHeaderWidgetKt$SearchOriginalText$2(SearchResultHeaderVI searchResultHeaderVI, SearchResultHeaderColors searchResultHeaderColors, g gVar, l lVar, int i11) {
        super(2);
        this.$item = searchResultHeaderVI;
        this.$colors = searchResultHeaderColors;
        this.$router = gVar;
        this.$tokenizedAnalytics = lVar;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        SearchResultHeaderWidgetKt.SearchOriginalText(this.$item, this.$colors, this.$router, this.$tokenizedAnalytics, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
