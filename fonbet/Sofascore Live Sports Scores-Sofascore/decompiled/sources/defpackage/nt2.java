package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnt2;", "Lbuc;", "Lmt2;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class nt2 extends buc {
    public final b42 a;

    public nt2(b42 b42Var) {
        this.a = b42Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        mt2 mt2Var = new mt2();
        mt2Var.o = this.a;
        return mt2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nt2) {
            return this.a == ((nt2) obj).a;
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        mt2 mt2Var = (mt2) wtcVar;
        mt2Var.o = this.a;
        sea.p(mt2Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
