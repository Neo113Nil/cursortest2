package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class os0 extends rx3 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final qx3 k;
    public final uw3 l;
    public final rw3 m;

    public os0(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, qx3 qx3Var, uw3 uw3Var, rw3 rw3Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = qx3Var;
        this.l = uw3Var;
        this.m = rw3Var;
    }

    public final ns0 a() {
        ns0 ns0Var = new ns0();
        ns0Var.a = this.b;
        ns0Var.b = this.c;
        ns0Var.c = this.d;
        ns0Var.d = this.e;
        ns0Var.e = this.f;
        ns0Var.f = this.g;
        ns0Var.g = this.h;
        ns0Var.h = this.i;
        ns0Var.i = this.j;
        ns0Var.j = this.k;
        ns0Var.k = this.l;
        ns0Var.l = this.m;
        ns0Var.m = (byte) 1;
        return ns0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rx3) {
            os0 os0Var = (os0) ((rx3) obj);
            if (this.b.equals(os0Var.b) && this.c.equals(os0Var.c) && this.d == os0Var.d && this.e.equals(os0Var.e)) {
                String str = os0Var.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = os0Var.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = os0Var.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(os0Var.i) && this.j.equals(os0Var.j)) {
                                qx3 qx3Var = os0Var.k;
                                qx3 qx3Var2 = this.k;
                                if (qx3Var2 != null ? qx3Var2.equals(qx3Var) : qx3Var == null) {
                                    uw3 uw3Var = os0Var.l;
                                    uw3 uw3Var2 = this.l;
                                    if (uw3Var2 != null ? uw3Var2.equals(uw3Var) : uw3Var == null) {
                                        rw3 rw3Var = os0Var.m;
                                        rw3 rw3Var2 = this.m;
                                        if (rw3Var2 != null ? rw3Var2.equals(rw3Var) : rw3Var == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        qx3 qx3Var = this.k;
        int hashCode5 = (hashCode4 ^ (qx3Var == null ? 0 : qx3Var.hashCode())) * 1000003;
        uw3 uw3Var = this.l;
        int hashCode6 = (hashCode5 ^ (uw3Var == null ? 0 : uw3Var.hashCode())) * 1000003;
        rw3 rw3Var = this.m;
        return hashCode6 ^ (rw3Var != null ? rw3Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
