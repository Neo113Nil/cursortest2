package u0;

import org.jetbrains.annotations.NotNull;

/* renamed from: u0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9915y implements InterfaceC9914x {

    /* renamed from: a, reason: collision with root package name */
    private final float f99687a;

    /* renamed from: b, reason: collision with root package name */
    private final float f99688b;

    /* renamed from: c, reason: collision with root package name */
    private final float f99689c;

    /* renamed from: d, reason: collision with root package name */
    private final float f99690d;

    public C9915y(float f7, float f11, float f12, float f13) {
        this.f99687a = f7;
        this.f99688b = f11;
        this.f99689c = f12;
        this.f99690d = f13;
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    @Override // u0.InterfaceC9914x
    public final float a() {
        return this.f99690d;
    }

    @Override // u0.InterfaceC9914x
    public final float b(@NotNull Z1.s sVar) {
        return sVar == Z1.s.Ltr ? this.f99687a : this.f99689c;
    }

    @Override // u0.InterfaceC9914x
    public final float c(@NotNull Z1.s sVar) {
        return sVar == Z1.s.Ltr ? this.f99689c : this.f99687a;
    }

    @Override // u0.InterfaceC9914x
    public final float d() {
        return this.f99688b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9915y)) {
            return false;
        }
        C9915y c9915y = (C9915y) obj;
        return Z1.h.b(this.f99687a, c9915y.f99687a) && Z1.h.b(this.f99688b, c9915y.f99688b) && Z1.h.b(this.f99689c, c9915y.f99689c) && Z1.h.b(this.f99690d, c9915y.f99690d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f99690d) + Pk0.b.a(this.f99689c, Pk0.b.a(this.f99688b, Float.hashCode(this.f99687a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "PaddingValues(start=" + ((Object) Z1.h.c(this.f99687a)) + ", top=" + ((Object) Z1.h.c(this.f99688b)) + ", end=" + ((Object) Z1.h.c(this.f99689c)) + ", bottom=" + ((Object) Z1.h.c(this.f99690d)) + ')';
    }
}
