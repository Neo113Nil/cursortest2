package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class DateStrings {
    private DateStrings() {
    }

    public static p0.b getDateRangeString(Long l6, Long l10, SimpleDateFormat simpleDateFormat) {
        if (l6 == null && l10 == null) {
            return new p0.b(null, null);
        }
        if (l6 == null) {
            return new p0.b(null, getDateString(l10.longValue(), simpleDateFormat));
        }
        if (l10 == null) {
            return new p0.b(getDateString(l6.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l6.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l10.longValue());
        if (simpleDateFormat != null) {
            return new p0.b(simpleDateFormat.format(new Date(l6.longValue())), simpleDateFormat.format(new Date(l10.longValue())));
        }
        return utcCalendar.get(1) == utcCalendar2.get(1) ? utcCalendar.get(1) == todayCalendar.get(1) ? new p0.b(getMonthDay(l6.longValue(), Locale.getDefault()), getMonthDay(l10.longValue(), Locale.getDefault())) : new p0.b(getMonthDay(l6.longValue(), Locale.getDefault()), getYearMonthDay(l10.longValue(), Locale.getDefault())) : new p0.b(getYearMonthDay(l6.longValue(), Locale.getDefault()), getYearMonthDay(l10.longValue(), Locale.getDefault()));
    }

    public static String getDateString(long j) {
        return getDateString(j, null);
    }

    public static String getDayContentDescription(Context context, long j, boolean z5, boolean z7, boolean z10) {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j);
        if (z5) {
            optionalYearMonthDayOfWeekDay = String.format(context.getString(R.string.mtrl_picker_today_description), optionalYearMonthDayOfWeekDay);
        }
        return z7 ? String.format(context.getString(R.string.mtrl_picker_start_date_description), optionalYearMonthDayOfWeekDay) : z10 ? String.format(context.getString(R.string.mtrl_picker_end_date_description), optionalYearMonthDayOfWeekDay) : optionalYearMonthDayOfWeekDay;
    }

    public static String getMonthDay(long j) {
        return getMonthDay(j, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j) {
        return getMonthDayOfWeekDay(j, Locale.getDefault());
    }

    public static String getOptionalYearMonthDayOfWeekDay(long j) {
        return isDateWithinCurrentYear(j) ? getMonthDayOfWeekDay(j) : getYearMonthDayOfWeekDay(j);
    }

    public static String getYearContentDescription(Context context, int i5) {
        return UtcDates.getTodayCalendar().get(1) == i5 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i5)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i5));
    }

    public static String getYearMonth(long j) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j)) : DateUtils.formatDateTime(null, j, 8228);
    }

    public static String getYearMonthDay(long j) {
        return getYearMonthDay(j, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j) {
        return getYearMonthDayOfWeekDay(j, Locale.getDefault());
    }

    private static boolean isDateWithinCurrentYear(long j) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j);
        return todayCalendar.get(1) == utcCalendar.get(1);
    }

    public static String getDateString(long j, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j)) : isDateWithinCurrentYear(j) ? getMonthDay(j) : getYearMonthDay(j);
    }

    public static String getMonthDay(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j)) : UtcDates.getMediumNoYear(locale).format(new Date(j));
    }

    public static String getMonthDayOfWeekDay(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.getMonthWeekdayDayFormat(locale).format(new Date(j)) : UtcDates.getFullFormat(locale).format(new Date(j));
    }

    public static String getYearMonthDay(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j)) : UtcDates.getMediumFormat(locale).format(new Date(j));
    }

    public static String getYearMonthDayOfWeekDay(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.getYearMonthWeekdayDayFormat(locale).format(new Date(j)) : UtcDates.getFullFormat(locale).format(new Date(j));
    }

    public static p0.b getDateRangeString(Long l6, Long l10) {
        return getDateRangeString(l6, l10, null);
    }
}
