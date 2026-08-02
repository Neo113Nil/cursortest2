package Rh;

import Ph.AbstractC1473r0;
import Ph.C0;
import Ph.N;
import Ph.U;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* renamed from: Rh.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1560a extends k implements InterfaceC1562c {
    public C1560a(CoroutineContext coroutineContext, j jVar, boolean z10) {
        super(coroutineContext, jVar, false, z10);
        a0((C0) coroutineContext.get(C0.f9001U2));
    }

    @Override // Ph.I0
    public boolean Y(Throwable th2) {
        N.a(get$context(), th2);
        return true;
    }

    @Override // Ph.I0
    public void p0(Throwable th2) {
        j O02 = O0();
        if (th2 != null) {
            r1 = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (r1 == null) {
                r1 = AbstractC1473r0.a(U.a(this) + " was cancelled", th2);
            }
        }
        O02.cancel(r1);
    }
}
