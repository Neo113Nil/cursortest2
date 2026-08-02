package l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f72108a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m0.H<Z1.m> f72109b;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@NotNull Function1<? super Z1.q, Z1.m> function1, @NotNull m0.H<Z1.m> h11) {
        this.f72108a = (AbstractC7737t) function1;
        this.f72109b = h11;
    }

    @NotNull
    public final m0.H<Z1.m> a() {
        return this.f72109b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<Z1.q, Z1.m>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function1<Z1.q, Z1.m> b() {
        return this.f72108a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f72108a.equals(k0Var.f72108a) && this.f72109b.equals(k0Var.f72109b);
    }

    public final int hashCode() {
        return this.f72109b.hashCode() + (this.f72108a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "Slide(slideOffset=" + this.f72108a + ", animationSpec=" + this.f72109b + ')';
    }
}
