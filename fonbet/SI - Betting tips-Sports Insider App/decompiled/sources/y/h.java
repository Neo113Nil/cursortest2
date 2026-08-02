package y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends n {
    @Override // y.d
    public final void a(d dVar) {
        e eVar = this.f25520h;
        if (eVar.f25491c && !eVar.j) {
            eVar.d((int) ((((e) eVar.f25499l.get(0)).f25495g * ((x.h) this.f25514b).f25362q0) + 0.5f));
        }
    }

    @Override // y.n
    public final void d() {
        x.d dVar = this.f25514b;
        x.h hVar = (x.h) dVar;
        int i5 = hVar.f25363r0;
        int i10 = hVar.f25364s0;
        int i11 = hVar.f25366u0;
        e eVar = this.f25520h;
        if (i11 == 1) {
            if (i5 != -1) {
                eVar.f25499l.add(dVar.T.f25299d.f25520h);
                this.f25514b.T.f25299d.f25520h.f25498k.add(eVar);
                eVar.f25494f = i5;
            } else if (i10 != -1) {
                eVar.f25499l.add(dVar.T.f25299d.f25521i);
                this.f25514b.T.f25299d.f25521i.f25498k.add(eVar);
                eVar.f25494f = -i10;
            } else {
                eVar.f25490b = true;
                eVar.f25499l.add(dVar.T.f25299d.f25521i);
                this.f25514b.T.f25299d.f25521i.f25498k.add(eVar);
            }
            m(this.f25514b.f25299d.f25520h);
            m(this.f25514b.f25299d.f25521i);
            return;
        }
        if (i5 != -1) {
            eVar.f25499l.add(dVar.T.f25301e.f25520h);
            this.f25514b.T.f25301e.f25520h.f25498k.add(eVar);
            eVar.f25494f = i5;
        } else if (i10 != -1) {
            eVar.f25499l.add(dVar.T.f25301e.f25521i);
            this.f25514b.T.f25301e.f25521i.f25498k.add(eVar);
            eVar.f25494f = -i10;
        } else {
            eVar.f25490b = true;
            eVar.f25499l.add(dVar.T.f25301e.f25521i);
            this.f25514b.T.f25301e.f25521i.f25498k.add(eVar);
        }
        m(this.f25514b.f25301e.f25520h);
        m(this.f25514b.f25301e.f25521i);
    }

    @Override // y.n
    public final void e() {
        x.d dVar = this.f25514b;
        int i5 = ((x.h) dVar).f25366u0;
        e eVar = this.f25520h;
        if (i5 == 1) {
            dVar.Y = eVar.f25495g;
        } else {
            dVar.Z = eVar.f25495g;
        }
    }

    @Override // y.n
    public final void f() {
        this.f25520h.c();
    }

    @Override // y.n
    public final boolean k() {
        return false;
    }

    public final void m(e eVar) {
        e eVar2 = this.f25520h;
        eVar2.f25498k.add(eVar);
        eVar.f25499l.add(eVar2);
    }
}
