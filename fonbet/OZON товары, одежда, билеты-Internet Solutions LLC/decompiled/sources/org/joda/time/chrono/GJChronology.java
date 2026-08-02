package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.DecoratedDurationField;

/* loaded from: classes10.dex */
public final class GJChronology extends AssembledChronology {

    /* renamed from: K, reason: collision with root package name */
    static final Instant f79152K = new Instant(-12219292800000L);

    /* renamed from: L, reason: collision with root package name */
    private static final ConcurrentHashMap<g, GJChronology> f79153L = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    private long iGapDuration;
    private GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    private static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final b iField;

        LinkedDurationField(org.joda.time.d dVar, b bVar) {
            super(dVar, dVar.f());
            this.iField = bVar;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.d
        public final long a(int i11, long j11) {
            return this.iField.a(i11, j11);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.d
        public final long b(long j11, long j12) {
            return this.iField.b(j11, j12);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.d
        public final int d(long j11, long j12) {
            return this.iField.l(j11, j12);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.d
        public final long e(long j11, long j12) {
            return this.iField.m(j11, j12);
        }
    }

    private class a extends org.joda.time.field.a {

        /* renamed from: b, reason: collision with root package name */
        final org.joda.time.b f79154b;

        /* renamed from: c, reason: collision with root package name */
        final org.joda.time.b f79155c;

        /* renamed from: d, reason: collision with root package name */
        final long f79156d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f79157e;

        /* renamed from: f, reason: collision with root package name */
        protected org.joda.time.d f79158f;

        /* renamed from: g, reason: collision with root package name */
        protected org.joda.time.d f79159g;

        a(GJChronology gJChronology, org.joda.time.b bVar, org.joda.time.b bVar2, long j11) {
            this(bVar, bVar2, null, j11, false);
        }

        @Override // org.joda.time.b
        public final org.joda.time.d B() {
            return this.f79159g;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final boolean D(long j11) {
            return j11 >= this.f79156d ? this.f79155c.D(j11) : this.f79154b.D(j11);
        }

        @Override // org.joda.time.b
        public final boolean E() {
            return false;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long H(long j11) {
            long j12 = this.f79156d;
            if (j11 >= j12) {
                return this.f79155c.H(j11);
            }
            long H11 = this.f79154b.H(j11);
            return (H11 < j12 || H11 - GJChronology.this.iGapDuration < j12) ? H11 : S(H11);
        }

        @Override // org.joda.time.b
        public final long I(long j11) {
            long j12 = this.f79156d;
            if (j11 < j12) {
                return this.f79154b.I(j11);
            }
            long I11 = this.f79155c.I(j11);
            return (I11 >= j12 || GJChronology.this.iGapDuration + I11 >= j12) ? I11 : R(I11);
        }

        @Override // org.joda.time.b
        public final long M(int i11, long j11) {
            long j12 = this.f79156d;
            GJChronology gJChronology = GJChronology.this;
            if (j11 >= j12) {
                org.joda.time.b bVar = this.f79155c;
                long M11 = bVar.M(i11, j11);
                if (M11 >= j12) {
                    return M11;
                }
                if (gJChronology.iGapDuration + M11 < j12) {
                    M11 = R(M11);
                }
                if (d(M11) == i11) {
                    return M11;
                }
                throw new IllegalFieldValueException(bVar.C(), Integer.valueOf(i11), (Integer) null, (Integer) null);
            }
            org.joda.time.b bVar2 = this.f79154b;
            long M12 = bVar2.M(i11, j11);
            if (M12 < j12) {
                return M12;
            }
            if (M12 - gJChronology.iGapDuration >= j12) {
                M12 = S(M12);
            }
            if (d(M12) == i11) {
                return M12;
            }
            throw new IllegalFieldValueException(bVar2.C(), Integer.valueOf(i11), (Integer) null, (Integer) null);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long N(long j11, String str, Locale locale) {
            long j12 = this.f79156d;
            GJChronology gJChronology = GJChronology.this;
            if (j11 >= j12) {
                long N11 = this.f79155c.N(j11, str, locale);
                return (N11 >= j12 || gJChronology.iGapDuration + N11 >= j12) ? N11 : R(N11);
            }
            long N12 = this.f79154b.N(j11, str, locale);
            return (N12 < j12 || N12 - gJChronology.iGapDuration < j12) ? N12 : S(N12);
        }

        protected final long R(long j11) {
            boolean z11 = this.f79157e;
            GJChronology gJChronology = GJChronology.this;
            return z11 ? gJChronology.l0(j11) : gJChronology.m0(j11);
        }

        protected final long S(long j11) {
            boolean z11 = this.f79157e;
            GJChronology gJChronology = GJChronology.this;
            return z11 ? gJChronology.n0(j11) : gJChronology.o0(j11);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public long a(int i11, long j11) {
            return this.f79155c.a(i11, j11);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public long b(long j11, long j12) {
            return this.f79155c.b(j11, j12);
        }

        @Override // org.joda.time.b
        public final int d(long j11) {
            return j11 >= this.f79156d ? this.f79155c.d(j11) : this.f79154b.d(j11);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final String e(int i11, Locale locale) {
            return this.f79155c.e(i11, locale);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final String f(long j11, Locale locale) {
            return j11 >= this.f79156d ? this.f79155c.f(j11, locale) : this.f79154b.f(j11, locale);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final String h(int i11, Locale locale) {
            return this.f79155c.h(i11, locale);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final String i(long j11, Locale locale) {
            return j11 >= this.f79156d ? this.f79155c.i(j11, locale) : this.f79154b.i(j11, locale);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public int l(long j11, long j12) {
            return this.f79155c.l(j11, j12);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public long m(long j11, long j12) {
            return this.f79155c.m(j11, j12);
        }

        @Override // org.joda.time.b
        public final org.joda.time.d n() {
            return this.f79158f;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final org.joda.time.d p() {
            return this.f79155c.p();
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final int s(Locale locale) {
            return Math.max(this.f79154b.s(locale), this.f79155c.s(locale));
        }

        @Override // org.joda.time.b
        public final int u() {
            return this.f79155c.u();
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public int v(long j11) {
            long j12 = this.f79156d;
            if (j11 >= j12) {
                return this.f79155c.v(j11);
            }
            org.joda.time.b bVar = this.f79154b;
            int v11 = bVar.v(j11);
            return bVar.M(v11, j11) >= j12 ? bVar.d(bVar.a(-1, j12)) : v11;
        }

        @Override // org.joda.time.b
        public final int y() {
            return this.f79154b.y();
        }

        a(org.joda.time.b bVar, org.joda.time.b bVar2, org.joda.time.d dVar, long j11, boolean z11) {
            super(bVar2.C());
            this.f79154b = bVar;
            this.f79155c = bVar2;
            this.f79156d = j11;
            this.f79157e = z11;
            this.f79158f = bVar2.n();
            if (dVar == null && (dVar = bVar2.B()) == null) {
                dVar = bVar.B();
            }
            this.f79159g = dVar;
        }
    }

    private final class b extends a {
        b(GJChronology gJChronology, org.joda.time.b bVar, org.joda.time.b bVar2, long j11) {
            this(bVar, bVar2, (org.joda.time.d) null, j11, false);
        }

        @Override // org.joda.time.chrono.GJChronology.a, org.joda.time.field.a, org.joda.time.b
        public final long a(int i11, long j11) {
            long j12 = this.f79156d;
            GJChronology gJChronology = GJChronology.this;
            if (j11 < j12) {
                long a11 = this.f79154b.a(i11, j11);
                return (a11 < j12 || a11 - gJChronology.iGapDuration < j12) ? a11 : S(a11);
            }
            long a12 = this.f79155c.a(i11, j11);
            if (a12 >= j12 || gJChronology.iGapDuration + a12 >= j12) {
                return a12;
            }
            if (this.f79157e) {
                if (gJChronology.iGregorianChronology.T().d(a12) <= 0) {
                    a12 = gJChronology.iGregorianChronology.T().a(-1, a12);
                }
            } else if (gJChronology.iGregorianChronology.Y().d(a12) <= 0) {
                a12 = gJChronology.iGregorianChronology.Y().a(-1, a12);
            }
            return R(a12);
        }

        @Override // org.joda.time.chrono.GJChronology.a, org.joda.time.field.a, org.joda.time.b
        public final long b(long j11, long j12) {
            long j13 = this.f79156d;
            GJChronology gJChronology = GJChronology.this;
            if (j11 < j13) {
                long b11 = this.f79154b.b(j11, j12);
                return (b11 < j13 || b11 - gJChronology.iGapDuration < j13) ? b11 : S(b11);
            }
            long b12 = this.f79155c.b(j11, j12);
            if (b12 >= j13 || gJChronology.iGapDuration + b12 >= j13) {
                return b12;
            }
            if (this.f79157e) {
                if (gJChronology.iGregorianChronology.T().d(b12) <= 0) {
                    b12 = gJChronology.iGregorianChronology.T().a(-1, b12);
                }
            } else if (gJChronology.iGregorianChronology.Y().d(b12) <= 0) {
                b12 = gJChronology.iGregorianChronology.Y().a(-1, b12);
            }
            return R(b12);
        }

        @Override // org.joda.time.chrono.GJChronology.a, org.joda.time.field.a, org.joda.time.b
        public final int l(long j11, long j12) {
            long j13 = this.f79156d;
            org.joda.time.b bVar = this.f79154b;
            org.joda.time.b bVar2 = this.f79155c;
            return j11 >= j13 ? j12 >= j13 ? bVar2.l(j11, j12) : bVar.l(R(j11), j12) : j12 < j13 ? bVar.l(j11, j12) : bVar2.l(S(j11), j12);
        }

        @Override // org.joda.time.chrono.GJChronology.a, org.joda.time.field.a, org.joda.time.b
        public final long m(long j11, long j12) {
            long j13 = this.f79156d;
            org.joda.time.b bVar = this.f79154b;
            org.joda.time.b bVar2 = this.f79155c;
            return j11 >= j13 ? j12 >= j13 ? bVar2.m(j11, j12) : bVar.m(R(j11), j12) : j12 < j13 ? bVar.m(j11, j12) : bVar2.m(S(j11), j12);
        }

        @Override // org.joda.time.chrono.GJChronology.a, org.joda.time.field.a, org.joda.time.b
        public final int v(long j11) {
            return j11 >= this.f79156d ? this.f79155c.v(j11) : this.f79154b.v(j11);
        }

        b(GJChronology gJChronology, org.joda.time.b bVar, org.joda.time.b bVar2, org.joda.time.d dVar, org.joda.time.d dVar2, long j11) {
            this(bVar, bVar2, dVar, j11, false);
            this.f79159g = dVar2;
        }

        b(org.joda.time.b bVar, org.joda.time.b bVar2, org.joda.time.d dVar, long j11, boolean z11) {
            super(bVar, bVar2, null, j11, z11);
            this.f79158f = dVar == null ? new LinkedDurationField(this.f79158f, this) : dVar;
        }
    }

    private static long i0(long j11, org.joda.time.a aVar, org.joda.time.a aVar2) {
        return aVar2.G().M(aVar.G().d(j11), aVar2.h().M(aVar.h().d(j11), aVar2.R().M(aVar.R().d(j11), aVar2.T().M(aVar.T().d(j11), 0L))));
    }

    public static GJChronology j0(long j11, DateTimeZone dateTimeZone) {
        return k0(dateTimeZone, j11 == f79152K.getMillis() ? null : new Instant(j11), 4);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Serializable, java.lang.Object[]] */
    public static GJChronology k0(DateTimeZone dateTimeZone, org.joda.time.h hVar, int i11) {
        Instant instant;
        int i12 = org.joda.time.c.f79052b;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        if (hVar == null) {
            instant = f79152K;
        } else {
            instant = hVar.toInstant();
            if (new LocalDate(instant.getMillis(), GregorianChronology.K0(dateTimeZone, 4)).s() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        g gVar = new g(dateTimeZone, instant, i11);
        ConcurrentHashMap<g, GJChronology> concurrentHashMap = f79153L;
        GJChronology gJChronology = concurrentHashMap.get(gVar);
        if (gJChronology == null) {
            DateTimeZone dateTimeZone2 = DateTimeZone.f78989a;
            if (dateTimeZone == dateTimeZone2) {
                gJChronology = new GJChronology(null, new Object[]{JulianChronology.K0(dateTimeZone, i11), GregorianChronology.K0(dateTimeZone, i11), instant});
            } else {
                GJChronology k02 = k0(dateTimeZone2, instant, i11);
                gJChronology = new GJChronology(ZonedChronology.i0(k02, dateTimeZone), new Object[]{k02.iJulianChronology, k02.iGregorianChronology, k02.iCutoverInstant});
            }
            GJChronology putIfAbsent = concurrentHashMap.putIfAbsent(gVar, gJChronology);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return gJChronology;
    }

    private Object readResolve() {
        return k0(y(), this.iCutoverInstant, this.iGregorianChronology.x0());
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.a
    public final org.joda.time.a W() {
        return X(DateTimeZone.f78989a);
    }

    @Override // org.joda.time.a
    public final org.joda.time.a X(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        return dateTimeZone == y() ? this : k0(dateTimeZone, this.iCutoverInstant, this.iGregorianChronology.x0());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    protected final void c0(AssembledChronology.a aVar) {
        Object[] objArr = (Object[]) e0();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (d0() != null) {
            return;
        }
        if (julianChronology.x0() != gregorianChronology.x0()) {
            throw new IllegalArgumentException();
        }
        long j11 = this.iCutoverMillis;
        this.iGapDuration = j11 - o0(j11);
        aVar.a(gregorianChronology);
        if (gregorianChronology.G().d(this.iCutoverMillis) == 0) {
            aVar.f79110m = new a(this, julianChronology.H(), aVar.f79110m, this.iCutoverMillis);
            aVar.f79111n = new a(this, julianChronology.G(), aVar.f79111n, this.iCutoverMillis);
            aVar.f79112o = new a(this, julianChronology.O(), aVar.f79112o, this.iCutoverMillis);
            aVar.f79113p = new a(this, julianChronology.N(), aVar.f79113p, this.iCutoverMillis);
            aVar.f79114q = new a(this, julianChronology.J(), aVar.f79114q, this.iCutoverMillis);
            aVar.f79115r = new a(this, julianChronology.I(), aVar.f79115r, this.iCutoverMillis);
            aVar.f79116s = new a(this, julianChronology.C(), aVar.f79116s, this.iCutoverMillis);
            aVar.f79118u = new a(this, julianChronology.D(), aVar.f79118u, this.iCutoverMillis);
            aVar.f79117t = new a(this, julianChronology.e(), aVar.f79117t, this.iCutoverMillis);
            aVar.f79119v = new a(this, julianChronology.f(), aVar.f79119v, this.iCutoverMillis);
            aVar.f79120w = new a(this, julianChronology.A(), aVar.f79120w, this.iCutoverMillis);
        }
        aVar.f79097I = new a(this, julianChronology.l(), aVar.f79097I, this.iCutoverMillis);
        b bVar = new b(this, julianChronology.Y(), aVar.f79093E, this.iCutoverMillis);
        aVar.f79093E = bVar;
        aVar.f79107j = bVar.f79158f;
        aVar.f79094F = new b(julianChronology.a0(), aVar.f79094F, aVar.f79107j, this.iCutoverMillis, false);
        b bVar2 = new b(this, julianChronology.d(), aVar.f79096H, this.iCutoverMillis);
        aVar.f79096H = bVar2;
        aVar.f79108k = bVar2.f79158f;
        aVar.f79095G = new b(this, julianChronology.Z(), aVar.f79095G, aVar.f79107j, aVar.f79108k, this.iCutoverMillis);
        b bVar3 = new b(this, julianChronology.L(), aVar.f79092D, (org.joda.time.d) null, aVar.f79107j, this.iCutoverMillis);
        aVar.f79092D = bVar3;
        aVar.f79106i = bVar3.f79158f;
        b bVar4 = new b(julianChronology.T(), aVar.f79090B, (org.joda.time.d) null, this.iCutoverMillis, true);
        aVar.f79090B = bVar4;
        aVar.f79105h = bVar4.f79158f;
        aVar.f79091C = new b(this, julianChronology.U(), aVar.f79091C, aVar.f79105h, aVar.f79108k, this.iCutoverMillis);
        aVar.f79123z = new a(julianChronology.i(), aVar.f79123z, aVar.f79107j, gregorianChronology.Y().H(this.iCutoverMillis), false);
        aVar.f79089A = new a(julianChronology.R(), aVar.f79089A, aVar.f79105h, gregorianChronology.T().H(this.iCutoverMillis), true);
        a aVar2 = new a(this, julianChronology.g(), aVar.f79122y, this.iCutoverMillis);
        aVar2.f79159g = aVar.f79106i;
        aVar.f79122y = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJChronology)) {
            return false;
        }
        GJChronology gJChronology = (GJChronology) obj;
        return this.iCutoverMillis == gJChronology.iCutoverMillis && this.iGregorianChronology.x0() == gJChronology.iGregorianChronology.x0() && y().equals(gJChronology.y());
    }

    public final int hashCode() {
        return this.iCutoverInstant.hashCode() + this.iGregorianChronology.x0() + y().hashCode() + 25025;
    }

    final long l0(long j11) {
        return i0(j11, this.iGregorianChronology, this.iJulianChronology);
    }

    final long m0(long j11) {
        GregorianChronology gregorianChronology = this.iGregorianChronology;
        return this.iJulianChronology.u(gregorianChronology.Y().d(j11), gregorianChronology.L().d(j11), gregorianChronology.g().d(j11), gregorianChronology.G().d(j11));
    }

    final long n0(long j11) {
        return i0(j11, this.iJulianChronology, this.iGregorianChronology);
    }

    final long o0(long j11) {
        JulianChronology julianChronology = this.iJulianChronology;
        return this.iGregorianChronology.u(julianChronology.Y().d(j11), julianChronology.L().d(j11), julianChronology.g().d(j11), julianChronology.G().d(j11));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final long s(int i11) throws IllegalArgumentException {
        org.joda.time.a d02 = d0();
        if (d02 != null) {
            return d02.s(i11);
        }
        long s11 = this.iGregorianChronology.s(i11);
        if (s11 >= this.iCutoverMillis) {
            return s11;
        }
        long s12 = this.iJulianChronology.s(i11);
        if (s12 < this.iCutoverMillis) {
            return s12;
        }
        throw new IllegalArgumentException("Specified date does not exist");
    }

    @Override // org.joda.time.a
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology[");
        stringBuffer.append(y().h());
        if (this.iCutoverMillis != f79152K.getMillis()) {
            stringBuffer.append(",cutover=");
            DateTimeZone dateTimeZone = DateTimeZone.f78989a;
            (X(dateTimeZone).i().G(this.iCutoverMillis) == 0 ? org.joda.time.format.i.a() : org.joda.time.format.i.b()).l(X(dateTimeZone)).i(this.iCutoverMillis, stringBuffer);
        }
        if (this.iGregorianChronology.x0() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(this.iGregorianChronology.x0());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final long u(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        org.joda.time.a d02 = d0();
        if (d02 != null) {
            return d02.u(i11, i12, i13, i14);
        }
        long u11 = this.iGregorianChronology.u(i11, i12, i13, i14);
        if (u11 >= this.iCutoverMillis) {
            return u11;
        }
        long u12 = this.iJulianChronology.u(i11, i12, i13, i14);
        if (u12 < this.iCutoverMillis) {
            return u12;
        }
        throw new IllegalArgumentException("Specified date does not exist");
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.a
    public final DateTimeZone y() {
        org.joda.time.a d02 = d0();
        return d02 != null ? d02.y() : DateTimeZone.f78989a;
    }
}
