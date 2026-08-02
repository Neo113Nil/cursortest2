package ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation;

import Bk.C2638a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import ru.ozon.app.android.utils.DateUtilsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/TickVO;", "", "millis", "", "<init>", "(J)V", "isFinished", "", "()Z", "days", "", "getDays", "()I", "hours", "", "getHours", "()Ljava/lang/String;", "minutes", "getMinutes", "seconds", "getSeconds", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TickVO {
    private final int days;

    @NotNull
    private final String hours;
    private final boolean isFinished;

    @NotNull
    private final String minutes;

    @NotNull
    private final String seconds;

    public TickVO(long j11) {
        Period period = new Period(C2638a.a(), j11, PeriodType.m());
        this.isFinished = (period.C() * 604800) + ((period.s() * 86400) + ((period.u() * 3600) + ((period.y() * 60) + period.B()))) <= 0;
        this.days = (int) Math.ceil((r7 + 1) / 86400.0f);
        this.hours = DateUtilsKt.toTwoDigitString(period.u());
        this.minutes = DateUtilsKt.toTwoDigitString(period.y());
        this.seconds = DateUtilsKt.toTwoDigitString(period.B());
    }

    public final int getDays() {
        return this.days;
    }

    @NotNull
    public final String getHours() {
        return this.hours;
    }

    @NotNull
    public final String getMinutes() {
        return this.minutes;
    }

    @NotNull
    public final String getSeconds() {
        return this.seconds;
    }

    /* renamed from: isFinished, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }
}
