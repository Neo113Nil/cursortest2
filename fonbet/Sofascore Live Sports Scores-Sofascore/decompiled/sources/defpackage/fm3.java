package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class fm3 implements gtf {
    public Object a;
    public final zci b;
    public float b0;
    public float c0;
    public y25 d0;
    public y25 e0;
    public g1c f0;
    public wm3 g0;
    public final HashMap h0;
    public final HashMap i0;
    public hm6 c = null;
    public int d = 0;
    public int e = 0;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = 0.5f;
    public float i = 0.5f;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 0;
    public float x = Float.NaN;
    public float y = Float.NaN;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public int I = 0;
    public Object J = null;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public fm3 T = null;
    public Object U = null;
    public Object V = null;
    public fm3 W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;
    public Object a0 = null;
    public int j0 = 0;

    public fm3(zci zciVar) {
        String str = y25.h;
        y25 y25Var = new y25(str);
        String str2 = y25.i;
        y25Var.g = str2;
        this.d0 = y25Var;
        y25 y25Var2 = new y25(str);
        y25Var2.g = str2;
        this.e0 = y25Var2;
        this.h0 = new HashMap();
        this.i0 = new HashMap();
        this.b = zciVar;
    }

    @Override // defpackage.gtf
    public wm3 a() {
        wm3 wm3Var = this.g0;
        if (wm3Var != null) {
            return wm3Var;
        }
        wm3 wm3Var2 = new wm3(this.d0.f, this.e0.f);
        this.g0 = wm3Var2;
        wm3Var2.g0 = this.f0;
        return wm3Var2;
    }

    @Override // defpackage.gtf, defpackage.hm6
    public void apply() {
        if (this.g0 == null) {
            return;
        }
        hm6 hm6Var = this.c;
        if (hm6Var != null) {
            hm6Var.apply();
        }
        this.d0.a(this.g0, 0);
        this.e0.a(this.g0, 1);
        this.J = j(this.J);
        this.K = j(this.K);
        this.L = j(this.L);
        this.M = j(this.M);
        this.N = j(this.N);
        this.O = j(this.O);
        this.P = j(this.P);
        this.Q = j(this.Q);
        this.R = j(this.R);
        this.S = j(this.S);
        this.U = j(this.U);
        this.V = j(this.V);
        this.X = j(this.X);
        this.Y = j(this.Y);
        this.Z = j(this.Z);
        d(this.g0, this.J, 1);
        d(this.g0, this.K, 2);
        d(this.g0, this.L, 3);
        d(this.g0, this.M, 4);
        d(this.g0, this.N, 5);
        d(this.g0, this.O, 6);
        d(this.g0, this.P, 7);
        d(this.g0, this.Q, 8);
        d(this.g0, this.R, 9);
        d(this.g0, this.S, 10);
        d(this.g0, this.T, 11);
        d(this.g0, this.U, 12);
        d(this.g0, this.V, 13);
        d(this.g0, this.W, 14);
        d(this.g0, this.X, 15);
        d(this.g0, this.Y, 16);
        d(this.g0, this.Z, 17);
        d(this.g0, this.a0, 20);
        int i = this.d;
        if (i != 0) {
            this.g0.j0 = i;
        }
        int i2 = this.e;
        if (i2 != 0) {
            this.g0.k0 = i2;
        }
        float f = this.f;
        if (f != -1.0f) {
            this.g0.l0[0] = f;
        }
        float f2 = this.g;
        if (f2 != -1.0f) {
            this.g0.l0[1] = f2;
        }
        wm3 wm3Var = this.g0;
        wm3Var.e0 = this.h;
        wm3Var.f0 = this.i;
        j7l j7lVar = wm3Var.j;
        j7lVar.d = this.x;
        j7lVar.e = this.y;
        j7lVar.f = this.z;
        j7lVar.g = this.A;
        j7lVar.h = this.B;
        j7lVar.i = this.C;
        j7lVar.j = this.D;
        j7lVar.k = this.E;
        j7lVar.l = this.G;
        j7lVar.m = this.H;
        j7lVar.n = this.F;
        int i3 = this.I;
        j7lVar.o = i3;
        wm3Var.h0 = i3;
        HashMap hashMap = this.h0;
        for (String str : hashMap.keySet()) {
            Integer num = (Integer) hashMap.get(str);
            j7l j7lVar2 = this.g0.j;
            int intValue = num.intValue();
            HashMap hashMap2 = j7lVar2.p;
            if (hashMap2.containsKey(str)) {
                ((na4) hashMap2.get(str)).c = intValue;
            } else {
                na4 na4Var = new na4();
                na4Var.d = Float.NaN;
                na4Var.a = str;
                na4Var.b = 902;
                na4Var.c = intValue;
                hashMap2.put(str, na4Var);
            }
        }
        HashMap hashMap3 = this.i0;
        for (String str2 : hashMap3.keySet()) {
            float floatValue = ((Float) hashMap3.get(str2)).floatValue();
            HashMap hashMap4 = this.g0.j.p;
            if (hashMap4.containsKey(str2)) {
                ((na4) hashMap4.get(str2)).d = floatValue;
            } else {
                na4 na4Var2 = new na4();
                na4Var2.c = Integer.MIN_VALUE;
                na4Var2.a = str2;
                na4Var2.b = 901;
                na4Var2.d = floatValue;
                hashMap4.put(str2, na4Var2);
            }
        }
    }

    @Override // defpackage.gtf
    public final void b(wm3 wm3Var) {
        if (wm3Var == null) {
            return;
        }
        this.g0 = wm3Var;
        wm3Var.g0 = this.f0;
    }

    @Override // defpackage.gtf
    public final hm6 c() {
        return this.c;
    }

    public final void d(wm3 wm3Var, Object obj, int i) {
        wm3 a = obj instanceof gtf ? ((gtf) obj).a() : null;
        if (a == null) {
            return;
        }
        int i2 = em3.a[wt3.C(i)];
        int C = wt3.C(i);
        if (C == 19) {
            float f = this.b0;
            wm3Var.w(7, 7, (int) this.c0, 0, a);
            wm3Var.E = f;
            return;
        }
        switch (C) {
            case 0:
                wm3Var.j(2).b(a.j(2), this.j, this.p, false);
                break;
            case 1:
                wm3Var.j(2).b(a.j(4), this.j, this.p, false);
                break;
            case 2:
                wm3Var.j(4).b(a.j(2), this.k, this.q, false);
                break;
            case 3:
                wm3Var.j(4).b(a.j(4), this.k, this.q, false);
                break;
            case 4:
                wm3Var.j(2).b(a.j(2), this.l, this.r, false);
                break;
            case 5:
                wm3Var.j(2).b(a.j(4), this.l, this.r, false);
                break;
            case 6:
                wm3Var.j(4).b(a.j(2), this.m, this.s, false);
                break;
            case 7:
                wm3Var.j(4).b(a.j(4), this.m, this.s, false);
                break;
            case 8:
                wm3Var.j(3).b(a.j(3), this.n, this.t, false);
                break;
            case 9:
                wm3Var.j(3).b(a.j(5), this.n, this.t, false);
                break;
            case 10:
                wm3Var.w(3, 6, this.n, this.t, a);
                break;
            case 11:
                wm3Var.j(5).b(a.j(3), this.o, this.u, false);
                break;
            case 12:
                wm3Var.j(5).b(a.j(5), this.o, this.u, false);
                break;
            case 13:
                wm3Var.w(5, 6, this.o, this.u, a);
                break;
            case 14:
                wm3Var.w(6, 6, this.v, this.w, a);
                break;
            case 15:
                wm3Var.w(6, 3, this.v, this.w, a);
                break;
            case 16:
                wm3Var.w(6, 5, this.v, this.w, a);
                break;
        }
    }

    public final void e(Object obj) {
        this.j0 = 13;
        this.V = obj;
    }

    public final void f() {
        int i = this.j0;
        if (i == 0) {
            this.J = null;
            this.K = null;
            this.j = 0;
            this.L = null;
            this.M = null;
            this.k = 0;
            this.N = null;
            this.O = null;
            this.l = 0;
            this.P = null;
            this.Q = null;
            this.m = 0;
            this.R = null;
            this.S = null;
            this.n = 0;
            this.U = null;
            this.V = null;
            this.o = 0;
            this.X = null;
            this.a0 = null;
            this.h = 0.5f;
            this.i = 0.5f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            return;
        }
        int C = wt3.C(i);
        if (C == 19) {
            this.a0 = null;
            return;
        }
        switch (C) {
            case 0:
            case 1:
                this.J = null;
                this.K = null;
                this.j = 0;
                this.p = 0;
                break;
            case 2:
            case 3:
                this.L = null;
                this.M = null;
                this.k = 0;
                this.q = 0;
                break;
            case 4:
            case 5:
                this.N = null;
                this.O = null;
                this.l = 0;
                this.r = 0;
                break;
            case 6:
            case 7:
                this.P = null;
                this.Q = null;
                this.m = 0;
                this.s = 0;
                break;
            case 8:
            case 9:
            case 10:
                this.R = null;
                this.S = null;
                this.T = null;
                this.n = 0;
                this.t = 0;
                break;
            case 11:
            case 12:
            case 13:
                this.U = null;
                this.V = null;
                this.W = null;
                this.o = 0;
                this.u = 0;
                break;
            case 14:
                this.X = null;
                break;
        }
    }

    public final void g() {
        if (this.N != null) {
            this.j0 = 5;
        } else {
            this.j0 = 6;
        }
        f();
        if (this.P != null) {
            this.j0 = 7;
        } else {
            this.j0 = 8;
        }
        f();
        if (this.J != null) {
            this.j0 = 1;
        } else {
            this.j0 = 2;
        }
        f();
        if (this.L != null) {
            this.j0 = 3;
        } else {
            this.j0 = 4;
        }
        f();
    }

    @Override // defpackage.gtf
    public final Object getKey() {
        return this.a;
    }

    public final void h() {
        if (this.R != null) {
            this.j0 = 9;
        } else {
            this.j0 = 10;
        }
        f();
        this.j0 = 15;
        f();
        if (this.U != null) {
            this.j0 = 12;
        } else {
            this.j0 = 13;
        }
        f();
    }

    public final void i(Object obj) {
        this.j0 = 8;
        this.Q = obj;
    }

    public final Object j(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof fm3) ? (gtf) this.b.c.get(obj) : obj;
    }

    public fm3 k(int i) {
        int i2 = this.j0;
        if (i2 == 0) {
            this.j = i;
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            return this;
        }
        int C = wt3.C(i2);
        if (C == 19) {
            this.c0 = i;
            return this;
        }
        switch (C) {
            case 0:
            case 1:
                this.j = i;
                break;
            case 2:
            case 3:
                this.k = i;
                break;
            case 4:
            case 5:
                this.l = i;
                break;
            case 6:
            case 7:
                this.m = i;
                break;
            case 8:
            case 9:
            case 10:
                this.n = i;
                break;
            case 11:
            case 12:
            case 13:
                this.o = i;
                break;
            case 14:
            case 15:
            case 16:
                this.v = i;
                break;
        }
        return this;
    }

    public fm3 l(Float f) {
        return k(this.b.c(f));
    }

    public final void m(int i) {
        int i2 = this.j0;
        if (i2 == 0) {
            this.p = i;
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            return;
        }
        switch (wt3.C(i2)) {
            case 0:
            case 1:
                this.p = i;
                break;
            case 2:
            case 3:
                this.q = i;
                break;
            case 4:
            case 5:
                this.r = i;
                break;
            case 6:
            case 7:
                this.s = i;
                break;
            case 8:
            case 9:
            case 10:
                this.t = i;
                break;
            case 11:
            case 12:
            case 13:
                this.u = i;
                break;
            case 14:
            case 15:
            case 16:
                this.w = i;
                break;
        }
    }

    public final void n(Float f) {
        m(this.b.c(f));
    }

    public final void o(Object obj) {
        this.j0 = 5;
        this.N = obj;
    }

    public final void p(Object obj) {
        this.j0 = 9;
        this.R = obj;
    }
}
