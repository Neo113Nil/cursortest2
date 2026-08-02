package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwe9;", "Lbuc;", "Lxe9;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class we9 extends buc {
    public final kv1 a;

    public we9(kv1 kv1Var) {
        this.a = kv1Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        xe9 xe9Var = new xe9();
        xe9Var.o = this.a;
        return xe9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        we9 we9Var = obj instanceof we9 ? (we9) obj : null;
        if (we9Var == null) {
            return false;
        }
        return this.a.equals(we9Var.a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((xe9) wtcVar).o = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
