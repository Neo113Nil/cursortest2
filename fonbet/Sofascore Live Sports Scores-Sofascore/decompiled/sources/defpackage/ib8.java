package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ib8 extends r99 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public a98 n0;
    public HashMap o0;
    public HashMap p0;
    public HashMap q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public ib8(zci zciVar, int i) {
        super(zciVar, i);
        this.r0 = 0;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = 2;
        this.z0 = 2;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = -1;
        this.H0 = 0;
        this.I0 = 0.5f;
        this.J0 = 0.5f;
        this.K0 = 0.5f;
        this.L0 = 0.5f;
        if (i == 8) {
            this.H0 = 1;
        }
    }

    @Override // defpackage.r99, defpackage.fm3, defpackage.gtf, defpackage.hm6
    public final void apply() {
        s();
        b(this.n0);
        a98 a98Var = this.n0;
        a98Var.W0 = this.H0;
        a98Var.U0 = this.r0;
        int i = this.G0;
        if (i != -1) {
            a98Var.V0 = i;
        }
        int i2 = this.C0;
        if (i2 != 0) {
            a98Var.x0 = i2;
        }
        int i3 = this.E0;
        if (i3 != 0) {
            a98Var.t0 = i3;
        }
        int i4 = this.D0;
        if (i4 != 0) {
            a98Var.y0 = i4;
        }
        int i5 = this.F0;
        if (i5 != 0) {
            a98Var.u0 = i5;
        }
        int i6 = this.B0;
        if (i6 != 0) {
            a98Var.Q0 = i6;
        }
        int i7 = this.A0;
        if (i7 != 0) {
            a98Var.R0 = i7;
        }
        float f = this.h;
        if (f != 0.5f) {
            a98Var.K0 = f;
        }
        float f2 = this.K0;
        if (f2 != 0.5f) {
            a98Var.M0 = f2;
        }
        float f3 = this.L0;
        if (f3 != 0.5f) {
            a98Var.O0 = f3;
        }
        float f4 = this.i;
        if (f4 != 0.5f) {
            a98Var.L0 = f4;
        }
        float f5 = this.I0;
        if (f5 != 0.5f) {
            a98Var.N0 = f5;
        }
        float f6 = this.J0;
        if (f6 != 0.5f) {
            a98Var.P0 = f6;
        }
        int i8 = this.z0;
        if (i8 != 2) {
            a98Var.S0 = i8;
        }
        int i9 = this.y0;
        if (i9 != 2) {
            a98Var.T0 = i9;
        }
        int i10 = this.s0;
        if (i10 != -1) {
            a98Var.F0 = i10;
        }
        int i11 = this.t0;
        if (i11 != -1) {
            a98Var.H0 = i11;
        }
        int i12 = this.u0;
        if (i12 != -1) {
            a98Var.J0 = i12;
        }
        int i13 = this.v0;
        if (i13 != -1) {
            a98Var.E0 = i13;
        }
        int i14 = this.w0;
        if (i14 != -1) {
            a98Var.G0 = i14;
        }
        int i15 = this.x0;
        if (i15 != -1) {
            a98Var.I0 = i15;
        }
        r();
    }

    @Override // defpackage.r99
    public final t99 s() {
        a98 a98Var = this.n0;
        if (a98Var != null) {
            return a98Var;
        }
        a98 a98Var2 = new a98();
        this.n0 = a98Var2;
        return a98Var2;
    }
}
