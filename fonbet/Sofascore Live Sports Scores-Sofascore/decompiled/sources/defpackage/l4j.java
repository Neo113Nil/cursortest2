package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamAchievementsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentAchievements;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Ll4j;", "Lynb;", "Li4j;", "Lw3j;", "", "j4j", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class l4j extends ynb {
    public final j0j l;
    public j4j m;
    public j4j n;
    public final String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4j(fqg fqgVar, j0j j0jVar, Application application) {
        super(application, tnb.a);
        fqgVar.getClass();
        j0jVar.getClass();
        this.l = j0jVar;
        String str = (String) fqgVar.a(SearchResponseKt.SPORT_ENTITY);
        this.o = str == null ? Sports.FOOTBALL : str;
        Object a = fqgVar.a("teamId");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        x(((Number) a).intValue(), true, true);
        Integer num = (Integer) fqgVar.a("teamId2");
        if (num != null) {
            x(num.intValue(), false, true);
        }
    }

    public static e4j t(j4j j4jVar) {
        f4j f4jVar = j4jVar.a;
        int i = j4jVar.b;
        Regex regex = yid.a;
        int i2 = 0;
        for (h4j h4jVar : j4jVar.c) {
            i2 += h4jVar.b ? h4jVar.f : 0;
        }
        return new e4j(f4jVar, i, i2);
    }

    public static ArrayList u(j4j j4jVar, boolean z) {
        List list = j4jVar.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            h4j h4jVar = (h4j) obj;
            if (!z || h4jVar.b) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j4j v(TeamAchievementsResponse teamAchievementsResponse) {
        String p;
        h4j h4jVar;
        Team team = teamAchievementsResponse.getTeam();
        km5 km5Var = null;
        int m = yid.m(team != null ? Integer.valueOf(team.getId()) : null);
        Context i = i();
        Team team2 = teamAchievementsResponse.getTeam();
        if (team2 == null) {
            p = "";
        } else {
            p = tba.p(i, team2);
            if (qea.y(team2) && team2.getSport() != null) {
                Set set = wyh.a;
                if (!wyh.e(team2.getSportSlug())) {
                    p = wv8.i(p, " ", i.getString(R.string.female_team));
                }
            }
        }
        Team team3 = teamAchievementsResponse.getTeam();
        f4j f4jVar = new f4j(m, p, Intrinsics.c(team3 != null ? Boolean.valueOf(team3.getNational()) : null, Boolean.TRUE));
        int m2 = yid.m(teamAchievementsResponse.getTotalTrophies());
        List<UniqueTournamentAchievements> achievements = teamAchievementsResponse.getAchievements();
        if (achievements != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : achievements) {
                UniqueTournament uniqueTournament = ((UniqueTournamentAchievements) obj).getUniqueTournament();
                Intrinsics.c(uniqueTournament != null ? uniqueTournament.getMajorTrophy() : null, Boolean.TRUE);
                arrayList.add(obj);
            }
            List<UniqueTournamentAchievements> H0 = CollectionsKt.H0(arrayList, new o5i(new q6i(7), 3));
            ArrayList arrayList2 = new ArrayList();
            for (UniqueTournamentAchievements uniqueTournamentAchievements : H0) {
                UniqueTournament uniqueTournament2 = uniqueTournamentAchievements.getUniqueTournament();
                if (uniqueTournament2 != null) {
                    inb inbVar = wk2.f;
                    String competitionType = uniqueTournament2.getCompetitionType();
                    if (competitionType == null) {
                        competitionType = "";
                    }
                    inbVar.getClass();
                    wk2 r = inb.r(competitionType);
                    if (r == null) {
                        r = wk2.i;
                    }
                    Boolean majorTrophy = uniqueTournament2.getMajorTrophy();
                    Boolean bool = Boolean.TRUE;
                    boolean c = Intrinsics.c(majorTrophy, bool);
                    int id = uniqueTournament2.getId();
                    String x = tba.x(uniqueTournament2);
                    if (x == null) {
                        x = "";
                    }
                    h4jVar = new h4j(r, c, id, x, Intrinsics.c(uniqueTournament2.getHasAchievements(), bool), yid.m(uniqueTournamentAchievements.getTrophiesWon()));
                } else {
                    h4jVar = null;
                }
                if (h4jVar != null) {
                    arrayList2.add(h4jVar);
                }
            }
            km5Var = arrayList2;
        }
        if (km5Var == null) {
            km5Var = km5.a;
        }
        return new j4j(f4jVar, m2, km5Var);
    }

    public final void w(w3j w3jVar) {
        if (w3jVar instanceof u3j) {
            u3j u3jVar = (u3j) w3jVar;
            x(u3jVar.b, u3jVar.a, false);
        } else if (w3jVar instanceof r3j) {
            n(new i4j(null, null, null, true, null), new c30(this.m, this.n, ((r3j) w3jVar).a, this, 6));
        }
    }

    public final void x(int i, boolean z, boolean z2) {
        xw3.L(un0.z(this), null, null, new k4j(this, i, z, z2, null), 3);
    }
}
