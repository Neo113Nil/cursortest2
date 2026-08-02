package jg;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient CoroutineContext f18496a;

    public f(CoroutineContext coroutineContext) {
        this.f18496a = coroutineContext;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f18496a);
    }
}
