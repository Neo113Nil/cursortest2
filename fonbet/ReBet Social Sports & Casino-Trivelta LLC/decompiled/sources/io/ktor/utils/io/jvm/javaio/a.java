package io.ktor.utils.io.jvm.javaio;

import Ph.AbstractC1470p0;
import Ph.C0;
import Ph.InterfaceC1456i0;
import f0.AbstractC4221b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49490f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* renamed from: a, reason: collision with root package name */
    public final C0 f49491a;

    /* renamed from: b, reason: collision with root package name */
    public final Continuation f49492b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1456i0 f49493c;

    /* renamed from: d, reason: collision with root package name */
    public int f49494d;

    /* renamed from: e, reason: collision with root package name */
    public int f49495e;

    @NotNull
    volatile /* synthetic */ int result;

    @NotNull
    volatile /* synthetic */ Object state;

    /* renamed from: io.ktor.utils.io.jvm.javaio.a$a, reason: collision with other inner class name */
    public static final class C0733a extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f49496n;

        public C0733a(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return a.this.new C0733a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f49496n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.this;
                this.f49496n = 1;
                if (aVar.h(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((C0733a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            if (th2 != null) {
                Continuation continuation = a.this.f49492b;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(th2)));
            }
        }
    }

    public static final class c implements Continuation {

        /* renamed from: a, reason: collision with root package name */
        public final CoroutineContext f49499a;

        public c() {
            this.f49499a = a.this.g() != null ? i.f49522b.plus(a.this.g()) : i.f49522b;
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: getContext */
        public CoroutineContext get$context() {
            return this.f49499a;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            Object obj2;
            boolean z10;
            Throwable m150exceptionOrNullimpl;
            C0 g10;
            Object m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(obj);
            if (m150exceptionOrNullimpl2 == null) {
                m150exceptionOrNullimpl2 = Unit.INSTANCE;
            }
            a aVar = a.this;
            do {
                obj2 = aVar.state;
                z10 = obj2 instanceof Thread;
                if (!(z10 ? true : obj2 instanceof Continuation ? true : Intrinsics.areEqual(obj2, this))) {
                    return;
                }
            } while (!AbstractC4221b.a(a.f49490f, aVar, obj2, m150exceptionOrNullimpl2));
            if (z10) {
                f.a().b(obj2);
            } else if ((obj2 instanceof Continuation) && (m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(obj)) != null) {
                ((Continuation) obj2).resumeWith(Result.m147constructorimpl(ResultKt.createFailure(m150exceptionOrNullimpl)));
            }
            if (Result.m153isFailureimpl(obj) && !(Result.m150exceptionOrNullimpl(obj) instanceof CancellationException) && (g10 = a.this.g()) != null) {
                C0.a.b(g10, null, 1, null);
            }
            InterfaceC1456i0 interfaceC1456i0 = a.this.f49493c;
            if (interfaceC1456i0 != null) {
                interfaceC1456i0.dispose();
            }
        }
    }

    public a(C0 c02) {
        this.f49491a = c02;
        c cVar = new c();
        this.f49492b = cVar;
        this.state = this;
        this.result = 0;
        this.f49493c = c02 != null ? c02.invokeOnCompletion(new b()) : null;
        ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(new C0733a(null), 1)).invoke(cVar);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final void d(int i10) {
        this.result = i10;
    }

    public final int e() {
        return this.f49495e;
    }

    public final int f() {
        return this.f49494d;
    }

    public final C0 g() {
        return this.f49491a;
    }

    public abstract Object h(Continuation continuation);

    public final void i(Thread thread) {
        InterfaceC7015a b10;
        if (this.state != thread) {
            return;
        }
        if (!f.b()) {
            b10 = io.ktor.utils.io.jvm.javaio.b.b();
            b10.a("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
        }
        while (true) {
            long b11 = AbstractC1470p0.b();
            if (this.state != thread) {
                return;
            }
            if (b11 > 0) {
                f.a().a(b11);
            }
        }
    }

    public final Object j(Continuation continuation) {
        Object obj;
        Continuation intercepted;
        Object obj2 = null;
        while (true) {
            Object obj3 = this.state;
            if (obj3 instanceof Thread) {
                intercepted = IntrinsicsKt.intercepted(continuation);
                obj = obj3;
            } else {
                if (!Intrinsics.areEqual(obj3, this)) {
                    throw new IllegalStateException("Already suspended or in finished state");
                }
                obj = obj2;
                intercepted = IntrinsicsKt.intercepted(continuation);
            }
            if (AbstractC4221b.a(f49490f, this, obj3, intercepted)) {
                if (obj != null) {
                    f.a().b(obj);
                }
                return IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            obj2 = obj;
        }
    }

    public final void k() {
        InterfaceC1456i0 interfaceC1456i0 = this.f49493c;
        if (interfaceC1456i0 != null) {
            interfaceC1456i0.dispose();
        }
        Continuation continuation = this.f49492b;
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(new CancellationException("Stream closed"))));
    }

    public final int l(Object jobToken) {
        Object obj;
        Object noWhenBranchMatchedException;
        Intrinsics.checkNotNullParameter(jobToken, "jobToken");
        Thread thread = Thread.currentThread();
        Continuation continuation = null;
        do {
            obj = this.state;
            if (obj instanceof Continuation) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>");
                continuation = (Continuation) obj;
                noWhenBranchMatchedException = thread;
            } else {
                if (obj instanceof Unit) {
                    return this.result;
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                if (obj instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (Intrinsics.areEqual(obj, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(noWhenBranchMatchedException, "when (value) {\n         …Exception()\n            }");
        } while (!AbstractC4221b.a(f49490f, this, obj, noWhenBranchMatchedException));
        Intrinsics.checkNotNull(continuation);
        continuation.resumeWith(Result.m147constructorimpl(jobToken));
        Intrinsics.checkNotNullExpressionValue(thread, "thread");
        i(thread);
        Object obj2 = this.state;
        if (obj2 instanceof Throwable) {
            throw ((Throwable) obj2);
        }
        return this.result;
    }

    public final int m(byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f49494d = i10;
        this.f49495e = i11;
        return l(buffer);
    }
}
