package f5;

import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9462a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9463b;

    public a(int i5, long j) {
        if (i5 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f9462a = i5;
        this.f9463b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.a(this.f9462a, aVar.f9462a) && this.f9463b == aVar.f9463b;
    }

    public final int hashCode() {
        int d10 = (f.d(this.f9462a) ^ 1000003) * 1000003;
        long j = this.f9463b;
        return d10 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i5 = this.f9462a;
        sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        sb2.append(this.f9463b);
        sb2.append("}");
        return sb2.toString();
    }
}
