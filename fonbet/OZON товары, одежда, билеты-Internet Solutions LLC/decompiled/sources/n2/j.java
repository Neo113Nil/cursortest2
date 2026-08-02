package n2;

/* loaded from: classes8.dex */
final class j extends p {
    j(m2.h hVar) {
        super(hVar);
        hVar.f74126d.f();
        hVar.f74128e.f();
        this.f76348f = hVar.a1();
    }

    private void n(f fVar) {
        f fVar2 = this.f76350h;
        fVar2.f76326k.add(fVar);
        fVar.f76327l.add(fVar2);
    }

    @Override // n2.p, n2.d
    public final void a(d dVar) {
        f fVar = this.f76350h;
        if (fVar.f76318c && !fVar.f76325j) {
            f fVar2 = (f) fVar.f76327l.get(0);
            fVar.d((int) ((((m2.h) this.f76344b).d1() * fVar2.f76322g) + 0.5f));
        }
    }

    @Override // n2.p
    final void d() {
        m2.h hVar = (m2.h) this.f76344b;
        int b12 = hVar.b1();
        int c12 = hVar.c1();
        int a12 = hVar.a1();
        f fVar = this.f76350h;
        if (a12 == 1) {
            if (b12 != -1) {
                fVar.f76327l.add(this.f76344b.f74116W.f74126d.f76350h);
                this.f76344b.f74116W.f74126d.f76350h.f76326k.add(fVar);
                fVar.f76321f = b12;
            } else if (c12 != -1) {
                fVar.f76327l.add(this.f76344b.f74116W.f74126d.f76351i);
                this.f76344b.f74116W.f74126d.f76351i.f76326k.add(fVar);
                fVar.f76321f = -c12;
            } else {
                fVar.f76317b = true;
                fVar.f76327l.add(this.f76344b.f74116W.f74126d.f76351i);
                this.f76344b.f74116W.f74126d.f76351i.f76326k.add(fVar);
            }
            n(this.f76344b.f74126d.f76350h);
            n(this.f76344b.f74126d.f76351i);
            return;
        }
        if (b12 != -1) {
            fVar.f76327l.add(this.f76344b.f74116W.f74128e.f76350h);
            this.f76344b.f74116W.f74128e.f76350h.f76326k.add(fVar);
            fVar.f76321f = b12;
        } else if (c12 != -1) {
            fVar.f76327l.add(this.f76344b.f74116W.f74128e.f76351i);
            this.f76344b.f74116W.f74128e.f76351i.f76326k.add(fVar);
            fVar.f76321f = -c12;
        } else {
            fVar.f76317b = true;
            fVar.f76327l.add(this.f76344b.f74116W.f74128e.f76351i);
            this.f76344b.f74116W.f74128e.f76351i.f76326k.add(fVar);
        }
        n(this.f76344b.f74128e.f76350h);
        n(this.f76344b.f74128e.f76351i);
    }

    @Override // n2.p
    public final void e() {
        int a12 = ((m2.h) this.f76344b).a1();
        f fVar = this.f76350h;
        if (a12 == 1) {
            this.f76344b.V0(fVar.f76322g);
        } else {
            this.f76344b.W0(fVar.f76322g);
        }
    }

    @Override // n2.p
    final void f() {
        this.f76350h.c();
    }

    @Override // n2.p
    final boolean l() {
        return false;
    }
}
