package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lca5;", "Lbuc;", "Lea5;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class ca5 extends buc {
    public final n29 a;
    public final Function0 b;
    public final boolean c;

    public ca5(n29 n29Var, Function0 function0, boolean z) {
        n29Var.getClass();
        this.a = n29Var;
        this.b = function0;
        this.c = z;
    }

    @Override // defpackage.buc
    public final wtc c() {
        n29 n29Var = this.a;
        n29Var.getClass();
        ea5 ea5Var = new ea5();
        ea5Var.o = n29Var;
        ea5Var.p = this.b;
        ea5Var.q = this.c;
        return ea5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca5)) {
            return false;
        }
        ca5 ca5Var = (ca5) obj;
        return Intrinsics.c(this.a, ca5Var.a) && this.b.equals(ca5Var.b) && this.c == ca5Var.c;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ea5 ea5Var = (ea5) wtcVar;
        ea5Var.getClass();
        ea5Var.p = this.b;
        n29 n29Var = this.a;
        n29Var.getClass();
        if (ea5Var.o != n29Var) {
            ea5Var.o = n29Var;
            ea5Var.r = false;
            n9e.E(ea5Var);
        }
        boolean z = ea5Var.q;
        boolean z2 = this.c;
        if (z != z2) {
            ea5Var.q = z2;
            ea5Var.r = false;
            n9e.E(ea5Var);
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dmi.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DrawIntoGraphicsLayerElement(graphicsLayer=");
        sb.append(this.a);
        sb.append(", onRecorded=");
        sb.append(this.b);
        sb.append(", drawGraphicsLayer=false, canCapture=");
        return wt3.p(sb, this.c, ")");
    }
}
