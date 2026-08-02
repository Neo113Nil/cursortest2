package p1;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final float f21427a;

    /* renamed from: b, reason: collision with root package name */
    public final g f21428b;

    public m(float f6, g feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.f21427a = f6;
        this.f21428b = feature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f21427a, mVar.f21427a) == 0 && Intrinsics.areEqual(this.f21428b, mVar.f21428b);
    }

    public final int hashCode() {
        return this.f21428b.hashCode() + (Float.floatToIntBits(this.f21427a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.f21427a + ", feature=" + this.f21428b + ')';
    }
}
