package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o3e extends wtc implements oma {
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        int e0 = m1cVar.e0(this.q) + m1cVar.e0(this.o);
        int e02 = m1cVar.e0(this.r) + m1cVar.e0(this.p);
        qhe J = g1cVar.J(cn3.i(-e0, -e02, j));
        return m1c.G0(m1cVar, cn3.g(J.a + e0, j), cn3.f(J.b + e02, j), new ord(7, this, J));
    }
}
