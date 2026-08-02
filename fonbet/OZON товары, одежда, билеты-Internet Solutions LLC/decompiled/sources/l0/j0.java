package l0;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class j0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<Z1.q, Z1.q, m0.H<Z1.q>> f72101a;

    public j0(@NotNull Function2 function2) {
        this.f72101a = function2;
    }

    @Override // l0.i0
    public final boolean a() {
        return true;
    }

    @Override // l0.i0
    @NotNull
    public final m0.H<Z1.q> b(long j11, long j12) {
        return this.f72101a.invoke(Z1.q.a(j11), Z1.q.a(j12));
    }
}
