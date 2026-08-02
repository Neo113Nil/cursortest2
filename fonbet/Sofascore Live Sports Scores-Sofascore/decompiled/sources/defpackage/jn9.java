package defpackage;

import com.sofascore.model.network.response.IceHockeyPlayerEventStatistics;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jn9 implements e1 {
    public static final /* synthetic */ jn9[] h;
    public static final /* synthetic */ kp5 i;
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final Function1 e;
    public final Function1 f;
    public final Function1 g;

    static {
        final int i2 = 10;
        jn9 jn9Var = new jn9("GOALS", 0, R.string.ice_hockey_lineups_goals, R.string.legend_hockey_goals, false, false, new yh9(26), new yh9(28), new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i2) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        });
        final int i3 = 17;
        Function1 function1 = new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i3) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        };
        final int i4 = 19;
        Function1 function12 = new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i4) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        };
        final int i5 = 20;
        jn9 jn9Var2 = new jn9("ASSISTS", 1, R.string.ice_hockey_lineups_assists, R.string.legend_hockey_assists, false, false, function1, function12, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i5) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        });
        final int i6 = 21;
        Function1 function13 = new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i6) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        };
        final int i7 = 22;
        Function1 function14 = new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i7) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        };
        final int i8 = 23;
        jn9 jn9Var3 = new jn9("POINTS", 2, R.string.hockey_points_short, R.string.legend_hockey_points, true, false, function13, function14, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i8) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        });
        final int i9 = 24;
        Function1 function15 = new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i9) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        };
        final int i10 = 7;
        Function1 function16 = new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i10) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        };
        final int i11 = 18;
        jn9 jn9Var4 = new jn9("PLUS_MINUS", 3, R.string.ice_hockey_lineups_plus_minus, R.string.legend_hockey_plus_minus, false, false, function15, function16, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i11) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        });
        final int i12 = 25;
        Function1 function17 = new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i12) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        };
        final int i13 = 26;
        Function1 function18 = new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i13) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        };
        final int i14 = 27;
        jn9 jn9Var5 = new jn9("PIM", 4, R.string.ice_hockey_lineups_penalty_minutes, R.string.hockey_penalty_minutes, false, false, function17, function18, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i14) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        });
        final int i15 = 28;
        Function1 function19 = new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i15) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        };
        final int i16 = 29;
        jn9 jn9Var6 = new jn9("SHOTS", 5, R.string.ice_hockey_lineups_shots, R.string.legend_hockey_shots_on_goal, false, false, function19, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i16) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        }, new in9(0));
        jn9 jn9Var7 = new jn9("HITS", 6, R.string.ice_hockey_lineups_hits, R.string.legend_hockey_hits, false, false, new in9(1), new yh9(27), new yh9(29));
        final int i17 = 0;
        Function1 function110 = new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i17) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        };
        final int i18 = 1;
        final int i19 = 2;
        jn9 jn9Var8 = new jn9("BLOCKED", 7, R.string.ice_hockey_lineups_blocks, R.string.legend_hockey_blocks, false, false, function110, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i18) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        }, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i19) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        });
        final int i20 = 3;
        final int i21 = 4;
        final int i22 = 5;
        jn9 jn9Var9 = new jn9("GIVEAWAYS", 8, R.string.hockey_giveaways_short, R.string.hockey_giveaways, false, false, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i20) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        }, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i21) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        }, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i22) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        });
        final int i23 = 6;
        final int i24 = 8;
        final int i25 = 9;
        jn9 jn9Var10 = new jn9("TAKEAWAYS", 9, R.string.hockey_takeaways_short, R.string.hockey_takeaways, false, false, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i23) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        }, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i24) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        }, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i25) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        });
        final int i26 = 11;
        final int i27 = 12;
        final int i28 = 13;
        jn9 jn9Var11 = new jn9("FACEOFF_PCT", 10, R.string.hockey_faceoff_pct_short, R.string.legend_hockey_face_off_pct, false, false, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i26) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        }, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i27) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        }, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i28) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        });
        final int i29 = 14;
        final int i30 = 15;
        final int i31 = 16;
        jn9[] jn9VarArr = {jn9Var, jn9Var2, jn9Var3, jn9Var4, jn9Var5, jn9Var6, jn9Var7, jn9Var8, jn9Var9, jn9Var10, jn9Var11, new jn9("TIME", 11, R.string.hockey_time_on_ice_short, R.string.legend_hockey_skaters_time_on_ice, false, true, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i29) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        }, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i30) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        }, new Function1() { // from class: hn9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                switch (i31) {
                    case 0:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 1:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getBlocked()));
                    case 2:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getBlocked() != null);
                    case 3:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 4:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getGiveaways()));
                    case 5:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGiveaways() != null);
                    case 6:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 7:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 8:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getTakeaways()));
                    case 9:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getTakeaways() != null);
                    case 10:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getGoals() != null);
                    case 11:
                        iceHockeyPlayerEventStatistics.getClass();
                        Integer faceOffTaken = iceHockeyPlayerEventStatistics.getFaceOffTaken();
                        String str = (faceOffTaken != null && faceOffTaken.intValue() == 0) ? "-" : null;
                        if (str != null) {
                            return str;
                        }
                        int m = yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins());
                        int m2 = yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken());
                        return rei.c(Double.valueOf(m2 != 0 ? (m / m2) * 100.0d : 0.0d), 1, false);
                    case 12:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) != 0 ? yid.m(iceHockeyPlayerEventStatistics.getFaceOffWins()) / yid.m(iceHockeyPlayerEventStatistics.getFaceOffTaken()) : 0.0d);
                    case 13:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getFaceOffTaken() != null);
                    case 14:
                        iceHockeyPlayerEventStatistics.getClass();
                        return rei.j(iceHockeyPlayerEventStatistics.getSecondsPlayed(), 1);
                    case 15:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getSecondsPlayed()));
                    case 16:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getSecondsPlayed() != null);
                    case 17:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 18:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPlusMinus() != null);
                    case 19:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getAssists()));
                    case 20:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getAssists() != null);
                    case 21:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 22:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPoints()));
                    case 23:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPoints() != null);
                    case 24:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPlusMinus()));
                    case 25:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 26:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getPenaltyMinutes()));
                    case 27:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Boolean.valueOf(iceHockeyPlayerEventStatistics.getPenaltyMinutes() != null);
                    case 28:
                        iceHockeyPlayerEventStatistics.getClass();
                        return String.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                    default:
                        iceHockeyPlayerEventStatistics.getClass();
                        return Double.valueOf(yid.m(iceHockeyPlayerEventStatistics.getShots()));
                }
            }
        })};
        h = jn9VarArr;
        i = new kp5(jn9VarArr);
    }

    public jn9(String str, int i2, int i3, int i4, boolean z, boolean z2, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i3;
        this.b = i4;
        this.c = z;
        this.d = z2;
        this.e = function1;
        this.f = function12;
        this.g = function13;
    }

    public static jn9 valueOf(String str) {
        return (jn9) Enum.valueOf(jn9.class, str);
    }

    public static jn9[] values() {
        return (jn9[]) h.clone();
    }

    @Override // defpackage.e1
    public final Function1 d() {
        return this.e;
    }

    @Override // defpackage.e1
    public final int g() {
        return this.a;
    }

    @Override // defpackage.e1
    public final Function1 h() {
        return this.f;
    }

    @Override // defpackage.e1
    public final boolean i() {
        return false;
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
        return this.g;
    }
}
