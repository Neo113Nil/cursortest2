package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class CalendarWidgetViewHolder$1$4 extends C7735q implements Function1<Boolean, Unit> {
    CalendarWidgetViewHolder$1$4(Object obj) {
        super(1, obj, CalendarViewModel.class, "onTripTypeSwitched", "onTripTypeSwitched(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ((CalendarViewModel) this.receiver).onTripTypeSwitched(z11);
    }
}
