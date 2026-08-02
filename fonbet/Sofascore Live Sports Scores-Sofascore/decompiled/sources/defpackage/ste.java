package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ste extends vte {
    public final mte a;
    public final gv9 b;
    public final boolean c;

    public ste(mte mteVar, gv9 gv9Var, boolean z) {
        this.a = mteVar;
        this.b = gv9Var;
        this.c = z;
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
        if (!(obj instanceof ste)) {
            return false;
        }
        ste steVar = (ste) obj;
        return Intrinsics.c(this.a, steVar.a) && this.b.equals(steVar.b) && this.c == steVar.c;
    }

    public final int hashCode() {
        mte mteVar = this.a;
        return Boolean.hashCode(this.c) + ljg.d((mteVar == null ? 0 : mteVar.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VotingNotAvailable(playerOfTheMatch=");
        sb.append(this.a);
        sb.append(", ratedPlayers=");
        sb.append(this.b);
        sb.append(", isVotingUpcoming=");
        return wt3.p(sb, this.c, ")");
    }
}
