package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ece implements wuc {
    public final wuc a;
    public final en0 b = new en0(9);

    public ece(wuc wucVar) {
        this.a = wucVar;
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.wuc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Function1 function1, rq3 rq3Var) {
        dce dceVar;
        int i;
        boolean z;
        Object q;
        if (rq3Var instanceof dce) {
            dceVar = (dce) rq3Var;
            int i2 = dceVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dceVar.u = i2 - Integer.MIN_VALUE;
                Object obj = dceVar.s;
                lu3 lu3Var = lu3.a;
                i = dceVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    en0 en0Var = this.b;
                    dceVar.r = function1;
                    dceVar.u = 1;
                    synchronized (en0Var.c) {
                        z = en0Var.b;
                    }
                    if (z) {
                        q = Unit.a;
                    } else {
                        lj2 lj2Var = new lj2(1, z9a.b(dceVar));
                        lj2Var.t();
                        synchronized (en0Var.c) {
                            ((ArrayList) en0Var.d).add(lj2Var);
                        }
                        lj2Var.v(new j87(21, en0Var, lj2Var));
                        q = lj2Var.q();
                        if (q != lu3Var) {
                            q = Unit.a;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = dceVar.r;
                    y6a.M(obj);
                }
                wuc wucVar = this.a;
                dceVar.r = null;
                dceVar.u = 2;
                Object p = wucVar.p(function1, dceVar);
                return p != lu3Var ? lu3Var : p;
            }
        }
        dceVar = new dce(this, rq3Var);
        Object obj2 = dceVar.s;
        lu3 lu3Var2 = lu3.a;
        i = dceVar.u;
        if (i != 0) {
        }
        wuc wucVar2 = this.a;
        dceVar.r = null;
        dceVar.u = 2;
        Object p2 = wucVar2.p(function1, dceVar);
        if (p2 != lu3Var2) {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.d(this, coroutineContext);
    }
}
