package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lxk extends ii6 {
    @Override // defpackage.ii6
    public final LinkedHashMap L(ArrayList arrayList, Event event) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Incident incident = (Incident) it.next();
            if (incident instanceof Incident.PeriodIncident) {
                Set keySet = this.p.keySet();
                keySet.getClass();
                Iterator it2 = keySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.c(((fz9) obj).c, ((Incident.PeriodIncident) incident).getId())) {
                        break;
                    }
                }
                fz9 fz9Var = (fz9) obj;
                Incident.PeriodIncident periodIncident = (Incident.PeriodIncident) incident;
                linkedHashMap.put(new fz9(periodIncident.getId(), periodIncident.getText(), periodIncident.getIsLive(), periodIncident.getSport(), periodIncident.getPeriod(), Incident.getHomeScore$default(periodIncident, null, 1, null), Incident.getAwayScore$default(periodIncident, null, 1, null), Intrinsics.c(fz9Var != null ? Boolean.valueOf(fz9Var.j) : null, Boolean.TRUE) || (this.p.isEmpty() && linkedHashMap.isEmpty())), new hi6());
            } else if (incident instanceof Incident.GoalIncident) {
                Collection values = linkedHashMap.values();
                values.getClass();
                hi6 hi6Var = (hi6) CollectionsKt.i0(values);
                if (hi6Var != null) {
                    ArrayList arrayList2 = hi6Var.a;
                    Set set = hwf.a;
                    arrayList2.add(hwf.a(this.b, incident, null));
                }
            }
        }
        return linkedHashMap;
    }
}
