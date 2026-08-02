package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class jli {
    public static final h0a a(Incident.SubstitutionIncident substitutionIncident, Context context) {
        rz9 rz9Var;
        rz9 rz9Var2;
        String t;
        String str;
        context.getClass();
        String str2 = null;
        boolean c = Intrinsics.c(Incident.isHome$default(substitutionIncident, null, 1, null), Boolean.TRUE);
        String a = qz9.a(context, substitutionIncident);
        if (Intrinsics.c(substitutionIncident.getSport(), Sports.ICE_HOCKEY) && Intrinsics.c(substitutionIncident.getIncidentClass(), Incident.GoalIncident.TYPE_GOALKEEPER)) {
            if (substitutionIncident.getPlayerIn() != null) {
                rz9Var2 = new rz9(R.drawable.ic_goalie_in_24, Integer.valueOf(R.color.success), c == hkg.c0(context), false, null, 24);
            } else {
                rz9Var = new rz9(R.drawable.ic_goalie_out_24, Integer.valueOf(R.color.error), c == hkg.c0(context), false, null, 24);
                rz9Var2 = rz9Var;
            }
        } else if (substitutionIncident.getInjury()) {
            rz9Var2 = new rz9(R.drawable.ic_swap_injured_incidents, null, c != hkg.c0(context), false, null, 26);
        } else if (Intrinsics.c(substitutionIncident.getSport(), Sports.RUGBY) && Intrinsics.c(substitutionIncident.getIncidentClass(), Incident.GoalIncident.TYPE_TEMPORARY)) {
            rz9Var2 = new rz9(R.drawable.ic_swap_temporary, null, false, false, null, 30);
        } else {
            rz9Var = new rz9(R.drawable.ic_swap_incidents, null, c == hkg.c0(context), c == hkg.c0(context), null, 18);
            rz9Var2 = rz9Var;
        }
        if (Intrinsics.c(substitutionIncident.getSport(), Sports.ICE_HOCKEY) && Intrinsics.c(substitutionIncident.getIncidentClass(), Incident.GoalIncident.TYPE_GOALKEEPER)) {
            t = substitutionIncident.getPlayerIn() != null ? context.getString(R.string.hockey_match_event_goalie_back_in) : context.getString(R.string.hockey_match_event_goalie_out);
        } else {
            Player playerIn = substitutionIncident.getPlayerIn();
            if (playerIn == null || (t = tba.C(playerIn)) == null) {
                Player playerIn2 = substitutionIncident.getPlayerIn();
                t = playerIn2 != null ? tba.t(playerIn2) : substitutionIncident.getPlayerNameIn();
            }
        }
        if (t == null) {
            if (b(substitutionIncident) == null) {
                if (Intrinsics.c(substitutionIncident.getSport(), Sports.ICE_HOCKEY) && Intrinsics.c(substitutionIncident.getIncidentClass(), Incident.GoalIncident.TYPE_GOALKEEPER)) {
                    str2 = substitutionIncident.getPlayerIn() != null ? context.getString(R.string.hockey_match_event_goalie_back_in) : context.getString(R.string.hockey_match_event_goalie_out);
                    str2.getClass();
                } else if (substitutionIncident.getInjury()) {
                    str2 = context.getString(R.string.substitution_injury);
                    str2.getClass();
                } else if (Intrinsics.c(substitutionIncident.getSport(), Sports.RUGBY) && Intrinsics.c(substitutionIncident.getIncidentClass(), Incident.GoalIncident.TYPE_TEMPORARY)) {
                    str2 = context.getString(R.string.rugby_temporary_substitution);
                    str2.getClass();
                } else {
                    str2 = context.getString(R.string.substitution);
                    str2.getClass();
                }
            }
            str = str2;
        } else {
            str = t;
        }
        return new h0a(c, a, rz9Var2, null, null, str, b(substitutionIncident), null, null, false, null, false, null, 0, null, 32664);
    }

    public static final String b(Incident.SubstitutionIncident substitutionIncident) {
        String t;
        String t2;
        Player playerIn = substitutionIncident.getPlayerIn();
        if (playerIn == null || (t = tba.C(playerIn)) == null) {
            Player playerIn2 = substitutionIncident.getPlayerIn();
            t = playerIn2 != null ? tba.t(playerIn2) : substitutionIncident.getPlayerNameIn();
        }
        Player playerOut = substitutionIncident.getPlayerOut();
        if (playerOut == null || (t2 = tba.C(playerOut)) == null) {
            Player playerOut2 = substitutionIncident.getPlayerOut();
            t2 = playerOut2 != null ? tba.t(playerOut2) : substitutionIncident.getPlayerNameOut();
        }
        return (Intrinsics.c(substitutionIncident.getSport(), Sports.ICE_HOCKEY) && Intrinsics.c(substitutionIncident.getIncidentClass(), Incident.GoalIncident.TYPE_GOALKEEPER) && substitutionIncident.getPlayerIn() != null) ? t : t2;
    }
}
