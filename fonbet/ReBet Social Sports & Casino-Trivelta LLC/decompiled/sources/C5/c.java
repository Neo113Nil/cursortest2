package C5;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f1140a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1141b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1142c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1143d;

    public c(float f10, float f11, float f12, float f13) {
        this.f1140a = f10;
        this.f1141b = f11;
        this.f1142c = f12;
        this.f1143d = f13;
    }

    public final float a() {
        return this.f1142c;
    }

    public final float b() {
        return this.f1143d;
    }

    public final float c() {
        return this.f1140a;
    }

    public final float d() {
        return this.f1141b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f1140a, cVar.f1140a) == 0 && Float.compare(this.f1141b, cVar.f1141b) == 0 && Float.compare(this.f1142c, cVar.f1142c) == 0 && Float.compare(this.f1143d, cVar.f1143d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f1140a) * 31) + Float.hashCode(this.f1141b)) * 31) + Float.hashCode(this.f1142c)) * 31) + Float.hashCode(this.f1143d);
    }

    public String toString() {
        return "ScrollEventSnapshot(x=" + this.f1140a + ", y=" + this.f1141b + ", totalDistanceX=" + this.f1142c + ", totalDistanceY=" + this.f1143d + ")";
    }
}
