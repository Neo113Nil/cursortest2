package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tdf implements udf {
    public final Integer a;
    public final int b;

    public tdf(int i, Integer num) {
        this.a = num;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdf)) {
            return false;
        }
        tdf tdfVar = (tdf) obj;
        return Intrinsics.c(this.a, tdfVar.a) && this.b == tdfVar.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Integer.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "UniqueTournament(uniqueTournamentId=" + this.a + ", tournamentId=" + this.b + ")";
    }
}
