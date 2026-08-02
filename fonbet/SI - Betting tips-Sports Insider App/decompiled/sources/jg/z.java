package jg;

import eg.v1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class z implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18535a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f18536b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f18537c;

    public z(Object obj, ThreadLocal threadLocal) {
        this.f18535a = obj;
        this.f18536b = threadLocal;
        this.f18537c = new a0(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object O(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // eg.v1
    public final Object U(CoroutineContext coroutineContext) {
        ThreadLocal threadLocal = this.f18536b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f18535a);
        return obj;
    }

    public final void a(Object obj) {
        this.f18536b.set(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return this.f18537c;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element r(kotlin.coroutines.f fVar) {
        if (!Intrinsics.areEqual(this.f18537c, fVar)) {
            return null;
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext t(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f18535a + ", threadLocal = " + this.f18536b + ')';
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.f fVar) {
        return Intrinsics.areEqual(this.f18537c, fVar) ? kotlin.coroutines.g.f19227a : this;
    }
}
