package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xva {
    public final gv9 a;
    public final tee b;
    public final int c;
    public final gv9 d;
    public final gv9 e;
    public final gv9 f;
    public final gv9 g;
    public final gv9 h;
    public final gv9 i;
    public final gv9 j;
    public final String k;
    public final gv9 l;
    public final yva m;
    public final int n;
    public final boolean o;
    public final boolean p;

    public xva(gv9 gv9Var, tee teeVar, int i, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, gv9 gv9Var5, gv9 gv9Var6, gv9 gv9Var7, gv9 gv9Var8, String str, gv9 gv9Var9, yva yvaVar, int i2, boolean z, boolean z2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        gv9Var5.getClass();
        gv9Var6.getClass();
        gv9Var7.getClass();
        gv9Var8.getClass();
        gv9Var9.getClass();
        this.a = gv9Var;
        this.b = teeVar;
        this.c = i;
        this.d = gv9Var2;
        this.e = gv9Var3;
        this.f = gv9Var4;
        this.g = gv9Var5;
        this.h = gv9Var6;
        this.i = gv9Var7;
        this.j = gv9Var8;
        this.k = str;
        this.l = gv9Var9;
        this.m = yvaVar;
        this.n = i2;
        this.o = z;
        this.p = z2;
    }

    public static xva a(xva xvaVar, gv9 gv9Var, tee teeVar, int i, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, gv9 gv9Var5, gv9 gv9Var6, gv9 gv9Var7, String str, yva yvaVar, int i2, boolean z, int i3) {
        gv9 gv9Var8 = (i3 & 1) != 0 ? xvaVar.a : gv9Var;
        tee teeVar2 = (i3 & 2) != 0 ? xvaVar.b : teeVar;
        int i4 = (i3 & 4) != 0 ? xvaVar.c : i;
        gv9 gv9Var9 = (i3 & 8) != 0 ? xvaVar.d : gv9Var2;
        gv9 gv9Var10 = (i3 & 16) != 0 ? xvaVar.e : gv9Var3;
        gv9 gv9Var11 = (i3 & 32) != 0 ? xvaVar.f : gv9Var4;
        gv9 gv9Var12 = (i3 & 64) != 0 ? xvaVar.g : gv9Var5;
        gv9 gv9Var13 = (i3 & 128) != 0 ? xvaVar.h : gv9Var6;
        gv9 gv9Var14 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? xvaVar.i : gv9Var7;
        gv9 gv9Var15 = xvaVar.j;
        String str2 = (i3 & 1024) != 0 ? xvaVar.k : str;
        gv9 gv9Var16 = xvaVar.l;
        yva yvaVar2 = (i3 & 4096) != 0 ? xvaVar.m : yvaVar;
        int i5 = (i3 & 8192) != 0 ? xvaVar.n : i2;
        boolean z2 = (i3 & 16384) != 0 ? xvaVar.o : z;
        boolean z3 = xvaVar.p;
        xvaVar.getClass();
        gv9Var8.getClass();
        gv9Var9.getClass();
        gv9Var10.getClass();
        gv9Var11.getClass();
        gv9Var12.getClass();
        gv9Var13.getClass();
        gv9Var14.getClass();
        gv9Var15.getClass();
        gv9Var16.getClass();
        return new xva(gv9Var8, teeVar2, i4, gv9Var9, gv9Var10, gv9Var11, gv9Var12, gv9Var13, gv9Var14, gv9Var15, str2, gv9Var16, yvaVar2, i5, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xva)) {
            return false;
        }
        xva xvaVar = (xva) obj;
        return Intrinsics.c(this.a, xvaVar.a) && this.b.equals(xvaVar.b) && this.c == xvaVar.c && Intrinsics.c(this.d, xvaVar.d) && Intrinsics.c(this.e, xvaVar.e) && Intrinsics.c(this.f, xvaVar.f) && Intrinsics.c(this.g, xvaVar.g) && Intrinsics.c(this.h, xvaVar.h) && Intrinsics.c(this.i, xvaVar.i) && Intrinsics.c(this.j, xvaVar.j) && this.k.equals(xvaVar.k) && Intrinsics.c(this.l, xvaVar.l) && this.m == xvaVar.m && this.n == xvaVar.n && this.o == xvaVar.o && this.p == xvaVar.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + dmi.e(wv8.a(this.n, (this.m.hashCode() + ljg.d(dmi.c(ljg.d(ljg.d(ljg.d(ljg.d(ljg.d(ljg.d(ljg.d(wv8.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeagueDraftState(lotteryData=");
        sb.append(this.a);
        sb.append(", draftOrderData=");
        sb.append(this.b);
        sb.append(", selectedDraftRound=");
        sb.append(this.c);
        sb.append(", draftOrderRoundTypes=");
        sb.append(this.d);
        sb.append(", picksData=");
        vxd.u(sb, this.e, ", previousYearPicksData=", this.f, ", filteredProspectsData=");
        vxd.u(sb, this.g, ", teamsWithNoPick=", this.h, ", previousYearTeamsWithNoPick=");
        vxd.u(sb, this.i, ", pickRoundTypes=", this.j, ", prospectsQuery=");
        sb.append(this.k);
        sb.append(", draftTypes=");
        sb.append(this.l);
        sb.append(", selectedDraftType=");
        sb.append(this.m);
        sb.append(", selectedPickRound=");
        sb.append(this.n);
        sb.append(", selectedRoundChanged=");
        return w1l.i(", isLotteryCompleted=", ")", sb, this.o, this.p);
    }
}
