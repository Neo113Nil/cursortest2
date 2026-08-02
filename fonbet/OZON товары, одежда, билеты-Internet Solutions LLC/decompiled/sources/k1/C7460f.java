package k1;

import org.jetbrains.annotations.NotNull;

/* renamed from: k1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7460f {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C7460f f70279e = new C7460f(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final float f70280a;

    /* renamed from: b, reason: collision with root package name */
    private final float f70281b;

    /* renamed from: c, reason: collision with root package name */
    private final float f70282c;

    /* renamed from: d, reason: collision with root package name */
    private final float f70283d;

    /* renamed from: k1.f$a */
    public static final class a {
    }

    public C7460f(float f7, float f11, float f12, float f13) {
        this.f70280a = f7;
        this.f70281b = f11;
        this.f70282c = f12;
        this.f70283d = f13;
    }

    public static C7460f g(C7460f c7460f, float f7, float f11, float f12, int i11) {
        if ((i11 & 1) != 0) {
            f7 = c7460f.f70280a;
        }
        float f13 = c7460f.f70281b;
        if ((i11 & 4) != 0) {
            f11 = c7460f.f70282c;
        }
        if ((i11 & 8) != 0) {
            f12 = c7460f.f70283d;
        }
        c7460f.getClass();
        return new C7460f(f7, f13, f11, f12);
    }

    @NotNull
    public final C7460f A(long j11) {
        return new C7460f(C7459e.g(j11) + this.f70280a, C7459e.h(j11) + this.f70281b, C7459e.g(j11) + this.f70282c, C7459e.h(j11) + this.f70283d);
    }

    public final float b() {
        return this.f70280a;
    }

    public final float c() {
        return this.f70281b;
    }

    public final float d() {
        return this.f70282c;
    }

    public final float e() {
        return this.f70283d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7460f)) {
            return false;
        }
        C7460f c7460f = (C7460f) obj;
        return Float.compare(this.f70280a, c7460f.f70280a) == 0 && Float.compare(this.f70281b, c7460f.f70281b) == 0 && Float.compare(this.f70282c, c7460f.f70282c) == 0 && Float.compare(this.f70283d, c7460f.f70283d) == 0;
    }

    public final boolean f(long j11) {
        return C7459e.g(j11) >= this.f70280a && C7459e.g(j11) < this.f70282c && C7459e.h(j11) >= this.f70281b && C7459e.h(j11) < this.f70283d;
    }

    public final float h() {
        return this.f70283d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f70283d) + Pk0.b.a(this.f70282c, Pk0.b.a(this.f70281b, Float.hashCode(this.f70280a) * 31, 31), 31);
    }

    public final long i() {
        return P9.a.a((u() / 2.0f) + this.f70280a, this.f70283d);
    }

    public final long j() {
        return P9.a.a(this.f70280a, this.f70283d);
    }

    public final long k() {
        return P9.a.a(this.f70282c, this.f70283d);
    }

    public final long l() {
        return P9.a.a((u() / 2.0f) + this.f70280a, (m() / 2.0f) + this.f70281b);
    }

    public final float m() {
        return this.f70283d - this.f70281b;
    }

    public final float n() {
        return this.f70280a;
    }

    public final float o() {
        return this.f70282c;
    }

    public final long p() {
        return C7465k.a(u(), m());
    }

    public final float q() {
        return this.f70281b;
    }

    public final long r() {
        return P9.a.a((u() / 2.0f) + this.f70280a, this.f70281b);
    }

    public final long s() {
        return P9.a.a(this.f70280a, this.f70281b);
    }

    public final long t() {
        return P9.a.a(this.f70282c, this.f70281b);
    }

    @NotNull
    public final String toString() {
        return "Rect.fromLTRB(" + C7457c.a(this.f70280a) + ", " + C7457c.a(this.f70281b) + ", " + C7457c.a(this.f70282c) + ", " + C7457c.a(this.f70283d) + ')';
    }

    public final float u() {
        return this.f70282c - this.f70280a;
    }

    @NotNull
    public final C7460f v(float f7, float f11) {
        return new C7460f(Math.max(this.f70280a, 0.0f), Math.max(this.f70281b, f7), Math.min(this.f70282c, Float.POSITIVE_INFINITY), Math.min(this.f70283d, f11));
    }

    @NotNull
    public final C7460f w(@NotNull C7460f c7460f) {
        return new C7460f(Math.max(this.f70280a, c7460f.f70280a), Math.max(this.f70281b, c7460f.f70281b), Math.min(this.f70282c, c7460f.f70282c), Math.min(this.f70283d, c7460f.f70283d));
    }

    public final boolean x() {
        return this.f70280a >= this.f70282c || this.f70281b >= this.f70283d;
    }

    public final boolean y(@NotNull C7460f c7460f) {
        return this.f70282c > c7460f.f70280a && c7460f.f70282c > this.f70280a && this.f70283d > c7460f.f70281b && c7460f.f70283d > this.f70281b;
    }

    @NotNull
    public final C7460f z(float f7, float f11) {
        return new C7460f(this.f70280a + f7, this.f70281b + f11, this.f70282c + f7, this.f70283d + f11);
    }
}
