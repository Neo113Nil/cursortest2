package Ph;

import kotlin.coroutines.CoroutineContext;

/* renamed from: Ph.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1442b0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f9063a;

    public C1442b0(Throwable th2, L l10, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + l10 + " threw an exception, context = " + coroutineContext, th2);
        this.f9063a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f9063a;
    }
}
