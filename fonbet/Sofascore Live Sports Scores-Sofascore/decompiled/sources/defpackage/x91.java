package defpackage;

import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistic;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistics;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class x91 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ x91(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ca  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Float aggregate$lambda$14;
        Float aggregate$lambda$29;
        Float aggregate$lambda$30;
        Float f;
        BaseballRankedStatistic pitchingSaves;
        Integer num = null;
        r1 = null;
        r1 = null;
        Float f2 = null;
        switch (this.a) {
            case 0:
                aggregate$lambda$14 = BaseballPlayerSeasonStatistics.Companion.aggregate$lambda$14((BaseballPlayerSeasonStatistics) obj);
                return aggregate$lambda$14;
            case 1:
                aggregate$lambda$29 = BaseballPlayerSeasonStatistics.Companion.aggregate$lambda$29((BaseballPlayerSeasonStatistics) obj);
                return aggregate$lambda$29;
            case 2:
                aggregate$lambda$30 = BaseballPlayerSeasonStatistics.Companion.aggregate$lambda$30((BaseballPlayerSeasonStatistics) obj);
                return aggregate$lambda$30;
            case 3:
                ((BaseballRankedStatistics) obj).getClass();
                return null;
            case 4:
                BaseballRankedStatistics baseballRankedStatistics = (BaseballRankedStatistics) obj;
                baseballRankedStatistics.getClass();
                BaseballRankedStatistic pitchingWins = baseballRankedStatistics.getPitchingWins();
                String valueOf = String.valueOf(wzb.b(yid.l(pitchingWins != null ? pitchingWins.getValue() : null)));
                BaseballRankedStatistic pitchingLosses = baseballRankedStatistics.getPitchingLosses();
                String valueOf2 = String.valueOf(wzb.b(yid.l(pitchingLosses != null ? pitchingLosses.getValue() : null)));
                BaseballRankedStatistic pitchingSaves2 = baseballRankedStatistics.getPitchingSaves();
                return valueOf + "/" + valueOf2 + "/" + String.valueOf(wzb.b(yid.l(pitchingSaves2 != null ? pitchingSaves2.getValue() : null)));
            case 5:
                BaseballRankedStatistics baseballRankedStatistics2 = (BaseballRankedStatistics) obj;
                baseballRankedStatistics2.getClass();
                BaseballRankedStatistic pitchingWins2 = baseballRankedStatistics2.getPitchingWins();
                if (pitchingWins2 != null) {
                    Integer rank = pitchingWins2.getRank();
                    Integer count = pitchingWins2.getCount();
                    if (rank != null && count != null) {
                        f = Float.valueOf(llf.b((rank.intValue() - 1.0f) / count.intValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                        pitchingSaves = baseballRankedStatistics2.getPitchingSaves();
                        if (pitchingSaves != null) {
                            Integer rank2 = pitchingSaves.getRank();
                            Integer count2 = pitchingSaves.getCount();
                            if (rank2 != null && count2 != null) {
                                f2 = Float.valueOf(llf.b((rank2.intValue() - 1.0f) / count2.intValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                            }
                        }
                        return (f == null ? f.floatValue() : 1.0f) >= (f2 != null ? f2.floatValue() : 1.0f) ? f : f2;
                    }
                }
                f = null;
                pitchingSaves = baseballRankedStatistics2.getPitchingSaves();
                if (pitchingSaves != null) {
                }
                if ((f == null ? f.floatValue() : 1.0f) >= (f2 != null ? f2.floatValue() : 1.0f)) {
                }
            case 6:
                ((BaseballRankedStatistics) obj).getClass();
                return null;
            case 7:
                BaseballPlayerSeasonStatistics baseballPlayerSeasonStatistics = (BaseballPlayerSeasonStatistics) obj;
                baseballPlayerSeasonStatistics.getClass();
                Integer pitchingWins3 = baseballPlayerSeasonStatistics.getPitchingWins();
                if (pitchingWins3 != null) {
                    Regex regex = yid.a;
                } else {
                    pitchingWins3 = null;
                }
                Integer pitchingLosses2 = baseballPlayerSeasonStatistics.getPitchingLosses();
                if (pitchingLosses2 != null) {
                    Regex regex2 = yid.a;
                    num = pitchingLosses2;
                }
                return ljg.m(pitchingWins3, num, "/");
            case 8:
                return Unit.a;
            case 9:
                return Unit.a;
            case 10:
                ((PlayerData) obj).getClass();
                return Boolean.TRUE;
            case 11:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return mz1.i(wzb.a(yid.m(r5.getSecondsPlayed()) / 60.0d), "'");
            case 12:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getPersonalFouls()));
            case 13:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getSecondsPlayed()));
            case 14:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 15:
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                basketballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(basketballPlayerEventStatistics.getTurnovers()));
            case 16:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getTurnovers()));
            case 17:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 18:
                BasketballPlayerEventStatistics basketballPlayerEventStatistics2 = (BasketballPlayerEventStatistics) obj;
                basketballPlayerEventStatistics2.getClass();
                return String.valueOf(yid.m(basketballPlayerEventStatistics2.getOffensiveRebounds()));
            case 19:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getOffensiveRebounds()));
            case 20:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 21:
                BasketballPlayerEventStatistics basketballPlayerEventStatistics3 = (BasketballPlayerEventStatistics) obj;
                basketballPlayerEventStatistics3.getClass();
                return String.valueOf(yid.m(basketballPlayerEventStatistics3.getDefensiveRebounds()));
            case 22:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getAssists()));
            case 23:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getDefensiveRebounds()));
            case 24:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 25:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 26:
                BasketballPlayerEventStatistics basketballPlayerEventStatistics4 = (BasketballPlayerEventStatistics) obj;
                basketballPlayerEventStatistics4.getClass();
                return rei.i(12, basketballPlayerEventStatistics4.getFieldGoalsMade(), basketballPlayerEventStatistics4.getFieldGoalAttempts(), false);
            case 27:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r5.getFieldGoalsMade()));
            case 28:
                ((BasketballPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            default:
                BasketballPlayerEventStatistics basketballPlayerEventStatistics5 = (BasketballPlayerEventStatistics) obj;
                basketballPlayerEventStatistics5.getClass();
                return mz1.i(yid.m(basketballPlayerEventStatistics5.getFieldGoalPct()), "%");
        }
    }
}
