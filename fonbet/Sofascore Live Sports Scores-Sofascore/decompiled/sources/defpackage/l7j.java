package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ll7j;", "Lbuc;", "Lm7j;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class l7j extends buc {
    public final String a;

    public l7j(String str) {
        this.a = str;
    }

    @Override // defpackage.buc
    public final wtc c() {
        m7j m7jVar = new m7j();
        m7jVar.o = this.a;
        return m7jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7j)) {
            return false;
        }
        return this.a.equals(((l7j) obj).a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((m7j) wtcVar).o = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
