package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ln99;", "Lbuc;", "Lp99;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class n99 extends buc {
    public final dfj a;
    public final int b;
    public final int c;

    public n99(dfj dfjVar, int i, int i2) {
        this.a = dfjVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.buc
    public final wtc c() {
        p99 p99Var = new p99();
        p99Var.o = this.a;
        p99Var.p = this.b;
        p99Var.q = this.c;
        p99Var.s = -1;
        p99Var.t = -1;
        return p99Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n99)) {
            return false;
        }
        n99 n99Var = (n99) obj;
        return Intrinsics.c(this.a, n99Var.a) && this.b == n99Var.b && this.c == n99Var.c;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        p99 p99Var = (p99) wtcVar;
        dfj dfjVar = p99Var.o;
        dfj dfjVar2 = this.a;
        boolean c = Intrinsics.c(dfjVar, dfjVar2);
        int i = this.b;
        int i2 = this.c;
        if (c && p99Var.p == i && p99Var.q == i2) {
            return;
        }
        p99Var.o = dfjVar2;
        p99Var.p = i;
        p99Var.q = i2;
        p99Var.u = g7a.C(dfjVar2, c6o.c0(p99Var).z);
        p99Var.r = true;
        y6a.E(p99Var);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }
}
