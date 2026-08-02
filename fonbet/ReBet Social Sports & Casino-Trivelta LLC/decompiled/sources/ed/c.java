package ed;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f45937a;

    /* renamed from: b, reason: collision with root package name */
    public final float f45938b;

    /* renamed from: c, reason: collision with root package name */
    public final float f45939c;

    /* renamed from: d, reason: collision with root package name */
    public final float f45940d;

    public c(float f10, float f11, float f12, float f13) {
        this.f45937a = f10;
        this.f45938b = f11;
        this.f45939c = f12;
        this.f45940d = f13;
    }

    public final float a() {
        return this.f45940d;
    }

    public final float b() {
        return this.f45939c;
    }

    public final float c() {
        return this.f45937a;
    }

    public final float d() {
        return this.f45938b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f45937a, cVar.f45937a) == 0 && Float.compare(this.f45938b, cVar.f45938b) == 0 && Float.compare(this.f45939c, cVar.f45939c) == 0 && Float.compare(this.f45940d, cVar.f45940d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f45937a) * 31) + Float.hashCode(this.f45938b)) * 31) + Float.hashCode(this.f45939c)) * 31) + Float.hashCode(this.f45940d);
    }

    public String toString() {
        return "Rect(x=" + this.f45937a + ", y=" + this.f45938b + ", width=" + this.f45939c + ", height=" + this.f45940d + ")";
    }
}
