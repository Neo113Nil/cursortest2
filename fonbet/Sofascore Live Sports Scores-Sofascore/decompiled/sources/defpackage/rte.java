package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rte extends vte {
    public final mte a;
    public final Integer b;
    public final gv9 c;
    public final gv9 d;
    public final long e;

    public rte(mte mteVar, Integer num, gv9 gv9Var, gv9 gv9Var2, long j) {
        gv9Var2.getClass();
        this.a = mteVar;
        this.b = num;
        this.c = gv9Var;
        this.d = gv9Var2;
        this.e = j;
    }

    @Override // defpackage.vte
    public final mte a() {
        return null;
    }

    @Override // defpackage.vte
    public final gv9 b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rte)) {
            return false;
        }
        rte rteVar = (rte) obj;
        return Intrinsics.c(this.a, rteVar.a) && Intrinsics.c(this.b, rteVar.b) && this.c.equals(rteVar.c) && Intrinsics.c(this.d, rteVar.d) && this.e == rteVar.e;
    }

    public final int hashCode() {
        mte mteVar = this.a;
        int hashCode = (mteVar == null ? 0 : mteVar.hashCode()) * 31;
        Integer num = this.b;
        return Long.hashCode(this.e) + ljg.d(ljg.d((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VotingClosedNoRating(playerOfTheMatch=null, ratedPlayers=null, fanPlayerOfTheMatch=");
        sb.append(this.a);
        sb.append(", myPickId=");
        sb.append(this.b);
        sb.append(", votingOptions=");
        vxd.u(sb, this.c, ", topVotingOptions=", this.d, ", totalVotes=");
        return lnb.l(this.e, ")", sb);
    }
}
