package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class l2g extends h21 {
    public l2g(rq3 rq3Var) {
        super(rq3Var);
        if (rq3Var == null || rq3Var.getContext() == g.a) {
            return;
        }
        a70.p("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        return g.a;
    }
}
