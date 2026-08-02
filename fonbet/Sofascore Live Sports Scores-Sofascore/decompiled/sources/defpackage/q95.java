package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lq95;", "T", "Lbuc;", "Ls95;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class q95<T> extends buc {
    public final dx a;
    public final Function2 b;

    public q95(dx dxVar, Function2 function2) {
        ewd ewdVar = ewd.a;
        this.a = dxVar;
        this.b = function2;
    }

    @Override // defpackage.buc
    public final wtc c() {
        ewd ewdVar = ewd.a;
        s95 s95Var = new s95();
        s95Var.o = this.a;
        s95Var.p = this.b;
        s95Var.q = ewdVar;
        return s95Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q95)) {
            return false;
        }
        q95 q95Var = (q95) obj;
        if (!Intrinsics.c(this.a, q95Var.a) || this.b != q95Var.b) {
            return false;
        }
        ewd ewdVar = ewd.a;
        return true;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        s95 s95Var = (s95) wtcVar;
        s95Var.o = this.a;
        s95Var.p = this.b;
        s95Var.q = ewd.a;
    }

    public final int hashCode() {
        return ewd.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
