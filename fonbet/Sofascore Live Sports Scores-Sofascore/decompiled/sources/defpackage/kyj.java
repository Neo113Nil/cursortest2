package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkyj;", "Lbuc;", "Llyj;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class kyj extends buc {
    public final era a;

    public kyj(era eraVar) {
        this.a = eraVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        lyj lyjVar = new lyj();
        lyjVar.o = this.a;
        return lyjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyj) && Intrinsics.c(this.a, ((kyj) obj).a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((lyj) wtcVar).o = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
