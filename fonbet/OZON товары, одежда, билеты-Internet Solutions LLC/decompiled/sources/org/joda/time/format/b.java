package org.joda.time.format;

import java.io.IOException;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final l f79263a;

    /* renamed from: b, reason: collision with root package name */
    private final j f79264b;

    /* renamed from: c, reason: collision with root package name */
    private final Locale f79265c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f79266d;

    /* renamed from: e, reason: collision with root package name */
    private final org.joda.time.a f79267e;

    /* renamed from: f, reason: collision with root package name */
    private final DateTimeZone f79268f;

    b(l lVar, j jVar) {
        this.f79263a = lVar;
        this.f79264b = jVar;
        this.f79265c = null;
        this.f79266d = false;
        this.f79267e = null;
        this.f79268f = null;
    }

    private void j(Appendable appendable, long j11, org.joda.time.a aVar) throws IOException {
        long j12 = j11;
        l lVar = this.f79263a;
        if (lVar == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        org.joda.time.a k11 = k(aVar);
        DateTimeZone y11 = k11.y();
        int n11 = y11.n(j12);
        long j13 = n11;
        long j14 = j12 + j13;
        if ((j12 ^ j14) >= 0 || (j13 ^ j12) < 0) {
            j12 = j14;
        } else {
            y11 = DateTimeZone.f78989a;
            n11 = 0;
        }
        lVar.e(appendable, j12, k11.W(), n11, y11, this.f79265c);
    }

    private org.joda.time.a k(org.joda.time.a aVar) {
        int i11 = org.joda.time.c.f79052b;
        if (aVar == null) {
            aVar = ISOChronology.g0();
        }
        org.joda.time.a aVar2 = this.f79267e;
        if (aVar2 != null) {
            aVar = aVar2;
        }
        DateTimeZone dateTimeZone = this.f79268f;
        return dateTimeZone != null ? aVar.X(dateTimeZone) : aVar;
    }

    public final c a() {
        return k.d(this.f79264b);
    }

    final j b() {
        return this.f79264b;
    }

    final l c() {
        return this.f79263a;
    }

    public final DateTime d(String str) {
        j jVar = this.f79264b;
        if (jVar == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        org.joda.time.a k11 = k(null);
        d dVar = new d(k11, this.f79265c);
        int b11 = jVar.b(dVar, str, 0);
        if (b11 < 0) {
            b11 = ~b11;
        } else if (b11 >= str.length()) {
            long f7 = dVar.f(str);
            if (this.f79266d && dVar.i() != null) {
                k11 = k11.X(DateTimeZone.e(dVar.i().intValue()));
            } else if (dVar.j() != null) {
                k11 = k11.X(dVar.j());
            }
            DateTime dateTime = new DateTime(f7, k11);
            DateTimeZone dateTimeZone = this.f79268f;
            return dateTimeZone != null ? dateTime.p(dateTimeZone) : dateTime;
        }
        throw new IllegalArgumentException(h.e(b11, str));
    }

    public final LocalDate e(String str) {
        j jVar = this.f79264b;
        if (jVar == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        org.joda.time.a W11 = k(null).W();
        d dVar = new d(W11, this.f79265c);
        int b11 = jVar.b(dVar, str, 0);
        if (b11 < 0) {
            b11 = ~b11;
        } else if (b11 >= str.length()) {
            long f7 = dVar.f(str);
            if (dVar.i() != null) {
                W11 = W11.X(DateTimeZone.e(dVar.i().intValue()));
            } else if (dVar.j() != null) {
                W11 = W11.X(dVar.j());
            }
            return new LocalDateTime(f7, W11).g();
        }
        throw new IllegalArgumentException(h.e(b11, str));
    }

    public final long f(String str) {
        j jVar = this.f79264b;
        if (jVar == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        d dVar = new d(k(this.f79267e), this.f79265c);
        int b11 = jVar.b(dVar, str, 0);
        if (b11 < 0) {
            b11 = ~b11;
        } else if (b11 >= str.length()) {
            return dVar.f(str);
        }
        throw new IllegalArgumentException(h.e(b11, str.toString()));
    }

    public final String g(org.joda.time.h hVar) {
        org.joda.time.a chronology;
        l lVar = this.f79263a;
        if (lVar == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        StringBuilder sb2 = new StringBuilder(lVar.estimatePrintedLength());
        try {
            long c11 = org.joda.time.c.c(hVar);
            if (hVar == null) {
                chronology = ISOChronology.g0();
            } else {
                chronology = hVar.getChronology();
                if (chronology == null) {
                    chronology = ISOChronology.g0();
                }
            }
            j(sb2, c11, chronology);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public final String h(org.joda.time.base.e eVar) {
        l lVar = this.f79263a;
        if (lVar == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        StringBuilder sb2 = new StringBuilder(lVar.estimatePrintedLength());
        if (lVar == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        lVar.d(sb2, eVar, this.f79265c);
        return sb2.toString();
    }

    public final void i(long j11, StringBuffer stringBuffer) {
        try {
            j(stringBuffer, j11, null);
        } catch (IOException unused) {
        }
    }

    public final b l(org.joda.time.a aVar) {
        if (this.f79267e == aVar) {
            return this;
        }
        return new b(this.f79263a, this.f79264b, this.f79265c, this.f79266d, aVar, this.f79268f);
    }

    public final b m(Locale locale) {
        Locale locale2 = this.f79265c;
        if (locale == locale2 || (locale != null && locale.equals(locale2))) {
            return this;
        }
        return new b(this.f79263a, this.f79264b, locale, this.f79266d, this.f79267e, this.f79268f);
    }

    public final b n() {
        if (this.f79266d) {
            return this;
        }
        return new b(this.f79263a, this.f79264b, this.f79265c, true, this.f79267e, null);
    }

    public final b o() {
        DateTimeZone dateTimeZone = DateTimeZone.f78989a;
        if (this.f79268f == dateTimeZone) {
            return this;
        }
        return new b(this.f79263a, this.f79264b, this.f79265c, false, this.f79267e, dateTimeZone);
    }

    private b(l lVar, j jVar, Locale locale, boolean z11, org.joda.time.a aVar, DateTimeZone dateTimeZone) {
        this.f79263a = lVar;
        this.f79264b = jVar;
        this.f79265c = locale;
        this.f79266d = z11;
        this.f79267e = aVar;
        this.f79268f = dateTimeZone;
    }
}
