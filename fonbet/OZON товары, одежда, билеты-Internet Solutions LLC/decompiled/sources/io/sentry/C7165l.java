package io.sentry;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7165l {
    @NotNull
    public static BigDecimal a(@NotNull Double d11) {
        return BigDecimal.valueOf(d11.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    @NotNull
    public static Date b() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f68625a).getTime();
    }

    @NotNull
    public static Date c(long j11) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f68625a);
        calendar.setTimeInMillis(j11);
        return calendar.getTime();
    }

    @NotNull
    public static Date d(@NotNull String str) throws IllegalArgumentException {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.d(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(Nk.a.b("timestamp is not ISO format ", str));
        }
    }

    @NotNull
    public static Date e(@NotNull String str) throws IllegalArgumentException {
        try {
            return c(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(Nk.a.b("timestamp is not millis format ", str));
        }
    }
}
