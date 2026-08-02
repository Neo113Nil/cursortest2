package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rm7 {
    public final int a;
    public final gv9 b;
    public final qm7 c;
    public final boolean d;
    public final boolean e;

    public rm7(int i, gv9 gv9Var, qm7 qm7Var, boolean z, boolean z2) {
        gv9Var.getClass();
        this.a = i;
        this.b = gv9Var;
        this.c = qm7Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm7)) {
            return false;
        }
        rm7 rm7Var = (rm7) obj;
        return this.a == rm7Var.a && Intrinsics.c(this.b, rm7Var.b) && Intrinsics.c(this.c, rm7Var.c) && this.d == rm7Var.d && this.e == rm7Var.e;
    }

    public final int hashCode() {
        int d = ljg.d(Integer.hashCode(this.a) * 31, 31, this.b);
        qm7 qm7Var = this.c;
        return Boolean.hashCode(this.e) + dmi.e((d + (qm7Var == null ? 0 : qm7Var.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FantasyTransferHistoryState(competitionId=");
        sb.append(this.a);
        sb.append(", roundTransfers=");
        sb.append(this.b);
        sb.append(", overview=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        sb.append(", assetsRestricted=");
        return wt3.p(sb, this.e, ")");
    }
}
