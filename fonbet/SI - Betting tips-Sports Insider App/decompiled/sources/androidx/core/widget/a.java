package androidx.core.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1446a;

    /* renamed from: b, reason: collision with root package name */
    public int f1447b;

    /* renamed from: c, reason: collision with root package name */
    public float f1448c;

    /* renamed from: d, reason: collision with root package name */
    public float f1449d;

    /* renamed from: e, reason: collision with root package name */
    public long f1450e;

    /* renamed from: f, reason: collision with root package name */
    public long f1451f;

    /* renamed from: g, reason: collision with root package name */
    public long f1452g;

    /* renamed from: h, reason: collision with root package name */
    public float f1453h;

    /* renamed from: i, reason: collision with root package name */
    public int f1454i;

    public final float a(long j) {
        if (j < this.f1450e) {
            return 0.0f;
        }
        long j6 = this.f1452g;
        if (j6 < 0 || j < j6) {
            return e.b((j - r0) / this.f1446a, 0.0f, 1.0f) * 0.5f;
        }
        float f6 = this.f1453h;
        return (e.b((j - j6) / this.f1454i, 0.0f, 1.0f) * f6) + (1.0f - f6);
    }
}
