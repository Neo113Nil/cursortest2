package org.joda.time.chrono;

import B3.D;
import Bl0.k0;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.DecoratedDurationField;

/* loaded from: classes10.dex */
public final class LimitChronology extends AssembledChronology {
    private static final long serialVersionUID = 7670866536893052522L;

    /* renamed from: K, reason: collision with root package name */
    private transient LimitChronology f79169K;
    final DateTime iLowerLimit;
    final DateTime iUpperLimit;

    private class LimitDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 8049297699408782284L;

        LimitDurationField(org.joda.time.d dVar) {
            super(dVar, dVar.f());
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.d
        public final long a(int i11, long j11) {
            LimitChronology.this.g0(j11, null);
            long a11 = l().a(i11, j11);
            LimitChronology.this.g0(a11, "resulting");
            return a11;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.d
        public final long b(long j11, long j12) {
            LimitChronology.this.g0(j11, null);
            long b11 = l().b(j11, j12);
            LimitChronology.this.g0(b11, "resulting");
            return b11;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.d
        public final int d(long j11, long j12) {
            LimitChronology.this.g0(j11, "minuend");
            LimitChronology.this.g0(j12, "subtrahend");
            return l().d(j11, j12);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.d
        public final long e(long j11, long j12) {
            LimitChronology.this.g0(j11, "minuend");
            LimitChronology.this.g0(j12, "subtrahend");
            return l().e(j11, j12);
        }
    }

    private class LimitException extends IllegalArgumentException {
        private static final long serialVersionUID = -5924689995607498581L;
        private final boolean iIsLow;

        LimitException(String str, boolean z11) {
            super(str);
            this.iIsLow = z11;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            StringBuffer stringBuffer = new StringBuffer(85);
            stringBuffer.append("The");
            String message = super.getMessage();
            if (message != null) {
                stringBuffer.append(' ');
                stringBuffer.append(message);
            }
            stringBuffer.append(" instant is ");
            org.joda.time.format.b l11 = org.joda.time.format.i.b().l(LimitChronology.this.d0());
            if (this.iIsLow) {
                stringBuffer.append("below the supported minimum of ");
                l11.i(LimitChronology.this.iLowerLimit.getMillis(), stringBuffer);
            } else {
                stringBuffer.append("above the supported maximum of ");
                l11.i(LimitChronology.this.iUpperLimit.getMillis(), stringBuffer);
            }
            stringBuffer.append(" (");
            stringBuffer.append(LimitChronology.this.d0());
            stringBuffer.append(')');
            return stringBuffer.toString();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "IllegalArgumentException: " + getMessage();
        }
    }

    private class a extends org.joda.time.field.b {

        /* renamed from: c, reason: collision with root package name */
        private final org.joda.time.d f79170c;

        /* renamed from: d, reason: collision with root package name */
        private final org.joda.time.d f79171d;

        /* renamed from: e, reason: collision with root package name */
        private final org.joda.time.d f79172e;

        a(org.joda.time.b bVar, org.joda.time.d dVar, org.joda.time.d dVar2, org.joda.time.d dVar3) {
            super(bVar, bVar.C());
            this.f79170c = dVar;
            this.f79171d = dVar2;
            this.f79172e = dVar3;
        }

        @Override // org.joda.time.field.b, org.joda.time.b
        public final org.joda.time.d B() {
            return this.f79171d;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final boolean D(long j11) {
            LimitChronology.this.g0(j11, null);
            return R().D(j11);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long G(long j11) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, null);
            long G11 = R().G(j11);
            limitChronology.g0(G11, "resulting");
            return G11;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long H(long j11) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, null);
            long H11 = R().H(j11);
            limitChronology.g0(H11, "resulting");
            return H11;
        }

        @Override // org.joda.time.b
        public final long I(long j11) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, null);
            long I11 = R().I(j11);
            limitChronology.g0(I11, "resulting");
            return I11;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long J(long j11) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, null);
            long J11 = R().J(j11);
            limitChronology.g0(J11, "resulting");
            return J11;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long K(long j11) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, null);
            long K11 = R().K(j11);
            limitChronology.g0(K11, "resulting");
            return K11;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long L(long j11) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, null);
            long L11 = R().L(j11);
            limitChronology.g0(L11, "resulting");
            return L11;
        }

        @Override // org.joda.time.field.b, org.joda.time.b
        public final long M(int i11, long j11) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, null);
            long M11 = R().M(i11, j11);
            limitChronology.g0(M11, "resulting");
            return M11;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long N(long j11, String str, Locale locale) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, null);
            long N11 = R().N(j11, str, locale);
            limitChronology.g0(N11, "resulting");
            return N11;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long a(int i11, long j11) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, null);
            long a11 = R().a(i11, j11);
            limitChronology.g0(a11, "resulting");
            return a11;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long b(long j11, long j12) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, null);
            long b11 = R().b(j11, j12);
            limitChronology.g0(b11, "resulting");
            return b11;
        }

        @Override // org.joda.time.field.b, org.joda.time.b
        public final int d(long j11) {
            LimitChronology.this.g0(j11, null);
            return R().d(j11);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final String f(long j11, Locale locale) {
            LimitChronology.this.g0(j11, null);
            return R().f(j11, locale);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final String i(long j11, Locale locale) {
            LimitChronology.this.g0(j11, null);
            return R().i(j11, locale);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final int l(long j11, long j12) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, "minuend");
            limitChronology.g0(j12, "subtrahend");
            return R().l(j11, j12);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final long m(long j11, long j12) {
            LimitChronology limitChronology = LimitChronology.this;
            limitChronology.g0(j11, "minuend");
            limitChronology.g0(j12, "subtrahend");
            return R().m(j11, j12);
        }

        @Override // org.joda.time.field.b, org.joda.time.b
        public final org.joda.time.d n() {
            return this.f79170c;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final org.joda.time.d p() {
            return this.f79172e;
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final int s(Locale locale) {
            return R().s(locale);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final int v(long j11) {
            LimitChronology.this.g0(j11, null);
            return R().v(j11);
        }
    }

    private LimitChronology(org.joda.time.a aVar, DateTime dateTime, DateTime dateTime2) {
        super(aVar, null);
        this.iLowerLimit = dateTime;
        this.iUpperLimit = dateTime2;
    }

    private org.joda.time.b h0(org.joda.time.b bVar, HashMap<Object, Object> hashMap) {
        if (bVar == null || !bVar.F()) {
            return bVar;
        }
        if (hashMap.containsKey(bVar)) {
            return (org.joda.time.b) hashMap.get(bVar);
        }
        a aVar = new a(bVar, i0(bVar.n(), hashMap), i0(bVar.B(), hashMap), i0(bVar.p(), hashMap));
        hashMap.put(bVar, aVar);
        return aVar;
    }

    private org.joda.time.d i0(org.joda.time.d dVar, HashMap<Object, Object> hashMap) {
        if (dVar == null || !dVar.i()) {
            return dVar;
        }
        if (hashMap.containsKey(dVar)) {
            return (org.joda.time.d) hashMap.get(dVar);
        }
        LimitDurationField limitDurationField = new LimitDurationField(dVar);
        hashMap.put(dVar, limitDurationField);
        return limitDurationField;
    }

    public static LimitChronology j0(org.joda.time.a aVar, DateTime dateTime, DateTime dateTime2) {
        if (aVar == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        if (dateTime == null) {
            dateTime = null;
        }
        if (dateTime2 == null) {
            dateTime2 = null;
        }
        if (dateTime == null || dateTime2 == null || dateTime.b(dateTime2)) {
            return new LimitChronology(aVar, dateTime, dateTime2);
        }
        throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.a
    public final org.joda.time.a W() {
        return X(DateTimeZone.f78989a);
    }

    @Override // org.joda.time.a
    public final org.joda.time.a X(DateTimeZone dateTimeZone) {
        LimitChronology limitChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        if (dateTimeZone == y()) {
            return this;
        }
        DateTimeZone dateTimeZone2 = DateTimeZone.f78989a;
        if (dateTimeZone == dateTimeZone2 && (limitChronology = this.f79169K) != null) {
            return limitChronology;
        }
        DateTime dateTime = this.iLowerLimit;
        if (dateTime != null) {
            MutableDateTime mutableDateTime = new MutableDateTime(dateTime.getMillis(), dateTime.getChronology().y());
            mutableDateTime.j(dateTimeZone);
            dateTime = mutableDateTime.d();
        }
        DateTime dateTime2 = this.iUpperLimit;
        if (dateTime2 != null) {
            MutableDateTime mutableDateTime2 = new MutableDateTime(dateTime2.getMillis(), dateTime2.getChronology().y());
            mutableDateTime2.j(dateTimeZone);
            dateTime2 = mutableDateTime2.d();
        }
        LimitChronology j02 = j0(d0().X(dateTimeZone), dateTime, dateTime2);
        if (dateTimeZone == dateTimeZone2) {
            this.f79169K = j02;
        }
        return j02;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    protected final void c0(AssembledChronology.a aVar) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        aVar.f79109l = i0(aVar.f79109l, hashMap);
        aVar.f79108k = i0(aVar.f79108k, hashMap);
        aVar.f79107j = i0(aVar.f79107j, hashMap);
        aVar.f79106i = i0(aVar.f79106i, hashMap);
        aVar.f79105h = i0(aVar.f79105h, hashMap);
        aVar.f79104g = i0(aVar.f79104g, hashMap);
        aVar.f79103f = i0(aVar.f79103f, hashMap);
        aVar.f79102e = i0(aVar.f79102e, hashMap);
        aVar.f79101d = i0(aVar.f79101d, hashMap);
        aVar.f79100c = i0(aVar.f79100c, hashMap);
        aVar.f79099b = i0(aVar.f79099b, hashMap);
        aVar.f79098a = i0(aVar.f79098a, hashMap);
        aVar.f79093E = h0(aVar.f79093E, hashMap);
        aVar.f79094F = h0(aVar.f79094F, hashMap);
        aVar.f79095G = h0(aVar.f79095G, hashMap);
        aVar.f79096H = h0(aVar.f79096H, hashMap);
        aVar.f79097I = h0(aVar.f79097I, hashMap);
        aVar.f79121x = h0(aVar.f79121x, hashMap);
        aVar.f79122y = h0(aVar.f79122y, hashMap);
        aVar.f79123z = h0(aVar.f79123z, hashMap);
        aVar.f79092D = h0(aVar.f79092D, hashMap);
        aVar.f79089A = h0(aVar.f79089A, hashMap);
        aVar.f79090B = h0(aVar.f79090B, hashMap);
        aVar.f79091C = h0(aVar.f79091C, hashMap);
        aVar.f79110m = h0(aVar.f79110m, hashMap);
        aVar.f79111n = h0(aVar.f79111n, hashMap);
        aVar.f79112o = h0(aVar.f79112o, hashMap);
        aVar.f79113p = h0(aVar.f79113p, hashMap);
        aVar.f79114q = h0(aVar.f79114q, hashMap);
        aVar.f79115r = h0(aVar.f79115r, hashMap);
        aVar.f79116s = h0(aVar.f79116s, hashMap);
        aVar.f79118u = h0(aVar.f79118u, hashMap);
        aVar.f79117t = h0(aVar.f79117t, hashMap);
        aVar.f79119v = h0(aVar.f79119v, hashMap);
        aVar.f79120w = h0(aVar.f79120w, hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitChronology)) {
            return false;
        }
        LimitChronology limitChronology = (LimitChronology) obj;
        return d0().equals(limitChronology.d0()) && k0.o(this.iLowerLimit, limitChronology.iLowerLimit) && k0.o(this.iUpperLimit, limitChronology.iUpperLimit);
    }

    final void g0(long j11, String str) {
        DateTime dateTime = this.iLowerLimit;
        if (dateTime != null && j11 < dateTime.getMillis()) {
            throw new LimitException(str, true);
        }
        DateTime dateTime2 = this.iUpperLimit;
        if (dateTime2 != null && j11 >= dateTime2.getMillis()) {
            throw new LimitException(str, false);
        }
    }

    public final int hashCode() {
        DateTime dateTime = this.iLowerLimit;
        int hashCode = (dateTime != null ? dateTime.hashCode() : 0) + 317351877;
        DateTime dateTime2 = this.iUpperLimit;
        return (d0().hashCode() * 7) + hashCode + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final long s(int i11) throws IllegalArgumentException {
        long s11 = d0().s(i11);
        g0(s11, "resulting");
        return s11;
    }

    @Override // org.joda.time.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LimitChronology[");
        sb2.append(d0().toString());
        sb2.append(", ");
        DateTime dateTime = this.iLowerLimit;
        sb2.append(dateTime == null ? "NoLimit" : dateTime.toString());
        sb2.append(", ");
        DateTime dateTime2 = this.iUpperLimit;
        return D.c(sb2, dateTime2 != null ? dateTime2.toString() : "NoLimit", ']');
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final long u(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        long u11 = d0().u(i11, i12, i13, i14);
        g0(u11, "resulting");
        return u11;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.a
    public final long v(long j11) throws IllegalArgumentException {
        g0(j11, null);
        long v11 = d0().v(j11);
        g0(v11, "resulting");
        return v11;
    }
}
