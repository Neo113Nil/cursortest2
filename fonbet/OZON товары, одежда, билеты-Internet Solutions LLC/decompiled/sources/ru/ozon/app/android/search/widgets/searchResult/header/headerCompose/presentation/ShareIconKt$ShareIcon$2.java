package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import W10.c;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.styles.SearchResultHeaderColors;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ShareIconKt$ShareIcon$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SearchResultHeaderColors $colors;
    final /* synthetic */ SearchResultHeaderVI $item;
    final /* synthetic */ MinifyLinkViewModel $minifyLinkViewModel;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ c $trackingData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareIconKt$ShareIcon$2(SearchResultHeaderVI searchResultHeaderVI, MinifyLinkViewModel minifyLinkViewModel, l lVar, SearchResultHeaderColors searchResultHeaderColors, c cVar, int i11) {
        super(2);
        this.$item = searchResultHeaderVI;
        this.$minifyLinkViewModel = minifyLinkViewModel;
        this.$tokenizedAnalytics = lVar;
        this.$colors = searchResultHeaderColors;
        this.$trackingData = cVar;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ShareIconKt.ShareIcon(this.$item, this.$minifyLinkViewModel, this.$tokenizedAnalytics, this.$colors, this.$trackingData, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
