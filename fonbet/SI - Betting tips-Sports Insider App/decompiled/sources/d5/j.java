package d5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final h f8219a;

    public j(h hVar) {
        this.f8219a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f8236a;
        if (obj2.equals(obj2)) {
            return this.f8219a.equals(((j) qVar).f8219a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f8236a.hashCode() ^ 1000003) * 1000003) ^ this.f8219a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f8236a + ", androidClientInfo=" + this.f8219a + "}";
    }
}
