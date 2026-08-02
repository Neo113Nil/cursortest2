package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tte extends vte {
    public final mte a;
    public final gv9 b;
    public final Integer c;
    public final gv9 d;
    public final gv9 e;
    public final Long f;
    public final long g;

    public tte(mte mteVar, gv9 gv9Var, Integer num, gv9 gv9Var2, gv9 gv9Var3, Long l, long j) {
        gv9Var3.getClass();
        this.a = mteVar;
        this.b = gv9Var;
        this.c = num;
        this.d = gv9Var2;
        this.e = gv9Var3;
        this.f = l;
        this.g = j;
    }

    @Override // defpackage.vte
    public final mte a() {
        return this.a;
    }

    @Override // defpackage.vte
    public final gv9 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tte)) {
            return false;
        }
        tte tteVar = (tte) obj;
        return Intrinsics.c(this.a, tteVar.a) && this.b.equals(tteVar.b) && Intrinsics.c(this.c, tteVar.c) && this.d.equals(tteVar.d) && Intrinsics.c(this.e, tteVar.e) && Intrinsics.c(this.f, tteVar.f) && this.g == tteVar.g;
    }

    public final int hashCode() {
        mte mteVar = this.a;
        int d = ljg.d((mteVar == null ? 0 : mteVar.hashCode()) * 31, 961, this.b);
        Integer num = this.c;
        int d2 = ljg.d(ljg.d((d + (num == null ? 0 : num.hashCode())) * 31, 31, this.d), 31, this.e);
        Long l = this.f;
        return Long.hashCode(this.g) + ((d2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VotingOpened(playerOfTheMatch=");
        sb.append(this.a);
        sb.append(", ratedPlayers=");
        sb.append(this.b);
        sb.append(", fanPlayerOfTheMatch=null, myPickId=");
        sb.append(this.c);
        sb.append(", votingOptions=");
        sb.append(this.d);
        sb.append(", topVotingOptions=");
        sb.append(this.e);
        sb.append(", voteEndTimestamp=");
        sb.append(this.f);
        sb.append(", totalVotes=");
        return lnb.l(this.g, ")", sb);
    }
}
