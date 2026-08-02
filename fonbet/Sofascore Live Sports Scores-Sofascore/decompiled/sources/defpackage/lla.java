package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lla implements swf, cu3 {
    public final CoroutineContext a;
    public final Function2 b;
    public final ad2 c;
    public g9i d;

    public lla(CoroutineContext coroutineContext, Function2 function2) {
        this.a = coroutineContext;
        this.b = function2;
        this.c = s9a.c(coroutineContext.plus(this));
    }

    @Override // defpackage.swf
    public final void a() {
        g9i g9iVar = this.d;
        if (g9iVar != null) {
            bea.o(g9iVar, "Old job was still running!", null);
        }
        this.d = xw3.L(this.c, null, null, this.b, 3);
    }

    @Override // defpackage.swf
    public final void b() {
        g9i g9iVar = this.d;
        if (g9iVar != null) {
            g9iVar.y(new km8(1));
        }
        this.d = null;
    }

    @Override // defpackage.swf
    public final void d() {
        g9i g9iVar = this.d;
        if (g9iVar != null) {
            g9iVar.y(new km8(1));
        }
        this.d = null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return bu3.a;
    }

    @Override // defpackage.cu3
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        qg3 qg3Var = (qg3) coroutineContext.get(qg3.b);
        if (qg3Var != null) {
            u6h.W(th, new ix1(25, qg3Var, this));
        }
        cu3 cu3Var = (cu3) this.a.get(bu3.a);
        if (cu3Var == null) {
            throw th;
        }
        cu3Var.handleException(coroutineContext, th);
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
