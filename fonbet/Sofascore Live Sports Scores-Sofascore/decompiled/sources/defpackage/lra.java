package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llra;", "Lbuc;", "Lora;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class lra extends buc {
    public final Function0 a;
    public final ira b;
    public final ewd c;
    public final boolean d;

    public lra(Function0 function0, ira iraVar, ewd ewdVar, boolean z) {
        this.a = function0;
        this.b = iraVar;
        this.c = ewdVar;
        this.d = z;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new ora(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lra)) {
            return false;
        }
        lra lraVar = (lra) obj;
        return this.a == lraVar.a && Intrinsics.c(this.b, lraVar.b) && this.c == lraVar.c && this.d == lraVar.d;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ora oraVar = (ora) wtcVar;
        oraVar.o = this.a;
        oraVar.p = this.b;
        ewd ewdVar = oraVar.q;
        ewd ewdVar2 = this.c;
        if (ewdVar != ewdVar2) {
            oraVar.q = ewdVar2;
            sea.p(oraVar);
        }
        boolean z = oraVar.r;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        oraVar.r = z2;
        oraVar.k1();
        sea.p(oraVar);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + dmi.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
