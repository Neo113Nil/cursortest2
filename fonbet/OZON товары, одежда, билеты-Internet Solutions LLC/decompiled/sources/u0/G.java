package u0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class G implements J {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final J f99602b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final J f99603c;

    public G(@NotNull J j11, @NotNull J j12) {
        this.f99602b = j11;
        this.f99603c = j12;
    }

    @Override // u0.J
    public final int a(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return Math.max(this.f99602b.a(dVar, sVar), this.f99603c.a(dVar, sVar));
    }

    @Override // u0.J
    public final int b(@NotNull Z1.d dVar) {
        return Math.max(this.f99602b.b(dVar), this.f99603c.b(dVar));
    }

    @Override // u0.J
    public final int c(@NotNull Z1.d dVar) {
        return Math.max(this.f99602b.c(dVar), this.f99603c.c(dVar));
    }

    @Override // u0.J
    public final int d(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return Math.max(this.f99602b.d(dVar, sVar), this.f99603c.d(dVar, sVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return Intrinsics.d(g10.f99602b, this.f99602b) && Intrinsics.d(g10.f99603c, this.f99603c);
    }

    public final int hashCode() {
        return (this.f99603c.hashCode() * 31) + this.f99602b.hashCode();
    }

    @NotNull
    public final String toString() {
        return "(" + this.f99602b + " ∪ " + this.f99603c + ')';
    }
}
