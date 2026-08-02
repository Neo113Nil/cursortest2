package d4;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final c4.m f8133a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8134b;

    public i(c4.m mVar, boolean z5) {
        this.f8133a = mVar;
        this.f8134b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f8133a, iVar.f8133a) && this.f8134b == iVar.f8134b;
    }

    public final int hashCode() {
        return (this.f8133a.hashCode() * 31) + (this.f8134b ? 1231 : 1237);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.f8133a + ", isSampled=" + this.f8134b + ')';
    }
}
