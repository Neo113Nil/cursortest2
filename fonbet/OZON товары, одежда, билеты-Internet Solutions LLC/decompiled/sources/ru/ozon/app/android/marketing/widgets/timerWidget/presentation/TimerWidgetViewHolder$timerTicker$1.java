package ru.ozon.app.android.marketing.widgets.timerWidget.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class TimerWidgetViewHolder$timerTicker$1 extends C7735q implements Function1<Long, TimerWidgetTickVO> {
    public static final TimerWidgetViewHolder$timerTicker$1 INSTANCE = new TimerWidgetViewHolder$timerTicker$1();

    TimerWidgetViewHolder$timerTicker$1() {
        super(1, TimerWidgetTickVO.class, "<init>", "<init>(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TimerWidgetTickVO invoke(Long l11) {
        return invoke(l11.longValue());
    }

    public final TimerWidgetTickVO invoke(long j11) {
        return new TimerWidgetTickVO(j11);
    }
}
