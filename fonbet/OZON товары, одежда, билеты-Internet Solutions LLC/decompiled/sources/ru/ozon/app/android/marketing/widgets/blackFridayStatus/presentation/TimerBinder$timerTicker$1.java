package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model.TickVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class TimerBinder$timerTicker$1 extends C7735q implements Function1<Long, TickVO> {
    public static final TimerBinder$timerTicker$1 INSTANCE = new TimerBinder$timerTicker$1();

    TimerBinder$timerTicker$1() {
        super(1, TickVO.class, "<init>", "<init>(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TickVO invoke(Long l11) {
        return invoke(l11.longValue());
    }

    public final TickVO invoke(long j11) {
        return new TickVO(j11);
    }
}
