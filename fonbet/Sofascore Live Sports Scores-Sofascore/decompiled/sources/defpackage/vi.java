package defpackage;

import android.content.Context;
import com.sofascore.model.Country;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.AffiliateBanner;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistic;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistics;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ vi(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new ji(str));
                return Unit.a;
            case 1:
                String str2 = (String) obj;
                if (str2 != null) {
                    function1.invoke(new ki(str2));
                }
                return Unit.a;
            case 2:
                BaseballRankedStatistics baseballRankedStatistics = (BaseballRankedStatistics) obj;
                baseballRankedStatistics.getClass();
                BaseballRankedStatistic baseballRankedStatistic = (BaseballRankedStatistic) function1.invoke(baseballRankedStatistics);
                if (baseballRankedStatistic == null) {
                    return null;
                }
                Integer rank = baseballRankedStatistic.getRank();
                Integer count = baseballRankedStatistic.getCount();
                if (rank == null || count == null) {
                    return null;
                }
                return Float.valueOf(llf.b((rank.intValue() - 1.0f) / count.intValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            case 3:
                ll1 ll1Var = (ll1) obj;
                ll1Var.getClass();
                function1.invoke(new ba1(ll1Var));
                return Unit.a;
            case 4:
                kl1 kl1Var = (kl1) obj;
                kl1Var.getClass();
                function1.invoke(new aa1(kl1Var));
                return Unit.a;
            case 5:
                function1.invoke(new y91((String) obj, true));
                return Unit.a;
            case 6:
                function1.invoke(new y91((String) obj, false));
                return Unit.a;
            case 7:
                Season.SubSeasonType subSeasonType = (Season.SubSeasonType) obj;
                subSeasonType.getClass();
                function1.invoke(new ea1(subSeasonType));
                return Unit.a;
            case 8:
                am1 am1Var = (am1) obj;
                am1Var.getClass();
                function1.invoke(new ca1(am1Var.a, null, null));
                return Unit.a;
            case 9:
                wj1 wj1Var = (wj1) obj;
                wj1Var.getClass();
                function1.invoke(new da1(wj1Var));
                return Unit.a;
            case 10:
                ml1 ml1Var = (ml1) obj;
                ml1Var.getClass();
                function1.invoke(ml1Var.a);
                return Unit.a;
            case 11:
                ml1 ml1Var2 = (ml1) obj;
                ml1Var2.getClass();
                function1.invoke(ml1Var2.a);
                return Unit.a;
            case 12:
                ml1 ml1Var3 = (ml1) obj;
                ml1Var3.getClass();
                function1.invoke(ml1Var3.a);
                return Unit.a;
            case 13:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function1.invoke(bool);
                return Unit.a;
            case 14:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new tq2(str3));
                return Unit.a;
            case 15:
                mi6 mi6Var = (mi6) obj;
                if (mi6Var != null) {
                    function1.invoke(new hz4(mi6Var));
                }
                return Unit.a;
            case 16:
                String str4 = (String) obj;
                if (str4 != null) {
                    function1.invoke(new kz4(str4));
                }
                return Unit.a;
            case 17:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new ez4(str5));
                return Unit.a;
            case 18:
                Country country = (Country) obj;
                if (country != null) {
                    function1.invoke(new fz4(country));
                }
                return Unit.a;
            case 19:
                vuf vufVar = (vuf) obj;
                if (vufVar != null) {
                    function1.invoke(new jz4(vufVar));
                }
                return Unit.a;
            case 20:
                AffiliateBanner affiliateBanner = (AffiliateBanner) obj;
                if (affiliateBanner != null) {
                    function1.invoke(new cz4(affiliateBanner));
                }
                return Unit.a;
            case 21:
                xk xkVar = (xk) obj;
                if (xkVar != null) {
                    function1.invoke(new bz4(xkVar));
                }
                return Unit.a;
            case 22:
                j1f j1fVar = (j1f) obj;
                j1fVar.getClass();
                function1.invoke(new mz4(false));
                function1.invoke(new nz4(j1fVar));
                return Unit.a;
            case 23:
                TeamSelection teamSelection = (TeamSelection) obj;
                teamSelection.getClass();
                function1.invoke(new jt5(teamSelection));
                return Unit.a;
            case 24:
                TeamSelection teamSelection2 = (TeamSelection) obj;
                teamSelection2.getClass();
                function1.invoke(new rw5(teamSelection2));
                return Unit.a;
            case 25:
                function1.invoke(new rz5(((Integer) obj).intValue()));
                return Unit.a;
            case 26:
                TeamSelection teamSelection3 = (TeamSelection) obj;
                teamSelection3.getClass();
                function1.invoke(new yz5(teamSelection3));
                return Unit.a;
            case 27:
                Context context = (Context) obj;
                context.getClass();
                pye pyeVar = new pye(context);
                pyeVar.setOnPlayerClick(new vi(25, function1));
                pyeVar.setOnResetHeatmap(new is5(4, function1));
                return pyeVar;
            default:
                function1.invoke(new tz5(((Integer) obj).intValue()));
                return Unit.a;
        }
    }
}
