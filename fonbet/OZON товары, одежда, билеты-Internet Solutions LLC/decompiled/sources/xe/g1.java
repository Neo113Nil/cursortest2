package xe;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g1 extends I {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final g1 f105462b = new g1();

    @Override // xe.I
    public final void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        k1 k1Var = (k1) coroutineContext.get(k1.f105475b);
        if (k1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        k1Var.f105476a = true;
    }

    @Override // xe.I
    @NotNull
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
