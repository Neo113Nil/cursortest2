package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ar2 {
    public final gv9 a;
    public final String b;
    public final String c;
    public final String d;

    public ar2(gv9 gv9Var, String str, String str2, String str3) {
        gv9Var.getClass();
        this.a = gv9Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar2)) {
            return false;
        }
        ar2 ar2Var = (ar2) obj;
        return Intrinsics.c(this.a, ar2Var.a) && Intrinsics.c(this.b, ar2Var.b) && Intrinsics.c(this.c, ar2Var.c) && Intrinsics.c(this.d, ar2Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatCountryFlagState(countries=");
        sb.append(this.a);
        sb.append(", selectedAlpha2=");
        sb.append(this.b);
        sb.append(", userNickname=");
        return fc6.o(sb, this.c, ", userImageUrl=", this.d, ")");
    }
}
