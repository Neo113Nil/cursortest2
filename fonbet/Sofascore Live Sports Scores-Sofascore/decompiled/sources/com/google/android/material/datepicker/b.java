package com.google.android.material.datepicker;

import android.os.Bundle;
import com.google.android.material.datepicker.CalendarConstraints;
import defpackage.lhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b {
    public static final long f = lhk.a(Month.b(1900, 0).f);
    public static final long g = lhk.a(Month.b(2100, 11).f);
    public Long c;
    public int d;
    public long a = f;
    public long b = g;
    public CalendarConstraints.DateValidator e = new DateValidatorPointForward(Long.MIN_VALUE);

    public final CalendarConstraints a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
        Month c = Month.c(this.a);
        Month c2 = Month.c(this.b);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = this.c;
        return new CalendarConstraints(c, c2, dateValidator, l == null ? null : Month.c(l.longValue()), this.d);
    }
}
