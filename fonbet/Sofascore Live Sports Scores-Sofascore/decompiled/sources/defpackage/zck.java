package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzck;", "Lbuc;", "Ladk;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class zck extends buc {
    public final float a;
    public final float b;

    public zck(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.buc
    public final wtc c() {
        adk adkVar = new adk();
        adkVar.o = this.a;
        adkVar.p = this.b;
        return adkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zck)) {
            return false;
        }
        zck zckVar = (zck) obj;
        return p75.b(this.a, zckVar.a) && p75.b(this.b, zckVar.b);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        adk adkVar = (adk) wtcVar;
        adkVar.o = this.a;
        adkVar.p = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
