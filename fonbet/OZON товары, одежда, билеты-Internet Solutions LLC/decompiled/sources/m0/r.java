package m0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r extends AbstractC8015t {

    /* renamed from: a, reason: collision with root package name */
    private float f73853a;

    /* renamed from: b, reason: collision with root package name */
    private float f73854b;

    /* renamed from: c, reason: collision with root package name */
    private float f73855c;

    /* renamed from: d, reason: collision with root package name */
    private final int f73856d;

    public r(float f7, float f11, float f12) {
        super(0);
        this.f73853a = f7;
        this.f73854b = f11;
        this.f73855c = f12;
        this.f73856d = 3;
    }

    @Override // m0.AbstractC8015t
    public final float a(int i11) {
        if (i11 == 0) {
            return this.f73853a;
        }
        if (i11 == 1) {
            return this.f73854b;
        }
        if (i11 != 2) {
            return 0.0f;
        }
        return this.f73855c;
    }

    @Override // m0.AbstractC8015t
    public final int b() {
        return this.f73856d;
    }

    @Override // m0.AbstractC8015t
    public final AbstractC8015t c() {
        return new r(0.0f, 0.0f, 0.0f);
    }

    @Override // m0.AbstractC8015t
    public final void d() {
        this.f73853a = 0.0f;
        this.f73854b = 0.0f;
        this.f73855c = 0.0f;
    }

    @Override // m0.AbstractC8015t
    public final void e(float f7, int i11) {
        if (i11 == 0) {
            this.f73853a = f7;
        } else if (i11 == 1) {
            this.f73854b = f7;
        } else {
            if (i11 != 2) {
                return;
            }
            this.f73855c = f7;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f73853a == this.f73853a && rVar.f73854b == this.f73854b && rVar.f73855c == this.f73855c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f73855c) + Pk0.b.a(this.f73854b, Float.hashCode(this.f73853a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f73853a + ", v2 = " + this.f73854b + ", v3 = " + this.f73855c;
    }
}
