package ig;

import Fm.C3051a;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class n extends Lf.a implements mg.d, mg.f, Comparable<n>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f66443c = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f66444b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66445a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f66446b;

        static {
            int[] iArr = new int[mg.b.values().length];
            f66446b = iArr;
            try {
                iArr[mg.b.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66446b[mg.b.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66446b[mg.b.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66446b[mg.b.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66446b[mg.b.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC8145a.values().length];
            f66445a = iArr2;
            try {
                iArr2[EnumC8145a.YEAR_OF_ERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66445a[EnumC8145a.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66445a[EnumC8145a.ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        kg.b bVar = new kg.b();
        bVar.p(EnumC8145a.YEAR, 4, 10, kg.i.EXCEEDS_PAD);
        bVar.w();
    }

    private n(int i11) {
        super(false);
        this.f66444b = i11;
    }

    public static boolean E0(long j11) {
        if ((3 & j11) == 0) {
            return j11 % 100 != 0 || j11 % 400 == 0;
        }
        return false;
    }

    public static n H0(int i11) {
        EnumC8145a.YEAR.i(i11);
        return new n(i11);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 67, this);
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.YEAR || hVar == EnumC8145a.YEAR_OF_ERA || hVar == EnumC8145a.ERA : hVar != null && hVar.a(this);
    }

    @Override // mg.d
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public final n T0(long j11, mg.k kVar) {
        if (!(kVar instanceof mg.b)) {
            return (n) kVar.a(this, j11);
        }
        int i11 = a.f66446b[((mg.b) kVar).ordinal()];
        if (i11 == 1) {
            return M0(j11);
        }
        if (i11 == 2) {
            return M0(lg.c.h(10, j11));
        }
        if (i11 == 3) {
            return M0(lg.c.h(100, j11));
        }
        if (i11 == 4) {
            return M0(lg.c.h(1000, j11));
        }
        if (i11 == 5) {
            EnumC8145a enumC8145a = EnumC8145a.ERA;
            return c1(lg.c.g(m(enumC8145a), j11), enumC8145a);
        }
        throw new mg.l("Unsupported unit: " + kVar);
    }

    public final n M0(long j11) {
        return j11 == 0 ? this : H0(EnumC8145a.YEAR.h(this.f66444b + j11));
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
        return dVar.j1(this.f66444b, EnumC8145a.YEAR);
    }

    @Override // mg.d
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final n j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (n) hVar.e(this, j11);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        enumC8145a.i(j11);
        int i11 = a.f66445a[enumC8145a.ordinal()];
        int i12 = this.f66444b;
        if (i11 == 1) {
            if (i12 < 1) {
                j11 = 1 - j11;
            }
            return H0((int) j11);
        }
        if (i11 == 2) {
            return H0((int) j11);
        }
        if (i11 == 3) {
            return m(EnumC8145a.ERA) == j11 ? this : H0(1 - i12);
        }
        throw new mg.l(C3051a.c("Unsupported field: ", hVar));
    }

    final void W0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f66444b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(n nVar) {
        return this.f66444b - nVar.f66444b;
    }

    @Override // Lf.a, mg.e
    public final <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.a()) {
            return (R) jg.l.f70047c;
        }
        if (jVar == mg.i.e()) {
            return (R) mg.b.YEARS;
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
        if (obj instanceof n) {
            if (this.f66444b == ((n) obj).f66444b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f66444b;
    }

    @Override // mg.d
    /* renamed from: j */
    public final mg.d k1(f fVar) {
        return (n) fVar.R(this);
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.f(this);
        }
        int i11 = a.f66445a[((EnumC8145a) hVar).ordinal()];
        int i12 = this.f66444b;
        if (i11 == 1) {
            if (i12 < 1) {
                i12 = 1 - i12;
            }
            return i12;
        }
        if (i11 == 2) {
            return i12;
        }
        if (i11 == 3) {
            return i12 < 1 ? 0 : 1;
        }
        throw new mg.l(C3051a.c("Unsupported field: ", hVar));
    }

    @Override // Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        if (hVar == EnumC8145a.YEAR_OF_ERA) {
            return mg.m.h(1L, this.f66444b <= 0 ? 1000000000L : 999999999L);
        }
        return super.p(hVar);
    }

    @Override // mg.d
    public final mg.d s(long j11, mg.k kVar) {
        return j11 == Long.MIN_VALUE ? W0(Long.MAX_VALUE, kVar).W0(1L, kVar) : W0(-j11, kVar);
    }

    @Override // Lf.a
    public final String toString() {
        return Integer.toString(this.f66444b);
    }
}
