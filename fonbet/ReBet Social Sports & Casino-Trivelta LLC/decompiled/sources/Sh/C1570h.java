package Sh;

import kotlin.coroutines.CoroutineContext;

/* renamed from: Sh.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1570h extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient CoroutineContext f10787a;

    public C1570h(CoroutineContext coroutineContext) {
        this.f10787a = coroutineContext;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return String.valueOf(this.f10787a);
    }
}
