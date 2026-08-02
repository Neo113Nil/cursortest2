package defpackage;

import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnw0;", "Lbuc;", "Lmw0;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class nw0 extends buc {
    public mw0 a;
    public qa3 b;

    @Override // defpackage.buc
    public final wtc c() {
        return new mw0(this);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
    }

    public final int hashCode() {
        return 234;
    }

    public final Object i(sq3 sq3Var) {
        qa3 qa3Var = this.b;
        if (qa3Var == null) {
            qa3Var = qx9.c();
            this.b = qa3Var;
            mw0 mw0Var = this.a;
            if (mw0Var != null && mw0Var.n) {
                mw0Var.o = t6a.G(mw0Var, new s1(11, mw0Var, mw0Var.p));
            }
        }
        Object w = qa3Var.w(sq3Var);
        return w == lu3.a ? w : Unit.a;
    }
}
