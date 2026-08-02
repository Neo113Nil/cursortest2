package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r91 {
    public final Integer a;
    public final String b;
    public final gv9 c;
    public final wj1 d;
    public final tee e;
    public final String f;

    public r91(Integer num, String str, gv9 gv9Var, wj1 wj1Var, tee teeVar, String str2) {
        this.a = num;
        this.b = str;
        this.c = gv9Var;
        this.d = wj1Var;
        this.e = teeVar;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r91)) {
            return false;
        }
        r91 r91Var = (r91) obj;
        return Intrinsics.c(this.a, r91Var.a) && Intrinsics.c(this.b, r91Var.b) && Intrinsics.c(this.c, r91Var.c) && this.d == r91Var.d && Intrinsics.c(this.e, r91Var.e) && Intrinsics.c(this.f, r91Var.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        gv9 gv9Var = this.c;
        int hashCode3 = (hashCode2 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        wj1 wj1Var = this.d;
        int hashCode4 = (hashCode3 + (wj1Var == null ? 0 : wj1Var.hashCode())) * 31;
        tee teeVar = this.e;
        int hashCode5 = (hashCode4 + (teeVar == null ? 0 : teeVar.hashCode())) * 31;
        String str2 = this.f;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = wv8.m("BaseballPlayerKeyStatisticsCardData(uniqueTournamentId=", this.a, ", subSeasonType=", this.b, ", availableStatTypes=");
        m.append(this.c);
        m.append(", defaultStatType=");
        m.append(this.d);
        m.append(", statistics=");
        m.append(this.e);
        m.append(", year=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
