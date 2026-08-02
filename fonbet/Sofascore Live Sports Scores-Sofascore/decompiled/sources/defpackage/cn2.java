package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cn2 {
    public final Integer a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;

    public cn2(Integer num, String str, String str2, String str3, Integer num2) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = num2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2)) {
            return false;
        }
        cn2 cn2Var = (cn2) obj;
        return this.a.equals(cn2Var.a) && Intrinsics.c(this.b, cn2Var.b) && this.c.equals(cn2Var.c) && Intrinsics.c(this.d, cn2Var.d) && Intrinsics.c(this.e, cn2Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = dmi.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Integer num = this.d;
        int hashCode2 = (c + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = wv8.m("ChampionDataUIModel(winnerTeamId=", this.a, ", winnerTeamName=", this.b, ", score=");
        me4.o(this.d, this.c, ", mvpPlayerId=", ", mvpPlayerName=", m);
        return mz1.o(m, this.e, ")");
    }
}
