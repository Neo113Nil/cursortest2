package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceCalendarHeaderV3WidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ PriceCalendarHeaderV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCalendarHeaderV3WidgetViewHolder$actionHandler$1(PriceCalendarHeaderV3WidgetViewHolder priceCalendarHeaderV3WidgetViewHolder) {
        super(1);
        this.this$0 = priceCalendarHeaderV3WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click atomAction) {
        CalendarViewModel calendarViewModel;
        i iVar;
        CalendarViewModel calendarViewModel2;
        i iVar2;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        String id2 = atomAction.getId();
        if (Intrinsics.d(id2, "resetDates")) {
            calendarViewModel2 = this.this$0.calendarViewModel;
            iVar2 = this.this$0.container;
            Context L11 = iVar2.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            calendarViewModel2.onResetCalendarClicked(L11);
            return;
        }
        if (Intrinsics.d(id2, "resetReturnDate")) {
            calendarViewModel = this.this$0.calendarViewModel;
            iVar = this.this$0.container;
            Context L12 = iVar.L();
            Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
            calendarViewModel.onResetBackDateClicked(L12);
        }
    }
}
