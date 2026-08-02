package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nhh implements ku3, l4h {
    public final /* synthetic */ ku3 a;
    public final g62 b;

    public nhh(ku3 ku3Var, g62 g62Var) {
        ku3Var.getClass();
        this.a = ku3Var;
        this.b = g62Var;
    }

    @Override // defpackage.l4h
    public final void b(Function1 function1) {
        this.b.b(function1);
    }

    @Override // defpackage.l4h
    public final Object d(Object obj) {
        return this.b.d(obj);
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    @Override // defpackage.l4h
    public final Object q(rq3 rq3Var, Object obj) {
        return this.b.q(rq3Var, obj);
    }

    @Override // defpackage.l4h
    public final boolean r(Throwable th) {
        return this.b.c(null, false);
    }
}
