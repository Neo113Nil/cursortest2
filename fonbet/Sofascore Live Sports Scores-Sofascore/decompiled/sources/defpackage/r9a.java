package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r9a extends o9a {
    public n9a p;
    public boolean q;

    @Override // defpackage.o9a, defpackage.oma
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        return this.p == n9a.a ? g1cVar.B(i) : g1cVar.G(i);
    }

    @Override // defpackage.o9a, defpackage.oma
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        return this.p == n9a.a ? g1cVar.B(i) : g1cVar.G(i);
    }

    @Override // defpackage.o9a
    public final long k1(g1c g1cVar, long j) {
        int B = this.p == n9a.a ? g1cVar.B(an3.g(j)) : g1cVar.G(an3.g(j));
        if (B < 0) {
            B = 0;
        }
        if (B < 0) {
            t3a.a("width must be >= 0");
        }
        return cn3.h(B, B, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.o9a
    public final boolean l1() {
        return this.q;
    }
}
