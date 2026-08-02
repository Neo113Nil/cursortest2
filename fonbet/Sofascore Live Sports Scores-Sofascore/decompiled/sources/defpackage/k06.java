package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k06 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final j06 f;

    public k06(String str, String str2, String str3, String str4, String str5, j06 j06Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j06Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k06)) {
            return false;
        }
        k06 k06Var = (k06) obj;
        return Intrinsics.c(this.a, k06Var.a) && Intrinsics.c(this.b, k06Var.b) && Intrinsics.c(this.c, k06Var.c) && Intrinsics.c(this.d, k06Var.d) && Intrinsics.c(this.e, k06Var.e) && Intrinsics.c(this.f, k06Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        j06 j06Var = this.f;
        return hashCode5 + (j06Var != null ? j06Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = mz1.s("TeamValues(averageAge=", this.a, ", totalMarketValue=", this.b, ", averageHeight=");
        bf3.v(s, this.c, ", fantasyPoints=", this.d, ", totalDistance=");
        s.append(this.e);
        s.append(", ratingBreakdownValues=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
