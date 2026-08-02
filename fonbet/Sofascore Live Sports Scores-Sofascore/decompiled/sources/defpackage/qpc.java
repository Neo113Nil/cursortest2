package defpackage;

import com.sofascore.model.util.MonthWithYear;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qpc {
    public final Map a;
    public final MonthWithYear b;

    public qpc(Map map, MonthWithYear monthWithYear) {
        this.a = map;
        this.b = monthWithYear;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpc)) {
            return false;
        }
        qpc qpcVar = (qpc) obj;
        return this.a.equals(qpcVar.a) && Intrinsics.c(this.b, qpcVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MonthWithYear monthWithYear = this.b;
        return hashCode + (monthWithYear == null ? 0 : monthWithYear.hashCode());
    }

    public final String toString() {
        return "EventsWithMonth(eventsMap=" + this.a + ", monthFetched=" + this.b + ")";
    }
}
