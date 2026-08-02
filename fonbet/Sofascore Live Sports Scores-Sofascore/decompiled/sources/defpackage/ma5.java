package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lma5;", "Lbuc;", "Lna5;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ma5 extends buc {
    public final Function1 a;

    public ma5(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.buc
    public final wtc c() {
        na5 na5Var = new na5();
        na5Var.o = this.a;
        return na5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ma5) {
            return this.a == ((ma5) obj).a;
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((na5) wtcVar).o = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
