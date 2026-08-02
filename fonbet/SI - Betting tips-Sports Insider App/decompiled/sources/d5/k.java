package d5;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f8220a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f8221b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8222c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8223d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8224e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8225f;

    /* renamed from: g, reason: collision with root package name */
    public final v f8226g;

    public k(long j, Integer num, long j6, byte[] bArr, String str, long j10, v vVar) {
        this.f8220a = j;
        this.f8221b = num;
        this.f8222c = j6;
        this.f8223d = bArr;
        this.f8224e = str;
        this.f8225f = j10;
        this.f8226g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f8226g;
            String str2 = kVar.f8224e;
            Integer num2 = kVar.f8221b;
            if (this.f8220a == kVar.f8220a && ((num = this.f8221b) != null ? num.equals(num2) : num2 == null) && this.f8222c == kVar.f8222c) {
                if (Arrays.equals(this.f8223d, rVar instanceof k ? ((k) rVar).f8223d : kVar.f8223d) && ((str = this.f8224e) != null ? str.equals(str2) : str2 == null) && this.f8225f == kVar.f8225f && ((vVar = this.f8226g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f8220a;
        int i5 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f8221b;
        int hashCode = (i5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j6 = this.f8222c;
        int hashCode2 = (((hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f8223d)) * 1000003;
        String str = this.f8224e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f8225f;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        v vVar = this.f8226g;
        return i10 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f8220a + ", eventCode=" + this.f8221b + ", eventUptimeMs=" + this.f8222c + ", sourceExtension=" + Arrays.toString(this.f8223d) + ", sourceExtensionJsonProto3=" + this.f8224e + ", timezoneOffsetSeconds=" + this.f8225f + ", networkConnectionInfo=" + this.f8226g + "}";
    }
}
