package Ph;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ph.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC1459k {
    public static final X a(P p10, CoroutineContext coroutineContext, S s10, Function2 function2) {
        CoroutineContext j10 = J.j(p10, coroutineContext);
        Y k02 = s10.c() ? new K0(j10, function2) : new Y(j10, true);
        k02.N0(s10, k02, function2);
        return k02;
    }

    public static /* synthetic */ X b(P p10, CoroutineContext coroutineContext, S s10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            s10 = S.f9047a;
        }
        return AbstractC1455i.a(p10, coroutineContext, s10, function2);
    }

    public static final C0 c(P p10, CoroutineContext coroutineContext, S s10, Function2 function2) {
        CoroutineContext j10 = J.j(p10, coroutineContext);
        V0 l02 = s10.c() ? new L0(j10, function2) : new V0(j10, true);
        l02.N0(s10, l02, function2);
        return l02;
    }

    public static /* synthetic */ C0 d(P p10, CoroutineContext coroutineContext, S s10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            s10 = S.f9047a;
        }
        return AbstractC1455i.c(p10, coroutineContext, s10, function2);
    }

    public static final Object e(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        Object P02;
        CoroutineContext coroutineContext2 = continuation.get$context();
        CoroutineContext k10 = J.k(coroutineContext2, coroutineContext);
        F0.m(k10);
        if (k10 == coroutineContext2) {
            Sh.C c10 = new Sh.C(k10, continuation);
            P02 = Th.b.d(c10, c10, function2);
        } else {
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(k10.get(companion), coroutineContext2.get(companion))) {
                j1 j1Var = new j1(k10, continuation);
                CoroutineContext coroutineContext3 = j1Var.get$context();
                Object i10 = Sh.N.i(coroutineContext3, null);
                try {
                    Object d10 = Th.b.d(j1Var, j1Var, function2);
                    Sh.N.f(coroutineContext3, i10);
                    P02 = d10;
                } catch (Throwable th2) {
                    Sh.N.f(coroutineContext3, i10);
                    throw th2;
                }
            } else {
                C1444c0 c1444c0 = new C1444c0(k10, continuation);
                Th.a.c(function2, c1444c0, c1444c0);
                P02 = c1444c0.P0();
            }
        }
        if (P02 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return P02;
    }
}
