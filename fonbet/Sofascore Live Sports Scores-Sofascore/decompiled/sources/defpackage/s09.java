package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.IncidentKt;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class s09 {
    public static final Set a = ph0.a0(new String[]{Sports.ICE_HOCKEY, Sports.FLOORBALL, Sports.BANDY});

    public static final String a(Incident.GoalIncident goalIncident, Context context) {
        String C;
        boolean c = Intrinsics.c(goalIncident.getSport(), Sports.VOLLEYBALL);
        if (c && Intrinsics.c(goalIncident.getIncidentClass(), Incident.GoalIncident.TYPE_VOLLEYBALL_ERROR)) {
            return context.getString(R.string.volleyball_opponent_error);
        }
        Player player = goalIncident.getPlayer();
        String playerName = goalIncident.getPlayerName();
        if (player != null && (C = tba.C(player)) != null) {
            playerName = C;
        } else if (player != null) {
            playerName = tba.t(player);
        }
        if (playerName == null) {
            if (c) {
                return null;
            }
            return b(goalIncident, context);
        }
        StringBuilder sb = new StringBuilder(playerName);
        if (Intrinsics.c(goalIncident.getIncidentClass(), Incident.GoalIncident.TYPE_EMPTY_NET)) {
            sb.append(" " + context.getString(R.string.hockey_empty_net_goal_short));
        }
        if (Intrinsics.c(goalIncident.getSport(), Sports.ICE_HOCKEY) && goalIncident.getSeasonCount() != null) {
            sb.append(" (" + goalIncident.getSeasonCount() + ")");
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0259, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.Incident.GoalIncident.TYPE_DEF_TWO_POINT_CONV) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019d, code lost:
    
        if (r0.equals(com.sofascore.model.mvvm.model.Incident.GoalIncident.TYPE_TWO_POINT_CONV) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x025c, code lost:
    
        r3 = r4.getString(com.sofascore.results.R.string.amf_two_point_conversion);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0266, code lost:
    
        return r3;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String b(Incident.GoalIncident goalIncident, Context context) {
        String incidentClass = goalIncident.getIncidentClass();
        if (incidentClass != null) {
            switch (incidentClass.hashCode()) {
                case -1684373569:
                    break;
                case -1392832198:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_BEHIND)) {
                        String string = context.getString(R.string.aussie_rules_behind);
                        string.getClass();
                        return string;
                    }
                    break;
                case -1055625287:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_OWN_GOAL)) {
                        String string2 = context.getString(R.string.own_goal);
                        string2.getClass();
                        return string2;
                    }
                    break;
                case -909893934:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_SAFETY)) {
                        String string3 = context.getString(R.string.amf_safety);
                        string3.getClass();
                        return string3;
                    }
                    break;
                case -872064910:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_PENALTY_TRY)) {
                        String string4 = context.getString(R.string.rugby_penalty_try);
                        string4.getClass();
                        return string4;
                    }
                    break;
                case -816407833:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_ACCUMULATED_PENALTY)) {
                        String string5 = context.getString(R.string.minifootball_accumulated_penalty);
                        string5.getClass();
                        return string5;
                    }
                    break;
                case -682674039:
                    if (incidentClass.equals("penalty")) {
                        String sport = goalIncident.getSport();
                        String string6 = Intrinsics.c(sport, Sports.ICE_HOCKEY) ? context.getString(R.string.ice_hockey_penalty_shot) : Intrinsics.c(sport, Sports.FOOTBALL) ? Intrinsics.c(goalIncident.getIncidentType(), IncidentKt.TYPE_PENALTY_SHOOTOUT) ? context.getString(R.string.football_penalty_shootout_made) : context.getString(R.string.football_penalty_fulltime_made) : context.getString(R.string.pen_start);
                        string6.getClass();
                        return string6;
                    }
                    break;
                case -312846630:
                    break;
                case -145546673:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_TWO_POINT)) {
                        String string7 = Intrinsics.c(goalIncident.getSport(), Sports.BASKETBALL) ? context.getString(R.string.basketball_two_points) : context.getString(R.string.rugby_two_point_goal);
                        string7.getClass();
                        return string7;
                    }
                    break;
                case 96387:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_VOLLEYBALL_ACE)) {
                        String string8 = context.getString(R.string.volleyball_ace);
                        string8.getClass();
                        return string8;
                    }
                    break;
                case 115131:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_TRY)) {
                        String string9 = context.getString(R.string.rugby_try);
                        string9.getClass();
                        return string9;
                    }
                    break;
                case 93832333:
                    if (incidentClass.equals("block")) {
                        String string10 = context.getString(R.string.volleyball_block);
                        string10.getClass();
                        return string10;
                    }
                    break;
                case 108703926:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_ROUGE)) {
                        String string11 = context.getString(R.string.amf_rogue);
                        string11.getClass();
                        return string11;
                    }
                    break;
                case 109645830:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_VOLLEYBALL_SPIKE)) {
                        String string12 = context.getString(R.string.volleyball_attack);
                        string12.getClass();
                        return string12;
                    }
                    break;
                case 244208299:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_VOLLEYBALL_ERROR)) {
                        String string13 = context.getString(R.string.volleyball_opponent_error);
                        string13.getClass();
                        return string13;
                    }
                    break;
                case 364268641:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_TOUCHDOWN)) {
                        String string14 = context.getString(R.string.amf_touchdown);
                        string14.getClass();
                        return string14;
                    }
                    break;
                case 627949601:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_THREE_POINT)) {
                        String string15 = Intrinsics.c(goalIncident.getSport(), Sports.BASKETBALL) ? context.getString(R.string.basketball_three_points) : context.getString(R.string.rugby_three_point_goal);
                        string15.getClass();
                        return string15;
                    }
                    break;
                case 733862752:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_EXTRA_POINT)) {
                        String string16 = context.getString(R.string.amf_extra_point);
                        string16.getClass();
                        return string16;
                    }
                    break;
                case 846006713:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_POWER_PLAY)) {
                        String string17 = context.getString(R.string.hockey_powerplay_goal);
                        string17.getClass();
                        return string17;
                    }
                    break;
                case 909140393:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_FOUR_POINT)) {
                        String string18 = context.getString(R.string.basketball_four_points);
                        string18.getClass();
                        return string18;
                    }
                    break;
                case 1201145136:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_EMPTY_NET)) {
                        String string19 = context.getString(R.string.hockey_empty_net_goal);
                        string19.getClass();
                        return string19;
                    }
                    break;
                case 1264813869:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_FIELD_GOAL)) {
                        String string20 = context.getString(R.string.amf_field_goal);
                        string20.getClass();
                        return string20;
                    }
                    break;
                case 1540990154:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_SHORT_HANDED)) {
                        String string21 = context.getString(R.string.hockey_shorthanded_goal);
                        string21.getClass();
                        return string21;
                    }
                    break;
                case 1988413130:
                    if (incidentClass.equals(Incident.GoalIncident.TYPE_ONE_POINT)) {
                        String string22 = Intrinsics.c(goalIncident.getSport(), Sports.BASKETBALL) ? context.getString(R.string.basketball_free_throw) : context.getString(R.string.rugby_one_point_goal);
                        string22.getClass();
                        return string22;
                    }
                    break;
            }
        }
        String sport2 = goalIncident.getSport();
        if (Intrinsics.c(sport2, Sports.AUSSIE_RULES)) {
            String string23 = context.getString(R.string.aussie_rules_goal);
            string23.getClass();
            return string23;
        }
        if (Intrinsics.c(sport2, Sports.VOLLEYBALL)) {
            return "";
        }
        String string24 = context.getString(R.string.football_goal);
        string24.getClass();
        return string24;
    }
}
