package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class rje {
    public static final ff5 a = new ff5(1, zg3.G);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(oje ojeVar, Function2 function2, sq3 sq3Var) {
        pje pjeVar;
        int i;
        if (sq3Var instanceof pje) {
            pjeVar = (pje) sq3Var;
            int i2 = pjeVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pjeVar.s = i2 - Integer.MIN_VALUE;
                Object obj = pjeVar.r;
                lu3 lu3Var = lu3.a;
                i = pjeVar.s;
                if (i == 0) {
                    if (i == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                y6a.M(obj);
                if (!((wtc) ojeVar).a.n) {
                    a70.p("establishTextInputSession called from an unattached node");
                    return;
                }
                ryd d0 = c6o.d0(ojeVar);
                aee aeeVar = (aee) c6o.c0(ojeVar).B;
                aeeVar.getClass();
                if (ktm.I(aeeVar, a) != null) {
                    pvd.j();
                    return;
                } else {
                    pjeVar.s = 1;
                    b(d0, function2, pjeVar);
                    return;
                }
            }
        }
        pjeVar = new pje(sq3Var);
        Object obj2 = pjeVar.r;
        lu3 lu3Var2 = lu3.a;
        i = pjeVar.s;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ryd rydVar, Function2 function2, sq3 sq3Var) {
        qje qjeVar;
        int i;
        if (sq3Var instanceof qje) {
            qjeVar = (qje) sq3Var;
            int i2 = qjeVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qjeVar.s = i2 - Integer.MIN_VALUE;
                Object obj = qjeVar.r;
                lu3 lu3Var = lu3.a;
                i = qjeVar.s;
                if (i != 0) {
                    y6a.M(obj);
                    qjeVar.s = 1;
                    ((xy) rydVar).O(function2, qjeVar);
                    return;
                } else {
                    if (i == 1) {
                        throw wt3.i(obj);
                    }
                    if (i == 2) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
            }
        }
        qjeVar = new qje(sq3Var);
        Object obj2 = qjeVar.r;
        lu3 lu3Var2 = lu3.a;
        i = qjeVar.s;
        if (i != 0) {
        }
    }
}
