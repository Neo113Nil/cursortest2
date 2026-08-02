package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp9a;", "Lbuc;", "Lr9a;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class p9a extends buc {
    public final n9a a;

    public p9a(n9a n9aVar) {
        this.a = n9aVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        r9a r9aVar = new r9a(0);
        r9aVar.p = this.a;
        r9aVar.q = true;
        return r9aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        p9a p9aVar = obj instanceof p9a ? (p9a) obj : null;
        return p9aVar != null && this.a == p9aVar.a;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        r9a r9aVar = (r9a) wtcVar;
        r9aVar.p = this.a;
        r9aVar.q = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
