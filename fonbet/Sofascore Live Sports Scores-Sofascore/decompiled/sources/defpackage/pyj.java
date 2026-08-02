package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pyj {
    public final ArrayList a;
    public final ArrayList b;

    public pyj(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyj)) {
            return false;
        }
        pyj pyjVar = (pyj) obj;
        return this.a.equals(pyjVar.a) && this.b.equals(pyjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrendingEventsWrapper(yesterdayEvents=" + this.a + ", todayAndFutureEvents=" + this.b + ")";
    }
}
