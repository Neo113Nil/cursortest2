package defpackage;

import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.model.network.response.VolleyballPlayerEventStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class owk implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics.getClass();
                return Boolean.valueOf(volleyballPlayerEventStatistics.getAttackErrors() != null);
            case 1:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics2 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics2.getClass();
                return String.valueOf(yid.m(volleyballPlayerEventStatistics2.getAttacksBlocked()));
            case 2:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r4.getAttacksBlocked()));
            case 3:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r4.getAttackPoints()));
            case 4:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics3 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics3.getClass();
                return Boolean.valueOf(volleyballPlayerEventStatistics3.getAttacksBlocked() != null);
            case 5:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics4 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics4.getClass();
                return String.valueOf(yid.m(volleyballPlayerEventStatistics4.getAttackPoints()));
            case 6:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r4.getAttackPoints()));
            case 7:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 8:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics5 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics5.getClass();
                String o = yid.o(volleyballPlayerEventStatistics5.getAttackPoints(), volleyballPlayerEventStatistics5.getAttacksTotal());
                return o == null ? "-" : o;
            case 9:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r4.getPointsTotal()));
            case 10:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics6 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics6.getClass();
                return Double.valueOf(yid.m(volleyballPlayerEventStatistics6.getAttacksTotal()) > 0 ? yid.m(volleyballPlayerEventStatistics6.getAttackPoints()) / yid.m(volleyballPlayerEventStatistics6.getAttacksTotal()) : 0.0d);
            case 11:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics7 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics7.getClass();
                return Boolean.valueOf(volleyballPlayerEventStatistics7.getAttacksTotal() != null);
            case 12:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 13:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics8 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics8.getClass();
                return String.valueOf(yid.m(volleyballPlayerEventStatistics8.getAces()));
            case 14:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r4.getAces()));
            case 15:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 16:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics9 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics9.getClass();
                return String.valueOf(yid.m(volleyballPlayerEventStatistics9.getBlockPoints()));
            case 17:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 18:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics10 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics10.getClass();
                return String.valueOf(yid.m(volleyballPlayerEventStatistics10.getBreakPoints()));
            case 19:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r4.getBreakPoints()));
            case 20:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics11 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics11.getClass();
                return Boolean.valueOf(volleyballPlayerEventStatistics11.getBreakPoints() != null);
            case 21:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics12 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics12.getClass();
                return String.valueOf(yid.m(volleyballPlayerEventStatistics12.getWinLoss()));
            case 22:
                ((PlayerData) obj).getClass();
                return Boolean.TRUE;
            case 23:
                ((PlayerData) obj).getClass();
                return Boolean.TRUE;
            case 24:
                ((PlayerData) obj).getClass();
                return Boolean.TRUE;
            case 25:
                ((PlayerData) obj).getClass();
                return Boolean.TRUE;
            case 26:
                ((PlayerData) obj).getClass();
                return Boolean.TRUE;
            case 27:
                PlayerMatchesEventStatistics playerMatchesEventStatistics = (PlayerMatchesEventStatistics) obj;
                return yid.j(playerMatchesEventStatistics != null ? Integer.valueOf(playerMatchesEventStatistics.getPointsTotal()) : null);
            case 28:
                PlayerMatchesEventStatistics playerMatchesEventStatistics2 = (PlayerMatchesEventStatistics) obj;
                return yid.j(playerMatchesEventStatistics2 != null ? Integer.valueOf(playerMatchesEventStatistics2.getAttackPoints()) : null);
            default:
                PlayerMatchesEventStatistics playerMatchesEventStatistics3 = (PlayerMatchesEventStatistics) obj;
                return yid.j(playerMatchesEventStatistics3 != null ? Integer.valueOf(playerMatchesEventStatistics3.getAces()) : null);
        }
    }
}
