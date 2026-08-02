package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class tr1 {
    public static final void a(ArrayList arrayList, BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics, Context context) {
        Double trueShootingPercentage = basketballPlayerSeasonStatistics.getTrueShootingPercentage();
        if (trueShootingPercentage != null) {
            double doubleValue = trueShootingPercentage.doubleValue();
            String string = context.getString(R.string.basketball_true_shooting_percentage);
            string.getClass();
            arrayList.add(new jei(string, rei.e(Double.valueOf(doubleValue), 0, 6), null));
        }
        Double effectiveFieldGoalPercentage = basketballPlayerSeasonStatistics.getEffectiveFieldGoalPercentage();
        if (effectiveFieldGoalPercentage != null) {
            double doubleValue2 = effectiveFieldGoalPercentage.doubleValue();
            String string2 = context.getString(R.string.basketball_effective_field_goal_percentage);
            string2.getClass();
            arrayList.add(new jei(string2, rei.e(Double.valueOf(doubleValue2), 0, 6), null));
        }
        Double usage = basketballPlayerSeasonStatistics.getUsage();
        if (usage != null) {
            double doubleValue3 = usage.doubleValue();
            String string3 = context.getString(R.string.basketball_usage_percentage);
            string3.getClass();
            arrayList.add(new jei(string3, rei.e(Double.valueOf(doubleValue3), 0, 6), null));
        }
        Double individualOffensiveRating = basketballPlayerSeasonStatistics.getIndividualOffensiveRating();
        if (individualOffensiveRating != null) {
            double doubleValue4 = individualOffensiveRating.doubleValue();
            String string4 = context.getString(R.string.basketball_offensive_rating);
            string4.getClass();
            arrayList.add(new jei(string4, rei.b(1, Double.valueOf(doubleValue4)), null));
        }
        Double individualDefensiveRating = basketballPlayerSeasonStatistics.getIndividualDefensiveRating();
        if (individualDefensiveRating != null) {
            double doubleValue5 = individualDefensiveRating.doubleValue();
            String string5 = context.getString(R.string.basketball_defensive_rating);
            string5.getClass();
            arrayList.add(new jei(string5, rei.b(1, Double.valueOf(doubleValue5)), null));
        }
        Double playerEfficiencyRating = basketballPlayerSeasonStatistics.getPlayerEfficiencyRating();
        if (playerEfficiencyRating != null) {
            double doubleValue6 = playerEfficiencyRating.doubleValue();
            String string6 = context.getString(R.string.basketball_player_efficiency_rating_long);
            string6.getClass();
            arrayList.add(new jei(string6, rei.b(1, Double.valueOf(doubleValue6)), null));
        }
    }

    public static final ArrayList b(BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics, Context context) {
        ArrayList arrayList = new ArrayList();
        Integer doubleDoubles = basketballPlayerSeasonStatistics.getDoubleDoubles();
        if (doubleDoubles != null) {
            int intValue = doubleDoubles.intValue();
            String string = context.getString(R.string.basketball_double_double);
            string.getClass();
            arrayList.add(new jei(string, String.valueOf(intValue), null));
        }
        Integer tripleDoubles = basketballPlayerSeasonStatistics.getTripleDoubles();
        if (tripleDoubles != null) {
            int intValue2 = tripleDoubles.intValue();
            String string2 = context.getString(R.string.basketball_triple_double);
            string2.getClass();
            arrayList.add(new jei(string2, String.valueOf(intValue2), null));
        }
        return arrayList;
    }

    public static final ArrayList c(BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics, Context context) {
        ArrayList arrayList = new ArrayList();
        Integer appearances = basketballPlayerSeasonStatistics.getAppearances();
        if (appearances != null) {
            int intValue = appearances.intValue();
            Integer points = basketballPlayerSeasonStatistics.getPoints();
            if (points != null) {
                int intValue2 = points.intValue();
                String string = context.getString(R.string.total);
                arrayList.add(new jei(string, fn0.j(intValue2, intValue, string), null));
            }
            Integer freeThrowsMade = basketballPlayerSeasonStatistics.getFreeThrowsMade();
            if (freeThrowsMade != null) {
                int intValue3 = freeThrowsMade.intValue();
                Double freeThrowsPercentage = basketballPlayerSeasonStatistics.getFreeThrowsPercentage();
                if (freeThrowsPercentage != null) {
                    double doubleValue = freeThrowsPercentage.doubleValue();
                    String string2 = context.getString(R.string.free_throws);
                    string2.getClass();
                    arrayList.add(new jei(string2, rei.p(intValue3, intValue, doubleValue), null));
                }
            }
            Integer twoPointsMade = basketballPlayerSeasonStatistics.getTwoPointsMade();
            if (twoPointsMade != null) {
                int intValue4 = twoPointsMade.intValue();
                Double twoPointsPercentage = basketballPlayerSeasonStatistics.getTwoPointsPercentage();
                if (twoPointsPercentage != null) {
                    double doubleValue2 = twoPointsPercentage.doubleValue();
                    String string3 = context.getString(R.string.two_pointers);
                    string3.getClass();
                    arrayList.add(new jei(string3, rei.p(intValue4, intValue, doubleValue2), null));
                }
            }
            Integer threePointsMade = basketballPlayerSeasonStatistics.getThreePointsMade();
            if (threePointsMade != null) {
                int intValue5 = threePointsMade.intValue();
                Double threePointsPercentage = basketballPlayerSeasonStatistics.getThreePointsPercentage();
                if (threePointsPercentage != null) {
                    double doubleValue3 = threePointsPercentage.doubleValue();
                    String string4 = context.getString(R.string.three_pointers);
                    string4.getClass();
                    arrayList.add(new jei(string4, rei.p(intValue5, intValue, doubleValue3), null));
                }
            }
            Integer fieldGoalsMade = basketballPlayerSeasonStatistics.getFieldGoalsMade();
            if (fieldGoalsMade != null) {
                int intValue6 = fieldGoalsMade.intValue();
                Double fieldGoalsPercentage = basketballPlayerSeasonStatistics.getFieldGoalsPercentage();
                if (fieldGoalsPercentage != null) {
                    double doubleValue4 = fieldGoalsPercentage.doubleValue();
                    String string5 = context.getString(R.string.field_goals);
                    string5.getClass();
                    arrayList.add(new jei(string5, rei.p(intValue6, intValue, doubleValue4), null));
                }
            }
        }
        return arrayList;
    }

    public static final ArrayList d(BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics, Context context) {
        ArrayList arrayList = new ArrayList();
        Integer appearances = basketballPlayerSeasonStatistics.getAppearances();
        if (appearances != null) {
            int intValue = appearances.intValue();
            Integer rebounds = basketballPlayerSeasonStatistics.getRebounds();
            if (rebounds != null) {
                int intValue2 = rebounds.intValue();
                String string = context.getString(R.string.total);
                arrayList.add(new jei(string, fn0.j(intValue2, intValue, string), null));
            }
            Integer defensiveRebounds = basketballPlayerSeasonStatistics.getDefensiveRebounds();
            if (defensiveRebounds != null) {
                int intValue3 = defensiveRebounds.intValue();
                String string2 = context.getString(R.string.defensive_rebounds);
                arrayList.add(new jei(string2, fn0.j(intValue3, intValue, string2), null));
            }
            Integer offensiveRebounds = basketballPlayerSeasonStatistics.getOffensiveRebounds();
            if (offensiveRebounds != null) {
                int intValue4 = offensiveRebounds.intValue();
                String string3 = context.getString(R.string.offensive_rebounds);
                arrayList.add(new jei(string3, fn0.j(intValue4, intValue, string3), null));
            }
        }
        return arrayList;
    }
}
