package p0;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21398a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21399b;

    public b(Object obj, Object obj2) {
        this.f21398a = obj;
        this.f21399b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f21398a, this.f21398a) && Objects.equals(bVar.f21399b, this.f21399b);
    }

    public final int hashCode() {
        Object obj = this.f21398a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f21399b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f21398a + " " + this.f21399b + "}";
    }
}
