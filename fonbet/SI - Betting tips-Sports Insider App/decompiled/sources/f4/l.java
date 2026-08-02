package f4;

import d4.r;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final r f9459a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9460b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.h f9461c;

    public l(r rVar, String str, d4.h hVar) {
        this.f9459a = rVar;
        this.f9460b = str;
        this.f9461c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f9459a, lVar.f9459a) && Intrinsics.areEqual(this.f9460b, lVar.f9460b) && this.f9461c == lVar.f9461c;
    }

    public final int hashCode() {
        int hashCode = this.f9459a.hashCode() * 31;
        String str = this.f9460b;
        return this.f9461c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f9459a + ", mimeType=" + this.f9460b + ", dataSource=" + this.f9461c + ')';
    }
}
