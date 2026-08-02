package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bkc extends wtc implements ug3, oma {
    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        boolean z = this.n && ((Boolean) tgj.x(this, m7a.a)).booleanValue();
        long j2 = m7a.b;
        qhe J = g1cVar.J(j);
        int i = J.a;
        if (z) {
            i = Math.max(i, m1cVar.e0(s75.b(j2)));
        }
        int i2 = J.b;
        if (z) {
            i2 = Math.max(i2, m1cVar.e0(s75.a(j2)));
        }
        return m1c.G0(m1cVar, i, i2, new b5a(i, J, i2, 2));
    }
}
