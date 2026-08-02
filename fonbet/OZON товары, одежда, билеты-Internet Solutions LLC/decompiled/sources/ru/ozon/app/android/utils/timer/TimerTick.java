package ru.ozon.app.android.utils.timer;

import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import ru.ozon.app.android.delivery.utils.R$plurals;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0006\u001a\u00020\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/utils/timer/TimerTick;", "", "millis", "", "<init>", "(J)V", "days", "", "getDays", "()I", "hours", "getHours", "hoursString", "", "minutesString", "secondsString", "timeWithHours", "time", "Companion", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerTick {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int days;
    private final int hours;

    @NotNull
    private final String hoursString;

    @NotNull
    private final String minutesString;

    @NotNull
    private final String secondsString;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/utils/timer/TimerTick$Companion;", "", "<init>", "()V", "ONE_DAY_HOURS", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TimerTick(long j11) {
        Period period = new Period(j11);
        this.days = (int) (((period.C() * 604800) + ((period.s() * 86400) + ((period.u() * 3600) + ((period.y() * 60) + period.B())))) / 86400.0f);
        this.hours = period.u();
        this.hoursString = TimerUtilsKt.toTwoDigitString(period.u());
        this.minutesString = TimerUtilsKt.toTwoDigitString(period.y());
        this.secondsString = TimerUtilsKt.toTwoDigitString(period.B());
    }

    @NotNull
    public final String days() {
        int i11 = this.hours / 24;
        return StringProvider.getQuantityString(R$plurals.timer_plural_days, i11, Integer.valueOf(i11));
    }

    public final int getDays() {
        return this.days;
    }

    public final int getHours() {
        return this.hours;
    }

    @NotNull
    public final String time() {
        return g.c(this.minutesString, ProductContainerDTO.RATIO_DELIMITER, this.secondsString);
    }

    @NotNull
    public final String timeWithHours() {
        return this.hoursString + ProductContainerDTO.RATIO_DELIMITER + this.minutesString + ProductContainerDTO.RATIO_DELIMITER + this.secondsString;
    }
}
