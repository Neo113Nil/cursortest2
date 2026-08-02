package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Incident;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class jz9 {
    public static iz9 a(Context context, Incident incident, gwf gwfVar) {
        context.getClass();
        incident.getClass();
        if (tz9.I(incident)) {
            return hwf.a(context, incident, gwfVar);
        }
        if (incident instanceof Incident.PeriodIncident) {
            Incident.PeriodIncident periodIncident = (Incident.PeriodIncident) incident;
            return new fz9(periodIncident.getId(), periodIncident.getText(), periodIncident.getIsLive(), periodIncident.getSport(), periodIncident.getPeriod(), Incident.getHomeScore$default(periodIncident, null, 1, null), Incident.getAwayScore$default(periodIncident, null, 1, null), false);
        }
        if (incident instanceof Incident.InjuryTimeIncident) {
            Incident.InjuryTimeIncident injuryTimeIncident = (Incident.InjuryTimeIncident) incident;
            return new cz9(injuryTimeIncident.getLength(), injuryTimeIncident.getTime());
        }
        if (incident instanceof Incident.OvertimeBreakIncident) {
            return new ez9(((Incident.OvertimeBreakIncident) incident).getText());
        }
        is8.c(incident, "incident type of incident is not supported: ");
        return null;
    }
}
