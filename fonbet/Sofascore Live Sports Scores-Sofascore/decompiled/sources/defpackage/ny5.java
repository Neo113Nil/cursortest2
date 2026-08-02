package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ny5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;
    public final String f;

    public ny5(int i, String str, int i2, int i3, int i4, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = num;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny5)) {
            return false;
        }
        ny5 ny5Var = (ny5) obj;
        return this.a == ny5Var.a && this.b == ny5Var.b && this.c == ny5Var.c && this.d == ny5Var.d && Intrinsics.c(this.e, ny5Var.e) && Intrinsics.c(this.f, ny5Var.f);
    }

    public final int hashCode() {
        int a = wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "TrophyComparisonData(homeTeamId=", ", awayTeamId=", ", homeTrophyCount=");
        me4.q(s, this.c, ", awayTrophyCount=", this.d, ", competitionId=");
        s.append(this.e);
        s.append(", competitionName=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
