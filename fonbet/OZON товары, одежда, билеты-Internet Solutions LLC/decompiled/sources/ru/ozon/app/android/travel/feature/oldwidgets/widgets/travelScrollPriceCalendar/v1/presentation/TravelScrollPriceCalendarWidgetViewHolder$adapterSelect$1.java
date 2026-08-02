package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class TravelScrollPriceCalendarWidgetViewHolder$adapterSelect$1 extends C7735q implements Function2<Map<String, ? extends TokenizedTrackingInfo>, String, Unit> {
    TravelScrollPriceCalendarWidgetViewHolder$adapterSelect$1(Object obj) {
        super(2, obj, TravelScrollPriceCalendarWidgetViewHolder.class, "trackAnalytics", "trackAnalytics(Ljava/util/Map;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends TokenizedTrackingInfo> map, String str) {
        invoke2((Map<String, TokenizedTrackingInfo>) map, str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, TokenizedTrackingInfo> map, String str) {
        ((TravelScrollPriceCalendarWidgetViewHolder) this.receiver).trackAnalytics(map, str);
    }
}
