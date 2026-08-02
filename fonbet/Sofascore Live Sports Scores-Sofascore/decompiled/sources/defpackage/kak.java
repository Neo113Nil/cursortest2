package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkak;", "Lbuc;", "Llak;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class kak extends buc {
    public final i68 a;

    public kak(i68 i68Var) {
        this.a = i68Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        lak lakVar = new lak();
        lakVar.q = this.a;
        return lakVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kak) {
            return ((kak) obj).a.equals(this.a);
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        lak lakVar = (lak) wtcVar;
        i68 i68Var = lakVar.q;
        i68 i68Var2 = this.a;
        if (i68Var2.equals(i68Var)) {
            return;
        }
        lakVar.q = i68Var2;
        lakVar.l1();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
