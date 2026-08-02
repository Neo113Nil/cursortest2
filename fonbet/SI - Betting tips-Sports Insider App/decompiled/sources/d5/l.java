package d5;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f8227a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8228b;

    /* renamed from: c, reason: collision with root package name */
    public final j f8229c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f8230d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8231e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8232f;

    public l(long j, long j6, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f8242a;
        this.f8227a = j;
        this.f8228b = j6;
        this.f8229c = jVar;
        this.f8230d = num;
        this.f8231e = str;
        this.f8232f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        Object obj2 = w.f8242a;
        ArrayList arrayList = lVar.f8232f;
        String str = lVar.f8231e;
        Integer num = lVar.f8230d;
        j jVar = lVar.f8229c;
        if (this.f8227a != lVar.f8227a || this.f8228b != lVar.f8228b || !this.f8229c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.f8230d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f8231e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f8232f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f8227a;
        long j6 = this.f8228b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f8229c.hashCode()) * 1000003;
        Integer num = this.f8230d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f8231e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f8232f.hashCode()) * 1000003) ^ w.f8242a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f8227a + ", requestUptimeMs=" + this.f8228b + ", clientInfo=" + this.f8229c + ", logSource=" + this.f8230d + ", logSourceName=" + this.f8231e + ", logEvents=" + this.f8232f + ", qosTier=" + w.f8242a + "}";
    }
}
