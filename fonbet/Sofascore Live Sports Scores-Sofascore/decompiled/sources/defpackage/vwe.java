package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FutsalPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.HandballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.IceHockeyPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.MiniFootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.RugbyPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.VolleyballPlayerSeasonStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vwe extends g7 {
    public final boolean l;
    public final Gender m;
    public final mqi n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwe(Context context, boolean z, Gender gender) {
        super(context);
        context.getClass();
        this.l = z;
        this.m = gender;
        this.n = ypa.b(new nzd(context, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0e75  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0e2a  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0e44  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(wyg wygVar, fzg fzgVar) {
        int i;
        int b;
        jei jeiVar;
        jei jeiVar2;
        jei jeiVar3;
        jei jeiVar4;
        jei jeiVar5;
        jei jeiVar6;
        jei jeiVar7;
        Integer ownGoals;
        jei jeiVar8;
        EventStatisticsItem.SpecialEventStatisticType specialEventStatisticType;
        String str;
        int b2;
        int b3;
        int b4;
        int b5;
        jei jeiVar9;
        jei jeiVar10;
        jei jeiVar11;
        jei jeiVar12;
        jei jeiVar13;
        jei jeiVar14;
        jei jeiVar15;
        List list;
        List list2;
        if (wygVar == null) {
            return;
        }
        Set set = jwe.a;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics = wygVar.a;
        String str2 = wygVar.b;
        Context context = this.b;
        context.getClass();
        abstractPlayerSeasonStatistics.getClass();
        if (abstractPlayerSeasonStatistics instanceof FootballPlayerSeasonStatistics) {
            list2 = nk8.a((FootballPlayerSeasonStatistics) abstractPlayerSeasonStatistics, context, str2, this.m);
        } else if (abstractPlayerSeasonStatistics instanceof MiniFootballPlayerSeasonStatistics) {
            MiniFootballPlayerSeasonStatistics miniFootballPlayerSeasonStatistics = (MiniFootballPlayerSeasonStatistics) abstractPlayerSeasonStatistics;
            ArrayList arrayList = new ArrayList();
            mqi mqiVar = bii.a;
            b5 = bii.b(Sports.MINI_FOOTBALL, false);
            String string = context.getString(b5);
            string.getClass();
            Integer appearances = miniFootballPlayerSeasonStatistics.getAppearances();
            if (appearances != null) {
                int intValue = appearances.intValue();
                String string2 = context.getString(R.string.matches_total);
                string2.getClass();
                jeiVar9 = new jei(string2, String.valueOf(intValue));
            } else {
                jeiVar9 = null;
            }
            Integer goals = miniFootballPlayerSeasonStatistics.getGoals();
            if (goals != null) {
                int intValue2 = goals.intValue();
                String string3 = context.getString(R.string.goals);
                string3.getClass();
                jeiVar10 = new jei(string3, String.valueOf(intValue2));
            } else {
                jeiVar10 = null;
            }
            Integer accumulatedPenaltyGoals = miniFootballPlayerSeasonStatistics.getAccumulatedPenaltyGoals();
            if (accumulatedPenaltyGoals != null) {
                int intValue3 = accumulatedPenaltyGoals.intValue();
                String string4 = context.getString(R.string.minifootball_accumulated_penalty);
                string4.getClass();
                jeiVar11 = new jei(string4, String.valueOf(intValue3));
            } else {
                jeiVar11 = null;
            }
            Integer assists = miniFootballPlayerSeasonStatistics.getAssists();
            if (assists != null) {
                int intValue4 = assists.intValue();
                String string5 = context.getString(R.string.football_assists);
                string5.getClass();
                jeiVar12 = new jei(string5, String.valueOf(intValue4));
            } else {
                jeiVar12 = null;
            }
            Integer penaltyGoals = miniFootballPlayerSeasonStatistics.getPenaltyGoals();
            if (penaltyGoals != null) {
                int intValue5 = penaltyGoals.intValue();
                String string6 = context.getString(R.string.football_penalty_goals);
                string6.getClass();
                Integer penaltyAttempts = miniFootballPlayerSeasonStatistics.getPenaltyAttempts();
                jeiVar13 = new jei(string6, penaltyAttempts != null ? fc6.g(intValue5, penaltyAttempts.intValue(), "/") : String.valueOf(intValue5));
            } else {
                jeiVar13 = null;
            }
            Integer ownGoals2 = miniFootballPlayerSeasonStatistics.getOwnGoals();
            if (ownGoals2 != null) {
                int intValue6 = ownGoals2.intValue();
                String string7 = context.getString(R.string.own_goals);
                string7.getClass();
                jeiVar14 = new jei(string7, String.valueOf(intValue6));
            } else {
                jeiVar14 = null;
            }
            Integer redCards = miniFootballPlayerSeasonStatistics.getRedCards();
            if (redCards != null) {
                int intValue7 = redCards.intValue();
                String string8 = context.getString(R.string.mini_football_red_cards);
                string8.getClass();
                jeiVar15 = new jei(string8, String.valueOf(intValue7));
            } else {
                jeiVar15 = null;
            }
            ezg.h(arrayList, string, ph0.x(new jei[]{jeiVar9, jeiVar10, jeiVar11, jeiVar12, jeiVar13, jeiVar14, jeiVar15}));
            list2 = arrayList;
        } else if (abstractPlayerSeasonStatistics instanceof BasketballPlayerSeasonStatistics) {
            BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics = (BasketballPlayerSeasonStatistics) abstractPlayerSeasonStatistics;
            int i2 = fzgVar == null ? -1 : sr1.a[fzgVar.ordinal()];
            if (i2 == 1) {
                ArrayList arrayList2 = new ArrayList();
                mqi mqiVar2 = bii.a;
                b2 = bii.b(Sports.BASKETBALL, false);
                String string9 = context.getString(b2);
                string9.getClass();
                ArrayList arrayList3 = new ArrayList();
                Integer appearances2 = basketballPlayerSeasonStatistics.getAppearances();
                if (appearances2 != null) {
                    int intValue8 = appearances2.intValue();
                    String string10 = context.getString(R.string.matches_total);
                    string10.getClass();
                    arrayList3.add(new jei(string10, String.valueOf(intValue8)));
                }
                ezg.h(arrayList2, string9, arrayList3);
                String string11 = context.getString(R.string.points_basketball);
                string11.getClass();
                ArrayList arrayList4 = new ArrayList();
                Integer points = basketballPlayerSeasonStatistics.getPoints();
                if (points != null) {
                    int intValue9 = points.intValue();
                    String string12 = context.getString(R.string.total);
                    string12.getClass();
                    arrayList4.add(new jei(string12, String.valueOf(intValue9)));
                }
                Integer freeThrowsMade = basketballPlayerSeasonStatistics.getFreeThrowsMade();
                if (freeThrowsMade != null) {
                    int intValue10 = freeThrowsMade.intValue();
                    String string13 = context.getString(R.string.free_throws);
                    string13.getClass();
                    arrayList4.add(new jei(string13, String.valueOf(intValue10)));
                }
                Integer twoPointsMade = basketballPlayerSeasonStatistics.getTwoPointsMade();
                if (twoPointsMade != null) {
                    int intValue11 = twoPointsMade.intValue();
                    String string14 = context.getString(R.string.two_pointers);
                    string14.getClass();
                    arrayList4.add(new jei(string14, String.valueOf(intValue11)));
                }
                Integer threePointsMade = basketballPlayerSeasonStatistics.getThreePointsMade();
                if (threePointsMade != null) {
                    int intValue12 = threePointsMade.intValue();
                    String string15 = context.getString(R.string.three_pointers);
                    string15.getClass();
                    arrayList4.add(new jei(string15, String.valueOf(intValue12)));
                }
                Integer fieldGoalsMade = basketballPlayerSeasonStatistics.getFieldGoalsMade();
                if (fieldGoalsMade != null) {
                    int intValue13 = fieldGoalsMade.intValue();
                    String string16 = context.getString(R.string.field_goals);
                    string16.getClass();
                    arrayList4.add(new jei(string16, String.valueOf(intValue13)));
                }
                ezg.h(arrayList2, string11, arrayList4);
                String string17 = context.getString(R.string.rebounds);
                string17.getClass();
                ArrayList arrayList5 = new ArrayList();
                Integer rebounds = basketballPlayerSeasonStatistics.getRebounds();
                if (rebounds != null) {
                    int intValue14 = rebounds.intValue();
                    String string18 = context.getString(R.string.total);
                    string18.getClass();
                    arrayList5.add(new jei(string18, String.valueOf(intValue14)));
                }
                Integer defensiveRebounds = basketballPlayerSeasonStatistics.getDefensiveRebounds();
                if (defensiveRebounds != null) {
                    int intValue15 = defensiveRebounds.intValue();
                    String string19 = context.getString(R.string.defensive_rebounds);
                    string19.getClass();
                    arrayList5.add(new jei(string19, String.valueOf(intValue15)));
                }
                Integer offensiveRebounds = basketballPlayerSeasonStatistics.getOffensiveRebounds();
                if (offensiveRebounds != null) {
                    int intValue16 = offensiveRebounds.intValue();
                    String string20 = context.getString(R.string.offensive_rebounds);
                    string20.getClass();
                    arrayList5.add(new jei(string20, String.valueOf(intValue16)));
                }
                ezg.h(arrayList2, string17, arrayList5);
                String string21 = context.getString(R.string.other);
                string21.getClass();
                ArrayList arrayList6 = new ArrayList();
                Integer assists2 = basketballPlayerSeasonStatistics.getAssists();
                if (assists2 != null) {
                    int intValue17 = assists2.intValue();
                    String string22 = context.getString(R.string.basketball_assists);
                    string22.getClass();
                    arrayList6.add(new jei(string22, String.valueOf(intValue17)));
                }
                Integer turnovers = basketballPlayerSeasonStatistics.getTurnovers();
                if (turnovers != null) {
                    int intValue18 = turnovers.intValue();
                    String string23 = context.getString(R.string.turnovers);
                    string23.getClass();
                    arrayList6.add(new jei(string23, String.valueOf(intValue18)));
                }
                Integer steals = basketballPlayerSeasonStatistics.getSteals();
                if (steals != null) {
                    int intValue19 = steals.intValue();
                    String string24 = context.getString(R.string.steals);
                    string24.getClass();
                    arrayList6.add(new jei(string24, String.valueOf(intValue19)));
                }
                Integer blocks = basketballPlayerSeasonStatistics.getBlocks();
                if (blocks != null) {
                    int intValue20 = blocks.intValue();
                    String string25 = context.getString(R.string.blocks);
                    string25.getClass();
                    arrayList6.add(new jei(string25, String.valueOf(intValue20)));
                }
                Integer personalFouls = basketballPlayerSeasonStatistics.getPersonalFouls();
                if (personalFouls != null) {
                    int intValue21 = personalFouls.intValue();
                    String string26 = context.getString(R.string.personal_fouls);
                    string26.getClass();
                    arrayList6.add(new jei(string26, String.valueOf(intValue21)));
                }
                Integer plusMinus = basketballPlayerSeasonStatistics.getPlusMinus();
                if (plusMinus != null) {
                    int intValue22 = plusMinus.intValue();
                    String string27 = context.getString(R.string.ice_hockey_lineups_plus_minus);
                    string27.getClass();
                    arrayList6.add(new jei(string27, String.valueOf(intValue22)));
                }
                Integer pir = basketballPlayerSeasonStatistics.getPir();
                if (pir != null) {
                    int intValue23 = pir.intValue();
                    String string28 = context.getString(R.string.performance_index_rating_long);
                    string28.getClass();
                    arrayList6.add(new jei(string28, String.valueOf(intValue23)));
                }
                tr1.a(arrayList6, basketballPlayerSeasonStatistics, context);
                ezg.h(arrayList2, string21, arrayList6);
                String string29 = context.getString(R.string.extra);
                string29.getClass();
                ezg.h(arrayList2, string29, tr1.b(basketballPlayerSeasonStatistics, context));
                list2 = arrayList2;
            } else if (i2 != 2) {
                ArrayList arrayList7 = new ArrayList();
                mqi mqiVar3 = bii.a;
                b4 = bii.b(Sports.BASKETBALL, false);
                String string30 = context.getString(b4);
                string30.getClass();
                ArrayList arrayList8 = new ArrayList();
                Integer appearances3 = basketballPlayerSeasonStatistics.getAppearances();
                if (appearances3 != null) {
                    int intValue24 = appearances3.intValue();
                    String string31 = context.getString(R.string.matches_total);
                    string31.getClass();
                    arrayList8.add(new jei(string31, String.valueOf(intValue24)));
                    Integer secondsPlayed = basketballPlayerSeasonStatistics.getSecondsPlayed();
                    if (secondsPlayed != null) {
                        if (secondsPlayed.intValue() <= 0) {
                            secondsPlayed = null;
                        }
                        if (secondsPlayed != null) {
                            int intValue25 = secondsPlayed.intValue();
                            String string32 = context.getString(R.string.basketball_minutes_per_game);
                            string32.getClass();
                            arrayList8.add(new jei(string32, rei.l(intValue24 * 60, Integer.valueOf(intValue25))));
                        }
                    }
                }
                ezg.h(arrayList7, string30, arrayList8);
                String string33 = context.getString(R.string.points_per_game);
                string33.getClass();
                ezg.h(arrayList7, string33, tr1.c(basketballPlayerSeasonStatistics, context));
                String string34 = context.getString(R.string.rebounds_per_game);
                string34.getClass();
                ezg.h(arrayList7, string34, tr1.d(basketballPlayerSeasonStatistics, context));
                String string35 = context.getString(R.string.other_per_game);
                string35.getClass();
                ArrayList arrayList9 = new ArrayList();
                Integer appearances4 = basketballPlayerSeasonStatistics.getAppearances();
                if (appearances4 != null) {
                    int intValue26 = appearances4.intValue();
                    Integer assists3 = basketballPlayerSeasonStatistics.getAssists();
                    if (assists3 != null) {
                        int intValue27 = assists3.intValue();
                        String string36 = context.getString(R.string.basketball_assists);
                        arrayList9.add(new jei(string36, fn0.j(intValue27, intValue26, string36)));
                    }
                    Integer turnovers2 = basketballPlayerSeasonStatistics.getTurnovers();
                    if (turnovers2 != null) {
                        int intValue28 = turnovers2.intValue();
                        String string37 = context.getString(R.string.turnovers);
                        arrayList9.add(new jei(string37, fn0.j(intValue28, intValue26, string37)));
                    }
                    Integer steals2 = basketballPlayerSeasonStatistics.getSteals();
                    if (steals2 != null) {
                        int intValue29 = steals2.intValue();
                        String string38 = context.getString(R.string.steals);
                        arrayList9.add(new jei(string38, fn0.j(intValue29, intValue26, string38)));
                    }
                    Double assistTurnoverRatio = basketballPlayerSeasonStatistics.getAssistTurnoverRatio();
                    if (assistTurnoverRatio != null) {
                        double doubleValue = assistTurnoverRatio.doubleValue();
                        String string39 = context.getString(R.string.assist_to_turnover_ratio);
                        string39.getClass();
                        arrayList9.add(new jei(string39, rei.b(2, Double.valueOf(doubleValue))));
                    }
                    Integer blocks2 = basketballPlayerSeasonStatistics.getBlocks();
                    if (blocks2 != null) {
                        int intValue30 = blocks2.intValue();
                        String string40 = context.getString(R.string.blocks);
                        arrayList9.add(new jei(string40, fn0.j(intValue30, intValue26, string40)));
                    }
                    Integer personalFouls2 = basketballPlayerSeasonStatistics.getPersonalFouls();
                    if (personalFouls2 != null) {
                        int intValue31 = personalFouls2.intValue();
                        String string41 = context.getString(R.string.personal_fouls);
                        arrayList9.add(new jei(string41, fn0.j(intValue31, intValue26, string41)));
                    }
                    Integer plusMinus2 = basketballPlayerSeasonStatistics.getPlusMinus();
                    if (plusMinus2 != null) {
                        int intValue32 = plusMinus2.intValue();
                        String string42 = context.getString(R.string.ice_hockey_lineups_plus_minus);
                        arrayList9.add(new jei(string42, fn0.j(intValue32, intValue26, string42)));
                    }
                    Integer pir2 = basketballPlayerSeasonStatistics.getPir();
                    if (pir2 != null) {
                        int intValue33 = pir2.intValue();
                        String string43 = context.getString(R.string.performance_index_rating_long);
                        arrayList9.add(new jei(string43, fn0.j(intValue33, intValue26, string43)));
                    }
                    tr1.a(arrayList9, basketballPlayerSeasonStatistics, context);
                }
                ezg.h(arrayList7, string35, arrayList9);
                String string44 = context.getString(R.string.extra);
                string44.getClass();
                ezg.h(arrayList7, string44, tr1.b(basketballPlayerSeasonStatistics, context));
                list2 = arrayList7;
            } else {
                ArrayList arrayList10 = new ArrayList();
                mqi mqiVar4 = bii.a;
                b3 = bii.b(Sports.BASKETBALL, false);
                String string45 = context.getString(b3);
                string45.getClass();
                ArrayList arrayList11 = new ArrayList();
                Integer appearances5 = basketballPlayerSeasonStatistics.getAppearances();
                if (appearances5 != null) {
                    int intValue34 = appearances5.intValue();
                    Integer secondsPlayed2 = basketballPlayerSeasonStatistics.getSecondsPlayed();
                    if (secondsPlayed2 != null) {
                        if (secondsPlayed2.intValue() <= 0) {
                            secondsPlayed2 = null;
                        }
                        if (secondsPlayed2 != null) {
                            int intValue35 = secondsPlayed2.intValue();
                            String string46 = context.getString(R.string.minutes);
                            string46.getClass();
                            arrayList11.add(new jei(string46, rei.l(intValue34 * 60, Integer.valueOf(intValue35))));
                        }
                    }
                }
                ezg.h(arrayList10, string45, arrayList11);
                String string47 = context.getString(R.string.points_basketball);
                string47.getClass();
                ezg.h(arrayList10, string47, tr1.c(basketballPlayerSeasonStatistics, context));
                String string48 = context.getString(R.string.rebounds);
                string48.getClass();
                ezg.h(arrayList10, string48, tr1.d(basketballPlayerSeasonStatistics, context));
                String string49 = context.getString(R.string.other);
                string49.getClass();
                ArrayList arrayList12 = new ArrayList();
                Integer appearances6 = basketballPlayerSeasonStatistics.getAppearances();
                if (appearances6 != null) {
                    int intValue36 = appearances6.intValue();
                    Integer assists4 = basketballPlayerSeasonStatistics.getAssists();
                    if (assists4 != null) {
                        int intValue37 = assists4.intValue();
                        String string50 = context.getString(R.string.basketball_assists);
                        arrayList12.add(new jei(string50, fn0.j(intValue37, intValue36, string50)));
                    }
                    Integer turnovers3 = basketballPlayerSeasonStatistics.getTurnovers();
                    if (turnovers3 != null) {
                        int intValue38 = turnovers3.intValue();
                        String string51 = context.getString(R.string.turnovers);
                        arrayList12.add(new jei(string51, fn0.j(intValue38, intValue36, string51)));
                    }
                    Integer steals3 = basketballPlayerSeasonStatistics.getSteals();
                    if (steals3 != null) {
                        int intValue39 = steals3.intValue();
                        String string52 = context.getString(R.string.steals);
                        arrayList12.add(new jei(string52, fn0.j(intValue39, intValue36, string52)));
                    }
                    Integer blocks3 = basketballPlayerSeasonStatistics.getBlocks();
                    if (blocks3 != null) {
                        int intValue40 = blocks3.intValue();
                        String string53 = context.getString(R.string.blocks);
                        arrayList12.add(new jei(string53, fn0.j(intValue40, intValue36, string53)));
                    }
                    Integer personalFouls3 = basketballPlayerSeasonStatistics.getPersonalFouls();
                    if (personalFouls3 != null) {
                        int intValue41 = personalFouls3.intValue();
                        String string54 = context.getString(R.string.personal_fouls);
                        arrayList12.add(new jei(string54, fn0.j(intValue41, intValue36, string54)));
                    }
                    Integer plusMinus3 = basketballPlayerSeasonStatistics.getPlusMinus();
                    if (plusMinus3 != null) {
                        int intValue42 = plusMinus3.intValue();
                        String string55 = context.getString(R.string.ice_hockey_lineups_plus_minus);
                        arrayList12.add(new jei(string55, fn0.j(intValue42, intValue36, string55)));
                    }
                    Integer pir3 = basketballPlayerSeasonStatistics.getPir();
                    if (pir3 != null) {
                        int intValue43 = pir3.intValue();
                        String string56 = context.getString(R.string.performance_index_rating_long);
                        arrayList12.add(new jei(string56, fn0.j(intValue43, intValue36, string56)));
                    }
                    tr1.a(arrayList12, basketballPlayerSeasonStatistics, context);
                }
                ezg.h(arrayList10, string49, arrayList12);
                list2 = arrayList10;
            }
        } else {
            if (!(abstractPlayerSeasonStatistics instanceof IceHockeyPlayerSeasonStatistics)) {
                if (abstractPlayerSeasonStatistics instanceof HandballPlayerSeasonStatistics) {
                    HandballPlayerSeasonStatistics handballPlayerSeasonStatistics = (HandballPlayerSeasonStatistics) abstractPlayerSeasonStatistics;
                    handballPlayerSeasonStatistics.getClass();
                    context.getClass();
                    ArrayList arrayList13 = new ArrayList();
                    if (handballPlayerSeasonStatistics.shouldShowAttacking()) {
                        String string57 = context.getString(R.string.handball_attacking);
                        string57.getClass();
                        ArrayList arrayList14 = new ArrayList();
                        Integer goals2 = handballPlayerSeasonStatistics.getGoals();
                        if (goals2 != null) {
                            int intValue44 = goals2.intValue();
                            String string58 = context.getString(R.string.goals);
                            string58.getClass();
                            Double shootingEfficiencyPercentage = handballPlayerSeasonStatistics.getShootingEfficiencyPercentage();
                            arrayList14.add(new jei(string58, shootingEfficiencyPercentage != null ? intValue44 + " (" + mz1.i(wzb.a(shootingEfficiencyPercentage.doubleValue()), "%") + ")" : String.valueOf(intValue44), null));
                        }
                        Integer assists5 = handballPlayerSeasonStatistics.getAssists();
                        if (assists5 != null) {
                            int intValue45 = assists5.intValue();
                            String string59 = context.getString(R.string.handball_assists);
                            string59.getClass();
                            arrayList14.add(new jei(string59, String.valueOf(intValue45), null));
                        }
                        Integer goals7m = handballPlayerSeasonStatistics.getGoals7m();
                        if (goals7m != null) {
                            int intValue46 = goals7m.intValue();
                            String string60 = context.getString(R.string.m7_goals);
                            string60.getClass();
                            arrayList14.add(new jei(string60, rei.f(intValue46, 0, handballPlayerSeasonStatistics.getShots7m()), null));
                        }
                        Integer goals6m = handballPlayerSeasonStatistics.getGoals6m();
                        if (goals6m != null) {
                            int intValue47 = goals6m.intValue();
                            String string61 = context.getString(R.string.m6_goals);
                            string61.getClass();
                            arrayList14.add(new jei(string61, rei.f(intValue47, 0, handballPlayerSeasonStatistics.getShots6m()), null));
                        }
                        Integer goals9m = handballPlayerSeasonStatistics.getGoals9m();
                        if (goals9m != null) {
                            int intValue48 = goals9m.intValue();
                            String string62 = context.getString(R.string.m9_goals);
                            string62.getClass();
                            specialEventStatisticType = null;
                            arrayList14.add(new jei(string62, rei.f(intValue48, 0, handballPlayerSeasonStatistics.getShots9m()), null));
                        } else {
                            specialEventStatisticType = null;
                        }
                        Integer steals4 = handballPlayerSeasonStatistics.getSteals();
                        if (steals4 != null) {
                            int intValue49 = steals4.intValue();
                            String string63 = context.getString(R.string.steals);
                            string63.getClass();
                            arrayList14.add(new jei(string63, String.valueOf(intValue49), specialEventStatisticType));
                        }
                        Integer twoMinutePenalties = handballPlayerSeasonStatistics.getTwoMinutePenalties();
                        if (twoMinutePenalties != null) {
                            int intValue50 = twoMinutePenalties.intValue();
                            String string64 = context.getString(R.string.two_min_penalty);
                            string64.getClass();
                            arrayList14.add(new jei(string64, String.valueOf(intValue50), null));
                        }
                        ezg.g(arrayList13, string57, arrayList14, km5.a);
                    }
                    list2 = arrayList13;
                    if (handballPlayerSeasonStatistics.shouldShowGoalkeeping()) {
                        String string65 = context.getString(R.string.goalkeeping);
                        string65.getClass();
                        ArrayList arrayList15 = new ArrayList();
                        Integer saves = handballPlayerSeasonStatistics.getSaves();
                        if (saves != null) {
                            int intValue51 = saves.intValue();
                            String string66 = context.getString(R.string.handball_saves);
                            string66.getClass();
                            arrayList15.add(new jei(string66, String.valueOf(intValue51), null));
                        }
                        Double goalkeeperEfficiencyPercentage = handballPlayerSeasonStatistics.getGoalkeeperEfficiencyPercentage();
                        if (goalkeeperEfficiencyPercentage != null) {
                            double doubleValue2 = goalkeeperEfficiencyPercentage.doubleValue();
                            String string67 = context.getString(R.string.save_percentage);
                            string67.getClass();
                            arrayList15.add(new jei(string67, rei.e(Double.valueOf(doubleValue2), 0, 6), null));
                        }
                        Integer gk7mSaves = handballPlayerSeasonStatistics.getGk7mSaves();
                        if (gk7mSaves != null) {
                            int intValue52 = gk7mSaves.intValue();
                            String string68 = context.getString(R.string.m7_saves);
                            string68.getClass();
                            arrayList15.add(new jei(string68, rei.f(intValue52, 0, handballPlayerSeasonStatistics.getGk7mShots()), null));
                        }
                        Integer gk6mSaves = handballPlayerSeasonStatistics.getGk6mSaves();
                        if (gk6mSaves != null) {
                            int intValue53 = gk6mSaves.intValue();
                            String string69 = context.getString(R.string.m6_saves);
                            string69.getClass();
                            arrayList15.add(new jei(string69, rei.f(intValue53, 0, handballPlayerSeasonStatistics.getGk6mShots()), null));
                        }
                        Integer gk9mSaves = handballPlayerSeasonStatistics.getGk9mSaves();
                        if (gk9mSaves != null) {
                            int intValue54 = gk9mSaves.intValue();
                            String string70 = context.getString(R.string.m9_saves);
                            string70.getClass();
                            i = 0;
                            arrayList15.add(new jei(string70, rei.f(intValue54, 0, handballPlayerSeasonStatistics.getGk9mShots()), null));
                        } else {
                            i = 0;
                        }
                        ezg.g(arrayList13, string65, arrayList15, km5.a);
                        list = arrayList13;
                    }
                } else {
                    i = 0;
                    if (abstractPlayerSeasonStatistics instanceof AmericanFootballPlayerSeasonStatistics) {
                        list = zt.i((AmericanFootballPlayerSeasonStatistics) abstractPlayerSeasonStatistics, context, str2, fzgVar != fzg.e);
                    } else if (abstractPlayerSeasonStatistics instanceof FutsalPlayerSeasonStatistics) {
                        FutsalPlayerSeasonStatistics futsalPlayerSeasonStatistics = (FutsalPlayerSeasonStatistics) abstractPlayerSeasonStatistics;
                        ArrayList arrayList16 = new ArrayList();
                        mqi mqiVar5 = bii.a;
                        b = bii.b(Sports.FUTSAL, false);
                        String string71 = context.getString(b);
                        string71.getClass();
                        Integer appearances7 = futsalPlayerSeasonStatistics.getAppearances();
                        if (appearances7 != null) {
                            int intValue55 = appearances7.intValue();
                            String string72 = context.getString(R.string.match_appearances);
                            string72.getClass();
                            jeiVar = new jei(string72, String.valueOf(intValue55));
                        } else {
                            jeiVar = null;
                        }
                        Integer goals3 = futsalPlayerSeasonStatistics.getGoals();
                        if (goals3 != null) {
                            int intValue56 = goals3.intValue();
                            String string73 = context.getString(R.string.goals);
                            string73.getClass();
                            jeiVar2 = new jei(string73, String.valueOf(intValue56));
                        } else {
                            jeiVar2 = null;
                        }
                        Integer assists6 = futsalPlayerSeasonStatistics.getAssists();
                        if (assists6 != null) {
                            int intValue57 = assists6.intValue();
                            String string74 = context.getString(R.string.football_assists);
                            string74.getClass();
                            jeiVar3 = new jei(string74, String.valueOf(intValue57));
                        } else {
                            jeiVar3 = null;
                        }
                        Integer yellowCards = futsalPlayerSeasonStatistics.getYellowCards();
                        if (yellowCards != null) {
                            int intValue58 = yellowCards.intValue();
                            String string75 = context.getString(R.string.football_yellow_cards);
                            string75.getClass();
                            jeiVar4 = new jei(string75, String.valueOf(intValue58));
                        } else {
                            jeiVar4 = null;
                        }
                        Integer redCards2 = futsalPlayerSeasonStatistics.getRedCards();
                        if (redCards2 != null) {
                            int intValue59 = redCards2.intValue();
                            String string76 = context.getString(R.string.futsal_red_cards);
                            string76.getClass();
                            jeiVar5 = new jei(string76, String.valueOf(intValue59));
                        } else {
                            jeiVar5 = null;
                        }
                        Integer penaltyGoals2 = futsalPlayerSeasonStatistics.getPenaltyGoals();
                        if (penaltyGoals2 != null) {
                            int intValue60 = penaltyGoals2.intValue();
                            String string77 = context.getString(R.string.football_penalty_goals);
                            string77.getClass();
                            Integer penaltyAttempts2 = futsalPlayerSeasonStatistics.getPenaltyAttempts();
                            if (penaltyAttempts2 == null || penaltyAttempts2.intValue() <= 0) {
                                penaltyAttempts2 = null;
                            }
                            jeiVar6 = new jei(string77, penaltyAttempts2 != null ? fc6.g(intValue60, penaltyAttempts2.intValue(), "/") : String.valueOf(intValue60));
                        } else {
                            jeiVar6 = null;
                        }
                        Integer accumulatedPenaltyGoals2 = futsalPlayerSeasonStatistics.getAccumulatedPenaltyGoals();
                        if (accumulatedPenaltyGoals2 != null) {
                            if (accumulatedPenaltyGoals2.intValue() <= 0) {
                                accumulatedPenaltyGoals2 = null;
                            }
                            if (accumulatedPenaltyGoals2 != null) {
                                int intValue61 = accumulatedPenaltyGoals2.intValue();
                                String string78 = context.getString(R.string.futsal_accumulated_penalty_goals);
                                string78.getClass();
                                jeiVar7 = new jei(string78, String.valueOf(intValue61));
                                ownGoals = futsalPlayerSeasonStatistics.getOwnGoals();
                                if (ownGoals == null) {
                                    int intValue62 = ownGoals.intValue();
                                    String string79 = context.getString(R.string.own_goals);
                                    string79.getClass();
                                    jeiVar8 = new jei(string79, String.valueOf(intValue62));
                                } else {
                                    jeiVar8 = null;
                                }
                                ezg.h(arrayList16, string71, ph0.x(new jei[]{jeiVar, jeiVar2, jeiVar3, jeiVar4, jeiVar5, jeiVar6, jeiVar7, jeiVar8}));
                                list = arrayList16;
                            }
                        }
                        jeiVar7 = null;
                        ownGoals = futsalPlayerSeasonStatistics.getOwnGoals();
                        if (ownGoals == null) {
                        }
                        ezg.h(arrayList16, string71, ph0.x(new jei[]{jeiVar, jeiVar2, jeiVar3, jeiVar4, jeiVar5, jeiVar6, jeiVar7, jeiVar8}));
                        list = arrayList16;
                    } else {
                        list = abstractPlayerSeasonStatistics instanceof RugbyPlayerSeasonStatistics ? s9g.a((RugbyPlayerSeasonStatistics) abstractPlayerSeasonStatistics, context, fzgVar) : abstractPlayerSeasonStatistics instanceof VolleyballPlayerSeasonStatistics ? u0a.H((VolleyballPlayerSeasonStatistics) abstractPlayerSeasonStatistics, context, fzgVar) : km5.a;
                    }
                }
                int i3 = i;
                for (Object obj : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw null;
                    }
                    if ((obj instanceof jei) && !(CollectionsKt.a0(i4, list) instanceof jei)) {
                        ((jei) obj).d = true;
                    }
                    i3 = i4;
                }
                F(list);
            }
            IceHockeyPlayerSeasonStatistics iceHockeyPlayerSeasonStatistics = (IceHockeyPlayerSeasonStatistics) abstractPlayerSeasonStatistics;
            boolean c = Intrinsics.c(str2, "G");
            xbb b6 = a.b();
            String string80 = context.getString(R.string.ice_hockey_stat_category_overall);
            string80.getClass();
            xbb b7 = a.b();
            if (c) {
                ezg.b(b7, context, R.string.games_played, iceHockeyPlayerSeasonStatistics.getAppearances());
                Double goalsAgainstAverage = iceHockeyPlayerSeasonStatistics.getGoalsAgainstAverage();
                if (goalsAgainstAverage != null) {
                    double doubleValue3 = goalsAgainstAverage.doubleValue();
                    String string81 = context.getString(R.string.goals_against_average);
                    string81.getClass();
                    b7.add(new jei(string81, rei.b(2, Double.valueOf(doubleValue3))));
                }
                ezg.b(b7, context, R.string.shots_against, iceHockeyPlayerSeasonStatistics.getShotsAgainst());
                ezg.b(b7, context, R.string.ice_hockey_saves, iceHockeyPlayerSeasonStatistics.getSaves());
                hz8.z(b7, context, R.string.legend_hockey_save_pct, iceHockeyPlayerSeasonStatistics.getSavePercentage());
                Integer goals4 = iceHockeyPlayerSeasonStatistics.getGoals();
                if (goals4 == null || goals4.intValue() == 0) {
                    goals4 = null;
                }
                ezg.b(b7, context, R.string.goals, goals4);
                Integer assists7 = iceHockeyPlayerSeasonStatistics.getAssists();
                if (assists7 == null || assists7.intValue() == 0) {
                    assists7 = null;
                }
                ezg.b(b7, context, R.string.ice_hockey_assists, assists7);
                Integer points2 = iceHockeyPlayerSeasonStatistics.getPoints();
                if (points2 == null || points2.intValue() == 0) {
                    points2 = null;
                }
                ezg.b(b7, context, R.string.points, points2);
                Integer gameWinningGoals = iceHockeyPlayerSeasonStatistics.getGameWinningGoals();
                if (gameWinningGoals == null || gameWinningGoals.intValue() == 0) {
                    gameWinningGoals = null;
                }
                ezg.b(b7, context, R.string.game_winning_goals, gameWinningGoals);
                Integer overTimeGoals = iceHockeyPlayerSeasonStatistics.getOverTimeGoals();
                if (overTimeGoals == null || overTimeGoals.intValue() == 0) {
                    overTimeGoals = null;
                }
                ezg.b(b7, context, R.string.over_time_goals, overTimeGoals);
                Integer shots = iceHockeyPlayerSeasonStatistics.getShots();
                if (shots == null || shots.intValue() == 0) {
                    shots = null;
                }
                ezg.b(b7, context, R.string.hockey_shots_on_goal, shots);
                ezg.b(b7, context, R.string.wins, iceHockeyPlayerSeasonStatistics.getWins());
                ezg.b(b7, context, R.string.hockey_penalty_minutes, iceHockeyPlayerSeasonStatistics.getPenaltyMinutes());
                ezg.b(b7, context, R.string.hockey_shutouts, iceHockeyPlayerSeasonStatistics.getShutouts());
            } else {
                ezg.b(b7, context, R.string.games_played, iceHockeyPlayerSeasonStatistics.getAppearances());
                Double a = yid.a(iceHockeyPlayerSeasonStatistics.getTimeOnIce(), iceHockeyPlayerSeasonStatistics.getAppearances());
                ezg.f(b7, context, R.string.time_on_ice_per_game, a != null ? Integer.valueOf(wzb.a(a.doubleValue())) : null);
                ezg.b(b7, context, R.string.goals, iceHockeyPlayerSeasonStatistics.getGoals());
                ezg.b(b7, context, R.string.ice_hockey_assists, iceHockeyPlayerSeasonStatistics.getAssists());
                ezg.b(b7, context, R.string.points, iceHockeyPlayerSeasonStatistics.getPoints());
                Integer plusMinus4 = iceHockeyPlayerSeasonStatistics.getPlusMinus();
                if (plusMinus4 != null) {
                    int intValue63 = plusMinus4.intValue();
                    str = intValue63 > 0 ? ljg.j(intValue63, "+") : String.valueOf(intValue63);
                } else {
                    str = null;
                }
                ezg.a(b7, context, R.string.legend_hockey_plus_minus, str);
                ezg.b(b7, context, R.string.hockey_shots_on_goal, iceHockeyPlayerSeasonStatistics.getShots());
                ezg.c(b7, context, R.string.shot_percentage, iceHockeyPlayerSeasonStatistics.getShotPercentage(), 24);
                ezg.b(b7, context, R.string.game_winning_goals, iceHockeyPlayerSeasonStatistics.getGameWinningGoals());
                ezg.b(b7, context, R.string.over_time_goals, iceHockeyPlayerSeasonStatistics.getOverTimeGoals());
            }
            ezg.h(b6, string80, a.a(b7));
            if (!c) {
                String string82 = context.getString(R.string.ice_hockey_stat_category_defensive);
                string82.getClass();
                xbb b8 = a.b();
                ezg.b(b8, context, R.string.hockey_penalty_minutes, iceHockeyPlayerSeasonStatistics.getPenaltyMinutes());
                ezg.b(b8, context, R.string.hockey_blocked_shots, iceHockeyPlayerSeasonStatistics.getBlocked());
                ezg.b(b8, context, R.string.hits, iceHockeyPlayerSeasonStatistics.getHits());
                ezg.h(b6, string82, a.a(b8));
            }
            String string83 = context.getString(R.string.ice_hockey_stat_category_power_play);
            string83.getClass();
            xbb b9 = a.b();
            if (c) {
                ezg.b(b9, context, R.string.power_play_saves, iceHockeyPlayerSeasonStatistics.getPowerPlaySaves());
                hz8.z(b9, context, R.string.hockey_power_play_save_pct, iceHockeyPlayerSeasonStatistics.getPowerPlaySavePercentage());
                Integer powerPlayGoals = iceHockeyPlayerSeasonStatistics.getPowerPlayGoals();
                if (powerPlayGoals == null || powerPlayGoals.intValue() == 0) {
                    powerPlayGoals = null;
                }
                ezg.b(b9, context, R.string.hockey_powerplay_goals, powerPlayGoals);
                Integer powerPlayAssists = iceHockeyPlayerSeasonStatistics.getPowerPlayAssists();
                if (powerPlayAssists == null || powerPlayAssists.intValue() == 0) {
                    powerPlayAssists = null;
                }
                ezg.b(b9, context, R.string.hockey_powerplay_assists, powerPlayAssists);
                Integer powerPlayPoints = iceHockeyPlayerSeasonStatistics.getPowerPlayPoints();
                if (powerPlayPoints == null || powerPlayPoints.intValue() == 0) {
                    powerPlayPoints = null;
                }
                ezg.b(b9, context, R.string.hockey_powerplay_points, powerPlayPoints);
                Integer powerPlayShots = iceHockeyPlayerSeasonStatistics.getPowerPlayShots();
                if (powerPlayShots == null || powerPlayShots.intValue() == 0) {
                    powerPlayShots = null;
                }
                ezg.b(b9, context, R.string.power_play_shots, powerPlayShots);
            } else {
                Double a2 = yid.a(iceHockeyPlayerSeasonStatistics.getPowerPlayTimeOnIce(), iceHockeyPlayerSeasonStatistics.getAppearances());
                ezg.f(b9, context, R.string.hockey_powerplay_average_time_on_ice, a2 != null ? Integer.valueOf(wzb.a(a2.doubleValue())) : null);
                ezg.b(b9, context, R.string.hockey_powerplay_goals, iceHockeyPlayerSeasonStatistics.getPowerPlayGoals());
                ezg.b(b9, context, R.string.hockey_powerplay_assists, iceHockeyPlayerSeasonStatistics.getPowerPlayAssists());
                ezg.b(b9, context, R.string.hockey_powerplay_points, iceHockeyPlayerSeasonStatistics.getPowerPlayPoints());
                ezg.b(b9, context, R.string.power_play_shots, iceHockeyPlayerSeasonStatistics.getPowerPlayShots());
            }
            ezg.h(b6, string83, a.a(b9));
            String string84 = context.getString(R.string.ice_hockey_stat_category_shorthanded);
            string84.getClass();
            xbb b10 = a.b();
            if (c) {
                ezg.b(b10, context, R.string.ice_hockey_shorthanded_saves, iceHockeyPlayerSeasonStatistics.getShortHandedSaves());
                hz8.z(b10, context, R.string.hockey_shorthanded_save_pct, iceHockeyPlayerSeasonStatistics.getShortHandedSavePercentage());
                Integer shortHandedGoals = iceHockeyPlayerSeasonStatistics.getShortHandedGoals();
                if (shortHandedGoals == null || shortHandedGoals.intValue() == 0) {
                    shortHandedGoals = null;
                }
                ezg.b(b10, context, R.string.hockey_shorthanded_goals, shortHandedGoals);
                Integer shortHandedAssists = iceHockeyPlayerSeasonStatistics.getShortHandedAssists();
                if (shortHandedAssists == null || shortHandedAssists.intValue() == 0) {
                    shortHandedAssists = null;
                }
                ezg.b(b10, context, R.string.hockey_shorthanded_assists, shortHandedAssists);
                Integer shortHandedPoints = iceHockeyPlayerSeasonStatistics.getShortHandedPoints();
                if (shortHandedPoints == null || shortHandedPoints.intValue() == 0) {
                    shortHandedPoints = null;
                }
                ezg.b(b10, context, R.string.short_handed_points, shortHandedPoints);
                Integer shortHandedShots = iceHockeyPlayerSeasonStatistics.getShortHandedShots();
                if (shortHandedShots == null || shortHandedShots.intValue() == 0) {
                    shortHandedShots = null;
                }
                ezg.b(b10, context, R.string.short_handed_shots, shortHandedShots);
            } else {
                Double a3 = yid.a(iceHockeyPlayerSeasonStatistics.getShortHandedTimeOnIce(), iceHockeyPlayerSeasonStatistics.getAppearances());
                ezg.f(b10, context, R.string.hockey_shorthanded_average_time_on_ice, a3 != null ? Integer.valueOf(wzb.a(a3.doubleValue())) : null);
                ezg.b(b10, context, R.string.hockey_shorthanded_goals, iceHockeyPlayerSeasonStatistics.getShortHandedGoals());
                ezg.b(b10, context, R.string.hockey_shorthanded_assists, iceHockeyPlayerSeasonStatistics.getShortHandedAssists());
                ezg.b(b10, context, R.string.short_handed_points, iceHockeyPlayerSeasonStatistics.getShortHandedPoints());
                ezg.b(b10, context, R.string.short_handed_shots, iceHockeyPlayerSeasonStatistics.getShortHandedShots());
            }
            ezg.h(b6, string84, a.a(b10));
            String string85 = context.getString(R.string.ice_hockey_stat_category_even_strength);
            string85.getClass();
            xbb b11 = a.b();
            if (c) {
                ezg.b(b11, context, R.string.ice_hockey_even_strength_saves, iceHockeyPlayerSeasonStatistics.getEvenSaves());
                hz8.z(b11, context, R.string.hockey_even_save_percentage, iceHockeyPlayerSeasonStatistics.getEvenSavePercentage());
                Integer evenGoals = iceHockeyPlayerSeasonStatistics.getEvenGoals();
                if (evenGoals == null || evenGoals.intValue() == 0) {
                    evenGoals = null;
                }
                ezg.b(b11, context, R.string.ice_hockey_even_strength_goals, evenGoals);
                Integer evenAssists = iceHockeyPlayerSeasonStatistics.getEvenAssists();
                if (evenAssists == null || evenAssists.intValue() == 0) {
                    evenAssists = null;
                }
                ezg.b(b11, context, R.string.ice_hockey_even_strength_assists, evenAssists);
                Integer evenPoints = iceHockeyPlayerSeasonStatistics.getEvenPoints();
                if (evenPoints == null || evenPoints.intValue() == 0) {
                    evenPoints = null;
                }
                ezg.b(b11, context, R.string.ice_hockey_even_strength_points, evenPoints);
                Integer evenShots = iceHockeyPlayerSeasonStatistics.getEvenShots();
                if (evenShots == null || evenShots.intValue() == 0) {
                    evenShots = null;
                }
                ezg.b(b11, context, R.string.ice_hockey_even_strength_shots_on_goal, evenShots);
            } else {
                Double a4 = yid.a(iceHockeyPlayerSeasonStatistics.getEvenTimeOnIce(), iceHockeyPlayerSeasonStatistics.getAppearances());
                ezg.f(b11, context, R.string.hockey_even_strength_average_time_on_ice, a4 != null ? Integer.valueOf(wzb.a(a4.doubleValue())) : null);
                ezg.b(b11, context, R.string.ice_hockey_even_strength_goals, iceHockeyPlayerSeasonStatistics.getEvenGoals());
                ezg.b(b11, context, R.string.ice_hockey_even_strength_assists, iceHockeyPlayerSeasonStatistics.getEvenAssists());
                ezg.b(b11, context, R.string.ice_hockey_even_strength_points, iceHockeyPlayerSeasonStatistics.getEvenPoints());
                ezg.b(b11, context, R.string.ice_hockey_even_strength_shots_on_goal, iceHockeyPlayerSeasonStatistics.getEvenShots());
            }
            ezg.h(b6, string85, a.a(b11));
            if (!c) {
                String string86 = context.getString(R.string.ice_hockey_stat_category_faceoff);
                string86.getClass();
                xbb b12 = a.b();
                ezg.b(b12, context, R.string.ice_hockey_faceoffs_taken, iceHockeyPlayerSeasonStatistics.getFaceOffTaken());
                ezg.b(b12, context, R.string.hockey_faceoffs_won, iceHockeyPlayerSeasonStatistics.getFaceOffWins());
                ezg.c(b12, context, R.string.ice_hockey_faceoff_win_percentage, iceHockeyPlayerSeasonStatistics.getFaceOffPercentage(), 24);
                ezg.h(b6, string86, a.a(b12));
            }
            list2 = a.a(b6);
        }
        i = 0;
        list = list2;
        int i32 = i;
        while (r2.hasNext()) {
        }
        F(list);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return (obj instanceof iei) && !((iei) obj).b.isEmpty();
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 4);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof iei) {
            return 1;
        }
        if (obj instanceof jei) {
            return 2;
        }
        if (obj instanceof j29) {
            return 3;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        mqi mqiVar = this.n;
        if (i == 1) {
            return new gai(kqb.c((LayoutInflater) mqiVar.getValue(), viewGroup), new ate(this, 3));
        }
        if (i == 2) {
            h04 c = h04.c((LayoutInflater) mqiVar.getValue(), viewGroup);
            boolean z = this.l;
            return new uih(c, z, !z, this.m);
        }
        if (i != 3) {
            ilg.c();
            return null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) v82.g((LayoutInflater) mqiVar.getValue(), viewGroup).b;
        constraintLayout.getClass();
        return new wh(constraintLayout);
    }
}
