package ru.ozon.app.android.travel.calendar.view;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarVO;
import ru.ozon.app.android.travel.calendar.view.vo.Indicator;
import ru.ozon.app.android.travel.calendar.view.vo.IndicatorColor;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/travel/calendar/view/vo/Indicator$ColorIndicator;", "Lru/ozon/app/android/travel/calendar/view/vo/IndicatorColor;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CalendarView$calendarAdapter$2 extends AbstractC7737t implements Function0<Map<Indicator.ColorIndicator, ? extends IndicatorColor>> {
    final /* synthetic */ CalendarView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CalendarView$calendarAdapter$2(CalendarView calendarView) {
        super(0);
        this.this$0 = calendarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Indicator.ColorIndicator, ? extends IndicatorColor> invoke() {
        CalendarVO calendarVO;
        calendarVO = this.this$0.boundedData;
        Map<Indicator.ColorIndicator, IndicatorColor> indicatorsColors = calendarVO != null ? calendarVO.getIndicatorsColors() : null;
        return indicatorsColors == null ? U.c() : indicatorsColors;
    }
}
