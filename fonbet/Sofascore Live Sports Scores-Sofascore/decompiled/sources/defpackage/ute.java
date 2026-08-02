package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ute extends vte {
    public final Integer a;
    public final gv9 b;
    public final gv9 c;
    public final Long d;
    public final long e;

    public ute(Integer num, gv9 gv9Var, gv9 gv9Var2, Long l, long j) {
        gv9Var2.getClass();
        this.a = num;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = l;
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
        if (!(obj instanceof ute)) {
            return false;
        }
        ute uteVar = (ute) obj;
        return Intrinsics.c(this.a, uteVar.a) && this.b.equals(uteVar.b) && Intrinsics.c(this.c, uteVar.c) && Intrinsics.c(this.d, uteVar.d) && this.e == uteVar.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        int d = ljg.d(ljg.d((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        return Long.hashCode(this.e) + ((d + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VotingOpenedNoRating(playerOfTheMatch=null, ratedPlayers=null, fanPlayerOfTheMatch=null, myPickId=");
        sb.append(this.a);
        sb.append(", votingOptions=");
        sb.append(this.b);
        sb.append(", topVotingOptions=");
        sb.append(this.c);
        sb.append(", voteEndTimestamp=");
        sb.append(this.d);
        sb.append(", totalVotes=");
        return lnb.l(this.e, ")", sb);
    }
}
