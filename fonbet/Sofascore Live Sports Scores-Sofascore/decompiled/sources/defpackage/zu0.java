package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zu0 extends y5g {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public zu0(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            yhk.s("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            yhk.s("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            yhk.s("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y5g)) {
            return false;
        }
        zu0 zu0Var = (zu0) ((y5g) obj);
        return this.b.equals(zu0Var.b) && this.c.equals(zu0Var.c) && this.d.equals(zu0Var.d) && this.e.equals(zu0Var.e) && this.f == zu0Var.f;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return lnb.l(this.f, "}", sb);
    }
}
