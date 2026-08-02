package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
final class h extends org.joda.time.field.f {

    /* renamed from: d, reason: collision with root package name */
    private final BasicChronology f79189d;

    h(BasicChronology basicChronology, org.joda.time.d dVar) {
        super(DateTimeFieldType.K(), dVar);
        this.f79189d = basicChronology;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        return this.f79189d.S();
    }

    @Override // org.joda.time.field.a
    protected final int P(String str, Locale locale) {
        return j.g(locale).b(str);
    }

    @Override // org.joda.time.b
    public final int d(long j11) {
        this.f79189d.getClass();
        return BasicChronology.q0(j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final String e(int i11, Locale locale) {
        return j.g(locale).c(i11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final String h(int i11, Locale locale) {
        return j.g(locale).d(i11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int s(Locale locale) {
        return j.g(locale).h();
    }

    @Override // org.joda.time.b
    public final int u() {
        return 7;
    }

    @Override // org.joda.time.field.f, org.joda.time.b
    public final int y() {
        return 1;
    }
}
