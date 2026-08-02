package ru.ozon.app.android.search.widgets.searchRequest.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.searchRequest.presentation.SearchRequestVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "item", "Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestVO$Item;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchRequestViewHolder$screenAdapter$1 extends AbstractC7737t implements Function1<SearchRequestVO.Item, Unit> {
    final /* synthetic */ SearchRequestViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchRequestViewHolder$screenAdapter$1(SearchRequestViewHolder searchRequestViewHolder) {
        super(1);
        this.this$0 = searchRequestViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SearchRequestVO.Item item) {
        invoke2(item);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SearchRequestVO.Item item) {
        ComposerReferences composerReferences;
        l lVar;
        Intrinsics.checkNotNullParameter(item, "item");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tokenizedEvent, null, 2, null);
        }
        composerReferences = this.this$0.composerReferences;
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences.getNavigator(), item.getDeeplink(), null, 2, null);
    }
}
