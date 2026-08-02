package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation;

import GZ.g;
import WZ.l;
import WZ.t;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CategoryTitleKt$CategoryTitle$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ SearchResultHeaderVI $item;
    final /* synthetic */ g $router;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CategoryTitleKt$CategoryTitle$2$1(SearchResultHeaderVI searchResultHeaderVI, l lVar, g gVar) {
        super(0);
        this.$item = searchResultHeaderVI;
        this.$tokenizedAnalytics = lVar;
        this.$router = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        t tokenizedEvent = this.$item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processAnyEvents$default(this.$tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        Uri categoryDeeplink = this.$item.getCategoryDeeplink();
        if (categoryDeeplink != null) {
            g gVar = this.$router;
            String uri = categoryDeeplink.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            g.a.a(gVar, uri, null, null, 6);
        }
    }
}
