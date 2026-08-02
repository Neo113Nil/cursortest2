package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltcj;", "Lbuc;", "Lucj;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class tcj extends buc {
    public final cej a;
    public final jwj b;
    public final dfj c;
    public final boolean d;
    public final kja e;

    public tcj(cej cejVar, jwj jwjVar, dfj dfjVar, boolean z, kja kjaVar) {
        this.a = cejVar;
        this.b = jwjVar;
        this.c = dfjVar;
        this.d = z;
        this.e = kjaVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new ucj(this.a, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcj)) {
            return false;
        }
        tcj tcjVar = (tcj) obj;
        return this.d == tcjVar.d && Intrinsics.c(this.a, tcjVar.a) && Intrinsics.c(this.b, tcjVar.b) && Intrinsics.c(this.c, tcjVar.c) && this.e.equals(tcjVar.e);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ucj ucjVar = (ucj) wtcVar;
        cej cejVar = ucjVar.q;
        cej cejVar2 = this.a;
        ucjVar.q = cejVar2;
        cejVar2.getClass();
        boolean z = this.d;
        ucjVar.r = z;
        ((eoh) cejVar2.a.a).setValue(new xaj(this.b, this.c, z, !z, this.e.c == 4));
        if (Intrinsics.c(cejVar, cejVar2)) {
            return;
        }
        u32 u32Var = ucjVar.s;
        t32 t32Var = cejVar2.g;
        t32 t32Var2 = u32Var.o;
        if (t32Var2 != null) {
            t32Var2.a.q(u32Var);
        }
        t32Var.a.b(u32Var);
        u32Var.o = t32Var;
    }

    public final int hashCode() {
        return this.e.hashCode() + dmi.f(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(this.d) * 31)) * 31)) * 31, 961);
    }
}
