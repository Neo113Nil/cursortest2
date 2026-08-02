package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class CalendarWidgetViewHolder$1$2 extends C7735q implements Function0<Unit> {
    CalendarWidgetViewHolder$1$2(Object obj) {
        super(0, obj, CalendarViewModel.class, "onReadyButtonClicked", "onReadyButtonClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CalendarViewModel) this.receiver).onReadyButtonClicked();
    }
}
