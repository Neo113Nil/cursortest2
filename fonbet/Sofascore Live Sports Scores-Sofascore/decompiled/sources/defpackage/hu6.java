package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hu6 {
    public final uj7 a;
    public final do7 b;
    public final ho7 c;
    public final gv9 d;
    public final gv9 e;
    public final gv9 f;
    public final gv9 g;
    public final gv9 h;
    public final Double i;
    public final boolean j;
    public final boolean k;
    public final Boolean l;
    public final boolean m;
    public final boolean n;
    public final vl7 o;
    public final vl7 p;
    public final vl7 q;
    public final boolean r;
    public final boolean s;
    public final u77 t;
    public final gv9 u;
    public final rx6 v;
    public final FantasyRemoteAnnouncement w;
    public final gu6 x;

    public hu6(uj7 uj7Var, do7 do7Var, ho7 ho7Var, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, gv9 gv9Var5, Double d, boolean z, boolean z2, Boolean bool, boolean z3, boolean z4, vl7 vl7Var, vl7 vl7Var2, vl7 vl7Var3, boolean z5, boolean z6, u77 u77Var, gv9 gv9Var6, rx6 rx6Var, FantasyRemoteAnnouncement fantasyRemoteAnnouncement, gu6 gu6Var) {
        uj7Var.getClass();
        u77Var.getClass();
        this.a = uj7Var;
        this.b = do7Var;
        this.c = ho7Var;
        this.d = gv9Var;
        this.e = gv9Var2;
        this.f = gv9Var3;
        this.g = gv9Var4;
        this.h = gv9Var5;
        this.i = d;
        this.j = z;
        this.k = z2;
        this.l = bool;
        this.m = z3;
        this.n = z4;
        this.o = vl7Var;
        this.p = vl7Var2;
        this.q = vl7Var3;
        this.r = z5;
        this.s = z6;
        this.t = u77Var;
        this.u = gv9Var6;
        this.v = rx6Var;
        this.w = fantasyRemoteAnnouncement;
        this.x = gu6Var;
    }

    public static hu6 a(hu6 hu6Var, uj7 uj7Var, do7 do7Var, ho7 ho7Var, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, gv9 gv9Var5, Double d, boolean z, boolean z2, Boolean bool, boolean z3, boolean z4, vl7 vl7Var, vl7 vl7Var2, vl7 vl7Var3, boolean z5, boolean z6, u77 u77Var, gv9 gv9Var6, rx6 rx6Var, FantasyRemoteAnnouncement fantasyRemoteAnnouncement, gu6 gu6Var, int i) {
        uj7 uj7Var2 = (i & 1) != 0 ? hu6Var.a : uj7Var;
        do7 do7Var2 = (i & 2) != 0 ? hu6Var.b : do7Var;
        ho7 ho7Var2 = (i & 4) != 0 ? hu6Var.c : ho7Var;
        gv9 gv9Var7 = (i & 8) != 0 ? hu6Var.d : gv9Var;
        gv9 gv9Var8 = (i & 16) != 0 ? hu6Var.e : gv9Var2;
        gv9 gv9Var9 = (i & 32) != 0 ? hu6Var.f : gv9Var3;
        gv9 gv9Var10 = (i & 64) != 0 ? hu6Var.g : gv9Var4;
        gv9 gv9Var11 = (i & 128) != 0 ? hu6Var.h : gv9Var5;
        Double d2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? hu6Var.i : d;
        boolean z7 = (i & 512) != 0 ? hu6Var.j : z;
        boolean z8 = (i & 1024) != 0 ? hu6Var.k : z2;
        Boolean bool2 = (i & a.o) != 0 ? hu6Var.l : bool;
        boolean z9 = (i & 4096) != 0 ? hu6Var.m : z3;
        boolean z10 = (i & 8192) != 0 ? hu6Var.n : z4;
        uj7 uj7Var3 = uj7Var2;
        vl7 vl7Var4 = (i & 16384) != 0 ? hu6Var.o : vl7Var;
        vl7 vl7Var5 = (i & 32768) != 0 ? hu6Var.p : vl7Var2;
        vl7 vl7Var6 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? hu6Var.q : vl7Var3;
        boolean z11 = (i & 131072) != 0 ? hu6Var.r : z5;
        boolean z12 = (i & 262144) != 0 ? hu6Var.s : z6;
        u77 u77Var2 = (i & 524288) != 0 ? hu6Var.t : u77Var;
        gv9 gv9Var12 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? hu6Var.u : gv9Var6;
        rx6 rx6Var2 = (i & 2097152) != 0 ? hu6Var.v : rx6Var;
        FantasyRemoteAnnouncement fantasyRemoteAnnouncement2 = (i & 4194304) != 0 ? hu6Var.w : fantasyRemoteAnnouncement;
        gu6 gu6Var2 = (i & 8388608) != 0 ? hu6Var.x : gu6Var;
        hu6Var.getClass();
        uj7Var3.getClass();
        u77Var2.getClass();
        return new hu6(uj7Var3, do7Var2, ho7Var2, gv9Var7, gv9Var8, gv9Var9, gv9Var10, gv9Var11, d2, z7, z8, bool2, z9, z10, vl7Var4, vl7Var5, vl7Var6, z11, z12, u77Var2, gv9Var12, rx6Var2, fantasyRemoteAnnouncement2, gu6Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu6)) {
            return false;
        }
        hu6 hu6Var = (hu6) obj;
        return this.a == hu6Var.a && Intrinsics.c(this.b, hu6Var.b) && Intrinsics.c(this.c, hu6Var.c) && Intrinsics.c(this.d, hu6Var.d) && Intrinsics.c(this.e, hu6Var.e) && Intrinsics.c(this.f, hu6Var.f) && Intrinsics.c(this.g, hu6Var.g) && Intrinsics.c(this.h, hu6Var.h) && Intrinsics.c(this.i, hu6Var.i) && this.j == hu6Var.j && this.k == hu6Var.k && Intrinsics.c(this.l, hu6Var.l) && this.m == hu6Var.m && this.n == hu6Var.n && Intrinsics.c(this.o, hu6Var.o) && Intrinsics.c(this.p, hu6Var.p) && Intrinsics.c(this.q, hu6Var.q) && this.r == hu6Var.r && this.s == hu6Var.s && this.t == hu6Var.t && Intrinsics.c(this.u, hu6Var.u) && Intrinsics.c(this.v, hu6Var.v) && Intrinsics.c(this.w, hu6Var.w) && this.x.equals(hu6Var.x);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        do7 do7Var = this.b;
        int hashCode2 = (hashCode + (do7Var == null ? 0 : do7Var.hashCode())) * 31;
        ho7 ho7Var = this.c;
        int hashCode3 = (hashCode2 + (ho7Var == null ? 0 : ho7Var.hashCode())) * 31;
        gv9 gv9Var = this.d;
        int hashCode4 = (hashCode3 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        gv9 gv9Var2 = this.e;
        int hashCode5 = (hashCode4 + (gv9Var2 == null ? 0 : gv9Var2.hashCode())) * 31;
        gv9 gv9Var3 = this.f;
        int hashCode6 = (hashCode5 + (gv9Var3 == null ? 0 : gv9Var3.hashCode())) * 31;
        gv9 gv9Var4 = this.g;
        int hashCode7 = (hashCode6 + (gv9Var4 == null ? 0 : gv9Var4.hashCode())) * 31;
        gv9 gv9Var5 = this.h;
        int hashCode8 = (hashCode7 + (gv9Var5 == null ? 0 : gv9Var5.hashCode())) * 31;
        Double d = this.i;
        int e = dmi.e(dmi.e((hashCode8 + (d == null ? 0 : d.hashCode())) * 31, 31, this.j), 31, this.k);
        Boolean bool = this.l;
        int e2 = dmi.e(dmi.e((e + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.m), 31, this.n);
        vl7 vl7Var = this.o;
        int hashCode9 = (e2 + (vl7Var == null ? 0 : vl7Var.hashCode())) * 31;
        vl7 vl7Var2 = this.p;
        int hashCode10 = (hashCode9 + (vl7Var2 == null ? 0 : vl7Var2.hashCode())) * 31;
        vl7 vl7Var3 = this.q;
        int hashCode11 = (this.t.hashCode() + dmi.e(dmi.e((hashCode10 + (vl7Var3 == null ? 0 : vl7Var3.hashCode())) * 31, 31, this.r), 31, this.s)) * 31;
        gv9 gv9Var6 = this.u;
        int hashCode12 = (hashCode11 + (gv9Var6 == null ? 0 : gv9Var6.hashCode())) * 31;
        rx6 rx6Var = this.v;
        int hashCode13 = (hashCode12 + (rx6Var == null ? 0 : rx6Var.hashCode())) * 31;
        FantasyRemoteAnnouncement fantasyRemoteAnnouncement = this.w;
        return this.x.hashCode() + ((hashCode13 + (fantasyRemoteAnnouncement != null ? fantasyRemoteAnnouncement.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyCompetitionMyTeamScreenState(status=");
        sb.append(this.a);
        sb.append(", userCompetition=");
        sb.append(this.b);
        sb.append(", selectedUserRound=");
        sb.append(this.c);
        sb.append(", userRounds=");
        sb.append(this.d);
        sb.append(", rounds=");
        vxd.u(sb, this.e, ", squad=", this.f, ", mockSquad=");
        vxd.u(sb, this.g, ", transfers=", this.h, ", remainingBudget=");
        sb.append(this.i);
        sb.append(", transfersEnabled=");
        sb.append(this.j);
        sb.append(", substitutionsEnabled=");
        sb.append(this.k);
        sb.append(", showDeadlineCounterBubble=");
        sb.append(this.l);
        sb.append(", showSubstitutionsInfoBubble=");
        vxd.t(", showInfoDisplayModeButton=", ", tripleCaptain=", sb, this.m, this.n);
        sb.append(this.o);
        sb.append(", freeHit=");
        sb.append(this.p);
        sb.append(", wildCard=");
        sb.append(this.q);
        sb.append(", loadingSquad=");
        sb.append(this.r);
        sb.append(", manualRefresh=");
        sb.append(this.s);
        sb.append(", bottomBarMode=");
        sb.append(this.t);
        sb.append(", fixtures=");
        sb.append(this.u);
        sb.append(", expectedPointsData=");
        sb.append(this.v);
        sb.append(", announcement=");
        sb.append(this.w);
        sb.append(", tokenDialogState=");
        sb.append(this.x);
        sb.append(")");
        return sb.toString();
    }
}
