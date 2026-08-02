package c9;

import d9.e;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f3706h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f3707a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3708b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3709c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3710d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3711e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3712f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3713g;

    static {
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        if (b10 == 3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
    }

    public b(String str, int i5, String str2, String str3, long j, long j6, String str4) {
        this.f3707a = str;
        this.f3708b = i5;
        this.f3709c = str2;
        this.f3710d = str3;
        this.f3711e = j;
        this.f3712f = j6;
        this.f3713g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f3698a = this.f3707a;
        aVar.f3699b = this.f3708b;
        aVar.f3700c = this.f3709c;
        aVar.f3701d = this.f3710d;
        aVar.f3702e = this.f3711e;
        aVar.f3703f = this.f3712f;
        aVar.f3704g = this.f3713g;
        aVar.f3705h = (byte) 3;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f3713g;
        String str2 = bVar.f3710d;
        String str3 = bVar.f3709c;
        String str4 = bVar.f3707a;
        String str5 = this.f3707a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!f.a(this.f3708b, bVar.f3708b)) {
            return false;
        }
        String str6 = this.f3709c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f3710d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f3711e != bVar.f3711e || this.f3712f != bVar.f3712f) {
            return false;
        }
        String str8 = this.f3713g;
        return str8 == null ? str == null : str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f3707a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ f.d(this.f3708b)) * 1000003;
        String str2 = this.f3709c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3710d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f3711e;
        int i5 = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j6 = this.f3712f;
        int i10 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str4 = this.f3713g;
        return (str4 != null ? str4.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f3707a);
        sb2.append(", registrationStatus=");
        int i5 = this.f3708b;
        sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb2.append(", authToken=");
        sb2.append(this.f3709c);
        sb2.append(", refreshToken=");
        sb2.append(this.f3710d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f3711e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f3712f);
        sb2.append(", fisError=");
        return e.l(sb2, this.f3713g, "}");
    }
}
