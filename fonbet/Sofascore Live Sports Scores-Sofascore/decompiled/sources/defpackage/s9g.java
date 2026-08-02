package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.statistics.season.player.RugbyPlayerSeasonStatistics;
import com.sofascore.results.R;
import java.util.ArrayList;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class s9g {
    public static final ArrayList a(RugbyPlayerSeasonStatistics rugbyPlayerSeasonStatistics, Context context, fzg fzgVar) {
        Integer num;
        Integer appearances;
        rugbyPlayerSeasonStatistics.getClass();
        context.getClass();
        ArrayList arrayList = new ArrayList();
        String string = context.getString(R.string.matches);
        string.getClass();
        ArrayList arrayList2 = new ArrayList();
        fzg fzgVar2 = fzg.e;
        Integer num2 = null;
        if (fzgVar != fzgVar2 && (appearances = rugbyPlayerSeasonStatistics.getAppearances()) != null) {
            int intValue = appearances.intValue();
            String string2 = context.getString(R.string.matches_total);
            string2.getClass();
            arrayList2.add(new jei(string2, String.valueOf(intValue), null));
        }
        if (fzgVar != fzg.f) {
            String string3 = context.getString(R.string.rugby_minutes_per_game);
            string3.getClass();
            ezg.e(arrayList2, string3, rugbyPlayerSeasonStatistics.getMinutesPlayed(), rugbyPlayerSeasonStatistics.getAppearances(), true);
        }
        km5 km5Var = km5.a;
        ezg.g(arrayList, string, arrayList2, km5Var);
        String string4 = context.getString(R.string.rugby_points);
        string4.getClass();
        boolean z = fzgVar == fzgVar2;
        xbb b = a.b();
        String string5 = context.getString(R.string.total);
        string5.getClass();
        ezg.e(b, string5, rugbyPlayerSeasonStatistics.getPoints(), rugbyPlayerSeasonStatistics.getAppearances(), z);
        String string6 = context.getString(R.string.rugby_tries);
        string6.getClass();
        ezg.e(b, string6, rugbyPlayerSeasonStatistics.getTries(), rugbyPlayerSeasonStatistics.getAppearances(), z);
        String string7 = context.getString(R.string.rugby_penalty_goals);
        string7.getClass();
        Integer penaltyGoals = rugbyPlayerSeasonStatistics.getPenaltyGoals();
        Integer penaltyGoalsMissed = rugbyPlayerSeasonStatistics.getPenaltyGoalsMissed();
        if (penaltyGoalsMissed != null) {
            int intValue2 = penaltyGoalsMissed.intValue();
            Integer penaltyGoals2 = rugbyPlayerSeasonStatistics.getPenaltyGoals();
            num = Integer.valueOf(intValue2 + (penaltyGoals2 != null ? penaltyGoals2.intValue() : 0));
        } else {
            num = null;
        }
        ezg.d(b, string7, penaltyGoals, num, rugbyPlayerSeasonStatistics.getAppearances(), z);
        String string8 = context.getString(R.string.rugby_conversions);
        string8.getClass();
        Integer conversions = rugbyPlayerSeasonStatistics.getConversions();
        Integer conversionMissed = rugbyPlayerSeasonStatistics.getConversionMissed();
        if (conversionMissed != null) {
            int intValue3 = conversionMissed.intValue();
            Integer conversions2 = rugbyPlayerSeasonStatistics.getConversions();
            num2 = Integer.valueOf(intValue3 + (conversions2 != null ? conversions2.intValue() : 0));
        }
        ezg.d(b, string8, conversions, num2, rugbyPlayerSeasonStatistics.getAppearances(), z);
        String string9 = context.getString(R.string.rugby_drop_goals);
        string9.getClass();
        ezg.e(b, string9, rugbyPlayerSeasonStatistics.getDropGoals(), rugbyPlayerSeasonStatistics.getAppearances(), z);
        ezg.g(arrayList, string4, a.a(b), km5Var);
        String string10 = context.getString(R.string.attack_statistics);
        string10.getClass();
        boolean z2 = fzgVar == fzgVar2;
        xbb b2 = a.b();
        String string11 = context.getString(R.string.rugby_passes_made);
        string11.getClass();
        ezg.d(b2, string11, rugbyPlayerSeasonStatistics.getPassesSuccessful(), rugbyPlayerSeasonStatistics.getPassesTotal(), rugbyPlayerSeasonStatistics.getAppearances(), z2);
        String string12 = context.getString(R.string.rugby_offloads);
        string12.getClass();
        ezg.e(b2, string12, rugbyPlayerSeasonStatistics.getOffloads(), rugbyPlayerSeasonStatistics.getAppearances(), z2);
        String string13 = context.getString(R.string.rugby_carries);
        string13.getClass();
        ezg.e(b2, string13, rugbyPlayerSeasonStatistics.getCarries(), rugbyPlayerSeasonStatistics.getAppearances(), z2);
        String string14 = context.getString(R.string.rugby_clean_breaks);
        string14.getClass();
        ezg.e(b2, string14, rugbyPlayerSeasonStatistics.getCleanBreaks(), rugbyPlayerSeasonStatistics.getAppearances(), z2);
        String string15 = context.getString(R.string.rugby_defenders_beaten);
        string15.getClass();
        ezg.e(b2, string15, rugbyPlayerSeasonStatistics.getDefendersBeaten(), rugbyPlayerSeasonStatistics.getAppearances(), z2);
        String string16 = context.getString(R.string.rugby_metres_gained);
        string16.getClass();
        ezg.e(b2, string16, rugbyPlayerSeasonStatistics.getMetresMade(), rugbyPlayerSeasonStatistics.getAppearances(), z2);
        String string17 = context.getString(R.string.rugby_handling_errors);
        string17.getClass();
        ezg.e(b2, string17, rugbyPlayerSeasonStatistics.getHandlingError(), rugbyPlayerSeasonStatistics.getAppearances(), z2);
        String string18 = context.getString(R.string.rugby_carries_crossed_gained_line);
        string18.getClass();
        ezg.e(b2, string18, rugbyPlayerSeasonStatistics.getCarriesCrossedGainLine(), rugbyPlayerSeasonStatistics.getAppearances(), z2);
        String string19 = context.getString(R.string.rugby_carries_not_made_gain_line);
        string19.getClass();
        ezg.e(b2, string19, rugbyPlayerSeasonStatistics.getCarriesNotMadeGainLine(), rugbyPlayerSeasonStatistics.getAppearances(), z2);
        String string20 = context.getString(R.string.rugby_post_contact_metres);
        string20.getClass();
        ezg.e(b2, string20, rugbyPlayerSeasonStatistics.getPostContactMetres(), rugbyPlayerSeasonStatistics.getAppearances(), z2);
        String string21 = context.getString(R.string.rugby_try_assists);
        string21.getClass();
        ezg.e(b2, string21, rugbyPlayerSeasonStatistics.getTryAssist(), rugbyPlayerSeasonStatistics.getAppearances(), z2);
        ezg.g(arrayList, string10, a.a(b2), km5Var);
        String string22 = context.getString(R.string.any_sport_defence_stats_category);
        string22.getClass();
        boolean z3 = fzgVar == fzgVar2;
        xbb b3 = a.b();
        String string23 = context.getString(R.string.rugby_tackles_made);
        string23.getClass();
        ezg.d(b3, string23, rugbyPlayerSeasonStatistics.getTackles(), rugbyPlayerSeasonStatistics.getTacklesTotal(), rugbyPlayerSeasonStatistics.getAppearances(), z3);
        String string24 = context.getString(R.string.rugby_dominant_tackles);
        string24.getClass();
        ezg.e(b3, string24, rugbyPlayerSeasonStatistics.getDominantTackles(), rugbyPlayerSeasonStatistics.getAppearances(), z3);
        String string25 = context.getString(R.string.rugby_offensive_penalties_conceded);
        string25.getClass();
        ezg.e(b3, string25, rugbyPlayerSeasonStatistics.getPenOffs(), rugbyPlayerSeasonStatistics.getAppearances(), z3);
        String string26 = context.getString(R.string.rugby_defensive_penalties_conceded);
        string26.getClass();
        ezg.e(b3, string26, rugbyPlayerSeasonStatistics.getPenDefs(), rugbyPlayerSeasonStatistics.getAppearances(), z3);
        ezg.g(arrayList, string22, a.a(b3), km5Var);
        String string27 = context.getString(R.string.lineouts);
        string27.getClass();
        boolean z4 = fzgVar == fzgVar2;
        xbb b4 = a.b();
        String string28 = context.getString(R.string.rugby_successful_lineouts);
        string28.getClass();
        ezg.e(b4, string28, rugbyPlayerSeasonStatistics.getLineoutsToOwnPlayer(), rugbyPlayerSeasonStatistics.getAppearances(), z4);
        String string29 = context.getString(R.string.rugby_lineouts_won);
        string29.getClass();
        ezg.e(b4, string29, rugbyPlayerSeasonStatistics.getLineoutsWon(), rugbyPlayerSeasonStatistics.getAppearances(), z4);
        String string30 = context.getString(R.string.rugby_lineout_steals);
        string30.getClass();
        ezg.e(b4, string30, rugbyPlayerSeasonStatistics.getLineoutWonSteal(), rugbyPlayerSeasonStatistics.getAppearances(), z4);
        ezg.g(arrayList, string27, a.a(b4), km5Var);
        String string31 = context.getString(R.string.rugby_kicking_stats_category);
        string31.getClass();
        boolean z5 = fzgVar == fzgVar2;
        xbb b5 = a.b();
        String string32 = context.getString(R.string.rugby_kick_metres);
        string32.getClass();
        ezg.e(b5, string32, rugbyPlayerSeasonStatistics.getKickMetres(), rugbyPlayerSeasonStatistics.getAppearances(), z5);
        String string33 = context.getString(R.string.rugby_kicks_from_hand);
        string33.getClass();
        ezg.e(b5, string33, rugbyPlayerSeasonStatistics.getKicksFromHand(), rugbyPlayerSeasonStatistics.getAppearances(), z5);
        ezg.g(arrayList, string31, a.a(b5), km5Var);
        String string34 = context.getString(R.string.rugby_rucks_stats_category);
        string34.getClass();
        boolean z6 = fzgVar == fzgVar2;
        xbb b6 = a.b();
        String string35 = context.getString(R.string.rugby_ruck_arrivals);
        string35.getClass();
        ezg.e(b6, string35, rugbyPlayerSeasonStatistics.getRuckArrival(), rugbyPlayerSeasonStatistics.getAppearances(), z6);
        String string36 = context.getString(R.string.rugby_attacking_ruck_arrivals);
        string36.getClass();
        ezg.e(b6, string36, rugbyPlayerSeasonStatistics.getRuckArrivalAttack(), rugbyPlayerSeasonStatistics.getAppearances(), z6);
        String string37 = context.getString(R.string.rugby_defensive_ruck_arrivals);
        string37.getClass();
        ezg.e(b6, string37, rugbyPlayerSeasonStatistics.getRuckArrivalDefence(), rugbyPlayerSeasonStatistics.getAppearances(), z6);
        ezg.g(arrayList, string34, a.a(b6), km5Var);
        String string38 = context.getString(R.string.rugby_discipline_stats_category);
        string38.getClass();
        boolean z7 = fzgVar == fzgVar2;
        xbb b7 = a.b();
        String string39 = context.getString(R.string.rugby_yellow_cards);
        string39.getClass();
        ezg.e(b7, string39, rugbyPlayerSeasonStatistics.getYellowCards(), rugbyPlayerSeasonStatistics.getAppearances(), z7);
        String string40 = context.getString(R.string.rugby_red_cards);
        string40.getClass();
        ezg.e(b7, string40, rugbyPlayerSeasonStatistics.getRedCards(), rugbyPlayerSeasonStatistics.getAppearances(), z7);
        ezg.g(arrayList, string38, a.a(b7), km5Var);
        return arrayList;
    }
}
