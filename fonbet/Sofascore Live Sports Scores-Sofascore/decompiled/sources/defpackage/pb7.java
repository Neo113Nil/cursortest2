package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pb7 {
    public final uj7 a;
    public final FantasyOnboardingStepsNavigation b;
    public final int c;
    public final int d;
    public final Integer e;
    public final ev6 f;
    public final mj7 g;
    public final gv9 h;
    public final oz6 i;
    public final gv9 j;
    public final int k;
    public final double l;
    public final double m;
    public final boolean n;
    public final gv9 o;
    public final boolean p;
    public final r9 q;
    public final boolean r;
    public final boolean s;
    public final r9 t;
    public final boolean u;
    public final do7 v;
    public final FantasyRemoteAnnouncement w;

    public pb7(uj7 uj7Var, FantasyOnboardingStepsNavigation fantasyOnboardingStepsNavigation, int i, int i2, Integer num, ev6 ev6Var, mj7 mj7Var, gv9 gv9Var, oz6 oz6Var, gv9 gv9Var2, int i3, double d, double d2, boolean z, gv9 gv9Var3, boolean z2, r9 r9Var, boolean z3, boolean z4, r9 r9Var2, boolean z5, do7 do7Var, FantasyRemoteAnnouncement fantasyRemoteAnnouncement) {
        uj7Var.getClass();
        fantasyOnboardingStepsNavigation.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        this.a = uj7Var;
        this.b = fantasyOnboardingStepsNavigation;
        this.c = i;
        this.d = i2;
        this.e = num;
        this.f = ev6Var;
        this.g = mj7Var;
        this.h = gv9Var;
        this.i = oz6Var;
        this.j = gv9Var2;
        this.k = i3;
        this.l = d;
        this.m = d2;
        this.n = z;
        this.o = gv9Var3;
        this.p = z2;
        this.q = r9Var;
        this.r = z3;
        this.s = z4;
        this.t = r9Var2;
        this.u = z5;
        this.v = do7Var;
        this.w = fantasyRemoteAnnouncement;
    }

    public static pb7 a(pb7 pb7Var, uj7 uj7Var, FantasyOnboardingStepsNavigation.CreateTeam createTeam, int i, int i2, Integer num, ev6 ev6Var, mj7 mj7Var, gv9 gv9Var, oz6 oz6Var, gv9 gv9Var2, int i3, double d, double d2, boolean z, gv9 gv9Var3, boolean z2, r9 r9Var, boolean z3, r9 r9Var2, boolean z4, do7 do7Var, FantasyRemoteAnnouncement fantasyRemoteAnnouncement, int i4) {
        uj7 uj7Var2 = (i4 & 1) != 0 ? pb7Var.a : uj7Var;
        FantasyOnboardingStepsNavigation fantasyOnboardingStepsNavigation = (i4 & 2) != 0 ? pb7Var.b : createTeam;
        int i5 = (i4 & 4) != 0 ? pb7Var.c : i;
        int i6 = (i4 & 8) != 0 ? pb7Var.d : i2;
        Integer num2 = (i4 & 16) != 0 ? pb7Var.e : num;
        ev6 ev6Var2 = (i4 & 32) != 0 ? pb7Var.f : ev6Var;
        mj7 mj7Var2 = (i4 & 64) != 0 ? pb7Var.g : mj7Var;
        gv9 gv9Var4 = (i4 & 128) != 0 ? pb7Var.h : gv9Var;
        oz6 oz6Var2 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? pb7Var.i : oz6Var;
        gv9 gv9Var5 = (i4 & 512) != 0 ? pb7Var.j : gv9Var2;
        int i7 = (i4 & 1024) != 0 ? pb7Var.k : i3;
        double d3 = (i4 & a.o) != 0 ? pb7Var.l : d;
        uj7 uj7Var3 = uj7Var2;
        FantasyOnboardingStepsNavigation fantasyOnboardingStepsNavigation2 = fantasyOnboardingStepsNavigation;
        double d4 = (i4 & 4096) != 0 ? pb7Var.m : d2;
        boolean z5 = (i4 & 8192) != 0 ? pb7Var.n : z;
        double d5 = d4;
        gv9 gv9Var6 = (i4 & 16384) != 0 ? pb7Var.o : gv9Var3;
        boolean z6 = (32768 & i4) != 0 ? pb7Var.p : z2;
        r9 r9Var3 = (i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? pb7Var.q : r9Var;
        boolean z7 = (i4 & 131072) != 0 ? pb7Var.r : z3;
        boolean z8 = (i4 & 262144) != 0 ? pb7Var.s : true;
        r9 r9Var4 = (i4 & 524288) != 0 ? pb7Var.t : r9Var2;
        boolean z9 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? pb7Var.u : z4;
        do7 do7Var2 = (i4 & 2097152) != 0 ? pb7Var.v : do7Var;
        FantasyRemoteAnnouncement fantasyRemoteAnnouncement2 = (i4 & 4194304) != 0 ? pb7Var.w : fantasyRemoteAnnouncement;
        pb7Var.getClass();
        uj7Var3.getClass();
        fantasyOnboardingStepsNavigation2.getClass();
        gv9Var5.getClass();
        gv9Var6.getClass();
        return new pb7(uj7Var3, fantasyOnboardingStepsNavigation2, i5, i6, num2, ev6Var2, mj7Var2, gv9Var4, oz6Var2, gv9Var5, i7, d3, d5, z5, gv9Var6, z6, r9Var3, z7, z8, r9Var4, z9, do7Var2, fantasyRemoteAnnouncement2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb7)) {
            return false;
        }
        pb7 pb7Var = (pb7) obj;
        return this.a == pb7Var.a && Intrinsics.c(this.b, pb7Var.b) && this.c == pb7Var.c && this.d == pb7Var.d && Intrinsics.c(this.e, pb7Var.e) && Intrinsics.c(this.f, pb7Var.f) && Intrinsics.c(this.g, pb7Var.g) && Intrinsics.c(this.h, pb7Var.h) && Intrinsics.c(this.i, pb7Var.i) && Intrinsics.c(this.j, pb7Var.j) && this.k == pb7Var.k && Double.compare(this.l, pb7Var.l) == 0 && Double.compare(this.m, pb7Var.m) == 0 && this.n == pb7Var.n && Intrinsics.c(this.o, pb7Var.o) && this.p == pb7Var.p && Intrinsics.c(this.q, pb7Var.q) && this.r == pb7Var.r && this.s == pb7Var.s && Intrinsics.c(this.t, pb7Var.t) && this.u == pb7Var.u && Intrinsics.c(this.v, pb7Var.v) && Intrinsics.c(this.w, pb7Var.w);
    }

    public final int hashCode() {
        int a = wv8.a(this.d, wv8.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        ev6 ev6Var = this.f;
        int hashCode2 = (hashCode + (ev6Var == null ? 0 : ev6Var.hashCode())) * 31;
        mj7 mj7Var = this.g;
        int hashCode3 = (hashCode2 + (mj7Var == null ? 0 : mj7Var.hashCode())) * 31;
        gv9 gv9Var = this.h;
        int hashCode4 = (hashCode3 + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        oz6 oz6Var = this.i;
        int e = dmi.e(ljg.d(dmi.e(dmi.b(dmi.b(wv8.a(this.k, ljg.d((hashCode4 + (oz6Var == null ? 0 : oz6Var.hashCode())) * 31, 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        r9 r9Var = this.q;
        int e2 = dmi.e(dmi.e((e + (r9Var == null ? 0 : r9Var.hashCode())) * 31, 31, this.r), 31, this.s);
        r9 r9Var2 = this.t;
        int e3 = dmi.e((e2 + (r9Var2 == null ? 0 : r9Var2.hashCode())) * 31, 31, this.u);
        do7 do7Var = this.v;
        int hashCode5 = (e3 + (do7Var == null ? 0 : do7Var.hashCode())) * 31;
        FantasyRemoteAnnouncement fantasyRemoteAnnouncement = this.w;
        return hashCode5 + (fantasyRemoteAnnouncement != null ? fantasyRemoteAnnouncement.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyOnboardingState(status=");
        sb.append(this.a);
        sb.append(", onboardingStartStep=");
        sb.append(this.b);
        sb.append(", onboardingStepsCount=");
        me4.q(sb, this.c, ", onboardingStepIndex=", this.d, ", competitionId=");
        sb.append(this.e);
        sb.append(", competition=");
        sb.append(this.f);
        sb.append(", round=");
        sb.append(this.g);
        sb.append(", eliteFaceoffEventsByLeague=");
        sb.append(this.h);
        sb.append(", currentPlayerOut=");
        sb.append(this.i);
        sb.append(", squad=");
        sb.append(this.j);
        sb.append(", playerCount=");
        sb.append(this.k);
        sb.append(", bank=");
        sb.append(this.l);
        fn0.A(sb, ", totalExpectedFantasyPoints=", this.m, ", squadValid=");
        sb.append(this.n);
        sb.append(", squadErrors=");
        sb.append(this.o);
        sb.append(", autoSelectInProgress=");
        sb.append(this.p);
        sb.append(", autoSelectError=");
        sb.append(this.q);
        sb.append(", teamCreateInProgress=");
        vxd.t(", teamCreateSuccess=", ", teamCreateErrorReason=", sb, this.r, this.s);
        sb.append(this.t);
        sb.append(", showDiscardDialog=");
        sb.append(this.u);
        sb.append(", createdUserCompetition=");
        sb.append(this.v);
        sb.append(", announcement=");
        sb.append(this.w);
        sb.append(")");
        return sb.toString();
    }
}
