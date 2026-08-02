package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t49 extends v7l {
    @Override // defpackage.rx4
    public final void a(rx4 rx4Var) {
        vx4 vx4Var = this.h;
        if (vx4Var.c && !vx4Var.j) {
            vx4Var.d((int) ((((vx4) vx4Var.l.get(0)).g * ((s49) this.b).r0) + 0.5f));
        }
    }

    @Override // defpackage.v7l
    public final void d() {
        wm3 wm3Var = this.b;
        s49 s49Var = (s49) wm3Var;
        int i = s49Var.s0;
        int i2 = s49Var.t0;
        int i3 = s49Var.v0;
        vx4 vx4Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                vx4Var.l.add(wm3Var.U.d.h);
                this.b.U.d.h.k.add(vx4Var);
                vx4Var.f = i;
            } else if (i2 != -1) {
                vx4Var.l.add(wm3Var.U.d.i);
                this.b.U.d.i.k.add(vx4Var);
                vx4Var.f = -i2;
            } else {
                vx4Var.b = true;
                vx4Var.l.add(wm3Var.U.d.i);
                this.b.U.d.i.k.add(vx4Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            vx4Var.l.add(wm3Var.U.e.h);
            this.b.U.e.h.k.add(vx4Var);
            vx4Var.f = i;
        } else if (i2 != -1) {
            vx4Var.l.add(wm3Var.U.e.i);
            this.b.U.e.i.k.add(vx4Var);
            vx4Var.f = -i2;
        } else {
            vx4Var.b = true;
            vx4Var.l.add(wm3Var.U.e.i);
            this.b.U.e.i.k.add(vx4Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.v7l
    public final void e() {
        wm3 wm3Var = this.b;
        int i = ((s49) wm3Var).v0;
        vx4 vx4Var = this.h;
        if (i == 1) {
            wm3Var.Z = vx4Var.g;
        } else {
            wm3Var.a0 = vx4Var.g;
        }
    }

    @Override // defpackage.v7l
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.v7l
    public final boolean k() {
        return false;
    }

    public final void m(vx4 vx4Var) {
        vx4 vx4Var2 = this.h;
        vx4Var2.k.add(vx4Var);
        vx4Var.l.add(vx4Var2);
    }
}
