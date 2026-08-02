package defpackage;

import com.sofascore.model.fantasy.FantasyLeagueGameType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y97 implements aa7 {
    public final String a;
    public final String b;
    public final FantasyLeagueGameType c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public y97(String str, String str2, FantasyLeagueGameType fantasyLeagueGameType, boolean z, boolean z2, boolean z3) {
        fantasyLeagueGameType.getClass();
        this.a = str;
        this.b = str2;
        this.c = fantasyLeagueGameType;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static y97 a(y97 y97Var, String str, String str2, FantasyLeagueGameType fantasyLeagueGameType, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = y97Var.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = y97Var.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            fantasyLeagueGameType = y97Var.c;
        }
        FantasyLeagueGameType fantasyLeagueGameType2 = fantasyLeagueGameType;
        boolean z3 = (i & 8) != 0 ? y97Var.d : true;
        if ((i & 16) != 0) {
            z = y97Var.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = y97Var.f;
        }
        str3.getClass();
        str4.getClass();
        fantasyLeagueGameType2.getClass();
        return new y97(str3, str4, fantasyLeagueGameType2, z3, z4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y97)) {
            return false;
        }
        y97 y97Var = (y97) obj;
        return this.a.equals(y97Var.a) && this.b.equals(y97Var.b) && this.c == y97Var.c && this.d == y97Var.d && this.e == y97Var.e && this.f == y97Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + dmi.e(dmi.e((this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder s = mz1.s("CreateLeague(name=", this.a, ", description=", this.b, ", gameType=");
        s.append(this.c);
        s.append(", isError=");
        s.append(this.d);
        s.append(", isInProgress=");
        return w1l.i(", confirmEnabled=", ")", s, this.e, this.f);
    }
}
