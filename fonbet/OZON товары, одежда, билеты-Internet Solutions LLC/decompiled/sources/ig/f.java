package ig;

import Fm.C3051a;
import Gl.C3124a;
import T7.E;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import jg.AbstractC7423b;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class f extends AbstractC7423b implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final f f66410e = E1(-999999999, 1, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final f f66411f = E1(999999999, 12, 31);

    /* renamed from: b, reason: collision with root package name */
    private final int f66412b;

    /* renamed from: c, reason: collision with root package name */
    private final short f66413c;

    /* renamed from: d, reason: collision with root package name */
    private final short f66414d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66415a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f66416b;

        static {
            int[] iArr = new int[mg.b.values().length];
            f66416b = iArr;
            try {
                iArr[mg.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66416b[mg.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66416b[mg.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66416b[mg.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66416b[mg.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66416b[mg.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66416b[mg.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66416b[mg.b.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[EnumC8145a.values().length];
            f66415a = iArr2;
            try {
                iArr2[EnumC8145a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66415a[EnumC8145a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66415a[EnumC8145a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f66415a[EnumC8145a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f66415a[EnumC8145a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f66415a[EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f66415a[EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f66415a[EnumC8145a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f66415a[EnumC8145a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f66415a[EnumC8145a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f66415a[EnumC8145a.PROLEPTIC_MONTH.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f66415a[EnumC8145a.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f66415a[EnumC8145a.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private f(int i11, int i12, int i13) {
        this.f66412b = i11;
        this.f66413c = (short) i12;
        this.f66414d = (short) i13;
    }

    public static f E1(int i11, int i12, int i13) {
        EnumC8145a.YEAR.i(i11);
        EnumC8145a.MONTH_OF_YEAR.i(i12);
        EnumC8145a.DAY_OF_MONTH.i(i13);
        return k1(i11, i.g(i12), i13);
    }

    public static f F1(int i11, i iVar, int i12) {
        EnumC8145a.YEAR.i(i11);
        lg.c.e(iVar, "month");
        EnumC8145a.DAY_OF_MONTH.i(i12);
        return k1(i11, iVar, i12);
    }

    public static f J1(long j11) {
        long j12;
        EnumC8145a.EPOCH_DAY.i(j11);
        long j13 = 719468 + j11;
        if (j13 < 0) {
            long j14 = ((j11 + 719469) / 146097) - 1;
            j12 = j14 * 400;
            j13 += (-j14) * 146097;
        } else {
            j12 = 0;
        }
        long j15 = ((j13 * 400) + 591) / 146097;
        long j16 = j13 - ((j15 / 400) + (((j15 / 4) + (j15 * 365)) - (j15 / 100)));
        if (j16 < 0) {
            j15--;
            j16 = j13 - ((j15 / 400) + (((j15 / 4) + (365 * j15)) - (j15 / 100)));
        }
        int i11 = (int) j16;
        int i12 = ((i11 * 5) + 2) / 153;
        return new f(EnumC8145a.YEAR.h(j15 + j12 + (i12 / 10)), ((i12 + 2) % 12) + 1, (i11 - (((i12 * 306) + 5) / 10)) + 1);
    }

    private static f V1(int i11, int i12, int i13) {
        if (i12 == 2) {
            jg.l.f70047c.getClass();
            i13 = Math.min(i13, jg.l.n((long) i11) ? 29 : 28);
        } else if (i12 == 4 || i12 == 6 || i12 == 9 || i12 == 11) {
            i13 = Math.min(i13, 30);
        }
        return E1(i11, i12, i13);
    }

    private static f k1(int i11, i iVar, int i12) {
        if (i12 > 28) {
            jg.l.f70047c.getClass();
            if (i12 > iVar.e(jg.l.n(i11))) {
                if (i12 == 29) {
                    throw new C7073b(E.a(i11, "Invalid date 'February 29' as '", "' is not a leap year"));
                }
                throw new C7073b("Invalid date '" + iVar.name() + " " + i12 + "'");
            }
        }
        return new f(i11, iVar.b(), i12);
    }

    public static f l1(mg.e eVar) {
        f fVar = (f) eVar.d(mg.i.b());
        if (fVar != null) {
            return fVar;
        }
        throw new C7073b("Unable to obtain LocalDate from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private int m1(mg.h hVar) {
        int i11 = a.f66415a[((EnumC8145a) hVar).ordinal()];
        short s11 = this.f66414d;
        int i12 = this.f66412b;
        switch (i11) {
            case 1:
                return s11;
            case 2:
                return t1();
            case 3:
                return C3124a.a(s11, 1, 7, 1);
            case 4:
                return i12 >= 1 ? i12 : 1 - i12;
            case 5:
                return q1().a();
            case 6:
                return ((s11 - 1) % 7) + 1;
            case 7:
                return ((t1() - 1) % 7) + 1;
            case 8:
                throw new C7073b(C3051a.c("Field too large for an int: ", hVar));
            case 9:
                return ((t1() - 1) / 7) + 1;
            case 10:
                return this.f66413c;
            case 11:
                throw new C7073b(C3051a.c("Field too large for an int: ", hVar));
            case 12:
                return i12;
            case 13:
                return i12 >= 1 ? 1 : 0;
            default:
                throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 3, this);
    }

    @Override // jg.AbstractC7423b, lg.AbstractC7957b, mg.d
    /* renamed from: B1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f s(long j11, mg.b bVar) {
        return j11 == Long.MIN_VALUE ? O(Long.MAX_VALUE, bVar).O(1L, bVar) : O(-j11, bVar);
    }

    @Override // jg.AbstractC7423b
    public final jg.c E0(h hVar) {
        return g.v1(this, hVar);
    }

    @Override // jg.AbstractC7423b, java.lang.Comparable
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC7423b abstractC7423b) {
        return abstractC7423b instanceof f ? j1((f) abstractC7423b) : super.compareTo(abstractC7423b);
    }

    @Override // jg.AbstractC7423b
    public final jg.g L0() {
        return jg.l.f70047c;
    }

    @Override // jg.AbstractC7423b
    /* renamed from: L1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f T0(long j11, mg.k kVar) {
        if (!(kVar instanceof mg.b)) {
            return (f) kVar.a(this, j11);
        }
        switch (a.f66416b[((mg.b) kVar).ordinal()]) {
            case 1:
                return M1(j11);
            case 2:
                return M1(lg.c.h(7, j11));
            case 3:
                return R1(j11);
            case 4:
                return S1(j11);
            case 5:
                return S1(lg.c.h(10, j11));
            case 6:
                return S1(lg.c.h(100, j11));
            case 7:
                return S1(lg.c.h(1000, j11));
            case 8:
                EnumC8145a enumC8145a = EnumC8145a.ERA;
                return Z(lg.c.g(m(enumC8145a), j11), enumC8145a);
            default:
                throw new mg.l("Unsupported unit: " + kVar);
        }
    }

    public final f M1(long j11) {
        return j11 == 0 ? this : J1(lg.c.g(a1(), j11));
    }

    @Override // Lf.a, mg.e
    public final int Q(mg.h hVar) {
        return hVar instanceof EnumC8145a ? m1(hVar) : super.Q(hVar);
    }

    public final f R1(long j11) {
        if (j11 == 0) {
            return this;
        }
        long j12 = (this.f66412b * 12) + (this.f66413c - 1) + j11;
        return V1(EnumC8145a.YEAR.h(lg.c.b(j12, 12L)), lg.c.d(12, j12) + 1, this.f66414d);
    }

    public final f S1(long j11) {
        return j11 == 0 ? this : V1(EnumC8145a.YEAR.h(this.f66412b + j11), this.f66413c, this.f66414d);
    }

    @Override // jg.AbstractC7423b
    /* renamed from: X1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (f) hVar.e(this, j11);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        enumC8145a.i(j11);
        int i11 = a.f66415a[enumC8145a.ordinal()];
        short s11 = this.f66414d;
        short s12 = this.f66413c;
        int i12 = this.f66412b;
        switch (i11) {
            case 1:
                int i13 = (int) j11;
                if (s11 != i13) {
                    return E1(i12, s12, i13);
                }
                return this;
            case 2:
                return c2((int) j11);
            case 3:
                return M1(lg.c.h(7, j11 - m(EnumC8145a.ALIGNED_WEEK_OF_MONTH)));
            case 4:
                if (i12 < 1) {
                    j11 = 1 - j11;
                }
                return d2((int) j11);
            case 5:
                return M1(j11 - q1().a());
            case 6:
                return M1(j11 - m(EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return M1(j11 - m(EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return J1(j11);
            case 9:
                return M1(lg.c.h(7, j11 - m(EnumC8145a.ALIGNED_WEEK_OF_YEAR)));
            case 10:
                int i14 = (int) j11;
                if (s12 != i14) {
                    EnumC8145a.MONTH_OF_YEAR.i(i14);
                    return V1(i12, i14, s11);
                }
                return this;
            case 11:
                return R1(j11 - m(EnumC8145a.PROLEPTIC_MONTH));
            case 12:
                return d2((int) j11);
            case 13:
                if (m(EnumC8145a.ERA) != j11) {
                    return d2(1 - i12);
                }
                return this;
            default:
                throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
    }

    @Override // jg.AbstractC7423b
    public final long a1() {
        long j11 = this.f66412b;
        long j12 = this.f66413c;
        long j13 = 365 * j11;
        long j14 = (((367 * j12) - 362) / 12) + (j11 >= 0 ? ((j11 + 399) / 400) + (((3 + j11) / 4) - ((99 + j11) / 100)) + j13 : j13 - ((j11 / (-400)) + ((j11 / (-4)) - (j11 / (-100))))) + (this.f66414d - 1);
        if (j12 > 2) {
            j14 = !y1() ? j14 - 2 : j14 - 1;
        }
        return j14 - 719528;
    }

    @Override // jg.AbstractC7423b, mg.d
    /* renamed from: b2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f k1(mg.f fVar) {
        return fVar instanceof f ? (f) fVar : (f) fVar.R(this);
    }

    public final f c2(int i11) {
        if (t1() == i11) {
            return this;
        }
        EnumC8145a enumC8145a = EnumC8145a.YEAR;
        int i12 = this.f66412b;
        long j11 = i12;
        enumC8145a.i(j11);
        EnumC8145a.DAY_OF_YEAR.i(i11);
        jg.l.f70047c.getClass();
        boolean n11 = jg.l.n(j11);
        if (i11 == 366 && !n11) {
            throw new C7073b(E.a(i12, "Invalid date 'DayOfYear 366' as '", "' is not a leap year"));
        }
        i g10 = i.g(((i11 - 1) / 31) + 1);
        if (i11 > (g10.e(n11) + g10.a(n11)) - 1) {
            g10 = g10.h();
        }
        return k1(i12, g10, (i11 - g10.a(n11)) + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jg.AbstractC7423b, Lf.a, mg.e
    public final <R> R d(mg.j<R> jVar) {
        return jVar == mg.i.b() ? this : (R) super.d(jVar);
    }

    public final f d2(int i11) {
        if (this.f66412b == i11) {
            return this;
        }
        EnumC8145a.YEAR.i(i11);
        return V1(i11, this.f66413c, this.f66414d);
    }

    final void e2(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f66412b);
        dataOutput.writeByte(this.f66413c);
        dataOutput.writeByte(this.f66414d);
    }

    @Override // jg.AbstractC7423b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && j1((f) obj) == 0;
    }

    @Override // jg.AbstractC7423b
    public final int hashCode() {
        int i11 = this.f66412b;
        return (((i11 << 11) + (this.f66413c << 6)) + this.f66414d) ^ (i11 & (-2048));
    }

    final int j1(f fVar) {
        int i11 = this.f66412b - fVar.f66412b;
        if (i11 != 0) {
            return i11;
        }
        int i12 = this.f66413c - fVar.f66413c;
        return i12 == 0 ? this.f66414d - fVar.f66414d : i12;
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.EPOCH_DAY ? a1() : hVar == EnumC8145a.PROLEPTIC_MONTH ? (this.f66412b * 12) + (this.f66413c - 1) : m1(hVar) : hVar.f(this);
    }

    public final int n1() {
        return this.f66414d;
    }

    @Override // Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.g(this);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        if (!enumC8145a.b()) {
            throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
        int i11 = a.f66415a[enumC8145a.ordinal()];
        short s11 = this.f66413c;
        if (i11 == 1) {
            return mg.m.h(1L, s11 != 2 ? (s11 == 4 || s11 == 6 || s11 == 9 || s11 == 11) ? 30 : 31 : y1() ? 29 : 28);
        }
        if (i11 == 2) {
            return mg.m.h(1L, y1() ? 366 : 365);
        }
        if (i11 != 3) {
            return i11 != 4 ? ((EnumC8145a) hVar).d() : this.f66412b <= 0 ? mg.m.h(1L, 1000000000L) : mg.m.h(1L, 999999999L);
        }
        return mg.m.h(1L, (i.g(s11) != i.FEBRUARY || y1()) ? 5L : 4L);
    }

    public final EnumC7074c q1() {
        return EnumC7074c.b(lg.c.d(7, a1() + 3) + 1);
    }

    public final int t1() {
        return (i.g(this.f66413c).a(y1()) + this.f66414d) - 1;
    }

    @Override // jg.AbstractC7423b, Lf.a
    public final String toString() {
        int i11 = this.f66412b;
        int abs = Math.abs(i11);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs >= 1000) {
            if (i11 > 9999) {
                sb2.append('+');
            }
            sb2.append(i11);
        } else if (i11 < 0) {
            sb2.append(i11 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i11 + 10000);
            sb2.deleteCharAt(0);
        }
        short s11 = this.f66413c;
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        short s12 = this.f66414d;
        sb2.append(s12 < 10 ? "-0" : "-");
        sb2.append((int) s12);
        return sb2.toString();
    }

    public final int u1() {
        return this.f66413c;
    }

    public final int v1() {
        return this.f66412b;
    }

    public final boolean x1(AbstractC7423b abstractC7423b) {
        return abstractC7423b instanceof f ? j1((f) abstractC7423b) < 0 : a1() < abstractC7423b.a1();
    }

    public final boolean y1() {
        jg.l lVar = jg.l.f70047c;
        long j11 = this.f66412b;
        lVar.getClass();
        return jg.l.n(j11);
    }
}
