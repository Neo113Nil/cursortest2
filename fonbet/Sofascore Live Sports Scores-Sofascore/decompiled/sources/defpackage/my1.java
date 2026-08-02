package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class my1 extends c3 {
    public final Thread e;
    public final g26 f;

    public my1(CoroutineContext coroutineContext, Thread thread, g26 g26Var) {
        super(coroutineContext, true);
        this.e = thread;
        this.f = g26Var;
    }

    @Override // defpackage.kea
    public final void u(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.e;
        if (Intrinsics.c(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
