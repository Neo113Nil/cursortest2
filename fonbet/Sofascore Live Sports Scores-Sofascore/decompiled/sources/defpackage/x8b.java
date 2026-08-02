package defpackage;

import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class x8b {
    public static final fk2 a(List list) {
        Integer num;
        Integer valueOf;
        boolean z = false;
        if (list != null) {
            Iterator it = list.iterator();
            num = null;
            while (it.hasNext()) {
                String incidentClass = ((Incident.CardIncident) it.next()).getIncidentClass();
                if (Intrinsics.c(incidentClass, Incident.CardIncident.CARD_RED)) {
                    valueOf = Integer.valueOf(R.drawable.ic_card_red_16);
                } else if (Intrinsics.c(incidentClass, Incident.CardIncident.CARD_YELLOW_RED)) {
                    valueOf = Integer.valueOf(R.drawable.ic_yellow_double_16);
                } else if (!z) {
                    num = Integer.valueOf(R.drawable.ic_card_yellow_16);
                }
                num = valueOf;
                z = true;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new fk2(num.intValue(), z);
        }
        return null;
    }
}
