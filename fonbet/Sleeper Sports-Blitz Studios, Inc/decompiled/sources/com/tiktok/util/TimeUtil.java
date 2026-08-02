package com.tiktok.util;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes8.dex */
public class TimeUtil {
    private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
    private static final SimpleDateFormat sdf = new SimpleDateFormat(ConstantsKt.READABLE_DATE_FORMAT);

    public static String getISO8601Timestamp(Date date) {
        df.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return df.format(date);
    }

    public static String dateStr(int dayDifference) {
        Calendar calendar = Calendar.getInstance();
        if (dayDifference != 0) {
            calendar.add(5, dayDifference);
        }
        return sdf.format(calendar.getTime());
    }

    public static boolean isNowAfter(String referenceStr, int days) {
        return dateStr(-days).equals(referenceStr);
    }
}
