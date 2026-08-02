package ig;

import Fm.C3051a;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kg.C7676a;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class e extends Lf.a implements mg.d, mg.f, Comparable<e>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final e f66405d = new e(0, 0);

    /* renamed from: b, reason: collision with root package name */
    private final long f66406b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66407c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66408a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f66409b;

        static {
            int[] iArr = new int[mg.b.values().length];
            f66409b = iArr;
            try {
                iArr[mg.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66409b[mg.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66409b[mg.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66409b[mg.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66409b[mg.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66409b[mg.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66409b[mg.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66409b[mg.b.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[EnumC8145a.values().length];
            f66408a = iArr2;
            try {
                iArr2[EnumC8145a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66408a[EnumC8145a.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66408a[EnumC8145a.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f66408a[EnumC8145a.INSTANT_SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        a1(-31557014167219200L, 0L);
        a1(31556889864403199L, 999999999L);
    }

    private e(long j11, int i11) {
        super(false);
        this.f66406b = j11;
        this.f66407c = i11;
    }

    private static e H0(int i11, long j11) {
        if ((i11 | j11) == 0) {
            return f66405d;
        }
        if (j11 < -31557014167219200L || j11 > 31556889864403199L) {
            throw new C7073b("Instant exceeds minimum or maximum instant");
        }
        return new e(j11, i11);
    }

    public static e T0(long j11) {
        return H0(lg.c.d(1000, j11) * 1000000, lg.c.b(j11, 1000L));
    }

    public static e W0(long j11) {
        return H0(0, j11);
    }

    public static e a1(long j11, long j12) {
        return H0(lg.c.d(1000000000, j12), lg.c.g(j11, lg.c.b(j12, 1000000000L)));
    }

    private e c1(long j11, long j12) {
        if ((j11 | j12) == 0) {
            return this;
        }
        return a1(lg.c.g(lg.c.g(this.f66406b, j11), j12 / 1000000000), this.f66407c + (j12 % 1000000000));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 2, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        int a11 = lg.c.a(this.f66406b, eVar.f66406b);
        return a11 != 0 ? a11 : this.f66407c - eVar.f66407c;
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.INSTANT_SECONDS || hVar == EnumC8145a.NANO_OF_SECOND || hVar == EnumC8145a.MICRO_OF_SECOND || hVar == EnumC8145a.MILLI_OF_SECOND : hVar != null && hVar.a(this);
    }

    public final long L0() {
        return this.f66406b;
    }

    public final int M0() {
        return this.f66407c;
    }

    @Override // Lf.a, mg.e
    public final int Q(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return super.p(hVar).a(hVar.f(this), hVar);
        }
        int i11 = a.f66408a[((EnumC8145a) hVar).ordinal()];
        int i12 = this.f66407c;
        if (i11 == 1) {
            return i12;
        }
        if (i11 == 2) {
            return i12 / 1000;
        }
        if (i11 == 3) {
            return i12 / 1000000;
        }
        throw new mg.l(C3051a.c("Unsupported field: ", hVar));
    }

    @Override // mg.f
    public final mg.d R(mg.d dVar) {
        return dVar.j1(this.f66406b, EnumC8145a.INSTANT_SECONDS).j1(this.f66407c, EnumC8145a.NANO_OF_SECOND);
    }

    @Override // mg.d
    /* renamed from: Z */
    public final mg.d j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (e) hVar.e(this, j11);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        enumC8145a.i(j11);
        int i11 = a.f66408a[enumC8145a.ordinal()];
        int i12 = this.f66407c;
        long j12 = this.f66406b;
        if (i11 != 1) {
            if (i11 == 2) {
                int i13 = ((int) j11) * 1000;
                if (i13 != i12) {
                    return H0(i13, j12);
                }
            } else if (i11 == 3) {
                int i14 = ((int) j11) * 1000000;
                if (i14 != i12) {
                    return H0(i14, j12);
                }
            } else {
                if (i11 != 4) {
                    throw new mg.l(C3051a.c("Unsupported field: ", hVar));
                }
                if (j11 != j12) {
                    return H0(i12, j11);
                }
            }
        } else if (j11 != i12) {
            return H0((int) j11, j12);
        }
        return this;
    }

    @Override // Lf.a, mg.e
    public final <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.e()) {
            return (R) mg.b.NANOS;
        }
        if (jVar == mg.i.b() || jVar == mg.i.c() || jVar == mg.i.a() || jVar == mg.i.g() || jVar == mg.i.f() || jVar == mg.i.d()) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // mg.d
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public final e T0(long j11, mg.k kVar) {
        if (!(kVar instanceof mg.b)) {
            return (e) kVar.a(this, j11);
        }
        switch (a.f66409b[((mg.b) kVar).ordinal()]) {
            case 1:
                return c1(0L, j11);
            case 2:
                return c1(j11 / 1000000, (j11 % 1000000) * 1000);
            case 3:
                return c1(j11 / 1000, (j11 % 1000) * 1000000);
            case 4:
                return c1(j11, 0L);
            case 5:
                return c1(lg.c.h(60, j11), 0L);
            case 6:
                return c1(lg.c.h(3600, j11), 0L);
            case 7:
                return c1(lg.c.h(43200, j11), 0L);
            case 8:
                return c1(lg.c.h(86400, j11), 0L);
            default:
                throw new mg.l("Unsupported unit: " + kVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f66406b == eVar.f66406b && this.f66407c == eVar.f66407c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f66406b;
        return (this.f66407c * 51) + ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // mg.d
    /* renamed from: j */
    public final mg.d k1(f fVar) {
        return (e) fVar.R(this);
    }

    final void j1(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f66406b);
        dataOutput.writeInt(this.f66407c);
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        int i11;
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.f(this);
        }
        int i12 = a.f66408a[((EnumC8145a) hVar).ordinal()];
        int i13 = this.f66407c;
        if (i12 == 1) {
            return i13;
        }
        if (i12 == 2) {
            i11 = i13 / 1000;
        } else {
            if (i12 != 3) {
                if (i12 == 4) {
                    return this.f66406b;
                }
                throw new mg.l(C3051a.c("Unsupported field: ", hVar));
            }
            i11 = i13 / 1000000;
        }
        return i11;
    }

    @Override // mg.d
    public final mg.d s(long j11, mg.k kVar) {
        return j11 == Long.MIN_VALUE ? W0(Long.MAX_VALUE, kVar).W0(1L, kVar) : W0(-j11, kVar);
    }

    @Override // Lf.a
    public final String toString() {
        return C7676a.f71524f.a(this);
    }
}
