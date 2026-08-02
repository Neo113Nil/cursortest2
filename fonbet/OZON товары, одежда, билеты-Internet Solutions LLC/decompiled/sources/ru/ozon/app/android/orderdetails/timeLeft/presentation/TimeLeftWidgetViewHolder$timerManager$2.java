package ru.ozon.app.android.orderdetails.timeLeft.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class TimeLeftWidgetViewHolder$timerManager$2 extends C7735q implements Function0<Unit> {
    TimeLeftWidgetViewHolder$timerManager$2(Object obj) {
        super(0, obj, TimeLeftWidgetViewHolder.class, "onTimerComplete", "onTimerComplete()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((TimeLeftWidgetViewHolder) this.receiver).onTimerComplete();
    }
}
