package u1;

import eg.c0;
import eg.z;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements AutoCloseable, z {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f24010a;

    public a(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f24010a = coroutineContext;
    }

    @Override // eg.z
    public final CoroutineContext C() {
        return this.f24010a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        c0.h(this.f24010a);
    }
}
