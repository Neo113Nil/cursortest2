package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "invoke", "(LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5CardWidgetViewHolder$trackViewHandler$1 extends AbstractC7737t implements Function1<t, Unit> {
    final /* synthetic */ HotelsSearchResultsV5CardWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5CardWidgetViewHolder$trackViewHandler$1(HotelsSearchResultsV5CardWidgetViewHolder hotelsSearchResultsV5CardWidgetViewHolder) {
        super(1);
        this.this$0 = hotelsSearchResultsV5CardWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
        invoke2(tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t tokenizedEvent) {
        l lVar;
        Intrinsics.checkNotNullParameter(tokenizedEvent, "tokenizedEvent");
        if (this.this$0.isInVisibleBounds()) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tokenizedEvent, null, 2, null);
        }
    }
}
