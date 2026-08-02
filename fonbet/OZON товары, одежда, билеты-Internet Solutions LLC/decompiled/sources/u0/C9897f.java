package u0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9897f implements C1.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<J, Unit> f99654a;

    /* renamed from: b, reason: collision with root package name */
    private J f99655b;

    /* JADX WARN: Multi-variable type inference failed */
    public C9897f(@NotNull Function1<? super J, Unit> function1) {
        this.f99654a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9897f) && ((C9897f) obj).f99654a == this.f99654a;
    }

    public final int hashCode() {
        return this.f99654a.hashCode();
    }

    @Override // C1.d
    public final void w1(@NotNull C1.l lVar) {
        J j11 = (J) lVar.G(O.b());
        if (Intrinsics.d(j11, this.f99655b)) {
            return;
        }
        this.f99655b = j11;
        this.f99654a.invoke(j11);
    }
}
