package defpackage;

import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class iwf {
    public static final int a(Incident incident, int i) {
        Player suspensionDrawnByPlayer;
        Player suspensionDrawnByPlayer2;
        incident.getClass();
        Integer num = null;
        Boolean isHome$default = Incident.isHome$default(incident, null, 1, null);
        if (Intrinsics.c(isHome$default, Boolean.TRUE)) {
            if ((!(incident instanceof Incident.GoalIncident) || !Intrinsics.c(((Incident.GoalIncident) incident).getIncidentClass(), Incident.GoalIncident.TYPE_OWN_GOAL)) && (!(incident instanceof Incident.SuspensionIncident) || (suspensionDrawnByPlayer2 = ((Incident.SuspensionIncident) incident).getSuspensionDrawnByPlayer()) == null || suspensionDrawnByPlayer2.getId() != i)) {
                num = 1;
            }
            if (num != null) {
                return num.intValue();
            }
            return 2;
        }
        if (!Intrinsics.c(isHome$default, Boolean.FALSE)) {
            return 0;
        }
        if ((!(incident instanceof Incident.GoalIncident) || !Intrinsics.c(((Incident.GoalIncident) incident).getIncidentClass(), Incident.GoalIncident.TYPE_OWN_GOAL)) && (!(incident instanceof Incident.SuspensionIncident) || (suspensionDrawnByPlayer = ((Incident.SuspensionIncident) incident).getSuspensionDrawnByPlayer()) == null || suspensionDrawnByPlayer.getId() != i)) {
            num = 2;
        }
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }
}
