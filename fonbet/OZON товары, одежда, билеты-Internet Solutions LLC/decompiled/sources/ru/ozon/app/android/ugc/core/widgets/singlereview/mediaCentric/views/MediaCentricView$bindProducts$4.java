package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views;

import WZ.l;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MediaCentricView$bindProducts$4 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ long $widgetId;
    final /* synthetic */ MediaCentricView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaCentricView$bindProducts$4(MediaCentricView mediaCentricView, long j11, l lVar) {
        super(1);
        this.this$0 = mediaCentricView;
        this.$widgetId = j11;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ReviewProductTileAdapter reviewProductTileAdapter;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t tokenizedEvent$default;
        List<ReviewProductTileDTO> currentList;
        reviewProductTileAdapter = this.this$0.productTilesAdapter;
        ReviewProductTileDTO reviewProductTileDTO = (reviewProductTileAdapter == null || (currentList = reviewProductTileAdapter.getCurrentList()) == null) ? null : (ReviewProductTileDTO) C7714v.Q(i11, currentList);
        if (reviewProductTileDTO == null || (trackingInfo = reviewProductTileDTO.getTrackingInfo()) == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(this.$widgetId), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processViewEvents(this.$tokenizedAnalytics, tokenizedEvent$default);
    }
}
