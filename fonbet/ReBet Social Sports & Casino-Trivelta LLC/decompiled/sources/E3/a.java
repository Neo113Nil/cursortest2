package E3;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f2960a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f2961b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f2962c;

    public a() {
        this.f2960a = new PointF();
        this.f2961b = new PointF();
        this.f2962c = new PointF();
    }

    public PointF a() {
        return this.f2960a;
    }

    public PointF b() {
        return this.f2961b;
    }

    public PointF c() {
        return this.f2962c;
    }

    public void d(float f10, float f11) {
        this.f2960a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f2961b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f2962c.set(f10, f11);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f2962c.x), Float.valueOf(this.f2962c.y), Float.valueOf(this.f2960a.x), Float.valueOf(this.f2960a.y), Float.valueOf(this.f2961b.x), Float.valueOf(this.f2961b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f2960a = pointF;
        this.f2961b = pointF2;
        this.f2962c = pointF3;
    }
}
