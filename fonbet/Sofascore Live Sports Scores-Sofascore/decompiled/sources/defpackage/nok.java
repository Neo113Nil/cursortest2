package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnok;", "Lbuc;", "Look;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class nok extends buc {
    public final lv1 a;

    public nok(lv1 lv1Var) {
        this.a = lv1Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        ook ookVar = new ook();
        ookVar.o = this.a;
        return ookVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        nok nokVar = obj instanceof nok ? (nok) obj : null;
        if (nokVar == null) {
            return false;
        }
        return Intrinsics.c(this.a, nokVar.a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((ook) wtcVar).o = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
