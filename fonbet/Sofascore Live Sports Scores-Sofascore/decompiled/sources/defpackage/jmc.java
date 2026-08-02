package defpackage;

import com.iab.omid.library.adsbynimbus.adsession.AdEvents;
import com.sofascore.results.event.dialog.PenaltyHistoryBottomSheet;
import com.sofascore.results.mma.fightNight.MmaFightNightFragment;
import com.sofascore.results.mma.fighter.details.MmaFighterDetailsFragment;
import com.sofascore.results.mma.fighter.details.MmaFighterRankingsModal;
import com.sofascore.results.mma.fighter.matches.MmaFighterEventsFragment;
import com.sofascore.results.mma.fighter.statistics.MmaFighterStatisticsFragment;
import com.sofascore.results.notifications.ui.NotificationGroupSettingsBottomSheet;
import com.sofascore.results.pots.mostAwards.POTSMostAwardsFragment;
import com.sofascore.results.pots.mostAwards.bottomSheet.POTSPlayerAwardsBottomSheet;
import com.sofascore.results.pots.topLeagues.POTSTopLeaguesFragment;
import com.sofascore.results.pots.topLeagues.bottomSheet.POTSLeagueTopPlayersBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jmc extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmc(Object obj, int i) {
        super(0);
        this.i = i;
        this.j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                return (ttk) ((imc) obj).invoke();
            case 1:
                return (MmaFightNightFragment) obj;
            case 2:
                return (ttk) ((jmc) obj).invoke();
            case 3:
                return (MmaFighterDetailsFragment) obj;
            case 4:
                return (ttk) ((jmc) obj).invoke();
            case 5:
                return (MmaFighterEventsFragment) obj;
            case 6:
                return (ttk) ((jmc) obj).invoke();
            case 7:
                return (MmaFighterRankingsModal) obj;
            case 8:
                return (ttk) ((jmc) obj).invoke();
            case 9:
                return (MmaFighterStatisticsFragment) obj;
            case 10:
                return (ttk) ((jmc) obj).invoke();
            case 11:
                return (ttk) ((ipc) obj).invoke();
            case 12:
                return (ttk) ((opc) obj).invoke();
            case 13:
                return (ttk) ((ypc) obj).invoke();
            case 14:
                return ((h9d) obj).d;
            case 15:
                return ((m9d) obj).k1();
            case 16:
                return (NotificationGroupSettingsBottomSheet) obj;
            case 17:
                return (ttk) ((jmc) obj).invoke();
            case 18:
                return AdEvents.createAdEvents(((njd) obj).a());
            case 19:
                zqd zqdVar = (zqd) obj;
                wla wlaVar = zqdVar.r;
                nwf nwfVar = wlaVar != null ? (nwf) ((eoh) wlaVar.a).getValue() : null;
                if (!Intrinsics.c(zqdVar.x, nwfVar)) {
                    zqdVar.x = nwfVar;
                    nwf nwfVar2 = zqdVar.w;
                    if (nwfVar2 != null) {
                        zqdVar.k1(zqdVar.p, nwfVar2, nwfVar);
                    }
                }
                return Unit.a;
            case 20:
                return (ttk) ((x0e) obj).invoke();
            case 21:
                return (POTSLeagueTopPlayersBottomSheet) obj;
            case 22:
                return (ttk) ((jmc) obj).invoke();
            case 23:
                return (POTSMostAwardsFragment) obj;
            case 24:
                return (ttk) ((jmc) obj).invoke();
            case 25:
                return (POTSPlayerAwardsBottomSheet) obj;
            case 26:
                return (ttk) ((jmc) obj).invoke();
            case 27:
                return (POTSTopLeaguesFragment) obj;
            case 28:
                return (ttk) ((jmc) obj).invoke();
            default:
                return (PenaltyHistoryBottomSheet) obj;
        }
    }
}
