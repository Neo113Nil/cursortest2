package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r9b {
    public final hzd a;
    public final int b;
    public final int c;

    public r9b(hzd hzdVar, int i, int i2) {
        this.a = hzdVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9b)) {
            return false;
        }
        r9b r9bVar = (r9b) obj;
        return Intrinsics.c(this.a, r9bVar.a) && this.b == r9bVar.b && this.c == r9bVar.c;
    }

    public final int hashCode() {
        hzd hzdVar = this.a;
        return Integer.hashCode(this.c) + wv8.a(this.b, (hzdVar == null ? 0 : hzdVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineupsPlayerOpenData(pesmData=");
        sb.append(this.a);
        sb.append(", playerId=");
        sb.append(this.b);
        sb.append(", uniqueTournamentId=");
        return fc6.h(this.c, ")", sb);
    }
}
