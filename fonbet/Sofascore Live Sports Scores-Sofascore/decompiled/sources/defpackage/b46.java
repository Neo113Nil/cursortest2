package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b46 {
    public final Map a;
    public final boolean b;
    public final boolean c;

    public b46(Map map, boolean z, boolean z2) {
        map.getClass();
        this.a = map;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b46)) {
            return false;
        }
        b46 b46Var = (b46) obj;
        return Intrinsics.c(this.a, b46Var.a) && this.b == b46Var.b && this.c == b46Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MmaStatisticsDataWrapper(statistics=");
        sb.append(this.a);
        sb.append(", homeActive=");
        sb.append(this.b);
        sb.append(", awayActive=");
        return wt3.p(sb, this.c, ")");
    }
}
