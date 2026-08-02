package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu95;", "Lbuc;", "Lx95;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u95 extends buc {
    public static final qz4 f = new qz4(18);
    public final f4a a;
    public final boolean b;
    public final boolean c;
    public final ct8 d;
    public final ct8 e;

    public u95(f4a f4aVar, boolean z, boolean z2, xf2 xf2Var, ct8 ct8Var) {
        ewd ewdVar = ewd.a;
        this.a = f4aVar;
        this.b = z;
        this.c = z2;
        this.d = xf2Var;
        this.e = ct8Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        ewd ewdVar = ewd.a;
        x95 x95Var = new x95(f, this.b, null, ewdVar);
        x95Var.J = this.a;
        x95Var.K = ewdVar;
        x95Var.L = this.c;
        x95Var.M = this.d;
        x95Var.N = this.e;
        return x95Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u95.class != obj.getClass()) {
            return false;
        }
        u95 u95Var = (u95) obj;
        if (!Intrinsics.c(this.a, u95Var.a)) {
            return false;
        }
        ewd ewdVar = ewd.a;
        return this.b == u95Var.b && this.c == u95Var.c && Intrinsics.c(this.d, u95Var.d) && Intrinsics.c(this.e, u95Var.e);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        boolean z;
        boolean z2;
        x95 x95Var = (x95) wtcVar;
        ewd ewdVar = ewd.a;
        f4a f4aVar = x95Var.J;
        f4a f4aVar2 = this.a;
        if (Intrinsics.c(f4aVar, f4aVar2)) {
            z = false;
        } else {
            x95Var.J = f4aVar2;
            z = true;
        }
        if (x95Var.K != ewdVar) {
            x95Var.K = ewdVar;
            z2 = true;
        } else {
            z2 = z;
        }
        x95Var.M = this.d;
        x95Var.N = this.e;
        x95Var.L = this.c;
        x95Var.E1(f, this.b, null, ewdVar, z2);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.e.hashCode() + ((this.d.hashCode() + dmi.e(dmi.e((ewd.a.hashCode() + (this.a.hashCode() * 31)) * 31, 961, this.b), 31, this.c)) * 31)) * 31);
    }
}
