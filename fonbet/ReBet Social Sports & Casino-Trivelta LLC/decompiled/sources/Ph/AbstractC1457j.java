package Ph;

import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: Ph.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC1457j {
    public static final Object a(CoroutineContext coroutineContext, Function2 function2) {
        AbstractC1464m0 a10;
        CoroutineContext j10;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE);
        if (continuationInterceptor == null) {
            a10 = a1.f9061a.b();
            j10 = J.j(C1483w0.f9135a, coroutineContext.plus(a10));
        } else {
            AbstractC1464m0 abstractC1464m0 = continuationInterceptor instanceof AbstractC1464m0 ? (AbstractC1464m0) continuationInterceptor : null;
            if (abstractC1464m0 != null) {
                AbstractC1464m0 abstractC1464m02 = abstractC1464m0.p2() ? abstractC1464m0 : null;
                if (abstractC1464m02 != null) {
                    a10 = abstractC1464m02;
                    j10 = J.j(C1483w0.f9135a, coroutineContext);
                }
            }
            a10 = a1.f9061a.a();
            j10 = J.j(C1483w0.f9135a, coroutineContext);
        }
        C1451g c1451g = new C1451g(j10, currentThread, a10);
        c1451g.N0(S.f9047a, c1451g, function2);
        return c1451g.O0();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return AbstractC1455i.e(coroutineContext, function2);
    }
}
