package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.IncidentKt;
import com.sofascore.model.newNetwork.EventGraphData;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class qz9 {
    public static final Map a = tub.h(new Pair("Argument", Integer.valueOf(R.string.argument)), new Pair("Dangerous play", Integer.valueOf(R.string.dangerous_play)), new Pair("Simulation", Integer.valueOf(R.string.simulation)), new Pair("Other reason", Integer.valueOf(R.string.other_reason)), new Pair("Unallowed field entering", Integer.valueOf(R.string.unallowed_field_entering)), new Pair("Fight", Integer.valueOf(R.string.fight)), new Pair("Foul", Integer.valueOf(R.string.foul)), new Pair("Handball", Integer.valueOf(R.string.foul_handball)), new Pair("Leaving field", Integer.valueOf(R.string.leaving_field)), new Pair("On bench", Integer.valueOf(R.string.on_bench)), new Pair("Off the ball foul", Integer.valueOf(R.string.off_the_ball_foul)), new Pair("Persistent fouling", Integer.valueOf(R.string.persistent_fouling)), new Pair("Professional foul", Integer.valueOf(R.string.professional_foul)), new Pair("Professional handball", Integer.valueOf(R.string.professional_foul_handball)), new Pair("Professional foul last man", Integer.valueOf(R.string.professional_foul_last_man)), new Pair("Post match", Integer.valueOf(R.string.post_match)), new Pair("Unsporting behaviour", Integer.valueOf(R.string.unsporting_behaviour)), new Pair("Time wasting", Integer.valueOf(R.string.time_wasting)), new Pair("Violent conduct", Integer.valueOf(R.string.football_card_reason_conduct)), new Pair("Rescinded Card", Integer.valueOf(R.string.rescinded_card)));

    public static String a(Context context, Incident incident) {
        Integer time;
        context.getClass();
        incident.getClass();
        if (((incident instanceof Incident.PenaltyShotIncident) && c.o(((Incident.PenaltyShotIncident) incident).getIncidentType(), IncidentKt.TYPE_PENALTY_SHOOTOUT, true)) || (time = incident.getTime()) == null || time.intValue() == -1 || time.intValue() == -2 || time.intValue() == -5) {
            return "-";
        }
        if (time.intValue() == -3) {
            String string = context.getResources().getString(R.string.status_halftime_short);
            string.getClass();
            return string;
        }
        if (time.intValue() != -4) {
            return mx9.p(context, incident.getSport(), time, incident.getTimeSeconds(), incident.getAddedTime(), incident.getReversedPeriodTime(), incident.getReversedPeriodTimeSeconds(), incident.getPeriodTimeSeconds());
        }
        String string2 = context.getResources().getString(R.string.ft_plus);
        string2.getClass();
        return string2;
    }

    public static EventGraphResponse b(String str, List list) {
        Object obj;
        int i;
        Object obj2;
        int i2;
        str.getClass();
        if (str.equals(Sports.HANDBALL)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Incident incident = (Incident) obj;
                if ((incident instanceof Incident.PeriodIncident) && StringsKt.J(((Incident.PeriodIncident) incident).getText(), "HT", false)) {
                    break;
                }
            }
            Incident incident2 = (Incident) obj;
            if (incident2 != null) {
                Integer homeScore$default = Incident.getHomeScore$default(incident2, null, 1, null);
                int intValue = homeScore$default != null ? homeScore$default.intValue() : 0;
                Integer awayScore$default = Incident.getAwayScore$default(incident2, null, 1, null);
                i = intValue + (awayScore$default != null ? awayScore$default.intValue() : 0);
            } else {
                i = 0;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                Incident incident3 = (Incident) obj2;
                if ((incident3 instanceof Incident.PeriodIncident) && StringsKt.J(((Incident.PeriodIncident) incident3).getText(), "FT", false)) {
                    break;
                }
            }
            Incident incident4 = (Incident) obj2;
            if (incident4 != null) {
                Integer homeScore$default2 = Incident.getHomeScore$default(incident4, null, 1, null);
                int intValue2 = homeScore$default2 != null ? homeScore$default2.intValue() : 0;
                Integer awayScore$default2 = Incident.getAwayScore$default(incident4, null, 1, null);
                i2 = intValue2 + (awayScore$default2 != null ? awayScore$default2.intValue() : 0);
            } else {
                i2 = 0;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof Incident.GoalIncident) {
                    arrayList.add(obj3);
                }
            }
            List B0 = CollectionsKt.B0(arrayList);
            ArrayList arrayList2 = new ArrayList(k13.r(B0, 10));
            int i3 = 0;
            for (Object obj4 : B0) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    b.q();
                    throw null;
                }
                Incident.GoalIncident goalIncident = (Incident.GoalIncident) obj4;
                double intValue3 = goalIncident.getTime() != null ? r8.intValue() : 0.0d;
                Integer homeScore$default3 = Incident.getHomeScore$default(goalIncident, null, 1, null);
                EventGraphData eventGraphData = new EventGraphData(intValue3, (homeScore$default3 != null ? homeScore$default3.intValue() : 0) - (Incident.getAwayScore$default(goalIncident, null, 1, null) != null ? r6.intValue() : 0));
                eventGraphData.setIncidentIndex(i4);
                arrayList2.add(eventGraphData);
                i3 = i4;
            }
            if (!arrayList2.isEmpty()) {
                EventGraphResponse eventGraphResponse = new EventGraphResponse(arrayList2, null, null, null, null);
                eventGraphResponse.setHalfTimeCount(Integer.valueOf(i));
                eventGraphResponse.setFullTimeCount(Integer.valueOf(i2));
                return eventGraphResponse;
            }
        }
        return null;
    }
}
