package b9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3092a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3093b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3094c;

    public a(long j, long j6, String str) {
        this.f3092a = str;
        this.f3093b = j;
        this.f3094c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3092a.equals(aVar.f3092a) && this.f3093b == aVar.f3093b && this.f3094c == aVar.f3094c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3092a.hashCode() ^ 1000003) * 1000003;
        long j = this.f3093b;
        long j6 = this.f3094c;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f3092a + ", tokenExpirationTimestamp=" + this.f3093b + ", tokenCreationTimestamp=" + this.f3094c + "}";
    }
}
