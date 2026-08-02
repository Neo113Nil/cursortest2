package defpackage;

import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cuj {
    public final String a;
    public final String b;
    public final int c;
    public final gv9 d;
    public final Integer e;
    public final b7g f;
    public final boolean g;
    public final boolean h;
    public final gv9 i;
    public final gv9 j;
    public final gv9 k;
    public final boolean l;
    public final String m;
    public final String n;
    public final gv9 o;
    public final utj p;

    public cuj(String str, String str2, int i, gv9 gv9Var, Integer num, b7g b7gVar, boolean z, boolean z2, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, boolean z3, String str3, String str4, gv9 gv9Var5, utj utjVar) {
        str.getClass();
        str2.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        str3.getClass();
        str4.getClass();
        gv9Var5.getClass();
        utjVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = gv9Var;
        this.e = num;
        this.f = b7gVar;
        this.g = z;
        this.h = z2;
        this.i = gv9Var2;
        this.j = gv9Var3;
        this.k = gv9Var4;
        this.l = z3;
        this.m = str3;
        this.n = str4;
        this.o = gv9Var5;
        this.p = utjVar;
    }

    public static cuj a(cuj cujVar, Integer num, b7g b7gVar, boolean z, boolean z2, gv9 gv9Var, gv9 gv9Var2, boolean z3, int i) {
        String str = cujVar.a;
        String str2 = cujVar.b;
        int i2 = cujVar.c;
        gv9 gv9Var3 = cujVar.d;
        Integer num2 = (i & 16) != 0 ? cujVar.e : num;
        b7g b7gVar2 = (i & 32) != 0 ? cujVar.f : b7gVar;
        boolean z4 = (i & 64) != 0 ? cujVar.g : z;
        boolean z5 = (i & 128) != 0 ? cujVar.h : z2;
        gv9 gv9Var4 = cujVar.i;
        gv9 gv9Var5 = (i & 512) != 0 ? cujVar.j : gv9Var;
        gv9 gv9Var6 = (i & 1024) != 0 ? cujVar.k : gv9Var2;
        boolean z6 = (i & a.o) != 0 ? cujVar.l : z3;
        String str3 = cujVar.m;
        String str4 = cujVar.n;
        gv9 gv9Var7 = cujVar.o;
        utj utjVar = cujVar.p;
        str.getClass();
        str2.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        gv9Var5.getClass();
        gv9Var6.getClass();
        str3.getClass();
        str4.getClass();
        gv9Var7.getClass();
        utjVar.getClass();
        return new cuj(str, str2, i2, gv9Var3, num2, b7gVar2, z4, z5, gv9Var4, gv9Var5, gv9Var6, z6, str3, str4, gv9Var7, utjVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuj)) {
            return false;
        }
        cuj cujVar = (cuj) obj;
        return Intrinsics.c(this.a, cujVar.a) && Intrinsics.c(this.b, cujVar.b) && this.c == cujVar.c && Intrinsics.c(this.d, cujVar.d) && Intrinsics.c(this.e, cujVar.e) && Intrinsics.c(this.f, cujVar.f) && this.g == cujVar.g && this.h == cujVar.h && Intrinsics.c(this.i, cujVar.i) && Intrinsics.c(this.j, cujVar.j) && Intrinsics.c(this.k, cujVar.k) && this.l == cujVar.l && Intrinsics.c(this.m, cujVar.m) && Intrinsics.c(this.n, cujVar.n) && Intrinsics.c(this.o, cujVar.o) && Intrinsics.c(this.p, cujVar.p);
    }

    public final int hashCode() {
        int d = ljg.d(wv8.a(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        Integer num = this.e;
        int hashCode = (d + (num == null ? 0 : num.hashCode())) * 31;
        b7g b7gVar = this.f;
        return this.p.hashCode() + ljg.d(dmi.c(dmi.c(dmi.e(ljg.d(ljg.d(ljg.d(dmi.e(dmi.e((hashCode + (b7gVar != null ? b7gVar.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder s = mz1.s("TrackerState(leagueName=", this.a, ", seasonName=", this.b, ", uniqueTournamentId=");
        s.append(this.c);
        s.append(", rounds=");
        s.append(this.d);
        s.append(", selectedRoundNumber=");
        s.append(this.e);
        s.append(", selectedRoundDisplay=");
        s.append(this.f);
        s.append(", hasPreviousRound=");
        vxd.t(", hasNextRound=", ", availableTeams=", s, this.g, this.h);
        vxd.u(s, this.i, ", selectedTeamIds=", this.j, ", selectedTeams=");
        s.append(this.k);
        s.append(", hasEliminatedTeam=");
        s.append(this.l);
        s.append(", aboutDescription=");
        bf3.v(s, this.m, ", xAxisLabel=", this.n, ", roundLabels=");
        s.append(this.o);
        s.append(", config=");
        s.append(this.p);
        s.append(")");
        return s.toString();
    }
}
