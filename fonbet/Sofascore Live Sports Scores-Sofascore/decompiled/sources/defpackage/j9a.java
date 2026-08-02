package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj9a;", "Lbuc;", "Lk9a;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class j9a extends buc {
    public final n9a a;

    public j9a(n9a n9aVar) {
        this.a = n9aVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        k9a k9aVar = new k9a(0);
        k9aVar.p = this.a;
        k9aVar.q = true;
        return k9aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        j9a j9aVar = obj instanceof j9a ? (j9a) obj : null;
        return j9aVar != null && this.a == j9aVar.a;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        k9a k9aVar = (k9a) wtcVar;
        k9aVar.p = this.a;
        k9aVar.q = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
