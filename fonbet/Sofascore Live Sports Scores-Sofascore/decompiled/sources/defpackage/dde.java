package defpackage;

import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.IncidentKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class dde {
    public static ArrayList a(List list) {
        ArrayList k = me4.k(list);
        for (Object obj : list) {
            if (obj instanceof Incident.PenaltyShotIncident) {
                k.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = k.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Incident.PenaltyShotIncident penaltyShotIncident = (Incident.PenaltyShotIncident) next;
            if (Intrinsics.c(penaltyShotIncident.getIncidentType(), IncidentKt.TYPE_PENALTY_SHOOTOUT) && ph0.a0(new String[]{Incident.PenaltyShotIncident.PENALTY_SHOT_SCORED, Incident.PenaltyShotIncident.PENALTY_SHOT_MISSED}).contains(penaltyShotIncident.getIncidentClass())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
