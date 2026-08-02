package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s2l {
    public final Integer a;
    public final Integer b;
    public final String c;
    public final String d;

    public s2l(Integer num, Integer num2, String str, String str2) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2l)) {
            return false;
        }
        s2l s2lVar = (s2l) obj;
        return Intrinsics.c(this.a, s2lVar.a) && Intrinsics.c(this.b, s2lVar.b) && Intrinsics.c(this.c, s2lVar.c) && Intrinsics.c(this.d, s2lVar.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return fc6.o(wv8.k(this.a, "WeeklyChallengePersonalBestUiModel(bestRank=", ", maxFinishedLeagueLevel=", ", maxLeagueTrophyUrl=", this.b), this.c, ", maxLeagueTitle=", this.d, ")");
    }
}
