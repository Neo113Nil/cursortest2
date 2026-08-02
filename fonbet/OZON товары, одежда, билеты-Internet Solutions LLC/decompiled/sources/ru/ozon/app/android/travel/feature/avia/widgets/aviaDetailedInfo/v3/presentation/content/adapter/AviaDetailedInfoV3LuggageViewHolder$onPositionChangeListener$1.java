package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter;

import WZ.l;
import WZ.t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3VO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "snapPosition", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaDetailedInfoV3LuggageViewHolder$onPositionChangeListener$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ AviaDetailedInfoV3LuggageViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaDetailedInfoV3LuggageViewHolder$onPositionChangeListener$1(AviaDetailedInfoV3LuggageViewHolder aviaDetailedInfoV3LuggageViewHolder, l lVar) {
        super(1);
        this.this$0 = aviaDetailedInfoV3LuggageViewHolder;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        RecyclerView recyclerView;
        List list;
        AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO luggageItemVO;
        recyclerView = this.this$0.recyclerView;
        if (recyclerView != null) {
            AviaDetailedInfoV3LuggageViewHolder aviaDetailedInfoV3LuggageViewHolder = this.this$0;
            l lVar = this.$tokenizedAnalytics;
            list = aviaDetailedInfoV3LuggageViewHolder.cachedLuggage;
            t viewTrackingInfo = (list == null || (luggageItemVO = (AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO) C7714v.Q(i11, list)) == null) ? null : luggageItemVO.getViewTrackingInfo();
            if (viewTrackingInfo != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, viewTrackingInfo, null, 2, null);
            }
        }
    }
}
