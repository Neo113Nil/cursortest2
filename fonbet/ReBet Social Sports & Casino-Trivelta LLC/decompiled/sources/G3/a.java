package G3;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C2940j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final C2940j f3854a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3855b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3856c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f3857d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f3858e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f3859f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3860g;

    /* renamed from: h, reason: collision with root package name */
    public Float f3861h;

    /* renamed from: i, reason: collision with root package name */
    public float f3862i;

    /* renamed from: j, reason: collision with root package name */
    public float f3863j;

    /* renamed from: k, reason: collision with root package name */
    public int f3864k;

    /* renamed from: l, reason: collision with root package name */
    public int f3865l;

    /* renamed from: m, reason: collision with root package name */
    public float f3866m;

    /* renamed from: n, reason: collision with root package name */
    public float f3867n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f3868o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f3869p;

    public a(C2940j c2940j, Object obj, Object obj2, Interpolator interpolator, float f10, Float f11) {
        this.f3862i = -3987645.8f;
        this.f3863j = -3987645.8f;
        this.f3864k = 784923401;
        this.f3865l = 784923401;
        this.f3866m = Float.MIN_VALUE;
        this.f3867n = Float.MIN_VALUE;
        this.f3868o = null;
        this.f3869p = null;
        this.f3854a = c2940j;
        this.f3855b = obj;
        this.f3856c = obj2;
        this.f3857d = interpolator;
        this.f3858e = null;
        this.f3859f = null;
        this.f3860g = f10;
        this.f3861h = f11;
    }

    public boolean a(float f10) {
        return f10 >= f() && f10 < c();
    }

    public a b(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    public float c() {
        if (this.f3854a == null) {
            return 1.0f;
        }
        if (this.f3867n == Float.MIN_VALUE) {
            if (this.f3861h == null) {
                this.f3867n = 1.0f;
            } else {
                this.f3867n = (float) (f() + ((this.f3861h.floatValue() - this.f3860g) / this.f3854a.e()));
            }
        }
        return this.f3867n;
    }

    public float d() {
        if (this.f3863j == -3987645.8f) {
            this.f3863j = ((Float) this.f3856c).floatValue();
        }
        return this.f3863j;
    }

    public int e() {
        if (this.f3865l == 784923401) {
            this.f3865l = ((Integer) this.f3856c).intValue();
        }
        return this.f3865l;
    }

    public float f() {
        C2940j c2940j = this.f3854a;
        if (c2940j == null) {
            return 0.0f;
        }
        if (this.f3866m == Float.MIN_VALUE) {
            this.f3866m = (this.f3860g - c2940j.p()) / this.f3854a.e();
        }
        return this.f3866m;
    }

    public float g() {
        if (this.f3862i == -3987645.8f) {
            this.f3862i = ((Float) this.f3855b).floatValue();
        }
        return this.f3862i;
    }

    public int h() {
        if (this.f3864k == 784923401) {
            this.f3864k = ((Integer) this.f3855b).intValue();
        }
        return this.f3864k;
    }

    public boolean i() {
        return this.f3857d == null && this.f3858e == null && this.f3859f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f3855b + ", endValue=" + this.f3856c + ", startFrame=" + this.f3860g + ", endFrame=" + this.f3861h + ", interpolator=" + this.f3857d + '}';
    }

    public a(C2940j c2940j, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f3862i = -3987645.8f;
        this.f3863j = -3987645.8f;
        this.f3864k = 784923401;
        this.f3865l = 784923401;
        this.f3866m = Float.MIN_VALUE;
        this.f3867n = Float.MIN_VALUE;
        this.f3868o = null;
        this.f3869p = null;
        this.f3854a = c2940j;
        this.f3855b = obj;
        this.f3856c = obj2;
        this.f3857d = null;
        this.f3858e = interpolator;
        this.f3859f = interpolator2;
        this.f3860g = f10;
        this.f3861h = f11;
    }

    public a(C2940j c2940j, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f3862i = -3987645.8f;
        this.f3863j = -3987645.8f;
        this.f3864k = 784923401;
        this.f3865l = 784923401;
        this.f3866m = Float.MIN_VALUE;
        this.f3867n = Float.MIN_VALUE;
        this.f3868o = null;
        this.f3869p = null;
        this.f3854a = c2940j;
        this.f3855b = obj;
        this.f3856c = obj2;
        this.f3857d = interpolator;
        this.f3858e = interpolator2;
        this.f3859f = interpolator3;
        this.f3860g = f10;
        this.f3861h = f11;
    }

    public a(Object obj) {
        this.f3862i = -3987645.8f;
        this.f3863j = -3987645.8f;
        this.f3864k = 784923401;
        this.f3865l = 784923401;
        this.f3866m = Float.MIN_VALUE;
        this.f3867n = Float.MIN_VALUE;
        this.f3868o = null;
        this.f3869p = null;
        this.f3854a = null;
        this.f3855b = obj;
        this.f3856c = obj;
        this.f3857d = null;
        this.f3858e = null;
        this.f3859f = null;
        this.f3860g = Float.MIN_VALUE;
        this.f3861h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(Object obj, Object obj2) {
        this.f3862i = -3987645.8f;
        this.f3863j = -3987645.8f;
        this.f3864k = 784923401;
        this.f3865l = 784923401;
        this.f3866m = Float.MIN_VALUE;
        this.f3867n = Float.MIN_VALUE;
        this.f3868o = null;
        this.f3869p = null;
        this.f3854a = null;
        this.f3855b = obj;
        this.f3856c = obj2;
        this.f3857d = null;
        this.f3858e = null;
        this.f3859f = null;
        this.f3860g = Float.MIN_VALUE;
        this.f3861h = Float.valueOf(Float.MAX_VALUE);
    }
}
