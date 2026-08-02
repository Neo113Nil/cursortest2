package defpackage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.util.ChatInterfaceBasic;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.chat.FantasyCompetitionChatFragment;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.fantasy.competition.home.FantasyCompetitionHomeFragment;
import com.sofascore.results.fantasy.competition.leaderboard.FantasyCompetitionLeaderboardFragment;
import com.sofascore.results.fantasy.competition.leagues.FantasyCompetitionLeaguesFragment;
import com.sofascore.results.fantasy.competition.statistics.FantasyCompetitionStatisticsFragment;
import com.sofascore.results.fantasy.competition.team.FantasyCompetitionMyTeamFragment;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import com.sofascore.results.stagesport.fragments.media.StageMediaFragment;
import com.sofascore.results.stagesport.fragments.odds.StageOddsFragment;
import com.sofascore.results.stagesport.fragments.raceFlow.StageDetailsRaceFlowFragment;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jp6 extends s8 {
    public final /* synthetic */ int r = 0;
    public final Serializable s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp6(AbstractActivity abstractActivity, ViewPager2 viewPager2, SofaTabLayout sofaTabLayout, Stage stage) {
        super(abstractActivity, viewPager2, sofaTabLayout);
        abstractActivity.getClass();
        stage.getClass();
        this.s = stage;
    }

    @Override // defpackage.d41
    public final Fragment C(Enum r11) {
        Boolean bool;
        int id;
        int i = this.r;
        Serializable serializable = this.s;
        Integer num = null;
        switch (i) {
            case 0:
                ip6 ip6Var = (ip6) r11;
                do7 do7Var = (do7) serializable;
                ip6Var.getClass();
                switch (ip6Var.ordinal()) {
                    case 0:
                        do7Var.getClass();
                        FantasyCompetitionHomeFragment fantasyCompetitionHomeFragment = new FantasyCompetitionHomeFragment();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("USER_COMPETITION_EXTRA", do7Var);
                        fantasyCompetitionHomeFragment.setArguments(bundle);
                        return fantasyCompetitionHomeFragment;
                    case 1:
                        do7Var.getClass();
                        FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = new FantasyCompetitionMyTeamFragment();
                        fantasyCompetitionMyTeamFragment.setArguments(fz8.C(fz8.G("USER_COMPETITION_EXTRA", do7Var)));
                        return fantasyCompetitionMyTeamFragment;
                    case 2:
                        do7Var.getClass();
                        FantasyCompetitionLeaderboardFragment fantasyCompetitionLeaderboardFragment = new FantasyCompetitionLeaderboardFragment();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("USER_COMPETITION_EXTRA", do7Var);
                        fantasyCompetitionLeaderboardFragment.setArguments(bundle2);
                        return fantasyCompetitionLeaderboardFragment;
                    case 3:
                        ev6 ev6Var = do7Var.c;
                        FantasyCompetitionChatFragment fantasyCompetitionChatFragment = new FantasyCompetitionChatFragment();
                        Integer num2 = ev6Var.B;
                        fantasyCompetitionChatFragment.setArguments(fz8.C(fz8.G("CHAT_INTERFACE_OBJECT", new ChatInterfaceBasic(num2 != null ? num2.intValue() : -1, "fantasy.league", 0L, null, 12, null)), fz8.G("FANTASY_COMPETITION_EXTRA", ev6Var)));
                        return fantasyCompetitionChatFragment;
                    case 4:
                        do7Var.getClass();
                        FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = new FantasyCompetitionFixturesFragment();
                        Bundle bundle3 = new Bundle();
                        bundle3.putSerializable("USER_COMPETITION_EXTRA", do7Var);
                        fantasyCompetitionFixturesFragment.setArguments(bundle3);
                        return fantasyCompetitionFixturesFragment;
                    case 5:
                        do7Var.getClass();
                        FantasyCompetitionLeaguesFragment fantasyCompetitionLeaguesFragment = new FantasyCompetitionLeaguesFragment();
                        fantasyCompetitionLeaguesFragment.setArguments(fz8.C(fz8.G("USER_COMPETITION_EXTRA", do7Var)));
                        return fantasyCompetitionLeaguesFragment;
                    case 6:
                        do7Var.getClass();
                        FantasyCompetitionStatisticsFragment fantasyCompetitionStatisticsFragment = new FantasyCompetitionStatisticsFragment();
                        Bundle bundle4 = new Bundle();
                        bundle4.putSerializable("USER_COMPETITION_EXTRA", do7Var);
                        fantasyCompetitionStatisticsFragment.setArguments(bundle4);
                        return fantasyCompetitionStatisticsFragment;
                    default:
                        zzl.b();
                        return null;
                }
            default:
                o4i o4iVar = (o4i) r11;
                Stage stage = (Stage) serializable;
                o4iVar.getClass();
                int ordinal = o4iVar.ordinal();
                if (ordinal == 0) {
                    stage.getClass();
                    StageDetailsResultsFragment stageDetailsResultsFragment = new StageDetailsResultsFragment();
                    stageDetailsResultsFragment.setArguments(fz8.C(fz8.G("EVENT", stage)));
                    return stageDetailsResultsFragment;
                }
                if (ordinal == 1) {
                    stage.getClass();
                    StageDetailsRaceFlowFragment stageDetailsRaceFlowFragment = new StageDetailsRaceFlowFragment();
                    stageDetailsRaceFlowFragment.setArguments(fz8.C(fz8.G("EVENT", stage)));
                    return stageDetailsRaceFlowFragment;
                }
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return new StageOddsFragment();
                        }
                        zzl.b();
                        return null;
                    }
                    stage.getClass();
                    StageMediaFragment stageMediaFragment = new StageMediaFragment();
                    stageMediaFragment.setArguments(fz8.C(fz8.G("EVENT", stage)));
                    return stageMediaFragment;
                }
                stage.getClass();
                StageDetailsRankingFragment stageDetailsRankingFragment = new StageDetailsRankingFragment();
                UniqueStage uniqueStage = stage.getUniqueStage();
                if (uniqueStage != null) {
                    joa joaVar = l5i.a;
                    bool = Boolean.valueOf(l5i.g(uniqueStage));
                } else {
                    bool = null;
                }
                if (!Intrinsics.c(bool, Boolean.TRUE)) {
                    StageSeason stageSeason = stage.getStageSeason();
                    if (stageSeason != null) {
                        id = stageSeason.getId();
                    }
                    stageDetailsRankingFragment.setArguments(fz8.C(fz8.G("stageId", num), fz8.G(SearchResponseKt.UNIQUE_STAGE_ENTITY, stage.getUniqueStage())));
                    return stageDetailsRankingFragment;
                }
                id = stage.getId();
                num = Integer.valueOf(id);
                stageDetailsRankingFragment.setArguments(fz8.C(fz8.G("stageId", num), fz8.G(SearchResponseKt.UNIQUE_STAGE_ENTITY, stage.getUniqueStage())));
                return stageDetailsRankingFragment;
        }
    }

    @Override // defpackage.s8
    public final String H(Enum r4) {
        int i = this.r;
        Serializable serializable = this.s;
        switch (i) {
            case 0:
                ip6 ip6Var = (ip6) r4;
                ip6Var.getClass();
                String string = y().getString(((Number) ip6Var.a.invoke(((do7) serializable).c)).intValue());
                string.getClass();
                return string;
            default:
                o4i o4iVar = (o4i) r4;
                o4iVar.getClass();
                int[] iArr = p4i.a;
                int ordinal = o4iVar.ordinal();
                int i2 = o4iVar.a;
                if (iArr[ordinal] == 3) {
                    UniqueStage uniqueStage = ((Stage) serializable).getUniqueStage();
                    if (Intrinsics.c(uniqueStage != null ? uniqueStage.getName() : null, "WRC")) {
                        i2 = R.string.motorsport_wrc_rally_tracker_tab;
                    }
                }
                String string2 = y().getString(i2);
                string2.getClass();
                return string2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp6(AppCompatActivity appCompatActivity, ViewPager2 viewPager2, SofaTabLayout sofaTabLayout, do7 do7Var) {
        super(appCompatActivity, viewPager2, sofaTabLayout);
        do7Var.getClass();
        this.s = do7Var;
    }
}
