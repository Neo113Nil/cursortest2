package u0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9901j implements J {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final J f99661b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final J f99662c;

    public C9901j(@NotNull J j11, @NotNull J j12) {
        this.f99661b = j11;
        this.f99662c = j12;
    }

    @Override // u0.J
    public final int a(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        int a11 = this.f99661b.a(dVar, sVar) - this.f99662c.a(dVar, sVar);
        if (a11 < 0) {
            return 0;
        }
        return a11;
    }

    @Override // u0.J
    public final int b(@NotNull Z1.d dVar) {
        int b11 = this.f99661b.b(dVar) - this.f99662c.b(dVar);
        if (b11 < 0) {
            return 0;
        }
        return b11;
    }

    @Override // u0.J
    public final int c(@NotNull Z1.d dVar) {
        int c11 = this.f99661b.c(dVar) - this.f99662c.c(dVar);
        if (c11 < 0) {
            return 0;
        }
        return c11;
    }

    @Override // u0.J
    public final int d(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        int d11 = this.f99661b.d(dVar, sVar) - this.f99662c.d(dVar, sVar);
        if (d11 < 0) {
            return 0;
        }
        return d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9901j)) {
            return false;
        }
        C9901j c9901j = (C9901j) obj;
        return Intrinsics.d(c9901j.f99661b, this.f99661b) && Intrinsics.d(c9901j.f99662c, this.f99662c);
    }

    public final int hashCode() {
        return this.f99662c.hashCode() + (this.f99661b.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "(" + this.f99661b + " - " + this.f99662c + ')';
    }
}
