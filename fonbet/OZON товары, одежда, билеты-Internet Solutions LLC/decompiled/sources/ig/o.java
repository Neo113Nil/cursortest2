package ig;

import Fm.C3051a;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class o extends Lf.a implements mg.d, mg.f, Comparable<o>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f66447d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f66448b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66449c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66450a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f66451b;

        static {
            int[] iArr = new int[mg.b.values().length];
            f66451b = iArr;
            try {
                iArr[mg.b.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66451b[mg.b.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66451b[mg.b.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66451b[mg.b.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66451b[mg.b.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66451b[mg.b.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[EnumC8145a.values().length];
            f66450a = iArr2;
            try {
                iArr2[EnumC8145a.MONTH_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66450a[EnumC8145a.PROLEPTIC_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66450a[EnumC8145a.YEAR_OF_ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66450a[EnumC8145a.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66450a[EnumC8145a.ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        kg.b bVar = new kg.b();
        bVar.p(EnumC8145a.YEAR, 4, 10, kg.i.EXCEEDS_PAD);
        bVar.e('-');
        bVar.o(EnumC8145a.MONTH_OF_YEAR, 2);
        bVar.w();
    }

    private o(int i11, int i12) {
        super(false);
        this.f66448b = i11;
        this.f66449c = i12;
    }

    public static o E0(int i11, int i12) {
        EnumC8145a.YEAR.i(i11);
        EnumC8145a.MONTH_OF_YEAR.i(i12);
        return new o(i11, i12);
    }

    private o T0(int i11, int i12) {
        return (this.f66448b == i11 && this.f66449c == i12) ? this : new o(i11, i12);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 68, this);
    }

    @Override // mg.d
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final o T0(long j11, mg.k kVar) {
        if (!(kVar instanceof mg.b)) {
            return (o) kVar.a(this, j11);
        }
        switch (a.f66451b[((mg.b) kVar).ordinal()]) {
            case 1:
                return L0(j11);
            case 2:
                return M0(j11);
            case 3:
                return M0(lg.c.h(10, j11));
            case 4:
                return M0(lg.c.h(100, j11));
            case 5:
                return M0(lg.c.h(1000, j11));
            case 6:
                EnumC8145a enumC8145a = EnumC8145a.ERA;
                return c1(lg.c.g(m(enumC8145a), j11), enumC8145a);
            default:
                throw new mg.l("Unsupported unit: " + kVar);
        }
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.YEAR || hVar == EnumC8145a.MONTH_OF_YEAR || hVar == EnumC8145a.PROLEPTIC_MONTH || hVar == EnumC8145a.YEAR_OF_ERA || hVar == EnumC8145a.ERA : hVar != null && hVar.a(this);
    }

    public final o L0(long j11) {
        if (j11 == 0) {
            return this;
        }
        long j12 = (this.f66448b * 12) + (this.f66449c - 1) + j11;
        return T0(EnumC8145a.YEAR.h(lg.c.b(j12, 12L)), lg.c.d(12, j12) + 1);
    }

    public final o M0(long j11) {
        return j11 == 0 ? this : T0(EnumC8145a.YEAR.h(this.f66448b + j11), this.f66449c);
    }

    @Override // Lf.a, mg.e
    public final int Q(mg.h hVar) {
        return p(hVar).a(m(hVar), hVar);
    }

    @Override // mg.f
    public final mg.d R(mg.d dVar) {
        if (!jg.g.g(dVar).equals(jg.l.f70047c)) {
            throw new C7073b("Adjustment only supported on ISO date-time");
        }
        return dVar.j1((this.f66448b * 12) + (this.f66449c - 1), EnumC8145a.PROLEPTIC_MONTH);
    }

    @Override // mg.d
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final o j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (o) hVar.e(this, j11);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        enumC8145a.i(j11);
        int i11 = a.f66450a[enumC8145a.ordinal()];
        int i12 = this.f66448b;
        if (i11 == 1) {
            int i13 = (int) j11;
            EnumC8145a.MONTH_OF_YEAR.i(i13);
            return T0(i12, i13);
        }
        if (i11 == 2) {
            return L0(j11 - m(EnumC8145a.PROLEPTIC_MONTH));
        }
        int i14 = this.f66449c;
        if (i11 == 3) {
            if (i12 < 1) {
                j11 = 1 - j11;
            }
            int i15 = (int) j11;
            EnumC8145a.YEAR.i(i15);
            return T0(i15, i14);
        }
        if (i11 == 4) {
            int i16 = (int) j11;
            EnumC8145a.YEAR.i(i16);
            return T0(i16, i14);
        }
        if (i11 != 5) {
            throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
        if (m(EnumC8145a.ERA) == j11) {
            return this;
        }
        int i17 = 1 - i12;
        EnumC8145a.YEAR.i(i17);
        return T0(i17, i14);
    }

    final void a1(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f66448b);
        dataOutput.writeByte(this.f66449c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(o oVar) {
        o oVar2 = oVar;
        int i11 = this.f66448b - oVar2.f66448b;
        return i11 == 0 ? this.f66449c - oVar2.f66449c : i11;
    }

    @Override // Lf.a, mg.e
    public final <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.a()) {
            return (R) jg.l.f70047c;
        }
        if (jVar == mg.i.e()) {
            return (R) mg.b.MONTHS;
        }
        if (jVar == mg.i.b() || jVar == mg.i.c() || jVar == mg.i.f() || jVar == mg.i.g() || jVar == mg.i.d()) {
            return null;
        }
        return (R) super.d(jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f66448b == oVar.f66448b && this.f66449c == oVar.f66449c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f66449c << 27) ^ this.f66448b;
    }

    @Override // mg.d
    /* renamed from: j */
    public final mg.d k1(f fVar) {
        return (o) fVar.R(this);
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.f(this);
        }
        int i11 = a.f66450a[((EnumC8145a) hVar).ordinal()];
        int i12 = this.f66449c;
        if (i11 == 1) {
            return i12;
        }
        int i13 = this.f66448b;
        if (i11 == 2) {
            return (i13 * 12) + (i12 - 1);
        }
        if (i11 == 3) {
            if (i13 < 1) {
                i13 = 1 - i13;
            }
            return i13;
        }
        if (i11 == 4) {
            return i13;
        }
        if (i11 == 5) {
            return i13 < 1 ? 0 : 1;
        }
        throw new mg.l(C3051a.c("Unsupported field: ", hVar));
    }

    @Override // Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        if (hVar == EnumC8145a.YEAR_OF_ERA) {
            return mg.m.h(1L, this.f66448b <= 0 ? 1000000000L : 999999999L);
        }
        return super.p(hVar);
    }

    @Override // mg.d
    public final mg.d s(long j11, mg.k kVar) {
        return j11 == Long.MIN_VALUE ? W0(Long.MAX_VALUE, kVar).W0(1L, kVar) : W0(-j11, kVar);
    }

    @Override // Lf.a
    public final String toString() {
        int i11 = this.f66448b;
        int abs = Math.abs(i11);
        StringBuilder sb2 = new StringBuilder(9);
        if (abs >= 1000) {
            sb2.append(i11);
        } else if (i11 < 0) {
            sb2.append(i11 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i11 + 10000);
            sb2.deleteCharAt(0);
        }
        int i12 = this.f66449c;
        sb2.append(i12 < 10 ? "-0" : "-");
        sb2.append(i12);
        return sb2.toString();
    }
}
