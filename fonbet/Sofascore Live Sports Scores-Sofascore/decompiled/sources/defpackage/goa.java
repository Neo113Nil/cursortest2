package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgoa;", "Lbuc;", "Lhoa;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class goa extends buc {
    public final float a;
    public final boolean b;

    public goa(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.buc
    public final wtc c() {
        hoa hoaVar = new hoa();
        hoaVar.o = this.a;
        hoaVar.p = this.b;
        return hoaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        goa goaVar = obj instanceof goa ? (goa) obj : null;
        return goaVar != null && this.a == goaVar.a && this.b == goaVar.b;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        hoa hoaVar = (hoa) wtcVar;
        hoaVar.o = this.a;
        hoaVar.p = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
