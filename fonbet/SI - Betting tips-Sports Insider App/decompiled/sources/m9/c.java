package m9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final String f20514b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20515c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20516d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20517e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20518f;

    public c(String str, String str2, String str3, String str4, long j) {
        this.f20514b = str;
        this.f20515c = str2;
        this.f20516d = str3;
        this.f20517e = str4;
        this.f20518f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            c cVar = (c) ((e) obj);
            if (this.f20514b.equals(cVar.f20514b) && this.f20515c.equals(cVar.f20515c) && this.f20516d.equals(cVar.f20516d) && this.f20517e.equals(cVar.f20517e) && this.f20518f == cVar.f20518f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f20514b.hashCode() ^ 1000003) * 1000003) ^ this.f20515c.hashCode()) * 1000003) ^ this.f20516d.hashCode()) * 1000003) ^ this.f20517e.hashCode()) * 1000003;
        long j = this.f20518f;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.f20514b + ", variantId=" + this.f20515c + ", parameterKey=" + this.f20516d + ", parameterValue=" + this.f20517e + ", templateVersion=" + this.f20518f + "}";
    }
}
