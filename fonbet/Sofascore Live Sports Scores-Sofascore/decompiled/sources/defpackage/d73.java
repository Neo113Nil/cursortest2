package defpackage;

import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.statistics.season.team.TeamSeasonStatistics;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d73 {
    public final Integer a;
    public final String b;
    public final wyg c;
    public final ryg d;
    public final dzg e;
    public final Team f;
    public final TeamSeasonStatistics g;

    public d73(Integer num, String str, wyg wygVar, ryg rygVar, dzg dzgVar, Team team, TeamSeasonStatistics teamSeasonStatistics, int i) {
        str = (i & 2) != 0 ? null : str;
        wygVar = (i & 4) != 0 ? null : wygVar;
        rygVar = (i & 8) != 0 ? null : rygVar;
        dzgVar = (i & 16) != 0 ? null : dzgVar;
        team = (i & 32) != 0 ? null : team;
        teamSeasonStatistics = (i & 64) != 0 ? null : teamSeasonStatistics;
        this.a = num;
        this.b = str;
        this.c = wygVar;
        this.d = rygVar;
        this.e = dzgVar;
        this.f = team;
        this.g = teamSeasonStatistics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d73)) {
            return false;
        }
        d73 d73Var = (d73) obj;
        return Intrinsics.c(this.a, d73Var.a) && Intrinsics.c(this.b, d73Var.b) && Intrinsics.c(this.c, d73Var.c) && Intrinsics.c(this.d, d73Var.d) && Intrinsics.c(this.e, d73Var.e) && Intrinsics.c(this.f, d73Var.f) && Intrinsics.c(this.g, d73Var.g);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        wyg wygVar = this.c;
        int hashCode3 = (hashCode2 + (wygVar == null ? 0 : wygVar.hashCode())) * 31;
        ryg rygVar = this.d;
        int hashCode4 = (hashCode3 + (rygVar == null ? 0 : rygVar.hashCode())) * 31;
        dzg dzgVar = this.e;
        int hashCode5 = (hashCode4 + (dzgVar == null ? 0 : dzgVar.hashCode())) * 31;
        Team team = this.f;
        int hashCode6 = (hashCode5 + (team == null ? 0 : team.hashCode())) * 31;
        TeamSeasonStatistics teamSeasonStatistics = this.g;
        return hashCode6 + (teamSeasonStatistics != null ? teamSeasonStatistics.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = wv8.m("ComparisonEntityStatistics(uniqueTournamentId=", this.a, ", subSeasonType=", this.b, ", playerStatistics=");
        m.append(this.c);
        m.append(", heatmap=");
        m.append(this.d);
        m.append(", shotmap=");
        m.append(this.e);
        m.append(", playerTeam=");
        m.append(this.f);
        m.append(", teamStatistics=");
        m.append(this.g);
        m.append(")");
        return m.toString();
    }
}
