package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class HotelsCheckoutTitleWidgetViewHolder$startTimer$4 extends C7735q implements Function1<Long, Unit> {
    HotelsCheckoutTitleWidgetViewHolder$startTimer$4(Object obj) {
        super(1, obj, HotelsCheckoutTitleWidgetViewHolder.class, "updateTimer", "updateTimer(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((HotelsCheckoutTitleWidgetViewHolder) this.receiver).updateTimer(j11);
    }
}
