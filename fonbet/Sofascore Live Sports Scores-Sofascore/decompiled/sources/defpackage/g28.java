package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg28;", "Lbuc;", "Lh28;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g28 extends buc {
    public final l35 a;
    public final float b;

    public g28(l35 l35Var, float f) {
        this.a = l35Var;
        this.b = f;
    }

    @Override // defpackage.buc
    public final wtc c() {
        h28 h28Var = new h28();
        h28Var.o = this.a;
        h28Var.p = this.b;
        return h28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g28)) {
            return false;
        }
        g28 g28Var = (g28) obj;
        return this.a == g28Var.a && this.b == g28Var.b;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        h28 h28Var = (h28) wtcVar;
        h28Var.o = this.a;
        h28Var.p = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
