package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer;

import Bk.C2638a;
import kotlin.Metadata;
import org.joda.time.Period;
import org.joda.time.PeriodType;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/timer/TimerTick;", "", "timeStampEnd", "", "<init>", "(J)V", "isFinished", "", "()Z", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TimerTick {
    private final boolean isFinished;

    public TimerTick(long j11) {
        Period period = new Period(C2638a.a(), j11, PeriodType.m());
        this.isFinished = period.s() + (period.B() + (period.y() + period.u())) <= 0;
    }

    /* renamed from: isFinished, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }
}
