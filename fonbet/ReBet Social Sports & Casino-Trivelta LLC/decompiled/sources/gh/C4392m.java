package gh;

import ch.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Reflection;

/* renamed from: gh.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4392m implements CoroutineStackFrame, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public static final C4392m f47448a = new C4392m();

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public CoroutineContext get$context() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return w.a(Reflection.getOrCreateKotlinClass(C4391l.class), "failedToCaptureStackFrame", "StackWalkingFailed.kt", 8);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        C4391l.f47447a.a();
    }
}
