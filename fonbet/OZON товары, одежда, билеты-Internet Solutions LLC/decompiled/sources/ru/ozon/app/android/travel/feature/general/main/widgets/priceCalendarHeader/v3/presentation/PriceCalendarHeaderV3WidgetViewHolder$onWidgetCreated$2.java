package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "selection", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel$SelectionModel;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel$SelectionModel;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceCalendarHeaderV3WidgetViewHolder$onWidgetCreated$2 extends AbstractC7737t implements Function1<CalendarViewModel.SelectionModel, Unit> {
    final /* synthetic */ PriceCalendarHeaderV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCalendarHeaderV3WidgetViewHolder$onWidgetCreated$2(PriceCalendarHeaderV3WidgetViewHolder priceCalendarHeaderV3WidgetViewHolder) {
        super(1);
        this.this$0 = priceCalendarHeaderV3WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CalendarViewModel.SelectionModel selectionModel) {
        invoke2(selectionModel);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CalendarViewModel.SelectionModel selectionModel) {
        String asyncData;
        PriceCalendarHeaderV3WidgetViewModel priceCalendarHeaderV3WidgetViewModel;
        PriceCalendarHeaderV3VO priceCalendarHeaderV3VO = (PriceCalendarHeaderV3VO) this.this$0.getBoundData();
        if (priceCalendarHeaderV3VO == null || (asyncData = priceCalendarHeaderV3VO.getAsyncData()) == null) {
            return;
        }
        priceCalendarHeaderV3WidgetViewModel = this.this$0.widgetViewModel;
        priceCalendarHeaderV3WidgetViewModel.fetchWidgetWithNewDates(asyncData, selectionModel.getStartDate(), selectionModel.getEndDate());
    }
}
