package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq3e;", "Lbuc;", "Lr3e;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class q3e extends buc {
    public final p3e a;

    public q3e(p3e p3eVar) {
        this.a = p3eVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        r3e r3eVar = new r3e();
        r3eVar.q = this.a;
        return r3eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q3e) {
            return ((q3e) obj).a.equals(this.a);
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        r3e r3eVar = (r3e) wtcVar;
        p3e p3eVar = r3eVar.q;
        p3e p3eVar2 = this.a;
        if (p3eVar2.equals(p3eVar)) {
            return;
        }
        r3eVar.q = p3eVar2;
        r3eVar.l1();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
