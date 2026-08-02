package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4LoadingVO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "viewTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV4LoadingWidgetViewHolder$trackViewEvent$1 extends AbstractC7737t implements Function1<Map<String, ? extends TokenizedTrackingInfo>, Unit> {
    final /* synthetic */ AviaSearchResultV4LoadingWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4LoadingWidgetViewHolder$trackViewEvent$1(AviaSearchResultV4LoadingWidgetViewHolder aviaSearchResultV4LoadingWidgetViewHolder) {
        super(1);
        this.this$0 = aviaSearchResultV4LoadingWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends TokenizedTrackingInfo> map) {
        invoke2((Map<String, TokenizedTrackingInfo>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, TokenizedTrackingInfo> viewTrackingInfo) {
        l lVar;
        Intrinsics.checkNotNullParameter(viewTrackingInfo, "viewTrackingInfo");
        AviaSearchResultV4LoadingVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            long id2 = boundData.getId();
            AviaSearchResultV4LoadingWidgetViewHolder aviaSearchResultV4LoadingWidgetViewHolder = this.this$0;
            t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(viewTrackingInfo, Long.valueOf(id2), null, 2, null);
            lVar = aviaSearchResultV4LoadingWidgetViewHolder.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, mapToTokenizedEvent$default, null, 2, null);
        }
    }
}
