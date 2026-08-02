package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation.PriceCalendarFooterViewModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "newCalendarVO", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceCalendarFooterWidgetViewHolder$observeAction$1 extends AbstractC7737t implements Function1<CalendarVO, Unit> {
    final /* synthetic */ PriceCalendarFooterWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCalendarFooterWidgetViewHolder$observeAction$1(PriceCalendarFooterWidgetViewHolder priceCalendarFooterWidgetViewHolder) {
        super(1);
        this.this$0 = priceCalendarFooterWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CalendarVO calendarVO) {
        invoke2(calendarVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CalendarVO calendarVO) {
        PriceCalendarFooterViewModel priceCalendarFooterViewModel;
        PriceCalendarFooterVO vo;
        AtomActionDTO updateWidgetState;
        PriceCalendarFooterViewModel priceCalendarFooterViewModel2;
        priceCalendarFooterViewModel = this.this$0.footerViewModel;
        PriceCalendarFooterViewModel.UpdateVoResult value = priceCalendarFooterViewModel.updateVoLiveData().getValue();
        if (value == null || (vo = value.getVo()) == null || (updateWidgetState = vo.getUpdateWidgetState()) == null) {
            return;
        }
        priceCalendarFooterViewModel2 = this.this$0.footerViewModel;
        Intrinsics.f(calendarVO);
        priceCalendarFooterViewModel2.performUpdateStateRequest(updateWidgetState, calendarVO);
    }
}
