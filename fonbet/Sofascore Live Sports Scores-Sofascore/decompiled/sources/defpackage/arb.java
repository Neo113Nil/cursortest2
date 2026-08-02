package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class arb implements f2f {
    public final hq3 a;
    public c7a b;
    public ema c;
    public c7a d;
    public r6a e;

    public arb(hq3 hq3Var) {
        this.a = hq3Var;
    }

    @Override // defpackage.f2f
    public final long a(x6a x6aVar, long j, ema emaVar, long j2) {
        r6a r6aVar = this.e;
        if (r6aVar != null) {
            c7a c7aVar = this.b;
            if ((c7aVar == null ? false : c7a.a(c7aVar.a, j)) && this.c == emaVar) {
                c7a c7aVar2 = this.d;
                if (c7aVar2 != null ? c7a.a(c7aVar2.a, j2) : false) {
                    return r6aVar.a;
                }
            }
        }
        long a = this.a.a(x6aVar, j, emaVar, j2);
        this.b = new c7a(j);
        this.c = emaVar;
        this.d = new c7a(j2);
        this.e = new r6a(a);
        return a;
    }
}
