package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La12;", "Lbuc;", "Lb12;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class a12 extends buc {
    public final io a;
    public final boolean b;

    public a12(io ioVar, boolean z) {
        this.a = ioVar;
        this.b = z;
    }

    @Override // defpackage.buc
    public final wtc c() {
        b12 b12Var = new b12();
        b12Var.o = this.a;
        b12Var.p = this.b;
        return b12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a12 a12Var = obj instanceof a12 ? (a12) obj : null;
        return a12Var != null && Intrinsics.c(this.a, a12Var.a) && this.b == a12Var.b;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        b12 b12Var = (b12) wtcVar;
        b12Var.o = this.a;
        b12Var.p = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
