package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class PriceCalendarFooterV3Component$Companion$create$1$1$calendarViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<CalendarViewModel>> {
    public static final PriceCalendarFooterV3Component$Companion$create$1$1$calendarViewModelProvider$2 INSTANCE = new PriceCalendarFooterV3Component$Companion$create$1$1$calendarViewModelProvider$2();

    PriceCalendarFooterV3Component$Companion$create$1$1$calendarViewModelProvider$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CalendarViewModel invoke$lambda$0() {
        return new CalendarViewModel();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<CalendarViewModel> invoke() {
        return new a();
    }
}
