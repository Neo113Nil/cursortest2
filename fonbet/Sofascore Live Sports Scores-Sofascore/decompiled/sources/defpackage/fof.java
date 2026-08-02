package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fof implements ku3 {
    public final db2 a;
    public final CoroutineContext b;

    public fof(db2 db2Var, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.a = db2Var;
        this.b = coroutineContext;
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }
}
