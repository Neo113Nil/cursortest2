package Ph;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: Ph.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1451g extends AbstractC1439a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f9086d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1464m0 f9087e;

    public C1451g(CoroutineContext coroutineContext, Thread thread, AbstractC1464m0 abstractC1464m0) {
        super(coroutineContext, true, true);
        this.f9086d = thread;
        this.f9087e = abstractC1464m0;
    }

    public final Object O0() {
        AbstractC1443c.a();
        try {
            AbstractC1464m0 abstractC1464m0 = this.f9087e;
            if (abstractC1464m0 != null) {
                AbstractC1464m0.k2(abstractC1464m0, false, 1, null);
            }
            while (true) {
                try {
                    AbstractC1464m0 abstractC1464m02 = this.f9087e;
                    long n22 = abstractC1464m02 != null ? abstractC1464m02.n2() : LongCompanionObject.MAX_VALUE;
                    if (isCompleted()) {
                        break;
                    }
                    AbstractC1443c.a();
                    LockSupport.parkNanos(this, n22);
                    if (Thread.interrupted()) {
                        B(new InterruptedException());
                    }
                } catch (Throwable th2) {
                    AbstractC1464m0 abstractC1464m03 = this.f9087e;
                    if (abstractC1464m03 != null) {
                        AbstractC1464m0.f2(abstractC1464m03, false, 1, null);
                    }
                    throw th2;
                }
            }
            AbstractC1464m0 abstractC1464m04 = this.f9087e;
            if (abstractC1464m04 != null) {
                AbstractC1464m0.f2(abstractC1464m04, false, 1, null);
            }
            AbstractC1443c.a();
            Object h10 = J0.h(V());
            C c10 = h10 instanceof C ? (C) h10 : null;
            if (c10 == null) {
                return h10;
            }
            throw c10.f9000a;
        } catch (Throwable th3) {
            AbstractC1443c.a();
            throw th3;
        }
    }

    @Override // Ph.I0
    public boolean c0() {
        return true;
    }

    @Override // Ph.I0
    public void y(Object obj) {
        if (Intrinsics.areEqual(Thread.currentThread(), this.f9086d)) {
            return;
        }
        Thread thread = this.f9086d;
        AbstractC1443c.a();
        LockSupport.unpark(thread);
    }
}
