package eg;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f extends a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f9170d;

    /* renamed from: e, reason: collision with root package name */
    public final w0 f9171e;

    public f(CoroutineContext coroutineContext, Thread thread, w0 w0Var) {
        super(coroutineContext, true);
        this.f9170d = thread;
        this.f9171e = w0Var;
    }

    @Override // eg.m1
    public final void j(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f9170d;
        if (Intrinsics.areEqual(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
