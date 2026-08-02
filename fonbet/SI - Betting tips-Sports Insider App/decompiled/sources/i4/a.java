package i4;

import c4.m;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m f10923a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10924b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.h f10925c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10926d;

    public a(m mVar, boolean z5, d4.h hVar, String str) {
        this.f10923a = mVar;
        this.f10924b = z5;
        this.f10925c = hVar;
        this.f10926d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f10923a, aVar.f10923a) && this.f10924b == aVar.f10924b && this.f10925c == aVar.f10925c && Intrinsics.areEqual(this.f10926d, aVar.f10926d);
    }

    public final int hashCode() {
        int hashCode = (this.f10925c.hashCode() + (((this.f10923a.hashCode() * 31) + (this.f10924b ? 1231 : 1237)) * 31)) * 31;
        String str = this.f10926d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExecuteResult(image=");
        sb2.append(this.f10923a);
        sb2.append(", isSampled=");
        sb2.append(this.f10924b);
        sb2.append(", dataSource=");
        sb2.append(this.f10925c);
        sb2.append(", diskCacheKey=");
        return d9.e.k(sb2, this.f10926d, ')');
    }
}
