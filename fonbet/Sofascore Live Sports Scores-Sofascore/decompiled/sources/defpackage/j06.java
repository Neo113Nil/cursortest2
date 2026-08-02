package defpackage;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j06 {
    public final Pair a;
    public final Pair b;
    public final Pair c;
    public final Pair d;
    public final Pair e;

    public j06(Pair pair, Pair pair2, Pair pair3, Pair pair4, Pair pair5) {
        this.a = pair;
        this.b = pair2;
        this.c = pair3;
        this.d = pair4;
        this.e = pair5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j06)) {
            return false;
        }
        j06 j06Var = (j06) obj;
        return Intrinsics.c(this.a, j06Var.a) && Intrinsics.c(this.b, j06Var.b) && Intrinsics.c(this.c, j06Var.c) && Intrinsics.c(this.d, j06Var.d) && Intrinsics.c(this.e, j06Var.e);
    }

    public final int hashCode() {
        Pair pair = this.a;
        int hashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        Pair pair2 = this.b;
        int hashCode2 = (hashCode + (pair2 == null ? 0 : pair2.hashCode())) * 31;
        Pair pair3 = this.c;
        int hashCode3 = (hashCode2 + (pair3 == null ? 0 : pair3.hashCode())) * 31;
        Pair pair4 = this.d;
        int hashCode4 = (hashCode3 + (pair4 == null ? 0 : pair4.hashCode())) * 31;
        Pair pair5 = this.e;
        return hashCode4 + (pair5 != null ? pair5.hashCode() : 0);
    }

    public final String toString() {
        return "TeamRatingBreakdownValues(shootingValues=" + this.a + ", passingValues=" + this.b + ", dribblingValues=" + this.c + ", defendingValues=" + this.d + ", goalkeepingValues=" + this.e + ")";
    }
}
