package xe;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10723g<T> extends AbstractC10711a<T> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Thread f105460d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC10732k0 f105461e;

    public C10723g(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, AbstractC10732k0 abstractC10732k0) {
        super(coroutineContext, true, true);
        this.f105460d = thread;
        this.f105461e = abstractC10732k0;
    }

    @Override // xe.H0
    protected final void r(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f105460d;
        if (Intrinsics.d(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T z0() {
        AbstractC10732k0 abstractC10732k0 = this.f105461e;
        if (abstractC10732k0 != null) {
            int i11 = AbstractC10732k0.f105471e;
            abstractC10732k0.E0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long L02 = abstractC10732k0 != null ? abstractC10732k0.L0() : Long.MAX_VALUE;
                if (l0()) {
                    if (abstractC10732k0 != null) {
                        int i12 = AbstractC10732k0.f105471e;
                        abstractC10732k0.x(false);
                    }
                    T t2 = (T) I0.g(U());
                    C10760z c10760z = t2 instanceof C10760z ? (C10760z) t2 : null;
                    if (c10760z == null) {
                        return t2;
                    }
                    throw c10760z.f105510a;
                }
                LockSupport.parkNanos(this, L02);
            } catch (Throwable th2) {
                if (abstractC10732k0 != null) {
                    int i13 = AbstractC10732k0.f105471e;
                    abstractC10732k0.x(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        x(interruptedException);
        throw interruptedException;
    }
}
