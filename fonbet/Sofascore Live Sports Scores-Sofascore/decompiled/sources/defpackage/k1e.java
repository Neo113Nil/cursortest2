package defpackage;

import android.content.Context;
import android.view.View;
import com.sofascore.model.SeasonSpinnerData;
import com.sofascore.model.UniqueTournamentSeasonsSpinnerData;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class k1e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ k1e(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                p1e p1eVar = (p1e) obj;
                p1eVar.getClass();
                function1.invoke(new v0e(p1eVar));
                return Unit.a;
            case 1:
                p1e p1eVar2 = (p1e) obj;
                p1eVar2.getClass();
                function1.invoke(p1eVar2);
                return Unit.a;
            case 2:
                tn6 tn6Var = (tn6) obj;
                tn6Var.getClass();
                function1.invoke(new uqe(tn6Var));
                return Unit.a;
            case 3:
                Context context = (Context) obj;
                context.getClass();
                return (View) function1.invoke(context);
            case 4:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new gxg(str));
                return Unit.a;
            case 5:
                nzh nzhVar = (nzh) obj;
                nzhVar.getClass();
                function1.invoke(new m2h(nzhVar));
                return Unit.a;
            case 6:
                o2h o2hVar = (o2h) obj;
                o2hVar.getClass();
                function1.invoke(o2hVar.a);
                return Unit.a;
            case 7:
                function1.invoke(obj);
                return obj;
            case 8:
                function1.invoke(null);
                return Unit.a;
            case 9:
                nnh nnhVar = (nnh) function1.invoke((rnh) obj);
                synchronized (snh.c) {
                    snh.d = snh.d.m(nnhVar.g());
                    Unit unit = Unit.a;
                }
                return nnhVar;
            case 10:
                RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant = (RaceFlowModels$RaceEntrant) obj;
                raceFlowModels$RaceEntrant.getClass();
                function1.invoke(new s2i(raceFlowModels$RaceEntrant));
                return Unit.a;
            case 11:
                function1.invoke(new r2i((RaceFlowModels$RaceTeam) obj));
                return Unit.a;
            case 12:
                function1.invoke(new w2i((Integer) obj));
                return Unit.a;
            case 13:
                a6i a6iVar = (a6i) obj;
                a6iVar.getClass();
                function1.invoke(new ta(a6iVar));
                return Unit.a;
            case 14:
                b6i b6iVar = (b6i) obj;
                if (b6iVar != null) {
                    function1.invoke(new va(b6iVar));
                }
                return Unit.a;
            case 15:
                Long l = (Long) obj;
                l.getClass();
                return function1.invoke(l);
            case 16:
                Enum r4 = (Enum) obj;
                r4.getClass();
                Boolean bool = (Boolean) function1.invoke(r4);
                bool.getClass();
                return bool;
            case 17:
                function1.invoke(new cwi(((Integer) obj).intValue()));
                return Unit.a;
            case 18:
                TournamentRoundWrapper tournamentRoundWrapper = (TournamentRoundWrapper) obj;
                tournamentRoundWrapper.getClass();
                function1.invoke(Integer.valueOf(tournamentRoundWrapper.getId()));
                return Unit.a;
            case 19:
                n1j n1jVar = (n1j) obj;
                n1jVar.getClass();
                function1.invoke(new g1j(n1jVar));
                return Unit.a;
            case 20:
                c3j c3jVar = (c3j) obj;
                c3jVar.getClass();
                function1.invoke(new zmj(c3jVar));
                return Unit.a;
            case 21:
                pnj pnjVar = (pnj) obj;
                pnjVar.getClass();
                function1.invoke(new wmj(pnjVar));
                return Unit.a;
            case 22:
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = "";
                }
                function1.invoke(new cnj(str2));
                return Unit.a;
            case 23:
                UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData = (UniqueTournamentSeasonsSpinnerData) obj;
                uniqueTournamentSeasonsSpinnerData.getClass();
                int id = uniqueTournamentSeasonsSpinnerData.getUniqueTournament().getId();
                SeasonSpinnerData seasonSpinnerData = (SeasonSpinnerData) CollectionsKt.firstOrNull(uniqueTournamentSeasonsSpinnerData.getSeasons());
                function1.invoke(new enj(id, seasonSpinnerData != null ? seasonSpinnerData.getId() : -1));
                return Unit.a;
            case 24:
                function1.invoke(new r3j(((Boolean) obj).booleanValue()));
                return Unit.a;
            case 25:
                pnj pnjVar2 = (pnj) obj;
                pnjVar2.getClass();
                function1.invoke(new wmj(pnjVar2));
                return Unit.a;
            case 26:
                lnj lnjVar = (lnj) obj;
                lnjVar.getClass();
                function1.invoke(new xmj(lnjVar));
                return Unit.a;
            case 27:
                boj bojVar = (boj) obj;
                bojVar.getClass();
                function1.invoke(new dnj(bojVar));
                return Unit.a;
            case 28:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new cnj(str3));
                return Unit.a;
            default:
                function1.invoke(new jtj(((Integer) obj).intValue()));
                return Unit.a;
        }
    }
}
