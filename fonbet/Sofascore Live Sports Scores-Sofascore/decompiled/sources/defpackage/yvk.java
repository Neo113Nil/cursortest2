package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class yvk extends t99 {
    public int t0 = 0;
    public int u0 = 0;
    public int v0 = 0;
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public boolean z0 = false;
    public int A0 = 0;
    public int B0 = 0;
    public final co1 C0 = new co1();
    public do1 D0 = null;

    @Override // defpackage.t99
    public final void X() {
        for (int i = 0; i < this.s0; i++) {
            wm3 wm3Var = this.r0[i];
            if (wm3Var != null) {
                wm3Var.G = true;
            }
        }
    }

    public abstract void Y(int i, int i2, int i3, int i4);

    public final void Z(int i, int i2, int i3, int i4, wm3 wm3Var) {
        do1 do1Var;
        xm3 xm3Var;
        while (true) {
            do1Var = this.D0;
            if (do1Var != null || (xm3Var = this.U) == null) {
                break;
            } else {
                this.D0 = xm3Var.v0;
            }
        }
        co1 co1Var = this.C0;
        co1Var.a = i;
        co1Var.b = i3;
        co1Var.c = i2;
        co1Var.d = i4;
        do1Var.b(wm3Var, co1Var);
        wm3Var.S(co1Var.e);
        wm3Var.N(co1Var.f);
        wm3Var.F = co1Var.h;
        wm3Var.J(co1Var.g);
    }
}
