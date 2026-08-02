package defpackage;

import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xp1 implements e1 {
    public static final /* synthetic */ xp1[] i;
    public static final /* synthetic */ kp5 j;
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Function1 f;
    public final Function1 g;
    public final Function1 h;

    static {
        xp1 xp1Var = new xp1("PLAYED", 0, R.string.basketball_lineups_minutes_played, R.string.legend_bball_minutes_played, true, false, true, new x91(11), new x91(13), new x91(25));
        final int i2 = 7;
        Function1 function1 = new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i2) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        };
        final int i3 = 19;
        Function1 function12 = new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i3) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        };
        final int i4 = 24;
        xp1 xp1Var2 = new xp1("POINTS", 1, R.string.basketball_lineups_points, R.string.legend_bball_points, false, false, false, function1, function12, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i4) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        });
        final int i5 = 26;
        Function1 function13 = new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i5) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        };
        final int i6 = 27;
        Function1 function14 = new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i6) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        };
        final int i7 = 28;
        xp1 xp1Var3 = new xp1("REBOUNDS", 2, R.string.basketball_lineups_rebounds, R.string.legend_bball_rebounds, false, false, false, function13, function14, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i7) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        });
        final int i8 = 29;
        final int i9 = 3;
        xp1 xp1Var4 = new xp1("ASSISTS", 3, R.string.basketball_lineups_assists, R.string.legend_bball_assists, false, false, false, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i8) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new x91(22), new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i9) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        });
        final int i10 = 14;
        Function1 function15 = new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i10) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        };
        final int i11 = 25;
        xp1 xp1Var5 = new xp1("STEALS", 4, R.string.basketball_lineups_steals, R.string.legend_bball_steals, false, false, false, function15, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i11) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new wp1(0));
        xp1 xp1Var6 = new xp1("BLOCKS", 5, R.string.basketball_lineups_blocks, R.string.legend_bball_blocks, false, false, false, new wp1(1), new wp1(2), new wp1(3));
        xp1 xp1Var7 = new xp1("PERSONAL_FOULS", 6, R.string.basketball_personal_fouls_short, R.string.basketball_personal_fouls, false, false, false, new wp1(4), new x91(12), new x91(14));
        xp1 xp1Var8 = new xp1("TURNOVERS", 7, R.string.basketball_lineups_turnovers, R.string.legend_bball_turnovers, false, false, false, new x91(15), new x91(16), new x91(17));
        xp1 xp1Var9 = new xp1("OFF_REBOUNDS", 8, R.string.basketball_lineups_off_rebounds, R.string.offensive_rebounds, false, true, false, new x91(18), new x91(19), new x91(20));
        xp1 xp1Var10 = new xp1("DEF_REBOUNDS", 9, R.string.basketball_lineups_def_rebounds, R.string.defensive_rebounds, false, true, false, new x91(21), new x91(23), new x91(24));
        xp1 xp1Var11 = new xp1("FIELD_GOALS", 10, R.string.basketball_lineups_field_goals, R.string.legend_bball_field_goals, false, true, false, new x91(26), new x91(27), new x91(28));
        final int i12 = 0;
        final int i13 = 1;
        xp1 xp1Var12 = new xp1("FIELD_GOALS_PCT", 11, R.string.basketball_lineups_field_goals_pct, R.string.legend_bball_field_goal_pct, false, false, false, new x91(29), new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i12) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i13) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        });
        final int i14 = 2;
        final int i15 = 4;
        final int i16 = 5;
        xp1 xp1Var13 = new xp1("FREE_THROWS", 12, R.string.basketball_lineups_free_throws, R.string.legend_bball_free_throws, false, true, false, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i14) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i15) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i16) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        });
        final int i17 = 6;
        final int i18 = 8;
        final int i19 = 9;
        xp1 xp1Var14 = new xp1("FREE_THROW_PCT", 13, R.string.basketball_lineups_free_throw_pct, R.string.legend_bball_f_throw_pct, false, false, false, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i17) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i18) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i19) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        });
        final int i20 = 10;
        final int i21 = 11;
        final int i22 = 12;
        xp1 xp1Var15 = new xp1("THREE_POINTERS", 14, R.string.basketball_lineups_three_pointers, R.string.legend_bball_three_points, false, true, false, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i20) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i21) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i22) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        });
        final int i23 = 13;
        final int i24 = 15;
        final int i25 = 16;
        xp1 xp1Var16 = new xp1("THREE_POINT_PCT", 15, R.string.basketball_lineups_three_point_pct, R.string.legend_bball_three_points_pct, false, false, false, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i23) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i24) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i25) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        });
        final int i26 = 17;
        final int i27 = 18;
        final int i28 = 20;
        xp1 xp1Var17 = new xp1("PLUS_MINUS", 16, R.string.basketball_plus_minus_short, R.string.basketball_plus_minus, false, false, false, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i26) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i27) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i28) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        });
        final int i29 = 21;
        final int i30 = 22;
        final int i31 = 23;
        xp1[] xp1VarArr = {xp1Var, xp1Var2, xp1Var3, xp1Var4, xp1Var5, xp1Var6, xp1Var7, xp1Var8, xp1Var9, xp1Var10, xp1Var11, xp1Var12, xp1Var13, xp1Var14, xp1Var15, xp1Var16, xp1Var17, new xp1("PIR", 17, R.string.performance_index_rating_short, R.string.legend_bball_performance_index_rating, false, false, false, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i29) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i30) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        }, new Function1() { // from class: vp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) obj;
                switch (i31) {
                    case 0:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFieldGoalPct()));
                    case 1:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 2:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), false);
                    case 3:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 4:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()));
                    case 5:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 6:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()), yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()), 0, 12);
                    case 7:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 8:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getFreeThrowsMade()) / yid.m(basketballPlayerEventStatistics.getFreeThrowAttempts()) : 0.0d);
                    case 9:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 10:
                        basketballPlayerEventStatistics.getClass();
                        return rei.i(12, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), false);
                    case 11:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointsMade()));
                    case 12:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 13:
                        basketballPlayerEventStatistics.getClass();
                        return rei.d(yid.m(basketballPlayerEventStatistics.getThreePointsMade()), yid.m(basketballPlayerEventStatistics.getThreePointAttempts()), 0, 12);
                    case 14:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 15:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) != 0 ? yid.m(basketballPlayerEventStatistics.getThreePointsMade()) / yid.m(basketballPlayerEventStatistics.getThreePointAttempts()) : 0.0d);
                    case 16:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 17:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 18:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()));
                    case 19:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPoints()));
                    case 20:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPlusMinus()) != 0);
                    case 21:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 22:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getPir()));
                    case 23:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.valueOf(yid.m(basketballPlayerEventStatistics.getPir()) > 0);
                    case 24:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    case 25:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getSteals()));
                    case 26:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 27:
                        basketballPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(basketballPlayerEventStatistics.getRebounds()));
                    case 28:
                        basketballPlayerEventStatistics.getClass();
                        return Boolean.TRUE;
                    default:
                        basketballPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(basketballPlayerEventStatistics.getAssists()));
                }
            }
        })};
        i = xp1VarArr;
        j = new kp5(xp1VarArr);
    }

    public xp1(String str, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i3;
        this.b = i4;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = function1;
        this.g = function12;
        this.h = function13;
    }

    public static xp1 valueOf(String str) {
        return (xp1) Enum.valueOf(xp1.class, str);
    }

    public static xp1[] values() {
        return (xp1[]) i.clone();
    }

    @Override // defpackage.e1
    public final Function1 d() {
        return this.f;
    }

    @Override // defpackage.e1
    public final int g() {
        return this.a;
    }

    @Override // defpackage.e1
    public final Function1 h() {
        return this.g;
    }

    @Override // defpackage.e1
    public final boolean i() {
        return this.e;
    }

    @Override // defpackage.e1
    public final boolean j() {
        return this.c;
    }

    @Override // defpackage.e1
    public final boolean k() {
        return this.d;
    }

    @Override // defpackage.e1
    public final int l() {
        return this.b;
    }

    @Override // defpackage.e1
    public final Function1 m() {
        return this.h;
    }
}
