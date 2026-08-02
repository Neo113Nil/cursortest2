package Ph;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class i1 extends L {

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f9099b = new i1();

    @Override // Ph.L
    public void Y1(CoroutineContext coroutineContext, Runnable runnable) {
        m1 m1Var = (m1) coroutineContext.get(m1.f9110b);
        if (m1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        m1Var.f9111a = true;
    }

    @Override // Ph.L
    public boolean a2(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // Ph.L
    public L c2(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // Ph.L
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
