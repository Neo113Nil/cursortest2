package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.f;
import java.util.Iterator;

/* loaded from: classes.dex */
public class k extends p {
    public k(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f17873h.f17828k.add(fVar);
        fVar.f17829l.add(this.f17873h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f17867b;
        int w12 = aVar.w1();
        Iterator it = this.f17873h.f17829l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f17824g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (w12 == 0 || w12 == 2) {
            this.f17873h.d(i11 + aVar.x1());
        } else {
            this.f17873h.d(i10 + aVar.x1());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void d() {
        androidx.constraintlayout.core.widgets.e eVar = this.f17867b;
        if (eVar instanceof androidx.constraintlayout.core.widgets.a) {
            this.f17873h.f17819b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) eVar;
            int w12 = aVar.w1();
            boolean v12 = aVar.v1();
            int i10 = 0;
            if (w12 == 0) {
                this.f17873h.f17822e = f.a.LEFT;
                while (i10 < aVar.f18078B0) {
                    androidx.constraintlayout.core.widgets.e eVar2 = aVar.mWidgets[i10];
                    if (v12 || eVar2.V() != 8) {
                        f fVar = eVar2.f17953d.f17873h;
                        fVar.f17828k.add(this.f17873h);
                        this.f17873h.f17829l.add(fVar);
                    }
                    i10++;
                }
                q(this.f17867b.f17953d.f17873h);
                q(this.f17867b.f17953d.f17874i);
                return;
            }
            if (w12 == 1) {
                this.f17873h.f17822e = f.a.RIGHT;
                while (i10 < aVar.f18078B0) {
                    androidx.constraintlayout.core.widgets.e eVar3 = aVar.mWidgets[i10];
                    if (v12 || eVar3.V() != 8) {
                        f fVar2 = eVar3.f17953d.f17874i;
                        fVar2.f17828k.add(this.f17873h);
                        this.f17873h.f17829l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f17867b.f17953d.f17873h);
                q(this.f17867b.f17953d.f17874i);
                return;
            }
            if (w12 == 2) {
                this.f17873h.f17822e = f.a.TOP;
                while (i10 < aVar.f18078B0) {
                    androidx.constraintlayout.core.widgets.e eVar4 = aVar.mWidgets[i10];
                    if (v12 || eVar4.V() != 8) {
                        f fVar3 = eVar4.f17955e.f17873h;
                        fVar3.f17828k.add(this.f17873h);
                        this.f17873h.f17829l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f17867b.f17955e.f17873h);
                q(this.f17867b.f17955e.f17874i);
                return;
            }
            if (w12 != 3) {
                return;
            }
            this.f17873h.f17822e = f.a.BOTTOM;
            while (i10 < aVar.f18078B0) {
                androidx.constraintlayout.core.widgets.e eVar5 = aVar.mWidgets[i10];
                if (v12 || eVar5.V() != 8) {
                    f fVar4 = eVar5.f17955e.f17874i;
                    fVar4.f17828k.add(this.f17873h);
                    this.f17873h.f17829l.add(fVar4);
                }
                i10++;
            }
            q(this.f17867b.f17955e.f17873h);
            q(this.f17867b.f17955e.f17874i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        androidx.constraintlayout.core.widgets.e eVar = this.f17867b;
        if (eVar instanceof androidx.constraintlayout.core.widgets.a) {
            int w12 = ((androidx.constraintlayout.core.widgets.a) eVar).w1();
            if (w12 == 0 || w12 == 1) {
                this.f17867b.n1(this.f17873h.f17824g);
            } else {
                this.f17867b.o1(this.f17873h.f17824g);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void f() {
        this.f17868c = null;
        this.f17873h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public boolean m() {
        return false;
    }
}
