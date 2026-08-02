package Rh;

import Ph.C0;
import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.J;
import Ph.P;
import Ph.S;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public abstract class w {

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f10379n;

        /* renamed from: o, reason: collision with root package name */
        public Object f10380o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f10381p;

        /* renamed from: q, reason: collision with root package name */
        public int f10382q;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10381p = obj;
            this.f10382q |= Integer.MIN_VALUE;
            return w.a(null, null, this);
        }
    }

    public static final class b implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1465n f10383a;

        public b(InterfaceC1465n interfaceC1465n) {
            this.f10383a = interfaceC1465n;
        }

        public final void a(Throwable th2) {
            InterfaceC1465n interfaceC1465n = this.f10383a;
            Result.Companion companion = Result.INSTANCE;
            interfaceC1465n.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(y yVar, Function0 function0, Continuation continuation) {
        a aVar;
        int i10;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f10382q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f10382q = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f10381p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f10382q;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (aVar.get$context().get(C0.f9001U2) != yVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        aVar.f10379n = yVar;
                        aVar.f10380o = function0;
                        aVar.f10382q = 1;
                        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(aVar), 1);
                        c1469p.F();
                        yVar.g(new b(c1469p));
                        Object z10 = c1469p.z();
                        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(aVar);
                        }
                        if (z10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (Function0) aVar.f10380o;
                        ResultKt.throwOnFailure(obj);
                    }
                    function0.invoke();
                    return Unit.INSTANCE;
                }
            }
            if (i10 != 0) {
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f10381p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f10382q;
    }

    public static final A b(P p10, CoroutineContext coroutineContext, int i10, d dVar, S s10, Function1 function1, Function2 function2) {
        x xVar = new x(J.j(p10, coroutineContext), m.b(i10, dVar, null, 4, null));
        if (function1 != null) {
            xVar.invokeOnCompletion(function1);
        }
        xVar.N0(s10, xVar, function2);
        return xVar;
    }

    public static final A c(P p10, CoroutineContext coroutineContext, int i10, Function2 function2) {
        return b(p10, coroutineContext, i10, d.f10307a, S.f9047a, null, function2);
    }

    public static /* synthetic */ A d(P p10, CoroutineContext coroutineContext, int i10, d dVar, S s10, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            dVar = d.f10307a;
        }
        if ((i11 & 8) != 0) {
            s10 = S.f9047a;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        return b(p10, coroutineContext, i10, dVar, s10, function12, function2);
    }

    public static /* synthetic */ A e(P p10, CoroutineContext coroutineContext, int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c(p10, coroutineContext, i10, function2);
    }
}
