package m1;

import F3.G;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final float f74004a;

    /* renamed from: b, reason: collision with root package name */
    private final float f74005b;

    public r(float f7, float f11) {
        this.f74004a = f7;
        this.f74005b = f11;
    }

    public final float a() {
        return this.f74004a;
    }

    public final float b() {
        return this.f74005b;
    }

    @NotNull
    public final float[] c() {
        float f7 = this.f74004a;
        float f11 = this.f74005b;
        return new float[]{f7 / f11, 1.0f, ((1.0f - f7) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f74004a, rVar.f74004a) == 0 && Float.compare(this.f74005b, rVar.f74005b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f74005b) + (Float.hashCode(this.f74004a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f74004a);
        sb2.append(", y=");
        return G.a(sb2, this.f74005b, ')');
    }
}
