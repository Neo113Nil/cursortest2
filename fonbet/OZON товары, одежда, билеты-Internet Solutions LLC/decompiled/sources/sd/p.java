package sd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final Sd.f f98604a;

    public p(Sd.f fVar) {
        this.f98604a = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ce.l it = (ce.l) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.g(this.f98604a, Bd.c.FROM_BUILTINS);
    }
}
