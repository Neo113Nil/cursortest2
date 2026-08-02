package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z3b implements c4b {
    public final int a;
    public final Integer b;
    public final String c;

    public z3b(int i, String str, Integer num) {
        this.a = i;
        this.b = num;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3b)) {
            return false;
        }
        z3b z3bVar = (z3b) obj;
        return this.a == z3bVar.a && Intrinsics.c(this.b, z3bVar.b) && Intrinsics.c(this.c, z3bVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return mz1.o(fc6.r("PullToRefresh(uniqueTournamentId=", ", seasonId=", ", sport=", this.b, this.a), this.c, ")");
    }
}
