package m0;

import org.jetbrains.annotations.NotNull;

/* renamed from: m0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8013s extends AbstractC8015t {

    /* renamed from: a, reason: collision with root package name */
    private float f73859a;

    /* renamed from: b, reason: collision with root package name */
    private float f73860b;

    /* renamed from: c, reason: collision with root package name */
    private float f73861c;

    /* renamed from: d, reason: collision with root package name */
    private float f73862d;

    /* renamed from: e, reason: collision with root package name */
    private final int f73863e;

    public C8013s(float f7, float f11, float f12, float f13) {
        super(0);
        this.f73859a = f7;
        this.f73860b = f11;
        this.f73861c = f12;
        this.f73862d = f13;
        this.f73863e = 4;
    }

    @Override // m0.AbstractC8015t
    public final float a(int i11) {
        if (i11 == 0) {
            return this.f73859a;
        }
        if (i11 == 1) {
            return this.f73860b;
        }
        if (i11 == 2) {
            return this.f73861c;
        }
        if (i11 != 3) {
            return 0.0f;
        }
        return this.f73862d;
    }

    @Override // m0.AbstractC8015t
    public final int b() {
        return this.f73863e;
    }

    @Override // m0.AbstractC8015t
    public final AbstractC8015t c() {
        return new C8013s(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // m0.AbstractC8015t
    public final void d() {
        this.f73859a = 0.0f;
        this.f73860b = 0.0f;
        this.f73861c = 0.0f;
        this.f73862d = 0.0f;
    }

    @Override // m0.AbstractC8015t
    public final void e(float f7, int i11) {
        if (i11 == 0) {
            this.f73859a = f7;
            return;
        }
        if (i11 == 1) {
            this.f73860b = f7;
        } else if (i11 == 2) {
            this.f73861c = f7;
        } else {
            if (i11 != 3) {
                return;
            }
            this.f73862d = f7;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8013s)) {
            return false;
        }
        C8013s c8013s = (C8013s) obj;
        return c8013s.f73859a == this.f73859a && c8013s.f73860b == this.f73860b && c8013s.f73861c == this.f73861c && c8013s.f73862d == this.f73862d;
    }

    public final float f() {
        return this.f73859a;
    }

    public final float g() {
        return this.f73860b;
    }

    public final float h() {
        return this.f73861c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f73862d) + Pk0.b.a(this.f73861c, Pk0.b.a(this.f73860b, Float.hashCode(this.f73859a) * 31, 31), 31);
    }

    public final float i() {
        return this.f73862d;
    }

    @NotNull
    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f73859a + ", v2 = " + this.f73860b + ", v3 = " + this.f73861c + ", v4 = " + this.f73862d;
    }
}
