package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ro implements f2f {
    public final mv1 a;
    public final long b;

    public ro(mv1 mv1Var, long j) {
        this.a = mv1Var;
        this.b = j;
    }

    @Override // defpackage.f2f
    public final long a(x6a x6aVar, long j, ema emaVar, long j2) {
        mv1 mv1Var = this.a;
        long a = mv1Var.a(0L, (x6aVar.d() << 32) | (x6aVar.b() & 4294967295L), emaVar);
        long a2 = mv1Var.a(0L, j2, emaVar);
        long j3 = ((-((int) (a2 >> 32))) << 32) | ((-((int) (a2 & 4294967295L))) & 4294967295L);
        long j4 = this.b;
        return r6a.d(r6a.d(r6a.d(x6aVar.c(), a), j3), ((((int) (j4 >> 32)) * (emaVar == ema.a ? 1 : -1)) << 32) | (((int) (j4 & 4294967295L)) & 4294967295L));
    }
}
