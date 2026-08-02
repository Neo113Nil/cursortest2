package ru.ozon.app.android.travel.utils.extensions;

import Ej.b;
import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\n*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\n*\u00020\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000f\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\r¨\u0006\u0010"}, d2 = {"isMonday", "", "Lorg/joda/time/LocalDate;", "isSunday", "isLastMonthDay", "isFirsMonthDay", "isSameDay", "that", "isWeekend", "toFormattedTime", "", "", "toTwoDigitString", "", "toTimestamp", "(Ljava/lang/Integer;)Ljava/lang/Long;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DateExtensionsKt {
    public static final boolean isFirsMonthDay(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.i() == 1;
    }

    public static final boolean isLastMonthDay(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.i() == localDate.g().f();
    }

    public static final boolean isMonday(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.j() == 1;
    }

    public static final boolean isSameDay(@NotNull LocalDate localDate, @NotNull LocalDate that) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(that, "that");
        return localDate.s() == that.s() && localDate.l() == that.l();
    }

    public static final boolean isSunday(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.j() == 7;
    }

    public static final boolean isWeekend(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        int j11 = localDate.j();
        return j11 == 6 || j11 == 7;
    }

    @NotNull
    public static final String toFormattedTime(long j11) {
        Duration a11 = Duration.a(j11);
        a11.getClass();
        Period period = new Period(a11.getMillis());
        String twoDigitString = toTwoDigitString(period.B());
        String twoDigitString2 = toTwoDigitString(period.y());
        return toTwoDigitString((period.s() * 24) + period.u()) + ProductContainerDTO.RATIO_DELIMITER + twoDigitString2 + ProductContainerDTO.RATIO_DELIMITER + twoDigitString;
    }

    public static final Long toTimestamp(Integer num) {
        if (num != null) {
            return Long.valueOf(toTimestamp(num.intValue()));
        }
        return null;
    }

    @NotNull
    public static final String toTwoDigitString(int i11) {
        return (i11 < 0 || i11 >= 10) ? i11 < 0 ? "00" : String.valueOf(i11) : b.a(i11, "0");
    }

    public static final long toTimestamp(int i11) {
        return (i11 * 1000) + SystemClock.elapsedRealtime();
    }
}
