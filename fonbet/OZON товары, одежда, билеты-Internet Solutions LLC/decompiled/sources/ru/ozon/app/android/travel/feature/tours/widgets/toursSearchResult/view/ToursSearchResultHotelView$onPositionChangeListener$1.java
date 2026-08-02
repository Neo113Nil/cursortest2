package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ToursSearchResultHotelView$onPositionChangeListener$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ ToursSearchResultHotelView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultHotelView$onPositionChangeListener$1(ToursSearchResultHotelView toursSearchResultHotelView) {
        super(1);
        this.this$0 = toursSearchResultHotelView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r0 = r3.this$0.tokenizedAnalytics;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(int i11) {
        ToursSearchResultVO.HotelVO hotelVO;
        t scrollGalleryEvent;
        l lVar;
        hotelVO = this.this$0.boundedData;
        if (hotelVO == null || (scrollGalleryEvent = hotelVO.getScrollGalleryEvent()) == null || lVar == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, scrollGalleryEvent, null, 2, null);
    }
}
