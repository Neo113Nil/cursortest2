package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p5j {
    public final c6j a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public p5j(c6j c6jVar, String str, String str2, String str3, String str4) {
        c6jVar.getClass();
        this.a = c6jVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5j)) {
            return false;
        }
        p5j p5jVar = (p5j) obj;
        return this.a == p5jVar.a && Intrinsics.c(this.b, p5jVar.b) && Intrinsics.c(this.c, p5jVar.c) && Intrinsics.c(this.d, p5jVar.d) && Intrinsics.c(this.e, p5jVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TennisEventRankingRow(category=");
        sb.append(this.a);
        sb.append(", homeTeamRanking=");
        sb.append(this.b);
        sb.append(", homeTeamPoints=");
        bf3.v(sb, this.c, ", awayTeamRanking=", this.d, ", awayTeamPoints=");
        return mz1.o(sb, this.e, ")");
    }
}
