package com.braze.support;

import com.braze.Constants;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a>\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bH\u0007\u001a\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0006\u0010\u0012\u001a\u00020\u0001\u001a\u0006\u0010\u0013\u001a\u00020\u0001\u001a\u0006\u0010\u0014\u001a\u00020\u0015\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0001\u001a\u001e\u0010\u0016\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0003H\u0007\u001a\n\u0010\u0018\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0019\u001a\u00020\u001a*\u00020\u000f\u001a\u0012\u0010\u001b\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"MSECS_IN_SEC", "", "UTC_TIME_ZONE", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "createDate", "Ljava/util/Date;", "year", "", "month", "day", "hours", "minutes", "seconds", "formatDateNow", "", "dateFormat", "Lcom/braze/enums/BrazeDateFormat;", "nowInMilliseconds", "nowInSeconds", "nowInSecondsPrecise", "", "formatDate", "timeZone", "getTimeFromEpochInSeconds", "isValidTimeZone", "", "parseDate", "android-sdk-base_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DateTimeUtils {
    private static final long MSECS_IN_SEC = 1000;
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception parsing date " + this.b + ". Returning null";
        }
    }

    public static final Date createDate(int i, int i2, int i3) {
        return createDate$default(i, i2, i3, 0, 0, 0, 56, null);
    }

    public static final Date createDate(int i, int i2, int i3, int i4) {
        return createDate$default(i, i2, i3, i4, 0, 0, 48, null);
    }

    public static final Date createDate(int i, int i2, int i3, int i4, int i5) {
        return createDate$default(i, i2, i3, i4, i5, 0, 32, null);
    }

    public static final Date createDate(int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        Date time = gregorianCalendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        return time;
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

    public static final String formatDate(Date date, BrazeDateFormat dateFormat, TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "simpleDateFormat.format(this)");
        return format;
    }

    public static /* synthetic */ String formatDate$default(Date date, BrazeDateFormat brazeDateFormat, TimeZone UTC_TIME_ZONE2, int i, Object obj) {
        if ((i & 2) != 0) {
            UTC_TIME_ZONE2 = UTC_TIME_ZONE;
            Intrinsics.checkNotNullExpressionValue(UTC_TIME_ZONE2, "UTC_TIME_ZONE");
        }
        return formatDate(date, brazeDateFormat, UTC_TIME_ZONE2);
    }

    public static final String formatDateNow(BrazeDateFormat dateFormat) {
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        Date createDate = createDate(nowInSeconds());
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        return formatDate(createDate, dateFormat, timeZone);
    }

    public static final long getTimeFromEpochInSeconds(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
    }

    public static final boolean isValidTimeZone(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String[] availableIDs = TimeZone.getAvailableIDs();
        Intrinsics.checkNotNullExpressionValue(availableIDs, "getAvailableIDs()");
        return ArraysKt.contains(availableIDs, str);
    }

    public static final long nowInMilliseconds() {
        return System.currentTimeMillis();
    }

    public static final long nowInSeconds() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public static final double nowInSecondsPrecise() {
        return System.currentTimeMillis() / 1000.0d;
    }

    public static final Date parseDate(String str, BrazeDateFormat dateFormat) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(UTC_TIME_ZONE);
        try {
            Date parse = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(parse);
            return parse;
        } catch (Exception e) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            brazeLogger.brazelog(brazeLogger.getBrazeLogTag("DateTimeUtils"), BrazeLogger.Priority.E, (Throwable) e, (Function0<String>) new a(str));
            throw e;
        }
    }

    public static final Date createDate(long j) {
        return new Date(j * 1000);
    }
}
