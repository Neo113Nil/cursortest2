package k2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z implements CoroutineContext.Element {

    /* renamed from: b, reason: collision with root package name */
    public static final y8.d f18790b = new y8.d();

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.d f18791a;

    public z(kotlin.coroutines.d transactionDispatcher) {
        Intrinsics.checkNotNullParameter(transactionDispatcher, "transactionDispatcher");
        this.f18791a = transactionDispatcher;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object O(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return f18790b;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element r(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext t(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }
}
