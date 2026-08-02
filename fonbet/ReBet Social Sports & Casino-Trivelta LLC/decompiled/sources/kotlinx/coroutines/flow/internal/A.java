package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* loaded from: classes5.dex */
public final class A implements Continuation, CoroutineStackFrame {

    /* renamed from: a, reason: collision with root package name */
    public final Continuation f54697a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f54698b;

    public A(Continuation continuation, CoroutineContext coroutineContext) {
        this.f54697a = continuation;
        this.f54698b = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f54697a;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f54698b;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.f54697a.resumeWith(obj);
    }
}
