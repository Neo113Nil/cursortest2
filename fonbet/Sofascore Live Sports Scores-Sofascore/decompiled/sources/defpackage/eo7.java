package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eo7 implements Serializable {
    public static final eo7 r = new eo7(5, 7, 200, 32, "21313", "Šime", "", "Šimunovi cirenci", false, false, Long.valueOf(yaa.w()), 0, 4, 1, 2, 13, Float.valueOf(180.5f));
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final Long k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Float q;

    public eo7(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, boolean z, boolean z2, Long l, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Float f) {
        me4.p(str, str2, str4);
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = z;
        this.j = z2;
        this.k = l;
        this.l = num5;
        this.m = num6;
        this.n = num7;
        this.o = num8;
        this.p = num9;
        this.q = f;
    }

    public static eo7 a(eo7 eo7Var, Integer num, Integer num2, Integer num3, String str, String str2) {
        String str3 = eo7Var.e;
        String str4 = eo7Var.g;
        boolean z = eo7Var.i;
        boolean z2 = eo7Var.j;
        Long l = eo7Var.k;
        Integer num4 = eo7Var.l;
        Integer num5 = eo7Var.m;
        Integer num6 = eo7Var.n;
        Integer num7 = eo7Var.o;
        Integer num8 = eo7Var.p;
        Float f = eo7Var.q;
        eo7Var.getClass();
        str3.getClass();
        return new eo7(num, num2, num3, 27, str3, str, str4, str2, z, z2, l, num4, num5, num6, num7, num8, f);
    }

    public final int d() {
        Integer num = this.b;
        if (num == null) {
            return 0;
        }
        Integer num2 = this.a;
        Integer valueOf = num2 != null ? Integer.valueOf(num.intValue() - num2.intValue()) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo7)) {
            return false;
        }
        eo7 eo7Var = (eo7) obj;
        return Intrinsics.c(this.a, eo7Var.a) && Intrinsics.c(this.b, eo7Var.b) && Intrinsics.c(this.c, eo7Var.c) && Intrinsics.c(this.d, eo7Var.d) && Intrinsics.c(this.e, eo7Var.e) && Intrinsics.c(this.f, eo7Var.f) && Intrinsics.c(this.g, eo7Var.g) && Intrinsics.c(this.h, eo7Var.h) && this.i == eo7Var.i && this.j == eo7Var.j && this.k.equals(eo7Var.k) && Intrinsics.c(this.l, eo7Var.l) && Intrinsics.c(this.m, eo7Var.m) && Intrinsics.c(this.n, eo7Var.n) && Intrinsics.c(this.o, eo7Var.o) && Intrinsics.c(this.p, eo7Var.p) && Intrinsics.c(this.q, eo7Var.q);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int c = dmi.c(dmi.c((hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode4 = (this.k.hashCode() + dmi.e(dmi.e(dmi.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31;
        Integer num5 = this.l;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.m;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.n;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.o;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.p;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Float f = this.q;
        return hashCode9 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = wv8.k(this.a, "FantasyUserLeaderboardUiModel(rank=", ", previousRank=", ", totalScore=", this.b);
        vxd.r(this.c, this.d, ", currentScore=", ", userId=", k);
        bf3.v(k, this.e, ", userName=", this.f, ", userImageUrl=");
        bf3.v(k, this.g, ", teamName=", this.h, ", joinedInCurrentRound=");
        vxd.t(", joinedInNextRound=", ", updatedAt=", k, this.i, this.j);
        k.append(this.k);
        k.append(", roundId=");
        k.append(this.l);
        k.append(", wins=");
        vxd.r(this.m, this.n, ", draws=", ", losses=", k);
        vxd.r(this.o, this.p, ", points=", ", scoreAgainst=", k);
        k.append(this.q);
        k.append(")");
        return k.toString();
    }
}
