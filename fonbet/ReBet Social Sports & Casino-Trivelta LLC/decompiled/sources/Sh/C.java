package Sh;

import Ph.AbstractC1439a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* loaded from: classes5.dex */
public class C extends AbstractC1439a implements CoroutineStackFrame {

    /* renamed from: d, reason: collision with root package name */
    public final Continuation f10761d;

    public C(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, true, true);
        this.f10761d = continuation;
    }

    @Override // Ph.AbstractC1439a
    public void K0(Object obj) {
        Continuation continuation = this.f10761d;
        continuation.resumeWith(Ph.E.a(obj, continuation));
    }

    @Override // Ph.I0
    public final boolean c0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f10761d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Ph.I0
    public void y(Object obj) {
        AbstractC1572j.b(IntrinsicsKt.intercepted(this.f10761d), Ph.E.a(obj, this.f10761d));
    }

    public void O0() {
    }
}
