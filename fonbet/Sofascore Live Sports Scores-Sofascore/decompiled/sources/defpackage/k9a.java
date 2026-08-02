package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k9a extends o9a {
    public n9a p;
    public boolean q;

    @Override // defpackage.o9a, defpackage.oma
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        return this.p == n9a.a ? g1cVar.s(i) : g1cVar.b(i);
    }

    @Override // defpackage.o9a
    public final long k1(g1c g1cVar, long j) {
        int s = this.p == n9a.a ? g1cVar.s(an3.h(j)) : g1cVar.b(an3.h(j));
        if (s < 0) {
            s = 0;
        }
        if (s < 0) {
            t3a.a("height must be >= 0");
        }
        return cn3.h(0, Integer.MAX_VALUE, s, s);
    }

    @Override // defpackage.o9a
    public final boolean l1() {
        return this.q;
    }

    @Override // defpackage.o9a, defpackage.oma
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        return this.p == n9a.a ? g1cVar.s(i) : g1cVar.b(i);
    }
}
