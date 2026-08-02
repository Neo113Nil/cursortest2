package kotlinx.coroutines.flow.internal;

import Ph.F0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes5.dex */
public final class v extends ContinuationImpl implements InterfaceC5322g, CoroutineStackFrame {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5322g f54783n;

    /* renamed from: o, reason: collision with root package name */
    public final CoroutineContext f54784o;

    /* renamed from: p, reason: collision with root package name */
    public final int f54785p;

    /* renamed from: q, reason: collision with root package name */
    public CoroutineContext f54786q;

    /* renamed from: r, reason: collision with root package name */
    public Continuation f54787r;

    public v(InterfaceC5322g interfaceC5322g, CoroutineContext coroutineContext) {
        super(r.f54777a, EmptyCoroutineContext.INSTANCE);
        this.f54783n = interfaceC5322g;
        this.f54784o = coroutineContext;
        this.f54785p = ((Number) coroutineContext.fold(0, new Function2() { // from class: kotlinx.coroutines.flow.internal.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int k10;
                k10 = v.k(((Integer) obj).intValue(), (CoroutineContext.Element) obj2);
                return Integer.valueOf(k10);
            }
        })).intValue();
    }

    public static final int k(int i10, CoroutineContext.Element element) {
        return i10 + 1;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5322g
    public Object emit(Object obj, Continuation continuation) {
        try {
            Object m10 = m(continuation, obj);
            if (m10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return m10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10 : Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f54786q = new m(th2, continuation.get$context());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f54787r;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public CoroutineContext get$context() {
        CoroutineContext coroutineContext = this.f54786q;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object obj) {
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(obj);
        if (m150exceptionOrNullimpl != null) {
            this.f54786q = new m(m150exceptionOrNullimpl, get$context());
        }
        Continuation continuation = this.f54787r;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public final void j(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Object obj) {
        if (coroutineContext2 instanceof m) {
            o((m) coroutineContext2, obj);
        }
        y.b(this, coroutineContext);
    }

    public final Object m(Continuation continuation, Object obj) {
        Function3 function3;
        CoroutineContext coroutineContext = continuation.get$context();
        F0.m(coroutineContext);
        CoroutineContext coroutineContext2 = this.f54786q;
        if (coroutineContext2 != coroutineContext) {
            j(coroutineContext, coroutineContext2, obj);
            this.f54786q = coroutineContext;
        }
        this.f54787r = continuation;
        function3 = w.f54788a;
        InterfaceC5322g interfaceC5322g = this.f54783n;
        Intrinsics.checkNotNull(interfaceC5322g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = function3.invoke(interfaceC5322g, obj, this);
        if (!Intrinsics.areEqual(invoke, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
            this.f54787r = null;
        }
        return invoke;
    }

    public final void o(m mVar, Object obj) {
        throw new IllegalStateException(StringsKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + mVar.f54776b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
