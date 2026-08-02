package com.braze.support;

import android.os.Build;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.sentry.metrics.MetricsUnit;
import j$.time.Clock;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\b\t\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001d\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010\u001b\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001f\u001a\u0011\u0010 \u001a\u00020\u0000*\u00020\u000b¢\u0006\u0004\b \u0010!\u001a\u0011\u0010#\u001a\u00020\"*\u00020\b¢\u0006\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&\"\u001c\u0010)\u001a\n (*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0016\u0010-\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.\"!\u00106\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"", "nowInSeconds", "()J", "", "nowInSecondsPrecise", "()D", "nowInMilliseconds", "nowInMillisecondsSystemClock", "", "Lcom/braze/enums/BrazeDateFormat;", "dateFormat", "Ljava/util/Date;", "parseDate", "(Ljava/lang/String;Lcom/braze/enums/BrazeDateFormat;)Ljava/util/Date;", "Ljava/util/TimeZone;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "formatDate", "(Ljava/util/Date;Lcom/braze/enums/BrazeDateFormat;Ljava/util/TimeZone;)Ljava/lang/String;", "formatDateNow", "(Lcom/braze/enums/BrazeDateFormat;)Ljava/lang/String;", "", "year", "month", MetricsUnit.Duration.DAY, "hours", "minutes", "seconds", "createDate", "(IIIIII)Ljava/util/Date;", "formatDateFromMillis", "(JLcom/braze/enums/BrazeDateFormat;Ljava/util/TimeZone;)Ljava/lang/String;", "(J)Ljava/util/Date;", "getTimeFromEpochInSeconds", "(Ljava/util/Date;)J", "", "isValidTimeZone", "(Ljava/lang/String;)Z", "MSECS_IN_SEC", "J", "MINIMUM_NETWORK_TIME", "kotlin.jvm.PlatformType", "UTC_TIME_ZONE", "Ljava/util/TimeZone;", "TAG", "Ljava/lang/String;", "shouldUseNetworkTimeClock", "Z", "j$/time/Clock", "networkTimeClock$delegate", "Lkotlin/Lazy;", "getNetworkTimeClock", "()Lj$/time/Clock;", "getNetworkTimeClock$annotations", "()V", "networkTimeClock", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateTimeUtils {
    private static final long MINIMUM_NETWORK_TIME = 1691768838316L;
    private static final long MSECS_IN_SEC = 1000;
    private static final TimeZone UTC_TIME_ZONE = DesugarTimeZone.getTimeZone("UTC");
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("DateTimeUtils");
    private static boolean shouldUseNetworkTimeClock = true;
    private static final Lazy networkTimeClock$delegate = LazyKt.lazy(new Function0() { // from class: com.braze.support.DateTimeUtils$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Clock m;
            m = DateTimeUtils$$ExternalSyntheticAPIConversion0.m();
            return m;
        }
    });

    public static final Date createDate(int i, int i2, int i3) {
        return createDate$default(i, i2, i3, 0, 0, 0, 56, null);
    }

    public static /* synthetic */ Date createDate$default(int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            i4 = 0;
        }
        if ((i7 & 16) != 0) {
            i5 = 0;
        }
        if ((i7 & 32) != 0) {
            i6 = 0;
        }
        return createDate(i, i2, i3, i4, i5, i6);
    }

    public static final String formatDate(Date date, BrazeDateFormat dateFormat) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        return formatDate$default(date, dateFormat, null, 2, null);
    }

    public static /* synthetic */ String formatDate$default(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = UTC_TIME_ZONE;
        }
        return formatDate(date, brazeDateFormat, timeZone);
    }

    public static final String formatDateFromMillis(long j, BrazeDateFormat dateFormat, TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        return formatDate(new Date(j), dateFormat, timeZone);
    }

    public static /* synthetic */ String formatDateFromMillis$default(long j, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            brazeDateFormat = BrazeDateFormat.ANDROID_LOGCAT;
        }
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return formatDateFromMillis(j, brazeDateFormat, timeZone);
    }

    public static final String formatDateNow(BrazeDateFormat dateFormat) {
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Date createDate = createDate(nowInSeconds());
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
        return formatDate(createDate, dateFormat, timeZone);
    }

    private static final Clock getNetworkTimeClock() {
        return (Clock) networkTimeClock$delegate.getValue();
    }

    private static /* synthetic */ void getNetworkTimeClock$annotations() {
    }

    public static final long getTimeFromEpochInSeconds(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
    }

    public static final boolean isValidTimeZone(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String[] availableIDs = TimeZone.getAvailableIDs();
        Intrinsics.checkNotNullExpressionValue(availableIDs, "getAvailableIDs(...)");
        return ArraysKt.contains(availableIDs, str);
    }

    public static final long nowInMilliseconds() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (Build.VERSION.SDK_INT >= 33 && shouldUseNetworkTimeClock) {
                long millis = getNetworkTimeClock().millis();
                if (millis >= MINIMUM_NETWORK_TIME) {
                    return millis;
                }
            }
            return currentTimeMillis;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) e, false, new Function0() { // from class: com.braze.support.DateTimeUtils$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String nowInMilliseconds$lambda$1;
                    nowInMilliseconds$lambda$1 = DateTimeUtils.nowInMilliseconds$lambda$1();
                    return nowInMilliseconds$lambda$1;
                }
            }, 8, (Object) null);
            shouldUseNetworkTimeClock = false;
            return currentTimeMillis;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nowInMilliseconds$lambda$1() {
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
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.support.DateTimeUtils$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String parseDate$lambda$2;
                    parseDate$lambda$2 = DateTimeUtils.parseDate$lambda$2(str);
                    return parseDate$lambda$2;
                }
            }, 8, (Object) null);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseDate$lambda$2(String str) {
        return "Exception parsing date " + str + ". Returning null";
    }

    public static final Date createDate(int i, int i2, int i3, int i4) {
        return createDate$default(i, i2, i3, i4, 0, 0, 48, null);
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

    public static final Date createDate(int i, int i2, int i3, int i4, int i5) {
        return createDate$default(i, i2, i3, i4, i5, 0, 32, null);
    }

    public static final Date createDate(int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        Date time = gregorianCalendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }

    public static final Date createDate(long j) {
        return new Date(j * 1000);
    }
}
