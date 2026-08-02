package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh33;", "Lbuc;", "Lj33;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class h33 extends buc {
    public final wzc a;
    public final Function0 b;

    public h33(wzc wzcVar, Function0 function0) {
        this.a = wzcVar;
        this.b = function0;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new j33(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h33.class != obj.getClass()) {
            return false;
        }
        h33 h33Var = (h33) obj;
        return Intrinsics.c(this.a, h33Var.a) && this.b == h33Var.b;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        j33 j33Var = (j33) wtcVar;
        j33Var.getClass();
        boolean z = !j33Var.v;
        j33Var.z1(this.a, null, false, true, null, null, this.b);
        if (z) {
            ooi ooiVar = j33Var.z;
            if (ooiVar != null) {
                ooiVar.m1();
                Unit unit = Unit.a;
            }
            j33Var.A1(false);
            j33Var.A1(true);
        }
    }

    public final int hashCode() {
        wzc wzcVar = this.a;
        return Boolean.hashCode(true) + ((this.b.hashCode() + dmi.e(dmi.e((wzcVar != null ? wzcVar.hashCode() : 0) * 961, 31, false), 29791, true)) * 923521);
    }
}
