package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation;

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
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation.FullTextSearchHeaderV4VO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "crossLink", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO$CrosslinksVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FullTextSearchHeaderV4ViewHolder$crosslinkV4Adapter$1 extends AbstractC7737t implements Function1<FullTextSearchHeaderV4VO.CrosslinksVO, Unit> {
    final /* synthetic */ FullTextSearchHeaderV4ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullTextSearchHeaderV4ViewHolder$crosslinkV4Adapter$1(FullTextSearchHeaderV4ViewHolder fullTextSearchHeaderV4ViewHolder) {
        super(1);
        this.this$0 = fullTextSearchHeaderV4ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FullTextSearchHeaderV4VO.CrosslinksVO crosslinksVO) {
        invoke2(crosslinksVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FullTextSearchHeaderV4VO.CrosslinksVO crossLink) {
        ComposerReferences composerReferences;
        l lVar;
        Intrinsics.checkNotNullParameter(crossLink, "crossLink");
        t tokenizedEvent = crossLink.getTokenizedEvent();
        if (tokenizedEvent != null) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tokenizedEvent, null, 2, null);
        }
        composerReferences = this.this$0.refs;
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences.getNavigator(), crossLink.getDeeplink(), null, 2, null);
    }
}
