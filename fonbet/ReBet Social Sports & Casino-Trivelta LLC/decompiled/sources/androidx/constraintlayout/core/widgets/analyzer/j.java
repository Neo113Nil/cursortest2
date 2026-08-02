package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes.dex */
public class j extends p {
    public j(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
        eVar.f17953d.f();
        eVar.f17955e.f();
        this.f17871f = ((androidx.constraintlayout.core.widgets.h) eVar).t1();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        f fVar = this.f17873h;
        if (fVar.f17820c && !fVar.f17827j) {
            this.f17873h.d((int) ((((f) fVar.f17829l.get(0)).f17824g * ((androidx.constraintlayout.core.widgets.h) this.f17867b).w1()) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void d() {
        androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) this.f17867b;
        int u12 = hVar.u1();
        int v12 = hVar.v1();
        hVar.w1();
        if (hVar.t1() == 1) {
            if (u12 != -1) {
                this.f17873h.f17829l.add(this.f17867b.f17940T.f17953d.f17873h);
                this.f17867b.f17940T.f17953d.f17873h.f17828k.add(this.f17873h);
                this.f17873h.f17823f = u12;
            } else if (v12 != -1) {
                this.f17873h.f17829l.add(this.f17867b.f17940T.f17953d.f17874i);
                this.f17867b.f17940T.f17953d.f17874i.f17828k.add(this.f17873h);
                this.f17873h.f17823f = -v12;
            } else {
                f fVar = this.f17873h;
                fVar.f17819b = true;
                fVar.f17829l.add(this.f17867b.f17940T.f17953d.f17874i);
                this.f17867b.f17940T.f17953d.f17874i.f17828k.add(this.f17873h);
            }
            q(this.f17867b.f17953d.f17873h);
            q(this.f17867b.f17953d.f17874i);
            return;
        }
        if (u12 != -1) {
            this.f17873h.f17829l.add(this.f17867b.f17940T.f17955e.f17873h);
            this.f17867b.f17940T.f17955e.f17873h.f17828k.add(this.f17873h);
            this.f17873h.f17823f = u12;
        } else if (v12 != -1) {
            this.f17873h.f17829l.add(this.f17867b.f17940T.f17955e.f17874i);
            this.f17867b.f17940T.f17955e.f17874i.f17828k.add(this.f17873h);
            this.f17873h.f17823f = -v12;
        } else {
            f fVar2 = this.f17873h;
            fVar2.f17819b = true;
            fVar2.f17829l.add(this.f17867b.f17940T.f17955e.f17874i);
            this.f17867b.f17940T.f17955e.f17874i.f17828k.add(this.f17873h);
        }
        q(this.f17867b.f17955e.f17873h);
        q(this.f17867b.f17955e.f17874i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        if (((androidx.constraintlayout.core.widgets.h) this.f17867b).t1() == 1) {
            this.f17867b.n1(this.f17873h.f17824g);
        } else {
            this.f17867b.o1(this.f17873h.f17824g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void f() {
        this.f17873h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public boolean m() {
        return false;
    }

    public final void q(f fVar) {
        this.f17873h.f17828k.add(fVar);
        fVar.f17829l.add(this.f17873h);
    }
}
