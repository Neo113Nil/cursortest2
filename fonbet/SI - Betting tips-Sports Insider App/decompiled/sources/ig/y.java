package ig;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class y implements Continuation, mf.d {

    /* renamed from: a, reason: collision with root package name */
    public final Continuation f11294a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f11295b;

    public y(Continuation continuation, CoroutineContext coroutineContext) {
        this.f11294a = continuation;
        this.f11295b = coroutineContext;
    }

    @Override // mf.d
    public final mf.d getCallerFrame() {
        Continuation continuation = this.f11294a;
        if (continuation instanceof mf.d) {
            return (mf.d) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f11295b;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f11294a.resumeWith(obj);
    }
}
