package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lilb;", "Lbuc;", "Ljlb;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ilb extends buc {
    public final int a;
    public final int b;

    public ilb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.buc
    public final wtc c() {
        jlb jlbVar = new jlb();
        jlbVar.o = this.a;
        jlbVar.p = this.b;
        return jlbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilb)) {
            return false;
        }
        ilb ilbVar = (ilb) obj;
        return this.a == ilbVar.a && this.b == ilbVar.b;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        jlb jlbVar = (jlb) wtcVar;
        jlbVar.getClass();
        jlbVar.o = this.a;
        jlbVar.p = this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lnb.j(this.a, this.b, "LottieAnimationSizeElement(width=", ", height=", ")");
    }
}
