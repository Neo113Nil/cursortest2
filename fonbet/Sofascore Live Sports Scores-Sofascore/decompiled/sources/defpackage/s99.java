package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s99 extends v7l {
    @Override // defpackage.rx4
    public final void a(rx4 rx4Var) {
        b01 b01Var = (b01) this.b;
        int i = b01Var.t0;
        vx4 vx4Var = this.h;
        Iterator it = vx4Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((vx4) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            vx4Var.d(i3 + b01Var.v0);
        } else {
            vx4Var.d(i2 + b01Var.v0);
        }
    }

    @Override // defpackage.v7l
    public final void d() {
        wm3 wm3Var = this.b;
        if (wm3Var instanceof b01) {
            vx4 vx4Var = this.h;
            vx4Var.b = true;
            ArrayList arrayList = vx4Var.l;
            b01 b01Var = (b01) wm3Var;
            int i = b01Var.t0;
            boolean z = b01Var.u0;
            int i2 = 0;
            if (i == 0) {
                vx4Var.e = 4;
                while (i2 < b01Var.s0) {
                    wm3 wm3Var2 = b01Var.r0[i2];
                    if (z || wm3Var2.h0 != 8) {
                        vx4 vx4Var2 = wm3Var2.d.h;
                        vx4Var2.k.add(vx4Var);
                        arrayList.add(vx4Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                vx4Var.e = 5;
                while (i2 < b01Var.s0) {
                    wm3 wm3Var3 = b01Var.r0[i2];
                    if (z || wm3Var3.h0 != 8) {
                        vx4 vx4Var3 = wm3Var3.d.i;
                        vx4Var3.k.add(vx4Var);
                        arrayList.add(vx4Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                vx4Var.e = 6;
                while (i2 < b01Var.s0) {
                    wm3 wm3Var4 = b01Var.r0[i2];
                    if (z || wm3Var4.h0 != 8) {
                        vx4 vx4Var4 = wm3Var4.e.h;
                        vx4Var4.k.add(vx4Var);
                        arrayList.add(vx4Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            vx4Var.e = 7;
            while (i2 < b01Var.s0) {
                wm3 wm3Var5 = b01Var.r0[i2];
                if (z || wm3Var5.h0 != 8) {
                    vx4 vx4Var5 = wm3Var5.e.i;
                    vx4Var5.k.add(vx4Var);
                    arrayList.add(vx4Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.v7l
    public final void e() {
        wm3 wm3Var = this.b;
        if (wm3Var instanceof b01) {
            int i = ((b01) wm3Var).t0;
            vx4 vx4Var = this.h;
            if (i == 0 || i == 1) {
                wm3Var.Z = vx4Var.g;
            } else {
                wm3Var.a0 = vx4Var.g;
            }
        }
    }

    @Override // defpackage.v7l
    public final void f() {
        this.c = null;
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
