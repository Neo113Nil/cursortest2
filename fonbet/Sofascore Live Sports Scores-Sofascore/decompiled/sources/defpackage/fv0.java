package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fv0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final fp4 f;

    public fv0(String str, String str2, String str3, String str4, int i, fp4 fp4Var) {
        if (str == null) {
            yhk.s("Null appIdentifier");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            yhk.s("Null versionCode");
            throw null;
        }
        this.b = str2;
        if (str3 == null) {
            yhk.s("Null versionName");
            throw null;
        }
        this.c = str3;
        if (str4 == null) {
            yhk.s("Null installUuid");
            throw null;
        }
        this.d = str4;
        this.e = i;
        this.f = fp4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fv0) {
            fv0 fv0Var = (fv0) obj;
            return this.a.equals(fv0Var.a) && this.b.equals(fv0Var.b) && this.c.equals(fv0Var.c) && this.d.equals(fv0Var.d) && this.e == fv0Var.e && this.f == fv0Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
