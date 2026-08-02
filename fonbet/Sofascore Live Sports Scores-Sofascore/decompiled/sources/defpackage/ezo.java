package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ezo extends czo {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;

    public /* synthetic */ ezo(String str, boolean z, boolean z2, long j, long j2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.czo
    public final String a() {
        return this.a;
    }

    @Override // defpackage.czo
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.czo
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.czo
    public final long d() {
        return this.d;
    }

    @Override // defpackage.czo
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof czo)) {
            return false;
        }
        czo czoVar = (czo) obj;
        return this.a.equals(czoVar.a()) && this.b == czoVar.b() && this.c == czoVar.c() && this.d == czoVar.d() && this.e == czoVar.e();
    }

    public final int hashCode() {
        return ((int) this.e) ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.d)) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        boolean z = this.b;
        int length = String.valueOf(z).length();
        boolean z2 = this.c;
        int length2 = String.valueOf(z2).length();
        long j = this.d;
        int length3 = String.valueOf(j).length();
        long j2 = this.e;
        int length4 = String.valueOf(j2).length();
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j);
        return fn0.l(j2, ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=", "}", sb);
    }
}
