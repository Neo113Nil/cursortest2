package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class e12 {
    public static final x0d a = b(true);
    public static final x0d b = b(false);
    public static final g12 c = new g12(uxf.c, false);
    public static final g00 d = g00.f;

    public static final void a(int i, of3 of3Var, xtc xtcVar) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-211209833);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            int hashCode = Long.hashCode(av8Var.T);
            xtc C = fqj.C(av8Var, xtcVar);
            aee m = av8Var.m();
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, d, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(xtcVar, i, 3);
        }
    }

    public static final x0d b(boolean z) {
        x0d x0dVar = new x0d(9);
        mv1 mv1Var = uxf.c;
        x0dVar.m(mv1Var, new g12(mv1Var, z));
        mv1 mv1Var2 = uxf.d;
        x0dVar.m(mv1Var2, new g12(mv1Var2, z));
        mv1 mv1Var3 = uxf.e;
        x0dVar.m(mv1Var3, new g12(mv1Var3, z));
        mv1 mv1Var4 = uxf.f;
        x0dVar.m(mv1Var4, new g12(mv1Var4, z));
        mv1 mv1Var5 = uxf.g;
        x0dVar.m(mv1Var5, new g12(mv1Var5, z));
        mv1 mv1Var6 = uxf.h;
        x0dVar.m(mv1Var6, new g12(mv1Var6, z));
        mv1 mv1Var7 = uxf.i;
        x0dVar.m(mv1Var7, new g12(mv1Var7, z));
        mv1 mv1Var8 = uxf.j;
        x0dVar.m(mv1Var8, new g12(mv1Var8, z));
        mv1 mv1Var9 = uxf.k;
        x0dVar.m(mv1Var9, new g12(mv1Var9, z));
        return x0dVar;
    }

    public static final k1c c(io ioVar, boolean z) {
        k1c k1cVar = (k1c) (z ? a : b).g(ioVar);
        return k1cVar == null ? new g12(ioVar, z) : k1cVar;
    }

    public static final void d(phe pheVar, qhe qheVar, g1c g1cVar, ema emaVar, int i, int i2, io ioVar) {
        io ioVar2;
        Object h = g1cVar.h();
        b12 b12Var = h instanceof b12 ? (b12) h : null;
        phe.g(pheVar, qheVar, ((b12Var == null || (ioVar2 = b12Var.o) == null) ? ioVar : ioVar2).a((qheVar.a << 32) | (qheVar.b & 4294967295L), (i << 32) | (i2 & 4294967295L), emaVar));
    }

    public static final g12 e(mv1 mv1Var, of3 of3Var, int i) {
        if (mv1Var.equals(uxf.c)) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(244332343);
            av8Var.s(false);
            return c;
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(244380021);
        boolean h = ((((i & 14) ^ 6) > 4 && av8Var2.g(mv1Var)) || (i & 6) == 4) | av8Var2.h(false);
        Object O = av8Var2.O();
        if (h || O == nf3.a) {
            O = new g12(mv1Var, false);
            av8Var2.n0(O);
        }
        g12 g12Var = (g12) O;
        av8Var2.s(false);
        return g12Var;
    }
}
