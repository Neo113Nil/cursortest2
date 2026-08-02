package defpackage;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zse {
    public final List a;
    public final List b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f;
    public final List g;

    public zse(List list, List list2, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, List list3) {
        list2.getClass();
        hashMap.getClass();
        hashMap2.getClass();
        hashMap3.getClass();
        hashMap4.getClass();
        this.a = list;
        this.b = list2;
        this.c = hashMap;
        this.d = hashMap2;
        this.e = hashMap3;
        this.f = hashMap4;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zse)) {
            return false;
        }
        zse zseVar = (zse) obj;
        return Intrinsics.c(this.a, zseVar.a) && Intrinsics.c(this.b, zseVar.b) && Intrinsics.c(this.c, zseVar.c) && Intrinsics.c(this.d, zseVar.d) && Intrinsics.c(this.e, zseVar.e) && Intrinsics.c(this.f, zseVar.f) && Intrinsics.c(this.g, zseVar.g);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + dmi.d((list == null ? 0 : list.hashCode()) * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31;
        List list2 = this.g;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = fc6.s("PlayerMatchesWrapper(transfers=", ", totalEvents=", ", totalPlayedForTeamMap=", this.a, this.b);
        s.append(this.c);
        s.append(", totalIncidentsMap=");
        s.append(this.d);
        s.append(", totalStatisticsMap=");
        s.append(this.e);
        s.append(", totalOnBenchMap=");
        s.append(this.f);
        s.append(", uniqueTournaments=");
        return mz1.p(s, this.g, ")");
    }
}
