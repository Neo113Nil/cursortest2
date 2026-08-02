package ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation.noUi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation.ModalCheckoutTimeLimitViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class ModalCheckoutTimeLimitNoUiWidgetViewHolder$startTimer$2 extends C7735q implements Function1<Long, Unit> {
    ModalCheckoutTimeLimitNoUiWidgetViewHolder$startTimer$2(Object obj) {
        super(1, obj, ModalCheckoutTimeLimitViewModel.class, "onTimerTick", "onTimerTick(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((ModalCheckoutTimeLimitViewModel) this.receiver).onTimerTick(j11);
    }
}
