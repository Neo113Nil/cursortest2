package U;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f11996a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11997b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11998c;

    public a(float f10, float f11, long j10) {
        this.f11996a = f10;
        this.f11997b = f11;
        this.f11998c = j10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.f11996a == this.f11996a && aVar.f11997b == this.f11997b && aVar.f11998c == this.f11998c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f11996a) * 31) + Float.hashCode(this.f11997b)) * 31) + Long.hashCode(this.f11998c);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f11996a + ",horizontalScrollPixels=" + this.f11997b + ",uptimeMillis=" + this.f11998c + ')';
    }
}
