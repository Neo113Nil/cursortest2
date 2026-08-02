package ru.ozon.android.messenger.utils;

import android.content.Context;
import android.text.format.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* loaded from: classes10.dex */
public final class d {
    @NotNull
    public static final String a(@NotNull DateTime dateTime, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        DateTime dateTime2 = new DateTime();
        int d11 = dateTime2.getChronology().Y().d(dateTime2.getMillis());
        dateTime.getClass();
        String format = new SimpleDateFormat(d11 != dateTime.getChronology().Y().d(dateTime.getMillis()) ? "dd.MM.yyyy" : dateTime2.getMillis() - dateTime.getMillis() > 86400000 ? "dd.MM" : DateFormat.is24HourFormat(context) ? "HH:mm" : "hh:mm", Locale.getDefault()).format(new Date(dateTime.getMillis()));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
