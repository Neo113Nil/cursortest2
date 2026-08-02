package ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation;

import Bk.C2638a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import ru.ozon.app.android.utils.DateUtilsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPTickVO;", "", "timeStampEnd", "", "<init>", "(J)V", "isFinished", "", "()Z", "days", "", "getDays", "()I", "hours", "", "getHours", "()Ljava/lang/String;", "minutes", "getMinutes", "seconds", "getSeconds", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BigPromoPDPTickVO {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int days;

    @NotNull
    private final String hours;
    private final boolean isFinished;

    @NotNull
    private final String minutes;

    @NotNull
    private final String seconds;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPTickVO$Companion;", "", "<init>", "()V", "HOURS_IN_DAY", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BigPromoPDPTickVO(long j11) {
        Period period = new Period(C2638a.a(), j11, PeriodType.m());
        this.days = period.u() / 24;
        this.isFinished = period.s() + (period.B() + (period.y() + period.u())) <= 0;
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
