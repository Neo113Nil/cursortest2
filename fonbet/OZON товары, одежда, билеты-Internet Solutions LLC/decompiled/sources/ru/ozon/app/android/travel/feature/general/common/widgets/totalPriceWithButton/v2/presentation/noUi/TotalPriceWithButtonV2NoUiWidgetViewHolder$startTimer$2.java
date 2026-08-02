package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.noUi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2ViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class TotalPriceWithButtonV2NoUiWidgetViewHolder$startTimer$2 extends C7735q implements Function1<Long, Unit> {
    TotalPriceWithButtonV2NoUiWidgetViewHolder$startTimer$2(Object obj) {
        super(1, obj, TotalPriceWithButtonV2ViewModel.class, "onTimerTick", "onTimerTick(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((TotalPriceWithButtonV2ViewModel) this.receiver).onTimerTick(j11);
    }
}
