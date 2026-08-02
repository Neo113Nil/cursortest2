package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class y16 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    public y16(Map map, Map map2, Map map3, Map map4) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y16)) {
            return false;
        }
        y16 y16Var = (y16) obj;
        return Intrinsics.c(this.a, y16Var.a) && Intrinsics.c(this.b, y16Var.b) && Intrinsics.c(this.c, y16Var.c) && Intrinsics.c(this.d, y16Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.g(this.c, dmi.g(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "EventListPlayerFields(playedForTeamMap=" + this.a + ", incidentsMap=" + this.b + ", statisticsMap=" + this.c + ", onBenchMap=" + this.d + ")";
    }
}
