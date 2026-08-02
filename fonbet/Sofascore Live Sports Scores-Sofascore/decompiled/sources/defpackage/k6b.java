package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k6b implements p6b, ku3 {
    public final g6b a;
    public final CoroutineContext b;

    public k6b(g6b g6bVar, CoroutineContext coroutineContext) {
        g6bVar.getClass();
        coroutineContext.getClass();
        this.a = g6bVar;
        this.b = coroutineContext;
        if (g6bVar.b() == e6b.a) {
            bea.p(coroutineContext, null);
        }
    }

    public final void a(Function2 function2) {
        xw3.L(this, null, null, new j6b(this, function2, null, 0), 3);
    }

    public final yda b(Function2 function2) {
        return xw3.L(this, null, null, new j6b(this, function2, null, 1), 3);
    }

    public final yda c(Function2 function2) {
        return xw3.L(this, null, null, new j6b(this, function2, null, 2), 3);
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        g6b g6bVar = this.a;
        if (g6bVar.b().compareTo(e6b.a) <= 0) {
            g6bVar.d(this);
            bea.p(this.b, null);
        }
    }
}
