package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.newNetwork.statistics.season.team.FootballTeamSeasonStatistics;
import com.sofascore.results.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ul8 {
    /* JADX WARN: Removed duplicated region for block: B:146:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0b2a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Pair a(FootballTeamSeasonStatistics footballTeamSeasonStatistics, Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer accurateOwnHalfPasses;
        Integer accurateOppositionHalfPasses;
        Integer accurateLongBalls;
        Integer accurateCrosses;
        Integer cleanSheets;
        Integer goalsConceded;
        Integer tackles;
        Integer interceptions;
        Integer clearances;
        Integer ballRecovery;
        Integer errorsLeadingToShot;
        Integer errorsLeadingToGoal;
        Integer penaltiesCommited;
        Integer penaltyGoalsConceded;
        Integer clearancesOffLine;
        Integer lastManTackles;
        Double goalsPrevented;
        Integer saves;
        Integer duelsWon;
        Integer groundDuelsWon;
        Integer aerialDuelsWon;
        Integer possessionLost;
        Integer throwIns;
        Integer goalKicks;
        Integer offsides;
        Integer fouls;
        Integer yellowCards;
        Integer redCards;
        double d;
        String valueOf;
        double d2;
        String valueOf2;
        String valueOf3;
        String n;
        String n2;
        EventStatisticsItem.SpecialEventStatisticType specialEventStatisticType;
        Double avgRating = footballTeamSeasonStatistics.getAvgRating();
        xbb b = a.b();
        String string = context.getString(R.string.summary);
        string.getClass();
        ArrayList arrayList = new ArrayList();
        mqi mqiVar = bii.a;
        String string2 = context.getString(bii.b(Sports.FOOTBALL, false));
        string2.getClass();
        arrayList.add(new jei(string2, String.valueOf(footballTeamSeasonStatistics.getAwardedMatches() + footballTeamSeasonStatistics.getMatches()), null));
        Integer goalsScored = footballTeamSeasonStatistics.getGoalsScored();
        if (goalsScored != null) {
            int intValue = goalsScored.intValue();
            String string3 = context.getString(R.string.football_goals_scored);
            string3.getClass();
            arrayList.add(new jei(string3, String.valueOf(intValue), null));
        }
        Integer goalsConceded2 = footballTeamSeasonStatistics.getGoalsConceded();
        if (goalsConceded2 != null) {
            int intValue2 = goalsConceded2.intValue();
            String string4 = context.getString(R.string.football_goals_conceded);
            string4.getClass();
            arrayList.add(new jei(string4, String.valueOf(intValue2), null));
        }
        Integer assists = footballTeamSeasonStatistics.getAssists();
        if (assists != null) {
            int intValue3 = assists.intValue();
            String string5 = context.getString(R.string.football_assists);
            string5.getClass();
            arrayList.add(new jei(string5, String.valueOf(intValue3), null));
        }
        km5 km5Var = km5.a;
        ezg.g(b, string, arrayList, km5Var);
        String string6 = context.getString(R.string.football_running_performance_per_match);
        string6.getClass();
        ArrayList arrayList2 = new ArrayList();
        Double kilometersCovered = footballTeamSeasonStatistics.getKilometersCovered();
        int matches = footballTeamSeasonStatistics.getMatches();
        if (kilometersCovered != null) {
            String l = rei.l(matches, Double.valueOf(kilometersCovered.doubleValue()));
            String string7 = context.getString(R.string.football_running_distance_covered);
            string7.getClass();
            String string8 = context.getString(R.string.kilometers_format, l);
            string8.getClass();
            arrayList2.add(new jei(string7, string8, null));
        }
        Integer numberOfSprints = footballTeamSeasonStatistics.getNumberOfSprints();
        int matches2 = footballTeamSeasonStatistics.getMatches();
        if (numberOfSprints != null) {
            String l2 = rei.l(matches2, Integer.valueOf(numberOfSprints.intValue()));
            String string9 = context.getString(R.string.football_running_number_of_sprints);
            string9.getClass();
            arrayList2.add(new jei(string9, l2, null));
        }
        ezg.g(b, string6, arrayList2, km5Var);
        String string10 = context.getString(R.string.football_attacking);
        string10.getClass();
        ArrayList arrayList3 = new ArrayList();
        Integer goalsScored2 = footballTeamSeasonStatistics.getGoalsScored();
        if (goalsScored2 != null) {
            int intValue4 = goalsScored2.intValue();
            String string11 = context.getString(R.string.goals_per_game);
            string11.getClass();
            arrayList3.add(new jei(string11, rei.l(footballTeamSeasonStatistics.getAwardedMatches() + footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue4)), null));
        }
        Double expectedGoals = footballTeamSeasonStatistics.getExpectedGoals();
        if (expectedGoals != null) {
            double doubleValue = expectedGoals.doubleValue();
            String string12 = context.getString(R.string.football_xg_per_game);
            string12.getClass();
            int matches3 = footballTeamSeasonStatistics.getMatches();
            Locale locale = ljg.u("ar", Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT);
            if (matches3 == 0) {
                str = "ar";
                specialEventStatisticType = null;
                n2 = "0.00";
            } else {
                str = "ar";
                n2 = ljg.n(new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(locale)), RoundingMode.HALF_UP, doubleValue / matches3);
                specialEventStatisticType = null;
            }
            arrayList3.add(new jei(string12, n2, specialEventStatisticType));
        } else {
            str = "ar";
        }
        Integer goalsScored3 = footballTeamSeasonStatistics.getGoalsScored();
        if (goalsScored3 != null) {
            int intValue5 = goalsScored3.intValue();
            Integer shots = footballTeamSeasonStatistics.getShots();
            if (shots != null) {
                if (shots.intValue() <= 0) {
                    shots = null;
                }
                if (shots != null) {
                    int intValue6 = shots.intValue();
                    String string13 = context.getString(R.string.goal_conversion);
                    string13.getClass();
                    arrayList3.add(new jei(string13, rei.d(intValue5, intValue6, 0, 8), null));
                }
            }
        }
        Double expectedGoalsOnTarget = footballTeamSeasonStatistics.getExpectedGoalsOnTarget();
        if (expectedGoalsOnTarget != null) {
            double doubleValue2 = expectedGoalsOnTarget.doubleValue();
            String string14 = context.getString(R.string.football_xgot_per_game);
            string14.getClass();
            int matches4 = footballTeamSeasonStatistics.getMatches();
            str3 = str;
            Locale locale2 = ljg.u(str3, Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT);
            if (matches4 == 0) {
                n = "0.00";
                str2 = n;
            } else {
                double d3 = doubleValue2 / matches4;
                str2 = "0.00";
                n = ljg.n(new DecimalFormat(str2, DecimalFormatSymbols.getInstance(locale2)), RoundingMode.HALF_UP, d3);
            }
            arrayList3.add(new jei(string14, n, null));
        } else {
            str2 = "0.00";
            str3 = str;
        }
        Integer penaltyGoals = footballTeamSeasonStatistics.getPenaltyGoals();
        if (penaltyGoals != null) {
            int intValue7 = penaltyGoals.intValue();
            String string15 = context.getString(R.string.football_penalty_goals);
            string15.getClass();
            Integer penaltiesTaken = footballTeamSeasonStatistics.getPenaltiesTaken();
            arrayList3.add(new jei(string15, penaltiesTaken != null ? fc6.g(intValue7, penaltiesTaken.intValue(), "/") : String.valueOf(intValue7), null));
        }
        Integer freeKickGoals = footballTeamSeasonStatistics.getFreeKickGoals();
        if (freeKickGoals != null) {
            int intValue8 = freeKickGoals.intValue();
            Integer freeKickShots = footballTeamSeasonStatistics.getFreeKickShots();
            if (freeKickShots != null) {
                if (freeKickShots.intValue() <= 0) {
                    freeKickShots = null;
                }
                if (freeKickShots != null) {
                    int intValue9 = freeKickShots.intValue();
                    String string16 = context.getString(R.string.football_free_kick_goals);
                    string16.getClass();
                    arrayList3.add(new jei(string16, intValue8 + "/" + intValue9, null));
                }
            }
        }
        Integer goalsFromInsideTheBox = footballTeamSeasonStatistics.getGoalsFromInsideTheBox();
        if (goalsFromInsideTheBox != null) {
            int intValue10 = goalsFromInsideTheBox.intValue();
            Integer shotsFromInsideTheBox = footballTeamSeasonStatistics.getShotsFromInsideTheBox();
            if (shotsFromInsideTheBox != null) {
                if (shotsFromInsideTheBox.intValue() <= 0) {
                    shotsFromInsideTheBox = null;
                }
                if (shotsFromInsideTheBox != null) {
                    int intValue11 = shotsFromInsideTheBox.intValue();
                    String string17 = context.getString(R.string.goals_inside_box);
                    string17.getClass();
                    arrayList3.add(new jei(string17, intValue10 + "/" + intValue11, null));
                }
            }
        }
        Integer goalsFromOutsideTheBox = footballTeamSeasonStatistics.getGoalsFromOutsideTheBox();
        if (goalsFromOutsideTheBox != null) {
            int intValue12 = goalsFromOutsideTheBox.intValue();
            Integer shotsFromOutsideTheBox = footballTeamSeasonStatistics.getShotsFromOutsideTheBox();
            if (shotsFromOutsideTheBox != null) {
                if (shotsFromOutsideTheBox.intValue() <= 0) {
                    shotsFromOutsideTheBox = null;
                }
                if (shotsFromOutsideTheBox != null) {
                    int intValue13 = shotsFromOutsideTheBox.intValue();
                    String string18 = context.getString(R.string.goals_outside_box);
                    string18.getClass();
                    arrayList3.add(new jei(string18, intValue12 + "/" + intValue13, null));
                }
            }
        }
        Integer leftFootGoals = footballTeamSeasonStatistics.getLeftFootGoals();
        if (leftFootGoals != null) {
            int intValue14 = leftFootGoals.intValue();
            String string19 = context.getString(R.string.left_foot_goals);
            string19.getClass();
            arrayList3.add(new jei(string19, String.valueOf(intValue14), null));
        }
        Integer rightFootGoals = footballTeamSeasonStatistics.getRightFootGoals();
        if (rightFootGoals != null) {
            int intValue15 = rightFootGoals.intValue();
            String string20 = context.getString(R.string.right_foot_goals);
            string20.getClass();
            arrayList3.add(new jei(string20, String.valueOf(intValue15), null));
        }
        Integer headedGoals = footballTeamSeasonStatistics.getHeadedGoals();
        if (headedGoals != null) {
            int intValue16 = headedGoals.intValue();
            String string21 = context.getString(R.string.headed_goals);
            string21.getClass();
            arrayList3.add(new jei(string21, String.valueOf(intValue16), null));
        }
        Integer bigChances = footballTeamSeasonStatistics.getBigChances();
        if (bigChances != null) {
            int intValue17 = bigChances.intValue();
            String string22 = context.getString(R.string.big_chances_per_game);
            string22.getClass();
            arrayList3.add(new jei(string22, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue17)), null));
        }
        Integer bigChancesMissed = footballTeamSeasonStatistics.getBigChancesMissed();
        if (bigChancesMissed != null) {
            int intValue18 = bigChancesMissed.intValue();
            String string23 = context.getString(R.string.big_chances_missed_per_game);
            string23.getClass();
            arrayList3.add(new jei(string23, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue18)), null));
        }
        Integer shots2 = footballTeamSeasonStatistics.getShots();
        if (shots2 != null) {
            int intValue19 = shots2.intValue();
            String string24 = context.getString(R.string.football_total_shots_per_game);
            string24.getClass();
            arrayList3.add(new jei(string24, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue19)), null));
        }
        Integer shotsOnTarget = footballTeamSeasonStatistics.getShotsOnTarget();
        if (shotsOnTarget != null) {
            int intValue20 = shotsOnTarget.intValue();
            String string25 = context.getString(R.string.football_shots_on_goal_per_game);
            string25.getClass();
            arrayList3.add(new jei(string25, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue20)), null));
        }
        Integer shotsOffTarget = footballTeamSeasonStatistics.getShotsOffTarget();
        if (shotsOffTarget != null) {
            int intValue21 = shotsOffTarget.intValue();
            String string26 = context.getString(R.string.shots_off_goal_per_game);
            string26.getClass();
            arrayList3.add(new jei(string26, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue21)), null));
        }
        Integer blockedScoringAttempt = footballTeamSeasonStatistics.getBlockedScoringAttempt();
        if (blockedScoringAttempt != null) {
            int intValue22 = blockedScoringAttempt.intValue();
            String string27 = context.getString(R.string.football_shots_blocked_per_game);
            string27.getClass();
            arrayList3.add(new jei(string27, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue22)), null));
        }
        Integer successfulDribbles = footballTeamSeasonStatistics.getSuccessfulDribbles();
        if (successfulDribbles != null) {
            int intValue23 = successfulDribbles.intValue();
            String string28 = context.getString(R.string.football_successful_dribbles_per_game);
            string28.getClass();
            arrayList3.add(new jei(string28, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue23)), null));
        }
        Integer corners = footballTeamSeasonStatistics.getCorners();
        if (corners != null) {
            int intValue24 = corners.intValue();
            String string29 = context.getString(R.string.football_corners_per_game);
            string29.getClass();
            arrayList3.add(new jei(string29, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue24)), null));
        }
        Integer freeKicks = footballTeamSeasonStatistics.getFreeKicks();
        if (freeKicks != null) {
            int intValue25 = freeKicks.intValue();
            String string30 = context.getString(R.string.football_free_kicks_per_game);
            string30.getClass();
            arrayList3.add(new jei(string30, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue25)), null));
        }
        Integer hitWoodwork = footballTeamSeasonStatistics.getHitWoodwork();
        if (hitWoodwork != null) {
            int intValue26 = hitWoodwork.intValue();
            String string31 = context.getString(R.string.football_hit_woodwork);
            string31.getClass();
            arrayList3.add(new jei(string31, String.valueOf(intValue26), null));
        }
        Integer fastBreaks = footballTeamSeasonStatistics.getFastBreaks();
        if (fastBreaks != null) {
            int intValue27 = fastBreaks.intValue();
            String string32 = context.getString(R.string.counter_attacks);
            string32.getClass();
            arrayList3.add(new jei(string32, String.valueOf(intValue27), null));
        }
        ezg.g(b, string10, arrayList3, km5Var);
        String string33 = context.getString(R.string.passes);
        string33.getClass();
        ArrayList arrayList4 = new ArrayList();
        Double expectedAssists = footballTeamSeasonStatistics.getExpectedAssists();
        if (expectedAssists != null) {
            double doubleValue3 = expectedAssists.doubleValue();
            String string34 = context.getString(R.string.football_xa_per_game);
            string34.getClass();
            int matches5 = footballTeamSeasonStatistics.getMatches();
            arrayList4.add(new jei(string34, matches5 == 0 ? str2 : ljg.n(new DecimalFormat(str2, DecimalFormatSymbols.getInstance(ljg.u(str3, Locale.getDefault().getLanguage()) ? Locale.US : Locale.getDefault(Locale.Category.FORMAT))), RoundingMode.HALF_UP, doubleValue3 / matches5), null));
        }
        Double averageBallPossession = footballTeamSeasonStatistics.getAverageBallPossession();
        if (averageBallPossession != null) {
            double doubleValue4 = averageBallPossession.doubleValue();
            String string35 = context.getString(R.string.football_ball_possession);
            string35.getClass();
            arrayList4.add(new jei(string35, rei.e(Double.valueOf(doubleValue4), 0, 6), null));
        }
        Integer accuratePasses = footballTeamSeasonStatistics.getAccuratePasses();
        if (accuratePasses != null) {
            int intValue28 = accuratePasses.intValue();
            Double accuratePassesPercentage = footballTeamSeasonStatistics.getAccuratePassesPercentage();
            if (accuratePassesPercentage != null) {
                double doubleValue5 = accuratePassesPercentage.doubleValue();
                String string36 = context.getString(R.string.accurate_per_game);
                string36.getClass();
                int matches6 = footballTeamSeasonStatistics.getMatches();
                if (matches6 == 0) {
                    valueOf3 = "0";
                    str4 = valueOf3;
                } else {
                    str4 = "0";
                    valueOf3 = String.valueOf(wzb.a(intValue28 / matches6));
                }
                arrayList4.add(new jei(string36, dmi.r(valueOf3, " (", rei.e(Double.valueOf(doubleValue5), 0, 6), ")"), null));
                accurateOwnHalfPasses = footballTeamSeasonStatistics.getAccurateOwnHalfPasses();
                if (accurateOwnHalfPasses != null) {
                    int intValue29 = accurateOwnHalfPasses.intValue();
                    Double accurateOwnHalfPassesPercentage = footballTeamSeasonStatistics.getAccurateOwnHalfPassesPercentage();
                    if (accurateOwnHalfPassesPercentage != null) {
                        double doubleValue6 = accurateOwnHalfPassesPercentage.doubleValue();
                        String string37 = context.getString(R.string.accurate_passes_own_half);
                        string37.getClass();
                        int matches7 = footballTeamSeasonStatistics.getMatches();
                        if (matches7 == 0) {
                            d2 = doubleValue6;
                            valueOf2 = str4;
                        } else {
                            d2 = doubleValue6;
                            valueOf2 = String.valueOf(wzb.a(intValue29 / matches7));
                        }
                        arrayList4.add(new jei(string37, dmi.r(valueOf2, " (", rei.e(Double.valueOf(d2), 0, 6), ")")));
                    }
                }
                accurateOppositionHalfPasses = footballTeamSeasonStatistics.getAccurateOppositionHalfPasses();
                if (accurateOppositionHalfPasses != null) {
                    int intValue30 = accurateOppositionHalfPasses.intValue();
                    Double accurateOppositionHalfPassesPercentage = footballTeamSeasonStatistics.getAccurateOppositionHalfPassesPercentage();
                    if (accurateOppositionHalfPassesPercentage != null) {
                        double doubleValue7 = accurateOppositionHalfPassesPercentage.doubleValue();
                        String string38 = context.getString(R.string.accurate_passes_opposition_half);
                        string38.getClass();
                        int matches8 = footballTeamSeasonStatistics.getMatches();
                        if (matches8 == 0) {
                            valueOf = str4;
                            d = doubleValue7;
                        } else {
                            d = doubleValue7;
                            valueOf = String.valueOf(wzb.a(intValue30 / matches8));
                        }
                        arrayList4.add(new jei(string38, dmi.r(valueOf, " (", rei.e(Double.valueOf(d), 0, 6), ")")));
                    }
                }
                accurateLongBalls = footballTeamSeasonStatistics.getAccurateLongBalls();
                if (accurateLongBalls != null) {
                    int intValue31 = accurateLongBalls.intValue();
                    Double accurateLongBallsPercentage = footballTeamSeasonStatistics.getAccurateLongBallsPercentage();
                    if (accurateLongBallsPercentage != null) {
                        double doubleValue8 = accurateLongBallsPercentage.doubleValue();
                        String string39 = context.getString(R.string.accurate_long_passes);
                        string39.getClass();
                        arrayList4.add(new jei(string39, fc6.n(rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue31)), " (", rei.e(Double.valueOf(doubleValue8), 0, 6), ")")));
                    }
                }
                accurateCrosses = footballTeamSeasonStatistics.getAccurateCrosses();
                if (accurateCrosses != null) {
                    int intValue32 = accurateCrosses.intValue();
                    Double accurateCrossesPercentage = footballTeamSeasonStatistics.getAccurateCrossesPercentage();
                    if (accurateCrossesPercentage != null) {
                        double doubleValue9 = accurateCrossesPercentage.doubleValue();
                        String string40 = context.getString(R.string.accurate_crosses);
                        string40.getClass();
                        arrayList4.add(new jei(string40, fc6.n(rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue32)), " (", rei.e(Double.valueOf(doubleValue9), 0, 6), ")")));
                    }
                }
                ezg.h(b, string33, arrayList4);
                String string41 = context.getString(R.string.football_defending);
                string41.getClass();
                ArrayList arrayList5 = new ArrayList();
                cleanSheets = footballTeamSeasonStatistics.getCleanSheets();
                if (cleanSheets != null) {
                    int intValue33 = cleanSheets.intValue();
                    String string42 = context.getString(R.string.football_clean_sheets);
                    string42.getClass();
                    arrayList5.add(new jei(string42, String.valueOf(intValue33)));
                }
                goalsConceded = footballTeamSeasonStatistics.getGoalsConceded();
                if (goalsConceded != null) {
                    int intValue34 = goalsConceded.intValue();
                    String string43 = context.getString(R.string.goals_conceded_per_game);
                    string43.getClass();
                    arrayList5.add(new jei(string43, rei.l(footballTeamSeasonStatistics.getAwardedMatches() + footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue34))));
                }
                tackles = footballTeamSeasonStatistics.getTackles();
                if (tackles != null) {
                    int intValue35 = tackles.intValue();
                    String string44 = context.getString(R.string.football_tackles_per_game);
                    string44.getClass();
                    arrayList5.add(new jei(string44, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue35))));
                }
                interceptions = footballTeamSeasonStatistics.getInterceptions();
                if (interceptions != null) {
                    int intValue36 = interceptions.intValue();
                    String string45 = context.getString(R.string.football_interceptions_per_game);
                    string45.getClass();
                    arrayList5.add(new jei(string45, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue36))));
                }
                clearances = footballTeamSeasonStatistics.getClearances();
                if (clearances != null) {
                    int intValue37 = clearances.intValue();
                    String string46 = context.getString(R.string.football_clearances_per_game);
                    string46.getClass();
                    arrayList5.add(new jei(string46, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue37))));
                }
                ballRecovery = footballTeamSeasonStatistics.getBallRecovery();
                if (ballRecovery != null) {
                    int intValue38 = ballRecovery.intValue();
                    String string47 = context.getString(R.string.football_balls_recovered_per_game);
                    string47.getClass();
                    arrayList5.add(new jei(string47, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue38))));
                }
                errorsLeadingToShot = footballTeamSeasonStatistics.getErrorsLeadingToShot();
                if (errorsLeadingToShot != null) {
                    int intValue39 = errorsLeadingToShot.intValue();
                    String string48 = context.getString(R.string.error_lead_to_shot);
                    string48.getClass();
                    arrayList5.add(new jei(string48, String.valueOf(intValue39)));
                }
                errorsLeadingToGoal = footballTeamSeasonStatistics.getErrorsLeadingToGoal();
                if (errorsLeadingToGoal != null) {
                    int intValue40 = errorsLeadingToGoal.intValue();
                    String string49 = context.getString(R.string.errors_leading_to_goal);
                    string49.getClass();
                    arrayList5.add(new jei(string49, String.valueOf(intValue40)));
                }
                penaltiesCommited = footballTeamSeasonStatistics.getPenaltiesCommited();
                if (penaltiesCommited != null) {
                    int intValue41 = penaltiesCommited.intValue();
                    String string50 = context.getString(R.string.football_penalties_committed);
                    string50.getClass();
                    arrayList5.add(new jei(string50, String.valueOf(intValue41)));
                }
                penaltyGoalsConceded = footballTeamSeasonStatistics.getPenaltyGoalsConceded();
                if (penaltyGoalsConceded != null) {
                    int intValue42 = penaltyGoalsConceded.intValue();
                    String string51 = context.getString(R.string.football_penalty_goals_conceded);
                    string51.getClass();
                    arrayList5.add(new jei(string51, String.valueOf(intValue42)));
                }
                clearancesOffLine = footballTeamSeasonStatistics.getClearancesOffLine();
                if (clearancesOffLine != null) {
                    int intValue43 = clearancesOffLine.intValue();
                    String string52 = context.getString(R.string.clearance_off_line);
                    string52.getClass();
                    arrayList5.add(new jei(string52, String.valueOf(intValue43)));
                }
                lastManTackles = footballTeamSeasonStatistics.getLastManTackles();
                if (lastManTackles != null) {
                    int intValue44 = lastManTackles.intValue();
                    String string53 = context.getString(R.string.last_man_tackle);
                    string53.getClass();
                    arrayList5.add(new jei(string53, String.valueOf(intValue44)));
                }
                ezg.h(b, string41, arrayList5);
                String string54 = context.getString(R.string.goalkeeping);
                string54.getClass();
                ArrayList arrayList6 = new ArrayList();
                goalsPrevented = footballTeamSeasonStatistics.getGoalsPrevented();
                if (goalsPrevented != null) {
                    double doubleValue10 = goalsPrevented.doubleValue();
                    String string55 = context.getString(R.string.football_goals_prevented);
                    string55.getClass();
                    arrayList6.add(new jei(string55, rei.b(2, Double.valueOf(doubleValue10))));
                }
                saves = footballTeamSeasonStatistics.getSaves();
                if (saves != null) {
                    int intValue45 = saves.intValue();
                    String string56 = context.getString(R.string.football_saves_per_game);
                    string56.getClass();
                    arrayList6.add(new jei(string56, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue45))));
                }
                ezg.h(b, string54, arrayList6);
                String string57 = context.getString(R.string.other);
                string57.getClass();
                ArrayList arrayList7 = new ArrayList();
                duelsWon = footballTeamSeasonStatistics.getDuelsWon();
                if (duelsWon != null) {
                    int intValue46 = duelsWon.intValue();
                    Double duelsWonPercentage = footballTeamSeasonStatistics.getDuelsWonPercentage();
                    if (duelsWonPercentage != null) {
                        double doubleValue11 = duelsWonPercentage.doubleValue();
                        String string58 = context.getString(R.string.total_duels_won_per_game);
                        string58.getClass();
                        arrayList7.add(new jei(string58, fc6.n(rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue46)), " (", rei.e(Double.valueOf(doubleValue11), 0, 6), ")")));
                    }
                }
                groundDuelsWon = footballTeamSeasonStatistics.getGroundDuelsWon();
                if (groundDuelsWon != null) {
                    int intValue47 = groundDuelsWon.intValue();
                    Double groundDuelsWonPercentage = footballTeamSeasonStatistics.getGroundDuelsWonPercentage();
                    if (groundDuelsWonPercentage != null) {
                        double doubleValue12 = groundDuelsWonPercentage.doubleValue();
                        String string59 = context.getString(R.string.ground_duels_won);
                        string59.getClass();
                        arrayList7.add(new jei(string59, fc6.n(rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue47)), " (", rei.e(Double.valueOf(doubleValue12), 0, 6), ")")));
                    }
                }
                aerialDuelsWon = footballTeamSeasonStatistics.getAerialDuelsWon();
                if (aerialDuelsWon != null) {
                    int intValue48 = aerialDuelsWon.intValue();
                    Double aerialDuelsWonPercentage = footballTeamSeasonStatistics.getAerialDuelsWonPercentage();
                    if (aerialDuelsWonPercentage != null) {
                        double doubleValue13 = aerialDuelsWonPercentage.doubleValue();
                        String string60 = context.getString(R.string.aerial_duels_won);
                        string60.getClass();
                        arrayList7.add(new jei(string60, fc6.n(rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue48)), " (", rei.e(Double.valueOf(doubleValue13), 0, 6), ")")));
                    }
                }
                possessionLost = footballTeamSeasonStatistics.getPossessionLost();
                if (possessionLost != null) {
                    int intValue49 = possessionLost.intValue();
                    String string61 = context.getString(R.string.football_possession_lost_per_game);
                    string61.getClass();
                    arrayList7.add(new jei(string61, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue49))));
                }
                throwIns = footballTeamSeasonStatistics.getThrowIns();
                if (throwIns != null) {
                    int intValue50 = throwIns.intValue();
                    String string62 = context.getString(R.string.football_throw_ins_per_game);
                    string62.getClass();
                    arrayList7.add(new jei(string62, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue50))));
                }
                goalKicks = footballTeamSeasonStatistics.getGoalKicks();
                if (goalKicks != null) {
                    int intValue51 = goalKicks.intValue();
                    String string63 = context.getString(R.string.football_goal_kicks_per_game);
                    string63.getClass();
                    arrayList7.add(new jei(string63, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue51))));
                }
                offsides = footballTeamSeasonStatistics.getOffsides();
                if (offsides != null) {
                    int intValue52 = offsides.intValue();
                    String string64 = context.getString(R.string.offsides_per_game);
                    string64.getClass();
                    arrayList7.add(new jei(string64, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue52))));
                }
                fouls = footballTeamSeasonStatistics.getFouls();
                if (fouls != null) {
                    int intValue53 = fouls.intValue();
                    String string65 = context.getString(R.string.football_fouls_per_game);
                    string65.getClass();
                    arrayList7.add(new jei(string65, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue53))));
                }
                yellowCards = footballTeamSeasonStatistics.getYellowCards();
                if (yellowCards != null) {
                    int intValue54 = yellowCards.intValue();
                    String string66 = context.getString(R.string.yellow_cards_per_game);
                    string66.getClass();
                    arrayList7.add(new jei(string66, rei.l(footballTeamSeasonStatistics.getMatches(), Integer.valueOf(intValue54))));
                }
                redCards = footballTeamSeasonStatistics.getRedCards();
                if (redCards != null) {
                    int intValue55 = redCards.intValue();
                    String string67 = context.getString(R.string.football_red_cards);
                    string67.getClass();
                    arrayList7.add(new jei(string67, String.valueOf(intValue55)));
                }
                ezg.h(b, string57, arrayList7);
                return new Pair(avgRating, a.a(b));
            }
        }
        str4 = "0";
        accurateOwnHalfPasses = footballTeamSeasonStatistics.getAccurateOwnHalfPasses();
        if (accurateOwnHalfPasses != null) {
        }
        accurateOppositionHalfPasses = footballTeamSeasonStatistics.getAccurateOppositionHalfPasses();
        if (accurateOppositionHalfPasses != null) {
        }
        accurateLongBalls = footballTeamSeasonStatistics.getAccurateLongBalls();
        if (accurateLongBalls != null) {
        }
        accurateCrosses = footballTeamSeasonStatistics.getAccurateCrosses();
        if (accurateCrosses != null) {
        }
        ezg.h(b, string33, arrayList4);
        String string412 = context.getString(R.string.football_defending);
        string412.getClass();
        ArrayList arrayList52 = new ArrayList();
        cleanSheets = footballTeamSeasonStatistics.getCleanSheets();
        if (cleanSheets != null) {
        }
        goalsConceded = footballTeamSeasonStatistics.getGoalsConceded();
        if (goalsConceded != null) {
        }
        tackles = footballTeamSeasonStatistics.getTackles();
        if (tackles != null) {
        }
        interceptions = footballTeamSeasonStatistics.getInterceptions();
        if (interceptions != null) {
        }
        clearances = footballTeamSeasonStatistics.getClearances();
        if (clearances != null) {
        }
        ballRecovery = footballTeamSeasonStatistics.getBallRecovery();
        if (ballRecovery != null) {
        }
        errorsLeadingToShot = footballTeamSeasonStatistics.getErrorsLeadingToShot();
        if (errorsLeadingToShot != null) {
        }
        errorsLeadingToGoal = footballTeamSeasonStatistics.getErrorsLeadingToGoal();
        if (errorsLeadingToGoal != null) {
        }
        penaltiesCommited = footballTeamSeasonStatistics.getPenaltiesCommited();
        if (penaltiesCommited != null) {
        }
        penaltyGoalsConceded = footballTeamSeasonStatistics.getPenaltyGoalsConceded();
        if (penaltyGoalsConceded != null) {
        }
        clearancesOffLine = footballTeamSeasonStatistics.getClearancesOffLine();
        if (clearancesOffLine != null) {
        }
        lastManTackles = footballTeamSeasonStatistics.getLastManTackles();
        if (lastManTackles != null) {
        }
        ezg.h(b, string412, arrayList52);
        String string542 = context.getString(R.string.goalkeeping);
        string542.getClass();
        ArrayList arrayList62 = new ArrayList();
        goalsPrevented = footballTeamSeasonStatistics.getGoalsPrevented();
        if (goalsPrevented != null) {
        }
        saves = footballTeamSeasonStatistics.getSaves();
        if (saves != null) {
        }
        ezg.h(b, string542, arrayList62);
        String string572 = context.getString(R.string.other);
        string572.getClass();
        ArrayList arrayList72 = new ArrayList();
        duelsWon = footballTeamSeasonStatistics.getDuelsWon();
        if (duelsWon != null) {
        }
        groundDuelsWon = footballTeamSeasonStatistics.getGroundDuelsWon();
        if (groundDuelsWon != null) {
        }
        aerialDuelsWon = footballTeamSeasonStatistics.getAerialDuelsWon();
        if (aerialDuelsWon != null) {
        }
        possessionLost = footballTeamSeasonStatistics.getPossessionLost();
        if (possessionLost != null) {
        }
        throwIns = footballTeamSeasonStatistics.getThrowIns();
        if (throwIns != null) {
        }
        goalKicks = footballTeamSeasonStatistics.getGoalKicks();
        if (goalKicks != null) {
        }
        offsides = footballTeamSeasonStatistics.getOffsides();
        if (offsides != null) {
        }
        fouls = footballTeamSeasonStatistics.getFouls();
        if (fouls != null) {
        }
        yellowCards = footballTeamSeasonStatistics.getYellowCards();
        if (yellowCards != null) {
        }
        redCards = footballTeamSeasonStatistics.getRedCards();
        if (redCards != null) {
        }
        ezg.h(b, string572, arrayList72);
        return new Pair(avgRating, a.a(b));
    }
}
