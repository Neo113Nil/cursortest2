package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class DeliveryWidgetV4View$applyValueState$1 extends C7735q implements Function0<Unit> {
    DeliveryWidgetV4View$applyValueState$1(Object obj) {
        super(0, obj, DeliveryWidgetV4View.class, "onProgressAnimationFinished", "onProgressAnimationFinished()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((DeliveryWidgetV4View) this.receiver).onProgressAnimationFinished();
    }
}
