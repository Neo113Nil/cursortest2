package Th;

import Ph.C1442b0;
import Ph.J0;
import Ph.f1;
import Sh.C;
import Sh.N;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes5.dex */
public abstract class b {
    public static final Void a(C c10, C1442b0 c1442b0) {
        c10.g0(new Ph.C(c1442b0.getCause(), false, 2, null));
        throw c1442b0.getCause();
    }

    public static final boolean b(C c10, Throwable th2) {
        return ((th2 instanceof f1) && ((f1) th2).f9085a == c10) ? false : true;
    }

    public static final void c(Function2 function2, Object obj, Continuation continuation) {
        Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext coroutineContext = probeCoroutineCreated.get$context();
            Object i10 = N.i(coroutineContext, null);
            try {
                DebugProbesKt.probeCoroutineResumed(probeCoroutineCreated);
                Object wrapWithContinuationImpl = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, obj, probeCoroutineCreated) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, probeCoroutineCreated);
                N.f(coroutineContext, i10);
                if (wrapWithContinuationImpl != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    probeCoroutineCreated.resumeWith(Result.m147constructorimpl(wrapWithContinuationImpl));
                }
            } catch (Throwable th2) {
                N.f(coroutineContext, i10);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof C1442b0) {
                th = ((C1442b0) th).getCause();
            }
            Result.Companion companion = Result.INSTANCE;
            probeCoroutineCreated.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(th)));
        }
    }

    public static final Object d(C c10, Object obj, Function2 function2) {
        return f(c10, true, obj, function2);
    }

    public static final Object e(C c10, Object obj, Function2 function2) {
        return f(c10, false, obj, function2);
    }

    public static final Object f(C c10, boolean z10, Object obj, Function2 function2) {
        Object c11;
        try {
            c11 = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, obj, c10) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, c10);
        } catch (C1442b0 e10) {
            a(c10, e10);
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            c11 = new Ph.C(th2, false, 2, null);
        }
        if (c11 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object h02 = c10.h0(c11);
        if (h02 == J0.f9032b) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        c10.O0();
        if (!(h02 instanceof Ph.C)) {
            return J0.h(h02);
        }
        if (z10 || b(c10, ((Ph.C) h02).f9000a)) {
            throw ((Ph.C) h02).f9000a;
        }
        if (c11 instanceof Ph.C) {
            throw ((Ph.C) c11).f9000a;
        }
        return c11;
    }
}
