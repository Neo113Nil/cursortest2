package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcy0;", "Lbuc;", "Lhy0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class cy0 extends buc {
    public final long a;
    public final n52 b;
    public final uah c;

    public cy0(long j, n52 n52Var, uah uahVar, int i) {
        j = (i & 1) != 0 ? r13.i : j;
        n52Var = (i & 2) != 0 ? null : n52Var;
        this.a = j;
        this.b = n52Var;
        this.c = uahVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        hy0 hy0Var = new hy0();
        hy0Var.o = this.a;
        hy0Var.p = this.b;
        hy0Var.q = 1.0f;
        hy0Var.r = this.c;
        hy0Var.s = 9205357640488583168L;
        return hy0Var;
    }

    public final boolean equals(Object obj) {
        cy0 cy0Var = obj instanceof cy0 ? (cy0) obj : null;
        if (cy0Var == null) {
            return false;
        }
        long j = cy0Var.a;
        int i = r13.j;
        return e8k.a(this.a, j) && Intrinsics.c(this.b, cy0Var.b) && Intrinsics.c(this.c, cy0Var.c);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        hy0 hy0Var = (hy0) wtcVar;
        hy0Var.o = this.a;
        hy0Var.p = this.b;
        hy0Var.q = 1.0f;
        uah uahVar = hy0Var.r;
        uah uahVar2 = this.c;
        if (!Intrinsics.c(uahVar, uahVar2)) {
            hy0Var.r = uahVar2;
            sea.p(hy0Var);
        }
        n9e.E(hy0Var);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        int hashCode = Long.hashCode(this.a) * 31;
        n52 n52Var = this.b;
        return this.c.hashCode() + fc6.a(1.0f, (hashCode + (n52Var != null ? n52Var.hashCode() : 0)) * 31, 31);
    }
}
