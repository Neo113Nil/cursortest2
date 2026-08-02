package n2;

import java.util.Iterator;
import m2.C8043a;
import n2.f;

/* loaded from: classes8.dex */
final class k extends p {
    k(m2.e eVar) {
        super(eVar);
    }

    private void n(f fVar) {
        f fVar2 = this.f76350h;
        fVar2.f76326k.add(fVar);
        fVar.f76327l.add(fVar2);
    }

    @Override // n2.p, n2.d
    public final void a(d dVar) {
        C8043a c8043a = (C8043a) this.f76344b;
        int c12 = c8043a.c1();
        f fVar = this.f76350h;
        Iterator it = fVar.f76327l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((f) it.next()).f76322g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (c12 == 0 || c12 == 2) {
            fVar.d(c8043a.d1() + i12);
        } else {
            fVar.d(c8043a.d1() + i11);
        }
    }

    @Override // n2.p
    final void d() {
        m2.e eVar = this.f76344b;
        if (eVar instanceof C8043a) {
            f fVar = this.f76350h;
            fVar.f76317b = true;
            C8043a c8043a = (C8043a) eVar;
            int c12 = c8043a.c1();
            boolean b12 = c8043a.b1();
            int i11 = 0;
            if (c12 == 0) {
                fVar.f76320e = f.a.LEFT;
                while (i11 < c8043a.f74240w0) {
                    m2.e eVar2 = c8043a.f74239v0[i11];
                    if (b12 || eVar2.M() != 8) {
                        f fVar2 = eVar2.f74126d.f76350h;
                        fVar2.f76326k.add(fVar);
                        fVar.f76327l.add(fVar2);
                    }
                    i11++;
                }
                n(this.f76344b.f74126d.f76350h);
                n(this.f76344b.f74126d.f76351i);
                return;
            }
            if (c12 == 1) {
                fVar.f76320e = f.a.RIGHT;
                while (i11 < c8043a.f74240w0) {
                    m2.e eVar3 = c8043a.f74239v0[i11];
                    if (b12 || eVar3.M() != 8) {
                        f fVar3 = eVar3.f74126d.f76351i;
                        fVar3.f76326k.add(fVar);
                        fVar.f76327l.add(fVar3);
                    }
                    i11++;
                }
                n(this.f76344b.f74126d.f76350h);
                n(this.f76344b.f74126d.f76351i);
                return;
            }
            if (c12 == 2) {
                fVar.f76320e = f.a.TOP;
                while (i11 < c8043a.f74240w0) {
                    m2.e eVar4 = c8043a.f74239v0[i11];
                    if (b12 || eVar4.M() != 8) {
                        f fVar4 = eVar4.f74128e.f76350h;
                        fVar4.f76326k.add(fVar);
                        fVar.f76327l.add(fVar4);
                    }
                    i11++;
                }
                n(this.f76344b.f74128e.f76350h);
                n(this.f76344b.f74128e.f76351i);
                return;
            }
            if (c12 != 3) {
                return;
            }
            fVar.f76320e = f.a.BOTTOM;
            while (i11 < c8043a.f74240w0) {
                m2.e eVar5 = c8043a.f74239v0[i11];
                if (b12 || eVar5.M() != 8) {
                    f fVar5 = eVar5.f74128e.f76351i;
                    fVar5.f76326k.add(fVar);
                    fVar.f76327l.add(fVar5);
                }
                i11++;
            }
            n(this.f76344b.f74128e.f76350h);
            n(this.f76344b.f74128e.f76351i);
        }
    }

    @Override // n2.p
    public final void e() {
        m2.e eVar = this.f76344b;
        if (eVar instanceof C8043a) {
            int c12 = ((C8043a) eVar).c1();
            f fVar = this.f76350h;
            if (c12 == 0 || c12 == 1) {
                this.f76344b.V0(fVar.f76322g);
            } else {
                this.f76344b.W0(fVar.f76322g);
            }
        }
    }

    @Override // n2.p
    final void f() {
        this.f76345c = null;
        this.f76350h.c();
    }

    @Override // n2.p
    final boolean l() {
        return false;
    }
}
