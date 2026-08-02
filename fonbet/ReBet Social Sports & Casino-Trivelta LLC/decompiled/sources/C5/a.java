package C5;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1128a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1129b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1130c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1131d;

    public a(float f10, float f11, float f12, float f13) {
        this.f1128a = f10;
        this.f1129b = f11;
        this.f1130c = f12;
        this.f1131d = f13;
    }

    public final float a() {
        return this.f1130c;
    }

    public final float b() {
        return this.f1131d;
    }

    public final float c() {
        return this.f1128a;
    }

    public final float d() {
        return this.f1129b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f1128a, aVar.f1128a) == 0 && Float.compare(this.f1129b, aVar.f1129b) == 0 && Float.compare(this.f1130c, aVar.f1130c) == 0 && Float.compare(this.f1131d, aVar.f1131d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f1128a) * 31) + Float.hashCode(this.f1129b)) * 31) + Float.hashCode(this.f1130c)) * 31) + Float.hashCode(this.f1131d);
    }

    public String toString() {
        return "FlingEventSnapshot(x=" + this.f1128a + ", y=" + this.f1129b + ", velocityX=" + this.f1130c + ", velocityY=" + this.f1131d + ")";
    }
}
