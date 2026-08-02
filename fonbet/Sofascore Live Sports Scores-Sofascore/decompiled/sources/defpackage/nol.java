package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnol;", "Lbuc;", "Lool;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class nol extends buc {
    public final float a;

    public nol(float f) {
        this.a = f;
    }

    @Override // defpackage.buc
    public final wtc c() {
        ool oolVar = new ool();
        oolVar.o = this.a;
        return oolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nol) && Float.compare(this.a, ((nol) obj).a) == 0;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((ool) wtcVar).o = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return wt3.n(new StringBuilder("ZIndexElement(zIndex="), this.a, ')');
    }
}
