package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.PowerRankingRound;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bza {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final gv9 f;
    public final PowerRankingRound g;
    public final gv9 h;
    public final boolean i;
    public final boolean j;

    public bza(int i, int i2, String str, String str2, String str3, gv9 gv9Var, PowerRankingRound powerRankingRound, gv9 gv9Var2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = gv9Var;
        this.g = powerRankingRound;
        this.h = gv9Var2;
        this.i = z;
        this.j = z2;
    }

    public static bza a(bza bzaVar, PowerRankingRound powerRankingRound, gv9 gv9Var, boolean z, int i) {
        int i2 = bzaVar.a;
        int i3 = bzaVar.b;
        String str = bzaVar.c;
        String str2 = bzaVar.d;
        String str3 = bzaVar.e;
        gv9 gv9Var2 = bzaVar.f;
        if ((i & 64) != 0) {
            powerRankingRound = bzaVar.g;
        }
        PowerRankingRound powerRankingRound2 = powerRankingRound;
        if ((i & 128) != 0) {
            gv9Var = bzaVar.h;
        }
        gv9 gv9Var3 = gv9Var;
        boolean z2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? bzaVar.i : true;
        if ((i & 512) != 0) {
            z = bzaVar.j;
        }
        bzaVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        return new bza(i2, i3, str, str2, str3, gv9Var2, powerRankingRound2, gv9Var3, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bza)) {
            return false;
        }
        bza bzaVar = (bza) obj;
        return this.a == bzaVar.a && this.b == bzaVar.b && Intrinsics.c(this.c, bzaVar.c) && Intrinsics.c(this.d, bzaVar.d) && Intrinsics.c(this.e, bzaVar.e) && Intrinsics.c(this.f, bzaVar.f) && Intrinsics.c(this.g, bzaVar.g) && Intrinsics.c(this.h, bzaVar.h) && this.i == bzaVar.i && this.j == bzaVar.j;
    }

    public final int hashCode() {
        int d = ljg.d(dmi.c(dmi.c(dmi.c(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        PowerRankingRound powerRankingRound = this.g;
        return Boolean.hashCode(this.j) + dmi.e(ljg.d((d + (powerRankingRound == null ? 0 : powerRankingRound.hashCode())) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "LeaguePowerRankingsState(tournamentId=", ", seasonId=", ", seasonYear=");
        bf3.v(s, this.c, ", leagueName=", this.d, ", sportSlug=");
        s.append(this.e);
        s.append(", rounds=");
        s.append(this.f);
        s.append(", selectedRound=");
        s.append(this.g);
        s.append(", rankings=");
        s.append(this.h);
        s.append(", isInfoDismissed=");
        return w1l.i(", isDiffEnabled=", ")", s, this.i, this.j);
    }

    public bza(b7 b7Var, PowerRankingRound powerRankingRound, b7 b7Var2, boolean z) {
        this(0, 0, "", "", Sports.FOOTBALL, b7Var, powerRankingRound, b7Var2, z, false);
    }
}
