package e0;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f45450a;

    /* renamed from: b, reason: collision with root package name */
    public final float f45451b;

    public e(float f10, float f11) {
        this.f45450a = f10;
        this.f45451b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f45450a, eVar.f45450a) == 0 && Float.compare(this.f45451b, eVar.f45451b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f45450a) * 31) + Float.hashCode(this.f45451b);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f45450a + ", fontScale=" + this.f45451b + ')';
    }
}
