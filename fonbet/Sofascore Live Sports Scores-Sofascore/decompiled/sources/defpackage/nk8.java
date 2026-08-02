package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class nk8 {
    public static final ArrayList a(FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, Context context, String str, Gender gender) {
        String Q;
        Integer cleanSheet;
        footballPlayerSeasonStatistics.getClass();
        context.getClass();
        ArrayList arrayList = new ArrayList();
        mqi mqiVar = bii.a;
        String string = context.getString(bii.b(Sports.FOOTBALL, false));
        string.getClass();
        ArrayList arrayList2 = new ArrayList();
        Integer appearances = footballPlayerSeasonStatistics.getAppearances();
        if (appearances != null) {
            int intValue = appearances.intValue();
            String string2 = context.getString(R.string.matches_total);
            string2.getClass();
            arrayList2.add(new jei(string2, String.valueOf(intValue), null));
        }
        Integer matchesStarted = footballPlayerSeasonStatistics.getMatchesStarted();
        if (matchesStarted != null) {
            int intValue2 = matchesStarted.intValue();
            String string3 = context.getString(R.string.player_started_match);
            string3.getClass();
            arrayList2.add(new jei(string3, String.valueOf(intValue2), null));
        }
        Integer appearances2 = footballPlayerSeasonStatistics.getAppearances();
        if (appearances2 != null) {
            int intValue3 = appearances2.intValue();
            Integer minutesPlayed = footballPlayerSeasonStatistics.getMinutesPlayed();
            if (minutesPlayed != null) {
                if (minutesPlayed.intValue() <= 0) {
                    minutesPlayed = null;
                }
                if (minutesPlayed != null) {
                    int intValue4 = minutesPlayed.intValue();
                    String string4 = context.getString(R.string.football_minutes_per_game);
                    string4.getClass();
                    arrayList2.add(new jei(string4, intValue3 == 0 ? "0" : String.valueOf(wzb.a(intValue4 / intValue3)), null));
                }
            }
        }
        Integer minutesPlayed2 = footballPlayerSeasonStatistics.getMinutesPlayed();
        if (minutesPlayed2 != null) {
            if (minutesPlayed2.intValue() <= 0) {
                minutesPlayed2 = null;
            }
            if (minutesPlayed2 != null) {
                int intValue5 = minutesPlayed2.intValue();
                String string5 = context.getString(R.string.football_total_minutes_played);
                string5.getClass();
                arrayList2.add(new jei(string5, String.valueOf(intValue5)));
            }
        }
        Integer totwAppearances = footballPlayerSeasonStatistics.getTotwAppearances();
        if (totwAppearances != null) {
            int intValue6 = totwAppearances.intValue();
            String string6 = context.getString(R.string.team_of_the_week);
            string6.getClass();
            arrayList2.add(new jei(string6, String.valueOf(intValue6)));
        }
        ezg.h(arrayList, string, arrayList2);
        String string7 = context.getString(R.string.football_running_performance_per_90);
        string7.getClass();
        ArrayList arrayList3 = new ArrayList();
        Double kilometersCovered = footballPlayerSeasonStatistics.getKilometersCovered();
        Integer minutesPlayed3 = footballPlayerSeasonStatistics.getMinutesPlayed();
        if (kilometersCovered != null && minutesPlayed3 != null) {
            String q = rei.q(minutesPlayed3.intValue(), Double.valueOf(kilometersCovered.doubleValue()));
            String string8 = context.getString(R.string.football_running_distance_covered);
            string8.getClass();
            String string9 = context.getString(R.string.kilometers_format, q);
            string9.getClass();
            arrayList3.add(new jei(string8, string9));
        }
        Integer numberOfSprints = footballPlayerSeasonStatistics.getNumberOfSprints();
        Integer minutesPlayed4 = footballPlayerSeasonStatistics.getMinutesPlayed();
        if (numberOfSprints != null && minutesPlayed4 != null) {
            String q2 = rei.q(minutesPlayed4.intValue(), Integer.valueOf(numberOfSprints.intValue()));
            String string10 = context.getString(R.string.football_running_number_of_sprints);
            string10.getClass();
            arrayList3.add(new jei(string10, q2));
        }
        Double topSpeed = footballPlayerSeasonStatistics.getTopSpeed();
        if (topSpeed != null) {
            String string11 = context.getString(R.string.kilometers_per_hour_format, rei.b(1, Double.valueOf(topSpeed.doubleValue())));
            string11.getClass();
            String string12 = context.getString(R.string.football_running_top_speed);
            string12.getClass();
            arrayList3.add(new jei(string12, string11));
        }
        ezg.h(arrayList, string7, arrayList3);
        if (Intrinsics.c(str, "G")) {
            String string13 = context.getString(R.string.goalkeeping);
            string13.getClass();
            ArrayList arrayList4 = new ArrayList();
            Integer appearances3 = footballPlayerSeasonStatistics.getAppearances();
            if (appearances3 != null) {
                int intValue7 = appearances3.intValue();
                Integer goalsConceded = footballPlayerSeasonStatistics.getGoalsConceded();
                if (goalsConceded != null) {
                    int intValue8 = goalsConceded.intValue();
                    String string14 = context.getString(R.string.goals_conceded_per_game);
                    arrayList4.add(new jei(string14, fn0.j(intValue8, intValue7, string14)));
                }
            }
            Integer penaltySave = footballPlayerSeasonStatistics.getPenaltySave();
            if (penaltySave != null) {
                int intValue9 = penaltySave.intValue();
                String string15 = context.getString(R.string.football_penalties_saved);
                string15.getClass();
                Integer penaltyFaced = footballPlayerSeasonStatistics.getPenaltyFaced();
                arrayList4.add(new jei(string15, penaltyFaced != null ? fc6.g(intValue9, penaltyFaced.intValue(), "/") : String.valueOf(intValue9)));
            }
            Integer appearances4 = footballPlayerSeasonStatistics.getAppearances();
            if (appearances4 != null) {
                int intValue10 = appearances4.intValue();
                Integer saves = footballPlayerSeasonStatistics.getSaves();
                if (saves != null) {
                    int intValue11 = saves.intValue();
                    Integer goalsConceded2 = footballPlayerSeasonStatistics.getGoalsConceded();
                    if (goalsConceded2 != null) {
                        int intValue12 = goalsConceded2.intValue();
                        String string16 = context.getString(R.string.football_saves_per_game);
                        string16.getClass();
                        arrayList4.add(new jei(string16, rei.n(intValue11, intValue10, intValue12 + intValue11)));
                    }
                }
            }
            Double goalsPrevented = footballPlayerSeasonStatistics.getGoalsPrevented();
            if (goalsPrevented != null) {
                double doubleValue = goalsPrevented.doubleValue();
                String string17 = context.getString(R.string.football_goals_prevented);
                string17.getClass();
                arrayList4.add(new jei(string17, rei.b(2, Double.valueOf(doubleValue)), EventStatisticsItem.SpecialEventStatisticType.GoalsPrevented));
            }
            Integer appearances5 = footballPlayerSeasonStatistics.getAppearances();
            if (appearances5 != null) {
                int intValue13 = appearances5.intValue();
                Integer successfulRunsOut = footballPlayerSeasonStatistics.getSuccessfulRunsOut();
                if (successfulRunsOut != null) {
                    int intValue14 = successfulRunsOut.intValue();
                    Integer runsOut = footballPlayerSeasonStatistics.getRunsOut();
                    if (runsOut != null) {
                        int intValue15 = runsOut.intValue();
                        String string18 = context.getString(R.string.football_successful_runs_out_per_game);
                        string18.getClass();
                        arrayList4.add(new jei(string18, rei.n(intValue14, intValue13, intValue15)));
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Integer goalsConceded3 = footballPlayerSeasonStatistics.getGoalsConceded();
            if (goalsConceded3 != null) {
                int intValue16 = goalsConceded3.intValue();
                String string19 = context.getString(R.string.football_goals_conceded);
                string19.getClass();
                arrayList5.add(new jei(string19, String.valueOf(intValue16)));
            }
            Integer goalsConcededInsideTheBox = footballPlayerSeasonStatistics.getGoalsConcededInsideTheBox();
            if (goalsConcededInsideTheBox != null) {
                int intValue17 = goalsConcededInsideTheBox.intValue();
                String string20 = context.getString(R.string.football_goals_conceded_inside_box);
                string20.getClass();
                arrayList5.add(new jei(string20, String.valueOf(intValue17)));
            }
            Integer goalsConcededOutsideTheBox = footballPlayerSeasonStatistics.getGoalsConcededOutsideTheBox();
            if (goalsConcededOutsideTheBox != null) {
                int intValue18 = goalsConcededOutsideTheBox.intValue();
                String string21 = context.getString(R.string.football_goals_conceded_outside_box);
                string21.getClass();
                arrayList5.add(new jei(string21, String.valueOf(intValue18)));
            }
            Integer saves2 = footballPlayerSeasonStatistics.getSaves();
            if (saves2 != null) {
                int intValue19 = saves2.intValue();
                String string22 = context.getString(R.string.football_total_saves);
                string22.getClass();
                arrayList5.add(new jei(string22, String.valueOf(intValue19)));
            }
            Integer savedShotsFromInsideTheBox = footballPlayerSeasonStatistics.getSavedShotsFromInsideTheBox();
            if (savedShotsFromInsideTheBox != null) {
                int intValue20 = savedShotsFromInsideTheBox.intValue();
                String string23 = context.getString(R.string.football_saves_from_inside_box);
                string23.getClass();
                arrayList5.add(new jei(string23, String.valueOf(intValue20)));
            }
            Integer savedShotsFromOutsideTheBox = footballPlayerSeasonStatistics.getSavedShotsFromOutsideTheBox();
            if (savedShotsFromOutsideTheBox != null) {
                int intValue21 = savedShotsFromOutsideTheBox.intValue();
                String string24 = context.getString(R.string.football_saves_from_outside_box);
                string24.getClass();
                arrayList5.add(new jei(string24, String.valueOf(intValue21)));
            }
            Integer savesCaught = footballPlayerSeasonStatistics.getSavesCaught();
            if (savesCaught != null) {
                int intValue22 = savesCaught.intValue();
                String string25 = context.getString(R.string.football_saves_caught);
                string25.getClass();
                arrayList5.add(new jei(string25, String.valueOf(intValue22)));
            }
            Integer savesParried = footballPlayerSeasonStatistics.getSavesParried();
            if (savesParried != null) {
                int intValue23 = savesParried.intValue();
                String string26 = context.getString(R.string.football_saves_parried);
                string26.getClass();
                arrayList5.add(new jei(string26, String.valueOf(intValue23)));
            }
            ezg.g(arrayList, string13, arrayList4, arrayList5);
        }
        String string27 = context.getString(R.string.football_attacking);
        string27.getClass();
        ArrayList arrayList6 = new ArrayList();
        Integer goals = footballPlayerSeasonStatistics.getGoals();
        if (goals != null) {
            int intValue24 = goals.intValue();
            String string28 = context.getString(R.string.goals);
            string28.getClass();
            arrayList6.add(new jei(string28, String.valueOf(intValue24)));
        }
        Double expectedGoals = footballPlayerSeasonStatistics.getExpectedGoals();
        if (expectedGoals != null) {
            double doubleValue2 = expectedGoals.doubleValue();
            String string29 = context.getString(R.string.football_expected_goals);
            string29.getClass();
            arrayList6.add(new jei(string29, rei.b(2, Double.valueOf(doubleValue2)), EventStatisticsItem.SpecialEventStatisticType.ExpectedGoals));
        }
        Integer goals2 = footballPlayerSeasonStatistics.getGoals();
        if (goals2 != null) {
            int intValue25 = goals2.intValue();
            Double scoringFrequency = footballPlayerSeasonStatistics.getScoringFrequency();
            if (scoringFrequency != null) {
                double doubleValue3 = scoringFrequency.doubleValue();
                if (intValue25 > 0) {
                    String string30 = context.getString(R.string.goals_frequency);
                    string30.getClass();
                    arrayList6.add(new jei(string30, mz1.i(wzb.a(doubleValue3), " min")));
                }
            }
            Integer appearances6 = footballPlayerSeasonStatistics.getAppearances();
            if (appearances6 != null) {
                int intValue26 = appearances6.intValue();
                String string31 = context.getString(R.string.goals_per_game);
                arrayList6.add(new jei(string31, fn0.j(intValue25, intValue26, string31)));
            }
        }
        Integer appearances7 = footballPlayerSeasonStatistics.getAppearances();
        if (appearances7 != null) {
            int intValue27 = appearances7.intValue();
            Integer totalShots = footballPlayerSeasonStatistics.getTotalShots();
            if (totalShots != null) {
                int intValue28 = totalShots.intValue();
                String string32 = context.getString(R.string.football_shots_per_game);
                arrayList6.add(new jei(string32, fn0.j(intValue28, intValue27, string32)));
            }
            Integer shotsOnTarget = footballPlayerSeasonStatistics.getShotsOnTarget();
            if (shotsOnTarget != null) {
                int intValue29 = shotsOnTarget.intValue();
                String string33 = context.getString(R.string.football_shots_on_goal_per_game);
                arrayList6.add(new jei(string33, fn0.j(intValue29, intValue27, string33)));
            }
        }
        Integer bigChancesMissed = footballPlayerSeasonStatistics.getBigChancesMissed();
        if (bigChancesMissed != null) {
            int intValue30 = bigChancesMissed.intValue();
            String string34 = context.getString(R.string.football_big_chances_missed);
            string34.getClass();
            arrayList6.add(new jei(string34, String.valueOf(intValue30)));
        }
        ArrayList arrayList7 = new ArrayList();
        Double goalConversionPercentage = footballPlayerSeasonStatistics.getGoalConversionPercentage();
        if (goalConversionPercentage != null) {
            double doubleValue4 = goalConversionPercentage.doubleValue();
            String string35 = context.getString(R.string.goal_conversion);
            string35.getClass();
            arrayList7.add(new jei(string35, mz1.i(wzb.a(doubleValue4), "%")));
        }
        Integer penaltyGoals = footballPlayerSeasonStatistics.getPenaltyGoals();
        if (penaltyGoals != null) {
            int intValue31 = penaltyGoals.intValue();
            String string36 = context.getString(R.string.football_penalty_goals);
            string36.getClass();
            Integer penaltiesTaken = footballPlayerSeasonStatistics.getPenaltiesTaken();
            arrayList7.add(new jei(string36, penaltiesTaken != null ? fc6.g(intValue31, penaltiesTaken.intValue(), "/") : String.valueOf(intValue31)));
        }
        Double penaltyConversion = footballPlayerSeasonStatistics.getPenaltyConversion();
        if (penaltyConversion != null) {
            double doubleValue5 = penaltyConversion.doubleValue();
            String string37 = context.getString(R.string.football_penalty_conversion);
            string37.getClass();
            arrayList7.add(new jei(string37, mz1.i(wzb.a(doubleValue5), "%")));
        }
        Integer freeKickGoal = footballPlayerSeasonStatistics.getFreeKickGoal();
        if (freeKickGoal != null) {
            int intValue32 = freeKickGoal.intValue();
            String string38 = context.getString(R.string.football_free_kick_goals);
            string38.getClass();
            Integer shotFromSetPiece = footballPlayerSeasonStatistics.getShotFromSetPiece();
            arrayList7.add(new jei(string38, shotFromSetPiece != null ? fc6.g(intValue32, shotFromSetPiece.intValue(), "/") : String.valueOf(intValue32)));
        }
        Double setPieceConversion = footballPlayerSeasonStatistics.getSetPieceConversion();
        if (setPieceConversion != null) {
            double doubleValue6 = setPieceConversion.doubleValue();
            String string39 = context.getString(R.string.football_free_kick_conversion);
            string39.getClass();
            arrayList7.add(new jei(string39, mz1.i(wzb.a(doubleValue6), "%")));
        }
        Integer goalsFromInsideTheBox = footballPlayerSeasonStatistics.getGoalsFromInsideTheBox();
        if (goalsFromInsideTheBox != null) {
            int intValue33 = goalsFromInsideTheBox.intValue();
            String string40 = context.getString(R.string.goals_inside_box);
            string40.getClass();
            Integer shotsFromInsideTheBox = footballPlayerSeasonStatistics.getShotsFromInsideTheBox();
            arrayList7.add(new jei(string40, shotsFromInsideTheBox != null ? fc6.g(intValue33, shotsFromInsideTheBox.intValue(), "/") : String.valueOf(intValue33)));
        }
        Integer goalsFromOutsideTheBox = footballPlayerSeasonStatistics.getGoalsFromOutsideTheBox();
        if (goalsFromOutsideTheBox != null) {
            int intValue34 = goalsFromOutsideTheBox.intValue();
            String string41 = context.getString(R.string.goals_outside_box);
            string41.getClass();
            Integer shotsFromOutsideTheBox = footballPlayerSeasonStatistics.getShotsFromOutsideTheBox();
            arrayList7.add(new jei(string41, shotsFromOutsideTheBox != null ? fc6.g(intValue34, shotsFromOutsideTheBox.intValue(), "/") : String.valueOf(intValue34)));
        }
        Integer headedGoals = footballPlayerSeasonStatistics.getHeadedGoals();
        if (headedGoals != null) {
            int intValue35 = headedGoals.intValue();
            String string42 = context.getString(R.string.headed_goals);
            string42.getClass();
            arrayList7.add(new jei(string42, String.valueOf(intValue35)));
        }
        Integer leftFootGoals = footballPlayerSeasonStatistics.getLeftFootGoals();
        if (leftFootGoals != null) {
            int intValue36 = leftFootGoals.intValue();
            String string43 = context.getString(R.string.left_foot_goals);
            string43.getClass();
            arrayList7.add(new jei(string43, String.valueOf(intValue36)));
        }
        Integer rightFootGoals = footballPlayerSeasonStatistics.getRightFootGoals();
        if (rightFootGoals != null) {
            int intValue37 = rightFootGoals.intValue();
            String string44 = context.getString(R.string.right_foot_goals);
            string44.getClass();
            arrayList7.add(new jei(string44, String.valueOf(intValue37)));
        }
        Integer penaltyWon = footballPlayerSeasonStatistics.getPenaltyWon();
        if (penaltyWon != null) {
            int intValue38 = penaltyWon.intValue();
            String string45 = context.getString(R.string.football_penalties_won);
            string45.getClass();
            arrayList7.add(new jei(string45, String.valueOf(intValue38)));
        }
        ezg.g(arrayList, string27, arrayList6, arrayList7);
        String string46 = context.getString(R.string.passes);
        string46.getClass();
        ArrayList arrayList8 = new ArrayList();
        Integer assists = footballPlayerSeasonStatistics.getAssists();
        if (assists != null) {
            int intValue39 = assists.intValue();
            String string47 = context.getString(R.string.football_assists);
            string47.getClass();
            arrayList8.add(new jei(string47, String.valueOf(intValue39)));
        }
        Double expectedAssists = footballPlayerSeasonStatistics.getExpectedAssists();
        if (expectedAssists != null) {
            double doubleValue7 = expectedAssists.doubleValue();
            String string48 = context.getString(R.string.football_expected_assists);
            string48.getClass();
            arrayList8.add(new jei(string48, rei.b(2, Double.valueOf(doubleValue7))));
        }
        Integer appearances8 = footballPlayerSeasonStatistics.getAppearances();
        if (appearances8 != null) {
            int intValue40 = appearances8.intValue();
            Integer touches = footballPlayerSeasonStatistics.getTouches();
            if (touches != null) {
                int intValue41 = touches.intValue();
                String string49 = context.getString(R.string.football_touches_per_game);
                arrayList8.add(new jei(string49, fn0.j(intValue41, intValue40, string49)));
            }
        }
        Integer bigChancesCreated = footballPlayerSeasonStatistics.getBigChancesCreated();
        if (bigChancesCreated != null) {
            int intValue42 = bigChancesCreated.intValue();
            String string50 = context.getString(R.string.football_big_chances_created);
            string50.getClass();
            arrayList8.add(new jei(string50, String.valueOf(intValue42)));
        }
        Integer appearances9 = footballPlayerSeasonStatistics.getAppearances();
        if (appearances9 != null) {
            int intValue43 = appearances9.intValue();
            Integer keyPasses = footballPlayerSeasonStatistics.getKeyPasses();
            if (keyPasses != null) {
                int intValue44 = keyPasses.intValue();
                String string51 = context.getString(R.string.football_key_passes_per_game);
                arrayList8.add(new jei(string51, fn0.j(intValue44, intValue43, string51)));
            }
            Integer accuratePasses = footballPlayerSeasonStatistics.getAccuratePasses();
            if (accuratePasses != null) {
                int intValue45 = accuratePasses.intValue();
                Double accuratePassesPercentage = footballPlayerSeasonStatistics.getAccuratePassesPercentage();
                if (accuratePassesPercentage != null) {
                    double doubleValue8 = accuratePassesPercentage.doubleValue();
                    String string52 = context.getString(R.string.accurate_per_game);
                    string52.getClass();
                    arrayList8.add(new jei(string52, rei.p(intValue45, intValue43, doubleValue8)));
                }
            }
            Integer accurateOwnHalfPasses = footballPlayerSeasonStatistics.getAccurateOwnHalfPasses();
            if (accurateOwnHalfPasses != null) {
                int intValue46 = accurateOwnHalfPasses.intValue();
                Integer totalOwnHalfPasses = footballPlayerSeasonStatistics.getTotalOwnHalfPasses();
                if (totalOwnHalfPasses != null) {
                    int intValue47 = totalOwnHalfPasses.intValue();
                    String string53 = context.getString(R.string.accurate_passes_own_half);
                    string53.getClass();
                    arrayList8.add(new jei(string53, rei.n(intValue46, intValue43, intValue47)));
                }
            }
            Integer accurateOppositionHalfPasses = footballPlayerSeasonStatistics.getAccurateOppositionHalfPasses();
            if (accurateOppositionHalfPasses != null) {
                int intValue48 = accurateOppositionHalfPasses.intValue();
                Integer totalOppositionHalfPasses = footballPlayerSeasonStatistics.getTotalOppositionHalfPasses();
                if (totalOppositionHalfPasses != null) {
                    int intValue49 = totalOppositionHalfPasses.intValue();
                    String string54 = context.getString(R.string.accurate_passes_opposition_half);
                    string54.getClass();
                    arrayList8.add(new jei(string54, rei.n(intValue48, intValue43, intValue49)));
                }
            }
            Integer accurateLongBalls = footballPlayerSeasonStatistics.getAccurateLongBalls();
            if (accurateLongBalls != null) {
                int intValue50 = accurateLongBalls.intValue();
                Integer totalLongBalls = footballPlayerSeasonStatistics.getTotalLongBalls();
                if (totalLongBalls != null) {
                    int intValue51 = totalLongBalls.intValue();
                    String string55 = context.getString(R.string.accurate_long_passes);
                    string55.getClass();
                    arrayList8.add(new jei(string55, rei.n(intValue50, intValue43, intValue51)));
                }
            }
            Integer accurateChippedPasses = footballPlayerSeasonStatistics.getAccurateChippedPasses();
            if (accurateChippedPasses != null) {
                int intValue52 = accurateChippedPasses.intValue();
                Integer totalChippedPasses = footballPlayerSeasonStatistics.getTotalChippedPasses();
                if (totalChippedPasses != null) {
                    int intValue53 = totalChippedPasses.intValue();
                    String string56 = context.getString(R.string.football_accurate_chip_passes);
                    string56.getClass();
                    arrayList8.add(new jei(string56, rei.n(intValue52, intValue43, intValue53)));
                }
            }
            Integer accurateCrosses = footballPlayerSeasonStatistics.getAccurateCrosses();
            if (accurateCrosses != null) {
                int intValue54 = accurateCrosses.intValue();
                Double accurateCrossesPercentage = footballPlayerSeasonStatistics.getAccurateCrossesPercentage();
                if (accurateCrossesPercentage != null) {
                    double doubleValue9 = accurateCrossesPercentage.doubleValue();
                    String string57 = context.getString(R.string.accurate_crosses);
                    string57.getClass();
                    arrayList8.add(new jei(string57, rei.p(intValue54, intValue43, doubleValue9)));
                }
            }
        }
        ezg.h(arrayList, string46, arrayList8);
        String string58 = context.getString(R.string.football_defending);
        string58.getClass();
        boolean z = Intrinsics.c(str, "G") || Intrinsics.c(str, "D");
        ArrayList arrayList9 = new ArrayList();
        if (z && (cleanSheet = footballPlayerSeasonStatistics.getCleanSheet()) != null) {
            int intValue55 = cleanSheet.intValue();
            String string59 = context.getString(R.string.football_clean_sheets);
            string59.getClass();
            arrayList9.add(new jei(string59, String.valueOf(intValue55)));
        }
        Integer appearances10 = footballPlayerSeasonStatistics.getAppearances();
        if (appearances10 != null) {
            int intValue56 = appearances10.intValue();
            Integer interceptions = footballPlayerSeasonStatistics.getInterceptions();
            if (interceptions != null) {
                int intValue57 = interceptions.intValue();
                String string60 = context.getString(R.string.football_interceptions_per_game);
                arrayList9.add(new jei(string60, fn0.j(intValue57, intValue56, string60)));
            }
            Integer tackles = footballPlayerSeasonStatistics.getTackles();
            if (tackles != null) {
                int intValue58 = tackles.intValue();
                String string61 = context.getString(R.string.football_tackles_per_game);
                arrayList9.add(new jei(string61, fn0.j(intValue58, intValue56, string61)));
            }
            Integer possessionWonAttThird = footballPlayerSeasonStatistics.getPossessionWonAttThird();
            if (possessionWonAttThird != null) {
                int intValue59 = possessionWonAttThird.intValue();
                String string62 = context.getString(R.string.football_possession_won_final_third);
                arrayList9.add(new jei(string62, fn0.j(intValue59, intValue56, string62)));
            }
            Integer ballRecovery = footballPlayerSeasonStatistics.getBallRecovery();
            if (ballRecovery != null) {
                int intValue60 = ballRecovery.intValue();
                String string63 = context.getString(R.string.football_balls_recovered_per_game);
                arrayList9.add(new jei(string63, fn0.j(intValue60, intValue56, string63)));
            }
            Integer dribbledPast = footballPlayerSeasonStatistics.getDribbledPast();
            if (dribbledPast != null) {
                int intValue61 = dribbledPast.intValue();
                Q = hkg.Q(context, R.string.football_dribbled_past_per_game, gender, new Object[0]);
                arrayList9.add(new jei(Q, rei.l(intValue56, Integer.valueOf(intValue61))));
            }
            Integer clearances = footballPlayerSeasonStatistics.getClearances();
            if (clearances != null) {
                int intValue62 = clearances.intValue();
                String string64 = context.getString(R.string.football_clearances_per_game);
                arrayList9.add(new jei(string64, fn0.j(intValue62, intValue56, string64)));
            }
            Integer outfielderBlocks = footballPlayerSeasonStatistics.getOutfielderBlocks();
            if (outfielderBlocks != null) {
                int intValue63 = outfielderBlocks.intValue();
                String string65 = context.getString(R.string.blocked_shots_per_game);
                arrayList9.add(new jei(string65, fn0.j(intValue63, intValue56, string65)));
            }
        }
        Integer errorLeadToShot = footballPlayerSeasonStatistics.getErrorLeadToShot();
        if (errorLeadToShot != null) {
            int intValue64 = errorLeadToShot.intValue();
            String string66 = context.getString(R.string.error_lead_to_shot);
            string66.getClass();
            arrayList9.add(new jei(string66, String.valueOf(intValue64)));
        }
        Integer errorLeadToGoal = footballPlayerSeasonStatistics.getErrorLeadToGoal();
        if (errorLeadToGoal != null) {
            int intValue65 = errorLeadToGoal.intValue();
            String string67 = context.getString(R.string.errors_leading_to_goal);
            string67.getClass();
            arrayList9.add(new jei(string67, String.valueOf(intValue65)));
        }
        Integer penaltyConceded = footballPlayerSeasonStatistics.getPenaltyConceded();
        if (penaltyConceded != null) {
            int intValue66 = penaltyConceded.intValue();
            String string68 = context.getString(R.string.football_penalties_committed);
            string68.getClass();
            arrayList9.add(new jei(string68, String.valueOf(intValue66)));
        }
        ezg.h(arrayList, string58, arrayList9);
        String string69 = context.getString(R.string.other_per_game);
        string69.getClass();
        ArrayList arrayList10 = new ArrayList();
        Integer appearances11 = footballPlayerSeasonStatistics.getAppearances();
        if (appearances11 != null) {
            int intValue67 = appearances11.intValue();
            Integer successfulDribbles = footballPlayerSeasonStatistics.getSuccessfulDribbles();
            if (successfulDribbles != null) {
                int intValue68 = successfulDribbles.intValue();
                Double successfulDribblesPercentage = footballPlayerSeasonStatistics.getSuccessfulDribblesPercentage();
                if (successfulDribblesPercentage != null) {
                    double doubleValue10 = successfulDribblesPercentage.doubleValue();
                    String string70 = context.getString(R.string.football_successful_dribbles);
                    string70.getClass();
                    arrayList10.add(new jei(string70, rei.p(intValue68, intValue67, doubleValue10)));
                }
            }
            Integer totalDuelsWon = footballPlayerSeasonStatistics.getTotalDuelsWon();
            if (totalDuelsWon != null) {
                int intValue69 = totalDuelsWon.intValue();
                Double totalDuelsWonPercentage = footballPlayerSeasonStatistics.getTotalDuelsWonPercentage();
                if (totalDuelsWonPercentage != null) {
                    double doubleValue11 = totalDuelsWonPercentage.doubleValue();
                    String string71 = context.getString(R.string.football_total_duels_won);
                    string71.getClass();
                    arrayList10.add(new jei(string71, rei.p(intValue69, intValue67, doubleValue11)));
                }
            }
            Integer groundDuelsWon = footballPlayerSeasonStatistics.getGroundDuelsWon();
            if (groundDuelsWon != null) {
                int intValue70 = groundDuelsWon.intValue();
                Double groundDuelsWonPercentage = footballPlayerSeasonStatistics.getGroundDuelsWonPercentage();
                if (groundDuelsWonPercentage != null) {
                    double doubleValue12 = groundDuelsWonPercentage.doubleValue();
                    String string72 = context.getString(R.string.ground_duels_won);
                    string72.getClass();
                    arrayList10.add(new jei(string72, rei.p(intValue70, intValue67, doubleValue12)));
                }
            }
            Integer aerialDuelsWon = footballPlayerSeasonStatistics.getAerialDuelsWon();
            if (aerialDuelsWon != null) {
                int intValue71 = aerialDuelsWon.intValue();
                Double aerialDuelsWonPercentage = footballPlayerSeasonStatistics.getAerialDuelsWonPercentage();
                if (aerialDuelsWonPercentage != null) {
                    double doubleValue13 = aerialDuelsWonPercentage.doubleValue();
                    String string73 = context.getString(R.string.aerial_duels_won);
                    string73.getClass();
                    arrayList10.add(new jei(string73, rei.p(intValue71, intValue67, doubleValue13)));
                }
            }
            Integer possessionLost = footballPlayerSeasonStatistics.getPossessionLost();
            if (possessionLost != null) {
                int intValue72 = possessionLost.intValue();
                String string74 = context.getString(R.string.football_possession_lost);
                arrayList10.add(new jei(string74, fn0.j(intValue72, intValue67, string74)));
            }
            Integer dispossessed = footballPlayerSeasonStatistics.getDispossessed();
            if (dispossessed != null) {
                if (footballPlayerSeasonStatistics.getPossessionLost() != null) {
                    dispossessed = null;
                }
                if (dispossessed != null) {
                    int intValue73 = dispossessed.intValue();
                    String string75 = context.getString(R.string.football_dispossessed);
                    arrayList10.add(new jei(string75, fn0.j(intValue73, intValue67, string75)));
                }
            }
            Integer fouls = footballPlayerSeasonStatistics.getFouls();
            if (fouls != null) {
                int intValue74 = fouls.intValue();
                String string76 = context.getString(R.string.football_fouls);
                arrayList10.add(new jei(string76, fn0.j(intValue74, intValue67, string76)));
            }
            Integer wasFouled = footballPlayerSeasonStatistics.getWasFouled();
            if (wasFouled != null) {
                int intValue75 = wasFouled.intValue();
                String string77 = context.getString(R.string.football_was_fouled);
                arrayList10.add(new jei(string77, fn0.j(intValue75, intValue67, string77)));
            }
            Integer offsides = footballPlayerSeasonStatistics.getOffsides();
            if (offsides != null) {
                int intValue76 = offsides.intValue();
                String string78 = context.getString(R.string.football_offsides);
                arrayList10.add(new jei(string78, fn0.j(intValue76, intValue67, string78)));
            }
            Integer goalKicks = footballPlayerSeasonStatistics.getGoalKicks();
            if (goalKicks != null) {
                if (goalKicks.intValue() <= 0) {
                    goalKicks = null;
                }
                if (goalKicks != null) {
                    int intValue77 = goalKicks.intValue();
                    String string79 = context.getString(R.string.football_goal_kicks_per_game);
                    arrayList10.add(new jei(string79, fn0.j(intValue77, intValue67, string79)));
                }
            }
        }
        ezg.h(arrayList, string69, arrayList10);
        String string80 = context.getString(R.string.football_statistics_category_cards);
        string80.getClass();
        ArrayList arrayList11 = new ArrayList();
        Integer yellowCards = footballPlayerSeasonStatistics.getYellowCards();
        if (yellowCards != null) {
            int intValue78 = yellowCards.intValue();
            String string81 = context.getString(R.string.football_yellow_card_shortened);
            string81.getClass();
            arrayList11.add(new jei(string81, String.valueOf(intValue78), null));
        }
        Integer yellowRedCards = footballPlayerSeasonStatistics.getYellowRedCards();
        if (yellowRedCards != null) {
            int intValue79 = yellowRedCards.intValue();
            String string82 = context.getString(R.string.football_yellow_red_card_shortened);
            string82.getClass();
            arrayList11.add(new jei(string82, String.valueOf(intValue79), null));
        }
        Integer redCards = footballPlayerSeasonStatistics.getRedCards();
        if (redCards != null) {
            int intValue80 = redCards.intValue();
            String string83 = context.getString(R.string.football_red_card_shortened);
            string83.getClass();
            arrayList11.add(new jei(string83, String.valueOf(intValue80), null));
        }
        ezg.h(arrayList, string80, arrayList11);
        return arrayList;
    }
}
