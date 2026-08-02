package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rnj {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final Integer e;

    public rnj(int i, int i2, Integer num, String str, String str2) {
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnj)) {
            return false;
        }
        rnj rnjVar = (rnj) obj;
        return this.a == rnjVar.a && this.b == rnjVar.b && Intrinsics.c(this.c, rnjVar.c) && Intrinsics.c(this.d, rnjVar.d) && Intrinsics.c(this.e, rnjVar.e);
    }

    public final int hashCode() {
        int c = dmi.c(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "TopStatsInfo(uniqueTournamentId=", ", seasonId=", ", sport=");
        bf3.v(s, this.c, ", tournamentName=", this.d, ", teamId=");
        return vxd.n(s, this.e, ")");
    }
}
