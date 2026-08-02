package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.data.TravelScrollPriceCalendarMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TravelScrollPriceCalendarComponent$Companion$create$1$1$widgetViewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<TravelScrollPriceCalendarViewModel>> {
    final /* synthetic */ TravelScrollPriceCalendarComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelScrollPriceCalendarComponent$Companion$create$1$1$widgetViewModelProvider$2(TravelScrollPriceCalendarComponent$Companion$create$1$1 travelScrollPriceCalendarComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = travelScrollPriceCalendarComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TravelScrollPriceCalendarViewModel invoke$lambda$0(TravelScrollPriceCalendarComponent$Companion$create$1$1 travelScrollPriceCalendarComponent$Companion$create$1$1) {
        ActionComponentApi actionComponentApi;
        TravelScrollPriceCalendarMapper mapper = travelScrollPriceCalendarComponent$Companion$create$1$1.getMapper();
        actionComponentApi = travelScrollPriceCalendarComponent$Companion$create$1$1.actionComponentApi;
        return new TravelScrollPriceCalendarViewModel(actionComponentApi.getActionRepository(), mapper);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<TravelScrollPriceCalendarViewModel> invoke() {
        final TravelScrollPriceCalendarComponent$Companion$create$1$1 travelScrollPriceCalendarComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.di.a
            @Override // Pc.a
            public final Object get() {
                TravelScrollPriceCalendarViewModel invoke$lambda$0;
                invoke$lambda$0 = TravelScrollPriceCalendarComponent$Companion$create$1$1$widgetViewModelProvider$2.invoke$lambda$0(TravelScrollPriceCalendarComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
