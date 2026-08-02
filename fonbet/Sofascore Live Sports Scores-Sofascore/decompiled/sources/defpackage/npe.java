package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class npe {
    public final pzd a;
    public final vb b;

    public npe(pzd pzdVar, vb vbVar) {
        pzdVar.getClass();
        this.a = pzdVar;
        this.b = vbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npe)) {
            return false;
        }
        npe npeVar = (npe) obj;
        return this.a == npeVar.a && this.b.equals(npeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PESMActionPointUiModelWrapper(type=" + this.a + ", point=" + this.b + ")";
    }
}
