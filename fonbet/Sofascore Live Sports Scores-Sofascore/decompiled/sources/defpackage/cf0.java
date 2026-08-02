package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cf0 implements lp3 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ k8f b;

    public cf0(AtomicReference atomicReference, k8f k8fVar) {
        this.a = atomicReference;
        this.b = k8fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Function2 function2, sq3 sq3Var) {
        bf0 bf0Var;
        int i;
        if (sq3Var instanceof bf0) {
            bf0Var = (bf0) sq3Var;
            int i2 = bf0Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bf0Var.u = i2 - Integer.MIN_VALUE;
                Object obj = bf0Var.s;
                lu3 lu3Var = lu3.a;
                i = bf0Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    bf0Var.r = function2;
                    bf0Var.u = 1;
                    lj2 lj2Var = new lj2(1, z9a.b(bf0Var));
                    lj2Var.t();
                    k8f k8fVar = this.b;
                    lj2Var.v(new oo(k8fVar, 7));
                    kj2 kj2Var = (kj2) this.a.getAndSet(lj2Var);
                    if (kj2Var != null) {
                        kj2Var.a(null);
                    }
                    ((j8f) k8fVar).d(function2);
                    if (lj2Var.q() == lu3Var) {
                        return;
                    }
                } else if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    Function2 function22 = bf0Var.r;
                    y6a.M(obj);
                }
                pvd.x();
            }
        }
        bf0Var = new bf0(this, sq3Var);
        Object obj2 = bf0Var.s;
        lu3 lu3Var2 = lu3.a;
        i = bf0Var.u;
        if (i != 0) {
        }
        pvd.x();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        return e.c(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.d(this, coroutineContext);
    }
}
