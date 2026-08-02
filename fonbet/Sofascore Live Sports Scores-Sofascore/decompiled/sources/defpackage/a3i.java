package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a3i {
    public final xkf a;
    public final gv9 b;
    public final gv9 c;
    public final tee d;
    public final RaceFlowModels$RaceTeam e;
    public final gv9 f;
    public final gv9 g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final Integer l;
    public final gv9 m;
    public final gv9 n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a3i(xkf xkfVar, gv9 gv9Var, gv9 gv9Var2, tee teeVar, gv9 gv9Var3, gv9 gv9Var4, boolean z, int i, int i2, int i3) {
        this(xkfVar, r4, r5, r6, null, (i3 & 32) != 0 ? rlh.b : gv9Var3, (i3 & 64) != 0 ? rlh.b : gv9Var4, (i3 & 128) != 0 ? false : z, (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0 : i, (i3 & 512) != 0 ? 0 : i2, 0, null, null, null);
        tee teeVar2;
        gv9 gv9Var5 = (i3 & 2) != 0 ? rlh.b : gv9Var;
        gv9 gv9Var6 = (i3 & 4) != 0 ? rlh.b : gv9Var2;
        if ((i3 & 8) != 0) {
            uee ueeVar = uee.g;
            ueeVar.getClass();
            teeVar2 = ueeVar;
        } else {
            teeVar2 = teeVar;
        }
    }

    public static a3i a(a3i a3iVar, gv9 gv9Var, gv9 gv9Var2, tee teeVar, RaceFlowModels$RaceTeam raceFlowModels$RaceTeam, gv9 gv9Var3, gv9 gv9Var4, boolean z, int i, int i2, int i3, Integer num, gv9 gv9Var5, gv9 gv9Var6, int i4) {
        xkf xkfVar = a3iVar.a;
        gv9 gv9Var7 = (i4 & 2) != 0 ? a3iVar.b : gv9Var;
        gv9 gv9Var8 = (i4 & 4) != 0 ? a3iVar.c : gv9Var2;
        tee teeVar2 = (i4 & 8) != 0 ? a3iVar.d : teeVar;
        RaceFlowModels$RaceTeam raceFlowModels$RaceTeam2 = (i4 & 16) != 0 ? a3iVar.e : raceFlowModels$RaceTeam;
        gv9 gv9Var9 = (i4 & 32) != 0 ? a3iVar.f : gv9Var3;
        gv9 gv9Var10 = (i4 & 64) != 0 ? a3iVar.g : gv9Var4;
        boolean z2 = (i4 & 128) != 0 ? a3iVar.h : z;
        int i5 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? a3iVar.i : i;
        int i6 = (i4 & 512) != 0 ? a3iVar.j : i2;
        int i7 = (i4 & 1024) != 0 ? a3iVar.k : i3;
        Integer num2 = (i4 & a.o) != 0 ? a3iVar.l : num;
        gv9 gv9Var11 = (i4 & 4096) != 0 ? a3iVar.m : gv9Var5;
        gv9 gv9Var12 = (i4 & 8192) != 0 ? a3iVar.n : gv9Var6;
        a3iVar.getClass();
        xkfVar.getClass();
        gv9Var7.getClass();
        gv9Var8.getClass();
        teeVar2.getClass();
        gv9Var9.getClass();
        gv9Var10.getClass();
        return new a3i(xkfVar, gv9Var7, gv9Var8, teeVar2, raceFlowModels$RaceTeam2, gv9Var9, gv9Var10, z2, i5, i6, i7, num2, gv9Var11, gv9Var12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3i)) {
            return false;
        }
        a3i a3iVar = (a3i) obj;
        return this.a == a3iVar.a && Intrinsics.c(this.b, a3iVar.b) && Intrinsics.c(this.c, a3iVar.c) && Intrinsics.c(this.d, a3iVar.d) && Intrinsics.c(this.e, a3iVar.e) && Intrinsics.c(this.f, a3iVar.f) && Intrinsics.c(this.g, a3iVar.g) && this.h == a3iVar.h && this.i == a3iVar.i && this.j == a3iVar.j && this.k == a3iVar.k && Intrinsics.c(this.l, a3iVar.l) && Intrinsics.c(this.m, a3iVar.m) && Intrinsics.c(this.n, a3iVar.n);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ljg.d(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = this.e;
        int a = wv8.a(this.k, wv8.a(this.j, wv8.a(this.i, dmi.e(ljg.d(ljg.d((hashCode + (raceFlowModels$RaceTeam == null ? 0 : raceFlowModels$RaceTeam.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31), 31), 31);
        Integer num = this.l;
        int hashCode2 = (a + (num == null ? 0 : num.hashCode())) * 31;
        gv9 gv9Var = this.m;
        int hashCode3 = (hashCode2 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        gv9 gv9Var2 = this.n;
        return hashCode3 + (gv9Var2 != null ? gv9Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StageDetailsRaceFlowState(stageType=");
        sb.append(this.a);
        sb.append(", teams=");
        sb.append(this.b);
        sb.append(", entrants=");
        sb.append(this.c);
        sb.append(", entrantLaps=");
        sb.append(this.d);
        sb.append(", selectedTeam=");
        sb.append(this.e);
        sb.append(", selectedEntrants=");
        sb.append(this.f);
        sb.append(", displayedEntrants=");
        sb.append(this.g);
        sb.append(", isLive=");
        sb.append(this.h);
        sb.append(", totalLaps=");
        me4.q(sb, this.i, ", currentLap=", this.j, ", reanimate=");
        sb.append(this.k);
        sb.append(", seekLap=");
        sb.append(this.l);
        sb.append(", seekBarEntrantPositions=");
        sb.append(this.m);
        sb.append(", seekBarEntrantPitStops=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }

    public a3i(xkf xkfVar, gv9 gv9Var, gv9 gv9Var2, tee teeVar, RaceFlowModels$RaceTeam raceFlowModels$RaceTeam, gv9 gv9Var3, gv9 gv9Var4, boolean z, int i, int i2, int i3, Integer num, gv9 gv9Var5, gv9 gv9Var6) {
        xkfVar.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        teeVar.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        this.a = xkfVar;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = teeVar;
        this.e = raceFlowModels$RaceTeam;
        this.f = gv9Var3;
        this.g = gv9Var4;
        this.h = z;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = num;
        this.m = gv9Var5;
        this.n = gv9Var6;
    }
}
