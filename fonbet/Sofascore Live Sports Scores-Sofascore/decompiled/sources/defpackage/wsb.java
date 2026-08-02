package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wsb {
    public final List a;
    public final ArrayList b;
    public final HashMap c;
    public final HashMap d;

    public wsb(List list, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.a = list;
        this.b = arrayList;
        this.c = hashMap;
        this.d = hashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsb)) {
            return false;
        }
        wsb wsbVar = (wsb) obj;
        return Intrinsics.c(this.a, wsbVar.a) && this.b.equals(wsbVar.b) && this.c.equals(wsbVar.c) && this.d.equals(wsbVar.d);
    }

    public final int hashCode() {
        List list = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + vxd.d(this.b, (list == null ? 0 : list.hashCode()) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ManagerMatchesWrapper(transfers=" + this.a + ", totalEvents=" + this.b + ", totalIncidentsMap=" + this.c + ", managedTeamMap=" + this.d + ")";
    }
}
