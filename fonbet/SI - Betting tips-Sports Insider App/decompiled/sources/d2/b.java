package d2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f8077a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8078b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8079c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8080d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8081e;

    public b(float f6, float f10, float f11, int i5, long j) {
        this.f8077a = i5;
        this.f8078b = f6;
        this.f8079c = f10;
        this.f8080d = f11;
        this.f8081e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f8079c == bVar.f8079c && this.f8080d == bVar.f8080d && this.f8078b == bVar.f8078b && this.f8077a == bVar.f8077a && this.f8081e == bVar.f8081e;
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits = (((Float.floatToIntBits(this.f8078b) + ((Float.floatToIntBits(this.f8080d) + (Float.floatToIntBits(this.f8079c) * 31)) * 31)) * 31) + this.f8077a) * 31;
        long j = this.f8081e;
        return floatToIntBits + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavigationEvent(touchX=");
        sb2.append(this.f8079c);
        sb2.append(", touchY=");
        sb2.append(this.f8080d);
        sb2.append(", progress=");
        sb2.append(this.f8078b);
        sb2.append(", swipeEdge=");
        sb2.append(this.f8077a);
        sb2.append(", frameTimeMillis=");
        return d9.e.j(sb2, this.f8081e, ')');
    }
}
