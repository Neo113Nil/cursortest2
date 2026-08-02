package we0;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f104459a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Pair<Integer, Integer> f104460b;

    public q() {
        this((r) null, 3);
    }

    @NotNull
    public final Pair<Integer, Integer> a() {
        return this.f104460b;
    }

    @NotNull
    public final r b() {
        return this.f104459a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f104459a == qVar.f104459a && Intrinsics.d(this.f104460b, qVar.f104460b);
    }

    public final int hashCode() {
        return this.f104460b.hashCode() + (this.f104459a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "LogoConfig(position=" + this.f104459a + ", padding=" + this.f104460b + ")";
    }

    public q(@NotNull r position, @NotNull Pair<Integer, Integer> padding) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f104459a = position;
        this.f104460b = padding;
    }

    public /* synthetic */ q(r rVar, int i11) {
        this((i11 & 1) != 0 ? r.RIGHT_BOTTOM : rVar, (Pair<Integer, Integer>) new Pair(10, 10));
    }
}
