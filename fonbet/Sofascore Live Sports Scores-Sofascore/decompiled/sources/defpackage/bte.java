package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.bettingtips.fragment.TeamStreaksFragment;
import com.sofascore.results.main.leagues.StageCategoryEventsFragment;
import com.sofascore.results.main.matches.StageSeriesWeekFragment;
import com.sofascore.results.main.matches.redesign.sportreorder.SportReorderComposeDialogFragment;
import com.sofascore.results.player.media.PlayerMediaFragment;
import com.sofascore.results.player.statistics.regular.PlayerSeasonStatisticsFragment;
import com.sofascore.results.profile.following.ProfileFollowingFragment;
import com.sofascore.results.profile.predictions.ProfilePredictionsStatisticsFragment;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardFragment;
import com.sofascore.results.ranking.RankingFragment;
import com.sofascore.results.referee.details.RefereeDetailsFragment;
import com.sofascore.results.referee.events.RefereeEventsFragment;
import com.sofascore.results.referral.ReferralRedeemRewardBottomSheet;
import com.sofascore.results.sharemodal.shared.ShareStandingsPageFragment;
import com.sofascore.results.stagesport.fragments.category.StageCategoryOddsFragment;
import com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import com.sofascore.results.stagesport.fragments.media.StageMediaFragment;
import com.sofascore.results.stagesport.fragments.odds.StageOddsFragment;
import com.sofascore.results.stagesport.fragments.raceFlow.StageDetailsRaceFlowFragment;
import com.sofascore.results.stagesport.fragments.team.constructor.StageConstructorDetailsFragment;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverDetailsFragment;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.sofascore.results.team.media.TeamMediaFragment;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFilterModal;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFragment;
import com.sofascore.results.team.squad.TeamSquadFragment;
import com.sofascore.results.team.standings.TeamStandingsFragment;
import com.sofascore.results.team.statistics.TeamSeasonStatisticsFragment;
import com.sofascore.results.team.transfers.TeamTransfersModal;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bte extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ joa j;
    public final /* synthetic */ Fragment k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bte(Fragment fragment, joa joaVar, int i) {
        super(0);
        this.i = i;
        this.k = fragment;
        this.j = joaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        h79 h79Var;
        qtk defaultViewModelProviderFactory;
        qtk defaultViewModelProviderFactory2;
        qtk defaultViewModelProviderFactory3;
        qtk defaultViewModelProviderFactory4;
        qtk defaultViewModelProviderFactory5;
        qtk defaultViewModelProviderFactory6;
        qtk defaultViewModelProviderFactory7;
        qtk defaultViewModelProviderFactory8;
        qtk defaultViewModelProviderFactory9;
        qtk defaultViewModelProviderFactory10;
        qtk defaultViewModelProviderFactory11;
        qtk defaultViewModelProviderFactory12;
        qtk defaultViewModelProviderFactory13;
        qtk defaultViewModelProviderFactory14;
        qtk defaultViewModelProviderFactory15;
        qtk defaultViewModelProviderFactory16;
        qtk defaultViewModelProviderFactory17;
        qtk defaultViewModelProviderFactory18;
        qtk defaultViewModelProviderFactory19;
        qtk defaultViewModelProviderFactory20;
        qtk defaultViewModelProviderFactory21;
        qtk defaultViewModelProviderFactory22;
        qtk defaultViewModelProviderFactory23;
        qtk defaultViewModelProviderFactory24;
        qtk defaultViewModelProviderFactory25;
        qtk defaultViewModelProviderFactory26;
        qtk defaultViewModelProviderFactory27;
        qtk defaultViewModelProviderFactory28;
        qtk defaultViewModelProviderFactory29;
        qtk defaultViewModelProviderFactory30;
        int i = this.i;
        Fragment fragment = this.k;
        joa joaVar = this.j;
        switch (i) {
            case 0:
                ttk ttkVar = (ttk) joaVar.getValue();
                h79Var = ttkVar instanceof h79 ? (h79) ttkVar : null;
                return (h79Var == null || (defaultViewModelProviderFactory = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((PlayerMediaFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            case 1:
                ttk ttkVar2 = (ttk) joaVar.getValue();
                h79Var = ttkVar2 instanceof h79 ? (h79) ttkVar2 : null;
                return (h79Var == null || (defaultViewModelProviderFactory2 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((PlayerSeasonStatisticsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory2;
            case 2:
                ttk ttkVar3 = (ttk) joaVar.getValue();
                h79Var = ttkVar3 instanceof h79 ? (h79) ttkVar3 : null;
                return (h79Var == null || (defaultViewModelProviderFactory3 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((ProfileFollowingFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory3;
            case 3:
                ttk ttkVar4 = (ttk) joaVar.getValue();
                h79Var = ttkVar4 instanceof h79 ? (h79) ttkVar4 : null;
                return (h79Var == null || (defaultViewModelProviderFactory4 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((ProfilePredictionsStatisticsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory4;
            case 4:
                ttk ttkVar5 = (ttk) joaVar.getValue();
                h79Var = ttkVar5 instanceof h79 ? (h79) ttkVar5 : null;
                return (h79Var == null || (defaultViewModelProviderFactory5 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((ProfileTopLeaderboardFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory5;
            case 5:
                ttk ttkVar6 = (ttk) joaVar.getValue();
                h79Var = ttkVar6 instanceof h79 ? (h79) ttkVar6 : null;
                return (h79Var == null || (defaultViewModelProviderFactory6 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((RankingFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory6;
            case 6:
                ttk ttkVar7 = (ttk) joaVar.getValue();
                h79Var = ttkVar7 instanceof h79 ? (h79) ttkVar7 : null;
                return (h79Var == null || (defaultViewModelProviderFactory7 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((RefereeDetailsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory7;
            case 7:
                ttk ttkVar8 = (ttk) joaVar.getValue();
                h79Var = ttkVar8 instanceof h79 ? (h79) ttkVar8 : null;
                return (h79Var == null || (defaultViewModelProviderFactory8 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((RefereeEventsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory8;
            case 8:
                ttk ttkVar9 = (ttk) joaVar.getValue();
                h79Var = ttkVar9 instanceof h79 ? (h79) ttkVar9 : null;
                return (h79Var == null || (defaultViewModelProviderFactory9 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((ReferralRedeemRewardBottomSheet) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory9;
            case 9:
                ttk ttkVar10 = (ttk) joaVar.getValue();
                h79Var = ttkVar10 instanceof h79 ? (h79) ttkVar10 : null;
                return (h79Var == null || (defaultViewModelProviderFactory10 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((ShareStandingsPageFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory10;
            case 10:
                ttk ttkVar11 = (ttk) joaVar.getValue();
                h79Var = ttkVar11 instanceof h79 ? (h79) ttkVar11 : null;
                return (h79Var == null || (defaultViewModelProviderFactory11 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((SportReorderComposeDialogFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory11;
            case 11:
                ttk ttkVar12 = (ttk) joaVar.getValue();
                h79Var = ttkVar12 instanceof h79 ? (h79) ttkVar12 : null;
                return (h79Var == null || (defaultViewModelProviderFactory12 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((StageCategoryEventsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory12;
            case 12:
                ttk ttkVar13 = (ttk) joaVar.getValue();
                h79Var = ttkVar13 instanceof h79 ? (h79) ttkVar13 : null;
                return (h79Var == null || (defaultViewModelProviderFactory13 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((StageCategoryOddsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory13;
            case 13:
                ttk ttkVar14 = (ttk) joaVar.getValue();
                h79Var = ttkVar14 instanceof h79 ? (h79) ttkVar14 : null;
                return (h79Var == null || (defaultViewModelProviderFactory14 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((StageConstructorDetailsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory14;
            case 14:
                ttk ttkVar15 = (ttk) joaVar.getValue();
                h79Var = ttkVar15 instanceof h79 ? (h79) ttkVar15 : null;
                return (h79Var == null || (defaultViewModelProviderFactory15 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((StageDetailsRaceFlowFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory15;
            case 15:
                ttk ttkVar16 = (ttk) joaVar.getValue();
                h79Var = ttkVar16 instanceof h79 ? (h79) ttkVar16 : null;
                return (h79Var == null || (defaultViewModelProviderFactory16 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((StageDetailsRankingFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory16;
            case 16:
                ttk ttkVar17 = (ttk) joaVar.getValue();
                h79Var = ttkVar17 instanceof h79 ? (h79) ttkVar17 : null;
                return (h79Var == null || (defaultViewModelProviderFactory17 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((StageDetailsResultsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory17;
            case 17:
                ttk ttkVar18 = (ttk) joaVar.getValue();
                h79Var = ttkVar18 instanceof h79 ? (h79) ttkVar18 : null;
                return (h79Var == null || (defaultViewModelProviderFactory18 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((StageDriverDetailsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory18;
            case 18:
                ttk ttkVar19 = (ttk) joaVar.getValue();
                h79Var = ttkVar19 instanceof h79 ? (h79) ttkVar19 : null;
                return (h79Var == null || (defaultViewModelProviderFactory19 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((StageMediaFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory19;
            case 19:
                ttk ttkVar20 = (ttk) joaVar.getValue();
                h79Var = ttkVar20 instanceof h79 ? (h79) ttkVar20 : null;
                return (h79Var == null || (defaultViewModelProviderFactory20 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((StageOddsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory20;
            case 20:
                ttk ttkVar21 = (ttk) joaVar.getValue();
                h79Var = ttkVar21 instanceof h79 ? (h79) ttkVar21 : null;
                return (h79Var == null || (defaultViewModelProviderFactory21 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((StageSeriesWeekFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory21;
            case 21:
                ttk ttkVar22 = (ttk) joaVar.getValue();
                h79Var = ttkVar22 instanceof h79 ? (h79) ttkVar22 : null;
                return (h79Var == null || (defaultViewModelProviderFactory22 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TeamEventsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory22;
            case 22:
                ttk ttkVar23 = (ttk) joaVar.getValue();
                h79Var = ttkVar23 instanceof h79 ? (h79) ttkVar23 : null;
                return (h79Var == null || (defaultViewModelProviderFactory23 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TeamMediaFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory23;
            case 23:
                ttk ttkVar24 = (ttk) joaVar.getValue();
                h79Var = ttkVar24 instanceof h79 ? (h79) ttkVar24 : null;
                return (h79Var == null || (defaultViewModelProviderFactory24 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TeamPlayerStatsFilterModal) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory24;
            case 24:
                ttk ttkVar25 = (ttk) joaVar.getValue();
                h79Var = ttkVar25 instanceof h79 ? (h79) ttkVar25 : null;
                return (h79Var == null || (defaultViewModelProviderFactory25 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TeamPlayerStatsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory25;
            case 25:
                ttk ttkVar26 = (ttk) joaVar.getValue();
                h79Var = ttkVar26 instanceof h79 ? (h79) ttkVar26 : null;
                return (h79Var == null || (defaultViewModelProviderFactory26 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TeamSeasonStatisticsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory26;
            case 26:
                ttk ttkVar27 = (ttk) joaVar.getValue();
                h79Var = ttkVar27 instanceof h79 ? (h79) ttkVar27 : null;
                return (h79Var == null || (defaultViewModelProviderFactory27 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TeamSquadFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory27;
            case 27:
                ttk ttkVar28 = (ttk) joaVar.getValue();
                h79Var = ttkVar28 instanceof h79 ? (h79) ttkVar28 : null;
                return (h79Var == null || (defaultViewModelProviderFactory28 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TeamStandingsFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory28;
            case 28:
                ttk ttkVar29 = (ttk) joaVar.getValue();
                h79Var = ttkVar29 instanceof h79 ? (h79) ttkVar29 : null;
                return (h79Var == null || (defaultViewModelProviderFactory29 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TeamStreaksFragment) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory29;
            default:
                ttk ttkVar30 = (ttk) joaVar.getValue();
                h79Var = ttkVar30 instanceof h79 ? (h79) ttkVar30 : null;
                return (h79Var == null || (defaultViewModelProviderFactory30 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((TeamTransfersModal) fragment).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory30;
        }
    }
}
