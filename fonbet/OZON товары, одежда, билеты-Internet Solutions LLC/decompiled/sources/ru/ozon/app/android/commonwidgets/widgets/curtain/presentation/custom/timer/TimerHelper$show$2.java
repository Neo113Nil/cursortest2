package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class TimerHelper$show$2 extends C7735q implements Function1<TimerTick, Unit> {
    TimerHelper$show$2(Object obj) {
        super(1, obj, TimerHelper.class, "onTick", "onTick(Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/timer/TimerTick;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TimerTick timerTick) {
        invoke2(timerTick);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TimerTick p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TimerHelper) this.receiver).onTick(p02);
    }
}
