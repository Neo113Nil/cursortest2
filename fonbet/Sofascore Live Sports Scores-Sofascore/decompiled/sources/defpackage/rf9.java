package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class rf9 extends wtc implements jyj, pze, ug3 {
    public t75 o;
    public k20 p;
    public boolean q;

    public rf9(k20 k20Var, t75 t75Var) {
        this.o = t75Var;
        this.p = k20Var;
    }

    @Override // defpackage.pze
    public final void B(fze fzeVar, gze gzeVar, long j) {
        if (gzeVar == gze.b) {
            List list = fzeVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (n1(((mze) list.get(i)).i)) {
                    int i2 = fzeVar.f;
                    if (i2 == 4) {
                        this.q = true;
                        m1();
                        return;
                    } else {
                        if (i2 == 5) {
                            o1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.wtc
    public final void d1() {
        o1();
    }

    public final void k1() {
        k20 k20Var;
        fsf fsfVar = new fsf();
        jca.Y(this, new tyd(fsfVar));
        rf9 rf9Var = (rf9) fsfVar.a;
        if (rf9Var == null || (k20Var = rf9Var.p) == null) {
            k20Var = this.p;
        }
        l1(k20Var);
    }

    public abstract void l1(kze kzeVar);

    public final void m1() {
        asf asfVar = new asf();
        asfVar.a = true;
        jca.a0(this, new oo(asfVar, 23));
        if (asfVar.a) {
            k1();
        }
    }

    public abstract boolean n1(int i);

    public final void o1() {
        if (this.q) {
            this.q = false;
            if (this.n) {
                fsf fsfVar = new fsf();
                jca.Y(this, new qy(fsfVar, 1));
                rf9 rf9Var = (rf9) fsfVar.a;
                if (rf9Var != null) {
                    rf9Var.k1();
                } else {
                    l1(null);
                }
            }
        }
    }

    @Override // defpackage.pze
    public final long r0() {
        if (this.o == null) {
            return sqj.a;
        }
        kx4 kx4Var = c6o.c0(this).y;
        int i = sqj.b;
        return x2a.H(kx4Var.e0(10.0f), kx4Var.e0(40.0f), kx4Var.e0(10.0f), kx4Var.e0(40.0f));
    }

    @Override // defpackage.pze
    public final void y0() {
        o1();
    }
}
