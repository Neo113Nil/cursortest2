package defpackage;

import android.view.Choreographer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n40 implements wuc {
    public final Choreographer a;
    public final l40 b;

    public n40(Choreographer choreographer, l40 l40Var) {
        this.a = choreographer;
        this.b = l40Var;
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

    @Override // defpackage.wuc
    public final Object p(Function1 function1, rq3 rq3Var) {
        l40 l40Var = this.b;
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        m40 m40Var = new m40(lj2Var, this, function1);
        if (Intrinsics.c(l40Var.c, this.a)) {
            synchronized (l40Var.e) {
                try {
                    l40Var.g.add(m40Var);
                    if (!l40Var.j) {
                        l40Var.j = true;
                        l40Var.c.postFrameCallback(l40Var.k);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            lj2Var.v(new i20(3, l40Var, m40Var));
        } else {
            this.a.postFrameCallback(m40Var);
            lj2Var.v(new i20(4, this, m40Var));
        }
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.d(this, coroutineContext);
    }
}
