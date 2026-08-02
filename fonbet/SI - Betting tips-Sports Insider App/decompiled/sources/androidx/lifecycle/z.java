package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z implements c0, eg.z {

    /* renamed from: a, reason: collision with root package name */
    public final y f2260a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f2261b;

    public z(y lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f2260a = lifecycle;
        this.f2261b = coroutineContext;
        if (((g0) lifecycle).f2169d == x.f2253a) {
            eg.c0.h(coroutineContext);
        }
    }

    @Override // eg.z
    public final CoroutineContext C() {
        return this.f2261b;
    }

    @Override // androidx.lifecycle.c0
    public final void c(e0 source, w event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        y yVar = this.f2260a;
        if (((g0) yVar).f2169d.compareTo(x.f2253a) <= 0) {
            yVar.b(this);
            eg.c0.h(this.f2261b);
        }
    }
}
