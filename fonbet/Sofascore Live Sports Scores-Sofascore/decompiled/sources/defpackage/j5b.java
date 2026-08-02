package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj5b;", "Lbuc;", "Lk5b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class j5b extends buc {
    public final i10 a;
    public final q5b b;
    public final tbj c;

    public j5b(i10 i10Var, q5b q5bVar, tbj tbjVar) {
        this.a = i10Var;
        this.b = q5bVar;
        this.c = tbjVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new k5b(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j5b) {
            j5b j5bVar = (j5b) obj;
            return Intrinsics.c(this.a, j5bVar.a) && this.b == j5bVar.b && this.c == j5bVar.c;
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        k5b k5bVar = (k5b) wtcVar;
        if (k5bVar.n) {
            k5bVar.o.b();
            k5bVar.o.k(k5bVar);
        }
        i10 i10Var = this.a;
        k5bVar.o = i10Var;
        if (k5bVar.n) {
            if (i10Var.a != null) {
                u3a.c("Expected textInputModifierNode to be null");
            }
            i10Var.a = k5bVar;
        }
        k5bVar.p = this.b;
        k5bVar.q = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
