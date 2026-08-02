package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.view.PriceCalendarFooterV3View;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "selection", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel$SelectionModel;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel$SelectionModel;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceCalendarFooterV3WidgetViewHolder$onWidgetCreated$1 extends AbstractC7737t implements Function1<CalendarViewModel.SelectionModel, Unit> {
    final /* synthetic */ PriceCalendarFooterV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCalendarFooterV3WidgetViewHolder$onWidgetCreated$1(PriceCalendarFooterV3WidgetViewHolder priceCalendarFooterV3WidgetViewHolder) {
        super(1);
        this.this$0 = priceCalendarFooterV3WidgetViewHolder;
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
        PriceCalendarFooterV3View priceCalendarView;
        PriceCalendarFooterV3WidgetViewModel priceCalendarFooterV3WidgetViewModel;
        PriceCalendarFooterV3VO priceCalendarFooterV3VO = (PriceCalendarFooterV3VO) this.this$0.getBoundData();
        if (priceCalendarFooterV3VO == null || (asyncData = priceCalendarFooterV3VO.getAsyncData()) == null) {
            return;
        }
        PriceCalendarFooterV3WidgetViewHolder priceCalendarFooterV3WidgetViewHolder = this.this$0;
        priceCalendarView = priceCalendarFooterV3WidgetViewHolder.getPriceCalendarView();
        if (priceCalendarView != null) {
            priceCalendarView.showLoader();
        }
        priceCalendarFooterV3WidgetViewModel = priceCalendarFooterV3WidgetViewHolder.widgetViewModel;
        priceCalendarFooterV3WidgetViewModel.fetchWidgetWithNewDates(asyncData, selectionModel.getStartDate(), selectionModel.getEndDate());
    }
}
