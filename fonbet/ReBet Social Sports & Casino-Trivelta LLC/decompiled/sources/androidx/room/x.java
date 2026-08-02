package androidx.room;

import Ph.AbstractC1455i;
import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.P;
import Ph.Z0;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class x {

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f23456a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1465n f23457b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w f23458c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function2 f23459d;

        /* renamed from: androidx.room.x$a$a, reason: collision with other inner class name */
        public static final class C0408a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f23460n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f23461o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ w f23462p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1465n f23463q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Function2 f23464r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0408a(w wVar, InterfaceC1465n interfaceC1465n, Function2 function2, Continuation continuation) {
                super(2, continuation);
                this.f23462p = wVar;
                this.f23463q = interfaceC1465n;
                this.f23464r = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0408a c0408a = new C0408a(this.f23462p, this.f23463q, this.f23464r, continuation);
                c0408a.f23461o = obj;
                return c0408a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0408a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Continuation continuation;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f23460n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext.Element element = ((P) this.f23461o).getCoroutineContext().get(ContinuationInterceptor.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    CoroutineContext b10 = x.b(this.f23462p, (ContinuationInterceptor) element);
                    InterfaceC1465n interfaceC1465n = this.f23463q;
                    Result.Companion companion = Result.INSTANCE;
                    Function2 function2 = this.f23464r;
                    this.f23461o = interfaceC1465n;
                    this.f23460n = 1;
                    obj = AbstractC1455i.g(b10, function2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    continuation = interfaceC1465n;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    continuation = (Continuation) this.f23461o;
                    ResultKt.throwOnFailure(obj);
                }
                continuation.resumeWith(Result.m147constructorimpl(obj));
                return Unit.INSTANCE;
            }
        }

        public a(CoroutineContext coroutineContext, InterfaceC1465n interfaceC1465n, w wVar, Function2 function2) {
            this.f23456a = coroutineContext;
            this.f23457b = interfaceC1465n;
            this.f23458c = wVar;
            this.f23459d = function2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AbstractC1455i.e(this.f23456a.minusKey(ContinuationInterceptor.INSTANCE), new C0408a(this.f23458c, this.f23457b, this.f23459d, null));
            } catch (Throwable th2) {
                this.f23457b.cancel(th2);
            }
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f23465n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f23466o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ w f23467p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function1 f23468q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w wVar, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f23467p = wVar;
            this.f23468q = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f23467p, this.f23468q, continuation);
            bVar.f23466o = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            H h10;
            H coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f23465n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext.Element element = ((P) this.f23466o).getCoroutineContext().get(H.f23274c);
                    Intrinsics.checkNotNull(element);
                    H h11 = (H) element;
                    h11.a();
                    try {
                        this.f23467p.beginTransaction();
                        try {
                            Function1 function1 = this.f23468q;
                            this.f23466o = h11;
                            this.f23465n = 1;
                            Object invoke = function1.invoke(this);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            h10 = h11;
                            obj = invoke;
                        } catch (Throwable th3) {
                            th2 = th3;
                            this.f23467p.endTransaction();
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        coroutine_suspended = h11;
                        th = th4;
                        coroutine_suspended.c();
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h10 = (H) this.f23466o;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th5) {
                        th2 = th5;
                        this.f23467p.endTransaction();
                        throw th2;
                    }
                }
                this.f23467p.setTransactionSuccessful();
                this.f23467p.endTransaction();
                h10.c();
                return obj;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    public static final CoroutineContext b(w wVar, ContinuationInterceptor continuationInterceptor) {
        H h10 = new H(continuationInterceptor);
        return continuationInterceptor.plus(h10).plus(Z0.a(wVar.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(h10))));
    }

    public static final Object c(w wVar, CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        try {
            wVar.getTransactionExecutor().execute(new a(coroutineContext, c1469p, wVar, function2));
        } catch (RejectedExecutionException e10) {
            c1469p.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10;
    }

    public static final Object d(w wVar, Function1 function1, Continuation continuation) {
        b bVar = new b(wVar, function1, null);
        H h10 = (H) continuation.get$context().get(H.f23274c);
        ContinuationInterceptor b10 = h10 != null ? h10.b() : null;
        return b10 != null ? AbstractC1455i.g(b10, bVar, continuation) : c(wVar, continuation.get$context(), bVar, continuation);
    }
}
