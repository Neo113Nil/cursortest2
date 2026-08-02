package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z0i implements mu3, rq3 {
    public static final z0i a = new z0i();

    @Override // defpackage.mu3
    public final mu3 getCallerFrame() {
        return null;
    }

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        return g.a;
    }

    @Override // defpackage.rq3
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
