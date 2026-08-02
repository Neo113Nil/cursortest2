package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ryg {
    public final int a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;

    public ryg(int i, List list, int i2, int i3, int i4) {
        list.getClass();
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryg)) {
            return false;
        }
        ryg rygVar = (ryg) obj;
        return this.a == rygVar.a && Intrinsics.c(this.b, rygVar.b) && this.c == rygVar.c && this.d == rygVar.d && this.e == rygVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + wv8.a(this.d, wv8.a(this.c, dmi.d(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeasonHeatMapData(matches=");
        sb.append(this.a);
        sb.append(", points=");
        sb.append(this.b);
        sb.append(", playerId=");
        me4.q(sb, this.c, ", uniqueTournamentId=", this.d, ", seasonId=");
        return fc6.h(this.e, ")", sb);
    }
}
