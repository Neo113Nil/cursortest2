package ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.presentation.ToursHotelInfoCardVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ToursHotelInfoCardWidgetViewHolder$spanClickListener$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ToursHotelInfoCardWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursHotelInfoCardWidgetViewHolder$spanClickListener$1(ToursHotelInfoCardWidgetViewHolder toursHotelInfoCardWidgetViewHolder) {
        super(0);
        this.this$0 = toursHotelInfoCardWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposerReferences composerReferences;
        l lVar;
        ToursHotelInfoCardVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            ToursHotelInfoCardWidgetViewHolder toursHotelInfoCardWidgetViewHolder = this.this$0;
            ToursHotelInfoCardVO.DescriptionInfo descriptionInfo = boundData.getDescriptionInfo();
            t showFullButtonTrackingInfo = descriptionInfo != null ? descriptionInfo.getShowFullButtonTrackingInfo() : null;
            boolean isExpanded = boundData.getIsExpanded();
            boolean z11 = !isExpanded;
            if (!isExpanded && showFullButtonTrackingInfo != null) {
                lVar = toursHotelInfoCardWidgetViewHolder.tokenizedAnalytics;
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, showFullButtonTrackingInfo, null, 2, null);
            }
            composerReferences = toursHotelInfoCardWidgetViewHolder.references;
            composerReferences.getController().update(new CollapseExpandDescriptionKey(z11));
        }
    }
}
