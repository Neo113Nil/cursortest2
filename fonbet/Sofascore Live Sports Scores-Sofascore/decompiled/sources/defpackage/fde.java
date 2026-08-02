package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.IncidentKt;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class fde {
    public static final String a(Incident.PenaltyShotIncident penaltyShotIncident, Context context) {
        String string;
        String string2;
        String incidentClass = penaltyShotIncident.getIncidentClass();
        int hashCode = incidentClass.hashCode();
        if (hashCode != -1073880421) {
            if (hashCode != -907766766) {
                if (hashCode == -606510148 && incidentClass.equals(Incident.PenaltyShotIncident.PENALTY_SHOT_AWARDED)) {
                    String string3 = context.getString(R.string.football_var_penalty_awarded);
                    string3.getClass();
                    return string3;
                }
            } else if (incidentClass.equals(Incident.PenaltyShotIncident.PENALTY_SHOT_SCORED)) {
                String sport = penaltyShotIncident.getSport();
                if (sport != null) {
                    int hashCode2 = sport.hashCode();
                    if (hashCode2 != -2002238939) {
                        if (hashCode2 != 108869083) {
                            if (hashCode2 == 394668909 && sport.equals(Sports.FOOTBALL)) {
                                string2 = Intrinsics.c(penaltyShotIncident.getIncidentType(), IncidentKt.TYPE_PENALTY_SHOOTOUT) ? context.getString(R.string.football_penalty_shootout_made) : context.getString(R.string.football_penalty_fulltime_made);
                            }
                        } else if (sport.equals(Sports.RUGBY)) {
                            string2 = context.getString(R.string.rugby_penalty);
                        }
                    } else if (sport.equals(Sports.ICE_HOCKEY)) {
                        string2 = context.getString(R.string.ice_hockey_penalty_shot);
                    }
                    string2.getClass();
                    return string2;
                }
                string2 = context.getString(R.string.pen_start);
                string2.getClass();
                return string2;
            }
        } else if (incidentClass.equals(Incident.PenaltyShotIncident.PENALTY_SHOT_MISSED)) {
            String sport2 = penaltyShotIncident.getSport();
            if (sport2 != null) {
                int hashCode3 = sport2.hashCode();
                if (hashCode3 != -2002238939) {
                    if (hashCode3 != 108869083) {
                        if (hashCode3 == 394668909 && sport2.equals(Sports.FOOTBALL)) {
                            string = Intrinsics.c(penaltyShotIncident.getIncidentType(), IncidentKt.TYPE_PENALTY_SHOOTOUT) ? context.getString(R.string.football_penalty_shootout_missed) : context.getString(R.string.football_penalty_fulltime_missed);
                        }
                    } else if (sport2.equals(Sports.RUGBY)) {
                        string = context.getString(R.string.rugby_missed_penalty);
                    }
                } else if (sport2.equals(Sports.ICE_HOCKEY)) {
                    string = context.getString(R.string.ice_hockey_penalty_shot_missed);
                }
                string.getClass();
                return string;
            }
            string = context.getString(R.string.missed_penalty);
            string.getClass();
            return string;
        }
        String string4 = context.getString(R.string.pen_start);
        string4.getClass();
        return string4;
    }
}
