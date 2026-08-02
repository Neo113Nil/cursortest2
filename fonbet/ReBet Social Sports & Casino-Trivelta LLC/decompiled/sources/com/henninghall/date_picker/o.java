package com.henninghall.date_picker;

import android.text.format.DateFormat;
import android.text.format.DateUtils;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import net.time4j.J;

/* loaded from: classes3.dex */
public abstract class o {
    public static String a(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String b(Calendar calendar) {
        return d().format(calendar.getTime());
    }

    public static boolean c() {
        return !DateFormat.is24HourFormat(c.f38475a);
    }

    public static SimpleDateFormat d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public static int e(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14 = i12 + 1;
        int i15 = i11 - i10;
        int i16 = i15 > 0 ? i15 - i14 : i14 + i15;
        return (!z10 ? !((i13 = i10 + i15) <= i12 && i13 >= 0) : Math.abs(i15) >= Math.abs(i16)) ? i15 : i16;
    }

    public static boolean f(Calendar calendar) {
        return DateUtils.isToday(calendar.getTimeInMillis());
    }

    public static Calendar g(String str, TimeZone timeZone) {
        if (str == null) {
            return null;
        }
        try {
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(d().parse(str));
            return calendar;
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Rb.c h(char c10) {
        if (c10 != 'H') {
            if (c10 == 'M') {
                return Rb.c.MONTH;
            }
            if (c10 == 'a') {
                return Rb.c.AM_PM;
            }
            if (c10 == 'd') {
                return Rb.c.DATE;
            }
            if (c10 != 'h') {
                if (c10 == 'm') {
                    return Rb.c.MINUTE;
                }
                if (c10 == 'y') {
                    return Rb.c.YEAR;
                }
                throw new Exception("Invalid pattern char: " + c10);
            }
        }
        return Rb.c.HOUR;
    }

    public static String i(Locale locale) {
        return J.b(locale).c();
    }

    public static int j(int i10) {
        return (int) (i10 * c.f38475a.getResources().getDisplayMetrics().density);
    }

    public static String k(int i10) {
        return new DecimalFormat("00").format(i10);
    }
}
