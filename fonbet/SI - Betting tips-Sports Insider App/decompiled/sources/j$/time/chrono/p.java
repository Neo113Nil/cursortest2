package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class p extends d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a, reason: collision with root package name */
    public final transient n f17341a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f17342b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f17343c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f17344d;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime E(j$.time.j jVar) {
        return new f(this, jVar);
    }

    public p(n nVar, int i5, int i10, int i11) {
        nVar.S(i5, i10, i11);
        this.f17341a = nVar;
        this.f17342b = i5;
        this.f17343c = i10;
        this.f17344d = i11;
    }

    public p(n nVar, long j) {
        int i5 = (int) j;
        nVar.P();
        if (i5 < nVar.f17334e || i5 >= nVar.f17335f) {
            throw new j$.time.b("Hijrah date out of range");
        }
        int binarySearch = Arrays.binarySearch(nVar.f17333d, i5);
        binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
        int[] iArr = {nVar.R(binarySearch), ((nVar.f17336g + binarySearch) % 12) + 1, (i5 - nVar.f17333d[binarySearch]) + 1};
        this.f17341a = nVar;
        this.f17342b = iArr[0];
        this.f17343c = iArr[1];
        this.f17344d = iArr[2];
    }

    @Override // j$.time.chrono.b
    public final k a() {
        return this.f17341a;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final l G() {
        return q.AH;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int M() {
        return this.f17341a.V(this.f17342b, 12);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.j(this);
        }
        if (!j$.com.android.tools.r8.a.q(this, pVar)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i5 = o.f17340a[aVar.ordinal()];
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? this.f17341a.q(aVar) : j$.time.temporal.s.f(1L, 5L) : j$.time.temporal.s.f(1L, M()) : j$.time.temporal.s.f(1L, this.f17341a.T(this.f17342b, this.f17343c));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.x(this);
        }
        switch (o.f17340a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.f17344d;
            case 2:
                return T();
            case 3:
                return ((this.f17344d - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.R(D() + 3, 7)) + 1;
            case 5:
                return ((this.f17344d - 1) % 7) + 1;
            case 6:
                return ((T() - 1) % 7) + 1;
            case 7:
                return D();
            case 8:
                return ((T() - 1) / 7) + 1;
            case 9:
                return this.f17343c;
            case 10:
                return ((this.f17342b * 12) + this.f17343c) - 1;
            case 11:
                return this.f17342b;
            case 12:
                return this.f17342b;
            case 13:
                return this.f17342b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final p c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (p) super.c(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        this.f17341a.q(aVar).b(j, aVar);
        int i5 = (int) j;
        switch (o.f17340a[aVar.ordinal()]) {
            case 1:
                return W(this.f17342b, this.f17343c, i5);
            case 2:
                return Q(Math.min(i5, M()) - T());
            case 3:
                return Q((j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return Q(j - (((int) j$.com.android.tools.r8.a.R(D() + 3, 7)) + 1));
            case 5:
                return Q(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return Q(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new p(this.f17341a, j);
            case 8:
                return Q((j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return W(this.f17342b, i5, this.f17344d);
            case 10:
                return R(j - (((this.f17342b * 12) + this.f17343c) - 1));
            case 11:
                if (this.f17342b < 1) {
                    i5 = 1 - i5;
                }
                return W(i5, this.f17343c, this.f17344d);
            case 12:
                return W(i5, this.f17343c, this.f17344d);
            case 13:
                return W(1 - this.f17342b, this.f17343c, this.f17344d);
            default:
                throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", pVar));
        }
    }

    public final p W(int i5, int i10, int i11) {
        int T = this.f17341a.T(i5, i10);
        if (i11 > T) {
            i11 = T;
        }
        return new p(this.f17341a, i5, i10, i11);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(j$.time.g gVar) {
        return (p) super.w(gVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b w(j$.time.temporal.m mVar) {
        return (p) super.w(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b J(j$.time.temporal.o oVar) {
        return (p) super.J(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long D() {
        return this.f17341a.S(this.f17342b, this.f17343c, this.f17344d);
    }

    public final int T() {
        return this.f17341a.V(this.f17342b, this.f17343c - 1) + this.f17344d;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean p() {
        return this.f17341a.O(this.f17342b);
    }

    @Override // j$.time.chrono.d
    public final b S(long j) {
        if (j == 0) {
            return this;
        }
        long j6 = this.f17342b + ((int) j);
        int i5 = (int) j6;
        if (j6 == i5) {
            return W(i5, this.f17343c, this.f17344d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.d
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final p R(long j) {
        if (j == 0) {
            return this;
        }
        long j6 = (this.f17342b * 12) + (this.f17343c - 1) + j;
        n nVar = this.f17341a;
        long S = j$.com.android.tools.r8.a.S(j6, 12L);
        if (S >= nVar.R(0) && S <= nVar.R(nVar.f17333d.length - 1) - 1) {
            return W((int) S, ((int) j$.com.android.tools.r8.a.R(j6, 12L)) + 1, this.f17344d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + S);
    }

    @Override // j$.time.chrono.d
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final p Q(long j) {
        return new p(this.f17341a, D() + j);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b d(long j, TemporalUnit temporalUnit) {
        return (p) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, TemporalUnit temporalUnit) {
        return (p) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: r */
    public final b x(long j, TemporalUnit temporalUnit) {
        return (p) super.x(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return (p) super.x(j, chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f17342b == pVar.f17342b && this.f17343c == pVar.f17343c && this.f17344d == pVar.f17344d && this.f17341a.equals(pVar.f17341a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i5 = this.f17342b;
        int i10 = this.f17343c;
        int i11 = this.f17344d;
        this.f17341a.getClass();
        return (((i5 << 11) + (i10 << 6)) + i11) ^ ((i5 & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 6, this);
    }
}
