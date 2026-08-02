package m0;

import kotlin.jvm.internal.Intrinsics;
import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g1<V extends AbstractC8015t> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final V f73757a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final E f73758b;

    /* renamed from: c, reason: collision with root package name */
    private final int f73759c;

    private g1() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g1(AbstractC8015t abstractC8015t, E e11, int i11) {
        this.f73757a = abstractC8015t;
        this.f73758b = e11;
        this.f73759c = i11;
    }

    public final int a() {
        return this.f73759c;
    }

    @NotNull
    public final E b() {
        return this.f73758b;
    }

    @NotNull
    public final V c() {
        return this.f73757a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.d(this.f73757a, g1Var.f73757a) && Intrinsics.d(this.f73758b, g1Var.f73758b) && this.f73759c == g1Var.f73759c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f73759c) + ((this.f73758b.hashCode() + (this.f73757a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f73757a + ", easing=" + this.f73758b + ", arcMode=" + ((Object) ("ArcMode(value=" + this.f73759c + ')')) + ')';
    }
}
