package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.BaseDurationField;

/* loaded from: classes6.dex */
public final class ZonedChronology extends AssembledChronology {
    private static final long serialVersionUID = -1079258847191166848L;

    static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        final org.joda.time.d iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        ZonedDurationField(org.joda.time.d dVar, DateTimeZone dateTimeZone) {
            super(dVar.f());
            if (!dVar.i()) {
                throw new IllegalArgumentException();
            }
            this.iField = dVar;
            this.iTimeField = dVar.g() < 43200000;
            this.iZone = dateTimeZone;
        }

        private int l(long j11) {
            int p11 = this.iZone.p(j11);
            long j12 = p11;
            if (((j11 - j12) ^ j11) >= 0 || (j11 ^ j12) >= 0) {
                return p11;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        private int m(long j11) {
            int n11 = this.iZone.n(j11);
            long j12 = n11;
            if (((j11 + j12) ^ j11) >= 0 || (j11 ^ j12) < 0) {
                return n11;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        @Override // org.joda.time.d
        public final long a(int i11, long j11) {
            int m11 = m(j11);
            long a11 = this.iField.a(i11, j11 + m11);
            if (!this.iTimeField) {
                m11 = l(a11);
            }
            return a11 - m11;
        }

        @Override // org.joda.time.d
        public final long b(long j11, long j12) {
            int m11 = m(j11);
            long b11 = this.iField.b(j11 + m11, j12);
            if (!this.iTimeField) {
                m11 = l(b11);
            }
            return b11 - m11;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.d
        public final int d(long j11, long j12) {
            return this.iField.d(j11 + (this.iTimeField ? r0 : m(j11)), j12 + m(j12));
        }

        @Override // org.joda.time.d
        public final long e(long j11, long j12) {
            return this.iField.e(j11 + (this.iTimeField ? r0 : m(j11)), j12 + m(j12));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ZonedDurationField) {
                ZonedDurationField zonedDurationField = (ZonedDurationField) obj;
                if (this.iField.equals(zonedDurationField.iField) && this.iZone.equals(zonedDurationField.iZone)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.d
        public final long g() {
            return this.iField.g();
        }

        @Override // org.joda.time.d
        public final boolean h() {
            return this.iTimeField ? this.iField.h() : this.iField.h() && this.iZone.y();
        }

        public final int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }
    }

    static final class a extends org.joda.time.field.a {

        /* renamed from: b, reason: collision with root package name */
        final org.joda.time.b f79174b;

        /* renamed from: c, reason: collision with root package name */
        final DateTimeZone f79175c;

        /* renamed from: d, reason: collision with root package name */
        final org.joda.time.d f79176d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f79177e;

        /* renamed from: f, reason: collision with root package name */
        final org.joda.time.d f79178f;

        /* renamed from: g, reason: collision with root package name */
        final org.joda.time.d f79179g;

        a(org.joda.time.b bVar, DateTimeZone dateTimeZone, org.joda.time.d dVar, org.joda.time.d dVar2, org.joda.time.d dVar3) {
            super(bVar.C());
            if (!bVar.F()) {
                throw new IllegalArgumentException();
            }
            this.f79174b = bVar;
            this.f79175c = dateTimeZone;
            this.f79176d = dVar;
            this.f79177e = dVar != null && dVar.g() < 43200000;
            this.f79178f = dVar2;
            this.f79179g = dVar3;
        }

        private int R(long j11) {
            int n11 = this.f79175c.n(j11);
            long j12 = n11;
            if (((j11 + j12) ^ j11) >= 0 || (j11 ^ j12) < 0) {
                return n11;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        @Override // org.joda.time.b
        public final org.joda.time.d B() {
            return this.f79178f;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final boolean D(long j11) {
            return this.f79174b.D(this.f79175c.b(j11));
        }

        @Override // org.joda.time.b
        public final boolean E() {
            return this.f79174b.E();
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long G(long j11) {
            return this.f79174b.G(this.f79175c.b(j11));
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long H(long j11) {
            boolean z11 = this.f79177e;
            org.joda.time.b bVar = this.f79174b;
            if (z11) {
                long R11 = R(j11);
                return bVar.H(j11 + R11) - R11;
            }
            DateTimeZone dateTimeZone = this.f79175c;
            return dateTimeZone.a(bVar.H(dateTimeZone.b(j11)), j11);
        }

        @Override // org.joda.time.b
        public final long I(long j11) {
            boolean z11 = this.f79177e;
            org.joda.time.b bVar = this.f79174b;
            if (z11) {
                long R11 = R(j11);
                return bVar.I(j11 + R11) - R11;
            }
            DateTimeZone dateTimeZone = this.f79175c;
            return dateTimeZone.a(bVar.I(dateTimeZone.b(j11)), j11);
        }

        @Override // org.joda.time.b
        public final long M(int i11, long j11) {
            DateTimeZone dateTimeZone = this.f79175c;
            long b11 = dateTimeZone.b(j11);
            org.joda.time.b bVar = this.f79174b;
            long M11 = bVar.M(i11, b11);
            long a11 = dateTimeZone.a(M11, j11);
            if (d(a11) == i11) {
                return a11;
            }
            IllegalInstantException illegalInstantException = new IllegalInstantException(M11, dateTimeZone.h());
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(bVar.C(), Integer.valueOf(i11), illegalInstantException.getMessage());
            illegalFieldValueException.initCause(illegalInstantException);
            throw illegalFieldValueException;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long N(long j11, String str, Locale locale) {
            DateTimeZone dateTimeZone = this.f79175c;
            return dateTimeZone.a(this.f79174b.N(dateTimeZone.b(j11), str, locale), j11);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long a(int i11, long j11) {
            boolean z11 = this.f79177e;
            org.joda.time.b bVar = this.f79174b;
            if (z11) {
                long R11 = R(j11);
                return bVar.a(i11, j11 + R11) - R11;
            }
            DateTimeZone dateTimeZone = this.f79175c;
            return dateTimeZone.a(bVar.a(i11, dateTimeZone.b(j11)), j11);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long b(long j11, long j12) {
            boolean z11 = this.f79177e;
            org.joda.time.b bVar = this.f79174b;
            if (z11) {
                long R11 = R(j11);
                return bVar.b(j11 + R11, j12) - R11;
            }
            DateTimeZone dateTimeZone = this.f79175c;
            return dateTimeZone.a(bVar.b(dateTimeZone.b(j11), j12), j11);
        }

        @Override // org.joda.time.b
        public final int d(long j11) {
            return this.f79174b.d(this.f79175c.b(j11));
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final String e(int i11, Locale locale) {
            return this.f79174b.e(i11, locale);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f79174b.equals(aVar.f79174b) && this.f79175c.equals(aVar.f79175c) && this.f79176d.equals(aVar.f79176d) && this.f79178f.equals(aVar.f79178f)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final String f(long j11, Locale locale) {
            return this.f79174b.f(this.f79175c.b(j11), locale);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final String h(int i11, Locale locale) {
            return this.f79174b.h(i11, locale);
        }

        public final int hashCode() {
            return this.f79174b.hashCode() ^ this.f79175c.hashCode();
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final String i(long j11, Locale locale) {
            return this.f79174b.i(this.f79175c.b(j11), locale);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final int l(long j11, long j12) {
            return this.f79174b.l(j11 + (this.f79177e ? r0 : R(j11)), j12 + R(j12));
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long m(long j11, long j12) {
            return this.f79174b.m(j11 + (this.f79177e ? r0 : R(j11)), j12 + R(j12));
        }

        @Override // org.joda.time.b
        public final org.joda.time.d n() {
            return this.f79176d;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final org.joda.time.d p() {
            return this.f79179g;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final int s(Locale locale) {
            return this.f79174b.s(locale);
        }

        @Override // org.joda.time.b
        public final int u() {
            return this.f79174b.u();
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final int v(long j11) {
            return this.f79174b.v(this.f79175c.b(j11));
        }

        @Override // org.joda.time.b
        public final int y() {
            return this.f79174b.y();
        }
    }

    private org.joda.time.b g0(org.joda.time.b bVar, HashMap<Object, Object> hashMap) {
        if (bVar == null || !bVar.F()) {
            return bVar;
        }
        if (hashMap.containsKey(bVar)) {
            return (org.joda.time.b) hashMap.get(bVar);
        }
        a aVar = new a(bVar, (DateTimeZone) e0(), h0(bVar.n(), hashMap), h0(bVar.B(), hashMap), h0(bVar.p(), hashMap));
        hashMap.put(bVar, aVar);
        return aVar;
    }

    private org.joda.time.d h0(org.joda.time.d dVar, HashMap<Object, Object> hashMap) {
        if (dVar == null || !dVar.i()) {
            return dVar;
        }
        if (hashMap.containsKey(dVar)) {
            return (org.joda.time.d) hashMap.get(dVar);
        }
        ZonedDurationField zonedDurationField = new ZonedDurationField(dVar, (DateTimeZone) e0());
        hashMap.put(dVar, zonedDurationField);
        return zonedDurationField;
    }

    public static ZonedChronology i0(AssembledChronology assembledChronology, DateTimeZone dateTimeZone) {
        if (assembledChronology == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        org.joda.time.a W11 = assembledChronology.W();
        if (W11 == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (dateTimeZone != null) {
            return new ZonedChronology(W11, dateTimeZone);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }

    private long j0(long j11) {
        if (j11 == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (j11 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        DateTimeZone dateTimeZone = (DateTimeZone) e0();
        int p11 = dateTimeZone.p(j11);
        long j12 = j11 - p11;
        if (j11 > 604800000 && j12 < 0) {
            return Long.MAX_VALUE;
        }
        if (j11 < -604800000 && j12 > 0) {
            return Long.MIN_VALUE;
        }
        if (p11 == dateTimeZone.n(j12)) {
            return j12;
        }
        throw new IllegalInstantException(j11, dateTimeZone.h());
    }

    @Override // org.joda.time.a
    public final org.joda.time.a X(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        return dateTimeZone == e0() ? this : dateTimeZone == DateTimeZone.f78989a ? d0() : new ZonedChronology(d0(), dateTimeZone);
    }

    @Override // org.joda.time.chrono.AssembledChronology
    protected final void c0(AssembledChronology.a aVar) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        aVar.f79109l = h0(aVar.f79109l, hashMap);
        aVar.f79108k = h0(aVar.f79108k, hashMap);
        aVar.f79107j = h0(aVar.f79107j, hashMap);
        aVar.f79106i = h0(aVar.f79106i, hashMap);
        aVar.f79105h = h0(aVar.f79105h, hashMap);
        aVar.f79104g = h0(aVar.f79104g, hashMap);
        aVar.f79103f = h0(aVar.f79103f, hashMap);
        aVar.f79102e = h0(aVar.f79102e, hashMap);
        aVar.f79101d = h0(aVar.f79101d, hashMap);
        aVar.f79100c = h0(aVar.f79100c, hashMap);
        aVar.f79099b = h0(aVar.f79099b, hashMap);
        aVar.f79098a = h0(aVar.f79098a, hashMap);
        aVar.f79093E = g0(aVar.f79093E, hashMap);
        aVar.f79094F = g0(aVar.f79094F, hashMap);
        aVar.f79095G = g0(aVar.f79095G, hashMap);
        aVar.f79096H = g0(aVar.f79096H, hashMap);
        aVar.f79097I = g0(aVar.f79097I, hashMap);
        aVar.f79121x = g0(aVar.f79121x, hashMap);
        aVar.f79122y = g0(aVar.f79122y, hashMap);
        aVar.f79123z = g0(aVar.f79123z, hashMap);
        aVar.f79092D = g0(aVar.f79092D, hashMap);
        aVar.f79089A = g0(aVar.f79089A, hashMap);
        aVar.f79090B = g0(aVar.f79090B, hashMap);
        aVar.f79091C = g0(aVar.f79091C, hashMap);
        aVar.f79110m = g0(aVar.f79110m, hashMap);
        aVar.f79111n = g0(aVar.f79111n, hashMap);
        aVar.f79112o = g0(aVar.f79112o, hashMap);
        aVar.f79113p = g0(aVar.f79113p, hashMap);
        aVar.f79114q = g0(aVar.f79114q, hashMap);
        aVar.f79115r = g0(aVar.f79115r, hashMap);
        aVar.f79116s = g0(aVar.f79116s, hashMap);
        aVar.f79118u = g0(aVar.f79118u, hashMap);
        aVar.f79117t = g0(aVar.f79117t, hashMap);
        aVar.f79119v = g0(aVar.f79119v, hashMap);
        aVar.f79120w = g0(aVar.f79120w, hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        return d0().equals(zonedChronology.d0()) && ((DateTimeZone) e0()).equals((DateTimeZone) zonedChronology.e0());
    }

    public final int hashCode() {
        return (d0().hashCode() * 7) + (((DateTimeZone) e0()).hashCode() * 11) + 326565;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final long s(int i11) throws IllegalArgumentException {
        return j0(d0().s(i11));
    }

    @Override // org.joda.time.a
    public final String toString() {
        return "ZonedChronology[" + d0() + ", " + ((DateTimeZone) e0()).h() + ']';
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final long u(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        return j0(d0().u(i11, i12, i13, i14));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final long v(long j11) throws IllegalArgumentException {
        return j0(d0().v(j11 + ((DateTimeZone) e0()).n(j11)));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.a
    public final DateTimeZone y() {
        return (DateTimeZone) e0();
    }
}
