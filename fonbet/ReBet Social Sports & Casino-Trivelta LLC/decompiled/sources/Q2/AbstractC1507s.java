package Q2;

import Ph.AbstractC1459k;
import Ph.C0;
import f0.AbstractC4222c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1507s {

    /* renamed from: Q2.s$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f9301n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f9302o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Function2 f9303p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ AbstractC4222c.a f9304q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 function2, AbstractC4222c.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f9303p = function2;
            this.f9304q = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f9303p, this.f9304q, continuation);
            aVar.f9302o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f9301n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ph.P p10 = (Ph.P) this.f9302o;
                    Function2 function2 = this.f9303p;
                    this.f9301n = 1;
                    obj = function2.invoke(p10, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.f9304q.c(obj);
            } catch (CancellationException unused) {
                this.f9304q.d();
            } catch (Throwable th2) {
                this.f9304q.f(th2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Ta.o f(final Executor executor, final String debugTag, final Function0 block) {
        Intrinsics.checkNotNullParameter(executor, "<this>");
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(block, "block");
        Ta.o a10 = AbstractC4222c.a(new AbstractC4222c.InterfaceC0669c() { // from class: Q2.p
            @Override // f0.AbstractC4222c.InterfaceC0669c
            public final Object a(AbstractC4222c.a aVar) {
                Object g10;
                g10 = AbstractC1507s.g(executor, debugTag, block, aVar);
                return g10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a10, "getFuture { completer ->… }\n        debugTag\n    }");
        return a10;
    }

    public static final Object g(Executor executor, String str, final Function0 function0, final AbstractC4222c.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.a(new Runnable() { // from class: Q2.q
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1507s.h(atomicBoolean);
            }
        }, EnumC1496g.INSTANCE);
        executor.execute(new Runnable() { // from class: Q2.r
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1507s.i(atomicBoolean, completer, function0);
            }
        });
        return str;
    }

    public static final void h(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    public static final void i(AtomicBoolean atomicBoolean, AbstractC4222c.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(function0.invoke());
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }

    public static final Ta.o j(final CoroutineContext context, final Ph.S start, final Function2 block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        Ta.o a10 = AbstractC4222c.a(new AbstractC4222c.InterfaceC0669c() { // from class: Q2.n
            @Override // f0.AbstractC4222c.InterfaceC0669c
            public final Object a(AbstractC4222c.a aVar) {
                Object l10;
                l10 = AbstractC1507s.l(CoroutineContext.this, start, block, aVar);
                return l10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a10, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return a10;
    }

    public static /* synthetic */ Ta.o k(CoroutineContext coroutineContext, Ph.S s10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            s10 = Ph.S.f9047a;
        }
        return j(coroutineContext, s10, function2);
    }

    public static final Object l(CoroutineContext coroutineContext, Ph.S s10, Function2 function2, AbstractC4222c.a completer) {
        C0 d10;
        Intrinsics.checkNotNullParameter(completer, "completer");
        final C0 c02 = (C0) coroutineContext.get(C0.f9001U2);
        completer.a(new Runnable() { // from class: Q2.o
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1507s.m(C0.this);
            }
        }, EnumC1496g.INSTANCE);
        d10 = AbstractC1459k.d(Ph.Q.a(coroutineContext), null, s10, new a(function2, completer, null), 1, null);
        return d10;
    }

    public static final void m(C0 c02) {
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
    }
}
