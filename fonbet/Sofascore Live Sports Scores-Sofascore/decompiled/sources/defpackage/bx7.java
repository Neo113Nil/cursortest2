package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bx7 {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final fy7 g;
    public final fy7 h;
    public final String i;
    public final String j;
    public final String k;
    public final Long l;
    public final Integer m;
    public final Integer n;
    public final String o;
    public final String p;
    public final Integer q;
    public final boolean r;
    public final boolean s;

    public bx7(int i, Integer num, Integer num2, String str, String str2, String str3, fy7 fy7Var, fy7 fy7Var2, String str4, String str5, String str6, Long l, Integer num3, Integer num4, String str7, String str8, Integer num5, boolean z, boolean z2, int i2) {
        String str9 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str4;
        String str10 = (i2 & 512) != 0 ? null : str5;
        String str11 = (i2 & 1024) != 0 ? null : str6;
        Long l2 = (i2 & a.o) != 0 ? 0L : l;
        String str12 = (i2 & 16384) != 0 ? null : str7;
        String str13 = (i2 & 32768) == 0 ? str8 : null;
        str3.getClass();
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = fy7Var;
        this.h = fy7Var2;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = l2;
        this.m = num3;
        this.n = num4;
        this.o = str12;
        this.p = str13;
        this.q = num5;
        this.r = z;
        this.s = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx7)) {
            return false;
        }
        bx7 bx7Var = (bx7) obj;
        return this.a == bx7Var.a && this.b.equals(bx7Var.b) && Intrinsics.c(this.c, bx7Var.c) && Intrinsics.c(this.d, bx7Var.d) && Intrinsics.c(this.e, bx7Var.e) && Intrinsics.c(this.f, bx7Var.f) && Intrinsics.c(this.g, bx7Var.g) && Intrinsics.c(this.h, bx7Var.h) && Intrinsics.c(this.i, bx7Var.i) && Intrinsics.c(this.j, bx7Var.j) && Intrinsics.c(this.k, bx7Var.k) && Intrinsics.c(this.l, bx7Var.l) && Intrinsics.c(this.m, bx7Var.m) && Intrinsics.c(this.n, bx7Var.n) && Intrinsics.c(this.o, bx7Var.o) && Intrinsics.c(this.p, bx7Var.p) && Intrinsics.c(this.q, bx7Var.q) && this.r == bx7Var.r && this.s == bx7Var.s;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int c = dmi.c((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        fy7 fy7Var = this.g;
        int hashCode4 = (c + (fy7Var == null ? 0 : fy7Var.hashCode())) * 31;
        fy7 fy7Var2 = this.h;
        int hashCode5 = (hashCode4 + (fy7Var2 == null ? 0 : fy7Var2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.l;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.m;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.n;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.o;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.p;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num4 = this.q;
        return Boolean.hashCode(this.s) + dmi.e((hashCode13 + (num4 != null ? num4.hashCode() : 0)) * 961, 31, this.r);
    }

    public final String toString() {
        StringBuilder r = fc6.r("FeedEvent(id=", ", tournamentId=", ", uniqueTournamentId=", this.b, this.a);
        vxd.s(this.c, ", uniqueTournamentName=", this.d, ", tournamentTranslatedName=", r);
        bf3.v(r, this.e, ", sport=", this.f, ", homeTeam=");
        r.append(this.g);
        r.append(", awayTeam=");
        r.append(this.h);
        r.append(", roundName=");
        bf3.v(r, this.i, ", statusType=", this.j, ", statusDescription=");
        r.append(this.k);
        r.append(", startTimestamp=");
        r.append(this.l);
        r.append(", homeTeamScore=");
        vxd.r(this.m, this.n, ", awayTeamScore=", ", homeSeasonForm=", r);
        bf3.v(r, this.o, ", awaySeasonForm=", this.p, ", winnerCode=");
        r.append(this.q);
        r.append(", time=null, shouldReverseTeams=");
        r.append(this.r);
        r.append(", isDoublesMatch=");
        return wt3.p(r, this.s, ")");
    }
}
