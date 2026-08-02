package com.braze.support;

import Y3.P;
import android.os.Build;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a?\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010!\u001a\u0011\u0010\u001b\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\"\u001a\u0011\u0010#\u001a\u00020\u0000*\u00020\u000b¢\u0006\u0004\b#\u0010$\"\u001c\u0010&\u001a\n %*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010(\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,\"!\u00104\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"", "nowInSeconds", "()J", "", "nowInSecondsPrecise", "()D", "nowInMilliseconds", "nowInMillisecondsSystemClock", "", "Lcom/braze/enums/BrazeDateFormat;", "dateFormat", "Ljava/util/Date;", "parseDate", "(Ljava/lang/String;Lcom/braze/enums/BrazeDateFormat;)Ljava/util/Date;", "Ljava/util/TimeZone;", "timeZone", "formatDate", "(Ljava/util/Date;Lcom/braze/enums/BrazeDateFormat;Ljava/util/TimeZone;)Ljava/lang/String;", "formatDateNow", "(Lcom/braze/enums/BrazeDateFormat;)Ljava/lang/String;", "", "year", "month", "day", "hours", "minutes", "seconds", "createDate", "(IIIIII)Ljava/util/Date;", "", "validateDateComponents", "(IIIIII)V", "formatDateFromMillis", "(JLcom/braze/enums/BrazeDateFormat;Ljava/util/TimeZone;)Ljava/lang/String;", "(J)Ljava/util/Date;", "getTimeFromEpochInSeconds", "(Ljava/util/Date;)J", "kotlin.jvm.PlatformType", "UTC_TIME_ZONE", "Ljava/util/TimeZone;", "TAG", "Ljava/lang/String;", "", "shouldUseNetworkTimeClock", "Z", "Ljava/time/Clock;", "networkTimeClock$delegate", "Lkotlin/Lazy;", "getNetworkTimeClock", "()Ljava/time/Clock;", "getNetworkTimeClock$annotations", "()V", "networkTimeClock", "android-sdk-base_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DateTimeUtils {
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("DateTimeUtils");
    private static boolean shouldUseNetworkTimeClock = true;
    private static final Lazy networkTimeClock$delegate = LazyKt.lazy(new Function0() { // from class: Y3.Q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Clock a10;
            a10 = N.a();
            return a10;
        }
    });

    public static final Date createDate(int i10, int i11, int i12, int i13, int i14, int i15) {
        validateDateComponents(i10, i11, i12, i13, i14, i15);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        Date time = gregorianCalendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }

    public static /* synthetic */ Date createDate$default(int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            i13 = 0;
        }
        if ((i16 & 16) != 0) {
            i14 = 0;
        }
        if ((i16 & 32) != 0) {
            i15 = 0;
        }
        return createDate(i10, i11, i12, i13, i14, i15);
    }

    public static final String formatDate(Date date, BrazeDateFormat dateFormat, TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static /* synthetic */ String formatDate$default(Date date, BrazeDateFormat brazeDateFormat, TimeZone UTC_TIME_ZONE2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            UTC_TIME_ZONE2 = UTC_TIME_ZONE;
            Intrinsics.checkNotNullExpressionValue(UTC_TIME_ZONE2, "UTC_TIME_ZONE");
        }
        return formatDate(date, brazeDateFormat, UTC_TIME_ZONE2);
    }

    public static final String formatDateFromMillis(long j10, BrazeDateFormat dateFormat, TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        return formatDate(new Date(j10), dateFormat, timeZone);
    }

    public static /* synthetic */ String formatDateFromMillis$default(long j10, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            brazeDateFormat = BrazeDateFormat.ANDROID_LOGCAT;
        }
        if ((i10 & 2) != 0) {
            timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
        }
        return formatDateFromMillis(j10, brazeDateFormat, timeZone);
    }

    public static final String formatDateNow(BrazeDateFormat dateFormat) {
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Date createDate = createDate(nowInSeconds());
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
        return formatDate(createDate, dateFormat, timeZone);
    }

    private static final Clock getNetworkTimeClock() {
        return P.a(networkTimeClock$delegate.getValue());
    }

    public static final long getTimeFromEpochInSeconds(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
    }

    public static final long nowInMilliseconds() {
        long millis;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (Build.VERSION.SDK_INT >= 33 && shouldUseNetworkTimeClock) {
                millis = getNetworkTimeClock().millis();
                if (millis >= 1691768838316L) {
                    return millis;
                }
            }
            return currentTimeMillis;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29469D, (Throwable) e10, false, new Function0() { // from class: Y3.S
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String nowInMilliseconds$lambda$0;
                    nowInMilliseconds$lambda$0 = DateTimeUtils.nowInMilliseconds$lambda$0();
                    return nowInMilliseconds$lambda$0;
                }
            }, 8, (Object) null);
            shouldUseNetworkTimeClock = false;
            return currentTimeMillis;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nowInMilliseconds$lambda$0() {
        return "Error reading date and time from network. Using system time instead.";
    }

    public static final long nowInMillisecondsSystemClock() {
        return System.currentTimeMillis();
    }

    public static final long nowInSeconds() {
        return TimeUnit.MILLISECONDS.toSeconds(nowInMilliseconds());
    }

    public static final double nowInSecondsPrecise() {
        return nowInMilliseconds() / 1000.0d;
    }

    public static final Date parseDate(final String str, BrazeDateFormat dateFormat) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(UTC_TIME_ZONE);
        try {
            Date parse = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(parse);
            return parse;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: Y3.T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String parseDate$lambda$0;
                    parseDate$lambda$0 = DateTimeUtils.parseDate$lambda$0(str);
                    return parseDate$lambda$0;
                }
            }, 8, (Object) null);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseDate$lambda$0(String str) {
        return "Exception parsing date " + str + ". Returning null";
    }

    private static final void validateDateComponents(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Year must be positive, was " + i10).toString());
        }
        if (i11 < 0 || i11 >= 12) {
            throw new IllegalArgumentException(("Month must be between 0 and 11, was " + i11).toString());
        }
        if (i13 < 0 || i13 >= 24) {
            throw new IllegalArgumentException(("Hours must be between 0 and 23, was " + i13).toString());
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException(("Minutes must be between 0 and 59, was " + i14).toString());
        }
        if (i15 < 0 || i15 >= 60) {
            throw new IllegalArgumentException(("Seconds must be between 0 and 59, was " + i15).toString());
        }
        if (i12 < 1) {
            throw new IllegalArgumentException(("Day must be at least 1, was " + i12).toString());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i10, i11, 1);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        int actualMaximum = gregorianCalendar.getActualMaximum(5);
        if (i12 <= actualMaximum) {
            return;
        }
        throw new IllegalArgumentException(("Day must not exceed " + actualMaximum + " for month " + i11 + " of year " + i10 + ", was " + i12).toString());
    }

    public static final Date createDate(long j10) {
        return new Date(j10 * 1000);
    }
}
