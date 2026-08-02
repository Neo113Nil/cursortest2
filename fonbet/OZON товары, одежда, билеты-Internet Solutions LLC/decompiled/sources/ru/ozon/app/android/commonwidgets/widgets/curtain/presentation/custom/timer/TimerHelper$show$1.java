package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class TimerHelper$show$1 extends C7735q implements Function1<Long, TimerTick> {
    public static final TimerHelper$show$1 INSTANCE = new TimerHelper$show$1();

    TimerHelper$show$1() {
        super(1, TimerTick.class, "<init>", "<init>(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TimerTick invoke(Long l11) {
        return invoke(l11.longValue());
    }

    public final TimerTick invoke(long j11) {
        return new TimerTick(j11);
    }
}
