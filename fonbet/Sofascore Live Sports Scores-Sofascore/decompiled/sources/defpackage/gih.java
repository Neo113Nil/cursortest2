package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gih implements h7a {
    public final j2d a;
    public final de0 b;
    public final pog c;

    public gih(String str) {
        str.getClass();
        this.a = new j2d();
        this.b = new de0(10);
        this.c = new pog(new i40(2, null, 9));
    }

    @Override // defpackage.h7a
    public final Object a(pf4 pf4Var) {
        return new Integer(((AtomicInteger) this.b.b).incrementAndGet());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.h7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function2 function2, sq3 sq3Var) {
        fih fihVar;
        int i;
        j2d j2dVar;
        boolean z;
        Throwable th;
        if (sq3Var instanceof fih) {
            fihVar = (fih) sq3Var;
            int i2 = fihVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fihVar.v = i2 - Integer.MIN_VALUE;
                Object obj = fihVar.t;
                Object obj2 = lu3.a;
                i = fihVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    j2d j2dVar2 = this.a;
                    boolean g = j2dVar2.g();
                    try {
                        Object valueOf = Boolean.valueOf(g);
                        fihVar.r = j2dVar2;
                        fihVar.s = g;
                        fihVar.v = 1;
                        Object invoke = function2.invoke(valueOf, fihVar);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        j2dVar = j2dVar2;
                        z = g;
                        obj = invoke;
                    } catch (Throwable th2) {
                        j2dVar = j2dVar2;
                        z = g;
                        th = th2;
                        if (z) {
                            j2dVar.f(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = fihVar.s;
                    j2dVar = fihVar.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    j2dVar.f(null);
                }
                return obj;
            }
        }
        fihVar = new fih(this, sq3Var);
        Object obj3 = fihVar.t;
        Object obj22 = lu3.a;
        i = fihVar.v;
        if (i != 0) {
        }
        if (z) {
        }
        return obj3;
    }

    @Override // defpackage.h7a
    public final z88 c() {
        return this.c;
    }

    @Override // defpackage.h7a
    public final Object d(sq3 sq3Var) {
        return new Integer(((AtomicInteger) this.b.b).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [gih] */
    /* JADX WARN: Type inference failed for: r6v1, types: [h2d] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [h2d] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.h7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Function1 function1, sq3 sq3Var) {
        eih eihVar;
        int i;
        j2d j2dVar;
        try {
            if (sq3Var instanceof eih) {
                eihVar = (eih) sq3Var;
                int i2 = eihVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eihVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = eihVar.t;
                    lu3 lu3Var = lu3.a;
                    i = eihVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        eihVar.r = function1;
                        j2d j2dVar2 = this.a;
                        eihVar.s = j2dVar2;
                        eihVar.v = 1;
                        Object e = j2dVar2.e(eihVar);
                        j2dVar = j2dVar2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2d h2dVar = (h2d) eihVar.r;
                            y6a.M(obj);
                            this = h2dVar;
                            return obj;
                        }
                        j2d j2dVar3 = eihVar.s;
                        function1 = (Function1) eihVar.r;
                        y6a.M(obj);
                        j2dVar = j2dVar3;
                    }
                    eihVar.r = j2dVar;
                    eihVar.s = null;
                    eihVar.v = 2;
                    obj = function1.invoke(eihVar);
                    this = j2dVar;
                }
            }
            if (i != 0) {
            }
            eihVar.r = j2dVar;
            eihVar.s = null;
            eihVar.v = 2;
            obj = function1.invoke(eihVar);
            this = j2dVar;
        } finally {
            this.f(null);
        }
        eihVar = new eih(this, sq3Var);
        Object obj2 = eihVar.t;
        lu3 lu3Var2 = lu3.a;
        i = eihVar.v;
    }
}
