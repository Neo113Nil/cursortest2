package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class c62 extends ot8 implements ct8 {
    public static final c62 b = new c62(3, g62.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ho2 ho2Var;
        g62 g62Var = (g62) obj;
        h2h h2hVar = (h2h) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g62.d;
        g62Var.getClass();
        ho2 ho2Var2 = (ho2) rh0.a.getObjectVolatile(g62Var, g62.o);
        while (true) {
            if (g62Var.A()) {
                h2hVar.e = i62.l;
                break;
            }
            long andIncrement = g62.e.getAndIncrement(g62Var);
            long j = i62.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (ho2Var2.d != j2) {
                ho2 k = g62Var.k(j2, ho2Var2);
                if (k == null) {
                    continue;
                } else {
                    ho2Var = k;
                }
            } else {
                ho2Var = ho2Var2;
            }
            Object M = g62Var.M(ho2Var, i, andIncrement, h2hVar);
            ho2 ho2Var3 = ho2Var;
            if (M == i62.m) {
                if (h2hVar == null) {
                    h2hVar = null;
                }
                if (h2hVar != null) {
                    h2hVar.c = ho2Var3;
                    h2hVar.d = i;
                }
            } else if (M == i62.o) {
                if (andIncrement < g62Var.v()) {
                    ho2Var3.b();
                }
                ho2Var2 = ho2Var3;
            } else {
                if (M == i62.n) {
                    a70.r("unexpected");
                    return null;
                }
                ho2Var3.b();
                h2hVar.e = M;
            }
        }
        return Unit.a;
    }
}
