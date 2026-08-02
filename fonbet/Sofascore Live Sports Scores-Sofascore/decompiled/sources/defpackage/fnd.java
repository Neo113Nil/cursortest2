package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfnd;", "Lbuc;", "Lond;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class fnd extends buc {
    public final float a;
    public final float b;

    public fnd(float f, float f2, a7d a7dVar) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.buc
    public final wtc c() {
        ond ondVar = new ond();
        ondVar.o = this.a;
        ondVar.p = this.b;
        ondVar.q = true;
        return ondVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        fnd fndVar = obj instanceof fnd ? (fnd) obj : null;
        return fndVar != null && p75.b(this.a, fndVar.a) && p75.b(this.b, fndVar.b);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ond ondVar = (ond) wtcVar;
        float f = ondVar.o;
        float f2 = this.a;
        boolean b = p75.b(f, f2);
        float f3 = this.b;
        if (!b || !p75.b(ondVar.p, f3) || !ondVar.q) {
            c6o.c0(ondVar).U(false);
        }
        ondVar.o = f2;
        ondVar.p = f3;
        ondVar.q = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + fc6.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) p75.c(this.a)) + ", y=" + ((Object) p75.c(this.b)) + ", rtlAware=true)";
    }
}
