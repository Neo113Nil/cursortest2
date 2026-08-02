package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg9e;", "Lbuc;", "Lf9e;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g9e extends buc {
    public final fa a;

    public g9e(fa faVar) {
        this.a = faVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        f9e f9eVar = new f9e();
        f9eVar.o = this.a;
        return f9eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g9e) {
            return this.a == ((g9e) obj).a;
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        f9e f9eVar = (f9e) wtcVar;
        f9eVar.o = this.a;
        sea.p(f9eVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
