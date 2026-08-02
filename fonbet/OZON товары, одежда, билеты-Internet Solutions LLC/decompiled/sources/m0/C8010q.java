package m0;

import org.jetbrains.annotations.NotNull;

/* renamed from: m0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8010q extends AbstractC8015t {

    /* renamed from: a, reason: collision with root package name */
    private float f73847a;

    /* renamed from: b, reason: collision with root package name */
    private float f73848b;

    /* renamed from: c, reason: collision with root package name */
    private final int f73849c;

    public C8010q(float f7, float f11) {
        super(0);
        this.f73847a = f7;
        this.f73848b = f11;
        this.f73849c = 2;
    }

    @Override // m0.AbstractC8015t
    public final float a(int i11) {
        if (i11 == 0) {
            return this.f73847a;
        }
        if (i11 != 1) {
            return 0.0f;
        }
        return this.f73848b;
    }

    @Override // m0.AbstractC8015t
    public final int b() {
        return this.f73849c;
    }

    @Override // m0.AbstractC8015t
    public final AbstractC8015t c() {
        return new C8010q(0.0f, 0.0f);
    }

    @Override // m0.AbstractC8015t
    public final void d() {
        this.f73847a = 0.0f;
        this.f73848b = 0.0f;
    }

    @Override // m0.AbstractC8015t
    public final void e(float f7, int i11) {
        if (i11 == 0) {
            this.f73847a = f7;
        } else {
            if (i11 != 1) {
                return;
            }
            this.f73848b = f7;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8010q)) {
            return false;
        }
        C8010q c8010q = (C8010q) obj;
        return c8010q.f73847a == this.f73847a && c8010q.f73848b == this.f73848b;
    }

    public final float f() {
        return this.f73847a;
    }

    public final float g() {
        return this.f73848b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f73848b) + (Float.hashCode(this.f73847a) * 31);
    }

    @NotNull
    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f73847a + ", v2 = " + this.f73848b;
    }
}
