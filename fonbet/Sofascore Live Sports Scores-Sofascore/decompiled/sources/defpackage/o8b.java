package defpackage;

import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.network.response.AverageLineupsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class o8b {
    public static ArrayList a(List list, List list2, LinkedHashMap linkedHashMap) {
        boolean z;
        boolean z2;
        Player playerOut;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AverageLineupsItem averageLineupsItem = (AverageLineupsItem) it.next();
            Iterator it2 = list2.iterator();
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                if (!it2.hasNext()) {
                    z = z3;
                    z2 = z4;
                    break;
                }
                Incident.SubstitutionIncident substitutionIncident = (Incident.SubstitutionIncident) it2.next();
                Player playerIn = substitutionIncident.getPlayerIn();
                boolean z5 = playerIn != null && playerIn.getId() == averageLineupsItem.getPlayer().getId();
                boolean z6 = z5 || ((playerOut = substitutionIncident.getPlayerOut()) != null && playerOut.getId() == averageLineupsItem.getPlayer().getId());
                if (z6) {
                    z2 = z6;
                    z = z5;
                    break;
                }
                boolean z7 = z5;
                z4 = z6;
                z3 = z7;
            }
            t4k t4kVar = averageLineupsItem.getPointsCount() < 1 ? t4k.a : averageLineupsItem.getPointsCount() <= 7 ? t4k.b : t4k.c;
            averageLineupsItem.getPlayer().setJerseyNumber((String) linkedHashMap.get(Integer.valueOf(averageLineupsItem.getPlayer().getId())));
            arrayList.add(new sle(averageLineupsItem.getPlayer(), averageLineupsItem.getAverageX(), averageLineupsItem.getAverageY(), z, z2, t4kVar));
        }
        return arrayList;
    }
}
