package Y0;

import Ph.G0;
import Ph.P;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements AutoCloseable, P {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f13892a;

    public a(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f13892a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        G0.e(getCoroutineContext(), null, 1, null);
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f13892a;
    }
}
