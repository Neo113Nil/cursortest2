package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c01 extends r99 {
    public int n0;
    public int o0;
    public b01 p0;

    @Override // defpackage.r99, defpackage.fm3, defpackage.gtf, defpackage.hm6
    public final void apply() {
        s();
        int C = wt3.C(this.n0);
        int i = 1;
        if (C != 1 && C != 3) {
            i = C != 4 ? C != 5 ? 0 : 3 : 2;
        }
        b01 b01Var = this.p0;
        b01Var.t0 = i;
        b01Var.v0 = this.o0;
    }

    @Override // defpackage.fm3
    public final fm3 k(int i) {
        this.o0 = i;
        return this;
    }

    @Override // defpackage.fm3
    public final fm3 l(Float f) {
        this.o0 = this.k0.c(f);
        return this;
    }

    @Override // defpackage.r99
    public final t99 s() {
        b01 b01Var = this.p0;
        if (b01Var != null) {
            return b01Var;
        }
        b01 b01Var2 = new b01();
        this.p0 = b01Var2;
        return b01Var2;
    }
}
