package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopStatsPerGameStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.model.newNetwork.topperformance.response.TopStatsItem;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopStatsPerGameStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class snj {
    public static List a(String str, List list) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TopStatsItem topStatsItem = (TopStatsItem) it.next();
            arrayList.add(new loj(topStatsItem.getPlayer(), topStatsItem.getEvent(), new jei(str, topStatsItem.getStatistic(), null)));
        }
        return CollectionsKt.S0(arrayList);
    }

    public static List b(Context context, TopPerformanceStatistics topPerformanceStatistics, String str) {
        context.getClass();
        topPerformanceStatistics.getClass();
        if (topPerformanceStatistics instanceof BasketballTopStatsPerGameStatistics) {
            BasketballTopStatsPerGameStatistics basketballTopStatsPerGameStatistics = (BasketballTopStatsPerGameStatistics) topPerformanceStatistics;
            ArrayList arrayList = new ArrayList();
            String string = context.getString(R.string.sofascore_rating);
            string.getClass();
            List<TopStatsItem> rating = basketballTopStatsPerGameStatistics.getRating();
            if (rating != null) {
                arrayList.add(new qmj(string, new ArrayList(a(string, rating))));
            }
            String string2 = context.getString(R.string.points_basketball);
            string2.getClass();
            List<TopStatsItem> points = basketballTopStatsPerGameStatistics.getPoints();
            if (points != null) {
                arrayList.add(new qmj(string2, new ArrayList(a(string2, points))));
            }
            String string3 = context.getString(R.string.rebounds);
            string3.getClass();
            List<TopStatsItem> rebounds = basketballTopStatsPerGameStatistics.getRebounds();
            if (rebounds != null) {
                arrayList.add(new qmj(string3, new ArrayList(a(string3, rebounds))));
            }
            String string4 = context.getString(R.string.basketball_assists);
            string4.getClass();
            List<TopStatsItem> assists = basketballTopStatsPerGameStatistics.getAssists();
            if (assists != null) {
                arrayList.add(new qmj(string4, new ArrayList(a(string4, assists))));
            }
            String string5 = context.getString(R.string.three_pointers);
            string5.getClass();
            List<TopStatsItem> threePointsMade = basketballTopStatsPerGameStatistics.getThreePointsMade();
            if (threePointsMade != null) {
                arrayList.add(new qmj(string5, new ArrayList(a(string5, threePointsMade))));
            }
            String string6 = context.getString(R.string.defensive_rebounds);
            string6.getClass();
            List<TopStatsItem> defensiveRebounds = basketballTopStatsPerGameStatistics.getDefensiveRebounds();
            if (defensiveRebounds != null) {
                arrayList.add(new qmj(string6, new ArrayList(a(string6, defensiveRebounds))));
            }
            String string7 = context.getString(R.string.offensive_rebounds);
            string7.getClass();
            List<TopStatsItem> offensiveRebounds = basketballTopStatsPerGameStatistics.getOffensiveRebounds();
            if (offensiveRebounds != null) {
                arrayList.add(new qmj(string7, new ArrayList(a(string7, offensiveRebounds))));
            }
            String string8 = context.getString(R.string.steals);
            string8.getClass();
            List<TopStatsItem> steals = basketballTopStatsPerGameStatistics.getSteals();
            if (steals != null) {
                arrayList.add(new qmj(string8, new ArrayList(a(string8, steals))));
            }
            String string9 = context.getString(R.string.turnovers);
            string9.getClass();
            List<TopStatsItem> turnovers = basketballTopStatsPerGameStatistics.getTurnovers();
            if (turnovers != null) {
                arrayList.add(new qmj(string9, new ArrayList(a(string9, turnovers))));
            }
            String string10 = context.getString(R.string.blocks);
            string10.getClass();
            List<TopStatsItem> blocks = basketballTopStatsPerGameStatistics.getBlocks();
            if (blocks != null) {
                arrayList.add(new qmj(string10, new ArrayList(a(string10, blocks))));
            }
            String string11 = context.getString(R.string.plus_minus);
            string11.getClass();
            List<TopStatsItem> plusMinus = basketballTopStatsPerGameStatistics.getPlusMinus();
            if (plusMinus != null) {
                arrayList.add(new qmj(string11, new ArrayList(a(string11, plusMinus))));
            }
            String string12 = context.getString(R.string.performance_index_rating_long);
            string12.getClass();
            List<TopStatsItem> pir = basketballTopStatsPerGameStatistics.getPir();
            if (pir != null) {
                arrayList.add(new qmj(string12, new ArrayList(a(string12, pir))));
            }
            return arrayList;
        }
        if (topPerformanceStatistics instanceof FootballTopStatsPerGameStatistics) {
            FootballTopStatsPerGameStatistics footballTopStatsPerGameStatistics = (FootballTopStatsPerGameStatistics) topPerformanceStatistics;
            ArrayList arrayList2 = new ArrayList();
            String string13 = context.getString(R.string.sofascore_rating);
            string13.getClass();
            List<TopStatsItem> rating2 = footballTopStatsPerGameStatistics.getRating();
            if (rating2 != null) {
                arrayList2.add(new qmj(string13, new ArrayList(a(string13, rating2))));
            }
            String string14 = context.getString(R.string.goals);
            string14.getClass();
            List<TopStatsItem> goals = footballTopStatsPerGameStatistics.getGoals();
            if (goals != null) {
                arrayList2.add(new qmj(string14, new ArrayList(a(string14, goals))));
            }
            String string15 = context.getString(R.string.football_expected_goals);
            string15.getClass();
            List<TopStatsItem> expectedGoals = footballTopStatsPerGameStatistics.getExpectedGoals();
            if (expectedGoals != null) {
                ArrayList arrayList3 = new ArrayList(k13.r(expectedGoals, 10));
                for (TopStatsItem topStatsItem : expectedGoals) {
                    arrayList3.add(new TopStatsItem(rei.b(2, Double.valueOf(Double.parseDouble(topStatsItem.getStatistic()))), topStatsItem.getPlayer(), topStatsItem.getEvent()));
                }
                arrayList2.add(new qmj(string15, new ArrayList(a(string15, arrayList3))));
            }
            String string16 = context.getString(R.string.football_assists);
            string16.getClass();
            List<TopStatsItem> goalAssist = footballTopStatsPerGameStatistics.getGoalAssist();
            if (goalAssist != null) {
                arrayList2.add(new qmj(string16, new ArrayList(a(string16, goalAssist))));
            }
            String string17 = context.getString(R.string.football_expected_assists);
            string17.getClass();
            List<TopStatsItem> expectedAssists = footballTopStatsPerGameStatistics.getExpectedAssists();
            if (expectedAssists != null) {
                ArrayList arrayList4 = new ArrayList(k13.r(expectedAssists, 10));
                for (TopStatsItem topStatsItem2 : expectedAssists) {
                    arrayList4.add(new TopStatsItem(rei.b(2, Double.valueOf(Double.parseDouble(topStatsItem2.getStatistic()))), topStatsItem2.getPlayer(), topStatsItem2.getEvent()));
                }
                arrayList2.add(new qmj(string17, new ArrayList(a(string17, arrayList4))));
            }
            String string18 = context.getString(R.string.football_running_distance_covered);
            string18.getClass();
            List<TopStatsItem> kilometersCovered = footballTopStatsPerGameStatistics.getKilometersCovered();
            if (kilometersCovered != null) {
                ArrayList arrayList5 = new ArrayList(k13.r(kilometersCovered, 10));
                for (TopStatsItem topStatsItem3 : kilometersCovered) {
                    String string19 = context.getString(R.string.kilometers_format, yid.c("%.1f", Double.valueOf(Double.parseDouble(topStatsItem3.getStatistic()))));
                    string19.getClass();
                    arrayList5.add(new TopStatsItem(string19, topStatsItem3.getPlayer(), topStatsItem3.getEvent()));
                }
                arrayList2.add(new qmj(string18, new ArrayList(a(string18, arrayList5))));
            }
            String string20 = context.getString(R.string.football_running_number_of_sprints);
            string20.getClass();
            List<TopStatsItem> numberOfSprints = footballTopStatsPerGameStatistics.getNumberOfSprints();
            if (numberOfSprints != null) {
                arrayList2.add(new qmj(string20, new ArrayList(a(string20, numberOfSprints))));
            }
            String string21 = context.getString(R.string.football_running_top_speed);
            string21.getClass();
            List<TopStatsItem> topSpeed = footballTopStatsPerGameStatistics.getTopSpeed();
            if (topSpeed != null) {
                ArrayList arrayList6 = new ArrayList(k13.r(topSpeed, 10));
                for (TopStatsItem topStatsItem4 : topSpeed) {
                    String string22 = context.getString(R.string.kilometers_per_hour_format, yid.c("%.1f", Double.valueOf(Double.parseDouble(topStatsItem4.getStatistic()))));
                    string22.getClass();
                    arrayList6.add(new TopStatsItem(string22, topStatsItem4.getPlayer(), topStatsItem4.getEvent()));
                }
                arrayList2.add(new qmj(string21, new ArrayList(a(string21, arrayList6))));
            }
            String string23 = context.getString(R.string.errors_leading_to_goal);
            string23.getClass();
            List<TopStatsItem> errorLeadToAGoal = footballTopStatsPerGameStatistics.getErrorLeadToAGoal();
            if (errorLeadToAGoal != null) {
                arrayList2.add(new qmj(string23, new ArrayList(a(string23, errorLeadToAGoal))));
            }
            String string24 = context.getString(R.string.football_big_chances_missed);
            string24.getClass();
            List<TopStatsItem> bigChanceMissed = footballTopStatsPerGameStatistics.getBigChanceMissed();
            if (bigChanceMissed != null) {
                arrayList2.add(new qmj(string24, new ArrayList(a(string24, bigChanceMissed))));
            }
            String string25 = context.getString(R.string.football_big_chances_created);
            string25.getClass();
            List<TopStatsItem> bigChanceCreated = footballTopStatsPerGameStatistics.getBigChanceCreated();
            if (bigChanceCreated != null) {
                arrayList2.add(new qmj(string25, new ArrayList(a(string25, bigChanceCreated))));
            }
            String string26 = context.getString(R.string.football_key_passes);
            string26.getClass();
            List<TopStatsItem> keyPass = footballTopStatsPerGameStatistics.getKeyPass();
            if (keyPass != null) {
                arrayList2.add(new qmj(string26, new ArrayList(a(string26, keyPass))));
            }
            String string27 = context.getString(R.string.football_accurate_passes);
            string27.getClass();
            List<TopStatsItem> accuratePass = footballTopStatsPerGameStatistics.getAccuratePass();
            if (accuratePass != null) {
                arrayList2.add(new qmj(string27, new ArrayList(a(string27, accuratePass))));
            }
            String string28 = context.getString(R.string.football_total_passes);
            string28.getClass();
            List<TopStatsItem> totalPass = footballTopStatsPerGameStatistics.getTotalPass();
            if (totalPass != null) {
                arrayList2.add(new qmj(string28, new ArrayList(a(string28, totalPass))));
            }
            String string29 = context.getString(R.string.football_successful_dribbles);
            string29.getClass();
            List<TopStatsItem> wonContest = footballTopStatsPerGameStatistics.getWonContest();
            if (wonContest != null) {
                arrayList2.add(new qmj(string29, new ArrayList(a(string29, wonContest))));
            }
            String string30 = context.getString(R.string.football_tackles);
            string30.getClass();
            List<TopStatsItem> totalTackle = footballTopStatsPerGameStatistics.getTotalTackle();
            if (totalTackle != null) {
                arrayList2.add(new qmj(string30, new ArrayList(a(string30, totalTackle))));
            }
            String string31 = context.getString(R.string.football_clearances);
            string31.getClass();
            List<TopStatsItem> totalClearance = footballTopStatsPerGameStatistics.getTotalClearance();
            if (totalClearance != null) {
                arrayList2.add(new qmj(string31, new ArrayList(a(string31, totalClearance))));
            }
            String string32 = context.getString(R.string.football_saves);
            string32.getClass();
            List<TopStatsItem> saves = footballTopStatsPerGameStatistics.getSaves();
            if (saves != null) {
                arrayList2.add(new qmj(string32, new ArrayList(a(string32, saves))));
            }
            String string33 = context.getString(R.string.football_goals_prevented);
            string33.getClass();
            List<TopStatsItem> goalsPrevented = footballTopStatsPerGameStatistics.getGoalsPrevented();
            if (goalsPrevented != null) {
                ArrayList arrayList7 = new ArrayList(k13.r(goalsPrevented, 10));
                for (TopStatsItem topStatsItem5 : goalsPrevented) {
                    arrayList7.add(new TopStatsItem(rei.b(2, Double.valueOf(Double.parseDouble(topStatsItem5.getStatistic()))), topStatsItem5.getPlayer(), topStatsItem5.getEvent()));
                }
                arrayList2.add(new qmj(string33, new ArrayList(a(string33, arrayList7))));
            }
            String string34 = context.getString(R.string.football_penalties_saved);
            string34.getClass();
            List<TopStatsItem> penaltySave = footballTopStatsPerGameStatistics.getPenaltySave();
            if (penaltySave != null) {
                arrayList2.add(new qmj(string34, new ArrayList(a(string34, penaltySave))));
            }
            String string35 = context.getString(R.string.football_penalties_missed);
            string35.getClass();
            List<TopStatsItem> penaltyMiss = footballTopStatsPerGameStatistics.getPenaltyMiss();
            if (penaltyMiss != null) {
                arrayList2.add(new qmj(string35, new ArrayList(a(string35, penaltyMiss))));
            }
            return arrayList2;
        }
        if (topPerformanceStatistics instanceof HandballTopStatsPerGameStatistics) {
            HandballTopStatsPerGameStatistics handballTopStatsPerGameStatistics = (HandballTopStatsPerGameStatistics) topPerformanceStatistics;
            ArrayList arrayList8 = new ArrayList();
            String string36 = context.getString(R.string.goals);
            string36.getClass();
            List<TopStatsItem> goals2 = handballTopStatsPerGameStatistics.getGoals();
            if (goals2 != null) {
                arrayList8.add(new qmj(string36, new ArrayList(a(string36, goals2))));
            }
            String string37 = context.getString(R.string.handball_assists);
            string37.getClass();
            List<TopStatsItem> assists2 = handballTopStatsPerGameStatistics.getAssists();
            if (assists2 != null) {
                arrayList8.add(new qmj(string37, new ArrayList(a(string37, assists2))));
            }
            String string38 = context.getString(R.string.m7_goals);
            string38.getClass();
            List<TopStatsItem> goals7m = handballTopStatsPerGameStatistics.getGoals7m();
            if (goals7m != null) {
                arrayList8.add(new qmj(string38, new ArrayList(a(string38, goals7m))));
            }
            String string39 = context.getString(R.string.steals);
            string39.getClass();
            List<TopStatsItem> steals2 = handballTopStatsPerGameStatistics.getSteals();
            if (steals2 != null) {
                arrayList8.add(new qmj(string39, new ArrayList(a(string39, steals2))));
            }
            String string40 = context.getString(R.string.two_min_penalty);
            string40.getClass();
            List<TopStatsItem> twoMinutePenalties = handballTopStatsPerGameStatistics.getTwoMinutePenalties();
            if (twoMinutePenalties != null) {
                arrayList8.add(new qmj(string40, new ArrayList(a(string40, twoMinutePenalties))));
            }
            String string41 = context.getString(R.string.handball_saves);
            string41.getClass();
            List<TopStatsItem> saves2 = handballTopStatsPerGameStatistics.getSaves();
            if (saves2 != null) {
                arrayList8.add(new qmj(string41, new ArrayList(a(string41, saves2))));
            }
            String string42 = context.getString(R.string.save_percentage);
            string42.getClass();
            List<TopStatsItem> goalkeeperEfficiencyPercentage = handballTopStatsPerGameStatistics.getGoalkeeperEfficiencyPercentage();
            if (goalkeeperEfficiencyPercentage != null) {
                ArrayList arrayList9 = new ArrayList(k13.r(goalkeeperEfficiencyPercentage, 10));
                for (TopStatsItem topStatsItem6 : goalkeeperEfficiencyPercentage) {
                    arrayList9.add(new TopStatsItem(rei.c(Double.valueOf(Double.parseDouble(topStatsItem6.getStatistic()) * 100.0d), 2, true), topStatsItem6.getPlayer(), topStatsItem6.getEvent()));
                }
                arrayList8.add(new qmj(string42, new ArrayList(a(string42, arrayList9))));
            }
            String string43 = context.getString(R.string.m7_saves);
            string43.getClass();
            List<TopStatsItem> gk7mSaves = handballTopStatsPerGameStatistics.getGk7mSaves();
            if (gk7mSaves != null) {
                arrayList8.add(new qmj(string43, new ArrayList(a(string43, gk7mSaves))));
            }
            return arrayList8;
        }
        if (!(topPerformanceStatistics instanceof IceHockeyTopStatsPerGameStatistics)) {
            if (!(topPerformanceStatistics instanceof VolleyballTopStatsPerGameStatistics)) {
                return km5.a;
            }
            VolleyballTopStatsPerGameStatistics volleyballTopStatsPerGameStatistics = (VolleyballTopStatsPerGameStatistics) topPerformanceStatistics;
            ArrayList arrayList10 = new ArrayList();
            String string44 = context.getString(R.string.volleyball_points);
            List<TopStatsItem> pointsTotal = volleyballTopStatsPerGameStatistics.getPointsTotal();
            if (pointsTotal != null) {
                string44.getClass();
                arrayList10.add(new qmj(string44, new ArrayList(a(string44, pointsTotal))));
            }
            String string45 = context.getString(R.string.volleyball_aces);
            List<TopStatsItem> aces = volleyballTopStatsPerGameStatistics.getAces();
            if (aces != null) {
                string45.getClass();
                arrayList10.add(new qmj(string45, new ArrayList(a(string45, aces))));
            }
            String string46 = context.getString(R.string.volleyball_block_points);
            List<TopStatsItem> blockPoints = volleyballTopStatsPerGameStatistics.getBlockPoints();
            if (blockPoints != null) {
                string46.getClass();
                arrayList10.add(new qmj(string46, new ArrayList(a(string46, blockPoints))));
            }
            String string47 = context.getString(R.string.volleyball_attack_points);
            List<TopStatsItem> attackPoints = volleyballTopStatsPerGameStatistics.getAttackPoints();
            if (attackPoints != null) {
                string47.getClass();
                arrayList10.add(new qmj(string47, new ArrayList(a(string47, attackPoints))));
            }
            return arrayList10;
        }
        IceHockeyTopStatsPerGameStatistics iceHockeyTopStatsPerGameStatistics = (IceHockeyTopStatsPerGameStatistics) topPerformanceStatistics;
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        String string48 = context.getString(R.string.points);
        string48.getClass();
        List<TopStatsItem> points2 = iceHockeyTopStatsPerGameStatistics.getPoints();
        if (points2 != null) {
            arrayList11.add(new qmj(string48, new ArrayList(a(string48, points2))));
        }
        String string49 = context.getString(R.string.goals);
        string49.getClass();
        List<TopStatsItem> goals3 = iceHockeyTopStatsPerGameStatistics.getGoals();
        if (goals3 != null) {
            arrayList11.add(new qmj(string49, new ArrayList(a(string49, goals3))));
        }
        String string50 = context.getString(R.string.ice_hockey_assists);
        string50.getClass();
        List<TopStatsItem> assists3 = iceHockeyTopStatsPerGameStatistics.getAssists();
        if (assists3 != null) {
            arrayList11.add(new qmj(string50, new ArrayList(a(string50, assists3))));
        }
        String string51 = context.getString(R.string.hockey_powerplay_goals);
        string51.getClass();
        List<TopStatsItem> powerPlayGoals = iceHockeyTopStatsPerGameStatistics.getPowerPlayGoals();
        if (powerPlayGoals != null) {
            arrayList11.add(new qmj(string51, new ArrayList(a(string51, powerPlayGoals))));
        }
        String string52 = context.getString(R.string.hockey_shorthanded_goals);
        string52.getClass();
        List<TopStatsItem> shortHandedGoals = iceHockeyTopStatsPerGameStatistics.getShortHandedGoals();
        if (shortHandedGoals != null) {
            arrayList11.add(new qmj(string52, new ArrayList(a(string52, shortHandedGoals))));
        }
        String string53 = context.getString(R.string.hockey_powerplay_assists);
        string53.getClass();
        List<TopStatsItem> powerPlayAssists = iceHockeyTopStatsPerGameStatistics.getPowerPlayAssists();
        if (powerPlayAssists != null) {
            arrayList11.add(new qmj(string53, new ArrayList(a(string53, powerPlayAssists))));
        }
        String string54 = context.getString(R.string.hockey_shorthanded_assists);
        string54.getClass();
        List<TopStatsItem> shortHandedAssists = iceHockeyTopStatsPerGameStatistics.getShortHandedAssists();
        if (shortHandedAssists != null) {
            arrayList11.add(new qmj(string54, new ArrayList(a(string54, shortHandedAssists))));
        }
        String string55 = context.getString(R.string.plus_minus);
        string55.getClass();
        List<TopStatsItem> plusMinus2 = iceHockeyTopStatsPerGameStatistics.getPlusMinus();
        if (plusMinus2 != null) {
            arrayList11.add(new qmj(string55, new ArrayList(a(string55, plusMinus2))));
        }
        String string56 = context.getString(R.string.time_on_ice);
        string56.getClass();
        List<TopStatsItem> secondsPlayed = iceHockeyTopStatsPerGameStatistics.getSecondsPlayed();
        if (secondsPlayed != null) {
            ArrayList arrayList13 = new ArrayList(k13.r(secondsPlayed, 10));
            for (TopStatsItem topStatsItem7 : secondsPlayed) {
                arrayList13.add(new TopStatsItem(rei.j(Integer.valueOf(Integer.parseInt(topStatsItem7.getStatistic())), 1), topStatsItem7.getPlayer(), topStatsItem7.getEvent()));
            }
            arrayList11.add(new qmj(string56, new ArrayList(a(string56, arrayList13))));
        }
        String string57 = context.getString(R.string.blocks);
        string57.getClass();
        List<TopStatsItem> blocked = iceHockeyTopStatsPerGameStatistics.getBlocked();
        if (blocked != null) {
            arrayList11.add(new qmj(string57, new ArrayList(a(string57, blocked))));
        }
        String string58 = context.getString(R.string.hits);
        string58.getClass();
        List<TopStatsItem> hits = iceHockeyTopStatsPerGameStatistics.getHits();
        if (hits != null) {
            arrayList11.add(new qmj(string58, new ArrayList(a(string58, hits))));
        }
        String string59 = context.getString(R.string.hockey_penalty_minutes);
        string59.getClass();
        List<TopStatsItem> penaltyMinutes = iceHockeyTopStatsPerGameStatistics.getPenaltyMinutes();
        if (penaltyMinutes != null) {
            arrayList11.add(new qmj(string59, new ArrayList(a(string59, penaltyMinutes))));
        }
        String string60 = context.getString(R.string.ice_hockey_saves);
        string60.getClass();
        List<TopStatsItem> saves3 = iceHockeyTopStatsPerGameStatistics.getSaves();
        if (saves3 != null) {
            arrayList12.add(new qmj(string60, new ArrayList(a(string60, saves3))));
        }
        String string61 = context.getString(R.string.even_saves);
        string61.getClass();
        List<TopStatsItem> evenSaves = iceHockeyTopStatsPerGameStatistics.getEvenSaves();
        if (evenSaves != null) {
            arrayList12.add(new qmj(string61, new ArrayList(a(string61, evenSaves))));
        }
        String string62 = context.getString(R.string.short_handed_saves);
        string62.getClass();
        List<TopStatsItem> shortHandedSaves = iceHockeyTopStatsPerGameStatistics.getShortHandedSaves();
        if (shortHandedSaves != null) {
            arrayList12.add(new qmj(string62, new ArrayList(a(string62, shortHandedSaves))));
        }
        String string63 = context.getString(R.string.power_play_saves);
        string63.getClass();
        List<TopStatsItem> powerPlaySaves = iceHockeyTopStatsPerGameStatistics.getPowerPlaySaves();
        if (powerPlaySaves != null) {
            arrayList12.add(new qmj(string63, new ArrayList(a(string63, powerPlaySaves))));
        }
        yre[] yreVarArr = yre.c;
        if (Intrinsics.c(str, "goalie")) {
            arrayList11.addAll(0, arrayList12);
            return arrayList11;
        }
        arrayList11.addAll(arrayList12);
        return arrayList11;
    }
}
