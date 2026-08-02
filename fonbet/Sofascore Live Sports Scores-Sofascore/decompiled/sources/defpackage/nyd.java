package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class nyd {
    public static final lh3 a = new lh3(new etd(3));

    public static final xtc a(xtc xtcVar, myd mydVar) {
        return xtcVar.z(new oyd(mydVar));
    }

    public static final myd b(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.d0(282942128);
        o00 o00Var = (o00) av8Var.k(a);
        if (o00Var == null) {
            av8Var.s(false);
            return null;
        }
        boolean g = av8Var.g(o00Var);
        Object O = av8Var.O();
        if (g || O == nf3.a) {
            n00 n00Var = new n00(o00Var.a, o00Var.b, o00Var.c, o00Var.d);
            av8Var.n0(n00Var);
            O = n00Var;
        }
        myd mydVar = (myd) O;
        av8Var.s(false);
        return mydVar;
    }
}
