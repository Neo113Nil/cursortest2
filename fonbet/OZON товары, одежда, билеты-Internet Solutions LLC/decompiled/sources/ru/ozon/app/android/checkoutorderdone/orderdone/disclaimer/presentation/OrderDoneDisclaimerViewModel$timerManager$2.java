package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OrderDoneDisclaimerViewModel$timerManager$2 extends C7735q implements Function0<Unit> {
    OrderDoneDisclaimerViewModel$timerManager$2(Object obj) {
        super(0, obj, OrderDoneDisclaimerViewModel.class, "onTimerComplete", "onTimerComplete()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OrderDoneDisclaimerViewModel) this.receiver).onTimerComplete();
    }
}
