package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh9e;", "Lbuc;", "Li9e;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class h9e extends buc {
    public final cdi a;

    public h9e(cdi cdiVar) {
        this.a = cdiVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        i9e i9eVar = new i9e();
        i9eVar.o = 1.0f;
        i9eVar.p = this.a;
        return i9eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9e) && this.a == ((h9e) obj).a;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        i9e i9eVar = (i9e) wtcVar;
        i9eVar.o = 1.0f;
        i9eVar.p = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.a.hashCode() * 961);
    }
}
