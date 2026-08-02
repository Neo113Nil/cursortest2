package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class b62 implements kzk {
    public Object a = i62.p;
    public lj2 b;
    public final /* synthetic */ g62 c;

    public b62(g62 g62Var) {
        this.c = g62Var;
    }

    public final Object a(sq3 sq3Var) {
        ho2 ho2Var;
        Boolean bool;
        Object obj = this.a;
        boolean z = true;
        if (obj == i62.p || obj == i62.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g62.i;
            g62 g62Var = this.c;
            ho2 ho2Var2 = (ho2) atomicReferenceFieldUpdater.get(g62Var);
            while (true) {
                if (g62Var.A()) {
                    this.a = i62.l;
                    Throwable p = g62Var.p();
                    if (p != null) {
                        int i = x0i.a;
                        throw p;
                    }
                    z = false;
                } else {
                    long andIncrement = g62.e.getAndIncrement(g62Var);
                    long j = i62.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (ho2Var2.d != j2) {
                        ho2Var = g62Var.k(j2, ho2Var2);
                        if (ho2Var == null) {
                            continue;
                        }
                    } else {
                        ho2Var = ho2Var2;
                    }
                    Object M = g62Var.M(ho2Var, i2, andIncrement, null);
                    ih2 ih2Var = i62.m;
                    hl6 hl6Var = null;
                    if (M == ih2Var) {
                        a70.r("unreachable");
                        return null;
                    }
                    ih2 ih2Var2 = i62.o;
                    if (M == ih2Var2) {
                        if (andIncrement < g62Var.v()) {
                            ho2Var.b();
                        }
                        ho2Var2 = ho2Var;
                    } else {
                        if (M == i62.n) {
                            g62 g62Var2 = this.c;
                            lj2 o0 = k53.o0(z9a.b(sq3Var));
                            try {
                                this.b = o0;
                                Object M2 = g62Var2.M(ho2Var, i2, andIncrement, this);
                                Function1 function1 = g62Var2.b;
                                if (M2 == ih2Var) {
                                    b(ho2Var, i2);
                                } else {
                                    if (M2 == ih2Var2) {
                                        if (andIncrement < g62Var2.v()) {
                                            ho2Var.b();
                                        }
                                        ho2 ho2Var3 = (ho2) g62.i.get(g62Var2);
                                        while (true) {
                                            if (g62Var2.A()) {
                                                lj2 lj2Var = this.b;
                                                lj2Var.getClass();
                                                this.b = null;
                                                this.a = i62.l;
                                                Throwable p2 = g62Var.p();
                                                if (p2 == null) {
                                                    p2g p2gVar = w2g.b;
                                                    lj2Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    p2g p2gVar2 = w2g.b;
                                                    lj2Var.resumeWith(new u2g(p2));
                                                }
                                            } else {
                                                long andIncrement2 = g62.e.getAndIncrement(g62Var2);
                                                long j3 = i62.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (ho2Var3.d != j4) {
                                                    ho2 k = g62Var2.k(j4, ho2Var3);
                                                    if (k != null) {
                                                        ho2Var3 = k;
                                                    }
                                                }
                                                Object M3 = g62Var2.M(ho2Var3, i3, andIncrement2, this);
                                                if (M3 == i62.m) {
                                                    b(ho2Var3, i3);
                                                    break;
                                                }
                                                if (M3 == i62.o) {
                                                    if (andIncrement2 < g62Var2.v()) {
                                                        ho2Var3.b();
                                                    }
                                                } else {
                                                    if (M3 == i62.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    ho2Var3.b();
                                                    this.a = M3;
                                                    this.b = null;
                                                    bool = Boolean.TRUE;
                                                    if (function1 != null) {
                                                        hl6Var = new hl6(19, M3, function1);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        ho2Var.b();
                                        this.a = M2;
                                        this.b = null;
                                        bool = Boolean.TRUE;
                                        if (function1 != null) {
                                            hl6Var = new hl6(19, M2, function1);
                                        }
                                    }
                                    o0.i(bool, hl6Var);
                                }
                                Object q = o0.q();
                                lu3 lu3Var = lu3.a;
                                return q;
                            } catch (Throwable th) {
                                o0.B();
                                throw th;
                            }
                        }
                        ho2Var.b();
                        this.a = M;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.kzk
    public final void b(z0h z0hVar, int i) {
        lj2 lj2Var = this.b;
        if (lj2Var != null) {
            lj2Var.b(z0hVar, i);
        }
    }

    public final Object c() {
        Object obj = this.a;
        ih2 ih2Var = i62.p;
        if (obj == ih2Var) {
            a70.r("`hasNext()` has not been invoked");
            return null;
        }
        this.a = ih2Var;
        if (obj != i62.l) {
            return obj;
        }
        Throwable s = this.c.s();
        int i = x0i.a;
        throw s;
    }
}
