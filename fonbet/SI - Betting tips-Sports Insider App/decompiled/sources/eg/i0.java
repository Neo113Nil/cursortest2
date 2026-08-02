package eg;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f9179a;

    public i0(Throwable th2, w wVar, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + wVar + " threw an exception, context = " + coroutineContext, th2);
        this.f9179a = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f9179a;
    }
}
