package defpackage;

import kotlin.Unit;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class kc2 {
    public static final jc2 a = new jc2();

    public static final void a(hc2 hc2Var, Throwable th) {
        hc2Var.getClass();
        if (th != null) {
            hc2Var.a(th);
            return;
        }
        kj1 kj1Var = new kj1(1, hc2Var, hc2.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8);
        jc2 jc2Var = a;
        try {
            jc2Var.getClass();
            g gVar = jc2Var.a;
            rq3 b = z9a.b(gVar == g.a ? new t9a(jc2Var, kj1Var) : new u9a(jc2Var, gVar, kj1Var));
            p2g p2gVar = w2g.b;
            t45.a(b, Unit.a);
        } catch (Throwable th2) {
            hkg.G(jc2Var, th2);
            throw null;
        }
    }
}
