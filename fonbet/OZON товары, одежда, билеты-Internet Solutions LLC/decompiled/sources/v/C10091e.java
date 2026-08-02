package v;

import v.D1;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10091e extends D1.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f101246a;

    /* renamed from: b, reason: collision with root package name */
    private final int f101247b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f101248c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f101249d;

    C10091e(int i11, int i12, boolean z11, boolean z12) {
        this.f101246a = i11;
        this.f101247b = i12;
        this.f101248c = z11;
        this.f101249d = z12;
    }

    @Override // v.D1.a
    final int a() {
        return this.f101246a;
    }

    @Override // v.D1.a
    final int b() {
        return this.f101247b;
    }

    @Override // v.D1.a
    final boolean c() {
        return this.f101248c;
    }

    @Override // v.D1.a
    final boolean d() {
        return this.f101249d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D1.a)) {
            return false;
        }
        D1.a aVar = (D1.a) obj;
        return this.f101246a == aVar.a() && this.f101247b == aVar.b() && this.f101248c == aVar.c() && this.f101249d == aVar.d();
    }

    public final int hashCode() {
        return ((((((this.f101246a ^ 1000003) * 1000003) ^ this.f101247b) * 1000003) ^ (this.f101248c ? 1231 : 1237)) * 1000003) ^ (this.f101249d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureSettings{cameraMode=");
        sb2.append(this.f101246a);
        sb2.append(", requiredMaxBitDepth=");
        sb2.append(this.f101247b);
        sb2.append(", previewStabilizationOn=");
        sb2.append(this.f101248c);
        sb2.append(", ultraHdrOn=");
        return Pk0.a.a("}", sb2, this.f101249d);
    }
}
