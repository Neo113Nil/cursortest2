package ig;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p implements CoroutineContext {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f11281a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f11282b;

    public p(Throwable th2, CoroutineContext coroutineContext) {
        this.f11281a = coroutineContext;
        this.f11282b = th2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object O(Object obj, Function2 function2) {
        return this.f11281a.O(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element r(kotlin.coroutines.f fVar) {
        return this.f11281a.r(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext t(CoroutineContext coroutineContext) {
        return this.f11281a.t(coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.f fVar) {
        return this.f11281a.z(fVar);
    }
}
