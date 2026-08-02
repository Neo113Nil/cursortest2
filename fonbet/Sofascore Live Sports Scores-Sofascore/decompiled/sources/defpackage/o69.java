package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o69 implements f2f {
    public final io a;
    public final pnd b;
    public long c = 0;

    public o69(io ioVar, pnd pndVar) {
        this.a = ioVar;
        this.b = pndVar;
    }

    @Override // defpackage.f2f
    public final long a(x6a x6aVar, long j, ema emaVar, long j2) {
        long a = this.b.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.c;
        }
        this.c = a;
        return r6a.d(r6a.d(x6aVar.c(), s6a.L(a)), this.a.a(j2, 0L, emaVar));
    }
}
