package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n3i {
    public final List a;
    public final boolean b;
    public final ArrayList c;
    public final List d;
    public final List e;
    public final j5i f;
    public final xbb g;
    public final ta4 h;
    public final boolean i;
    public final Integer j;

    public n3i(List list, boolean z, ArrayList arrayList, List list2, xbb xbbVar, j5i j5iVar, xbb xbbVar2, ta4 ta4Var, boolean z2, Integer num) {
        list.getClass();
        xbbVar.getClass();
        ta4Var.getClass();
        this.a = list;
        this.b = z;
        this.c = arrayList;
        this.d = list2;
        this.e = xbbVar;
        this.f = j5iVar;
        this.g = xbbVar2;
        this.h = ta4Var;
        this.i = z2;
        this.j = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3i)) {
            return false;
        }
        n3i n3iVar = (n3i) obj;
        return Intrinsics.c(this.a, n3iVar.a) && this.b == n3iVar.b && this.c.equals(n3iVar.c) && Intrinsics.c(this.d, n3iVar.d) && Intrinsics.c(this.e, n3iVar.e) && this.f == n3iVar.f && this.g.equals(n3iVar.g) && this.h == n3iVar.h && this.i == n3iVar.i && Intrinsics.c(this.j, n3iVar.j);
    }

    public final int hashCode() {
        int d = vxd.d(this.c, dmi.e(this.a.hashCode() * 31, 31, this.b), 31);
        List list = this.d;
        int e = dmi.e((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + dmi.d((d + (list == null ? 0 : list.hashCode())) * 31, 31, this.e)) * 31)) * 31)) * 31, 31, this.i);
        Integer num = this.j;
        return e + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "StandingsDisplayData(standings=" + this.a + ", detailedStandingsAvailable=" + this.b + ", basicColumnsShown=" + this.c + ", availableStages=" + this.d + ", availableTeamTypes=" + this.e + ", selectedTeamType=" + this.f + ", availableResultTypes=" + this.g + ", selectedResultType=" + this.h + ", detailedStandingsSelected=" + this.i + ", selectedColumnIndex=" + this.j + ")";
    }
}
