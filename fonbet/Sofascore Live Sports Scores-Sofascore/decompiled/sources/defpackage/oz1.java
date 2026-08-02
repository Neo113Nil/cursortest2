package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Loz1;", "Lbuc;", "Lnz1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class oz1 extends buc {
    public final float a;
    public final n52 b;
    public final uah c;

    public oz1(float f, n52 n52Var, uah uahVar) {
        this.a = f;
        this.b = n52Var;
        this.c = uahVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new nz1(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz1)) {
            return false;
        }
        oz1 oz1Var = (oz1) obj;
        return p75.b(this.a, oz1Var.a) && this.b.equals(oz1Var.b) && Intrinsics.c(this.c, oz1Var.c);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        nz1 nz1Var = (nz1) wtcVar;
        float f = nz1Var.r;
        re2 re2Var = nz1Var.u;
        float f2 = this.a;
        if (!p75.b(f, f2)) {
            nz1Var.r = f2;
            re2Var.k1();
        }
        n52 n52Var = nz1Var.s;
        n52 n52Var2 = this.b;
        if (!Intrinsics.c(n52Var, n52Var2)) {
            nz1Var.s = n52Var2;
            re2Var.k1();
        }
        uah uahVar = nz1Var.t;
        uah uahVar2 = this.c;
        if (Intrinsics.c(uahVar, uahVar2)) {
            return;
        }
        nz1Var.t = uahVar2;
        re2Var.k1();
        sea.p(nz1Var);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) p75.c(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
