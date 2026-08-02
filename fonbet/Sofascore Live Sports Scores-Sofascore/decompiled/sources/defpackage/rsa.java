package defpackage;

import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class rsa {
    public static final rfb a;

    static {
        pfb pfbVar = new pfb(false);
        a = new rfb(ofb.b, pfbVar, pfbVar);
    }

    public static final osa a(z88 z88Var, of3 of3Var) {
        g gVar = g.a;
        av8 av8Var = (av8) of3Var;
        boolean g = av8Var.g(z88Var);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (g || O == a99Var) {
            O = new osa(z88Var);
            av8Var.n0(O);
        }
        osa osaVar = (osa) O;
        boolean i = av8Var.i(gVar) | av8Var.i(osaVar);
        Object O2 = av8Var.O();
        rq3 rq3Var = null;
        if (i || O2 == a99Var) {
            O2 = new qsa(gVar, osaVar, rq3Var, 0);
            av8Var.n0(O2);
        }
        hz8.o(av8Var, osaVar, (Function2) O2);
        boolean i2 = av8Var.i(gVar) | av8Var.i(osaVar);
        Object O3 = av8Var.O();
        if (i2 || O3 == a99Var) {
            O3 = new qsa(gVar, osaVar, rq3Var, 1);
            av8Var.n0(O3);
        }
        hz8.o(av8Var, osaVar, (Function2) O3);
        return osaVar;
    }
}
