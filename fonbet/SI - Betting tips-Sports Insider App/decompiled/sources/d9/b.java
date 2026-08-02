package d9;

import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8313a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8314b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8315c;

    public b(String str, long j, int i5) {
        this.f8313a = str;
        this.f8314b = j;
        this.f8315c = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i5 = bVar.f8315c;
        String str = bVar.f8313a;
        String str2 = this.f8313a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f8314b != bVar.f8314b) {
            return false;
        }
        int i10 = this.f8315c;
        return i10 == 0 ? i5 == 0 : f.a(i10, i5);
    }

    public final int hashCode() {
        String str = this.f8313a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f8314b;
        int i5 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i10 = this.f8315c;
        return (i10 != 0 ? f.d(i10) : 0) ^ i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f8313a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f8314b);
        sb2.append(", responseCode=");
        int i5 = this.f8315c;
        sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
