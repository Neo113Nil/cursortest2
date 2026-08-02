package m0;

import org.jetbrains.annotations.NotNull;

/* renamed from: m0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8008p extends AbstractC8015t {

    /* renamed from: a, reason: collision with root package name */
    private float f73838a;

    /* renamed from: b, reason: collision with root package name */
    private final int f73839b;

    public C8008p(float f7) {
        super(0);
        this.f73838a = f7;
        this.f73839b = 1;
    }

    @Override // m0.AbstractC8015t
    public final float a(int i11) {
        if (i11 == 0) {
            return this.f73838a;
        }
        return 0.0f;
    }

    @Override // m0.AbstractC8015t
    public final int b() {
        return this.f73839b;
    }

    @Override // m0.AbstractC8015t
    public final AbstractC8015t c() {
        return new C8008p(0.0f);
    }

    @Override // m0.AbstractC8015t
    public final void d() {
        this.f73838a = 0.0f;
    }

    @Override // m0.AbstractC8015t
    public final void e(float f7, int i11) {
        if (i11 == 0) {
            this.f73838a = f7;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8008p) && ((C8008p) obj).f73838a == this.f73838a;
    }

    public final float f() {
        return this.f73838a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f73838a);
    }

    @NotNull
    public final String toString() {
        return "AnimationVector1D: value = " + this.f73838a;
    }
}
