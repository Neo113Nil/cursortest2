package q4;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c4.m f22016a;

    /* renamed from: b, reason: collision with root package name */
    public final h f22017b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.h f22018c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.a f22019d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22020e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22021f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22022g;

    public p(c4.m mVar, h hVar, d4.h hVar2, l4.a aVar, String str, boolean z5, boolean z7) {
        this.f22016a = mVar;
        this.f22017b = hVar;
        this.f22018c = hVar2;
        this.f22019d = aVar;
        this.f22020e = str;
        this.f22021f = z5;
        this.f22022g = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f22016a, pVar.f22016a) && Intrinsics.areEqual(this.f22017b, pVar.f22017b) && this.f22018c == pVar.f22018c && Intrinsics.areEqual(this.f22019d, pVar.f22019d) && Intrinsics.areEqual(this.f22020e, pVar.f22020e) && this.f22021f == pVar.f22021f && this.f22022g == pVar.f22022g;
    }

    @Override // q4.k
    public final c4.m getImage() {
        return this.f22016a;
    }

    public final int hashCode() {
        int hashCode = (this.f22018c.hashCode() + ((this.f22017b.hashCode() + (this.f22016a.hashCode() * 31)) * 31)) * 31;
        l4.a aVar = this.f22019d;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f22020e;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f22021f ? 1231 : 1237)) * 31) + (this.f22022g ? 1231 : 1237);
    }

    @Override // q4.k
    public final h s() {
        return this.f22017b;
    }

    public final String toString() {
        return "SuccessResult(image=" + this.f22016a + ", request=" + this.f22017b + ", dataSource=" + this.f22018c + ", memoryCacheKey=" + this.f22019d + ", diskCacheKey=" + this.f22020e + ", isSampled=" + this.f22021f + ", isPlaceholderCached=" + this.f22022g + ')';
    }
}
