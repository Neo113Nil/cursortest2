package com.google.android.gms.measurement.internal;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3405z extends P3 {

    /* renamed from: c, reason: collision with root package name */
    public long f34407c;

    /* renamed from: d, reason: collision with root package name */
    public String f34408d;

    public C3405z(C3298l3 c3298l3) {
        super(c3298l3);
    }

    @Override // com.google.android.gms.measurement.internal.P3
    public final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.f34407c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f34408d = sb2.toString();
        return false;
    }

    public final long o() {
        l();
        return this.f34407c;
    }

    public final String p() {
        l();
        return this.f34408d;
    }
}
