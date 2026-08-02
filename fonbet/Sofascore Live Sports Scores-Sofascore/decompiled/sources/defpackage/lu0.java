package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lu0 {
    public final String a;
    public final String b;
    public final String c;
    public final iv0 d;
    public final int e;

    public lu0(String str, String str2, String str3, iv0 iv0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = iv0Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lu0)) {
            return false;
        }
        lu0 lu0Var = (lu0) obj;
        String str = lu0Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = lu0Var.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = lu0Var.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        iv0 iv0Var = lu0Var.d;
        iv0 iv0Var2 = this.d;
        if (iv0Var2 == null) {
            if (iv0Var != null) {
                return false;
            }
        } else if (!iv0Var2.equals(iv0Var)) {
            return false;
        }
        int i = lu0Var.e;
        int i2 = this.e;
        return i2 == 0 ? i == 0 : wt3.b(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        iv0 iv0Var = this.d;
        int hashCode4 = (hashCode3 ^ (iv0Var == null ? 0 : iv0Var.hashCode())) * 1000003;
        int i = this.e;
        return hashCode4 ^ (i != 0 ? wt3.C(i) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : Payload.RESPONSE_OK);
        sb.append("}");
        return sb.toString();
    }
}
