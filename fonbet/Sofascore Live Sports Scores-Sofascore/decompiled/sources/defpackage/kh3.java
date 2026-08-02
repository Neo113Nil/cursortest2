package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kh3 extends gsg {
    public static final ih3 b;
    public static final bag c;
    public static final int d;
    public static final jh3 e;
    public final AtomicReference a;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        d = availableProcessors;
        jh3 jh3Var = new jh3(new bag("RxComputationShutdown"));
        e = jh3Var;
        jh3Var.d();
        bag bagVar = new bag("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        c = bagVar;
        ih3 ih3Var = new ih3(0, bagVar);
        b = ih3Var;
        for (jh3 jh3Var2 : ih3Var.b) {
            jh3Var2.d();
        }
    }

    public kh3() {
        ih3 ih3Var = b;
        AtomicReference atomicReference = new AtomicReference(ih3Var);
        this.a = atomicReference;
        ih3 ih3Var2 = new ih3(d, c);
        while (!atomicReference.compareAndSet(ih3Var, ih3Var2)) {
            if (atomicReference.get() != ih3Var) {
                for (jh3 jh3Var : ih3Var2.b) {
                    jh3Var.d();
                }
                return;
            }
        }
    }

    @Override // defpackage.gsg
    public final fsg a() {
        jh3 jh3Var;
        ih3 ih3Var = (ih3) this.a.get();
        int i = ih3Var.a;
        if (i == 0) {
            jh3Var = e;
        } else {
            jh3[] jh3VarArr = ih3Var.b;
            long j = ih3Var.c;
            ih3Var.c = 1 + j;
            jh3Var = jh3VarArr[(int) (j % i)];
        }
        return new hh3(jh3Var);
    }

    @Override // defpackage.gsg
    public final k55 c(Runnable runnable) {
        jh3 jh3Var;
        ih3 ih3Var = (ih3) this.a.get();
        int i = ih3Var.a;
        if (i == 0) {
            jh3Var = e;
        } else {
            jh3[] jh3VarArr = ih3Var.b;
            long j = ih3Var.c;
            ih3Var.c = 1 + j;
            jh3Var = jh3VarArr[(int) (j % i)];
        }
        jh3Var.getClass();
        bsg bsgVar = new bsg(runnable);
        try {
            bsgVar.a(jh3Var.a.submit(bsgVar));
            return bsgVar;
        } catch (RejectedExecutionException e2) {
            hda.L(e2);
            return em5.a;
        }
    }
}
