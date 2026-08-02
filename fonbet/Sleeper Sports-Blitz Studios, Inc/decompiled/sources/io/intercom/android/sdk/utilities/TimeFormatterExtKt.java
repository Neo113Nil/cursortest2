package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.os.Build;
import android.text.format.DateFormat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.intercom.android.sdk.R;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TimeFormatterExt.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a\u001d\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"", "Landroid/content/Context;", "context", "", "formattedDateFromLong", "(JLandroid/content/Context;)Ljava/lang/String;", "formattedDateForDayDivider", "toISOFormat", "(J)Ljava/lang/String;", "toISOFormatApi26", "toISOFormatPreApi26", "toHourOfDay", "j$/time/ZoneId", "zoneId", "toHourOfDayApi26", "(JLj$/time/ZoneId;)Ljava/lang/String;", "Ljava/util/TimeZone;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "toHourOfDayPreApi26", "(JLjava/util/TimeZone;)Ljava/lang/String;", "Ljava/util/Date;", "date", "getFormattedTime", "(Landroid/content/Context;Ljava/util/Date;)Ljava/lang/String;", "getDifferenceInMinutes", "(Ljava/util/Date;)J", "getDifferenceInHours", "getDifferenceInDays", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TimeFormatterExtKt {
    public static final String formattedDateFromLong(long j, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (j <= 0) {
            return "";
        }
        return getFormattedTime(context, new Date(j * 1000));
    }

    public static final String formattedDateForDayDivider(long j, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (j <= 0) {
            return "";
        }
        Date date = new Date(j * 1000);
        Locale localeCompat = UtilsKt.getLocaleCompat(context);
        String format = new SimpleDateFormat(DateFormat.getBestDateTimePattern(localeCompat, "MMMM d"), localeCompat).format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String toISOFormat(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return toISOFormatApi26(j);
        }
        return toISOFormatPreApi26(j);
    }

    public static final String toISOFormatApi26(long j) {
        String format = DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(j * 1000));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String toISOFormatPreApi26(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(Long.valueOf(j * 1000));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String toHourOfDay(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return toHourOfDayApi26$default(j, null, 1, null);
        }
        return toHourOfDayPreApi26$default(j, null, 1, null);
    }

    public static /* synthetic */ String toHourOfDayApi26$default(long j, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return toHourOfDayApi26(j, zoneId);
    }

    public static final String toHourOfDayApi26(long j, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j * 1000), zoneId);
        String format = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH).format(ofInstant);
        if (ofInstant.getHour() == 0) {
            Intrinsics.checkNotNull(format);
            return StringsKt.replace$default(format, "12:00", "00:00", false, 4, (Object) null);
        }
        Intrinsics.checkNotNull(format);
        return format;
    }

    public static /* synthetic */ String toHourOfDayPreApi26$default(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return toHourOfDayPreApi26(j, timeZone);
    }

    public static final String toHourOfDayPreApi26(long j, TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(timeZone);
        long j2 = j * 1000;
        String format = simpleDateFormat.format(Long.valueOf(j2));
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j2);
        if (calendar.get(11) == 0) {
            Intrinsics.checkNotNull(format);
            return StringsKt.replace$default(format, "12:00", "00:00", false, 4, (Object) null);
        }
        Intrinsics.checkNotNull(format);
        return format;
    }

    private static final String getFormattedTime(Context context, Date date) {
        long differenceInMinutes = getDifferenceInMinutes(date);
        long differenceInHours = getDifferenceInHours(date);
        long differenceInDays = getDifferenceInDays(date);
        long j = differenceInDays / 7;
        if (j > 0) {
            return Phrase.from(context, R.string.intercom_time_week_ago).put("delta", String.valueOf(j)).format().toString();
        }
        if (differenceInDays > 0) {
            return Phrase.from(context, R.string.intercom_time_day_ago).put("delta", String.valueOf(differenceInDays)).format().toString();
        }
        if (differenceInHours > 0) {
            return Phrase.from(context, R.string.intercom_time_hour_ago).put("delta", String.valueOf(differenceInHours)).format().toString();
        }
        if (differenceInMinutes >= 1) {
            return Phrase.from(context, R.string.intercom_time_minute_ago).put("delta", String.valueOf(differenceInMinutes)).format().toString();
        }
        return context.getText(R.string.intercom_time_just_now).toString();
    }

    private static final long getDifferenceInMinutes(Date date) {
        return TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - date.getTime());
    }

    private static final long getDifferenceInHours(Date date) {
        return TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - date.getTime());
    }

    private static final long getDifferenceInDays(Date date) {
        return TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - date.getTime());
    }
}
