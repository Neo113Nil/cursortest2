package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jy7 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public jy7(int i, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy7)) {
            return false;
        }
        jy7 jy7Var = (jy7) obj;
        return this.a == jy7Var.a && this.b.equals(jy7Var.b) && Intrinsics.c(this.c, jy7Var.c) && Intrinsics.c(this.d, jy7Var.d) && Intrinsics.c(this.e, jy7Var.e);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "FeedVenue(id=", ", name=", this.b, ", countryAlpha2=");
        bf3.v(t, this.c, ", countryName=", this.d, ", cityName=");
        return mz1.o(t, this.e, ")");
    }
}
