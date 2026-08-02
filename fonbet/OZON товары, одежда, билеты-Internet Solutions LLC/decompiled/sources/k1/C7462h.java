package k1;

import g.C6594f;
import org.jetbrains.annotations.NotNull;

/* renamed from: k1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7462h {

    /* renamed from: a, reason: collision with root package name */
    private final float f70284a;

    /* renamed from: b, reason: collision with root package name */
    private final float f70285b;

    /* renamed from: c, reason: collision with root package name */
    private final float f70286c;

    /* renamed from: d, reason: collision with root package name */
    private final float f70287d;

    /* renamed from: e, reason: collision with root package name */
    private final long f70288e;

    /* renamed from: f, reason: collision with root package name */
    private final long f70289f;

    /* renamed from: g, reason: collision with root package name */
    private final long f70290g;

    /* renamed from: h, reason: collision with root package name */
    private final long f70291h;

    static {
        long j11;
        j11 = C7455a.f70271b;
        C7456b.a(C7455a.d(j11), C7455a.e(j11));
    }

    public C7462h(float f7, float f11, float f12, float f13, long j11, long j12, long j13, long j14) {
        this.f70284a = f7;
        this.f70285b = f11;
        this.f70286c = f12;
        this.f70287d = f13;
        this.f70288e = j11;
        this.f70289f = j12;
        this.f70290g = j13;
        this.f70291h = j14;
    }

    public final float a() {
        return this.f70287d;
    }

    public final long b() {
        return this.f70291h;
    }

    public final long c() {
        return this.f70290g;
    }

    public final float d() {
        return this.f70287d - this.f70285b;
    }

    public final float e() {
        return this.f70284a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7462h)) {
            return false;
        }
        C7462h c7462h = (C7462h) obj;
        return Float.compare(this.f70284a, c7462h.f70284a) == 0 && Float.compare(this.f70285b, c7462h.f70285b) == 0 && Float.compare(this.f70286c, c7462h.f70286c) == 0 && Float.compare(this.f70287d, c7462h.f70287d) == 0 && C7455a.c(this.f70288e, c7462h.f70288e) && C7455a.c(this.f70289f, c7462h.f70289f) && C7455a.c(this.f70290g, c7462h.f70290g) && C7455a.c(this.f70291h, c7462h.f70291h);
    }

    public final float f() {
        return this.f70286c;
    }

    public final float g() {
        return this.f70285b;
    }

    public final long h() {
        return this.f70288e;
    }

    public final int hashCode() {
        int a11 = Pk0.b.a(this.f70287d, Pk0.b.a(this.f70286c, Pk0.b.a(this.f70285b, Float.hashCode(this.f70284a) * 31, 31), 31), 31);
        int i11 = C7455a.f70272c;
        return Long.hashCode(this.f70291h) + Pk0.c.a(Pk0.c.a(Pk0.c.a(a11, 31, this.f70288e), 31, this.f70289f), 31, this.f70290g);
    }

    public final long i() {
        return this.f70289f;
    }

    public final float j() {
        return this.f70286c - this.f70284a;
    }

    @NotNull
    public final String toString() {
        String str = C7457c.a(this.f70284a) + ", " + C7457c.a(this.f70285b) + ", " + C7457c.a(this.f70286c) + ", " + C7457c.a(this.f70287d);
        long j11 = this.f70288e;
        long j12 = this.f70289f;
        boolean c11 = C7455a.c(j11, j12);
        long j13 = this.f70290g;
        long j14 = this.f70291h;
        if (!c11 || !C7455a.c(j12, j13) || !C7455a.c(j13, j14)) {
            StringBuilder b11 = C6594f.b("RoundRect(rect=", str, ", topLeft=");
            b11.append((Object) C7455a.f(j11));
            b11.append(", topRight=");
            b11.append((Object) C7455a.f(j12));
            b11.append(", bottomRight=");
            b11.append((Object) C7455a.f(j13));
            b11.append(", bottomLeft=");
            b11.append((Object) C7455a.f(j14));
            b11.append(')');
            return b11.toString();
        }
        if (C7455a.d(j11) == C7455a.e(j11)) {
            StringBuilder b12 = C6594f.b("RoundRect(rect=", str, ", radius=");
            b12.append(C7457c.a(C7455a.d(j11)));
            b12.append(')');
            return b12.toString();
        }
        StringBuilder b13 = C6594f.b("RoundRect(rect=", str, ", x=");
        b13.append(C7457c.a(C7455a.d(j11)));
        b13.append(", y=");
        b13.append(C7457c.a(C7455a.e(j11)));
        b13.append(')');
        return b13.toString();
    }
}
