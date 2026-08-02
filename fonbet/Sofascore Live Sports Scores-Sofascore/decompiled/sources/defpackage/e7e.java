package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Le7e;", "Lbuc;", "Lf7e;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class e7e extends buc {
    public final d7e a;
    public final io b;
    public final op3 c;
    public final float d;
    public final ay1 e;

    public e7e(d7e d7eVar, io ioVar, op3 op3Var, float f, ay1 ay1Var) {
        this.a = d7eVar;
        this.b = ioVar;
        this.c = op3Var;
        this.d = f;
        this.e = ay1Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        f7e f7eVar = new f7e();
        f7eVar.o = this.a;
        f7eVar.p = true;
        f7eVar.q = this.b;
        f7eVar.r = this.c;
        f7eVar.s = this.d;
        f7eVar.t = this.e;
        return f7eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7e)) {
            return false;
        }
        e7e e7eVar = (e7e) obj;
        return Intrinsics.c(this.a, e7eVar.a) && Intrinsics.c(this.b, e7eVar.b) && Intrinsics.c(this.c, e7eVar.c) && Float.compare(this.d, e7eVar.d) == 0 && Intrinsics.c(this.e, e7eVar.e);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        f7e f7eVar = (f7e) wtcVar;
        boolean z = f7eVar.p;
        d7e d7eVar = this.a;
        boolean z2 = (z && njh.c(f7eVar.o.i(), d7eVar.i())) ? false : true;
        f7eVar.o = d7eVar;
        f7eVar.p = true;
        f7eVar.q = this.b;
        f7eVar.r = this.c;
        f7eVar.s = this.d;
        f7eVar.t = this.e;
        if (z2) {
            y6a.E(f7eVar);
        }
        n9e.E(f7eVar);
    }

    public final int hashCode() {
        int a = fc6.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + dmi.e(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        ay1 ay1Var = this.e;
        return a + (ay1Var == null ? 0 : ay1Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }
}
