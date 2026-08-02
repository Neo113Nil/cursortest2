package e6;

import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public k f8722a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8723b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8724c;

    /* renamed from: d, reason: collision with root package name */
    public Feature[] f8725d;

    /* renamed from: e, reason: collision with root package name */
    public int f8726e;

    public final y a() {
        boolean z5 = true;
        g6.v.a("execute parameter required", this.f8722a != null);
        if (!this.f8724c) {
            Feature[] featureArr = this.f8725d;
            if (featureArr != null && (featureArr.length) != 0) {
                for (Feature feature : featureArr) {
                    if (feature.f4448d) {
                    }
                }
                this.f8723b = z5;
            }
            z5 = false;
            this.f8723b = z5;
        }
        return new y(this, this.f8725d, this.f8723b, this.f8726e);
    }
}
