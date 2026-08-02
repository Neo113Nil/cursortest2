package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.results.R;
import com.sofascore.results.player.details.PlayerDetailsFragment;
import com.sofascore.results.player.fantasy.PlayerFantasyFragment;
import com.sofascore.results.player.matches.PlayerEventsFragment;
import com.sofascore.results.player.media.PlayerMediaFragment;
import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import com.sofascore.results.player.statistics.regular.PlayerSeasonStatisticsFragment;
import com.sofascore.results.player.statistics.season.baseball.BaseballPlayerSeasonStatisticsFragment;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aye extends s8 {
    public Player r;
    public StatisticsSeasonsResponse s;
    public Integer t;
    public Integer u;
    public boolean v;
    public Integer w;

    @Override // defpackage.d41
    public final Fragment C(Enum r7) {
        zxe zxeVar = (zxe) r7;
        zxeVar.getClass();
        int ordinal = zxeVar.ordinal();
        if (ordinal == 0) {
            Player J = J();
            boolean z = this.v;
            PlayerDetailsFragment playerDetailsFragment = new PlayerDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("PLAYER", J);
            bundle.putSerializable("SCROLL_TO_TRANSFERS", Boolean.valueOf(z));
            playerDetailsFragment.setArguments(bundle);
            return playerDetailsFragment;
        }
        if (ordinal == 1) {
            if (Intrinsics.c(J().getSportSlug(), Sports.BASEBALL)) {
                int id = J().getId();
                BaseballPlayerSeasonStatisticsFragment baseballPlayerSeasonStatisticsFragment = new BaseballPlayerSeasonStatisticsFragment();
                baseballPlayerSeasonStatisticsFragment.setArguments(fz8.C(fz8.D(id, "PLAYER_ID")));
                return baseballPlayerSeasonStatisticsFragment;
            }
            Player J2 = J();
            StatisticsSeasonsResponse statisticsSeasonsResponse = this.s;
            Integer num = this.t;
            Integer num2 = this.u;
            PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment = new PlayerSeasonStatisticsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("PLAYER", J2);
            bundle2.putSerializable("PLAYER_STATISTICS_SEASONS", statisticsSeasonsResponse);
            bundle2.putSerializable("TOURNAMENT_UNIQUE_ID", num);
            bundle2.putSerializable("SEASON_ID", num2);
            playerSeasonStatisticsFragment.setArguments(bundle2);
            return playerSeasonStatisticsFragment;
        }
        if (ordinal == 2) {
            Player J3 = J();
            Integer num3 = this.t;
            PlayerEventsFragment playerEventsFragment = new PlayerEventsFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putSerializable("PLAYER", J3);
            bundle3.putSerializable("TOURNAMENT_UNIQUE_ID", num3);
            playerEventsFragment.setArguments(bundle3);
            return playerEventsFragment;
        }
        if (ordinal == 3) {
            Integer num4 = this.t;
            PlayerCareerStatisticsFragment playerCareerStatisticsFragment = new PlayerCareerStatisticsFragment();
            Bundle bundle4 = new Bundle();
            bundle4.putSerializable("TOURNAMENT_UNIQUE_ID", num4);
            playerCareerStatisticsFragment.setArguments(bundle4);
            return playerCareerStatisticsFragment;
        }
        if (ordinal == 4) {
            Player J4 = J();
            PlayerMediaFragment playerMediaFragment = new PlayerMediaFragment();
            Bundle bundle5 = new Bundle();
            bundle5.putSerializable("PLAYER", J4);
            playerMediaFragment.setArguments(bundle5);
            return playerMediaFragment;
        }
        if (ordinal != 5) {
            zzl.b();
            return null;
        }
        Player J5 = J();
        Integer num5 = this.w;
        PlayerFantasyFragment playerFantasyFragment = new PlayerFantasyFragment();
        Bundle bundle6 = new Bundle();
        bundle6.putSerializable("PLAYER", J5);
        bundle6.putSerializable("POSITION_ON_FANTASY", num5);
        playerFantasyFragment.setArguments(bundle6);
        return playerFantasyFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r4 = com.sofascore.results.R.string.tab_info;
     */
    @Override // defpackage.s8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String H(Enum r4) {
        int i;
        zxe zxeVar = (zxe) r4;
        zxeVar.getClass();
        int ordinal = zxeVar.ordinal();
        if (ordinal == 0) {
            mqi mqiVar = bii.a;
            String sportSlug = J().getSportSlug();
            if (sportSlug != null) {
                int hashCode = sportSlug.hashCode();
                if (hashCode != -1721090992) {
                    if (hashCode != -83759494) {
                    }
                } else if (sportSlug.equals(Sports.BASEBALL)) {
                    i = R.string.overview;
                }
            }
            i = R.string.details;
        } else if (ordinal == 1) {
            mqi mqiVar2 = bii.a;
            String sportSlug2 = J().getSportSlug();
            i = (CollectionsKt.R(wyh.m, sportSlug2) || Intrinsics.c(sportSlug2, Sports.RUGBY)) ? R.string.am_football_season_tab : R.string.statistics;
        } else if (ordinal != 2) {
            i = zxeVar.a;
        } else {
            mqi mqiVar3 = bii.a;
            i = bii.b(J().getSportSlug(), true);
        }
        String string = y().getString(i);
        string.getClass();
        return string;
    }

    public final Player J() {
        Player player = this.r;
        if (player != null) {
            return player;
        }
        Intrinsics.i(SearchResponseKt.PLAYER_ENTITY);
        throw null;
    }
}
