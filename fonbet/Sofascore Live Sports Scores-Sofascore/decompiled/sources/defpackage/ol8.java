package defpackage;

import android.view.MotionEvent;
import com.sofascore.model.network.response.HandballPlayerEventStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import defpackage.ip8;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ol8 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ol8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onCreate$lambda$8;
        switch (this.a) {
            case 0:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                FootballTeamSeasonStatistics v = ktm.v(c73Var);
                return yid.i(v != null ? v.getRedCards() : null);
            case 1:
                c73 c73Var2 = (c73) obj;
                c73Var2.getClass();
                FootballTeamSeasonStatistics v2 = ktm.v(c73Var2);
                if (v2 != null) {
                    return v2.getGoalsScored();
                }
                return null;
            case 2:
                c73 c73Var3 = (c73) obj;
                c73Var3.getClass();
                FootballTeamSeasonStatistics v3 = ktm.v(c73Var3);
                return ktm.H(v3 != null ? v3.getGoalsScored() : null, ktm.v(c73Var3));
            case 3:
                c73 c73Var4 = (c73) obj;
                c73Var4.getClass();
                FootballTeamSeasonStatistics v4 = ktm.v(c73Var4);
                return yid.i(v4 != null ? v4.getGoalsConceded() : null);
            case 4:
                c73 c73Var5 = (c73) obj;
                c73Var5.getClass();
                FootballTeamSeasonStatistics v5 = ktm.v(c73Var5);
                if (v5 != null) {
                    return v5.getAssists();
                }
                return null;
            case 5:
                c73 c73Var6 = (c73) obj;
                c73Var6.getClass();
                FootballTeamSeasonStatistics v6 = ktm.v(c73Var6);
                return ktm.H(v6 != null ? v6.getShotsOnTarget() : null, ktm.v(c73Var6));
            case 6:
                c73 c73Var7 = (c73) obj;
                c73Var7.getClass();
                FootballTeamSeasonStatistics v7 = ktm.v(c73Var7);
                return ktm.H(v7 != null ? v7.getBigChances() : null, ktm.v(c73Var7));
            case 7:
                Pair pair = (Pair) obj;
                pair.getClass();
                return (String) pair.a;
            case 8:
                ((ly3) obj).getClass();
                return new ip8.a();
            case 9:
                onCreate$lambda$8 = FullScreenWebViewDisplay.onCreate$lambda$8((ppd) obj);
                return onCreate$lambda$8;
            case 10:
                ((MotionEvent) obj).getClass();
                return Unit.a;
            case 11:
                ((gq5) obj).getClass();
                return Unit.a;
            case 12:
                ((ot9) obj).getClass();
                return Unit.a;
            case 13:
                ((ot9) obj).getClass();
                return Unit.a;
            case 14:
                synchronized (snh.c) {
                    List list = snh.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((Function1) list.get(i)).invoke(obj);
                    }
                }
                return Unit.a;
            case 15:
                ((HandballPlayerEventStatistics) obj).getClass();
                return mz1.i(wzb.a(yid.m(r6.getSecondsPlayed()) / 60.0d), "'");
            case 16:
                HandballPlayerEventStatistics handballPlayerEventStatistics = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics.getClass();
                return Boolean.valueOf(handballPlayerEventStatistics.getSecondsPlayed() != null);
            case 17:
                HandballPlayerEventStatistics handballPlayerEventStatistics2 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics2.getClass();
                int m = yid.m(handballPlayerEventStatistics2.getSaves());
                int m2 = yid.m(handballPlayerEventStatistics2.getGkShots());
                return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
            case 18:
                HandballPlayerEventStatistics handballPlayerEventStatistics3 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics3.getClass();
                return Double.valueOf(yid.m(handballPlayerEventStatistics3.getGkShots()) != 0 ? yid.m(handballPlayerEventStatistics3.getSaves()) / yid.m(handballPlayerEventStatistics3.getGkShots()) : 0.0d);
            case 19:
                ((HandballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 20:
                HandballPlayerEventStatistics handballPlayerEventStatistics4 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics4.getClass();
                return String.valueOf(yid.m(handballPlayerEventStatistics4.getSaves()));
            case 21:
                ((HandballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r6.getSaves()));
            case 22:
                ((HandballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 23:
                HandballPlayerEventStatistics handballPlayerEventStatistics5 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics5.getClass();
                return String.valueOf(yid.m(handballPlayerEventStatistics5.getGkShots()));
            case 24:
                ((HandballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r6.getGkShots()));
            case 25:
                ((HandballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 26:
                HandballPlayerEventStatistics handballPlayerEventStatistics6 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics6.getClass();
                return String.valueOf(yid.m(handballPlayerEventStatistics6.getGk7mSaves()));
            case 27:
                ((HandballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r6.getGk7mSaves()));
            case 28:
                ((HandballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            default:
                HandballPlayerEventStatistics handballPlayerEventStatistics7 = (HandballPlayerEventStatistics) obj;
                handballPlayerEventStatistics7.getClass();
                return String.valueOf(yid.m(handballPlayerEventStatistics7.getGkGoalsConceded()));
        }
    }
}
