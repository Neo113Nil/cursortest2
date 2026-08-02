package io.ktor.utils.io.internal;

import Ph.C0;
import Ph.InterfaceC1456i0;
import f0.AbstractC4221b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49450a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49451b = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "jobCancellationHandler");

    @NotNull
    private volatile /* synthetic */ Object state = null;

    @NotNull
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    /* renamed from: io.ktor.utils.io.internal.a$a, reason: collision with other inner class name */
    public final class C0731a implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public final C0 f49452a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC1456i0 f49453b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f49454c;

        public C0731a(a aVar, C0 job) {
            Intrinsics.checkNotNullParameter(job, "job");
            this.f49454c = aVar;
            this.f49452a = job;
            InterfaceC1456i0 e10 = C0.a.e(job, true, false, this, 2, null);
            if (job.isActive()) {
                this.f49453b = e10;
            }
        }

        public final void a() {
            InterfaceC1456i0 interfaceC1456i0 = this.f49453b;
            if (interfaceC1456i0 != null) {
                this.f49453b = null;
                interfaceC1456i0.dispose();
            }
        }

        public final C0 b() {
            return this.f49452a;
        }

        public void c(Throwable th2) {
            this.f49454c.j(this);
            a();
            if (th2 != null) {
                this.f49454c.m(this.f49452a, th2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    public final void g(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        resumeWith(Result.m147constructorimpl(value));
        C0731a c0731a = (C0731a) f49451b.getAndSet(this, null);
        if (c0731a != null) {
            c0731a.a();
        }
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public CoroutineContext get$context() {
        CoroutineContext coroutineContext;
        Object obj = this.state;
        Continuation continuation = obj instanceof Continuation ? (Continuation) obj : null;
        return (continuation == null || (coroutineContext = continuation.get$context()) == null) ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    public final void h(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Result.Companion companion = Result.INSTANCE;
        resumeWith(Result.m147constructorimpl(ResultKt.createFailure(cause)));
        C0731a c0731a = (C0731a) f49451b.getAndSet(this, null);
        if (c0731a != null) {
            c0731a.a();
        }
    }

    public final Object i(Continuation actual) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                if (AbstractC4221b.a(f49450a, this, null, actual)) {
                    k(actual.get$context());
                    return IntrinsicsKt.getCOROUTINE_SUSPENDED();
                }
            } else if (AbstractC4221b.a(f49450a, this, obj, null)) {
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of io.ktor.utils.io.internal.CancellableReusableContinuation");
                return obj;
            }
        }
    }

    public final void j(C0731a c0731a) {
        AbstractC4221b.a(f49451b, this, c0731a, null);
    }

    public final void k(CoroutineContext coroutineContext) {
        Object obj;
        C0731a c0731a;
        C0 c02 = (C0) coroutineContext.get(C0.f9001U2);
        C0731a c0731a2 = (C0731a) this.jobCancellationHandler;
        if ((c0731a2 != null ? c0731a2.b() : null) == c02) {
            return;
        }
        if (c02 == null) {
            C0731a c0731a3 = (C0731a) f49451b.getAndSet(this, null);
            if (c0731a3 != null) {
                c0731a3.a();
                return;
            }
            return;
        }
        C0731a c0731a4 = new C0731a(this, c02);
        do {
            obj = this.jobCancellationHandler;
            c0731a = (C0731a) obj;
            if (c0731a != null && c0731a.b() == c02) {
                c0731a4.a();
                return;
            }
        } while (!AbstractC4221b.a(f49451b, this, obj, c0731a4));
        if (c0731a != null) {
            c0731a.a();
        }
    }

    public final void m(C0 c02, Throwable th2) {
        Object obj;
        Continuation continuation;
        do {
            obj = this.state;
            if (!(obj instanceof Continuation)) {
                return;
            }
            continuation = (Continuation) obj;
            if (continuation.get$context().get(C0.f9001U2) != c02) {
                return;
            }
        } while (!AbstractC4221b.a(f49450a, this, obj, null));
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(th2)));
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        Object obj2;
        Object obj3;
        do {
            obj2 = this.state;
            if (obj2 == null) {
                obj3 = Result.m150exceptionOrNullimpl(obj);
                if (obj3 == null) {
                    ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                }
            } else if (!(obj2 instanceof Continuation)) {
                return;
            } else {
                obj3 = null;
            }
        } while (!AbstractC4221b.a(f49450a, this, obj2, obj3));
        if (obj2 instanceof Continuation) {
            ((Continuation) obj2).resumeWith(obj);
        }
    }
}
