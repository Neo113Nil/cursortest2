package h9;

import d9.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10424a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10425b;

    public a(String str, String str2) {
        this.f10424a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f10425b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f10424a.equals(aVar.f10424a) && this.f10425b.equals(aVar.f10425b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10424a.hashCode() ^ 1000003) * 1000003) ^ this.f10425b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f10424a);
        sb2.append(", version=");
        return e.l(sb2, this.f10425b, "}");
    }
}
