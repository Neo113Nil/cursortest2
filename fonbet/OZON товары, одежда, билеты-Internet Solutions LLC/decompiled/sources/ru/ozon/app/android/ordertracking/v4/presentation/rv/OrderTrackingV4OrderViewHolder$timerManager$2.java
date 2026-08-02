package ru.ozon.app.android.ordertracking.v4.presentation.rv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OrderTrackingV4OrderViewHolder$timerManager$2 extends C7735q implements Function0<Unit> {
    OrderTrackingV4OrderViewHolder$timerManager$2(Object obj) {
        super(0, obj, OrderTrackingV4OrderViewHolder.class, "onTimerComplete", "onTimerComplete()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OrderTrackingV4OrderViewHolder) this.receiver).onTimerComplete();
    }
}
