package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f35436c = new v(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Long f35437a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeZone f35438b;

    public v(Long l10, TimeZone timeZone) {
        this.f35437a = l10;
        this.f35438b = timeZone;
    }

    public static v c() {
        return f35436c;
    }

    public Calendar a() {
        return b(this.f35438b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f35437a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
