package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lun3;", "Lbuc;", "Lvn3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class un3 extends buc {
    public final Function1 a;

    public un3(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.buc
    public final wtc c() {
        vn3 vn3Var = new vn3();
        vn3Var.q = this.a;
        return vn3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un3) && ((un3) obj).a == this.a;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        vn3 vn3Var = (vn3) wtcVar;
        Function1 function1 = vn3Var.q;
        Function1 function12 = this.a;
        if (function12 != function1) {
            vn3Var.q = function12;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
