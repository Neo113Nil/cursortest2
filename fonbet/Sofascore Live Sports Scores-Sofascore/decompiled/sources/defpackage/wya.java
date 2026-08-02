package defpackage;

import com.sofascore.results.event.dialog.PenaltyHistoryBottomSheet;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.feed.MediaPostFeedbackBottomSheet;
import com.sofascore.results.league.fragment.rankings.LeaguePowerRankingsFragment;
import com.sofascore.results.league.fragment.standings.LeagueStandingsFragment;
import com.sofascore.results.league.fragment.transactions.LeagueTransactionsFragment;
import com.sofascore.results.main.matches.redesign.filter.MatchesFilterBottomSheetDialog;
import com.sofascore.results.main.matches.redesign.livematches.LiveMatchesFragment;
import com.sofascore.results.manager.matches.ManagerEventsFragment;
import com.sofascore.results.matchOfTheWeek.MatchOfTheWeekBottomSheet;
import com.sofascore.results.mma.fightNight.MmaFightNightFragment;
import com.sofascore.results.mma.fighter.details.MmaFighterDetailsFragment;
import com.sofascore.results.mma.fighter.details.MmaFighterRankingsModal;
import com.sofascore.results.mma.fighter.editfighter.MmaEditFighterDialog;
import com.sofascore.results.mma.fighter.matches.MmaFighterEventsFragment;
import com.sofascore.results.mma.fighter.statistics.MmaFighterStatisticsFragment;
import com.sofascore.results.mma.mainScreen.MmaEventsWeekFragment;
import com.sofascore.results.mma.organisation.details.MmaOrganisationDetailsFragment;
import com.sofascore.results.mma.organisation.events.MmaOrganisationEventsFragment;
import com.sofascore.results.mma.organisation.rankings.MmaOrganisationRankingsFragment;
import com.sofascore.results.notifications.ui.NotificationGroupSettingsBottomSheet;
import com.sofascore.results.player.details.PlayerDetailsFragment;
import com.sofascore.results.player.fantasy.PlayerFantasyFragment;
import com.sofascore.results.player.matches.PlayerEventsFragment;
import com.sofascore.results.pots.highestRated.bottomSheet.POTSHighestRatedPlayersFilterBottomSheet;
import com.sofascore.results.pots.mostAwards.POTSMostAwardsFragment;
import com.sofascore.results.pots.mostAwards.bottomSheet.POTSPlayerAwardsBottomSheet;
import com.sofascore.results.pots.topLeagues.POTSTopLeaguesFragment;
import com.sofascore.results.pots.topLeagues.bottomSheet.POTSLeagueTopPlayersBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wya extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wya(int i, Object obj, Object obj2) {
        super(0);
        this.i = i;
        this.k = obj;
        this.j = obj2;
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
        int i = this.i;
        Object obj = this.k;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                ttk ttkVar = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar instanceof h79 ? (h79) ttkVar : null;
                return (h79Var == null || (defaultViewModelProviderFactory = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((LeaguePowerRankingsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            case 1:
                ttk ttkVar2 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar2 instanceof h79 ? (h79) ttkVar2 : null;
                return (h79Var == null || (defaultViewModelProviderFactory2 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((LeagueStandingsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory2;
            case 2:
                ttk ttkVar3 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar3 instanceof h79 ? (h79) ttkVar3 : null;
                return (h79Var == null || (defaultViewModelProviderFactory3 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((LeagueTransactionsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory3;
            case 3:
                ttk ttkVar4 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar4 instanceof h79 ? (h79) ttkVar4 : null;
                return (h79Var == null || (defaultViewModelProviderFactory4 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((LiveMatchesFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory4;
            case 4:
                ttk ttkVar5 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar5 instanceof h79 ? (h79) ttkVar5 : null;
                return (h79Var == null || (defaultViewModelProviderFactory5 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((ManagerEventsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory5;
            case 5:
                ttk ttkVar6 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar6 instanceof h79 ? (h79) ttkVar6 : null;
                return (h79Var == null || (defaultViewModelProviderFactory6 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MatchOfTheWeekBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory6;
            case 6:
                ttk ttkVar7 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar7 instanceof h79 ? (h79) ttkVar7 : null;
                return (h79Var == null || (defaultViewModelProviderFactory7 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MatchesFilterBottomSheetDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory7;
            case 7:
                ttk ttkVar8 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar8 instanceof h79 ? (h79) ttkVar8 : null;
                return (h79Var == null || (defaultViewModelProviderFactory8 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MediaPostFeedbackBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory8;
            case 8:
                ttk ttkVar9 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar9 instanceof h79 ? (h79) ttkVar9 : null;
                return (h79Var == null || (defaultViewModelProviderFactory9 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MmaEditFighterDialog) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory9;
            case 9:
                ttk ttkVar10 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar10 instanceof h79 ? (h79) ttkVar10 : null;
                return (h79Var == null || (defaultViewModelProviderFactory10 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MmaEventsWeekFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory10;
            case 10:
                ttk ttkVar11 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar11 instanceof h79 ? (h79) ttkVar11 : null;
                return (h79Var == null || (defaultViewModelProviderFactory11 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MmaFightNightFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory11;
            case 11:
                ttk ttkVar12 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar12 instanceof h79 ? (h79) ttkVar12 : null;
                return (h79Var == null || (defaultViewModelProviderFactory12 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MmaFighterDetailsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory12;
            case 12:
                ttk ttkVar13 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar13 instanceof h79 ? (h79) ttkVar13 : null;
                return (h79Var == null || (defaultViewModelProviderFactory13 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MmaFighterEventsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory13;
            case 13:
                ttk ttkVar14 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar14 instanceof h79 ? (h79) ttkVar14 : null;
                return (h79Var == null || (defaultViewModelProviderFactory14 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MmaFighterRankingsModal) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory14;
            case 14:
                ttk ttkVar15 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar15 instanceof h79 ? (h79) ttkVar15 : null;
                return (h79Var == null || (defaultViewModelProviderFactory15 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MmaFighterStatisticsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory15;
            case 15:
                ttk ttkVar16 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar16 instanceof h79 ? (h79) ttkVar16 : null;
                return (h79Var == null || (defaultViewModelProviderFactory16 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MmaOrganisationDetailsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory16;
            case 16:
                ttk ttkVar17 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar17 instanceof h79 ? (h79) ttkVar17 : null;
                return (h79Var == null || (defaultViewModelProviderFactory17 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MmaOrganisationEventsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory17;
            case 17:
                ttk ttkVar18 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar18 instanceof h79 ? (h79) ttkVar18 : null;
                return (h79Var == null || (defaultViewModelProviderFactory18 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((MmaOrganisationRankingsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory18;
            case 18:
                f4g f4gVar = wdd.N;
                ((Function1) obj).invoke(f4gVar);
                wdd wddVar = (wdd) obj2;
                boolean c = Intrinsics.c(wddVar.D, f4gVar.o);
                boolean z = wddVar.E;
                boolean z2 = f4gVar.p;
                boolean z3 = z != z2;
                if (!c || z3) {
                    wddVar.D = f4gVar.o;
                    wddVar.E = z2;
                    if (wddVar.F && (z3 || (z2 && !c))) {
                        wddVar.o.F();
                    }
                }
                wddVar.F = true;
                f4gVar.w = f4gVar.o.a(f4gVar.r, f4gVar.t, f4gVar.s);
                return Unit.a;
            case 19:
                ttk ttkVar19 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar19 instanceof h79 ? (h79) ttkVar19 : null;
                return (h79Var == null || (defaultViewModelProviderFactory19 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((NotificationGroupSettingsBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory19;
            case 20:
                ttk ttkVar20 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar20 instanceof h79 ? (h79) ttkVar20 : null;
                return (h79Var == null || (defaultViewModelProviderFactory20 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((POTSHighestRatedPlayersFilterBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory20;
            case 21:
                ttk ttkVar21 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar21 instanceof h79 ? (h79) ttkVar21 : null;
                return (h79Var == null || (defaultViewModelProviderFactory21 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((POTSLeagueTopPlayersBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory21;
            case 22:
                ttk ttkVar22 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar22 instanceof h79 ? (h79) ttkVar22 : null;
                return (h79Var == null || (defaultViewModelProviderFactory22 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((POTSMostAwardsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory22;
            case 23:
                ttk ttkVar23 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar23 instanceof h79 ? (h79) ttkVar23 : null;
                return (h79Var == null || (defaultViewModelProviderFactory23 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((POTSPlayerAwardsBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory23;
            case 24:
                ttk ttkVar24 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar24 instanceof h79 ? (h79) ttkVar24 : null;
                return (h79Var == null || (defaultViewModelProviderFactory24 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((POTSTopLeaguesFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory24;
            case 25:
                ttk ttkVar25 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar25 instanceof h79 ? (h79) ttkVar25 : null;
                return (h79Var == null || (defaultViewModelProviderFactory25 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((PenaltyHistoryBottomSheet) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory25;
            case 26:
                ttk ttkVar26 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar26 instanceof h79 ? (h79) ttkVar26 : null;
                return (h79Var == null || (defaultViewModelProviderFactory26 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((PlayerDetailsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory26;
            case 27:
                ttk ttkVar27 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar27 instanceof h79 ? (h79) ttkVar27 : null;
                return (h79Var == null || (defaultViewModelProviderFactory27 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((PlayerEventStatisticsModal) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory27;
            case 28:
                ttk ttkVar28 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar28 instanceof h79 ? (h79) ttkVar28 : null;
                return (h79Var == null || (defaultViewModelProviderFactory28 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((PlayerEventsFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory28;
            default:
                ttk ttkVar29 = (ttk) ((joa) obj2).getValue();
                h79Var = ttkVar29 instanceof h79 ? (h79) ttkVar29 : null;
                return (h79Var == null || (defaultViewModelProviderFactory29 = h79Var.getDefaultViewModelProviderFactory()) == null) ? ((PlayerFantasyFragment) obj).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory29;
        }
    }
}
