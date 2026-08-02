package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class umk implements qmk {
    public final int a;
    public final pmk b;
    public final bzf c;
    public final long d;
    public final long e;

    public umk(int i, pmk pmkVar, bzf bzfVar, long j) {
        this.a = i;
        this.b = pmkVar;
        this.c = bzfVar;
        if (i < 1) {
            a70.p("Iterations count can't be less than 1");
            throw null;
        }
        this.d = (pmkVar.m() + pmkVar.l()) * 1000000;
        this.e = j * 1000000;
    }

    public final long a(long j) {
        long j2 = j + this.e;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.d;
        long min = Math.min(j2 / j3, this.a - 1);
        return (this.c == bzf.a || min % 2 == 0) ? j2 - (min * j3) : ((min + 1) * j3) - j2;
    }

    public final j80 c(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        long j2 = this.e;
        long j3 = j + j2;
        long j4 = this.d;
        return j3 > j4 ? u(j4 - j2, j80Var, j80Var2, j80Var3) : j80Var2;
    }

    @Override // defpackage.nmk
    public final long d(j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return (this.a * this.d) - this.e;
    }

    @Override // defpackage.nmk
    public final j80 u(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return this.b.u(a(j), j80Var, j80Var2, c(j, j80Var, j80Var3, j80Var2));
    }

    @Override // defpackage.nmk
    public final j80 z(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return this.b.z(a(j), j80Var, j80Var2, c(j, j80Var, j80Var3, j80Var2));
    }
}
