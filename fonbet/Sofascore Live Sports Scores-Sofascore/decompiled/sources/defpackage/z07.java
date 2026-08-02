package defpackage;

import com.sofascore.results.bettingtips.fragment.HighValueStreaksFragment;
import com.sofascore.results.dialog.FollowSubStagesDialog;
import com.sofascore.results.fantasy.competition.home.bottomsheet.playeroftheround.FantasyPlayersOfTheRoundBottomSheet;
import com.sofascore.results.fantasy.competition.home.bottomsheet.pricetracker.FantasyPriceTrackerBottomSheet;
import com.sofascore.results.fantasy.competition.home.bottomsheet.topplayers.FantasyTopPlayersBottomSheet;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyJoinLeagueBottomSheet;
import com.sofascore.results.fantasy.competition.team.bottomsheet.FantasyOptimiseSquadBottomSheet;
import com.sofascore.results.fantasy.highlights.gameweek.rankings.FantasyGameweekHighlightsRankingsFragment;
import com.sofascore.results.fantasy.highlights.gameweek.totgw.FantasyGameweekHighlightsTOTGWFragment;
import com.sofascore.results.fantasy.league.details.FantasyLeagueDetailsFragment;
import com.sofascore.results.fantasy.league.leaderboard.FantasyLeagueLeaderboardFragment;
import com.sofascore.results.fantasy.league.matchups.FantasyLeagueMatchupsFragment;
import com.sofascore.results.fantasy.league.settings.bottomsheet.invite.FantasyInviteToLeagueBottomSheet;
import com.sofascore.results.fantasy.league.settings.dialog.FantasyLeagueTeamsFullScreenDialog;
import com.sofascore.results.fantasy.teammanagement.transfers.selectreplacement.FantasyTransfersSelectReplacementDialogFragment;
import com.sofascore.results.fantasy.transfers.FantasyTransferHistoryBottomSheet;
import com.sofascore.results.fantasy.walkthrough.createteam.selectreplacement.FantasyWalkthroughSelectReplacementDialogFragment;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.feed.FeedFragment;
import com.sofascore.results.league.fragment.awards.LeagueAwardsFragment;
import com.sofascore.results.league.fragment.draft.LeagueDraftFragment;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.league.historical.topperformance.HistoricalDataTopPerformanceModal;
import com.sofascore.results.main.favorites.FavoriteEntitiesFragment;
import com.sofascore.results.main.favorites.FavoriteEventsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z07 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z07(int i, Object obj, Object obj2) {
        super(0);
        this.i = i;
        this.k = obj;
        this.j = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h79] */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [wtc] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [wtc] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [i1d] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [i1d] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
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
        int i = this.i;
        Object obj = this.k;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                ttk ttkVar = (ttk) ((joa) obj2).getValue();
                r1 = ttkVar instanceof h79 ? (h79) ttkVar : 0;
                return (r1 == 0 || (defaultViewModelProviderFactory = r1.getDefaultViewModelProviderFactory()) == null) ? ((FantasyGameweekHighlightsRankingsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            case 1:
                ttk ttkVar2 = (ttk) ((joa) obj2).getValue();
                h79 h79Var = ttkVar2 instanceof h79 ? (h79) ttkVar2 : null;
                return (h79Var == null || (defaultViewModelProviderFactory2 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((FantasyGameweekHighlightsTOTGWFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory2;
            case 2:
                ttk ttkVar3 = (ttk) ((joa) obj2).getValue();
                h79 h79Var2 = ttkVar3 instanceof h79 ? (h79) ttkVar3 : null;
                return (h79Var2 == null || (defaultViewModelProviderFactory3 = h79Var2.getDefaultViewModelProviderFactory()) == null) ? ((FantasyInviteToLeagueBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory3;
            case 3:
                ttk ttkVar4 = (ttk) ((joa) obj2).getValue();
                h79 h79Var3 = ttkVar4 instanceof h79 ? (h79) ttkVar4 : null;
                return (h79Var3 == null || (defaultViewModelProviderFactory4 = h79Var3.getDefaultViewModelProviderFactory()) == null) ? ((FantasyJoinLeagueBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory4;
            case 4:
                ttk ttkVar5 = (ttk) ((joa) obj2).getValue();
                h79 h79Var4 = ttkVar5 instanceof h79 ? (h79) ttkVar5 : null;
                return (h79Var4 == null || (defaultViewModelProviderFactory5 = h79Var4.getDefaultViewModelProviderFactory()) == null) ? ((FantasyLeagueDetailsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory5;
            case 5:
                ttk ttkVar6 = (ttk) ((joa) obj2).getValue();
                h79 h79Var5 = ttkVar6 instanceof h79 ? (h79) ttkVar6 : null;
                return (h79Var5 == null || (defaultViewModelProviderFactory6 = h79Var5.getDefaultViewModelProviderFactory()) == null) ? ((FantasyLeagueLeaderboardFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory6;
            case 6:
                ttk ttkVar7 = (ttk) ((joa) obj2).getValue();
                h79 h79Var6 = ttkVar7 instanceof h79 ? (h79) ttkVar7 : null;
                return (h79Var6 == null || (defaultViewModelProviderFactory7 = h79Var6.getDefaultViewModelProviderFactory()) == null) ? ((FantasyLeagueMatchupsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory7;
            case 7:
                ttk ttkVar8 = (ttk) ((joa) obj2).getValue();
                h79 h79Var7 = ttkVar8 instanceof h79 ? (h79) ttkVar8 : null;
                return (h79Var7 == null || (defaultViewModelProviderFactory8 = h79Var7.getDefaultViewModelProviderFactory()) == null) ? ((FantasyLeagueTeamsFullScreenDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory8;
            case 8:
                ttk ttkVar9 = (ttk) ((joa) obj2).getValue();
                h79 h79Var8 = ttkVar9 instanceof h79 ? (h79) ttkVar9 : null;
                return (h79Var8 == null || (defaultViewModelProviderFactory9 = h79Var8.getDefaultViewModelProviderFactory()) == null) ? ((FantasyOptimiseSquadBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory9;
            case 9:
                ttk ttkVar10 = (ttk) ((joa) obj2).getValue();
                h79 h79Var9 = ttkVar10 instanceof h79 ? (h79) ttkVar10 : null;
                return (h79Var9 == null || (defaultViewModelProviderFactory10 = h79Var9.getDefaultViewModelProviderFactory()) == null) ? ((FantasyPlayersOfTheRoundBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory10;
            case 10:
                ttk ttkVar11 = (ttk) ((joa) obj2).getValue();
                h79 h79Var10 = ttkVar11 instanceof h79 ? (h79) ttkVar11 : null;
                return (h79Var10 == null || (defaultViewModelProviderFactory11 = h79Var10.getDefaultViewModelProviderFactory()) == null) ? ((FantasyPriceTrackerBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory11;
            case 11:
                ttk ttkVar12 = (ttk) ((joa) obj2).getValue();
                h79 h79Var11 = ttkVar12 instanceof h79 ? (h79) ttkVar12 : null;
                return (h79Var11 == null || (defaultViewModelProviderFactory12 = h79Var11.getDefaultViewModelProviderFactory()) == null) ? ((FantasyTopPlayersBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory12;
            case 12:
                ttk ttkVar13 = (ttk) ((joa) obj2).getValue();
                h79 h79Var12 = ttkVar13 instanceof h79 ? (h79) ttkVar13 : null;
                return (h79Var12 == null || (defaultViewModelProviderFactory13 = h79Var12.getDefaultViewModelProviderFactory()) == null) ? ((FantasyTransferHistoryBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory13;
            case 13:
                ttk ttkVar14 = (ttk) ((joa) obj2).getValue();
                h79 h79Var13 = ttkVar14 instanceof h79 ? (h79) ttkVar14 : null;
                return (h79Var13 == null || (defaultViewModelProviderFactory14 = h79Var13.getDefaultViewModelProviderFactory()) == null) ? ((FantasyTransfersSelectReplacementDialogFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory14;
            case 14:
                ttk ttkVar15 = (ttk) ((joa) obj2).getValue();
                h79 h79Var14 = ttkVar15 instanceof h79 ? (h79) ttkVar15 : null;
                return (h79Var14 == null || (defaultViewModelProviderFactory15 = h79Var14.getDefaultViewModelProviderFactory()) == null) ? ((FantasyWalkthroughSelectReplacementDialogFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory15;
            case 15:
                ttk ttkVar16 = (ttk) ((joa) obj2).getValue();
                h79 h79Var15 = ttkVar16 instanceof h79 ? (h79) ttkVar16 : null;
                return (h79Var15 == null || (defaultViewModelProviderFactory16 = h79Var15.getDefaultViewModelProviderFactory()) == null) ? ((FavoriteEntitiesFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory16;
            case 16:
                ttk ttkVar17 = (ttk) ((joa) obj2).getValue();
                h79 h79Var16 = ttkVar17 instanceof h79 ? (h79) ttkVar17 : null;
                return (h79Var16 == null || (defaultViewModelProviderFactory17 = h79Var16.getDefaultViewModelProviderFactory()) == null) ? ((FavoriteEventsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory17;
            case 17:
                ttk ttkVar18 = (ttk) ((joa) obj2).getValue();
                h79 h79Var17 = ttkVar18 instanceof h79 ? (h79) ttkVar18 : null;
                return (h79Var17 == null || (defaultViewModelProviderFactory18 = h79Var17.getDefaultViewModelProviderFactory()) == null) ? ((FeaturedTournamentFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory18;
            case 18:
                ttk ttkVar19 = (ttk) ((joa) obj2).getValue();
                h79 h79Var18 = ttkVar19 instanceof h79 ? (h79) ttkVar19 : null;
                return (h79Var18 == null || (defaultViewModelProviderFactory19 = h79Var18.getDefaultViewModelProviderFactory()) == null) ? ((FeedFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory19;
            case 19:
                ((fsf) obj).a = tgj.x((le8) obj2, tge.a);
                return Unit.a;
            case 20:
                ((fsf) obj).a = ((ne8) obj2).m1();
                return Unit.a;
            case 21:
                ttk ttkVar20 = (ttk) ((joa) obj2).getValue();
                h79 h79Var19 = ttkVar20 instanceof h79 ? (h79) ttkVar20 : null;
                return (h79Var19 == null || (defaultViewModelProviderFactory20 = h79Var19.getDefaultViewModelProviderFactory()) == null) ? ((FollowSubStagesDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory20;
            case 22:
                ttk ttkVar21 = (ttk) ((joa) obj2).getValue();
                h79 h79Var20 = ttkVar21 instanceof h79 ? (h79) ttkVar21 : null;
                return (h79Var20 == null || (defaultViewModelProviderFactory21 = h79Var20.getDefaultViewModelProviderFactory()) == null) ? ((HighValueStreaksFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory21;
            case 23:
                ttk ttkVar22 = (ttk) ((joa) obj2).getValue();
                h79 h79Var21 = ttkVar22 instanceof h79 ? (h79) ttkVar22 : null;
                return (h79Var21 == null || (defaultViewModelProviderFactory22 = h79Var21.getDefaultViewModelProviderFactory()) == null) ? ((HistoricalDataTopPerformanceModal) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory22;
            case 24:
                ((gc9) obj).d((wtc) obj2);
                return Unit.a;
            case 25:
                xw3.L((ku3) obj, null, null, new d17((n50) obj2, r1, 26), 3);
                return Unit.a;
            case 26:
                c40 c40Var = ((wma) obj).F;
                fsf fsfVar = (fsf) obj2;
                if ((((wtc) c40Var.g).d & 8) != 0) {
                    for (wtc wtcVar = (hti) c40Var.f; wtcVar != null; wtcVar = wtcVar.e) {
                        if ((wtcVar.c & 8) != 0) {
                            bw4 bw4Var = wtcVar;
                            ?? r3 = 0;
                            while (bw4Var != 0) {
                                if (bw4Var instanceof p3h) {
                                    p3h p3hVar = (p3h) bw4Var;
                                    if (p3hVar.M()) {
                                        l3h l3hVar = new l3h();
                                        fsfVar.a = l3hVar;
                                        l3hVar.d = true;
                                    }
                                    if (p3hVar.U0()) {
                                        ((l3h) fsfVar.a).c = true;
                                    }
                                    p3hVar.i((b4h) fsfVar.a);
                                } else if ((bw4Var.c & 8) != 0 && (bw4Var instanceof bw4)) {
                                    wtc wtcVar2 = bw4Var.p;
                                    int i2 = 0;
                                    bw4Var = bw4Var;
                                    r3 = r3;
                                    while (wtcVar2 != null) {
                                        if ((wtcVar2.c & 8) != 0) {
                                            i2++;
                                            r3 = r3;
                                            if (i2 == 1) {
                                                bw4Var = wtcVar2;
                                            } else {
                                                if (r3 == 0) {
                                                    r3 = new i1d(new wtc[16], 0);
                                                }
                                                if (bw4Var != 0) {
                                                    r3.b(bw4Var);
                                                    bw4Var = 0;
                                                }
                                                r3.b(wtcVar2);
                                            }
                                        }
                                        wtcVar2 = wtcVar2.f;
                                        bw4Var = bw4Var;
                                        r3 = r3;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                bw4Var = c6o.X(r3);
                            }
                        }
                    }
                }
                return Unit.a;
            case 27:
                ttk ttkVar23 = (ttk) ((joa) obj2).getValue();
                h79 h79Var22 = ttkVar23 instanceof h79 ? (h79) ttkVar23 : null;
                return (h79Var22 == null || (defaultViewModelProviderFactory23 = h79Var22.getDefaultViewModelProviderFactory()) == null) ? ((LeagueAwardsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory23;
            case 28:
                ttk ttkVar24 = (ttk) ((joa) obj2).getValue();
                h79 h79Var23 = ttkVar24 instanceof h79 ? (h79) ttkVar24 : null;
                return (h79Var23 == null || (defaultViewModelProviderFactory24 = h79Var23.getDefaultViewModelProviderFactory()) == null) ? ((LeagueDraftFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory24;
            default:
                ttk ttkVar25 = (ttk) ((joa) obj2).getValue();
                h79 h79Var24 = ttkVar25 instanceof h79 ? (h79) ttkVar25 : null;
                return (h79Var24 == null || (defaultViewModelProviderFactory25 = h79Var24.getDefaultViewModelProviderFactory()) == null) ? ((LeagueEventsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory25;
        }
    }
}
