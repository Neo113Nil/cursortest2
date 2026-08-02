package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w0i implements rq3, mu3 {
    public final tn2 a;
    public final CoroutineContext b;

    public w0i(tn2 tn2Var, CoroutineContext coroutineContext) {
        this.a = tn2Var;
        this.b = coroutineContext;
    }

    @Override // defpackage.mu3
    public final mu3 getCallerFrame() {
        return this.a;
    }

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        return this.b;
    }

    @Override // defpackage.rq3
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
