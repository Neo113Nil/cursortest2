package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a implements CoroutineContext.Element {

    /* renamed from: a, reason: collision with root package name */
    public final f f19221a;

    public a(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f19221a = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object O(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return this.f19221a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public /* bridge */ CoroutineContext.Element r(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext t(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public /* bridge */ CoroutineContext z(f fVar) {
        return e.b(this, fVar);
    }
}
