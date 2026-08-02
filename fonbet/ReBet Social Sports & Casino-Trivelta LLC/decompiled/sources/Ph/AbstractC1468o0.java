package Ph;

import Ph.AbstractC1466n0;
import java.util.concurrent.locks.LockSupport;

/* renamed from: Ph.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1468o0 extends AbstractC1464m0 {
    public abstract Thread q2();

    public void r2(long j10, AbstractC1466n0.c cVar) {
        V.f9056h.F2(j10, cVar);
    }

    public final void s2() {
        Thread q22 = q2();
        if (Thread.currentThread() != q22) {
            AbstractC1443c.a();
            LockSupport.unpark(q22);
        }
    }
}
