package gh;

import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: gh.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4393n extends AbstractC4384e {

    /* renamed from: b, reason: collision with root package name */
    public final List f47449b;

    /* renamed from: c, reason: collision with root package name */
    public final Continuation f47450c;

    /* renamed from: d, reason: collision with root package name */
    public Object f47451d;

    /* renamed from: e, reason: collision with root package name */
    public int f47452e;

    /* renamed from: f, reason: collision with root package name */
    public int f47453f;

    @NotNull
    private final Continuation<Object>[] suspensions;

    /* renamed from: gh.n$a */
    public static final class a implements Continuation, CoroutineStackFrame {

        /* renamed from: a, reason: collision with root package name */
        public int f47454a = Integer.MIN_VALUE;

        public a() {
        }

        public final Continuation a() {
            if (this.f47454a == Integer.MIN_VALUE) {
                this.f47454a = C4393n.this.f47452e;
            }
            if (this.f47454a < 0) {
                this.f47454a = Integer.MIN_VALUE;
                return null;
            }
            try {
                Continuation[] continuationArr = C4393n.this.suspensions;
                int i10 = this.f47454a;
                Continuation continuation = continuationArr[i10];
                if (continuation == null) {
                    return C4392m.f47448a;
                }
                this.f47454a = i10 - 1;
                return continuation;
            } catch (Throwable unused) {
                return C4392m.f47448a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public CoroutineStackFrame getCallerFrame() {
            Continuation a10 = a();
            if (a10 instanceof CoroutineStackFrame) {
                return (CoroutineStackFrame) a10;
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: getContext */
        public CoroutineContext get$context() {
            CoroutineContext coroutineContext;
            Continuation continuation = C4393n.this.suspensions[C4393n.this.f47452e];
            if (continuation == null || (coroutineContext = continuation.get$context()) == null) {
                throw new IllegalStateException("Not started");
            }
            return coroutineContext;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public StackTraceElement getStackTraceElement() {
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            if (!Result.m153isFailureimpl(obj)) {
                C4393n.this.m(false);
                return;
            }
            C4393n c4393n = C4393n.this;
            Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(obj);
            Intrinsics.checkNotNull(m150exceptionOrNullimpl);
            c4393n.n(Result.m147constructorimpl(ResultKt.createFailure(m150exceptionOrNullimpl)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4393n(Object initial, Object context, List blocks) {
        super(context);
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f47449b = blocks;
        this.f47450c = new a();
        this.f47451d = initial;
        this.suspensions = new Continuation[blocks.size()];
        this.f47452e = -1;
    }

    @Override // gh.AbstractC4384e
    public Object a(Object obj, Continuation continuation) {
        this.f47453f = 0;
        if (this.f47449b.size() == 0) {
            return obj;
        }
        o(obj);
        if (this.f47452e < 0) {
            return c(continuation);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // gh.AbstractC4384e
    public Object c(Continuation continuation) {
        Object coroutine_suspended;
        if (this.f47453f == this.f47449b.size()) {
            coroutine_suspended = l();
        } else {
            j(IntrinsicsKt.intercepted(continuation));
            if (m(true)) {
                k();
                coroutine_suspended = l();
            } else {
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
        }
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    @Override // gh.AbstractC4384e
    public Object e(Object obj, Continuation continuation) {
        o(obj);
        return c(continuation);
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f47450c.get$context();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Continuation continuation) {
        Continuation<Object>[] continuationArr = this.suspensions;
        int i10 = this.f47452e + 1;
        this.f47452e = i10;
        continuationArr[i10] = continuation;
    }

    public final void k() {
        int i10 = this.f47452e;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        Continuation<Object>[] continuationArr = this.suspensions;
        this.f47452e = i10 - 1;
        continuationArr[i10] = null;
    }

    public Object l() {
        return this.f47451d;
    }

    public final boolean m(boolean z10) {
        int i10;
        do {
            i10 = this.f47453f;
            if (i10 == this.f47449b.size()) {
                if (z10) {
                    return true;
                }
                Result.Companion companion = Result.INSTANCE;
                n(Result.m147constructorimpl(l()));
                return false;
            }
            this.f47453f = i10 + 1;
            try {
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                n(Result.m147constructorimpl(ResultKt.createFailure(th2)));
                return false;
            }
        } while (((Function3) this.f47449b.get(i10)).invoke(this, l(), this.f47450c) != IntrinsicsKt.getCOROUTINE_SUSPENDED());
        return false;
    }

    public final void n(Object obj) {
        int i10 = this.f47452e;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        Continuation<Object> continuation = this.suspensions[i10];
        Intrinsics.checkNotNull(continuation);
        Continuation<Object>[] continuationArr = this.suspensions;
        int i11 = this.f47452e;
        this.f47452e = i11 - 1;
        continuationArr[i11] = null;
        if (!Result.m153isFailureimpl(obj)) {
            continuation.resumeWith(obj);
            return;
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(obj);
        Intrinsics.checkNotNull(m150exceptionOrNullimpl);
        continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(AbstractC4390k.a(m150exceptionOrNullimpl, continuation))));
    }

    public void o(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f47451d = obj;
    }
}
