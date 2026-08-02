package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gc6 implements Serializable {
    public final a56 a;
    public final pui b;
    public final pui c;
    public final qui d;
    public final qui e;

    public gc6(List list, List list2, List list3, List list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        a56 a56Var = new a56(CollectionsKt.w0(list2, list), CollectionsKt.w0(list4, list3));
        pui puiVar = new pui(list, true);
        pui puiVar2 = new pui(list3, false);
        qui quiVar = new qui(list);
        qui quiVar2 = new qui(list3);
        this.a = a56Var;
        this.b = puiVar;
        this.c = puiVar2;
        this.d = quiVar;
        this.e = quiVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc6)) {
            return false;
        }
        gc6 gc6Var = (gc6) obj;
        return this.a.equals(gc6Var.a) && this.b.equals(gc6Var.b) && this.c.equals(gc6Var.c) && this.d.equals(gc6Var.d) && this.e.equals(gc6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + dmi.d(dmi.d(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a)) * 31);
    }

    public final String toString() {
        return "EventTeamHeatmapData(eventPlayAreas=" + this.a + ", firstTeamAreas=" + this.b + ", secondTeamAreas=" + this.c + ", firstTeamSides=" + this.d + ", secondTeamSides=" + this.e + ")";
    }
}
