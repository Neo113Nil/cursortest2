package f4;

import c4.m;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final m f9454a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9455b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.h f9456c;

    public j(m mVar, boolean z5, d4.h hVar) {
        this.f9454a = mVar;
        this.f9455b = z5;
        this.f9456c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f9454a, jVar.f9454a) && this.f9455b == jVar.f9455b && this.f9456c == jVar.f9456c;
    }

    public final int hashCode() {
        return this.f9456c.hashCode() + (((this.f9454a.hashCode() * 31) + (this.f9455b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f9454a + ", isSampled=" + this.f9455b + ", dataSource=" + this.f9456c + ')';
    }
}
