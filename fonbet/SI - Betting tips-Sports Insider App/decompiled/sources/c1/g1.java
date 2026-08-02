package c1;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g1 implements CoroutineContext.Element {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f3392a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f3393b;

    public g1(g1 g1Var, i0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f3392a = g1Var;
        this.f3393b = instance;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object O(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    public final void a(i0 candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.f3393b == candidate) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        g1 g1Var = this.f3392a;
        if (g1Var != null) {
            g1Var.a(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return f1.f3379a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext.Element r(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext t(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext z(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }
}
