package ig;

import Fm.C3051a;
import ig.i;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class j extends Lf.a implements mg.f, Comparable<j>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f66432d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f66433b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66434c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66435a;

        static {
            int[] iArr = new int[EnumC8145a.values().length];
            f66435a = iArr;
            try {
                iArr[EnumC8145a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66435a[EnumC8145a.MONTH_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kg.b bVar = new kg.b();
        bVar.f("--");
        bVar.o(EnumC8145a.MONTH_OF_YEAR, 2);
        bVar.e('-');
        bVar.o(EnumC8145a.DAY_OF_MONTH, 2);
        bVar.w();
    }

    private j(int i11, int i12) {
        super(false);
        this.f66433b = i11;
        this.f66434c = i12;
    }

    public static j E0(int i11, int i12) {
        i g10 = i.g(i11);
        lg.c.e(g10, "month");
        EnumC8145a.DAY_OF_MONTH.i(i12);
        if (i12 <= g10.f()) {
            return new j(g10.b(), i12);
        }
        StringBuilder f7 = P4.f.f(i12, "Illegal value for DayOfMonth field, value ", " is not valid for month ");
        f7.append(g10.name());
        throw new C7073b(f7.toString());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 64, this);
    }

    final void H0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f66433b);
        dataOutput.writeByte(this.f66434c);
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.MONTH_OF_YEAR || hVar == EnumC8145a.DAY_OF_MONTH : hVar != null && hVar.a(this);
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
        mg.d j12 = dVar.j1(this.f66433b, EnumC8145a.MONTH_OF_YEAR);
        EnumC8145a enumC8145a = EnumC8145a.DAY_OF_MONTH;
        return j12.j1(Math.min(j12.p(enumC8145a).d(), this.f66434c), enumC8145a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(j jVar) {
        j jVar2 = jVar;
        int i11 = this.f66433b - jVar2.f66433b;
        return i11 == 0 ? this.f66434c - jVar2.f66434c : i11;
    }

    @Override // Lf.a, mg.e
    public final <R> R d(mg.j<R> jVar) {
        return jVar == mg.i.a() ? (R) jg.l.f70047c : (R) super.d(jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f66433b == jVar.f66433b && this.f66434c == jVar.f66434c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f66433b << 6) + this.f66434c;
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        int i11;
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.f(this);
        }
        int i12 = a.f66435a[((EnumC8145a) hVar).ordinal()];
        if (i12 == 1) {
            i11 = this.f66434c;
        } else {
            if (i12 != 2) {
                throw new mg.l(C3051a.c("Unsupported field: ", hVar));
            }
            i11 = this.f66433b;
        }
        return i11;
    }

    @Override // Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        if (hVar == EnumC8145a.MONTH_OF_YEAR) {
            return hVar.d();
        }
        if (hVar != EnumC8145a.DAY_OF_MONTH) {
            return super.p(hVar);
        }
        i g10 = i.g(this.f66433b);
        g10.getClass();
        int i11 = i.b.f66431a[g10.ordinal()];
        return mg.m.i(1L, 1L, i11 != 1 ? (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 30 : 31 : 28, i.g(r10).f());
    }

    @Override // Lf.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        int i11 = this.f66433b;
        sb2.append(i11 < 10 ? "0" : "");
        sb2.append(i11);
        int i12 = this.f66434c;
        sb2.append(i12 < 10 ? "-0" : "-");
        sb2.append(i12);
        return sb2.toString();
    }
}
