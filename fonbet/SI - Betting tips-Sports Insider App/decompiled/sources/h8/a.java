package h8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f10390a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10391b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10392c;

    public a(long j, long j6, long j10) {
        this.f10390a = j;
        this.f10391b = j6;
        this.f10392c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f10390a == aVar.f10390a && this.f10391b == aVar.f10391b && this.f10392c == aVar.f10392c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10390a;
        long j6 = this.f10391b;
        int i5 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f10392c;
        return i5 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f10390a + ", elapsedRealtime=" + this.f10391b + ", uptimeMillis=" + this.f10392c + "}";
    }
}
