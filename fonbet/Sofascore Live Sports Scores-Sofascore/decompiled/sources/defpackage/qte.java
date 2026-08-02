package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qte extends vte {
    public final mte a;
    public final gv9 b;
    public final mte c;
    public final Integer d;
    public final gv9 e;
    public final gv9 f;
    public final long g;

    public qte(mte mteVar, gv9 gv9Var, mte mteVar2, Integer num, gv9 gv9Var2, gv9 gv9Var3, long j) {
        gv9Var3.getClass();
        this.a = mteVar;
        this.b = gv9Var;
        this.c = mteVar2;
        this.d = num;
        this.e = gv9Var2;
        this.f = gv9Var3;
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
        if (!(obj instanceof qte)) {
            return false;
        }
        qte qteVar = (qte) obj;
        return Intrinsics.c(this.a, qteVar.a) && this.b.equals(qteVar.b) && Intrinsics.c(this.c, qteVar.c) && Intrinsics.c(this.d, qteVar.d) && this.e.equals(qteVar.e) && Intrinsics.c(this.f, qteVar.f) && this.g == qteVar.g;
    }

    public final int hashCode() {
        mte mteVar = this.a;
        int d = ljg.d((mteVar == null ? 0 : mteVar.hashCode()) * 31, 31, this.b);
        mte mteVar2 = this.c;
        int hashCode = (d + (mteVar2 == null ? 0 : mteVar2.hashCode())) * 31;
        Integer num = this.d;
        return Long.hashCode(this.g) + ljg.d(ljg.d((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VotingClosed(playerOfTheMatch=");
        sb.append(this.a);
        sb.append(", ratedPlayers=");
        sb.append(this.b);
        sb.append(", fanPlayerOfTheMatch=");
        sb.append(this.c);
        sb.append(", myPickId=");
        sb.append(this.d);
        sb.append(", votingOptions=");
        vxd.u(sb, this.e, ", topVotingOptions=", this.f, ", totalVotes=");
        return lnb.l(this.g, ")", sb);
    }
}
