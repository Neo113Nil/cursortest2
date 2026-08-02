package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p60 extends o9a {
    public pwj p;
    public e1d q;
    public r60 r;
    public long s;

    @Override // defpackage.wtc
    public final void e1() {
        this.s = -9223372034707292160L;
    }

    @Override // defpackage.o9a, defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        long j2;
        qhe J = g1cVar.J(j);
        if (m1cVar.W()) {
            j2 = (J.a << 32) | (J.b & 4294967295L);
        } else {
            pwj pwjVar = this.p;
            int i = J.a;
            if (pwjVar == null) {
                j2 = (i << 32) | (J.b & 4294967295L);
                this.s = j2;
            } else {
                long j3 = (J.b & 4294967295L) | (i << 32);
                owj a = pwjVar.a(new o60(this, j3, 0), new o60(this, j3, 1));
                this.r.f = a;
                j2 = ((c7a) a.getValue()).a;
                this.s = ((c7a) a.getValue()).a;
            }
        }
        return m1c.G0(m1cVar, (int) (j2 >> 32), (int) (4294967295L & j2), new n60(this, J, j2));
    }
}
