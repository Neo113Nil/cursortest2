package ru.ozon.app.android.marketing.widgets.timerWidget.presentation;

import Bk.C2638a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import ru.ozon.app.android.utils.DateUtilsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/timerWidget/presentation/TimerWidgetTickVO;", "", "", "millis", "<init>", "(J)V", "", "isFinished", "Z", "()Z", "", "days", "I", "getDays", "()I", "", "hours", "Ljava/lang/String;", "getHours", "()Ljava/lang/String;", "hoursWithDays", "getHoursWithDays", "minutes", "getMinutes", "seconds", "getSeconds", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimerWidgetTickVO {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int days;

    @NotNull
    private final String hours;

    @NotNull
    private final String hoursWithDays;
    private final boolean isFinished;

    @NotNull
    private final String minutes;

    @NotNull
    private final String seconds;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/timerWidget/presentation/TimerWidgetTickVO$Companion;", "", "<init>", "()V", "MILLIS_GAP", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TimerWidgetTickVO(long j11) {
        Period period = new Period(C2638a.a(), 500 + j11, PeriodType.m());
        this.isFinished = (period.C() * 604800) + ((period.s() * 86400) + ((period.u() * 3600) + ((period.y() * 60) + period.B()))) <= 0;
        int ceil = (int) Math.ceil((r7 + 1) / 86400.0f);
        this.days = ceil;
        this.hours = DateUtilsKt.toTwoDigitString(period.u());
        this.hoursWithDays = DateUtilsKt.toTwoDigitString(period.u() + ((ceil - 1) * 24));
        this.minutes = DateUtilsKt.toTwoDigitString(period.y());
        this.seconds = DateUtilsKt.toTwoDigitString(period.B());
    }

    @NotNull
    public final String getHoursWithDays() {
        return this.hoursWithDays;
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
