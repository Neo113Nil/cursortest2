package y5;

/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6854a {

    /* renamed from: a, reason: collision with root package name */
    public final float f68280a;

    /* renamed from: b, reason: collision with root package name */
    public final float f68281b;

    public C6854a(float f10, float f11) {
        this.f68280a = f10;
        this.f68281b = f11;
    }

    public final float a() {
        return this.f68280a;
    }

    public final float b() {
        return this.f68281b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6854a)) {
            return false;
        }
        C6854a c6854a = (C6854a) obj;
        return Float.compare(this.f68280a, c6854a.f68280a) == 0 && Float.compare(this.f68281b, c6854a.f68281b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f68280a) * 31) + Float.hashCode(this.f68281b);
    }

    public String toString() {
        return "Coordinates(x=" + this.f68280a + ", y=" + this.f68281b + ")";
    }
}
