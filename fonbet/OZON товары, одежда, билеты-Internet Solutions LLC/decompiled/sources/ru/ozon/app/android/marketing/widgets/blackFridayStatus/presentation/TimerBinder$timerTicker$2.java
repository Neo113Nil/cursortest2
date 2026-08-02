package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.TickVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class TimerBinder$timerTicker$2 extends C7735q implements Function1<TickVO, Unit> {
    TimerBinder$timerTicker$2(Object obj) {
        super(1, obj, TimerBinder.class, "onTick", "onTick(Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TickVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TickVO tickVO) {
        invoke2(tickVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TickVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TimerBinder) this.receiver).onTick(p02);
    }
}
