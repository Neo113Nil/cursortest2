package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import com.sofascore.results.fantasy.shared.FantasyRoundPlayerInfo;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hl8 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double avgRating;
        boolean z = true;
        Object obj2 = null;
        switch (this.a) {
            case 0:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel.getClass();
                FantasyRoundPlayerInfo.Companion.getClass();
                boolean z2 = fantasyRoundPlayerUiModel.v;
                List list = fantasyRoundPlayerUiModel.x;
                if (!z2 && list.isEmpty()) {
                    return "-";
                }
                if (!list.isEmpty()) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!Intrinsics.c(((FantasyPlayerFixtureUiModel) it.next()).n, StatusKt.STATUS_NOT_STARTED)) {
                            }
                        }
                    }
                    if (z2 || z) {
                        return CollectionsKt.f0(CollectionsKt.L0(list, 2), null, null, null, new e87(24), 31);
                    }
                    Integer num = fantasyRoundPlayerUiModel.n;
                    String valueOf = String.valueOf(num != null ? num.intValue() : 0);
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (Intrinsics.c(((FantasyPlayerFixtureUiModel) next).n, StatusKt.STATUS_NOT_STARTED)) {
                                obj2 = next;
                            }
                        }
                    }
                    FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) obj2;
                    return fantasyPlayerFixtureUiModel != null ? wv8.i(valueOf, ", ", fantasyPlayerFixtureUiModel.h) : valueOf;
                }
                z = false;
                if (z2) {
                }
                return CollectionsKt.f0(CollectionsKt.L0(list, 2), null, null, null, new e87(24), 31);
            case 1:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel2.getClass();
                return fantasyRoundPlayerUiModel2.C.a;
            case 2:
                FantasyCompetitionType fantasyCompetitionType = (FantasyCompetitionType) obj;
                fantasyCompetitionType.getClass();
                return Boolean.valueOf(fantasyCompetitionType == FantasyCompetitionType.SEASON);
            case 3:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel3.getClass();
                return fantasyRoundPlayerUiModel3.C.b;
            case 4:
                FantasyCompetitionType fantasyCompetitionType2 = (FantasyCompetitionType) obj;
                fantasyCompetitionType2.getClass();
                return Boolean.valueOf(fantasyCompetitionType2 == FantasyCompetitionType.SEASON);
            case 5:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel4 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel4.getClass();
                return fantasyRoundPlayerUiModel4.C.c;
            case 6:
                FantasyCompetitionType fantasyCompetitionType3 = (FantasyCompetitionType) obj;
                fantasyCompetitionType3.getClass();
                return Boolean.valueOf(fantasyCompetitionType3 == FantasyCompetitionType.WEEKLY);
            case 7:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel5 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel5.getClass();
                return fantasyRoundPlayerUiModel5.C.d;
            case 8:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel6 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel6.getClass();
                return fantasyRoundPlayerUiModel6.C.e;
            case 9:
                ((FantasyCompetitionType) obj).getClass();
                return Boolean.TRUE;
            case 10:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                FootballTeamSeasonStatistics v = ktm.v(c73Var);
                return yid.h(ktm.H(v != null ? v.getBigChancesMissed() : null, ktm.v(c73Var)));
            case 11:
                c73 c73Var2 = (c73) obj;
                c73Var2.getClass();
                FootballTeamSeasonStatistics v2 = ktm.v(c73Var2);
                if (v2 != null) {
                    return v2.getAverageBallPossession();
                }
                return null;
            case 12:
                c73 c73Var3 = (c73) obj;
                c73Var3.getClass();
                FootballTeamSeasonStatistics v3 = ktm.v(c73Var3);
                if (v3 == null || (avgRating = v3.getAvgRating()) == null || avgRating.doubleValue() <= 0.0d) {
                    return null;
                }
                return avgRating;
            case 13:
                c73 c73Var4 = (c73) obj;
                c73Var4.getClass();
                FootballTeamSeasonStatistics v4 = ktm.v(c73Var4);
                return ktm.H(v4 != null ? v4.getAccuratePasses() : null, ktm.v(c73Var4));
            case 14:
                c73 c73Var5 = (c73) obj;
                c73Var5.getClass();
                FootballTeamSeasonStatistics v5 = ktm.v(c73Var5);
                return ktm.H(v5 != null ? v5.getAccurateLongBalls() : null, ktm.v(c73Var5));
            case 15:
                c73 c73Var6 = (c73) obj;
                c73Var6.getClass();
                FootballTeamSeasonStatistics v6 = ktm.v(c73Var6);
                if (v6 != null) {
                    return v6.getCleanSheets();
                }
                return null;
            case 16:
                c73 c73Var7 = (c73) obj;
                c73Var7.getClass();
                FootballTeamSeasonStatistics v7 = ktm.v(c73Var7);
                return yid.h(ktm.H(v7 != null ? v7.getGoalsConceded() : null, ktm.v(c73Var7)));
            case 17:
                c73 c73Var8 = (c73) obj;
                c73Var8.getClass();
                FootballTeamSeasonStatistics v8 = ktm.v(c73Var8);
                return ktm.H(v8 != null ? v8.getInterceptions() : null, ktm.v(c73Var8));
            case 18:
                c73 c73Var9 = (c73) obj;
                c73Var9.getClass();
                FootballTeamSeasonStatistics v9 = ktm.v(c73Var9);
                return ktm.H(v9 != null ? v9.getTackles() : null, ktm.v(c73Var9));
            case 19:
                c73 c73Var10 = (c73) obj;
                c73Var10.getClass();
                FootballTeamSeasonStatistics v10 = ktm.v(c73Var10);
                return ktm.H(v10 != null ? v10.getClearances() : null, ktm.v(c73Var10));
            case 20:
                c73 c73Var11 = (c73) obj;
                c73Var11.getClass();
                FootballTeamSeasonStatistics v11 = ktm.v(c73Var11);
                if (v11 != null) {
                    return v11.getAvgRatingVersion();
                }
                return null;
            case 21:
                c73 c73Var12 = (c73) obj;
                c73Var12.getClass();
                FootballTeamSeasonStatistics v12 = ktm.v(c73Var12);
                return yid.i(v12 != null ? v12.getPenaltyGoalsConceded() : null);
            case 22:
                c73 c73Var13 = (c73) obj;
                c73Var13.getClass();
                FootballTeamSeasonStatistics v13 = ktm.v(c73Var13);
                return ktm.H(v13 != null ? v13.getSaves() : null, ktm.v(c73Var13));
            case 23:
                c73 c73Var14 = (c73) obj;
                c73Var14.getClass();
                FootballTeamSeasonStatistics v14 = ktm.v(c73Var14);
                return ktm.H(v14 != null ? v14.getDuelsWon() : null, ktm.v(c73Var14));
            case 24:
                c73 c73Var15 = (c73) obj;
                c73Var15.getClass();
                FootballTeamSeasonStatistics v15 = ktm.v(c73Var15);
                if (v15 != null) {
                    return Integer.valueOf(v15.getMatches());
                }
                return null;
            case 25:
                c73 c73Var16 = (c73) obj;
                c73Var16.getClass();
                FootballTeamSeasonStatistics v16 = ktm.v(c73Var16);
                return yid.h(ktm.H(v16 != null ? v16.getFouls() : null, ktm.v(c73Var16)));
            case 26:
                c73 c73Var17 = (c73) obj;
                c73Var17.getClass();
                FootballTeamSeasonStatistics v17 = ktm.v(c73Var17);
                return yid.h(ktm.H(v17 != null ? v17.getOffsides() : null, ktm.v(c73Var17)));
            case 27:
                c73 c73Var18 = (c73) obj;
                c73Var18.getClass();
                FootballTeamSeasonStatistics v18 = ktm.v(c73Var18);
                return ktm.H(v18 != null ? v18.getGoalKicks() : null, ktm.v(c73Var18));
            case 28:
                c73 c73Var19 = (c73) obj;
                c73Var19.getClass();
                FootballTeamSeasonStatistics v19 = ktm.v(c73Var19);
                return ktm.H(v19 != null ? v19.getThrowIns() : null, ktm.v(c73Var19));
            default:
                c73 c73Var20 = (c73) obj;
                c73Var20.getClass();
                FootballTeamSeasonStatistics v20 = ktm.v(c73Var20);
                return yid.h(ktm.H(v20 != null ? v20.getYellowCards() : null, ktm.v(c73Var20)));
        }
    }
}
