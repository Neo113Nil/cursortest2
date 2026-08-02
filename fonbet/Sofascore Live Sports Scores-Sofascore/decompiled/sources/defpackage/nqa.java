package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnqa;", "Lbuc;", "Loqa;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class nqa extends buc {
    public final rqa a;

    public nqa(rqa rqaVar) {
        this.a = rqaVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        oqa oqaVar = new oqa();
        oqaVar.o = this.a;
        return oqaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqa) && this.a == ((nqa) obj).a;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        oqa oqaVar = (oqa) wtcVar;
        rqa rqaVar = oqaVar.o;
        rqa rqaVar2 = this.a;
        if (Intrinsics.c(rqaVar, rqaVar2) || !oqaVar.a.n) {
            return;
        }
        rqa rqaVar3 = oqaVar.o;
        rqaVar3.e();
        rqaVar3.c = null;
        rqaVar3.a = -1;
        rqaVar2.j = oqaVar;
        oqaVar.o = rqaVar2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
    }
}
