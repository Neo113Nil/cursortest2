package eg;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c2 extends w {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9160c = 0;

    static {
        new c2();
    }

    @Override // eg.w
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        g2 g2Var = (g2) coroutineContext.r(g2.f9174c);
        if (g2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        g2Var.f9175b = true;
    }

    @Override // eg.w
    public final w h0(int i5) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // eg.w
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
