package org.joda.time.chrono;

import B0.A0;
import Bl0.k0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;

/* loaded from: classes6.dex */
abstract class BasicChronology extends AssembledChronology {

    /* renamed from: L, reason: collision with root package name */
    private static final MillisDurationField f79124L;

    /* renamed from: M, reason: collision with root package name */
    private static final PreciseDurationField f79125M;

    /* renamed from: N, reason: collision with root package name */
    private static final PreciseDurationField f79126N;

    /* renamed from: O, reason: collision with root package name */
    private static final PreciseDurationField f79127O;

    /* renamed from: P, reason: collision with root package name */
    private static final PreciseDurationField f79128P;

    /* renamed from: Q, reason: collision with root package name */
    private static final PreciseDurationField f79129Q;

    /* renamed from: R, reason: collision with root package name */
    private static final PreciseDurationField f79130R;

    /* renamed from: S, reason: collision with root package name */
    private static final org.joda.time.field.e f79131S;

    /* renamed from: X, reason: collision with root package name */
    private static final org.joda.time.field.e f79132X;

    /* renamed from: Y, reason: collision with root package name */
    private static final org.joda.time.field.e f79133Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final org.joda.time.field.e f79134Z;

    /* renamed from: r0, reason: collision with root package name */
    private static final org.joda.time.field.e f79135r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final org.joda.time.field.e f79136s0;
    private static final long serialVersionUID = 8283225332206808863L;

    /* renamed from: t0, reason: collision with root package name */
    private static final org.joda.time.field.e f79137t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final org.joda.time.field.e f79138u0;

    /* renamed from: v0, reason: collision with root package name */
    private static final org.joda.time.field.h f79139v0;

    /* renamed from: w0, reason: collision with root package name */
    private static final org.joda.time.field.h f79140w0;

    /* renamed from: x0, reason: collision with root package name */
    private static final org.joda.time.b f79141x0;

    /* renamed from: K, reason: collision with root package name */
    private final transient b[] f79142K;
    private final int iMinDaysInFirstWeek;

    private static class a extends org.joda.time.field.e {
        @Override // org.joda.time.field.a, org.joda.time.b
        public final long N(long j11, String str, Locale locale) {
            return M(j.g(locale).l(str), j11);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final String h(int i11, Locale locale) {
            return j.g(locale).m(i11);
        }

        @Override // org.joda.time.field.a, org.joda.time.b
        public final int s(Locale locale) {
            return j.g(locale).j();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f79143a;

        /* renamed from: b, reason: collision with root package name */
        public final long f79144b;

        b(int i11, long j11) {
            this.f79143a = i11;
            this.f79144b = j11;
        }
    }

    static {
        MillisDurationField millisDurationField = MillisDurationField.f79212a;
        f79124L = millisDurationField;
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.m(), 1000L);
        f79125M = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.j(), 60000L);
        f79126N = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.h(), 3600000L);
        f79127O = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.g(), 43200000L);
        f79128P = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.b(), 86400000L);
        f79129Q = preciseDurationField5;
        f79130R = new PreciseDurationField(DurationFieldType.n(), 604800000L);
        f79131S = new org.joda.time.field.e(DateTimeFieldType.V(), millisDurationField, preciseDurationField);
        f79132X = new org.joda.time.field.e(DateTimeFieldType.U(), millisDurationField, preciseDurationField5);
        f79133Y = new org.joda.time.field.e(DateTimeFieldType.a0(), preciseDurationField, preciseDurationField2);
        f79134Z = new org.joda.time.field.e(DateTimeFieldType.Z(), preciseDurationField, preciseDurationField5);
        f79135r0 = new org.joda.time.field.e(DateTimeFieldType.X(), preciseDurationField2, preciseDurationField3);
        f79136s0 = new org.joda.time.field.e(DateTimeFieldType.W(), preciseDurationField2, preciseDurationField5);
        org.joda.time.field.e eVar = new org.joda.time.field.e(DateTimeFieldType.S(), preciseDurationField3, preciseDurationField5);
        f79137t0 = eVar;
        org.joda.time.field.e eVar2 = new org.joda.time.field.e(DateTimeFieldType.T(), preciseDurationField3, preciseDurationField4);
        f79138u0 = eVar2;
        f79139v0 = new org.joda.time.field.h(eVar, DateTimeFieldType.H());
        f79140w0 = new org.joda.time.field.h(eVar2, DateTimeFieldType.I());
        f79141x0 = new a(DateTimeFieldType.R(), f79128P, f79129Q);
    }

    BasicChronology(ZonedChronology zonedChronology, int i11) {
        super(zonedChronology, null);
        this.f79142K = new b[UserVerificationMethods.USER_VERIFY_ALL];
        if (i11 < 1 || i11 > 7) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Invalid min days in first week: "));
        }
        this.iMinDaysInFirstWeek = i11;
    }

    private long o0(int i11, int i12, int i13, int i14) {
        long n02 = n0(i11, i12, i13);
        if (n02 == Long.MIN_VALUE) {
            n02 = n0(i11, i12, i13 + 1);
            i14 -= 86400000;
        }
        long j11 = i14 + n02;
        if (j11 < 0 && n02 > 0) {
            return Long.MAX_VALUE;
        }
        if (j11 <= 0 || n02 >= 0) {
            return j11;
        }
        return Long.MIN_VALUE;
    }

    static int q0(long j11) {
        long j12;
        if (j11 >= 0) {
            j12 = j11 / 86400000;
        } else {
            j12 = (j11 - 86399999) / 86400000;
            if (j12 < -3) {
                return ((int) ((j12 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j12 + 3) % 7)) + 1;
    }

    static int v0(long j11) {
        return j11 >= 0 ? (int) (j11 % 86400000) : ((int) ((j11 + 1) % 86400000)) + 86399999;
    }

    final int A0(int i11, long j11) {
        long t02 = t0(i11);
        if (j11 < t02) {
            return B0(i11 - 1);
        }
        if (j11 >= t0(i11 + 1)) {
            return 1;
        }
        return ((int) ((j11 - t02) / 604800000)) + 1;
    }

    final int B0(int i11) {
        return (int) ((t0(i11 + 1) - t0(i11)) / 604800000);
    }

    final int C0(long j11) {
        int D02 = D0(j11);
        int A02 = A0(D02, j11);
        return A02 == 1 ? D0(j11 + 604800000) : A02 > 51 ? D0(j11 - 1209600000) : D02;
    }

    final int D0(long j11) {
        long m02 = m0();
        long j02 = (j11 >> 1) + j0();
        if (j02 < 0) {
            j02 = (j02 - m02) + 1;
        }
        int i11 = (int) (j02 / m02);
        long F02 = F0(i11);
        long j12 = j11 - F02;
        if (j12 < 0) {
            return i11 - 1;
        }
        if (j12 >= 31536000000L) {
            return F02 + (I0(i11) ? 31622400000L : 31536000000L) <= j11 ? i11 + 1 : i11;
        }
        return i11;
    }

    abstract long E0(long j11, long j12);

    final long F0(int i11) {
        int i12 = i11 & 1023;
        b[] bVarArr = this.f79142K;
        b bVar = bVarArr[i12];
        if (bVar == null || bVar.f79143a != i11) {
            bVar = new b(i11, i0(i11));
            bVarArr[i12] = bVar;
        }
        return bVar.f79144b;
    }

    final long G0(int i11, int i12, int i13) {
        return ((i13 - 1) * 86400000) + F0(i11) + z0(i11, i12);
    }

    boolean H0(long j11) {
        return false;
    }

    abstract boolean I0(int i11);

    abstract long J0(int i11, long j11);

    @Override // org.joda.time.chrono.AssembledChronology
    protected void c0(AssembledChronology.a aVar) {
        aVar.f79098a = f79124L;
        aVar.f79099b = f79125M;
        aVar.f79100c = f79126N;
        aVar.f79101d = f79127O;
        aVar.f79102e = f79128P;
        aVar.f79103f = f79129Q;
        aVar.f79104g = f79130R;
        aVar.f79110m = f79131S;
        aVar.f79111n = f79132X;
        aVar.f79112o = f79133Y;
        aVar.f79113p = f79134Z;
        aVar.f79114q = f79135r0;
        aVar.f79115r = f79136s0;
        aVar.f79116s = f79137t0;
        aVar.f79118u = f79138u0;
        aVar.f79117t = f79139v0;
        aVar.f79119v = f79140w0;
        aVar.f79120w = f79141x0;
        f fVar = new f(this);
        aVar.f79093E = fVar;
        l lVar = new l(fVar, this);
        aVar.f79094F = lVar;
        org.joda.time.field.d dVar = new org.joda.time.field.d(lVar, 99);
        org.joda.time.field.c cVar = new org.joda.time.field.c(dVar, dVar.B(), DateTimeFieldType.G());
        aVar.f79096H = cVar;
        aVar.f79108k = cVar.n();
        aVar.f79095G = new org.joda.time.field.d(new org.joda.time.field.g((org.joda.time.field.c) aVar.f79096H), DateTimeFieldType.f0(), 1);
        aVar.f79097I = new i(this);
        aVar.f79121x = new h(this, aVar.f79103f);
        aVar.f79122y = new org.joda.time.chrono.a(this, aVar.f79103f);
        aVar.f79123z = new org.joda.time.chrono.b(this, aVar.f79103f);
        aVar.f79092D = new k(this);
        aVar.f79090B = new e(this);
        aVar.f79089A = new d(this, aVar.f79104g);
        aVar.f79091C = new org.joda.time.field.d(new org.joda.time.field.g(aVar.f79090B, aVar.f79108k, DateTimeFieldType.d0()), DateTimeFieldType.d0(), 1);
        aVar.f79107j = aVar.f79093E.n();
        aVar.f79106i = aVar.f79092D.n();
        aVar.f79105h = aVar.f79090B.n();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        return x0() == basicChronology.x0() && y().equals(basicChronology.y());
    }

    public int hashCode() {
        return y().hashCode() + (getClass().getName().hashCode() * 11) + x0();
    }

    abstract long i0(int i11);

    abstract long j0();

    abstract long k0();

    abstract long l0();

    abstract long m0();

    long n0(int i11, int i12, int i13) {
        k0.x(DateTimeFieldType.e0(), i11, w0() - 1, u0() + 1);
        k0.x(DateTimeFieldType.Y(), i12, 1, 12);
        int s02 = s0(i11, i12);
        if (i13 < 1 || i13 > s02) {
            throw new IllegalFieldValueException(DateTimeFieldType.J(), Integer.valueOf(i13), Integer.valueOf(s02), A0.a(i11, i12, "year: ", " month: "));
        }
        long G02 = G0(i11, i12, i13);
        if (G02 < 0 && i11 == u0() + 1) {
            return Long.MAX_VALUE;
        }
        if (G02 <= 0 || i11 != w0() - 1) {
            return G02;
        }
        return Long.MIN_VALUE;
    }

    final int p0(int i11, int i12, long j11) {
        return ((int) ((j11 - (F0(i11) + z0(i11, i12))) / 86400000)) + 1;
    }

    int r0(int i11, long j11) {
        int D02 = D0(j11);
        return s0(D02, y0(D02, j11));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.a
    public long s(int i11) throws IllegalArgumentException {
        org.joda.time.a d02 = d0();
        if (d02 != null) {
            return d02.s(i11);
        }
        k0.x(DateTimeFieldType.S(), 0, 0, 23);
        k0.x(DateTimeFieldType.X(), 0, 0, 59);
        k0.x(DateTimeFieldType.a0(), 0, 0, 59);
        k0.x(DateTimeFieldType.V(), 0, 0, 999);
        long j11 = 0;
        return o0(1, 1, i11, (int) ((1000 * j11) + (60000 * j11) + (3600000 * j11) + j11));
    }

    abstract int s0(int i11, int i12);

    final long t0(int i11) {
        long F02 = F0(i11);
        return q0(F02) > 8 - this.iMinDaysInFirstWeek ? ((8 - r8) * 86400000) + F02 : F02 - ((r8 - 1) * 86400000);
    }

    @Override // org.joda.time.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb2.append(name);
        sb2.append('[');
        DateTimeZone y11 = y();
        if (y11 != null) {
            sb2.append(y11.h());
        }
        if (x0() != 4) {
            sb2.append(",mdfw=");
            sb2.append(x0());
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.a
    public long u(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        org.joda.time.a d02 = d0();
        if (d02 != null) {
            return d02.u(i11, i12, i13, i14);
        }
        k0.x(DateTimeFieldType.U(), i14, 0, 86399999);
        return o0(i11, i12, i13, i14);
    }

    abstract int u0();

    abstract int w0();

    public int x0() {
        return this.iMinDaysInFirstWeek;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.a
    public DateTimeZone y() {
        org.joda.time.a d02 = d0();
        return d02 != null ? d02.y() : DateTimeZone.f78989a;
    }

    abstract int y0(int i11, long j11);

    abstract long z0(int i11, int i12);
}
