package defpackage;

import com.sofascore.model.network.response.TeamAverageRatingVersion;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c9b {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final gv9 e;
    public final gv9 f;
    public final k06 g;
    public final k06 h;
    public final String i;
    public final String j;
    public final gv9 k;
    public final gv9 l;
    public final sda m;
    public final sda n;
    public final String o;
    public final String p;
    public final boolean q;
    public final double r;
    public final double s;
    public final TeamAverageRatingVersion t;

    public c9b(int i, int i2, String str, String str2, gv9 gv9Var, gv9 gv9Var2, k06 k06Var, k06 k06Var2, String str3, String str4, gv9 gv9Var3, gv9 gv9Var4, sda sdaVar, sda sdaVar2, String str5, String str6, boolean z, double d, double d2, TeamAverageRatingVersion teamAverageRatingVersion) {
        str.getClass();
        str2.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        teamAverageRatingVersion.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = gv9Var;
        this.f = gv9Var2;
        this.g = k06Var;
        this.h = k06Var2;
        this.i = str3;
        this.j = str4;
        this.k = gv9Var3;
        this.l = gv9Var4;
        this.m = sdaVar;
        this.n = sdaVar2;
        this.o = str5;
        this.p = str6;
        this.q = z;
        this.r = d;
        this.s = d2;
        this.t = teamAverageRatingVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9b)) {
            return false;
        }
        c9b c9bVar = (c9b) obj;
        return this.a == c9bVar.a && this.b == c9bVar.b && Intrinsics.c(this.c, c9bVar.c) && Intrinsics.c(this.d, c9bVar.d) && Intrinsics.c(this.e, c9bVar.e) && Intrinsics.c(this.f, c9bVar.f) && this.g.equals(c9bVar.g) && this.h.equals(c9bVar.h) && Intrinsics.c(this.i, c9bVar.i) && Intrinsics.c(this.j, c9bVar.j) && Intrinsics.c(this.k, c9bVar.k) && Intrinsics.c(this.l, c9bVar.l) && this.m.equals(c9bVar.m) && this.n.equals(c9bVar.n) && Intrinsics.c(this.o, c9bVar.o) && Intrinsics.c(this.p, c9bVar.p) && this.q == c9bVar.q && Double.compare(this.r, c9bVar.r) == 0 && Double.compare(this.s, c9bVar.s) == 0 && this.t == c9bVar.t;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ljg.d(ljg.d(dmi.c(dmi.c(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        gv9 gv9Var = this.k;
        int hashCode4 = (hashCode3 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        gv9 gv9Var2 = this.l;
        int hashCode5 = (this.n.hashCode() + ((this.m.hashCode() + ((hashCode4 + (gv9Var2 == null ? 0 : gv9Var2.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.o;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        return this.t.hashCode() + dmi.b(dmi.b(dmi.e((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "LineupsFieldUIModel(homeTeamId=", ", awayTeamId=", ", homeTeamName=");
        bf3.v(s, this.c, ", awayTeamName=", this.d, ", homePlayersData=");
        vxd.u(s, this.e, ", awayPlayersData=", this.f, ", homeTeamValues=");
        s.append(this.g);
        s.append(", awayTeamValues=");
        s.append(this.h);
        s.append(", homeFormationDisplay=");
        bf3.v(s, this.i, ", awayFormationDisplay=", this.j, ", homeFormation=");
        vxd.u(s, this.k, ", awayFormation=", this.l, ", homeTeamJerseyData=");
        s.append(this.m);
        s.append(", awayTeamJerseyData=");
        s.append(this.n);
        s.append(", statusOfLineupsLabel=");
        bf3.v(s, this.o, ", fantasyPointsStatusType=", this.p, ", pregameRatingShown=");
        s.append(this.q);
        s.append(", homeTeamAverageRating=");
        s.append(this.r);
        fn0.A(s, ", awayTeamAverageRating=", this.s, ", avgRatingVersion=");
        s.append(this.t);
        s.append(")");
        return s.toString();
    }
}
