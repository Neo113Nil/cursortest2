package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
final class C {

    /* renamed from: a, reason: collision with root package name */
    static AtomicReference<B> f58208a = new AtomicReference<>();

    static long a(long j11) {
        Calendar d11 = d(null);
        d11.setTimeInMillis(j11);
        return b(d11).getTimeInMillis();
    }

    static Calendar b(Calendar calendar) {
        Calendar d11 = d(calendar);
        Calendar d12 = d(null);
        d12.set(d11.get(1), d11.get(2), d11.get(5));
        return d12;
    }

    static Calendar c() {
        f58208a.get();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    static Calendar d(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
