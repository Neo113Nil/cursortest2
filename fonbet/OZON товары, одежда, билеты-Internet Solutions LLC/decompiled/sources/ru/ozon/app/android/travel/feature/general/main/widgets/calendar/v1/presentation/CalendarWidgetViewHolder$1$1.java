package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class CalendarWidgetViewHolder$1$1 extends C7735q implements Function1<LocalDate, Unit> {
    CalendarWidgetViewHolder$1$1(Object obj) {
        super(1, obj, CalendarViewModel.class, "onDateClicked", "onDateClicked(Lorg/joda/time/LocalDate;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate) {
        invoke2(localDate);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LocalDate p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((CalendarViewModel) this.receiver).onDateClicked(p02);
    }
}
