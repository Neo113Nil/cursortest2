package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m3i {
    public final ArrayList a;
    public final ArrayList b;
    public final List c;
    public final List d;

    public m3i(ArrayList arrayList, ArrayList arrayList2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = arrayList;
        this.b = arrayList2;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3i)) {
            return false;
        }
        m3i m3iVar = (m3i) obj;
        return this.a.equals(m3iVar.a) && this.b.equals(m3iVar.b) && Intrinsics.c(this.c, m3iVar.c) && Intrinsics.c(this.d, m3iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.d(vxd.d(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Results(driverStandings=");
        sb.append(this.a);
        sb.append(", teamStandings=");
        sb.append(this.b);
        sb.append(", driverStages=");
        return me4.j(sb, this.c, ", teamStages=", this.d, ")");
    }
}
