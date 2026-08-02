package G3;

import lb.C5444x;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public float f3880a;

    /* renamed from: b, reason: collision with root package name */
    public float f3881b;

    public d(float f10, float f11) {
        this.f3880a = f10;
        this.f3881b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f3880a == f10 && this.f3881b == f11;
    }

    public float b() {
        return this.f3880a;
    }

    public float c() {
        return this.f3881b;
    }

    public void d(float f10, float f11) {
        this.f3880a = f10;
        this.f3881b = f11;
    }

    public String toString() {
        return b() + C5444x.f55808b + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
