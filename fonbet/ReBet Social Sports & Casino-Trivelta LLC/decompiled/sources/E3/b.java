package E3;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f2963a;

    /* renamed from: b, reason: collision with root package name */
    public String f2964b;

    /* renamed from: c, reason: collision with root package name */
    public float f2965c;

    /* renamed from: d, reason: collision with root package name */
    public a f2966d;

    /* renamed from: e, reason: collision with root package name */
    public int f2967e;

    /* renamed from: f, reason: collision with root package name */
    public float f2968f;

    /* renamed from: g, reason: collision with root package name */
    public float f2969g;

    /* renamed from: h, reason: collision with root package name */
    public int f2970h;

    /* renamed from: i, reason: collision with root package name */
    public int f2971i;

    /* renamed from: j, reason: collision with root package name */
    public float f2972j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2973k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f2974l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f2975m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f2963a = str;
        this.f2964b = str2;
        this.f2965c = f10;
        this.f2966d = aVar;
        this.f2967e = i10;
        this.f2968f = f11;
        this.f2969g = f12;
        this.f2970h = i11;
        this.f2971i = i12;
        this.f2972j = f13;
        this.f2973k = z10;
        this.f2974l = pointF;
        this.f2975m = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f2963a.hashCode() * 31) + this.f2964b.hashCode()) * 31) + this.f2965c)) * 31) + this.f2966d.ordinal()) * 31) + this.f2967e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f2968f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f2970h;
    }

    public b() {
    }
}
