package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class l93 {
    public static final long a = hkg.d(4278848026L);
    public static final long b = hkg.d(3424262702L);
    public static final float c = 100.0f;
    public static final boolean d;

    static {
        d = Build.VERSION.SDK_INT >= 31;
    }

    public static final void a(String str, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1485257100);
        int i2 = (av8Var.g(str) ? 4 : 2) | i | 48;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            xtcVar = utc.a;
            xtc B = wnn.B(xtcVar);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(B, a, jf9Var);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (str != null) {
                av8Var.d0(1676907883);
                b(str, av8Var, ((i2 << 3) & 112) | 6);
                e12.a(0, av8Var, n9e.q(n12.a.b(xtcVar), b, jf9Var));
                av8Var.s(false);
            } else {
                av8Var.d0(1677127952);
                av8Var.s(false);
            }
            fc6.v(6, tc3Var, av8Var, true);
        } else {
            av8Var.W();
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new j93(str, xtcVar2, tc3Var, i, 0);
        }
    }

    public static final void b(String str, of3 of3Var, int i) {
        int i2;
        Object obj;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-428320975);
        int i3 = i & 6;
        n12 n12Var = n12.a;
        if (i3 == 0) {
            i2 = (av8Var.g(n12Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(str) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 >> 3;
            av8Var.d0(1278558412);
            boolean z = d;
            if (z) {
                av8Var.s(false);
                obj = str;
            } else {
                Context context = (Context) av8Var.k(nz.b);
                boolean z2 = (((i4 & 14) ^ 6) > 4 && av8Var.g(str)) || (i4 & 6) == 4;
                Object O = av8Var.O();
                if (z2 || O == nf3.a) {
                    ht9 ht9Var = new ht9(context);
                    ht9Var.c = str;
                    awj[] awjVarArr = {new ty1(hkg.s0(a), 25.0f, 4.0f)};
                    sl6 sl6Var = st9.a;
                    st9.b(ht9Var, ph0.X(awjVarArr));
                    O = ht9Var.a();
                    av8Var.n0(O);
                }
                obj = (nt9) O;
                av8Var.s(false);
            }
            mv1 mv1Var = uxf.g;
            xtc b2 = n12Var.b(utc.a);
            if (z) {
                float f = c;
                b2 = yqo.u(b2, f, f, null);
            }
            haa.a(obj, null, b2, mv1Var, mp3.a, av8Var, 1769520, 1944);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new k93(str, i, 0);
        }
    }
}
