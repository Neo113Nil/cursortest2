package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.team.details.TeamDetailsFragment;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.sofascore.results.team.media.TeamMediaFragment;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFragment;
import com.sofascore.results.team.squad.TeamSquadFragment;
import com.sofascore.results.team.standings.TeamStandingsFragment;
import com.sofascore.results.team.statistics.TeamSeasonStatisticsFragment;
import com.sofascore.results.team.topplayers.TeamTopPlayersFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u4j extends s8 {
    public final int r;
    public final Integer s;
    public final String t;
    public Team u;

    public u4j(AppCompatActivity appCompatActivity, ViewPager2 viewPager2, SofaTabLayout sofaTabLayout, int i, Integer num, String str) {
        super(appCompatActivity, viewPager2, sofaTabLayout);
        this.r = i;
        this.s = num;
        this.t = str;
    }

    @Override // defpackage.d41
    public final Fragment C(Enum r6) {
        t4j t4jVar = (t4j) r6;
        t4jVar.getClass();
        int ordinal = t4jVar.ordinal();
        int i = this.r;
        switch (ordinal) {
            case 0:
                Team J = J();
                TeamDetailsFragment teamDetailsFragment = new TeamDetailsFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("TEAM", J);
                teamDetailsFragment.setArguments(bundle);
                return teamDetailsFragment;
            case 1:
                Team J2 = J();
                TeamEventsFragment teamEventsFragment = new TeamEventsFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("TEAM", J2);
                Integer num = this.s;
                if (num != null) {
                    bundle2.putInt("INITIAL_TOURNAMENT_ID", num.intValue());
                }
                teamEventsFragment.setArguments(bundle2);
                return teamEventsFragment;
            case 2:
                Team J3 = J();
                TeamStandingsFragment teamStandingsFragment = new TeamStandingsFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putSerializable("TEAM", J3);
                bundle3.putInt("STATISTICS_TOURNAMENT_ID", i);
                teamStandingsFragment.setArguments(bundle3);
                return teamStandingsFragment;
            case 3:
                Team J4 = J();
                TeamPlayerStatsFragment teamPlayerStatsFragment = new TeamPlayerStatsFragment();
                Bundle bundle4 = new Bundle();
                bundle4.putInt("teamID", J4.getId());
                bundle4.putString(SearchResponseKt.SPORT_ENTITY, J4.getSportSlug());
                teamPlayerStatsFragment.setArguments(bundle4);
                return teamPlayerStatsFragment;
            case 4:
                Team J5 = J();
                TeamSquadFragment teamSquadFragment = new TeamSquadFragment();
                Bundle bundle5 = new Bundle();
                bundle5.putSerializable("TEAM", J5);
                teamSquadFragment.setArguments(bundle5);
                return teamSquadFragment;
            case 5:
                int id = J().getId();
                String sportSlug = J().getSportSlug();
                if (sportSlug == null) {
                    sportSlug = "";
                }
                TeamTopPlayersFragment teamTopPlayersFragment = new TeamTopPlayersFragment();
                Bundle bundle6 = new Bundle();
                bundle6.putInt("TEAM_ID", id);
                bundle6.putString("SPORT_SLUG", sportSlug);
                bundle6.putString("SCROLL_TO_STATISTIC", this.t);
                bundle6.putInt("PRESELECTED_TOURNAMENT_ID", i);
                teamTopPlayersFragment.setArguments(bundle6);
                return teamTopPlayersFragment;
            case 6:
                Team J6 = J();
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = new TeamSeasonStatisticsFragment();
                teamSeasonStatisticsFragment.setArguments(fz8.C(fz8.G("TEAM", J6), fz8.D(i, "STATISTICS_TOURNAMENT_ID")));
                return teamSeasonStatisticsFragment;
            case 7:
                Team J7 = J();
                TeamMediaFragment teamMediaFragment = new TeamMediaFragment();
                Bundle bundle7 = new Bundle();
                bundle7.putSerializable("team", J7);
                teamMediaFragment.setArguments(bundle7);
                return teamMediaFragment;
            default:
                zzl.b();
                return null;
        }
    }

    @Override // defpackage.s8
    public final String H(Enum r5) {
        String Q;
        t4j t4jVar = (t4j) r5;
        t4jVar.getClass();
        int ordinal = t4jVar.ordinal();
        if (ordinal == 1) {
            Context y = y();
            mqi mqiVar = bii.a;
            String string = y.getString(bii.b(J().getSportSlug(), false));
            string.getClass();
            return string;
        }
        if (ordinal != 4) {
            if (ordinal == 5) {
                Q = hkg.Q(y(), R.string.top_players, J().getGender(), new Object[0]);
                return Q;
            }
            String string2 = y().getString(t4jVar.a);
            string2.getClass();
            return string2;
        }
        mqi mqiVar2 = bii.a;
        Context y2 = y();
        String sportSlug = J().getSportSlug();
        Gender gender = J().getGender();
        y2.getClass();
        if (sportSlug != null) {
            int hashCode = sportSlug.hashCode();
            if (hashCode != -2002238939) {
                if (hashCode != -83759494) {
                    String string3 = y2.getString(R.string.am_football_roster);
                    string3.getClass();
                    return string3;
                }
                String string32 = y2.getString(R.string.am_football_roster);
                string32.getClass();
                return string32;
            }
            if (sportSlug.equals(Sports.ICE_HOCKEY)) {
                String string4 = y2.getString(R.string.hockey_roster);
                string4.getClass();
                return string4;
            }
        }
        return hkg.Q(y2, R.string.squad, gender, new Object[0]);
    }

    public final Team J() {
        Team team = this.u;
        if (team != null) {
            return team;
        }
        Intrinsics.i("team");
        throw null;
    }
}
