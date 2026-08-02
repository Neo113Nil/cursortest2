package l5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f19371a;

    /* renamed from: b, reason: collision with root package name */
    public final e5.i f19372b;

    /* renamed from: c, reason: collision with root package name */
    public final e5.h f19373c;

    public b(long j, e5.i iVar, e5.h hVar) {
        this.f19371a = j;
        this.f19372b = iVar;
        this.f19373c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f19371a == bVar.f19371a && this.f19372b.equals(bVar.f19372b) && this.f19373c.equals(bVar.f19373c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f19371a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f19372b.hashCode()) * 1000003) ^ this.f19373c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f19371a + ", transportContext=" + this.f19372b + ", event=" + this.f19373c + "}";
    }
}
