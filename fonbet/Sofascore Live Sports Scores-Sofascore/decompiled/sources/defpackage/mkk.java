package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class mkk {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0026, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.Incident.VarDecisionIncident.IN_PROGRESS_RED_CARD) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
    
        r2 = r21.getString(com.sofascore.results.R.string.football_var_red_card);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.Incident.VarDecisionIncident.IN_PROGRESS_NO_PENALTY) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ed, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.Incident.VarDecisionIncident.IN_PROGRESS_NO_RED_CARD) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ff, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.Incident.VarDecisionIncident.IN_PROGRESS_PENALTY) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0111, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.Incident.VarDecisionIncident.IN_PROGRESS_GOAL) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011d, code lost:
    
        r2 = r21.getString(com.sofascore.results.R.string.football_var_goal);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0102, code lost:
    
        r2 = r21.getString(com.sofascore.results.R.string.football_var_penalty);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011a, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.Incident.VarDecisionIncident.IN_PROGRESS_NO_GOAL) == false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final h0a a(Incident.VarDecisionIncident varDecisionIncident, Context context) {
        String string;
        Player player;
        String t;
        String C;
        context.getClass();
        String incidentClass = varDecisionIncident.getIncidentClass();
        if (incidentClass != null) {
            switch (incidentClass.hashCode()) {
                case -1826826183:
                    break;
                case -1632273749:
                    break;
                case -324438543:
                    break;
                case -161971164:
                    break;
                case -13382958:
                    if (incidentClass.equals(Incident.VarDecisionIncident.PENALTY_NOT_AWARDED)) {
                        string = context.getString(varDecisionIncident.getConfirmed() ? R.string.football_var_no_penalty_confirmed : R.string.football_var_penalty_awarded);
                        break;
                    }
                    break;
                case -7966532:
                    if (incidentClass.equals(Incident.VarDecisionIncident.RED_CARD_GIVEN)) {
                        string = context.getString(varDecisionIncident.getConfirmed() ? R.string.football_var_red_card_given : R.string.football_var_red_card_cancelled);
                        break;
                    }
                    break;
                case 73394610:
                    if (incidentClass.equals(Incident.VarDecisionIncident.IN_PROGRESS_UNKNOWN)) {
                        string = context.getString(R.string.football_var_unknown);
                        break;
                    }
                    break;
                case 251522268:
                    if (incidentClass.equals(Incident.VarDecisionIncident.GOAL_NOT_AWARDED)) {
                        string = context.getString(varDecisionIncident.getConfirmed() ? R.string.football_var_no_goal_confirmed : R.string.football_var_goal_awarded);
                        break;
                    }
                    break;
                case 333115689:
                    if (incidentClass.equals(Incident.VarDecisionIncident.GOAL_AWARDED)) {
                        string = context.getString(varDecisionIncident.getConfirmed() ? R.string.football_var_goal_confirmed : R.string.football_var_goal_cancelled);
                        break;
                    }
                    break;
                case 337978604:
                    if (incidentClass.equals(Incident.VarDecisionIncident.CARD_UPGRADE)) {
                        string = context.getString(varDecisionIncident.getConfirmed() ? R.string.football_var_card_review : R.string.football_var_card_change);
                        break;
                    }
                    break;
                case 976537331:
                    if (incidentClass.equals(Incident.VarDecisionIncident.PENALTY_AWARDED)) {
                        string = context.getString(varDecisionIncident.getConfirmed() ? R.string.football_var_penalty_confirmed : R.string.football_var_penalty_cancelled);
                        break;
                    }
                    break;
                case 1729535382:
                    break;
                case 1969849763:
                    break;
            }
            String str = string;
            str.getClass();
            boolean c = Intrinsics.c(Incident.isHome$default(varDecisionIncident, null, 1, null), Boolean.TRUE);
            String a = qz9.a(context, varDecisionIncident);
            rz9 rz9Var = new rz9(R.drawable.ic_var, Integer.valueOf(!varDecisionIncident.isDecisionInProgress() ? R.color.live : R.color.primary_default), false, false, null, 28);
            player = varDecisionIncident.getPlayer();
            if (player != null || (C = tba.C(player)) == null) {
                Player player2 = varDecisionIncident.getPlayer();
                t = player2 != null ? tba.t(player2) : null;
            } else {
                t = C;
            }
            return new h0a(c, a, rz9Var, null, null, str, t, null, null, false, null, varDecisionIncident.isDecisionInProgress(), null, 0, null, 30616);
        }
        string = context.getString(R.string.football_var_reviewed);
        String str2 = string;
        str2.getClass();
        boolean c2 = Intrinsics.c(Incident.isHome$default(varDecisionIncident, null, 1, null), Boolean.TRUE);
        String a2 = qz9.a(context, varDecisionIncident);
        rz9 rz9Var2 = new rz9(R.drawable.ic_var, Integer.valueOf(!varDecisionIncident.isDecisionInProgress() ? R.color.live : R.color.primary_default), false, false, null, 28);
        player = varDecisionIncident.getPlayer();
        if (player != null) {
        }
        Player player22 = varDecisionIncident.getPlayer();
        t = player22 != null ? tba.t(player22) : null;
        return new h0a(c2, a2, rz9Var2, null, null, str2, t, null, null, false, null, varDecisionIncident.isDecisionInProgress(), null, 0, null, 30616);
    }
}
