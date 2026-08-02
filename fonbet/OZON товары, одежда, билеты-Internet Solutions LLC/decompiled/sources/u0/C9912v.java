package u0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9912v implements J {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final J f99686b;

    public C9912v(J j11) {
        this.f99686b = j11;
    }

    @Override // u0.J
    public final int a(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return 0;
    }

    @Override // u0.J
    public final int b(@NotNull Z1.d dVar) {
        return ((G) this.f99686b).b(dVar);
    }

    @Override // u0.J
    public final int c(@NotNull Z1.d dVar) {
        return 0;
    }

    @Override // u0.J
    public final int d(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9912v) {
            return Intrinsics.d(this.f99686b, ((C9912v) obj).f99686b);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(32) + (this.f99686b.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "(" + this.f99686b + " only " + ((Object) V.a()) + ')';
    }
}
