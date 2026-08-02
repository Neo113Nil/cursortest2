package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tn6 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final Integer f;

    public tn6(int i, String str, int i2, int i3, int i4, Integer num) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn6)) {
            return false;
        }
        tn6 tn6Var = (tn6) obj;
        return this.a == tn6Var.a && Intrinsics.c(this.b, tn6Var.b) && this.c == tn6Var.c && this.d == tn6Var.d && this.e == tn6Var.e && Intrinsics.c(this.f, tn6Var.f);
    }

    public final int hashCode() {
        int a = wv8.a(this.e, wv8.a(this.d, wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31), 961);
        Integer num = this.f;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "FantasyBasicCompetitionInfo(competitionId=", ", competitionName=", this.b, ", fantasyPlayerId=");
        me4.q(t, this.c, ", uniqueTournamentId=", this.d, ", seasonId=");
        t.append(this.e);
        t.append(", categoryId=null, globalLeagueId=");
        t.append(this.f);
        t.append(")");
        return t.toString();
    }
}
