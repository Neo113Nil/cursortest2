package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pv3 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public pv3(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv3)) {
            return false;
        }
        pv3 pv3Var = (pv3) obj;
        return this.a == pv3Var.a && this.b == pv3Var.b && Intrinsics.c(this.c, pv3Var.c) && Intrinsics.c(this.d, pv3Var.d) && Intrinsics.c(this.e, pv3Var.e) && Intrinsics.c(this.f, pv3Var.f) && Intrinsics.c(this.g, pv3Var.g);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "CountrySignupLinkUIModel(id=", ", signupLinkId=", ", cta=");
        bf3.v(s, this.c, ", button=", this.d, ", disclaimer=");
        bf3.v(s, this.e, ", disclaimerUrl=", this.f, ", url=");
        return mz1.o(s, this.g, ")");
    }
}
