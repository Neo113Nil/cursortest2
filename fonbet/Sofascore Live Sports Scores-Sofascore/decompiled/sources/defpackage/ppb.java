package defpackage;

import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ppb implements qpb {
    public final gv9 a;
    public final gv9 b;
    public final gv9 c;
    public final upb d;
    public final FantasyRemoteAnnouncement e;
    public final boolean f;
    public final boolean g;

    public ppb(gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, upb upbVar, FantasyRemoteAnnouncement fantasyRemoteAnnouncement, boolean z, boolean z2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gv9Var3.getClass();
        upbVar.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = gv9Var3;
        this.d = upbVar;
        this.e = fantasyRemoteAnnouncement;
        this.f = z;
        this.g = z2;
    }

    public static ppb a(ppb ppbVar, gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, upb upbVar, FantasyRemoteAnnouncement fantasyRemoteAnnouncement, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            gv9Var = ppbVar.a;
        }
        gv9 gv9Var4 = gv9Var;
        if ((i & 2) != 0) {
            gv9Var2 = ppbVar.b;
        }
        gv9 gv9Var5 = gv9Var2;
        if ((i & 4) != 0) {
            gv9Var3 = ppbVar.c;
        }
        gv9 gv9Var6 = gv9Var3;
        if ((i & 8) != 0) {
            upbVar = ppbVar.d;
        }
        upb upbVar2 = upbVar;
        if ((i & 16) != 0) {
            fantasyRemoteAnnouncement = ppbVar.e;
        }
        FantasyRemoteAnnouncement fantasyRemoteAnnouncement2 = fantasyRemoteAnnouncement;
        if ((i & 32) != 0) {
            z = ppbVar.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = ppbVar.g;
        }
        ppbVar.getClass();
        gv9Var4.getClass();
        gv9Var5.getClass();
        gv9Var6.getClass();
        upbVar2.getClass();
        return new ppb(gv9Var4, gv9Var5, gv9Var6, upbVar2, fantasyRemoteAnnouncement2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppb)) {
            return false;
        }
        ppb ppbVar = (ppb) obj;
        return Intrinsics.c(this.a, ppbVar.a) && Intrinsics.c(this.b, ppbVar.b) && Intrinsics.c(this.c, ppbVar.c) && this.d == ppbVar.d && Intrinsics.c(this.e, ppbVar.e) && this.f == ppbVar.f && this.g == ppbVar.g;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ljg.d(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        FantasyRemoteAnnouncement fantasyRemoteAnnouncement = this.e;
        return Boolean.hashCode(this.g) + dmi.e((hashCode + (fantasyRemoteAnnouncement == null ? 0 : fantasyRemoteAnnouncement.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder l = wv8.l("Ready(userCompetitions=", this.a, ", allCompetitions=", this.b, ", upcomingCompetitions=");
        l.append(this.c);
        l.append(", selectedSubscreen=");
        l.append(this.d);
        l.append(", announcement=");
        l.append(this.e);
        l.append(", showFeedbackBubble=");
        l.append(this.f);
        l.append(", hasFinishedCompetitions=");
        return wt3.p(l, this.g, ")");
    }
}
