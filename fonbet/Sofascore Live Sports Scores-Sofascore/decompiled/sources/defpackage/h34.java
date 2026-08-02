package defpackage;

import com.sofascore.model.mvvm.model.Team;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h34 {
    public final int a;
    public final long b;
    public final Team c;
    public final Team d;

    public h34(int i, Team team, Team team2, long j) {
        team.getClass();
        team2.getClass();
        this.a = i;
        this.b = j;
        this.c = team;
        this.d = team2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h34)) {
            return false;
        }
        h34 h34Var = (h34) obj;
        return this.a == h34Var.a && this.b == h34Var.b && Intrinsics.c(this.c, h34Var.c) && Intrinsics.c(this.d, h34Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fc6.b(ljg.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "CrowdsourcingEventData(eventId=" + this.a + ", eventTimestamp=" + this.b + ", homeTeam=" + this.c + ", awayTeam=" + this.d + ")";
    }
}
