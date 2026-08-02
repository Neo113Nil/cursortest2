package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iz2 implements AutoCloseable, ku3 {
    public final CoroutineContext a;

    public iz2(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        bea.p(this.a, null);
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }
}
