package k1;

import org.jetbrains.annotations.NotNull;

/* renamed from: k1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7458d {

    /* renamed from: a, reason: collision with root package name */
    private float f70274a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private float f70275b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    private float f70276c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f70277d = 0.0f;

    public final float a() {
        return this.f70277d;
    }

    public final float b() {
        return this.f70274a;
    }

    public final float c() {
        return this.f70276c;
    }

    public final float d() {
        return this.f70275b;
    }

    public final void e(float f7, float f11, float f12, float f13) {
        this.f70274a = Math.max(f7, this.f70274a);
        this.f70275b = Math.max(f11, this.f70275b);
        this.f70276c = Math.min(f12, this.f70276c);
        this.f70277d = Math.min(f13, this.f70277d);
    }

    public final boolean f() {
        return this.f70274a >= this.f70276c || this.f70275b >= this.f70277d;
    }

    public final void g() {
        this.f70274a = 0.0f;
        this.f70275b = 0.0f;
        this.f70276c = 0.0f;
        this.f70277d = 0.0f;
    }

    public final void h(float f7) {
        this.f70277d = f7;
    }

    public final void i(float f7) {
        this.f70274a = f7;
    }

    public final void j(float f7) {
        this.f70276c = f7;
    }

    public final void k(float f7) {
        this.f70275b = f7;
    }

    @NotNull
    public final String toString() {
        return "MutableRect(" + C7457c.a(this.f70274a) + ", " + C7457c.a(this.f70275b) + ", " + C7457c.a(this.f70276c) + ", " + C7457c.a(this.f70277d) + ')';
    }
}
