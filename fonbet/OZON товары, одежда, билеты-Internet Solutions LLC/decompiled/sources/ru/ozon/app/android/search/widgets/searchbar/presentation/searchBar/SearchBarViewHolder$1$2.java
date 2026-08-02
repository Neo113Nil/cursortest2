package ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SearchBarViewHolder$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ SearchBarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarViewHolder$1$2(SearchBarViewHolder searchBarViewHolder) {
        super(0);
        this.this$0 = searchBarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        SearchBarVO boundData = this.this$0.getBoundData();
        if (boundData == null) {
            return;
        }
        composerReferences = this.this$0.references;
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences.getNavigator(), boundData.getScanItDeeplink(), null, 2, null);
        t scanItTokenizedEvent = boundData.getScanItTokenizedEvent();
        if (scanItTokenizedEvent != null) {
            composerReferences2 = this.this$0.references;
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(composerReferences2.getTokenizedAnalytics(), scanItTokenizedEvent, null, 2, null);
        }
    }
}
