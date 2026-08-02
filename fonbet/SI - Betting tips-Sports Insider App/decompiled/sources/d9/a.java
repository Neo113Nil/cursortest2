package d9;

import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8309b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8310c;

    /* renamed from: d, reason: collision with root package name */
    public final b f8311d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8312e;

    public a(String str, String str2, String str3, b bVar, int i5) {
        this.f8308a = str;
        this.f8309b = str2;
        this.f8310c = str3;
        this.f8311d = bVar;
        this.f8312e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i5 = aVar.f8312e;
        b bVar = aVar.f8311d;
        String str = aVar.f8310c;
        String str2 = aVar.f8309b;
        String str3 = aVar.f8308a;
        String str4 = this.f8308a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f8309b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f8310c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        b bVar2 = this.f8311d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i10 = this.f8312e;
        return i10 == 0 ? i5 == 0 : f.a(i10, i5);
    }

    public final int hashCode() {
        String str = this.f8308a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f8309b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8310c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f8311d;
        int hashCode4 = (hashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i5 = this.f8312e;
        return (i5 != 0 ? f.d(i5) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f8308a);
        sb2.append(", fid=");
        sb2.append(this.f8309b);
        sb2.append(", refreshToken=");
        sb2.append(this.f8310c);
        sb2.append(", authToken=");
        sb2.append(this.f8311d);
        sb2.append(", responseCode=");
        int i5 = this.f8312e;
        sb2.append(i5 != 1 ? i5 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
