package M;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f7378a;

    /* renamed from: b, reason: collision with root package name */
    public float f7379b;

    /* renamed from: c, reason: collision with root package name */
    public float f7380c;

    /* renamed from: d, reason: collision with root package name */
    public float f7381d;

    public b(float f10, float f11, float f12, float f13) {
        this.f7378a = f10;
        this.f7379b = f11;
        this.f7380c = f12;
        this.f7381d = f13;
    }

    public final float a() {
        return this.f7381d;
    }

    public final float b() {
        return this.f7378a;
    }

    public final float c() {
        return this.f7380c;
    }

    public final float d() {
        return this.f7379b;
    }

    public final boolean e() {
        return this.f7378a >= this.f7380c || this.f7379b >= this.f7381d;
    }

    public final void f(float f10) {
        this.f7381d = f10;
    }

    public final void g(float f10) {
        this.f7378a = f10;
    }

    public final void h(float f10) {
        this.f7380c = f10;
    }

    public final void i(float f10) {
        this.f7379b = f10;
    }

    public String toString() {
        return "MutableRect(" + a.a(this.f7378a, 1) + ", " + a.a(this.f7379b, 1) + ", " + a.a(this.f7380c, 1) + ", " + a.a(this.f7381d, 1) + ')';
    }
}
