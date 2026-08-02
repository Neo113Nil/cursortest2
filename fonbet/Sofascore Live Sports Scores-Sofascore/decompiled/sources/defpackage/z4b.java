package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.awards.LeagueAwardsFragment;
import com.sofascore.results.league.fragment.cuptree.LeagueCupTreeFragment;
import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import com.sofascore.results.league.fragment.draft.LeagueDraftFragment;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.league.fragment.rankings.LeaguePowerRankingsFragment;
import com.sofascore.results.league.fragment.standings.LeagueStandingsFragment;
import com.sofascore.results.league.fragment.topStats.TopStatsFragment;
import com.sofascore.results.league.fragment.transactions.LeagueTransactionsFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z4b extends s8 {
    public String A;
    public boolean r;
    public boolean s;
    public Integer t;
    public String u;
    public String v;
    public String w;
    public boj x;
    public Integer y;
    public String z;

    @Override // defpackage.d41
    public final Fragment C(Enum r7) {
        y4b y4bVar = (y4b) r7;
        y4bVar.getClass();
        switch (y4bVar.ordinal()) {
            case 0:
                boolean z = this.r;
                boolean z2 = this.s;
                String str = this.A;
                LeagueDetailsFragment leagueDetailsFragment = new LeagueDetailsFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("POSITION_ON_MEDIA", Boolean.valueOf(z));
                bundle.putBoolean("POSITION_ON_TEAM_OF_THE_WEEK", z2);
                if (str != null) {
                    bundle.putString("CAMPAIGN", str);
                }
                leagueDetailsFragment.setArguments(bundle);
                this.r = false;
                this.s = false;
                this.A = null;
                return leagueDetailsFragment;
            case 1:
                return new LeagueEventsFragment();
            case 2:
                String str2 = this.z;
                this.z = null;
                LeagueStandingsFragment leagueStandingsFragment = new LeagueStandingsFragment();
                leagueStandingsFragment.setArguments(fz8.C(fz8.H("POSITION_ON_GROUP", str2)));
                return leagueStandingsFragment;
            case 3:
                Integer num = this.y;
                this.y = null;
                LeagueCupTreeFragment leagueCupTreeFragment = new LeagueCupTreeFragment();
                leagueCupTreeFragment.setArguments(fz8.C(fz8.G("INITIAL_FILTER", num)));
                return leagueCupTreeFragment;
            case 4:
                boj bojVar = this.x;
                this.x = null;
                TopStatsFragment topStatsFragment = new TopStatsFragment();
                topStatsFragment.setArguments(fz8.C(fz8.G("INITIAL_TOP_STATS_TYPE", bojVar)));
                return topStatsFragment;
            case 5:
                return new LeaguePowerRankingsFragment();
            case 6:
                return new LeagueTransactionsFragment();
            case 7:
                return new LeagueDraftFragment();
            case 8:
                return new LeagueAwardsFragment();
            default:
                zzl.b();
                return null;
        }
    }

    @Override // defpackage.s8
    public final String H(Enum r4) {
        y4b y4bVar = (y4b) r4;
        y4bVar.getClass();
        String string = y().getString(y4bVar.a);
        string.getClass();
        int ordinal = y4bVar.ordinal();
        if (ordinal == 0) {
            Context y = y();
            mqi mqiVar = bii.a;
            String str = this.u;
            String string2 = y.getString((Intrinsics.c(str, Sports.BASKETBALL) || Intrinsics.c(str, Sports.FOOTBALL)) ? R.string.overview : R.string.details);
            string2.getClass();
            return string2;
        }
        if (ordinal == 1) {
            Context y2 = y();
            mqi mqiVar2 = bii.a;
            String string3 = y2.getString(bii.b(this.u, false));
            string3.getClass();
            return string3;
        }
        if (ordinal != 3) {
            return string;
        }
        Context y3 = y();
        mqi mqiVar3 = bii.a;
        String string4 = y3.getString(bii.a(this.u, this.t, this.w, this.v));
        string4.getClass();
        return string4;
    }
}
