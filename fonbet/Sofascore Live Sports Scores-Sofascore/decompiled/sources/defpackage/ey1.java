package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ley1;", "Lbuc;", "Lfy1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ey1 extends buc {
    public final Function1 a;

    public ey1(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new fy1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ey1) {
            return this.a == ((ey1) obj).a;
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        wdd wddVar;
        fy1 fy1Var = (fy1) wtcVar;
        Function1 function1 = this.a;
        fy1Var.o = function1;
        if (fy1Var.a.n && (wddVar = c6o.a0(fy1Var, 2).p) != null) {
            wddVar.D1(function1, true);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
