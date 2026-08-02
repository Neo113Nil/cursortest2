package u0;

import org.jetbrains.annotations.NotNull;

/* renamed from: u0.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9902k implements J {

    /* renamed from: b, reason: collision with root package name */
    private final float f99663b;

    /* renamed from: c, reason: collision with root package name */
    private final float f99664c;

    /* renamed from: d, reason: collision with root package name */
    private final float f99665d;

    /* renamed from: e, reason: collision with root package name */
    private final float f99666e;

    public C9902k(float f7, float f11, float f12, float f13) {
        this.f99663b = f7;
        this.f99664c = f11;
        this.f99665d = f12;
        this.f99666e = f13;
    }

    @Override // u0.J
    public final int a(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return dVar.Y0(this.f99663b);
    }

    @Override // u0.J
    public final int b(@NotNull Z1.d dVar) {
        return dVar.Y0(this.f99666e);
    }

    @Override // u0.J
    public final int c(@NotNull Z1.d dVar) {
        return dVar.Y0(this.f99664c);
    }

    @Override // u0.J
    public final int d(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return dVar.Y0(this.f99665d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9902k)) {
            return false;
        }
        C9902k c9902k = (C9902k) obj;
        return Z1.h.b(this.f99663b, c9902k.f99663b) && Z1.h.b(this.f99664c, c9902k.f99664c) && Z1.h.b(this.f99665d, c9902k.f99665d) && Z1.h.b(this.f99666e, c9902k.f99666e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f99666e) + Pk0.b.a(this.f99665d, Pk0.b.a(this.f99664c, Float.hashCode(this.f99663b) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "Insets(left=" + ((Object) Z1.h.c(this.f99663b)) + ", top=" + ((Object) Z1.h.c(this.f99664c)) + ", right=" + ((Object) Z1.h.c(this.f99665d)) + ", bottom=" + ((Object) Z1.h.c(this.f99666e)) + ')';
    }
}
