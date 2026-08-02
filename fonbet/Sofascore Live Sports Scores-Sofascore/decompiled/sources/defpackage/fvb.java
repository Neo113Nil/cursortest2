package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfvb;", "Lbuc;", "Lgvb;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class fvb extends buc {
    public final int a;
    public final int b;
    public final int c;
    public final hvb d;
    public final float e;

    public fvb(int i, int i2, int i3, hvb hvbVar, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = hvbVar;
        this.e = f;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new gvb(this.a, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvb)) {
            return false;
        }
        fvb fvbVar = (fvb) obj;
        return this.a == fvbVar.a && this.b == fvbVar.b && this.c == fvbVar.c && Intrinsics.c(this.d, fvbVar.d) && p75.b(this.e, fvbVar.e);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        gvb gvbVar = (gvb) wtcVar;
        ((eoh) gvbVar.x).setValue(this.d);
        ((eoh) gvbVar.y).setValue(new evb());
        int i = gvbVar.o;
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        float f = this.e;
        if (i == i2 && gvbVar.p == i3 && gvbVar.q == i4 && p75.b(gvbVar.r, f)) {
            return;
        }
        gvbVar.o = i2;
        gvbVar.p = i3;
        gvbVar.q = i4;
        gvbVar.r = f;
        gvbVar.l1();
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((this.d.hashCode() + wv8.a(this.c, wv8.a(this.b, wv8.a(0, Integer.hashCode(this.a) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "MarqueeModifierElement(iterations=" + this.a + ", animationMode=Immediately, delayMillis=" + this.b + ", initialDelayMillis=" + this.c + ", spacing=" + this.d + ", velocity=" + ((Object) p75.c(this.e)) + ')';
    }
}
