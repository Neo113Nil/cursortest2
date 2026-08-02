package k5;

import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f18811a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18812b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f18813c;

    public b(long j, long j6, Set set) {
        this.f18811a = j;
        this.f18812b = j6;
        this.f18813c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f18811a == bVar.f18811a && this.f18812b == bVar.f18812b && this.f18813c.equals(bVar.f18813c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f18811a;
        int i5 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j6 = this.f18812b;
        return ((i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f18813c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f18811a + ", maxAllowedDelay=" + this.f18812b + ", flags=" + this.f18813c + "}";
    }
}
