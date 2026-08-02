package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeySuspension;
import com.sofascore.results.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class poi {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x063a, code lost:
    
        if (r8 == null) goto L327;
     */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final h0a a(Incident.SuspensionIncident suspensionIncident, Context context) {
        Object obj;
        rz9 rz9Var;
        String t;
        String string;
        Player suspensionServedByPlayer;
        String t2;
        Player suspensionDrawnByPlayer;
        String t3;
        String str;
        String key;
        context.getClass();
        boolean c = Intrinsics.c(Incident.isHome$default(suspensionIncident, null, 1, null), Boolean.TRUE);
        String a = qz9.a(context, suspensionIncident);
        Integer valueOf = Integer.valueOf(R.color.error);
        rz9 rz9Var2 = new rz9(R.drawable.ic_sofascore_2, Integer.valueOf(R.color.neutral_default), false, false, null, 28);
        if (!Intrinsics.c(suspensionIncident.getSport(), Sports.ICE_HOCKEY)) {
            obj = Incident.SuspensionIncident.TWO_MINUTES;
            if (Intrinsics.c(suspensionIncident.getIncidentClass(), obj)) {
                rz9Var = new rz9(R.drawable.ic_2_min_suspension, valueOf, false, false, null, 28);
            }
            if (Intrinsics.c(suspensionIncident.getSport(), Sports.ICE_HOCKEY)) {
                Player player = suspensionIncident.getPlayer();
                if (player == null || (t = tba.C(player)) == null) {
                    Player player2 = suspensionIncident.getPlayer();
                    t = player2 != null ? tba.t(player2) : suspensionIncident.getPlayerName();
                }
            } else {
                HockeySuspension iceHockeyPenaltyType = suspensionIncident.getIceHockeyPenaltyType();
                if (iceHockeyPenaltyType != null && (key = iceHockeyPenaltyType.getKey()) != null) {
                    switch (key.hashCode()) {
                        case -2134450839:
                            if (key.equals("spearing")) {
                                t = context.getString(R.string.penalty_spearing);
                                break;
                            }
                            t = null;
                            break;
                        case -2085173338:
                            if (key.equals("broken_stick")) {
                                t = context.getString(R.string.penalty_broken_stick);
                                break;
                            }
                            t = null;
                            break;
                        case -2068134108:
                            if (key.equals("ps_throwing_object_on_ice")) {
                                t = context.getString(R.string.penalty_shot_throwing_object);
                                break;
                            }
                            t = null;
                            break;
                        case -2039572574:
                            if (key.equals("interference_goalkeeper")) {
                                t = context.getString(R.string.penalty_interference_on_gk);
                                break;
                            }
                            t = null;
                            break;
                        case -2019524719:
                            if (key.equals("goalie_participating_beyond_center")) {
                                t = context.getString(R.string.penalty_goalie_beyond_the_center);
                                break;
                            }
                            t = null;
                            break;
                        case -1911459820:
                            if (key.equals("ps_holding_stick_on_breakaway")) {
                                t = context.getString(R.string.penalty_shot_holding_stick_on_breakaway);
                                break;
                            }
                            t = null;
                            break;
                        case -1850323731:
                            if (key.equals("ps_net_displaced")) {
                                t = context.getString(R.string.penalty_shot_net_displaced);
                                break;
                            }
                            t = null;
                            break;
                        case -1781528213:
                            if (key.equals("ps_goalkeeper_displaced_net")) {
                                t = context.getString(R.string.penalty_shot_goalkeeper_displaced_net);
                                break;
                            }
                            t = null;
                            break;
                        case -1655633199:
                            if (key.equals("embellishment")) {
                                t = context.getString(R.string.penalty_embellishment);
                                break;
                            }
                            t = null;
                            break;
                        case -1647262418:
                            if (key.equals("delay_game")) {
                                t = context.getString(R.string.penalty_delay_of_game);
                                break;
                            }
                            t = null;
                            break;
                        case -1566521453:
                            if (key.equals("playing_without_a_helmet")) {
                                t = context.getString(R.string.penalty_helmet);
                                break;
                            }
                            t = null;
                            break;
                        case -1538233617:
                            if (key.equals("ps_picking_up_puck_in_crease")) {
                                t = context.getString(R.string.penalty_shot_picking_up_puck);
                                break;
                            }
                            t = null;
                            break;
                        case -1487689403:
                            if (key.equals("slashing")) {
                                t = context.getString(R.string.penalty_slashing);
                                break;
                            }
                            t = null;
                            break;
                        case -1363611676:
                            if (key.equals("illegal_check_to_head")) {
                                t = context.getString(R.string.penalty_illegal_check);
                                break;
                            }
                            t = null;
                            break;
                        case -1352739789:
                            if (key.equals("interference_bench")) {
                                t = context.getString(R.string.penalty_interference_bench);
                                break;
                            }
                            t = null;
                            break;
                        case -1072978365:
                            if (key.equals("not_proceeding_dir_penbox")) {
                                t = context.getString(R.string.penalty_not_proceeding_dir_penbox);
                                break;
                            }
                            t = null;
                            break;
                        case -938484075:
                            if (key.equals("deliberate_injury")) {
                                t = context.getString(R.string.penalty_deliberate_injury);
                                break;
                            }
                            t = null;
                            break;
                        case -874957358:
                            if (key.equals("fighting")) {
                                t = context.getString(R.string.penalty_fighting);
                                break;
                            }
                            t = null;
                            break;
                        case -792821622:
                            if (key.equals("checking_from_behind")) {
                                t = context.getString(R.string.penalty_checking_from_behind);
                                break;
                            }
                            t = null;
                            break;
                        case -787465096:
                            if (key.equals("protective_equipment")) {
                                t = context.getString(R.string.penalty_protective_equipment);
                                break;
                            }
                            t = null;
                            break;
                        case -757094660:
                            if (key.equals("ps_interference_from_bench")) {
                                t = context.getString(R.string.penalty_shot_interference_from_bench);
                                break;
                            }
                            t = null;
                            break;
                        case -741171415:
                            if (key.equals("ps_hooking_on_breakaway")) {
                                t = context.getString(R.string.penalty_shot_hooking_on_breakaway);
                                break;
                            }
                            t = null;
                            break;
                        case -720572452:
                            if (key.equals("kicking")) {
                                t = context.getString(R.string.penalty_kicking);
                                break;
                            }
                            t = null;
                            break;
                        case -653493941:
                            if (key.equals("ps_slash_on_breakaway")) {
                                t = context.getString(R.string.penalty_shot_slash_on_breakaway);
                                break;
                            }
                            t = null;
                            break;
                        case -631945181:
                            if (key.equals("removing_sweater")) {
                                t = context.getString(R.string.penalty_removing_sweater);
                                break;
                            }
                            t = null;
                            break;
                        case -588192855:
                            if (key.equals("too_many_men_on_ice")) {
                                t = context.getString(R.string.penalty_too_many_men_on_ice);
                                break;
                            }
                            t = null;
                            break;
                        case -583886843:
                            if (key.equals("illegal_equipment")) {
                                t = context.getString(R.string.penalty_illegal_equipment);
                                break;
                            }
                            t = null;
                            break;
                        case -575758401:
                            if (key.equals("kneeing")) {
                                t = context.getString(R.string.penalty_kneeing);
                                break;
                            }
                            t = null;
                            break;
                        case -509794846:
                            if (key.equals("ps_illegal_substitution")) {
                                t = context.getString(R.string.penalty_shot_illegal_substitution);
                                break;
                            }
                            t = null;
                            break;
                        case -507451978:
                            if (key.equals("objects_on_ice")) {
                                t = context.getString(R.string.penalty_objects_on_ice);
                                break;
                            }
                            t = null;
                            break;
                        case -487120863:
                            if (key.equals("misconduct_10min")) {
                                t = context.getString(R.string.penalty_misconduct);
                                break;
                            }
                            t = null;
                            break;
                        case -438364423:
                            if (key.equals("cross_checking")) {
                                t = context.getString(R.string.penalty_cross_checking);
                                break;
                            }
                            t = null;
                            break;
                        case -321331861:
                            if (key.equals("player_leaves_bench")) {
                                t = context.getString(R.string.penalty_leaving_players_bench);
                                break;
                            }
                            t = null;
                            break;
                        case -264433692:
                            if (key.equals("late_on_ice")) {
                                t = context.getString(R.string.penalty_late_on_ice);
                                break;
                            }
                            t = null;
                            break;
                        case -205146219:
                            if (key.equals("refusal_to_play")) {
                                t = context.getString(R.string.penalty_refusal_to_play);
                                break;
                            }
                            t = null;
                            break;
                        case -202949232:
                            if (key.equals("head_butting")) {
                                t = context.getString(R.string.penalty_head_butting);
                                break;
                            }
                            t = null;
                            break;
                        case -169409424:
                            if (key.equals("delay_game_unsucc_challenge")) {
                                t = context.getString(R.string.penalty_delay_of_game_unsuccessful_challenge);
                                break;
                            }
                            t = null;
                            break;
                        case -99309996:
                            if (key.equals("removing_opponents_helmet")) {
                                t = context.getString(R.string.penalty_removing_opponents_helmet);
                                break;
                            }
                            t = null;
                            break;
                        case -91848385:
                            if (key.equals("elbowing")) {
                                t = context.getString(R.string.penalty_elbowing);
                                break;
                            }
                            t = null;
                            break;
                        case -39661817:
                            if (key.equals("closing_hand_on_puck")) {
                                t = context.getString(R.string.penalty_closing_hand);
                                break;
                            }
                            t = null;
                            break;
                        case -23005202:
                            if (key.equals("ps_throw_object_at_puck")) {
                                t = context.getString(R.string.penalty_shot_throw_object_at_puck);
                                break;
                            }
                            t = null;
                            break;
                        case -6487927:
                            if (key.equals("roughing")) {
                                t = context.getString(R.string.penalty_roughing);
                                break;
                            }
                            t = null;
                            break;
                        case 43545314:
                            if (key.equals("leaving_players_penalty_bench")) {
                                t = context.getString(R.string.penalty_leaving_penalty_bench);
                                break;
                            }
                            t = null;
                            break;
                        case 130884623:
                            if (key.equals("match_penalty")) {
                                t = context.getString(R.string.penalty_match_penalty);
                                break;
                            }
                            t = null;
                            break;
                        case 175551799:
                            if (key.equals("aggressor")) {
                                t = context.getString(R.string.penalty_aggressor);
                                break;
                            }
                            t = null;
                            break;
                        case 191285497:
                            if (key.equals("ps_tripping_on_breakaway")) {
                                t = context.getString(R.string.penalty_shot_tripping_on_breakaway);
                                break;
                            }
                            t = null;
                            break;
                        case 217411294:
                            if (key.equals("abusive_language")) {
                                t = context.getString(R.string.penalty_abusive_language);
                                break;
                            }
                            t = null;
                            break;
                        case 263807696:
                            if (key.equals("hi_sticking")) {
                                t = context.getString(R.string.penalty_hi_sticking);
                                break;
                            }
                            t = null;
                            break;
                        case 388482780:
                            if (key.equals("ps_players_leaving_bench")) {
                                t = context.getString(R.string.penalty_shot_players_leaving_bench);
                                break;
                            }
                            t = null;
                            break;
                        case 427422726:
                            if (key.equals("unsustained_measurement")) {
                                t = context.getString(R.string.penalty_unsustained_measurement);
                                break;
                            }
                            t = null;
                            break;
                        case 484857622:
                            if (key.equals("puck_thrown_fwd_goalkeeper")) {
                                t = context.getString(R.string.penalty_puck_thrown_fwd_goalkeeper);
                                break;
                            }
                            t = null;
                            break;
                        case 526848980:
                            if (key.equals("goalie_removed_own_mask")) {
                                t = context.getString(R.string.penalty_goalie_removed_mask);
                                break;
                            }
                            t = null;
                            break;
                        case 742303181:
                            if (key.equals("throwing_stick")) {
                                t = context.getString(R.string.penalty_throwing_stick);
                                break;
                            }
                            t = null;
                            break;
                        case 822170244:
                            if (key.equals("ineligible_player")) {
                                t = context.getString(R.string.penalty_ineligible_player);
                                break;
                            }
                            t = null;
                            break;
                        case 918617282:
                            if (key.equals("clipping")) {
                                t = context.getString(R.string.penalty_clipping);
                                break;
                            }
                            t = null;
                            break;
                        case 961025717:
                            if (key.equals("attempt_to_injure")) {
                                t = context.getString(R.string.penalty_attempt_to_injure);
                                break;
                            }
                            t = null;
                            break;
                        case 976116947:
                            if (key.equals("butt_ending")) {
                                t = context.getString(R.string.penalty_butt_ending);
                                break;
                            }
                            t = null;
                            break;
                        case 989883481:
                            if (key.equals("abuse_of_officials")) {
                                t = context.getString(R.string.penalty_abuse_of_officials);
                                break;
                            }
                            t = null;
                            break;
                        case 1091761859:
                            if (key.equals("holding")) {
                                t = context.getString(R.string.penalty_holding);
                                break;
                            }
                            t = null;
                            break;
                        case 1094740959:
                            if (key.equals("hooking")) {
                                t = context.getString(R.string.penalty_hooking);
                                break;
                            }
                            t = null;
                            break;
                        case 1103586951:
                            if (key.equals("illegal_stick")) {
                                t = context.getString(R.string.penalty_illegal_stick);
                                break;
                            }
                            t = null;
                            break;
                        case 1124548922:
                            if (key.equals("instigator")) {
                                t = context.getString(R.string.penalty_instigator);
                                break;
                            }
                            t = null;
                            break;
                        case 1235387146:
                            if (key.equals("leaving_penalty_box")) {
                                t = context.getString(R.string.penalty_leaving_penalty_box);
                                break;
                            }
                            t = null;
                            break;
                        case 1245544826:
                            if (key.equals("game_misconduct")) {
                                t = context.getString(R.string.penalty_game_misconduct);
                                break;
                            }
                            t = null;
                            break;
                        case 1349455006:
                            if (key.equals("unsportsmanlike_conduct")) {
                                t = context.getString(R.string.penalty_unsportsmanlike_conduct);
                                break;
                            }
                            t = null;
                            break;
                        case 1360275750:
                            if (key.equals("illegal_substitution")) {
                                t = context.getString(R.string.penalty_illegal_substitution);
                                break;
                            }
                            t = null;
                            break;
                        case 1366812357:
                            if (key.equals("ps_holding_on_breakaway")) {
                                t = context.getString(R.string.penalty_shot_holding_on_breakaway);
                                break;
                            }
                            t = null;
                            break;
                        case 1371915462:
                            if (key.equals("holding_the_stick")) {
                                t = context.getString(R.string.penalty_holding_the_stick);
                                break;
                            }
                            t = null;
                            break;
                        case 1436115569:
                            if (key.equals("charging")) {
                                t = context.getString(R.string.penalty_charging);
                                break;
                            }
                            t = null;
                            break;
                        case 1450745823:
                            if (key.equals("delay_game_bench")) {
                                t = context.getString(R.string.penalty_delay_of_game_bench);
                                break;
                            }
                            t = null;
                            break;
                        case 1473021021:
                            if (key.equals("ps_covering_puck_in_crease")) {
                                t = context.getString(R.string.penalty_shot_covering_puck);
                                break;
                            }
                            t = null;
                            break;
                        case 1511676695:
                            if (key.equals("tripping")) {
                                t = context.getString(R.string.penalty_tripping);
                                break;
                            }
                            t = null;
                            break;
                        case 1523726803:
                            if (key.equals("interfere_with_official")) {
                                t = context.getString(R.string.penalty_interfere_with_official);
                                break;
                            }
                            t = null;
                            break;
                        case 1530513538:
                            if (key.equals("interference")) {
                                t = context.getString(R.string.penalty_interference);
                                break;
                            }
                            t = null;
                            break;
                        case 1610774332:
                            if (key.equals("boarding")) {
                                t = context.getString(R.string.penalty_boarding);
                                break;
                            }
                            t = null;
                            break;
                        case 1611351605:
                            if (key.equals("goalie_leave_crease")) {
                                t = context.getString(R.string.penalty_goalie_leave_crease);
                                break;
                            }
                            t = null;
                            break;
                        case 1780486282:
                            if (key.equals("not_proceeding_to_dressing_room")) {
                                t = context.getString(R.string.penalty_not_proceeding_to_dressing_room);
                                break;
                            }
                            t = null;
                            break;
                        default:
                            t = null;
                            break;
                    }
                }
                HockeySuspension iceHockeyPenaltyType2 = suspensionIncident.getIceHockeyPenaltyType();
                if (iceHockeyPenaltyType2 != null) {
                    t = iceHockeyPenaltyType2.getDescription();
                } else {
                    t = context.getString(R.string.suspension);
                    t.getClass();
                }
                String incidentClass = suspensionIncident.getIncidentClass();
                if (incidentClass != null) {
                    switch (incidentClass.hashCode()) {
                        case -415911719:
                            if (incidentClass.equals("fourMinutes")) {
                                Locale d = dla.d();
                                String string2 = context.getString(R.string.minutes_template);
                                string2.getClass();
                                str = String.format(d, string2, Arrays.copyOf(new Object[]{4}, 1));
                                break;
                            }
                            str = null;
                            break;
                        case 1248527603:
                            if (incidentClass.equals(obj)) {
                                Locale d2 = dla.d();
                                String string3 = context.getString(R.string.minutes_template);
                                string3.getClass();
                                str = String.format(d2, string3, Arrays.copyOf(new Object[]{2}, 1));
                                break;
                            }
                            str = null;
                            break;
                        case 1975126530:
                            if (incidentClass.equals("tenMinutes")) {
                                Locale d3 = dla.d();
                                String string4 = context.getString(R.string.minutes_template);
                                string4.getClass();
                                str = String.format(d3, string4, Arrays.copyOf(new Object[]{10}, 1));
                                break;
                            }
                            str = null;
                            break;
                        case 2068984269:
                            if (incidentClass.equals("fiveMinutes")) {
                                Locale d4 = dla.d();
                                String string5 = context.getString(R.string.minutes_template);
                                string5.getClass();
                                str = String.format(d4, string5, Arrays.copyOf(new Object[]{5}, 1));
                                break;
                            }
                            str = null;
                            break;
                        default:
                            str = null;
                            break;
                    }
                    if (str != null) {
                        t = wv8.i(t, " | ", str);
                    }
                }
            }
            if (!Intrinsics.c(suspensionIncident.getSport(), Sports.ICE_HOCKEY)) {
                Player player3 = suspensionIncident.getPlayer();
                if (player3 == null || (string = tba.C(player3)) == null) {
                    Player player4 = suspensionIncident.getPlayer();
                    string = player4 != null ? tba.t(player4) : suspensionIncident.getPlayerName();
                }
            } else if (Intrinsics.c(suspensionIncident.getIncidentClass(), obj)) {
                string = context.getString(R.string.minifootball_2_min_suspension);
                string.getClass();
            } else {
                string = context.getString(R.string.suspension);
                string.getClass();
            }
            String str2 = string;
            suspensionServedByPlayer = suspensionIncident.getSuspensionServedByPlayer();
            if (suspensionServedByPlayer != null || (t2 = tba.C(suspensionServedByPlayer)) == null) {
                Player suspensionServedByPlayer2 = suspensionIncident.getSuspensionServedByPlayer();
                t2 = suspensionServedByPlayer2 == null ? tba.t(suspensionServedByPlayer2) : null;
            }
            String string6 = t2 == null ? context.getString(R.string.penalty_served_by, t2) : null;
            suspensionDrawnByPlayer = suspensionIncident.getSuspensionDrawnByPlayer();
            if (suspensionDrawnByPlayer != null || (t3 = tba.C(suspensionDrawnByPlayer)) == null) {
                Player suspensionDrawnByPlayer2 = suspensionIncident.getSuspensionDrawnByPlayer();
                t3 = suspensionDrawnByPlayer2 == null ? tba.t(suspensionDrawnByPlayer2) : null;
            }
            return new h0a(c, a, rz9Var2, null, null, t, str2, string6, t3 != null ? context.getString(R.string.penalty_against, t3) : null, Intrinsics.c(suspensionIncident.getSport(), Sports.ICE_HOCKEY), null, false, null, 0, null, 31768);
        }
        obj = Incident.SuspensionIncident.TWO_MINUTES;
        rz9Var = new rz9(R.drawable.ic_hockey_penalty_box, valueOf, false, false, null, 28);
        rz9Var2 = rz9Var;
        if (Intrinsics.c(suspensionIncident.getSport(), Sports.ICE_HOCKEY)) {
        }
        if (!Intrinsics.c(suspensionIncident.getSport(), Sports.ICE_HOCKEY)) {
        }
        String str22 = string;
        suspensionServedByPlayer = suspensionIncident.getSuspensionServedByPlayer();
        if (suspensionServedByPlayer != null) {
        }
        Player suspensionServedByPlayer22 = suspensionIncident.getSuspensionServedByPlayer();
        if (suspensionServedByPlayer22 == null) {
        }
        if (t2 == null) {
        }
        suspensionDrawnByPlayer = suspensionIncident.getSuspensionDrawnByPlayer();
        if (suspensionDrawnByPlayer != null) {
        }
        Player suspensionDrawnByPlayer22 = suspensionIncident.getSuspensionDrawnByPlayer();
        if (suspensionDrawnByPlayer22 == null) {
        }
        return new h0a(c, a, rz9Var2, null, null, t, str22, string6, t3 != null ? context.getString(R.string.penalty_against, t3) : null, Intrinsics.c(suspensionIncident.getSport(), Sports.ICE_HOCKEY), null, false, null, 0, null, 31768);
    }
}
