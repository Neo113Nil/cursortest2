package defpackage;

import androidx.compose.runtime.e;
import com.sofascore.model.mvvm.model.RefereeDetailsHeadFlags;
import com.sofascore.model.network.response.RugbyPlayerEventStatistics;
import com.sofascore.model.newNetwork.RefereeStatisticsItem;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class osf implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ osf(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                RefereeStatisticsItem refereeStatisticsItem = (RefereeStatisticsItem) obj;
                refereeStatisticsItem.getClass();
                return Integer.valueOf(refereeStatisticsItem.getAppearances());
            case 1:
                RefereeStatisticsItem refereeStatisticsItem2 = (RefereeStatisticsItem) obj;
                refereeStatisticsItem2.getClass();
                return Integer.valueOf(refereeStatisticsItem2.getYellowRedCards() + refereeStatisticsItem2.getRedCards());
            case 2:
                RefereeStatisticsItem refereeStatisticsItem3 = (RefereeStatisticsItem) obj;
                refereeStatisticsItem3.getClass();
                return Integer.valueOf(refereeStatisticsItem3.getAppearances());
            case 3:
                RefereeStatisticsItem refereeStatisticsItem4 = (RefereeStatisticsItem) obj;
                refereeStatisticsItem4.getClass();
                return Integer.valueOf(refereeStatisticsItem4.getPenalty());
            case 4:
                RefereeStatisticsItem refereeStatisticsItem5 = (RefereeStatisticsItem) obj;
                refereeStatisticsItem5.getClass();
                return Integer.valueOf(refereeStatisticsItem5.getAppearances());
            case 5:
                ((RefereeDetailsHeadFlags) obj).getClass();
                return Boolean.TRUE;
            case 6:
                ((RefereeDetailsHeadFlags) obj).getClass();
                return Boolean.TRUE;
            case 7:
                e1d e1dVar = (e1d) obj;
                Object obj2 = null;
                if (!(e1dVar instanceof coh)) {
                    a70.p("Failed requirement.");
                    return null;
                }
                coh cohVar = (coh) e1dVar;
                if (cohVar.getValue() != null) {
                    Object value = cohVar.getValue();
                    value.getClass();
                    obj2 = ((Function1) wcj.d.c).invoke(value);
                }
                foh b = cohVar.b();
                b.getClass();
                return e.e(obj2, b);
            case 8:
                cli cliVar = (cli) obj;
                cliVar.getClass();
                if (cliVar.d && h5a.K(cliVar.e) != null) {
                    r0 = true;
                }
                return Boolean.valueOf(r0);
            case 9:
                cli cliVar2 = (cli) obj;
                cliVar2.getClass();
                return Boolean.valueOf(h5a.K(cliVar2.e) != null);
            case 10:
                ((cli) obj).getClass();
                return Boolean.TRUE;
            case 11:
                ((cli) obj).getClass();
                return Boolean.TRUE;
            case 12:
                pol polVar = (pol) obj;
                polVar.getClass();
                uae uaeVar = o1g.f;
                return Boolean.valueOf(s6a.D(polVar.a));
            case 13:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics.getPoints()));
            case 14:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r3.getCleanBreaks()));
            case 15:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r3.getPoints()));
            case 16:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 17:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics2 = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics2.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics2.getDropGoals()));
            case 18:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r3.getDropGoals()));
            case 19:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 20:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics3 = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics3.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics3.getMetersRun()));
            case 21:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r3.getMetersRun()));
            case 22:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 23:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics4 = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics4.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics4.getOffloads()));
            case 24:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r3.getPenaltyGoals()));
            case 25:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r3.getOffloads()));
            case 26:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 27:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 28:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics5 = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics5.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics5.getTacklesMissed()));
            default:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r3.getTacklesMissed()));
        }
    }
}
